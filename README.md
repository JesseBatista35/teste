sudo systemctl status apache2
sudo netstat -tulpn 2>/dev/null | grep -E ":(80|443|8080)"
sudo systemctl status tomcat
sudo ps aux | grep -i java | grep -v grep


ssh caddeapllx2673.agil.nprd.caixa.gov.br
# ou 
ssh p585600@caddeapllx2673.agil.nprd.caixa.gov.br
