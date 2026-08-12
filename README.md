
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# grep -A 1 "br.gov.caixa.psc.connector.util.Config" /opt/jboss-eap/standalone/configuration/standalone.xm
grep: /opt/jboss-eap/standalone/configuration/standalone.xm: Arquivo ou diretório não encontrado
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# <property name="br.gov.caixa.psc.connector.util.Config" value="/opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties" />
bash: erro de sintaxe próximo do `token' não esperado `newline'
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# ls -la /opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties
ls: não é possível acessar /opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties: Arquivo ou diretório não encontrado
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# tail -f /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
2026-08-12 13:58:31,758 INFO  [org.primefaces.webapp.PostConstructApplicationEventListener] (ServerService Thread Pool -- 114) Running on PrimeFaces 4.0
2026-08-12 13:58:31,818 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 114) WFLYUT0021: Contexto web registrado: '/sicmu' para servidor 'default-server'
2026-08-12 13:58:31,834 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 40) WFLYSRV0010: "applicationinsights-agent.jar" foi implantado (runtime-name: "applicationinsights-agent.jar")
2026-08-12 13:58:31,834 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 40) WFLYSRV0010: "framework.jar" foi implantado (runtime-name: "framework.jar")
2026-08-12 13:58:31,834 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 40) WFLYSRV0010: "wmq.jmsra.rar" foi implantado (runtime-name: "wmq.jmsra.rar")
2026-08-12 13:58:31,834 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 40) WFLYSRV0010: "SICMU-ear.ear" foi implantado (runtime-name: "SICMU-ear.ear")
2026-08-12 13:58:31,894 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor
2026-08-12 13:58:31,898 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001) iniciado em 15320ms - Iniciado(s) 3612 de serviços 3771 (os serviços 427 estão lentos, passivos ou sob demanda)
2026-08-12 13:58:31,908 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: A interface de gerenciamento http escutando em http://0.0.0.0:9990/management
2026-08-12 13:58:31,908 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: O console de administração escutando em http://0.0.0.0:9990
^C
[root@caddeapllx2484 tmp]# grep -i "jconnector" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -30
2026-08-12 13:58:23,749 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-3) WFLYSRV0018: A implantação "deployment.SICMU-ear.ear.SICMU-ejb.jar" está usando um módulo privado ("br.gov.caixa.psc.jconnector") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
2026-08-12 13:58:23,870 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-3) WFLYSRV0018: A implantação "deployment.SICMU-ear.ear.SICMU-web.war" está usando um módulo privado ("br.gov.caixa.psc.jconnector") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# curl -Ik https://servicossociais.des.corerj.caixa/LoginIntranetAction.do
curl: (7) Failed connect to servicossociais.des.corerj.caixa:443; Tempo esgotado para conexão
[root@caddeapllx2484 tmp]#
