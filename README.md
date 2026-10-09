Prezado Danilo,

Concluímos a análise do projeto sipcs-login-unico-jboss-okd (DES).

Causa identificada:
A aplicação estava implantada corretamente no OKD, com o contexto /login2 registrado, porém toda requisição retornava HTTP 500 com a exceção:

java.lang.NoClassDefFoundError: org/apache/commons/lang/StringUtils (LoginUnicoFilter → SessionUtil)

A biblioteca commons-lang 2.x é utilizada pelo código, mas não estava declarada no pom.xml. No servidor legado ela era fornecida pelo próprio JBoss; o JBoss EAP 7.4 da imagem OKD não a fornece.

Ajustes realizados no pom.xml (branch Cesti-test001):

Inclusão da dependência commons-lang:commons-lang:2.6;
Alteração do escopo das APIs Java EE (cdi-api, jboss-servlet-api_3.1_spec, jboss-jaxrs-api_2.0_spec, jboss-jsf-api_2.2_spec, jboss-annotations-api_1.2_spec) de “compile” para “provided”, evitando conflito com as bibliotecas fornecidas pelo servidor.

Resultado:
Após build e release a partir da branch Cesti-test001, a aplicação está respondendo normalmente. A tela de login (https://sipcs-login-unico-jboss-okd-des.apps.nprd.caixa/login2/login/) carrega com HTTP 200 em todos os recursos.

Ações necessárias pela equipe de desenvolvimento:

Aplicar os ajustes do pom.xml na branch atual do projeto, ou abrir Pull Request a partir da branch Cesti-test001;
Gerar nova versão a partir da branch oficial e executar a release;
Realizar a validação funcional completa (autenticação).

Observação: o teste de conexão do datasource siatcDS retornou “Connection is not valid”. Caso o fluxo de autenticação apresente falha relacionada a banco de dados, favor abrir nova solicitação para tratarmos.

Diante da identificação e correção da causa, a reunião agendada para 13/10 às 15h não se faz necessária.

Encerramos esta demanda. As REQs REQ000146385298, REQ000146297101 e REQ000146191619, referentes ao mesmo problema, também podem ser encerradas.

Att.,
Jessé Batista
CTIS/CESTI – Esteira DevOps DES/TQS NPRD
