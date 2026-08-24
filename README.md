
-sh-4.2$ systemctl status jboss-eap6-CSD2.service --no-pager
● jboss-eap6-CSD2.service - SYSV: JBoss AS Standalone
   Loaded: loaded (/etc/rc.d/init.d/jboss-eap6-CSD2.sh; bad; vendor preset: disabled)
   Active: failed (Result: protocol) since Mon 2026-05-11 15:00:22 -03; 3 months 13 days ago
     Docs: man:systemd-sysv-generator(8)
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ systemctl status jboss-eap6-CSD6.service --no-pager
● jboss-eap6-CSD6.service - SYSV: JBoss AS Standalone
   Loaded: loaded (/etc/rc.d/init.d/jboss-eap6-CSD6.sh; bad; vendor preset: disabled)
   Active: failed (Result: protocol) since Mon 2026-05-11 15:00:22 -03; 3 months 13 days ago
     Docs: man:systemd-sysv-generator(8)
-sh-4.2$
-sh-4.2$ systemctl start jboss-eap6-CSD2.service
==== AUTHENTICATING FOR org.freedesktop.systemd1.manage-units ===
Authentication is required to manage system services or units.
Authenticating as: root
Password:

polkit-agent-helper-1: pam_authenticate failed: Authentication failure
==== AUTHENTICATION FAILED ===
Failed to start jboss-eap6-CSD2.service: Access denied
See system logs and 'systemctl status jboss-eap6-CSD2.service' for details.
-sh-4.2$
-sh-4.2$ systemctl start jboss-eap6-CSD2.service
==== AUTHENTICATING FOR org.freedesktop.systemd1.manage-units ===
Authentication is required to manage system services or units.
Authenticating as: root
Password:
polkit-agent-helper-1: pam_authenticate failed: Authentication failure
==== AUTHENTICATION FAILED ===
Failed to start jboss-eap6-CSD2.service: Access denied
See system logs and 'systemctl status jboss-eap6-CSD2.service' for details.
-sh-4.2$ sudo su

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# systemctl start jboss-eap6-CSD2.service
Job for jboss-eap6-CSD2.service failed. See "systemctl status jboss-eap6-CSD2.service" and "journalctl -xe" for details.
[root@caddeapllx698 p585600]# systemctl start jboss-eap6-CSD6.service
Job for jboss-eap6-CSD6.service failed. See "systemctl status jboss-eap6-CSD6.service" and "journalctl -xe" for details.
[root@caddeapllx698 p585600]#


