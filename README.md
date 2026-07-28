
sh-4.4$ curl -v -x http://proxydes.caixa:80 https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc --max-time 10
* Uses proxy env variable NO_PROXY == '*.caixa,*.caixa.gov.br'
*   Trying 10.252.32.65...
* TCP_NODELAY set
* Connected to proxydes.caixa (10.252.32.65) port 80 (#0)
* allocate connect buffer!
* Establish HTTP proxy tunnel to brazilsouth.livediagnostics.monitor.azure.com:443
> CONNECT brazilsouth.livediagnostics.monitor.azure.com:443 HTTP/1.1
> Host: brazilsouth.livediagnostics.monitor.azure.com:443
> User-Agent: curl/7.61.1
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
* Received HTTP code 502 from proxy after CONNECT
* CONNECT phase completed!
* Closing connection 0
curl: (56) Received HTTP code 502 from proxy after CONNECT
sh-4.4$ curl -v -x http://proxydes.caixa:80 https://agent.azureserviceprofiler.net --max-time 10
* Rebuilt URL to: https://agent.azureserviceprofiler.net/
* Uses proxy env variable NO_PROXY == '*.caixa,*.caixa.gov.br'
*   Trying 10.252.32.65...
* TCP_NODELAY set
* Connected to proxydes.caixa (10.252.32.65) port 80 (#0)
* allocate connect buffer!
* Establish HTTP proxy tunnel to agent.azureserviceprofiler.net:443
> CONNECT agent.azureserviceprofiler.net:443 HTTP/1.1
> Host: agent.azureserviceprofiler.net:443
> User-Agent: curl/7.61.1
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
* Received HTTP code 502 from proxy after CONNECT
* CONNECT phase completed!
* Closing connection 0
curl: (56) Received HTTP code 502 from proxy after CONNECT
sh-4.4$ curl -v -x http://proxydes.caixa:80 --connect-to ::agent.azureserviceprofiler.net:443 https://agent.azureserviceprofiler.net --max-time 10 -o /dev/null
* Rebuilt URL to: https://agent.azureserviceprofiler.net/
* Uses proxy env variable NO_PROXY == '*.caixa,*.caixa.gov.br'
* Connecting to hostname: agent.azureserviceprofiler.net
* Connecting to port: 443
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0*   Trying 10.252.32.65...
* TCP_NODELAY set
* Connected to proxydes.caixa (10.252.32.65) port 80 (#0)
* allocate connect buffer!
* Establish HTTP proxy tunnel to agent.azureserviceprofiler.net:443
> CONNECT agent.azureserviceprofiler.net:443 HTTP/1.1
> Host: agent.azureserviceprofiler.net:443
> User-Agent: curl/7.61.1
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
* Received HTTP code 502 from proxy after CONNECT
* CONNECT phase completed!
* Closing connection 0
curl: (56) Received HTTP code 502 from proxy after CONNECT
sh-4.4$
