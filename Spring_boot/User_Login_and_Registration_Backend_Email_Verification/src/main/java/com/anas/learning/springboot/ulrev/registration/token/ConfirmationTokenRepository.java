package com.anas.learning.springboot.ulrev.registration.token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken, Long> {
    @Query("select (count(c) > 0) from ConfirmationToken c where c.token = :token")
    boolean existsByToken(@Param("token") String token);
    @Query("select c from ConfirmationToken c where c.token = :token")
    Optional<ConfirmationToken> findByToken(@Param("token") String token);
}