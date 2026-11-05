/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

Só continue com running.

Ajuste dos dois domínios (cole o bloco inteiro no jboss-cli do 471):

batch
/profile=full-ha-sifec-intranet/subsystem=security/security-domain=jaas-sifec/authentication=classic:remove
/profile=full-ha-sifec-intranet/subsystem=security/security-domain=jaas-sifec/authentication=classic:add(login-modules=[{code=org.keycloak.adapters.jboss.KeycloakLoginModule,flag=required}])
/profile=full-ha-sifec-intranet/subsystem=security/security-domain="java:/jaas/jaas-sifec"/authentication=classic:remove
/profile=full-ha-sifec-intranet/subsystem=security/security-domain="java:/jaas/jaas-sifec"/authentication=classic:add(login-modules=[{code=org.keycloak.adapters.jboss.KeycloakLoginModule,flag=required}])
run-batch

O esperado é The batch executed successfully. Se der erro, digite discard-batch e me mande a mensagem.

Conferir:

/profile=full-ha-sifec-intranet/subsystem=security/security-domain=jaas-sifec:read-resource(recursive=true)

Deve aparecer KeycloakLoginModule.

Aplicar com reload, depois do OK da sala (alguns minutos fora):

/server-group=sifec-intranet:reload-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

Com running, peça para o Pablo testar o PJ: a lista de clientes deve trazer dados.

O jaas-sifec do sifec-intranet2 fica como está. Ele foi a origem da cópia, mas atende o SIFEC2, que não é o nosso foco.

Se piorar (por exemplo, o PJ não subir), volte para o módulo anterior trocando o add por:

add(cache-type=default ... login-modules=[{code=Remoting,flag=optional,module-options={password-stacking=useFirstPass}},{code=RealmDirect,flag=required,module-options={password-stacking=useFirstPass}}])

Nesse caso, me chame que eu te passo o comando completo.
