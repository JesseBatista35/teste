./jboss-cli.sh --connect --controller=10.116.88.20:9999
/host=<HC>/server-config=sicem_node1_lx0005:stop
deploy /tmp/SicemWEB_6.1.0.13.06.war --name=SICEM --runtime-name=SicemWEB_6.1.0.13.06.war --force
/host=<HC>/server-config=sicem_node1_lx0005:start
