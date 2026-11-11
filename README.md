1. Solicitamos:
1.1. Disponibilização do certificado digital para instalação em ambiente não produção (anexar o PKCS12) do certificado.
1.2. Indicar os comandos de conversão de formatos do certificado, caso pertinente;
1.3. Ajuste da WO conforme a Janela de Instalação indicada nesta REQ;
1.4. Designar esta WO à área indicada na REQ como responsável pela instalação. 


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000082245892
Criado em	 10/11/2026 22:54:11
Criado por	 P799994
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
CETEL

Certificado assocaido ao VIP conforme solicitado.

Atenciosamente,
Daniel Ramos
TELEDATA/CETEL/REDES
ID da Ordem de Trabalho	 WO0000082245892
Criado em	 10/11/2026 17:49:31
Criado por	 C052949
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Autorizamos incluir o Certificado Digital SIEMP.DES.CAIXA no VIP 10.116.180.9, conforme planejamento, após às 20h. Att, CETEL02
ID da Ordem de Trabalho	 WO0000082245892
Criado em	 10/11/2026 17:49:23
Criado por	 C052949
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Executar DEPOIS da WO0000082252343
ID da Ordem de Trabalho	 WO0000082245892
Criado em	 10/11/2026 16:01:00
Criado por	 C159655
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Certificado importado e linkado com sucesso também no CADDEAPRLB003-1, segue evidência em anexo.

Atenciosamente,

CAIXA/CEPRO/CN PROTEÇÕES EM SEGURANÇA DIGITAL
ID da Ordem de Trabalho	 WO0000082245892
Criado em	 10/11/2026 15:31:34
Criado por	 P665576
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
CEPRO,

Segue para importação do certificado conforme nota anterior.

Após a conclusão da importação, favor devolver a demanda à CETEL para prosseguimento do atendimento.

Atenciosamente,
TELEDATA / CETEL / REDE DATA CENTER
ID da Ordem de Trabalho	 WO0000082245892
Criado em	 10/11/2026 15:30:00
Criado por	 P502958
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Planejamento atualizado. Essa demanda é para instalação de certificado que será criado em um novo VIP 10.116.180.9 criado na WO0000082252343.
Favor importar o certificado no balanceador CADDEAPRLB003-1 10.122.82.101

=========================== EXECUÇÃO ===========================
CADDEAPRLB003-1
bind ssl vserver LB_VS_10.116.180.9_SSL_443 -certkeyName CT2026_SIEMP.DES.CAIXA
save ns config

=========================== ROLLBACK ===========================
CADDEAPRLB003-1
unbind ssl vserver LB_VS_10.116.180.9_SSL_443 -certkeyName CT2026_SIEMP.DES.CAIXA
save ns config

=========================== VALIDAÇÃO ===========================
CADDEAPRLB003-1
show ns  runningConfig | grep LB_VS_10.116.180.9_SSL_443
save ns config

Att,
Silvio Leonardo Rezende
Analista de Datacenter - Redes
CETEL/REDES
ID da Ordem de Trabalho	 WO0000082245892
Criado em	 10/11/2026 14:32:53
Criado por	 C159655
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Certificado importado e linkado com sucesso, seguem evidências em anexo.

Atenciosamente,

CAIXA/CEPRO/CN PROTEÇÕES EM SEGURANÇA DIGITAL
ID da Ordem de Trabalho	 WO0000082245892
Criado em	 10/11/2026 09:04:32
Criado por	 P705068
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À

Cepro

Importar o certificado CT2026_SIEMP.DES.CAIXA no balanceador ###CADDEAPRLB002-1(10.122.82.98)

====>EXECUÇÃO
###CADDEAPRLB002-1(10.122.82.98)
bind ssl vserver VS_10.116.80.1_BR_http_443 -certkeyName CT2026_SIEMP.DES.CAIXA -SNICert
save ns config

====>ROLLBACK
###CADDEAPRLB002-1(10.122.82.98)
unbind ssl vserver VS_10.116.80.1_BR_http_443 -certkeyName CT2026_SIEMP.DES.CAIXA -SNICert
save ns config

====>VALIDAÇÃO
###CADDEAPRLB002-1(10.122.82.98)
show ns  runningConfig | grep VS_10.116.80.1_BR_http_443
save ns config

Att,
Weverton de Oliveira Silva
Analista de infraestrutura - Redes
TELEDATA/CETEL/REDES
ID da Ordem de Trabalho	 WO0000082245892
Criado em	 09/11/2026 18:16:55
Criado por	 P569927
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados(as),

1 – Disponibilizaremos o arquivo PKCS#12 através de compartilhamento de arquivo no OneDrive.

2 - Para solicitar o arquivo PKCS#12 e a inserção da senha do certificado no momento da instalação no ambiente o técnico deverá ingressar em um dos canais na equipe criada no Teams para essa finalidade. As orientações de como acessar a equipe e o link para os canais estão disponíveis através do link https://caixa.sharepoint.com/:w:/r/teams/O365GRP-CESET-Inserodesenhas/Documentos%20Compartilhados/General/Instru%C3%A7%C3%B5es%20da%20Equipe.docx?d=w427f7e74198a45bb91f6335e8595bde2&csf=1&web=1&e=0iQbhI

03 – Caso seja necessário extrair do arquivo PKCS#12 os arquivos .crt e .key, executar os comandos abaixo:

openssl pkcs12 -in INFILE.p12 -out OUTFILE.key -nodes -nocerts
openssl pkcs12 -in INFILE.p12 -out OUTFILE.crt -nokeys

Obs.: será solicitada a senha do arquivo PKCS#12.

Duvidas: https://www.ssl.com/pt/como/chave-privada-de-certificados-de-exporta%C3%A7%C3%A3o-do-arquivo-pkcs12-com-openssl/

4 - Informamos que a cadeia de certificados NPRD (ACInternaIcptestes) está disponível em http://icptestes.caixa/ .

 
Atenciosamente,
CAIXA/CEPRO/CN de Segurança Cibernética
ID da Ordem de Trabalho	 WO0000082245892
Criado em	 09/11/2026 18:15:55
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quarta-feira, 11/11/2026 11:01:43


Solicitamos tempestividade no atendimento devido ao prazo para atendimento ao ADDR SIEMP.

Descrição da solicitação: Criação de VIP para a URL siemp.des.caixa 

Apontamento/Balanceamento para o servidor:
IP: 10.116.202.54
HOST: caddeapllx2864.agil.nprd.caixa.gov.br

http://siemp.des.caixa
Porta 80

Favor instalar o certificado da requisição abaixo:
REQ000146999232 - siemp.des.caixa

https://siemp.des.caixa 


Qual o tipo de serviço?: Alterar configurações em balanceador
Detalhe do serviço: VIP
Atividade a ser executada: Solicitar inclusão de VIP
Qual é o nome do sistema/serviço?: 
Qual é o VIP de acesso ao sistema/serviço?: 
Qual é o FQDN de acesso ao sistema/serviço?:


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000082252343
Criado em	 10/11/2026 22:52:22
Criado por	 P799994
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
CETEL

VIP criado conforme solicitado.

Atenciosamente,
Daniel Ramos
TELEDATA/CETEL/REDES
ID da Ordem de Trabalho	 WO0000082252343
Criado em	 10/11/2026 17:36:09
Criado por	 C052949
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Autorizamos criar o VIP 10.116.180.9 para siemp.des.caixa, conforme planejamento, após às 20h. Att, CETEL02
ID da Ordem de Trabalho	 WO0000082252343
Criado em	 10/11/2026 15:30:49
Criado por	 P502958
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
CETEL

Alocado o IP de VIP - 10.116.180.9
O VIP foi criado na porta 443 em SSL porque o certificado será instalado na REQ000146999232/WO0000082245892.

==================EXECUÇÃO===========================
CADDEAPRLB003-1

add ns ip 10.116.180.9 255.255.255.255 -type VIP -snmp DISABLED -hostRoute ENABLED

add server LB_SR_10.116.202.54 10.116.202.54

add serviceGroup LB_SG_10.116.180.9_HTTP_80 HTTP -maxClient 0 -maxReq 0 -cip DISABLED -usip NO -useproxyport YES -cltTimeout 180 -svrTimeout 360 -CKA NO -TCPB NO -CMP NO -netProfile NETPROF_SNAT


add lb vserver LB_VS_10.116.180.9_http_80 HTTP 10.116.180.9 80 -persistenceType NONE  -cltTimeout 180  -RHIstate ACTIVE
add lb vserver LB_VS_10.116.180.9_SSL_443 SSL 10.116.180.9 443 -persistenceType NONE  -cltTimeout 180  -RHIstate ACTIVE

bind lb vserver LB_VS_10.116.180.9_http_80 always_up
bind lb vserver LB_VS_10.116.180.9_SSL_443 LB_SG_10.116.180.9_HTTP_80
bind lb vserver LB_VS_10.116.180.9_HTTP_80 -policyName HTTP_TO_HTTPS_POL -priority 1 -gotoPriorityExpression END -type REQUEST

bind serviceGroup LB_SG_10.116.180.9_HTTP_80 LB_SR_10.116.202.54 80
bind serviceGroup LB_SG_10.116.180.9_HTTP_80 -monitorName CEF_TCP_DEFAULT_MON

set ssl vserver LB_VS_10.116.180.9_SSL_443 -sslProfile CEF_SSL_PROFILE_FRONTEND_SECURITY

save ns config

=======================ROLLBACK============================
CADDEAPRLB003-1

rm serviceGroup LB_SG_10.116.180.9_HTTP_80

rm server LB_SR_10.116.202.54

rm ns ip 10.116.180.9

save ns config


Att,
Silvio Leonardo Rezende
Analista de Datacenter - Redes
CETEL/REDES
ID da Ordem de Trabalho	 WO0000082252343
Criado em	 10/11/2026 12:13:02
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quarta-feira, 11/11/2026 11:02:22




ja foira atendida do simep, qual proximo passo agora o que eu devo fazer na esteria dele
