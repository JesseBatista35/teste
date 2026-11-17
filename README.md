
-sh-4.1$
-sh-4.1$ for u in https://logindes.caixa.gov.br/auth/realms/internet https://login.des.caixa/auth/realms/intranet; do echo "== $u"; curl --noproxy '*' -k -s -m 10 $u/protocol/openid-connect/certs | grep -o '"kid":"[^"]*"'
> sudo find /opt/jboss -path '*servers*' -name server.log 2>/dev/null | grep -i intranet5
>
>
>
> sudo find /opt/jboss -path '*servers*' -name server.log 2>/dev/null
> ^C
-sh-4.1$ sudo find /opt/jboss -path '*servers*' -name server.log 2>/dev/null | grep -i intranet5
[sudo] password for p585600:
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo find /opt/jboss -path '*servers*' -name server.log 2>/dev/null
/opt/jboss/jboss-eap/domain/servers/server-two/log/server.log
/opt/jboss/jboss-eap/domain/servers/server-one/log/server.log
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo grep -nE "AdapterTokenVerifier|publicKey|kid|ccr-api|Unauthorized" /opt/jboss/jboss-eap/domain/servers/server-two/log/server.log | tail -20
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo grep -nE "AdapterTokenVerifier|publicKey|kid|ccr-api|Unauthorized" /opt/jboss/jboss-eap/domain/servers/server-one/log/server.log | tail -20
-sh-4.1$
-sh-4.1$
-sh-4.1$
