


[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$ sudo grep "workflow-credito-pj-web/api/perfil-acesso-usuario" /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-access.log | tail -3
10.116.3.26 - - [05/Nov/2026:11:03:09 -0300] "GET /workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793887389799 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:140.0) Gecko/20100101 Firefox/140.0" - 200 0 246 830
10.116.3.23 - - [05/Nov/2026:11:03:55 -0300] "GET /workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793887435478 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 1747
10.116.3.25 - - [05/Nov/2026:11:03:55 -0300] "GET /workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793887435548 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 247 1022
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$





11:00:41,636 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.23.GA (WildFly Core 15.0.43.Final-redhat-00001) iniciado em 14799ms - Iniciado(s) 12994 de serviços 13267 (os serviços 588 estão lentos, passivos ou sob demanda)
[p585600@cbrdeapllx473 ~]$ sudo grep -E "WFLYSRV0010: \"(SIFEC|SICCR-PJ)\"|WFLYSRV0021" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -4
10:49:50,114 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICCR-PJ" foi implantado (runtime-name: "workflow-credito-pj-ear-8.40.1-20261105.100217-6.ear")
10:49:50,114 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC" foi implantado (runtime-name: "sifec-2.160.3.0.ear")
11:00:41,614 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICCR-PJ" foi implantado (runtime-name: "workflow-credito-pj-ear-8.40.1-20261105.100217-6.ear")
11:00:41,615 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC" foi implantado (runtime-name: "sifec-2.160.3.0.ear")
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$





<img width="1635" height="867" alt="image" src="https://github.com/user-attachments/assets/e3c6cfa0-04b3-47b9-a469-a839a24c5a3c" />







