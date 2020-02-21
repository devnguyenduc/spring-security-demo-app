package com.springsecurity.app;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthenticationService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ArrayList<Authorization> authorizations = new ArrayList<Authorization>();
        Authorization admin = new Authorization("admin","adminpassword",Authorities.ADMIN, true);
        Authorization user = new Authorization("user","userpassword", Authorities.USER, true);
        return new AuthorizationDetails(user);
    }
}
