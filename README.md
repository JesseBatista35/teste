Verificação da variável de ambiente do NFS do módulo de backend em DES do servidor 10.116.208.100

Libray em DES
https://devops.caixa/projetos/Caixa/_library?itemType=VariableGroups&view=VariableGroupView&variableGroupId=16584&path=SIMCN-BACKEND-DES

Caso tenha inconsistência de variaveis , faça a troca por favor.

 Foi aberto uma REQ para verificar o NFS e foi encontado a inconsistência.
REQ000146042612 - Reque aberta


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Library
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

Library

SIMCN-BACKEND-DES

Variable group
Properties
Variable group name
SIMCN-BACKEND-DES
Description
Grupo de variáveis de SIMCN-BACKEND-DES


Variables
DATASOURCE_ORACLE_CONNECTION_URL
jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV
DATASOURCE_ORACLE_MAX_POOL_SIZE
50
DATASOURCE_ORACLE_MIN_POOL_SIZE
1
DATASOURCE_ORACLE_PASSWORD
********
DATASOURCE_ORACLE_USER_NAME
SMCNDB01
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
96m
JVM_PASSWORD_TRUSTSTORE
changeit
PATH_DESTINO
/simcn
PATH_NFS
/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/UP_SIMCN
SERVER_NFS
nfsctcnprd.ctc.caixa
SIZE_VOLUME
50Gi
sso.client.id
cli-web-mcn
sso.realm
intranet
sso.url
https://login.des.caixa/auth
STORAGE_PATH
/upload/des/simcn
TRUSTSTORE_FILE
/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks




Verificação do NFS do servidor 10.116.208.100 para ver se tem algum diretório montando. Esse é da Esteira devOps, foi criado recentemente


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081674643
Criado em	 17/09/2026 15:42:19
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA

Prezados


Confirmado que o volume NFS está corretamente montado no ambiente DES do SIMCN-backend.

Evidências coletadas no pod simcn-backend-des-250-wfg6x (projeto simcn-des):

$ df -h
Filesystem                                                    Size  Used Avail Use% Mounted on
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMCN   50G     0   50G   0% /simcn

$ mount | grep nfs
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMCN on /simcn type nfs4 (rw,relatime,vers=4.0,rsize=1048576,wsize=1048576,namlen=255,hard,proto=tcp,timeo=600,retrans=2,sec=sys,clientaddr=192.168.236.147,local_lock=none,addr=192.168.224.105)

Confirmação via PersistentVolume (oc get pv simcn-backend-data-des -o yaml):

yaml
spec:
 nfs:
   path: /ifs/CADSVISISD4/SERVIDORES/CETAD/SIMCN
   server: nfsctcnprd.ctc.caixa
 persistentVolumeReclaimPolicy: Retain
 accessModes:
 - ReadWriteMany
 capacity:
   storage: 50Gi
status:
 phase: Bound

O PV está com status Bound, o mount tipo nfs4 está ativo dentro do container, servidor e path acessíveis, sem erros de I/O. A montagem está funcional.

Observação adicional:

Foi identificada uma divergência entre o path configurado na variável PATH_NFS do grupo de variáveis SIMCN-BACKEND-DES no Azure DevOps (/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/UP_SIMCN) e o path real do export usado pelo PV/mount em produção (/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMCN). O PV foi criado há 129 dias com persistentVolumeReclaimPolicy: Retain, o que sugere que a variável pode ter sido alterada posteriormente sem que o PV/PVC fosse recriado. Recomenda-se validar com a equipe responsável pelo storage se ambos os paths existem e se a variável está desatualizada, para evitar inconsistência em caso de recriação futura do volume.


Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD

ID da Ordem de Trabalho	 WO0000081674643
Criado em	 17/09/2026 13:52:19
Criado por	 P767992
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou
esgotamento de infraestrutura, serviço, máquina, armazenamento,
rotina ou situação que não esteja na iminência de tornar-se
incidente. Previsto atendimento em até 24 horas úteis.

[CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081674643
Criado em	 17/09/2026 12:34:25
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),

Informamos que sua solicitação foi recebida.

Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.

Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.

Novas informações e atualizações serão registradas diretamente nesta WO.

Atte.

Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081674643
Criado em	 17/09/2026 12:30:35
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quinta-feira, 24/09/2026 14:24:48



acho que fizeram errado a demanda nao era pra gente era ra armazendao certo?
