
You have access to 1000 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "sibec-des".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod -n siavl-des -l name=siavl-gestaomodelonota-des
No resources found.
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc project siavl-des
Now using project "siavl-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod -n siavl-des -l name=siavl-gestaomodelonota-des
No resources found.
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                            READY     STATUS      RESTARTS         AGE
siavl-api-arquivos-des-59-deploy                0/1       Completed   0                24d
siavl-api-arquivos-des-60-deploy                0/1       Completed   0                15d
siavl-api-arquivos-des-60-nw648                 1/1       Running     14 (4h23m ago)   15d
siavl-api-atdremoto-des-130-deploy              0/1       Completed   0                3d15h
siavl-api-atdremoto-des-131-2ktz5               1/1       Running     0                2d22h
siavl-api-atdremoto-des-131-deploy              0/1       Completed   0                2d22h
siavl-api-atdremoto-des-131-dv8fm               1/1       Running     0                2d22h
siavl-api-atdremoto-des-131-pv672               1/1       Running     0                2d22h
siavl-api-autorizacaoenviomsg-des-6-n87c2       1/1       Running     0                387d
siavl-api-autorizacoesenviomsgs-des-7-7ttpf     1/1       Running     1                388d
siavl-api-notas-des-58-deploy                   0/1       Completed   0                15d
siavl-api-notas-des-59-2rqnt                    1/1       Running     0                16h
siavl-api-notas-des-59-deploy                   0/1       Completed   0                16h
siavl-atddigital-backend-des-135-deploy         0/1       Completed   0                2d17h
siavl-atddigital-backend-des-136-84pmt          1/1       Running     0                16h
siavl-atddigital-backend-des-136-deploy         0/1       Completed   0                16h
siavl-atddigital-frontend-des-90-deploy         0/1       Completed   0                16h
siavl-atddigital-frontend-des-91-deploy         0/1       Completed   0                16h
siavl-atddigital-frontend-des-91-zbqrt          2/2       Running     0                16h
siavl-atdremoto-backend-des-819-deploy          0/1       Completed   0                13h
siavl-atdremoto-backend-des-820-2n8hg           1/1       Running     0                12h
siavl-atdremoto-backend-des-820-deploy          0/1       Completed   0                12h
siavl-atdremoto-microfront-des-437-deploy       0/1       Completed   0                30d
siavl-atdremoto-microfront-des-438-5h5gz        2/2       Running     0                16d
siavl-atdremoto-microfront-des-438-deploy       0/1       Completed   0                16d
siavl-backend-des-82-deploy                     0/1       Completed   0                233d
siavl-backend-des-83-5hhnw                      1/1       Running     0                230d
siavl-backend-des-83-deploy                     0/1       Completed   0                230d
siavl-enviomsgativa-backend-des-62-deploy       0/1       Completed   0                17h
siavl-enviomsgativa-backend-des-63-deploy       0/1       Completed   0                17h
siavl-enviomsgativa-backend-des-63-wvjw4        1/1       Running     0                17h
siavl-enviomsgativa-microfront-des-42-deploy    0/1       Completed   0                43h
siavl-enviomsgativa-microfront-des-43-deploy    0/1       Completed   0                18h
siavl-enviomsgativa-microfront-des-43-gfm74     2/2       Running     0                18h
siavl-frontend-novo-des-53-deploy               0/1       Completed   0                259d
siavl-frontend-novo-des-54-deploy               0/1       Completed   0                233d
siavl-frontend-novo-des-54-hqzkc                2/2       Running     0                233d
siavl-gerencial-backend-des-78-deploy           0/1       Completed   0                8d
siavl-gerencial-backend-des-79-deploy           0/1       Completed   0                7d20h
siavl-gerencial-backend-des-79-q4sjp            1/1       Running     0                7d20h
siavl-gerencial-frontend-des-72-deploy          0/1       Completed   0                7d17h
siavl-gerencial-frontend-des-73-cb6mp           2/2       Running     1 (6d15h ago)    6d15h
siavl-gerencial-frontend-des-73-deploy          0/1       Completed   0                6d15h
siavl-gestaocreditomsg-backend-des-4-deploy     0/1       Completed   0                7d21h
siavl-gestaocreditomsg-backend-des-4-sszxw      1/1       Running     0                7d21h
siavl-gestaomodelonota-des-2-deploy             0/1       Error       0                15h
siavl-gestaonotas-backend-des-372-deploy        0/1       Completed   0                15d
siavl-gestaonotas-backend-des-373-deploy        0/1       Completed   0                14d
siavl-gestaonotas-backend-des-373-jj4b5         1/1       Running     0                14d
siavl-gestaonotas-submfe-des-317-deploy         0/1       Completed   0                63d
siavl-gestaonotas-submfe-des-318-82lnf          2/2       Running     0                37d
siavl-gestaonotas-submfe-des-318-deploy         0/1       Completed   0                37d
siavl-gestaounidade-backend-des-8-deploy        0/1       Completed   0                7d23h
siavl-gestaounidade-backend-des-9-8v5rs         1/1       Running     0                7d16h
siavl-gestaounidade-backend-des-9-deploy        0/1       Completed   0                7d16h
siavl-histatdremoto-backend-des-267-deploy      0/1       Completed   0                126d
siavl-histatdremoto-backend-des-268-8pdc5       1/1       Running     0                23d
siavl-histatdremoto-backend-des-268-deploy      0/1       Completed   0                23d
siavl-histatdremoto-microfront-des-108-deploy   0/1       Completed   0                21d
siavl-histatdremoto-microfront-des-109-d6zlw    2/2       Running     0                13d
siavl-histatdremoto-microfront-des-109-deploy   0/1       Completed   0                13d
siavl-minhasnotas-backend-des-279-deploy        0/1       Completed   0                21d
siavl-minhasnotas-backend-des-280-2xblc         1/1       Running     0                20d
siavl-minhasnotas-backend-des-280-deploy        0/1       Completed   0                20d
siavl-minhasnotas-microfront-des-179-deploy     0/1       Completed   0                21d
siavl-minhasnotas-microfront-des-180-deploy     0/1       Completed   0                20d
siavl-minhasnotas-microfront-des-180-pfmcb      2/2       Running     0                20d
siavl-web-internetpf-des-54-fkzr2               2/2       Running     6                487d
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ POD=$(oc get pod -n siavl-des -l name=siavl-gestaomodelonota-des -o jsonpath='{.items[0].metadata.name}')
error: error executing jsonpath "{.items[0].metadata.name}": array index out of bounds: index 0, length 0
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $POD -n siavl-des -- curl -s -i http://localhost:8080/actuator/health/liveness
Error from server (NotFound): pods "Error" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $POD -n siavl-des -- curl -s -i http://localhost:8080/actuator/health/readiness
Error from server (NotFound): pods "Error" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ .requestMatchers("/actuator/health/**").permitAll()
-sh: erro de sintaxe próximo do `token' não esperado `"/actuator/health/**"'
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set probe dc/siavl-gestaomodelonota-des -n siavl-des --liveness --readiness --remove
deploymentconfig.apps.openshift.io/siavl-gestaomodelonota-des probes updated
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set probe dc/siavl-gestaomodelonota-des -n siavl-des --liveness --readiness --open-tcp=8080 --initial-delay-seconds=60 --period-seconds=10 --timeout-seconds=3
deploymentconfig.apps.openshift.io/siavl-gestaomodelonota-des probes updated
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods | grep siavl-gestaomodelonotas
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                            READY     STATUS      RESTARTS         AGE
siavl-api-arquivos-des-59-deploy                0/1       Completed   0                24d
siavl-api-arquivos-des-60-deploy                0/1       Completed   0                15d
siavl-api-arquivos-des-60-nw648                 1/1       Running     14 (4h25m ago)   15d
siavl-api-atdremoto-des-130-deploy              0/1       Completed   0                3d15h
siavl-api-atdremoto-des-131-2ktz5               1/1       Running     0                2d22h
siavl-api-atdremoto-des-131-deploy              0/1       Completed   0                2d22h
siavl-api-atdremoto-des-131-dv8fm               1/1       Running     0                2d22h
siavl-api-atdremoto-des-131-pv672               1/1       Running     0                2d22h
siavl-api-autorizacaoenviomsg-des-6-n87c2       1/1       Running     0                387d
siavl-api-autorizacoesenviomsgs-des-7-7ttpf     1/1       Running     1                388d
siavl-api-notas-des-58-deploy                   0/1       Completed   0                15d
siavl-api-notas-des-59-2rqnt                    1/1       Running     0                16h
siavl-api-notas-des-59-deploy                   0/1       Completed   0                16h
siavl-atddigital-backend-des-135-deploy         0/1       Completed   0                2d17h
siavl-atddigital-backend-des-136-84pmt          1/1       Running     0                16h
siavl-atddigital-backend-des-136-deploy         0/1       Completed   0                16h
siavl-atddigital-frontend-des-90-deploy         0/1       Completed   0                16h
siavl-atddigital-frontend-des-91-deploy         0/1       Completed   0                16h
siavl-atddigital-frontend-des-91-zbqrt          2/2       Running     0                16h
siavl-atdremoto-backend-des-819-deploy          0/1       Completed   0                13h
siavl-atdremoto-backend-des-820-2n8hg           1/1       Running     0                12h
siavl-atdremoto-backend-des-820-deploy          0/1       Completed   0                12h
siavl-atdremoto-microfront-des-437-deploy       0/1       Completed   0                30d
siavl-atdremoto-microfront-des-438-5h5gz        2/2       Running     0                16d
siavl-atdremoto-microfront-des-438-deploy       0/1       Completed   0                16d
siavl-backend-des-82-deploy                     0/1       Completed   0                233d
siavl-backend-des-83-5hhnw                      1/1       Running     0                230d
siavl-backend-des-83-deploy                     0/1       Completed   0                230d
siavl-enviomsgativa-backend-des-62-deploy       0/1       Completed   0                17h
siavl-enviomsgativa-backend-des-63-deploy       0/1       Completed   0                17h
siavl-enviomsgativa-backend-des-63-wvjw4        1/1       Running     0                17h
siavl-enviomsgativa-microfront-des-42-deploy    0/1       Completed   0                43h
siavl-enviomsgativa-microfront-des-43-deploy    0/1       Completed   0                18h
siavl-enviomsgativa-microfront-des-43-gfm74     2/2       Running     0                18h
siavl-frontend-novo-des-53-deploy               0/1       Completed   0                259d
siavl-frontend-novo-des-54-deploy               0/1       Completed   0                233d
siavl-frontend-novo-des-54-hqzkc                2/2       Running     0                233d
siavl-gerencial-backend-des-78-deploy           0/1       Completed   0                8d
siavl-gerencial-backend-des-79-deploy           0/1       Completed   0                7d20h
siavl-gerencial-backend-des-79-q4sjp            1/1       Running     0                7d20h
siavl-gerencial-frontend-des-72-deploy          0/1       Completed   0                7d17h
siavl-gerencial-frontend-des-73-cb6mp           2/2       Running     1 (6d15h ago)    6d15h
siavl-gerencial-frontend-des-73-deploy          0/1       Completed   0                6d15h
siavl-gestaocreditomsg-backend-des-4-deploy     0/1       Completed   0                7d21h
siavl-gestaocreditomsg-backend-des-4-sszxw      1/1       Running     0                7d21h
siavl-gestaomodelonota-des-2-deploy             0/1       Error       0                15h
siavl-gestaomodelonota-des-3-deploy             1/1       Running     0                45s
siavl-gestaomodelonota-des-3-pfsdd              0/1       Running     0                43s
siavl-gestaonotas-backend-des-372-deploy        0/1       Completed   0                15d
siavl-gestaonotas-backend-des-373-deploy        0/1       Completed   0                14d
siavl-gestaonotas-backend-des-373-jj4b5         1/1       Running     0                14d
siavl-gestaonotas-submfe-des-317-deploy         0/1       Completed   0                63d
siavl-gestaonotas-submfe-des-318-82lnf          2/2       Running     0                37d
siavl-gestaonotas-submfe-des-318-deploy         0/1       Completed   0                37d
siavl-gestaounidade-backend-des-8-deploy        0/1       Completed   0                7d23h
siavl-gestaounidade-backend-des-9-8v5rs         1/1       Running     0                7d16h
siavl-gestaounidade-backend-des-9-deploy        0/1       Completed   0                7d16h
siavl-histatdremoto-backend-des-267-deploy      0/1       Completed   0                126d
siavl-histatdremoto-backend-des-268-8pdc5       1/1       Running     0                23d
siavl-histatdremoto-backend-des-268-deploy      0/1       Completed   0                23d
siavl-histatdremoto-microfront-des-108-deploy   0/1       Completed   0                21d
siavl-histatdremoto-microfront-des-109-d6zlw    2/2       Running     0                13d
siavl-histatdremoto-microfront-des-109-deploy   0/1       Completed   0                13d
siavl-minhasnotas-backend-des-279-deploy        0/1       Completed   0                21d
siavl-minhasnotas-backend-des-280-2xblc         1/1       Running     0                20d
siavl-minhasnotas-backend-des-280-deploy        0/1       Completed   0                20d
siavl-minhasnotas-microfront-des-179-deploy     0/1       Completed   0                21d
siavl-minhasnotas-microfront-des-180-deploy     0/1       Completed   0                20d
siavl-minhasnotas-microfront-des-180-pfmcb      2/2       Running     0                20d
siavl-web-internetpf-des-54-fkzr2               2/2       Running     6                487d
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod -n siavl-des -l name=siavl-gestaomodelonota-des
NAME                                 READY     STATUS    RESTARTS   AGE
siavl-gestaomodelonota-des-3-pfsdd   1/1       Running   0          72s
-sh-4.2$
-sh-4.2$
-sh-4.2$ POD=$(oc get pod -n siavl-des -l name=siavl-gestaomodelonota-des -o jsonpath='{.items[0].metadata.name}')
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $POD -n siavl-des -- curl -s -i http://localhost:8080/actuator/health/liveness
HTTP/1.1 401
X-Correlation-ID: 456f0aa5-18ab-41b1-9613-4eac7c6bbc09
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
WWW-Authenticate: Bearer
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'; base-uri 'none'; form-action 'none'
Content-Length: 0
Date: Fri, 30 Oct 2026 12:18:27 GMT

-sh-4.2$
-sh-4.2$
-sh-4.2$ c exec $POD -n siavl-des -- curl -s -i http://localhost:8080/actuator/health/readiness
-sh: c: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $POD -n siavl-des -- curl -s -i http://localhost:8080/actuator/health/readiness
HTTP/1.1 401
X-Correlation-ID: 099406e7-0a15-4177-ac70-87dbfbc0a3ac
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
WWW-Authenticate: Bearer
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'; base-uri 'none'; form-action 'none'
Content-Length: 0
Date: Fri, 30 Oct 2026 12:18:38 GMT

-sh-4.2$ .requestMatchers("/actuator/health/**").permitAll()
-sh: erro de sintaxe próximo do `token' não esperado `"/actuator/health/**"'
-sh-4.2$
