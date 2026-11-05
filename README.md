sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE --line-buffered "workflow-credito|ERROR|Exception"


Pablo, o SICCR-PJ 8.40.1 (workflow-credito-pj-ear-8.40.1-20261105.100217-6.ear) subiu no JBoss 7.4, no sifec-intranet. O Thiago Jeferson fez a implantação às 10:01. O contexto /workflow-credito-pj-web está registrado e o status é enabled, sem erros de CDI. Pode testar o link do PJ pelo SIFEC em https://migracaosifec.des.caixa/fec-web/ ?/ ?
