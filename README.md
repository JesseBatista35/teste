/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.20:9999

/host=sbrdeapllx0005/server-config=sicem_node1_lx0005:read-attribute(name=group)


deploy /home/p585600/SicemWEB_6.1.0.11.31.war --server-groups=<nome_do_group_retornado_no_passo_2>


deploy /home/p585600/SicemWEB_6.1.0.11.31.war --name=SicemWEB.war --replace

https://sicem-legado.des.caixa/sicem/
