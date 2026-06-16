# Procura pelo script de startup do JBoss
find /opt -name "standalone.sh" -o -name "domain.sh" 2>/dev/null

# Verifica se tem init.d
ls -la /etc/init.d/ | grep -i jboss

# Procura processos jboss
ps aux | grep jboss

# Verifica se tem um wrapper
ls -la /opt/jboss-eap/bin/
