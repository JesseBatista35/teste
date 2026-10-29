# Para onde o nome aponta hoje
nslookup sigsj-intranet.esteiras.des.caixa

# A aplicação responde pelo Apache da 955 com o nome certo?
curl -s -o /dev/null -w "%{http_code}\n" -H "Host: sigsj-intranet.esteiras.des.caixa" http://10.116.194.179/sigsj_intranet/




C:\Users\p585600>nslookup sigsj-intranet.esteiras.des.caixa
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10

Nome:    sigsj-intranet.esteiras.des.caixa
Address:  10.116.180.22





[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ curl -s -o /dev/null -w "%{http_code}\n" -H "Host: sigsj-intranet.esteiras.des.caixa" http://10.116.194.179/sigsj_intranet/
200
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
