
[root@caddeapllx1572 p585600]#
[root@caddeapllx1572 p585600]#
[root@caddeapllx1572 p585600]#
[root@caddeapllx1572 p585600]#
[root@caddeapllx1572 p585600]# ps -ef | grep -i agj
root      4652  4405  0 12:22 pts/1    00:00:00 grep --color=auto -i agj
[root@caddeapllx1572 p585600]# ps -ef | grep ctmagelx
root      4661  4405  0 12:23 pts/1    00:00:00 grep --color=auto ctmagelx
[root@caddeapllx1572 p585600]#
[root@caddeapllx1572 p585600]#
[root@caddeapllx1572 p585600]# find /opt/ctmage -iname "*.pid" -o -iname "*lock*" 2>/dev/null | xargs ls -la
-rwxr-xr-x 1 ctmagelx ctmagelx    920 Abr 12  2020 /opt/ctmage/bmcperl/bmcperl_V1/lib/5.28.1/CPAN/Exception/blocked_urllist.pm
-rwxr-xr-x 1 ctmagelx ctmagelx   9484 Abr 12  2020 /opt/ctmage/bmcperl/bmcperl_V1/lib/5.28.1/unicore/Blocks.txt
-rw-r--r-- 1 ctmagelx ctmagelx 142083 Set 22  2021 /opt/ctmage/ctm/cm/AP/apweb-920200/webapps/cmAzure-920200/WEB-INF/lib/azure-mgmt-locks-1.28.0.jar
-rwx------ 1 ctmagelx ctmagelx  11436 Set  1  2021 /opt/ctmage/ctm/toolbox/lock_test

/opt/ctmage/ctm/locks:
total 0
drwxr-xr-x  2 ctmagelx ctmagelx   6 Jul 22 11:50 .
drwxr-xr-x 23 ctmagelx ctmagelx 333 Set  3  2025 ..
[root@caddeapllx1572 p585600]# df -h /opt/ctmage
Sist. Arq.                       Tam. Usado Disp. Uso% Montado em
/dev/mapper/VG_PRINCIPAL-LV_OPT   10G  1,2G  8,9G  12% /opt
[root@caddeapllx1572 p585600]# su - ctmagelx -c "/opt/ctmage/ctm/scripts/rc.agent_user start"

 The agent was previously running as 'root'.
 You have chosen to start the agent as 'ctmagelx'.

 If you want to run jobs whose owner is different than 'ctmagelx', perform the following steps after the agent starts:
   1. Login as root user, execute the '/opt/ctmage/ctm/scripts/set_agent_mode' script and enable non-root mode.
   2. Define job owners passwords in Control-M using CCM or ctmsetown utility

 If you upgraded the agent from a previous version and you want the agent to start as user 'ctmagelx' when the host
 is restarted, replace the current startup script with '/opt/ctmage/ctm/scripts/rc.agent_user'

 Do you want to continue ? [Y/N]: yes

 Agent startup aborted

