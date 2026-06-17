sudo netstat -tulpn | grep -E ":(80|443|8080|8443)"

curl -k -v https://localhost:8443/

curl -k -v https://localhost:443/
