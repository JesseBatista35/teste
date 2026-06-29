# 1. O arquivo tá em algum lugar?
find /opt/jboss -name "*vault*" -type f 2>/dev/null

# 2. Qual configuração o standalone.xml espera?
grep -A 5 "<vault>" /opt/jboss/standalone/configuration/standalone-full-ha.xml | head -20

# 3. O diretório existe?
ls -la /opt/jboss/standalone/configuration/vault-des 2>/dev/null || echo "NÃO EXISTE"

# 4. Que arquivos .keystore tem no container?
find /opt/jboss -name "*.keystore" -type f

# 5. Se o arquivo foi baixado, onde ficou?
ls -la /opt/jboss/standalone/configuration/ | grep -i vault
