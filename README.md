4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ for r in 80 81; do
>   oc get rc sirex-agenda-api-des-$r -o json | python -c 'import json,sys; print(json.dumps(json.load(sys.stdin)["spec"]["template"]["spec"], indent=2, sort_keys=True))' > /tmp/rc$r.json
> done

error: You must be logged in to the server (Unauthorized)
Traceback (most recent call last):
  File "<string>", line 1, in <module>
  File "/usr/lib64/python2.7/json/__init__.py", line 290, in load
    **kw)
  File "/usr/lib64/python2.7/json/__init__.py", line 338, in loads
    return _default_decoder.decode(s)
  File "/usr/lib64/python2.7/json/decoder.py", line 366, in decode
    obj, end = self.raw_decode(s, idx=_w(s, 0).end())
  File "/usr/lib64/python2.7/json/decoder.py", line 384, in raw_decode
    raise ValueError("No JSON object could be decoded")
ValueError: No JSON object could be decoded
-sh-4.2$ diff /tmp/rc80.json /tmp/rc81.json
1,267d0
< {
<   "containers": [
<     {
<       "env": [
<         {
<           "name": "TZ",
<           "value": "America/Sao_Paulo"
<         },
<         {
<           "name": "API_CAIXA_BASE_URL",
<           "value": "https://api.des.caixa:8443"
<         },
<         {
<           "name": "API_INFORMACAO_CORPORATIVA_PRIVADAS_BASE_URL",
<           "value": "informacoes-corporativas-privadas"
<         },
<         {
<           "name": "API_INFORMACAO_CORPORATIVA_PUBLICAS_BASE_URL",
<           "value": "informacoes-corporativas-publicas"
<         },
<         {
<           "name": "DATABASE_HOST",
<           "value": "cnpexdadvm01-scan4.extra.caixa.gov.br"
<         },
<         {
<           "name": "DATABASE_PASSWORD",
<           "value": "${SREXBD01_ORACLE}"
<         },
<         {
<           "name": "DATABASE_PORT",
<           "value": "1521"
<         },
<         {
<           "name": "DATABASE_SERVICE",
<           "value": "cdbd08ngpdb003"
<         },
<         {
<           "name": "DATABASE_USERNAME",
<           "value": "SREXBD01"
<         },
<         {
<           "name": "JAVA_OPTIONS_APPEND",
<           "value": "-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
<         },
<         {
<           "name": "NO_PROXY",
<           "value": ".caixa,.caixa.gov.br"
<         },
<         {
<           "name": "PIX_ENVIRONMENT",
<           "value": "DES"
<         },
<         {
<           "name": "QUARKUS_OIDC_AUTH_SERVER_URL",
<           "value": "https://login.des.caixa/auth/realms/intranet"
<         },
<         {
<           "name": "SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS",
<           "value": "/usr/src/app/secrets_files/SIREX_DES/"
<         },
<         {
<           "name": "SSO_API_KEY",
<           "value": "${SIREX_BT_APIKEY}"
<         },
<         {
<           "name": "SSO_CLIENT_ID",
<           "value": "cli-ser-rex-agenda"
<         },
<         {
<           "name": "SSO_CLIENT_SECRET",
<           "value": "${CLISERREXAGENDA_SSO_INTRA}"
<         },
<         {
<           "name": "SSO_ISSUER_URI",
<           "value": "https://login.des.caixa/auth/realms/intranet"
<         },
<         {
<           "name": "SSO_REALM",
<           "value": "intranet"
<         }
<       ],
<       "image": "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sirex-agenda-api:20260922.1331-0.2.4.5-SNAPSHOT",
<       "imagePullPolicy": "Always",
<       "livenessProbe": {
<         "failureThreshold": 3,
<         "httpGet": {
<           "path": "/q/health/live",
<           "port": 8080,
<           "scheme": "HTTP"
<         },
<         "initialDelaySeconds": 15,
<         "periodSeconds": 10,
<         "successThreshold": 1,
<         "timeoutSeconds": 3
<       },
<       "name": "sirex-agenda-api-des",
<       "ports": [
<         {
<           "containerPort": 8080,
<           "protocol": "TCP"
<         }
<       ],
<       "readinessProbe": {
<         "failureThreshold": 3,
<         "httpGet": {
<           "path": "/q/health/ready",
<           "port": 8080,
<           "scheme": "HTTP"
<         },
<         "initialDelaySeconds": 25,
<         "periodSeconds": 10,
<         "successThreshold": 1,
<         "timeoutSeconds": 5
<       },
<       "resources": {
<         "limits": {
<           "cpu": "1",
<           "memory": "1Gi"
<         },
<         "requests": {
<           "cpu": "1",
<           "memory": "1Gi"
<         }
<       },
<       "terminationMessagePath": "/dev/termination-log",
<       "terminationMessagePolicy": "File",
<       "volumeMounts": [
<         {
<           "mountPath": "/usr/src/app/secrets_files",
<           "name": "secrets"
<         },
<         {
<           "mountPath": "/deployments/caixa-truststore-acteste-nprd.jks",
<           "name": "caixa-truststore-acteste-nprd",
<           "subPath": "caixa-truststore-acteste-nprd.jks"
<         }
<       ]
<     }
<   ],
<   "dnsPolicy": "ClusterFirst",
<   "imagePullSecrets": [
<     {
<       "name": "registry-secret"
<     }
<   ],
<   "initContainers": [
<     {
<       "env": [
<         {
<           "name": "SECRETS_PATH",
<           "value": "/usr/src/app/secrets_files"
<         },
<         {
<           "name": "BT_API_URL",
<           "value": "https://sicsn.caixa/BeyondTrust/api/public/v3"
<         },
<         {
<           "name": "CLIENT_ID",
<           "valueFrom": {
<             "secretKeyRef": {
<               "key": "BT_CLIENT_ID",
<               "name": "bt-client-secret-sirex-agenda-api-des"
<             }
<           }
<         },
<         {
<           "name": "CLIENT_SECRET",
<           "valueFrom": {
<             "secretKeyRef": {
<               "key": "BT_CLIENT_SECRET",
<               "name": "bt-client-secret-sirex-agenda-api-des"
<             }
<           }
<         },
<         {
<           "name": "BT_API_VERSION",
<           "value": "3.1"
<         },
<         {
<           "name": "SECRETS_LIST",
<           "value": "SIREX_DES/SREXBD01_ORACLE,SIREX_DES/CLISERREXAGENDA_SSO_INTRA,SIREX_DES/SIREX_BT_APIKEY"
<         },
<         {
<           "name": "BT_VERIFY_CA",
<           "value": "False"
<         }
<       ],
<       "image": "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2",
<       "imagePullPolicy": "IfNotPresent",
<       "name": "secrets-agent-sidecar",
<       "resources": {
<         "limits": {
<           "memory": "400Mi"
<         }
<       },
<       "securityContext": {
<         "runAsUser": 1337
<       },
<       "terminationMessagePath": "/dev/termination-log",
<       "terminationMessagePolicy": "File",
<       "volumeMounts": [
<         {
<           "mountPath": "/usr/src/app/secrets_files",
<           "name": "secrets"
<         }
<       ]
<     },
<     {
<       "command": [
<         "/bin/bash",
<         "/script/bt-check.sh"
<       ],
<       "env": [
<         {
<           "name": "SECRETS_PATH",
<           "value": "/usr/src/app/secrets_files"
<         },
<         {
<           "name": "SECRETS_LIST",
<           "value": "SIREX_DES/SREXBD01_ORACLE,SIREX_DES/CLISERREXAGENDA_SSO_INTRA,SIREX_DES/SIREX_BT_APIKEY"
<         }
<       ],
<       "image": "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552",
<       "imagePullPolicy": "IfNotPresent",
<       "name": "secrets-check",
<       "resources": {},
<       "terminationMessagePath": "/dev/termination-log",
<       "terminationMessagePolicy": "File",
<       "volumeMounts": [
<         {
<           "mountPath": "/usr/src/app/secrets_files",
<           "name": "secrets"
<         },
<         {
<           "mountPath": "/script",
<           "name": "script-bt-volume"
<         }
<       ]
<     }
<   ],
<   "restartPolicy": "Always",
<   "schedulerName": "default-scheduler",
<   "securityContext": {},
<   "terminationGracePeriodSeconds": 30,
<   "volumes": [
<     {
<       "emptyDir": {
<         "medium": "Memory"
<       },
<       "name": "secrets"
<     },
<     {
<       "configMap": {
<         "defaultMode": 420,
<         "name": "sirex-agenda-api-des-script-bt-check"
<       },
<       "name": "script-bt-volume"
<     },
<     {
<       "name": "caixa-truststore-acteste-nprd",
<       "secret": {
<         "defaultMode": 420,
<         "secretName": "caixa-truststore-acteste-nprd"
<       }
<     }
<   ]
< }
-sh-4.2$ oc debug rc/sirex-agenda-api-des-81 -n sirex-des
Defaulting container name to sirex-agenda-api-des.
Use 'oc describe pod/sirex-agenda-api-des-81-debug -n sirex-des' to see all of the containers in this pod.

Debugging with pod/sirex-agenda-api-des-81-debug, original command: <image entrypoint>
Waiting for pod to start ...

Removing debug pod ...
error: unable to delete the debug pod "sirex-agenda-api-des-81-debug": Delete https://api.nprd.caixa:6443/api/v1/namespaces/sirex-des/pods/sirex-agenda-api-des-81-debug: read tcp 10.122.155.62:60190->10.116.180.53:6443: read: connection reset by peer
error: watch closed before Until timeout
-sh-4.2$ env | grep -iE 'java|applicationinsights'
-sh-4.2$ ls -l /deployments/ | grep -i insights
ls: não é possível acessar /deployments/: Arquivo ou diretório não encontrado
-sh-4.2$ /usr/local/s2i/run
-sh: /usr/local/s2i/run: Arquivo ou diretório não encontrado
-sh-4.2$
