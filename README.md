root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv02/logs# cd /opt/SUNWweb/https-as8-dsv08/config
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/config#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/config#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/config# egrep -n -i "passthrough|servers=|timeout|cobranca|NameTrans|ppath" obj.conf
10:NameTrans fn="ntrans-j2ee" name="j2ee"
11:NameTrans fn="pfx2dir" from="/mc-icons" dir="/opt/SUNWweb/lib/icons" name="es-internal"
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/config#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/config#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/config# egrep -n -i "port|8008|servername" server.xml magnus.conf 2>/dev/null
server.xml:39:    <debug-jvm-options>-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=7896</debug-jvm-options>
server.xml:71:    <port>8008</port>
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/config#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/config#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/config# cd /opt/SUNWweb/https-as8-dsv08/logs
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs# ls -ltr | tail
-rw-r--r--   1 s000002  iplanet   181545 Aug  2  2019 access.201908030000.sspdeaprux0200.as8-dsv08
-rw-r--r--   1 s000002  iplanet     9715 Aug  3  2019 errors.201908030000.sspdeaprux0200.as8-dsv08
-rw-r--r--   1 s000002  iplanet      154 Aug  3  2019 access.201908040000.sspdeaprux0200.as8-dsv08
-rw-r--r--   1 s000002  iplanet      256 Aug  4  2019 errors.201908040000.sspdeaprux0200.as8-dsv08
-rw-r--r--   1 s000002  iplanet    37649 Aug  4  2019 access.201908050000.sspdeaprux0200.as8-dsv08
-rw-r--r--   1 s000002  iplanet    25181 Aug  5  2019 errors.201908050000.sspdeaprux0200.as8-dsv08
-rw-r--r--   1 s000002  iplanet   328193 Aug  5  2019 access.201908060000.sspdeaprux0200.as8-dsv08
-rw-r--r--   1 s000002  iplanet    34033 Aug  6  2019 errors.201908060000.sspdeaprux0200.as8-dsv08
-rw-r--r--   1 s000002  iplanet    31628 Oct 29 12:21 errors
-rw-r--r--   1 s000002  iplanet    61704 Oct 29 12:22 access
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs# egrep -i "timed out|timeout|passthrough|error" errors | tail -50
[29/Oct/2026:11:14:01] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:20:59] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:21:01] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:21:03] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:21:03] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:21:04] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:21:04] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:21:07] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:21:07] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:21:09] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:21:10] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:21:39] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:22:09] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:25:54] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:25:58] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:26:08] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:26:10] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:26:10] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:26:12] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:26:12] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:26:42] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:33:12] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:33:31] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:34:02] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:35:29] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:44:48] failure ( 2637): HTTP3068: Error receiving request from 10.11.197.70 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:44:56] failure ( 2637): HTTP3068: Error receiving request from 10.11.197.70 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:44:56] failure ( 2637): HTTP3068: Error receiving request from 10.11.197.70 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:45:02] failure ( 2637): HTTP3068: Error receiving request from 10.11.197.70 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:45:04] failure ( 2637): HTTP3068: Error receiving request from 10.11.197.70 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:45:04] failure ( 2637): HTTP3068: Error receiving request from 10.11.197.70 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:45:04] failure ( 2637): HTTP3068: Error receiving request from 10.11.197.70 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:45:04] failure ( 2637): HTTP3068: Error receiving request from 10.11.197.70 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:45:04] failure ( 2637): HTTP3068: Error receiving request from 10.11.197.70 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:45:04] failure ( 2637): HTTP3068: Error receiving request from 10.11.197.70 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:45:04] failure ( 2637): HTTP3068: Error receiving request from 10.11.197.70 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:45:04] failure ( 2637): HTTP3068: Error receiving request from 10.11.197.70 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:45:04] failure ( 2637): HTTP3068: Error receiving request from 10.11.197.70 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:45:04] failure ( 2637): HTTP3068: Error receiving request from 10.11.197.70 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:45:04] failure ( 2637): HTTP3068: Error receiving request from 10.11.197.70 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:51:03] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:51:05] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:51:05] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:51:35] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:54:14] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:55:51] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:11:56:21] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:12:03:30] failure ( 2637): HTTP3068: Error receiving request from 10.47.238.5 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:12:21:12] failure ( 2637): HTTP3068: Error receiving request from 10.111.17.138 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
[29/Oct/2026:12:21:13] failure ( 2637): HTTP3068: Error receiving request from 10.111.17.138 (SSL_ERROR_CERTIFICATE_UNKNOWN_ALERT: Client had some unspecified issue with the certificate it received.)
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
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
root@sspdeaprux0200:/opt/SUNWweb/https-as8-dsv08/logs#
