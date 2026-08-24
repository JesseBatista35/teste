# Ver o port-offset configurado em cada script
grep -i "port.offset\|JBOSS_NODE" /etc/rc.d/init.d/jboss-eap6-CSD2.sh
grep -i "port.offset\|JBOSS_NODE" /etc/rc.d/init.d/jboss-eap6-CSD6.sh

# Checar status atual via systemd (mais confiável que ps)
systemctl status jboss-eap6-CSD2.service --no-pager
systemctl status jboss-eap6-CSD6.service --no-pager


systemctl start jboss-eap6-CSD2.service
systemctl start jboss-eap6-CSD6.service

