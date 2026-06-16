
[root@caddeapllx2484 p585600]# curl -v https://127.0.0.1:443/sicmu 2>&1 | head -20
* About to connect() to 127.0.0.1 port 443 (#0)
*   Trying 127.0.0.1...
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0* Connected to 127.0.0.1 (127.0.0.1) port 443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
*   CAfile: /etc/pki/tls/certs/ca-bundle.crt
  CApath: none
* NSS error -12263 (SSL_ERROR_RX_RECORD_TOO_LONG)
* SSL received a record that exceeded the maximum permissible length.
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
* Closing connection 0
curl: (35) SSL received a record that exceeded the maximum permissible length.
[root@caddeapllx2484 p585600]#
