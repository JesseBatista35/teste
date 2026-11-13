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
Impresso por P585600 em Sexta-feira, 13/11/2026 10:20:57


essa é do boleto
