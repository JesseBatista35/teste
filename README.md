
-sh-4.2$ curl -v -x proxydes.caixa:80 https://southcentralus-3.in.applicationinsights.azure.com
* About to connect() to proxy proxydes.caixa port 80 (#0)
*   Trying 10.252.32.63...
* Connected to proxydes.caixa (10.252.32.63) port 80 (#0)
* Establish HTTP proxy tunnel to southcentralus-3.in.applicationinsights.azure.com:443
> CONNECT southcentralus-3.in.applicationinsights.azure.com:443 HTTP/1.1
> Host: southcentralus-3.in.applicationinsights.azure.com:443
> User-Agent: curl/7.29.0
> Proxy-Connection: Keep-Alive
>
< HTTP/1.1 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
< Via: 1.1 DADNGITRNT002
< Connection: close
< Proxy-Connection: close
< Pragma: no-cache
< Cache-Control: no-cache
< Content-Type: text/html
< Content-Length: 4822
<
* Received HTTP code 502 from proxy after CONNECT
* Connection #0 to host proxydes.caixa left intact
curl: (56) Received HTTP code 502 from proxy after CONNECT
-sh-4.2$
-sh-4.2$
-sh-4.2$
