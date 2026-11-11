1. Na 471: nome dos datasources (corrigi o awk; no domain.xml o elemento é <datasource, sem hífen)
for n in 969 1000 1031 1047 1060 1094; do awk -v n=$n 'NR<=n && /<(xa-)?datasource / {d=$0} NR==n {print n": "d; exit}' /opt/jboss/jboss-eap/dc/configuration/domain.xml; done
2. No 6.4 (10.116.88.20): para onde esses bancos apontam lá
sudo grep -n -iE '10\.116\.92\.132:4407|10\.192\.230\.120|FBNEM1|FBNDEM' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -i 'connection-url'
3. Na 472: o outro HC do sifec-intranet tem o mesmo bloqueio?
for d in 10.116.92.132:4407 10.192.230.120:4101; do h=${d%:*}; p=${d#*:}; if timeout 5 bash -c "</dev/tcp/$h/$p" 2>/dev/null; then echo "OK      $d"; else echo "FALHOU  $d"; fi; done

Com isso fechamos o caminho:

Se o 6.4 usa outro host/porta para esses bancos: a gente corrige a connection-url no 7.4, sem precisar de firewall.
Se o 6.4 usa o mesmo destino: pedimos regra de firewall de 10.116.97.79 (473) e 10.116.97.78 (472) para os destinos que falharam. Eu monto o texto da solicitação.




[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]# for n in 969 1000 1031 1047 1060 1094; do awk -v n=$n 'NR<=n && /<(xa-)?datasource / {d=$0} NR==n {print n": "d; exit}' /opt/jboss/jboss-eap/dc/configuration/domain.xml; done
969:                     <datasource jta="false" jndi-name="java:/jdbc/SybaseSifbnDS_ORIGINAL" pool-name="jdbc/SybaseSifbnDS_ORIGINAL" enabled="true" use-ccm="false">
1000:                     <datasource jta="false" jndi-name="java:/jdbc/SybaseSifbnDS_ori" pool-name="jdbc/SybaseSifbnDS_ori" enabled="true" use-ccm="false">
1031:                     <datasource jndi-name="java:/jdbc/SybaseSifbnDS" pool-name="jdbc/SybaseSifbnDS" enabled="true" use-java-context="true">
1047:                     <datasource jndi-name="java:/jdbc/SybaseSibanDS_ORIGINAL" pool-name="jdbc/SybaseSibanDS_ORIGINAL" enabled="true" use-java-context="true">
1060:                     <datasource jndi-name="java:/jdbc/SybaseSibanDS" pool-name="jdbc/SybaseSibanDS" enabled="true" use-java-context="true">
1094:                     <datasource jta="true" jndi-name="java:/jdbc/SybaseSifbnDS02" pool-name="jdbc/SybaseSifbnDS02" enabled="true" use-java-context="true">
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#




-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo grep -n -iE '10\.116\.92\.132:4407|10\.192\.230\.120|FBNEM1|FBNDEM' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -i 'connection-url'
[sudo] password for p585600:
19253:                        <connection-url>jdbc:sybase:Tds:10.116.92.132:4407/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
19282:                        <connection-url>jdbc:sybase:Tds:10.116.92.132:4102/FBNDEM?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
20988:                        <connection-url>jdbc:sybase:Tds:10.116.92.132:4407/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
21017:                        <connection-url>jdbc:sybase:Tds:10.116.92.132:4102/FBNDEM?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
22523:                        <connection-url>jdbc:sybase:Tds:10.116.92.132:4102/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
22661:                        <connection-url>jdbc:sybase:Tds:10.116.92.132:4407/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
24280:                        <connection-url>jdbc:sybase:Tds:10.116.92.132:4102/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
24311:                        <connection-url>jdbc:sybase:Tds:10.116.92.132:4407/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
25928:                        <connection-url>jdbc:sybase:Tds:10.116.92.132:4407/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
25957:                        <connection-url>jdbc:sybase:Tds:10.116.92.132:4102/FBNDEM?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
27576:                        <connection-url>jdbc:sybase:Tds:10.116.92.132:4407/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
28982:                        <connection-url>jdbc:sybase:Tds:10.116.92.132:4407/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
51831:                        <connection-url>jdbc:sybase:Tds:10.116.92.132:4407/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
51860:                        <connection-url>jdbc:sybase:Tds:10.116.92.132:4102/FBNDEM?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$




[p585600@cbrdeapllx472 ~]$
[p585600@cbrdeapllx472 ~]$
[p585600@cbrdeapllx472 ~]$ for d in 10.116.92.132:4407 10.192.230.120:4101; do h=${d%:*}; p=${d#*:}; if timeout 5 bash -c "</dev/tcp/$h/$p" 2>/dev/null; then echo "OK      $d"; else echo "FALHOU  $d"; fi; done
FALHOU  10.116.92.132:4407
FALHOU  10.192.230.120:4101
[p585600@cbrdeapllx472 ~]$

