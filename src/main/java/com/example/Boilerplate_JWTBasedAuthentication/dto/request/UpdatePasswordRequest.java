package com.example.Boilerplate_JWTBasedAuthentication.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdatePasswordRequest {
    private String password;
    private String newPassword;
}
