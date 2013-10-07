package com.onlocation.index

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(IndexController)
class IndexControllerTests{
	
	IndexController controller = new IndexController()
	
    void testIndexMapping() {
		
       controller.index()
	   
	   assertForwardUrlMapping("/",action: "index")
    }
}