
[p585600@caddeapllx2560 opt]$ mount | grep sigdb
[p585600@caddeapllx2560 opt]$ df -h /sigdb
Sist. Arq.                         Tam. Usado Disp. Uso% Montado em
/dev/mapper/VG_PRINCIPAL-LV_BARRA  9,0G  2,1G  6,9G  24% /
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ ls -la /sigdb/sigdb/TRANSMITE/
total 272
drwxr-xr-x 2 root    root       222 ago 18 10:41 .
drwxr-xr-x 9 root    root       290 ago 20 16:55 ..
-rwxr-xr-x 1 f593268 supadmin 55296 ago 18 10:41 SICCPMDD40113260817
-rwxr-xr-x 1 f593268 supadmin 55296 ago 18 10:41 SICCPMDD40213260817
-rwxr-xr-x 1 f593268 supadmin 55296 ago 18 10:41 SICCPMDD60113260817
-rwxr-xr-x 1 f593268 supadmin 55296 ago 18 10:41 SICCPMDD60213260817
-rwxr-xr-x 1 f593268 supadmin 17458 ago 18 10:41 SICCPMSI40114260817
-rwxr-xr-x 1 f593268 supadmin 17458 ago 18 10:41 SICCPMSI40214260817
-rwxr-xr-x 1 f593268 supadmin  1505 ago 18 10:41 SICCPMSI60114260817
-rwxr-xr-x 1 f593268 supadmin  1505 ago 18 10:41 SICCPMSI60214260817
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ ps -ef | grep -iE "java|jboss|wildfly"
p585600   738615  738498  0 11:20 pts/0    00:00:00 grep --color=auto -iE java|jboss|wildfly
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ systemctl status
