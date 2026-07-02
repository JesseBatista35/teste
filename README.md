
-sh-4.2$ oc get dc sibec-arquivos -n -o jsonpath='{.spec.template.spec.volumes}' | python3 -m json.tool
No resources found.
Error from server (NotFound): namespaces "-o" not found
Expecting value: line 1 column 1 (char 0)
-sh-4.2$ oc get dc sibec-arquivos -n -o jsonpath='{.spec.template.spec.containers[0].volumeMounts}' | python3 -m json.tool
No resources found.
Error from server (NotFound): namespaces "-o" not found
Expecting value: line 1 column 1 (char 0)
-sh-4.2$ ^C
-sh-4.2$ oc get dc sibec-arquivos-tqs -n sibec-tqs -o jsonpath='{.spec.template.spec.volumes}' | python3 -m json.tool
Expecting value: line 1 column 2 (char 1)
-sh-4.2$ oc get dc sibec-arquivos-tqs -n sibec-tqs -o jsonpath='{.spec.template.spec.containers[0].volumeMounts}' | python3 -m json.tool
Expecting value: line 1 column 2 (char 1)
-sh-4.2$ oc set env dc/sibec-arquivos-tqs --list -n sibec-tqs | grep -i -E "pass|senha|datasource"
QUARKUS_DATASOURCE_DB-KIND=db2
QUARKUS_DATASOURCE_JDBC_MAX-SIZE=40
QUARKUS_DATASOURCE_JDBC_URL=jdbc:db2://10.216.80.111:446/RJKDB2DSDH:currentSchema=TQSBEC;
QUARKUS_DATASOURCE_PASSWORD=${SBECTR01_DB2}
QUARKUS_DATASOURCE_USERNAME=SBECTR01
-sh-4.2$


mais nesse caso tem como restaruar o volume que ele excluiu?
