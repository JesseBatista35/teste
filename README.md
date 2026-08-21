
[domain@srjdeapllx158:9990 /] exit
[root@srjdeapllx158 configuration]# tail -50 /infra_app/logs/sifpp/server-srjdeapllx158_sifpp_intra_8081.log
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for jsr77 subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for jgroups subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for jmx subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for jaxrs subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for resource-adapters subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for io subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for jdr subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for jsf subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for webservices subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for security-manager subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for bean-validation subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for undertow subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for request-controller subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for jca subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for pojo subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for weld subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for security subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for remoting subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for transactions subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for messaging-activemq subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for ee subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for jpa subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for naming subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for modcluster subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for mail subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for infinispan subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for ejb3 subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for datasources subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,375 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread), Committed transaction for logging subsystem RUNTIME stage boot operations
2026-08-21 10:36:51,437 INFO  [org.jboss.as] (Controller Boot Thread), WFLYSRV0025: JBoss EAP 7.0.0.GA (WildFly Core 2.1.2.Final-redhat-1) started in 7352ms - Started 1193 of 1527 services (463 services are lazy, passive or on-demand)
2026-08-21 10:38:55,955 DEBUG [org.jboss.ejb.client.txn] (Periodic Recovery), Send recover request for transaction origin node identifier 1 to EJB receiver with node name srjdeapllx158:srjdeapllx158_sifpp_intra_8081
2026-08-21 10:39:05,956 DEBUG [org.jboss.ejb.client.txn] (Periodic Recovery), Send recover request for transaction origin node identifier 1 to EJB receiver with node name srjdeapllx158:srjdeapllx158_sifpp_intra_8081
2026-08-21 10:39:16,095 DEBUG [org.jboss.jca.core.connectionmanager.pool.idle.IdleRemover] (IdleRemover), Notifying pools, interval: 150000
2026-08-21 10:39:16,095 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (IdleRemover), db2qcc: removeIdleConnections(1787319256095) [0/30]
2026-08-21 10:39:16,096 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (IdleRemover), mssfpp: removeIdleConnections(1787318956096) [0/50]
2026-08-21 10:39:16,096 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (IdleRemover), db2ico: removeIdleConnections(1787319256096) [0/50]
2026-08-21 10:39:16,096 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (IdleRemover), db2ogu: removeIdleConnections(1787319256096) [0/20]
2026-08-21 10:39:16,096 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (IdleRemover), db2igf: removeIdleConnections(1787319256096) [0/30]
2026-08-21 10:39:16,096 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (IdleRemover), db2iof: removeIdleConnections(1787319256096) [0/30]
2026-08-21 10:39:16,096 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (IdleRemover), db2iso: removeIdleConnections(1787317756096) [0/50]
2026-08-21 10:41:05,957 DEBUG [org.jboss.ejb.client.txn] (Periodic Recovery), Send recover request for transaction origin node identifier 1 to EJB receiver with node name srjdeapllx158:srjdeapllx158_sifpp_intra_8081
2026-08-21 10:41:15,958 DEBUG [org.jboss.ejb.client.txn] (Periodic Recovery), Send recover request for transaction origin node identifier 1 to EJB receiver with node name srjdeapllx158:srjdeapllx158_sifpp_intra_8081
2026-08-21 10:41:46,096 DEBUG [org.jboss.jca.core.connectionmanager.pool.idle.IdleRemover] (IdleRemover), Notifying pools, interval: 150000
2026-08-21 10:41:46,096 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (IdleRemover), db2qcc: removeIdleConnections(1787319406096) [0/30]
2026-08-21 10:41:46,096 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (IdleRemover), mssfpp: removeIdleConnections(1787319106096) [0/50]
2026-08-21 10:41:46,096 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (IdleRemover), db2ico: removeIdleConnections(1787319406096) [0/50]
2026-08-21 10:41:46,096 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (IdleRemover), db2ogu: removeIdleConnections(1787319406096) [0/20]
2026-08-21 10:41:46,096 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (IdleRemover), db2igf: removeIdleConnections(1787319406096) [0/30]
2026-08-21 10:41:46,096 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (IdleRemover), db2iof: removeIdleConnections(1787319406096) [0/30]
2026-08-21 10:41:46,096 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (IdleRemover), db2iso: removeIdleConnections(1787317906096) [0/50]
[root@srjdeapllx158 configuration]#
