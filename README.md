ps aux | grep -E "siavl-httpd|siavl02-httpd|siavl03-httpd|siavl04-httpd|siavl05-httpd" | grep -v inter


curl -i -X OPTIONS https://agenciadigital.des.caixa:8002/siavl-web/index.html -H "Origin: https://exemplo.com"
