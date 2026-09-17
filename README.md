/opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect --controller=srjtqapllx0021:9990 --command="/host=srjtqapllx0021/server-config=srjtqapllx0021_sifug_inter_8080:read-attribute(name=status)"


grep -i "exception\|error\|ssl\|keystore\|certificate" /opt/open/jboss/7.0.0/domain/servers/srjtqapllx0021_sifug_inter_8080/log/server.log | tail -50

openssl s_client -connect hisdf.dataprev.gov.br:443 -cert /tmp/if104_cert.pem -key /tmp/if104_key.pem
