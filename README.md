O certificado não existe nesse caminho. Vamos achar onde estão os certificados reais:
bashfind /opt/httpd /etc/pki -name "*.crt" -o -name "*.pem" 2>/dev/null | grep -v "ca-bundle\|trust\|katello\|legacy" | head -20
bashfind /opt/httpd -name "*.crt" -o -name "*.key" 2>/dev/null
