
-sh-4.1$ sudo netstat -ltnp | grep -E ':9999|:990'
tcp        0      0 10.116.88.20:9999           0.0.0.0:*                   LISTEN      58321/java
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.20:9999 --command="/host=*/server-config=*:read-attribute(name=group)" | grep -B8 'sifec-intranet5' | grep -E 'host|server-config'
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ curl -k -s -m 10 -o /dev/null -w "%{http_code}\n" https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/certs; curl -k -s -m 10 -v https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/certs 2>&1 | grep -iE 'SSL|error|connect' | head -5
000
* About to connect() to proxy proxydes.caixa port 80 (#0)
*   Trying 10.252.32.65... connected
* Connected to proxydes.caixa (10.252.32.65) port 80 (#0)
> CONNECT logindes.caixa.gov.br:443 HTTP/1.1
> Proxy-Connection: Keep-Alive
-sh-4.1$
