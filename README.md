Prezados, boa tarde!

Hoje passamos a tomar erro para conectar local na instância de DES e TQS do banco de dados da nuvem do Azure SQL Server, para obter o token do Entra ID. A instância se encontra no resource group rg-pla-nprd (mssqlsrv-pla-nprd/mssqldb-siiga-01-nprd-pla-nprd).

2026-08-06 17:20:49,590 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (JPA Startup Thread) Acquisition timeout while waiting for new connection
2026-08-06 17:20:49,593 WARN  [org.hib.eng.jdb.env.int.JdbcEnvironmentInitiator] (JPA Startup Thread) HHH000342: Could not obtain connection to query metadata: org.hibernate.exception.GenericJDBCException: unable to obtain isolated JDBC connection [Acquisition timeout while waiting for new connection] [n/a]

Poderiam nos ajudar por favor? Caso tenha sido alterada alguma forma de autenticação ou algo assim.
