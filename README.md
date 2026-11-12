Olá! Verificamos o SIBEC3 em DES. A versão com a PR 169604 foi publicada pela release 1.0.0-SNAPSHOT(23) em 12/11 às 09:20. O sso-config.json já retorna as configurações corretas e o acesso redireciona para o Login CAIXA (DES).

O marcador API_DADOS_FAMILIA_PATH (e os demais de API) continua no bundle porque essas variáveis não existem no grupo SIEPR-CURSO-BEC3-FRONTEND-DES. Hoje o grupo tem apenas _ENV.API_BASE_PATH, _ENV.REALM, _ENV.SSO_BASE_PATH e _ENV.SSO_CLIENT_ID, além de HTTP_SERVICE_API sem o prefixo _ENV. (que, portanto, não chega à aplicação).

Para concluir, preciso dos valores de DES para:
_ENV.API_GESTAO_PATH
_ENV.API_PARAMETRIZACAO_PATH
_ENV.API_DADOS_FAMILIA_PATH
_ENV.API_ARQUIVOS_PATH
_ENV.API_RELATORIOS_PATH
_ENV.API_MANUTENCAO_PATH
_ENV.HORARIO_ACESSO_INTERNET_INICIO
_ENV.HORARIO_ACESSO_INTERNET_FINAL

Peço também confirmar se _ENV.API_BASE_PATH deve mesmo apontar para o próprio frontend e se a HTTP_SERVICE_API ainda é utilizada.

Com os valores em mãos, incluo na Library e combinamos o horário da nova release em DES.
