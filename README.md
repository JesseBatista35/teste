Vamos verificar:
bashcurl -vk https://sicmu-intranet-update.esteiras.des.caixa/sicmu 2>&1 | head -30
bash# Ver qual processo está escutando na porta 443
ss -tlnp | grep 443
bash# Achar o Apache/proxy
ps aux | grep -iE "httpd|apache|nginx|haproxy"
bash# Achar os vhosts
find /etc -name "*.conf" 2>/dev/null | xargs grep -l "sicmu-intranet-update" 2>/dev/null
O Apache provavelmente não está instalado nessa máquina — o httpd.service could not be found confirma isso. O proxy/SSL pode estar em outra máquina ou o IP 10.116.180.22 pode ser um load balancer. Me manda o resultado desses comandos.
