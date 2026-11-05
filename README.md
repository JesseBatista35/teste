
condicoes deste aviso
***********************************************************************
p585600@10.122.155.62's password:
Last login: Thu Nov  5 10:17:47 2026 from 10.122.150.31
-sh-4.2$ oc get pods -n sipgc-tqs | grep informacoes
sipgc-api-informacoes-tqs-83-deploy   0/1       Completed   0          141d
sipgc-api-informacoes-tqs-84-deploy   0/1       Completed   0          141d
sipgc-api-informacoes-tqs-85-deploy   0/1       Completed   0          141d
sipgc-api-informacoes-tqs-86-deploy   0/1       Completed   0          141d
sipgc-api-informacoes-tqs-87-deploy   0/1       Completed   0          121d
sipgc-api-informacoes-tqs-88-deploy   0/1       Completed   0          120d
sipgc-api-informacoes-tqs-89-deploy   0/1       Completed   0          65d
sipgc-api-informacoes-tqs-90-deploy   0/1       Completed   0          49d
sipgc-api-informacoes-tqs-90-zczmd    1/1       Running     0          49d
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ^C
-sh-4.2$ oc exec -it sipgc-api-informacoes-tqs-90-zczmd -n sipgc-tqs -- env | grep -i sigoc
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc login --token=sha256~05_taSw3yqWCske2TkwZOKNOmbaF9X47vd0rVMzxmek --server=https://api.nprd.caixa:6443
Logged into "https://api.nprd.caixa:6443" as "p585600@corp.caixa.gov.br" using the token provided.

You have access to 1000 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "sipgc-des".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it sipgc-api-informacoes-tqs-90-zczmd -n sipgc-tqs -- env | grep -i sigoc
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
