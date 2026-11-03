
15 sigec.des.caixa:
15 sigecpor2.des.caixa:
[p585600@caddeapllx2794 ~]$ curl -skv https://sigec.des.caixa/gec-web/por/ 2>&1 | head -15
*   Trying 10.116.78.14:443...
* connect to 10.116.78.14 port 443 failed: Connection refused
* Failed to connect to sigec.des.caixa port 443: Connection refused
* Closing connection 0
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$ for /L %i in (1,1,15) do @(curl.exe -sk -o NUL -D - https://sigec.des.caixa/gec-web/por/ | findstr /i "HTTP/1.1 JSESSIONID" & curl.exe -sk -o NUL -D - https://sigecpor2.des.caixa/gec-web/por/ | findstr /i "HTTP/1.1 JSESSIONID")
-sh: syntax error near unexpected token `%i'
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$ for /L %i in (1,1,15) do @(curl.exe -sk -o NUL -D - https://sigec.des.caixa/gec-web/por/ | findstr /i "HTTP/1.1 JSESSIONID" & curl.exe -sk -o NUL -D - https://sigecpor2.des.caixa/gec-web/por/ | findstr /i "HTTP/1.1 JSESSIONID")
-sh: syntax error near unexpected token `%i'
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$




[root@caddeapllx2794 conf.d]# tail -f /logs/apache2/sigec-portabilidade2/sigecpor2.des.caixa-access.log /logs/apache2/gec-web/sigec.des.caixa-access.log
==> /logs/apache2/sigec-portabilidade2/sigecpor2.des.caixa-access.log <==
10.116.78.14 - - [03/Nov/2026:14:10:48 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 703 1713
10.116.78.14 - - [03/Nov/2026:14:10:48 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 703 1588
10.116.78.14 - - [03/Nov/2026:14:10:48 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 703 1596
10.116.78.14 - - [03/Nov/2026:14:10:49 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 703 1649
10.116.78.14 - - [03/Nov/2026:14:10:49 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 703 1658
10.116.78.14 - - [03/Nov/2026:14:10:54 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 703 1626
10.116.78.14 - - [03/Nov/2026:14:10:54 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 703 1546
10.116.78.14 - - [03/Nov/2026:14:10:54 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 703 1993
10.116.78.14 - - [03/Nov/2026:14:10:54 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 703 1473
10.116.78.14 - - [03/Nov/2026:14:10:55 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 703 1741

==> /logs/apache2/gec-web/sigec.des.caixa-access.log <==
10.116.78.14 - - [03/Nov/2026:14:10:48 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 704 2513
10.116.78.14 - - [03/Nov/2026:14:10:48 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 704 2519
10.116.78.14 - - [03/Nov/2026:14:10:48 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 704 2470
10.116.78.14 - - [03/Nov/2026:14:10:49 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 704 2810
10.116.78.14 - - [03/Nov/2026:14:10:49 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 704 2401
10.116.78.14 - - [03/Nov/2026:14:10:54 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 704 2759
10.116.78.14 - - [03/Nov/2026:14:10:54 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 704 2495
10.116.78.14 - - [03/Nov/2026:14:10:54 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 704 2474
10.116.78.14 - - [03/Nov/2026:14:10:54 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 704 2609
10.116.78.14 - - [03/Nov/2026:14:10:55 -0300] "GET /gec-web/por/ HTTP/1.1" 302 - "-" "curl/7.76.1" - 302 0 704 2742

