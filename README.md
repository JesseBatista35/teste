-sh-4.2$
-sh-4.2$ oc get sa -n siavl-des -o yaml | grep -i beyondtrust
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secretproviderclass -n siavl-des
error: the server doesn't have a resource type "secretproviderclass"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get all -n siavl-des | grep -i secret-agent





-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc delete pod siavl-atddigital-backend-des-123-wk6ct -n siavl-des
pod "siavl-atddigital-backend-des-123-wk6ct" deleted
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret -n siavl-des | grep bt-client-secret
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret bt-client-secret-<outro-app-mesmo-padrao> -n siavl-des -o yaml
-sh: outro-app-mesmo-padrao: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
