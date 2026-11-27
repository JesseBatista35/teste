Aguarde um pouco e repita:

bash
ctm_agstat -LIST caddeapllx2501.agil.nprd.caixa.gov.br
ctmping -HOSTID caddeapllx2501.agil.nprd.caixa.gov.br -DISCOVER Y

Enquanto isso, no 2501 (10.116.200.250), confira se a conexão do servidor chegou:

bash
ss -tn '( sport = :7016 or dport = :7015 )'
ls -ltr /opt/ctmage/ctm/dailylog | tail -2

O que esperar:

Available: resolvido. Falta só o time deles tirar o job do Hold (Free) e testar.
Se continuar em Discovering ou mudar para Unavailable depois de uns 2 minutos: me manda a saída do ctmping e o resultado do ss no 2501. Se nada chegar na 7016, o problema volta a ser de rede no sentido servidor → agente.
