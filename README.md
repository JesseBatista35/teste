
[root@caddeapllx2557 deployments]# ls /opt/jboss-eap/standalone/deployments/ | grep boletoService
boletoService-ear.ear
boletoService-ear.ear.deployed
[root@caddeapllx2557 deployments]#
[root@caddeapllx2557 deployments]#
[root@caddeapllx2557 deployments]# ls -la /log_jboss/sigsj_internet/
total 4
drwxr-xr-x 2 jboss jboss  32 nov 12 16:55 .
drwxr-xr-x 4 jboss jboss  48 nov 12 16:55 ..
-rw-r--r-- 1 jboss jboss 958 nov 12 16:56 caddeapllx2557.log
[root@caddeapllx2557 deployments]#
[root@caddeapllx2557 deployments]#
[root@caddeapllx2557 deployments]# grep -E 'WFLYSRV0016|log4j:ERROR' /logs/jboss/jboss-eap/standalone/sigsj-boleto/server.log | tail -2
2026-11-12 16:56:00,119 INFO  [org.jboss.as.server] (DeploymentScanner-threads - 1) WFLYSRV0016: A implantação "boletoService-ear.ear" foi substituída pela implantação "boletoService-ear.ear"
[root@caddeapllx2557 deployments]#
[root@caddeapllx2557 deployments]#
[root@caddeapllx2557 deployments]#
[root@caddeapllx2557 deployments]#
