
-sh-4.2$
-sh-4.2$ /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect controller=10;116;94;212:9990 --command="/deployment=*:read-resource"
Failed to connect to the controller: The controller is not available at 10:9990: java.net.ConnectException: WFLYPRT0053: Não foi possível conectar-se oa remote+http://10:9990. A conexão falhou: WFLYPRT0053: Não foi possível conectar-se oa remote+http://10:9990. A conexão falhou: Argumento inválido
-sh: 116: comando não encontrado
-sh: 94: comando não encontrado
-sh: 212:9990: comando não encontrado
-sh-4.2$ /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect controller=10.116.94.212:9990 --command="/deployment=*:read-resource"
Failed to connect to the controller: The controller is not available at 10.116.94.212:9990: java.net.ConnectException: WFLYPRT0053: Não foi possível conectar-se oa remote+http://10.116.94.212:9990. A conexão falhou: WFLYPRT0053: Não foi possível conectar-se oa remote+http://10.116.94.212:9990. A conexão falhou: Conexão recusada
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect controller=10.116.94.212:9990 --command="deployment-info"
Failed to connect to the controller: The controller is not available at 10.116.94.212:9990: java.net.ConnectException: WFLYPRT0053: Não foi possível conectar-se oa remote+http://10.116.94.212:9990. A conexão falhou: WFLYPRT0053: Não foi possível conectar-se oa remote+http://10.116.94.212:9990. A conexão falhou: Conexão recusada
-sh-4.2$
