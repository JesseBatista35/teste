A comparação precisa ser feita em outra máquina com agente de DES funcionando, como o caddeapllx2695. Faça ssh nele, troque para o ctmagelx e rode:

bash
grep -E "CTMSHOST|CTMPERMHOSTS|AGENT_TO_SERVER_PORT|SERVER_TO_AGENT_PORT" ~/ctm/data/CONFIG.dat
getent hosts crjdeaprlx038 crjdeaprlx039
grep -i crjdeaprlx /etc/hosts
ag_diag_comm | grep -iE "server host|port|ping"

Aqui no 2501 ainda falta testar a resolução pelo FQDN:

bash
getent hosts crjdeaprlx038.corerj.caixa
getent hosts crjdeaprlx038.agil.nprd.caixa.gov.br

O objetivo é descobrir qual IP o agente que funciona usa para chegar no crjdeaprlx038. Esse IP correto é o que vai no etc/hosts-des do config.
