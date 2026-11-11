Antes de pedir firewall, preciso ver o que o sifec-intranet do 6.4 usa e se o 6.4 alcança a 4407.

1. No 6.4 (10.116.88.20): URL dos datasources SIBAN/SIFBN em cada profile
sudo awk '/<profile name=/{p=$0} /jndi-name="java:\/jdbc\/Sybase(Siban|Sifbn)DS"/{d=$0} /connection-url/ && d!="" {print NR": "p" | "d" | "$0; d=""}' /opt/jboss/jboss-eap/dc/configuration/domain.xml

E qual profile o sifec-intranet usa no 6.4:

sudo sed -n '57701,57703p' /opt/jboss/jboss-eap/dc/configuration/domain.xml
2. No 6.4: ele alcança a 4407?
timeout 5 bash -c "</dev/tcp/10.116.92.132/4407" && echo OK || echo FALHOU
O que vem depois
Se o profile do sifec-intranet no 6.4 usa 4102/FBNEM1: troco a URL no 7.4 para 4102. É ajuste nosso e não precisa de firewall.
Se usa 4407 e o 6.4 alcança: pedimos regra de firewall de 10.116.97.78 (472) e 10.116.97.79 (473) para 10.116.92.132:4407. Eu monto o texto.




-sh-4.1$ sudo awk '/<profile name=/{p=$0} /jndi-name="java:\/jdbc\/Sybase(Siban|Sifbn)DS"/{d=$0} /connection-url/ && d!="" {print NR": "p" | "d" | "$0; d=""}' /opt/jboss/jboss-eap/dc/configuration/domain.xml
19236:         <profile name="full-ha-sifec-intranet"> |                     <datasource jndi-name="java:/jdbc/SybaseSibanDS" pool-name="jdbc/SybaseSibanDS" enabled="true" use-java-context="true"> |                         <connection-url>jdbc:sybase:Tds:10.116.92.132:4101/EMDB04?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
19253:         <profile name="full-ha-sifec-intranet"> |                     <datasource jta="false" jndi-name="java:/jdbc/SybaseSifbnDS" pool-name="SybaseSifbnDS" enabled="true" use-ccm="false"> |                         <connection-url>jdbc:sybase:Tds:10.116.92.132:4407/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
20972:         <profile name="full-ha-sifec-intranet2"> |                     <datasource jta="false" jndi-name="java:/jdbc/SybaseSibanDS" pool-name="jdbc/SybaseSibanDS" enabled="true" use-ccm="false"> |                         <connection-url>jdbc:sybase:Tds:10.116.92.132:4101/EMDB04?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
20988:         <profile name="full-ha-sifec-intranet2"> |                     <datasource jta="false" jndi-name="java:/jdbc/SybaseSifbnDS" pool-name="SybaseSifbnDS" enabled="true" use-ccm="false"> |                         <connection-url>jdbc:sybase:Tds:10.116.92.132:4407/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
22645:         <profile name="full-ha-sifec-intranet3"> |                     <datasource jta="false" jndi-name="java:/jdbc/SybaseSibanDS" pool-name="jdbc/SybaseSibanDS" enabled="true" use-ccm="false"> |                         <connection-url>jdbc:sybase:Tds:10.116.92.132:4101/EMDB04?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
22661:         <profile name="full-ha-sifec-intranet3"> |                     <datasource jta="false" jndi-name="java:/jdbc/SybaseSifbnDS" pool-name="SybaseSifbnDS" enabled="true" use-ccm="false"> |                         <connection-url>jdbc:sybase:Tds:10.116.92.132:4407/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
24262:         <profile name="full-ha-sifec-intranet4"> |                     <datasource jta="false" jndi-name="java:/jdbc/SybaseSibanDS" pool-name="jdbc/SybaseSibanDS" enabled="true" use-ccm="false"> |                         <connection-url>jdbc:sybase:Tds:10.116.92.132:4101/EMDB04?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
24311:         <profile name="full-ha-sifec-intranet4"> |                     <datasource jta="false" jndi-name="java:/jdbc/SybaseSifbnDS" pool-name="jdbc/SybaseSifbnDS" enabled="true" use-ccm="false"> |                         <connection-url>jdbc:sybase:Tds:10.116.92.132:4407/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
25912:         <profile name="full-ha-sifec-intranet5"> |                     <datasource jta="false" jndi-name="java:/jdbc/SybaseSibanDS" pool-name="jdbc/SybaseSibanDS" enabled="true" use-ccm="false"> |                         <connection-url>jdbc:sybase:Tds:10.116.92.132:4101/EMDB04?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
25928:         <profile name="full-ha-sifec-intranet5"> |                     <datasource jta="false" jndi-name="java:/jdbc/SybaseSifbnDS" pool-name="SybaseSifbnDS" enabled="true" use-ccm="false"> |                         <connection-url>jdbc:sybase:Tds:10.116.92.132:4407/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
27531:         <profile name="full-ha-sifec-batch"> |                     <datasource jta="false" jndi-name="java:/jdbc/SybaseSibanDS" pool-name="jdbc/SybaseSibanDS" enabled="true" use-ccm="false"> |                         <connection-url>jdbc:sybase:Tds:10.116.92.132:4101/EMDB04?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
27576:         <profile name="full-ha-sifec-batch"> |                     <datasource jta="false" jndi-name="java:/jdbc/SybaseSifbnDS" pool-name="SybaseSifbnDS" enabled="true" use-ccm="false"> |                         <connection-url>jdbc:sybase:Tds:10.116.92.132:4407/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
28937:         <profile name="full-ha-sifec-internet"> |                     <datasource jta="false" jndi-name="java:/jdbc/SybaseSibanDS" pool-name="jdbc/SybaseSibanDS" enabled="true" use-ccm="false"> |                         <connection-url>jdbc:sybase:Tds:10.116.92.132:4101/EMDB04?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
28982:         <profile name="full-ha-sifec-internet"> |                     <datasource jta="false" jndi-name="java:/jdbc/SybaseSifbnDS" pool-name="SybaseSifbnDS" enabled="true" use-ccm="false"> |                         <connection-url>jdbc:sybase:Tds:10.116.92.132:4407/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
51786:         <profile name="full-ha-sifec-api"> |                     <datasource jta="false" jndi-name="java:/jdbc/SybaseSibanDS" pool-name="jdbc/SybaseSibanDS" enabled="true" use-ccm="false"> |                         <connection-url>jdbc:sybase:Tds:10.116.92.132:4101/EMDB04?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
51831:         <profile name="full-ha-sifec-api"> |                     <datasource jta="false" jndi-name="java:/jdbc/SybaseSifbnDS" pool-name="SybaseSifbnDS" enabled="true" use-ccm="false"> |                         <connection-url>jdbc:sybase:Tds:10.116.92.132:4407/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false</connection-url>
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$


-sh-4.1$
-sh-4.1$ timeout 5 bash -c "</dev/tcp/10.116.92.132/4407" && echo OK || echo FALHOU
FALHOU
-sh-4.1$

