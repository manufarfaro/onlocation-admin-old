dataSource {
    pooled = true
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
			driverClassName = "org.h2.Driver"
            url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
        }
    }
    test {
        dataSource {
			if(System.env.TRAVIS){
				dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
				driverClassName = "org.h2.Driver"
				url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
			} else {
				dbCreate = "create-drop"
				driverClassName = "org.postgresql.Driver"
				dialect = org.hibernate.dialect.PostgreSQLDialect
				uri = new URI(System.env.DATABASE_URL?:"postgres://test:test@localhost/test")
				url = "jdbc:postgresql://"+uri.host+uri.path
				username = uri.userInfo.split(":")[0]
				password = uri.userInfo.split(":")[1]
			}
        }
    }
	production {
		dataSource {
			dbCreate = "update"
			driverClassName = "org.postgresql.Driver"
			dialect = org.hibernate.dialect.PostgreSQLDialect
			uri = new URI(System.env.DATABASE_URL?:"postgres://test:test@localhost/test")
			url = "jdbc:postgresql://"+uri.host+uri.path
			username = uri.userInfo.split(":")[0]
			password = uri.userInfo.split(":")[1]
		}
	}
}
