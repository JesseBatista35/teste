# Onde está o conf do Apache (pega do processo em execução)
ps -ef | grep -E "[h]ttpd" | head -3

# Procurar referências ao SIGSJ nas montagens certas, mostrando erros de permissão
grep -rlniE "sigsj" /opt/apache /caixa 2>&1 | head -20

# Log de acesso do internet legado
tail -n 3 /log_apache/2.2/sigsj_internet/access.log
tail -n 3 /log_apache/2.2/sigsj_internet/access443.log

# Arquivos de log4j, agora sem -xdev
find /opt /caixa /log_jboss \( -name "sigsj_intranet.xml" -o -name "sigsj_ws_boleto.xml" -o -name "*sigsj*log4j*" \) 2>/dev/null
