# 1. O standalone.xml dentro do pod tem o datasource?
oc exec dc/sihdg-jboss8-hmp -n sihdg-hmp -- grep -n sihdgDS /opt/server/standalone/configuration/standalone.xml

# 2. Mounts de ConfigMap: HMP x DES
oc get dc sihdg-jboss8-hmp -n sihdg-hmp -o yaml | grep -B2 -A8 -i configmap
oc get dc sihdg-jboss8-des -n sihdg-des -o yaml | grep -B2 -A8 -i configmap

# 3. Variáveis de ambiente: HMP x DES
oc set env dc/sihdg-jboss8-hmp -n sihdg-hmp --list | grep -i -E "datasource|DB_|jndi"
oc set env dc/sihdg-jboss8-des -n sihdg-des --list | grep -i -E "datasource|DB_|jndi"
