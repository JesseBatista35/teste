# Ver se o su aplica pam_limits
cat /etc/pam.d/su | grep -i limits

# Ver o log real do host controller pra achar o motivo da queda
tail -100 /opt/jboss/jboss-eap/hc/log/host-controller.log 2>/dev/null
find /opt/jboss/jboss-eap/hc/log -name "*.log" -newer /etc/security/limits.d/30-jboss-nproc.conf 2>/dev/null
find /logs/jboss-eap -name "*.log" -mmin -10 2>/dev/null
