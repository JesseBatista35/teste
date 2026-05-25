
-sh-4.2$ ^C
-sh-4.2$ sudo find /opt -name "server.log" 2>/dev/null | hean -5
-sh: hean: comando não encontrado
[sudo] senha para p585600:
[sudo] senha para p585600:
-sh-4.2$ sudo tail -200 /opt/jboss
tail: não foi possível abrir “/opt/jboss” para leitura: Arquivo ou diretório não encontrado
-sh-4.2$ sudo tail -200 /opt/jboss/standalone/log/server.log | grep -E "ERROR|WARN|FALIED|Exception|Caused by"
tail: não foi possível abrir “/opt/jboss/standalone/log/server.log” para leitura: Arquivo ou diretório não encontrado
-sh-4.2$ sudo sustemctl status jboss -i
sudo: sustemctl: comando não encontrado
-sh-4.2$ sudo systemctl status jboss -i
Unit jboss.service could not be found.
-sh-4.2$ ls -lah /opt/jboss/stadalone/deployments/
ls: não é possível acessar /opt/jboss/stadalone/deployments/: Arquivo ou diretório não encontrado
-sh-4.2$

