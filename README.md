sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0016|WFLYSRV0026|WFLYCTL0013|ERROR|WELD-000119|WELD-001408"

Para sair, use Ctrl+C.

WFLYSRV0010: Deployed "SICCR-PJ..." indica que subiu.
WFLYCTL0013, ERROR ou WELD-001408 indica falha na subida. Me mande essas linhas.
WELD-000119 ... ContratoSifbnServiceIface not found indica que a dependência do arqref continua faltando no pacote novo.

Depois que terminar, confirme a versão (no 471, dentro do jboss-cli):

/deployment=SICCR-PJ:read-attribute(name=runtime-name)
/server-group=sifec-intranet/deployment=SICCR-PJ:read-attribute(name=enabled)

O resultado deve mostrar o nome do .ear novo e true.

Com isso, peça para testarem o PJ de novo: logout, login e abrir o PJ, olhando no F12 o perfil-acesso-usuario e o cliente/cnpj.
