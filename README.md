[p585600@caddeapllx2577 ~]$ sed -n '27990,28040p' /logs/jboss/jboss-eap/standalone/siarg-interno/server.log
        jboss.server.content.dir = /opt/jboss-eap/standalone/data/content
        jboss.server.data.dir = /opt/jboss-eap/standalone/data
        jboss.server.deploy.dir = /opt/jboss-eap/standalone/data/content
        jboss.server.log.dir = /opt/jboss-eap/standalone/log
        jboss.server.name = caddeapllx2577
        jboss.server.persist.config = true
        jboss.server.temp.dir = /opt/jboss-eap/standalone/tmp
        line.separator =

        logging.configuration = file:/opt/jboss-eap/bin/jboss-cli-logging.properties
        module.path = /opt/jboss-eap/modules
        org.jboss.boot.log.file = /opt/jboss-eap/standalone/log/server.log
        org.jboss.resolver.warning = true
        org.wildfly.logging.embedded = false
        os.arch = amd64
        os.name = Linux
        os.version = 5.14.0-362.8.1.el9_3.x86_64
        path.separator = :
        sun.arch.data.model = 64
        sun.boot.class.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/resources.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/rt.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jsse.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jce.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/charsets.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jfr.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/classes
        sun.boot.library.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/amd64
        sun.cpu.endian = little
        sun.cpu.isalist =
        sun.io.unicode.encoding = UnicodeLittle
        sun.java.command = /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.cli --file=/tmp/src/jboss-custom.cli
        sun.java.launcher = SUN_STANDARD
        sun.jnu.encoding = UTF-8
        sun.management.compiler = HotSpot 64-Bit Tiered Compilers
        sun.os.patch.level = unknown
        user.country = BR
        user.dir = /opt/jboss-eap/bin
        user.home = /root
        user.language = pt
        user.name = root
        user.timezone = America/Sao_Paulo
21:32:18,143 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Argumentos da VM: -Djboss.modules.system.pkgs=com.sun.java.swing -Dcom.ibm.jsse2.overrideDefaultTLS=true -Dlogging.configuration=file:/opt/jboss-eap/bin/jboss-cli-logging.properties
21:32:18,714 INFO  [org.wildfly.security] (ServerService Thread Pool -- 23) ELY00001: WildFly Elytron version 1.15.23.Final-redhat-00001
21:32:18,884 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 20) WFLYCTL0033: A extensão 'security' é obsoleta e talvez não seja suportada em versões futuras
21:32:19,103 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/core-service=management/management-interface=http-interface', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
21:32:19,223 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/subsystem=undertow/server=default-server/https-listener=https', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
21:32:19,318 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY00023: O arquivo '/opt/jboss-eap/standalone/configuration/application.keystore' da KeyStore não existe. Usado em branco.
21:32:19,322 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-3) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
21:32:19,342 INFO  [org.jboss.as.patching] (MSC service thread 1-1) WFLYPAT0050: A ID de patch cumulativo de JBoss EAP é jboss-eap-7.4.18.CP, os patches únicos incluem: none
21:32:19,420 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-2) WFLYDM0111: Keystore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado. Ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
21:32:19,513 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor
21:32:19,515 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado em 1514ms - Iniciado(s) 62 de serviços 85 (os serviços 32 estão lentos, passivos ou sob demanda)
21:32:19,643 INFO  [org.jboss.as] (MSC service thread 1-3) WFLYSRV0050: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) interrompido em 10ms
21:32:20,103 SEVERE [javax.enterprise.resource.webcontainer.jsf.config] (Mojarra-WebResourceMonitor-1-thread-1) Unable to access url file:/opt/jboss-eap/standalone/tmp/vfs/temp/temp39b59e3945cd348e/content-652d64ce19ed7e6/WEB-INF/faces-config.xml.  Monitoring for this resource will no longer occur.
21:36:02,195 ERROR [io.undertow.request] (default task-1) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.RuntimeException: java.lang.IllegalArgumentException: Either HTTP 500 or java.lang.Throwable error page is required in web.xml or web-fragment.xml. Neither was found.
        at io.undertow.servlet.spec.RequestDispatcherImpl.error(RequestDispatcherImpl.java:418) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.spec.RequestDispatcherImpl.error(RequestDispatcherImpl.java:364) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
[p585600@caddeapllx2577 ~]$ curl -k -v https://siarg-interno.esteiras.des.caixa/siarg/
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
> GET /siarg/ HTTP/1.1
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
< HTTP/1.1 301 Moved Permanently
< Date: Fri, 03 Jul 2026 01:37:02 GMT
< Server: Apache/2.4.57 (Red Hat)
< Strict-Transport-Security: max-age=63072000; includeSubDomains; preload
< X-Frame-Options: DENY
< X-Content-Type-Options: nosniff
< X-Frame-Options: DENY
< Location: https://siarg-interno.esteiras.des.caixa/siarg/index
< Referrer-Policy: strict-origin-when-cross-origin
< Content-Security-Policy: frame-ancestors 'none';
< Connection: close
< Strict-Transport-Security: max-age=63072000; includeSubDomains
< X-Content-Type-Options: nosniff
< Content-Length: 0
<
* Closing connection 0
* TLSv1.2 (OUT), TLS header, Unknown (23):
* TLSv1.3 (OUT), TLS alert, close notify (256):
[p585600@caddeapllx2577 ~]$ curl -k -v https://siarg-interno.esteiras.des.caixa/siarg/index.xhtml
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
> GET /siarg/index.xhtml HTTP/1.1
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
< HTTP/1.1 301 Moved Permanently
< Date: Fri, 03 Jul 2026 01:37:16 GMT
< Server: Apache/2.4.57 (Red Hat)
< Strict-Transport-Security: max-age=63072000; includeSubDomains; preload
< X-Frame-Options: DENY
< X-Content-Type-Options: nosniff
< X-Frame-Options: DENY
< Location: https://siarg-interno.esteiras.des.caixa/siarg/index
< Referrer-Policy: strict-origin-when-cross-origin
< Content-Security-Policy: frame-ancestors 'none';
< Connection: close
< Strict-Transport-Security: max-age=63072000; includeSubDomains
< X-Content-Type-Options: nosniff
< Content-Length: 0
< Content-Type: application/xhtml+xml
<
* Closing connection 0
* TLSv1.2 (OUT), TLS header, Unknown (23):
* TLSv1.3 (OUT), TLS alert, close notify (256):
[p585600@caddeapllx2577 ~]$
