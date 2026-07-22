
-sh-4.2$ oc get pods -n simil-des -o custom-columns=NAME:.metadata.name,STATUS:.status.phase,CPU_LIMIT:.spec.containers[0].resources.limits.cpu
NAME                                                STATUS      CPU_LIMIT
simil-api-des-4-deploy                              Succeeded   500m
simil-api-des-4-f6k6t                               Running     1
simil-api-des-9-deploy                              Failed      500m
simil-precificacao-api-des-114-deploy               Succeeded   500m
simil-precificacao-api-des-115-deploy               Succeeded   500m
simil-precificacao-api-des-115-mqlr9                Running     1
simil-precificacao-frontend-des-64-deploy           Succeeded   500m
simil-precificacao-frontend-des-65-2wnq2            Running     500m
simil-precificacao-frontend-des-65-deploy           Succeeded   500m
simil-precificacao-internet-api-des-30-deploy       Succeeded   500m
simil-precificacao-internet-api-des-31-49wl4        Running     1
simil-precificacao-internet-api-des-31-deploy       Succeeded   500m
simil-precificacao-internet-frontend-des-8-deploy   Succeeded   500m
simil-precificacao-internet-frontend-des-8-m9lp6    Running     500m
simil-precificacao-intranet-api-des-48-deploy       Succeeded   500m
simil-precificacao-intranet-api-des-49-deploy       Succeeded   500m
simil-precificacao-intranet-api-des-49-fp5jm        Running     1
simil-precificacao-queue-des-37-deploy              Succeeded   500m
simil-precificacao-queue-des-38-deploy              Succeeded   500m
simil-precificacao-queue-des-38-xjgk2               Running     1
-sh-4.2$


