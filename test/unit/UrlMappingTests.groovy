import org.junit.*
import org.springframework.web.servlet.mvc.Controller
import static org.junit.Assert.*
import grails.test.mixin.*
import com.onlocation.admin.HomeController
import org.codehaus.groovy.grails.web.mapping.LinkGenerator

@TestFor(UrlMappings)
@Mock([HomeController])
class UrlMappingTests {

	LinkGenerator grailsLinkGenerator

    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testUrlMappingWithNamespace() {
    	assertUrlMapping('/admin/home/index', controller: 'home', action: 'index'){
			namespace = 'admin'
		}
    }
}
