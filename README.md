
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$ for i in $(seq 1 15); do
  for h in sigec.des.caixa sigecpor2.des.caixa; do
    printf "%s %s: " "$i" "$h"
    curl -sk -o /dev/null -D - https://$h/gec-web/por/ | grep -oE 'HTTP/1.1 [0-9]+|sigec-portabilidade[^"]*_lx104' | tr '\n' ' '
    echo
  done
done
1 sigec.des.caixa:
1 sigecpor2.des.caixa:
2 sigec.des.caixa:
2 sigecpor2.des.caixa:
3 sigec.des.caixa:
3 sigecpor2.des.caixa:
4 sigec.des.caixa:
4 sigecpor2.des.caixa:
5 sigec.des.caixa:
5 sigecpor2.des.caixa:
6 sigec.des.caixa:
6 sigecpor2.des.caixa:
7 sigec.des.caixa:
7 sigecpor2.des.caixa:
8 sigec.des.caixa:
8 sigecpor2.des.caixa:
9 sigec.des.caixa:
9 sigecpor2.des.caixa:
10 sigec.des.caixa:
10 sigecpor2.des.caixa:
11 sigec.des.caixa:
11 sigecpor2.des.caixa:
12 sigec.des.caixa:
12 sigecpor2.des.caixa:
13 sigec.des.caixa:
13 sigecpor2.des.caixa:
14 sigec.des.caixa:
14 sigecpor2.des.caixa:
15 sigec.des.caixa:
15 sigecpor2.des.caixa:




[root@caddeapllx2794 conf.d]#
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







