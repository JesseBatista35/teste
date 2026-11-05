/server-group=sifec-intranet:reload-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

Dá para aproveitar a mesma parada para a truststore do RURAL, já que ela também precisa de restart. Se a sala liberar, primeiro monte a truststore (passos 1 a 4 de ontem, com os certificados que já estão em /tmp/certs no 473), aponte a propriedade e use restart-servers no lugar do reload-servers. O restart aplica as duas mudanças de uma vez:

/server-group=sifec-intranet:restart-servers(blocking=true)

Se preferir resolver só o PJ agora, faça apenas o reload-servers, e o RURAL fica para depois.

Depois que subir (running):

No 473, confirme que SIFEC e SICCR-PJ subiram:
bash
   sudo grep -E "WFLYSRV0010|WFLYSRV0021|WFLYSRV0025" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -12
Peça para o Pablo testar a lista de clientes do PJ.
No 476, confirme que a API passou a devolver conteúdo:
bash
   sudo grep "workflow-credito-pj-web/api/perfil-acesso-usuario" /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-access.log | tail -3
Como o Claude está se saindo nesta sessão?
