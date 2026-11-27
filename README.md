

Last login: Fri Nov 27 09:39:56 2026 from 10.211.14.0
[p585600@cadsvitrlx100 ~]$ ssh 10.116.201.150
p585600@10.116.201.150's password:
Last login: Fri Sep  4 11:23:17 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -n -A40 "consultaOperacaoHabitacionalBean" $JBOSS_HOME/standalone/log/server.log | grep -m5 "Caused by"
grep: /standalone/log/server.log: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -nE '#\{|__[A-Z_]+__|\$\(' $JBOSS_HOME/standalone/configuration/standalone*.xml
grep: /standalone/configuration/standalone*.xml: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ $JBOSS_HOME/bin/jboss-cli.sh -c --command="/subsystem=datasources:read-resource(recursive=false)"
-sh: /bin/jboss-cli.sh: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$ $JBOSS_HOME/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=<NOME>:test-connection-in-pool"
-sh: /bin/jboss-cli.sh: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ hostname -f
caddeapllx2540.agil.nprd.caixa.gov.br
-sh-4.2$
-sh-4.2$
-sh-4.2$

lidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
[p981778@caddeapllx2540 sicmu-intranet-update]$


[root@caddeapllx2540 p585600]# cd /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/
[root@caddeapllx2540 sicmu-intranet-update]#
[root@caddeapllx2540 sicmu-intranet-update]#
[root@caddeapllx2540 sicmu-intranet-update]#
[root@caddeapllx2540 sicmu-intranet-update]# tail -100f server.log
        at com.ibm.db2.jcc.DB2Driver.connect(DB2Driver.java:115)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
        ... 6 more

2026-11-27 10:27:10,378 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (JCA PoolFiller) IJ000610: Unable to fill pool: java:/db2cdm: javax.resource.ResourceException: IJ031084: Unable to create connection
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1328)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.fillTo(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1148)
        at org.jboss.jca.core.connectionmanager.pool.mcp.PoolFiller.run(PoolFiller.java:97)
        at java.lang.Thread.run(Thread.java:748)
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
        at com.ibm.db2.jcc.am.fd.a(fd.java:737)
        at com.ibm.db2.jcc.am.fd.a(fd.java:60)
        at com.ibm.db2.jcc.am.fd.a(fd.java:120)
        at com.ibm.db2.jcc.t4.b.f(b.java:2435)
        at com.ibm.db2.jcc.t4.b.b(b.java:1808)
        at com.ibm.db2.jcc.t4.y.r(y.java:955)
        at com.ibm.db2.jcc.t4.y.k(y.java:492)
        at com.ibm.db2.jcc.t4.y.c(y.java:142)
        at com.ibm.db2.jcc.t4.b.k(b.java:1384)
        at com.ibm.db2.jcc.t4.b.b(b.java:1297)
        at com.ibm.db2.jcc.t4.b.a(b.java:6433)
        at com.ibm.db2.jcc.t4.b.b(b.java:848)
        at com.ibm.db2.jcc.t4.b.a(b.java:765)
        at com.ibm.db2.jcc.t4.b.a(b.java:423)
        at com.ibm.db2.jcc.t4.b.a(b.java:398)
        at com.ibm.db2.jcc.t4.b.<init>(b.java:336)
        at com.ibm.db2.jcc.DB2SimpleDataSource.getConnection(DB2SimpleDataSource.java:233)
        at com.ibm.db2.jcc.DB2SimpleDataSource.getConnection(DB2SimpleDataSource.java:199)
        at com.ibm.db2.jcc.DB2Driver.connect(DB2Driver.java:474)
        at com.ibm.db2.jcc.DB2Driver.connect(DB2Driver.java:115)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
        ... 6 more

2026-11-27 10:29:40,371 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (JCA PoolFiller) IJ000610: Unable to fill pool: java:/db2cmu: javax.resource.ResourceException: IJ031084: Unable to create connection
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1328)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.fillTo(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1148)
        at org.jboss.jca.core.connectionmanager.pool.mcp.PoolFiller.run(PoolFiller.java:97)
        at java.lang.Thread.run(Thread.java:748)
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
        at com.ibm.db2.jcc.am.fd.a(fd.java:737)
        at com.ibm.db2.jcc.am.fd.a(fd.java:60)
        at com.ibm.db2.jcc.am.fd.a(fd.java:120)
        at com.ibm.db2.jcc.t4.b.f(b.java:2435)
        at com.ibm.db2.jcc.t4.b.b(b.java:1808)
        at com.ibm.db2.jcc.t4.y.r(y.java:955)
        at com.ibm.db2.jcc.t4.y.k(y.java:492)
        at com.ibm.db2.jcc.t4.y.c(y.java:142)
        at com.ibm.db2.jcc.t4.b.k(b.java:1384)
        at com.ibm.db2.jcc.t4.b.b(b.java:1297)
        at com.ibm.db2.jcc.t4.b.a(b.java:6433)
        at com.ibm.db2.jcc.t4.b.b(b.java:848)
        at com.ibm.db2.jcc.t4.b.a(b.java:765)
        at com.ibm.db2.jcc.t4.b.a(b.java:423)
        at com.ibm.db2.jcc.t4.b.a(b.java:398)
        at com.ibm.db2.jcc.t4.b.<init>(b.java:336)
        at com.ibm.db2.jcc.DB2SimpleDataSource.getConnection(DB2SimpleDataSource.java:233)
        at com.ibm.db2.jcc.DB2SimpleDataSource.getConnection(DB2SimpleDataSource.java:199)
        at com.ibm.db2.jcc.DB2Driver.connect(DB2Driver.java:474)
        at com.ibm.db2.jcc.DB2Driver.connect(DB2Driver.java:115)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
        ... 6 more

2026-11-27 10:29:40,375 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (JCA PoolFiller) IJ000610: Unable to fill pool: java:/db2cdm: javax.resource.ResourceException: IJ031084: Unable to create connection
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1328)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.fillTo(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1148)
        at org.jboss.jca.core.connectionmanager.pool.mcp.PoolFiller.run(PoolFiller.java:97)
        at java.lang.Thread.run(Thread.java:748)
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2010][11246][4.16.53] Ocorreu uma falha na autorização de conexão.  Razão: erro do serviço de segurança local sem possibilidade de nova tentativa. ERRORCODE=-4214, SQLSTATE=28000
        at com.ibm.db2.jcc.am.fd.a(fd.java:737)
        at com.ibm.db2.jcc.am.fd.a(fd.java:60)
        at com.ibm.db2.jcc.am.fd.a(fd.java:120)
        at com.ibm.db2.jcc.t4.b.f(b.java:2435)
        at com.ibm.db2.jcc.t4.b.b(b.java:1808)
        at com.ibm.db2.jcc.t4.y.r(y.java:955)
        at com.ibm.db2.jcc.t4.y.k(y.java:492)
        at com.ibm.db2.jcc.t4.y.c(y.java:142)
        at com.ibm.db2.jcc.t4.b.k(b.java:1384)
        at com.ibm.db2.jcc.t4.b.b(b.java:1297)
        at com.ibm.db2.jcc.t4.b.a(b.java:6433)
        at com.ibm.db2.jcc.t4.b.b(b.java:848)
        at com.ibm.db2.jcc.t4.b.a(b.java:765)
        at com.ibm.db2.jcc.t4.b.a(b.java:423)
        at com.ibm.db2.jcc.t4.b.a(b.java:398)
        at com.ibm.db2.jcc.t4.b.<init>(b.java:336)
        at com.ibm.db2.jcc.DB2SimpleDataSource.getConnection(DB2SimpleDataSource.java:233)
        at com.ibm.db2.jcc.DB2SimpleDataSource.getConnection(DB2SimpleDataSource.java:199)
        at com.ibm.db2.jcc.DB2Driver.connect(DB2Driver.java:474)
        at com.ibm.db2.jcc.DB2Driver.connect(DB2Driver.java:115)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
        ... 6 more




 



