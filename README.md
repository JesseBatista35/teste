Servidores do SIFEC no JBoss 7.4 (DES):

Servidor	IP	Função
cbrdeapllx471	10.116.97.59	Domain Controller (CLI e deploy)
cbrdeapllx473	10.116.97.79	Host Controller, onde rodam as aplicações (log)
sbrdeapllx0001	10.116.88.20	DC do JBoss 6.4 (só para comparar)

CLI no 471:

bash
ssh p585600@10.116.97.59
sudo su
/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9999

Log no 473:

bash
ssh p585600@10.116.97.79
sudo su
LOG=/opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log

Caminhos úteis:

domain.xml em uso (471): /opt/jboss/jboss-eap/dc/configuration/domain.xml
Backup que fizemos (471): /tmp/domain.xml.bkp_ccr_dc_20261117_1517

Se o “e o .” era outra coisa, me fala o que faltou.
