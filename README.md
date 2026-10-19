# 1. Log da aplicação (caminho absoluto)
tail -n 300 /logs/jboss/jboss-eap/standalone/sigpd-backend/server.log
grep -iE "OutOfMemory|MODCLUSTER|ERROR|WFLYUT|Full GC" /logs/jboss/jboss-eap/standalone/sigpd-backend/server.log | tail -n 50

# 2. Saúde do GC (procure Full GC em sequência ou pausas longas)
tail -n 50 /logs/jboss/jboss-eap/standalone/sigpd-backend/gc.log
grep -c "Full GC" /logs/jboss/jboss-eap/standalone/sigpd-backend/gc.log

# 3. Portas em que o Java está escutando (http/ajp/offset)
ss -ltnp 2>/dev/null | grep -E "8080|8009|8443|9990" ; ss -ltn | grep 10.116.194.156

# 4. A aplicação responde localmente? (ajuste a porta conforme o item 3)
curl -sv -m 10 http://10.116.194.156:8080/sigpd-api/v1/health-check/live

# 5. O nó alcança os proxies mod_cluster?
curl -s -m 10 http://caddeapllx135.extra.caixa.gov.br:6666/mod_cluster_manager | grep -i -A3 caddeapllx929
curl -s -m 10 http://caddeapllx136.extra.caixa.gov.br:6666/mod_cluster_manager | grep -i -A3 caddeapllx929

# 6. Para onde o nome aponta e se o front responde
nslookup sigpd-backend.esteiras.des.caixa
curl -skv -m 10 https://sigpd-backend.esteiras.des.caixa/sigpd-api/v1/health-check/live -o /dev/null
curl -sv  -m 10 http://sigpd-backend.esteiras.des.caixa/sigpd-api/v1/health-check/live  -o /dev/null
