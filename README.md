oc rsh -n siali-des siali-des-198-g7cd8 \
  grep -A8 'pool-name="siali-jpa-ds"' /opt/jboss/standalone/configuration/standalone.xml
