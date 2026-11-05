1. Criar (no jboss-cli do 471, colocando o secret completo que o Pablo mandou):

/server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_RESOURCE_NAME:add(value=cli-ser-fec,boot-time=true)
/server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_SECRET:add(value=<SECRET-DO-PABLO>,boot-time=true)

2. Conferir:

/server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_RESOURCE_NAME:read-resource

O esperado é value => "cli-ser-fec".

3. Restart (avise a sala, porque o SIFEC fica fora alguns minutos):

/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

O estado final deve ser running.

4. Validar:

No 473, confirme que SIFEC e PJ subiram:
bash
  sudo grep -E "WFLYSRV0010: \"(SIFEC|SICCR-PJ)\"|WFLYSRV0021" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -4
No navegador: faça logout/login no SIFEC e abra o PJ. No F12, o perfil-acesso-usuario deve ter Content-Length maior que 0 e a resposta deve trazer as roles.
