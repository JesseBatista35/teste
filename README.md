[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]# echo "== internet ==" ; curl -k -s -m 10 https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/certs | grep -o '"kid":"[^"]*"' ; echo "== intranet ==" ; curl -k -s -m 10 https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/certs | grep -o '"kid":"[^"]*"'
== internet ==
"kid":"olg3hbVEM3_gRt1DdpXMwOXtS-E2MQQDb0Bhw6IvZdo"
== intranet ==
"kid":"MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw"
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
