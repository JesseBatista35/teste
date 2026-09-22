tail -30 /infra_app/logs/sifug/server-srjtqapllx0021_sifug_inter_8080.log

/opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect --controller=srjtqapllx0021:9990 --command="/host=srjtqapllx0021/server-config=srjtqapllx0021_sifug_inter_8080:read-attribute(name=status)"
