# portas escutando (8080/8443 do JBoss, 80/443 se tiver Apache na frente)
sudo ss -tlnp | egrep ':80 |:443 |:8080 |:8443 '

# existe Apache/httpd na VM?
ps -ef | grep -E 'httpd|nginx' | grep -v grep

# teste local do que o health-check provavelmente bate
curl -sv  http://localhost:80/      -o /dev/null
curl -sv  http://localhost:8080/    -o /dev/null
curl -skv https://localhost:8443/   -o /dev/null
curl -sv  http://localhost:8080/sibdo/ -o /dev/null   # ajuste o context-root

# firewall local liberando a porta?
sudo firewall-cmd --list-all 2>/dev/null || sudo iptables -L -n | head -30
