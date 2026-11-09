
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ sudo grep -nE "WFLYSRV0025|WFLYSRV0026|WFLYCTL|ERROR|modcluster|framework" /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | tail -30

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
35:2026-11-06 16:05:47,038 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "siemp-ear.ear")]) - falha na descrição: {
36:    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
39:        "jboss.module.spec.service.\"deployment.framework.jar\".main"
41:    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => [
44:        "jboss.module.resolve.phase.\"deployment.siemp-ear.ear.siemp-web.war\".main.1 faltam [jboss.module.spec.service.\"deployment.framework.jar\".main]",
45:        "jboss.module.resolve.phase.\"deployment.siemp-ear.ear\".main.1 faltam [jboss.module.spec.service.\"deployment.framework.jar\".main]"
49:2026-11-06 16:05:47,141 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Relatório
50: de status de serviçoWFLYCTL0184: Não falta/insatisfaz nenhuma das dependências:
51:service jboss.module.spec.service."deployment.framework.jar".main (faltam) dependentes: [service jboss.module.resolve.phase."deployment.siemp-ear.ear.siemp-web.war".main.1, service jboss.module.resolve.phase."deployment.siemp-ear.ear".main.1]
54:WFLYCTL0448: 3 serviços adicionais estão inativos devido a ausência ou falha das suas dependências
56:2026-11-06 16:05:47,186 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 6274ms - Iniciado(s) 363 de serviços 611 (6 serviços falharam ou tinham dependências ausentes, os serviços 361 estão lentos, passivos ou sob demanda)
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ ss -lnt | grep -E ":9990|:8080|:8009"
LISTEN 0      10000        0.0.0.0:8080       0.0.0.0:*
LISTEN 0      50           0.0.0.0:9990       0.0.0.0:*
LISTEN 0      10000        0.0.0.0:8009       0.0.0.0:*
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ ls -l /opt/jboss-eap/standalone/deployments/
total 34956
-rwxrwxr-x 1 jboss jboss     8888 jun 23  2021 README.txt
-rwxrw-rw- 1 jboss jboss 35776620 nov  6 15:53 siemp-ear.ear
-rw-r--r-- 1 jboss jboss     1053 nov  6 16:05 siemp-ear.ear.failed
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
