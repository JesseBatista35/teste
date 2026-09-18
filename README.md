
-sh-4.1$ cat /etc/init.d/jboss-eap_hc.sh | head -60
#!/bin/bash
# chkconfig:  45 92 08
# description: JBoss Application Server

JBOSS_HOME=/opt/jboss/jboss-eap
JBOSS_INSTANCE=hc
JBOSS_INSTANCE_PATH=$JBOSS_HOME/$JBOSS_INSTANCE
IP_ADDR=10.116.88.24
IP_ADDR_MANAGEMENT=10.116.88.20
HOST_CONFIG=host-slave.xml
JBOSS_USER=jboss
JBOSS_GROUP=jboss
JBOSS_CONFIG=domain.xml
JBOSS_PIDFILE=$JBOSS_INSTANCE_PATH/tmp/jboss_$JBOSS_INSTANCE.pid


JBOSS_LOG_DIR=/logs/jboss-eap/$JBOSS_INSTANCE
JBOSS_CONSOLE_LOG=$JBOSS_LOG_DIR/console-stdout.log
JBOSS_SCRIPT="$JBOSS_HOME/bin/domain.sh\
                -b $IP_ADDR\
                -bmanagement $IP_ADDR\
                -Djboss.domain.master.address=$IP_ADDR_MANAGEMENT\
                -Djboss.bind.address.unsecure=$IP_ADDR\
                --host-config=$HOST_CONFIG\
                -Djboss.domain.log.dir=$JBOSS_LOG_DIR/ \
                -Djboss.domain.base.dir=$JBOSS_INSTANCE_PATH\
                -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize\
                -Dhttps.protocols=TLSv1.2,TLSv1.3\
                -c $JBOSS_CONFIG"

JAVA_HOME="/usr/java/default"
JAVA="$JAVA_HOME/bin/java"

. /opt/jboss/jboss-eap/bin/common_start.sh
-sh-4.1$
-sh-4.1$
-sh-4.1$ /etc/init.d/jboss-eap_hc.sh status
O hc se encontra parado.
-sh-4.1$ mount | grep -i nfs
sunrpc on /var/lib/nfs/rpc_pipefs type rpc_pipefs (rw)
10.116.88.160:/export/upload_des on /upload type nfs (rw,vers=4,addr=10.116.88.160,clientaddr=10.116.88.24)
10.116.88.160:/export/sisgd on /opt/sisgd type nfs (rw,nfsvers=3,addr=10.116.88.160)
10.116.88.160:/export/jboss_upload_jboss64 on /upload_eap64 type nfs (rw,vers=4,addr=10.116.88.160,clientaddr=10.116.88.24)
10.116.82.50:/usr/local/sicem on /SICEM/usr type nfs (rw,vers=4,addr=10.116.82.50,clientaddr=10.116.88.24)
10.116.82.50:/opt/sigdb on /SICEM/opt/sigdb type nfs (rw,vers=4,addr=10.116.82.50,clientaddr=10.116.88.24)
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SICTD_DES on /des/sictd type nfs (rw,vers=4,addr=192.168.224.111,clientaddr=192.168.229.41)
-sh-4.1$ df -h /opt/jboss/jboss-eap/modules
Filesystem            Size  Used Avail Use% Mounted on
/dev/mapper/VG_PRINCIPAL-LV_JBOSS2
                       15G  2.9G   11G  21% /opt/jboss
-sh-4.1$
-sh-4.1$ ls -lat /opt/jboss_logs/jboss-eap-6.3/ 2>/dev/null | head -15
total 12
drwxr-xr-x 3 root root 4096 Nov 24  2025 .
drwxr-xr-x 3 root root 4096 Nov 24  2025 ..
drwxr-xr-x 2 root root 4096 Nov 24  2025 hc_sbrdeapllx0005
-sh-4.1$ ls -lat /logs/jboss-eap/ 2>/dev/null | head -15
total 12
drwxr-xr-x  3 jboss jboss 4096 Nov 23  2016 hc
drwxr-xr-x  3 jboss jboss 4096 Jul 15  2016 .
drwxr-xr-x. 4 root  root  4096 Jul 15  2016 ..
-sh-4.1$ ls -lat /opt/jboss/jboss-eap/domain/log/ 2>/dev/null | head -15
-sh-4.1$
-sh-4.1$
-sh-4.1$
