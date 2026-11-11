Confirmar que as aplicações voltaram depois do restart

No CLI da 471:

/server-group=sifec-intranet:read-children-resources(child-type=deployment)

Na 473, procure falhas no startup:

sudo awk 'NR>=38021' /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0021|JZ00|WFLYSRV0025"

O esperado é aparecer só o WFLYSRV0025 (servidor iniciado), sem WFLYSRV0021.

Fica registrado que o jdbc/SybaseSifbnDS (FBNEM1, porta 4407) continua inacessível, mas igual ao 6.4, então não é regressão da migração.

Próximo da lista: sifec-apx e sifec-arc. Ficou pendente o grep na 471 e no 6.4.
