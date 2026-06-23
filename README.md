# Conectar ao servidor
ssh p585600@caddeapllx929.agil.nprd.caixa.gov.br

# Verificar status do JBoss
systemctl status jboss
# ou
ps aux | grep jboss

# Verificar conectividade com o load balancer
telnet caddeapllx135.extra.caixa.gov.br 6666
