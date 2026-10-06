
[p585600@caddeapllx2695 ~]$ sudo su
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ls -la /opt/ctmage/ctm/cm/AI/
total 8
drwxrwxr-x 12 ctmagelx ctmagelx  178 out  6 14:27 .
drwxr-xr-x  6 ctmagelx ctmagelx   55 mai  7 16:59 ..
drwxr-xr-x  3 ctmagelx ctmagelx   48 out  6 14:28 apps-repo
drwxr-xr-x  2 root     root        6 out  6 15:10 ccp_cache
drwxrwxr-x  3 ctmagelx ctmagelx   19 mai  6 19:12 curl
drwxr-xr-x  2 ctmagelx ctmagelx   78 out  6 15:10 CustomerLogs
drwxrwxr-x  5 ctmagelx ctmagelx  189 out  6 14:27 data
lrwxrwxrwx  1 ctmagelx ctmagelx   32 mai  6 19:12 exe -> /opt/ctmage/ctm/cm/AI/exe-921300
drwxrwxr-x  3 ctmagelx ctmagelx 4096 mai  6 19:12 exe-921300
drwxrwxr-x  5 ctmagelx ctmagelx   50 mai  6 19:12 ipp
drwxr-xr-x  2 ctmagelx ctmagelx    6 out  6 15:10 temp
drwxrwxr-x  2 ctmagelx ctmagelx 4096 mai  6 19:12 ThirdPartyLicense
drwxr-xr-x  2 ctmagelx ctmagelx    6 mai  6 19:12 wsdl-repo
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# find /opt/ctmage/ctm/cm/AI -maxdepth 4 -iname "*IIFX*" 2>/dev/null
/opt/ctmage/ctm/cm/AI/apps-repo/IIFX
/opt/ctmage/ctm/cm/AI/apps-repo/IIFX/IIFX.xml
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# grep -ril "IIFX" /opt/ctmage/ctm/cm/AI --include=*.xml 2>/dev/null | head
/opt/ctmage/ctm/cm/AI/CustomerLogs/customer_log_1bmb9_00002.xml
/opt/ctmage/ctm/cm/AI/CustomerLogs/customer_log_1bmv4_00001.xml
/opt/ctmage/ctm/cm/AI/apps-repo/IIFX/IIFX.xml
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ls -lrt /opt/ctmage/ctm/cm/AI/proclog/ 2>/dev/null | tail -5
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# grep -rih "IIFX\|Back End" /opt/ctmage/ctm/cm/AI/proclog/ 2>/dev/null | tail -20
[root@caddeapllx2695 p585600]#
