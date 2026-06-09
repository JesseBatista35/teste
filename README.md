[root@sbrdeapllx099 bin]# find /opt/jboss -name "*simcn*" -o -name "*SIMCN*" 2>/dev/null
[root@sbrdeapllx099 bin]# ls -la /upload/des/simcn* 2>/dev/null
total 16
drwxrwxr-x  9 jboss jboss  151 Set  5  2024 .
drwxrwxrwx 64 jboss jboss 4096 Jun 18  2024 ..
drwxrwxr-x  2 jboss jboss 4096 Ago 29  2024 baseConhecimento
drwxrwxr-x  2 jboss jboss   45 Jun  8  2023 cacheJson
drwxrwxr-x  2 jboss jboss   80 Abr  3  2023 certificados
drwxrwxr-x  2 jboss jboss 4096 Jun  3 16:05 conciliacao
drwxrwxr-x  2 jboss jboss   19 Jul  3  2023 padrao
drwxrwxr-x  2 jboss jboss   62 Set  5  2024 relatorioBatimento
drwxrwxr-x  3 jboss jboss 4096 Nov  4  2020 relatoriosLegados
[root@sbrdeapllx099 bin]# ls -la /projetos/simcn* 2>/dev/null
total 0
drwxr-xr-x 2 root root  6 Jun  5  2023 .
drwxr-xr-x 3 root root 18 Jun  3  2019 ..
[root@sbrdeapllx099 bin]# ls -la /uploadintegracao/des/simcn* 2>/dev/null
total 100
drwxrwxrwx 6 30000030 20000957  136 Abr 21 02:20 .
drwxrwxrwx 3 root     root       18 Out  1  2024 ..
-rwxrwxrwx 1 f695653  20000957  100 Abr  1 16:44 71.csv
drwxrwxr-x 2 jboss    20000957   59 Mar 19 15:45 cacheJson
drwxrwxr-x 3 jboss    20000957 1047 Mai 15 16:28 conciliacao
drwxrwxr-x 3 jboss    20000957   21 Mar 18 17:15 relatoriosLegados
drwxr-xr-x 2 30000030 20000957  138 Abr 21 02:20 tmp
[root@sbrdeapllx099 bin]# grep -i "simcn\|siosp" /opt/jboss/jboss-eap/hc/configuration/domain.xml | grep -i deployment
[root@sbrdeapllx099 bin]#
