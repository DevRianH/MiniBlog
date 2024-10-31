package com.descomplica.frameblog.enums;

public enum RoleEnum {

    ADMIN("admin"),
    USER("user");

    private final String role;

    private RoleEnum(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
