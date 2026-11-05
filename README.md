1. No 473: o PJ recebeu a configuração do Keycloak?

bash
sudo grep -i "Keycloak subsystem override" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -10

Deve aparecer uma linha ...override for deployment workflow-credito-pj-web.war. Se aparecer só para o fec-web e os outros, e não para o PJ, a causa está aí.

2. No jboss-cli do 471: quais apps estão no Keycloak

/profile=full-ha-sifec-intranet/subsystem=keycloak:read-children-names(child-type=secure-deployment)

Se workflow-credito-pj-web.war não estiver na lista, me mande também a configuração de um que esteja, por exemplo:

/profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=fec-web.war:read-resource

Com isso eu monto o comando para criar a do PJ, igual à do fec-web.

3. Na sala, com o Pablo (F12):
No DevTools, aba Rede, clique em perfil-acesso-usuario e anote:

Cabeçalhos de solicitação: existe Authorization: Bearer ... ou cookie de sessão?
Resposta: está vazia mesmo?

O Pablo também pode olhar no código o que a API retorna quando não encontra o usuário logado. Isso confirma ou descarta a hipótese.

Me manda as saídas dos passos 1 e 2.
