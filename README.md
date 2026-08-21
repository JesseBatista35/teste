cd /opt/open/jboss/7.0.0/domain/configuration
grep -n "SICPU_APLICATIVO\|AUTHENTICATION_SERVER_URL\|sifpp_intra" domain.xml host.xml


/opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect controller=srjdeapllx158:9990

