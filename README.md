
-sh-4.2$ oc exec -n sicbp-des sicbp-trilha-api-des-58-88xfr -- curl -sv -x http://proxydes.caixa:80 https://brazilsoutheast-0.in.applicationinsights.azure.com/ -o /dev/null
*   Trying 10.252.32.63...
* TCP_NODELAY set
* Connected to proxydes.caixa (10.252.32.63) port 80 (#0)
* allocate connect buffer!
* Establish HTTP proxy tunnel to brazilsoutheast-0.in.applicationinsights.azure.com:443
> CONNECT brazilsoutheast-0.in.applicationinsights.azure.com:443 HTTP/1.1
> Host: brazilsoutheast-0.in.applicationinsights.azure.com:443
> User-Agent: curl/7.61.1
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
* CONNECT phase completed!
* Closing connection 0
command terminated with exit code 56
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n sicbp-des sicbp-trilha-api-des-58-88xfr -- which curl wget
/usr/bin/curl
which: no wget in (/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin)
command terminated with exit code 1
-sh-4.2$
