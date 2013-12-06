package com.onlocation.auth;

import grails.plugin.springsecurity.SpringSecurityService;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.SaltSource;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCrypt;

public class AppCustomAuthenticationProvider implements AuthenticationProvider {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private SpringSecurityService springSecurityService;
	
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();

        System.out.println("username: " + username);

        User user = userService.getUserByUsername(username);
 
        if (user == null) {
            throw new BadCredentialsException("Username not found.");
        }        
//        if (user.getPassword() != springSecurityService.encodePassword(password)) {
//            throw new BadCredentialsException("Wrong password.");
//        }

        if(userService.getAuthorityByUser(user).equals("ROLE_CLIENT")){
        	throw new BadCredentialsException("Incorrect user for Authentication Type.");
        }

        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();

        UsernamePasswordAuthenticationToken simpleUserAuthentication =
                new UsernamePasswordAuthenticationToken(user, password, authorities);

        return simpleUserAuthentication;
    }

	@Override
	public boolean supports(Class<? extends Object> authentication) {
		// TODO Auto-generated method stub
		return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
//		return false;
	}

}
