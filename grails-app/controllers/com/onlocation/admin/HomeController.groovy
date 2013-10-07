package com.onlocation.admin

class HomeController {

	static namespace = 'admin'
	
    def index() {
		render (view: '/admin/home/index', model: [])
	}
}
