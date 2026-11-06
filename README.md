
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ PID=$(pgrep -f "D\[Server:sifec-intranet_node1_lx473\]" | head -1); echo "PID: $PID"
PID: 1906979
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo readlink -f /proc/$PID/exe
/usr/java/openjdk-1.8.0.482/jre/bin/java
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ JHOME=$(dirname $(dirname $(sudo readlink -f /proc/$PID/exe))); echo $JHOME
/usr/java/openjdk-1.8.0.482/jre
[p585600@cbrdeapllx473 ~]$ ls -l $JHOME/lib/security/cacerts $JHOME/bin/keytool
-rwxr-xr-x 1 root root   9032 Jan 18  2026 /usr/java/openjdk-1.8.0.482/jre/bin/keytool
-r--r--r-- 1 root root 165797 Jan 18  2026 /usr/java/openjdk-1.8.0.482/jre/lib/security/cacerts
[p585600@cbrdeapllx473 ~]$
