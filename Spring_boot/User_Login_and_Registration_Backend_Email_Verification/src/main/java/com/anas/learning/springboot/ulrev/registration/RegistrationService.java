package com.anas.learning.springboot.ulrev.registration;

import com.anas.learning.springboot.ulrev.registration.token.ConfirmationToken;
import com.anas.learning.springboot.ulrev.registration.token.ConfirmationTokenService;
import com.anas.learning.springboot.ulrev.user.AppUser;
import com.anas.learning.springboot.ulrev.user.AppUserService;
import com.anas.learning.springboot.ulrev.email.EmailValidator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * @author: <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @date: 9/11/22
 */
@Service
@AllArgsConstructor
public class RegistrationService {
    private final EmailValidator emailValidator;
    private final AppUserService appUserService;
    private final ConfirmationTokenService confirmationTokenService;

    public String register(final RegistrationRequest request) {
        if (!emailValidator.test(request.email())) {
            throw new IllegalStateException("email not valid");
        }
        return appUserService.signUpUser(
                new AppUser(
                        request.firstName(),
                        request.lastName(),
                        request.username(),
                        request.email(),
                        request.password()
                )
        );
    }

    @Transactional
    public String confirmToken(final String token) {
        if (confirmationTokenService.existsByToken(token)) {
            final var confirmationToken = confirmationTokenService.findByToken(token).get();
            confirmationToken.setConfirmedAt(LocalDateTime.now());
            appUserService.enableAppUser(confirmationToken.getAppUser().getEmail());
            return "confirmed";
        }
        return "not confirmed";
    }

}
