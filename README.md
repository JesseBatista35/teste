
-sh-4.2$ sudo systemctl list-units --all | grep -i jboss
  jboss-eap-standalone.service                                                                                   loaded    inactive dead      JBoss EAP Systemctl - STANDALONE
-sh-4.2$ sudo find /etc/systemd /usr/lib/systemd -name "*jboss*" -o -name "*sicmu*" 2>/dev/null
/etc/systemd/system/multi-user.target.wants/jboss-eap-standalone.service
/etc/systemd/system/jboss-eap-standalone.service
-sh-4.2$ at /proc/$(pgrep -f standalone.sh)/cmdline | tr '\0' ' ' | head -c 200
syntax error. Last token seen: /
Garbled time
-sh-4.2$




bashsudo systemctl restart $(sudo systemctl list-units | grep jboss | awk '{print $1}')
