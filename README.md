
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ grep -H "Registered web context: '/fec-web'" \
  /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log \
>
grep: /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log: Permission denied
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ ssh 10.116.81.74
ssh: connect to host 10.116.81.74 port 22: Connection refused
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ ssh 10.116.81.113
ssh: connect to host 10.116.81.113 port 22: Connection refused
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ exit
logout
Connection to 10.116.97.79 closed.
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$ ssh 10.116.81.113
ssh: connect to host 10.116.81.113 port 22: Connection refused
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$



C:\Users\p585600>nslookup migracaosifec.des.caixa
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10

Nome:    migracaosifec.des.caixa
Address:  10.116.81.113


C:\Users\p585600>


tem essa mensagem do muirllo

Murilo Silva Andrade Souza
15/10/2026 12:36
opa boa tarde a Todos, aqui vai o cluster criado pelo ADDR do FEC,EMP e PEN, que se encontra configurado e acesso a console pela url https://eap74-nprd.des.caixa:9443 (usuário:admin, senha: desenv01!):
 
Domain Controler
	CBRDEAPLLX471	10.116.97.59
Host Controler 1	CBRDEAPLLX472	10.116.97.78
Host Controler 2	CBRDEAPLLX473	10.116.97.79
Host Controler 3	CBRDEAPLLX409	10.116.97.41
Host Controler 4	CBRDEAPLLX465	10.116.97.52
APACHE FEC,PEN,EMP	CBRDEAPLLX476	
10.116.78.12
 

