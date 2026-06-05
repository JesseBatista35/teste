# Ver se há muitas conexões abertas esperando resposta
   netstat -an | grep 10.192.228.146 | wc -l
   
   # Ver quantas threads estão em estado WAIT
   ps aux | grep jboss
