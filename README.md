crontab -l
ls /etc/cron.d/ /etc/cron.hourly/ 2>/dev/null
rpm -qa 2>/dev/null | grep -iE "aide|tripwire|ossec"



lsof siavl.conf 2>/dev/null
