curl -sv  -H "Host: sibdo-web.esteiras.des.caixa" http://localhost/  -o /dev/null
curl -svL --max-redirs 5 http://localhost/ -o /dev/null      # confirma se é loop
curl -skv https://localhost/ -o /dev/null                    # Apache na 443
curl -skv -H "Host: sibdo-web.esteiras.des.caixa" https://localhost/sibdo/ -o /dev/null
grep -RniE 'ServerName|VirtualHost|Redirect|RewriteRule|ProxyPass' /opt/httpd/conf* 2>/dev/null




nc -zv 10.116.202.37 443      # backend direto
nc -zv 10.116.202.37 80
nc -zv 10.116.181.213 443     # VIP
