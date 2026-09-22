# 1. Conferir o que está configurado na property
grep -A1 "keystore.if104.path\|keystore.if104.password\|truststore.caixa" /infra_app/config/sifug/sifug_sifgd.properties

# 2. Procurar o erro em português que pode ter passado despercebido
grep -i "erro ao carregar reposit\|certificado\|keystore password\|password was incorrect" /opt/open/jboss/7.0.0/domain/servers/srjtqapllx0021_sifug_inter_8080/log/server.log | tail -30

