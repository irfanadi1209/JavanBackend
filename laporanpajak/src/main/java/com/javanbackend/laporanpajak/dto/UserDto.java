package com.javanbackend.laporanpajak.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private int userId;
    private String email;
    private String password;
    private RoleDto role;
    private UserRoleDto userRole;
}