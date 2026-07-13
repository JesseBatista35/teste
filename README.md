
-sh-4.1$ ^C
-sh-4.1$ hostname -f
sbrdeapllx0011
-sh-4.1$ ip a | grep inet
    inet 127.0.0.1/8 scope host lo
    inet6 ::1/128 scope host
    inet 10.116.88.30/23 brd 10.116.89.255 scope global eth0
    inet6 fe80::250:56ff:fe8e:2cb7/64 scope link
    inet 192.168.229.47/19 brd 192.168.255.255 scope global eth1
    inet6 fe80::250:56ff:fe86:56a5/64 scope link
    inet 10.184.18.196/14 brd 10.187.255.255 scope global eth2
    inet6 fe80::250:56ff:fe82:d804/64 scope link
-sh-4.1$ cat /etc/hosts | grep -i siouv
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ ps - ef | grep jboss
ERROR: Garbage option.
********* simple selection *********  ********* selection by list *********
-A all processes                      -C by command name
-N negate selection                   -G by real group ID (supports names)
-a all w/ tty except session leaders  -U by real user ID (supports names)
-d all except session leaders         -g by session OR by effective group name
-e all processes                      -p by process ID
                                      -q by process ID (unsorted & quick)
T  all processes on this terminal     -s processes in the sessions given
a  all w/ tty, including other users  -t by tty
g  OBSOLETE -- DO NOT USE             -u by effective user ID (supports names)
r  only running processes             U  processes for specified users
x  processes w/o controlling ttys     t  by tty
*********** output format **********  *********** long options ***********
-o,o user-defined  -f full            --Group --User --pid --cols --ppid
-j,j job control   s  signal          --group --user --sid --rows --info
-O,O preloaded -o  v  virtual memory  --cumulative --format --deselect
-l,l long          u  user-oriented   --sort --tty --forest --version
-F   extra full    X  registers       --heading --no-heading --context
                                      --quick-pid
                    ********* misc options *********
-V,V  show version      L  list format codes  f  ASCII art forest
-m,m,-L,-T,H  threads   S  children in sum    -y change -l format
-M,Z  security data     c  true command name  -c scheduling class
-w,w  wide output       n  numeric WCHAN,UID  -H process hierarchy
-sh-4.1$
-sh-4.1$
-sh-4.1$ ps -ef | grep jboss
p585600   2845  2734  0 12:18 pts/3    00:00:00 grep jboss
jboss    13519 53733  0 Jul12 ?        00:00:36 java -D[Process Controller] -server -Xms1g -Xmx1g -XX:MaxPermSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -Dorg.jboss.boot.log.file=/logs/jboss-eap/hc/process-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.process-controller -jboss-home /opt/jboss/jboss-eap -jvm java -mp /opt/jboss/jboss-eap/modules -- -Dorg.jboss.boot.log.file=/logs/jboss-eap/hc/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -server -Xms1g -Xmx1g -XX:MaxPermSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -- -default-jvm java -b 10.116.88.30 -bmanagement 10.116.88.30 -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.30 --host-config=host-slave.xml -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dhttps.protocols=TLSv1.2,TLSv1.3 -c domain.xml
jboss    13536 13519  0 Jul12 ?        00:01:13 java -D[Host Controller] -Dorg.jboss.boot.log.file=/logs/jboss-eap/hc/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -server -Xms1g -Xmx1g -XX:MaxPermSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.host-controller -mp /opt/jboss/jboss-eap/modules --pc-address 127.0.0.1 --pc-port 42873 -default-jvm java -b 10.116.88.30 -bmanagement 10.116.88.30 -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.30 --host-config=host-slave.xml -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dhttps.protocols=TLSv1.2,TLSv1.3 -c domain.xml -Djboss.home.dir=/opt/jboss/jboss-eap
jboss    13585 13519  0 Jul12 ?        00:01:33 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:siouv_node1_lx0002] -XX:PermSize=512m -XX:MaxPermSize=512m -Xms2048m -Xmx2048m -Djava.awt.headless=true -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttps.protocols=TLSv1.2 -Dhttp.proxySet=true -Dhttp.nonProxyHosts=*.caixa|*.intra.caixa.gov.br|*.extracaixa|*.siapenet.gov.br|*.caixa.gov.br -Djavax.net.ssl.trustStore=/upload/des/siouv/certificados.jks -DSIOUV.SEC.SSO.URL=https://login.des.caixa/auth -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.30 -Djavax.net.ssl.trustStorePassword=jbosseap -DSIOUV.URL.SERVICO.INSS=https://hbancos-api.dataprev.gov.br/ouvidoria/v3.1.0 -Djava.net.preferIPv4Stack=true -Dhttps.proxyPort=80 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -DDATAPREV_ECONSIGNADO_PASSWORD=Skyline00@ -DSIOUV.CAIXA.CNPJ.BACEN=00.360.305/0001-04 -DSIOUV.INT.API.KEY=l7d33bd2074eda45aa8d53329fa3676395 -DSIOUV.LIGAR.SERVICO.BACEN=true -DSIOUV.SEC.SSO.REALM=intranet -DSIOUV.LIGAR.SERVICO.INSS=true -DSIOUV.USUARIO.SERVICO.BACEN=211047910.S-CEF06954 -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.bind.address=10.116.88.30 -DSIOUV.URL.SERVICO.RDR.BACEN=https://www9.bcb.gov.br/hml/rdrws/ -Dhttps.proxyHost=proxydes.caixa -DDATAPREV_CERTIFICADO_CAIXA_PATH=/upload/des/siouv/dataprev.des.p12 -Doracle.jdbc.J2EE13Compliant=true -DSIOUV.SEC.SSO.CLIENT-ID=cli-ser-ouv -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Djava.awt.headless=true -DSIOUV.SEC.SSO.CLIENT-SECRET=6be019c7-d1b2-4f6d-b681-44b25780e916 -Djboss.bind.address.management=10.116.88.30 -DSIOUV.INT.API.MANAGER.URL=https://api.des.caixa:8443 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/siouv_node1_lx0002 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/siouv_node1_lx0002 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/siouv_node1_lx0002 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/siouv_node1_lx0002/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
root     53731     1  0 May06 ?        00:00:00 su - jboss -c JBOSS_PIDFILE=/opt/jboss/jboss-eap/hc/tmp/jboss_hc.pid LAUNCH_JBOSS_IN_BACKGROUND=1 /opt/jboss/jboss-eap/bin/domain.sh                -b 10.116.88.30                -bmanagement 10.116.88.30                -Djboss.domain.master.address=10.116.88.20                -Djboss.bind.address.unsecure=10.116.88.30                --host-config=host-slave.xml                -Djboss.domain.log.dir=/logs/jboss-eap/hc/                 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc                -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize                -Dhttps.protocols=TLSv1.2,TLSv1.3                -c domain.xml
jboss    53733 53731  0 May06 ?        00:00:00 /bin/sh /opt/jboss/jboss-eap/bin/domain.sh -b 10.116.88.30 -bmanagement 10.116.88.30 -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.30 --host-config=host-slave.xml -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dhttps.protocols=TLSv1.2,TLSv1.3 -c domain.xml
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ ls -la /opt/jboss*/standalone/configuration/satandalon.xml 2>/dev/null
-sh-4.1$ ls -la /opt/jboss*/standalone/configuration/standalone.xml 2>/dev/null
-sh-4.1$
-sh-4.1$
-sh-4.1$ grep -i "datasource" -A 20 /opt/jboss*/standalone/configuration/standalone.xml | grep -i "connection-url\|jndi-name"
grep: /opt/jboss*/standalone/configuration/standalone.xml: No such file or directory
-sh-4.1$
-sh-4.1$
-sh-4.1$
