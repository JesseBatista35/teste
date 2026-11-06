
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ PID=$(pgrep -f "sifec-intranet_node1_lx473" | head -1)
[p585600@cbrdeapllx473 ~]$ JHOME=$(dirname $(dirname $(sudo readlink -f /proc/$PID/exe))); echo $JHOME
/usr
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ ls -l $JHOME/lib/security/cacerts $JHOME/bin/keytool
ls: cannot access '/usr/lib/security/cacerts': No such file or directory
ls: cannot access '/usr/bin/keytool': No such file or directory
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo mkdir -p /opt/jboss/truststore
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
