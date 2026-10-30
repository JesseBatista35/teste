oc rsh -n siali-des siali-des-198-g7cd8 /opt/jboss/bin/jboss-cli.sh -c \
  --command="/subsystem=datasources/data-source=siali-jpa-ds:read-resource(attributes-only=true)" \
  | grep -E 'connection-url|user-name|jndi-name'


  oc rsh -n siali-des siali-des-198-g7cd8 sh -c \
  "grep -rl 'siali-jpa-ds' /opt/jboss/standalone/configuration/ 2>/dev/null; ps -ef | grep -o '\-c [^ ]*\|server-config=[^ ]*'"

  oc rsh -n siali-des siali-des-198-g7cd8 \
  timeout 5 bash -c '</dev/tcp/10.116.18.152/51317' && echo ABERTA || echo FECHADA

oc rsh -n siali-des siali-des-198-g7cd8 \
  grep -iE 'PSQLException|FATAL|authentication' /opt/jboss/standalone/log/server.log | tail -20
