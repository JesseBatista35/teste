
***********************************************************************
p585600@10.116.82.156's password:
Last login: Thu Oct 22 10:40:24 2026 from 10.122.150.31
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$ hostname -i
10.116.82.156
[p585600@sspdeaprlx0045 ~]$ hostname -f
sspdeaprlx0045
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$ find / -name "*SenhasSIIBC*" 2>/dev/null
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$ ps -ef | grep jboss
p585600   64167  63804  0 10:52 pts/1    00:00:00 grep jboss
jboss4   126561      1  0 Nov18 ?        00:00:00 /bin/sh /opt/jboss/jboss-4.2.3.GA/jboss.sh simoc-intra start
jboss4   126562 126561  0 Nov18 ?        00:00:00 /bin/sh /opt/jboss/jboss-4.2.3.GA/bin/run.sh -c simoc-intra -b 10.116.82.157
jboss4   126589 126562  0 Nov18 ?        00:05:31 /opt/jboss/jdk/bin/java -Dprogram.name=run.sh -server -XX:MaxPermSize=256m -Xms1024m -Xmx1024m -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dfile.encoding=ISO8859_1 -Djboss.cef.mwbr=8083 -Djboss.cef.jnp=1099 -Djboss.cef.rmi=1098 -Djboss.cef.jrmp=4444 -Djboss.cef.pool=4445 -Duser.language=PT -Duser.country=BR -Djdk.tls.client.protocols=TLSv1,TLSv1.1,TLSv1.2 -Djava.net.preferIPv4Stack=true -Djava.endorsed.dirs=/opt/jboss/jboss-4.2.3.GA/lib/endorsed -classpath /opt/jboss/jboss-4.2.3.GA/bin/run.jar:/opt/jboss/jdk/lib/tools.jar org.jboss.Main -c simoc-intra -b 10.116.82.157
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$ ps -ef | grep -v grep | grep -o "java.library.path=[^ ]*"
java.library.path=/opt/CA/SystemEDGE/plugins/svcrsp
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$




[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$ ssh 10.116.202.45
p585600@10.116.202.45's password:
Last login: Thu Nov 12 16:37:54 2026 from 10.122.150.31
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$ find / -name "*SenhasSIIBC*" 2>/dev/null
/tmp/crypto/br/gov/caixa/util/SenhasSIIBC.class
/tmp/crypto/br/gov/caixa/util/SenhasSIIBC.java
/tmp/SenhasSIIBC.class
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$ ps -ef | grep -v grep | grep -o "java.library.path=[^ ]*"
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$

