# backend respondendo na 80 (o monitor do VIP depende disso)
curl -I http://10.116.202.54/

# HTTPS via VIP, forçando o nome (simula o DNS já apontado)
curl -vk --resolve siemp.des.caixa:443:10.116.180.9 https://siemp.des.caixa/siemp_java_web/
