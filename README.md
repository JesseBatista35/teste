1. Na sua estação: o problema é constante ou intermitente?
nslookup siemp.des.caixa
for /L %i in (1,1,6) do curl -k -s -o NUL -w "%{http_code}\n" https://siemp.des.caixa/siemp/
curl -kvs https://siemp.des.caixa/siemp/ -o NUL 2>&1 | findstr /i "subject issuer HTTP/"
Alterna entre 200 e 404: o VIP tem mais de um servidor no pool, e um deles está errado.
Sempre 404: o problema está no servidor do SIEMP. Siga para o passo 2.
O subject precisa ser siemp.des.caixa.
2. Na VM do SIEMP: caddeapllx2864 (10.116.202.54)

O EAR ainda está implantado?

ls -l /opt/jboss-eap/standalone/deployments/

O esperado é ver o siemp*.ear com um .deployed ao lado. Se aparecer .failed, .undeployed ou se o EAR sumiu, o deploy quebrou.

O que aconteceu no log (deploys, falhas e restarts):

sudo grep -nE "WFLYSRV0010|WFLYSRV0021|WFLYSRV0009|WFLYSRV0025|WFLYSRV0050|ERROR" /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | tail -20

Teste direto no servidor, sem passar pelo VIP:

curl -s -o /dev/null -w "%{http_code}\n" http://localhost/siemp/
curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8080/siemp/
3. No Azure DevOps

Veja na release do SIEMP-java-web se rodou algum deploy depois das 10:35 hoje, e quem disparou.

Me mande as saídas dos passos 1 e 2. Com elas eu te digo se a correção é redeploy do EAR, ajuste no pool do VIP ou algo na configuração que mudaram.
