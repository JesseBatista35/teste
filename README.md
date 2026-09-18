
-sh-4.1$ ls /etc/init.d/ | grep -iE "jboss|eap"
jboss-6.3_hc.sh
jboss-eap_hc.sh
-sh-4.1$
-sh-4.1$
-sh-4.1$ ls -la /opt | grep -iE "jboss|eap"
drwxr-xr-x   4 jboss    jboss     4096 Feb 19  2026 jboss
drwxr-xr-x   3 root     root      4096 Nov 24  2025 jboss_logs
drwxrwxr-x  10 jboss    jboss     4096 Jun 23  2022 sigdb
drwxrwxr-x   2 jboss    jboss        6 Jun  4  2020 sisgd
drwxr-xr-x   9 jboss    jboss     4096 Mar 15  2016 wily
-sh-4.1$ find / -maxdepth 5 -iname "domain.sh" 2>/dev/null
/opt/jboss/jboss-eap/bin/domain.sh
-sh-4.1$ find / -maxdepth 6 -iname "jboss-eap*" -type d 2>/dev/null
/opt/jboss_logs/jboss-eap-6.3
/opt/jboss/jboss-eap
/logs/jboss-eap

