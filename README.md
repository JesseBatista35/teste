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




sipen           not added

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=keycloak:read-children-names(child-type=secure-deployment)
{
    "outcome" => "success",
    "result" => [
        "apx-api.war",
        "apx-web.war",
        "bdcaixa-web.war",
        "bndes-web.war",
        "ccr-api.war",
        "ccr-parametros-api.war",
        "ccr-parametros-web.war",
        "ccr-web.war",
        "construcard-web.war",
        "emp-api.war",
        "emp-web.war",
        "empresas-web.war",
        "fec-api.war",
        "fec-sicdt-web.war",
        "fec-web.war",
        "garantias-web.war",
        "gerenciador-minutas-api.war",
        "gerenciador-minutas-web.war",
        "gerenciadorminutas-api.war",
        "hub-api.war",
        "hub-web.war",
        "ir-web.war",
        "lcr-web.war",
        "manterdocumento-web.war",
        "mcm-web.war",
        "mge-web.war",
        "minutaGarantias-web.war",
        "ori-web.war",
        "pen-api.war",
        "rural-web.war",
        "sicdt-orig-api-rest.war",
        "sifec-cdt-web.war",
        "simtr-rest-web.war",
        "sirur-web.war",
        "workflow-credito-pj-web.war"
    ]
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=fec-web.war:read-resource
{
    "outcome" => "success",
    "result" => {
        "allow-any-hostname" => true,
        "always-refresh-token" => false,
        "auth-server-url" => "https://login.des.caixa/auth",
        "auth-server-url-for-backend-requests" => undefined,
        "autodetect-bearer-only" => false,
        "bearer-only" => false,
        "client-key-password" => undefined,
        "client-keystore" => undefined,
        "client-keystore-password" => undefined,
        "connection-pool-size" => undefined,
        "cors-allowed-headers" => undefined,
        "cors-allowed-methods" => undefined,
        "cors-max-age" => undefined,
        "disable-trust-manager" => false,
        "enable-basic-auth" => false,
        "enable-cors" => false,
        "expose-token" => false,
        "min-time-between-jwks-requests" => undefined,
        "principal-attribute" => undefined,
        "public-client" => false,
        "realm" => "intranet",
        "realm-public-key" => undefined,
        "register-node-at-startup" => false,
        "register-node-period" => undefined,
        "resource" => "cli-web-fec",
        "ssl-required" => "all",
        "token-minimum-time-to-live" => undefined,
        "token-store" => undefined,
        "truststore" => undefined,
        "truststore-password" => undefined,
        "turn-off-change-session-id-on-login" => false,
        "use-resource-role-mappings" => false,
        "credential" => {"secret" => undefined}
    }
}

[domain@localhost:9999 /]




[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo grep -i "Keycloak subsystem override" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -10
09:59:26,014 INFO  [org.jboss.keycloak] (MSC service thread 1-6) Keycloak subsystem override for deployment workflow-credito-pj-web.war
10:01:11,203 INFO  [org.jboss.keycloak] (MSC service thread 1-1) Keycloak subsystem override for deployment workflow-credito-pj-web.war
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
