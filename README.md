Boa tarde.

Por favor,

Poderia disponibilizar o LOG do servidor de aplicação jboss do ambiente de TQS referente as URL's:
https://identidadedigital.acessoseguro.tqs.corerj.caixa/
https://webservice.acessoseguro.tqs.corerj.caixa/
https://acessoseguro.tqs.corerj.caixa/

att.

Leandro.


C:\Users\p585600>nslookup identidadedigital.acessoseguro.tqs.corerj.caixa
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10

Nome:    identidadedigital.acessoseguro.tqs.corerj.caixa
Address:  10.116.18.233


C:\Users\p585600>
C:\Users\p585600>
C:\Users\p585600>nslookup webservice.acessoseguro.tqs.corerj.caixa
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10

Nome:    webservice.acessoseguro.tqs.corerj.caixa
Address:  10.116.18.231


C:\Users\p585600>nslookup acessoseguro.tqs.corerj.caixa
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10




p585600@10.116.18.233's password:
Permission denied, please try again.
p585600@10.116.18.233's password:
Last login: Sun Jul  5 12:13:38 2026 from 10.122.150.31
[p585600@srjtqaprlx0001 ~]$
[p585600@srjtqaprlx0001 ~]$
[p585600@srjtqaprlx0001 ~]$ hostname -f
srjtqaprlx0001.host.trj
[p585600@srjtqaprlx0001 ~]$ hostname -i
10.116.18.79
[p585600@srjtqaprlx0001 ~]$ ps -ef | grep jboss
p585600  15485 14959  0 10:45 pts/1    00:00:00 grep jboss
[p585600@srjtqaprlx0001 ~]$ ps -ef | grep java
root     11231     1  0  2023 ?        1-17:39:22 /opt/ctmage8/bmcjava/bmcjava-V3/bin/java -Xmx256m -XX:+CrashOnOutOfMemoryError -Djava.io.tmpdir=/tmp -Djava.net.preferIPv4Stack=true -Doverride.default.services= -Dspring.profiles.active=tcp -DCTMAG.CONFIG.DBGLVL=0 -Dctm.logs.dir=/opt/ctmage8/ctm/proclog -Dlogging.config=/opt/ctmage8/ctm/data/logback.xml -Dctm.data.dir=/opt/ctmage8/ctm/data -Dstdout=/opt/ctmage8/ctm/proclog/agjstd_8491-2023-12-06.0.tmp -jar /opt/ctmage8/ctm/exe/ag-app.jar
p585600  15515 14959  0 10:45 pts/1    00:00:00 grep java
[p585600@srjtqaprlx0001 ~]$
[p585600@srjtqaprlx0001 ~]$
[p585600@srjtqaprlx0001 ~]$
