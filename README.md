/profile=full-ha-sifec-intranet/subsystem=logging/periodic-rotating-file-handler=FILE:read-attribute(name=level)
Se vier ALL, DEBUG ou undefined, está ok.
Se vier INFO, libere temporariamente:
  /profile=full-ha-sifec-intranet/subsystem=logging/periodic-rotating-file-handler=FILE:write-attribute(name=level,value=DEBUG)

Só os pacotes wpj e intgr vão gerar DEBUG. O resto continua em INFO, porque é o logger raiz que controla isso.

Se o comando der “not found”, liste os handlers:

/profile=full-ha-sifec-intranet/subsystem=logging:read-children-names(child-type=periodic-rotating-file-handler)

Teste:

Deixe o log aberto no 473:
bash
   sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE --line-buffered "wpj|intgr|perfil|usuario|token|Exception|SSL|PKIX"
Peça para o Pablo ou o Thiago entrarem de novo no SIFEC (a sessão caiu com o reload), abrirem o PJ e consultarem.
No F12 deles, na chamada perfil-acesso-usuario, veja se há o header Authorization: Bearer.

Depois do teste, desfaça tudo:

/profile=full-ha-sifec-intranet/subsystem=logging/logger=br.gov.caixa.wpj:remove
/profile=full-ha-sifec-intranet/subsystem=logging/logger=br.gov.caixa.intgr:remove
/profile=full-ha-sifec-intranet/subsystem=logging/periodic-rotating-file-handler=FILE:write-attribute(name=level,value=INFO)

O último comando só é necessário se você tiver mudado o nível do handler.
