Vamos achar onde:
bashfind /opt/httpd/conf -type f | xargs grep -l "SSLCertificate\|ssl_certificate" 2>/dev/null
bashgrep -r "SSLCertificate\|SSLEngine\|443" /opt/httpd/conf/ 2>/dev/null | grep -v "^#"
bashgrep -r "SSLCertificate\|SSLEngine" /opt/httpd/conf.modules.d/ 2>/dev/null | grep -v "^#"
bash# Ver todos os arquivos de configuração ativos
find /opt/httpd/conf -name "*.conf" | xargs grep -l "SSL\|443" 2>/dev/null
O certificado *.esteiras.des.caixa tem que estar referenciado em algum arquivo de configuração do Apache para ter funcionado no curl. Precisa achar esse arquivo para montar o bloco 443 correto no vhost.conf.
