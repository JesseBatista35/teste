
[root@caddeapllx2695 proclog]#  cd /opt/ctmage/ctm/data
[root@caddeapllx2695 data]# sed -i -E 's/^(LOGICAL_AGENT_NAME\s+).*/\1caddeapllx2695.agil.nprd.caixa.gov.br/' CONFIG.dat
[root@caddeapllx2695 data]#
[root@caddeapllx2695 data]#
[root@caddeapllx2695 data]# /opt/ctmage/ctm/scripts/shut-ag -u ctmagelx -p ALL
Killing Control-M/Agent Listener pid:1191749
1 seconds - 1191749 is still alive
2 seconds - 1191749 is still alive
3 seconds - 1191749 is still alive
4 seconds - 1191749 is still alive
2026-09-28 16:02:35 Listener process stopped
Killing Control-M/Agent Tracker pid:1191816
2026-09-28 16:02:36 Tracker process stopped
Killing Control-M/Agent Java Process pid:1191563
1 seconds - 1191563 is still alive
2 seconds - 1191563 is still alive
2026-09-28 16:02:39 Java Process process stopped
Control-M/Agent Remote Host is not running
[root@caddeapllx2695 data]# /opt/ctmage/ctm/scripts/start-ag -u ctmagelx -p ALL
Warning: coredumpsize limit required more than 8192 found 0. Please contact your System Administrator.

Starting the agent as 'root' user

Skipping Java validation due to missing files: check_java_ready.sh and/or supported_java.dat
Waiting for pid file of process agj to be created...
Control-M/Agent Agent Java Process started. pid: 1195031

Control-M/Agent Listener started. pid: 1195205

Control-M/Agent Tracker started. pid: 1195286


Control-M/Agent started successfully.
[root@caddeapllx2695 data]#   grep -E "ORDERNO|orderno=[^,]|SUBMIT|JOB" /opt/ctmage/ctm/proclog/AG_*.log | grep -v "orderno=," | tail -20
/opt/ctmage/ctm/proclog/AG_1195205.log:0928 16:02:51:938 AG(3):OS_FILE_build_filetype Starting: orderno=libctmaged, runno=0, mode=28
/opt/ctmage/ctm/proclog/AG_1195205.log:0928 16:02:51:958 AG(3):OS_FILE_build_filetype Starting: orderno=AG, runno=0, mode=26
/opt/ctmage/ctm/proclog/AG_DIAG_COMM_1169602.log:0928 12:56:24:245 AG_DIAG_COMM(3):OS_FILE_build_filetype Starting: orderno=local.key, runno=0, mode=25
/opt/ctmage/ctm/proclog/AG_DIAG_COMM_1169602.log:0928 12:56:24:245 AG_DIAG_COMM(3):OS_FILE_build_filetype Starting: orderno=libctmaged, runno=0, mode=28
/opt/ctmage/ctm/proclog/AG_DIAG_COMM_1171641.log:0928 13:01:09:892 AG_DIAG_COMM(3):OS_FILE_build_filetype Starting: orderno=local.key, runno=0, mode=25
/opt/ctmage/ctm/proclog/AG_DIAG_COMM_1171641.log:0928 13:01:09:892 AG_DIAG_COMM(3):OS_FILE_build_filetype Starting: orderno=libctmaged, runno=0, mode=28
/opt/ctmage/ctm/proclog/AG_DIAG_COMM_1174134.log:0928 13:12:42:267 AG_DIAG_COMM(3):OS_FILE_build_filetype Starting: orderno=local.key, runno=0, mode=25
/opt/ctmage/ctm/proclog/AG_DIAG_COMM_1174134.log:0928 13:12:42:267 AG_DIAG_COMM(3):OS_FILE_build_filetype Starting: orderno=libctmaged, runno=0, mode=28
/opt/ctmage/ctm/proclog/AG_DIAG_COMM_1177026.log:0928 13:36:23:483 AG_DIAG_COMM(3):OS_FILE_build_filetype Starting: orderno=local.key, runno=0, mode=25
/opt/ctmage/ctm/proclog/AG_DIAG_COMM_1177026.log:0928 13:36:23:484 AG_DIAG_COMM(3):OS_FILE_build_filetype Starting: orderno=libctmaged, runno=0, mode=28
/opt/ctmage/ctm/proclog/AG_DIAG_COMM_1180820.log:0928 13:38:14:169 AG_DIAG_COMM(3):OS_FILE_build_filetype Starting: orderno=local.key, runno=0, mode=25
/opt/ctmage/ctm/proclog/AG_DIAG_COMM_1180820.log:0928 13:38:14:169 AG_DIAG_COMM(3):OS_FILE_build_filetype Starting: orderno=libctmaged, runno=0, mode=28
/opt/ctmage/ctm/proclog/AG_DIAG_COMM_1189832.log:0928 13:41:08:736 AG_DIAG_COMM(3):OS_FILE_build_filetype Starting: orderno=local.key, runno=0, mode=25
/opt/ctmage/ctm/proclog/AG_DIAG_COMM_1189832.log:0928 13:41:08:736 AG_DIAG_COMM(3):OS_FILE_build_filetype Starting: orderno=libctmaged, runno=0, mode=28
/opt/ctmage/ctm/proclog/AG_DIAG_COMM_1189885.log:0928 13:42:24:900 AG_DIAG_COMM(3):OS_FILE_build_filetype Starting: orderno=local.key, runno=0, mode=25
/opt/ctmage/ctm/proclog/AG_DIAG_COMM_1189885.log:0928 13:42:24:900 AG_DIAG_COMM(3):OS_FILE_build_filetype Starting: orderno=libctmaged, runno=0, mode=28
/opt/ctmage/ctm/proclog/AG_DIAG_COMM_1189932.log:0928 13:42:59:177 AG_DIAG_COMM(3):OS_FILE_build_filetype Starting: orderno=local.key, runno=0, mode=25
/opt/ctmage/ctm/proclog/AG_DIAG_COMM_1189932.log:0928 13:42:59:178 AG_DIAG_COMM(3):OS_FILE_build_filetype Starting: orderno=libctmaged, runno=0, mode=28
/opt/ctmage/ctm/proclog/AG_DIAG_COMM_1190055.log:0928 13:43:13:668 AG_DIAG_COMM(3):OS_FILE_build_filetype Starting: orderno=local.key, runno=0, mode=25
/opt/ctmage/ctm/proclog/AG_DIAG_COMM_1190055.log:0928 13:43:13:669 AG_DIAG_COMM(3):OS_FILE_build_filetype Starting: orderno=libctmaged, runno=0, mode=28
[root@caddeapllx2695 data]#
[root@caddeapllx2695 data]#
[root@caddeapllx2695 data]#
[root@caddeapllx2695 data]#
