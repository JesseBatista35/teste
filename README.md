# Limites globais do kernel
cat /proc/sys/kernel/threads-max
cat /proc/sys/kernel/pid_max

# Achar instalação e usuário de serviço do JBoss
find / -maxdepth 4 -iname 'jboss-eap*' 2>/dev/null
ls -la /opt/jboss/ 2>/dev/null

# Depois de achar o usuário (troque <usuario> abaixo)
grep <usuario> /etc/passwd
cat /etc/security/limits.conf
ls /etc/security/limits.d/
cat /etc/security/limits.d/*.conf 2>/dev/null

# OOM killer do kernel
dmesg -T | grep -i -E 'oom|kill' | tail -30
journalctl -k --since "today" | grep -i oom

# Estado atual do host
free -h
ps -eLf | wc -l
