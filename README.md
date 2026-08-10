Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081056391
Criado em	 16/07/2026 20:59:07
Criado por	 P799994
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
CETEL
VIP 10.116.181.187 criado conforme solicitado.
O VIP encontra-se DOWN, pelo fato do balanceador não conseguir validar a porta 80 no server 10.116.201.122.
Ao solicitante, favor verificar o serviço no servidor do VIP.

Att,
Daniel Ramos
TELEDATA/CETEL/REDES
ID da Ordem de Trabalho	 WO0000081056391
Criado em	 16/07/2026 16:50:47
Criado por	 C052949
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Autorizamos criar o VIP 10.116.181.187 exclusivo para o siamc-dev-intranet.esteiras.des.caixa, conforme planejamento, após às 20h. Att, CETEL02
ID da Ordem de Trabalho	 WO0000081056391
Criado em	 16/07/2026 16:14:19
Criado por	 P705973
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Ação: criar o VIP 10.116.181.187 para o siamc-dev-intranet.esteiras.des.caixa
Risco: Baixo
Impacto: Não
Janela: de 19h de 16/07/2026 às 06h de 17/07/2026
Plano de execução, Validação e Retorno: SIM
ID da Ordem de Trabalho	 WO0000081056391
Criado em	 16/07/2026 16:12:34
Criado por	 P908440
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
TELEDATA/CETEL/REDES,

- IP alocado para o VIP 10.116.181.187. Abaixo o script para a criação:

### CADDEAPRLB003-1

add server LB_SR_10.116.201.122 10.116.201.122
add ns ip 10.116.181.187 255.255.255.255 -type VIP -snmp DISABLED -hostRoute ENABLED
add serviceGroup LB_SG_10.116.181.187_HTTP_80 HTTP -maxClient 0 -maxReq 0 -cip DISABLED -usip NO -useproxyport YES -cltTimeout 180 -svrTimeout 360 -CKA NO -TCPB NO -CMP NO -netProfile NETPROF_SNAT
add lb vserver LB_VS_10.116.181.187_HTTP_80 HTTP 10.116.181.187 80 -persistenceType NONE -cltTimeout 180 -RHIstate ACTIVE
add lb vserver LB_VS_10.116.181.187_SSL_443 SSL 10.116.181.187 443 -persistenceType SOURCEIP -timeout 15 -cltTimeout 180 -RHIstate ACTIVE
bind lb vserver LB_VS_10.116.181.187_HTTP_80 LB_SG_ALWAYS_UP_HTTP_80
bind lb vserver LB_VS_10.116.181.187_SSL_443 LB_SG_10.116.181.187_HTTP_80
bind lb vserver LB_VS_10.116.181.187_HTTP_80 -policyName HTTP_TO_HTTPS_POL -priority 1 -gotoPriorityExpression END -type REQUEST
bind serviceGroup LB_SG_10.116.181.187_HTTP_80 LB_SR_10.116.201.122 80
bind serviceGroup LB_SG_10.116.181.187_HTTP_80 -monitorName CEF_TCP_DEFAULT_MON
set ssl vserver LB_VS_10.116.181.187_SSL_443 -sslProfile CEF_SSL_PROFILE_FRONTEND_SECURITY
bind ssl vserver LB_VS_10.116.181.187_SSL_443 -certkeyName CT2026_SIAMC-DEV-INTRANET.ESTEIRAS.DES.CAIXA
save ns config



Att,
Magnus dos Santos Silva
Analista de Datacenter - Redes
TELEDATA/CETEL/REDES
ID da Ordem de Trabalho	 WO0000081056391
Criado em	 14/07/2026 12:05:09
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Segunda-feira, 10/08/2026 14:07:34
