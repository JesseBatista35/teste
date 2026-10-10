Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10

Não é resposta autoritativa:
Nome:    7E48322A0761B3CA4EC5B83EC023BD28.gr7.sa-east-1.eks.amazonaws.com
Addresses:  10.249.79.56
          10.249.79.82


C:\Users\p585600>
C:\Users\p585600>
C:\Users\p585600>  Test-NetConnection <ip-retornado> -Port 443
O sistema não pode encontrar o arquivo especificado.

C:\Users\p585600>
C:\Users\p585600>
C:\Users\p585600>ipconfig | findstr IPv4
   Endereço IPv4. . . . . . . .  . . . . . . . : 10.211.14.6
   Endereço IPv4. . . . . . . .  . . . . . . . : 192.168.1.75

C:\Users\p585600>powershell -c "Test-NetConnection 10.249.79.56 -Port 443"


ComputerName     : 10.249.79.56
RemoteAddress    : 10.249.79.56
RemotePort       : 443
InterfaceAlias   : Ethernet 2
SourceAddress    : 10.211.14.6
TcpTestSucceeded : True




C:\Users\p585600>powershell -c "Test-NetConnection 10.249.79.82 -Port 443"


ComputerName     : 10.249.79.82
RemoteAddress    : 10.249.79.82
RemotePort       : 443
InterfaceAlias   : Ethernet 2
SourceAddress    : 10.211.14.6
TcpTestSucceeded : True




C:\Users\p585600>tracert -d -h 15 10.249.79.56

Rastreando a rota para 10.249.79.56 com no máximo 15 saltos

  1     8 ms     6 ms     6 ms  10.222.3.66
  2     *        *        *     Esgotado o tempo limite do pedido.
  3     *        *        *     Esgotado o tempo limite do pedido.
  4     *        *        *     Esgotado o tempo limite do pedido.
  5     5 ms     6 ms     5 ms  10.122.51.2
  6     6 ms     6 ms     6 ms  10.122.52.68
  7     5 ms     5 ms     5 ms  10.122.52.72
  8     7 ms     6 ms    12 ms  10.120.1.36
  9     *        *        *     Esgotado o tempo limite do pedido.
 10     *        *        *     Esgotado o tempo limite do pedido.
 11     *        *        *     Esgotado o tempo limite do pedido.
 12     *        *        *     Esgotado o tempo limite do pedido.
 13     *        *        *     Esgotado o tempo limite do pedido.
 14     *        *        *     Esgotado o tempo limite do pedido.
 15     *        *        *     Esgotado o tempo limite do pedido.

Rastreamento concluído.

C:\Users\p585600>
