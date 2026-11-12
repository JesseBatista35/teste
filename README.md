1. Ver os erros recentes (na 2864)
sudo grep -nE "ERROR|Caused by" /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | tail -30
2. Gerar um arquivo com o log de hoje para mandar ao Denilson
sudo tail -n 5000 /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log > /tmp/siemp-server-log.txt && sudo chmod 644 /tmp/siemp-server-log.txt && ls -lh /tmp/siemp-server-log.txt

Copie o arquivo /tmp/siemp-server-log.txt para a sua estação (WinSCP ou o que você costuma usar) e anexe no Teams.

Se ele passar o horário, por exemplo 15:20, dá para mandar só o trecho daquele momento:

sudo grep -n -A30 "15:2[0-9]:" /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | grep -E -A15 "ERROR|Exception" | head -150

Antes de mandar, dê uma olhada rápida se não aparece senha no trecho, por exemplo em URL de datasource ou em parâmetros.
