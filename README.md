VAMS TER QUE ENTREA EM SALA COM PABLO PARA PERGAR O F12


**
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo grep -n "10:1[5-9]" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE "workflow|wpj|status=|Exception|WARN" | tail -40

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
[p585600@cbrdeapllx473 ~]$ sudo grep -n "10:1[5-9]" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE "workflow|wpj|status=|Exception|WARN" | tail -40
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$




**[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$ sudo grep "workflow-credito-pj" /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-access.log | tail -30

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
10.116.3.25 - - [05/Nov/2026:10:10:39 -0300] "GET /workflow-credito-pj-web/api/motivo-situacoes/verifica-rejeicao-mtr?z=1793884239006 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 1814
10.116.3.28 - - [05/Nov/2026:10:10:39 -0300] "GET /workflow-credito-pj-web/api/novidade/destaque?z=1793884239019 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 1592
10.116.3.28 - - [05/Nov/2026:10:10:39 -0300] "GET /workflow-credito-pj-web/api/quadro-comunicacao/tipos-comunicacao?z=1793884239023 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 247 1674
10.116.3.27 - - [05/Nov/2026:10:10:39 -0300] "GET /workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793884239023 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 1885
10.116.3.28 - - [05/Nov/2026:10:10:39 -0300] "GET /workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793884239024 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 1666
10.116.3.27 - - [05/Nov/2026:10:10:39 -0300] "GET /workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793884239023 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 1557
10.116.3.28 - - [05/Nov/2026:10:10:39 -0300] "GET /workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793884239024 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 1943
10.116.3.28 - - [05/Nov/2026:10:10:39 -0300] "GET /workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793884239024 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 1707
10.116.3.28 - - [05/Nov/2026:10:10:47 -0300] "GET /workflow-credito-pj-web/api/favoritos?paginaAtual=1&itensPorPagina=10&ordenarPor=razaoSocial&ordenarOrdem=ASC&filtroPesquisa=gomes&z=1793884247351 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 2042
10.116.3.27 - - [05/Nov/2026:10:11:35 -0300] "GET /fec-web/emprest/app/login/workflow-credito-pj-web HTTP/1.1" 200 63 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/json 200 63 260 5408
10.116.3.27 - - [05/Nov/2026:10:11:35 -0300] "GET /workflow-credito-pj-web/dashboard.json HTTP/1.1" 200 20664 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/json 200 20664 21014 1751
10.116.3.27 - - [05/Nov/2026:10:11:35 -0300] "GET /workflow-credito-pj-web/ng/runtime.743195ed2393be22126b.js?_=1793884282124 HTTP/1.1" 200 1037 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/javascript 200 1037 1266 1454
10.116.3.27 - - [05/Nov/2026:10:11:35 -0300] "GET /workflow-credito-pj-web/ng/polyfills.e557f33003cd5b65e2f6.js?_=1793884282125 HTTP/1.1" 200 7488 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/javascript 200 7488 7717 1628
10.116.3.27 - - [05/Nov/2026:10:11:36 -0300] "GET /workflow-credito-pj-web/ng/styles.9a6ec27774eb77a4ad4a.js?_=1793884282126 HTTP/1.1" 200 18444 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/javascript 200 18444 18713 1909
10.116.3.27 - - [05/Nov/2026:10:11:36 -0300] "GET /workflow-credito-pj-web/ng/main.b31f313a7a47b2127d52.js?_=1793884282127 HTTP/1.1" 200 1984594 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/javascript 200 1984594 1987503 1757909
10.116.3.27 - - [05/Nov/2026:10:11:39 -0300] "GET /workflow-credito-pj-web/ng/assets/js/bootstrap-collapse.js?_=1793884282128 HTTP/1.1" 200 4732 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/javascript 200 4732 5005 1757
10.116.3.27 - - [05/Nov/2026:10:11:39 -0300] "GET /workflow-credito-pj-web/ng/0.d8efdd927a62d3fff389.js HTTP/1.1" 200 12612 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/javascript 200 12612 12842 1185
10.116.3.27 - - [05/Nov/2026:10:11:39 -0300] "GET /workflow-credito-pj-web/ng/assets/js/ckeditor/ckeditor.js?_=1793884282129 HTTP/1.1" 200 208116 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/javascript 200 208116 208635 2345
10.116.3.27 - - [05/Nov/2026:10:11:39 -0300] "GET /workflow-credito-pj-web/ng/assets/js/gzip-support-helper.js?_=1793884282130 HTTP/1.1" 200 68 "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" application/javascript 200 68 295 1604
10.116.3.27 - - [05/Nov/2026:10:11:40 -0300] "GET /workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793884300105 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 1884
10.116.3.30 - - [05/Nov/2026:10:11:40 -0300] "GET /workflow-credito-pj-web/api/motivo-situacoes/verifica-rejeicao-mtr?z=1793884300129 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 1349
10.116.3.27 - - [05/Nov/2026:10:11:40 -0300] "GET /workflow-credito-pj-web/api/natureza-juridica?z=1793884300128 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 1595
10.116.3.30 - - [05/Nov/2026:10:11:40 -0300] "GET /workflow-credito-pj-web/api/favoritos?paginaAtual=1&itensPorPagina=10&ordenarPor=razaoSocial&ordenarOrdem=ASC&filtroPesquisa=&z=1793884300127 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 1309
10.116.3.30 - - [05/Nov/2026:10:11:40 -0300] "GET /workflow-credito-pj-web/api/novidade/destaque?z=1793884300146 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 1682
10.116.3.27 - - [05/Nov/2026:10:11:40 -0300] "GET /workflow-credito-pj-web/api/quadro-comunicacao/tipos-comunicacao?z=1793884300148 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 1986
10.116.3.27 - - [05/Nov/2026:10:11:40 -0300] "GET /workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793884300150 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 1227
10.116.3.27 - - [05/Nov/2026:10:11:40 -0300] "GET /workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793884300151 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 1692
10.116.3.27 - - [05/Nov/2026:10:11:40 -0300] "GET /workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793884300152 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 1459
10.116.3.30 - - [05/Nov/2026:10:11:40 -0300] "GET /workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793884300153 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 1181
10.116.3.30 - - [05/Nov/2026:10:11:40 -0300] "GET /workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793884300151 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36 Edg/156.0.0.0" - 200 0 246 2442
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
