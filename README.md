Bom dia, Edson! Ainda estou com a análise em andamento. O que já confirmei:

O token do cli-web-pnc é emitido pelo realm intranet, e o ccr-api está configurado para o realm internet, tanto no 7.4 quanto no 6.4 (sifec5).
A configuração de autenticação do ccr-api, o web.xml da aplicação e a versão do adaptador Keycloak são idênticos nos dois ambientes.

Ou seja, a diferença não está na configuração do JBoss. Estou verificando agora a infraestrutura em volta (resolução do servidor de login a partir de cada ambiente e o caminho de acesso do sifec5), que é o que ainda difere. Te retorno hoje com o resultado.
