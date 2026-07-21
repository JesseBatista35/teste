
-sh-4.2$
-sh-4.2$ oc get pod -l name=siavl-gerencial-backend-des -n siavl-des --sort-by=.metadata.creationTimestamp
NAME                                   READY     STATUS    RESTARTS   AGE
siavl-gerencial-backend-des-18-dbdcl   0/1       Running   4          8m
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh siavl-gerencial-backend-des-18-dbdcl -n siavl-des
Error from server (NotFound): pods "siavl-gerencial-backend-des-18-dbdcl" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -v http://localhost:8080/actuator/health/readiness
* About to connect() to localhost port 8080 (#0)
*   Trying ::1...
* Conexão recusada
*   Trying 127.0.0.1...
* Conexão recusada
* Failed connect to localhost:8080; Conexão recusada
* Closing connection 0
curl: (7) Failed connect to localhost:8080; Conexão recusada
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -v http://localhost:8080/actuator/health/liveness
* About to connect() to localhost port 8080 (#0)
*   Trying ::1...
* Conexão recusada
*   Trying 127.0.0.1...
* Conexão recusada
* Failed connect to localhost:8080; Conexão recusada
* Closing connection 0
curl: (7) Failed connect to localhost:8080; Conexão recusada
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod -l name=siavl-gerencial-backend-des -n siavl-des --sort-by=.metadata.creationTimestamp
NAME                                   READY     STATUS    RESTARTS   AGE
siavl-gerencial-backend-des-18-dbdcl   0/1       Running   4          9m
-sh-4.2$
