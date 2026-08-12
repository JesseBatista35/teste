grep -A 1 "br.gov.caixa.psc.connector.util.Config" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml

cat /etc/systemd/system/jboss-eap.service 2>/dev/null | grep -i "server-config\|standalone"

systemctl cat jboss 2>/dev/null | grep -i "server-config\|standalone"

ps -ef | grep java | grep -o "server-config=[^ ]*"
