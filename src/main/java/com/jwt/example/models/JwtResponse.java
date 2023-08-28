package com.jwt.example.models;

import lombok.*;
import lombok.Builder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class JwtResponse {

    private String jwtToken;

    private String username;



}
