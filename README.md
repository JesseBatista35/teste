O auth-server-url vazio só funciona se o subsystem tiver um realm intranet definido com essa URL. Confira e compare as credenciais (no jboss-cli do 471):

/profile=full-ha-sifec-intranet/subsystem=keycloak/realm=*:read-resource
/profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=fec-web.war/credential=*:read-resource
/profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=workflow-credito-pj-web.war/credential=*:read-resource
Se não existir o realm=intranet com auth-server-url, ou se a credential do PJ não tiver secret, a configuração do PJ está incompleta. Aí a gente alinha com a do fec-web.
Se estiver tudo igual, o Keycloak está ok e a resposta vazia vem do código do PJ. Nesse caso, segue com o Pablo.

Se precisar ajustar, isso afeta só o PJ, sem reload. É preciso reimplantar o PJ depois:

/profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=workflow-credito-pj-web.war:write-attribute(name=auth-server-url,value=https://login.des.caixa/auth)
undeploy SICCR-PJ --server-groups=sifec-intranet --keep-content
deploy --name=SICCR-PJ --server-groups=sifec-intranet
