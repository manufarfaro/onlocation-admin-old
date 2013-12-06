package com.onlocation.auth

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

class UserService {

	public User getUserByUsername(String username) {
		return User.findByUsername(username);
	}

	public String getAuthorityByUser(User user){
		return UserRole.findByUser(user).role.authority
	}
}
