# 1. Permissões e dono do arquivo
ls -la /home/jboss-eap-6.4/bin/standaloneCSD2.sh

# 2. Opções de montagem do filesystem onde ele está
mount | grep "$(df /home/jboss-eap-6.4/bin/standaloneCSD2.sh | tail -1 | awk '{print $1}')"
df -h /home/jboss-eap-6.4/bin/standaloneCSD2.sh

# 3. Status e contexto do SELinux
getenforce
ls -Z /home/jboss-eap-6.4/bin/standaloneCSD2.sh
