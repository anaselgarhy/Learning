package com.anas.leraning.springboot.jwtdemo.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

import static javax.persistence.GenerationType.*;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 13/09/2022
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AppUser {
   @Id @GeneratedValue(strategy = AUTO)
   private Long id;
   private String name;
   private String username;
   private String password;

   // fetch = FetchType.EAGER: means that the roles will be loaded with the user
   // fetch = FetchType.LAZY: means that the roles will be loaded when they are accessed
   @ManyToMany(fetch = FetchType.EAGER)
   private Collection<Role> roles;
}
