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
SICQL-mapsfeeder
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
SICQL

SICQL-mapsfeeder
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
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: OKD4 EC DES,OKD4 EC TQS,OKD4 EC HMP
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: OKD4 EC DES,OKD4 EC TQS,OKD4 EC HMP,OKD4 EC PRD
SICQL-mapspegasusenquadramento-des (30)
Scopes: OKD4 EC DES
CERTIFICATE_PASSWORD
INTEGRATION_PASSWORD
********
PASSWORD
pwscqlbd01
_ENV.CERTIFICATE_NAME
mapspegasusenquadramento
_ENV.CERTIFICATE_PASSWORD
#{CERTIFICATE_PASSWORD}#
_ENV.DATABASE_HOST
10.116.92.41
_ENV.DATABASE_NAME
cqldb001
_ENV.DATABASE_PORT
5104
_ENV.DATABASE_SCHEMA
enq
_ENV.DATABASE_USERNAME
scqlbd01
_ENV.ENQUADRAMENTO_OAUTH2_ATIVO_CLIENT_SECRET
enquadramentosecret
_ENV.ENQUADRAMENTO_SYSTEM_SYSADMIN_ACTIVE
false
_ENV.HTTP_BASIC_INTEGRATION_USERNAME
SCQLTB03
_ENV.LDAP_ANONYMOUS_READ_ONLY
true
_ENV.LDAP_BIND_DN
_ENV.LDAP_BIND_PASSWORD
_ENV.LDAP_DOMAIN
_ENV.LDAP_GROUP_BASE_DN
cn=SICQL,ou=groups,o=caixa
_ENV.LDAP_GROUP_FILTER
"(&(objectClass=groupOfUniqueNames)(uniqueMember=uid={1},ou=people,o=caixa))"
_ENV.LDAP_GROUP_NAME_ATTRIBUTE
cn
_ENV.LDAP_URL
ldap://ldapclusterdes.extra.caixa.gov.br:2489
_ENV.LDAP_USER_BASE_DN
"ou=people,o=caixa"
_ENV.LDAP_USER_FILTER
"(&(objectClass=inetOrgPerson)(objectClass=cefusuario)(uid={0}))"
_ENV.MAPS_PEGASUS_ATIVO_URL
http://sicql-sp.desenvolvimento.extracaixa/sicql/api/
_ENV.MAPS_PEGASUS_PASSIVO_URL
http://sicql-sp.desenvolvimento.extracaixa/sicqp/api/
_ENV.REVERSE_PROXY_URL
https://sicql-mapspegasusenquadramento-des.apps.nprd.caixa
_ENV.SPRING_SECURITY_OAUTH2_RESOURCESERVER_JWT_JWK-SET-URI
http://localhost:8080/enquadramento/auth/certs
_ENV.TLS_ENABLED
false
_SECRET.DATABASE_PASSWORD
#{PASSWORD}#
_SECRET.HTTP_BASIC_INTEGRATION_PASSWORD
#{INTEGRATION_PASSWORD}#
SICQL-mapspegasusenquadramento-tqs (30)

Scopes: OKD4 EC TQS
CERTIFICATE_PASSWORD
INTEGRATION_PASSWORD
********
PASSWORD
pwscqlbt01
_ENV.CERTIFICATE_NAME
mapspegasusenquadramento
_ENV.CERTIFICATE_PASSWORD
#{CERTIFICATE_PASSWORD}#
_ENV.DATABASE_HOST
10.116.28.37
_ENV.DATABASE_NAME
cqldb001
_ENV.DATABASE_PORT
5204
_ENV.DATABASE_SCHEMA
enq
_ENV.DATABASE_USERNAME
scqlbt01
_ENV.ENQUADRAMENTO_OAUTH2_ATIVO_CLIENT_SECRET
enquadramentosecret
_ENV.ENQUADRAMENTO_SYSTEM_SYSADMIN_ACTIVE
false
_ENV.HTTP_BASIC_INTEGRATION_USERNAME
SCQLTB03
_ENV.LDAP_ANONYMOUS_READ_ONLY
true
_ENV.LDAP_BIND_DN
_ENV.LDAP_BIND_PASSWORD
_ENV.LDAP_DOMAIN
_ENV.LDAP_GROUP_BASE_DN
cn=SICQL,ou=groups,o=caixa
_ENV.LDAP_GROUP_FILTER
"(&(objectClass=groupOfUniqueNames)(uniqueMember=uid={0},ou=people,o=caixa))"
_ENV.LDAP_GROUP_NAME_ATTRIBUTE
cn
_ENV.LDAP_URL
ldap://10.192.230.65:2489
_ENV.LDAP_USER_BASE_DN
"ou=people,o=caixa"
_ENV.LDAP_USER_FILTER
"(&(objectClass=inetOrgPerson)(objectClass=cefusuario)(uid={0}))"
_ENV.MAPS_PEGASUS_ATIVO_URL
http://sicql-sp.tqs.desenvolvimento.extracaixa/sicql/api/
_ENV.MAPS_PEGASUS_PASSIVO_URL
http://sicql-sp.tqs.desenvolvimento.extracaixa/sicqp/api/
_ENV.REVERSE_PROXY_URL
https://sicql-mapspegasusenquadramento-tqs.apps.nprd.caixa
_ENV.SPRING_SECURITY_OAUTH2_RESOURCESERVER_JWT_JWK-SET-URI
http://localhost:8080/enquadramento/auth/certs
_ENV.TLS_ENABLED
false
_SECRET.DATABASE_PASSWORD
#{PASSWORD}#
_SECRET.HTTP_BASIC_INTEGRATION_PASSWORD
#{INTEGRATION_PASSWORD}#
SICQL-mapspegasusenquadramento-hmp (31)
Scopes: OKD4 EC HMP
OKD-4-APL (12)
Scopes: OKD4 EC PRD
SICQL-mapspegasusenquadramento-prd (31)
CRQ000000978670
Scopes: OKD4 EC PRD
|Manage variable groups
Showing filters 1 through 2

Row 2

Showing filters 1 through 2

Expanded

Collapsed

558 pipelines found

Select a release pipeline to view its releases

4 pipelines found

Row 2

Row 2

Showing 4 deployments

Row 2

Row 2

Showing filters 1 through 2



posso adicniar aqui?
