
[root@sbrdeapllx099 bin]# curl -v http://10.116.94.206:8803/ 2>&1 | head -20
* About to connect() to 10.116.94.206 port 8803 (#0)
*   Trying 10.116.94.206...
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0* Connected to 10.116.94.206 (10.116.94.206) port 8803 (#0)
> GET / HTTP/1.1
> User-Agent: curl/7.29.0
> Host: 10.116.94.206:8803
> Accept: */*
>
* Empty reply from server
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
* Connection #0 to host 10.116.94.206 left intact
curl: (52) Empty reply from server
[root@sbrdeapllx099 bin]# curl -v http://10.116.94.206:8803/simcn-web/ 2>&1 | head -20
* About to connect() to 10.116.94.206 port 8803 (#0)
*   Trying 10.116.94.206...
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0* Connected to 10.116.94.206 (10.116.94.206) port 8803 (#0)
> GET /simcn-web/ HTTP/1.1
> User-Agent: curl/7.29.0
> Host: 10.116.94.206:8803
> Accept: */*
>
* Empty reply from server
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
* Connection #0 to host 10.116.94.206 left intact
curl: (52) Empty reply from server
[root@sbrdeapllx099 bin]# ls -la /opt/jboss/jboss-eap/hc/deployments/
ls: não é possível acessar /opt/jboss/jboss-eap/hc/deployments/: Arquivo ou diretório não encontrado
[root@sbrdeapllx099 bin]#

