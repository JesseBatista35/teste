# Onde 'privileges' é preenchido (construtor / @PostConstruct / init)
sed -n '1,56p' /tmp/simkt-cls/privrepo.txt
grep -n -B3 -A3 "putfield.*privileges" /tmp/simkt-cls/privrepo.txt

# Erro do carregamento do CSV no boot de 08/10 16:03
zgrep -n -i -E "mpas|csv|opencsv|CsvRequired|CsvDataType|PrivilegeRepository" \
  /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log.2026-10-08.gz | grep -v "^\s*at " | head -30

# Se a exceção foi para stdout (printStackTrace)
grep -n -i -E "mpas|csv|CsvRequired|PrivilegeRepository" \
  /logs/jboss/jboss-eap/standalone/simkt-backend-vm/console-stdout.log | head -30
