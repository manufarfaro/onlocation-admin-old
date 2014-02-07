package com.onlocation.admin

import grails.plugin.springsecurity.annotation.Secured;

class HomeController {

	@Secured(['ROLE_MUNICIPALITY', 'ROLE_COMPANY', 'ROLE_OFFICE'])
    def index() {
		render (
			view: '/admin/home/index', 
			model: []
		)
	}
}
