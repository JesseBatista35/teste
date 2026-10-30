# 1. Chaves do ConfigMap em cada ambiente (linhas terminando em ":" seguidas de "----")
oc describe cm jboss-config-sihdg-jboss8 -n sihdg-hmp | grep -B1 -- "^----"
oc describe cm jboss-config-sihdg-jboss8 -n sihdg-des | grep -B1 -- "^----"

# 2. O ConfigMap tem o datasource?
oc get cm jboss-config-sihdg-jboss8 -n sihdg-hmp -o yaml | grep -c sihdgDS
oc get cm jboss-config-sihdg-jboss8 -n sihdg-des -o yaml | grep -c sihdgDS

# 3. Onde cada DC monta o ConfigMap (mountPath/subPath)
oc get dc sihdg-jboss8-hmp -n sihdg-hmp -o yaml | grep -B1 -A3 "name: jboss-config-sihdg-jboss8" | grep -E "mountPath|subPath"
oc get dc sihdg-jboss8-des -n sihdg-des -o yaml | grep -B1 -A3 "name: jboss-config-sihdg-jboss8" | grep -E "mountPath|subPath"

# 4. O que está dentro do pod do HMP
oc get pods -n sihdg-hmp | grep jboss8
oc exec <nome-do-pod> -n sihdg-hmp -- grep -c sihdgDS /opt/server/standalone/configuration/standalone.xml



oc create configmap jboss-config-sihdg-jboss8 -n sihdg-hmp \
  --from-file=standalone.xml=./standalone.xml \
  --dry-run=client -o yaml | oc apply -f -
oc rollout latest dc/sihdg-jboss8-hmp -n sihdg-hmp
