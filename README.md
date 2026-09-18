cat /etc/init.d/jboss-eap_hc.sh | head -60
/etc/init.d/jboss-eap_hc.sh status

mount | grep -i nfs
df -h /opt/jboss/jboss-eap/modules

ls -lat /opt/jboss_logs/jboss-eap-6.3/ 2>/dev/null | head -15
ls -lat /logs/jboss-eap/ 2>/dev/null | head -15
ls -lat /opt/jboss/jboss-eap/domain/log/ 2>/dev/null | head -15


