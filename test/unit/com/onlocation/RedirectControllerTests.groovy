package com.onlocation



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(RedirectController)
class RedirectControllerTests {

	@Test
	void testadminHomeIndexIsValidatingCorrectly() {
		controller.adminHomeIndex()
		assert response.redirectedUrl == 'admin/home/'
	}
}
