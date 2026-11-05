À CAIXA,

Prezados

Realizada a análise do redirecionamento cruzado entre as instâncias Online e Batch do SIGEC Portabilidade em DES, no Apache novo caddeapllx2794 (10.116.78.14), membro do service group LB_SG_10.116.81.7_HTTP_80 (VIP 10.116.81.7, URLs sigec.des.caixa e sigecpor2.des.caixa).

Causa: em 07/10 foram removidas as diretivas ProxyPass dos vhosts sigec.des.caixa (balancer mycluster_sigec, Batch) e sigecpor2.des.caixa (balancer mycluster_sigec2, Online). Sem elas, o mod_cluster roteava o contexto /gec-web/por para qualquer node registrado, porque as duas instâncias publicam o mesmo contexto. Isso provocava o redirecionamento do Online para o Batch e vice-versa.

Correção aplicada no caddeapllx2794:

restauradas as diretivas ProxyPass/ProxyPassReverse dos dois vhosts, iguais às dos Apaches sbrdeaprlx052/053;
incluída a diretiva CreateBalancers 1 no mod_cluster.conf, para que cada vhost use apenas o balancer definido no seu ProxyPass.

As versões anteriores dos arquivos foram preservadas com o sufixo .antes_fix_20261103.

Validação: em testes diretos no servidor (15 requisições por URL), sigec.des.caixa foi atendido sempre pelo node sigec-portabilidade-batch_node1_lx104 e sigecpor2.des.caixa sempre pelo node sigec-portabilidade2_node1_lx104.

Por decisão conjunta, o membro 10.116.78.14 permanece desabilitado no balanceamento, com o atendimento feito pelos Apaches sbrdeaprlx052/053. O servidor já está configurado corretamente para uma eventual reinclusão.

Atenciosamente,
Jessé Batista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
