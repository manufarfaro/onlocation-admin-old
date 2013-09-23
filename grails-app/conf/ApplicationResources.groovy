import grails.util.Environment

modules = {
	jquery { 
		resource url: 'js/jquery-1.10.2.min.js' 
	}
	bootstrapjs {
		resource url: 'js/bootstrap.min.js'
	}
	Environment.executeForCurrentEnvironment {
		development{
			application {
				dependsOn 'jquery', 'bootstrapjs'
				resource id:'less-js', url:'js/development/less-1.4.1.min.js'
				resource id:'application-css', url: 'css/development/application.less', attrs:[rel: "stylesheet/less", type:'css']
				resource id:'application-js', url: 'js/development/application.js'
			}
			nonlogged {
				dependsOn 'jquery', 'bootstrapjs'
				resource id:'less-js', url:'js/development/less-1.4.1.min.js'
				resource url:'js/development/nonlogged.application.js'
				resource url: 'css/development/nonlogged.application.less', attrs:[rel: "stylesheet/less", type:'css']
			}
		}
		production{
			application {
				dependsOn 'jquery', 'bootstrapjs'
				resource url:'js/application.js'
				resource url:'css/application.css'
			}
			nonlogged {
				dependsOn 'jquery', 'bootstrapjs'
				resource url: 'js/nonlogged.application.js'
				resource url: 'css/nonlogged.application.css'
			}
		}
	}
}
