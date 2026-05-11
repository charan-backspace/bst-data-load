package com.backspace.tech.controllers;

import com.backspace.tech.models.auth.LoginRequest;
import com.backspace.tech.models.auth.TokenResponse;
import jakarta.annotation.security.PermitAll;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Base64;

@Path("/auth")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AuthController {

    // Hardcoded credentials — safe here since backend source is never exposed
    private static final String ADMIN_USERNAME = "BstAdmin";
    private static final String ADMIN_PASSWORD = "ALte4567654#EreTRDEwdEr#@$^/=";

    // 256-bit secret key for HS256 signing
    private static final String SECRET_KEY = "VMajCPQRR05zZGAMmFsTC9BV885DdvFMKmh23EGAwQs";

    @POST
    @Path("/login")
    @PermitAll
    public Response login(LoginRequest request) {
        if (request == null || request.getUsername() == null || request.getPassword() == null) {
            return Response.status(Response.Status.BAD_REQUEST).entity("{\"error\":\"Missing credentials\"}").build();
        }

        if (ADMIN_USERNAME.equals(request.getUsername()) && ADMIN_PASSWORD.equals(request.getPassword())) {
            try {
                long expiresIn = 28800; // 8 hours
                String token = generateJwt(request.getUsername(), expiresIn);
                return Response.ok(new TokenResponse(token, expiresIn)).build();
            } catch (Exception e) {
                return Response.serverError().entity("{\"error\":\"Token generation failed\"}").build();
            }
        }

        return Response.status(Response.Status.UNAUTHORIZED).entity("{\"error\":\"Invalid username or password\"}").build();
    }

    private String generateJwt(String username, long expiresInSeconds) throws Exception {
        long now = Instant.now().getEpochSecond();
        long exp = now + expiresInSeconds;

        // JWT Header
        String header = Base64.getUrlEncoder().withoutPadding()
                .encodeToString("{\"alg\":\"HS256\",\"typ\":\"JWT\"}".getBytes(StandardCharsets.UTF_8));

        // JWT Payload
        String payloadJson = String.format(
                "{\"iss\":\"https://bst-data-load.com\",\"sub\":\"%s\",\"upn\":\"%s\",\"groups\":[\"Admin\"],\"iat\":%d,\"exp\":%d}",
                username, username, now, exp
        );
        String payload = Base64.getUrlEncoder().withoutPadding()
                .encodeToString(payloadJson.getBytes(StandardCharsets.UTF_8));

        // Signature
        String content = header + "." + payload;
        Mac mac = Mac.getInstance("HmacSHA256");
        byte[] keyBytes = Base64.getUrlDecoder().decode(SECRET_KEY);
        mac.init(new SecretKeySpec(keyBytes, "HmacSHA256"));
        String signature = Base64.getUrlEncoder().withoutPadding()
                .encodeToString(mac.doFinal(content.getBytes(StandardCharsets.UTF_8)));

        return content + "." + signature;
    }
}
