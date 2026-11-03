apache antigo
grep -RniE 'ProxyPass|UseAlias|CreateBalancers' /opt/httpd/conf.d/   # (ou o path equivalente no Apache antigo)




-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -vk --resolve sigec.des.caixa:443:10.116.78.14 https://sigec.des.caixa/<contexto>/
-sh: contexto: No such file or directory
-sh-4.2$ ^C
-sh-4.2$ diff /opt/httpd/conf.d/httpd-sigec.des.conf.bkp_20261007 /opt/httpd/conf.d/httpd-sigec.des.conf
diff: /opt/httpd/conf.d/httpd-sigec.des.conf.bkp_20261007: No such file or directory
diff: /opt/httpd/conf.d/httpd-sigec.des.conf: No such file or directory
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ diff /opt/httpd/conf.d/httpd-sigecpor2.conf_20261007    /opt/httpd/conf.d/httpd-sigecpor2.conf
diff: /opt/httpd/conf.d/httpd-sigecpor2.conf_20261007: No such file or directory
diff: /opt/httpd/conf.d/httpd-sigecpor2.conf: No such file or directory
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ hostname -i
10.116.82.43
-sh-4.2$
**




[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$ /server-group=sigec-portabilidade2:read-attribute(name=profile)
/profile=full-ha-sigec-portabilidade-batch/subsystem=modcluster:read-resource(recursive=true)
/profile=<perfil do sigec-portabilidade2>/subsystem=modcluster:read-resource(recursive=true)
-sh: syntax error near unexpected token `name=profile'
-sh: syntax error near unexpected token `recursive=true'
-sh: syntax error near unexpected token `('
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$




**

Last login: Tue Nov  3 10:02:39 2026 from 10.122.150.31
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$ /server-group=sigec-portabilidade2:read-attribute(name=profile)
/profile=full-ha-sigec-portabilidade-batch/subsystem=modcluster:read-resource(recursive=true)
/profile=<perfil do sigec-portabilidade2>/subsystem=modcluster:read-resource(recursive=true)
-sh: syntax error near unexpected token `name=profile'
-sh: syntax error near unexpected token `recursive=true'
-sh: syntax error near unexpected token `('
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$    curl -sv -o /dev/null -H "Host: sigec.des.caixa"     http://10.116.78.14/gec-web/por/
   curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/
*   Trying 10.116.78.14:80...
* Connected to 10.116.78.14 (10.116.78.14) port 80 (#0)
> GET /gec-web/por/ HTTP/1.1
> Host: sigec.des.caixa
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 302 Found
< Date: Tue, 03 Nov 2026 13:25:40 GMT
< Server: JBoss-EAP/7
< Expires: 0
< Cache-Control: no-cache, no-store, must-revalidate
< X-Powered-By: Undertow/1
< Set-Cookie: JSESSIONID="RFn2tJNIaqFHpWen0hDaYOjys-z0ZlKCqdbDxDnA.sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104"; Version=1; Path=/gec-web/por
< Set-Cookie: OAuth_Token_Request_State=a703284b-7ed8-4096-bdf4-68809f1fb9cc; HttpOnly
< Pragma: no-cache
< Location: https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/auth?response_type=code&client_id=cli-web-gec&redirect_uri=http%3A%2F%2Fsigec.des.caixa%2Fgec-web%2Fpor%2F&state=a703284b-7ed8-4096-bdf4-68809f1fb9cc&login=true&scope=openid
< Content-Length: 0
<
* Connection #0 to host 10.116.78.14 left intact
*   Trying 10.116.78.14:80...
* Connected to 10.116.78.14 (10.116.78.14) port 80 (#0)
> GET /gec-web/por/ HTTP/1.1
> Host: sigecpor2.des.caixa
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 302 Found
< Date: Tue, 03 Nov 2026 13:25:40 GMT
< Server: JBoss-EAP/7
< Expires: 0
< Cache-Control: no-cache, no-store, must-revalidate
< X-Powered-By: Undertow/1
< Set-Cookie: JSESSIONID="CVn6YBsJ2hvv6mnSAZTkCeFO6NRQczc9aGjJEvTd.sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104"; Version=1; Path=/gec-web/por
< Set-Cookie: OAuth_Token_Request_State=ff52fd9a-f1da-4612-bc5e-20e96662b8d3; HttpOnly
< Pragma: no-cache
< Location: https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/auth?response_type=code&client_id=cli-web-gec&redirect_uri=http%3A%2F%2Fsigecpor2.des.caixa%2Fgec-web%2Fpor%2F&state=ff52fd9a-f1da-4612-bc5e-20e96662b8d3&login=true&scope=openid
< Content-Length: 0
<
* Connection #0 to host 10.116.78.14 left intact
[p585600@caddeapllx2794 ~]$

