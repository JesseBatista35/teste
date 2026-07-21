
-sh-4.2$
-sh-4.2$ oc get project siavl-des
NAME        DISPLAY NAME   STATUS
siavl-des                  Active
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc siavl-gerencial-backend-des -n siavl-des -o jsonpath='{.spec.template.spec.containers[0].readinessProbe.httpGet.path}'
/actuator/health/readiness-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc siavl-gerencial-backend-des -n siavl-des -o jsonpath='{.spec.template.spec.containers[0].livenessProbe.httpGet.path}'
/actuator/health/liveness-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ .requestMatchers("/actuator/health/**").permitAll()
-sh: erro de sintaxe próximo do `token' não esperado `"/actuator/health/**"'
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh <pod> -n siavl-des
-sh: pod: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh siavl-gerencial-backend-des-18-dbdcl  -n siavl-des
Error from server (NotFound): pods "siavl-gerencial-backend-des-18-dbdcl" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -v http://localhost:8080/actuator/health
* About to connect() to localhost port 8080 (#0)
*   Trying ::1...
* Conexão recusada
*   Trying 127.0.0.1...
* Conexão recusada
* Failed connect to localhost:8080; Conexão recusada
* Closing connection 0
curl: (7) Failed connect to localhost:8080; Conexão recusada
-sh-4.2$



