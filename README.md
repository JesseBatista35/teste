Read the attached text
O SIEMP abriu: https://siemp.des.caixa/siemp/ carregou a tela de login da versão 14.37.0.6, e o cadeado agora aparece normal. Ou seja, DNS, VIP, certificado e esteira estão funcionando. O Denilson só testou com o caminho errado (/siemp_java).

Mensagem para o Denilson / sala
Bom dia, Denilson! O DNS siemp.des.caixa foi criado hoje (WO0000082275737) e já está funcionando. O 404 apareceu porque o teste foi em /siemp_java, mas o contexto da aplicação é /siemp.

O link correto é https://siemp.des.caixa/siemp/. Já abre a tela de login do SIEMP (versão 14.37.0.6). Pode seguir com a validação?

SIRUR: o banco ainda falha (OracleSirurDS)
O teste deu A conexão não é válida, o mesmo sintoma do SIBAN ontem. Antes do deploy da 3.55.51.01, vamos achar a credencial certa.

1. Na 473: o erro exato do Oracle

sudo grep -n "ORA-" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -5
2. Na 471: existe outro datasource do SIRUR no 7.4 que funciona (tipo _ORIGINAL)?

grep -n -iE '<(xa-)?datasource .*sirur' /opt/jboss/jboss-eap/dc/configuration/domain.xml
3. No 6.4 (10.116.88.20): URL e usuário do OracleSirurDS por profile (sem senha)

sudo awk '/<profile name=/{p=$0} /jndi-name="java:\/jdbc\/OracleSirurDS"/{d=1} d && /connection-url|user-name/ {print NR": "p" | "$0} d && /<\/datasource>/{d=0}' /opt/jboss/jboss-eap/dc/configuration/domain.xml
Me manda as três saídas:

Se no passo 2 aparecer um datasource alternativo, a gente testa e copia a credencial, como fizemos no SIBAN.
Senão, comparo usuário e URL com o 6.4 e te passo o ajuste.
O SICDT 3.24.3.004 continua pendente. Me diga se o download na 471 funcionou ou se vamos pela console.

Como o Claude está se saindo nesta sessão?





[root@cbrdeapllx471 p585600]# grep -n -iE '<(xa-)?datasource .*sirur' /opt/jboss/jboss-eap/dc/configuration/domain.xml
943:                    <datasource jta="false" jndi-name="java:/jdbc/OracleSirurDS" pool-name="jdbc/OracleSirurDS" enabled="true" use-ccm="false">
2389:                    <datasource jta="true" jndi-name="java:/jdbc/OracleSirurDS" pool-name="jdbc/OracleSirurDS" enabled="true" use-ccm="true">
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#



[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo grep -n "ORA-" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -5

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
5351:Caused by: java.sql.SQLException: ORA-01017: invalid username/password; logon denied
[p585600@cbrdeapllx473 ~]$



-sh-4.1$
-sh-4.1$ sudo awk '/<profile name=/{p=$0} /jndi-name="java:\/jdbc\/OracleSirurDS"/{d=1} d && /connection-url|user-name/ {print NR": "p" | "$0} d && /<\/datasource>/{d=0}' /opt/jboss/jboss-eap/dc/configuration/domain.xml
[sudo] password for p585600:
19311:         <profile name="full-ha-sifec-intranet"> |                         <connection-url>jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV</connection-url>
19324:         <profile name="full-ha-sifec-intranet"> |                             <user-name>SRURBD01</user-name>
21046:         <profile name="full-ha-sifec-intranet2"> |                         <connection-url>jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV</connection-url>
21059:         <profile name="full-ha-sifec-intranet2"> |                             <user-name>SRURBD01</user-name>
22692:         <profile name="full-ha-sifec-intranet3"> |                         <connection-url>jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV</connection-url>
22705:         <profile name="full-ha-sifec-intranet3"> |                             <user-name>SRURBD01</user-name>
24342:         <profile name="full-ha-sifec-intranet4"> |                         <connection-url>jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV</connection-url>
24355:         <profile name="full-ha-sifec-intranet4"> |                             <user-name>SRURBD01</user-name>
25986:         <profile name="full-ha-sifec-intranet5"> |                         <connection-url>jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV</connection-url>
25999:         <profile name="full-ha-sifec-intranet5"> |                             <user-name>SRURBD01</user-name>
27605:         <profile name="full-ha-sifec-batch"> |                         <connection-url>jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV</connection-url>
27616:         <profile name="full-ha-sifec-batch"> |                             <user-name>SRURBD01</user-name>
29011:         <profile name="full-ha-sifec-internet"> |                         <connection-url>jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV</connection-url>
29024:         <profile name="full-ha-sifec-internet"> |                             <user-name>SRURBD01</user-name>
51889:         <profile name="full-ha-sifec-api"> |                         <connection-url>jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV</connection-url>
51900:         <profile name="full-ha-sifec-api"> |                             <user-name>SRURBD01</user-name>
-sh-4.1$




cade a emnssegem par aop inocencio..

e a menssagem par ao michal nao tem como agente testat ele tem que mandar o pocte com a correção
