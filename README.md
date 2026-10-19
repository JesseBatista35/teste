Copyright (C) Microsoft Corporation. All rights reserved.

PS C:\WINDOWS\system32> Test-NetConnection sigpd-backend.esteiras.des.caixa -Port 443


ComputerName     : sigpd-backend.esteiras.des.caixa
RemoteAddress    : 10.116.180.22
RemotePort       : 443
InterfaceAlias   : Ethernet 2
SourceAddress    : 10.111.14.61
TcpTestSucceeded : True



PS C:\WINDOWS\system32> Test-NetConnection sigpd-backend.esteiras.des.caixa -Port 80
AVISO: TCP connect to (10.116.180.22 : 80) failed


ComputerName           : sigpd-backend.esteiras.des.caixa
RemoteAddress          : 10.116.180.22
RemotePort             : 80
InterfaceAlias         : Ethernet 2
SourceAddress          : 10.111.14.61
PingSucceeded          : True
PingReplyDetails (RTT) : 21 ms
TcpTestSucceeded       : False



PS C:\WINDOWS\system32> curl.exe -kv --noproxy "*" -m 15 https://sigpd-backend.esteiras.des.caixa/sigpd-api/v1/health-check/live
* Host sigpd-backend.esteiras.des.caixa:443 was resolved.
* IPv6: (none)
* IPv4: 10.116.180.22
*   Trying 10.116.180.22:443...
* schannel: disabled automatic use of client certificate
* ALPN: curl offers http/1.1
* ALPN: server accepted http/1.1
* Established connection to sigpd-backend.esteiras.des.caixa (10.116.180.22 port 443) from 10.111.14.61 port 49688
* using HTTP/1.x
> GET /sigpd-api/v1/health-check/live HTTP/1.1
> Host: sigpd-backend.esteiras.des.caixa
> User-Agent: curl/8.21.0
> Accept: */*
>
* Request completely sent off
* schannel: server close notification received (close_notify)
< HTTP/1.1 200 OK
< Date: Mon, 19 Oct 2026 18:37:16 GMT
< Server: SIGP-SERVER
< X-Powered-By: CAIXA TI
< Access-Control-Allow-Headers: origin, referer, referrer, content-type, accept, authorization, Access-Control-Request-Method, Access-Control-Request-Headers
< Access-Control-Allow-Origin: *
< Access-Control-Allow-Credentials: true
< Content-Type: application/json
< Content-Length: 15
< Access-Control-Allow-Methods: GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD
< Connection: close
<
{"status":"UP"}* shutting down connection #0
PS C:\WINDOWS\system32> tracert -d -h 15 10.116.180.22

Rastreando a rota para 10.116.180.22 com no máximo 15 saltos

  1    23 ms    25 ms    22 ms  10.122.48.98
  2    21 ms    21 ms    21 ms  10.122.51.2
  3    21 ms    21 ms    21 ms  10.116.2.179
  4     *       21 ms    21 ms  10.116.2.180
  5     *        *        *     Esgotado o tempo limite do pedido.
  6     *        *        *     Esgotado o tempo limite do pedido.
  7    21 ms    21 ms    21 ms  10.116.180.22

Rastreamento concluído.
PS C:\WINDOWS\system32>
