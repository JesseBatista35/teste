Estou com problema para subir um dos nós do cluster do ambiente de DES, o log não mostra o erro claramente, queria entender se por acaso não há alguma falha no balanceador do ambiente, ou ate mesmo tentar restartar a máquina para ver resolve.



a demandtna disse isso:


fiz o teste aqui, e parece que não adiantou. Parece que a aplicação nessa maquina ta subindo sim, tanto que não mostra erros no log significativos que barria a subida. Ele chega ate a carregar os scripts em memoria no fim, mas não entra na pagina "https://sitec.desenvolvimento.extracaixa/tec_tel", a gente achou estranho que quando a aplicação ta down ou subiu com erros, geralmente aparecia uma pagina especifica, escrita CAIXA bem grande, e agora ta aparecendo uma pagina escrito" Service Unavailable
The server is temporarily unable to service your request due to maintenance downtime or capacity problems. Please try again later."
eu tentei entrar pelo ip direto pra ver se nao seria alguma coisa do apache né,"https://10.192.228.217:8380/tec_tel" mas é bloqueado pra nós aqui acessar o ip direto.
 
Temos nessa mesma maquina outra aplicação do mesmo sistema rodando, o tellus-tqs, e ele ta entyrando normal, na outra maquina do cluster, que é a 10.192.228.85, temos duas aplicações do mesmo sistema tellus rodando tb, e ambos estão normais



──────────────────────────────────────────────────────────────────────┐
    │               • MobaXterm Professional Edition v24.2 •               │
    │               (SSH client, X server and network tools)               │
    │                                                                      │
    │ ⮞ SSH session to p585600@10.122.150.31                               │
    │   • Direct SSH      :  ✓                                             │
    │   • SSH compression :  ✓                                             │
    │   • SSH-browser     :  ✓                                             │
    │   • X11-forwarding  :  ✓  (remote display is forwarded through SSH)  │
    │                                                                      │
    │ ⮞ For more info, ctrl+click on help or visit our website.            │
    └──────────────────────────────────────────────────────────────────────┘

Last login: Tue Sep 15 10:36:45 2026 from 10.111.14.28
[p585600@cadsvitrlx100 ~]$ ssh 10.192.228.217
The authenticity of host '10.192.228.217 (10.192.228.217)' can't be established.
RSA key fingerprint is SHA256:or+d96lsAsW54vlM24+7L0FFPxso2AWJ6feSuFPtuDI.
This key is not known by any other names
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.192.228.217' (RSA) to the list of known hosts.
***********************************************************************
(1) - Este e um computador privado de propriedade da Caixa Economica
Federal. Usuarios autorizados e nao autorizados nao possuem direitos de
divulgar as informacoes contidas aqui.
(2) - Ao fazer uso do sistema, o usuario esta ciente que pode estar
sendo monitorado, interceptado e auditado pelo departamento competente
da Caixa Economica Federal.
(3) - O uso nao autorizado ou improprio deste sistema pode resultar em
um processo disciplinar administrativo e/ou punicao atraves de acoes
civis ou criminais. Ao continuar o uso deste sistema, indica que voce
esta ciente e concordando com os termos e condicoes acima descritos.

Pressione <Control+D> IMEDIATAMENTE se voce nao concorda com as
condicoes deste aviso
***********************************************************************
p585600@10.192.228.217's password:
Creating directory '/home/p585600'.
-sh-4.1$
-sh-4.1$
-sh-4.1$ ps -ef | grep jboss
root      13342      1  0 Sep14 ?        00:00:00 su - jboss -c ( java -Xms4g -Xmx4g -XX:MaxPermSize=1024m -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dwicket.configuration=deployment -Djava.awt.headless=true -Dsun.lang.ClassLoader.allowArraySyntax=true -Djava.net.preferIPv4Stack=true -server -Xdebug -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8381 -classpath /opt/jboss//bin/run.jar:/lib/tools.jar org.jboss.Main -c sitec-tellus-tqs -b 0.0.0.0 > /opt/jboss//server/sitec-tellus-tqs/log/jboss-sitec-tellus-tqs 2>&1 )
jboss     13344  13342  0 Sep14 ?        00:00:00 -bash -c ( java -Xms4g -Xmx4g -XX:MaxPermSize=1024m -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dwicket.configuration=deployment -Djava.awt.headless=true -Dsun.lang.ClassLoader.allowArraySyntax=true -Djava.net.preferIPv4Stack=true -server -Xdebug -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8381 -classpath /opt/jboss//bin/run.jar:/lib/tools.jar org.jboss.Main -c sitec-tellus-tqs -b 0.0.0.0 > /opt/jboss//server/sitec-tellus-tqs/log/jboss-sitec-tellus-tqs 2>&1 )
jboss     13776  13344  4 Sep14 ?        01:05:59 java -Xms4g -Xmx4g -XX:MaxPermSize=1024m -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dwicket.configuration=deployment -Djava.awt.headless=true -Dsun.lang.ClassLoader.allowArraySyntax=true -Djava.net.preferIPv4Stack=true -server -Xdebug -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8381 -classpath /opt/jboss//bin/run.jar:/lib/tools.jar org.jboss.Main -c sitec-tellus-tqs -b 0.0.0.0
root      66547      1  0 Jun03 ?        00:00:00 su - jboss -c ( java -Xms3072m -Xmx3072m -XX:MaxPermSize=512m -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dwicket.configuration=deployment -Djava.awt.headless=true -Dsun.lang.ClassLoader.allowArraySyntax=true -Djava.net.preferIPv4Stack=true -server -DtransactionType=global -Dbankware.base.path=/opt/jboss//server/sitec-salus-tqs/deploy/salus-conf.jar -Xdebug -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8481 -classpath /opt/jboss//bin/run.jar:/lib/tools.jar org.jboss.Main -c sitec-salus-tqs -b 0.0.0.0 > /opt/jboss//server/sitec-salus-tqs/log/jboss-sitec-salus-tqs 2>&1 )
jboss     66549  66547  0 Jun03 ?        00:00:00 -bash -c ( java -Xms3072m -Xmx3072m -XX:MaxPermSize=512m -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dwicket.configuration=deployment -Djava.awt.headless=true -Dsun.lang.ClassLoader.allowArraySyntax=true -Djava.net.preferIPv4Stack=true -server -DtransactionType=global -Dbankware.base.path=/opt/jboss//server/sitec-salus-tqs/deploy/salus-conf.jar -Xdebug -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8481 -classpath /opt/jboss//bin/run.jar:/lib/tools.jar org.jboss.Main -c sitec-salus-tqs -b 0.0.0.0 > /opt/jboss//server/sitec-salus-tqs/log/jboss-sitec-salus-tqs 2>&1 )
jboss     66991  66549  1 Jun03 ?        1-09:17:47 java -Xms3072m -Xmx3072m -XX:MaxPermSize=512m -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dwicket.configuration=deployment -Djava.awt.headless=true -Dsun.lang.ClassLoader.allowArraySyntax=true -Djava.net.preferIPv4Stack=true -server -DtransactionType=global -Dbankware.base.path=/opt/jboss//server/sitec-salus-tqs/deploy/salus-conf.jar -Xdebug -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8481 -classpath /opt/jboss//bin/run.jar:/lib/tools.jar org.jboss.Main -c sitec-salus-tqs -b 0.0.0.0
root      69968      1  0 Jun22 ?        00:00:00 su - jboss -c ( java -Xms4g -Xmx4g -XX:MaxPermSize=512m -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dwicket.configuration=deployment -Djava.awt.headless=true -Dsun.lang.ClassLoader.allowArraySyntax=true -Djava.net.preferIPv4Stack=true -server -classpath /opt/jboss/bin/run.jar:/lib/tools.jar org.jboss.Main -c sitec-argus -b 0.0.0.0 > /opt/jboss/server/sitec-argus/log/jboss-sitec-argus 2>&1 )
jboss     69971  69968  0 Jun22 ?        00:00:00 -bash -c ( java -Xms4g -Xmx4g -XX:MaxPermSize=512m -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dwicket.configuration=deployment -Djava.awt.headless=true -Dsun.lang.ClassLoader.allowArraySyntax=true -Djava.net.preferIPv4Stack=true -server -classpath /opt/jboss/bin/run.jar:/lib/tools.jar org.jboss.Main -c sitec-argus -b 0.0.0.0 > /opt/jboss/server/sitec-argus/log/jboss-sitec-argus 2>&1 )
jboss     70407  69971 27 Jun22 ?        23-05:22:43 java -Xms4g -Xmx4g -XX:MaxPermSize=512m -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dwicket.configuration=deployment -Djava.awt.headless=true -Dsun.lang.ClassLoader.allowArraySyntax=true -Djava.net.preferIPv4Stack=true -server -classpath /opt/jboss/bin/run.jar:/lib/tools.jar org.jboss.Main -c sitec-argus -b 0.0.0.0
root      70465      1  0 Jun22 ?        00:00:00 su - jboss -c ( java -Xms3072m -Xmx3072m -XX:MaxPermSize=512m -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dwicket.configuration=deployment -Djava.awt.headless=true -Dsun.lang.ClassLoader.allowArraySyntax=true -Djava.net.preferIPv4Stack=true -server -DtransactionType=global -Dbankware.base.path=/opt/jboss//server/sitec-salus/deploy/salus-conf.jar -classpath /opt/jboss//bin/run.jar:/lib/tools.jar org.jboss.Main -c sitec-salus -b 0.0.0.0 > /opt/jboss//server/sitec-salus/log/jboss-sitec-salus 2>&1 )
jboss     70473  70465  0 Jun22 ?        00:00:00 -bash -c ( java -Xms3072m -Xmx3072m -XX:MaxPermSize=512m -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dwicket.configuration=deployment -Djava.awt.headless=true -Dsun.lang.ClassLoader.allowArraySyntax=true -Djava.net.preferIPv4Stack=true -server -DtransactionType=global -Dbankware.base.path=/opt/jboss//server/sitec-salus/deploy/salus-conf.jar -classpath /opt/jboss//bin/run.jar:/lib/tools.jar org.jboss.Main -c sitec-salus -b 0.0.0.0 > /opt/jboss//server/sitec-salus/log/jboss-sitec-salus 2>&1 )
jboss     70907  70473  1 Jun22 ?        1-02:16:52 java -Xms3072m -Xmx3072m -XX:MaxPermSize=512m -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dwicket.configuration=deployment -Djava.awt.headless=true -Dsun.lang.ClassLoader.allowArraySyntax=true -Djava.net.preferIPv4Stack=true -server -DtransactionType=global -Dbankware.base.path=/opt/jboss//server/sitec-salus/deploy/salus-conf.jar -classpath /opt/jboss//bin/run.jar:/lib/tools.jar org.jboss.Main -c sitec-salus -b 0.0.0.0
root      89813      1  0 09:56 pts/4    00:00:00 su - jboss -c ( java -Xms4g -Xmx4g -XX:MaxPermSize=2048m -XX:+UseG1GC -XX:MaxGCPauseMillis=200 -XX:ParallelGCThreads=20 -XX:ConcGCThreads=5 -XX:InitiatingHeapOccupancyPercent=70 -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dwicket.configuration=deployment -Djava.awt.headless=true -Dsun.lang.ClassLoader.allowArraySyntax=true -Djava.net.preferIPv4Stack=true -server -Xdebug -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8881 -classpath /opt/jboss/bin/run.jar:/lib/tools.jar org.jboss.Main -c sitec-tellus -b 0.0.0.0 > /opt/jboss/server/sitec-tellus/log/jboss-sitec-tellus 2>&1 )
jboss     89816  89813  0 09:56 ?        00:00:00 -bash -c ( java -Xms4g -Xmx4g -XX:MaxPermSize=2048m -XX:+UseG1GC -XX:MaxGCPauseMillis=200 -XX:ParallelGCThreads=20 -XX:ConcGCThreads=5 -XX:InitiatingHeapOccupancyPercent=70 -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dwicket.configuration=deployment -Djava.awt.headless=true -Dsun.lang.ClassLoader.allowArraySyntax=true -Djava.net.preferIPv4Stack=true -server -Xdebug -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8881 -classpath /opt/jboss/bin/run.jar:/lib/tools.jar org.jboss.Main -c sitec-tellus -b 0.0.0.0 > /opt/jboss/server/sitec-tellus/log/jboss-sitec-tellus 2>&1 )
jboss     90244  89816 12 09:56 ?        00:06:31 java -Xms4g -Xmx4g -XX:MaxPermSize=2048m -XX:+UseG1GC -XX:MaxGCPauseMillis=200 -XX:ParallelGCThreads=20 -XX:ConcGCThreads=5 -XX:InitiatingHeapOccupancyPercent=70 -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dwicket.configuration=deployment -Djava.awt.headless=true -Dsun.lang.ClassLoader.allowArraySyntax=true -Djava.net.preferIPv4Stack=true -server -Xdebug -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8881 -classpath /opt/jboss/bin/run.jar:/lib/tools.jar org.jboss.Main -c sitec-tellus -b 0.0.0.0
f692921   91262  85140  0 10:22 pts/4    00:00:00 vim /opt/jboss/server/sitec-tellus/log/server.log
p585600   92819  92788  0 10:50 pts/7    00:00:00 grep jboss
root      94808      1  0 Sep08 ?        00:00:00 su - jboss -c ( java -Xms4g -Xmx4g -XX:MaxPermSize=512m -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dwicket.configuration=deployment -Djava.awt.headless=true -Dsun.lang.ClassLoader.allowArraySyntax=true -Djava.net.preferIPv4Stack=true -server -classpath /opt/jboss/bin/run.jar:/lib/tools.jar org.jboss.Main -c sitec-argus-tqs -b 0.0.0.0 > /opt/jboss/server/sitec-argus-tqs/log/jboss-sitec-argus-tqs 2>&1 )
jboss     94811  94808  0 Sep08 ?        00:00:00 -bash -c ( java -Xms4g -Xmx4g -XX:MaxPermSize=512m -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dwicket.configuration=deployment -Djava.awt.headless=true -Dsun.lang.ClassLoader.allowArraySyntax=true -Djava.net.preferIPv4Stack=true -server -classpath /opt/jboss/bin/run.jar:/lib/tools.jar org.jboss.Main -c sitec-argus-tqs -b 0.0.0.0 > /opt/jboss/server/sitec-argus-tqs/log/jboss-sitec-argus-tqs 2>&1 )
jboss     95242  94811  1 Sep08 ?        03:15:34 java -Xms4g -Xmx4g -XX:MaxPermSize=512m -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Dwicket.configuration=deployment -Djava.awt.headless=true -Dsun.lang.ClassLoader.allowArraySyntax=true -Djava.net.preferIPv4Stack=true -server -classpath /opt/jboss/bin/run.jar:/lib/tools.jar org.jboss.Main -c sitec-argus-tqs -b 0.0.0.0
-sh-4.1$
