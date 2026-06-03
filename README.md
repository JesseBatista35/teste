[p585600@sspdeapllx0041 ~]$ curl -v -x proxydes.caixa:80 https://brazilsoutheast-0.in.applicationinsights.azure.com
* About to connect() to proxy proxydes.caixa port 80 (#0)
*   Trying 10.252.32.65... connected
* Connected to proxydes.caixa (10.252.32.65) port 80 (#0)
* Establish HTTP proxy tunnel to brazilsoutheast-0.in.applicationinsights.azure.com:443
> CONNECT brazilsoutheast-0.in.applicationinsights.azure.com:443 HTTP/1.1
> Host: brazilsoutheast-0.in.applicationinsights.azure.com:443
> User-Agent: curl/7.19.7 (x86_64-redhat-linux-gnu) libcurl/7.19.7 NSS/3.44 zlib/1.2.3 libidn/1.18 libssh2/1.4.2
> Proxy-Connection: Keep-Alive
>
< HTTP/1.1 200 Connection established
< Via: 1.1 DADNGITRNT006
< Connection: Keep-Alive
< Proxy-Connection: Keep-Alive
<
* Proxy replied OK to CONNECT request
* Initializing NSS with certpath: sql:/etc/pki/nssdb
*   CAfile: /etc/pki/tls/certs/ca-bundle.crt
  CApath: none
* SSL connection using TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384
* Server certificate:
*       subject: CN=in.applicationinsights.azure.com,O=Microsoft Corporation,L=Redmond,ST=WA,C=US
*       start date: May 12 16:07:06 2026 GMT
*       expire date: Nov 08 16:07:06 2026 GMT
*       common name: in.applicationinsights.azure.com
*       issuer: CN=Microsoft TLS G2 RSA CA OCSP 04,O=Microsoft Corporation,C=US
> GET / HTTP/1.1
> User-Agent: curl/7.19.7 (x86_64-redhat-linux-gnu) libcurl/7.19.7 NSS/3.44 zlib/1.2.3 libidn/1.18 libssh2/1.4.2
> Host: brazilsoutheast-0.in.applicationinsights.azure.com
> Accept: */*
>
< HTTP/1.1 404 Not Found
< Content-Length: 0
< Server: Microsoft-HTTPAPI/2.0
< Strict-Transport-Security: max-age=31536000
< X-Content-Type-Options: nosniff
< Date: Wed, 03 Jun 2026 19:01:51 GMT
<
* Connection #0 to host proxydes.caixa left intact
* Closing connection #0
[p585600@sspdeapllx0041 ~]$
