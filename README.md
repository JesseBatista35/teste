
[p585600@caddeapllx2560 opt]$ file /opt/batch/config/sigdb/sigdb
cat /opt/batch/config/sigdb/sigdb
/opt/batch/config/sigdb/sigdb: ASCII text
### BEGIN INIT INFO
# Provides: Sigdb Agent
# Required-Start: $local_fs $network $syslog
# Required-Stop: $local_fs $syslog
# Should-Start: $syslog
# Should-Stop: $network $syslog
# Default-Start: 2 3 4 5
# Default-Stop: 0 1 6
# Short-Description: Start Sigdb Agent
# Description: Start Start Sigdb Agent
### END INIT INFO
cd /sigdb;nohup ./run &[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ ls -la /opt/batch/config/sigdb/
total 4
drwxr-xr-x 4 ctmagelx controlm  41 jun 10 13:49 .
drwxr-xr-x 5 root     root      96 ago 20 16:55 ..
drwxr-xr-x 2 ctmagelx controlm  34 jun 10 13:49 des
-rwxrw-rw- 1 ctmagelx controlm 346 jun 10 13:49 sigdb
drwxr-xr-x 2 ctmagelx controlm  23 jun 10 13:49 tqs
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ find /opt/batch/config/sigdb -maxdepth 2 -exec ls -ld {} \;
drwxr-xr-x 4 ctmagelx controlm 41 jun 10 13:49 /opt/batch/config/sigdb
-rwxrw-rw- 1 ctmagelx controlm 346 jun 10 13:49 /opt/batch/config/sigdb/sigdb
drwxr-xr-x 2 ctmagelx controlm 34 jun 10 13:49 /opt/batch/config/sigdb/des
-rwxrw-rw- 1 ctmagelx controlm 19 jun 10 13:49 /opt/batch/config/sigdb/des/SICCV.sys
-rwxrw-rw- 1 ctmagelx controlm 282 jun 10 13:49 /opt/batch/config/sigdb/des/run
drwxr-xr-x 2 ctmagelx controlm 23 jun 10 13:49 /opt/batch/config/sigdb/tqs
-rwxrw-rw- 1 ctmagelx controlm 19 jun 10 13:49 /opt/batch/config/sigdb/tqs/SICCV.sys
[p585600@caddeapllx2560 opt]$
