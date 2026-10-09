Tente abrir o console de administração do Keycloak:

https://login.des.caixa/auth/admin/

Se o realm não for o master, o caminho fica https://login.des.caixa/auth/admin/<realm>/console/.

Entre com seu usuário corporativo (P585600) e veja o que acontece:

Você tem acesso se o console abrir e aparecer o realm em Clients, com cli-web-cir na lista e permissão de editar.
Você não tem acesso se aparecer “Forbidden” ou “You don’t have access”, se o login falhar ou se o console abrir sem mostrar Clients.

Se não tiver, encaminhe para o time de SSO com o texto que te passei.

Mesmo sem admin, dá para confirmar o problema sozinho:

Abra https://sicir-frontend-tqs.apps.nprd.caixa/ com o F12 aberto, na aba Network. No redirect para o login, copie a URL que vai para login.des.caixa/auth/realms/<REALM>/protocol/openid-connect/auth?.... Ela mostra o nome do realm.
Na mesma URL, troque o redirect_uri para https%3A%2F%2Fsicir-frontend-des.apps.nprd.caixa%2F e abra no navegador.
Se aparecer “Invalid parameter: redirect_uri”, está confirmado que falta a URI de DES no client.
Se abrir a tela de login normalmente, o client está certo e o problema está em outro ponto. Aí precisamos ver a URL exata que o DES está enviando.

Essa evidência já serve para anexar no chamado ao SSO.
