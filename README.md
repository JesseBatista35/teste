
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# grep -o "Error Executing[^<]*" $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1) | sort -u
Error Executing REST request to https://sicsn.caixa : (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
Error Executing REST request to https://sicsn.caixa : java.lang.Exception: javax.net.ssl.SSLHandshakeException: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# ps -ef | grep -i java | grep -v grep | grep -o "^[^ ]*\|/[^ ]*/bin/java" | sort -u
/opt/ctmage/JRE/bin/java
root
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# ps -ef | grep -i java | grep -v grep | grep -oE "trustStore[^ ]*" | sort -u
trustStore=/opt/ctmage/ctm/cm/AI/data/security/apcerts
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# ls -la /opt/ctmage/ctm/cm/AI/data/security/
total 116
drwxr-xr-x 2 ctmagelx ctmagelx     33 mai  6 19:12 .
drwxrwxr-x 5 ctmagelx ctmagelx    189 out  6 14:27 ..
-rw-r--r-- 1 ctmagelx ctmagelx 112860 jun 24  2024 apcerts
-rw-r--r-- 1 ctmagelx ctmagelx     32 jun 24  2024 apks
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# find /opt/ctmage -name cacerts -path "*security*" 2>/dev/null
/opt/ctmage/JRE/lib/security/cacerts
[root@caddeapllx2695 tmp]#
