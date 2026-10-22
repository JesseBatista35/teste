# A classe br.gov.caixa.log.Log estava no jar externo?
unzip -l /tmp/bkp_sirotcon/sirotcon-ejb.jar | grep -i "br/gov/caixa/log"

# Libs do SIROT / log empacotadas na build nova
cd /tmp && rm -rf earchk && mkdir earchk && cd earchk
unzip -l /opt/jboss-eap/standalone/deployments/sigsj_intranet-ear.ear | grep -iE "sirot|log|\.war"
unzip -o -q /opt/jboss-eap/standalone/deployments/sigsj_intranet-ear.ear sigsj_intranet.war
unzip -l sigsj_intranet.war | grep -iE "WEB-INF/lib/.*(sirot|log|cef|caixa)"
