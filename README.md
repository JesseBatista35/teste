[p585600@caddeapllx2501 ~]$ ls -la /producao
total 12
drwxr-xr-x.  5 ctmagelx controlm  153 out 15 12:32 .
dr-xr-xr-x. 20 root     root      283 out  1  2024 ..
drwxr-xr-x   2 ctmagelx controlm    6 mar 11  2026 carga
drwxr-xr-x   2 ctmagelx controlm  136 jul 21 11:49 configuration
-rwxr-xr-x   1 ctmagelx controlm  877 out 15 12:32 export_variables.sh
-rwxr-xr-x   1 ctmagelx controlm    0 mar 11  2026 sample.sh
-rwxr-xr-x   1 ctmagelx controlm 1339 out 15 12:32 script_simil_rotinas.sh
-rwxr-xr-x   1 ctmagelx controlm  657 mar 11  2026 script_simil.sh
drwxr-xr-x   2 ctmagelx controlm    6 mar 11  2026 suporte
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ find /producao -name "*.sh" 2>/dev/null
/producao/sample.sh
/producao/script_simil.sh
/producao/configuration/custom.sh
/producao/configuration/script_simil.sh
/producao/configuration/export_variables.sh
/producao/export_variables.sh
/producao/script_simil_rotinas.sh
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ find / -name "simil-precificacao-rotinas-batch*" 2>/dev/null
/opt/batch/deploy/simil-precificacao-rotinas-batch.jar
/producao/configuration/simil-precificacao-rotinas-batch.jar
[p585600@caddeapllx2501 ~]$
