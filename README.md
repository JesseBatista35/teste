1. Pergunta para o Pablo (é a peça que falta):

Pablo, no 6.4 o perfil-acesso-usuario devolve as roles do token (FEC0126, offline_access, uma_authorization...). No 7.4 já igualamos banco, secure-deployment do Keycloak, properties, SSO (JSESSIONIDSSO) e caminho dos cookies, e ele continua voltando vazio, sem erro. Como o PJ obtém essas roles no código? request.getUserPrincipal() como KeycloakPrincipal, o KeycloakSecurityContext da sessão, request.isUserInRole, ou ele chama o Keycloak com o client cli-ser-fec? Pode mandar o trecho do endpoint perfil-acesso-usuario? Com isso eu sei exatamente o que falta no servidor.

2. Ligue o DEBUG do Keycloak (CLI do 471, sem restart):

/profile=full-ha-sifec-intranet/subsystem=logging/logger=org.keycloak:add(level=DEBUG)
/profile=full-ha-sifec-intranet/subsystem=logging/periodic-rotating-file-handler=FILE:read-attribute(name=level)
Se o segundo devolver ALL ou DEBUG, está ok.
Se devolver INFO, me avise antes de seguir.

3. Peça um teste novo (login na InPrivate e abrir o PJ) e rode no 473:

sudo grep -n "org.keycloak" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -40

Interessam linhas sobre workflow-credito-pj-web: se ele achou o token na sessão, se tentou autenticar e se recusou alguma coisa.

Pode me mandar a resposta do Pablo e a saída do grep.
