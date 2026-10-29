
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs# grep -i "cobranca" access | tail -30
10.11.197.70 - - [29/Oct/2026:11:45:18 -0300] "GET /cobrancastatic/ HTTP/1.1" 200 768 220
10.11.197.70 - - [29/Oct/2026:11:45:18 -0300] "GET /cobrancastatic/barra.htm HTTP/1.1" 200 6410 280
10.11.197.70 - - [29/Oct/2026:11:45:18 -0300] "GET /cobranca/sigcb_barra_superior.jsp HTTP/1.1" 200 1069 7040
10.11.197.70 - - [29/Oct/2026:11:45:18 -0300] "POST /cobranca/SigcbLogin HTTP/1.1" 302 0 3380
10.11.197.70 - - [29/Oct/2026:11:45:18 -0300] "GET /cobranca/sigcb_login.jsp HTTP/1.1" 200 5407 5360
10.11.197.70 - - [29/Oct/2026:11:45:18 -0300] "GET /cobrancastatic/imagens/diversos/caixa_logo.gif HTTP/1.1" 200 12379 1360
10.47.238.5 - - [29/Oct/2026:11:51:33 -0300] "POST /cobranca/SigcbControle HTTP/1.1" 200 43130 30079800
10.47.238.5 - - [29/Oct/2026:11:51:35 -0300] "POST /cobranca/SigcbControle HTTP/1.1" 200 43130 30092940
10.47.238.5 - - [29/Oct/2026:11:51:35 -0300] "POST /cobranca/SigcbControle HTTP/1.1" 200 43130 30076410
10.47.238.5 - - [29/Oct/2026:11:51:35 -0300] "GET /cobrancastatic/imagens/diversos/caixa_nome.gif HTTP/1.1" 200 2558 310
10.47.238.5 - - [29/Oct/2026:11:51:35 -0300] "GET /cobrancastatic/imagens/diversos/msgErro.gif HTTP/1.1" 200 737 110
10.47.238.5 - - [29/Oct/2026:11:54:14 -0300] "POST /cobranca/SigcbControle HTTP/1.1" 200 51284 20910
10.47.238.5 - - [29/Oct/2026:11:56:21 -0300] "POST /cobranca/SigcbControle HTTP/1.1" 200 43130 30074250
10.47.238.5 - - [29/Oct/2026:11:56:21 -0300] "GET /cobrancastatic/imagens/diversos/caixa_nome.gif HTTP/1.1" 200 2558 310
10.47.238.5 - - [29/Oct/2026:11:56:21 -0300] "GET /cobrancastatic/imagens/diversos/msgErro.gif HTTP/1.1" 200 737 140
10.47.238.5 - - [29/Oct/2026:12:03:31 -0300] "POST /cobranca/SigcbControle HTTP/1.1" 200 51284 16700
10.111.17.138 - - [29/Oct/2026:12:21:12 -0300] "POST /cobranca/SigcbControle HTTP/1.1" 302 0 5570
10.111.17.138 - - [29/Oct/2026:12:21:13 -0300] "GET /cobranca/sigcb_login.jsp HTTP/1.1" 200 5407 10480
10.111.17.138 - - [29/Oct/2026:12:21:13 -0300] "GET /cobrancastatic/imagens/diversos/caixa_logo.gif HTTP/1.1" 200 12379 1400
10.111.17.138 - - [29/Oct/2026:12:21:13 -0300] "GET /cobrancastatic/imagens/diversos/avatarChatbot21-loop.gif HTTP/1.1" 200 121126 53150
10.211.18.213 - - [29/Oct/2026:12:22:46 -0300] "GET /cobranca/protegida.jsp HTTP/1.1" 200 2781 3240
10.211.18.213 - - [29/Oct/2026:12:22:46 -0300] "GET /cobrancastatic/ HTTP/1.1" 304 0 370
10.211.18.213 - - [29/Oct/2026:12:22:46 -0300] "GET /cobranca/sigcb_barra_superior.jsp HTTP/1.1" 200 1069 5080
10.211.18.213 - - [29/Oct/2026:12:22:46 -0300] "POST /cobranca/SigcbLogin HTTP/1.1" 302 0 2530
10.211.18.213 - - [29/Oct/2026:12:22:47 -0300] "GET /cobranca/sigcb_login.jsp HTTP/1.1" 200 5407 4360
10.211.18.213 - - [29/Oct/2026:12:22:52 -0300] "POST /cobranca/j_security_check HTTP/1.1" 302 0 105280
10.211.18.213 - - [29/Oct/2026:12:22:52 -0300] "GET /cobranca/SigcbLogin HTTP/1.1" 200 39866 20420
10.211.18.213 - - [29/Oct/2026:12:22:55 -0300] "POST /cobranca/SigcbControle HTTP/1.1" 200 53266 13470
10.211.18.213 - - [29/Oct/2026:12:22:58 -0300] "POST /cobranca/SigcbControle HTTP/1.1" 200 49778 192940
10.211.18.213 - - [29/Oct/2026:12:23:01 -0300] "POST /cobranca/SigcbControle HTTP/1.1" 200 47892 52330
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs# grep -n -i -B2 -A2 "cobranca" /opt/SUNWweb/https-as8-dsv08/config/server.xml
grep: illegal option -- B
grep: illegal option -- 2
grep: illegal option -- A
grep: illegal option -- 2
Usage: grep [-c|-l|-q] -bhinsvw pattern file . . .
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs# netstat -aun -P tcp | grep " 2637 " | egrep -v "LISTEN|\.8008 "
10.116.83.101.34936  10.116.89.101.9008   s000002    2637 webservd       257184      0  257184      0 TIME_WAIT
10.116.83.101.64291  10.116.89.101.9008   s000002    2637 webservd       257184      0  257184      0 TIME_WAIT
10.116.83.101.60416  10.116.89.101.9008   s000002    2637 webservd       257184      0  257184      0 TIME_WAIT
10.116.83.101.54223  10.116.89.101.9008   s000002    2637 webservd       257184      0  257184      0 TIME_WAIT
10.116.83.140.62636  10.116.89.101.9008   s000002    2637 webservd       257184      0  257184      0 TIME_WAIT
10.116.83.140.45995  10.116.89.101.9008   s000002    2637 webservd       257184      0  257184      0 TIME_WAIT
10.116.83.101.44054  10.116.89.101.9008   s000002    2637 webservd       257184      0  257184      0 TIME_WAIT
10.116.83.140.57713  10.116.89.101.9008   s000002    2637 webservd       257184      0  257184      0 TIME_WAIT
10.116.83.101.60184  10.116.89.101.9008   s000002    2637 webservd       257184      0  257184      0 TIME_WAIT
10.116.83.140.62035  10.116.89.101.9008   s000002    2637 webservd       257184      0  257184      0 TIME_WAIT
10.116.83.140.52580  10.116.89.101.9008   s000002    2637 webservd       257184      0  257184      0 TIME_WAIT
10.116.83.140.56666  10.116.89.101.9008   s000002    2637 webservd       257184      0  257184      0 TIME_WAIT
10.116.83.140.45857  10.116.89.101.9008   s000002    2637 webservd       257184      0  257184      0 ESTABLISHED
      *.*                  *.*            s000002    2637 webservd            0      0  256000      0 IDLE
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs# egrep -n "11:5[0-6]|11:4[5-9]" /opt/SUNWweb/https-as8-dsv08/logs/errors | grep -v CERTIFICATE_UNKNOWN
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs# grep -n "1793283639786" /opt/SUNWweb/https-as8-dsv08/logs/errors
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
