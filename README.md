
root@sspdeaplux0100:/#
root@sspdeaplux0100:/#
root@sspdeaplux0100:/# LOG=/opt/SUNWas8/nodeagents/naux0100/dsv08/logs/server.log
root@sspdeaplux0100:/#
root@sspdeaplux0100:/#
root@sspdeaplux0100:/# /usr/gnu/bin/grep -n -E "2026-10-29T11:(5[0-6])" $LOG | head -40
root@sspdeaplux0100:/#
root@sspdeaplux0100:/#
root@sspdeaplux0100:/# /usr/gnu/bin/grep -n -i -E "1793283639786|SocketTimeout|Read timed out" $LOG | tail -20
root@sspdeaplux0100:/#
root@sspdeaplux0100:/#
root@sspdeaplux0100:/# sed -n 'N,N+40p' $LOG
sed: command garbled: N,N+40p
root@sspdeaplux0100:/#
root@sspdeaplux0100:/#
root@sspdeaplux0100:/# ls -ltr /log_ias/ | tail -30
drwxr-xr-x   2 sirot    sirot         13 out  9 01:30 connector
drwxr-xr-x   2 sjsas8   sunjava        3 out 29 01:30 avcaixa
drwxr-xr-x   2 sjsas8   sunjava        3 out 29 01:30 cobranca
drwxr-xr-x   2 sjsas8   sunjava        3 out 29 01:30 ecobranca
drwxr-xr-x   2 sjsas8   sunjava        5 out 29 01:30 portalcb
drwxr-xr-x   2 sjsas8   sunjava        6 out 29 01:30 portaldagestao
drwxr-xr-x   2 sjsas8   sunjava        4 out 29 01:30 portalSidem
drwxr-xr-x   2 sjsas8   sunjava       11 out 29 01:30 siacc
drwxr-xr-x   2 sjsas8   sunjava       11 out 29 01:30 siart
drwxr-xr-x   2 sjsas8   sunjava        4 out 29 01:30 siccv
drwxr-xr-x   2 sjsas8   sunjava        7 out 29 01:30 siecp_intranet
drwxr-xr-x   2 sjsas8   sunjava       28 out 29 01:30 sigov
drwxr-xr-x   2 sjsas8   sunjava        8 out 29 01:30 siicoweb
drwxr-xr-x   3 sjsas8   sunjava        6 out 29 01:30 simca
drwxr-xr-x   2 sjsas8   sunjava        7 out 29 01:30 sipcv
drwxr-xr-x   2 sjsas8   sunjava        4 out 29 01:30 sipro
drwxr-xr-x   2 sjsas8   sunjava        9 out 29 01:30 sistn
drwxr-xr-x   2 sjsas8   sunjava        4 out 29 01:30 sitcs_internet
drwxr-xr-x   2 sjsas8   sunjava       16 out 29 01:30 sitcs_intranet
drwxr-xr-x   2 sjsas8   sunjava        5 out 29 01:30 sivic
drwxr-xr-x   2 sjsas8   sunjava       30 out 29 07:23 simag
drwxr-xr-x   2 sjsas8   sunjava       20 out 29 08:27 siife
drwxr-xr-x   2 sjsas8   sunjava       13 out 29 10:02 ceflib
drwxrwxrwx   2 sjsas8   sunjava       91 out 29 11:29 sipos
drwxr-xr-x   2 sjsas8   sunjava       50 out 29 11:29 simex
drwxr-xr-x   2 sjsas8   sunjava       17 out 29 11:34 sirot2
drwxr-xr-x   2 sjsas8   sunjava       59 out 29 12:06 sivba
drwxr-xr-x   2 sjsas8   sunjava       15 out 29 12:17 sifix
drwxr-xr-x   2 sjsas8   sunjava       10 out 29 12:17 sidmf
drwxr-xr-x   2 sjsas8   sunjava        7 out 29 12:32 sidmfextrato
root@sspdeaplux0100:/#
root@sspdeaplux0100:/#
root@sspdeaplux0100:/# ls -ltr /log_ias/*cob* /log_ias/*sigcb* 2>/dev/null
/log_ias/cobranca:
total 7
-rw-r--r--   1 sjsas8   sunjava     2705 out 28 23:56 cobranca.log

/log_ias/ecobranca:
total 6
-rw-r--r--   1 sjsas8   sunjava     2345 out 28 23:54 ecobranca_inter.log
root@sspdeaplux0100:/#
root@sspdeaplux0100:/#
root@sspdeaplux0100:/# /usr/gnu/bin/grep -rln "1793283639786" /log_ias/ 2>/dev/null
/log_ias/sirot2/sirot2-dsv08.log
/log_ias/siife/siife_intra.log
/log_ias/ceflib/ceflib-dsv08.log
root@sspdeaplux0100:/# cd /opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca#
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca#
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca#
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca#
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca# /usr/gnu/bin/grep -rn -i -E "timeout|url|host|porta|endpoint|jndi" --include="*.properties" --include="*.xml" . | /usr/gnu/bin/grep -v -i "dtd" | head -40
./cobrancaJar_jar/default.jasperreports.properties:128:net.sf.jasperreports.governor.timeout.enabled=true
./cobrancaJar_jar/ceflib_monitorcics.properties:28:###***applic.monitor.sirot1.1.cics.timeout=800
./cobrancaJar_jar/ceflib_monitorcics.properties:36:###***applic.monitor.sirot1.2.cics.timeout=800
./cobrancaJar_jar/ceflib_monitorcics.properties:44:###***applic.monitor.sirot1.3.cics.timeout=800
./cobrancaJar_jar/ceflib_monitorcics.properties:52:###***applic.monitor.sirot1.4.cics.timeout=800
./cobrancaJar_jar/ceflib_monitorcics.properties:60:###***applic.monitor.sirot1.5.cics.timeout=800
./cobrancaJar_jar/ceflib_monitorcics.properties:66:###***applic.monitor.sirot2.1.cics.ip=localhost
./cobrancaJar_jar/ceflib_monitorcics.properties:69:###***applic.monitor.sirot2.1.cics.timeout=800
./cobrancaJar_jar/ceflib_monitorcics.properties:75:###***applic.monitor.sirot2.2.cics.ip=localhost
./cobrancaJar_jar/ceflib_monitorcics.properties:78:###***applic.monitor.sirot2.2.cics.timeout=800
./cobrancaJar_jar/ceflib_monitorcics.properties:84:###***applic.monitor.sirot2.3.cics.ip=localhost
./cobrancaJar_jar/ceflib_monitorcics.properties:87:###***applic.monitor.sirot2.3.cics.timeout=800
./cobrancaJar_jar/ceflib_monitorcics.properties:93:###***applic.monitor.sirot2.4.cics.ip=localhost
./cobrancaJar_jar/ceflib_monitorcics.properties:96:###***applic.monitor.sirot2.4.cics.timeout=800
./cobrancaJar_jar/ceflib_monitorcics.properties:102:###***applic.monitor.sirot2.5.cics.ip=localhost
./cobrancaJar_jar/ceflib_monitorcics.properties:105:###***applic.monitor.sirot2.5.cics.timeout=800
./cobrancaJar_jar/cefsirot2con.properties:6:DEFAULT_TIMEOUT=30000
./cobrancaJar_jar/ceflib_monitorias.properties:22:###***#applic.monitor.ias.1.url=http://hara:9999/NASApp/NASApp/ajuda/checkias
./cobrancaJar_jar/ceflib_monitorias.properties:24:###***#applic.monitor.ias.1.timeout=800
./cobrancaJar_jar/ceflib_monitorias.properties:29:###***applic.monitor.ias.1.url=http://cs0000ux093.coresp.caixa:9001/NASApp/ajuda/checkias
./cobrancaJar_jar/ceflib_monitorias.properties:31:###***applic.monitor.ias.1.timeout=2000
./cobrancaJar_jar/ceflib_monitorias.properties:35:###***applic.monitor.ias.2.url=http://cs0000ux093.coresp.caixa:9002/NASApp/ajuda/checkias
./cobrancaJar_jar/ceflib_monitorias.properties:37:###***applic.monitor.ias.2.timeout=2000
./cobrancaJar_jar/ceflib_monitorias.properties:41:###***applic.monitor.ias.3.url=http://cs0000ux093.coresp.caixa:9003/NASApp/ajuda/checkias
./cobrancaJar_jar/ceflib_monitorias.properties:43:###***applic.monitor.ias.3.timeout=2000
./cobrancaJar_jar/ceflib_monitorias.properties:47:###***applic.monitor.ias.4.url=http://cs0000ux045.coresp.caixa:9004/NASApp/ajuda/checkias
./cobrancaJar_jar/ceflib_monitorias.properties:49:###***applic.monitor.ias.4.timeout=2000
./cobrancaJar_jar/ceflib_monitorias.properties:53:###***applic.monitor.ias.5.url=http://cs0000ux045.coresp.caixa:9005/NASApp/ajuda/checkias
./cobrancaJar_jar/ceflib_monitorias.properties:55:###***applic.monitor.ias.5.timeout=2000
./cobrancaJar_jar/ceflib_monitorias.properties:59:###***applic.monitor.ias.6.url=http://cs0000ux045.coresp.caixa:9006/NASApp/ajuda/checkias
./cobrancaJar_jar/ceflib_monitorias.properties:61:###***applic.monitor.ias.6.timeout=2000
./cobrancaJar_jar/ceflib_monitorias.properties:65:###***applic.monitor.ias.7.url=http://cs0000ux093.coresp.caixa:9100/NASApp/ajuda/checkias
./cobrancaJar_jar/ceflib_monitorias.properties:67:###***applic.monitor.ias.7.timeout=2000
./cobrancaJar_jar/ceflib_monitorias.properties:71:###***applic.monitor.ias.8.url=http://desenv.coresp.caixa/NASApp/ajuda/checkias
./cobrancaJar_jar/ceflib_monitorias.properties:73:###***applic.monitor.ias.8.timeout=2000
./cobrancaJar_jar/org/bouncycastle/x509/CertPathReviewerMessages.properties:346:# {2} the url of the distribution point
./cobrancaJar_jar/org/bouncycastle/x509/CertPathReviewerMessages.properties:355:# {2} the url of the distribution point
./cobrancaJar_jar/org/bouncycastle/x509/CertPathReviewerMessages.properties:364:# {2} the url of the distribution point
./cobrancaJar_jar/org/bouncycastle/x509/CertPathReviewerMessages.properties:391:# crl distribution point url
./cobrancaJar_jar/org/bouncycastle/x509/CertPathReviewerMessages.properties:392:# {0} the crl distribution point url as String
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca#
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca#
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca#
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca#
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca# netstat -aun -P tcp | grep " 28337 " | egrep -v "LISTEN|\.9008 " | awk '{print $2, $(NF)}' | sort | uniq -c
   3 *.* IDLE
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca#
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca#
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca#
