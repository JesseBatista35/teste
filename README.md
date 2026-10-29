ot@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv02/logs# /usr/gnu/bin/grep -n -i -B2 -A2 "cobranca" /opt/SUNWweb/https-as8-dsv08/config/server.xml
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv02/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv02/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv02/logs# /usr/gnu/bin/grep -rn -i -E "10\.116\.89\.101|9008|timeout" <path_do_webapp>/WEB-INF | head -30
bash: path_do_webapp: No such file or directory
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv02/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv02/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv02/logs# getent hosts 10.116.89.101
10.116.89.101   sspdeaplux0100 sspdeaplux0100.coresp.caixa
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv02/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv02/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv02/logs# for i in 1 2 3 4 5 6 7 8 9 10; do
>   curl -sk -o /dev/null -w "%{http_code} conn=%{time_connect}s total=%{time_total}s\n" --max-time 60 http://10.116.89.101:9008/
> done
302 conn=0.000912s total=0.001838s
302 conn=0.000871s total=0.001608s
302 conn=0.000685s total=0.001327s
302 conn=0.000754s total=0.001412s
302 conn=0.000867s total=0.001620s
302 conn=0.000779s total=0.001468s
302 conn=0.000708s total=0.001349s
302 conn=0.000745s total=0.001409s
302 conn=0.000764s total=0.001467s
302 conn=0.000810s total=0.001470s
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv02/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv02/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv02/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv02/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv02/logs# exit
exit
-bash-5.0$ exit
logout
Connection to 10.116.83.101 closed.
[p585600@cadsvitrlx100 ~]$ ssh 10.116.89.101
#########################################################################
#          Ambiente administrado e monitorado por Brasilia
#########################################################################
#
# Site: CTC
# Hostname: sspdeaplux0100.caixa
# SO Release: Solaris 11.4.53.132.2
# Serial Number: AK00289677
# Memoria Total: 32.00 GB
# VCPUs: 16 Modelo: SPARC M6-32
# Control domain: cadcogerux031
# Ambiente:
# Descricao: SIGOV Aplicacao SJSAS8
(p585600@10.116.89.101) Password: #######################################
Last login: Tue Oct 27 16:17:32 2026 from 10.122.150.31
Could not chdir to home directory /caixa/usr/p585600: No such file or directory
-bash-5.1$
-bash-5.1$
-bash-5.1$
-bash-5.1$
-bash-5.1$ netstat -aun -P tcp | grep "\.9008 " | grep LISTEN
      *.9008               *.*            sjsas8    28337 appserv             0      0  256000      0 LISTEN
-bash-5.1$
-bash-5.1$
-bash-5.1$
-bash-5.1$ ps -ef | grep 28337
  sjsas8 28337 28257   0 23:54:17 ?           4:43 /opt/SUNWas8/lib/appserv dsv08
 p585600 23343 23123   0 12:30:10 pts/4       0:00 grep 28337
-bash-5.1$
-bash-5.1$
-bash-5.1$ egrep -n "11:5[0-6]" <logs>/errors <logs>/server.log 2>/dev/null | head -50
-bash: logs: No such file or directory
-bash-5.1$
-bash-5.1$
-bash-5.1$ /usr/gnu/bin/grep -rn "1793283639786" <logs>/ 2>/dev/null
-bash: logs: No such file or directory
-bash-5.1$
