Pessoal, sobre o SIGSJ-internet: como vocês vão aplicar no internet o mesmo ajuste do SIROT (EJB empacotado via Maven), vamos aguardar essa build para seguir com a configuração do servidor, sem incluir o deploy externo do SIROT.

Independente disso, o deploy do internet hoje falha porque a aplicação usa a persistence-unit SIGSJ04, que referencia a datasource java:jboss/datasources/SIGSJ04, e ela ainda não existe no JBoss novo. Para adiantarmos essa configuração, vocês conseguem nos passar:

tipo de banco e driver JDBC;
host, porta e nome do banco/service em DES;
usuário e onde fica a senha (cofre ou variável);
se há outras datasources usadas pela aplicação.

Com isso já deixamos a datasource pronta para quando a build nova for para a release.
