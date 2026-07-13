[p585600@scttqapllx0032 /]$ ps -ef | grep -i jboss]
p585600   13564  13248  0 12:35 pts/2    00:00:00 grep -i jboss]
[p585600@scttqapllx0032 /]$ ps -ef | grep -i jboss
p585600   13566  13248  0 12:35 pts/2    00:00:00 grep -i jboss
[p585600@scttqapllx0032 /]$ ps -ef | grep -i jboss
p585600   13569  13248  0 12:35 pts/2    00:00:00 grep -i jboss
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$ sudo -u jboss rm -f /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$ sudo -u jboss bash -c 'LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1 &'
Sorry, user p585600 is not allowed to execute '/bin/bash -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1 &' as jboss on scttqapllx0032.df.caixa.
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$ sudo -u jboss bash -c 'LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1 &'
Sorry, user p585600 is not allowed to execute '/bin/bash -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1 &' as jboss on scttqapllx0032.df.caixa.
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$ tail -f /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/server.log
12:29:12,157 WARN  [net.bull.javamelody] (javamelody sismh) exception while collecting data: java.lang.OutOfMemoryError: PermGen space: java.lang.OutOfMemoryError: PermGen space

12:30:12,043 WARN  [net.bull.javamelody] (javamelody sismh) exception while collecting data: java.lang.OutOfMemoryError: PermGen space: java.lang.OutOfMemoryError: PermGen space

12:31:12,079 WARN  [net.bull.javamelody] (javamelody sismh) exception while collecting data: java.lang.OutOfMemoryError: PermGen space: java.lang.OutOfMemoryError: PermGen space

12:32:12,113 WARN  [net.bull.javamelody] (javamelody sismh) exception while collecting data: java.lang.OutOfMemoryError: PermGen space: java.lang.OutOfMemoryError: PermGen space

12:33:12,073 WARN  [net.bull.javamelody] (javamelody sismh) exception while collecting data: java.lang.OutOfMemoryError: PermGen space: java.lang.OutOfMemoryError: PermGen space


