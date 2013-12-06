import com.onlocation.auth.*


fixture{
	/*
	 * Users
	 */
	// Municipality
	userMoron(
		User,
		username: 'admin.moron@onlocation.com.ar',
		password: 'ghiforever',
		enabled: true
	)
	// Companies
	userAsakura(
		User,
		username: 'admin.asakura@onlocation.com.ar',
		password: 'asakura',
		enabled: true
	)
	userOyamada(
		User,
		username: 'admin.oyamada@onlocation.com.ar',
		password: 'oyamada',
		enabled: true
	)
	// Offices
	userAsakuraCentro(
		User,
		username: 'centro.asakura@onlocation.com.ar',
		password: 'asakura',
		enabled: true
	)
	userAsakuraHurlingham(
		User,
		username: 'hurlingham.asakura@onlocation.com.ar',
		password: 'asakura',
		enabled: true
	)
	userAsakuraCastelar(
		User,
		username: 'castelar.asakura@onlocation.com.ar',
		password: 'asakura',
		enabled: true
	)
	userOyamadaCentro(
		User,
		username: 'centro.oyamada@onlocation.com.ar',
		password: 'oyamada',
		enabled: true
	)
	userOyamadaVillaTesei(
		User,
		username: 'vtesei.oyamada@onlocation.com.ar',
		password: 'oyamada',
		enabled: true
	)
	userOyamadaHaedo(
		User,
		username: 'haedo.oyamada@onlocation.com.ar',
		password: 'oyamada',
		enabled: true
	)
	// Clients
	userYoh(
		User,
		username: 'yoh@asakura.com',
		password: '123456',
		enabled: true
	)
	userHao(
		User,
		username: 'hao@asakura.com',
		password: '123456',
		enabled: true
	)
	userManta(
		User,
		username: 'manta@oyamada.com',
		password: '123456',
		enabled: true
	)
	userAnna(
		User,
		username: 'anna@kyoyama.com',
		password: '123456',
		enabled: true
	)
	
	/*
	 * Roles
	 */
	roleMunicipality(
		Role,
		authority: 'ROLE_MUNICIPALITY'
	)
	roleCompany(
		Role,
		authority: 'ROLE_COMPANY'
	)
	roleOffice(
		Role,
		authority: 'ROLE_OFFICE'
	)
	roleClient(
		Role,
		authority: 'ROLE_CLIENT'
	)
	/*
	 * UserRoles
	 */
	userRole1a(
		UserRole,
		user: userMoron,
		role: roleMunicipality
	)
	userRole2a(
		UserRole,
		user: userAsakura,
		role: roleCompany
	)
	userRole2b(
		UserRole,
		user: userOyamada,
		role: roleCompany
	)
	userRole3a(
		UserRole,
		user: userAsakuraCentro,
		role: roleOffice
	)
	userRole3b(
		UserRole,
		user: userAsakuraHurlingham,
		role: roleOffice
	)
	userRole3c(
		UserRole,
		user: userAsakuraCastelar,
		role: roleOffice
	)
	userRole3d(
		UserRole,
		user: userOyamadaCentro,
		role: roleOffice
	)
	userRole3e(
		UserRole,
		user: userOyamadaVillaTesei,
		role: roleOffice
	)
	userRole3f(
		UserRole,
		user: userOyamadaHaedo,
		role: roleOffice
	)
	userRole4a(
		UserRole,
		user: userYoh,
		role: roleClient
	)
	userRole4b(
		UserRole,
		user: userHao,
		role: roleClient
	)
	userRole4c(
		UserRole,
		user: userManta,
		role: roleClient
	)
	userRole4d(
		UserRole,
		user: userAnna,
		role: roleClient
	)
	
}