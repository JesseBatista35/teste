-sh-4.1$ nmap -p- 10.192.228.146

Starting Nmap 5.51 ( http://nmap.org ) at 2026-06-05 19:53 -03
Nmap scan report for siormdes.cicsdirect.corecaixa (10.192.228.146)
Host is up (0.0016s latency).
Not shown: 64400 closed ports, 1002 filtered ports
PORT      STATE SERVICE
1082/tcp  open  amt-esd-prot
1202/tcp  open  unknown
1414/tcp  open  ibm-mqseries
1415/tcp  open  unknown
1416/tcp  open  novell-lu6.2
1417/tcp  open  timbuktu-srv1
1418/tcp  open  timbuktu-srv2
1420/tcp  open  timbuktu-srv4
1490/tcp  open  unknown
1761/tcp  open  landesk-rc
1766/tcp  open  unknown
1768/tcp  open  unknown
2370/tcp  open  unknown
2371/tcp  open  worldwire
2484/tcp  open  unknown
3013/tcp  open  gilatskysurfer
3014/tcp  open  broker_service
3015/tcp  open  unknown
3016/tcp  open  unknown
3017/tcp  open  event_listener
3018/tcp  open  unknown
3024/tcp  open  unknown
3033/tcp  open  unknown
3103/tcp  open  autocuesmi
3104/tcp  open  unknown
3105/tcp  open  unknown
3108/tcp  open  unknown
3110/tcp  open  unknown
3113/tcp  open  unknown
3114/tcp  open  unknown
3116/tcp  open  unknown
3117/tcp  open  unknown
3121/tcp  open  unknown
3123/tcp  open  unknown
3124/tcp  open  unknown
3125/tcp  open  unknown
3126/tcp  open  unknown
3128/tcp  open  squid-http
3129/tcp  open  unknown
3130/tcp  open  unknown
3131/tcp  open  unknown
3132/tcp  open  unknown
3133/tcp  open  unknown
3134/tcp  open  unknown
3135/tcp  open  unknown
3136/tcp  open  unknown
3137/tcp  open  unknown
3138/tcp  open  unknown
3140/tcp  open  unknown
3141/tcp  open  vmodem
3142/tcp  open  unknown
3143/tcp  open  unknown
3144/tcp  open  unknown
3145/tcp  open  unknown
3146/tcp  open  bears-02
3147/tcp  open  unknown
3148/tcp  open  unknown
3149/tcp  open  unknown
3150/tcp  open  unknown
3154/tcp  open  unknown
3159/tcp  open  unknown
3161/tcp  open  unknown
3162/tcp  open  sflm
3163/tcp  open  unknown
3164/tcp  open  unknown
3165/tcp  open  unknown
3166/tcp  open  unknown
3167/tcp  open  nowcontact
3168/tcp  open  poweronnud
3169/tcp  open  unknown
3170/tcp  open  unknown
3172/tcp  open  unknown
3173/tcp  open  unknown
3174/tcp  open  unknown
3175/tcp  open  unknown
3176/tcp  open  unknown
3177/tcp  open  unknown
3178/tcp  open  unknown
3179/tcp  open  unknown
3180/tcp  open  unknown
3181/tcp  open  unknown
3182/tcp  open  unknown
3183/tcp  open  unknown
3184/tcp  open  unknown
3185/tcp  open  unknown
3186/tcp  open  unknown
3187/tcp  open  unknown
3188/tcp  open  unknown
3189/tcp  open  unknown
3191/tcp  open  unknown
3192/tcp  open  unknown
3199/tcp  open  unknown
3443/tcp  open  ov-nnm-websrv
3444/tcp  open  unknown
4053/tcp  open  unknown
4054/tcp  open  unknown
4813/tcp  open  unknown
4820/tcp  open  unknown
5021/tcp  open  zenginkyo-2
5022/tcp  open  unknown
5023/tcp  open  htuilsrv
5024/tcp  open  unknown
5025/tcp  open  unknown
5026/tcp  open  unknown
5029/tcp  open  unknown
5030/tcp  open  surfpass
5031/tcp  open  unknown
5032/tcp  open  unknown
5033/tcp  open  unknown
5034/tcp  open  unknown
5051/tcp  open  ida-agent
5052/tcp  open  ita-manager
5053/tcp  open  rlm
5054/tcp  open  rlm-admin
5055/tcp  open  unot
5074/tcp  open  alesquery
5335/tcp  open  unknown
5336/tcp  open  unknown
7552/tcp  open  unknown
7553/tcp  open  unknown
7554/tcp  open  unknown
7556/tcp  open  unknown
7557/tcp  open  unknown
8201/tcp  open  trivnet2
9498/tcp  open  unknown
9999/tcp  open  abyss
12023/tcp open  unknown
12345/tcp open  netbus
12422/tcp open  unknown
22484/tcp open  unknown
32484/tcp open  unknown
50889/tcp open  unknown
50890/tcp open  unknown

Nmap done: 1 IP address (1 host up) scanned in 2.44 seconds
-sh-4.1$ for port in 9080 5432 3306 1433 8000 8888 80 443; do
>   echo "Testando porta $port..."
>   nc -zv 10.192.228.146 $port
> done
Testando porta 9080...
nc: connect to 10.192.228.146 port 9080 (tcp) failed: Connection refused
Testando porta 5432...
nc: connect to 10.192.228.146 port 5432 (tcp) failed: Connection refused
Testando porta 3306...
nc: connect to 10.192.228.146 port 3306 (tcp) failed: Connection refused
Testando porta 1433...
nc: connect to 10.192.228.146 port 1433 (tcp) failed: Connection refused
Testando porta 8000...
nc: connect to 10.192.228.146 port 8000 (tcp) failed: Connection refused
Testando porta 8888...
nc: connect to 10.192.228.146 port 8888 (tcp) failed: Connection refused
Testando porta 80...
nc: connect to 10.192.228.146 port 80 (tcp) failed: Connection refused
Testando porta 443...
nc: connect to 10.192.228.146 port 443 (tcp) failed: Connection refused
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ find / -name "*sipen*" -o -name "*ibmaplacs*" 2>/dev/null | grep -i log
/logs/jboss-eap/hc/servers/sipen_node3_lx0006
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-30
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-26
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-09
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-06-01
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-06-03
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-21
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-18
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-14
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-19
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-06-04
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-12
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-11
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-28
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-10
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-06
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-15
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-22
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-27
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-13
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-23
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-06-02
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-20
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-08
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-29
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-25
/logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log.2026-05-07
-sh-4.1$ find / -name "sipen*" -type f 2>/dev/null | grep -E "(config|properties|xml)"
-sh-4.1$ ps aux | grep -i sipen
jboss    52768  3.8  7.1 5818496 881884 ?      Sl   20:00   0:11 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:sipen_node3_lx0006] -XX:PermSize=512m -XX:MaxPermSize=512m -Xms2048m -Xmx2048m -Djava.awt.headless=true -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttps.protocols=TLSv1.2 -Dhttp.proxySet=true -Dfile.encoding=ISO-8859-1 -Duser.language=pt -Duser.country=BR -Duser.timezone=Brazil/East -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxySet=true -Dhttp.nonProxyHosts=10.96.28.39|*.caixa|10.123.15.55|*.extracaixa -Dhttp.proxySet=true -Duser.language=pt -Duser.country=BR -Duser.timezone=GMT-3  -Djavax.net.ssl.trustStore=/upload/des/sipen/certificados/sipen_siscoaf.jks -DSIPEN_USUARIO=SRVPEND1 -Djboss.domain.master.address=10.116.88.20 -DSIPEN_SENHA=PEND1SRV -Djboss.bind.address.unsecure=10.116.88.25 -Djavax.net.ssl.trustStorePassword=jbosseap -Djava.net.preferIPv4Stack=true -Djboss.home.dir=/opt/jboss/jboss-eap -DSID01_USUARIO=SPENSIDD -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -DPATH_TRABALHO=/upload/des/sipen/ -DURL_SISCOAF=https://treina.siscoaf2.fazenda.gov.br/siscoaf-internet/ComunicacaoService?wsdl -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.bind.address=10.116.88.25 -DURL_CONSULTAR_SID09=https://des.barramento.caixa/sibar/ConsultaContaSID09?wsdl -Dorg.apache.tomcat.util.http.Parameters.MAX_COUNT=5000 -DNUMERO_BENEFICIARIO=727375 -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Dorg.apache.catalina.connector.URI_ENCODING=UTF-8 -DMQ_USUARIO_SERVICO_GDB=SGCBS02D -DSID01_SENHA=S296364 -Djava.awt.headless=true -DCNPJ_BENEFICIARIO=00360305000104 -Djboss.bind.address.management=10.116.88.25 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/sipen_node3_lx0006 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sipen_node3_lx0006 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sipen_node3_lx0006 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/sipen_node3_lx0006/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
p585600  54540  0.0  0.0 103324   964 pts/1    S+   20:05   0:00 grep -i sipen
-sh-4.1$ ps aux | grep -i java
root      2428  0.1  0.9 3518788 118140 ?      Sl   Mar19 132:26 /opt/ctmage/bmcjava/bmcjava-V3/bin/java -Xmx256m -XX:+CrashOnOutOfMemoryError -Djava.io.tmpdir=/tmp -Djava.net.preferIPv4Stack=true -Doverride.default.services= -Dspring.profiles.active=tcp -DCTMAG.CONFIG.DBGLVL=0 -Dctm.logs.dir=/opt/ctmage/ctm/proclog -Dlogging.config=/opt/ctmage/ctm/data/logback.xml -Dctm.data.dir=/opt/ctmage/ctm/data -Dstdout=/opt/ctmage/ctm/proclog/agjstd_2114-2026-03-19.0.tmp -jar /opt/ctmage/ctm/exe/ag-app.jar
jboss    52005  0.2  0.5 4621508 63148 ?       Sl   20:00   0:00 java -D[Process Controller] -server -Xms1g -Xmx1g -XX:MaxPermSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -Dorg.jboss.boot.log.file=/logs/jboss-eap/hc/process-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.process-controller -jboss-home /opt/jboss/jboss-eap -jvm java -mp /opt/jboss/jboss-eap/modules -- -Dorg.jboss.boot.log.file=/logs/jboss-eap/hc/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -server -Xms1g -Xmx1g -XX:MaxPermSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -- -default-jvm java -b 10.116.88.25 -bmanagement 10.116.88.25 -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.25 --host-config=host-slave.xml -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dhttps.protocols=TLSv1.2,TLSv1.3 -c domain.xml
jboss    52030  2.9  5.8 4657136 717360 ?      Sl   20:00   0:09 java -D[Host Controller] -Dorg.jboss.boot.log.file=/logs/jboss-eap/hc/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -server -Xms1g -Xmx1g -XX:MaxPermSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.host-controller -mp /opt/jboss/jboss-eap/modules --pc-address 127.0.0.1 --pc-port 46512 -default-jvm java -b 10.116.88.25 -bmanagement 10.116.88.25 -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.25 --host-config=host-slave.xml -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dhttps.protocols=TLSv1.2,TLSv1.3 -c domain.xml -Djboss.home.dir=/opt/jboss/jboss-eap
jboss    52078  7.4  8.6 5937792 1065292 ?     Sl   20:00   0:23 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:sinafweb3-git_node1_lx0006] -XX:PermSize=512m -XX:MaxPermSize=512m -Xms2048m -Xmx2048m -DSINAFWEB_SIECM_CLASSE_ARQUIVO_IMPORTACAO=ARQUIVO_IMPORTACAO_LOTE -Djavax.net.ssl.trustStore=/upload/des/sinaf/certificados/truststore.jks -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.25 -Djavax.net.ssl.trustStorePassword=vavb0dISit33j9 -Djava.net.preferIPv4Stack=true -DSINAFWEB_ASSINADOR_ENDPOINT=https://sifwc.des.coredf.caixa -Djboss.home.dir=/opt/jboss/jboss-eap -DSINAFWEB_LDAP_USER_BIND=ou=People,o=caixa -DSINAFWEB_SIECM_ENDPOINT=http://siecm.des.caixa/siecm-web/ -DSINAFWEB_SSO_ENDPOINT=https://login.des.caixa/auth/ -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -DSINAFWEB_ASSINADOR_KEYSTORE=/upload/des/sinaf/certificados/keystore.jks -DSINAFWEB_ASSINADOR_KEYSTORE_SENHA=vavb0dISit33j9 -Djavax.net.ssl.keyStore=/upload/des/sinaf/certificados/keystore.jks -Djboss.modules.system.pkgs=org.jboss.byteman -DSINAFWEB_SIECM_CLASSE_DOCUMENTO_LANCAMENTO=DOC_LAN -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.bind.address=10.116.88.25 -DSINAFWEB_SIECM_SUB_PASTA=default -DSINAFWEB_ASSINADOR_TRUSTSTORE_SENHA=vavb0dISit33j9 -DSINAFWEB_SIECM_PASTA=default -DSINAFWEB_SIECM_LOCAL_ARMAZENAMENTO=OS_PADM -DSINAFWEB_SSO_REALM=intranet -DSINAFWEB_CICSWS_ENDPOINT=http://cics.des.coredf.caixa:8080/sinaf/ -Djavax.net.ssl.keyStorePassword=vavb0dISit33j9 -DSINAFWEB_ASSINADOR_TRUSTSTORE=/upload/des/sinaf/certificados/truststore.jks -DSINAFWEB_SIECM_CLASSE_ANEXO_DOCUMENTO_LANCAMENTO=ANEXO_DOC_LAN -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Djava.awt.headless=true -DSINAFWEB_SSO_CREDENCIAIS_BASE64=Y2xpLXNlci1uYWY6ODNiMGRiYTQtOTJmMS00YTlkLTk4YTgtNWU3ZDVmNjMwZTdh -Djboss.bind.address.management=10.116.88.25 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/sinafweb3-git_node1_lx0006 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sinafweb3-git_node1_lx0006 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sinafweb3-git_node1_lx0006 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/sinafweb3-git_node1_lx0006/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
jboss    52173  4.2  7.3 5836008 902876 ?      Sl   20:00   0:13 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:siarc_node1_lx0006] -XX:PermSize=512m -XX:MaxPermSize=512m -Xms2048m -Xmx2048m -Duser.language=pt -Duser.country=BR -Duser.timezone=Brazil/East -Djava.awt.headless=true -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxySet=true -Djavax.net.ssl.trustStore=/upload/des/siarc/certificados.keystore -Dhttp.proxyHost=proxydes.caixa -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.25 -Djavax.net.ssl.trustStorePassword=jbosseap -Dchannel=BRSUN033.TO.BRD1 -Dinstancias=4 -Djava.net.preferIPv4Stack=true -Dhttps.proxyPort=80 -Djboss.home.dir=/opt/jboss/jboss-eap -Dqueue-user=SRVARCD1 -Denabled=true -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dqueue-req-name=LQ.REQ.SIARC.BACEN_PESQUISA -Dqueue-manager=BRD1 -Dqueue-rsp-name=LQ.RSP.SIARC.BACEN_PESQUISA -Dsenha_siarc=SFECARCD -Djboss.modules.system.pkgs=org.jboss.byteman -Dqueue-path=10.192.228.145 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.bind.address=10.116.88.25 -DSIARC_PASSWORD=SRVARCD1 -DstaHost=sta-h.bcb.gov.br -Dhttps.proxyHost=proxydes.caixa -Dqueue-port=1414 -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Dusuario_siarc=SFECARCD -Djava.awt.headless=true -Dqueue-password=SRVARCD1 -Djboss.bind.address.management=10.116.88.25 -DSIARC_USUARIO=SRVARCD1 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/siarc_node1_lx0006 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/siarc_node1_lx0006 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/siarc_node1_lx0006 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/siarc_node1_lx0006/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
jboss    52303  4.5  7.6 5833632 941604 ?      Sl   20:00   0:14 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:siemp_node1_lx0006] -XX:PermSize=512m -XX:MaxPermSize=512m -Xms2048m -Xmx2048m -Djavax.net.ssl.trustStore=/upload/certificados/chaveiro.jks -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.25 -Djavax.net.ssl.trustStorePassword=changeit -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djava.net.preferIPv4Stack=true -Djboss.bind.address=10.116.88.25 -Djboss.home.dir=/opt/jboss/jboss-eap -Dorg.apache.tomcat.util.http.Parameters.MAX_COUNT=10240 -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Djava.awt.headless=true -DURL_SIFEC=https://sifec.desenvolvimento.extracaixa/fec-web/ -DurlConsultaBoleto=http://sifec1.des.caixa/fec-web/emprest/consultaBoleto/consulaBoletoRegistrado -Djboss.bind.address.management=10.116.88.25 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/siemp_node1_lx0006 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/siemp_node1_lx0006 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/siemp_node1_lx0006 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/siemp_node1_lx0006/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
jboss    52422  3.2  5.2 5823112 652868 ?      Sl   20:00   0:10 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:sipes_node1_lx0006] -XX:PermSize=512m -XX:MaxPermSize=512m -Xms2048m -Xmx2048m -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.domain.master.address=10.116.88.20 -DSIPES.JCICS.SENHA=s739041 -Djboss.bind.address.unsecure=10.116.88.25 -DLDAP_URL=ldap://ldapclusterdes.extra.caixa.gov.br:1489 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djava.net.preferIPv4Stack=true -Djboss.bind.address=10.116.88.25 -Djboss.home.dir=/opt/jboss/jboss-eap -Dorg.apache.tomcat.util.http.Parameters.MAX_COUNT=5000 -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -DSIPES.JCICS.USUARIO=SPESDB01 -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Djava.awt.headless=true -Djboss.bind.address.management=10.116.88.25 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/sipes_node1_lx0006 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sipes_node1_lx0006 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sipes_node1_lx0006 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/sipes_node1_lx0006/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
jboss    52622  2.4  4.2 5815880 528572 ?      Sl   20:00   0:07 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:sicrs_node1_lx0006] -Xms2048m -Xmx2048m -Dfile.encoding=ISO-8859-1 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxySet=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.25 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djava.net.preferIPv4Stack=true -Djboss.bind.address=10.116.88.25 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Dorg.apache.catalina.connector.URI_ENCODING=UTF-8 -Djava.awt.headless=true -Djboss.bind.address.management=10.116.88.25 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/sicrs_node1_lx0006 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sicrs_node1_lx0006 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sicrs_node1_lx0006 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/sicrs_node1_lx0006/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
jboss    52768  3.7  7.1 5818496 881888 ?      Sl   20:00   0:11 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:sipen_node3_lx0006] -XX:PermSize=512m -XX:MaxPermSize=512m -Xms2048m -Xmx2048m -Djava.awt.headless=true -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttps.protocols=TLSv1.2 -Dhttp.proxySet=true -Dfile.encoding=ISO-8859-1 -Duser.language=pt -Duser.country=BR -Duser.timezone=Brazil/East -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxySet=true -Dhttp.nonProxyHosts=10.96.28.39|*.caixa|10.123.15.55|*.extracaixa -Dhttp.proxySet=true -Duser.language=pt -Duser.country=BR -Duser.timezone=GMT-3  -Djavax.net.ssl.trustStore=/upload/des/sipen/certificados/sipen_siscoaf.jks -DSIPEN_USUARIO=SRVPEND1 -Djboss.domain.master.address=10.116.88.20 -DSIPEN_SENHA=PEND1SRV -Djboss.bind.address.unsecure=10.116.88.25 -Djavax.net.ssl.trustStorePassword=jbosseap -Djava.net.preferIPv4Stack=true -Djboss.home.dir=/opt/jboss/jboss-eap -DSID01_USUARIO=SPENSIDD -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -DPATH_TRABALHO=/upload/des/sipen/ -DURL_SISCOAF=https://treina.siscoaf2.fazenda.gov.br/siscoaf-internet/ComunicacaoService?wsdl -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.bind.address=10.116.88.25 -DURL_CONSULTAR_SID09=https://des.barramento.caixa/sibar/ConsultaContaSID09?wsdl -Dorg.apache.tomcat.util.http.Parameters.MAX_COUNT=5000 -DNUMERO_BENEFICIARIO=727375 -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Dorg.apache.catalina.connector.URI_ENCODING=UTF-8 -DMQ_USUARIO_SERVICO_GDB=SGCBS02D -DSID01_SENHA=S296364 -Djava.awt.headless=true -DCNPJ_BENEFICIARIO=00360305000104 -Djboss.bind.address.management=10.116.88.25 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/sipen_node3_lx0006 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sipen_node3_lx0006 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sipen_node3_lx0006 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/sipen_node3_lx0006/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
jboss    52935  3.1  4.8 5877892 594220 ?      Sl   20:00   0:09 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:sinaf2-prd-legado_node1_lx0006] -XX:PermSize=512m -XX:MaxPermSize=512m -Xms2048m -Xmx2048m -DLDAP_PORT=1489 -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.25 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djava.net.preferIPv4Stack=true -DSINAF_USER_CICS=SNAFBD01 -DSINAF_PASSWORD_CICS=sna2006 -Djboss.bind.address=10.116.88.25 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -DLDAP_USER_BIND=uid=SPMCBT01,ou=users,o=caixa -DLDAP_SERVER=ldap://ldapclusterdes.extra.caixa.gov.br -DLDAP_PASSWD_BIND=Fort891b -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Djava.awt.headless=true -Djboss.bind.address.management=10.116.88.25 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/sinaf2-prd-legado_node1_lx0006 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sinaf2-prd-legado_node1_lx0006 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sinaf2-prd-legado_node1_lx0006 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/sinaf2-prd-legado_node1_lx0006/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
jboss    53112  3.9  6.2 5839388 776964 ?      Sl   20:00   0:11 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:sinaf-validador_node1_lx0006] -XX:PermSize=512m -XX:MaxPermSize=512m -Xms2048m -Xmx2048m -DLDAP_PORT=1489 -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.domain.master.address=10.116.88.20 -Djboss.bind.address.unsecure=10.116.88.25 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djava.net.preferIPv4Stack=true -DSINAF_USER_CICS=SNAFBD01 -DSINAF_PASSWORD_CICS=sna2006 -Djboss.bind.address=10.116.88.25 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -DLDAP_USER_BIND=uid=SPMCBT01,ou=users,o=caixa -DLDAP_SERVER=ldap://ldapclusterdes.extra.caixa.gov.br -DLDAP_PASSWD_BIND=Fort891b -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Djava.awt.headless=true -Djboss.bind.address.management=10.116.88.25 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/sinaf-validador_node1_lx0006 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sinaf-validador_node1_lx0006 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sinaf-validador_node1_lx0006 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/sinaf-validador_node1_lx0006/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
logstash 54557  0.0  0.2 3519984 30152 ?       SNsl 20:05   0:00 /usr/java/jdk1.8.0_141/bin/java -Xms256m -Xmx1g -XX:+UseParNewGC -XX:+UseConcMarkSweepGC -XX:CMSInitiatingOccupancyFraction=75 -XX:+UseCMSInitiatingOccupancyOnly -XX:+DisableExplicitGC -Djava.awt.headless=true -Dfile.encoding=UTF-8 -XX:+HeapDumpOnOutOfMemoryError -cp /usr/share/logstash/logstash-core/lib/jars/animal-sniffer-annotations-1.14.jar:/usr/share/logstash/logstash-core/lib/jars/commons-compiler-3.0.8.jar:/usr/share/logstash/logstash-core/lib/jars/error_prone_annotations-2.0.18.jar:/usr/share/logstash/logstash-core/lib/jars/google-java-format-1.5.jar:/usr/share/logstash/logstash-core/lib/jars/guava-22.0.jar:/usr/share/logstash/logstash-core/lib/jars/j2objc-annotations-1.1.jar:/usr/share/logstash/logstash-core/lib/jars/jackson-annotations-2.9.1.jar:/usr/share/logstash/logstash-core/lib/jars/jackson-core-2.9.1.jar:/usr/share/logstash/logstash-core/lib/jars/jackson-databind-2.9.1.jar:/usr/share/logstash/logstash-core/lib/jars/jackson-dataformat-cbor-2.9.1.jar:/usr/share/logstash/logstash-core/lib/jars/janino-3.0.8.jar:/usr/share/logstash/logstash-core/lib/jars/javac-shaded-9-dev-r4023-3.jar:/usr/share/logstash/logstash-core/lib/jars/jruby-complete-9.1.13.0.jar:/usr/share/logstash/logstash-core/lib/jars/jsr305-1.3.9.jar:/usr/share/logstash/logstash-core/lib/jars/log4j-api-2.9.1.jar:/usr/share/logstash/logstash-core/lib/jars/log4j-core-2.9.1.jar:/usr/share/logstash/logstash-core/lib/jars/log4j-slf4j-impl-2.9.1.jar:/usr/share/logstash/logstash-core/lib/jars/logstash-core.jar:/usr/share/logstash/logstash-core/lib/jars/slf4j-api-1.7.25.jar org.logstash.Logstash --path.settings /etc/logstash
p585600  54586  0.0  0.0 103324   952 pts/1    S+   20:05   0:00 grep -i java
-sh-4.1$
