SICIM-BACKEND-INTRANET-DES (9)
Grupo de variáveis de SICIM-BACKEND-INTRANET-DES
Scopes: EC DES
SECRET_SSO
********
SENHA_DB
********
_ENV.CLIENTID
cli-ser-cim
_ENV.CORS_ALLOWED_ORIGINS
https://sicim-frontend-des.apps.nprd.caixa,http://localhost:4200
_ENV.DATASOURCE_URL
jdbc:oracle:thin:@CNPEXDADVM01-SCAN4.EXTRA.CAIXA.GOV.BR:1521/ORAD01NG
_ENV.DATASOURCE_USERNAME
SCIMDB01
_ENV.SSO_URL
https://login.des.caixa/auth/realms/intranet
_SECRET.DATASOURCE_PASSWORD
#{SENHA_DB}#
_SECRET.SSO_CLIENT_SECRET
#{SECRET_SSO}#


notei aqui que ele nao esta enviado nas variaves o certificado:

