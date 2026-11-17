.1$
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
-sh-4.1$ hostname -f
sbrdeapllx067.extra.caixa.gov.br
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo find / -type d -name "sifec-intranet5*" 2>/dev/null
/opt/jboss/jboss-eap/hc/tmp/servers/sifec-intranet5_lx0067
/opt/jboss/jboss-eap/hc/data/servers/sifec-intranet5_lx0067
/opt/jboss/jboss-eap/hc/servers/sifec-intranet5_lx0067
/logs/jboss-eap/hc/servers/sifec-intranet5_lx0067
^C-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo grep -nE "AdapterTokenVerifier|publicKey|kid|ccr-api|Unauthorized" $(sudo find / -path "*sifec-intranet5_lx0067/log/server.log" 2>/dev/null) | tail -20
^C

-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo ls -lt $(dirname $(sudo find / -path "*sifec-intranet5_lx0067/log/server.log" 2>/dev/null)) | head
^C

-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ for u in https://logindes.caixa.gov.br/auth/realms/internet https://login.des.caixa/auth/realms/intranet; do echo "== $u"; curl --noproxy '*' -k -s -m 10 $u/protocol/openid-connect/certs | grep -o '"kid":"[^"]*"'; done
== https://logindes.caixa.gov.br/auth/realms/internet
"kid":"olg3hbVEM3_gRt1DdpXMwOXtS-E2MQQDb0Bhw6IvZdo"
== https://login.des.caixa/auth/realms/intranet
"kid":"MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw"
-sh-4.1$
