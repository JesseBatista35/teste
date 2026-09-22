grep -c "keystore.if104.password" /infra_app/config/sifug/sifug_sifgd.properties


/opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect --controller=srjtqapllx0021:9990 --command="/host=srjtqapllx0021/server-config=srjtqapllx0021_sifug_inter_8080:restart"

grep -i "keystore password was incorrect\|erro ao carregar reposit" /infra_app/logs/sifug/server-srjtqapllx0021_sifug_inter_8080.log | tail -5

