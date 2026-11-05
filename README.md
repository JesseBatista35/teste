2. Acompanhe no 473 (abra o tail antes de confirmar o deploy):

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYCTL0013|ERROR|WELD-001408|sifec-cdt|sicdt|WFLYUT0021"
WFLYUT0021: ... /sifec-cdt-web e /sicdt-orig-api-rest: os dois contextos subiram.
WFLYSRV0010: Deployed "sifec-cdt-3.24.3.001.ear": sucesso.
WFLYCTL0013 ou ERROR: me mande as linhas.

3. Confirmação (CLI do 471):

/server-group=sifec-intranet/deployment=SIFEC-CDT:read-attribute(name=enabled)
