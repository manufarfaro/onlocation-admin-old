package com.onlocation.index

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(IndexController)
class IndexControllerTests{
    void testIndexIsRenderingOkAndReturnsCorrectView() {
		
       controller.index()
	   
	   assert controller.response.status == 200
	   assert view == '/index/index/index'
    }
}