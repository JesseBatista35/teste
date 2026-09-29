
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs sipar-inter-des-25-nbb8n --since=15m | grep -iE "403|certif|x509|forbidden|error" | tail -30
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$


=> sourcing 10-set-mpm.sh ...
=> sourcing 20-copy-config.sh ...
=> sourcing 40-ssl-certs.sh ...
---> Generating SSL key pair for httpd...
AH00558: httpd: Could not reliably determine the server's fully qualified domain name, using 25.2.18.40. Set the 'ServerName' directive globally to suppress this message
[Tue Sep 29 16:58:52.412250 2026] [ssl:warn] [pid 1:tid 140281335193024] AH01909: 25.2.18.40:8443:0 server certificate does NOT include an ID which matches the server name
[Tue Sep 29 16:58:52.412374 2026] [ssl:info] [pid 1:tid 140281335193024] AH01914: Configuring server sipar-inter-frontend-des.apps.nprd.caixa:443 for SSL protocol
[Tue Sep 29 16:58:52.424488 2026] [ssl:info] [pid 1:tid 140281335193024] AH02568: Certificate and private key sipar-inter-frontend-des.apps.nprd.caixa:443:0 configured from /etc/httpd/tls/sipar-inter-frontend-des.apps.nprd.caixa.crt and /etc/httpd/tls/sipar-inter-frontend-des.apps.nprd.caixa.key
[Tue Sep 29 16:58:52.424561 2026] [ssl:info] [pid 1:tid 140281335193024] AH01914: Configuring server sipar-inter-frontend-des.apps.nprd.caixa:443 for SSL protocol
[Tue Sep 29 16:58:52.436575 2026] [ssl:info] [pid 1:tid 140281335193024] AH02568: Certificate and private key sipar-inter-frontend-des.apps.nprd.caixa:443:0 configured from /etc/httpd/tls/sipar-inter-frontend-des.apps.nprd.caixa.crt and /etc/httpd/tls/sipar-inter-frontend-des.apps.nprd.caixa.key
AH00558: httpd: Could not reliably determine the server's fully qualified domain name, using 25.2.18.40. Set the 'ServerName' directive globally to suppress this message
[Tue Sep 29 16:58:52.505492 2026] [ssl:warn] [pid 1:tid 140281335193024] AH01909: 25.2.18.40:8443:0 server certificate does NOT include an ID which matches the server name
[Tue Sep 29 16:58:52.505592 2026] [ssl:info] [pid 1:tid 140281335193024] AH01914: Configuring server sipar-inter-frontend-des.apps.nprd.caixa:443 for SSL protocol
[Tue Sep 29 16:58:52.517855 2026] [ssl:info] [pid 1:tid 140281335193024] AH02568: Certificate and private key sipar-inter-frontend-des.apps.nprd.caixa:443:0 configured from /etc/httpd/tls/sipar-inter-frontend-des.apps.nprd.caixa.crt and /etc/httpd/tls/sipar-inter-frontend-des.apps.nprd.caixa.key
[Tue Sep 29 16:58:52.517924 2026] [ssl:info] [pid 1:tid 140281335193024] AH01914: Configuring server sipar-inter-frontend-des.apps.nprd.caixa:443 for SSL protocol
[Tue Sep 29 16:58:52.529795 2026] [ssl:info] [pid 1:tid 140281335193024] AH02568: Certificate and private key sipar-inter-frontend-des.apps.nprd.caixa:443:0 configured from /etc/httpd/tls/sipar-inter-frontend-des.apps.nprd.caixa.crt and /etc/httpd/tls/sipar-inter-frontend-des.apps.nprd.caixa.key
[Tue Sep 29 16:58:52.529942 2026] [lbmethod_heartbeat:notice] [pid 1:tid 140281335193024] AH02282: No slotmem from mod_heartmonitor
[Tue Sep 29 16:58:52.534257 2026] [mpm_event:notice] [pid 1:tid 140281335193024] AH00489: Apache/2.4.37 (centos) OpenSSL/1.1.1c configured -- resuming normal operations
[Tue Sep 29 16:58:52.534278 2026] [core:notice] [pid 1:tid 140281335193024] AH00094: Command line: 'httpd -D FOREGROUND'
[Tue Sep 29 17:01:07.196345 2026] [ssl:info] [pid 44:tid 140280376309504] [client 25.2.2.1:52842] AH01964: Connection to child 72 established (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:07.208613 2026] [ssl:info] [pid 57:tid 140280409880320] [client 25.2.2.1:52846] AH01964: Connection to child 132 established (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:17.221805 2026] [ssl:info] [pid 44:tid 140280376309504] [client 25.2.2.1:52842] AH02008: SSL library error 1 in handshake (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:17.221841 2026] [ssl:info] [pid 44:tid 140280376309504] SSL Library Error: error:14094416:SSL routines:ssl3_read_bytes:sslv3 alert certificate unknown (SSL alert number 46)
[Tue Sep 29 17:01:17.221848 2026] [ssl:info] [pid 44:tid 140280376309504] [client 25.2.2.1:52842] AH01998: Connection closed to child 72 with abortive shutdown (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:17.222282 2026] [ssl:info] [pid 57:tid 140280409880320] [client 25.2.2.1:52846] AH02008: SSL library error 1 in handshake (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:17.222318 2026] [ssl:info] [pid 57:tid 140280409880320] SSL Library Error: error:14094416:SSL routines:ssl3_read_bytes:sslv3 alert certificate unknown (SSL alert number 46)
[Tue Sep 29 17:01:17.222322 2026] [ssl:info] [pid 57:tid 140280409880320] [client 25.2.2.1:52846] AH01998: Connection closed to child 132 with abortive shutdown (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:19.535662 2026] [ssl:info] [pid 37:tid 140279663290112] [client 25.2.10.1:54506] AH01964: Connection to child 11 established (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:19.535749 2026] [ssl:info] [pid 251:tid 140280649697024] [client 25.2.10.1:54520] AH01964: Connection to child 192 established (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:19.548774 2026] [ssl:info] [pid 37:tid 140279663290112] [client 25.2.10.1:54506] AH02008: SSL library error 1 in handshake (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:19.548803 2026] [ssl:info] [pid 37:tid 140279663290112] SSL Library Error: error:14094416:SSL routines:ssl3_read_bytes:sslv3 alert certificate unknown (SSL alert number 46)
[Tue Sep 29 17:01:19.548809 2026] [ssl:info] [pid 37:tid 140279663290112] [client 25.2.10.1:54506] AH01998: Connection closed to child 11 with abortive shutdown (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:19.549814 2026] [ssl:info] [pid 251:tid 140280649697024] [client 25.2.10.1:54520] AH02008: SSL library error 1 in handshake (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:19.549838 2026] [ssl:info] [pid 251:tid 140280649697024] SSL Library Error: error:14094416:SSL routines:ssl3_read_bytes:sslv3 alert certificate unknown (SSL alert number 46)
[Tue Sep 29 17:01:19.549846 2026] [ssl:info] [pid 251:tid 140280649697024] [client 25.2.10.1:54520] AH01998: Connection closed to child 192 with abortive shutdown (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:19.561280 2026] [ssl:info] [pid 57:tid 140280393094912] [client 25.2.10.1:54526] AH01964: Connection to child 134 established (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:19.575610 2026] [ssl:info] [pid 57:tid 140280393094912] [client 25.2.10.1:54526] AH01998: Connection closed to child 134 with abortive shutdown (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:23.234844 2026] [ssl:info] [pid 57:tid 140280376309504] [client 25.2.2.1:46848] AH01964: Connection to child 136 established (server sipar-inter-frontend-des.apps.nprd.caixa:443)
25.2.2.1 - - [29/Sep/2026:17:01:28 -0300] "GET /siparInternet/ HTTP/1.1" 403 68
[29/Sep/2026:17:01:28 -0300] 25.2.2.1 TLSv1.2 ECDHE-RSA-AES128-GCM-SHA256 "GET /siparInternet/ HTTP/1.1" 68
25.2.2.1 - - [29/Sep/2026:17:01:28 -0300] "GET /favicon.ico HTTP/1.1" 400 226
[29/Sep/2026:17:01:28 -0300] 25.2.2.1 TLSv1.2 ECDHE-RSA-AES128-GCM-SHA256 "GET /favicon.ico HTTP/1.1" 226
[Tue Sep 29 17:01:40.904751 2026] [ssl:info] [pid 57:tid 140279789115136] [client 25.2.10.1:52598] AH01964: Connection to child 141 established (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:40.904753 2026] [ssl:info] [pid 44:tid 140279805900544] [client 25.2.10.1:52610] AH01964: Connection to child 75 established (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:40.911895 2026] [ssl:info] [pid 57:tid 140279789115136] [client 25.2.10.1:52598] AH02008: SSL library error 1 in handshake (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:40.911921 2026] [ssl:info] [pid 57:tid 140279789115136] SSL Library Error: error:14094416:SSL routines:ssl3_read_bytes:sslv3 alert certificate unknown (SSL alert number 46)
[Tue Sep 29 17:01:40.911926 2026] [ssl:info] [pid 57:tid 140279789115136] [client 25.2.10.1:52598] AH01998: Connection closed to child 141 with abortive shutdown (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:40.912327 2026] [ssl:info] [pid 44:tid 140279805900544] [client 25.2.10.1:52610] AH02008: SSL library error 1 in handshake (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:40.912353 2026] [ssl:info] [pid 44:tid 140279805900544] SSL Library Error: error:14094416:SSL routines:ssl3_read_bytes:sslv3 alert certificate unknown (SSL alert number 46)
[Tue Sep 29 17:01:40.912359 2026] [ssl:info] [pid 44:tid 140279805900544] [client 25.2.10.1:52610] AH01998: Connection closed to child 75 with abortive shutdown (server sipar-inter-frontend-des.apps.nprd.caixa:443)
[Tue Sep 29 17:01:40.924784 2026] [ssl:info] [pid 44:tid 140279797507840] [client 25.2.10.1:52616] AH01964: Connection to child 76 established (server sipar-inter-frontend-des.apps.nprd.caixa:443)
25.2.10.1 - - [29/Sep/2026:17:01:40 -0300] "GET /siparInternet/ HTTP/1.1" 403 68
[29/Sep/2026:17:01:40 -0300] 25.2.10.1 TLSv1.2 ECDHE-RSA-AES128-GCM-SHA256 "GET /siparInternet/ HTTP/1.1" 68
25.2.10.1 - - [29/Sep/2026:17:01:41 -0300] "GET /favicon.ico HTTP/1.1" 400 226
[29/Sep/2026:17:01:41 -0300] 25.2.10.1 TLSv1.2 ECDHE-RSA-AES128-GCM-SHA256 "GET /favicon.ico HTTP/1.1" 226
