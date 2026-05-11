package com.backspace.tech.security;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Provider
public class JwtAuthFilter implements ContainerRequestFilter {

    private static final String SECRET_KEY = "VMajCPQRR05zZGAMmFsTC9BV885DdvFMKmh23EGAwQs";

    @Override
    public void filter(ContainerRequestContext ctx) {
        String path = ctx.getUriInfo().getPath();

        // Allow login endpoint and OPTIONS (CORS preflight) without authentication
        if (path.equals("/auth/login") || path.startsWith("/auth/login") || ctx.getMethod().equalsIgnoreCase("OPTIONS")) {
            return;
        }

        // All other endpoints require a valid JWT
        String authHeader = ctx.getHeaderString("Authorization");
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            ctx.abortWith(Response.status(Response.Status.UNAUTHORIZED)
                    .entity("{\"error\":\"Missing or invalid Authorization header\"}")
                    .build());
            return;
        }

        String token = authHeader.substring(7);
        if (!isValidJwt(token)) {
            ctx.abortWith(Response.status(Response.Status.UNAUTHORIZED)
                    .entity("{\"error\":\"Invalid or expired token\"}")
                    .build());
        }
    }

    private boolean isValidJwt(String token) {
        try {
            String[] parts = token.split("\\.");
            if (parts.length != 3) return false;

            // Verify signature
            String content = parts[0] + "." + parts[1];
            Mac mac = Mac.getInstance("HmacSHA256");
            byte[] keyBytes = Base64.getUrlDecoder().decode(SECRET_KEY);
            mac.init(new SecretKeySpec(keyBytes, "HmacSHA256"));
            String expectedSignature = Base64.getUrlEncoder().withoutPadding()
                    .encodeToString(mac.doFinal(content.getBytes(StandardCharsets.UTF_8)));

            if (!expectedSignature.equals(parts[2])) return false;

            // Check expiry
            String payloadJson = new String(Base64.getUrlDecoder().decode(parts[1]), StandardCharsets.UTF_8);
            long exp = Long.parseLong(payloadJson.replaceAll(".*\"exp\":(\\d+).*", "$1"));
            return System.currentTimeMillis() / 1000 < exp;

        } catch (Exception e) {
            return false;
        }
    }
}
