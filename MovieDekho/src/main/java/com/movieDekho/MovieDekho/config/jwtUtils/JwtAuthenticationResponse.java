package com.movieDekho.MovieDekho.config.jwtUtils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtAuthenticationResponse {
    private String Token;
}
