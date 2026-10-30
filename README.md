oc rsh -n siali-des siali-des-198-g7cd8 \
  /opt/jboss/bin/jboss-cli.sh -c \
  --command="/subsystem=datasources/data-source=siali-jpa-ds:test-connection-in-pool"
