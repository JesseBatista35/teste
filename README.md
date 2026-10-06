root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# ps -ef | grep -i java | grep -v grep | grep -oE "trustStorePassword[^ ]*" | sort -u
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# AP=/opt/ctmage/ctm/cm/AI/data/security/apcerts
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# cp -p $AP $AP.bkp.$(date +%Y%m%d%H%M)
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# /opt/ctmage/JRE/bin/keytool -importcert -noprompt -alias ac-interna-apl -file /tmp/ac_interna_apl.pem -keystore $AP -storepass appass
O certificado foi adicionado à área de armazenamento de chaves
[root@caddeapllx2695 tmp]# /opt/ctmage/JRE/bin/keytool -list -keystore $AP -storepass appass 2>/dev/null | grep -i "ac-interna"
ac-interna-apl, 6 de out. de 2026, trustedCertEntry,
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# chown ctmagelx:ctmagelx $AP
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# ls -la $AP
-rw-r--r-- 1 ctmagelx ctmagelx 114482 out  6 16:41 /opt/ctmage/ctm/cm/AI/data/security/apcerts
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# /opt/ctmage/ctm/scripts/shut-ag -u ctmagelx -p ALL
Killing Control-M/Agent Listener pid:91029
1 seconds - 91029 is still alive
2 seconds - 91029 is still alive
3 seconds - 91029 is still alive
4 seconds - 91029 is still alive
5 seconds - 91029 is still alive
6 seconds - 91029 is still alive
7 seconds - 91029 is still alive
8 seconds - 91029 is still alive
9 seconds - 91029 is still alive
2026-10-06 16:41:58 Listener process stopped
Killing Control-M/Agent Tracker pid:91094
2026-10-06 16:41:59 Tracker process stopped
Killing Control-M/Agent Java Process pid:90894
1 seconds - 90894 is still alive
2 seconds - 90894 is still alive
2026-10-06 16:42:02 Java Process process stopped
Control-M/Agent Remote Host is not running
[root@caddeapllx2695 tmp]# /opt/ctmage/ctm/scripts/start-ag -u ctmagelx -p ALL
Warning: coredumpsize limit required more than 8192 found 0. Please contact your System Administrator.


Starting the agent as 'root' user

Skipping Java validation due to missing files: check_java_ready.sh and/or supported_java.dat
Waiting for pid file of process agj to be created...
Control-M/Agent Agent Java Process started. pid: 93594

Control-M/Agent Listener started. pid: 93729

Control-M/Agent Tracker started. pid: 93794


Control-M/Agent started successfully.
[root@caddeapllx2695 tmp]# /opt/ctmage/ctm/scripts/start-ag -u ctmagelx -p ALL
Warning: coredumpsize limit required more than 8192 found 0. Please contact your System Administrator.


Starting the agent as 'root' user

Control-M/Agent java process is already running.
Control-M/Agent Listener started. pid: 93729

Control-M/Agent Tracker started. pid: 93794


Control-M/Agent started successfully.
[root@caddeapllx2695 tmp]#
