oc get cm jboss-config-sihdg-jboss8 -n sihdg-des -o jsonpath='{.data.standalone-okd\.xml}' > ~/standalone-okd.xml
sed -i 's#jndi-name="java:jboss/datasources/ExampleDS" pool-name="sihdgDS"#jndi-name="java:jboss/jdbc/sihdgDS" pool-name="sihdgDS"#' ~/standalone-okd.xml
grep "pool-name=\"sihdgDS\"" ~/standalone-okd.xml
oc create cm jboss-config-sihdg-jboss8 -n sihdg-des --from-file=standalone-okd.xml=~/standalone-okd.xml --dry-run=client -o yaml | oc apply -f -
oc rollout latest dc/sihdg-jboss8-des -n sihdg-des
oc rollout status dc/sihdg-jboss8-des -n sihdg-des --watch
