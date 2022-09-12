package com.anas.learning.springboot.ulrev.registration;

/**
 * @author: <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @date: 9/11/22
 */
public record RegistrationRequest(String firstName,
                                  String lastName,
                                  String username,
                                  String email,
                                  String password) {
}
