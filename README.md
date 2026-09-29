
-sh-4.2$ oc logs sipar-inter-frontend-des-32-smvvh --since=5m | grep -iE "siparInternet|ssl|verify|error" | tail -20
[Tue Sep 29 17:01:19.548809 2026] [ssl:info] [pid 37:tid 140279663290112] [client 25.2.10.1:54506] AH01998: Connection closed to child 11 with abortive shutdown (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:19.549814 2026] [ssl:info] [pid 251:tid 140280649697024] [client 25.2.10.1:54520] AH02008: SSL library error 1 in handshake (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:19.549838 2026] [ssl:info] [pid 251:tid 140280649697024] SSL Library Error: error:14094416:SSL routines:ssl3_read_bytes:sslv3 alert certificate unknown (SSL alert number 46)
[Tue Sep 29 17:01:19.549846 2026] [ssl:info] [pid 251:tid 140280649697024] [client 25.2.10.1:54520] AH01998: Connection closed to child 192 with abortive shutdown (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:19.561280 2026] [ssl:info] [pid 57:tid 140280393094912] [client 25.2.10.1:54526] AH01964: Connection to child 134 established (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:19.575610 2026] [ssl:info] [pid 57:tid 140280393094912] [client 25.2.10.1:54526] AH01998: Connection closed to child 134 with abortive shutdown (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:23.234844 2026] [ssl:info] [pid 57:tid 140280376309504] [client 25.2.2.1:46848] AH01964: Connection to child 136 established (server sipar-inter-frontend-des.apps.nprd.caixa:443)
25.2.2.1 - - [29/Sep/2026:17:01:28 -0300] "GET /siparInternet/ HTTP/1.1" 403 68
[29/Sep/2026:17:01:28 -0300] 25.2.2.1 TLSv1.2 ECDHE-RSA-AES128-GCM-SHA256 "GET /siparInternet/ HTTP/1.1" 68
[Tue Sep 29 17:01:40.904751 2026] [ssl:info] [pid 57:tid 140279789115136] [client 25.2.10.1:52598] AH01964: Connection to child 141 established (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:40.904753 2026] [ssl:info] [pid 44:tid 140279805900544] [client 25.2.10.1:52610] AH01964: Connection to child 75 established (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:40.911895 2026] [ssl:info] [pid 57:tid 140279789115136] [client 25.2.10.1:52598] AH02008: SSL library error 1 in handshake (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:40.911921 2026] [ssl:info] [pid 57:tid 140279789115136] SSL Library Error: error:14094416:SSL routines:ssl3_read_bytes:sslv3 alert certificate unknown (SSL alert number 46)
[Tue Sep 29 17:01:40.911926 2026] [ssl:info] [pid 57:tid 140279789115136] [client 25.2.10.1:52598] AH01998: Connection closed to child 141 with abortive shutdown (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:40.912327 2026] [ssl:info] [pid 44:tid 140279805900544] [client 25.2.10.1:52610] AH02008: SSL library error 1 in handshake (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:40.912353 2026] [ssl:info] [pid 44:tid 140279805900544] SSL Library Error: error:14094416:SSL routines:ssl3_read_bytes:sslv3 alert certificate unknown (SSL alert number 46)
[Tue Sep 29 17:01:40.912359 2026] [ssl:info] [pid 44:tid 140279805900544] [client 25.2.10.1:52610] AH01998: Connection closed to child 75 with abortive shutdown (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:40.924784 2026] [ssl:info] [pid 44:tid 140279797507840] [client 25.2.10.1:52616] AH01964: Connection to child 76 established (server sipar-inter-frontend-des.apps.nprd.caixa:443)
25.2.10.1 - - [29/Sep/2026:17:01:40 -0300] "GET /siparInternet/ HTTP/1.1" 403 68
[29/Sep/2026:17:01:40 -0300] 25.2.10.1 TLSv1.2 ECDHE-RSA-AES128-GCM-SHA256 "GET /siparInternet/ HTTP/1.1" 68
-sh-4.2$
-sh-4.2$
-sh-4.2$



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
SIPAR-inter-frontend-okd4
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
SIPAR

SIPAR-inter-frontend-okd4
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
SIPAR-inter-frontend-des-okd4 (10)
Scopes: OKD4 EC DES
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: OKD4 EC DES,OKD4 EC TQS,OKD4 EC HMP,OKD4 EC PRD
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)

Scopes: OKD4 EC DES,OKD4 EC TQS,OKD4 EC HMP,OKD4 EC PRD
KIND_DEPLOY
deploymentconfig
OKD_API_REGISTRY
api.produtos4.caixa:6443
OKD_REGISTRY
default-route-openshift-image-registry.apps.produtos4.caixa
OKD_TOKEN_REGISTRY
********
OKD_USER_SERVICE_REGISTRY
ads-sa
ProjetoBuild
build-images-ads
TIMEOUT_DEPLOY
300
SIPAR-inter-frontend-tqs-okd4 (10)
Scopes: OKD4 EC TQS
CONTEXTO_PROXY_PASS
/siparInternet
FQDN
https://sipar-inter-frontend-tqs.apps.nprd.caixa
FQDN2
https://sipar-inter-frontend-tqs.apps.nprd.caixa
PROXY_PASS_URL
ajp://sipar-inter-tqs:8009/siparInternet
SSLCACertificateFile
cadeiacompleta_tqs.crt
SSLCertificateChainFile
cadeia_cert_caixav2_des.crt
SSLCertificateFile
apps.nprd.caixa_ACInterna.crt
SSLCertificateFile2
apps.nprd.caixa_ACInterna.crt
SSLCertificateKeyFile
apps.nprd.caixa_ACInterna.key
SSLCertificateKeyFile2
apps.nprd.caixa_ACInterna.key
SIPAR-inter-frontend-prd (10)

Scopes: OKD4 EC PRD
CONTEXTO_PROXY_PASS
/siparInternet
FQDN
parcelamento.caixa.gov.br
FQDN2
contratacao.caixa.gov.br
PROXY_PASS_URL
ajp://sipar-inter-prd:8009/siparInternet
SSLCACertificateFile
cadeiacompleta.crt
SSLCertificateChainFile
cadeia_valid.crt
SSLCertificateFile
parcelamento-caixa-gov-br.crt
SSLCertificateFile2
contratacao-caixa-gov-br.crt
SSLCertificateKeyFile
parcelamento.caixa.gov.br.key
SSLCertificateKeyFile2
contratacao.caixa.gov.br.key
OKD-4-APL (12)
Scopes: OKD4 EC PRD
|Manage variable groups
Showing 25 filtered items.

Collapsed

9 pipelines found

Select a release pipeline to view its releases

No pipelines match your search

Expanded

Expanded

Collapsed

Collapsed

Select a release pipeline to view its releases

10 pipelines found

Select a release pipeline to view its releases

5 pipelines found

Row 2

Row 2

Expanded

Collapsed

4 pipelines found

Row 4

Showing filters 1 through 2

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
SIPAR-inter-frontend-okd4
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
SIPAR

SIPAR-inter-frontend-okd4
Predefined variables
Filter by keywords
Scope


AMBIENTE
des
AMBIENTE
tqs
AMBIENTE
hmp
AMBIENTE
prd
CGC_UNIDADE_DES
7265
CGC_UNIDADE_OPS
7259
nome_imagem
httpd-24-rhel7
PATH_DESTINO_SECRET
/etc/httpd/tls
SISTEMAAMBIENTE
des
SISTEMAAMBIENTE
tqs
SISTEMAAMBIENTE
hmp
SISTEMAAMBIENTE
prd
SISTEMANOME
sipar-inter-frontend
SITE
ctc_nprd

SITE
okd4_nprd
SITE
okd4_nprd
SITE
okd4_nprd
SITE
okd4_prd
tag_imagem
2.4-cef
TemplateRelease_OKD
openshift/apache24-https-caixa-release
UNIDADE
BR
URL_CUSTOMIZADA
contratacao.caixa.gov.br
Collapsed

9 pipelines found

Select a release pipeline to view its releases

No pipelines match your search

Expanded

Expanded

Collapsed

Collapsed

Select a release pipeline to view its releases

10 pipelines found

Select a release pipeline to view its releases

5 pipelines found

Row 2

Row 2

Expanded

Collapsed

4 pipelines found

Row 4

Showing filters 1 through 2

Showing filters 1 through 2

