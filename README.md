# 1. Localizar todos os standalone.conf no servidor
find / -name "standalone.conf" 2>/dev/null

# 2. Ver se o jboss7 tem algum diretório de config específico por servidor
find /opt -name "*.conf" 2>/dev/null | grep -i jboss

# 3. Ver como o sisag-lx0041 está sendo iniciado (qual conf ele usa)
ps -ef | grep sisag
