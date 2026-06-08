a taks é assim e nao tem isso que voce falou?:


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
SICMU-intranet-update
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
SICMU

SICMU-intranet-update
Cria_VM_Terraform
Task version
2.*
Display name
Cria_VM_Terraform 
AZPAT
$(AZPAT)
AZUSER
$(AZUSER)
CGC_UNIDADE_DES
$(CGC_UNIDADE_DES)
CGC_UNIDADE_OPS
$(CGC_UNIDADE_OPS)
DIR_ANSIBLE
$(DIR_ANSIBLE)
HOME_ADS_AGENT
$(HOME_ADS_AGENT)
sistema_ambiente
$(sistema_ambiente)
sistema_nome
$(sistema_nome)
site
$(site)
tf_var_quant
$(tf_var_quant)
TOKEN_INFRAFACIL_MUDANCA
$(TOKEN_INFRAFACIL_MUDANCA)
VALIDA_VEC
$(VALIDA_VEC)
vm_destroy_before_create
$(vm_destroy_before_create)
vm_servers_recreate
$(vm_servers_recreate)
Control Options
Output Variables
Row 2

Showing filters 1 through 2




SICMU-INTRANET-UPDATE-DES (37)
Grupo de variáveis de SICMU-INTRANET-UPDATE-DES

Scopes: EC DES
CICSCMU_PASS
********
CICSCMU_PROGRAM
PSCPSDI3
CICSCMU_USR
SCMUDR01
CICSISO_PASS
#{PREENCHER}#
CICSISO_PROGRAM
PSCPSDI1
CICSISO_USR
JDIRCICD
CICSSEM_PASS
#{PREENCHER}#
CICSSEM_PROGRAM
PSCPSDI3
CICSSEM_USR
JDIRCICD
CICSSGR_PASS
#{PREENCHER}#
CICSSGR_PROGRAM
PSCPSDI1
CICSSGR_USR
JDIRCICD
CICS_PORT
7000
CONNECTOR
/opt/jboss/jboss-eap/standalone/configuration/sicmu_jconnector.properties
CURRENT_SCHEMA
DESCMU
DB2_CMU_PWD
********
DB2_CMU_URL
jdbc:db2://10.216.80.110:448/RJKDB2DSD0
DB2_CMU_USR
SCMUDR01
DB2_RJP4_URL
jdbc:db2://10.216.80.110:448/RJKDB2DSD0
INIT
Criado via api
JCICSDIRECT
10.216.80.110
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
256m
KEYSTORE_PASSWORD
password
KEY_PASSWORD
password
MQ_HOSTNAME
10.216.80.110
PASSWORD_TRUSTSTORE
changeit
QUEUE_MANAGER
RJD1
QUEUE_PORT
1414
SGR_INTER_URL
https://servicossociais.des.corerj.caixa/internet.do?segmento=CONVENIADO01&credencial=CPF
SGR_INTRA_URL
https://servicossociais.des.inter.corerj.caixa/intranet.do?segmento=INTRANET01
TGSGRS_PASS
#{PREENCHER}#
TGSGRS_PROGRAM
PSCPSDI3
TGSGRS_USR
JDIRSGRD
URL_APM_SERVER
https://apm-server-devops.apps.produtos4.caixa/



SICMU-INTRANET-UPDATE-TQS (35)
Grupo de variáveis de SICMU-INTRANET-UPDATE-TQS

Scopes: EC TQS
CICSCMU_PASS
********
CICSCMU_PROGRAM
PSCPSDI3
CICSCMU_USR
SCMUTR01
CICSISO_PASS
CICSISO_PROGRAM
PSCPSDI1
CICSISO_USR
JDIRCICD
CICSSEM_PASS
CICSSEM_PROGRAM
PSCPSDI3
CICSSEM_USR
JDIRCICD
CICSSGR_PASS
CICSSGR_PROGRAM
PSCPSDI1
CICSSGR_USR
JDIRCICD
CICS_PORT
7002
CONNECTOR
/opt/jboss/jboss-eap/standalone/configuration/sicmu_jconnector_properties
CURRENT_SCHEMA
TQSCMU
DB2_CMU_PWD
********
DB2_URL
jdbcdb2://10.216.80.111:446/RJKDB2DSDH
DB2_USR
SCMUTR01
INIT
Criado via api
JCICSDIRECT
10.216.80.111
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
256m
KEY-PASSWORD
password
KEYSTORE-PASSWORD
pasword
MQ_HOSTNAME
10.216.80.111
PASSWORD_TRUSTSTORE
change_it
QUEUE_MANAGER
RJH1
QUEUE_PORT
1414
SGR_INTER_URL
https://servicossociais.tqs.corerj.caixa/internet.do?segmento=CONVENIADO01&credencial=CPF
SGR_URL
https://servicossociais.tqs.corerj.caixa/intranet.do?segmento=INTRANET01
TGSGRS_PASS
********
TGSGRS_PROGRAM
PSCPSDI3
TGSGRS_USR
JDIRSGRQ
