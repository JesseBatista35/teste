-bash-5.0$ netstat -aun -P tcp | grep 8008
      *.18008              *.*            root       2174 p_ctmag             0      0  256000      0 LISTEN
      *.8008               *.*            s000002    2637 webservd            0      0  256000      0 LISTEN
-bash-5.0$
-bash-5.0$
-bash-5.0$ cd /opt/SUNWweb/https-as8-dsv02/logs
-bash-5.0$ ls -ltr
total 930
-rw-r--r--   1 s000002  iplanet    52968 Aug  2  2019 access.201908030000.sspdeaprux0200.as8-dsv02
-rw-r--r--   1 s000002  iplanet     3012 Aug  3  2019 errors.201908030000.sspdeaprux0200.as8-dsv02
-rw-r--r--   1 s000002  iplanet    15218 Aug  3  2019 access.201908040000.sspdeaprux0200.as8-dsv02
-rw-r--r--   1 s000002  iplanet      256 Aug  4  2019 errors.201908040000.sspdeaprux0200.as8-dsv02
-rw-r--r--   1 s000002  iplanet      154 Aug  4  2019 access.201908050000.sspdeaprux0200.as8-dsv02
-rw-r--r--   1 s000002  iplanet      256 Aug  5  2019 errors.201908050000.sspdeaprux0200.as8-dsv02
-rw-r--r--   1 s000002  iplanet   172725 Aug  5  2019 access.201908060000.sspdeaprux0200.as8-dsv02
-rw-r--r--   1 s000002  iplanet     8459 Aug  6  2019 errors.201908060000.sspdeaprux0200.as8-dsv02
-rw-r--r--   1 s000002  iplanet    37498 Oct 29 11:49 errors
-rw-r--r--   1 s000002  iplanet    86531 Oct 29 12:07 access
-bash-5.0$
-bash-5.0$
-bash-5.0$
-bash-5.0$
-bash-5.0$
-bash-5.0$ netstat -aun -P tcp | grep 8008
      *.18008              *.*            root       2174 p_ctmag             0      0  256000      0 LISTEN
      *.8008               *.*            s000002    2637 webservd            0      0  256000      0 LISTEN
-bash-5.0$
-bash-5.0$
-bash-5.0$ ps -ef | egrep -i "webserver|https-|httpd|java|appserv|weblogic" | grep -v grep
    root   993     1   0   Aug 13 ?           4:33 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
 s000002  2745  2744   0   Aug 13 ?          88:57 webservd -d /opt/SUNWweb/https-as8-dsv11/config -r /opt/SUNWweb -t /tmp/https-as8-dsv11-f25bf2e4 -u s000002
 s000002  2744  2743   0   Aug 13 ?         108:32 webservd -d /opt/SUNWweb/https-as8-dsv11/config -r /opt/SUNWweb -t /tmp/https-as8-dsv11-f25bf2e4 -u s000002
 s000002  2672  2671   0   Aug 13 ?         108:56 webservd -d /opt/SUNWweb/https-as8-dsv09/config -r /opt/SUNWweb -t /tmp/https-as8-dsv09-f25bf2e4 -u s000002
 s000002  2707     1   0   Aug 13 ?           0:17 webservd-wdog -d /opt/SUNWweb/https-as8-dsv10/config -r /opt/SUNWweb -t /tmp/https-as8-dsv10-f25bf2e4 -u s000002
 s000002  2516  2515   0   Aug 13 ?         109:00 webservd -d /opt/SUNWweb/https-as8-dsv05/config -r /opt/SUNWweb -t /tmp/https-as8-dsv05-f25bf2e4 -u s000002
 s000002  2554  2553   0   Aug 13 ?         102:11 webservd -d /opt/SUNWweb/https-as8-dsv06/config -r /opt/SUNWweb -t /tmp/https-as8-dsv06-f25bf2e4 -u s000002
 s000002  2405  2404   0   Aug 13 ?         102:53 webservd -d /opt/SUNWweb/https-as8-dsv02/config -r /opt/SUNWweb -t /tmp/https-as8-dsv02-f25bf2e4 -u s000002
 s000002  2709  2708   0   Aug 13 ?          99:58 webservd -d /opt/SUNWweb/https-as8-dsv10/config -r /opt/SUNWweb -t /tmp/https-as8-dsv10-f25bf2e4 -u s000002
    root  2068     1   0   Aug 13 ?         284:47 /opt/ctmagent/bmcjava/bmcjava-V2/bin/java -Xmx256m -XX:+CrashOnOutOfMemoryError -Djava.io.tmpdir=/tmp -Djava.net.preferIPv4Stack=true -Doverride.default.services= -Dspring.profiles.active=tcp -DCTMAG.CONFIG.DBGLVL=0 -Dctm.logs.dir=/opt/ctmagent/ctm/proclog -Dlogging.config=/opt/ctmagent/ctm/data/logback.xml -Dctm.data.dir=/opt/ctmagent/ctm/data -Dstdout=/opt/ctmagent/ctm/proclog/agjstd_1551-2026-08-13.0.tmp -jar /opt/ctmagent/ctm/exe/ag-app.jar
 s000002  2637  2636   0   Aug 13 ?         104:31 webservd -d /opt/SUNWweb/https-as8-dsv08/config -r /opt/SUNWweb -t /tmp/https-as8-dsv08-f25bf2e4 -u s000002
 s000002  2600  2599   0   Aug 13 ?         109:09 webservd -d /opt/SUNWweb/https-as8-dsv07/config -r /opt/SUNWweb -t /tmp/https-as8-dsv07-f25bf2e4 -u s000002
 s000002  2477     1   0   Aug 13 ?           0:17 webservd-wdog -d /opt/SUNWweb/https-as8-dsv04/config -r /opt/SUNWweb -t /tmp/https-as8-dsv04-f25bf2e4 -u s000002
 s000002  2478  2477   0   Aug 13 ?         109:04 webservd -d /opt/SUNWweb/https-as8-dsv04/config -r /opt/SUNWweb -t /tmp/https-as8-dsv04-f25bf2e4 -u s000002
 s000002  2601  2600   0   Aug 13 ?          90:30 webservd -d /opt/SUNWweb/https-as8-dsv07/config -r /opt/SUNWweb -t /tmp/https-as8-dsv07-f25bf2e4 -u s000002
 s000002  2515     1   0   Aug 13 ?           0:17 webservd-wdog -d /opt/SUNWweb/https-as8-dsv05/config -r /opt/SUNWweb -t /tmp/https-as8-dsv05-f25bf2e4 -u s000002
 s000002  2635     1   0   Aug 13 ?           0:17 webservd-wdog -d /opt/SUNWweb/https-as8-dsv08/config -r /opt/SUNWweb -t /tmp/https-as8-dsv08-f25bf2e4 -u s000002
 s000002  2440     1   0   Aug 13 ?           0:17 webservd-wdog -d /opt/SUNWweb/https-as8-dsv03/config -r /opt/SUNWweb -t /tmp/https-as8-dsv03-f25bf2e4 -u s000002
 s000002  2599     1   0   Aug 13 ?           0:17 webservd-wdog -d /opt/SUNWweb/https-as8-dsv07/config -r /opt/SUNWweb -t /tmp/https-as8-dsv07-f25bf2e4 -u s000002
 s000002  2636  2635   0   Aug 13 ?         108:10 webservd -d /opt/SUNWweb/https-as8-dsv08/config -r /opt/SUNWweb -t /tmp/https-as8-dsv08-f25bf2e4 -u s000002
 s000002  2441  2440   0   Aug 13 ?         101:45 webservd -d /opt/SUNWweb/https-as8-dsv03/config -r /opt/SUNWweb -t /tmp/https-as8-dsv03-f25bf2e4 -u s000002
 s000002  2304  2303   0   Aug 13 ?         107:25 webservd -d /opt/SUNWweb/https-as8-dsv01/config -r /opt/SUNWweb -t /tmp/https-as8-dsv01-f25bf2e4 -u s000002
 s000002  2406  2405   0   Aug 13 ?         104:27 webservd -d /opt/SUNWweb/https-as8-dsv02/config -r /opt/SUNWweb -t /tmp/https-as8-dsv02-f25bf2e4 -u s000002
 s000002  2303  2302   0   Aug 13 ?         102:40 webservd -d /opt/SUNWweb/https-as8-dsv01/config -r /opt/SUNWweb -t /tmp/https-as8-dsv01-f25bf2e4 -u s000002
 s000002  2302     1   0   Aug 13 ?           0:17 webservd-wdog -d /opt/SUNWweb/https-as8-dsv01/config -r /opt/SUNWweb -t /tmp/https-as8-dsv01-f25bf2e4 -u s000002
 s000002  2553     1   0   Aug 13 ?           0:16 webservd-wdog -d /opt/SUNWweb/https-as8-dsv06/config -r /opt/SUNWweb -t /tmp/https-as8-dsv06-f25bf2e4 -u s000002
 s000002  2404     1   0   Aug 13 ?           0:17 webservd-wdog -d /opt/SUNWweb/https-as8-dsv02/config -r /opt/SUNWweb -t /tmp/https-as8-dsv02-f25bf2e4 -u s000002
 s000002  2442  2441   0   Aug 13 ?         101:53 webservd -d /opt/SUNWweb/https-as8-dsv03/config -r /opt/SUNWweb -t /tmp/https-as8-dsv03-f25bf2e4 -u s000002
 s000002  2479  2478   0   Aug 13 ?         100:59 webservd -d /opt/SUNWweb/https-as8-dsv04/config -r /opt/SUNWweb -t /tmp/https-as8-dsv04-f25bf2e4 -u s000002
 s000002  2518  2516   0   Aug 13 ?         149:01 webservd -d /opt/SUNWweb/https-as8-dsv05/config -r /opt/SUNWweb -t /tmp/https-as8-dsv05-f25bf2e4 -u s000002
 s000002  2555  2554   0   Aug 13 ?         101:48 webservd -d /opt/SUNWweb/https-as8-dsv06/config -r /opt/SUNWweb -t /tmp/https-as8-dsv06-f25bf2e4 -u s000002
 s000002  2671     1   0   Aug 13 ?           0:17 webservd-wdog -d /opt/SUNWweb/https-as8-dsv09/config -r /opt/SUNWweb -t /tmp/https-as8-dsv09-f25bf2e4 -u s000002
 s000002  2708  2707   0   Aug 13 ?         101:33 webservd -d /opt/SUNWweb/https-as8-dsv10/config -r /opt/SUNWweb -t /tmp/https-as8-dsv10-f25bf2e4 -u s000002
 s000002  2807  2806   0   Aug 13 ?         101:35 webservd -d /opt/SUNWweb/https-consolesp.coresp.caixa/config -r /opt/SUNWweb -t /tmp/https-consolesp.coresp.caixa-b925ae53 -u s000002
webservd  1042   993   0   Aug 13 ?           0:41 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
webservd  1043   993   0   Aug 13 ?           0:31 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
webservd  1044   993   0   Aug 13 ?           0:26 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
webservd   798   993   0   Oct 14 ?           0:07 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
webservd  1046   993   0   Aug 13 ?           0:30 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
webservd  1047   993   0   Aug 13 ?           0:27 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
webservd  1048   993   0   Aug 13 ?           0:23 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
webservd  1049   993   0   Aug 13 ?           0:30 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
webservd  1050   993   0   Aug 13 ?           0:30 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
webservd  1051   993   0   Aug 13 ?           0:32 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
webservd  1052   993   0   Aug 13 ?           0:26 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
webservd  1054   993   0   Aug 13 ?           0:26 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
webservd  1055   993   0   Aug 13 ?           0:27 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
webservd  1056   993   0   Aug 13 ?           0:26 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
webservd  1057   993   0   Aug 13 ?           0:29 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
webservd  1058   993   0   Aug 13 ?           0:26 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
webservd  1059   993   0   Aug 13 ?           0:32 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
webservd  1060   993   0   Aug 13 ?           0:30 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
 s000002  2842     1   0   Aug 13 ?           0:17 webservd-wdog -d /opt/SUNWweb/https-sspdeaprux0200/config -r /opt/SUNWweb -t /tmp/https-sspdeaprux0200-f25bf2e4 -u s000002
 s000002  2673  2672   0   Aug 13 ?          99:46 webservd -d /opt/SUNWweb/https-as8-dsv09/config -r /opt/SUNWweb -t /tmp/https-as8-dsv09-f25bf2e4 -u s000002
 s000002  2806     1   0   Aug 13 ?           0:17 webservd-wdog -d /opt/SUNWweb/https-consolesp.coresp.caixa/config -r /opt/SUNWweb -t /tmp/https-consolesp.coresp.caixa-b925ae53 -u s000002
 s000002  2743     1   0   Aug 13 ?           0:16 webservd-wdog -d /opt/SUNWweb/https-as8-dsv11/config -r /opt/SUNWweb -t /tmp/https-as8-dsv11-f25bf2e4 -u s000002
 s000002  2808  2807   0   Aug 13 ?          88:17 webservd -d /opt/SUNWweb/https-consolesp.coresp.caixa/config -r /opt/SUNWweb -t /tmp/https-consolesp.coresp.caixa-b925ae53 -u s000002
 s000002  2843  2842   0   Aug 13 ?         102:20 webservd -d /opt/SUNWweb/https-sspdeaprux0200/config -r /opt/SUNWweb -t /tmp/https-sspdeaprux0200-f25bf2e4 -u s000002
 s000002  2844  2843   0   Aug 13 ?         188:09 webservd -d /opt/SUNWweb/https-sspdeaprux0200/config -r /opt/SUNWweb -t /tmp/https-sspdeaprux0200-f25bf2e4 -u s000002
webservd 18058   993   0   Oct 14 ?           0:19 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
webservd 18057   993   0   Oct 14 ?           0:17 /opt/webstack/apache2/2.2/bin/httpd -D 32bit -f /opt/apache/2.2/etc/httpd.conf -k start
-bash-5.0$
-bash-5.0$
-bash-5.0$
