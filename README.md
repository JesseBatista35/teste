Adriano da Silva Fernandes, obrigado pela captura!

Um ponto importante: nos SYNs sem resposta (linhas 64/65/69/70), a origem é 10.116.208.104, que é o IP do nó ceadecldlx084, e não o egress IP 10.116.221.183 da regra. Esses SYNs não recebem SYN-ACK. O pod do sipdm-api-estudante está rodando justamente nesse nó (ceadecldlx084), que é o mesmo que hospeda o egress IP.

Estou pronto para o teste. Assim que você montar a captura (filtro dst host 10.116.100.127 and port 1433), me avisa aqui que eu inicio o teste em loop a partir do pod, com uma tentativa a cada 2 segundos.

O que precisamos ver: qual IP de origem aparece nos SYNs durante o teste, 10.116.221.183 ou 10.116.208.104.




oc rsh -n sipdm-des sipdm-api-estudante-des-266-qlttf
while true; do date +%T; timeout 3 bash -c '</dev/tcp/10.116.100.127/1433' && echo OK || echo FALHOU; sleep 2; done
