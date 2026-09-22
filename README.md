-Dlogging.configuration=file:.../data/logging.properties

-Dlogging.configuration=file:.../domain/configuration/default-server-logging.properties

lsof -p 24007 | grep -i "log\|REG"

cat /opt/open/jboss/7.0.0/domain/servers/srjtqapllx0021_sifug_inter_8080/data/logging.properties | grep -i "file\|handler"

/opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect --controller=srjtqapllx0021:9990 --command="/host=srjtqapllx0021/server-config=srjtqapllx0021_sifug_inter_8080:read-attribute(name=status)"
