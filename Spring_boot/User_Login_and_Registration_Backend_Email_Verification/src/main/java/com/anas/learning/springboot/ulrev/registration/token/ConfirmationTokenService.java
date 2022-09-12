package com.anas.learning.springboot.ulrev.registration.token;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author: <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @date: 9/12/22
 */
@Service
@AllArgsConstructor
public class ConfirmationTokenService {
    private final ConfirmationTokenRepository confirmationTokenRepository;

    public void save(final ConfirmationToken confirmationToken) {
        confirmationTokenRepository.save(confirmationToken);
    }

    public boolean existsByToken(final String token) {
        return confirmationTokenRepository.existsByToken(token);
    }

    public Optional<ConfirmationToken> findByToken(final String token) {
        return confirmationTokenRepository.findByToken(token);
    }
}
