oc get pods -n siabm-des

oc rsh <nome-do-pod> -n siabm-des

java -version
echo $JAVA_HOME
ls -la $JAVA_HOME/lib/ext 2>/dev/null || echo "pasta ext não existe - Java 9+"

