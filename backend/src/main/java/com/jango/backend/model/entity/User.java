package com.jango.backend.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;

    @Column(name="title")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;
}
