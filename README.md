# 1. Histórico de comandos do usuário/root (pode ter os starts anteriores)
cat ~/.bash_history 2>/dev/null | grep -i "port-offset\|CSD2\|CSD6"
cat /root/.bash_history 2>/dev/null | grep -i "port-offset\|CSD2\|CSD6"

# 2. Log de boot do CSD6 (já que ele já rodou antes) - o cabeçalho de start do JBoss geralmente imprime os args de boot
grep -i "port-offset\|Command Line" /home/siaoi/jboss-eap-6.4/CSD6/log/server.log | head -5

# 3. Verificar se existe algum wrapper/systemd específico por instância
ls -la /etc/systemd/system/ | grep -i siaoi
ls -la /etc/init.d/ | grep -i siaoi

# 4. Conferir se existe um arquivo de config por node (algo como jboss-as.conf.CSD2)
ls -la /etc/jboss-as/



netstat -tlnp 2>/dev/null | grep java
