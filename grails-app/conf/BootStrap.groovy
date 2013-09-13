class BootStrap {

    def init = { servletContext ->
		println "-----------------------"
		println System.env.DATABASE_URL
    }
    def destroy = {
    }
}
