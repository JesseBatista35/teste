-sh-4.2$ oc logs pod/agendamento-sisou-29747520-qjlwn
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0*   Trying 10.116.180.64...
* TCP_NODELAY set
* Connected to sisou-sac-okd-des.apps.nprd.caixa (10.116.180.64) port 443 (#0)
* ALPN, offering h2
* ALPN, offering http/1.1
* successfully set certificate verify locations:
*   CAfile: /etc/pki/tls/certs/ca-bundle.crt
  CApath: none
} [5 bytes data]
* TLSv1.3 (OUT), TLS handshake, Client hello (1):
} [512 bytes data]
* TLSv1.3 (IN), TLS handshake, Server hello (2):
{ [122 bytes data]
* TLSv1.3 (IN), TLS handshake, [no content] (0):
{ [1 bytes data]
* TLSv1.3 (IN), TLS handshake, Encrypted Extensions (8):
{ [10 bytes data]
* TLSv1.3 (IN), TLS handshake, [no content] (0):
{ [1 bytes data]
* TLSv1.3 (IN), TLS handshake, Certificate (11):
{ [3137 bytes data]
* TLSv1.3 (OUT), TLS alert, unknown CA (560):
} [2 bytes data]
* SSL certificate problem: unable to get local issuer certificate
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
* Closing connection 0
curl: (60) SSL certificate problem: unable to get local issuer certificate
More details here: https://curl.haxx.se/docs/sslcerts.html

curl failed to verify the legitimacy of the server and therefore could not
establish a secure connection to it. To learn more about this situation and
how to fix it, please visit the web page mentioned above.

 HTTP_CODE = 000
-sh-4.2$ oc delete pod -n sisou-des -l job-name --field-selector=status.phase=Failed
pod "agendamento-sisou-29747220-2gkp2" deleted
pod "agendamento-sisou-29747220-9brb9" deleted
pod "agendamento-sisou-29747220-hndjk" deleted
pod "agendamento-sisou-29747220-l5rz4" deleted
pod "agendamento-sisou-29747220-nmr5m" deleted
pod "agendamento-sisou-29747220-pbjr4" deleted
pod "agendamento-sisou-29747220-pl5jf" deleted
pod "agendamento-sisou-29747250-22jfm" deleted
pod "agendamento-sisou-29747250-hcwq9" deleted
pod "agendamento-sisou-29747250-jc87j" deleted
pod "agendamento-sisou-29747250-jx8gh" deleted
pod "agendamento-sisou-29747250-rvvb6" deleted
pod "agendamento-sisou-29747250-x4ffw" deleted
pod "agendamento-sisou-29747250-xxj98" deleted
pod "agendamento-sisou-29747280-7szlr" deleted
pod "agendamento-sisou-29747280-8ggkt" deleted
pod "agendamento-sisou-29747280-hmmfz" deleted
pod "agendamento-sisou-29747280-kpc7p" deleted
pod "agendamento-sisou-29747280-vxv5d" deleted
pod "agendamento-sisou-29747280-zfhrt" deleted
pod "agendamento-sisou-29747280-zwqgt" deleted
pod "agendamento-sisou-29747310-6qv77" deleted
pod "agendamento-sisou-29747310-6sgl6" deleted
pod "agendamento-sisou-29747310-c5vxx" deleted
pod "agendamento-sisou-29747310-cdf96" deleted
pod "agendamento-sisou-29747310-cpnld" deleted
pod "agendamento-sisou-29747310-lf982" deleted
pod "agendamento-sisou-29747310-r557g" deleted
pod "agendamento-sisou-29747340-7m5zl" deleted
pod "agendamento-sisou-29747340-cz4jr" deleted
pod "agendamento-sisou-29747340-dfqst" deleted
pod "agendamento-sisou-29747340-g2kzk" deleted
pod "agendamento-sisou-29747340-nlhhl" deleted
pod "agendamento-sisou-29747340-nxtl8" deleted
pod "agendamento-sisou-29747340-tlbqf" deleted
pod "agendamento-sisou-29747370-cr7sx" deleted
pod "agendamento-sisou-29747370-db99z" deleted
pod "agendamento-sisou-29747370-dkcwx" deleted
pod "agendamento-sisou-29747370-f4tzs" deleted
pod "agendamento-sisou-29747370-fj84l" deleted
pod "agendamento-sisou-29747370-wskzc" deleted
pod "agendamento-sisou-29747370-xll6s" deleted
pod "agendamento-sisou-29747400-4vb7v" deleted
pod "agendamento-sisou-29747400-bsqt7" deleted
pod "agendamento-sisou-29747400-gdlh9" deleted
pod "agendamento-sisou-29747400-jnq6h" deleted
pod "agendamento-sisou-29747400-ls7qx" deleted
pod "agendamento-sisou-29747400-pjp5k" deleted
pod "agendamento-sisou-29747400-xsm97" deleted
pod "agendamento-sisou-29747430-4k2jm" deleted
pod "agendamento-sisou-29747430-62jzz" deleted
pod "agendamento-sisou-29747430-dj2ch" deleted
pod "agendamento-sisou-29747430-hk9gf" deleted
pod "agendamento-sisou-29747430-jjh2d" deleted
pod "agendamento-sisou-29747430-jx2bl" deleted
pod "agendamento-sisou-29747430-w88sv" deleted
pod "agendamento-sisou-29747460-4mp4w" deleted
pod "agendamento-sisou-29747460-5jj95" deleted
pod "agendamento-sisou-29747460-96bph" deleted
pod "agendamento-sisou-29747460-g2lzp" deleted
pod "agendamento-sisou-29747460-lwpvz" deleted
pod "agendamento-sisou-29747460-tqlw5" deleted
pod "agendamento-sisou-29747460-zxptd" deleted
pod "agendamento-sisou-29747490-545ks" deleted
pod "agendamento-sisou-29747490-7nwgl" deleted
pod "agendamento-sisou-29747490-ccrr6" deleted
pod "agendamento-sisou-29747490-jvslf" deleted
pod "agendamento-sisou-29747490-lf59p" deleted
pod "agendamento-sisou-29747490-snhpz" deleted
pod "agendamento-sisou-29747490-wswb8" deleted
pod "agendamento-sisou-29747520-28r6f" deleted
pod "agendamento-sisou-29747520-2n879" deleted
pod "agendamento-sisou-29747520-6c9gd" deleted
pod "agendamento-sisou-29747520-75m5g" deleted
