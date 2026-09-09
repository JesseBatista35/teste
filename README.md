ele esta no okd openshift

sigda-api-quarkus-des-10-2k45c
Running

exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-08-28 10:43:17,886 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.swagger-ui.enabled" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-28 10:43:20,679 INFO  [io.quarkus] (main) sigda-api-quarkus 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.20.3) started in 5.204s. Listening on: http://0.0.0.0:8080
2026-08-28 10:43:20,679 INFO  [io.quarkus] (main) Profile prod activated. 
2026-08-28 10:43:20,679 INFO  [io.quarkus] (main) Installed features: [agroal, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-oracle, narayana-jta, oidc, rest, rest-jackson, security, smallrye-context-propagation, smallrye-health, smallrye-openapi, swagger-ui, vertx]
2026-09-02 12:00:57,712 INFO  [io.sma.health] (vert.x-eventloop-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"validation check failed for the default DataSource"}}]}
2026-09-02 12:00:57,714 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-01089: immediate shutdown or close in progress - no operations are permitted

https://docs.oracle.com/error-help/db/ora-01089/
2026-09-02 12:01:07,371 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@61a51cbb)
2026-09-02 12:01:07,372 INFO  [ora.jdbc] (agroal-11) traceId=53AB922. 
2026-09-02 12:01:07,373 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=10.116.101.13, port=1521, socketOptions={0=YES, 1=NO, 17=0, 18=false, 2=20000, 20=true, 38=TLS, 23=40, 24=50, 40=false, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
connection options=[host=10.116.101.13 port=1521 protocol=TCP addr=(ADDRESS=(PROTOCOL=TCP)(HOST=10.116.101.13)(PORT=1521)) conn_data=(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(PORT=1521)(HOST=10.116.101.18)(HOSTNAME=oracle-nprd-1000.caixa))(CONNECT_DATA=(CID=(PROGRAM=QuarkusEntryPoint)(HOST=sigda-api-quarkus-des-10-2k45c)(USER=185))(SERVICE_NAME=prim_D01NGSRV)(CONNECTION_ID=SXVRqBBqSEKemESGfteGQw==)(SERVER=dedicated)(INSTANCE_NAME=cdbd01ng1))) done=false]
onBreakReset=false, dataEOF=false, negotiatedOptions=0x841, connected=false
TTIINIT enabled=false, TTC cookie enabled=false

2026-09-02 12:01:07,374 INFO  [ora.jdbc] (agroal-11) traceId=53AB922, anoEnabled=true. 
2026-09-02 12:01:07,375 FINEST [ora.jdbc] (agroal-11) 349 bytes written to the Socket.
2026-09-02 12:01:07,376 FINEST [ora.jdbc] (agroal-11) 384 bytes
2026-09-02 12:01:07,377 INFO  [ora.jdbc] (agroal-11) Got Redirect, SessionTraceId = 53AB922
2026-09-02 12:01:07,378 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=10.116.101.13, port=1521, socketOptions={0=YES, 1=NO, 17=0, 18=false, 2=20000, 20=true, 38=TLS, 23=40, 24=50, 40=false, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
connection options=[host=10.116.101.13 port=1521 protocol=TCP addr=(ADDRESS=(PROTOCOL=TCP)(HOST=10.116.101.13)(PORT=1521)) conn_data=(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(PORT=1521)(HOST=10.116.101.18)(HOSTNAME=oracle-nprd-1000.caixa))(CONNECT_DATA=(CID=(PROGRAM=QuarkusEntryPoint)(HOST=sigda-api-quarkus-des-10-2k45c)(USER=185))(SERVICE_NAME=prim_D01NGSRV)(CONNECTION_ID=SXVRqBBqSEKemESGfteGQw==)(SERVER=dedicated)(INSTANCE_NAME=cdbd01ng1))) done=false]
onBreakReset=false, dataEOF=false, negotiatedOptions=0x841, connected=false
TTIINIT enabled=false, TTC cookie enabled=false

2026-09-02 12:01:07,379 FINEST [ora.jdbc] (agroal-11) 432 bytes written to the Socket.
2026-09-02 12:01:07,380 FINEST [ora.jdbc] (agroal-11) 8 bytes
2026-09-02 12:01:07,381 INFO  [ora.jdbc] (agroal-11) Got Resend, SessionTraceId = 53AB922
2026-09-02 12:01:07,382 FINEST [ora.jdbc] (agroal-11) 432 bytes written to the Socket.
2026-09-02 12:01:07,383 FINEST [ora.jdbc] (agroal-11) 45 bytes
2026-09-02 12:01:07,384 INFO  [ora.jdbc] (agroal-11) Connection established. Cleared conn strategy stack
2026-09-02 12:01:07,385 FINEST [ora.jdbc] (agroal-11) 11 bytes written to the Socket.
2026-09-02 12:01:07,386 INFO  [ora.jdbc] (agroal-11) Sending break marker, SessionTraceId = 53AB922
2026-09-02 12:01:07,387 FINEST [ora.jdbc] (agroal-11) 150 bytes written to the Socket.
2026-09-02 12:01:07,388 FINEST [ora.jdbc] (agroal-11) 10 bytes
2026-09-02 12:01:07,389 FINEST [ora.jdbc] (agroal-11) 127 bytes
2026-09-02 12:01:07,390 FINEST [ora.jdbc] (agroal-11) 33 bytes written to the Socket.
2026-09-02 12:01:07,391 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-03113: database connection closed by peer (connection_type=client, source=/25.1.45.250:47168, target=10.116.101.13:1521, protocol=TCP, service=null, detecting_end=client, server_type=dedicated, client_program=QuarkusEntryPoint, server_process=null, session=null.null, user=SGDABD01, last_rpc=null, connection_id=SXVRqBBqSEKemESGfteGQw==, nne_encryption=null, nne_checksumming=null, authentication=O5LOGON) (CONNECTION_ID=SXVRqBBqSEKemESGfteGQw==)
https://docs.oracle.com/error-help/db/ora-03113/
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
Caused by: oracle.net.ns.NetException: ORA-03113: database connection closed by peer (connection_type=client, source=/25.1.45.250:47168, target=10.116.101.13:1521, protocol=TCP, service=null, detecting_end=client, server_type=dedicated, client_program=QuarkusEntryPoint, server_process=null, session=null.null, user=SGDABD01, last_rpc=null, connection_id=SXVRqBBqSEKemESGfteGQw==, nne_encryption=null, nne_checksumming=null, authentication=O5LOGON) (CONNECTION_ID=SXVRqBBqSEKemESGfteGQw==)
https://docs.oracle.com/error-help/db/ora-03113/
	at oracle.jdbc.driver.T4CMAREngineNIO.prepareForUnmarshall(T4CMAREngineNIO.java:1004)
	at oracle.jdbc.driver.T4CMAREngineNIO.unmarshalUB1(T4CMAREngineNIO.java:466)
	at oracle.jdbc.driver.T4C8TTIpro.receivePacket(T4C8TTIpro.java:191)
	at oracle.jdbc.driver.T4C8TTIpro.doRPC(T4C8TTIpro.java:456)
	at oracle.jdbc.driver.T4CConnection.negotiateSession(T4CConnection.java:3544)
	at oracle.jdbc.driver.T4CConnection.negotiateTTC(T4CConnection.java:905)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1090)
	... 12 more
Caused by: oracle.net.ns.NetException: ORA-17800: Got minus one from a read call. (CONNECTION_ID=SXVRqBBqSEKemESGfteGQw==)
https://docs.oracle.com/error-help/db/ora-17800/
	at oracle.net.ns.NSProtocolNIO.doSocketRead(NSProtocolNIO.java:1227)
	at oracle.net.ns.NIOPacket.readHeader(NIOPacket.java:273)
	at oracle.net.ns.NIOPacket.readPacketFromSocketChannel(NIOPacket.java:206)
	at oracle.net.ns.NIOPacket.readFromSocketChannel(NIOPacket.java:149)
	at oracle.net.ns.NIOPacket.readFromSocketChannel(NIOPacket.java:122)
	at oracle.net.ns.NIONSDataChannel.readDataFromSocketChannel(NIONSDataChannel.java:112)
	at oracle.jdbc.driver.T4CMAREngineNIO.prepareForUnmarshall(T4CMAREngineNIO.java:932)
	... 18 more

2026-09-02 12:01:07,392 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.6.0.24.10, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =21.0.1}. 
2026-09-02 12:01:07,763 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-03113: database connection closed by peer (connection_type=client, source=/25.1.45.250:47168, target=10.116.101.13:1521, protocol=TCP, service=null, detecting_end=client, server_type=dedicated, client_program=QuarkusEntryPoint, server_process=null, session=null.null, user=SGDABD01, last_rpc=null, connection_id=SXVRqBBqSEKemESGfteGQw==, nne_encryption=null, nne_checksumming=null, authentication=O5LOGON) (CONNECTION_ID=SXVRqBBqSEKemESGfteGQw==)
https://docs.oracle.com/error-help/db/ora-03113/
2026-09-02 12:01:07,775 INFO  [io.sma.health] (vert.x-eventloop-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-03113: database connection closed by peer (connection_type=client, source=/25.1.45.250:47168, target=10.116.101.13:1521, protocol=TCP, service=null, detecting_end=client, server_type=dedicated, client_program=QuarkusEntryPoint, server_process=null, session=null.null, user=SGDABD01, last_rpc=null, connection_id=SXVRqBBqSEKemESGfteGQw==, nne_encryption=null, nne_checksumming=null, authentication=O5LOGON) (CONNECTION_ID=SXVRqBBqSEKemESGfteGQw==)\nhttps://docs.oracle.com/error-help/db/ora-03113/"}}]}
2026-09-02 12:04:37,703 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': Closing connection in incorrect state VALIDATION
2026-09-02 12:04:37,703 INFO  [io.sma.health] (vert.x-eventloop-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"validation check failed for the default DataSource"}}]}
2026-09-02 12:04:47,371 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@7997aee6)
2026-09-02 12:04:47,372 INFO  [ora.jdbc] (agroal-11) traceId=6AADE88D. 
2026-09-02 12:04:47,373 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=oracle-nprd-1000.caixa, port=1521, socketOptions={0=YES, 1=NO, 17=0, 18=false, 2=20000, 20=true, 38=TLS, 23=40, 24=50, 40=false, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
TTIINIT enabled=false, TTC cookie enabled=false

2026-09-02 12:04:47,374 INFO  [ora.jdbc] (agroal-11) traceId=6AADE88D, anoEnabled=true. 
2026-09-02 12:04:47,375 FINEST [ora.jdbc] (agroal-11) 349 bytes written to the Socket.
2026-09-02 12:04:47,376 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 12:04:47,377 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 6AADE88D
2026-09-02 12:04:47,378 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 12:04:47,379 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=Ei32MDIIQx+OkfIM05rtxA==)
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
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=Ei32MDIIQx+OkfIM05rtxA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:916)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:462)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:270)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:353)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3462)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1030)
	... 12 more

2026-09-02 12:04:47,380 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.6.0.24.10, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =21.0.1}. 
2026-09-02 12:04:47,719 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=Ei32MDIIQx+OkfIM05rtxA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-09-02 12:04:47,719 INFO  [io.sma.health] (vert.x-eventloop-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=Ei32MDIIQx+OkfIM05rtxA==)\nhttps://docs.oracle.com/error-help/db/ora-12514/"}}]}
2026-09-02 12:04:57,371 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@589b6fc0)
2026-09-02 12:04:57,372 INFO  [ora.jdbc] (agroal-11) traceId=44A9FAB2. 
2026-09-02 12:04:57,373 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=oracle-nprd-1000.caixa, port=1521, socketOptions={0=YES, 1=NO, 17=0, 18=false, 2=20000, 20=true, 38=TLS, 23=40, 24=50, 40=false, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
TTIINIT enabled=false, TTC cookie enabled=false

2026-09-02 12:04:57,374 INFO  [ora.jdbc] (agroal-11) traceId=44A9FAB2, anoEnabled=true. 
2026-09-02 12:04:57,375 FINEST [ora.jdbc] (agroal-11) 349 bytes written to the Socket.
2026-09-02 12:04:57,376 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 12:04:57,377 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 44A9FAB2
2026-09-02 12:04:57,378 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 12:04:57,379 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=xTymwedQRliy2PczuVLoeg==)
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
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=xTymwedQRliy2PczuVLoeg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:916)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:462)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:270)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:353)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3462)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1030)
	... 12 more

2026-09-02 12:04:57,380 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.6.0.24.10, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =21.0.1}. 
2026-09-02 12:04:57,710 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=xTymwedQRliy2PczuVLoeg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-09-02 12:04:57,711 INFO  [io.sma.health] (vert.x-eventloop-thread-1) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=xTymwedQRliy2PczuVLoeg==)\nhttps://docs.oracle.com/error-help/db/ora-12514/"}}]}
2026-09-02 12:04:57,381 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@5336653c)
2026-09-02 12:04:57,382 INFO  [ora.jdbc] (agroal-11) traceId=42FCC63A. 
2026-09-02 12:04:57,383 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=oracle-nprd-1000.caixa, port=1521, socketOptions={0=YES, 1=NO, 17=0, 18=false, 2=20000, 20=true, 38=TLS, 23=40, 24=50, 40=false, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
TTIINIT enabled=false, TTC cookie enabled=false

2026-09-02 12:04:57,384 INFO  [ora.jdbc] (agroal-11) traceId=42FCC63A, anoEnabled=true. 
2026-09-02 12:04:57,385 FINEST [ora.jdbc] (agroal-11) 349 bytes written to the Socket.
2026-09-02 12:04:57,386 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 12:04:57,387 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 42FCC63A
2026-09-02 12:04:57,388 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 12:04:57,389 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=SPJdjHdnTZ+NMCbrtc17Ng==)
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
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=SPJdjHdnTZ+NMCbrtc17Ng==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:916)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:462)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:270)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:353)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3462)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1030)
	... 12 more

2026-09-02 12:04:57,390 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.6.0.24.10, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =21.0.1}. 
2026-09-02 12:04:57,719 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=SPJdjHdnTZ+NMCbrtc17Ng==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-09-02 12:04:57,720 INFO  [io.sma.health] (vert.x-eventloop-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=SPJdjHdnTZ+NMCbrtc17Ng==)\nhttps://docs.oracle.com/error-help/db/ora-12514/"}}]}
2026-09-02 12:05:07,371 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@7475e29f)
2026-09-02 12:05:07,372 INFO  [ora.jdbc] (agroal-11) traceId=39EDA397. 
2026-09-02 12:05:07,373 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=oracle-nprd-1000.caixa, port=1521, socketOptions={0=YES, 1=NO, 17=0, 18=false, 2=20000, 20=true, 38=TLS, 23=40, 24=50, 40=false, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
TTIINIT enabled=false, TTC cookie enabled=false

2026-09-02 12:05:07,374 INFO  [ora.jdbc] (agroal-11) traceId=39EDA397, anoEnabled=true. 
2026-09-02 12:05:07,375 FINEST [ora.jdbc] (agroal-11) 349 bytes written to the Socket.
2026-09-02 12:05:07,376 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 12:05:07,377 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 39EDA397
2026-09-02 12:05:07,378 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 12:05:07,379 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=D0FbsKWnToKYTOryLP0P3A==)
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
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=D0FbsKWnToKYTOryLP0P3A==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:916)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:462)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:270)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:353)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3462)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1030)
	... 12 more

2026-09-02 12:05:07,380 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.6.0.24.10, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =21.0.1}. 
2026-09-02 12:05:07,714 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=D0FbsKWnToKYTOryLP0P3A==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-09-02 12:05:07,715 INFO  [io.sma.health] (vert.x-eventloop-thread-1) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=D0FbsKWnToKYTOryLP0P3A==)\nhttps://docs.oracle.com/error-help/db/ora-12514/"}}]}
2026-09-02 12:05:17,371 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@7f14111e)
2026-09-02 12:05:17,372 INFO  [ora.jdbc] (agroal-11) traceId=2B69BE82. 
2026-09-02 12:05:17,373 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=oracle-nprd-1000.caixa, port=1521, socketOptions={0=YES, 1=NO, 17=0, 18=false, 2=20000, 20=true, 38=TLS, 23=40, 24=50, 40=false, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
TTIINIT enabled=false, TTC cookie enabled=false

2026-09-02 12:05:17,374 INFO  [ora.jdbc] (agroal-11) traceId=2B69BE82, anoEnabled=true. 
2026-09-02 12:05:17,375 FINEST [ora.jdbc] (agroal-11) 349 bytes written to the Socket.
2026-09-02 12:05:17,376 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 12:05:17,377 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 2B69BE82
2026-09-02 12:05:17,378 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 12:05:17,379 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=S2poxu/ZRFKF80I8qJ+xWg==)
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
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=S2poxu/ZRFKF80I8qJ+xWg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:916)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:462)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:270)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:353)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3462)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1030)
	... 12 more

2026-09-02 12:05:17,380 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.6.0.24.10, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =21.0.1}. 
2026-09-02 12:05:17,711 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=S2poxu/ZRFKF80I8qJ+xWg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-09-02 12:05:17,711 INFO  [io.sma.health] (vert.x-eventloop-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=S2poxu/ZRFKF80I8qJ+xWg==)\nhttps://docs.oracle.com/error-help/db/ora-12514/"}}]}
2026-09-02 12:05:27,371 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@42dea7de)
2026-09-02 12:05:27,372 INFO  [ora.jdbc] (agroal-11) traceId=9858BE5. 
2026-09-02 12:05:27,373 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=oracle-nprd-1000.caixa, port=1521, socketOptions={0=YES, 1=NO, 17=0, 18=false, 2=20000, 20=true, 38=TLS, 23=40, 24=50, 40=false, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
TTIINIT enabled=false, TTC cookie enabled=false

2026-09-02 12:05:27,374 INFO  [ora.jdbc] (agroal-11) traceId=9858BE5, anoEnabled=true. 
2026-09-02 12:05:27,375 FINEST [ora.jdbc] (agroal-11) 349 bytes written to the Socket.
2026-09-02 12:05:27,376 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 12:05:27,377 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 9858BE5
2026-09-02 12:05:27,378 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 12:05:27,379 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=P4phGj29QNGUvr/fiY54lw==)
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
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=P4phGj29QNGUvr/fiY54lw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:916)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:462)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:270)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:353)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3462)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1030)
	... 12 more

2026-09-02 12:05:27,380 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.6.0.24.10, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =21.0.1}. 
2026-09-02 12:05:27,716 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=P4phGj29QNGUvr/fiY54lw==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-09-02 12:05:27,717 INFO  [io.sma.health] (vert.x-eventloop-thread-1) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=P4phGj29QNGUvr/fiY54lw==)\nhttps://docs.oracle.com/error-help/db/ora-12514/"}}]}
2026-09-02 12:05:37,371 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@6844e301)
2026-09-02 12:05:37,372 INFO  [ora.jdbc] (agroal-11) traceId=717E5139. 
2026-09-02 12:05:37,373 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=oracle-nprd-1000.caixa, port=1521, socketOptions={0=YES, 1=NO, 17=0, 18=false, 2=20000, 20=true, 38=TLS, 23=40, 24=50, 40=false, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
TTIINIT enabled=false, TTC cookie enabled=false

2026-09-02 12:05:37,374 INFO  [ora.jdbc] (agroal-11) traceId=717E5139, anoEnabled=true. 
2026-09-02 12:05:37,375 FINEST [ora.jdbc] (agroal-11) 349 bytes written to the Socket.
2026-09-02 12:05:37,376 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 12:05:37,377 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 717E5139
2026-09-02 12:05:37,378 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 12:05:37,379 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=JOKNF78nRuSDMIEkJpIQnA==)
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
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service prim_D01NGSRV is not registered with the listener at host oracle-nprd-1000.caixa port 1521. (CONNECTION_ID=JOKNF78nRuSDMIEkJpIQnA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:916)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:462)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:270)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:353)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3462)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1030)
	... 12 more

