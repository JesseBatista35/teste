
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca# usr/gnu/bin/grep -a "Read timed out" /log_ias/ceflib/ceflib-dsv08.log | tail -3 | /usr/gnu/bin/grep -a -o -E "^[0-9:]{8}|Aplic\([^)]*\) Trans\. CICS\([^)]*\)|;[0-9]{4};;;;;;"
bash: usr/gnu/bin/grep: No such file or directory
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca# exit
exit
-bash-5.1$ usr/gnu/bin/grep -a "Read timed out" /log_ias/ceflib/ceflib-dsv08.log | tail -3 | /usr/gnu/bin/grep -a -o -E "^[0-9:]{8}|Aplic\([^)]*\) Trans\. CICS\([^)]*\)|;[0-9]{4};;;;;;"
12:44:32
Aplic(SINCO) Trans. CICS(BG00)
;9683;;;;;;
12:54:13
Aplic(SINCO) Trans. CICS(BG00)
;9683;;;;;;
13:10:56
Aplic(SINCO) Trans. CICS(BG00)
;9683;;;;;;
-bash-5.1$
-bash-5.1$
-bash-5.1$
-bash-5.1$
-bash-5.1$ getent hosts sirotcics
10.192.224.66   sirotcics ibmdes.caixa mqshgroup
-bash-5.1$
