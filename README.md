-sh-4.2$ ps aux | grep jboss
root      25747  0.0  0.0 205812  2584 ?        S    Jun03   0:00 su - jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss/jboss-eap/hc/tmp/jboss-hc-des.pid /opt/jboss/jboss-eap/bin/domain.sh --host-config=host-slave.xml  -b 10.116.94.206 -bmanagement 10.116.94.206 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml
jboss     25750  0.0  0.0 113180  1484 ?        Ss   Jun03   0:00 /bin/sh /opt/jboss/jboss-eap/bin/domain.sh --host-config=host-slave.xml -b 10.116.94.206 -bmanagement 10.116.94.206 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml
jboss     26086  0.0  0.5 1262188 87752 ?       Sl   Jun03   4:53 java -D[Process Controller] -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/process-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.process-controller -jboss-home /opt/jboss/jboss-eap -jvm java -mp /opt/jboss/jboss-eap/modules -- -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -- -default-jvm java --host-config=host-slave.xml -b 10.116.94.206 -bmanagement 10.116.94.206 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml
jboss     26105  0.0  1.7 1406432 283932 ?      Sl   Jun03   5:42 java -D[Host Controller] -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.host-controller -mp /opt/jboss/jboss-eap/modules --pc-address 127.0.0.1 --pc-port 40205 -default-jvm java --host-config=host-slave.xml -b 10.116.94.206 -bmanagement 10.116.94.206 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml -Djboss.home.dir=/opt/jboss/jboss-eap
jboss     26176  0.2  7.8 4031312 1278552 ?     Sl   Jun03  24:33 /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/bin/java -D[Server:siosp_node1_lx099] -Xms1024m -Xmx2048m -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxySet=true -DAPI-KEY-SIICO=l7c46f92ec8b4f47c78b3371e4627354f5 -DSIICO-SERVER-PUBLICO=https://api.des.caixa:8443 -DSIOSP-SEC_TEMPO_MAX_IDLE=60 -DSIOSP-SEC_TEMPO_VIDA_TOKEN=5 -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djavax.net.ssl.trustStore=/upload/des/certificados/chaveiro-sso.jks -Djavax.net.ssl.trustStorePassword=jbosseap -Djboss.bind.address=10.116.94.206 -Djboss.bind.address.management=10.116.94.206 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.system.pkgs=org.jboss.byteman -Doracle.auditoria.senha=sospbd03 -Doracle.auditoria.url=jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/orad01ng -Doracle.auditoria.usuario=SOSPBD03 -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/log/servers/siosp_node1_lx099 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/siosp_node1_lx099 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/siosp_node1_lx099/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.server
p585600   98338  0.0  0.0 112732   980 pts/0    S+   14:09   0:00 grep --color=auto jboss
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ netstate -tlnp | grep -E '8080|8443|80'
-sh: netstate: comando não encontrado
-sh-4.2$ netstate -tlnp | grep -E '8080|8443|80'
-sh: netstate: comando não encontrado
-sh-4.2$ netstat -tlnp | grep -E '8080|8443|80'
(Não foi possível ler informações para "-p": geteuid()=10585600 mas você deve ser root.)
tcp        0      0 10.116.94.206:8803      0.0.0.0:*               OUÇA       -
tcp6       0      0 :::38059                :::*                    OUÇA       -
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ss -tlnp | grep -E '8080|8443|80'
LISTEN     0      128    10.116.94.206:8803                     *:*
LISTEN     0      64          :::38059                   :::*
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ TAIL -100f /opt/jboss/jboss-eap/standalone/log/server.log
-sh: TAIL: comando não encontrado
-sh-4.2$ tail -100f /opt/jboss/jboss-eap/standalone/log/server.log
2026-06-03 16:02:19,851 INFO  [org.jboss.modules] (main) JBoss Modules version 1.6.7.Final-redhat-00001
2026-06-03 16:02:20,282 FATAL [org.jboss.as.server] (main) WFLYSRV0239: Abortando com código de saída 1



^C
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la /opt/jboss/jboss-eap/standalone/deployments/ | grep simcn
-sh-4.2$ curl -v http://localhost:8080/simcn-web/
* About to connect() to localhost port 8080 (#0)
*   Trying ::1...
* Conexão recusada
*   Trying 127.0.0.1...
* Conexão recusada
* Failed connect to localhost:8080; Conexão recusada
* Closing connection 0
curl: (7) Failed connect to localhost:8080; Conexão recusada
-sh-4.2$ df -h
Sist. Arq.                                                         Tam. Usado Disp. Uso% Montado em
/dev/mapper/VG_PRINCIPAL-LV_BARRA                                  5,0G   73M  5,0G   2% /
devtmpfs                                                           7,8G     0  7,8G   0% /dev
tmpfs                                                              7,8G     0  7,8G   0% /dev/shm
tmpfs                                                              7,8G  417M  7,4G   6% /run
tmpfs                                                              7,8G     0  7,8G   0% /sys/fs/cgroup
/dev/mapper/VG_PRINCIPAL-LV_USR                                    5,0G  2,5G  2,6G  50% /usr
/dev/mapper/VG_PRINCIPAL-LV_OPT                                     25G  4,1G   21G  17% /opt
/dev/mapper/VG_PRINCIPAL-LV_LOGS                                   7,0G   34M  7,0G   1% /logs
/dev/mapper/VG_PRINCIPAL-LV_HOME                                   2,0G  120M  1,9G   6% /home
/dev/mapper/VG_PRINCIPAL-LV_VAR                                    5,0G  2,0G  3,0G  40% /var
/dev/mapper/VG_PRINCIPAL-LV_TMP                                    2,0G   33M  2,0G   2% /tmp
/dev/sda1                                                          397M  207M  190M  53% /boot
10.116.95.13:/export/upload_des                                    200G  119G   82G  60% /upload
10.116.95.13:/export/nfs-projetos-simcn                             97M  5,3M   92M   6% /projetos/simcn
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/UP_SIMCN   20G  2,0M   20G   1% /uploadintegracao/des/simcn
tmpfs                                                              1,6G     0  1,6G   0% /run/user/10590589
tmpfs                                                              1,6G     0  1,6G   0% /run/user/10585600
-sh-4.2$ df -kh
Sist. Arq.                                                         Tam. Usado Disp. Uso% Montado em
/dev/mapper/VG_PRINCIPAL-LV_BARRA                                  5,0G   73M  5,0G   2% /
devtmpfs                                                           7,8G     0  7,8G   0% /dev
tmpfs                                                              7,8G     0  7,8G   0% /dev/shm
tmpfs                                                              7,8G  417M  7,4G   6% /run
tmpfs                                                              7,8G     0  7,8G   0% /sys/fs/cgroup
/dev/mapper/VG_PRINCIPAL-LV_USR                                    5,0G  2,5G  2,6G  50% /usr
/dev/mapper/VG_PRINCIPAL-LV_OPT                                     25G  4,1G   21G  17% /opt
/dev/mapper/VG_PRINCIPAL-LV_LOGS                                   7,0G   34M  7,0G   1% /logs
/dev/mapper/VG_PRINCIPAL-LV_HOME                                   2,0G  120M  1,9G   6% /home
/dev/mapper/VG_PRINCIPAL-LV_VAR                                    5,0G  2,0G  3,0G  40% /var
/dev/mapper/VG_PRINCIPAL-LV_TMP                                    2,0G   33M  2,0G   2% /tmp
/dev/sda1                                                          397M  207M  190M  53% /boot
10.116.95.13:/export/upload_des                                    200G  119G   82G  60% /upload
10.116.95.13:/export/nfs-projetos-simcn                             97M  5,3M   92M   6% /projetos/simcn
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/UP_SIMCN   20G  2,0M   20G   1% /uploadintegracao/des/simcn
tmpfs                                                              1,6G     0  1,6G   0% /run/user/10590589
tmpfs                                                              1,6G     0  1,6G   0% /run/user/10585600
-sh-4.2$
