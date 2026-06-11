Então o Apache mesmo está na 443. Vamos ver o que ele retorna no acesso direto ao IP:
bashcurl -vk https://127.0.0.1/sicmu 2>&1 | head -20
bashgrep -r "SSLCertificate\|SSLEngine\|ssl" /opt/httpd/conf.modules.d/ 2>/dev/null | head -10
bashls /opt/httpd/conf.modules.d/
