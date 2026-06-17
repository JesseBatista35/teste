
[root@caddeapllx2598 p585600]# netstat -tulpn | grep -E ":(80|443|8080|8443)"
[root@caddeapllx2598 p585600]# curl -k -v https://localhost:8443/
*   Trying ::1:8443...
* connect to ::1 port 8443 failed: Conexão recusada
*   Trying 127.0.0.1:8443...
* connect to 127.0.0.1 port 8443 failed: Conexão recusada
* Failed to connect to localhost port 8443: Conexão recusada
* Closing connection 0
curl: (7) Failed to connect to localhost port 8443: Conexão recusada
[root@caddeapllx2598 p585600]# curl -k -v https://localhost:443/
*   Trying ::1:443...
* connect to ::1 port 443 failed: Conexão recusada
*   Trying 127.0.0.1:443...
* connect to 127.0.0.1 port 443 failed: Conexão recusada
* Failed to connect to localhost port 443: Conexão recusada
* Closing connection 0
curl: (7) Failed to connect to localhost port 443: Conexão recusada
[root@caddeapllx2598 p585600]#
[root@caddeapllx2598 p585600]#
[root@caddeapllx2598 p585600]#
