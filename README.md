curl -vk https://127.0.0.1/sicmu 2>&1 | head -20


ls /opt/httpd/conf.d/old/ | grep -v sample


cat /opt/httpd/conf.d/old/ssl.conf.disabled | grep -v "^#\|^$" | head -40
