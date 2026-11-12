oot@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]# ls /opt/jboss-eap/standalone/deployments/ | grep sigsj_internet
sigsj_internet-ear.ear
sigsj_internet-ear.ear.deployed
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]# tail -5 /log_jboss/sigsj_internet/sigsj_internet.log
[ INFO] 2026/11/12 16:50:05 sirot.IsoXmlMapeamento[ServerService Thread Pool -- 135] - Mapeando XML : GJXC
[DEBUG] 2026/11/12 16:50:05 servlet.CaixaConfigServlet[ServerService Thread Pool -- 135] - SIGSJ INTERNET SUBIU COM SUCESSO!
[ INFO] 2026/11/12 16:50:05 extension.undertow[ServerService Thread Pool -- 135] - WFLYUT0021: Contexto web registrado: '/sigsj_internet' para servidor 'default-server'
[ INFO] 2026/11/12 16:50:05 as.server[DeploymentScanner-threads - 2] - WFLYSRV0016: A implanta▒▒o "sigsj_internet-ear.ear" foi substitu▒da pela implanta▒▒o "sigsj_internet-ear.ear"
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]# grep -E 'WFLYSRV0016|log4j:ERROR' /logs/jboss/jboss-eap/standalone/sigsj-internet/server.log | tail -2
2026-11-12 16:50:05,537 INFO  [org.jboss.as.server] (DeploymentScanner-threads - 2) WFLYSRV0016: A implantação "sigsj_internet-ear.ear" foi substituída pela implantação "sigsj_internet-ear.ear"
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]#
