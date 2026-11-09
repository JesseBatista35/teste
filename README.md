A release do SISMN-gecci-okd4 no stage EC TQS falhava na task “Atualizando Variáveis de Ambiente” com o erro one or more resources must be specified.

Causa: a aplicação passou a usar SQL Server (driver jdbc-mssql), e a variável QUARKUS_DATASOURCE_JDBC_URL do grupo SISMN-GECCI-TQS foi atualizada com a nova URL JDBC. Essa URL contém vários ; e estava cadastrada sem aspas. Na hora de executar o oc set env, o shell tratava cada ; como separador de comando, e a task quebrava antes de aplicar as variáveis no DeploymentConfig.

Ação realizada: a variável _ENV.QUARKUS_DATASOURCE_JDBC_URL foi ajustada com o valor entre aspas duplas, no mesmo padrão já usado em outras variáveis do grupo (ex.: JAVA_OPTIONS_APPEND). Depois disso a release foi reexecutada.

Resultado: a release foi concluída com sucesso, e o pod sismn-gecci-tqs-33 subiu normalmente, conectado ao banco SQL Server, sem erros de datasource.

Recomendações ao time da aplicação:

Substituir a matrícula pessoal usada como QUARKUS_DATASOURCE_USERNAME (f710695) por um usuário de serviço, para evitar indisponibilidade quando a senha pessoal expirar.
Marcar a variável APL_EMAIL_CONFIG_SMTP_PASSWORD como secreta no grupo TQS, como já está no DES.
Sempre que um valor de variável tiver ; ou espaços, cadastrá-lo entre aspas.
