Na 473: deixe o log aberto antes de clicar em Deploy
sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0027|WFLYSRV0021|WFLYUT0021|WELD-00|ERROR|Caused by|TRIBUT|tribut"
No 6.4: conferir o pacote e a configuração
sudo grep -n 'SICCR-TRIBUTOS' /opt/jboss/jboss-eap/dc/configuration/domain.xml
sudo grep -niE 'tribut' /opt/jboss/jboss-eap/dc/configuration/domain.xml

No log, o WFLYSRV0010 indica que o pacote subiu. Se aparecer WFLYSRV0021, o deploy foi revertido: me manda o log que eu analiso.
