Gustavo, achei a causa do 401 do ccr-api (consignado v8, token do cli-web-pnc).

Diagnóstico:

No 6.4 (sifec5), o Keycloak não atua no ccr-api.war. O log de subida mostra o Keycloak aplicado ao CDT, mas não ao ccr-api, porque o web.xml dele não declara login-config. Com isso, a aplicação recebe e trata o token por conta própria, e aceita o token do cli-web-pnc (realm intranet).
No 7.4, o adaptador Keycloak aplica a proteção automaticamente com o realm configurado (internet). Como o token do cli-web-pnc é do realm intranet, a requisição é recusada com 401.
A configuração no domain.xml é a mesma nos dois. A diferença está no comportamento do adaptador entre o 6.4 e o 7.4.

Opções para decisão:

Igualar ao 6.4: remover o secure-deployment do ccr-api.war no 7.4. A aplicação volta a tratar o token como hoje no 6.4, mas o container deixa de validar. É reversível com um comando.
Manter a validação e trocar o realm para intranet: passa a aceitar o cli-web-pnc, mas recusa os consumidores que usam token do realm internet.
Manter como está: os consumidores passam a usar token do realm internet, o que exige ajuste do lado deles.

Qual caminho você prefere que a gente siga? Assim que você definir, aplicamos no DES e o Edson valida.
