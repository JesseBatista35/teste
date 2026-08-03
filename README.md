curl -v telnet://10.192.224.100:1415 --connect-timeout 3

# ver se existe algum access log do undertow/http
find /opt/jboss/standalone/log -type f -newer /opt/jboss/standalone/log/gc.log

# testar se o próprio serviço responde localmente (confirma que a app subiu ok)
curl -v -m 5 http://localhost:8080/


