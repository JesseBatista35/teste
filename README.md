
-sh-4.2$ oc get pods -n sispl-tqs | grep pix
]sispl-canal-webhook-pix-tqs-68c674cf68-bhsvm      1/1       Running   0          44m
-sh-4.2$ oc get pods -n sispl-tqs | grep pix
sispl-canal-webhook-pix-tqs-68c674cf68-bhsvm      1/1       Running   0          44m
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get route -n sispl-tqs | grep -i pix
sispl-canal-processamento-pix-tqs     sispl-canal-processamento-pix-tqs.apps.nctvmrh001.nuvem.caixa               sispl-canal-processamento-pix-tqs     web       edge/Redirect   None
sispl-canal-webhook-pix-tqs           sispl-canal-webhook-pix-tqs.apps.nctvmrh001.nuvem.caixa                     sispl-canal-webhook-pix-tqs           web       edge/Redirect   None
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs sispl-canal-webhook-pix-tqs-68c674cf68-bhsvm -c sispl-canal-webhook-pix-tqs -n sispl-tqs --since=30m | grep -i -E "POST|webhook|pix|ERROR"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -v -m 5 http://localhost:8080/sispl-canal-webhook-pix/
* About to connect() to localhost port 8080 (#0)
*   Trying ::1...
* Conexão recusada
*   Trying 127.0.0.1...
* Conexão recusada
* Failed connect to localhost:8080; Conexão recusada
* Closing connection 0
curl: (7) Failed connect to localhost:8080; Conexão recusada
-sh-4.2$
