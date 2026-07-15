oc rsh -c siabm-autenticacao-api-des <nome-do-pod> -n siabm-des
echo $JAVA_HOME
ls -la $JAVA_HOME/jre/lib/ext/ 2>&1 || ls -la $JAVA_HOME/lib/ext/ 2>&1


