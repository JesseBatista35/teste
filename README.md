
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env deployment/sigfa-api-extratos-des -n sigfa-des --list | grep -i smallrye
Error from server (NotFound): deployments.apps "sigfa-api-extratos-des" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n sigfa-des sigfa-api-extratos-des-13-vbwx8 -c sigfa-api-extratos-des -- sh -c 'echo "$SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS"'
Error from server (NotFound): pods "sigfa-api-extratos-des-13-vbwx8" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env deployment/<app-irmao-funcionando> -n <namespace> --list | grep -i "smallrye\|vault"
-sh: app-irmao-funcionando: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deployment <app-irmao-funcionando> -n <namespace> -o yaml | grep -B3 -A15 "secrets-agent\|beyondtrust\|vault"
-sh: app-irmao-funcionando: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env deployment/sigfa-api-extratos-des -n sigfa-des --list | grep -i smallrye
Error from server (NotFound): deployments.apps "sigfa-api-extratos-des" not found
-sh-4.2$ oc set env deployment/sigfa-api-extratos-des -n sigfa-des --list | grep -i smallrye
Error from server (NotFound): deployments.apps "sigfa-api-extratos-des" not found
-sh-4.2$ oc get deployment <app-irmao-funcionando> -n <namespace> -o yaml | grep -B3 -A15 "secrets-agent\|beyondtrust\|vault"
-sh: app-irmao-funcionando: Arquivo ou diretório não encontrado
-sh-4.2$ oc set env deployment/sigfa-api-extratos-des -n sigfa-des --list | grep -i smallrye
Error from server (NotFound): deployments.apps "sigfa-api-extratos-des" not found
-sh-4.2$ oc get deployment <app-irmao-funcionando> -n <namespace> -o yaml | grep -B3 -A15 "secrets-agent\|beyondtrust\|vault"
-sh: app-irmao-funcionando: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                        READY     STATUS             RESTARTS      AGE
sigfa-api-aplicacao-okd4-des-1149-deploy    0/1       Completed          0             30h
sigfa-api-aplicacao-okd4-des-1150-cwm5f     1/1       Running            0             22h
sigfa-api-aplicacao-okd4-des-1150-deploy    0/1       Completed          0             22h
sigfa-api-boletagem-des-89-deploy           0/1       Completed          0             11d
sigfa-api-boletagem-des-89-pzjnp            1/1       Running            0             11d
sigfa-api-extratos-des-13-deploy            0/1       Error              0             3h37m
sigfa-api-extratos-des-14-deploy            1/1       Running            0             35s
