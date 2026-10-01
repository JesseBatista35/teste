  ps -ef | grep "Server:sicem_node1_lx0005" | grep -v grep
  kill 15949
  # aguarde ~30s; se não morrer:
  kill -9 15949

    tail -f /logs/jboss-eap/hc/servers/sicem_node1_lx0005/server.log
