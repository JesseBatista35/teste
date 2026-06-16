
[root@caddeapllx2484 p585600]# curl -v telnet://10.216.80.110:448 2>&1 | head -
* About to connect() to 10.216.80.110 port 448 (#0)
*   Trying 10.216.80.110...
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0* Connected to 10.216.80.110 (10.216.80.110) port 448 (#0)
^C
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# timeout 5 bash -c "echo > /dev/tcp/10.216.80.110/448" && echo "CONECTOU" || echo "FALHOU"
CONECTOU
[root@caddeapllx2484 p585600]#
