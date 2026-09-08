-sh-4.2$ oc exec -it siecm-middleware-des-223-qtktl -- bash -c "echo | openssl s_client -connect 10.245.153.7:443 -servername sigaq.des.caixa -showcerts 2>/dev/null | openssl x509 -outform PEM > /tmp/sigaq-leaf.pem"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it siecm-middleware-des-223-qtktl -- openssl x509 -in /tmp/sigaq-leaf.pem -noout -text | grep -A3 "Authority Information Access"
            Authority Information Access:
                CA Issuers - URI:http://icptestes.caixa/certs/acicptestessub.cer

            X509v3 Basic Constraints: critical
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it siecm-middleware-des-223-qtktl -- curl -sk http://icptestes.caixa/certs/acicptestessub.cer -o /tmp/acicptestessub.der
^Ccommand terminated with exit code 130
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ^C
-sh-4.2$ oc exec -it siecm-middleware-des-223-qtktl -- openssl x509 -inform DER -in /tmp/acicptestessub.der -outform PEM -out /tmp/acicptestessub.pem
Can't open /tmp/acicptestessub.der for reading, No such file or directory
140044110956352:error:02001002:system library:fopen:No such file or directory:crypto/bio/bss_file.c:69:fopen('/tmp/acicptestessub.der','rb')
140044110956352:error:2006D080:BIO routines:BIO_new_file:no such file:crypto/bio/bss_file.c:76:
unable to load certificate
command terminated with exit code 1
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it siecm-middleware-des-223-qtktl -- bash -c "cat /tmp/acicptestessub.pem >> /tmp/chain-test.pem"
cat: /tmp/acicptestessub.pem: No such file or directory
command terminated with exit code 1
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it siecm-middleware-des-223-qtktl -- openssl s_client -connect 10.245.153.7:443 -servername sigaq.des.caixa -CAfile /tmp/acicptestessub.pem
139802263131968:error:02001002:system library:fopen:No such file or directory:crypto/bio/bss_file.c:69:fopen('/tmp/acicptestessub.pem','r')
139802263131968:error:2006D080:BIO routines:BIO_new_file:no such file:crypto/bio/bss_file.c:76:
139802263131968:error:0B084002:x509 certificate routines:X509_load_cert_crl_file:system lib:crypto/x509/by_file.c:199:
command terminated with exit code 1
-sh-4.2$

consigo baixar aqui pelala cosloe do okd e elhoar tambem o comaosn tan oesta dando certnto



OKD


Jesse Mouta Pereira Batista

Administrator
Home
Overview
Projects
Search
API Explorer
Events
Operators
Workloads
Pods
Deployments
DeploymentConfigs
StatefulSets
Secrets
ConfigMaps
CronJobs
Jobs
DaemonSets
ReplicaSets
ReplicationControllers
HorizontalPodAutoscalers
PodDisruptionBudgets
Networking
Storage
Builds
Observe
Compute
User Management
Administration

Project: siecm-des
Secrets

Create

Filter

Name
Search by name...
/

Name

Type

Size

Created
Secret
S
builder-dockercfg-j9btb
kubernetes.io/dockercfg	1	
21 de fev. de 2024, 15:11

Secret
S
builder-token-7j9hd
kubernetes.io/service-account-token	4	
21 de fev. de 2024, 15:11

Secret
S
builder-token-c8qkw
kubernetes.io/service-account-token	4	
21 de fev. de 2024, 15:11

Secret
S
caixa-truststore-acteste-nprd
Opaque	1	
3 de set. de 2026, 14:00

Secret
S
caixa-truststore-azure
Opaque	1	
8 de mar. de 2024, 16:47

Secret
S
caixa-truststore-azure2023v2
Opaque	1	
12 de jul. de 2024, 15:38

Secret
S
default-dockercfg-bmzc2
kubernetes.io/dockercfg	1	
21 de fev. de 2024, 15:11

Secret
S
default-token-4txgc
kubernetes.io/service-account-token	4	
21 de fev. de 2024, 15:11

Secret
S
default-token-g8zr5
kubernetes.io/service-account-token	4	
21 de fev. de 2024, 15:11

Secret
S
deployer-dockercfg-crm8v
kubernetes.io/dockercfg	1	
21 de fev. de 2024, 15:11

Secret
S
deployer-token-jg2jv
kubernetes.io/service-account-token	4	
21 de fev. de 2024, 15:11

Secret
S
deployer-token-xrlzl
kubernetes.io/service-account-token	4	
21 de fev. de 2024, 15:11

Secret
S
registry-secret
kubernetes.io/dockerconfigjson	1	
21 de fev. de 2024, 15:11

Secret
S
siecm-backend-des
Opaque	1	
26 de fev. de 2026, 13:49

Secret
S
siecm-batch-des
Opaque	2	
3 de ago. de 2026, 14:17

Secret
S
siecm-middleware-des
Opaque	2	
3 de set. de 2026, 14:00

Secret
S
siecm-siecm-api-des
Opaque	84	
19 de fev. de 2026, 15:41

Secret
S
siric-api-log-consumer-des
Opaque	2	
5 de dez. de 2025, 10:09

