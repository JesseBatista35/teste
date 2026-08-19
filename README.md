
[p585600@scttqapllx0032 opt]$ sudo -u jboss kill -15 45082
[p585600@scttqapllx0032 opt]$ ps -p 45082 && echo "ainda vivo" || echo "morreu"
   PID TTY          TIME CMD
morreu
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$ sudo -u jboss rm -f /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file
[p585600@scttqapllx0032 opt]$ sudo -u jboss bash -c 'LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1 &'
Sorry, user p585600 is not allowed to execute '/bin/bash -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1 &' as jboss on scttqapllx0032.df.caixa.
[p585600@scttqapllx0032 opt]$ sudo -u jboss bash -c 'LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1 &'
Sorry, user p585600 is not allowed to execute '/bin/bash -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1 &' as jboss on scttqapllx0032.df.caixa.
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
