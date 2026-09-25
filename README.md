Microsoft Windows [versão 10.0.26200.9106]
(c) Microsoft Corporation. Todos os direitos reservados.

C:\Users\p585600>nslookup 10.123.6.86
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10

*** dfaddssd001.corp.caixa.gov.br não encontrou 10.123.6.86: Non-existent domain

C:\Users\p585600>nslookup 10.123.6.10
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10

Nome:    antigosilic.caixa
Address:  10.123.6.10


C:\Users\p585600>nslookup cctdcapllx0632
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10

*** dfaddssd001.corp.caixa.gov.br não encontrou cctdcapllx0632: Non-existent domain

C:\Users\p585600>nslookup cctdcapllx0632.df.caixa
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10

Nome:    cctdcapllx0632.df.caixa
Address:  10.123.40.149


C:\Users\p585600>nslookup sicia.caixa
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10

Nome:    ctc.frontend.proinfo.caixa
Address:  10.123.6.10
Aliases:  sicia.caixa


C:\Users\p585600>nslookup piloto.sicia.caixa
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10

Nome:    piloto.sicia.caixa
Address:  10.123.6.86


C:\Users\p585600>
C:\Users\p585600>curl -k -s -o /dev/null -w '%{http_code}\n' https://10.123.40.149/login
'000
'
C:\Users\p585600>curl -k -s -o /dev/null -w '%{http_code}\n' https://10.123.40.149:8443/login
'000
'
C:\Users\p585600>
C:\Users\p585600>
