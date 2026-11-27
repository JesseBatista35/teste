# como o JBoss é iniciado aqui (service, init.d ou script)
systemctl list-unit-files | grep -i -E 'jboss|eap'
ls -l /etc/init.d/ | grep -i -E 'jboss|eap'

# instalação e modo (domain ou standalone)
ls -l /opt/jboss/ /opt/jboss/jboss-eap/ 2>/dev/null
ls /opt/jboss/jboss-eap/domain/configuration/ 2>/dev/null

# NFS de módulos e outros mounts: precisam estar montados ANTES de subir
df -hT | grep -i nfs
grep -i nfs /etc/fstab
