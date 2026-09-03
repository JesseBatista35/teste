cp /opt/open/sso/7.3.0/standalone/configuration/standalone.xml /opt/open/sso/7.3.0/standalone/configuration/standalone.xml.bak_$(date +%Y%m%d_%H%M%S)

grep -n "siset.properties.vault.keypass.rsa" /opt/open/sso/7.3.0/standalone/configuration/standalone.xml

sed -i '/siset\.properties\.vault\.keypass\.rsa/d' /opt/open/sso/7.3.0/standalone/configuration/standalone.xml

grep -n "siset.properties.vault.keypass.rsa" /opt/open/sso/7.3.0/standalone/configuration/standalone.xml

sudo -u spssodr1 /opt/open/sso/7.3.0/bin/jboss-cli.sh --connect command=:shutdown

sudo -u spssodr1 kill 118044
sudo -u spssodr1 nohup /opt/open/sso/7.3.0/bin/standalone.sh -c standalone.xml -Djboss.server.name=siset_srjdeapllx075_inter_8080 -Djboss.as.management.blocking.timeout=1000 > /dev/null 2>&1 &
