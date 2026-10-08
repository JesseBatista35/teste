Solicitando um Cloud Shell.Succeeded. 
Connecting terminal...

Welcome to Azure Cloud Shell

Type "az" to use Azure CLI
Type "help" to learn about Cloud Shell

Your Cloud Shell session will be ephemeral so no files or system changes will persist beyond your current session.
jesse [ ~ ]$ kubectl get azurekeyvaultsecret -n aks-istio-ingress akvs-siagf-api-jornadas
E1008 12:46:33.607182    1945 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:33.612376    1945 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:33.616387    1945 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:33.619086    1945 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:33.622493    1945 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
error: You must be logged in to the server (the server has asked for the client to provide credentials)
jesse [ ~ ]$ 
jesse [ ~ ]$ 
jesse [ ~ ]$ kubectl describe azurekeyvaultsecret -n aks-istio-ingress akvs-siagf-api-jornadas
E1008 12:46:42.004791    1949 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:42.009619    1949 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:42.015691    1949 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:42.020521    1949 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:42.024995    1949 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
error: You must be logged in to the server (the server has asked for the client to provide credentials)
jesse [ ~ ]$ 
jesse [ ~ ]$ 
jesse [ ~ ]$ kubectl get deploy,rs,pod,svc,cm -n siagf-api-jornadas
kubectl get virtualservice,gateway -n siagf-api-jornadas
kubectl describe pod -n siagf-api-jornadas -l app.kubernetes.io/name=siagf-api-jornadas
E1008 12:46:49.177673    1954 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:49.181520    1954 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:49.187372    1954 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:49.193214    1954 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:49.196977    1954 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:49.199951    1954 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:49.203409    1954 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:49.206574    1954 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:49.210076    1954 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
error: You must be logged in to the server (the server has asked for the client to provide credentials)
E1008 12:46:49.261940    1959 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:49.266921    1959 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:49.271762    1959 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:49.275457    1959 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:49.278674    1959 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:49.281517    1959 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
error: You must be logged in to the server (the server has asked for the client to provide credentials)
E1008 12:46:49.333355    1964 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:49.336522    1964 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:49.342247    1964 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:49.344763    1964 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E1008 12:46:49.347756    1964 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
error: You must be logged in to the server (the server has asked for the client to provide credentials)
jesse [ ~ ]$ 




pod criado no argocd


info: Microsoft.AspNetCore.Mvc.Infrastructure.DefaultActionDescriptorCollectionProvider[1]
      No action descriptors found. This may indicate an incorrectly configured application or missing application parts. To learn more, visit https://aka.ms/aspnet/mvc/app-parts
info: Microsoft.Hosting.Lifetime[14]
      Now listening on: http://[::]:8080
info: Microsoft.Hosting.Lifetime[0]
      Application started. Press Ctrl+C to shut down.
info: Microsoft.Hosting.Lifetime[0]
      Hosting environment: Production
info: Microsoft.Hosting.Lifetime[0]
      Content root path: /app
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
warn: Microsoft.AspNetCore.HttpsPolicy.HttpsRedirectionMiddleware[3]
      Failed to determine the https port for redirect.
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 78.3349ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 1.5160ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 1.3552ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.3896ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.3286ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.2661ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.2682ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.3114ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.2796ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.2459ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.2369ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.2996ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.2444ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.2352ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.2964ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.3497ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.6873ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.2282ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.2100ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.2399ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.2139ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.2079ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.4834ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.2106ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.6893ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.3456ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.3381ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.2084ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.2321ms
info: Microsoft.AspNetCore.Hosting.Diagnostics[1]
      Request starting HTTP/1.1 GET http://192.168.5.7:8080/healthz - - -
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[0]
      Executing endpoint 'Health checks'
info: Microsoft.AspNetCore.Routing.EndpointMiddleware[1]
      Executed endpoint 'Health checks'
info: Microsoft.AspNetCore.Hosting.Diagnostics[2]
      Request finished HTTP/1.1 GET http://192.168.5.7:8080/healthz - 200 - text/plain 0.2879ms



Applications
 siagf-api-jornadas-des
Application Details List
Log out
APP HEALTH 
 Progressing
SYNC STATUS 

 Synced
to HEAD (7a2e276)
Auto sync is enabled.
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #4 from caixagithub/update-image-siagf-api-jo
LAST SYNC 

 Sync OK
to 7a2e276
Succeeded a few seconds ago (Thu Oct 08 2026 09:48:15 GMT-0300)
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #4 from caixagithub/update-image-siagf-api-jo
APP CONDITIONS
 1 Warning



Applications
 siagf-api-jornadas-des
Application Details List
Log out
APP HEALTH 
 Healthy
SYNC STATUS 

 Synced
to HEAD (7a2e276)
Auto sync is enabled.
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #4 from caixagithub/update-image-siagf-api-jo
LAST SYNC 

 Sync OK
to 7a2e276
Succeeded a few seconds ago (Thu Oct 08 2026 09:48:15 GMT-0300)
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #4 from caixagithub/update-image-siagf-api-jo
APP CONDITIONS
 1 Warning
Previous12Next
Items per page: 10 
NAME
GROUP/KIND
SYNC ORDER
NAMESPACE
CREATED AT
STATUS
Pod
pod
siagf-api-jornadas-des-5bb845ff67-7fdsx
Pod
-
siagf-api-jornadas
a few seconds ago   10/08/26
 Healthy  
ReplicaSet
rs
siagf-api-jornadas-des-5bb845ff67
apps/ReplicaSet
-
siagf-api-jornadas
a few seconds ago   10/08/26
 Healthy  
Secret
secret
akv2k8s-siagf-api-jornadas-des
Secret
-
siagf-api-jornadas
5 minutes ago   10/08/26
G
gateway
siagf-api-jornadas-des-internal
networking.istio.io/Gateway
-
siagf-api-jornadas
5 minutes ago   10/08/26
 Synced
ConfigMap
cm
cm-siagf-api-jornadas
ConfigMap
-
siagf-api-jornadas
5 minutes ago   10/08/26
 Synced
Endpoints
ep
siagf-api-jornadas-des
Endpoints
-
siagf-api-jornadas
5 minutes ago   10/08/26
Service
svc
siagf-api-jornadas-des
Service
-
siagf-api-jornadas
5 minutes ago   10/08/26
 Healthy   Synced

 
