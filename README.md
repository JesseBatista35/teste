
[p585600@caddeapllx2577 log]$ systemctl status httpd-eap.service journalctl -xeu httpd-eap.service --no-pager | tail -50
systemctl: opção inválida -- “x”
[p585600@caddeapllx2577 log]$ grep -n "LogFormat" /opt/httpd/conf/httpd.conf
345:LogFormat "%h %l %u %t \"%r\" %>s %b \"%{Referer}i\" \"%{User-Agent}i\"" combined
346:LogFormat "%h %l %u %t \"%r\" %>s %b" common
347:LogFormat "%{Referer}i -> %U" referer
348:LogFormat "%{User-agent}i" agent
351:LogFormat "{ \"requestTime\":\"%{%Y-%m-%d %T}t.%{msec_frac}t %{%z}t\", \"sigla\":\"SIARG\", \"responseTime\":\"%D\", \"filename\":\"%f\", \"forwardedIP\":\"%{X-Forwarded-For}i\", \"remoteIP\":\"%h\", \"virtualHost\":\"%V\", \"request\":\"%U\", \"query\":\"%q\", \"method\":\"%m\", \"status\":\"%>s\", \"userAgent\":\"%{User-agent}i\", \"referer\":\"%{Referer}i\", \"bytesResponse\":\"%B\" }" monitoracao
356:#LogFormat "%h %l %u %t \"%r\" %>s %b \"%{Referer}i\" \"%{User-Agent}i\" %I %O" combinedio
[p585600@caddeapllx2577 log]$ find / -iname "apachectl" -o -iname "httpd" 2>/dev/null
/logs/httpd
/opt/httpd
/opt/httpd/sbin/apachectl
/opt/httpd/sbin/httpd
[p585600@caddeapllx2577 log]$ /opt/httpd/bin/apachectl configtest
-sh: /opt/httpd/bin/apachectl: Arquivo ou diretório inexistente
[p585600@caddeapllx2577 log]$



cara a realisdea é essa:

Prezado,
 
O problema reportado na reabertura difere do pedido original dessa REQ que foi concluída baseado no que foi solicitado originalmente.
 
Por favor abrir nova REQ informando o novo erro apresentado com as devidas evidências caso seja necessário.
 
Agradecemos a compreensão
 
Atte.
 
CTIS / CESTI Esteira DEVOPS DES TQS NPRD



 alem do mais o deploy nao teve anda haver com erro. pois foi feito em DES E nao em tqs.  me ajuda co ma evnidicia de forma educada fehcar aessa demanda 
