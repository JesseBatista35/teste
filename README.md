oc get pods -n siabm-des | grep siabm-autenticacao-api

# pegar o pod atual e válido
oc get pods -n siabm-des | grep siabm-autenticacao-api-des

# entrar no pod real da app (use o nome retornado acima)
oc rsh <pod-atual> -n siabm-des

# dentro do pod:
java -version
echo $JAVA_HOME
ls -la $JAVA_HOME/lib/ext 2>/dev/null || echo "pasta ext não existe - Java 9+ (extension mechanism removido)"
find / -iname "*.jar" 2>/dev/null | grep -i dinamo   # ou o nome do jar da lib HSM
