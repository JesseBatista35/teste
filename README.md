Vamos investigar direto. Me diz qual servidor é o DES (caddeapllx2484) e deixa eu ver o Apache:
bashcurl -vk https://sicmu-intranet-update.esteiras.des.caixa/sicmu 2>&1 | head -30
bashcat /opt/httpd/conf.d/vhost.conf
O 403 que aparece no HTTPS provavelmente é porque o vhost só tem o bloco HTTP (80) e não tem o bloco HTTPS (443) configurado — já identificamos isso antes. Precisa adicionar o bloco 443 no vhost.conf do repositório de config.
Me conecta no servidor e roda esses comandos que a gente resolve agora.Claude Fable 5 está indisponível no momento.
