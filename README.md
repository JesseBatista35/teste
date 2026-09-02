Atualização do chamado

O problema original de CORS ("403 CORS Rejected - Invalid origin") no ambiente TQS2 do SILIC foi identificado e resolvido: o variable group SILIC-v2-backend-tqs estava vinculado com dois escopos (EC TQS e EC TQS_2), fazendo com que seus valores sobrepusessem os do grupo SILIC-v2-backend-tqs_2, que continha as configurações corretas para o ambiente TQS2 (incluindo QUARKUS_HTTP_CORS_ORIGINS). O escopo duplicado foi corrigido.

Porém, após o novo deploy com a correção, identificamos um novo problema: o pod silic-v2-backend-tqs2-tqs sobe, mas fica reprovando no readiness probe (503), pois o health check de banco reporta status DOWN. O log mostra a seguinte falha na conexão com o Oracle:

ORA-12514: Cannot connect to database. Service orad02ng is not registered 
with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521.

A string de conexão utilizada pela aplicação já está correta (jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/orad02ng), então o problema não está mais do lado da aplicação/pipeline.

Solicitamos que o time verifique se o serviço orad02ng está corretamente registrado no listener do host cnpexdadvm01-scan4.extra.caixa.gov.br, porta 1521. Caso não esteja, pedimos que seja aberto chamado para o time de DBA providenciar o registro do serviço.
