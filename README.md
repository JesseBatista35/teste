/opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect --controller=srjtqapllx0021:9990

/host=srjtqapllx0021/server-config=srjtqapllx0021_sifug_inter_8080:restart

/host=*:read-children-names(child-type=server-config)

:read-children-names(child-type=host)

tail -f /opt/open/jboss/7.0.0/domain/servers/srjtqapllx0021_sifug_inter_8080/log/server.log
