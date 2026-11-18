Jesse Mouta Pereira Batista
17/11/2026 11:59
Bom dia, Flavio de Almeida Gagliardi, como o Vitor já abriu as REQs dos VIPs de TQS do SIGSJ (intranet, internet e boleto). Esse é o primeiro passo, quando a Rede concluir os VIPs, pedimos os certif…
Jesse Mouta Pereira Batista, olá, bom dia !! Com relação ao ambiente TQS, duas das 3 REQS de criação dos VIPS em TQS abaixo foram concluídas:
 
sigsj-internet.tqs.caixa - REQ000147074676/WO0000082325423:
 
 
17/11/2026 21:26:10 ; (P531719)
Criado o VIP 10.116.181.220 para o serviço sigsj-internet.tqs.caixa, conforme planejamento.
O VIP permanecerá em estado DOWN até a instalação do certificado digital ou que a configuração seja alterada para o modo SSL_BRIDGE
p531719@CADDEAPRLB003-1-Primary> show lb vserver LB_VS_10.116.181.220_SSL_443
LB_VS_10.116.181.220_SSL_443 (10.116.181.220:443) - SSL Type: ADDRESS
State: DOWN[Certkey/Certkeybundle/Vault not bound/Cert-store not usable]
Last state change was at Wed Nov 18 00:24:45 2026
Time since last state change: 0 days, 00:00:57.630
Effective State: DOWN
Client Idle Timeout: 180 sec
Down state flush: ENABLED
Disable Primary Vserver On Down : DISABLED
Appflow logging: ENABLED
DnsOverHttps: DISABLED
No. of Bound Services : 1 (Total) 1 (Active)
Configured Method: LEASTCONNECTION BackupMethod: ROUNDROBIN
Mode: IP
Persistence: SOURCEIP Persistence Mask: 255.255.255.255 Persistence Timeout: 15 min
Vserver IP and Port insertion: OFF
Push: DISABLED Push VServer:
Push Multi Clients: NO
Push Label Rule: none
L2Conn: OFF
Skip Persistency: None
Listen Policy: NONE
IcmpResponse: PASSIVE
RHIstate: ACTIVE
New Service Startup Request Rate: 0 PER_SECOND, Increment Interval: 0
Mac mode Retain Vlan: DISABLED
DBS_LB: DISABLED
Process Local: DISABLED
Traffic Domain: 0
TROFS Persistence honored: ENABLED
Retain Connections on Cluster: NO
Order Sequence: ASCENDING
Current Active Order: None
Bound Service Groups:
1) Group Name: LB_SG_10.116.181.220_HTTP_80
1) LB_SG_10.116.181.220_HTTP_80 (10.116.202.55: 80) - HTTP State: UP Weight: 1 Order: None
Done
p531719@CADDEAPRLB003-1-Primary>
 
 
sigsj-boleto.tqs.caixa   - REQ000147074916/WO0000082324980:
 
 
17/11/2026 21:23:52 ; (P531719)
Criado o VIP 10.116.181.221 para o serviço sigsj-boleto.tqs.caixa, conforme planejamento.
O VIP permanecerá em estado DOWN até a instalação do certificado ou a configuração seja alterada para o modo SSL_BRIDGE,

p531719@CADDEAPRLB003-1-Primary> show ns runningConfig | grep 10.116.181.221
add ns ip 10.116.181.221 255.255.255.255 -type VIP -snmp DISABLED -hostRoute ENABLED
add serviceGroup LB_SG_10.116.181.221_HTTP_80 HTTP -maxClient 0 -maxReq 0 -cip DISABLED -usip NO -useproxyport YES -cltTimeout 180 -svrTimeout 360 -CKA NO -TCPB NO -CMP NO -netProfile NETPROF_SNAT
add lb vserver LB_VS_10.116.181.221_HTTP_80 HTTP 10.116.181.221 80 -persistenceType SOURCEIP -timeout 15 -cltTimeout 180 -comment SIBDO-WEB.ESTEIRAS.DES.CAIXA -RHIstate ACTIVE
add lb vserver LB_VS_10.116.181.221_SSL_443 SSL 10.116.181.221 443 -persistenceType SOURCEIP -timeout 15 -cltTimeout 180 -comment SIBDO-WEB.ESTEIRAS.DES.CAIXA -RHIstate ACTIVE
bind lb vserver LB_VS_10.116.181.221_HTTP_80 LB_SG_ALWAYS_UP_HTTP_80
bind lb vserver LB_VS_10.116.181.221_SSL_443 LB_SG_10.116.181.221_HTTP_80
bind lb vserver LB_VS_10.116.181.221_HTTP_80 -policyName http_to_https_pol -priority 1 -gotoPriorityExpression END -type REQUEST
bind serviceGroup LB_SG_10.116.181.221_HTTP_80 LB_SR_10.116.202.52 80
bind serviceGroup LB_SG_10.116.181.221_HTTP_80 -monitorName CEF_TCP_DEFAULT_MON
set ssl vserver LB_VS_10.116.181.221_SSL_443 -sslProfile CEF_SSL_PROFILE_FRONTEND_SECURITY
p531719@CADDEAPRLB003-1-Primary> show lb vserver LB_VS_10.116.181.221_SSL_443
LB_VS_10.116.181.221_SSL_443 (10.116.181.221:443) - SSL Type: ADDRESS
State: DOWN[Certkey/Certkeybundle/Vault not bound/Cert-store not usable]
Last state change was at Wed Nov 18 00:21:10 2026
Time since last state change: 0 days, 00:00:43.350
Effective State: DOWN
Client Idle Timeout: 180 sec
Down state flush: ENABLED
Disable Primary Vserver On Down : DISABLED
Comment: SIBDO-WEB.ESTEIRAS.DES.CAIXA
Appflow logging: ENABLED
DnsOverHttps: DISABLED
No. of Bound Services : 1 (Total) 1 (Active)
Configured Method: LEASTCONNECTION BackupMethod: ROUNDROBIN
Mode: IP
Persistence: SOURCEIP Persistence Mask: 255.255.255.255 Persistence Timeout: 15 min
Vserver IP and Port insertion: OFF
Push: DISABLED Push VServer:
Push Multi Clients: NO
Push Label Rule: none
L2Conn: OFF
Skip Persistency: None
Listen Policy: NONE
IcmpResponse: PASSIVE
RHIstate: ACTIVE
New Service Startup Request Rate: 0 PER_SECOND, Increment Interval: 0
Mac mode Retain Vlan: DISABLED
DBS_LB: DISABLED
Process Local: DISABLED
Traffic Domain: 0
TROFS Persistence honored: ENABLED
Retain Connections on Cluster: NO
Order Sequence: ASCENDING
Current Active Order: None
Bound Service Groups:
1) Group Name: LB_SG_10.116.181.221_HTTP_80
1) LB_SG_10.116.181.221_HTTP_80 (10.116.202.52: 80) - HTTP State: UP Weight: 1 Order: None
Done
p531719@CADDEAPRLB003-1-Primary>
 
17/11/2026 21:23:52 ; (P531719)
Criado o VIP 10.116.181.221 para o serviço sigsj-boleto.tqs.caixa, conforme planejamento.
O VIP permanecerá em estado DOWN até a instalação do certificado ou a configuração seja alterada para o modo SSL_BRIDGE,

p531719@CADDEAPRLB003-1-Primary> show ns runningConfig | grep 10.116.181.221
add ns ip 10.116.181.221 255.255.255.255 -type VIP -snmp DISABLED -hostRoute ENABLED
add serviceGroup LB_SG_10.116.181.221_HTTP_80 HTTP -maxClient 0 -maxReq 0 -cip DISABLED -usip NO -useproxyport YES -cltTimeout 180 -svrTimeout 360 -CKA NO -TCPB NO -CMP NO -netProfile NETPROF_SNAT
add lb vserver LB_VS_10.116.181.221_HTTP_80 HTTP 10.116.181.221 80 -persistenceType SOURCEIP -timeout 15 -cltTimeout 180 -comment SIBDO-WEB.ESTEIRAS.DES.CAIXA -RHIstate ACTIVE
add lb vserver LB_VS_10.116.181.221_SSL_443 SSL 10.116.181.221 443 -persistenceType SOURCEIP -timeout 15 -cltTimeout 180 -comment SIBDO-WEB.ESTEIRAS.DES.CAIXA -RHIstate ACTIVE
bind lb vserver LB_VS_10.116.181.221_HTTP_80 LB_SG_ALWAYS_UP_HTTP_80
bind lb vserver LB_VS_10.116.181.221_SSL_443 LB_SG_10.116.181.221_HTTP_80
bind lb vserver LB_VS_10.116.181.221_HTTP_80 -policyName http_to_https_pol -priority 1 -gotoPriorityExpression END -type REQUEST
bind serviceGroup LB_SG_10.116.181.221_HTTP_80 LB_SR_10.116.202.52 80
bind serviceGroup LB_SG_10.116.181.221_HTTP_80 -monitorName CEF_TCP_DEFAULT_MON
set ssl vserver LB_VS_10.116.181.221_SSL_443 -sslProfile CEF_SSL_PROFILE_FRONTEND_SECURITY
p531719@CADDEAPRLB003-1-Primary> show lb vserver LB_VS_10.116.181.221_SSL_443
LB_VS_10.116.181.221_SSL_443 (10.116.181.221:443) - SSL Type: ADDRESS
State: DOWN[Certkey/Certkeybundle/Vault not bound/Cert-store not usable]
Last state change was at Wed Nov 18 00:21:10 2026
Time since last state change: 0 days, 00:00:43.350
Effective State: DOWN
Client Idle Timeout: 180 sec
Down state flush: ENABLED
Disable Primary Vserver On Down : DISABLED
Comment: SIBDO-WEB.ESTEIRAS.DES.CAIXA
Appflow logging: ENABLED
DnsOverHttps: DISABLED
No. of Bound Services : 1 (Total) 1 (Active)
Configured Method: LEASTCONNECTION BackupMethod: ROUNDROBIN
Mode: IP
Persistence: SOURCEIP Persistence Mask: 255.255.255.255 Persistence Timeout: 15 min
Vserver IP and Port insertion: OFF
Push: DISABLED Push VServer:
Push Multi Clients: NO
Push Label Rule: none
L2Conn: OFF
Skip Persistency: None
Listen Policy: NONE
IcmpResponse: PASSIVE
RHIstate: ACTIVE
New Service Startup Request Rate: 0 PER_SECOND, Increment Interval: 0
Mac mode Retain Vlan: DISABLED
DBS_LB: DISABLED
Process Local: DISABLED
Traffic Domain: 0
TROFS Persistence honored: ENABLED
Retain Connections on Cluster: NO
Order Sequence: ASCENDING
Current Active Order: None
Bound Service Groups:
1) Group Name: LB_SG_10.116.181.221_HTTP_80
1) LB_SG_10.116.181.221_HTTP_80 (10.116.202.52: 80) - HTTP State: UP Weight: 1 Order: None
Done
p531719@CADDEAPRLB003-1-Primary>
 
Ainda falta o atendimento da REQ em TEQS do sigsj-intranet:
 
sigsj-intranet.tqs.caixa - REQ000147073839/WO0000082325139
 
Como já foram criados os VIPs em TQS para o sigsj-internet.tqs.caixa e sigsj-boleto.tqs.caixa em TQS eu entendo que o próximo passo é solicitar a criação do certificado com a implantação nos VIPS (Solicitar Certificado Digital - CSR - TE079).
 
Eu vou abrir estas REQs de criação de certificado, só precisava das informações com relação aos VIPS para realizar a abertua destas REQS.
 
Obrigado !!
