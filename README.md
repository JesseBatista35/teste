nslookup sicia.caixa
nslookup piloto.sicia.caixa

curl -k -s -o /dev/null -w '%{http_code}\n' https://10.123.40.149/login
curl -k -s -o /dev/null -w '%{http_code}\n' https://10.123.40.149:8443/login

