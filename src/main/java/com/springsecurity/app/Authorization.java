package com.springsecurity.app;

public class Authorization {
    private String username;
    private String password;
    private Authorities roles;
    private boolean enabled;

    public Authorization(String username, String password, Authorities authorities, boolean enabled) {
        this.username = username;
        this.password = password;
        this.roles = authorities;
        this.enabled = enabled;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Authorities getRoles() {
        return roles;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
