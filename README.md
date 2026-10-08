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
