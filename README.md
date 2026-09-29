
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# sed -i 's#vers=<X>#vers=4.0#' /etc/fstab
[root@cbrdeapllx010 p585600]# grep SIGOT /etc/fstab
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIGOT /SIGOT nfs defaults,_netdev,vers=4.0 0 0
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# mount /SIGOT && df -hT /SIGOT
Sist. Arq.                                                     Tipo  Tam. Usado Disp. Uso% Montado em
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIGOT nfs4   10G  907M  9,2G   9% /SIGOT
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# ps -eo user,cmd | grep -Ei 'java|jboss|siafr' | grep -v grep
jboss    send-mail -i -- testeteste@mail.caixa
jboss    send-mail -i -- testeteste@mail.caixa
jboss    send-mail -i -- testeteste@mail.caixa
jboss    send-mail -i -- testeteste@mail.caixa
jboss    send-mail -i -- testeteste@mail.caixa
jboss    send-mail -i -- testeteste@mail.caixa
jboss    /usr/sbin/postdrop -r
jboss    /usr/sbin/postdrop -r
jboss    /usr/sbin/postdrop -r
jboss    /usr/sbin/postdrop -r
jboss    /usr/sbin/postdrop -r
jboss    /usr/sbin/postdrop -r
root     /opt/ctmage/bmcjava/bmcjava-V3/bin/java -Xmx256m -XX:+CrashOnOutOfMemoryError -Djava.io.tmpdir=/tmp -Djava.net.preferIPv4Stack=true -Doverride.default.services= -Dspring.profiles.active=tcp -DCTMAG.CONFIG.DBGLVL=0 -Dctm.logs.dir=/opt/ctmage/ctm/proclog -Dlogging.config=/opt/ctmage/ctm/data/logback.xml -Dctm.data.dir=/opt/ctmage/ctm/data -Dstdout=/opt/ctmage/ctm/proclog/agjstd_16130-2026-09-18.0.tmp -jar /opt/ctmage/ctm/exe/ag-app.jar
jboss    send-mail -i -- testeteste@mail.caixa
jboss    send-mail -i -- testeteste@mail.caixa
jboss    /usr/sbin/postdrop -r
jboss    /usr/sbin/postdrop -r
jboss    send-mail -i -- testeteste@mail.caixa
jboss    /usr/sbin/postdrop -r
root     /opt/ctmage/bmcjava/bmcjava-V3/bin/java -DappName=APWebServer -Dfile.encoding=UTF-8 -XX:MaxNewSize=32m -Xms128m -Xmx2048m -Djava.util.logging.config.file=/opt/ctmage/ctm/cm/AP/apweb-920200/conf/logging.properties -Dcm.home=/opt/ctmage/ctm/cm/AP -Dcatalina.base=/opt/ctmage/ctm/cm/AP/apweb-920200 -Dcatalina.home=/opt/ctmage/ctm/cm/AP/apweb-920200 -Djava.io.tmpdir=/opt/ctmage/ctm/cm/AP/apweb-920200/temp -classpath /opt/ctmage/ctm/cm/AP/apweb-920200/bin/tomcat-juli.jar:/opt/ctmage/ctm/cm/AP/apweb-920200/bin/bootstrap.jar -Dagent.logs=/opt/ctmage/ctm/proclog -Djavax.net.ssl.trustStore=/opt/ctmage/ctm/cm/AP/data/security/apcerts -Djavax.net.ssl.keyStore=/opt/ctmage/ctm/cm/AP/data/security/apks -Djsse.enableCBCProtection=false -Djava.util.logging.manager=org.apache.juli.ClassLoaderLogManager org.apache.catalina.startup.Bootstrap start
jboss    send-mail -i -- testeteste@mail.caixa
jboss    send-mail -i -- testeteste@mail.caixa
jboss    /usr/sbin/postdrop -r
jboss    /usr/sbin/postdrop -r
jboss    send-mail -i -- testeteste@mail.caixa
jboss    /usr/sbin/postdrop -r
jboss    send-mail -i -- testeteste@mail.caixa
jboss    /usr/sbin/postdrop -r
f599802  java -Darquivo_config=sidis-batch.properties -Djavax.net.ssl.trustStore=/desenvolvimento/rotina/SIDIS/bin/cacerts -Dservico=8 -jar ./bin/sidis-batch-1.0.0.92.jar
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# su - USUARIO -c 'touch /SIGOT/.teste_wo && rm -f /SIGOT/.teste_wo && echo app_ok'
su: user USUARIO does not exist
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
