
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod -n siepr-des siepr-backend-des-244-t982x -o jsonpath='{range .spec.initContainers[0].env[*]}{.name}{" -> "}{.valueFrom.secretKeyRef.name}{"/"}{.valueFrom.secretKeyRef.key}{"\n"}{end}'
SECRETS_PATH -> /
BT_API_URL -> /
CLIENT_ID -> bt-client-secret-siepr-backend-des/BT_CLIENT_ID
CLIENT_SECRET -> bt-client-secret-siepr-backend-des/BT_CLIENT_SECRET
BT_API_VERSION -> /
SECRETS_LIST -> /
BT_VERIFY_CA -> /
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod -n siepr-des siepr-backend-intranet-des-142-xfmps -o jsonpath='{range .spec.initContainers[0].env[*]}{.name}{" -> "}{.valueFrom.secretKeyRef.name}{"/"}{.valueFrom.secretKeyRef.key}{"\n"}{end}'
SECRETS_PATH -> /
BT_API_URL -> /
CLIENT_ID -> bt-client-secret-siepr-backend-intranet-des/BT_CLIENT_ID
CLIENT_SECRET -> bt-client-secret-siepr-backend-intranet-des/BT_CLIENT_SECRET
BT_API_VERSION -> /
SECRETS_LIST -> /
BT_VERIFY_CA -> /
-sh-4.2$
-sh-4.2$
-sh-4.2$


vao ao posnto pois esta fungio do escopo da demanda , o problema erelatod era de sso que nao exitems mais, o que podemos fazer ajustar nossa perte do que vvimos ensse novo problema e encerrar a demanda sem mais delongas
