package com.onlocation

class RedirectController {

    def index() {}

	def adminHomeIndex(){
		redirect(uri:'admin/home/')
	}

}
