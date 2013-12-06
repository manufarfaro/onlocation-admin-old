package com.onlocation.index

import grails.plugin.springsecurity.annotation.Secured;
import grails.plugin.springsecurity.SpringSecurityService;
import grails.plugin.springsecurity.SpringSecurityUtils;

import org.springframework.security.core.context.SecurityContextHolder as SCH;

import grails.converters.*

import com.onlocation.auth.*
import com.sun.java.util.jar.pack.Package.Class.Method;
import com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory.Mappings;

@Secured(['permitAll'])
class IndexController {

	def authenticationTrustResolver
	def springSecurityService

	ConfigObject securityConfig = SpringSecurityUtils.securityConfig
	
    public Method index() {
		render (
			view:'index/index',
			model: [
				postUrl: (String)securityConfig.apf.filterProcessesUrl,
				rememberMeParameter: securityConfig.rememberMe.parameter,
				hasCookie: authenticationTrustResolver.isRememberMe(SCH.context?.authentication),
			]
		)
	}
}
