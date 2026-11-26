
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ cat /opt/ctmage/ctm/dailylog/daily_ctmag_20261119.log
1119 114154  20             AG           AGENT PROCESS 'AG' STOPPED AT 20261119114154 version=9.0.20.100, PID=2211107.
1119 114154  46             AG           Attempting to shut CM OS. Following CMs are next:
1119 114154  45             AG           CM OS received shutdown request.
1119 114155  20             AT           AGENT PROCESS 'AT' STOPPED AT 20261119114155 version=9.0.20.100, PID=2211168.
1119 114155  20             ATW000       AGENT PROCESS 'ATW000' STOPPED AT 20261119114155 version=9.0.20.100, PID=2211170.
1119 114157  19             AG           AGENT PROCESS 'AG' STARTED AT 20261119114157. PERSISTENT CONNECTION=N, SSL=N, owner=root, version=9.0.20.100, PID=3830591.
1119 114157  53             AT           AGENT PROCESS 'AT' STARTED AT 20261119114157, version=9.0.20.100, PID=3830652 , MULTITRACK_ENABLED Y.
1119 114157  53             ATW000       AGENT PROCESS 'ATW000' STARTED AT 20261119114157, version=9.0.20.100, PID=3830654 .
[p585600@caddeapllx2501 ~]$ ls -la /producao /producao/configuration
find / -name "*simil*.sh" 2>/dev/null
/producao:
total 16
drwxr-xr-x.  5 ctmagelx controlm  196 nov 19 11:41 .
dr-xr-xr-x. 20 root     root      283 out  1  2024 ..
drwxr-xr-x   2 ctmagelx controlm    6 mar 11  2026 carga
drwxr-xr-x   2 ctmagelx controlm  136 jul 21 11:49 configuration
-rwxr-xr-x   1 ctmagelx controlm  877 out 15 12:32 export_variables.sh
-rwxr-xr-x   1 ctmagelx controlm    0 mar 11  2026 sample.sh
-rwxr-xr-x   1 ctmagelx controlm 1339 out 15 12:32 script_simil_rotinas.sh
-rwxr-xr-x   1 ctmagelx controlm  657 mar 11  2026 script_simil.sh
-rwxr-xr-x   1 ctmagelx controlm 1339 nov 19 11:41 simil-precificacao-rotinas-batch.sh
drwxr-xr-x   2 ctmagelx controlm    6 mar 11  2026 suporte

/producao/configuration:
total 78728
drwxr-xr-x  2 ctmagelx controlm      136 jul 21 11:49 .
drwxr-xr-x. 5 ctmagelx controlm      196 nov 19 11:41 ..
-rwxr-xr-x  1 ctmagelx controlm       59 mar 11  2026 custom.sh
-rwxr-xr-x  1 ctmagelx controlm      785 jul 21 11:49 export_variables.sh
-rwxr-xr-x  1 ctmagelx controlm     2281 jul 21 11:49 logback.xml
-rwxr-xr-x  1 ctmagelx controlm      723 jul 21 11:49 script_simil.sh
-rwxr-xr-x  1 ctmagelx controlm 80597114 mar 11  2026 simil-precificacao-rotinas-batch.jar
/producao/script_simil.sh
/producao/configuration/script_simil.sh
/producao/script_simil_rotinas.sh
/producao/simil-precificacao-rotinas-batch.sh
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
