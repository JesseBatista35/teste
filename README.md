esse servidores nao tem internet pra fora.


[p585600@sspdeapllx0041 ~]$ curl -v -x proxydes.caixa:80 -L -o /tmp/applicationinsights-agent-3.7.8.jar https://github.com/microsoft/ApplicationInsights-Java/releases/download/3.7.8/applicationinsights-agent-3.7.8.jar
* About to connect() to proxy proxydes.caixa port 80 (#0)
*   Trying 10.252.32.65... connected
* Connected to proxydes.caixa (10.252.32.65) port 80 (#0)
* Establish HTTP proxy tunnel to github.com:443
> CONNECT github.com:443 HTTP/1.1
> Host: github.com:443
> User-Agent: curl/7.19.7 (x86_64-redhat-linux-gnu) libcurl/7.19.7 NSS/3.44 zlib/1.2.3 libidn/1.18 libssh2/1.4.2
> Proxy-Connection: Keep-Alive
>
< HTTP/1.1 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
< Via: 1.1 DADNGITRNT006
< Connection: close
< Proxy-Connection: close
< Pragma: no-cache
< Cache-Control: no-cache
< Content-Type: text/html
< Content-Length: 4822
<
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0* Received HTTP code 502 from proxy after CONNECT
* Closing connection #0

curl: (56) Received HTTP code 502 from proxy after CONNECT
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$

