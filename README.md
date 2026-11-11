Antes de pedir firewall, preciso ver o que o sifec-intranet do 6.4 usa e se o 6.4 alcança a 4407.

1. No 6.4 (10.116.88.20): URL dos datasources SIBAN/SIFBN em cada profile
sudo awk '/<profile name=/{p=$0} /jndi-name="java:\/jdbc\/Sybase(Siban|Sifbn)DS"/{d=$0} /connection-url/ && d!="" {print NR": "p" | "d" | "$0; d=""}' /opt/jboss/jboss-eap/dc/configuration/domain.xml

E qual profile o sifec-intranet usa no 6.4:

sudo sed -n '57701,57703p' /opt/jboss/jboss-eap/dc/configuration/domain.xml
2. No 6.4: ele alcança a 4407?
timeout 5 bash -c "</dev/tcp/10.116.92.132/4407" && echo OK || echo FALHOU
O que vem depois
Se o profile do sifec-intranet no 6.4 usa 4102/FBNEM1: troco a URL no 7.4 para 4102. É ajuste nosso e não precisa de firewall.
Se usa 4407 e o 6.4 alcança: pedimos regra de firewall de 10.116.97.78 (472) e 10.116.97.79 (473) para 10.116.92.132:4407. Eu monto o texto.
