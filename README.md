
-sh-4.2$ netstat -tlnp | grep  -E '9990|9999|8803'
(Não foi possível ler informações para "-p": geteuid()=10585600 mas você deve ser root.)
tcp        0      0 10.116.94.206:9999      0.0.0.0:*               OUÇA       -
tcp        0      0 10.116.94.206:8803      0.0.0.0:*               OUÇA       -
-sh-4.2$ netstat -tlnp | grep 9990
(Não foi possível ler informações para "-p": geteuid()=10585600 mas você deve ser root.)
-sh-4.2$
