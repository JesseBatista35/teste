Ou se preferir, veja o que está nos arquivos do Apache na máquina agora:
bashfind /opt/httpd/conf.d/ -name "*.conf" ! -path "*/old/*" | xargs ls -lah
bashcat /opt/httpd/conf.d/vhost.conf
