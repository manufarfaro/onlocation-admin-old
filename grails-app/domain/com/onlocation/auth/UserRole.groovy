package com.onlocation.auth

import org.apache.commons.lang.builder.HashCodeBuilder

class UserRole implements Serializable {

	private static final long serialVersionUID = 1

	User user
	Role role

	boolean equals(other) {
		if (!(other instanceof UserRole)) {
			return false
		}

		other.user?.id == user?.id &&
			other.role?.id == role?.id
	}

	int hashCode() {
		def builder = new HashCodeBuilder()
		if (user) builder.append(user.id)
		if (role) builder.append(role.id)
		builder.toHashCode()
	}

	static UserRole get(long userId, long roleId) {
		UserRole.where {
			User == User.load(userId) &&
			Role == Role.load(roleId)
		}.get()
	}

	static UserRole create(User user, Role role, boolean flush = false) {
		new UserRole(User: user, Role: role).save(flush: flush, insert: true)
	}

	static boolean remove(User user, Role role, boolean flush = false) {

		int rowCount = UserRole.where {
			User == User.load(user.id) &&
			Role == Role.load(role.id)
		}.deleteAll()

		rowCount > 0
	}

	static void removeAll(User user) {
		UserRole.where {
			User == User.load(user.id)
		}.deleteAll()
	}

	static void removeAll(Role role) {
		UserRole.where {
			Role == Role.load(role.id)
		}.deleteAll()
	}

	static mapping = {
		id composite: ['role', 'user']
		version false
	}
}
