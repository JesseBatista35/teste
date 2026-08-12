
-sh-4.2$ oc rollout history dc/siint-saquetecban-pendencia-api-des
deploymentconfigs "siint-saquetecban-pendencia-api-des"
REVISION        STATUS          CAUSE
36              Complete        manual change
37              Complete        manual change
38              Failed          cancelled by the user
39              Failed          manual change
40              Failed          manual change
41              Failed          manual change
42              Failed          cancelled by the user
43              Failed          manual change
44              Failed          manual change
45              Failed          manual change

-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc siint-saquetecban-pendencia-api-des -o jsonpath='{.spec.triggers}'
[]-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
