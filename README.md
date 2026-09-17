curl -k -v -H "Host: sigfi2.desenvolvimento.extracaixa" https://10.116.84.136/ecr-web/resources/app-content/css/bootstrap.css -o /dev/null


Microsoft Windows [versão 10.0.26200.9106]
(c) Microsoft Corporation. Todos os direitos reservados.

C:\Users\p585600>curl -k -v -H "Host: sigfi2.desenvolvimento.extracaixa" https://10.116.84.136/ecr-web/resources/app-content/css/bootstrap.css -o /dev/null
*   Trying 10.116.84.136:443...
* connect to 10.116.84.136 port 443 from 0.0.0.0 port 54145 failed: Connection refused
* Failed to connect to 10.116.84.136:443 after 2078 ms: Could not connect to server
* closing connection #0
curl: (7) Failed to connect to 10.116.84.136:443 after 2078 ms: Could not connect to server

C:\Users\p585600>


[root@sbrdeapllx093 p585600]#
[root@sbrdeapllx093 p585600]#
[root@sbrdeapllx093 p585600]# curl -k -v -H "Host: sigfi2.desenvolvimento.extracaixa" https://10.116.84.136/ecr-web/resources/app-content/css/bootstrap.css -o /dev/null
* About to connect() to 10.116.84.136 port 443 (#0)
*   Trying 10.116.84.136... Connection refused
* couldn't connect to host
* Closing connection #0

curl: (7) couldn't connect to host
[root@sbrdeapllx093 p585600]#
[root@sbrdeapllx093 p585600]#
[root@sbrdeapllx093 p585600]#
