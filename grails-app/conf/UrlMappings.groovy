class UrlMappings {

	static mappings = {
		'/'(
			controller:'Index',
			action:'index',
			namespace:null
		)
		"/$namespace/$controller/$action?/$id?"()
		'/admin'(
			redirect: [
			           controller:'Home',	
			           action:'index',
			           namespace:'admin'
			]
		)
		'500'(
			view:'/error'
		)
		'404'(
			"Pagina No Encontrada"
		)
	}
}
