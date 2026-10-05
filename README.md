Prezados,

Analisamos a release do SIFGD-pagamentos-backend (DES). O deploy não completava porque a aplicação subia sem as variáveis de conexão com o banco. O Quarkus registrava configured datasource <default> not found, o pod não ficava pronto e a task "Verificando Status do Deployment" estourava o tempo limite.

Causa: as variáveis do grupo SIFGD-pagamentos-backend-DES (criado pela WO0000081780569) estavam fora do padrão da esteira. Só são injetadas no container as variáveis com o prefixo _ENV. (ou _SECRET., para valores sensíveis).

Ajuste realizado pela CESTI: renomeamos três variáveis no grupo DES, que já foram confirmadas no DeploymentConfig:

_ENV.DB_URL
_ENV.DB_USERNAME
_ENV.DB_SCHEMA

Pendências do time de desenvolvimento:

Senha do banco: a variável ENV_DB_PASSWORD está como secret, então não temos acesso ao valor para renomeá-la. O responsável deve excluí-la e criá-la de novo como _SECRET.DB_PASSWORD no grupo DES.
application.properties: ajustar as referências para os nomes que agora chegam ao container:
   quarkus.datasource.username=${DB_USERNAME}
   quarkus.datasource.password=${DB_PASSWORD}
   quarkus.datasource.jdbc.url=${DB_URL}
   quarkus.hibernate-orm.database.default-schema=${DB_SCHEMA}
   quarkus.http.cors.origins=${FRONT_URL}
URL do front: a propriedade quarkus.http.cors.origins depende de uma variável que não existe no grupo. É preciso criar _ENV.FRONT_URL com a URL do front em DES. Sem ela, a aplicação não sobe.
Demais ambientes: os grupos TQS, HMP e PRD também precisam seguir o padrão _ENV. / _SECRET.. Hoje o TQS está sem prefixo, e os grupos HMP e PRD só têm a variável INIT.

Feitos esses ajustes, basta gerar uma nova build e executar a release.

Encerramos a demanda do lado da CESTI. Se o erro continuar após os ajustes, fiquem à vontade para abrir nova solicitação.
