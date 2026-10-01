  ps -ef | grep "Server:sicem_node1_lx0005" | grep -v grep
  kill 15949
  # aguarde ~30s; se não morrer:
  kill -9 15949

    tail -f /logs/jboss-eap/hc/servers/sicem_node1_lx0005/server.log


<img width="1199" height="712" alt="image" src="https://github.com/user-attachments/assets/1c899056-cf31-4f80-9f0f-6eb2de32071d" />
gaurdando a assinatura
