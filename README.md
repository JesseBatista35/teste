
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ PID=$(pgrep -f "sifec-intranet_node1_lx473" | head -1); sudo cat /proc/$PID/cmdline | tr '\0' '\n' | grep -i "truststore" | grep -vi password
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ echo | openssl s_client -connect login.des.caixa:443 -showcerts 2>/dev/null | grep -E "^ *[0-9]+ s:|^ *i:"
 0 s:C=BR, O=Caixa Economica Federal, CN=login.des.caixa
   i:C=BR, O=Caixa Economica Federal, CN=AC Icptestes Sub
 1 s:C=BR, O=Caixa Economica Federal, CN=AC Icptestes Sub
   i:C=BR, O=Caixa Economica Federal, CN=AC Icptestes Raiz
 2 s:C=BR, O=Caixa Economica Federal, CN=AC Icptestes Raiz
   i:C=BR, O=Caixa Economica Federal, CN=AC Icptestes Raiz
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=javax.net.ssl.trustStore:read-attribute(name=value)
{
    "outcome" => "success",
    "result" => "C:/Desenvolvimento/JDK/jdk1.8.0_231/jre/lib/security/cacerts"
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
