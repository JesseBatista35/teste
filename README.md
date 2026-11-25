
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]# find / -name "ceflib.xml" 2>/dev/null
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]# find / -iname "ceflib*" 2>/dev/null
/opt/jboss/jboss-5.1.0.GA/server/sigsj_boleto/libapp/ceflib2.0.5.jar
/opt/jboss/jboss-5.1.0.GA/server/backup/sigsj_boleto/libapp/ceflib2.0.5.jar
/opt/jboss/jboss-5.1.0.GA/server/backup/sigsj_intranet/libapp/ceflib2.0.5.jar
/opt/jboss/jboss-5.1.0.GA/server/backup/sigsj_internet/libapp/ceflib2.0.5.jar
/opt/jboss/jboss-5.1.0.GA/server/backup/sigsj_inter01_bkp.20180430/libapp/ceflib2.0.5.jar
/opt/jboss/jboss-5.1.0.GA/server/backup/sigsj_inter02_bkp.20180428/libapp/ceflib2.0.5.jar
/opt/jboss/jboss-5.1.0.GA/server/sigsj_intranet/libapp/ceflib2.0.5.jar
/opt/jboss/jboss-5.1.0.GA/server/sigsj_intranet.20230901/libapp/ceflib2.0.5.jar
/opt/jboss/jboss-5.1.0.GA/server/sigsj_internet/libapp/ceflib2.0.5.jar
/tmp/sirotjar/ceflib2.0.5.jar
/connector/lib/ceflib2.0.5.jar
[root@sspdeapllx0039 p585600]# ls -la /log_ias/ 2>/dev/null
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]# ls -la /log_ias/config-log4j/ 2>/dev/null
[root@sspdeapllx0039 p585600]# find /log_ias -type f 2>/dev/null
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]# grep -rl "config-log4j/ceflib" /apl /opt /prod 2>/dev/null
^C
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]# find / -name "ceflib*.jar" 2>/dev/null
/opt/jboss/jboss-5.1.0.GA/server/sigsj_boleto/libapp/ceflib2.0.5.jar
/opt/jboss/jboss-5.1.0.GA/server/backup/sigsj_boleto/libapp/ceflib2.0.5.jar
/opt/jboss/jboss-5.1.0.GA/server/backup/sigsj_intranet/libapp/ceflib2.0.5.jar
/opt/jboss/jboss-5.1.0.GA/server/backup/sigsj_internet/libapp/ceflib2.0.5.jar
/opt/jboss/jboss-5.1.0.GA/server/backup/sigsj_inter01_bkp.20180430/libapp/ceflib2.0.5.jar
/opt/jboss/jboss-5.1.0.GA/server/backup/sigsj_inter02_bkp.20180428/libapp/ceflib2.0.5.jar
/opt/jboss/jboss-5.1.0.GA/server/sigsj_intranet/libapp/ceflib2.0.5.jar
/opt/jboss/jboss-5.1.0.GA/server/sigsj_intranet.20230901/libapp/ceflib2.0.5.jar
/opt/jboss/jboss-5.1.0.GA/server/sigsj_internet/libapp/ceflib2.0.5.jar
/tmp/sirotjar/ceflib2.0.5.jar

