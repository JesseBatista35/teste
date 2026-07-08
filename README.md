systemctl status httpd-eap.service
journalctl -xeu httpd-eap.service --no-pager | tail -50


TASK [apache : Verifica se existe uma linha igual]
grep: Request_URI: Arquivo ou diretório inexistente
grep: LogFormat: Arquivo ou diretório inexistente
...


TASK [apache : Adiciona bloco de texto após a última ocorrência de LogFormat se encontrado]
changed


grep -n "LogFormat" /opt/httpd/conf/httpd.conf

find / -iname "apachectl" -o -iname "httpd" 2>/dev/null


/opt/httpd/bin/apachectl configtest
