ps aux | grep "siavl04-httpd" | grep -v inter


curl -ik -X OPTIONS https://agenciadigital4.des.caixa:8025/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"


