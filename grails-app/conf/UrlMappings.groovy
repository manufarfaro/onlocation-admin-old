class UrlMappings {

	static mappings = {
		name admin: "/admin"(
			controller:'redirect',
			action: 'adminHomeIndex',
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
