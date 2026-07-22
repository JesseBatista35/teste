
[root@caddeapllx1572 p585600]# /opt/ctmage/ctm/data
bash: /opt/ctmage/ctm/data: É um diretório
[root@caddeapllx1572 p585600]# su - ctmagelx -c "/opt/ctmage/ctm/scripts/rc.agent_user start"

 The agent was previously running as 'root'.
 You have chosen to start the agent as 'ctmagelx'.

 If you want to run jobs whose owner is different than 'ctmagelx', perform the following steps after the agent starts:
   1. Login as root user, execute the '/opt/ctmage/ctm/scripts/set_agent_mode' script and enable non-root mode.
   2. Define job owners passwords in Control-M using CCM or ctmsetown utility

 If you upgraded the agent from a previous version and you want the agent to start as user 'ctmagelx' when the host
 is restarted, replace the current startup script with '/opt/ctmage/ctm/scripts/rc.agent_user'

 Do you want to continue ? [Y/N]: y


Starting the agent as 'ctmagelx' user

Waiting for pid file of process agj to be created..

...........................................................
No file found for Agent Java Process process in '/opt/ctmage/ctm/pid/'.
Check the /opt/ctmage/ctm/proclog/start_ag_4943.log file for details.
[root@caddeapllx1572 p585600]#
[root@caddeapllx1572 p585600]#
[root@caddeapllx1572 p585600]#
