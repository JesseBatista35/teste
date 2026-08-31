<img width="688" height="679" alt="image" src="https://github.com/user-attachments/assets/33c7c42a-505a-4b76-912b-25ce8e19a14c" />


ai ele pede para escolher o arquivo


condicoes deste aviso
***********************************************************************
p585600@10.116.88.20's password:
Last login: Fri Aug 14 15:14:52 2026 from 10.122.150.31
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ ps -ef | grep sictd
p585600  12937 12910  0 14:37 pts/2    00:00:00 grep sictd
-sh-4.1$ ps -ef | grep jboss
p585600  12939 12910  0 14:37 pts/2    00:00:00 grep jboss
root     24367     1  0 Aug28 ?        00:00:00 su - jboss -c JBOSS_PIDFILE=/opt/jboss/jboss-eap/dc/tmp/jboss_dc.pid LAUNCH_JBOSS_IN_BACKGROUND=1 /opt/jboss/jboss-eap/bin/domain.sh                -b 10.116.88.20                -bmanagement 10.116.88.20                -Djboss.bind.address.unsecure=10.116.88.20                --host-config=host-master.xml                -Djboss.domain.log.dir=/logs/jboss-eap/dc/                 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/dc??-Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize??-Dhttps.protocols=TLSv1.2,TLSv1.3                -c domain.xml
jboss    24369 24367  0 Aug28 ?        00:00:00 /bin/sh /opt/jboss/jboss-eap/bin/domain.sh -b 10.116.88.20 -bmanagement 10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.20 --host-config=host-master.xml -Djboss.domain.log.dir=/logs/jboss-eap/dc/ -Djboss.domain.base.dir=/opt/jboss/jboss-eap/dc -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dhttps.protocols=TLSv1.2,TLSv1.3 -c domain.xml
jboss    24709 24369  0 Aug28 ?        00:02:27 java -D[Process Controller] -server -Xms5120m -Xmx5120m -XX:MaxPermSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -Djackson.deserialization.whitelist.packages=br.gov.caixa -Duser.timezone=GMT-3 -Dorg.jboss.boot.log.file=/logs/jboss-eap/dc/process-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/dc/configuration/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.process-controller -jboss-home /opt/jboss/jboss-eap -jvm java -mp /opt/jboss/jboss-eap/modules -- -Dorg.jboss.boot.log.file=/logs/jboss-eap/dc/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/dc/configuration/logging.properties -server -Xms5120m -Xmx5120m -XX:MaxPermSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -Djackson.deserialization.whitelist.packages=br.gov.caixa -Duser.timezone=GMT-3 -- -default-jvm java -b 10.116.88.20 -bmanagement 10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.20 --host-config=host-master.xml -Djboss.domain.log.dir=/logs/jboss-eap/dc/ -Djboss.domain.base.dir=/opt/jboss/jboss-eap/dc -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dhttps.protocols=TLSv1.2,TLSv1.3 -c domain.xml
jboss    24726 24709  0 Aug28 ?        00:07:49 java -D[Host Controller] -Dorg.jboss.boot.log.file=/logs/jboss-eap/dc/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/dc/configuration/logging.properties -server -Xms5120m -Xmx5120m -XX:MaxPermSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -Djackson.deserialization.whitelist.packages=br.gov.caixa -Duser.timezone=GMT-3 -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.host-controller -mp /opt/jboss/jboss-eap/modules --pc-address 127.0.0.1 --pc-port 38298 -default-jvm java -b 10.116.88.20 -bmanagement 10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.20 --host-config=host-master.xml -Djboss.domain.log.dir=/logs/jboss-eap/dc/ -Djboss.domain.base.dir=/opt/jboss/jboss-eap/dc -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dhttps.protocols=TLSv1.2,TLSv1.3 -c domain.xml -Djboss.home.dir=/opt/jboss/jboss-eap
-sh-4.1$
