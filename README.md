
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]# grep -i "sicem" /logs/apache2/httpd_eap_des_64/access.log | tail -50
[root@sbrdeaprlx0002 p585600]# grep -i "sicem" /logs/apache2/httpd_eap_des_64/error.log | tail -50
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]#




[root@sbrdeaprlx0001 p585600]#
[root@sbrdeaprlx0001 p585600]#
[root@sbrdeaprlx0001 p585600]#
[root@sbrdeaprlx0001 p585600]#
[root@sbrdeaprlx0001 p585600]# grep -i "sicem" /logs/apache2/httpd_eap_des_64/access.log | tail -50
10.122.6.69 - - [30/Jan/2023:16:26:20 -0300] "GET /sicem HTTP/1.1" 403 207 "-" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36" text/html 403 207 392 1116
10.122.6.69 - - [30/Jan/2023:16:26:23 -0300] "GET /favicon.ico HTTP/1.1" 403 213 "http://10.116.84.136/sicem" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36" text/html 403 213 397 949
10.122.6.69 - - [30/Jan/2023:16:26:46 -0300] "GET /sicem HTTP/1.1" 403 207 "-" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36" text/html 403 207 392 1534
10.122.6.69 - - [30/Jan/2023:16:26:46 -0300] "GET /favicon.ico HTTP/1.1" 403 213 "http://10.116.84.136/sicem" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36" text/html 403 213 397 1097
10.116.3.30 - - [12/Aug/2025:10:30:25 -0300] "GET /favicon.ico HTTP/1.1" 403 213 "http://10.116.80.21/sicem" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36 Edg/139.0.0.0" text/html 403 213 398 446
[root@sbrdeaprlx0001 p585600]# grep -i "sicem" /logs/apache2/httpd_eap_des_64/error.log | tail -50
[Tue Aug 12 10:30:25 2025] [error] [client 10.116.3.30] client denied by server configuration: proxy:balancer://mycluster_siefi/favicon.ico, referer: http://10.116.80.21/sicem
[root@sbrdeaprlx0001 p585600]#
[root@sbrdeaprlx0001 p585600]#
[root@sbrdeaprlx0001 p585600]#
