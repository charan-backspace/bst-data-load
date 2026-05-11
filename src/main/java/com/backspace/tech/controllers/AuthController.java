package com.backspace.tech.controllers;

import com.backspace.tech.models.auth.LoginRequest;
import com.backspace.tech.models.auth.TokenResponse;
import io.smallrye.jwt.build.Jwt;
import jakarta.annotation.security.PermitAll;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.util.Arrays;
import java.util.HashSet;

@Path("/auth")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AuthController {

    @ConfigProperty(name = "app.admin.username")
    String adminUsername;

    @ConfigProperty(name = "app.admin.password")
    String adminPassword;

    @POST
    @Path("/login")
    @PermitAll
    public Response login(LoginRequest request) {
        if (request == null || request.getUsername() == null || request.getPassword() == null) {
            return Response.status(Response.Status.BAD_REQUEST).entity("{\"error\":\"Missing credentials\"}").build();
        }

        if (adminUsername.equals(request.getUsername()) && adminPassword.equals(request.getPassword())) {
            // Generate a secure JWT token valid for 8 hours (28800 seconds)
            long expiresIn = 28800;
            String token = Jwt.issuer("https://bst-data-load.com")
                    .upn(request.getUsername())
                    .groups(new HashSet<>(Arrays.asList("Admin")))
                    .expiresIn(expiresIn)
                    .sign();
            
            return Response.ok(new TokenResponse(token, expiresIn)).build();
        }

        return Response.status(Response.Status.UNAUTHORIZED).entity("{\"error\":\"Invalid username or password\"}").build();
    }
}
