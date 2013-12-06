package com.onlocation.auth

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

class User {

	transient springSecurityService

	String username
	String password

	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired

	static transients = ['springSecurityService']

	static constraints = {
		username blank: false, unique: true
		password blank: false
	}

	static mapping = {
		password column: '`password`'
	}

	Collection<? extends GrantedAuthority> getAuthorities() {
		//UserRole.findAllByUser(this).collect { it.role }
		return UserRole.findByUser(this).role
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService.encodePassword(password)
	}
}
