<img width="1416" height="516" alt="image" src="https://github.com/user-attachments/assets/dc4723c4-40da-4e14-a5a8-212a20124452" />



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
0928 14:44:25:227: Control-M/Agent has encountered the following critical error:

0928 14:44:25:227 AG(0):ag_avstat_is_supported: Failed to load parameters for CM 'DATABASE'

PIM                      PLATFORM       PACKAGE-DATE   INSTALL-DATE   VERSION        INSTALL-TYPE   COMMENTS
___________________________________________________________________________________________________________________
DRKAI.9.0.22.100         Linux-x86_64   Mar-12-2026    Sep-16-2026    9.0.22.100     NEW            Agent 64-bit
DRAIT.9.0.22.100         Linux-x86_64   Feb-23-2026    Sep-16-2026    9.0.22.100     NEW            Application Integrator plugin
DR5V3.9.0.22.100         Linux-x86_64   Feb-11-2026    Sep-16-2026    9.0.22.100     NEW            Control-M Automation API CLI
DRFZ4.9.0.22.100         Linux-x86_64   Mar-10-2026    Sep-16-2026    9.0.22.100     NEW            Control-M  Agent
PAKAI.9.0.22.103         Linux-x86_64   Jun-25-2026    Sep-16-2026    9.0.22.103     PATCH          Control-M/Agent Patch 3
PAFZ4.9.0.22.103         Linux-x86_64   Jun-25-2026    Sep-16-2026    9.0.22.103     PATCH          Control-M  Agent
PAKAI.9.0.22.106         Linux-x86_64   Aug-11-2026    Sep-16-2026    9.0.22.106     PATCH          Control-M/Agent Patch 6
PAFZ4.9.0.22.106         Linux-x86_64   Aug-11-2026    Sep-16-2026    9.0.22.106     PATCH          Control-M  Agent

Full debug log containing the error:

>>> Start dump non active buffer
0928 14:37:24:876 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'NFS_PVC', value:''
0928 14:37:24:876 AG(4):<<< AG_TRACE_set_alive exit
0928 14:37:24:876 AG(5):GM_PARAM_get: table:'CONFIG', key:'JAVA_AR'
0928 14:37:24:876 AG(5):table 'CONFIG' already loaded
0928 14:37:24:876 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'JAVA_AR', value:'Y'
0928 14:37:24:876 AG(4):>>> OS_PROC_is_running enter, proc_type = 14
0928 14:37:24:876 AG(4):OS_PROC_check_lock
0928 14:37:24:876 AG(4):OS_PROC_check_lock: checking ./locks/AGJ.lock
0928 14:37:24:876 AG(4):OS_PROC_check_lock: lock file opened successfully
0928 14:37:24:876 AG(4):OS_PROC_check_lock: changing ownership of './locks/AGJ.lock' to agent owner
0928 14:37:24:876 AG(4):OS_FILE_set_agent_owner. path='./locks/AGJ.lock'
0928 14:37:24:876 AG(4):OS_PROC_check_lock: lock file ./locks/AGJ.lock is locked
0928 14:37:24:876 AG(4):OS_PROC_check_lock: exiting
0928 14:37:24:876 AG(4):OS_PROC_is_running: 14 process is already running
0928 14:37:24:876 AG(4):>>> OS_PROC_is_running exit with ret = 1
0928 14:37:24:876 AG(4):>>> AG_TRACE_check_alive enter. proc_type=14
0928 14:37:24:876 AG(4):AG_TRACE_check_alive: Life check for OS_PROC_TYPE_AGENT_JAVA process is not needed
0928 14:37:24:876 AG(4):OS_PROC_start_process:
0928 14:37:24:876 AG(4):OS_PROC_check_lock
0928 14:37:24:876 AG(4):OS_PROC_check_lock: checking ./locks/TRACKER.lock
0928 14:37:24:876 AG(4):OS_PROC_check_lock: lock file opened successfully
0928 14:37:24:876 AG(4):OS_PROC_check_lock: changing ownership of './locks/TRACKER.lock' to agent owner
0928 14:37:24:876 AG(4):OS_FILE_set_agent_owner. path='./locks/TRACKER.lock'
0928 14:37:24:876 AG(4):OS_PROC_check_lock: lock file ./locks/TRACKER.lock is locked
0928 14:37:24:876 AG(4):OS_PROC_check_lock: exiting
0928 14:37:24:876 AG(3):OS_PROC_start_process: AT process already running.
0928 14:37:24:876 AG(4):>>> AG_TRACE_check_alive enter. proc_type=4
0928 14:37:24:876 AG(3):OS_FILE_build_filetype Starting: orderno=, runno=4, mode=13
0928 14:37:24:876 AG(4):>>> OS_FILE_get_life_check_file enter
0928 14:37:24:876 AG(5):OS_FILE_get_life_check_file file is tracker_is_alive
0928 14:37:24:876 AG(4):<<< OS_FILE_get_life_check_file exit
0928 14:37:24:876 AG(4):OS_FILE_stat enter: file_name = '/opt/ctmage/ctm/./temp/tracker_is_alive'
0928 14:37:24:876 AG(4):size in bytes = 0, modify timestamp = '20260928143708331'
0928 14:37:24:876 AG(5):AG_TRACE_check_alive: CreateTime: 20260928143708331 ModifyTime: 20260928143708331
0928 14:37:24:876 AG(4):AG_TRACE_check_alive: file - /opt/ctmage/ctm/./temp/tracker_is_alive last update in minutes - 0
0928 14:37:24:876 AG(5):GM_PARAM_get: table:'CONFIG', key:'AT_NOT_RESPONDING_TIME'
0928 14:37:24:876 AG(5):table 'CONFIG' already loaded
0928 14:37:24:876 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'AT_NOT_RESPONDING_TIME', value:''
0928 14:37:24:876 AG(4):AG_TRACE_check_alive: Could not get parameter AT_NOT_RESPONDING_TIME using default value 3
0928 14:37:24:876 AG(5):GM_PARAM_get: table:'CONFIG', key:'PROCESS_NOT_RESPONDING_ALERT_INTERVAL'
0928 14:37:24:876 AG(5):table 'CONFIG' already loaded
0928 14:37:24:876 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'PROCESS_NOT_RESPONDING_ALERT_INTERVAL', value:''
0928 14:37:24:876 AG(4):AG_TRACE_check_alive: Could not get parameter PROCESS_NOT_RESPONDING_ALERT_INTERVAL using default value 60
0928 14:37:24:876 AG(4):<<< AG_TRACE_check_alive exit
0928 14:37:24:876 AG(4):>>> AG_COLLECT_workload enter
0928 14:37:24:876 AG(4):>>> ag_collect_build_cpu_specs_list Enter. include_disabled=0, current number of list entries=0
0928 14:37:24:876 AG(4):ag_collect_build_cpu_specs_list: Loading list of Server codes
0928 14:37:24:876 AG(4):>>> AG_MAIN_get_server_codes_list Enter. include_disabled=0
0928 14:37:24:876 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:37:24:876 AG(4):>>> AG_MAIN_get_server_codes_list Exit. rc=1, server_codes_list count=1
0928 14:37:24:876 AG(4):>>> AG_MAIN_read_server_conf Enter. server_code=, key='WKL_NODEID_CPU_UPDATE'
0928 14:37:24:876 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:37:24:877 AG(5):AG_MAIN_read_server_conf Multi Server is not enabled. Reading 'WKL_NODEID_CPU_UPDATE' from CONFIG
0928 14:37:24:877 AG(5):GM_PARAM_get: table:'CONFIG', key:'WKL_NODEID_CPU_UPDATE'
0928 14:37:24:877 AG(5):table 'CONFIG' already loaded
0928 14:37:24:877 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'WKL_NODEID_CPU_UPDATE', value:''
0928 14:37:24:877 AG(4):>>> AG_MAIN_read_server_conf Exit. server_code=, key='WKL_NODEID_CPU_UPDATE', rc=6, value=''
0928 14:37:24:877 AG(5):ag_collect_build_cpu_specs_list: Server code '', cpuUpdate 0
0928 14:37:24:877 AG(5):ag_collect_build_cpu_specs_list: Add Server code '' with new cpuUpdate 0
0928 14:37:24:877 AG(4):ag_collect_build_cpu_specs_list: Remove entries with cpuUpdate = 0
0928 14:37:24:877 AG(5):ag_collect_build_cpu_specs_list: Remove Server code '' from list
0928 14:37:24:877 AG(4):>>> ag_collect_build_cpu_specs_list Exit. cpu_specs_list count=0
0928 14:37:24:877 AG(4):<<< AG_COLLECT_workload exit. CPU Workload collection is OFF
0928 14:37:24:877 AG(5):GM_PARAM_get: table:'CONFIG', key:'UPLOAD_REMOTE_UTILS'
0928 14:37:24:877 AG(5):table 'CONFIG' already loaded
0928 14:37:24:877 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'UPLOAD_REMOTE_UTILS', value:'N'
0928 14:37:24:877 AG(4):AG_main_watchdog: remote_utils - 'N'
0928 14:37:24:877 AG(3):GM_PARAM_load Starting: Table='RHCONF', flag=GM_PARAM_LOAD_NOFORCE
0928 14:37:24:877 AG(4):OS_FILE_stat enter: file_name = './data/RHCONF.dat'
0928 14:37:24:877 AG(4):size in bytes = 56, modify timestamp = '20260916123155260'
0928 14:37:24:877 AG(4):GM_PARAM_load: Table 'RHCONF' was not modified
0928 14:37:24:877 AG(5):GM_PARAM_get: table:'RHCONF', key:'JAVA_RH'
0928 14:37:24:877 AG(5):table 'RHCONF' already loaded
0928 14:37:24:877 AG(4):GM_PARAM_get: rc = 1, table:'RHCONF', key:'JAVA_RH', value:'N'
0928 14:37:24:877 AG(4):AG_main_watchdog: java_rh - 'N'
0928 14:37:24:877 AG(5):GM_PARAM_get: table:'RHCONF', key:'JAVA_RH_UPGRADE'
0928 14:37:24:877 AG(5):table 'RHCONF' already loaded
0928 14:37:24:877 AG(4):GM_PARAM_get: rc = 6, table:'RHCONF', key:'JAVA_RH_UPGRADE', value:''
0928 14:37:24:877 AG(4):AG_main_watchdog: java_rh_upgrade - 'N'
0928 14:37:24:877 AG(3):>>> OS_PROC_housekeeping
0928 14:37:24:877 AG(5):GM_PARAM_get: table:'CONFIG', key:'AGENT_DIR'
0928 14:37:24:877 AG(5):table 'CONFIG' already loaded
0928 14:37:24:877 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'AGENT_DIR', value:'/opt/ctmage/ctm'
0928 14:37:24:877 AG(5):OS_FILE_check_existence: file name - '/opt/ctmage/ctm/core'  mode - '0'
0928 14:37:24:877 AG(4):OS_FILE_check_existence: file '/opt/ctmage/ctm/core' doesn't exist
0928 14:37:24:877 AG(3):<<< OS_PROC_housekeeping
0928 14:37:24:877 AG(4):>>> AG_COLLECT_get_specs enter
0928 14:37:24:877 AG(5):GM_PARAM_get: table:'CONFIG', key:'CPU_SPEC_INTERVAL'
0928 14:37:24:877 AG(5):table 'CONFIG' already loaded
0928 14:37:24:877 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'CPU_SPEC_INTERVAL', value:''
0928 14:37:24:877 AG(4):GM_COLLECT_getCpuSpecInterval used interval: '240'
0928 14:37:24:877 AG(4):<<< AG_COLLECT_get_specs exit. 53 minutes since last update. No need for Updating
0928 14:37:24:877 AG(4):>>> AG_AVSTAT_check_availability enter
0928 14:37:24:877 AG(5):>>> GM_AVSTAT_getAvailabilityIntervals Enter
0928 14:37:24:877 AG(5):GM_PARAM_get: table:'CONFIG', key:'CMACC_AV_INTERVAL'
0928 14:37:24:877 AG(5):table 'CONFIG' already loaded
0928 14:37:24:877 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'CMACC_AV_INTERVAL', value:'3600'
0928 14:37:24:877 AG(5):GM_PARAM_get: table:'CONFIG', key:'CMACC_UNAV_INTERVAL'
0928 14:37:24:877 AG(5):table 'CONFIG' already loaded
0928 14:37:24:877 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'CMACC_UNAV_INTERVAL', value:'90'
0928 14:37:24:877 AG(4):GM_AVSTAT_getAvailabilityIntervals Availability interval: '3600' seconds
0928 14:37:24:877 AG(4):GM_AVSTAT_getAvailabilityIntervals Unavailability interval: '90' seconds
0928 14:37:24:877 AG(5):>>> GM_AVSTAT_getAvailabilityIntervals Exit
0928 14:37:24:877 AG(4):60 seconds since last test of unavailable CM accounts
0928 14:37:24:877 AG(4):3202 seconds since last test of all CM accounts
0928 14:37:24:877 AG(4):Not yet time for unavailable accounts testing
0928 14:37:24:877 AG(4):Not yet time for all accounts testing
0928 14:37:24:877 AG(4):<<< AG_AVSTAT_check_availability: Nothing to do. Exiting
0928 14:37:24:877 AG(4):>>> ag_main_check_Refresh_CMList enter. Persistent connection: Y, Connection established = 1, first = 0
0928 14:37:24:877 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:37:24:877 AG(5):GM_PARAM_get: table:'CONFIG', key:'PERSISTENT_CONNECTION'
0928 14:37:24:877 AG(5):table 'CONFIG' already loaded
0928 14:37:24:877 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'PERSISTENT_CONNECTION', value:'N'
0928 14:37:24:877 AG(5):>>> AG_MAIN_is_Saas Enter. server_code=Current, primary_only=1
0928 14:37:24:877 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:37:24:877 AG(5):AG_MAIN_is_Saas Multi Server is not enabled. Reading from CONFIG
0928 14:37:24:877 AG(4):GM_PARAM_is_SAAS_on
0928 14:37:24:877 AG(5):GM_PARAM_get: table:'CONFIG', key:'INSTALL_CAT_TEST'
0928 14:37:24:877 AG(5):table 'CONFIG' already loaded
0928 14:37:24:877 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'INSTALL_CAT_TEST', value:''
0928 14:37:24:877 AG(5):GM_PARAM_get: table:'CONFIG', key:'INSTALL_CATEGORY'
0928 14:37:24:877 AG(5):table 'CONFIG' already loaded
0928 14:37:24:877 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'INSTALL_CATEGORY', value:'REG'
0928 14:37:24:877 AG(4):GM_PARAM_is_SAAS_on: SAAS is disabled
0928 14:37:24:877 AG(5):>>> AG_MAIN_is_Saas Exit. server_code=Current, primary_only=1, ret=0
0928 14:37:24:877 AG(5):GM_PARAM_get: table:'CONFIG', key:'CMLIST'
0928 14:37:24:877 AG(5):table 'CONFIG' already loaded
0928 14:37:24:877 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'CMLIST', value:'OS | AI | DATABASE'
0928 14:37:24:877 AG(3):ag_main_check_Refresh_CMList:    Current  CMLIST 'OS | AI | DATABASE'
0928 14:37:24:877 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:37:24:877 AG(5):GM_PARAM_get: table:'CONFIG', key:'CM_LIST_SENT2CTMS'
0928 14:37:24:877 AG(5):table 'CONFIG' already loaded
0928 14:37:24:877 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'CM_LIST_SENT2CTMS', value:'OS | AI | DATABASE'
0928 14:37:24:877 AG(4):ag_main_check_Refresh_CMList: CMLIST was not updated since last sent to CTMS
0928 14:37:24:877 AG(4):>>> ag_main_check_Send_GetPing enter. Persistent connection: Y, Connection established = 1, first = 0
0928 14:37:24:877 AG(5):GM_PARAM_get: table:'CONFIG', key:'SEND_GETPING'
0928 14:37:24:877 AG(5):table 'CONFIG' already loaded
0928 14:37:24:877 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'SEND_GETPING', value:''
0928 14:37:24:877 AG(3):GM_PARAM_load Starting: Table='CONFIG', flag=GM_PARAM_LOAD_FORCE
0928 14:37:24:877 AG(4):>>> GM_PARAM_check_and_rename_audit_log enter
0928 14:37:24:877 AG(5):OS_FILE_check_existence: file name - './data/CONFAUDT'  mode - '0'
0928 14:37:24:877 AG(4):OS_FILE_check_existence: file './data/CONFAUDT' doesn't exist
0928 14:37:24:877 AG(4):GM_PARAM_check_and_rename_audit_log: Audit log file './data/CONFAUDT' with config changes not found
0928 14:37:24:877 AG(4):<<< GM_PARAM_check_and_rename_audit_log exit. rc=2
0928 14:37:24:877 AG(5):GM_PARAM_load: Audit log file './data/CONFAUDT' was not found or not renamed. rc_audit_log = 2
0928 14:37:24:877 AG(4):OS_FILE_stat enter: file_name = './data/CONFIG.dat'
0928 14:37:24:877 AG(4):size in bytes = 3175, modify timestamp = '20260928134408520'
0928 14:37:24:877 AG(3):GM_PARAM_load_file Starting. File: ./data/CONFIG.dat
0928 14:37:24:877 AG(4):OS_FILE_fopen started : ./data/CONFIG.dat. mode=4
0928 14:37:24:877 AG(4):OS_FILE_fopen : opened 5
0928 14:37:24:877 AG(4):OS_FILE_fclose started 5
0928 14:37:24:877 AG(4):OS_FILE_fclose ended
0928 14:37:24:877 AG(3):GM_PARAM_load_file Exiting. File: ./data/CONFIG.dat. rc=1
0928 14:37:24:877 AG(3):GM_PARAM_load Exiting: Table='CONFIG', flag=GM_PARAM_LOAD_FORCE, rc=1
0928 14:37:24:877 AG(4):GM_PARAM_delete: Enter
0928 14:37:24:877 AG(5):table 'CONFIG' already loaded
0928 14:37:24:877 AG(5):GM_PARAM_delete: table_find rc 1
0928 14:37:24:877 AG(5):GM_PARAM_delete: list_delete rc 6
0928 14:37:24:877 AG(4):GM_PARAM_delete: Exit. rc = 6
0928 14:37:24:877 AG(3):ag_main_check_Send_GetPing:    Number of CONFIG tries: '0'
0928 14:37:24:877 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:37:24:877 AG(4):<<< ag_main_check_Send_GetPing exit
0928 14:37:24:877 AG(4):>>> ag_main_checkDiskFreeSpace enter
0928 14:37:24:877 AG(5):GM_PARAM_get: table:'CONFIG', key:'CHECK_DISKSPACE_INTERVAL'
0928 14:37:24:877 AG(5):table 'CONFIG' already loaded
0928 14:37:24:877 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'CHECK_DISKSPACE_INTERVAL', value:''
0928 14:37:24:877 AG(4):ag_main_checkDiskFreeSpace: Check disk space configuration interval is 3600 seconds
0928 14:37:24:877 AG(4):ag_main_checkDiskFreeSpace: It is not yet time to check disk space
0928 14:37:24:877 AG(4):<<< ag_main_checkDiskFreeSpace exit
0928 14:37:24:877 AG(4):>>> ag_main_merge_files enter
0928 14:37:24:877 AG(5):GM_PARAM_get: table:'CONFIG', key:'WRITE_MERGE_INTERVAL'
0928 14:37:24:877 AG(5):table 'CONFIG' already loaded
0928 14:37:24:877 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'WRITE_MERGE_INTERVAL', value:''
0928 14:37:24:877 AG(4):<<< ag_main_merge_files exit
0928 14:37:24:877 AG(4):>>> ag_main_checkConfigAuditLog enter
0928 14:37:24:877 AG(4):>>> GM_PARAM_check_and_rename_audit_log enter
0928 14:37:24:877 AG(5):OS_FILE_check_existence: file name - './data/CONFAUDT'  mode - '0'
0928 14:37:24:877 AG(4):OS_FILE_check_existence: file './data/CONFAUDT' doesn't exist
0928 14:37:24:877 AG(4):GM_PARAM_check_and_rename_audit_log: Audit log file './data/CONFAUDT' with config changes not found
0928 14:37:24:877 AG(4):<<< GM_PARAM_check_and_rename_audit_log exit. rc=2
0928 14:37:24:877 AG(4):ag_main_checkConfigAuditLog: Audit log file './data/CONFAUDT' with config changes not found
0928 14:37:24:877 AG(4):<<< ag_main_checkConfigAuditLog exit
0928 14:37:24:877 AG(4):GM_MEASURE_write_stats: Entering. Number of measures=0
0928 14:37:24:877 AG(4):gm_measure_init_file: Entering
0928 14:37:24:877 AG(5):OS_FILE_check_existence: file name - 'measure/AG_1191749.csv'  mode - '0'
0928 14:37:24:877 AG(4):OS_FILE_check_existence: file 'measure/AG_1191749.csv' exists
0928 14:37:24:877 AG(4):gm_measure_init_file: Exiting
0928 14:37:24:877 AG(4):OS_COMM_sess_open
0928 14:37:24:877 AG(4):OS_COMM_sess_open: in server find port mode
0928 14:37:24:877 AG(5):OS_COMM_sess_open: Entering select. Timeout=60
0928 14:38:24:937 AG(2):OS_COMM_sess_open: select timed out, interval: 60
0928 14:38:24:937 AG(4):AG_MAIN_loop OS_COMM_sess_open returned TIME_OUT
0928 14:38:24:937 AG(4):>>> ag_main_check_shutdown_signal enter
0928 14:38:24:937 AG(3):OS_FILE_build_filetype Starting: orderno=, runno=0, mode=37
0928 14:38:24:937 AG(5):OS_FILE_check_existence: file name - './temp/AGSHUT'  mode - '0'
0928 14:38:24:937 AG(4):OS_FILE_check_existence: file './temp/AGSHUT' doesn't exist
0928 14:38:24:937 AG(4):<<< ag_main_check_shutdown_signal exit
0928 14:38:24:937 AG(4):ag_main_check_reg_change
0928 14:38:24:937 AG(3):GM_PARAM_load Starting: Table='CONFIG', flag=GM_PARAM_LOAD_NOFORCE
0928 14:38:24:937 AG(4):OS_FILE_stat enter: file_name = './data/CONFIG.dat'
0928 14:38:24:937 AG(4):size in bytes = 3175, modify timestamp = '20260928134408520'
0928 14:38:24:937 AG(4):GM_PARAM_load: Table 'CONFIG' was not modified
0928 14:38:24:937 AG(4):GM_PARAM_table_get_last_load_time: Table='CONFIG'
0928 14:38:24:937 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:38:24:937 AG(4):ag_main_check_reg_change: Tables CONFIG is up-to-date. Last load time is 20260928134408520
0928 14:38:24:937 AG(4):ag_main_check_reg_change: Tables SVRCONF is up-to-date. Last load time is
0928 14:38:24:937 AG(4):ag_main_check_reg_change: Exit with: 2
0928 14:38:24:937 AG(4):AG_MAIN_loop: Listener process has been running for 0 days 0 hours 54 minutes 22 seconds since 20260928134402
0928 14:38:24:937 AG(3):AG_main_watchdog
0928 14:38:24:937 AG(4):GM_PARAM_is_watchdog_on
0928 14:38:24:937 AG(3):OS_FILE_build_filetype Starting: orderno=WATCHDOG_ENABLED, runno=0, mode=15
0928 14:38:24:937 AG(5):OS_FILE_check_existence: file name - './temp/WATCHDOG_ENABLED_N.cfg'  mode - '0'
0928 14:38:24:937 AG(4):OS_FILE_check_existence: file './temp/WATCHDOG_ENABLED_N.cfg' doesn't exist
0928 14:38:24:937 AG(5):GM_PARAM_get: table:'CONFIG', key:'WATCHDOG_ENABLED'
0928 14:38:24:937 AG(5):table 'CONFIG' already loaded
0928 14:38:24:937 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'WATCHDOG_ENABLED', value:'Y'
0928 14:38:24:937 AG(4):Watchdog is enabled
0928 14:38:24:937 AG(4):>>> AG_TRACE_set_alive enter
0928 14:38:24:937 AG(3):OS_FILE_build_filetype Starting: orderno=, runno=2, mode=13
0928 14:38:24:937 AG(4):>>> OS_FILE_get_life_check_file enter
0928 14:38:24:937 AG(5):OS_FILE_get_life_check_file file is listener_is_alive
0928 14:38:24:937 AG(4):<<< OS_FILE_get_life_check_file exit
0928 14:38:24:937 AG(4):OS_FILE_open
0928 14:38:24:937 AG(4):file_name='/opt/ctmage/ctm/./temp/listener_is_alive'
0928 14:38:24:937 AG(4):OS_FILE_open: Agent Owner Id: '20003596', Group Id: '20000299'
0928 14:38:24:937 AG(4):OS_FILE_open succeeded: opened descriptor 5
0928 14:38:24:937 AG(4):OS_FILE_close: Closing descriptor 5
0928 14:38:24:937 AG(4):OS_FILE_close ended successfully
0928 14:38:24:937 AG(4):>>> OS_PROC_is_agent_on_NFS enter
0928 14:38:24:937 AG(5):GM_PARAM_get: table:'CONFIG', key:'INSTALL_TYPE'
0928 14:38:24:937 AG(5):table 'CONFIG' already loaded
0928 14:38:24:937 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'INSTALL_TYPE', value:'local'
0928 14:38:24:937 AG(4):>>> OS_PROC_is_agent_on_NFS_PVC enter
0928 14:38:24:937 AG(5):GM_PARAM_get: table:'CONFIG', key:'NFS_PVC'
0928 14:38:24:937 AG(5):table 'CONFIG' already loaded
0928 14:38:24:937 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'NFS_PVC', value:''
0928 14:38:24:937 AG(4):<<< AG_TRACE_set_alive exit
0928 14:38:24:937 AG(5):GM_PARAM_get: table:'CONFIG', key:'JAVA_AR'
0928 14:38:24:937 AG(5):table 'CONFIG' already loaded
0928 14:38:24:937 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'JAVA_AR', value:'Y'
0928 14:38:24:937 AG(4):>>> OS_PROC_is_running enter, proc_type = 14
0928 14:38:24:937 AG(4):OS_PROC_check_lock
0928 14:38:24:937 AG(4):OS_PROC_check_lock: checking ./locks/AGJ.lock
0928 14:38:24:937 AG(4):OS_PROC_check_lock: lock file opened successfully
0928 14:38:24:937 AG(4):OS_PROC_check_lock: changing ownership of './locks/AGJ.lock' to agent owner
0928 14:38:24:937 AG(4):OS_FILE_set_agent_owner. path='./locks/AGJ.lock'
0928 14:38:24:937 AG(4):OS_PROC_check_lock: lock file ./locks/AGJ.lock is locked
0928 14:38:24:937 AG(4):OS_PROC_check_lock: exiting
0928 14:38:24:937 AG(4):OS_PROC_is_running: 14 process is already running
0928 14:38:24:937 AG(4):>>> OS_PROC_is_running exit with ret = 1
0928 14:38:24:938 AG(4):>>> AG_TRACE_check_alive enter. proc_type=14
0928 14:38:24:938 AG(4):AG_TRACE_check_alive: Life check for OS_PROC_TYPE_AGENT_JAVA process is not needed
0928 14:38:24:938 AG(4):OS_PROC_start_process:
0928 14:38:24:938 AG(4):OS_PROC_check_lock
0928 14:38:24:938 AG(4):OS_PROC_check_lock: checking ./locks/TRACKER.lock
0928 14:38:24:938 AG(4):OS_PROC_check_lock: lock file opened successfully
0928 14:38:24:938 AG(4):OS_PROC_check_lock: changing ownership of './locks/TRACKER.lock' to agent owner
0928 14:38:24:938 AG(4):OS_FILE_set_agent_owner. path='./locks/TRACKER.lock'
0928 14:38:24:938 AG(4):OS_PROC_check_lock: lock file ./locks/TRACKER.lock is locked
0928 14:38:24:938 AG(4):OS_PROC_check_lock: exiting
0928 14:38:24:938 AG(3):OS_PROC_start_process: AT process already running.
0928 14:38:24:938 AG(4):>>> AG_TRACE_check_alive enter. proc_type=4
0928 14:38:24:938 AG(3):OS_FILE_build_filetype Starting: orderno=, runno=4, mode=13
0928 14:38:24:938 AG(4):>>> OS_FILE_get_life_check_file enter
0928 14:38:24:938 AG(5):OS_FILE_get_life_check_file file is tracker_is_alive
0928 14:38:24:938 AG(4):<<< OS_FILE_get_life_check_file exit
0928 14:38:24:938 AG(4):OS_FILE_stat enter: file_name = '/opt/ctmage/ctm/./temp/tracker_is_alive'
0928 14:38:24:938 AG(4):size in bytes = 0, modify timestamp = '20260928143808313'
0928 14:38:24:938 AG(5):AG_TRACE_check_alive: CreateTime: 20260928143808313 ModifyTime: 20260928143808313
0928 14:38:24:938 AG(4):AG_TRACE_check_alive: file - /opt/ctmage/ctm/./temp/tracker_is_alive last update in minutes - 0
0928 14:38:24:938 AG(5):GM_PARAM_get: table:'CONFIG', key:'AT_NOT_RESPONDING_TIME'
0928 14:38:24:938 AG(5):table 'CONFIG' already loaded
0928 14:38:24:938 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'AT_NOT_RESPONDING_TIME', value:''
0928 14:38:24:938 AG(4):AG_TRACE_check_alive: Could not get parameter AT_NOT_RESPONDING_TIME using default value 3
0928 14:38:24:938 AG(5):GM_PARAM_get: table:'CONFIG', key:'PROCESS_NOT_RESPONDING_ALERT_INTERVAL'
0928 14:38:24:938 AG(5):table 'CONFIG' already loaded
0928 14:38:24:938 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'PROCESS_NOT_RESPONDING_ALERT_INTERVAL', value:''
0928 14:38:24:938 AG(4):AG_TRACE_check_alive: Could not get parameter PROCESS_NOT_RESPONDING_ALERT_INTERVAL using default value 60
0928 14:38:24:938 AG(4):<<< AG_TRACE_check_alive exit
0928 14:38:24:938 AG(4):>>> AG_COLLECT_workload enter
0928 14:38:24:938 AG(4):>>> ag_collect_build_cpu_specs_list Enter. include_disabled=0, current number of list entries=0
0928 14:38:24:938 AG(4):ag_collect_build_cpu_specs_list: Loading list of Server codes
0928 14:38:24:938 AG(4):>>> AG_MAIN_get_server_codes_list Enter. include_disabled=0
0928 14:38:24:938 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:38:24:938 AG(4):>>> AG_MAIN_get_server_codes_list Exit. rc=1, server_codes_list count=1
0928 14:38:24:938 AG(4):>>> AG_MAIN_read_server_conf Enter. server_code=, key='WKL_NODEID_CPU_UPDATE'
0928 14:38:24:938 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:38:24:938 AG(5):AG_MAIN_read_server_conf Multi Server is not enabled. Reading 'WKL_NODEID_CPU_UPDATE' from CONFIG
0928 14:38:24:938 AG(5):GM_PARAM_get: table:'CONFIG', key:'WKL_NODEID_CPU_UPDATE'
0928 14:38:24:938 AG(5):table 'CONFIG' already loaded
0928 14:38:24:938 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'WKL_NODEID_CPU_UPDATE', value:''
0928 14:38:24:938 AG(4):>>> AG_MAIN_read_server_conf Exit. server_code=, key='WKL_NODEID_CPU_UPDATE', rc=6, value=''
0928 14:38:24:938 AG(5):ag_collect_build_cpu_specs_list: Server code '', cpuUpdate 0
0928 14:38:24:938 AG(5):ag_collect_build_cpu_specs_list: Add Server code '' with new cpuUpdate 0
0928 14:38:24:938 AG(4):ag_collect_build_cpu_specs_list: Remove entries with cpuUpdate = 0
0928 14:38:24:938 AG(5):ag_collect_build_cpu_specs_list: Remove Server code '' from list
0928 14:38:24:938 AG(4):>>> ag_collect_build_cpu_specs_list Exit. cpu_specs_list count=0
0928 14:38:24:938 AG(4):<<< AG_COLLECT_workload exit. CPU Workload collection is OFF
0928 14:38:24:938 AG(5):GM_PARAM_get: table:'CONFIG', key:'UPLOAD_REMOTE_UTILS'
0928 14:38:24:938 AG(5):table 'CONFIG' already loaded
0928 14:38:24:938 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'UPLOAD_REMOTE_UTILS', value:'N'
0928 14:38:24:938 AG(4):AG_main_watchdog: remote_utils - 'N'
0928 14:38:24:938 AG(3):GM_PARAM_load Starting: Table='RHCONF', flag=GM_PARAM_LOAD_NOFORCE
0928 14:38:24:938 AG(4):OS_FILE_stat enter: file_name = './data/RHCONF.dat'
0928 14:38:24:938 AG(4):size in bytes = 56, modify timestamp = '20260916123155260'
0928 14:38:24:938 AG(4):GM_PARAM_load: Table 'RHCONF' was not modified
0928 14:38:24:938 AG(5):GM_PARAM_get: table:'RHCONF', key:'JAVA_RH'
0928 14:38:24:938 AG(5):table 'RHCONF' already loaded
0928 14:38:24:938 AG(4):GM_PARAM_get: rc = 1, table:'RHCONF', key:'JAVA_RH', value:'N'
0928 14:38:24:938 AG(4):AG_main_watchdog: java_rh - 'N'
0928 14:38:24:938 AG(5):GM_PARAM_get: table:'RHCONF', key:'JAVA_RH_UPGRADE'
0928 14:38:24:938 AG(5):table 'RHCONF' already loaded
0928 14:38:24:938 AG(4):GM_PARAM_get: rc = 6, table:'RHCONF', key:'JAVA_RH_UPGRADE', value:''
0928 14:38:24:938 AG(4):AG_main_watchdog: java_rh_upgrade - 'N'
0928 14:38:24:938 AG(3):>>> OS_PROC_housekeeping
0928 14:38:24:938 AG(5):GM_PARAM_get: table:'CONFIG', key:'AGENT_DIR'
0928 14:38:24:938 AG(5):table 'CONFIG' already loaded
0928 14:38:24:938 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'AGENT_DIR', value:'/opt/ctmage/ctm'
0928 14:38:24:938 AG(5):OS_FILE_check_existence: file name - '/opt/ctmage/ctm/core'  mode - '0'
0928 14:38:24:938 AG(4):OS_FILE_check_existence: file '/opt/ctmage/ctm/core' doesn't exist
0928 14:38:24:938 AG(3):<<< OS_PROC_housekeeping
0928 14:38:24:938 AG(4):>>> AG_COLLECT_get_specs enter
0928 14:38:24:938 AG(5):GM_PARAM_get: table:'CONFIG', key:'CPU_SPEC_INTERVAL'
0928 14:38:24:938 AG(5):table 'CONFIG' already loaded
0928 14:38:24:938 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'CPU_SPEC_INTERVAL', value:''
0928 14:38:24:938 AG(4):GM_COLLECT_getCpuSpecInterval used interval: '240'
0928 14:38:24:938 AG(4):<<< AG_COLLECT_get_specs exit. 54 minutes since last update. No need for Updating
0928 14:38:24:938 AG(4):>>> AG_AVSTAT_check_availability enter
0928 14:38:24:938 AG(5):>>> GM_AVSTAT_getAvailabilityIntervals Enter
0928 14:38:24:938 AG(5):GM_PARAM_get: table:'CONFIG', key:'CMACC_AV_INTERVAL'
0928 14:38:24:938 AG(5):table 'CONFIG' already loaded
0928 14:38:24:938 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'CMACC_AV_INTERVAL', value:'3600'
0928 14:38:24:938 AG(5):GM_PARAM_get: table:'CONFIG', key:'CMACC_UNAV_INTERVAL'
0928 14:38:24:938 AG(5):table 'CONFIG' already loaded
0928 14:38:24:938 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'CMACC_UNAV_INTERVAL', value:'90'
0928 14:38:24:938 AG(4):GM_AVSTAT_getAvailabilityIntervals Availability interval: '3600' seconds
0928 14:38:24:938 AG(4):GM_AVSTAT_getAvailabilityIntervals Unavailability interval: '90' seconds
0928 14:38:24:938 AG(5):>>> GM_AVSTAT_getAvailabilityIntervals Exit
0928 14:38:24:938 AG(4):120 seconds since last test of unavailable CM accounts
0928 14:38:24:938 AG(4):3262 seconds since last test of all CM accounts
0928 14:38:24:938 AG(4):Time to test unavailable accounts
0928 14:38:24:938 AG(4):Not yet time for all accounts testing
0928 14:38:24:938 AG(3):>>> GM_AVSTAT_get_unavailable_cmlist Enter
0928 14:38:24:938 AG(3):OS_FILE_build_filetype Starting: orderno=, runno=0, mode=22
0928 14:38:24:938 AG(4):os_file_normalize_filename: In file name '', Out file name ''
0928 14:38:24:938 AG(4):OS_FILE_dir_open
0928 14:38:24:938 AG(4):dir_name:<./data/av_status>
0928 14:38:24:938 AG(4):OS_FILE_dir_next
0928 14:38:24:938 AG(4):OS_FILE_dir_close started
0928 14:38:24:938 AG(4):OS_FILE_dir_close ended
0928 14:38:24:938 AG(4):GM_PARAM_delimited_list_count
0928 14:38:24:938 AG(5):GM_PARAM_delimited_list_count: list '' delimiter '|'
0928 14:38:24:938 AG(4):GM_PARAM_delimited_list_reset
0928 14:38:24:938 AG(4):GM_PARAM_delimited_list_next_entry
0928 14:38:24:938 AG(5):>>> GM_STR_trim_leading_spaces enter: original string
0928 14:38:24:938 AG(5):GM_STR_trim_leading_spaces: will start copying from
0928 14:38:24:938 AG(5):<<< GM_STR_trim_leading_spaces exit: trimmed string
0928 14:38:24:938 AG(5):GM_PARAM_delimited_list_count: list count=0
0928 14:38:24:938 AG(4):GM_AVSTAT_get_unavailable_cmlist: Unavailable CM's list is empty
0928 14:38:24:938 AG(3):>>> GM_AVSTAT_get_unavailable_cmlist Exit. Number of CM's in the list: 0
0928 14:38:24:938 AG(4):<<< AG_AVSTAT_check_availability exit
0928 14:38:24:938 AG(4):>>> ag_main_check_Refresh_CMList enter. Persistent connection: Y, Connection established = 1, first = 0
0928 14:38:24:938 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:38:24:938 AG(5):GM_PARAM_get: table:'CONFIG', key:'PERSISTENT_CONNECTION'
0928 14:38:24:938 AG(5):table 'CONFIG' already loaded
0928 14:38:24:938 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'PERSISTENT_CONNECTION', value:'N'
0928 14:38:24:938 AG(5):>>> AG_MAIN_is_Saas Enter. server_code=Current, primary_only=1
0928 14:38:24:938 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:38:24:938 AG(5):AG_MAIN_is_Saas Multi Server is not enabled. Reading from CONFIG
0928 14:38:24:938 AG(4):GM_PARAM_is_SAAS_on
0928 14:38:24:938 AG(5):GM_PARAM_get: table:'CONFIG', key:'INSTALL_CAT_TEST'
0928 14:38:24:938 AG(5):table 'CONFIG' already loaded
0928 14:38:24:938 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'INSTALL_CAT_TEST', value:''
0928 14:38:24:938 AG(5):GM_PARAM_get: table:'CONFIG', key:'INSTALL_CATEGORY'
0928 14:38:24:938 AG(5):table 'CONFIG' already loaded
0928 14:38:24:938 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'INSTALL_CATEGORY', value:'REG'
0928 14:38:24:938 AG(4):GM_PARAM_is_SAAS_on: SAAS is disabled
0928 14:38:24:938 AG(5):>>> AG_MAIN_is_Saas Exit. server_code=Current, primary_only=1, ret=0
0928 14:38:24:938 AG(5):GM_PARAM_get: table:'CONFIG', key:'CMLIST'
0928 14:38:24:938 AG(5):table 'CONFIG' already loaded
0928 14:38:24:938 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'CMLIST', value:'OS | AI | DATABASE'
0928 14:38:24:938 AG(3):ag_main_check_Refresh_CMList:    Current  CMLIST 'OS | AI | DATABASE'
0928 14:38:24:938 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:38:24:938 AG(5):GM_PARAM_get: table:'CONFIG', key:'CM_LIST_SENT2CTMS'
0928 14:38:24:938 AG(5):table 'CONFIG' already loaded
0928 14:38:24:938 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'CM_LIST_SENT2CTMS', value:'OS | AI | DATABASE'
0928 14:38:24:938 AG(4):ag_main_check_Refresh_CMList: CMLIST was not updated since last sent to CTMS
0928 14:38:24:938 AG(4):>>> ag_main_check_Send_GetPing enter. Persistent connection: Y, Connection established = 1, first = 0
0928 14:38:24:938 AG(5):GM_PARAM_get: table:'CONFIG', key:'SEND_GETPING'
0928 14:38:24:938 AG(5):table 'CONFIG' already loaded
0928 14:38:24:938 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'SEND_GETPING', value:''
0928 14:38:24:938 AG(3):GM_PARAM_load Starting: Table='CONFIG', flag=GM_PARAM_LOAD_FORCE
0928 14:38:24:938 AG(4):>>> GM_PARAM_check_and_rename_audit_log enter
0928 14:38:24:938 AG(5):OS_FILE_check_existence: file name - './data/CONFAUDT'  mode - '0'
0928 14:38:24:938 AG(4):OS_FILE_check_existence: file './data/CONFAUDT' doesn't exist
0928 14:38:24:938 AG(4):GM_PARAM_check_and_rename_audit_log: Audit log file './data/CONFAUDT' with config changes not found
0928 14:38:24:938 AG(4):<<< GM_PARAM_check_and_rename_audit_log exit. rc=2
0928 14:38:24:938 AG(5):GM_PARAM_load: Audit log file './data/CONFAUDT' was not found or not renamed. rc_audit_log = 2
0928 14:38:24:938 AG(4):OS_FILE_stat enter: file_name = './data/CONFIG.dat'
0928 14:38:24:938 AG(4):size in bytes = 3175, modify timestamp = '20260928134408520'
0928 14:38:24:938 AG(3):GM_PARAM_load_file Starting. File: ./data/CONFIG.dat
0928 14:38:24:938 AG(4):OS_FILE_fopen started : ./data/CONFIG.dat. mode=4
0928 14:38:24:938 AG(4):OS_FILE_fopen : opened 5
0928 14:38:24:938 AG(4):OS_FILE_fclose started 5
0928 14:38:24:938 AG(4):OS_FILE_fclose ended
0928 14:38:24:938 AG(3):GM_PARAM_load_file Exiting. File: ./data/CONFIG.dat. rc=1
0928 14:38:24:938 AG(3):GM_PARAM_load Exiting: Table='CONFIG', flag=GM_PARAM_LOAD_FORCE, rc=1
0928 14:38:24:938 AG(4):GM_PARAM_delete: Enter
0928 14:38:24:938 AG(5):table 'CONFIG' already loaded
0928 14:38:24:938 AG(5):GM_PARAM_delete: table_find rc 1
0928 14:38:24:938 AG(5):GM_PARAM_delete: list_delete rc 6
0928 14:38:24:938 AG(4):GM_PARAM_delete: Exit. rc = 6
0928 14:38:24:938 AG(3):ag_main_check_Send_GetPing:    Number of CONFIG tries: '0'
0928 14:38:24:938 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:38:24:938 AG(4):<<< ag_main_check_Send_GetPing exit
0928 14:38:24:938 AG(4):>>> ag_main_checkDiskFreeSpace enter
0928 14:38:24:938 AG(5):GM_PARAM_get: table:'CONFIG', key:'CHECK_DISKSPACE_INTERVAL'
0928 14:38:24:938 AG(5):table 'CONFIG' already loaded
0928 14:38:24:938 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'CHECK_DISKSPACE_INTERVAL', value:''
0928 14:38:24:938 AG(4):ag_main_checkDiskFreeSpace: Check disk space configuration interval is 3600 seconds
0928 14:38:24:938 AG(4):ag_main_checkDiskFreeSpace: It is not yet time to check disk space
0928 14:38:24:938 AG(4):<<< ag_main_checkDiskFreeSpace exit
0928 14:38:24:938 AG(4):>>> ag_main_merge_files enter
0928 14:38:24:938 AG(5):GM_PARAM_get: table:'CONFIG', key:'WRITE_MERGE_INTERVAL'
0928 14:38:24:938 AG(5):table 'CONFIG' already loaded
0928 14:38:24:938 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'WRITE_MERGE_INTERVAL', value:''
0928 14:38:24:938 AG(4):<<< ag_main_merge_files exit
0928 14:38:24:938 AG(4):>>> ag_main_checkConfigAuditLog enter
0928 14:38:24:938 AG(4):>>> GM_PARAM_check_and_rename_audit_log enter
0928 14:38:24:938 AG(5):OS_FILE_check_existence: file name - './data/CONFAUDT'  mode - '0'
0928 14:38:24:938 AG(4):OS_FILE_check_existence: file './data/CONFAUDT' doesn't exist
0928 14:38:24:938 AG(4):GM_PARAM_check_and_rename_audit_log: Audit log file './data/CONFAUDT' with config changes not found
0928 14:38:24:938 AG(4):<<< GM_PARAM_check_and_rename_audit_log exit. rc=2
0928 14:38:24:938 AG(4):ag_main_checkConfigAuditLog: Audit log file './data/CONFAUDT' with config changes not found
0928 14:38:24:938 AG(4):<<< ag_main_checkConfigAuditLog exit
0928 14:38:24:938 AG(4):GM_MEASURE_write_stats: Entering. Number of measures=0
0928 14:38:24:938 AG(4):gm_measure_init_file: Entering
0928 14:38:24:938 AG(5):OS_FILE_check_existence: file name - 'measure/AG_1191749.csv'  mode - '0'
0928 14:38:24:938 AG(4):OS_FILE_check_existence: file 'measure/AG_1191749.csv' exists
0928 14:38:24:938 AG(4):gm_measure_init_file: Exiting
0928 14:38:24:938 AG(4):OS_COMM_sess_open
0928 14:38:24:938 AG(4):OS_COMM_sess_open: in server find port mode
0928 14:38:24:938 AG(5):OS_COMM_sess_open: Entering select. Timeout=60
0928 14:39:24:978 AG(2):OS_COMM_sess_open: select timed out, interval: 60
0928 14:39:24:978 AG(4):AG_MAIN_loop OS_COMM_sess_open returned TIME_OUT
0928 14:39:24:978 AG(4):>>> ag_main_check_shutdown_signal enter
0928 14:39:24:978 AG(3):OS_FILE_build_filetype Starting: orderno=, runno=0, mode=37
0928 14:39:24:978 AG(5):OS_FILE_check_existence: file name - './temp/AGSHUT'  mode - '0'
0928 14:39:24:978 AG(4):OS_FILE_check_existence: file './temp/AGSHUT' doesn't exist
0928 14:39:24:978 AG(4):<<< ag_main_check_shutdown_signal exit
0928 14:39:24:978 AG(4):ag_main_check_reg_change
0928 14:39:24:978 AG(3):GM_PARAM_load Starting: Table='CONFIG', flag=GM_PARAM_LOAD_NOFORCE
0928 14:39:24:978 AG(4):OS_FILE_stat enter: file_name = './data/CONFIG.dat'
0928 14:39:24:978 AG(4):size in bytes = 3175, modify timestamp = '20260928134408520'
0928 14:39:24:978 AG(4):GM_PARAM_load: Table 'CONFIG' was not modified
0928 14:39:24:978 AG(4):GM_PARAM_table_get_last_load_time: Table='CONFIG'
0928 14:39:24:978 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:39:24:978 AG(4):ag_main_check_reg_change: Tables CONFIG is up-to-date. Last load time is 20260928134408520
0928 14:39:24:978 AG(4):ag_main_check_reg_change: Tables SVRCONF is up-to-date. Last load time is
0928 14:39:24:978 AG(4):ag_main_check_reg_change: Exit with: 2
0928 14:39:24:978 AG(4):AG_MAIN_loop: Listener process has been running for 0 days 0 hours 55 minutes 22 seconds since 20260928134402
0928 14:39:24:978 AG(3):AG_main_watchdog
0928 14:39:24:978 AG(4):GM_PARAM_is_watchdog_on
0928 14:39:24:978 AG(3):OS_FILE_build_filetype Starting: orderno=WATCHDOG_ENABLED, runno=0, mode=15
0928 14:39:24:978 AG(5):OS_FILE_check_existence: file name - './temp/WATCHDOG_ENABLED_N.cfg'  mode - '0'
0928 14:39:24:978 AG(4):OS_FILE_check_existence: file './temp/WATCHDOG_ENABLED_N.cfg' doesn't exist
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'CONFIG', key:'WATCHDOG_ENABLED'
0928 14:39:24:978 AG(5):table 'CONFIG' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'WATCHDOG_ENABLED', value:'Y'
0928 14:39:24:978 AG(4):Watchdog is enabled
0928 14:39:24:978 AG(4):>>> AG_TRACE_set_alive enter
0928 14:39:24:978 AG(3):OS_FILE_build_filetype Starting: orderno=, runno=2, mode=13
0928 14:39:24:978 AG(4):>>> OS_FILE_get_life_check_file enter
0928 14:39:24:978 AG(5):OS_FILE_get_life_check_file file is listener_is_alive
0928 14:39:24:978 AG(4):<<< OS_FILE_get_life_check_file exit
0928 14:39:24:978 AG(4):OS_FILE_open
0928 14:39:24:978 AG(4):file_name='/opt/ctmage/ctm/./temp/listener_is_alive'
0928 14:39:24:978 AG(4):OS_FILE_open: Agent Owner Id: '20003596', Group Id: '20000299'
0928 14:39:24:978 AG(4):OS_FILE_open succeeded: opened descriptor 5
0928 14:39:24:978 AG(4):OS_FILE_close: Closing descriptor 5
0928 14:39:24:978 AG(4):OS_FILE_close ended successfully
0928 14:39:24:978 AG(4):>>> OS_PROC_is_agent_on_NFS enter
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'CONFIG', key:'INSTALL_TYPE'
0928 14:39:24:978 AG(5):table 'CONFIG' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'INSTALL_TYPE', value:'local'
0928 14:39:24:978 AG(4):>>> OS_PROC_is_agent_on_NFS_PVC enter
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'CONFIG', key:'NFS_PVC'
0928 14:39:24:978 AG(5):table 'CONFIG' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'NFS_PVC', value:''
0928 14:39:24:978 AG(4):<<< AG_TRACE_set_alive exit
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'CONFIG', key:'JAVA_AR'
0928 14:39:24:978 AG(5):table 'CONFIG' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'JAVA_AR', value:'Y'
0928 14:39:24:978 AG(4):>>> OS_PROC_is_running enter, proc_type = 14
0928 14:39:24:978 AG(4):OS_PROC_check_lock
0928 14:39:24:978 AG(4):OS_PROC_check_lock: checking ./locks/AGJ.lock
0928 14:39:24:978 AG(4):OS_PROC_check_lock: lock file opened successfully
0928 14:39:24:978 AG(4):OS_PROC_check_lock: changing ownership of './locks/AGJ.lock' to agent owner
0928 14:39:24:978 AG(4):OS_FILE_set_agent_owner. path='./locks/AGJ.lock'
0928 14:39:24:978 AG(4):OS_PROC_check_lock: lock file ./locks/AGJ.lock is locked
0928 14:39:24:978 AG(4):OS_PROC_check_lock: exiting
0928 14:39:24:978 AG(4):OS_PROC_is_running: 14 process is already running
0928 14:39:24:978 AG(4):>>> OS_PROC_is_running exit with ret = 1
0928 14:39:24:978 AG(4):>>> AG_TRACE_check_alive enter. proc_type=14
0928 14:39:24:978 AG(4):AG_TRACE_check_alive: Life check for OS_PROC_TYPE_AGENT_JAVA process is not needed
0928 14:39:24:978 AG(4):OS_PROC_start_process:
0928 14:39:24:978 AG(4):OS_PROC_check_lock
0928 14:39:24:978 AG(4):OS_PROC_check_lock: checking ./locks/TRACKER.lock
0928 14:39:24:978 AG(4):OS_PROC_check_lock: lock file opened successfully
0928 14:39:24:978 AG(4):OS_PROC_check_lock: changing ownership of './locks/TRACKER.lock' to agent owner
0928 14:39:24:978 AG(4):OS_FILE_set_agent_owner. path='./locks/TRACKER.lock'
0928 14:39:24:978 AG(4):OS_PROC_check_lock: lock file ./locks/TRACKER.lock is locked
0928 14:39:24:978 AG(4):OS_PROC_check_lock: exiting
0928 14:39:24:978 AG(3):OS_PROC_start_process: AT process already running.
0928 14:39:24:978 AG(4):>>> AG_TRACE_check_alive enter. proc_type=4
0928 14:39:24:978 AG(3):OS_FILE_build_filetype Starting: orderno=, runno=4, mode=13
0928 14:39:24:978 AG(4):>>> OS_FILE_get_life_check_file enter
0928 14:39:24:978 AG(5):OS_FILE_get_life_check_file file is tracker_is_alive
0928 14:39:24:978 AG(4):<<< OS_FILE_get_life_check_file exit
0928 14:39:24:978 AG(4):OS_FILE_stat enter: file_name = '/opt/ctmage/ctm/./temp/tracker_is_alive'
0928 14:39:24:978 AG(4):size in bytes = 0, modify timestamp = '20260928143908343'
0928 14:39:24:978 AG(5):AG_TRACE_check_alive: CreateTime: 20260928143908343 ModifyTime: 20260928143908343
0928 14:39:24:978 AG(4):AG_TRACE_check_alive: file - /opt/ctmage/ctm/./temp/tracker_is_alive last update in minutes - 0
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'CONFIG', key:'AT_NOT_RESPONDING_TIME'
0928 14:39:24:978 AG(5):table 'CONFIG' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'AT_NOT_RESPONDING_TIME', value:''
0928 14:39:24:978 AG(4):AG_TRACE_check_alive: Could not get parameter AT_NOT_RESPONDING_TIME using default value 3
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'CONFIG', key:'PROCESS_NOT_RESPONDING_ALERT_INTERVAL'
0928 14:39:24:978 AG(5):table 'CONFIG' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'PROCESS_NOT_RESPONDING_ALERT_INTERVAL', value:''
0928 14:39:24:978 AG(4):AG_TRACE_check_alive: Could not get parameter PROCESS_NOT_RESPONDING_ALERT_INTERVAL using default value 60
0928 14:39:24:978 AG(4):<<< AG_TRACE_check_alive exit
0928 14:39:24:978 AG(4):>>> AG_COLLECT_workload enter
0928 14:39:24:978 AG(4):>>> ag_collect_build_cpu_specs_list Enter. include_disabled=0, current number of list entries=0
0928 14:39:24:978 AG(4):ag_collect_build_cpu_specs_list: Loading list of Server codes
0928 14:39:24:978 AG(4):>>> AG_MAIN_get_server_codes_list Enter. include_disabled=0
0928 14:39:24:978 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:39:24:978 AG(4):>>> AG_MAIN_get_server_codes_list Exit. rc=1, server_codes_list count=1
0928 14:39:24:978 AG(4):>>> AG_MAIN_read_server_conf Enter. server_code=, key='WKL_NODEID_CPU_UPDATE'
0928 14:39:24:978 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:39:24:978 AG(5):AG_MAIN_read_server_conf Multi Server is not enabled. Reading 'WKL_NODEID_CPU_UPDATE' from CONFIG
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'CONFIG', key:'WKL_NODEID_CPU_UPDATE'
0928 14:39:24:978 AG(5):table 'CONFIG' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'WKL_NODEID_CPU_UPDATE', value:''
0928 14:39:24:978 AG(4):>>> AG_MAIN_read_server_conf Exit. server_code=, key='WKL_NODEID_CPU_UPDATE', rc=6, value=''
0928 14:39:24:978 AG(5):ag_collect_build_cpu_specs_list: Server code '', cpuUpdate 0
0928 14:39:24:978 AG(5):ag_collect_build_cpu_specs_list: Add Server code '' with new cpuUpdate 0
0928 14:39:24:978 AG(4):ag_collect_build_cpu_specs_list: Remove entries with cpuUpdate = 0
0928 14:39:24:978 AG(5):ag_collect_build_cpu_specs_list: Remove Server code '' from list
0928 14:39:24:978 AG(4):>>> ag_collect_build_cpu_specs_list Exit. cpu_specs_list count=0
0928 14:39:24:978 AG(4):<<< AG_COLLECT_workload exit. CPU Workload collection is OFF
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'CONFIG', key:'UPLOAD_REMOTE_UTILS'
0928 14:39:24:978 AG(5):table 'CONFIG' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'UPLOAD_REMOTE_UTILS', value:'N'
0928 14:39:24:978 AG(4):AG_main_watchdog: remote_utils - 'N'
0928 14:39:24:978 AG(3):GM_PARAM_load Starting: Table='RHCONF', flag=GM_PARAM_LOAD_NOFORCE
0928 14:39:24:978 AG(4):OS_FILE_stat enter: file_name = './data/RHCONF.dat'
0928 14:39:24:978 AG(4):size in bytes = 56, modify timestamp = '20260916123155260'
0928 14:39:24:978 AG(4):GM_PARAM_load: Table 'RHCONF' was not modified
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'RHCONF', key:'JAVA_RH'
0928 14:39:24:978 AG(5):table 'RHCONF' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 1, table:'RHCONF', key:'JAVA_RH', value:'N'
0928 14:39:24:978 AG(4):AG_main_watchdog: java_rh - 'N'
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'RHCONF', key:'JAVA_RH_UPGRADE'
0928 14:39:24:978 AG(5):table 'RHCONF' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 6, table:'RHCONF', key:'JAVA_RH_UPGRADE', value:''
0928 14:39:24:978 AG(4):AG_main_watchdog: java_rh_upgrade - 'N'
0928 14:39:24:978 AG(3):>>> OS_PROC_housekeeping
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'CONFIG', key:'AGENT_DIR'
0928 14:39:24:978 AG(5):table 'CONFIG' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'AGENT_DIR', value:'/opt/ctmage/ctm'
0928 14:39:24:978 AG(5):OS_FILE_check_existence: file name - '/opt/ctmage/ctm/core'  mode - '0'
0928 14:39:24:978 AG(4):OS_FILE_check_existence: file '/opt/ctmage/ctm/core' doesn't exist
0928 14:39:24:978 AG(3):<<< OS_PROC_housekeeping
0928 14:39:24:978 AG(4):>>> AG_COLLECT_get_specs enter
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'CONFIG', key:'CPU_SPEC_INTERVAL'
0928 14:39:24:978 AG(5):table 'CONFIG' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'CPU_SPEC_INTERVAL', value:''
0928 14:39:24:978 AG(4):GM_COLLECT_getCpuSpecInterval used interval: '240'
0928 14:39:24:978 AG(4):<<< AG_COLLECT_get_specs exit. 55 minutes since last update. No need for Updating
0928 14:39:24:978 AG(4):>>> AG_AVSTAT_check_availability enter
0928 14:39:24:978 AG(5):>>> GM_AVSTAT_getAvailabilityIntervals Enter
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'CONFIG', key:'CMACC_AV_INTERVAL'
0928 14:39:24:978 AG(5):table 'CONFIG' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'CMACC_AV_INTERVAL', value:'3600'
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'CONFIG', key:'CMACC_UNAV_INTERVAL'
0928 14:39:24:978 AG(5):table 'CONFIG' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'CMACC_UNAV_INTERVAL', value:'90'
0928 14:39:24:978 AG(4):GM_AVSTAT_getAvailabilityIntervals Availability interval: '3600' seconds
0928 14:39:24:978 AG(4):GM_AVSTAT_getAvailabilityIntervals Unavailability interval: '90' seconds
0928 14:39:24:978 AG(5):>>> GM_AVSTAT_getAvailabilityIntervals Exit
0928 14:39:24:978 AG(4):60 seconds since last test of unavailable CM accounts
0928 14:39:24:978 AG(4):3322 seconds since last test of all CM accounts
0928 14:39:24:978 AG(4):Not yet time for unavailable accounts testing
0928 14:39:24:978 AG(4):Not yet time for all accounts testing
0928 14:39:24:978 AG(4):<<< AG_AVSTAT_check_availability: Nothing to do. Exiting
0928 14:39:24:978 AG(4):>>> ag_main_check_Refresh_CMList enter. Persistent connection: Y, Connection established = 1, first = 0
0928 14:39:24:978 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'CONFIG', key:'PERSISTENT_CONNECTION'
0928 14:39:24:978 AG(5):table 'CONFIG' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'PERSISTENT_CONNECTION', value:'N'
0928 14:39:24:978 AG(5):>>> AG_MAIN_is_Saas Enter. server_code=Current, primary_only=1
0928 14:39:24:978 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:39:24:978 AG(5):AG_MAIN_is_Saas Multi Server is not enabled. Reading from CONFIG
0928 14:39:24:978 AG(4):GM_PARAM_is_SAAS_on
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'CONFIG', key:'INSTALL_CAT_TEST'
0928 14:39:24:978 AG(5):table 'CONFIG' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'INSTALL_CAT_TEST', value:''
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'CONFIG', key:'INSTALL_CATEGORY'
0928 14:39:24:978 AG(5):table 'CONFIG' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'INSTALL_CATEGORY', value:'REG'
0928 14:39:24:978 AG(4):GM_PARAM_is_SAAS_on: SAAS is disabled
0928 14:39:24:978 AG(5):>>> AG_MAIN_is_Saas Exit. server_code=Current, primary_only=1, ret=0
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'CONFIG', key:'CMLIST'
0928 14:39:24:978 AG(5):table 'CONFIG' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'CMLIST', value:'OS | AI | DATABASE'
0928 14:39:24:978 AG(3):ag_main_check_Refresh_CMList:    Current  CMLIST 'OS | AI | DATABASE'
0928 14:39:24:978 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'CONFIG', key:'CM_LIST_SENT2CTMS'
0928 14:39:24:978 AG(5):table 'CONFIG' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'CM_LIST_SENT2CTMS', value:'OS | AI | DATABASE'
0928 14:39:24:978 AG(4):ag_main_check_Refresh_CMList: CMLIST was not updated since last sent to CTMS
0928 14:39:24:978 AG(4):>>> ag_main_check_Send_GetPing enter. Persistent connection: Y, Connection established = 1, first = 0
0928 14:39:24:978 AG(5):GM_PARAM_get: table:'CONFIG', key:'SEND_GETPING'
0928 14:39:24:978 AG(5):table 'CONFIG' already loaded
0928 14:39:24:978 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'SEND_GETPING', value:''
0928 14:39:24:978 AG(3):GM_PARAM_load Starting: Table='CONFIG', flag=GM_PARAM_LOAD_FORCE
0928 14:39:24:978 AG(4):>>> GM_PARAM_check_and_rename_audit_log enter
0928 14:39:24:978 AG(5):OS_FILE_check_existence: file name - './data/CONFAUDT'  mode - '0'
0928 14:39:24:978 AG(4):OS_FILE_check_existence: file './data/CONFAUDT' doesn't exist
0928 14:39:24:978 AG(4):GM_PARAM_check_and_rename_audit_log: Audit log file './data/CONFAUDT' with config changes not found
0928 14:39:24:978 AG(4):<<< GM_PARAM_check_and_rename_audit_log exit. rc=2
0928 14:39:24:978 AG(5):GM_PARAM_load: Audit log file './data/CONFAUDT' was not found or not renamed. rc_audit_log = 2
0928 14:39:24:978 AG(4):OS_FILE_stat enter: file_name = './data/CONFIG.dat'
0928 14:39:24:978 AG(4):size in bytes = 3175, modify timestamp = '20260928134408520'
0928 14:39:24:978 AG(3):GM_PARAM_load_file Starting. File: ./data/CONFIG.dat
0928 14:39:24:978 AG(4):OS_FILE_fopen started : ./data/CONFIG.dat. mode=4
0928 14:39:24:978 AG(4):OS_FILE_fopen : opened 5
0928 14:39:24:979 AG(4):OS_FILE_fclose started 5
0928 14:39:24:979 AG(4):OS_FILE_fclose ended
0928 14:39:24:979 AG(3):GM_PARAM_load_file Exiting. File: ./data/CONFIG.dat. rc=1
0928 14:39:24:979 AG(3):GM_PARAM_load Exiting: Table='CONFIG', flag=GM_PARAM_LOAD_FORCE, rc=1
0928 14:39:24:979 AG(4):GM_PARAM_delete: Enter
0928 14:39:24:979 AG(5):table 'CONFIG' already loaded
0928 14:39:24:979 AG(5):GM_PARAM_delete: table_find rc 1
0928 14:39:24:979 AG(5):GM_PARAM_delete: list_delete rc 6
0928 14:39:24:979 AG(4):GM_PARAM_delete: Exit. rc = 6
0928 14:39:24:979 AG(3):ag_main_check_Send_GetPing:    Number of CONFIG tries: '0'
0928 14:39:24:979 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:39:24:979 AG(4):<<< ag_main_check_Send_GetPing exit
0928 14:39:24:979 AG(4):>>> ag_main_checkDiskFreeSpace enter
0928 14:39:24:979 AG(5):GM_PARAM_get: table:'CONFIG', key:'CHECK_DISKSPACE_INTERVAL'
0928 14:39:24:979 AG(5):table 'CONFIG' already loaded
0928 14:39:24:979 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'CHECK_DISKSPACE_INTERVAL', value:''
0928 14:39:24:979 AG(4):ag_main_checkDiskFreeSpace: Check disk space configuration interval is 3600 seconds
0928 14:39:24:979 AG(4):ag_main_checkDiskFreeSpace: It is not yet time to check disk space
0928 14:39:24:979 AG(4):<<< ag_main_checkDiskFreeSpace exit
0928 14:39:24:979 AG(4):>>> ag_main_merge_files enter
0928 14:39:24:979 AG(5):GM_PARAM_get: table:'CONFIG', key:'WRITE_MERGE_INTERVAL'
0928 14:39:24:979 AG(5):table 'CONFIG' already loaded
0928 14:39:24:979 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'WRITE_MERGE_INTERVAL', value:''
0928 14:39:24:979 AG(4):<<< ag_main_merge_files exit
0928 14:39:24:979 AG(4):>>> ag_main_checkConfigAuditLog enter
0928 14:39:24:979 AG(4):>>> GM_PARAM_check_and_rename_audit_log enter
0928 14:39:24:979 AG(5):OS_FILE_check_existence: file name - './data/CONFAUDT'  mode - '0'
0928 14:39:24:979 AG(4):OS_FILE_check_existence: file './data/CONFAUDT' doesn't exist
0928 14:39:24:979 AG(4):GM_PARAM_check_and_rename_audit_log: Audit log file './data/CONFAUDT' with config changes not found
0928 14:39:24:979 AG(4):<<< GM_PARAM_check_and_rename_audit_log exit. rc=2
0928 14:39:24:979 AG(4):ag_main_checkConfigAuditLog: Audit log file './data/CONFAUDT' with config changes not found
0928 14:39:24:979 AG(4):<<< ag_main_checkConfigAuditLog exit
0928 14:39:24:979 AG(4):GM_MEASURE_write_stats: Entering. Number of measures=0
0928 14:39:24:979 AG(4):gm_measure_init_file: Entering
0928 14:39:24:979 AG(5):OS_FILE_check_existence: file name - 'measure/AG_1191749.csv'  mode - '0'
0928 14:39:24:979 AG(4):OS_FILE_check_existence: file 'measure/AG_1191749.csv' exists
0928 14:39:24:979 AG(4):gm_measure_init_file: Exiting
0928 14:39:24:979 AG(4):OS_COMM_sess_open
0928 14:39:24:979 AG(4):OS_COMM_sess_open: in server find port mode
0928 14:39:24:979 AG(5):OS_COMM_sess_open: Entering select. Timeout=60
0928 14:40:25:037 AG(2):OS_COMM_sess_open: select timed out, interval: 60
0928 14:40:25:037 AG(4):AG_MAIN_loop OS_COMM_sess_open returned TIME_OUT
0928 14:40:25:037 AG(4):>>> ag_main_check_shutdown_signal enter
0928 14:40:25:037 AG(3):OS_FILE_build_filetype Starting: orderno=, runno=0, mode=37
0928 14:40:25:037 AG(5):OS_FILE_check_existence: file name - './temp/AGSHUT'  mode - '0'
0928 14:40:25:037 AG(4):OS_FILE_check_existence: file './temp/AGSHUT' doesn't exist
0928 14:40:25:037 AG(4):<<< ag_main_check_shutdown_signal exit
0928 14:40:25:037 AG(4):ag_main_check_reg_change
0928 14:40:25:037 AG(3):GM_PARAM_load Starting: Table='CONFIG', flag=GM_PARAM_LOAD_NOFORCE
0928 14:40:25:037 AG(4):OS_FILE_stat enter: file_name = './data/CONFIG.dat'
0928 14:40:25:037 AG(4):size in bytes = 3175, modify timestamp = '20260928134408520'
0928 14:40:25:037 AG(4):GM_PARAM_load: Table 'CONFIG' was not modified
0928 14:40:25:037 AG(4):GM_PARAM_table_get_last_load_time: Table='CONFIG'
0928 14:40:25:037 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:40:25:037 AG(4):ag_main_check_reg_change: Tables CONFIG is up-to-date. Last load time is 20260928134408520
0928 14:40:25:037 AG(4):ag_main_check_reg_change: Tables SVRCONF is up-to-date. Last load time is
0928 14:40:25:037 AG(4):ag_main_check_reg_change: Exit with: 2
0928 14:40:25:037 AG(4):AG_MAIN_loop: Listener process has been running for 0 days 0 hours 56 minutes 23 seconds since 20260928134402
0928 14:40:25:037 AG(3):AG_main_watchdog
0928 14:40:25:037 AG(4):GM_PARAM_is_watchdog_on
0928 14:40:25:037 AG(3):OS_FILE_build_filetype Starting: orderno=WATCHDOG_ENABLED, runno=0, mode=15
0928 14:40:25:037 AG(5):OS_FILE_check_existence: file name - './temp/WATCHDOG_ENABLED_N.cfg'  mode - '0'
0928 14:40:25:037 AG(4):OS_FILE_check_existence: file './temp/WATCHDOG_ENABLED_N.cfg' doesn't exist
0928 14:40:25:037 AG(5):GM_PARAM_get: table:'CONFIG', key:'WATCHDOG_ENABLED'
0928 14:40:25:037 AG(5):table 'CONFIG' already loaded
0928 14:40:25:037 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'WATCHDOG_ENABLED', value:'Y'
0928 14:40:25:037 AG(4):Watchdog is enabled
0928 14:40:25:037 AG(4):>>> AG_TRACE_set_alive enter
0928 14:40:25:037 AG(3):OS_FILE_build_filetype Starting: orderno=, runno=2, mode=13
0928 14:40:25:037 AG(4):>>> OS_FILE_get_life_check_file enter
0928 14:40:25:037 AG(5):OS_FILE_get_life_check_file file is listener_is_alive
0928 14:40:25:037 AG(4):<<< OS_FILE_get_life_check_file exit
0928 14:40:25:037 AG(4):OS_FILE_open
0928 14:40:25:037 AG(4):file_name='/opt/ctmage/ctm/./temp/listener_is_alive'
0928 14:40:25:037 AG(4):OS_FILE_open: Agent Owner Id: '20003596', Group Id: '20000299'
0928 14:40:25:037 AG(4):OS_FILE_open succeeded: opened descriptor 5
0928 14:40:25:037 AG(4):OS_FILE_close: Closing descriptor 5
0928 14:40:25:037 AG(4):OS_FILE_close ended successfully
0928 14:40:25:037 AG(4):>>> OS_PROC_is_agent_on_NFS enter
0928 14:40:25:037 AG(5):GM_PARAM_get: table:'CONFIG', key:'INSTALL_TYPE'
0928 14:40:25:037 AG(5):table 'CONFIG' already loaded
0928 14:40:25:037 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'INSTALL_TYPE', value:'local'
0928 14:40:25:037 AG(4):>>> OS_PROC_is_agent_on_NFS_PVC enter
0928 14:40:25:037 AG(5):GM_PARAM_get: table:'CONFIG', key:'NFS_PVC'
0928 14:40:25:037 AG(5):table 'CONFIG' already loaded
0928 14:40:25:037 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'NFS_PVC', value:''
0928 14:40:25:037 AG(4):<<< AG_TRACE_set_alive exit
0928 14:40:25:037 AG(5):GM_PARAM_get: table:'CONFIG', key:'JAVA_AR'
0928 14:40:25:037 AG(5):table 'CONFIG' already loaded
0928 14:40:25:037 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'JAVA_AR', value:'Y'
0928 14:40:25:037 AG(4):>>> OS_PROC_is_running enter, proc_type = 14
0928 14:40:25:037 AG(4):OS_PROC_check_lock
0928 14:40:25:037 AG(4):OS_PROC_check_lock: checking ./locks/AGJ.lock
0928 14:40:25:037 AG(4):OS_PROC_check_lock: lock file opened successfully
0928 14:40:25:037 AG(4):OS_PROC_check_lock: changing ownership of './locks/AGJ.lock' to agent owner
0928 14:40:25:037 AG(4):OS_FILE_set_agent_owner. path='./locks/AGJ.lock'
0928 14:40:25:037 AG(4):OS_PROC_check_lock: lock file ./locks/AGJ.lock is locked
0928 14:40:25:037 AG(4):OS_PROC_check_lock: exiting
0928 14:40:25:037 AG(4):OS_PROC_is_running: 14 process is already running
0928 14:40:25:037 AG(4):>>> OS_PROC_is_running exit with ret = 1
0928 14:40:25:037 AG(4):>>> AG_TRACE_check_alive enter. proc_type=14
0928 14:40:25:037 AG(4):AG_TRACE_check_alive: Life check for OS_PROC_TYPE_AGENT_JAVA process is not needed
0928 14:40:25:037 AG(4):OS_PROC_start_process:
0928 14:40:25:037 AG(4):OS_PROC_check_lock
0928 14:40:25:037 AG(4):OS_PROC_check_lock: checking ./locks/TRACKER.lock
0928 14:40:25:037 AG(4):OS_PROC_check_lock: lock file opened successfully
0928 14:40:25:037 AG(4):OS_PROC_check_lock: changing ownership of './locks/TRACKER.lock' to agent owner
0928 14:40:25:037 AG(4):OS_FILE_set_agent_owner. path='./locks/TRACKER.lock'
0928 14:40:25:037 AG(4):OS_PROC_check_lock: lock file ./locks/TRACKER.lock is locked
0928 14:40:25:037 AG(4):OS_PROC_check_lock: exiting
0928 14:40:25:037 AG(3):OS_PROC_start_process: AT process already running.
0928 14:40:25:037 AG(4):>>> AG_TRACE_check_alive enter. proc_type=4
0928 14:40:25:037 AG(3):OS_FILE_build_filetype Starting: orderno=, runno=4, mode=13
0928 14:40:25:037 AG(4):>>> OS_FILE_get_life_check_file enter
0928 14:40:25:037 AG(5):OS_FILE_get_life_check_file file is tracker_is_alive
0928 14:40:25:037 AG(4):<<< OS_FILE_get_life_check_file exit
0928 14:40:25:037 AG(4):OS_FILE_stat enter: file_name = '/opt/ctmage/ctm/./temp/tracker_is_alive'
0928 14:40:25:037 AG(4):size in bytes = 0, modify timestamp = '20260928144008332'
0928 14:40:25:037 AG(5):AG_TRACE_check_alive: CreateTime: 20260928144008332 ModifyTime: 20260928144008332
0928 14:40:25:037 AG(4):AG_TRACE_check_alive: file - /opt/ctmage/ctm/./temp/tracker_is_alive last update in minutes - 0
0928 14:40:25:037 AG(5):GM_PARAM_get: table:'CONFIG', key:'AT_NOT_RESPONDING_TIME'
0928 14:40:25:037 AG(5):table 'CONFIG' already loaded
0928 14:40:25:037 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'AT_NOT_RESPONDING_TIME', value:''
0928 14:40:25:037 AG(4):AG_TRACE_check_alive: Could not get parameter AT_NOT_RESPONDING_TIME using default value 3
0928 14:40:25:037 AG(5):GM_PARAM_get: table:'CONFIG', key:'PROCESS_NOT_RESPONDING_ALERT_INTERVAL'
0928 14:40:25:037 AG(5):table 'CONFIG' already loaded
0928 14:40:25:037 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'PROCESS_NOT_RESPONDING_ALERT_INTERVAL', value:''
0928 14:40:25:037 AG(4):AG_TRACE_check_alive: Could not get parameter PROCESS_NOT_RESPONDING_ALERT_INTERVAL using default value 60
0928 14:40:25:037 AG(4):<<< AG_TRACE_check_alive exit
0928 14:40:25:037 AG(4):>>> AG_COLLECT_workload enter
0928 14:40:25:037 AG(4):>>> ag_collect_build_cpu_specs_list Enter. include_disabled=0, current number of list entries=0
0928 14:40:25:037 AG(4):ag_collect_build_cpu_specs_list: Loading list of Server codes
0928 14:40:25:037 AG(4):>>> AG_MAIN_get_server_codes_list Enter. include_disabled=0
0928 14:40:25:037 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:40:25:037 AG(4):>>> AG_MAIN_get_server_codes_list Exit. rc=1, server_codes_list count=1
0928 14:40:25:037 AG(4):>>> AG_MAIN_read_server_conf Enter. server_code=, key='WKL_NODEID_CPU_UPDATE'
0928 14:40:25:037 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:40:25:037 AG(5):AG_MAIN_read_server_conf Multi Server is not enabled. Reading 'WKL_NODEID_CPU_UPDATE' from CONFIG
0928 14:40:25:037 AG(5):GM_PARAM_get: table:'CONFIG', key:'WKL_NODEID_CPU_UPDATE'
0928 14:40:25:037 AG(5):table 'CONFIG' already loaded
0928 14:40:25:037 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'WKL_NODEID_CPU_UPDATE', value:''
0928 14:40:25:037 AG(4):>>> AG_MAIN_read_server_conf Exit. server_code=, key='WKL_NODEID_CPU_UPDATE', rc=6, value=''
0928 14:40:25:037 AG(5):ag_collect_build_cpu_specs_list: Server code '', cpuUpdate 0
0928 14:40:25:037 AG(5):ag_collect_build_cpu_specs_list: Add Server code '' with new cpuUpdate 0
0928 14:40:25:037 AG(4):ag_collect_build_cpu_specs_list: Remove entries with cpuUpdate = 0
0928 14:40:25:037 AG(5):ag_collect_build_cpu_specs_list: Remove Server code '' from list
0928 14:40:25:037 AG(4):>>> ag_collect_build_cpu_specs_list Exit. cpu_specs_list count=0
0928 14:40:25:037 AG(4):<<< AG_COLLECT_workload exit. CPU Workload collection is OFF
0928 14:40:25:037 AG(5):GM_PARAM_get: table:'CONFIG', key:'UPLOAD_REMOTE_UTILS'
0928 14:40:25:037 AG(5):table 'CONFIG' already loaded
0928 14:40:25:037 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'UPLOAD_REMOTE_UTILS', value:'N'
0928 14:40:25:037 AG(4):AG_main_watchdog: remote_utils - 'N'
0928 14:40:25:037 AG(3):GM_PARAM_load Starting: Table='RHCONF', flag=GM_PARAM_LOAD_NOFORCE
0928 14:40:25:037 AG(4):OS_FILE_stat enter: file_name = './data/RHCONF.dat'
0928 14:40:25:037 AG(4):size in bytes = 56, modify timestamp = '20260916123155260'
0928 14:40:25:037 AG(4):GM_PARAM_load: Table 'RHCONF' was not modified
0928 14:40:25:037 AG(5):GM_PARAM_get: table:'RHCONF', key:'JAVA_RH'
0928 14:40:25:038 AG(5):table 'RHCONF' already loaded
0928 14:40:25:038 AG(4):GM_PARAM_get: rc = 1, table:'RHCONF', key:'JAVA_RH', value:'N'
0928 14:40:25:038 AG(4):AG_main_watchdog: java_rh - 'N'
0928 14:40:25:038 AG(5):GM_PARAM_get: table:'RHCONF', key:'JAVA_RH_UPGRADE'
0928 14:40:25:038 AG(5):table 'RHCONF' already loaded
0928 14:40:25:038 AG(4):GM_PARAM_get: rc = 6, table:'RHCONF', key:'JAVA_RH_UPGRADE', value:''
0928 14:40:25:038 AG(4):AG_main_watchdog: java_rh_upgrade - 'N'
0928 14:40:25:038 AG(3):>>> OS_PROC_housekeeping
0928 14:40:25:038 AG(5):GM_PARAM_get: table:'CONFIG', key:'AGENT_DIR'
0928 14:40:25:038 AG(5):table 'CONFIG' already loaded
0928 14:40:25:038 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'AGENT_DIR', value:'/opt/ctmage/ctm'
0928 14:40:25:038 AG(5):OS_FILE_check_existence: file name - '/opt/ctmage/ctm/core'  mode - '0'
0928 14:40:25:038 AG(4):OS_FILE_check_existence: file '/opt/ctmage/ctm/core' doesn't exist
0928 14:40:25:038 AG(3):<<< OS_PROC_housekeeping
0928 14:40:25:038 AG(4):>>> AG_COLLECT_get_specs enter
0928 14:40:25:038 AG(5):GM_PARAM_get: table:'CONFIG', key:'CPU_SPEC_INTERVAL'
0928 14:40:25:038 AG(5):table 'CONFIG' already loaded
0928 14:40:25:038 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'CPU_SPEC_INTERVAL', value:''
0928 14:40:25:038 AG(4):GM_COLLECT_getCpuSpecInterval used interval: '240'
0928 14:40:25:038 AG(4):<<< AG_COLLECT_get_specs exit. 56 minutes since last update. No need for Updating
0928 14:40:25:038 AG(4):>>> AG_AVSTAT_check_availability enter
0928 14:40:25:038 AG(5):>>> GM_AVSTAT_getAvailabilityIntervals Enter
0928 14:40:25:038 AG(5):GM_PARAM_get: table:'CONFIG', key:'CMACC_AV_INTERVAL'
0928 14:40:25:038 AG(5):table 'CONFIG' already loaded
0928 14:40:25:038 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'CMACC_AV_INTERVAL', value:'3600'
0928 14:40:25:038 AG(5):GM_PARAM_get: table:'CONFIG', key:'CMACC_UNAV_INTERVAL'
0928 14:40:25:038 AG(5):table 'CONFIG' already loaded
0928 14:40:25:038 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'CMACC_UNAV_INTERVAL', value:'90'
0928 14:40:25:038 AG(4):GM_AVSTAT_getAvailabilityIntervals Availability interval: '3600' seconds
0928 14:40:25:038 AG(4):GM_AVSTAT_getAvailabilityIntervals Unavailability interval: '90' seconds
0928 14:40:25:038 AG(5):>>> GM_AVSTAT_getAvailabilityIntervals Exit
0928 14:40:25:038 AG(4):121 seconds since last test of unavailable CM accounts
0928 14:40:25:038 AG(4):3383 seconds since last test of all CM accounts
0928 14:40:25:038 AG(4):Time to test unavailable accounts
0928 14:40:25:038 AG(4):Not yet time for all accounts testing
0928 14:40:25:038 AG(3):>>> GM_AVSTAT_get_unavailable_cmlist Enter
0928 14:40:25:038 AG(3):OS_FILE_build_filetype Starting: orderno=, runno=0, mode=22
0928 14:40:25:038 AG(4):os_file_normalize_filename: In file name '', Out file name ''
0928 14:40:25:038 AG(4):OS_FILE_dir_open
0928 14:40:25:038 AG(4):dir_name:<./data/av_status>
0928 14:40:25:038 AG(4):OS_FILE_dir_next
0928 14:40:25:038 AG(4):OS_FILE_dir_close started
0928 14:40:25:038 AG(4):OS_FILE_dir_close ended
0928 14:40:25:038 AG(4):GM_PARAM_delimited_list_count
0928 14:40:25:038 AG(5):GM_PARAM_delimited_list_count: list '' delimiter '|'
0928 14:40:25:038 AG(4):GM_PARAM_delimited_list_reset
0928 14:40:25:038 AG(4):GM_PARAM_delimited_list_next_entry
0928 14:40:25:038 AG(5):>>> GM_STR_trim_leading_spaces enter: original string
0928 14:40:25:038 AG(5):GM_STR_trim_leading_spaces: will start copying from
0928 14:40:25:038 AG(5):<<< GM_STR_trim_leading_spaces exit: trimmed string
0928 14:40:25:038 AG(5):GM_PARAM_delimited_list_count: list count=0
0928 14:40:25:038 AG(4):GM_AVSTAT_get_unavailable_cmlist: Unavailable CM's list is empty
0928 14:40:25:038 AG(3):>>> GM_AVSTAT_get_unavailable_cmlist Exit. Number of CM's in the list: 0
0928 14:40:25:038 AG(4):<<< AG_AVSTAT_check_availability exit
0928 14:40:25:038 AG(4):>>> ag_main_check_Refresh_CMList enter. Persistent connection: Y, Connection established = 1, first = 0
0928 14:40:25:038 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:40:25:038 AG(5):GM_PARAM_get: table:'CONFIG', key:'PERSISTENT_CONNECTION'
0928 14:40:25:038 AG(5):table 'CONFIG' already loaded
0928 14:40:25:038 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'PERSISTENT_CONNECTION', value:'N'
0928 14:40:25:038 AG(5):>>> AG_MAIN_is_Saas Enter. server_code=Current, primary_only=1
0928 14:40:25:038 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:40:25:038 AG(5):AG_MAIN_is_Saas Multi Server is not enabled. Reading from CONFIG
0928 14:40:25:038 AG(4):GM_PARAM_is_SAAS_on
0928 14:40:25:038 AG(5):GM_PARAM_get: table:'CONFIG', key:'INSTALL_CAT_TEST'
0928 14:40:25:038 AG(5):table 'CONFIG' already loaded
0928 14:40:25:038 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'INSTALL_CAT_TEST', value:''
0928 14:40:25:038 AG(5):GM_PARAM_get: table:'CONFIG', key:'INSTALL_CATEGORY'
0928 14:40:25:038 AG(5):table 'CONFIG' already loaded
0928 14:40:25:038 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'INSTALL_CATEGORY', value:'REG'
0928 14:40:25:038 AG(4):GM_PARAM_is_SAAS_on: SAAS is disabled
0928 14:40:25:038 AG(5):>>> AG_MAIN_is_Saas Exit. server_code=Current, primary_only=1, ret=0
0928 14:40:25:038 AG(5):GM_PARAM_get: table:'CONFIG', key:'CMLIST'
0928 14:40:25:038 AG(5):table 'CONFIG' already loaded
0928 14:40:25:038 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'CMLIST', value:'OS | AI | DATABASE'
0928 14:40:25:038 AG(3):ag_main_check_Refresh_CMList:    Current  CMLIST 'OS | AI | DATABASE'
0928 14:40:25:038 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:40:25:038 AG(5):GM_PARAM_get: table:'CONFIG', key:'CM_LIST_SENT2CTMS'
0928 14:40:25:038 AG(5):table 'CONFIG' already loaded
0928 14:40:25:038 AG(4):GM_PARAM_get: rc = 1, table:'CONFIG', key:'CM_LIST_SENT2CTMS', value:'OS | AI | DATABASE'
0928 14:40:25:038 AG(4):ag_main_check_Refresh_CMList: CMLIST was not updated since last sent to CTMS
0928 14:40:25:038 AG(4):>>> ag_main_check_Send_GetPing enter. Persistent connection: Y, Connection established = 1, first = 0
0928 14:40:25:038 AG(5):GM_PARAM_get: table:'CONFIG', key:'SEND_GETPING'
0928 14:40:25:038 AG(5):table 'CONFIG' already loaded
0928 14:40:25:038 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'SEND_GETPING', value:''
0928 14:40:25:038 AG(3):GM_PARAM_load Starting: Table='CONFIG', flag=GM_PARAM_LOAD_FORCE
0928 14:40:25:038 AG(4):>>> GM_PARAM_check_and_rename_audit_log enter
0928 14:40:25:038 AG(5):OS_FILE_check_existence: file name - './data/CONFAUDT'  mode - '0'
0928 14:40:25:038 AG(4):OS_FILE_check_existence: file './data/CONFAUDT' doesn't exist
0928 14:40:25:038 AG(4):GM_PARAM_check_and_rename_audit_log: Audit log file './data/CONFAUDT' with config changes not found
0928 14:40:25:038 AG(4):<<< GM_PARAM_check_and_rename_audit_log exit. rc=2
0928 14:40:25:038 AG(5):GM_PARAM_load: Audit log file './data/CONFAUDT' was not found or not renamed. rc_audit_log = 2
0928 14:40:25:038 AG(4):OS_FILE_stat enter: file_name = './data/CONFIG.dat'
0928 14:40:25:038 AG(4):size in bytes = 3175, modify timestamp = '20260928134408520'
0928 14:40:25:038 AG(3):GM_PARAM_load_file Starting. File: ./data/CONFIG.dat
0928 14:40:25:038 AG(4):OS_FILE_fopen started : ./data/CONFIG.dat. mode=4
0928 14:40:25:038 AG(4):OS_FILE_fopen : opened 5
0928 14:40:25:038 AG(4):OS_FILE_fclose started 5
0928 14:40:25:038 AG(4):OS_FILE_fclose ended
0928 14:40:25:038 AG(3):GM_PARAM_load_file Exiting. File: ./data/CONFIG.dat. rc=1
0928 14:40:25:038 AG(3):GM_PARAM_load Exiting: Table='CONFIG', flag=GM_PARAM_LOAD_FORCE, rc=1
0928 14:40:25:038 AG(4):GM_PARAM_delete: Enter
0928 14:40:25:038 AG(5):table 'CONFIG' already loaded
0928 14:40:25:038 AG(5):GM_PARAM_delete: table_find rc 1
0928 14:40:25:038 AG(5):GM_PARAM_delete: list_delete rc 6
0928 14:40:25:038 AG(4):GM_PARAM_delete: Exit. rc = 6
0928 14:40:25:038 AG(3):ag_main_check_Send_GetPing:    Number of CONFIG tries: '0'
0928 14:40:25:038 AG(3):AG_MAIN_is_MultiServer_enabled: >>> exit. is_MultiServer_enabled FALSE
0928 14:40:25:038 AG(4):<<< ag_main_check_Send_GetPing exit
0928 14:40:25:038 AG(4):>>> ag_main_checkDiskFreeSpace enter
0928 14:40:25:038 AG(5):GM_PARAM_get: table:'CONFIG', key:'CHECK_DISKSPACE_INTERVAL'
0928 14:40:25:038 AG(5):table 'CONFIG' already loaded
0928 14:40:25:038 AG(4):GM_PARAM_get: rc = 6, table:'CONFIG', key:'CHECK_DISKSPACE_INTERVAL', value:''
0928 14:40:25:038 AG(4):ag_main_checkDiskFreeSpace: Check disk space configuration interval is 3600 seconds
0928 14:40:25:038 AG(4):ag_main_checkDiskFreeSpace: It is not yet time to check disk space
0928 14:40:25:038 AG(4):<<< ag_main_checkDiskFreeSpace exit
0928 14:40:25:038 AG(4):>>> ag_main_merge_files enter
0928 14:40:25:038 AG(5):GM_PARAM_get: table:'CONFIG', key:'WRITE_MERGE_INTERVAL'
