grep -n -E "connection-url|user-name|10\.116|HDGDB" /tmp/standalone-des.xml

sed -e 's#/sihdg_des/Arquivos_SINAF/#/sihdg/Arquivos_SINAF/#' \
    -e 's#https://login.des.caixa/auth#https://login.hmp.caixa/auth#' \
    /tmp/standalone-des.xml > /tmp/standalone-hmp.xml

grep -n -i -E "\.des\.|_des|login\.hmp|/sihdg/Arquivos" /tmp/standalone-hmp.xml

oc create configmap jboss-config-sihdg-jboss8 -n sihdg-hmp \
  --from-file=standalone.xml=/tmp/standalone-hmp.xml \
  --dry-run -o yaml | oc replace -f -

  oc rollout latest dc/sihdg-jboss8-hmp -n sihdg-hmp
oc get pods -n sihdg-hmp | grep jboss8
oc logs -f <pod-sihdg-jboss8-hmp-2-xxxxx> -n sihdg-hmp | grep -E "sihdgDS|WFLYSRV0025|WFLYSRV0026|ERROR"
