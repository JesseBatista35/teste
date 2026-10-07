
[p585600@cspibapllx017 ~]$ sudo cat /etc/crontab /etc/anacrontab
SHELL=/bin/bash
PATH=/sbin:/bin:/usr/sbin:/usr/bin
MAILTO=root
HOME=/

# For details see man 4 crontabs

# Example of job definition:
# .---------------- minute (0 - 59)
# |  .------------- hour (0 - 23)
# |  |  .---------- day of month (1 - 31)
# |  |  |  .------- month (1 - 12) OR jan,feb,mar,apr ...
# |  |  |  |  .---- day of week (0 - 6) (Sunday=0 or 7) OR sun,mon,tue,wed,thu,fri,sat
# |  |  |  |  |
# *  *  *  *  * user-name command to be executed

# /etc/anacrontab: configuration file for anacron

# See anacron(8) and anacrontab(5) for details.

SHELL=/bin/sh
PATH=/sbin:/bin:/usr/sbin:/usr/bin
MAILTO=root
# the maximal random delay added to the base delay of the jobs
RANDOM_DELAY=45
# the jobs will be started during the following hours only
START_HOURS_RANGE=3-22

#period in days   delay in minutes   job-identifier   command
1       5       cron.daily              nice run-parts /etc/cron.daily
7       25      cron.weekly             nice run-parts /etc/cron.weekly
@monthly 45     cron.monthly            nice run-parts /etc/cron.monthly
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$ sudo ls /etc/cron.daily/
cups  logrotate  makewhatis.cron  mlocate.cron  prelink  readahead.cron  rhsmd  tmpwatch
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
