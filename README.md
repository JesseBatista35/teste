
[p585600@cspdeapllx011 ~]$ cd /tmp
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$ cat /opt/jboss/jboss-4.2.3.GA-jdk6/bin/run.conf 2>/dev/null | grep -i -E "keystore|truststore|ssl"
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$ ps -ef | grep sinac01 | grep -o -E "javax\.net\.ssl\.[a-zA-Z]*=[^ ]*"
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$ find / -iname "*.jks" -o -iname "*.p12" -o -iname "*.pfx" -o -iname "*keystore*" -o -iname "*truststore*" 2>/dev/null | grep -v "^/opt/jboss/jdk"
/opt/keystore
/opt/keystore/s-4570-5_CERT.p12
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/siran/keystore
/opt/ctmagent/ctm/exe_9.0.20.000/jars/UpdateKeystore.jar
/opt/ctmagent/ctm/exe_9.0.20.000/agkeystore
/opt/ctmagent/ctm/data/SSL/cert/agjks.p12
/opt/ctmagent/ctm/data/SSL/cert/agkeystore.kdb.bk
/opt/ctmagent/ctm/data/SSL/cert/agkeystore.kdb
/opt/ctmagent/ctm/data/SSL/cert/agkeystore.plc
/opt/ctmagent/ctm/install/PAKAI.9.0.00.300/backup/data/SSL/cert/agkeystore.kdb.bk
/opt/ctmagent/ctm/install/PAKAI.9.0.00.300/backup/data/SSL/cert/agkeystore.kdb
/opt/ctmagent/ctm/install/PAKAI.9.0.00.300/backup/data/SSL/cert/agkeystore.plc
/opt/ctmagent/ctm/install/PAKAI.9.0.00.300/backup/exe_900fp3/agkeystore
/opt/ctmagent/BMCINSTALL/uninstall/DRKAI.9.0.20.000/links_original_targets/exe_900fp3/agkeystore
/caixa/usr/p520093/server/sinac01/conf/siran/keystore
/usr/share/doc/m2crypto-0.20.2/demo/ssl/client.p12
/usr/share/doc/m2crypto-0.20.2/demo/smime/client.p12
/etc/pki/nssdb/s-4570-5_CERT.p12
/backup/20190402/sinac02/conf/siran/keystore
/backup/20190402/sinac03/conf/siran/keystore
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$ keytool -list -v -keystore /caminho/do/arquivo -storepass changeit 2>&1 | grep -A2 "Valid from\|Owner"
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$ find /opt/jboss/jboss-4.2.3.GA-jdk6 -iname "*.xml" -o -iname "*.properties" | xargs grep -l -i "sincad\|b3" 2>/dev/null
/opt/jboss/jboss-4.2.3.GA-jdk6/server/default/conf/xmdesc/org.jboss.deployment.MainDeployer-xmbean.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/default/deploy/ejb3-interceptors-aop.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/default/deploy/ejb3.deployer/META-INF/persistence.properties
/opt/jboss/jboss-4.2.3.GA-jdk6/server/default/deploy/ejb3.deployer/META-INF/jboss-service.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/default/deploy/jboss-web.deployer/conf/web.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/default/deploy/jbossws.sar/META-INF/jboss-service.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/default/deploy/jbossws.sar/jbossws.beans/META-INF/jboss-beans.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/all/conf/xmdesc/org.jboss.deployment.MainDeployer-xmbean.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/all/deploy/ejb3-interceptors-aop.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/all/deploy/ejb3.deployer/META-INF/persistence.properties
/opt/jboss/jboss-4.2.3.GA-jdk6/server/all/deploy/ejb3.deployer/META-INF/jboss-service.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/all/deploy/jboss-web.deployer/conf/web.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/all/deploy/ejb3-entity-cache-service.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/all/deploy/ejb3-clustered-sfsbcache-service.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/all/deploy/jbossws.sar/META-INF/jboss-service.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/all/deploy/jbossws.sar/jbossws.beans/META-INF/jboss-beans.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/cma01/conf/xmdesc/org.jboss.deployment.MainDeployer-xmbean.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/cma01/conf/bindings.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/cma01/deploy/ejb3-interceptors-aop.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/cma01/deploy/ejb3.deployer/META-INF/persistence.properties
/opt/jboss/jboss-4.2.3.GA-jdk6/server/cma01/deploy/ejb3.deployer/META-INF/jboss-service.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/cma01/deploy/jboss-web.deployer/conf/web.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/cma01/deploy/ejb3-entity-cache-service.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/cma01/deploy/ejb3-clustered-sfsbcache-service.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/cma01/deploy/jbossws.sar/META-INF/jboss-service.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/cma01/deploy/jbossws.sar/jbossws.beans/META-INF/jboss-beans.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/cma01/tmp/deploy/tmp8276115901536382952S2Caixa-exp.war/WEB-INF/web.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/cma01/tmp/deploy/tmp5289193369238712796ejb3-clustered-sfsbcache-service.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/cma01/tmp/deploy/tmp6539355035985372722SinacSiwinserviceWEB-exp.war/META-INF/maven/br.gov.caixa.sinac/sinac-siwinservice-war/pom.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/cma01/tmp/deploy/tmp547458127149597244S2CaixaPontoVenda-exp.war/WEB-INF/web.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/cma01/tmp/deploy/tmp8574225459724408169ejb3-entity-cache-service.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/cma01/tmp/deploy/tmp9157897646167568025ejb3-interceptors-aop.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/sinac-siarq.properties
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/xmdesc/org.jboss.deployment.MainDeployer-xmbean.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/deploy/ejb3-interceptors-aop.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/deploy/ejb3.deployer/META-INF/persistence.properties
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/deploy/ejb3.deployer/META-INF/jboss-service.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/deploy/jboss-web.deployer/conf/web.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/deploy/ejb3-entity-cache-service.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/deploy/ejb3-clustered-sfsbcache-service.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/deploy/jbossws.sar/META-INF/jboss-service.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/deploy/jbossws.sar/jbossws.beans/META-INF/jboss-beans.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/tmp/deploy/tmp8811259715646019431sinac_internet.ear-contents/sinac_internet-exp.war/WEB-INF/web.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/tmp/deploy/tmp3960587662198941053sinac_intranet.ear-contents/sinac_intranet-exp.war/WEB-INF/struts-config.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/tmp/deploy/tmp9048447151709817710ejb3-interceptors-aop.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/tmp/deploy/tmp981217425125391877ejb3-entity-cache-service.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/tmp/deploy/tmp7851411937443530713ejb3-clustered-sfsbcache-service.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/docs/examples/binding-manager/sample-bindings.xml
/opt/jboss/jboss-4.2.3.GA-jdk6/docs/licenses/thirdparty-licenses.xml
[p585600@cspdeapllx011 tmp]$
