dataSource {
    pooled = true
	uri = new URI(System.env.DATABASE_URL?:"postgres://test:test@localhost/test")
	username = uri.userInfo.split(":")[0]
	password = uri.userInfo.split(":")[1]
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
            dbCreate = "create-drop"
			driverClassName = "org.postgresql.Driver"
            dialect = org.hibernate.dialect.PostgreSQLDialect
			url = "jdbc:postgresql://"+uri.host+uri.path
        }
    }
	production {
		dataSource {
			dbCreate = "update"
			driverClassName = "org.postgresql.Driver"
			dialect = org.hibernate.dialect.PostgreSQLDialect
			url = "jdbc:postgresql://"+uri.host+uri.path
			
		}
	}
}
