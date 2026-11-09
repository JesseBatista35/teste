**ls -l /opt/jboss-eap/standalone/deployments/ | grep -i framework
**


[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ ls -l /opt/jboss-eap/standalone/deployments/ | grep -i framework
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ ls -l /opt/jboss-eap/standalone/deployments/ | grep -i framework
[p585600@caddeapllx2864 ~]$ sudo tail -f /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | grep -E "WFLYSRV0010|WFLYSRV0025|WFLYSRV0026|WFLYCTL0013|WFLYCTL0412|ERROR|framework|modcluster"
[sudo] senha para p585600:
,service jboss.module.spec.service."deployment.framework.jar".main (faltam) dependentes: [service jboss.module.resolve.phase."deployment.siemp-ear.ear.siemp-web.war".main.1, service jboss.module.resolve.phase."deployment.siemp-ear.ear".main.1]
2026-11-09 10:33:33,809 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 5521ms - Iniciado(s) 363 de serviços 611 (6 serviços falharam ou tinham dependências ausentes, os serviços 361 estão lentos, passivos ou sob demanda)



deu erro novo deploy
