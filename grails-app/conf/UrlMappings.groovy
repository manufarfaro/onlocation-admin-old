class UrlMappings {

	static mappings = {
		name admin: "/admin"(
			controller:'redirect',
			action: 'adminHomeIndex',
		)
		name login: "/login"(
			controller:'Index',
			action:'login',
			namespace:null
		)
		name logout: "/logout"(
			controller:'Index',
			action:'logout',
			namespace:null
		)
		"/$namespace/$controller/$action?/$id?"()
		name home:'/'(
			controller:'Index',
			action:'index',
			namespace:null
		)
		'500'(view:'/error')
		'404'("Pagina No Encontrada")
	}
}
