class UrlMappings {

	static mappings = {
		"/admin"(
			controller:'redirect',
			action: 'adminHomeIndex',
		)
		"/$namespace/$controller/$action?/$id?"()
		'/'(
			controller:'Index',
			action:'index',
			namespace:null
		)
		'500'(view:'/error')
		'404'("Pagina No Encontrada")
	}
}
