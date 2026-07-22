
-sh-4.2$ oc get pods -n simil-des --field-selector=status.phase=Running -o json | \
>   jq -r '.items[] | .metadata.name as $n | (.spec.containers + (.spec.initContainers // [])) [] | "\($n)\t\(.name)\t\(.resources.limits.cpu // "none")"'
simil-api-des-4-f6k6t   simil-api-des   1
simil-precificacao-api-des-115-mqlr9    simil-precificacao-api-des      1
simil-precificacao-frontend-des-65-2wnq2        simil-precificacao-frontend-des 500m
simil-precificacao-frontend-des-65-2wnq2        simil-precificacao-frontend-des-exporter        500m
simil-precificacao-internet-api-des-31-49wl4    simil-precificacao-internet-api-des     1
simil-precificacao-internet-frontend-des-8-m9lp6        simil-precificacao-internet-frontend-des        500m
simil-precificacao-internet-frontend-des-8-m9lp6        simil-precificacao-internet-frontend-des-exporter       500m
simil-precificacao-intranet-api-des-49-fp5jm    simil-precificacao-intranet-api-des     1
simil-precificacao-queue-des-38-xjgk2   simil-precificacao-queue-des    1
-sh-4.2$   oc get pods -n simil-des --field-selector=status.phase=Running -o jsonpath='{range .items[*]}{.metadata.name}{"\n"}{range .spec.initContainers[*]}  init:{.name}={.resources.limits.cpu}{"\n"}{end}{range .spec.containers[*]}  main:{.name}={.resources.limits.cpu}{"\n"}{end}{"\n"}{end}'
simil-api-des-4-f6k6t
simil-precificacao-api-des-115-mqlr9
simil-precificacao-frontend-des-65-2wnq2
simil-precificacao-internet-api-des-31-49wl4
simil-precificacao-internet-frontend-des-8-m9lp6
simil-precificacao-intranet-api-des-49-fp5jm
simil-precificacao-queue-des-38-xjgk2
-sh-4.2$
