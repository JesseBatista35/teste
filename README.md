<img width="890" height="504" alt="image" src="https://github.com/user-attachments/assets/28fc5709-adf1-497d-b46b-39a9ebc569e7" />


<img width="1842" height="73" alt="image" src="https://github.com/user-attachments/assets/0fe78db0-5217-4949-b40a-551d707999f6" />


Agora na chamada do GET pelo frontend está vindo múltiplos valores



Solicito a alteração de configuração APACHE de DESENVOLVIMENTO do SIAVL, conforme linhas destacadas no checklist em anexo. Conservando ordem de inserção.
Servidor Apache: IP: 10.116.82.86.


Check-List para JBoss EAP 7

Caixa Postal	Coordenador de projetos	Telefone
SUDEB09	Anderson Jose Pereira Rodrigues	(11) 99120-9479
Analista para contato /ramal	Fábrica de software	Data
Liliane Lopes Leal	CERTSYS	18/11/2025

Aplicação (siavl.ear)	Descrição	Característica (Intra/Inter/Extra)
siavl-web	Aplicação Web Intranet 	Intranet
siavl-api	API Intranet Java EE	Intranet
siavl-ejb	EJB Intranet e Internet	Intranet
siavl-api-internet	API Internet Java EE	Intranet

Aplicação em Portal	Portal Virtual	Autorização pelo Portal
□ SIM	X NÃO	□ SIM	X NÃO	□ SIM	X NÃO

Necessidades	Servidor WEB 🗷
URL	PRD INTERNET: https://atendimentodigital.caixa.gov.br 
PRD INTRANET: https://agenciadigital.caixa/
                           https://atendimentoremoto.caixa/
PRD SITE INTRANET: https://siavl-web-internetpf-prd.apps.apl4.caixa

DES INTERNET: https://atendimentodigital.des.caixa:8020/
DES INTRANET: https://agenciadigital.des.caixa:8002/siavl-web/index.html#/app/login
https://agenciadigital2.des.caixa/siavl-web/index.html
https://agenciadigital3.des.caixa/siavl-web/index.html
https://agenciadigital4.des.caixa/siavl-web/index.html
https://agenciadigital5.des.caixa/siavl-web/index.html
DES SITE INTRANET: https://siavl-web-internetpf-des.apps.nprd.caixa

TQS INTRANET: https://agenciadigital1.tqs.caixa/siavl-web/index.html
                          https://agenciadigital2.tqs.caixa/siavl-web/index.html

HMP: N/A

Context Root	INTRANET:
“/siavl-web” - Aplicação Web Intranet
“/siavl-api” - API vinculada ao realm intranet do SSO
“/siavl-api-internet” – API vinculada ao realm internet do SSO
INTERNET:
“/” - Front End Web Internet PF (raiz do site)
“/api-web” - Endpoint específico da API vinculada ao realm internet do SSO
“/empresa” – Front End Web Internet PJ 

Página Inicial	
X index.html           □ index.htm
□ home.html          □ default.html


Necessidades	Servidor de Aplicações 🗷
Nome do pacote ear	siavl.ear
Nome do pacote war	siavl-web.war, 
siavl-api.war, 
siavl-api-internet.war (contém endpoint “/api-web” publicado na internet)
Nome do pacote ejb 	siavl-ejb.jar
Connector com Mainframe	 □ SIM		X NÃO

Descrever a tecnologia e solução adotada: N/A
Rede transmissora	
N/A

 RMI/IIOP
	□ SIM		X NÃO
Autenticação 	X LDAP		□ OpenLDAP         x OUTROS (SSO para o SIECM - GED)

Autenticação via JAAS
X SIM		□ NÃO



Necessidades	Servidor de Aplicações 🗷
Criptografia	
Utilização das APIS de Criptografia em Java
□ SIM	X NÃO 

Outras soluções: ____________________________

Web Services	
X SIM	□ NÃO
□ stubs    □ dynamic proxies    □ dynamic invocation interface

Obs: O SIAVL implementa serviços REST/JAX-RS em seu backend para fornecer as informações ao Front End Angular/bootstrap (browser/cliente).

Obs 2: O SIAVL possui interface com o SIBAR/SIRAN via Web Service SOAP: 

DES: https://des.barramento.caixa/sibar/TokenTransacao
PRD: https://barramento.caixa/sibar/TokenTransacao
TQS: https://des.barramento.caixa/sibar/TokenTransacao
HMP: 

Informar onde/como configurar.

JAVAMAIL	
□ SIM	X NÃO

JNDI name : N/A
Mail Host: N/A
Default Return address: N/A
Description: N/A


Necessidades	Utilização de Componentes 🗷
Classpath
da instância	
□ SIM	X NÃO

Nome do componente: N/A

Obs: A inclusão de bibliotecas no classpath da instância só será permitida em casos especiais, onde, por motivos técnicos, as mesmas não possam ser empacotadas com a aplicação.

Classpath da aplicação (no pacote)	
Informar todas as bibliotecas utilizadas pela aplicação: 

jboss-jms-api_1.1_spec-1.0.1.Final-redhat-3.jar
jackson-databind-2.5.4.redhat-1.jar
resteasy-jaxrs-2.3.8.Final-redhat-3.jar
resteasy-jaxb-provider-3.0.16.Final-redhat-1.jar
resteasy-multipart-provider-2.3.8.Final.redhat-3.jar
resteasy-cache-core-3.0.1.Final.jar
async-http-servlet-3.0-2.3.8.Final-redhat-3.jar
cdi-api-1.2.0.redhat-2.jar
hibernate-jpa-2.0-api-1.0.1.Final-redhat-3.jar
hibernate-validator-4.3.1.Final-redhat-1.jar
jboss-websocket-api_1.1_spec-1.1.1.Final-redhat-1.jar
org.apache.httpcomponents.httpclient.jar
org.apache.httpcomponents.fluent-hc-4.3.5.jar
org.apache.httpcomponents.httpcore.jar
org.apache.commons.commons-io.jar
org.apache.commons.commons-lang3.jar
org.apache.commons.commons-codec.jar
org.apache.commons.commons-logging.jar
com.fasterxml.jackson.core.jackson-annotations.jar
com.fasterxml.jackson.core.jackson-core.jar
com.fasterxml.jackson.core.jackson-databind.jar
oracle.xdb.jar
io.swgger.swagger-jaxrs.jar

Obs: A utilização das bibliotecas especificadas acima será avaliada pelo SAI-SP, baseando-se nos normativos em vigor e nas boas práticas para utilização de componentes.


Necessidades	Utilização de Banco de Dados 🗷

Banco de Dados	
□ PostGreSQL 8.3 ou superior	□ DB2	          X Oracle 11g ou superior

Nome do Data Source: java:jboss/jdbc/SIAVL04

Usuário do Banco de Dados	
PRD: SAVLSP01
PILOTO: SAVLSP01
DES: SAVLSD01
TQS: SAVLST01
HMP: N/A



Dados de Conexão



	
	PRD e PILOTO	DES	TQS
Servidor	dadexdadvm04clu09, dadexdadvm05clu09 e dadexdadvm07clu09	cnpexdadvm01-scan8.extra.caixa.gov.br	cnpexdadvm01-scan11.extra.caixa.gov.br
Porta	3681	1521	1521
Instância	oraprd43	orad04bc	oradt04bc
Banco	AVL	AVL	AVL


Necessidades	Utilização de LOGS 🗷
Componente	🗷 Log4j
Handler	           Nome                          Arquivo                                Verbosidade                   
●	      SIAVL                        siavl.log                                   _DEBUG_
●	      FILE                         server.log                                 __ALL___

Obs: Fornecer “arquivo” apenas em caso de nome do handler diferente.
        Em DES a verbosidade é DEBUG por padrão.
Category	           Nome                                              Handler                                                   
●	br.gov.caixa.bsb.siavl                              SIAVL         
●	br.gov.caixa                                           FILE           
 
Necessidades	Outras 🗷
Processos batch	
□ SIM	X NÃO

System Properties	
Observações:
Configuração System Properties – Console Jboss
Configurar no caminho Configuration > System Properties:
Nome da Propriedade/Valor

DES e TQS: 

NOME	VALOR
SIAVL_SKYPE_URL_ENDPOINT 
	http://hmp.avlsvc.proinfo.caixa:9191/SIAVL/

Abrir regra de firewall para esse endereço e porta e configurar arquivo de hosts com o respectivo IP.
SIAVL_USUARIO_SERVICO_SIBAR 
	SAVLBARD
SIAVL_SISTEMA_INTEGRACAO_SIBAR 
	SIAVL
SIAVL_SIRAN_SOAP_URL 
	https://des.barramento.caixa/sibar/TokenTransacao?wsdl 

SIAVL_CODIGO_DESBLOQUEIO_DOCUMENTO_SIGMS 	999990994
SIAVL_CODIGO_PROTOCOLO_SIGMS	999990995
SIAVL_CODIGO_CANAL_SIROT	9746
SIAVL_CODIGO_TRANSACAO_ATIVACAO_SIGMS	999990993
SIAVL_CODIGO_TRANSACAO_MANUTENCAO_SIGMS	999990221
SIAVL_CODIGO_PROTOCOLO_SIGMS_SEM_CONTATO	999990992
SIAVL.MDB.MQ.HOSTNAME	ibmspdes.caixa
SIAVL.MDB.MQ.PORT	1420
SIAVL.MDB.MQ.CHANNEL	SIAVL.SVRCONN
SIAVL.MDB.MQ.QUEUEMANAGER	QSDA
SIAVL.MDB.MQ.TRANSPORTTYPE	CLIENT
SIAVL.MDB.MQ.DESTINATION	java:jboss/jms/SIAVL.RSP.FILA_CHAT
SIAVL.MDB.MQ.USERNAME	SAVLBARD
SIAVL.MDB.MQ.PASSWORD	Undefined
SIAVL_SICPU_URL_ENDPOINT	https://des.central.mobilidade.caixa.gov.br/sisit/ws/push/{endpoint}/01.00

Abrir regra de firewall para esse endereço e porta e configurar arquivo de hosts com o IP 10.116.85.39. Instalar certificados de segurança https.
SIAVL_SICPU_USUARIO_SERVICO	cedesbr310@caixa.gov.br
SIAVL_SICPU_USUARIO_SERVICO_PASSWORD	7c4a8d09ca3762af61e59520943dc26494f8941b
SIAVL_SICPU_APP_CHAVE_SISTEMA	fb9d37aa560e5641f14dc959aa53e0c40b7b65c6
SIAVL_SIECM_URL	http://siecm.des.caixa/siecm-web/

SIAVL_SIECM_LOCAL_ARMAZENAMENTO	OS_CAIXA	
SIAVL_SIECM_SSO_CLIENT_ID	cli-ser-avl	
SIAVL_SIECM_SSO_CLIENT_SECRET	${VAULT::SIAVLKEY::password::1}	
SIAVL_URL_SSO_INTRANET	https://login.des.caixa/

SIAVL_URL_GRAVADOR_TECNET	http://10.123.124.156:8080

SIAVL_URL_API_CAIXA	https://api.des.caixa:8443/

SIAVL_MOBILEFIRST_URL_ENDPOINT	https://api.des.caixa:8443/comunicacao/push-notification/v1/messages

SIAVL_MOBILEFIRST_URL_SERVIDOR	http://10.116.94.107 	
SIAVL_MOBILEFIRST_RUNTIME	mfpbr	
SIAVL_API_KEY	l7xx2b6f4c64f3774870b0b9b399a77586f5	
SIAVL_EMAIL_USUARIO_SERVICO_AGD	s739016	
SIAVL_EMAIL_SENHA_USUARIO_SERVICO_AGD	${VAULT::SIAVLMAILKEY::password::1}	
SIAVL_EMAIL_PORTA_IMAP	993	
SIAVL_EMAIL_HOST_SMTP	sistemas.correiolivre.caixa	
SIAVL_EMAIL_PORTA_SMTP	25	
SIAVL_FILE_SYSTEM_BASE_PATH	/apl/siavl/email/	
SIAVL_EMAIL_HOST_IMAP	dfexchsc016.corp.caixa.gov.br	
SIAVL_ROCKETCHAT_URL	https://chatdigital.des.caixa.gov.br/api/v1/	
SIAVL_ROCKETCHAT_USER	api-siavl	
SIAVL_ROCKETCHAT_PASSWORD	${VAULT::SIAVLRCKEY::password::1}	
javax.net.ssl.trustStore	/opt/keystore/certchain.jks	
SIAVL_NUMERO_SERVICO_SIIPC	601	
SIAVL_URL_SIFWC_VERIFICACAO_CADES	https://sifwc.des.coredf.caixa:8443/verificadorDeAssinatura/ws/cades.ws?wsdl

SIAVL_URL_SSO_INTERNET	https://logindes.caixa.gov.br/	
SIAVL_SICPU_IMAGE_URL	data:image/png;base64,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	
SIAVL_SSO_SIECM_ACESSO_TOKEN	Bearer	
SIAVL_DATA_GERACAO_SSO_SIECM_ACESSO_TOKEN	dd/mm/aaaa	
Host.xml		
SIAVL_ARQUIVOS_WHATSAPP	/siavl/imagens	
SIGMS_UPLOAD_IMAGEM	https://sigms-enviar-des.apps.nprd.caixa/sigms/v1/whats/upload-media


PRD: 

NOME	VALOR
SIAVL_SKYPE_URL_ENDPOINT 
	http://avlsvc.caixa:9191/SIAVL/

Abrir regra de firewall para esse endereço e porta e configurar arquivo de hosts com o respectivo IP.
SIAVL_USUARIO_SERVICO_SIBAR 
	SAVLBARP
SIAVL_SISTEMA_INTEGRACAO_SIBAR 
	SIAVL
SIAVL_SIRAN_SOAP_URL 
	https://barramento.caixa/sibar/TokenTransacao?wsdl

SIAVL_CODIGO_DESBLOQUEIO_DOCUMENTO_SIGMS 	999990994
SIAVL_CODIGO_PROTOCOLO_SIGMS	999990995
SIAVL_CODIGO_CANAL_SIROT	9746
SIAVL_CODIGO_TRANSACAO_ATIVACAO_SIGMS	999990993
SIAVL_CODIGO_TRANSACAO_MANUTENCAO_SIGMS	999990221

SIAVL_CODIGO_PROTOCOLO_SIGMS_SEM_CONTATO	999990992
SIAVL.MDB.MQ.HOSTNAME	mqshgroup
SIAVL.MDB.MQ.PORT	1420
SIAVL.MDB.MQ.CHANNEL	SIAVL.SVRCONN
SIAVL.MDB.MQ.QUEUEMANAGER	QSPA
SIAVL.MDB.MQ.TRANSPORTTYPE	CLIENT
SIAVL.MDB.MQ.DESTINATION	java:jboss/jms/SIAVL.RSP.FILA_CHAT
SIAVL.MDB.MQ.USERNAME	SAVLBARP
SIAVL.MDB.MQ.PASSWORD	Undefined
SIAVL_SICPU_URL_ENDPOINT	https://central.mobilidade.caixa.gov.br/sisit/ws/push/{endpoint}/01.00

Abrir regra de firewall para esse endereço e porta e configurar arquivo de hosts com o respectivo IP. Instalar certificados de segurança https.
SIAVL_SICPU_USUARIO_SERVICO	cedesbr310@caixa.gov.br

SIAVL_SICPU_USUARIO_SERVICO_PASSWORD	e874f5f478e87991b4c6928f05afaf89c45808cd
SIAVL_SICPU_APP_CHAVE_SISTEMA	fb9d37aa560e5641f14dc959aa53e0c40b7b65c6
SIAVL_SIECM_URL	https://siecm.caixa/siecm-web/

SIAVL_SIECM_LOCAL_ARMAZENAMENTO	OS_CAIXA
SIAVL_SIECM_SSO_CLIENT_ID	cli-ser-avl
SIAVL_SIECM_SSO_CLIENT_SECRET	${VAULT::SIAVLKEY::password::1}
SIAVL_URL_SSO_INTRANET	https://login.prd.caixa/

SIAVL_URL_GRAVADOR_TECNET	http://10.123.124.156:8080

SIAVL_URL_API_CAIXA	https://api.caixa:8443/
SIAVL_MOBILEFIRST_URL_ENDPOINT	https://api.caixa:8443/comunicacao/push-notification/v1/messages

SIAVL_MOBILEFIRST_URL_SERVIDOR	http://10.219.67.94
SIAVL_MOBILEFIRST_RUNTIME	mfpmb1
SIAVL_API_KEY	l7xxdaf5ac6b2b95468cbc21ad36bb932e87
SIAVL_EMAIL_USUARIO_SERVICO_AGD	s739016
SIAVL_EMAIL_SENHA_USUARIO_SERVICO_AGD	${VAULT::SIAVLMAILKEY::password::1 }
SIAVL_EMAIL_HOST_IMAP	dfexchsc016.corp.caixa.gov.br
SIAVL_EMAIL_PORTA_IMAP	993
SIAVL_EMAIL_HOST_SMTP	sistemas.correiolivre.caixa
SIAVL_EMAIL_PORTA_SMTP	25
SIAVL_FILE_SYSTEM_BASE_PATH	/apl/siavl/email/
SIAVL_ROCKETCHAT_URL	https://chatdigital.caixa.gov.br/api/v1/
SIAVL_ROCKETCHAT_USER	SAULBP01
SIAVL_ROCKETCHAT_PASSWORD	${VAULT::SIAVLRCKEY::password::1}
SIAVL_NUMERO_SERVICO_SIIPC	81
SIAVL_URL_SIFWC_VERIFICACAO_CADES	https://sifwc.prd.coredf.caixa:8443/verificadorDeAssinatura/ws/cades.ws?wsdl
SIAVL_URL_SSO_INTERNET	https://login.caixa.gov.br/

SIAVL_ARQUIVOS_WHATSAPP	/siavl/imagens
SIGMS_UPLOAD_IMAGEM	https://sigms-enviar-prd.apps.apl4.caixa/sigms/v1/whats/upload-media/


Web Sockets	
Configurar o Servidor Jboss EAP 7 para habilitar o uso de WebSockets. 

Versão 7:
https://access.redhat.com/documentation/en-us/red_hat_jboss_enterprise_application_platform/7.0/html/development_guide/creating_websocket_applications 

https://developer.jboss.org/wiki/WebsocketSupportInAS7 

Certificado SSO	Instalar e importar o certificado do https://login.prd.caixa no Jboss de produção, conforme orientações da GESET.

http://wikides.caixa/mediawiki/index.php/Integra%C3%A7%C3%A3o_de_aplica%C3%A7%C3%B5es_e_servi%C3%A7os_ao_SISET-SSO#Configurando_servidores_JBoss 

Certificado ROCKETCHAT
DES	Instalar e importar o certificado do https://chatdigital.des.caixa.gov.br no Jboss de desenvolvimento.

Apache
PRD e DES INTRANET
	
Inserir as configurações abaixo na seção dos sites agenciadigital.caixa e agenciadigital.des.caixa no arquivo:
    /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl/proxy_ajp.conf

    ProxyPassMatch ^/(.*\.js)$ !
    ProxyPassMatch ^/(.*\.html)$ !
    ProxyPassMatch ^/(.*\.png)$ !
    ProxyPassMatch ^/(.*\.gif)$ !
    ProxyPassMatch ^/(.*\.jpg)$ !
    ProxyPassMatch ^/(.*\.css)$ !
    ProxyPassMatch ^/(.*\.woff)$ !
    ProxyPassMatch ^/(.*\.ogg)$ !
    ProxyPassMatch ^/(.*\.mp3)$ !
    ProxyPassMatch ^/(.*\.ttf)$ !
    ProxyPassMatch ^/(.*\.woff2)$ !
    ProxyPassMatch ^/(.*\.eot)$ !
    ProxyPassMatch ^/(.*\.svg)$ !
    ProxyPassMatch ^/(.*\.ico)$ !
    ProxyPassMatch ^/(.*\.map)$ !
    ProxyPassMatch ^/(.*\.pdf)$ !

_________________
Inserir as configurações abaixo no arquivo (máquina virtual nova):
    /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl/proxy_ajp.conf

    ProxyPassMatch ^/(.*\.js)$ !
    ProxyPassMatch ^/(.*\.html)$ !
    ProxyPassMatch ^/(.*\.png)$ !
    ProxyPassMatch ^/(.*\.gif)$ !
    ProxyPassMatch ^/(.*\.jpg)$ !
    ProxyPassMatch ^/(.*\.css)$ !
    ProxyPassMatch ^/(.*\.woff)$ !
    ProxyPassMatch ^/(.*\.ogg)$ !
    ProxyPassMatch ^/(.*\.mp3)$ !
    ProxyPassMatch ^/(.*\.ttf)$ !
    ProxyPassMatch ^/(.*\.woff2)$ !
    ProxyPassMatch ^/(.*\.eot)$ !
    ProxyPassMatch ^/(.*\.svg)$ !
    ProxyPassMatch ^/(.*\.ico)$ !
    ProxyPassMatch ^/(.*\.map)$ !
    ProxyPassMatch ^/(.*\.pdf)$ !
_____________________________________________________________________________________________________

Configuração para aceitar chamadas OPTIONS – APACHE DES
Nos arquivos de configuração do Apache, realizar a alteração:

Incluir as linhas, nessa ordem:
<Location /siavl-web>
    Header unset Access-Control-Allow-Origin
    Header unset Access-Control-Allow-Methods
    Header unset Access-Control-Allow-Headers

    Header always unset Access-Control-Allow-Origin
    Header always unset Access-Control-Allow-Methods
    Header always unset Access-Control-Allow-Headers

    Header always set Access-Control-Allow-Origin "*"
    Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
    Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
</Location>
RewriteCond %{REQUEST_METHOD} =OPTIONS
RewriteRule ^/(siavl-web)(/.*)?$ - [R=204,L]

Os arquivos de configuração estão disponíveis do diretório: /opt/apache/jbcs-httpd24-2.4/httpd/conf.d
Arquivos de configuração DES: siavl.conf, siavl02.conf, siavl03.conf, siavl04.conf e siavl05.conf

	
APACHE PRD e DES INTERNET	1.	Realizar a configurações abaixo nos arquivos de configuração do Apache, na camada de rede VIP e Internet (Azion), para segurança contra XSS:

DES:

ProxyPass /api-web balancer://httpcluster/siavl-api-internet/rs/sec/api-web
ProxyPassReverse /api-web balancer://httpcluster/siavl-api-internet/rs/sec/api-web

ProxyPass /negocios-digitais https://api.des.caixa:8443/negocios-digitais
ProxyPassReverse /negocios-digitais https://api.des.caixa:8443/negocios-digitais

<Directory "/opt/apache/jbcs-httpd24-2.4/httpd/htdocs/siavl">
	AllowOverride	All
</Directory>


2.	Realizar a configurações abaixo nos arquivos de configuração do Apache, na camada de rede VIP e Internet (Azion), para segurança contra XSS:


Atualizar as properties:
X-XSS-Protection: 1; mode=block – Ativa a proteção no navegador.

x-content-type-options: nosniff – Evita que o código JavaScript seja inserido em imagens ou atributos de elementos.

Incluir a property:
content-security-policy: script-src – Evita praticamente toda a entrada XSS em potencial.



PRD:
ProxyPass /api-web balancer://httpcluster/siavl-api-internet/rs/sec/api-web
ProxyPassReverse /api-web balancer://httpcluster/siavl-api-internet/rs/sec/api-web

ProxyPass /negocios-digitais https://api.caixa:8443/negocios-digitais
ProxyPassReverse /negocios-digitais https://api.caixa:8443/negocios-digitais

<Directory "/opt/apache/jbcs-httpd24-2.4/httpd/htdocs/siavl">
	AllowOverride	All
</Directory>

-----------------------------------------------

*OBS: As novas diretivas ProxyPass e ProxyPassReverse deverão ser incluídas no arquivo raiz de configuração do apache - httpd.conf (siavl-01.conf em PRD);

*OBS1: As novas diretivas AllowOverride deverão ser incluídas no arquivo raiz de configuração do apache - httpd.conf (siavl01-httpd.conf em PRD);
IMPORTANTE:
Essas novas diretivas devem ser colocadas preferencialmente após o seguinte trecho (mover as diretivas algumas linhas para baixo):
#
# Each directory to which Apache has access can be configured with respect
# to which services and features are allowed and/or disabled in that
# directory (and its subdirectories). 
#
# First, we configure the "default" to be a very restrictive set of 
# features.  
#
<Directory />
    AllowOverride none
    #Require all denied
    Require all granted
</Directory>

2. Inserir configurações abaixo no Apache do site agenciadigital.caixa.gov.br e agenciadigital2.caixa:

#Initialize mod_rewrite
RewriteEngine On
<FilesMatch "\.(html|htm|js|css)$">
  FileETag None
  <IfModule mod_headers.c>
    Header unset ETag
    Header set Cache-Control "max-age=0, no-cache, no-store, must-revalidate"
    Header set Pragma "no-cache"
    Header set Expires "Wed, 12 Jan 1980 05:00:00 GMT"
  </IfModule>
</FilesMatch>


3.	Realizar a configurações abaixo nos arquivos de configuração do Apache, na camada de rede VIP e Internet (Azion), para segurança contra XSS:

PRD:

Atualizar as properties:

X-XSS-Protection: 1; mode=block – Ativa a proteção no navegador.

x-content-type-options: nosniff – Evita que o código JavaScript seja inserido em imagens ou atributos de elementos.

Incluir a property: 

content-security-policy: script-src – Evita praticamente toda a entrada XSS em potencial.

Keycloak	Configurando servidores JBoss
1) Download do adapter
Baixar adapter do keycloak para a versão correspondente do jboss pelo link abaixo fornecido pela GESET07.
https://multiplataforma.corerj.caixa/produtos/sso#urls
2) Copiar arquivos
Descompactar adapter na raiz do JBoss. No caso de JBoss modo domain descompactar na raiz do Domain Controller.
3) Verificar arquivos
Verificar se os arquivos do adapter foram corretamente copiados para os diretórios "bin" e "modules" do JBoss.
4) Arquivo de configuração
1. Incluir no arquivo de configuração do JBoss (domain.xml) as seguintes informações:
 
<extensions>
  <extension module="org.keycloak.keycloak-adapter-subsystem"/>
</extensions>


2. No domain do SIAVL adicionar no subsystem security do keycloak.

<subsystem xmlns="urn:jboss:domain:security:3.0">
   <security-domains>
	   <security-domain name="keycloak">
		   <authentication>
			   <login-module code="org.keycloak.adapters.jboss.KeycloakLoginModule" flag="required"/>
		   </authentication>
	   </security-domain>
   </security-domains>
</subsystem>

3. No profile do domain.xml do siavl adicionar o subsystem abaixo.	

(Desenvolvimento)
<subsystem xmlns="urn:jboss:domain:keycloak:1.1">
	<secure-deployment name="siavl-api.war">
		<realm>r_inter_siper</realm>
		<resource>cli-ser-avl</resource>
		<bearer-only>true</bearer-only>
		<auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
		<ssl-required>EXTERNAL</ssl-required>
	</secure-deployment>

            <secure-deployment name="siavl-web.war">
                <realm>intranet</realm>
                <resource>cli-ser-avl</resource>
                <bearer-only>true</bearer-only>
                <auth-server-url>https://login.des.caixa/auth</auth-server-url>
                <ssl-required>EXTERNAL</ssl-required>
                <credential name="secret">${VAULT::SIAVLKEY::password::1}</credential>
            </secure-deployment>
</subsystem>

            <secure-deployment name="siavl-api-internet.war">
                <realm>r_inter_siper</realm>
                <resource>cli-ser-avl</resource>
                <bearer-only>true</bearer-only>
                <auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
                <ssl-required>EXTERNAL</ssl-required>
            </secure-deployment>

(Produção)
<subsystem xmlns="urn:jboss:domain:keycloak:1.1">
	<secure-deployment name="siavl-api.war">
		<realm>r_inter_siper</realm>
		<resource>cli-ser-avl</resource>
		<bearer-only>true</bearer-only>
		<auth-server-url>https://loginx.caixa.gov.br/auth</auth-server-url>
		<ssl-required>EXTERNAL</ssl-required>
	</secure-deployment>

                <secure-deployment name="siavl-web.war">
                <realm>intranet</realm>
                <resource>cli-ser-avl</resource>
                <bearer-only>true</bearer-only>
                <auth-server-url>https://login.prd.caixa/auth</auth-server-url>
                <ssl-required>EXTERNAL</ssl-required>
                <credential name="secret">${VAULT::SIAVLKEY::password::1}</credential>
</secure-deployment>
</subsystem>

OBS.: O valor da “VAULT::SIAVLKEY::password::1” deve ser obtido junto a GESET07. 

            <secure-deployment name="siavl-api-internet.war">
                <realm>r_inter_siper</realm>
                <resource>cli-ser-avl</resource>
                <bearer-only>true</bearer-only>
                <auth-server-url>https://loginx.caixa.gov.br/auth</auth-server-url>
                <ssl-required>EXTERNAL</ssl-required>
            </secure-deployment>

As orientações acima podem ser consultadas na wiki da GESET07 no link abaixo:
http://wikides.caixa/mediawiki/index.php/Integra%C3%A7%C3%A3o_de_aplica%C3%A7%C3%B5es_e_servi%C3%A7os_ao_SISET-SSO ou diretamente com a GESET07.

Configuração para envio do Token SMS	1 - No arquivo standalone-full-ha.xml altere a variável SIAVL_SIRAN_SOAP_URL e deixe da seguinte forma:
<property name="SIAVL_SIRAN_SOAP_URL" value="https://des.barramento.caixa/sibar/TokenTransacao?wsdl"/>
2 - Baixar o certificado no navegador (de preferência o firefox).
- Acesse o seguinte endereço: 
  https://des.barramento.caixa/sibar/TokenTransacao?wsdl
OBS: Verifique se o barramento está mapeado nos hosts.
- Clique no ícone do cadeado -> Clique na seta "Mostrar mais detalhes da conexão" -> Clique em mais informações ->
  Ver certificado -> Procure por "Baixar" e baixe a opção PEM(CADEIA).
3 - Adicionar no security da jdk
- Acesse o jdk_131 -> jre -> lib -> security
- Nessa pasta adicione o arquivo baixado no item anterior, ele deve ter o nome "des-barramento-caixa-chain.pem",
  que é o certificado.
- Ainda dentro da pasta security, abra o CMD e adicione o seguinte comando:
  keytool -import -alias CadeiaBarramentoDES -keystore cacerts -trustcacerts -file des-barramento-caixa-chain.pem
  - Será pedido uma senha, coloque a seguinte senha:
  changeit
  - Será pedido uma confirmação de confiança de certificado, digite sim.
4 - Dar stop/start em todas as instâncias.



Configurações	Configurações Websphere MQ 🗷
Websphere MQ	
X Sim	□ Não

Queue Manager	
	PRD e PILOTO	DES	TQS
queueManager	QSPA	QSDA	N/A
hostName	mqshgroup	ibmspdes.caixa	N/A
port	1420	1420	N/A
channel	SIAVL.SVRCONN	SIAVL.SVRCONN	N/A
user	SAVLBARP	SAVLBARD	N/A
Password	Undefined(empty)	Undefined(empty)	N/A

Connection Factory/
Channel	
Connection Factory	Channel	Queue Manager
	DES e PRD	DES	PRD
java:jboss/jms/SicliConnectionFactory	SIAVL.SVRCONN	QSDA	QSPA
java:jboss/jms/SigmsConnectionFactory	SIAVL.SVRCONN	QSDA	QSPA
java:jboss/jms/SiavlConnectionFactory	SIAVL.SVRCONN	QSDA	QSPA
java:jboss/jms/SiperConnectionFactory	SIAVL.SVRCONN	QSDA	QSPA

Usuário da Connection Factory	
CF	DES	HMP	PRD	TQS
SICLI	SAVLBARD	SAVBARH	SAVLBARP	N/A
SIGMS	SAVLBARD	SAVBARH	SAVLBARP	N/A
SIAVL	SAVLBARD	SAVBARH	SAVLBARP	N/A
SIPER	SAVLBARD	SAVBARH	SAVLBARP	N/A

Nome das filas	
  Outbound – Filas correspondentes aos JNDI


SICLI
SIBAR.REQ.CONSULTA_CLIENTE	java:jboss/jms/SIBAR.REQ.CONSULTA_CLIENTE
SIBAR.RSP.CONSULTA_CLIENTE	java:jboss/jms/SIBAR.RSP.CONSULTA_CLIENTE
SIBAR.REQ.MANUTENCAO_CLIENTE	java:jboss/jms/SIBAR.REQ.MANUTENCAO_CLIENTE
SIBAR.RSP.MANUTENCAO_CLIENTE	java:jboss/jms/SIBAR.RSP.MANUTENCAO_CLIENTE
SIPER
SIBAR.REQ.VALIDA_PERMISSAO
	java:jboss/jms/SIBAR.REQ.VALIDA_PERMISSAO
SIBAR.RSP.VALIDA_PERMISSAO	java:jboss/jms/SIBAR.RSP.VALIDA_PERMISSAO
SIGMS
SIBAR.REQ.SMS_CODIGO_ATIVACAO
	java:jboss/jms/SIBAR.REQ.SMS_CODIGO_ATIVACAO

SIBAR.RSP.SMS_CODIGO_ATIVACAO	java:jboss/jms/SIBAR.RSP.SMS_CODIGO_ATIVACAO
SIBAR.REQ.MANUTENCAO_SMS	java:jboss/jms/SIBAR.REQ.MANUTENCAO_SMS
SIBAR.RSP.MANUTENCAO_SMS	java:jboss/jms/SIBAR.RSP.MANUTENCAO_SMS
SIAVL
SIAVL.REQ.FILA_CHAT	java:jboss/jms/SIAVL.REQ.FILA_CHAT
A configuração dessa fila deve ficar assim:

<admin-object class-name="com.ibm.mq.connector.outbound.MQQueueProxy" jndi-name="java:jboss/jms/SIAVL.REQ.FILA_CHAT" enabled="true" use-java-context="true" pool-name="SIAVL.REQ.FILA_CHAT">
                            <config-property name="baseQueueName"> 
                                SIAVL.REQ.FILA_CHAT 
                            </config-property> 
                            <config-property name="CCSID"> 
                                500 
                            </config-property> 
                </admin-object>


	
SIAVL.RSP.FILA_CHAT	java:jboss/jms/SIAVL.RSP.FILA_CHAT

A configuração dessa fila deve ficar assim:

<admin-object class-name="com.ibm.mq.connector.outbound.MQQueueProxy" jndi-name="java:jboss/jms/SIAVL.RSP.FILA_CHAT" enabled="true" use-java-context="true" pool-name="SIAVL.RSP.FILA_CHAT">
                            <config-property name="baseQueueName"> 
                                SIAVL.RSP.FILA_CHAT 
                            </config-property> 
                            <config-property name="CCSID"> 
                                500 
                            </config-property> 
                        </admin-object>

Obs: Utilizar preferencialmente um QALIAS definido no MQ em substituição ao nome real da fila.

Exemplo:
Nome físico/QALIAS                        Nome jndi    
SIXXX.REQ.NOME_SERVICO                java:jboss/jms/req_servico
SIXXX.RSP.NOME_SERVICO                java:jboss/jms/rsp_servico

Nome físico                                        Nome jndi 
RQ.REQ.SIXXX.NOME_SERVICO           java:jboss/jms/req_servico
LQ.RSP.SIXXX.NOME_SERVICO            java:jboss/jms/req_servico
	   Inbound – Filas utilizadas por MDB’s

Propriedade                                      Nome da Fila escutada
________________________=    ______________________
________________________=    ______________________
________________________=    ______________________

Exemplo:
Propriedade                               Nome da Fila escutada   
sixxx.wsmq.mdb1.destination= SIXXX.REQ.NOME_SERVICO
sixxx.wsmq.mdb2.destination= SIXXX.REQ.NOME_SERVICO

