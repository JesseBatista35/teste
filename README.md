 
    <socket-binding-group name="standard-sockets" default-interface="public" port-offset="${jboss.socket.binding.port-offset:0}">
        <socket-binding name="ajp" port="${jboss.ajp.port:8009}"/>
        <socket-binding name="http" port="${jboss.http.port:8080}"/>
        <socket-binding name="https" port="${jboss.https.port:8443}"/>
        <socket-binding name="management-http" interface="management" port="${jboss.management.http.port:9990}"/>
        <socket-binding name="management-https" interface="management" port="${jboss.management.https.port:9993}"/>
        <socket-binding name="txn-recovery-environment" port="4712"/>
        <socket-binding name="txn-status-manager" port="4713"/>
        <outbound-socket-binding name="mail-smtp">
            <remote-destination host="${jboss.mail.server.host:localhost}" port="${jboss.mail.server.port:25}"/>
        </outbound-socket-binding>
 
find /opt/jboss -name "sifec-2.160.0.0-b-20261028.173902-2.ear"
 
find . -name "*.war"

find . -name "*.jar"
 
grep -R "getServerPort" .
 
grep -R "getRequestURL" .
 
grep -R "redirect_uri" .
 
grep -R "openid-connect/auth" .
 
find . | egrep "sso|keycloak|oauth|openid"
 
SSO_INTRANET_RESOURCE_NAME

SSO_INTRANET_AUTH_URL

SSO_INTRANET_SECRET
 
confidential-port
 
https://eap74-nprd.des.caixa:9443/
 
sifec-2.160.0.0-b-20261028.173902-2.ear
 
http://binario.caixa:8081/repository/snapshots/br/gov/caixa/fec/sifec/2.160.0.0-b-SNAPSHOT/sifec-2.160.0.0-b-20261029.210221-4.ear
 
Luiz Carlos dos Santos Neto adicionou Juliana de Carvalho Fernandes ao chat.

 
Thiago Pereira dos Santos Marques, tem um minuto para nos dar um apoio aqui?
 
Estou colocando o fone. 
 
Chama novamente, por favor.
 
C:\Users\p515324>nslookup migracaosifec.des.caixa

Servidor:  dfaddssd001.corp.caixa.gov.br

Address:  10.222.149.10
 
Nome:    migracaosifec.des.caixa

Address:  10.116.81.113
 
 
C:\Users\p515324>nslookup sifec1.des.caixa

Servidor:  dfaddssd001.corp.caixa.gov.br

Address:  10.222.149.10
 
Nome:    sifec1.des.caixa

Address:  10.116.81.66
 
Thiago Pereira dos Santos Marques adicionou Magnus dos Santos Silva ao chat.

 
C:\Users\p515324>nslookup migracaosifec.des.caixa
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10
 
Nome:    migracaosifec.des.caixa
Address:  10.116.81.113
 
 
C:\Users\p515324>nslookup sifec1.des.caixa
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10
 
Nome:    sifec1.des.caixa
Address:  10.116.81.66
 
Thiago Pereira dos Santos Marques adicionou Magnus dos Santos Silva ao chat.
 
 
https://

+ request.getServerName()

+ ":"

+ request.getServerPort()

+ request.getContextPath()
 
Magnus dos Santos Silva saiu do chat.

 
sexta-feira 19:48 Reunião encerrada 5h 49min 22s Migração JBoss 7.4 - SIFEC, SICCR, SIEMP, SIPENsexta-feira, 30 de outubro de 2026 13:59 - 19:48Exibir recapitulação4ConteúdoTranscriçãoSISTEMAS JBOSS CEDESBR 1.xlsxADDR FEC,CCR,EMP,PEN -  Migração JBoss 7.4 - 2210.pdf+1

 
https://migracaosifec.des.caixa/fec-web/
 
 
Paulo Henrique Barros Santos, Luiz Carlos dos Santos Neto, Flavio Luiz D Oliveira e Silva, Antonio Coelho Guimaraes Filho, Edson Prokot, Pablo Leite Costa, Relder Maia da Silva Batista, Flavio de Almeida Gagliardi, Jose Wilson Batista Rodrigues, Aline Holanda dos Santos Goncalves,Inocencio Teixeira de Oliveira Rodrigo Abreu Costa
 
SIFEC no AR, com redirect correto para o SSO 
 
Valeu pessoal, até a volta das férias!
 
Bom dia Todos.
 
 
O Link de acesso ao PJ não esta chamando a aplicação.
 
Vinicius Ferreira Veras
http://binario.caixa:8081/repository/snapshots/br/gov/caixa/fec/sifec/2.160.0.0-b-SNAPSHOT/sifec-2.160.0.0-b-20261029.210221-4.ear
Bom dia. Esse é o último binário SIFEC?
 
Patricia Vourakis Barbosa Braga adicionou Jesse Mouta Pereira Batista ao chat e compartilhou todo o histórico de chats.

 
Importante!
Jesse Mouta Pereira Batista bom dia , por favor verificar. Obrigada
Pablo Leite Costa
Bom dia Todos.   📷   O Link de acesso ao PJ não esta chamando a aplicação.
 
Patricia do Prado Albuquerque, Bom dia, vou verificar. 
 
