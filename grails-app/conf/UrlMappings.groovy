class UrlMappings {

	static mappings = {
		name admin: "/admin"(
			controller:"redirect",
			action: "adminHomeIndex",
		)
		name home:"/"(
			controller:"Index",
			action:"index",
		)
		"500"(
			view:"/error"
		)
		"404"(
			view:"/notFound"
		)
		//"/$namespace/$controller/$action?/$id?"()
		"/$controller/$action?/$id?"()
	}
}
