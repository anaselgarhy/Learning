package com.anas.learning.springboot.ulrev.email;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * @author: <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @date: 9/11/22
 */
@Service
public class EmailValidator implements Predicate<String> {

    @Override
    public boolean test(final String email) {

        return Pattern.compile(
                "^[a-zA-Z0-9_+&*-]+(?:\\." +
                        "[a-zA-Z0-9_+&*-]+)*@" +
                        "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                        "A-Z]{2,7}$"
        ).matcher(email).matches();
    }
}
