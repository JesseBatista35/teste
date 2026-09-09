	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:566)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=SapOmx4uTjiKoZE18Od/cg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:916)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:462)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:270)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:353)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3462)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1030)
	... 12 more

2026-09-02 14:24:57,380 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.6.0.24.10, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =21.0.1}. 
2026-09-02 14:24:57,710 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=SapOmx4uTjiKoZE18Od/cg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-09-02 14:24:57,711 INFO  [io.sma.health] (vert.x-eventloop-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=SapOmx4uTjiKoZE18Od/cg==)\nhttps://docs.oracle.com/error-help/db/ora-12514/"}}]}
2026-09-02 14:25:07,371 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@35fdeae6)
2026-09-02 14:25:07,372 INFO  [ora.jdbc] (agroal-11) traceId=4E3E9518. 
2026-09-02 14:25:07,373 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=oracle-nprd-1000.caixa, port=1521, socketOptions={0=YES, 1=NO, 17=0, 18=false, 2=20000, 20=true, 38=TLS, 23=40, 24=50, 40=false, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
TTIINIT enabled=false, TTC cookie enabled=false

2026-09-02 14:25:07,374 INFO  [ora.jdbc] (agroal-11) traceId=4E3E9518, anoEnabled=true. 
2026-09-02 14:25:07,375 FINEST [ora.jdbc] (agroal-11) 349 bytes written to the Socket.
2026-09-02 14:25:07,376 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 14:25:07,377 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 4E3E9518
2026-09-02 14:25:07,378 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 14:25:07,379 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=OpzAkIKSS/azVB4i+a4Z6Q==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1631)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1151)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1189)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:106)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:895)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:702)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:225)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:585)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:566)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=OpzAkIKSS/azVB4i+a4Z6Q==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:916)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:462)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:270)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:353)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3462)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1030)
	... 12 more

2026-09-02 14:25:07,380 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.6.0.24.10, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =21.0.1}. 
2026-09-02 14:25:07,707 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=OpzAkIKSS/azVB4i+a4Z6Q==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-09-02 14:25:07,707 INFO  [io.sma.health] (vert.x-eventloop-thread-1) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=OpzAkIKSS/azVB4i+a4Z6Q==)\nhttps://docs.oracle.com/error-help/db/ora-12514/"}}]}
2026-09-02 14:25:17,371 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@5b77eeef)
2026-09-02 14:25:17,372 INFO  [ora.jdbc] (agroal-11) traceId=4CF0C6F5. 
2026-09-02 14:25:17,373 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=oracle-nprd-1000.caixa, port=1521, socketOptions={0=YES, 1=NO, 17=0, 18=false, 2=20000, 20=true, 38=TLS, 23=40, 24=50, 40=false, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
TTIINIT enabled=false, TTC cookie enabled=false

2026-09-02 14:25:17,374 INFO  [ora.jdbc] (agroal-11) traceId=4CF0C6F5, anoEnabled=true. 
2026-09-02 14:25:17,375 FINEST [ora.jdbc] (agroal-11) 349 bytes written to the Socket.
2026-09-02 14:25:17,376 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 14:25:17,377 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 4CF0C6F5
2026-09-02 14:25:17,378 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 14:25:17,379 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=s3KBAOVwQWq2Yg08nX9okg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1631)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1151)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1189)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:106)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:895)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:702)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:225)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:585)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:566)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=s3KBAOVwQWq2Yg08nX9okg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:916)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:462)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:270)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:353)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3462)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1030)
	... 12 more

2026-09-02 14:25:17,380 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.6.0.24.10, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =21.0.1}. 
2026-09-02 14:25:17,707 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=s3KBAOVwQWq2Yg08nX9okg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-09-02 14:25:17,707 INFO  [io.sma.health] (vert.x-eventloop-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=s3KBAOVwQWq2Yg08nX9okg==)\nhttps://docs.oracle.com/error-help/db/ora-12514/"}}]}
2026-09-04 02:28:28,770 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-17868: Unknown host specified.: oracle-nprd-1000.caixa: Name or service not known
https://docs.oracle.com/error-help/db/ora-17868/
2026-09-04 02:28:28,770 INFO  [io.sma.health] (vert.x-eventloop-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-17868: Unknown host specified.: oracle-nprd-1000.caixa: Name or service not known\nhttps://docs.oracle.com/error-help/db/ora-17868/"}}]}
2026-09-04 02:28:37,703 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-17868: Unknown host specified.: oracle-nprd-1000.caixa
https://docs.oracle.com/error-help/db/ora-17868/
2026-09-04 02:28:37,704 INFO  [io.sma.health] (vert.x-eventloop-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-17868: Unknown host specified.: oracle-nprd-1000.caixa\nhttps://docs.oracle.com/error-help/db/ora-17868/"}}]}
