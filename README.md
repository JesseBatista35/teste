unzip -l /tmp/bkp_sirotcon/sirotcon-ejb.jar | grep -i "br/gov/caixa/log"

mkdir -p /tmp/bkp_sirotcon && mv /opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar* /tmp/bkp_sirotcon/

