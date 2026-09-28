cd /opt/ctmage/ctm/proclog
ls -lt *.log | head -10
tail -f $(ls -t AG_*.log | head -1)


ps -ef | grep -E "executa-job|siifx" | grep -v grep



Erase is control-H (^H).
[root@caddeapllx2695 data]# cd /opt/ctmage/ctm/proclog
[root@caddeapllx2695 proclog]#
[root@caddeapllx2695 proclog]#
[root@caddeapllx2695 proclog]# ls -lt *.log | head -10
-rw-r--r-- 1 ctmagelx ctmagelx    92120 set 28 13:44 AG_1191749.log
-rw-r--r-- 1 root     root         2127 set 28 13:44 start_ag_1190647.log
-rw-r--r-- 1 ctmagelx ctmagelx      344 set 28 13:44 MF_1191756.log
-rw-r--r-- 1 ctmagelx ctmagelx      344 set 28 13:44 DS_1191755.log
-rw-r--r-- 1 ctmagelx ctmagelx      344 set 28 13:44 GP_1191754.log
-rw-r--r-- 1 ctmagelx ctmagelx      344 set 28 13:44 CL_1191752.log
-rw-r--r-- 1 root     root         1940 set 28 13:44 ctmagj_1191563-2026-09-28.0.log
-rw-r--r-- 1 root     root        19213 set 28 13:43 agjstd_1191563-2026-09-28.0.log
-rw-r--r-- 1 root     root          827 set 28 13:43 spring_1191563-2026-09-28.0.log
-rw-r--r-- 1 root     root          396 set 28 13:43 shut_ag_1190100.log
[root@caddeapllx2695 proclog]#
[root@caddeapllx2695 proclog]#
[root@caddeapllx2695 proclog]# tail -f $(ls -t AG_*.log | head -1)
0928 13:44:05:635 AG(4):ag_main_get_config_data
0928 13:44:05:635 AG(4):ag_main_set_diag_levels
0928 13:44:05:635 AG(4):ag_main_get_diag
0928 13:44:05:635 AG(5):GM_PARAM_get: table:'CONFIG', key:'AGDBGLVL'
0928 13:44:05:635 AG(5):table 'CONFIG' already loaded
0928 13:44:05:635 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'AGDBGLVL', value:''
0928 13:44:05:635 AG(4):ag_main_get_diag
0928 13:44:05:635 AG(5):GM_PARAM_get: table:'CONFIG', key:'DBGLVL'
0928 13:44:05:635 AG(5):table 'CONFIG' already loaded
0928 13:44:05:635 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'DBGLVL', value:'0'


