
sipar-inter-frontend-des-31-deploy   0/1       Error       0          19h
sipar-inter-frontend-des-32-deploy   0/1       Completed   0          3m42s
sipar-inter-frontend-des-32-smvvh    1/1       Running     0          64s
-sh-4.2$ oc logs sipar-inter-frontend-des-32-smvvh | tail -15
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
-sh-4.2$
-sh-4.2$
-sh-4.2$
