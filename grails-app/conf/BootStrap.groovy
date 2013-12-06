import grails.util.Environment;
import grails.plugin.fixtures.FixtureLoader;

class BootStrap {

	def fixtureLoader
	
    def init = { servletContext ->
		Environment.executeForCurrentEnvironment {
			development {
				fixtureLoader.load('userFixtures')
			}
			test {
				fixtureLoader.load('userFixtures')
			}
			production {
				// Do nothing.
			}
		}
    }
    def destroy = {
    }
}
