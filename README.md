
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc login --token=sha256~vtE9kw63nfOn3ON6_1-_NPIqKKbqHvT8rOIadf5Lz_A --server=https://api.nprd.caixa:6443
Logged into "https://api.nprd.caixa:6443" as "p585600@corp.caixa.gov.br" using the token provided.

You have access to 984 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "sicvr-des".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc project siecm-des
Now using project "siecm-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                               READY     STATUS              RESTARTS       AGE
siecm-backend-des-104-deploy       0/1       Completed           0              193d
siecm-backend-des-104-gz8qt        1/1       Running             0              193d
siecm-batch-des-35-deploy          0/1       Completed           0              35d
siecm-batch-des-36-deploy          0/1       Completed           0              35d
siecm-batch-des-36-j4qlb           1/1       Running             0              35d
siecm-frontend-des-51-n4698        2/2       Running             1 (335d ago)   335d
siecm-middleware-des-223-bkj5v     1/1       Running             0              4d21h
siecm-middleware-des-223-deploy    0/1       Completed           0              4d21h
siecm-middleware-des-223-frtqv     1/1       Running             0              4d21h
siecm-middleware-des-223-gtrxm     0/1       ContainerCreating   0              4d21h
siecm-middleware-des-223-qtktl     1/1       Running             0              4d21h
siecm-siecm-api-des-191-cdrpf      1/1       Running             0              50d
siecm-siecm-api-des-191-deploy     0/1       Completed           0              200d
siecm-siecm-api-des-191-mkjsk      1/1       Running             0              49d
siecm-siecm-api-des-191-s69cg      1/1       Running             0              49d
siecm-single-front-des-18-deploy   0/1       Completed           0              319d
siecm-single-front-des-19-65bt9    2/2       Running             4              263d
siecm-single-front-des-19-deploy   0/1       Completed           0              263d
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod siecm-middleware-des-223-qtktl -o jsonpath='{.spec.containers[*].name}'
siecm-middleware-des-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs siecm-middleware-des-223-qtktl -c istio-proxy --tail=200
,Error from server (BadRequest): container istio-proxy is not valid for pod siecm-middleware-des-223-qtktl
-sh-4.2$ oc logs siecm-middleware-des-223-qtktl -c istio-proxy -- curl -X POST http://localhost:1500/logging?level=debug
error: expected 'logs (POD | TYPE/NAME) [CONTAINER_NAME]'.
POD or TYPE/NAME is a required argument for the logs command
See 'oc logs -h' for help and examples.
-sh-4.2$
