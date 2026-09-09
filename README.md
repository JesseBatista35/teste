Criar_volume_NFS_manual_atraves_de_um existente_OKD4

Follow
2

Edit

Danilo Albuquerque dos Santos e Souza
26 de jun. de 2025
Documentação - Criar segundo NFS OKD4 - WO0000076839631

0- Logar no cluster e acessar Project

oc login --token=xxxxxxxxx --server=https://api.apl4.caixa:6443

oc project sipbs-prd
1-Criar diretório do sistema no seu home

mkdir sipbs-micro-internet
2-Salvar os yaml do PV e PVC

oc get pv sipbs-internet-micro-data-prd -o yaml >> sipbs-internet-micro-b2b-prd-pv.yaml
oc get pvc sipbs-internet-micro-data-prd -o yaml >> sipbs-internet-micro-b2b-prd-pvc.yaml
3- Edita-los e remover os remover annotations, create, finalizers e status
Alterar os nomes dos pvs e pvs e size

DE:

-sh-4.2$ cat sipbs-internet-micro-b2b-prd-pv.yaml
apiVersion: v1
kind: PersistentVolume
metadata:
annotations:
pv.kubernetes.io/bound-by-controller:  "yes"
creationTimestamp: "2025-06-26T22:15:16Z"
finalizers:

kubernetes.io/pv-protection 
labels:
app: sipbs-internet-micro-prd
name: sipbs-internet-micro-data-prd
resourceVersion: "803304496"
uid: 539ecb43-d1d4-450a-a917-0fcd42cf160c
spec:
accessModes:
ReadWriteMany
capacity:
storage: 200Gi
claimRef:
apiVersion: v1
kind: PersistentVolumeClaim
name: sipbs-internet-micro-data-prd
namespace: sipbs-prd
resourceVersion: "803304494"
uid: 659086ed-24e9-4383-a81a-6409adb6e39e
nfs:
path: /ifs/CADSVISISD2/SERVIDORES/CEPTIBR/SIPBS
server: 2nfs20.ctc.caixa
persistentVolumeReclaimPolicy: Retain
volumeMode: Filesystem
status:
phase: Bound
PARA:

-sh-4.2$ cat sipbs-internet-micro-b2b-prd-pv
apiVersion: v1
kind: PersistentVolume
metadata:
annotations:
labels:
app: sipbs-internet-micro-prd
name: sipbs-internet-micro-b2b-prd
spec:
accessModes:

ReadWriteMany
capacity:
storage: 50Gi
claimRef:
apiVersion: v1
kind: PersistentVolumeClaim
name: sipbs-internet-micro-b2b-prd
namespace: sipbs-prd
nfs:
path: /ifs/CADSVISISD2/SERVIDORES/CEPTIBR/SIPBS_B2B
server: 2nfs20.ctc.caixa
persistentVolumeReclaimPolicy: Retain
volumeMode: Filesystem
DE:

-sh-4.2$ cat sipbs-internet-micro-b2b-prd-pvc.yaml
apiVersion: v1
kind: PersistentVolumeClaim
metadata:
annotations:
pv.kubernetes.io/bind-completed:  "yes"
creationTimestamp: "2025-06-26T22:15:17Z"
finalizers:

kubernetes.io/pvc-protection 
name: sipbs-internet-micro-data-prd
namespace: sipbs-prd
resourceVersion: "803304499"
uid: 659086ed-24e9-4383-a81a-6409adb6e39e
spec:
accessModes:
ReadWriteMany
resources:
requests:
storage: 200Gi
selector:
matchLabels:
app: sipbs-internet-micro-prd-esteiras
storageClassName: ""
volumeMode: Filesystem
volumeName: sipbs-internet-micro-data-prd
status:
accessModes:
ReadWriteMany
capacity:
storage: 200Gi
phase: Bound
PARA:

-sh-4.2$ cat sipbs-internet-micro-b2b-prd-pvc
apiVersion: v1
kind: PersistentVolumeClaim
metadata:
annotations:
name: sipbs-internet-micro-b2b-prd
namespace: sipbs-prd
spec:
accessModes:

ReadWriteMany
resources:
requests:
storage: 50Gi
selector:
matchLabels:
app: sipbs-internet-micro-prd-esteiras
storageClassName: ""
volumeMode: Filesystem
volumeName: sipbs-internet-micro-b2b-prd
-sh-4.2$
4- Aplicas os yamls

-sh-4.2$ oc apply -f sipbs-internet-micro-b2b-prd-pv.yaml
persistentvolume/sipbs-internet-micro-b2b-prd created
-sh-4.2$ oc apply -f sipbs-internet-micro-b2b-prd-pvc.yaml
ersistentvolumeclaim/sipbs-internet-micro-b2b-prd created
sh-4.2$
5- Verificar os PV e PVC

-sh-4.2$ oc get pv | grep sipbs
sipbs-b2b-data-prd 50Gi RWX Retain Bound sipbs-prd/sipbs-b2b-data-prd 14d
sipbs-internet-micro-b2b-prd 50Gi RWX Retain Bound sipbs-prd/sipbs-internet-micro-b2b-prd 52s
sipbs-internet-micro-data-prd 200Gi RWX Retain Bound sipbs-prd/sipbs-internet-micro-data-prd 67m
sipbs-micro-data-prd 200Gi RWX Retain Bound sipbs-prd/sipbs-micro-data-prd

                                                17d
-sh-4.2$ oc get pvc | grep sipbs
sipbs-b2b-data-prd Bound sipbs-b2b-data-prd 50Gi RWX 14d
sipbs-internet-micro-b2b-prd Bound sipbs-internet-micro-b2b-prd 50Gi RWX 53s
sipbs-internet-micro-data-prd Bound sipbs-internet-micro-data-prd 200Gi RWX 67m
sipbs-micro-data-prd Bound sipbs-micro-data-prd 200Gi RWX 17d
-sh-4.2$

6- Alterar yml do POD adicionando os parâmetros dos volumes:

DE:

  volumes:

    - name: sipbs-internet-micro-data-prd
      persistentVolumeClaim:
        claimName: sipbs-internet-micro-data-prd
PARA:

  volumes:
    - name: sipbs-internet-micro-b2b-prd
      persistentVolumeClaim:
        claimName: sipbs-internet-micro-b2b-prd
    - name: sipbs-internet-micro-data-prd
      persistentVolumeClaim:
        claimName: sipbs-internet-micro-data-prd
DE:

      volumeMounts:
        - name: sipbs-internet-micro-data-prd
          mountPath: /sipbs
PARA:

      volumeMounts:
        - name: sipbs-internet-micro-b2b-prd
          mountPath: /b2b
        - name: sipbs-internet-micro-data-prd
          mountPath: /sipbs
7- Solicitar um nova release e verificar no POD se foi aplicado.

      volumeMounts:
        - name: sipbs-internet-micro-b2b-prd
          mountPath: /b2b
        - name: sipbs-internet-micro-data-prd
          mountPath: /sipbs
14 visits in last 30 days



Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
All pipelines

SIHDG

SIHDG-jboss8
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
MUDANCA_GSC (3)
WO0000079495945
Scopes: Release
ADAPTER_VARIABLES (9)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
Compartilhamentos (4)
Scopes: Release
ID_ALOCAIP
C&t@d02
PW_ALOCAIP
********
PW_ISILON
********
USR_ISILON
s736651@corp.caixa.gov.br
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SIHDG-JBOSS8-DES (39)
Grupo de variáveis de SIHDG-JBOSS8-DES

Scopes: EC DES
DATASOURCE_CONNECTION_URL
jdbc:sqlserver://10.116.93.91:1433;DatabaseName=HDGDB001;encrypt=true;trustServerCertificate=true
DATASOURCE_PASSWORD
sihdguser
DATASOURCE_USER_NAME
sihdguser
JKS_FILE
caixa-truststore-acteste-nprd.jks
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
256m
NFS_PATH
/fs_sihdg
PASSWORD_TRUSTSTORE
changeit
PATH_DESTINO
/sihdg_des
PATH_NFS
/fs_sihdg
SERVER_NFS
hypernprd56.ad.caixa
SIHDG-DB_INTERNO
true
SIHDG-SEC_TEMPO_VIDA_TOKEN
5
SIHDG-classificacao.informacao
#INTERNO.CONFIDENCIAL
SIHDG-derivativo.avaliacao.remetente
GEGAP
SIHDG-mail.avaliacao.derivativo
GEOMI@MAIL.CAIXA
SIHDG-mail.endereco
gitecbr05@caixa.gov.br
SIHDG-mail.ordem.alteracao
GEOMI@MAIL.CAIXA
SIHDG-mail.ordem.cancelamento
GEOMI@MAIL.CAIXA
SIHDG-mail.ordem.execucao
GEOMI@MAIL.CAIXA
SIHDG-mail.ordem.insercao
GEOMI@MAIL.CAIXA
SIHDG-mail.ordem.invalidacao
GEOMI@MAIL.CAIXA
SIHDG-mail.registro.efetividade
GEANF@MAIL.CAIXA,GEMOC@MAIL.CAIXA
SIHDG-mail.smtp.host
smtptest.correiolivre.caixa
SIHDG-mail.smtp.port
25
SIHDG-ordem.alteracao.remetente
GEGAP
SIHDG-ordem.cancelamento.remetente
GEGAP
SIHDG-ordem.execucao.remetente
GETES
SIHDG-ordem.insercao.remetente
GEGAP
SIHDG-ordem.invalidacao.remetente
GESEN
SIHDG-path.arquivo.sinaf
/sihdg_des/
SIZE_VOLUME
50Gi
SSO_REALM
intranet
SSO_REQUIRED
none
SSO_RESOURCE
cli-web-hdg
SSO_URL
https://login.des.caixa/auth
_ENV.JAVA_OPTS_APPEND
"-Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djava.security.properties=/opt/server/bin/java.security.override"
SIHDG-JBOSS8-TQS (41)
Scopes: EC TQS
SIHDG-JBOSS8-HMP (1)
Grupo de variáveis de SIHDG-JBOSS8-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIHDG-JBOSS8-PRD (1)
Grupo de variáveis de SIHDG-JBOSS8-PRD
Scopes: EC PRD
|Manage variable groups
Expanded

Showing 2 items.

Showing 1 filtered items.

Showing 11 filtered items.

No items matched the supplied filter

Collapsed

Expanded

Collapsed

5 pipelines found

Row 6

Showing filters 1 through 2

