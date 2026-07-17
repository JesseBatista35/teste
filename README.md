oc create cm jboss-config-sihdg-jboss8 -n sihdg-des --from-file=standalone.xml=$HOME/standalone-okd.xml --dry-run=true -o yaml | oc apply -f -


oc get cm jboss-config-sihdg-jboss8 -n sihdg-des -o jsonpath='{.data.standalone-okd\.xml}' > $HOME/standalone-okd.xml
sed -i 's#jndi-name="java:jboss/datasources/ExampleDS" pool-name="sihdgDS"#jndi-name="java:jboss/jdbc/sihdgDS" pool-name="sihdgDS"#' $HOME/standalone-okd.xml
grep "pool-name=\"sihdgDS\"" $HOME/standalone-okd.xml
