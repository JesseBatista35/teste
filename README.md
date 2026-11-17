/host=<host>/server-config=<server>/jvm=*:read-resource
/profile=<profile>/subsystem=datasources/data-source=<ds>:read-resource
/host=<host>/server=<server>/subsystem=datasources/data-source=<ds>/statistics=pool:read-resource(include-runtime=true)
/profile=<profile>/subsystem=transactions:read-attribute(name=default-timeout)





[p585600@srjtqapllx0056 ~]$
[p585600@srjtqapllx0056 ~]$
[p585600@srjtqapllx0056 ~]$
[p585600@srjtqapllx0056 ~]$ curl -skI --resolve siemp.des.caixa:443:10.116.180.9 https://siemp.des.caixa/ | grep -i location
Location: https://siemp.des.caixa/siemp
[p585600@srjtqapllx0056 ~]$
[p585600@srjtqapllx0056 ~]$
[p585600@srjtqapllx0056 ~]$
[p585600@srjtqapllx0056 ~]$
[p585600@srjtqapllx0056 ~]$
[p585600@srjtqapllx0056 ~]$ /host=<host>/server-config=<server>/jvm=*:read-resource
-bash: host: No such file or directory
[p585600@srjtqapllx0056 ~]$ /profile=<profile>/subsystem=datasources/data-source=<ds>:read-resource
-bash: profile: No such file or directory
[p585600@srjtqapllx0056 ~]$ /host=<host>/server=<server>/subsystem=datasources/data-source=<ds>/statistics=pool:read-resource(include-runtime=true)
-bash: syntax error near unexpected token `('
[p585600@srjtqapllx0056 ~]$ /profile=<profile>/subsystem=transactions:read-attribute(name=default-timeout)
-bash: syntax error near unexpected token `('
[p585600@srjtqapllx0056 ~]$
[p585600@srjtqapllx0056 ~]$
[p585600@srjtqapllx0056 ~]$
(reverse-i-search)`con': /host=<host>/server-^Cnfig=<server>/jvm=*:read-resource
(reverse-i-search)`': ^C
[p585600@srjtqapllx0056 ~]$ sudo su
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]# spjbotr2  69590  69150  0 Jan15 ?        00:17:02 /opt/open/java/jdk1.8.0_121/bin/java -D[Server:srjtqapllx0056_sigaf_intra_8083] -Xms1024m -Xmx1024m -Dbr.gov.caixa.psc.connector.util.Config=/infra_app/config/sigaf/sigaf_jconnector.properties -Dcaminho.arquivo.temp=/var/tmp -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djavax.net.ssl.trustStore=/infra_app/config/sigaf/cacerts -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=jks -Djboss.bind.address=srjtqapllx0056 -Djboss.bind.address.management=srjtqapllx0056 -Djboss.home.dir=/opt/open/jboss/7.0.0 -Djboss.management.http.port=9990 -Djboss.management.native.port=9999 -Djboss.modules.system.pkgs=org.jboss.byteman -Dsisgr.webservice=https://webservice.acessoseguro.tqs.corerj.caixa/ -Djboss.server.log.dir=/opt/open/jboss/7.0.0/domain/servers/srjtqapllx0056_sigaf_intra_8083/log -Djboss.server.temp.dir=/opt/open/jboss/7.0.0/domain/servers/srjtqapllx0056_sigaf_intra_8083/tmp -Djboss.server.data.dir=/opt/open/jboss/7.0.0/domain/servers/srjtqapllx0056_sigaf_intra_8083/data -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/servers/srjtqapllx0056_sigaf_intra_8083/data/logging.properties -jar /opt/open/jboss/7.0.0/jboss-modules.jar -mp /opt/open/jboss/7.0.0/modules org.jboss.as.server
bash: spjbotr2: command not found
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#
