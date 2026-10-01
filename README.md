À Esteira Devops DES TQS

Atendimento para o SICEM em DES (https://http://sicem-legado.des.caixa/sicem/).

Solicitamos realizar deploy da versão SicemWEB_6.1.0.13.06, disponível em anexo, em ambiente DES.

Respeitosamente
Mikael Ferreira
c159079
Arrecadações e Convênios



condicoes deste aviso
***********************************************************************
p585600@10.116.88.24's password:
Last login: Fri Sep 18 11:27:29 2026 from 10.122.150.31
-sh-4.1$
-sh-4.1$
-sh-4.1$ hostname -f
sbrdeapllx0005
-sh-4.1$ hostname -i
10.116.88.24 10.116.88.24
-sh-4.1$
-sh-4.1$
-sh-4.1$ ps -ef | grep jboss
jboss    15880 30316  0 Sep30 ?        00:00:33 java -D[Process Controller] -server -Xms1g -Xmx1g -XX:MaxPermSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs= -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -Dorg.jboss.boot.log.file=/logs/jboss-eap/hc/process-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.process-controller -jboss-home /opt/jboss/jboss-eap -jvm java -mp /opt/jboss/jboss-eap/modules -- -Dorg.jboss.boot.log.file=/logs/jboss-eap/hc/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -server -Xms1g -Xmx1g -XX:MaxPermSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs= -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -- -default-jvm java -b 10.116.88.24 -bmanagement 10.116.88.24 -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.24 --host-config=host-slave.xml -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dhttps.protocols=TLSv1.2,TLSv1.3 -c domain.xml
jboss    15899 15880  0 Sep30 ?        00:01:24 java -D[Host Controller] -Dorg.jboss.boot.log.file=/logs/jboss-eap/hc/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -server -Xms1g -Xmx1g -XX:MaxPermSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs= -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.host-controller -mp /opt/jboss/jboss-eap/modules --pc-address 127.0.0.1 --pc-port 33323 -default-jvm java -b 10.116.88.24 -bmanagement 10.116.88.24 -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.24 --host-config=host-slave.xml -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dhttps.protocols=TLSv1.2,TLSv1.3 -c domain.xml -Djboss.home.dir=/opt/jboss/jboss-eap
jboss    15949 15880  0 Sep30 ?        00:09:43 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:sicem_node1_lx0005] -XX:PermSize=1024m -XX:MaxPermSize=1024m -Xms4096m -Xmx4096m -Duser.language=pt -Duser.country=BR -Djboss.modules.system.pkgs -Djboss.domain.master.address=10.116.88.20 -Dsicem.configuracao.ldap.url=ldap://10.116.92.130:489 -Djboss.bind.address.unsecure=10.116.88.24 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djava.net.preferIPv4Stack=true -Dsicem.configuracao.ldap.security.domain=sicem_security_domain -Djboss.bind.address=10.116.88.24 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dsicem.configuracao.ldap.grupo.sistema=SICEM -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Djava.awt.headless=true -Djboss.bind.address.management=10.116.88.24 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/sicem_node1_lx0005 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sicem_node1_lx0005 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sicem_node1_lx0005 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/sicem_node1_lx0005/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
jboss    16053 15880  0 Sep30 ?        00:00:50 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:siaef_node1_lx0091] -Xms2048m -Xmx2048m -DSIAEF_PASSWORD=saefd001 -Djboss.modules.system.pkgs -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.24 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djava.net.preferIPv4Stack=true -Djboss.bind.address=10.116.88.24 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Djava.awt.headless=true -DSIAEF_USUARIO=SAEFD001 -Djboss.bind.address.management=10.116.88.24 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/siaef_node1_lx0091 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/siaef_node1_lx0091 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/siaef_node1_lx0091 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/siaef_node1_lx0091/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
jboss    16186 15880  0 Sep30 ?        00:02:36 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:sicve-api_node1_lx0005] -XX:PermSize=512m -XX:MaxPermSize=512m -Xms2048m -Xmx2048m -Dfile.encoding=ISO-8859-1 -DSICVE.NLS_LANG=AMERICAN_AMERICA.WE8ISO8859P1 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxySet=true -Dhttp.nonProxyHosts=10.116.88.29|*.caixa|*.intra.caixa.gov.br|*.desenvolvimento.extracaixa|apim-parceiros-sandbox.azure-api.net|*.caixaintegrada.caixa -Duser.timezone=GMT-3 -Dsicve.recaptcha.site.key=6LekRn8UAAAAACOb9dM8_PUdsTTUdyOTePXP1QnP -Dexecutando.ambiente.desenvolvimento=S -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.24 -Djavax.net.ssl.trustStorePassword=changeit -Dsicdu.conveniado.url=http://10.116.88.29:8180/sicdu-convenios-web -Djava.net.preferIPv4Stack=true -DSISDU_URL_SERVIDOR=http://sisdu2.desenvolvimento.extracaixa/sisdu -Djboss.home.dir=/opt/jboss/jboss-eap -Dldap.sicve.clientes.host=10.192.176.214 -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dhttp.nonProxyHosts=10.116.88.29|.caixa|*.intra.caixa.gov.br|*.desenvolvimento.extracaixa -Dsicve.recaptcha.url=https://www.google.com/recaptcha/api/siteverify -Djboss.modules.system.pkgs -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Dsicve.recaptcha.base.score=0.5 -Djboss.bind.address=10.116.88.24 -Dtransparencia.diretorio=/upload/des/sicve/siclg/ -Djavax.net.ssl.keyStorePassword=changeit -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Djava.awt.headless=true -Dsicve.upload.url=http://sicve.desenvolvimento.extracaixa/sicve-anexo/uploadArquivo -Dsicve.recaptcha.secret.key=6LekRn8UAAAAAGmd3_3t3fqjy_mA7uXsiAr6ammf -Djboss.bind.address.management=10.116.88.24 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/sicve-api_node1_lx0005 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sicve-api_node1_lx0005 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sicve-api_node1_lx0005 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/sicve-api_node1_lx0005/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
jboss    16298 15880  0 Sep30 ?        00:00:50 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:sicve-internet_node1_lx0011] -XX:PermSize=512m -XX:MaxPermSize=512m -Xms2048m -Xmx2048m -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxySet=true -Duser.language=pt -Duser.country=BR -Duser.timezone=GMT-3 -Dsicve.recaptcha.site.key=6LekRn8UAAAAACOb9dM8_PUdsTTUdyOTePXP1QnP -Dexecutando.ambiente.desenvolvimento=S -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.24 -Djava.net.preferIPv4Stack=true -DSISDU_URL_SERVIDOR=http://sisdu2.desenvolvimento.extracaixa/sisdu -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dsicve.recaptcha.url=https://www.google.com/recaptcha/api/siteverify -Djboss.modules.system.pkgs -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Dsicve.recaptcha.base.score=0.5 -Djboss.bind.address=10.116.88.24 -Dtransparencia.diretorio=/upload/des/sicve/siclg/ -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Djava.awt.headless=true -Dsicve.upload.url=http://sicve.desenvolvimento.extracaixa/sicve-anexo/uploadArquivo -Dsicve.recaptcha.secret.key=6LekRn8UAAAAAGmd3_3t3fqjy_mA7uXsiAr6ammf -Dapikey.localidade=l7e2ec4e9e31a54b65988d80dbb01bc631 -Djboss.bind.address.management=10.116.88.24 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/sicve-internet_node1_lx0011 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sicve-internet_node1_lx0011 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sicve-internet_node1_lx0011 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/sicve-internet_node1_lx0011/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
jboss    16446 15880  0 Sep30 ?        00:04:52 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:sicve_node1_lx0011] -XX:PermSize=512m -XX:MaxPermSize=512m -Xms2048m -Xmx2048m -Dfile.encoding=ISO-8859-1 -DSICVE.NLS_LANG=AMERICAN_AMERICA.WE8ISO8859P1 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxySet=true -Dhttp.nonProxyHosts=10.116.88.29|*.caixa|*.intra.caixa.gov.br|*.desenvolvimento.extracaixa|apim-parceiros-sandbox.azure-api.net|*.caixaintegrada.caixa -Duser.timezone=GMT-3 -Dsicve.recaptcha.site.key=6LekRn8UAAAAACOb9dM8_PUdsTTUdyOTePXP1QnP -Djavax.net.ssl.trustStore=/upload/des/sicve/truststore.jks -Dexecutando.ambiente.desenvolvimento=S -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.24 -Djavax.net.ssl.trustStorePassword=changeit -Dsicdu.conveniado.url=http://10.116.88.29:8180/sicdu-convenios-web -Durl.api.sap=https://integramaisepq.caixaintegrada.caixa/sap/bc -Dpncp.senha=p5cha6Ozjg92XXYM -Djava.net.preferIPv4Stack=true -DSISDU_URL_SERVIDOR=http://sisdu2.desenvolvimento.extracaixa/sisdu -Djboss.home.dir=/opt/jboss/jboss-eap -Dpncp.url=https://apim-parceiros-sandbox.azure-api.net/TCU_PNCP -Dldap.sicve.clientes.host=10.192.176.214 -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dpncp.login=eba1ffec-f739-4ea9-94ec-67edcaf96b3d -Dhttp.nonProxyHosts=10.116.88.29|.caixa|*.intra.caixa.gov.br|*.desenvolvimento.extracaixa|*.caixa.gov.br -Dsicve.recaptcha.url=https://www.google.com/recaptcha/api/siteverify -Djboss.modules.system.pkgs -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Dsicve.recaptcha.base.score=0.5 -Djboss.bind.address=10.116.88.24 -Dtransparencia.diretorio=/upload/des/sicve/siclg/ -Djavax.net.ssl.keyStorePassword=changeit -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Djava.awt.headless=true -Dsicve.upload.url=https://sicve.desenvolvimento.extracaixa/sicve-anexo/uploadArquivo -Dsicve.recaptcha.secret.key=6LekRn8UAAAAAGmd3_3t3fqjy_mA7uXsiAr6ammf -Dapikey.localidade=l7e2ec4e9e31a54b65988d80dbb01bc631 -Djboss.bind.address.management=10.116.88.24 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/sicve_node1_lx0011 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sicve_node1_lx0011 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sicve_node1_lx0011 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/sicve_node1_lx0011/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
jboss    16585 15880  3 Sep30 ?        00:36:46 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:sicve-msw-intranet_node1_lx0011] -XX:PermSize=512m -XX:MaxPermSize=512m -Xms2048m -Xmx2048m -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxySet=true -Dhttp.nonProxyHosts=10.116.88.29|.caixa|*.intra.caixa.gov.br|*.desenvolvimento.extracaixa|apim-parceiros-sandbox.azure-api.net -Duser.language=pt -Duser.country=BR -Duser.timezone=GMT-3  -Djavax.net.ssl.trustStore=/upload/des/sicve/truststore.jks -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.24 -Dpncp.senha=p5cha6Ozjg92XXYM -Djava.net.preferIPv4Stack=true -DSISDU_URL_SERVIDOR=http://sisdu2.desenvolvimento.extracaixa/sisdu -Djboss.home.dir=/opt/jboss/jboss-eap -Dsiconv.serpro.mais.brasil.url=https://val-siconv.estaleiro.serpro.gov.br/maisbrasil-api/v1/services/public/ -Dpncp.url=https://apim-parceiros-sandbox.azure-api.net/TCU_PNCP -Durl.api.unidades=https://api.des.caixa:8443/informacoes-corporativas-privadas -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dpncp.login=eba1ffec-f739-4ea9-94ec-67edcaf96b3d -Durl.api.localidade=https://api.des.caixa:8443/informacoes-corporativas-publicas -Dsiconv.serpro.mais.brasil.token= -Dsiico.api.url=http://api.des.caixa:8443/informacoes-corporativas-publicas/v1/ -Djboss.modules.system.pkgs -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.bind.address=10.116.88.24 -Dtransparencia.diretorio=/upload/des/sicve/siclg/ -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Djava.awt.headless=true -Djboss.bind.address.management=10.116.88.24 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/sicve-msw-intranet_node1_lx0011 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sicve-msw-intranet_node1_lx0011 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sicve-msw-intranet_node1_lx0011 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/sicve-msw-intranet_node1_lx0011/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
jboss    16735 15880  0 Sep30 ?        00:01:42 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:sicve-anexo_node1_lx0011] -XX:PermSize=512m -XX:MaxPermSize=512m -Xms2048m -Xmx2048m -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxySet=true -Duser.language=pt -Duser.country=BR -Duser.timezone=GMT-3  -Djboss.modules.system.pkgs -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.24 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djava.net.preferIPv4Stack=true -Djboss.bind.address=10.116.88.24 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dtransparencia.diretorio=/upload/des/sicve/siclg/ -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Djava.awt.headless=true -Djboss.bind.address.management=10.116.88.24 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/sicve-anexo_node1_lx0011 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sicve-anexo_node1_lx0011 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sicve-anexo_node1_lx0011 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/sicve-anexo_node1_lx0011/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
p585600  25982 25851  0 15:31 pts/2    00:00:00 grep jboss
root     30314     1  0 Sep18 ?        00:00:00 su - jboss -c JBOSS_PIDFILE=/opt/jboss/jboss-eap/hc/tmp/jboss_hc.pid LAUNCH_JBOSS_IN_BACKGROUND=1 /opt/jboss/jboss-eap/bin/domain.sh                -b 10.116.88.24                -bmanagement 10.116.88.24                -Djboss.domain.master.address=10.116.88.20                -Djboss.bind.address.unsecure=10.116.88.24                --host-config=host-slave.xml                -Djboss.domain.log.dir=/logs/jboss-eap/hc/                 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc??-Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize                -Dhttps.protocols=TLSv1.2,TLSv1.3                -c domain.xml
jboss    30316 30314  0 Sep18 ?        00:00:00 /bin/sh /opt/jboss/jboss-eap/bin/domain.sh -b 10.116.88.24 -bmanagement 10.116.88.24 -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.24 --host-config=host-slave.xml -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dhttps.protocols=TLSv1.2,TLSv1.3 -c domain.xml
-sh-4.1$
-sh-4.1$
-sh-4.1$
(reverse-i-search)`con': tail -n 200 /logs/jboss-eap/hc/^Cnsole-stdout.log
-sh-4.1$
-sh-4.1$
-sh-4.1$ /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.20:9999
Authenticating against security realm: ManagementRealm
Username: p585600
Password:
Failed to connect to the controller: Unable to authenticate against controller at 10.116.88.20:9999: Authentication failed: the server presented no authentication mechanisms
org.jboss.as.cli.CliInitializationException: Failed to connect to the controller
        at org.jboss.as.cli.impl.CliLauncher.initCommandContext(CliLauncher.java:306)
        at org.jboss.as.cli.impl.CliLauncher.main(CliLauncher.java:283)
        at org.jboss.as.cli.CommandLineMain.main(CommandLineMain.java:45)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at org.jboss.modules.Module.run(Module.java:318)
        at org.jboss.modules.Main.main(Main.java:473)
Caused by: org.jboss.as.cli.CommandLineException: Unable to authenticate against controller at 10.116.88.20:9999
        at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:1062)
        at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:903)
        at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:879)
        at org.jboss.as.cli.impl.CliLauncher.initCommandContext(CliLauncher.java:304)
        ... 8 more
Caused by: javax.security.sasl.SaslException: Authentication failed: the server presented no authentication mechanisms
        at org.jboss.remoting3.remote.ClientConnectionOpenListener$Capabilities.handleEvent(ClientConnectionOpenListener.java:414)
        at org.jboss.remoting3.remote.ClientConnectionOpenListener$Capabilities.handleEvent(ClientConnectionOpenListener.java:244)
        at org.xnio.ChannelListeners.invokeChannelListener(ChannelListeners.java:72)
        at org.xnio.channels.TranslatingSuspendableChannel.handleReadable(TranslatingSuspendableChannel.java:189)
        at org.xnio.channels.TranslatingSuspendableChannel$1.handleEvent(TranslatingSuspendableChannel.java:103)
        at org.xnio.ChannelListeners.invokeChannelListener(ChannelListeners.java:72)
        at org.xnio.channels.TranslatingSuspendableChannel.handleReadable(TranslatingSuspendableChannel.java:189)
        at org.xnio.ssl.JsseConnectedSslStreamChannel.handleReadable(JsseConnectedSslStreamChannel.java:183)
        at org.xnio.channels.TranslatingSuspendableChannel$1.handleEvent(TranslatingSuspendableChannel.java:103)
        at org.xnio.ChannelListeners.invokeChannelListener(ChannelListeners.java:72)
        at org.xnio.nio.NioHandle.run(NioHandle.java:90)
        at org.xnio.nio.WorkerThread.run(WorkerThread.java:198)
        at ...asynchronous invocation...(Unknown Source)
        at org.jboss.remoting3.EndpointImpl.doConnect(EndpointImpl.java:293)
        at org.jboss.remoting3.EndpointImpl.doConnect(EndpointImpl.java:274)
        at org.jboss.remoting3.EndpointImpl.connect(EndpointImpl.java:386)
        at org.jboss.remoting3.EndpointImpl.connect(EndpointImpl.java:374)
        at org.jboss.as.protocol.ProtocolConnectionUtils.connect(ProtocolConnectionUtils.java:84)
        at org.jboss.as.protocol.ProtocolConnectionUtils.connectSync(ProtocolConnectionUtils.java:103)
        at org.jboss.as.protocol.ProtocolConnectionManager$EstablishingConnection.connect(ProtocolConnectionManager.java:256)
        at org.jboss.as.protocol.ProtocolConnectionManager.connect(ProtocolConnectionManager.java:70)
        at org.jboss.as.protocol.mgmt.FutureManagementChannel$Establishing.getChannel(FutureManagementChannel.java:208)
        at org.jboss.as.cli.impl.CLIModelControllerClient.getOrCreateChannel(CLIModelControllerClient.java:169)
        at org.jboss.as.cli.impl.CLIModelControllerClient$2.getChannel(CLIModelControllerClient.java:129)
        at org.jboss.as.protocol.mgmt.ManagementChannelHandler.executeRequest(ManagementChannelHandler.java:123)
        at org.jboss.as.protocol.mgmt.ManagementChannelHandler.executeRequest(ManagementChannelHandler.java:98)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeRequest(AbstractModelControllerClient.java:263)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.execute(AbstractModelControllerClient.java:168)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeForResult(AbstractModelControllerClient.java:147)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.execute(AbstractModelControllerClient.java:75)
        at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:1053)
        ... 11 more
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo su
[sudo] password for p585600:
[root@sbrdeapllx0005 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.20:9999
Authenticating against security realm: ManagementRealm
Username: p585600
Password:
Failed to connect to the controller: Unable to authenticate against controller at 10.116.88.20:9999: Authentication failed: the server presented no authentication mechanisms
org.jboss.as.cli.CliInitializationException: Failed to connect to the controller
        at org.jboss.as.cli.impl.CliLauncher.initCommandContext(CliLauncher.java:306)
        at org.jboss.as.cli.impl.CliLauncher.main(CliLauncher.java:283)
        at org.jboss.as.cli.CommandLineMain.main(CommandLineMain.java:45)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at org.jboss.modules.Module.run(Module.java:318)
        at org.jboss.modules.Main.main(Main.java:473)
Caused by: org.jboss.as.cli.CommandLineException: Unable to authenticate against controller at 10.116.88.20:9999
        at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:1062)
        at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:903)
        at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:879)
        at org.jboss.as.cli.impl.CliLauncher.initCommandContext(CliLauncher.java:304)
        ... 8 more
Caused by: javax.security.sasl.SaslException: Authentication failed: the server presented no authentication mechanisms
        at org.jboss.remoting3.remote.ClientConnectionOpenListener$Capabilities.handleEvent(ClientConnectionOpenListener.java:414)
        at org.jboss.remoting3.remote.ClientConnectionOpenListener$Capabilities.handleEvent(ClientConnectionOpenListener.java:244)
        at org.xnio.ChannelListeners.invokeChannelListener(ChannelListeners.java:72)
        at org.xnio.channels.TranslatingSuspendableChannel.handleReadable(TranslatingSuspendableChannel.java:189)
        at org.xnio.channels.TranslatingSuspendableChannel$1.handleEvent(TranslatingSuspendableChannel.java:103)
        at org.xnio.ChannelListeners.invokeChannelListener(ChannelListeners.java:72)
        at org.xnio.channels.TranslatingSuspendableChannel.handleReadable(TranslatingSuspendableChannel.java:189)
        at org.xnio.ssl.JsseConnectedSslStreamChannel.handleReadable(JsseConnectedSslStreamChannel.java:183)
        at org.xnio.channels.TranslatingSuspendableChannel$1.handleEvent(TranslatingSuspendableChannel.java:103)
        at org.xnio.ChannelListeners.invokeChannelListener(ChannelListeners.java:72)
        at org.xnio.nio.NioHandle.run(NioHandle.java:90)
        at org.xnio.nio.WorkerThread.run(WorkerThread.java:198)
        at ...asynchronous invocation...(Unknown Source)
        at org.jboss.remoting3.EndpointImpl.doConnect(EndpointImpl.java:293)
        at org.jboss.remoting3.EndpointImpl.doConnect(EndpointImpl.java:274)
        at org.jboss.remoting3.EndpointImpl.connect(EndpointImpl.java:386)
        at org.jboss.remoting3.EndpointImpl.connect(EndpointImpl.java:374)
        at org.jboss.as.protocol.ProtocolConnectionUtils.connect(ProtocolConnectionUtils.java:84)
        at org.jboss.as.protocol.ProtocolConnectionUtils.connectSync(ProtocolConnectionUtils.java:103)
        at org.jboss.as.protocol.ProtocolConnectionManager$EstablishingConnection.connect(ProtocolConnectionManager.java:256)
        at org.jboss.as.protocol.ProtocolConnectionManager.connect(ProtocolConnectionManager.java:70)
        at org.jboss.as.protocol.mgmt.FutureManagementChannel$Establishing.getChannel(FutureManagementChannel.java:208)
        at org.jboss.as.cli.impl.CLIModelControllerClient.getOrCreateChannel(CLIModelControllerClient.java:169)
        at org.jboss.as.cli.impl.CLIModelControllerClient$2.getChannel(CLIModelControllerClient.java:129)
        at org.jboss.as.protocol.mgmt.ManagementChannelHandler.executeRequest(ManagementChannelHandler.java:123)
        at org.jboss.as.protocol.mgmt.ManagementChannelHandler.executeRequest(ManagementChannelHandler.java:98)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeRequest(AbstractModelControllerClient.java:263)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.execute(AbstractModelControllerClient.java:168)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeForResult(AbstractModelControllerClient.java:147)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.execute(AbstractModelControllerClient.java:75)
        at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:1053)
        ... 11 more
[root@sbrdeapllx0005 p585600]#


<img width="1763" height="1010" alt="image" src="https://github.com/user-attachments/assets/0628d623-cf72-44c4-b5ac-ac4e711e898b" />


lemra que ja fizemos aqui agente apaga esse coloca o outra mas antes agente mata o pid atual 

me ajuda ai eu nao lembro

