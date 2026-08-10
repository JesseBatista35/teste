[p585600@caddeapllx2666 ~]$
[p585600@caddeapllx2666 ~]$ netstat -tulpn | grep :80
(Nem todos os processos puderam ser identificados, informações sobre processos
 de outrem não serão mostrados, você deve ser root para vê-los todos.)
tcp        0      0 0.0.0.0:8080            0.0.0.0:*               OUÇA       -
[p585600@caddeapllx2666 ~]$
[p585600@caddeapllx2666 ~]$
[p585600@caddeapllx2666 ~]$
[p585600@caddeapllx2666 ~]$ curl -v http://localhost:80/
*   Trying ::1:80...
* connect to ::1 port 80 failed: Conexão recusada
*   Trying 127.0.0.1:80...
* connect to 127.0.0.1 port 80 failed: Conexão recusada
* Failed to connect to localhost port 80: Conexão recusada
* Closing connection 0
curl: (7) Failed to connect to localhost port 80: Conexão recusada
[p585600@caddeapllx2666 ~]$
[p585600@caddeapllx2666 ~]$
[p585600@caddeapllx2666 ~]$ curl -v http://127.0.0.1:80/
*   Trying 127.0.0.1:80...
* connect to 127.0.0.1 port 80 failed: Conexão recusada
* Failed to connect to 127.0.0.1 port 80: Conexão recusada
* Closing connection 0
curl: (7) Failed to connect to 127.0.0.1 port 80: Conexão recusada
[p585600@caddeapllx2666 ~]$
[p585600@caddeapllx2666 ~]$
[p585600@caddeapllx2666 ~]$  curl -v http://10.116.201.122:80/
*   Trying 10.116.201.122:80...
* connect to 10.116.201.122 port 80 failed: Conexão recusada
* Failed to connect to 10.116.201.122 port 80: Conexão recusada
* Closing connection 0
curl: (7) Failed to connect to 10.116.201.122 port 80: Conexão recusada
[p585600@caddeapllx2666 ~]$ curl -v http://10.116.201.122:80/
*   Trying 10.116.201.122:80...
* connect to 10.116.201.122 port 80 failed: Conexão recusada
* Failed to connect to 10.116.201.122 port 80: Conexão recusada
* Closing connection 0
curl: (7) Failed to connect to 10.116.201.122 port 80: Conexão recusada
[p585600@caddeapllx2666 ~]$ sudo su

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
[root@caddeapllx2666 p585600]# curl -v http://10.116.201.122:80/
*   Trying 10.116.201.122:80...
* connect to 10.116.201.122 port 80 failed: Conexão recusada
* Failed to connect to 10.116.201.122 port 80: Conexão recusada
* Closing connection 0
curl: (7) Failed to connect to 10.116.201.122 port 80: Conexão recusada
[root@caddeapllx2666 p585600]#
