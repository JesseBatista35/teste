
[p585600@cspdeapllx011 ~]$ sudo cp /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12 \
> /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12.bak_$(date +%Y%m%d)

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

Senha SUDO:
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ sudo cp /tmp/s-4570-5_CERT_legacy.p12 \
> /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12
[p585600@cspdeapllx011 ~]$ sudo chown c160397:desenv /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12
Sorry, user p585600 is not allowed to execute '/bin/chown c160397:desenv /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12' as root on cspdeapllx011.
[p585600@cspdeapllx011 ~]$ sudo chmod 644 /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12
Sorry, user p585600 is not allowed to execute '/bin/chmod 644 /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12' as root on cspdeapllx011.
[p585600@cspdeapllx011 ~]$ ls -la /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12
-rw-r--r-- 1 c160397 desenv 4840 Ago 21 17:34 /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12
[p585600@cspdeapllx011 ~]$ md5sum /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12
49fbc2dd4b7288ae6c1d9cdb3002ccba  /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12
[p585600@cspdeapllx011 ~]$





sudo /opt/jboss/jboss-4.2.3.GA-jdk6/jboss.sh sinac01 stop
sleep 5
sudo /opt/jboss/jboss-4.2.3.GA-jdk6/jboss.sh sinac01 start
