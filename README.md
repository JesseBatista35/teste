
-sh-4.2$ sudo /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.94.221:9990
Failed to connect to the controller: The controller is not available at 10.116.94.221:9990: java.net.ConnectException: WFLYPRT0053: Não foi possível conectar-se oa remote+http://10.116.94.221:9990. A conexão falhou: WFLYPRT0053: Não foi possível conectar-se oa remote+http://10.116.94.221:9990. A conexão falhou: Conexão recusada
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo su
[root@sbrdeapllx114 tmp]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.94.221:9990
Failed to connect to the controller: The controller is not available at 10.116.94.221:9990: java.net.ConnectException: WFLYPRT0053: Não foi possível conectar-se oa remote+http://10.116.94.221:9990. A conexão falhou: WFLYPRT0053: Não foi possível conectar-se oa remote+http://10.116.94.221:9990. A conexão falhou: Conexão recusada
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]# /host=*/server-config=sinad_node1_lx114:reload
bash: /host=*/server-config=sinad_node1_lx114:reload: Arquivo ou diretório não encontrado
[root@sbrdeapllx114 tmp]#
