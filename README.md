
[p585600@sspdeapllx0041 ~]$ sudo -u root chown jboss7:jboss7 /opt/jboss/jboss-eap-7.0/domain/log/console.logsudo -u root chown jboss7:jboss7 /opt/jboss/jboss-eap-7.0/domain/log/console.log
chown: invalid option -- 'u'
Try `chown --help' for more information.
[p585600@sspdeapllx0041 ~]$ sudo rm /opt/jboss/jboss-eap-7.0/domain/log/console.log sudo -u jboss7 touch /opt/jboss/jboss-eap-7.0/domain/log/console.log
rm: invalid option -- 'u'
Try `rm --help' for more information.
[p585600@sspdeapllx0041 ~]$ sudo rm /opt/jboss/jboss-eap-7.0/domain/log/console.log sudo -u jboss7 touch /opt/jboss/jboss-eap-7.0/domain/log/console.log
rm: invalid option -- 'u'
Try `rm --help' for more information.
[p585600@sspdeapllx0041 ~]$
