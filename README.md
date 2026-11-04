Mensagem para o grupo:

Pessoal, atualização: movi o pod para outro nó do cluster (agora sipdm-api-estudante-des-266-5n6s8, no ceadecldlx052) para testar a hipótese de o problema ser causado pelo pod estar no mesmo nó do egress IP. O teste para 10.116.100.127:1433 continua em timeout, então essa hipótese foi descartada.

Adriano da Silva Fernandes, preciso de mais uma captura (dst host 10.116.100.127 and port 1433) para ver qual IP de origem aparece agora: 10.116.208.104, 10.116.208.72 (IP do novo nó) ou 10.116.221.183. Me avisa quando montar que eu rodo o teste em loop a partir do pod. Com essa informação, sabemos se o ajuste é na regra, no OpenShift ou no servidor de destino.

Quando ele avisar, rode dentro do pod:

bash
while true; do date +%T; timeout 3 bash -c '</dev/tcp/10.116.100.127/1433' && echo OK || echo FALHOU; sleep 2; done
Como o Claude está se saindo nesta sessão?
