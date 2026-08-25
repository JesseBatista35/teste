Preciso de suporte em relação a esteira.:
- A esteira de CI/CD Workflow da erro:
  {"error":"permission denied","code":7,"message":"permission denied"}
Na etapa de Consultar application no Argo CD.

Comportamento esperado seria criar um novo namespace + pod no cluster aks-hab-des. 

Estrutura do projeto + dockerfile configurados
 
 
 
 SUMMARY EVENTS
REASON
MESSAGE
COUNT
FIRST OCCURRED
LAST OCCURRED
FailedCreate
Error creating: Internal error occurred: failed calling webhook "pods.env-injector.admission.spv.no": failed to call webhook: an error on the server ("{\"response\":{\"uid\":\"fbe3c19d-337f-44f3-a2c3-e599dbf242ac\",\"allowed\":false,\"status\":{\"metadata\":{},\"status\":\"Failure\",\"message\":\"failed to get auto cmd, error: cannot fetch image descriptor: GET https://index.docker.io/v2/registry/repo-app/manifests/1.0.0: UNAUTHORIZED: authentication required; [map[Action:pull Class: Name:registry/repo-app Type:repository]]\"}}}") has prevented the request from succeeding
1
9m ago
Today at 3:02 PM
9m ago
Today at 3:02 PM
FailedCreate
Error creating: Internal error occurred: failed calling webhook "pods.env-injector.admission.spv.no": failed to call webhook: an error on the server ("{\"response\":{\"uid\":\"595a3b33-c005-4b80-b722-1a5755c4c310\",\"allowed\":false,\"status\":{\"metadata\":{},\"status\":\"Failure\",\"message\":\"failed to get auto cmd, error: cannot fetch image descriptor: GET https://index.docker.io/v2/registry/repo-app/manifests/1.0.0: UNAUTHORIZED: authentication required; [map[Action:pull Class: Name:registry/repo-app Type:repository]]\"}}}") has prevented the request from succeeding
1
26m ago
Today at 2:46 PM
26m ago
Today at 2:46 PM
FailedCreate
Error creating: Internal error occurred: failed calling webhook "pods.env-injector.admission.spv.no": failed to call webhook: an error on the server ("{\"response\":{\"uid\":\"62470626-1cee-4525-a4cd-2e2f415a854b\",\"allowed\":false,\"status\":{\"metadata\":{},\"status\":\"Failure\",\"message\":\"failed to get auto cmd, error: cannot fetch image descriptor: GET https://index.docker.io/v2/registry/repo-app/manifests/1.0.0: UNAUTHORIZED: authentication required; [map[Action:pull Class: Name:registry/repo-app Type:repository]]\"}}}") has prevented the request from succeeding
1
42m ago
Today at 2:29 PM
42m ago
Today at 2:29 PM
FailedCreate
Error creating: Internal error occurred: failed calling webhook "pods.env-injector.admission.spv.no": failed to call webhook: an error on the server ("{\"response\":{\"uid\":\"638c22fc-a7da-4029-bf6e-a9541b6d4444\",\"allowed\":false,\"status\":{\"metadata\":{},\"status\":\"Failure\",\"message\":\"failed to get auto cmd, error: cannot fetch image descriptor: GET https://index.docker.io/v2/registry/repo-app/manifests/1.0.0: UNAUTHORIZED: authentication required; [map[Action:pull Class: Name:registry/repo-app Type:repository]]\"}}}") has prevented the request from succeeding
