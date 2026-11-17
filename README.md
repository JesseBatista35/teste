[root@caddeapllx2884 p981778]#
[root@caddeapllx2884 p981778]# ls -l /opt/jboss-eap/standalone/deployments/
/opt/jboss-eap/bin/jboss-cli.sh --connect --command="deployment-info"
total 64388
-rwxrw-rw- 1 jboss jboss 65913511 nov 17 11:09 gec-ear.ear
-rw-r--r-- 1 jboss jboss     2421 nov 17 12:27 gec-ear.ear.failed
-rwxrwxr-x 1 jboss jboss     8888 jun 23  2021 README.txt
NAME        RUNTIME-NAME PERSISTENT ENABLED STATUS
gec-ear.ear gec-ear.ear  false      true    FAILED
[root@caddeapllx2884 p981778]# grep -nE "WFLYDS0013|WFLYSRV0027|WFLYSRV0010|WFLYDS0015|framework|wmq.jmsra" /logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch/server.log | head -30
1:2026-11-17 11:08:55,378 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-3) WFLYDS0013: Foi iniciado FileSystemDeploymentService para o diretório /opt/jboss-eap/standalone/deployments
122:2026-11-17 11:09:13,048 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-2) WFLYDS0013: Foi iniciado FileSystemDeploymentService para o diretório /opt/jboss-eap/standalone/deployments
123:2026-11-17 11:09:13,053 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Iniciando a implantação do "gec-ear.ear" (runtime-name: "gec-ear.ear")
370:2026-11-17 11:38:46,349 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-4) WFLYDS0013: Foi iniciado FileSystemDeploymentService para o diretório /opt/jboss-eap/standalone/deployments
371:2026-11-17 11:38:46,370 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0027: Iniciando a implantação do "gec-ear.ear" (runtime-name: "gec-ear.ear")
495:2026-11-17 11:41:11,949 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0027: Iniciando a implantação do "gec-ear.ear" (runtime-name: "gec-ear.ear")
619:2026-11-17 11:52:25,066 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-4) WFLYDS0013: Foi iniciado FileSystemDeploymentService para o diretório /opt/jboss-eap/standalone/deployments
620:2026-11-17 11:52:25,070 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Iniciando a implantação do "gec-ear.ear" (runtime-name: "gec-ear.ear")
744:2026-11-17 11:55:56,398 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0027: Iniciando a implantação do "gec-ear.ear" (runtime-name: "gec-ear.ear")
745:2026-11-17 11:55:56,396 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-2) WFLYDS0013: Foi iniciado FileSystemDeploymentService para o diretório /opt/jboss-eap/standalone/deployments
850:2026-11-17 11:56:00,858 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 48) WFLYSRV0010: "gec-ear.ear" foi implantado (runtime-name: "gec-ear.ear")
1376:2026-11-17 11:59:52,503 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-4) WFLYDS0013: Foi iniciado FileSystemDeploymentService para o diretório /opt/jboss-eap/standalone/deployments
1377:2026-11-17 11:59:52,511 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0027: Iniciando a implantação do "gec-ear.ear" (runtime-name: "gec-ear.ear")
1428:        "jboss.module.spec.service.\"deployment.framework.jar\".main",
1429:        "jboss.module.spec.service.\"deployment.framework_sisgd.jar\".main",
1430:        "jboss.module.spec.service.\"deployment.wmq.jmsra.rar\".main",
1437:        "jboss.module.resolve.phase.\"deployment.gec-ear.ear.gec-api.war\".main.1 faltam [jboss.module.spec.service.\"deployment.framework.jar\".main, jboss.module.spec.service.\"deployment.framework_sisgd.jar\".main, jboss.module.spec.service.\"deployment.wmq.jmsra.rar\".main]",
1441:        "jboss.module.resolve.phase.\"deployment.gec-ear.ear.gec-ejb.jar\".main.1 faltam [jboss.module.spec.service.\"deployment.framework.jar\".main, jboss.module.spec.service.\"deployment.wmq.jmsra.rar\".main]",
1442:        "jboss.module.resolve.phase.\"deployment.gec-ear.ear.gec-batch.jar\".main.1 faltam [jboss.module.spec.service.\"deployment.framework.jar\".main, jboss.module.spec.service.\"deployment.wmq.jmsra.rar\".main]",
1443:        "jboss.module.resolve.phase.\"deployment.gec-ear.ear\".main.1 faltam [jboss.module.spec.service.\"deployment.framework.jar\".main, jboss.module.spec.service.\"deployment.framework_sisgd.jar\".main, jboss.module.spec.service.\"deployment.wmq.jmsra.rar\".main]"
1446:2026-11-17 11:59:57,048 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 47) WFLYSRV0010: "gec-ear.ear" foi implantado (runtime-name: "gec-ear.ear")
1449:service jboss.module.spec.service."deployment.framework.jar".main (faltam) dependentes: [service jboss.module.resolve.phase."deployment.gec-ear.ear".main.1, service jboss.module.resolve.phase."deployment.gec-ear.ear.gec-batch.jar".main.1, service jboss.module.resolve.phase."deployment.gec-ear.ear.gec-ejb.jar".main.1, service jboss.module.resolve.phase."deployment.gec-ear.ear.gec-api.war".main.1]
1450:service jboss.module.spec.service."deployment.framework_sisgd.jar".main (faltam) dependentes: [service jboss.module.resolve.phase."deployment.gec-ear.ear".main.1, service jboss.module.resolve.phase."deployment.gec-ear.ear.gec-api.war".main.1]
1451:service jboss.module.spec.service."deployment.wmq.jmsra.rar".main (faltam) dependentes: [service jboss.module.resolve.phase."deployment.gec-ear.ear".main.1, service jboss.module.resolve.phase."deployment.gec-ear.ear.gec-batch.jar".main.1, service jboss.module.resolve.phase."deployment.gec-ear.ear.gec-ejb.jar".main.1, service jboss.module.resolve.phase."deployment.gec-ear.ear.gec-api.war".main.1]
1575:2026-11-17 12:27:19,825 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de gec-ear.ear falhou
1628:2026-11-17 12:27:21,024 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-3) WFLYDS0013: Foi iniciado FileSystemDeploymentService para o diretório /opt/jboss-eap/standalone/deployments
1629:2026-11-17 12:27:21,032 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Iniciando a implantação do "gec-ear.ear" (runtime-name: "gec-ear.ear")
1680:        "jboss.module.spec.service.\"deployment.framework_sisgd.jar\".main",
1681:        "jboss.module.spec.service.\"deployment.framework.jar\".main",
1682:        "jboss.module.spec.service.\"deployment.wmq.jmsra.rar\".main",
[root@caddeapllx2884 p981778]#
