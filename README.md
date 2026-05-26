Solução para o DES — execute no servidor caddeapllx135:
1. Primeiro faça backup:
bashsudo cp /opt/jbcs-httpd24-2.4/httpd/sites-available/httpd-eap71-des-sigpf-internet.conf \
        /opt/jbcs-httpd24-2.4/httpd/sites-available/httpd-eap71-des-sigpf-internet.conf.bkp.$(date +%Y%m%d)
2. Adicione o bloco Proxy com sed:
bashsudo sed -i 's|RewriteRule \^/\$ /sigpf_internet \[R\]|RewriteRule ^/$ /sigpf_internet [R]\n\n  <Proxy balancer://sigpf-internet>\n      BalancerMember http://10.116.194.61:8080 retry=180 connectiontimeout=1000ms ping=500ms\n      ProxySet stickysession=JSESSIONID\|jsessionid\n  </Proxy>|' /opt/jbcs-httpd24-2.4/httpd/sites-available/httpd-eap71-des-sigpf-internet.conf
3. Verifique se ficou correto:
bashcat /opt/jbcs-httpd24-2.4/httpd/sites-available/httpd-eap71-des-sigpf-internet.conf
4. Teste e recarregue o Apache:
bashsudo /opt/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest && \
sudo /opt/jbcs-httpd24-2.4/httpd/sbin/apachectl graceful
5. Teste a aplicação:
bashcurl -sk https://sigpf-internet.esteiras.des.caixa/sigpf_internet/ -o /dev/null -w "%{http_code}"
Esperamos 302 em vez de 403. Me traz o resultado!
