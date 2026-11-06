
[p585600@caddeapllx2863 ~]$
[p585600@caddeapllx2863 ~]$
[p585600@caddeapllx2863 ~]$
[p585600@caddeapllx2863 ~]$
[p585600@caddeapllx2863 ~]$ ps -ef | grep -c '[s]tandalone-full-ha.xml'
ls /opt/jboss-eap/standalone/deployments/
ls /opt/jboss-eap/standalone/deployments/ | grep -E '\.(failed|undeployed)$'
grep -E 'WFLYUT0021|WFLYSRV0010|WFLYEE0047|NumberFormatException|ClassNotFound' /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log | tail -10
grep -iE 'SIGSJ04|ORA-[0-9]' /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log | tail -5
curl -s -o /dev/null -w '%{http_code}\n' http://localhost/sigsj_intranet/
3
ojdbc8.jar  ojdbc8.jar.deployed  README.txt  sigsj_intranet-ear.ear  sigsj_intranet-ear.ear.deployed
2026-11-06 12:11:16,256 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 44) WFLYSRV0010: "ojdbc8.jar" foi implantado (runtime-name: "ojdbc8.jar")
2026-11-06 12:11:40,132 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 96) WFLYUT0021: Contexto web registrado: '/sigsjintrastatic' para servidor 'default-server'
2026-11-06 12:11:40,953 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 110) WFLYUT0021: Contexto web registrado: '/sigsj_intranet' para servidor 'default-server'
2026-11-06 12:11:41,042 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 44) WFLYSRV0010: "ojdbc8.jar" foi implantado (runtime-name: "ojdbc8.jar")
2026-11-06 12:11:41,042 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 44) WFLYSRV0010: "sigsj_intranet-ear.ear" foi implantado (runtime-name: "sigsj_intranet-ear.ear")
    ("data-source" => "SIGSJ04_Pool")
        "jboss.driver-demander.java:jboss/datasources/SIGSJ04 faltam [jboss.jdbc-driver.oracle]",
        "org.wildfly.data-source.SIGSJ04_Pool faltam [jboss.jdbc-driver.oracle]",
        "org.wildfly.data-source.SIGSJ04_Pool faltam [jboss.jdbc-driver.oracle]"
service jboss.jdbc-driver.oracle (faltam) dependentes: [service org.wildfly.data-source.SIGSJ04_Pool, service jboss.driver-demander.java:jboss/datasources/SIGSJ04]
200
[p585600@caddeapllx2863 ~]$
[p585600@caddeapllx2863 ~]$
[p585600@caddeapllx2863 ~]$
[p585600@caddeapllx2863 ~]$
[p585600@caddeapllx2863 ~]$



Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIGSJ-intranet
/
SIGSJ-intranet-48
Search








SIGSJ-intranet

SIGSJ-intranet-48


EC TQS

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
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
Compartilhamentos (4)
Scopes: Release
TERRAFORM-ESTEIRA-NPRD (17)
Variáveis do terraform para automação de ambientes
Scopes: EC DES,EC TQS,EC HMP
SIGSJ-INTRANET-DES (14)
Grupo de variáveis de SIGSJ-INTRANET-DES
Scopes: EC DES
SIGSJ-INTRANET-TQS (10)
Grupo de variáveis de SIGSJ-INTRANET-TQS
Scopes: EC TQS
CGC_UNIDADE_DES
7390
CGC_UNIDADE_OPS
7259
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
256m
PASSWORD_TRUSTSTORE
changeit
URL_APM_SERVER
http://localhost:8200
_ENV.URL_STATICS
www.teste.com
sistema_nome
sigsj-intranet
SIGSJ-INTRANET-HMP (1)
Grupo de variáveis de SIGSJ-INTRANET-HMP
Scopes: EC HMP
TERRAFORM-ESTEIRA-PRD-CTC-NPCN (17)
Variáveis do terraform para automação de ambientes TERRAFORM_VSPHERE_POOL - RP_ESTEIRAS_AGEIS_NPCN_CTC_V7 13/03/2025
Scopes: EC PRD CTC
SIGSJ-INTRANET-PRD (1)
Grupo de variáveis de SIGSJ-INTRANET-PRD
Scopes: EC PRD CTC,EC PRD DTC
TERRAFORM-ESTEIRA-PRD-DTC-PCN (15)
Variáveis do terraform para automação de ambientes
Scopes: EC PRD DTC
Row 2

Row 2

Row 6

Select a release pipeline to view its releases

1 pipelines found

Row 2

Row 2

Row 2

Row 2

Showing filters 1 through 2

374 pipelines found

Select a release pipeline to view its releases

62 pipelines found

Select a release pipeline to view its releases

6 pipelines found

Row 4

Row 2

Showing filters 1 through 2

Row 2

Showing filters 1 through 2



so observaçao ta faldano as parads do banco ja passou alguams mais a seha o vitor vai  inserir na segunda feira
