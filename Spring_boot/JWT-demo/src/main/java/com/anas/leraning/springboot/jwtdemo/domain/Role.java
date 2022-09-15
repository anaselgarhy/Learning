package com.anas.leraning.springboot.jwtdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static javax.persistence.GenerationType.*;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 13/09/2022
 */
@Entity @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Role {
    @Id @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
}
