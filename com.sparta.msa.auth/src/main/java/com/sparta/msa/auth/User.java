package com.sparta.msa.auth;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name ="users")
public class User {

    @Id
    private String userId;
    private String userName;
    private String password;
    private String role;
}
