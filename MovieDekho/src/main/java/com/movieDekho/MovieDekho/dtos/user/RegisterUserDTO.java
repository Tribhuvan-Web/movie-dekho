package com.movieDekho.MovieDekho.dtos.user;

import lombok.Data;

@Data
public class RegisterUserDTO {

    private String username;
    private String password;
    private String email;
    private String phone;
    private String gender;
}
