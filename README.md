
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$ }
-sh: erro de sintaxe próximo ao token inesperado `}'
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$ getent hosts nfsctcnprd.ctc.caixa
192.168.224.102 nfsctcnprd.ctc.caixa
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$ timeout 5 bash -c '</dev/tcp/nfsctcnprd.ctc.caixa/2049' && echo "2049 OK" || echo "2049 FALHA"
2049 FALHA
[p585600@caddeapllx2781 ~]$ timeout 5 bash -c '</dev/tcp/nfsctcnprd.ctc.caixa/111'  && echo "111 OK"  || echo "111 FALHA"
111 FALHA
[p585600@caddeapllx2781 ~]$ rpcinfo -p nfsctcnprd.ctc.caixa
^C
^C
^C


^[[A^[[A^[[A^[[A
^C
^C
^C
^C
^C
^\
^\
^\
^[
^[^[^[
^\^\^\





[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$ showmount -e nfsctcnprd.ctc.caixa | grep -i SISME
^C




Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SISME-rotinas
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
SISME

SISME-rotinas
Predefined variables
Usuario-Azure-DevOps (12)
Scopes: Release
OKD-PRODUTOS (8)
Credenciais para o Cluster OKD4 de PRODUTOS
Scopes: Release
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
TERRAFORM-ESTEIRA-COMMON (6)
WO0000079295714 - add variável INFRAFACIL
Scopes: Release
ANSIBLE_JBOSS_VM_VERSION_3 (11)
WO0000072264656 - Config Portal Infrafácil NO_PROXY cadsvgerap027-1.intra.caixa.gov.br, 10.122.144.168
Scopes: Release
TERRAFORM-ESTEIRA-NPRD (17)
Variáveis do terraform para automação de ambientes
Scopes: EC DES,EC TQS,EC HMP
sample-java-des (13)
WO0000081293906 - SISME
Scopes: EC DES,EC TQS
SISME-ROTINAS-DES (24)
Grupo de variáveis de SISME-ROTINAS-DES

Scopes: EC DES
AGCMNDATA
7016
AMBIENTE
DES
ATCMNDATA
7015
CTMPERMHOSTS
cxextrlx038
CTMSHOST
cxextrlx038
DIRETORIO_ARQUIVO_APF
/tmp/
INIT
Criado via api
JOBS_NAMES
evolucaoObraJob
NFS_ENDPOINT_ISILON
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME
NFS_MOUNT_POINT_ISILON
/apl/sisme
SPRING_APPLICATION_NAME
sisme-rotinas
SPRING_BATCH_JDBC_INITIALIZE_SCHEMA
always
SPRING_DATASOURCE_DRIVERCLASSNAME
org.postgresql.Driver
SPRING_DATASOURCE_HIKARI_CONNECTION_TIMEOUT
20000
SPRING_DATASOURCE_PASSWORD
sme_des_001
SPRING_DATASOURCE_URL
jdbc:postgresql://SCTDEDADLX0004.DF.CAIXA/SSO_VALIDACAO_MERGE
SPRING_DATASOURCE_USERNAME
sme_des_001
SPRING_JPA_DATABASE_PLATFORM
org.hibernate.dialect.PostgreSQLDialect
SPRING_JPA_HIBERNATE_DDL_AUTO
validate
SPRING_JPA_PROPERTIES_HIBERNATE_DEFAULT_SCHEMA
smesm001
SPRING_JPA_PROPERTIES_HIBERNATE_FORMAT_SQL
true
SPRING_JPA_PROPERTIES_HIBERNATE_SHOW_SQL
false
SPRING_JPA_PROPERTIES_HIBERNATE_USE_SQL_COMMENTS
false
_ENV.SPRING_DATASOURCE_PASSWORD
********
Compartilhamentos (4)
Scopes: EC DES,EC TQS
SISME-ROTINAS-TQS (22)
Grupo de variáveis de SISME-ROTINAS-TQS
Scopes: EC TQS
AGCMNDATA
7016
AMBIENTE
TQS
ATCMNDATA
7015
CTMPERMHOSTS
cxextrlx038
CTMSHOST
cxextrlx038
DIRETORIO_ARQUIVO_APF
/tmp/
INIT
Criado via api
NFS_ENDPOINT_ISILON
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW
NFS_MOUNT_POINT_ISILON
/sisme_fgw
SPRING_APPLICATION_NAME
sisme-rotinas
SPRING_BATCH_JDBC_INITIALIZE_SCHEMA
always
SPRING_DATASOURCE_DRIVERCLASSNAME
org.postgresql.Driver
SPRING_DATASOURCE_HIKARI_CONNECTION_TIMEOUT
20000
SPRING_DATASOURCE_PASSWORD
********
SPRING_DATASOURCE_URL
jdbc:postgresql://SCTDEDADLX0004.DF.CAIXA/SSO_VALIDACAO_MERGE
SPRING_DATASOURCE_USERNAME
sme_des_001
SPRING_JPA_DATABASE_PLATFORM
org.hibernate.dialect.PostgreSQLDialect
SPRING_JPA_HIBERNATE_DDL_AUTO
validate
SPRING_JPA_PROPERTIES_HIBERNATE_DEFAULT_SCHEMA
smesm001
SPRING_JPA_PROPERTIES_HIBERNATE_FORMAT_SQL
true
SPRING_JPA_PROPERTIES_HIBERNATE_SHOW_SQL
false
SPRING_JPA_PROPERTIES_HIBERNATE_USE_SQL_COMMENTS
false
sample-java-hmp (13)
WO0000081430821
Scopes: EC HMP
SISME-ROTINAS-HMP (1)
Grupo de variáveis de SISME-ROTINAS-HMP
Scopes: EC HMP
TERRAFORM-ESTEIRA-PRD-CTC-NPCN (17)
Variáveis do terraform para automação de ambientes TERRAFORM_VSPHERE_POOL - RP_ESTEIRAS_AGEIS_NPCN_CTC_V7 13/03/2025
Scopes: EC PRD CTC
sample-java-prd (10)
Scopes: EC PRD CTC,EC PRD DTC
SISME-ROTINAS-PRD (20)
Grupo de variáveis de SISME-ROTINAS-PRD
Scopes: EC PRD CTC
TERRAFORM-ESTEIRA-PRD-DTC-PCN (15)
Variáveis do terraform para automação de ambientes
Scopes: EC PRD DTC
|Manage variable groups
Row 2

Showing filters 1 through 2


