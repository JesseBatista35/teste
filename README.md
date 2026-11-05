1. Confirmar (no jboss-cli do 471):

/profile=full-ha-sifec-intranet/subsystem=security/security-domain=keycloak:read-resource(recursive=true)

O esperado é aparecer org.keycloak.adapters.jboss.KeycloakLoginModule.

2. Se confirmar, ajustar os dois domínios do PJ para ficarem iguais ao keycloak:

batch
/profile=full-ha-sifec-intranet/subsystem=security/security-domain=jaas-sifec/authentication=classic:remove
/profile=full-ha-sifec-intranet/subsystem=security/security-domain=jaas-sifec/authentication=classic:add(login-modules=[{code=org.keycloak.adapters.jboss.KeycloakLoginModule,flag=required}])
/profile=full-ha-sifec-intranet/subsystem=security/security-domain="java:/jaas/jaas-sifec"/authentication=classic:remove
/profile=full-ha-sifec-intranet/subsystem=security/security-domain="java:/jaas/jaas-sifec"/authentication=classic:add(login-modules=[{code=org.keycloak.adapters.jboss.KeycloakLoginModule,flag=required}])
run-batch

Se o passo 1 mostrar algum módulo ou opção diferente, me mande antes de rodar, que eu ajusto o comando para ficar idêntico.

3. Aplicar: a alteração vai marcar o servidor como reload-required. Como hoje já vai ter o restart da truststore do RURAL, dá para aproveitar a mesma parada. Ou, se a sala liberar agora:

/server-group=sifec-intranet:reload-servers(blocking=true)

Depois do reload, o PJ sobe junto, porque está enabled. Peça para o Pablo testar de novo.
