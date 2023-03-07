package com.veinsmoke.webidbackend.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(@Email String email,
                              @NotBlank @Size(min=8) String password,
                              @NotBlank String name,
                              String profileImg
) {
}
