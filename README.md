No jboss-cli do 471 (10.116.97.59), estes comandos mostram o cadastro do PJ e do fec-web lado a lado:

/profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=workflow-credito-pj-web.war:read-resource(recursive=true)
/profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=fec-web.war:read-resource(recursive=true)

O recursive=true também mostra o secret, então não deixe a tela compartilhada aberta por muito tempo nessa parte.

Para mostrar que o modelo do Prokot (o CCR-Parâmetros) é igual:

/profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=ccr-parametros-web.war:read-resource

E para mostrar o ponto do token-store:

/profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=workflow-credito-pj-web.war:read-attribute(name=token-store)

O que apontar na tela: realm = intranet, resource = cli-web-fec e o secret iguais ao modelo do Prokot, e o token-store = undefined.
