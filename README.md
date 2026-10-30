# Chaves do ConfigMap — HMP x DES
oc describe cm jboss-config-sihdg-jboss8 -n sihdg-hmp | grep -B1 -- "^----"
oc describe cm jboss-config-sihdg-jboss8 -n sihdg-des | grep -B1 -- "^----"

# O que está no pod
oc exec sihdg-jboss8-hmp-1-74qsf -n sihdg-hmp -- ls -la /opt/server/standalone/configuration/
oc exec sihdg-jboss8-hmp-1-74qsf -n sihdg-hmp -- wc -l /opt/server/standalone/configuration/standalone.xml


# extrai o conteúdo atual (ajuste a chave conforme o describe mostrar)
oc get cm jboss-config-sihdg-jboss8 -n sihdg-hmp -o jsonpath='{.data.standalone-okd\.xml}' > /tmp/standalone.xml
grep -c sihdgDS /tmp/standalone.xml

oc create configmap jboss-config-sihdg-jboss8 -n sihdg-hmp \
  --from-file=standalone.xml=/tmp/standalone.xml \
  --dry-run -o yaml | oc replace -f -

oc delete pod sihdg-jboss8-hmp-1-74qsf -n sihdg-hmp
