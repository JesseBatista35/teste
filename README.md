exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar



2026-06-17 21:57:53,673 DEBUG [org.hib.eng.jdb.env.int.JdbcEnvironmentInitiator] (JPA Startup Thread) JDBC version : 4.1
2026-06-17 21:57:53,674 DEBUG [org.hib.eng.jdb.env.spi.IdentifierHelperBuilder] (JPA Startup Thread) JDBC driver metadata reported database stores quoted identifiers in neither upper, lower nor mixed case
2026-06-17 21:57:53,688 DEBUG [org.hib.orm.jdb.lob] (JPA Startup Thread) HHH10010006: Disabling contextual NCLOB creation as createNClob() method threw error : com.ibm.db2.jcc.am.SqlFeatureNotSupportedException: [jcc][t4][10181][12051][4.32.28] Method createNClob is not supported. ERRORCODE=-4450, SQLSTATE=0A504
2026-06-17 21:57:53,693 DEBUG [org.hib.orm.con.pooling] (JPA Startup Thread) HHH10001005: Database info:
	Database JDBC URL [undefined/unknown]


	



