

#Ansible: Catalogo de softwares
# Puppet Name: inv_software
00 21 * * * /prod/scripts/sup/inv_software.sh 7261
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$ sudo ls -l /etc/cron.d/ ; sudo grep -l MAILTO /etc/cron.d/* /etc/crontab 2>/dev/null
total 20
-rw-r--r-- 1 root root 113 2015-09-22 08:05 0hourly
-rw-r--r-- 1 root root 132 2024-10-31 21:53 ocsinventory-agent
-rw------- 1 root root 108 2015-12-10 23:47 raid-check
-rw------- 1 root root 235 2016-03-08 10:01 sysstat
-rw-r--r-- 1 root root 187 2016-01-07 13:42 unbound-anchor
/etc/cron.d/0hourly
/etc/crontab
[p585600@cspibapllx017 ~]$
