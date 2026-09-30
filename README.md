
[p585600@scttqapllx0032 ~]$ sudo -l
Matching Defaults entries for p585600 on this host:
    env_reset, env_keep="COLORS DISPLAY HOSTNAME HISTSIZE INPUTRC KDEDIR LS_COLORS", env_keep+="MAIL PS1 PS2 QTDIR USERNAME LANG LC_ADDRESS LC_CTYPE", env_keep+="LC_COLLATE LC_IDENTIFICATION
    LC_MEASUREMENT LC_MESSAGES", env_keep+="LC_MONETARY LC_NAME LC_NUMERIC LC_PAPER LC_TELEPHONE", env_keep+="LC_TIME LC_ALL LANGUAGE LINGUAS _XKB_CHARSET XAUTHORITY", logfile=/var/log/sudo.log

User p585600 may run the following commands on this host:
    (ALL) NOPASSWD: ALL, (ALL) !/bin/su, (ALL) !/bin/sh, (ALL) !/bin/bash
    (ALL) NOPASSWD: ALL, (ALL) !/bin/su, (ALL) !/bin/sh, (ALL) !/bin/bash
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$ ls -l /etc/init.d/ | grep -i -E "jboss|eap"
-rwxr-xr-x. 1 root root  4261 Abr  4  2019 jboss-master
-rwxr-xr-x. 1 root root  4479 Abr  4  2019 jboss-slave
-rwxrwxrwx. 1 root root  4750 Set 19  2023 jboss-standalone
-rwxr-xr-x. 1 root root  4728 Set 19  2023 jboss-standalone-sso
-rw-------. 1 root root  4732 Set 19  2023 jboss-standalone-sso.save
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$ chkconfig --list 2>/dev/null | grep -i -E "jboss|eap"
jboss-standalone        0:não   1:não   2:sim   3:sim   4:sim   5:sim   6:não
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
