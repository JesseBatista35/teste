find /opt/httpd/conf.d -type f

find /opt/httpd -iname "*.conf" 2>/dev/null | grep -v conf.modules.d

grep -rl -i siarg /opt/httpd/conf/

tail -100 /logs/httpd/siarg-interno.caixa-error.log
