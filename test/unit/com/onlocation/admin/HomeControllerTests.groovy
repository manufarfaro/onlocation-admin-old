package com.onlocation.admin



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HomeController)
class HomeControllerTests {

    void testHomeIsRenderingOkAndReturnsCorrectView() {
       controller.index()
	   
	   assert controller.response.status == 200
	   assert view == '/admin/home/index'
    }
}
