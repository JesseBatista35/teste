# Ver a linha problemática do unit file
sed -n '1,20p' /etc/systemd/system/jboss-eap7_hc.service

# Confirmar o ulimit que uma sessão manual do usuário jboss teria
su - jboss -c 'ulimit -u'
su - jboss -c 'ulimit -a'

# Ver script de start real usado pelo unit file (ExecStart)
grep -i ExecStart /etc/systemd/system/jboss-eap7_hc.service

# Histórico de quando/como o processo antigo (PID 13858) foi encerrado
journalctl -u jboss-eap7_hc --since "2026-09-07" --until "2026-09-09 18:00" --no-pager | tail -60
