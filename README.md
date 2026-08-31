
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# curl -ik -X OPTIONS https://agenciadigital2.des.caixa:8021/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
Access-Control-Allow-Origin: *
Access-Control-Allow-Methods: GET, POST, PUT, DELETE, OPTIONS
Access-Control-Allow-Headers: Accept, Content-Type, Authorization, Origin, X-Requested-With
[root@sspdeaprlx0027 siavl05]# curl -ik -X OPTIONS https://agenciadigital3.des.caixa:8023/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
Access-Control-Allow-Origin: *
Access-Control-Allow-Methods: GET, POST, PUT, DELETE, OPTIONS
Access-Control-Allow-Headers: Accept, Content-Type, Authorization, Origin, X-Requested-With
[root@sspdeaprlx0027 siavl05]# curl -ik -X OPTIONS https://agenciadigital4.des.caixa:8025/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"

curl: (7) couldn't connect to host
[root@sspdeaprlx0027 siavl05]# curl -ik -X OPTIONS https://agenciadigital5.des.caixa:8027/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
Access-Control-Allow-Origin: *
Access-Control-Allow-Methods: GET, POST, PUT, DELETE, OPTIONS
Access-Control-Allow-Headers: Accept, Content-Type, Authorization, Origin, X-Requested-With
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
