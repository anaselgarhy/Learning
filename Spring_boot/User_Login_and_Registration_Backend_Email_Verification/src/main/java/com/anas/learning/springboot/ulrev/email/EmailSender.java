package com.anas.learning.springboot.ulrev.email;

/**
 * @author: <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @date: 9/12/22
 */
public interface EmailSender {
    void send(String to, String email);
}
