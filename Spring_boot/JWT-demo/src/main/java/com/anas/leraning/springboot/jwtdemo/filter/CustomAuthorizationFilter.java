package com.anas.leraning.springboot.jwtdemo.filter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 14/09/2022
 */
@Slf4j
public class CustomAuthorizationFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(final HttpServletRequest request,
                                    final HttpServletResponse response,
                                    final FilterChain filterChain) throws ServletException, IOException {

        // allow user to access the login page without authorization
        if (!request.getServletPath().equals("/api/login") && !request.getServletPath().equals("/api/token/refresh")) {
            final var authorizationHeader = request.getHeader(HttpHeaders.AUTHORIZATION);

            if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
                final var token = authorizationHeader.substring("Bearer ".length());
                final var algorithm = Algorithm.HMAC256("secret".getBytes());
                final var verifier = JWT.require(algorithm).build();
                try {
                    final var decodedJWT = verifier.verify(token);
                    final var username = decodedJWT.getSubject();
                    final var roles = decodedJWT.getClaim("roles").asArray(String.class);

                    final var authorities = Arrays.stream(roles)
                            .map(SimpleGrantedAuthority::new).toList();

                    final var authenticationToken =
                            new UsernamePasswordAuthenticationToken(username, null, authorities);
                    SecurityContextHolder.getContext().setAuthentication(authenticationToken);
                } catch (final Exception e) {
                    log.error("Error logging in: {}", e.getMessage());
                    response.setHeader("error", e.getMessage());
                    response.setStatus(HttpStatus.FORBIDDEN.value());
                    // response.sendError(HttpStatus.FORBIDDEN.value());

                    final var map = new HashMap<String, String>();
                    map.put("error_message", e.getMessage());
                    response.setContentType(MediaType.APPLICATION_JSON_VALUE);
                    new ObjectMapper().writeValue(response.getOutputStream(), map);
                    return;
                }
            }
        }
        filterChain.doFilter(request, response); // continue the request
    }
}
