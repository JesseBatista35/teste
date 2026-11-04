
[sudo] password for p585600:
14:25:29,076 SEVERE [SifbnRestServices] (default task-27) erro: java.lang.NullPointerException
        at io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52) [undertow-servlet-2.2.37.SP2-redhat-00001.jar:2.2.37.SP2-redhat-00001]


[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$ sudo tail -f /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-access.log

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
10.116.3.20 - - [04/Nov/2026:14:19:58 -0300] "GET /fec-web/servicos/contrato/carta/consulta.html HTTP/1.1" 304 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 304 0 155 3149
10.116.3.20 - - [04/Nov/2026:14:19:58 -0300] "GET /fec-web/servicos/contrato/carta/consulta.js?_=1793812505220 HTTP/1.1" 200 23631 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/javascript 200 23631 23905 2785
10.116.3.20 - - [04/Nov/2026:14:20:12 -0300] "POST /fec-web/emprest/contrato/solicitaListaContratos HTTP/1.1" 200 82 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/json 200 82 361 93536
10.116.3.20 - - [04/Nov/2026:14:20:12 -0300] "POST /fec-web/emprest/contrato/recebeListaContratos HTTP/1.1" 200 2823 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/json 200 2823 3104 107158
10.116.3.20 - - [04/Nov/2026:14:20:13 -0300] "POST /fec-web/emprest/contrato/solicitaDadosEspecificosContrato HTTP/1.1" 200 60 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/json 200 60 339 35844
10.116.3.20 - - [04/Nov/2026:14:20:13 -0300] "GET /fec-web/emprest/contrato/recebeDadosEspecificosContratoCarta/ID:c3e2d840c2d9c4f74040404040404040e3886e04077a3441 HTTP/1.1" 200 11384 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/json 200 11384 11680 131074
10.116.3.20 - - [04/Nov/2026:14:20:24 -0300] "POST /fec-web/emprest/contrato/solicitaListaContratos HTTP/1.1" 200 82 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/json 200 82 361 29586
10.116.3.20 - - [04/Nov/2026:14:20:24 -0300] "POST /fec-web/emprest/contrato/recebeListaContratos HTTP/1.1" 200 2816 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/json 200 2816 3097 429645
10.116.3.20 - - [04/Nov/2026:14:20:25 -0300] "POST /fec-web/emprest/contrato/solicitaDadosEspecificosContrato HTTP/1.1" 200 60 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/json 200 60 339 32858
10.116.3.20 - - [04/Nov/2026:14:20:25 -0300] "GET /fec-web/emprest/contrato/recebeDadosEspecificosContratoCarta/ID:c3e2d840c2d9c4f74040404040404040e3886e0ff3119e01 HTTP/1.1" 200 10679 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/json 200 10679 10975 118690
10.116.3.22 - - [04/Nov/2026:14:25:28 -0300] "POST /fec-web/emprest/contrato/solicitaListaContratos HTTP/1.1" 200 129 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/json 200 129 410 99678
10.116.3.22 - - [04/Nov/2026:14:25:29 -0300] "POST /fec-web/emprest/contrato/recebeListaContratos HTTP/1.1" 200 6754 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/json 200 6754 7035 69092
10.116.3.22 - - [04/Nov/2026:14:25:29 -0300] "POST /fec-web/emprest/contrato/solicitaDadosEspecificosContrato HTTP/1.1" 200 60 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/json 200 60 339 32544
10.116.3.17 - - [04/Nov/2026:14:25:29 -0300] "POST /fec-web/emprest/contrato/solicitaDadosEspecificosContrato HTTP/1.1" 200 60 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/json 200 60 340 61279
10.116.3.30 - - [04/Nov/2026:14:25:29 -0300] "POST /fec-web/emprest/contrato/solicitaDadosEspecificosContrato HTTP/1.1" 200 60 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/json 200 60 340 247274
10.116.3.17 - - [04/Nov/2026:14:25:29 -0300] "GET /fec-web/emprest/contrato/recebeDadosEspecificosContratoCarta/ID:c3e2d840c2d9c4f74040404040404040e3886f3199930bc0 HTTP/1.1" 200 22871 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/json 200 22871 23207 223072
10.116.3.22 - - [04/Nov/2026:14:25:29 -0300] "GET /fec-web/emprest/contrato/recebeDadosEspecificosContratoCarta/ID:c3e2d840c2d9c4f74040404040404040e3886f318f2b2980 HTTP/1.1" 200 7074 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/json 200 7074 7369 343914
10.116.3.22 - - [04/Nov/2026:14:25:29 -0300] "GET /fec-web/emprest/contrato/recebeDadosEspecificosContratoCarta/ID:c3e2d840c2d9c4f74040404040404040e3886f31c7c7b181 HTTP/1.1" 200 7699 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/json 200 7699 7994 127311

