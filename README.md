AP-6.0.1/jboss-eap-6.0/standalone/configuration/logging.properties -jar /usr/local/EAP-6.0.1/jboss-eap-6.0/jboss-modules.jar -mp /usr/local/EAP-6.0.1/jboss-eap-6.0/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0 -Djboss.server.base.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
p585600  128592 128566  0 15:28 pts/2    00:00:00 grep jboss
[p585600@scttqapllx0032 ~]$ ps -ef | grep sismh
p585600  128596 128566  0 15:28 pts/2    00:00:00 grep sismh
[p585600@scttqapllx0032 ~]$ hostname -f
scttqapllx0032.df.caixa
[p585600@scttqapllx0032 ~]$ ls -la /etc/init.d/ | grep -i jboss
-rwxr-xr-x.  1 root root  4261 Abr  4  2019 jboss-master
-rwxr-xr-x.  1 root root  4479 Abr  4  2019 jboss-slave
-rwxrwxrwx.  1 root root  4750 Set 19  2023 jboss-standalone
-rwxr-xr-x.  1 root root  4728 Set 19  2023 jboss-standalone-sso
-rw-------.  1 root root  4732 Set 19  2023 jboss-standalone-sso.save
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$ ls -la /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/init.d/ 2>/dev/null
total 16
drwxrwxrwx. 2 jboss jboss 4096 Set 12  2022 .
drwxrwxrwx. 4 jboss jboss 4096 Dez 10  2025 ..
-rwxrwxrwx. 1 jboss jboss  369 Nov 20  2012 jboss-as.conf
-rwxrwxrwx. 1 jboss jboss 3672 Nov 20  2012 jboss-as-standalone.sh
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$ sudo service jboss restart
jboss: serviço desconhecido
[p585600@scttqapllx0032 ~]$ sudo /etc/init.d/jboss restart
sudo: /etc/init.d/jboss: command not found
[p585600@scttqapllx0032 ~]$ sudo su
Sorry, user p585600 is not allowed to execute '/bin/su' as root on scttqapllx0032.df.caixa.
[p585600@scttqapllx0032 ~]$ sudo su
Sorry, user p585600 is not allowed to execute '/bin/su' as root on scttqapllx0032.df.caixa.
[p585600@scttqapllx0032 ~]$
