import grails.util.Environment

modules = {
	jquery { 
		resource url: 'js/jquery-1.10.2.min.js' 
	}
	bootstrapjs {
		resource url: 'js/development/bootstrap.js'
	}
	formLiveValidator {
		resource url: 'js/development/jquery.form.js'
	}
	Environment.executeForCurrentEnvironment {
		development{
			application {
				dependsOn 'jquery, bootstrapjs'
				resource id:'less-js', url:'js/development/less-1.4.1.min.js'
				resource id:'application-css', url: 'css/development/application.less', attrs:[rel: "stylesheet/less", type:'css'] 
				resource id:'application-js', url: 'js/development/application.js'
			}
			nonlogged {
				dependsOn 'jquery, bootstrapjs'
				resource id:'less-js', url:'js/development/less-1.4.1.min.js'
				resource url:'js/development/nonlogged.application.js', disposition: 'head' 
				resource url: 'css/development/nonlogged.application.less', attrs:[rel: "stylesheet/less", type:'css'] 
			}
		}
		test{
			application {
				dependsOn 'jquery, bootstrapjs'
				resource url:'js/application.js'
				resource url:'css/application.css'
			}
			nonlogged {
				dependsOn 'jquery, bootstrapjs'
				resource url: 'js/nonlogged.application.js', disposition: 'head'
				resource url: 'css/nonlogged.application.css'
			}
		}
		production{
			application {
				dependsOn 'jquery, bootstrapjs'
				resource url:'js/application.js'
				resource url:'css/application.css'
			}
			nonlogged {
				dependsOn 'jquery, bootstrapjs'
				resource url: 'js/nonlogged.application.js', disposition: 'head'
				resource url: 'css/nonlogged.application.css'
			}
		}
	}
}
