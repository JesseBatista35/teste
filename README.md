[p585600@caddeapllx2577 ~]$ systemctl list-units --type=service | grep -i jboss
  jboss-eap-standalone.service       loaded active running JBoss EAP Systemctl - STANDALONE
[p585600@caddeapllx2577 ~]$ ps -ef | grep jboss
root       27352       1  0 jun30 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siarg-interno -c standalone-full-ha.xml
jboss      27355   27352  0 jun30 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siarg-interno -c standalone-full-ha.xml
jboss      27517   27355  0 jun30 ?        00:03:12 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/siarg-interno/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/siarg-interno/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siarg-interno -c standalone-full-ha.xml
p585600    62446   62407  0 20:29 pts/0    00:00:00 grep --color=auto jboss
[p585600@caddeapllx2577 ~]$ ps -ef | grep java
jboss      27517   27355  0 jun30 ?        00:03:12 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/siarg-interno/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/siarg-interno/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siarg-interno -c standalone-full-ha.xml
p585600    62448   62407  0 20:29 pts/0    00:00:00 grep --color=auto java
[p585600@caddeapllx2577 ~]$ tail -f /opt/jboss-eap/standalone/log/server.log
2026-06-30 17:02:58,468 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 20) WFLYCTL0033: A extensão 'security' é obsoleta e talvez não seja suportada em versões futuras
2026-06-30 17:02:58,659 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/core-service=management/management-interface=http-interface', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-06-30 17:02:58,794 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/subsystem=undertow/server=default-server/https-listener=https', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-06-30 17:02:58,863 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-3) WFLYELY00023: O arquivo '/opt/jboss-eap/standalone/configuration/application.keystore' da KeyStore não existe. Usado em branco.
2026-06-30 17:02:58,870 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-06-30 17:02:58,897 INFO  [org.jboss.as.patching] (MSC service thread 1-1) WFLYPAT0050: A ID de patch cumulativo de JBoss EAP é jboss-eap-7.4.18.CP, os patches únicos incluem: none
2026-06-30 17:02:58,963 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-3) WFLYDM0111: Keystore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado. Ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-06-30 17:02:59,053 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor
2026-06-30 17:02:59,054 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado em 1666ms - Iniciado(s) 62 de serviços 85 (os serviços 32 estão lentos, passivos ou sob demanda)
2026-06-30 17:02:59,175 INFO  [org.jboss.as] (MSC service thread 1-4) WFLYSRV0050: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) interrompido em 4ms
^C
[p585600@caddeapllx2577 ~]$ curl -k -v https://siarg-interno.esteiras.des.caixa/siarg/login
*   Trying 10.116.201.44:443...
* Connected to siarg-interno.esteiras.des.caixa (10.116.201.44) port 443 (#0)
* ALPN, offering h2
* ALPN, offering http/1.1
*  CAfile: /etc/pki/tls/certs/ca-bundle.crt
* TLSv1.0 (OUT), TLS header, Certificate Status (22):
* TLSv1.3 (OUT), TLS handshake, Client hello (1):
* TLSv1.2 (IN), TLS header, Certificate Status (22):
* TLSv1.3 (IN), TLS handshake, Server hello (2):
* TLSv1.2 (IN), TLS header, Finished (20):
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.3 (IN), TLS handshake, Encrypted Extensions (8):
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.3 (IN), TLS handshake, Certificate (11):
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.3 (IN), TLS handshake, CERT verify (15):
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.3 (IN), TLS handshake, Finished (20):
* TLSv1.2 (OUT), TLS header, Finished (20):
* TLSv1.3 (OUT), TLS change cipher, Change cipher spec (1):
* TLSv1.2 (OUT), TLS header, Unknown (23):
* TLSv1.3 (OUT), TLS handshake, Finished (20):
* SSL connection using TLSv1.3 / TLS_AES_256_GCM_SHA384
* ALPN, server accepted to use http/1.1
* Server certificate:
*  subject: C=BR; O=Caixa Economica Federal; CN=siarg-interno.esteiras.des.caixa
*  start date: Apr 17 20:09:07 2026 GMT
*  expire date: Apr 17 20:19:07 2031 GMT
*  issuer: C=BR; O=Caixa Economica Federal; CN=AC Icptestes Sub
*  SSL certificate verify result: unable to get local issuer certificate (20), continuing anyway.
* TLSv1.2 (OUT), TLS header, Unknown (23):
> GET /siarg/login HTTP/1.1
> Host: siarg-interno.esteiras.des.caixa
> User-Agent: curl/7.76.1
> Accept: */*
>
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.3 (IN), TLS handshake, Newsession Ticket (4):
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.3 (IN), TLS handshake, Newsession Ticket (4):
* old SSL session ID is stale, removing
* TLSv1.2 (IN), TLS header, Unknown (23):
* Mark bundle as not supporting multiuse
< HTTP/1.1 500 Internal Server Error
< Date: Thu, 02 Jul 2026 23:30:18 GMT
< Server: Apache/2.4.57 (Red Hat)
< Strict-Transport-Security: max-age=63072000; includeSubDomains; preload
< X-Frame-Options: DENY
< X-Content-Type-Options: nosniff
< Content-Length: 86
< Content-Type: text/html; charset=UTF-8
< Connection: close
<
* Closing connection 0
* TLSv1.2 (OUT), TLS header, Unknown (23):
* TLSv1.3 (OUT), TLS alert, close notify (256):
<html><head><title>Error</title></head><body>500 - Internal Server Error</body></html>[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$ grep -n "ERROR" /opt/jboss-eap/standalone/log/server.log | tail -30
[p585600@caddeapllx2577 ~]$ tail -300 /opt/jboss-eap/standalone/log/server.log | grep -A 50
Uso: grep [OPÇÃO]... PADRÕES [ARQUIVO]...
Experimente "grep --help" para mais informações.
[p585600@caddeapllx2577 ~]$
