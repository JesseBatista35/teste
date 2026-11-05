1. Comparar a configuração do PJ com a do fec-web (no jboss-cli do 471):

/profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=workflow-credito-pj-web.war:read-resource

O que comparar: resource (o client), bearer-only, realm e use-resource-role-mappings. Se o client for outro (por exemplo cli-web-ccr ou cli-ser-ccr) e o usuário não tiver role nesse client, a aplicação pode não encontrar o perfil e devolver vazio.

2. Na sala, com o Pablo, que é quem conhece o código. Pergunte:

O que o endpoint api/perfil-acesso-usuario faz quando não encontra o perfil do usuário? Devolve vazio?
De onde vem o perfil: do token (roles do Keycloak), do banco ou de um serviço (SIPER, SICLI etc.)?

Se vier do banco, o aviso que apareceu no log às 10:10 passa a ser suspeito:

SQL Warning Code: 4223 ... Ocorreram exceções de segurança ao carregar o driver (DB2 JCC 4.16.53)

3. F12 em sala: na aba Rede, clique em perfil-acesso-usuario e veja:

Resposta: confirmar que está vazia;
Cabeçalhos de resposta: veja se há algum header de erro da aplicação.

Frase para a sala:

“A tela do PJ carrega, mas todas as chamadas da API (perfil-acesso-usuario, favoritos, natureza-juridica...) voltam HTTP 200 com corpo vazio, sem nenhum erro no log do JBoss. O SSO está configurado para o PJ e as requisições passam por ele, senão viria 302 ou 401. Pablo, você consegue ver no código o que o perfil-acesso-usuario retorna quando não encontra o perfil, e de onde ele busca esse perfil (token, banco ou outro serviço)?”

Me manda a saída do passo 1.
