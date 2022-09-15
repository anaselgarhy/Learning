package com.anas.leraning.springboot.jwtdemo.domain.api;

import com.anas.leraning.springboot.jwtdemo.domain.AppUser;
import com.anas.leraning.springboot.jwtdemo.domain.Role;
import com.anas.leraning.springboot.jwtdemo.domain.service.UserService;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 13/09/2022
 */
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<?> getUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }

    @PostMapping("/user/save")
    public ResponseEntity<?> saveUser(@RequestBody final AppUser appUser) {
        final var uri = URI.create(ServletUriComponentsBuilder
                .fromCurrentContextPath().path("/api/user/save").toUriString());
        return ResponseEntity.created(uri).body(userService.saveUser(appUser));
    }

    @PostMapping("/role/save")
    public ResponseEntity<?> saveRole(@RequestBody final Role role) {
        return ResponseEntity.created(
                        URI.create(
                                ServletUriComponentsBuilder
                                        .fromCurrentContextPath()
                                        .path("/api/role/save")
                                        .toUriString()
                        )
                )
                .body(userService.saveRole(role));
    }


    @GetMapping("/roles")
    public ResponseEntity<?> getRoles() {
        return ResponseEntity.ok(userService.getRoles());
    }

    @DeleteMapping("/user/delete/{username}")
    public ResponseEntity<?> deleteUser(@PathVariable final String username) {
        userService.deleteUser(username);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/role/delete/{roleName}")
    public ResponseEntity<?> deleteRole(@PathVariable final String roleName) {
        userService.deleteRole(roleName);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/role/addToUser")
    public ResponseEntity<?> addRoleToUser(@RequestBody final RoleToUserForm form) {
        userService.addRoleToUser(form.username(), form.roleName());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/token/refresh")
    public void refreshToken(final HttpServletRequest request, final HttpServletResponse response) throws IOException {

        final var authorizationHeader = request.getHeader(HttpHeaders.AUTHORIZATION);

        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            final var token = authorizationHeader.substring("Bearer ".length());
            final var algorithm = Algorithm.HMAC256("secret".getBytes());
            final var verifier = JWT.require(algorithm).build();
            try {
                final var decodedJWT = verifier.verify(token);
                final var username = decodedJWT.getSubject();
                final var appUser = userService.getUser(username);

                final var newAccessToken = JWT.create()
                        .withSubject(appUser.getUsername())
                        .withExpiresAt(new Date(System.currentTimeMillis() + 10 * 60 * 1000))
                        .withIssuer(request.getRequestURL().toString())
                        .withClaim("roles", appUser.getRoles().stream().map(Role::getName).toList())
                        .sign(algorithm);

                final var refreshToken = JWT.create()
                        .withSubject(appUser.getUsername())
                        .withExpiresAt(new Date(System.currentTimeMillis() + 30 * 60 * 1000))
                        .withIssuer(request.getRequestURL().toString())
                        .sign(algorithm);

                final var tokens = new HashMap<String, String>();
                tokens.put("access_token", newAccessToken);
                tokens.put("refresh_token", refreshToken);

                response.setContentType(MediaType.APPLICATION_JSON_VALUE);
                new ObjectMapper().writeValue(response.getOutputStream(), tokens);
            } catch (final Exception e) {
                response.setHeader("error", e.getMessage());
                response.setStatus(HttpStatus.FORBIDDEN.value());
                // response.sendError(HttpStatus.FORBIDDEN.value());

                final var map = new HashMap<String, String>();
                map.put("error_message", e.getMessage());
                response.setContentType(MediaType.APPLICATION_JSON_VALUE);
                new ObjectMapper().writeValue(response.getOutputStream(), map);
            }
        }
    }
    private record RoleToUserForm(String username, String roleName) {
    }
}
