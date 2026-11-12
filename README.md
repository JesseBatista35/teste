Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000082200842
Criado em	 06/11/2026 19:55:46
Criado por	 P695452
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 1. Segue script para criação do VIP solicitado:

=> IP do VIP alocado: 10.116.180.8.

OBS.: Lembrando que o certificado será instalado somente no VIP, entregando ao servidor na porta 80.


((( PLANO DE EXECUÇÃO )))

CADDEAPRLB003-1 (10.122.82.100)
add ns ip 10.116.180.8 255.255.255.255 -type VIP -snmp DISABLED -hostRoute ENABLED
add server LB_SR_CADDEAPLLX955 10.116.194.179
add serviceGroup LB_SG_10.116.180.8_HTTP_80 HTTP -maxClient 0 -maxReq 0 -cip DISABLED -usip NO -useproxyport YES -cltTimeout 180 -svrTimeout 360 -CKA NO -TCPB NO -CMP NO -netProfile NETPROF_SNAT
add lb vserver LB_VS_10.116.180.8_HTTP_80 HTTP 10.116.180.8 80 -persistenceType NONE -timeout 15 -cltTimeout 180 -comment siccp-intra.esteiras.hmp.caixa -RHIstate ACTIVE
add lb vserver LB_VS_10.116.180.8_SSL_443 SSL 10.116.180.8 443 -persistenceType SOURCEIP -timeout 15 -cltTimeout 180 -comment siccp-intra.esteiras.hmp.caixa -RHIstate ACTIVE
bind lb vserver LB_VS_10.116.180.8_HTTP_80 LB_SG_ALWAYS_UP_HTTP_80
bind lb vserver LB_VS_10.116.180.8_SSL_443 LB_SG_10.116.180.8_HTTP_80
bind lb vserver LB_VS_10.116.180.8_HTTP_80 -policyName http_to_https_pol -priority 1 -gotoPriorityExpression END -type REQUEST
bind serviceGroup LB_SG_10.116.180.8_HTTP_80 LB_SR_CADDEAPLLX955 80
bind serviceGroup LB_SG_10.116.180.8_HTTP_80 -monitorName CEF_TCP_DEFAULT_MON
set ssl vserver LB_VS_10.116.180.8_SSL_443 -sslProfile CEF_SSL_PROFILE_FRONTEND_SECURITY
save ns config


((( PLANO DE VALIDAÇÃO )))

CADDEAPRLB003-1 (10.122.82.100)

sh lb vserver LB_VS_10.116.180.8_SSL_443


((( PLANO DE ROLLBACK )))

rm lb vserver LB_VS_10.116.180.8_HTTP_80 HTTP
rm lb vserver LB_VS_10.116.180.8_SSL_443 SSL
rm serviceGroup LB_SG_10.116.180.8_HTTP_80 HTTP
rm server LB_SR_CADDEAPLLX955 10.116.194.179
rm ns ip 10.116.180.8
save ns config


2. A equipe de segurança precisa gerar e disponibilizar o certificado no balanceado para que possamos aplicar ao novo VIP criado.


Atenciosamente,
Valdir Soares
TELEDATA\CETEL\REDE
ID da Ordem de Trabalho	 WO0000082200842
Criado em	 04/11/2026 15:22:56
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quinta-feira, 12/11/2026 17:03:55






Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000082201229
Criado em	 05/11/2026 23:19:06
Criado por	 P627628
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 A

CETEL,

Demanda executada conforme planejado.

Segue validação:

show run | grep LB_SG_10.116.181.214_HTTP_80
add serviceGroup LB_SG_10.116.181.214_HTTP_80 HTTP -maxClient 0 -maxReq 0 -cip DISABLED -usip NO -useproxyport YES -cltTimeout 180 -svrTimeout 360 -CKA NO -TCPB NO -CMP NO -comment SIGSJ-INTERNET.DES.CAIXA -netProfile NETPROF_SNAT
bind lb vserver LB_VS_10.116.181.214_SSL_443 LB_SG_10.116.181.214_HTTP_80
bind serviceGroup LB_SG_10.116.181.214_HTTP_80 LB_SR_10.116.202.45 80
bind serviceGroup LB_SG_10.116.181.214_HTTP_80 -monitorName CEF_TCP_DEFAULT_MON

Att,
Altemar Novaes
Analista | Preposto Rede Datacenter
ID da Ordem de Trabalho	 WO0000082201229
Criado em	 05/11/2026 17:05:10
Criado por	 C052949
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Script retificado (não há certificado):

- IP alocado para o VIP: 10.116.181.214. Abaixo o script para a criação:

### CADDEAPRLB003-1

add server LB_SR_10.116.202.45 10.116.202.45
add ns ip 10.116.181.214 255.255.255.255 -type VIP -snmp DISABLED -hostRoute ENABLED
add serviceGroup LB_SG_10.116.181.214_HTTP_80 HTTP -maxClient 0 -maxReq 0 -cip DISABLED -usip NO -useproxyport YES -cltTimeout 180 -svrTimeout 360 -CKA NO -TCPB NO -CMP NO -comment SIGSJ-INTERNET.DES.CAIXA -netProfile NETPROF_SNAT
add lb vserver LB_VS_10.116.181.214_HTTP_80 HTTP 10.116.181.214 80 -persistenceType NONE -cltTimeout 180 -comment SIGSJ-INTERNET.DES.CAIXA -RHIstate ACTIVE
add lb vserver LB_VS_10.116.181.214_SSL_443 SSL 10.116.181.214 443 -persistenceType SOURCEIP -timeout 15 -cltTimeout 180 -RHIstate ACTIVE
bind lb vserver LB_VS_10.116.181.214_HTTP_80 Always_up
bind lb vserver LB_VS_10.116.181.214_SSL_443 LB_SG_10.116.181.214_HTTP_80
bind lb vserver LB_VS_10.116.181.214_HTTP_80 -policyName http_to_https_pol -priority 1 -gotoPriorityExpression END -type REQUEST
bind serviceGroup LB_SG_10.116.181.214_HTTP_80 LB_SR_10.116.202.45 80
bind serviceGroup LB_SG_10.116.181.214_HTTP_80 -monitorName CEF_TCP_DEFAULT_MON
set ssl vserver LB_VS_10.116.181.214_SSL_443 -sslProfile CEF_SSL_PROFILE_FRONTEND_SECURITY
save ns config
ID da Ordem de Trabalho	 WO0000082201229
Criado em	 05/11/2026 17:04:22
Criado por	 C052949
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 VIP ficará DOWN até instalar certificado no VIP
ID da Ordem de Trabalho	 WO0000082201229
Criado em	 05/11/2026 17:00:58
Criado por	 C052949
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Autorizamos criar o VIP 10.116.181.214  para sigsj-internet.des.caixa, conforme planejamento, após às 20h. Att, CETEL02
ID da Ordem de Trabalho	 WO0000082201229
Criado em	 05/11/2026 11:12:38
Criado por	 P705973
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Ação: criar o VIP 10.116.181.214  para http://sigsj-internet.des.caixa
Risco: Baixo
Impacto: Não
Janela: de 19h de 05/11/2026 às 06h de 06/11/2026
Plano de execução, Validação e Retorno: SIM
ID da Ordem de Trabalho	 WO0000082201229
Criado em	 05/11/2026 10:50:59
Criado por	 P908440
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
CEPRO,

- Favor importar o certificado do SIGSJ-INTERNET.DES.CAIXA no balanceador CADDEAPRLB003-1. Nome sugerido: CT2026_SIGSJ-INTERNET.DES.CAIXA_WO82201229. Após a importação, favor linká-lo a sua cadeia.

À
TELEDATA/CETEL/REDES,

- IP alocado para o VIP: 10.116.181.214. Abaixo o script para a criação:

### CADDEAPRLB003-1

add server LB_SR_10.116.202.45 10.116.202.45
add ns ip 10.116.181.214 255.255.255.255 -type VIP -snmp DISABLED -hostRoute ENABLED
add serviceGroup LB_SG_10.116.181.214_HTTP_80 HTTP -maxClient 0 -maxReq 0 -cip DISABLED -usip NO -useproxyport YES -cltTimeout 180 -svrTimeout 360 -CKA NO -TCPB NO -CMP NO -comment SIGSJ-INTERNET.DES.CAIXA -netProfile NETPROF_SNAT
add lb vserver LB_VS_10.116.181.214_HTTP_80 HTTP 10.116.181.214 80 -persistenceType NONE -cltTimeout 180 -comment SIGSJ-INTERNET.DES.CAIXA -RHIstate ACTIVE
add lb vserver LB_VS_10.116.181.214_SSL_443 SSL 10.116.181.214 443 -persistenceType SOURCEIP -timeout 15 -cltTimeout 180 -RHIstate ACTIVE
bind lb vserver LB_VS_10.116.181.214_HTTP_80 Always_up
bind lb vserver LB_VS_10.116.181.214_SSL_443 LB_SG_10.116.181.214_HTTP_80
bind lb vserver LB_VS_10.116.181.214_HTTP_80 -policyName http_to_https_pol -priority 1 -gotoPriorityExpression END -type REQUEST
bind serviceGroup LB_SG_10.116.181.214_HTTP_80 LB_SR_10.116.202.45 80
bind serviceGroup LB_SG_10.116.181.214_HTTP_80 -monitorName CEF_TCP_DEFAULT_MON
set ssl vserver LB_VS_10.116.181.214_SSL_443 -sslProfile CEF_SSL_PROFILE_FRONTEND_SECURITY
bind ssl vserver LB_VS_10.116.181.214_SSL_443 -certkeyName CT2026_SIGSJ-INTERNET.DES.CAIXA_WO82201229
save ns config



Att,
Magnus dos Santos Silva
Analista de Datacenter - Redes
TELEDATA/CETEL/REDES
ID da Ordem de Trabalho	 WO0000082201229
Criado em	 04/11/2026 15:27:10
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quinta-feira, 12/11/2026 17:05:02




Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000082200691
Criado em	 05/11/2026 21:34:23
Criado por	 P705270
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À TELEDATA/CETEL/REDES

Script aplicado e validado conforme planejado.

###########VALIDAÇÃO###########

p705270@CADDEAPRLB003-1-Primary> show ns runningConfig | grep 10.116.181.215
add ns ip 10.116.181.215 255.255.255.255 -type VIP -snmp DISABLED -hostRoute ENABLED
add serviceGroup LB_SG_10.116.181.215_HTTP_80 HTTP -maxClient 0 -maxReq 0 -cip DISABLED -usip NO -useproxyport YES -cltTimeout 180 -svrTimeout 360 -CKA NO -TCPB NO -CMP NO -comment SIGSJ-BOLETO.DES.CAIXA -netProfile NETPROF_SNAT
add lb vserver LB_VS_10.116.181.215_HTTP_80 HTTP 10.116.181.215 80 -persistenceType NONE -cltTimeout 180 -comment SIGSJ-BOLETO.DES.CAIXA -RHIstate ACTIVE
add lb vserver LB_VS_10.116.181.215_SSL_443 SSL 10.116.181.215 443 -persistenceType SOURCEIP -timeout 15 -cltTimeout 180 -RHIstate ACTIVE
bind lb vserver LB_VS_10.116.181.215_HTTP_80 Always_up
bind lb vserver LB_VS_10.116.181.215_SSL_443 LB_SG_10.116.181.215_HTTP_80
bind lb vserver LB_VS_10.116.181.215_HTTP_80 -policyName http_to_https_pol -priority 1 -gotoPriorityExpression END -type REQUEST
bind serviceGroup LB_SG_10.116.181.215_HTTP_80 LB_SR_10.116.201.25 80
bind serviceGroup LB_SG_10.116.181.215_HTTP_80 -monitorName CEF_TCP_DEFAULT_MON
set ssl vserver LB_VS_10.116.181.215_SSL_443 -sslProfile CEF_SSL_PROFILE_FRONTEND_SECURITY


At.te,
Edson Pereira da Silva
Analista de datacenter - Redes
TELEDATA/CETEL/REDES
ID da Ordem de Trabalho	 WO0000082200691
Criado em	 05/11/2026 17:08:21
Criado por	 C052949
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Autorizamos criar o VIP 10.116.181.215 para sigsj-boleto.des.caixa, conforme planejamento, após às 20h. Att, CETEL02
ID da Ordem de Trabalho	 WO0000082200691
Criado em	 05/11/2026 17:07:46
Criado por	 C052949
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Script retificado (certificado não foi gerado):

À
TELEDATA/CETEL/REDES,

- IP alocado para o VIP: 10.116.181.215. Abaixo o script para a criação:

### CADDEAPRLB003-1

add server LB_SR_10.116.201.25 10.116.201.25
add ns ip 10.116.181.215 255.255.255.255 -type VIP -snmp DISABLED -hostRoute ENABLED
add serviceGroup LB_SG_10.116.181.215_HTTP_80 HTTP -maxClient 0 -maxReq 0 -cip DISABLED -usip NO -useproxyport YES -cltTimeout 180 -svrTimeout 360 -CKA NO -TCPB NO -CMP NO -comment SIGSJ-BOLETO.DES.CAIXA -netProfile NETPROF_SNAT
add lb vserver LB_VS_10.116.181.215_HTTP_80 HTTP 10.116.181.215 80 -persistenceType NONE -cltTimeout 180 -comment SIGSJ-BOLETO.DES.CAIXA -RHIstate ACTIVE
add lb vserver LB_VS_10.116.181.215_SSL_443 SSL 10.116.181.215 443 -persistenceType SOURCEIP -timeout 15 -cltTimeout 180 -RHIstate ACTIVE
bind lb vserver LB_VS_10.116.181.215_HTTP_80 Always_up
bind lb vserver LB_VS_10.116.181.215_SSL_443 LB_SG_10.116.181.215_HTTP_80
bind lb vserver LB_VS_10.116.181.215_HTTP_80 -policyName http_to_https_pol -priority 1 -gotoPriorityExpression END -type REQUEST
bind serviceGroup LB_SG_10.116.181.215_HTTP_80 LB_SR_10.116.201.25 80
bind serviceGroup LB_SG_10.116.181.215_HTTP_80 -monitorName CEF_TCP_DEFAULT_MON
set ssl vserver LB_VS_10.116.181.215_SSL_443 -sslProfile CEF_SSL_PROFILE_FRONTEND_SECURITY
save ns config
ID da Ordem de Trabalho	 WO0000082200691
Criado em	 05/11/2026 17:06:59
Criado por	 C052949
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 VIP ficará DOWN até instalar o certificado no VIP
ID da Ordem de Trabalho	 WO0000082200691
Criado em	 05/11/2026 15:46:21
Criado por	 P705973
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Ação: criar o VIP 10.116.181.215 para http://sigsj-boleto.des.caixa
Risco: Baixo
Impacto: Não
Janela: de 19h de 05/11/2026 às 06h de 06/11/2026
Plano de execução, Validação e Retorno: SIM
ID da Ordem de Trabalho	 WO0000082200691
Criado em	 05/11/2026 15:45:30
Criado por	 P705973
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 
À
TELEDATA/CETEL/REDES,

- IP alocado para o VIP: 10.116.181.215. Abaixo o script para a criação:

### CADDEAPRLB003-1

add server LB_SR_10.116.201.25 10.116.201.25
add ns ip 10.116.181.215 255.255.255.255 -type VIP -snmp DISABLED -hostRoute ENABLED
add serviceGroup LB_SG_10.116.181.215_HTTP_80 HTTP -maxClient 0 -maxReq 0 -cip DISABLED -usip NO -useproxyport YES -cltTimeout 180 -svrTimeout 360 -CKA NO -TCPB NO -CMP NO -comment SIGSJ-BOLETO.DES.CAIXA -netProfile NETPROF_SNAT
add lb vserver LB_VS_10.116.181.215_HTTP_80 HTTP 10.116.181.215 80 -persistenceType NONE -cltTimeout 180 -comment SIGSJ-BOLETO.DES.CAIXA -RHIstate ACTIVE
add lb vserver LB_VS_10.116.181.215_SSL_443 SSL 10.116.181.215 443 -persistenceType SOURCEIP -timeout 15 -cltTimeout 180 -RHIstate ACTIVE
bind lb vserver LB_VS_10.116.181.215_HTTP_80 Always_up
bind lb vserver LB_VS_10.116.181.215_SSL_443 LB_SG_10.116.181.215_HTTP_80
bind lb vserver LB_VS_10.116.181.215_HTTP_80 -policyName http_to_https_pol -priority 1 -gotoPriorityExpression END -type REQUEST
bind serviceGroup LB_SG_10.116.181.215_HTTP_80 LB_SR_10.116.201.25 80
bind serviceGroup LB_SG_10.116.181.215_HTTP_80 -monitorName CEF_TCP_DEFAULT_MON
set ssl vserver LB_VS_10.116.181.215_SSL_443 -sslProfile CEF_SSL_PROFILE_FRONTEND_SECURITY
bind ssl vserver LB_VS_10.116.181.215_SSL_443 -certkeyName CT2026_SIGSJ-BOLETO.DES.CAIXA_WO82200691
save ns config



Att,
Magnus dos Santos Silva
Analista de Datacenter - Redes
TELEDATA/CETEL/REDES
ID da Ordem de Trabalho	 WO0000082200691
Criado em	 05/11/2026 14:24:34
Criado por	 P908440
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
CEPRO,

- Favor importar o certificado do SIGSJ-BOLETO.DES.CAIXA no balanceador CADDEAPRLB003-1. Nome sugerido: CT2026_SIGSJ-BOLETO.DES.CAIXA_WO82200691. Após a importação, favor linká-lo a sua cadeia.

À
TELEDATA/CETEL/REDES,

- IP alocado para o VIP: 10.116.181.215. Abaixo o script para a criação:

### CADDEAPRLB003-1

add server LB_SR_10.116.201.25 10.116.201.25
add ns ip 10.116.181.215 255.255.255.255 -type VIP -snmp DISABLED -hostRoute ENABLED
add serviceGroup LB_SG_10.116.181.215_HTTP_80 HTTP -maxClient 0 -maxReq 0 -cip DISABLED -usip NO -useproxyport YES -cltTimeout 180 -svrTimeout 360 -CKA NO -TCPB NO -CMP NO -comment SIGSJ-BOLETO.DES.CAIXA -netProfile NETPROF_SNAT
add lb vserver LB_VS_10.116.181.215_HTTP_80 HTTP 10.116.181.215 80 -persistenceType NONE -cltTimeout 180 -comment SIGSJ-BOLETO.DES.CAIXA -RHIstate ACTIVE
add lb vserver LB_VS_10.116.181.215_SSL_443 SSL 10.116.181.215 443 -persistenceType SOURCEIP -timeout 15 -cltTimeout 180 -RHIstate ACTIVE
bind lb vserver LB_VS_10.116.181.215_HTTP_80 Always_up
bind lb vserver LB_VS_10.116.181.215_SSL_443 LB_SG_10.116.181.215_HTTP_80
bind lb vserver LB_VS_10.116.181.215_HTTP_80 -policyName http_to_https_pol -priority 1 -gotoPriorityExpression END -type REQUEST
bind serviceGroup LB_SG_10.116.181.215_HTTP_80 LB_SR_10.116.201.25 80
bind serviceGroup LB_SG_10.116.181.215_HTTP_80 -monitorName CEF_TCP_DEFAULT_MON
set ssl vserver LB_VS_10.116.181.215_SSL_443 -sslProfile CEF_SSL_PROFILE_FRONTEND_SECURITY
bind ssl vserver LB_VS_10.116.181.215_SSL_443 -certkeyName CT2026_SIGSJ-BOLETO.DES.CAIXA_WO82200691
save ns config



Att,
Magnus dos Santos Silva
Analista de Datacenter - Redes
TELEDATA/CETEL/REDES
ID da Ordem de Trabalho	 WO0000082200691
Criado em	 04/11/2026 15:30:09
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quinta-feira, 12/11/2026 17:05:39


entoa acabei de ver que teve duas req atendidas..

acho que o pessoal do sigec tinhaqeuue cobrar o atendimente dessa outra>>

apois agora precismaos pedir isso tambem para TQS. 




