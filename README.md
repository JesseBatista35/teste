Jesse Mouta Pereira Batista
Todos, Boa tarde,   identificamos a causa raiz do problema no SIGPF-internet.   O Apache dos servidores de apresentação (caddeapllx135 e caddeapllx136) está configurado para rotear as requisições do…
VMs:
 
DES: caddeapllx832.agil.nprd.caixa.gov.br
TQS: caddeapllx575.agil.nprd.caixa.gov.br
HMP: caddeapllx1104.agil.nprd.caixa.gov.br e caddeapllx1161.agil.nprd.caixa.gov.br
 
Todos, Bom dia! assim que subir as configurações informa aqui. 
 
Quem irá subir as configurações?
 
Diego do Nascimento
Quem irá subir as configurações?
Eu vou subir as configurações e validar, preciso de uma nova  Req aberta para, pode colocar na descrição configuração do balancerMember.
 
 
 
Jesse Mouta Pereira Batista
Eu vou subir as configurações e validar, preciso de uma nova  Req aberta para, pode colocar na descrição configuração do balancerMember.
Precisa que a gente abra? Ou vão tratar internamente?
 
sim pode abrir, para registro do atendimento. 
 
Todos
 
Irei abrir este atendimento.
 
Mas preciso entender quem solicitou a mudança e o motivo. Tudo funcionava corretamente e parou de funcionar.
 
 
Temos esta configuração ai, e o front deveria estar redirecionando as chamadas para o bacj
 
back*



 configuraçoão:  sigpf-nginx.conf

location /sigpf_internet/ {
    client_max_body_size 10M;
    proxy_set_header X-Forwarded-Host $host;
    proxy_set_header X-Forwarded-Proto $scheme;
    proxy_set_header X-Forwarded-Port $server_port;
    proxy_set_header X-Forwarded-Server $host;
    proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
    proxy_set_header X-Real-IP $remote_addr;
    proxy_pass __SIGPF_URL_API__;
    proxy_redirect off;
}
 
