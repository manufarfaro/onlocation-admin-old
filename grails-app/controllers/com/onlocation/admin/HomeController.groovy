package com.onlocation.admin

import grails.plugin.springsecurity.annotation.Secured;

@Secured(['ROLE_MUNICIPALITY', 'ROLE_COMPANY', 'ROLE_OFFICE'])
class HomeController {

	static namespace = 'admin'
	
    def index() {
		render (view: '/admin/home/index', model: [])
	}
}
