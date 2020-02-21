package com.springsecurity.app;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class AuthorizationDetails implements UserDetails {
    private String username;
    private String password;
    private List<GrantedAuthority> authorities;
    private boolean active;
    public AuthorizationDetails(Authorization authorization){
        username = authorization.getUsername();
        password = authorization.getPassword();
        authorities = Arrays.asList(new SimpleGrantedAuthority(authorization.getRoles().name()));
        active = authorization.isEnabled();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return active;
    }
}
