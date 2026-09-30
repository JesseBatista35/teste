Prezados,

Concluída a análise com evidências de dentro do cluster OCP-Plus (nctvmrh001):

O namespace sispl-des sai pelo EgressIP 10.190.160.208 (sispl-des-egress), e o sispl-tqs pelo 10.190.160.209.
Um teste TCP de dentro do namespace sispl-des para sicsn.caixa:443 (10.221.142.2) falhou por timeout. O mesmo teste a partir do bastion conecta normalmente, então o cofre está operacional.
O init container secrets-agent-sidecar registra ConnectTimeout em /BeyondTrust/api/public/v3/Auth/connect/token. O erro "Nao foram encontrados arquivos com segredos" é consequência dessa falha.

Não há problema de pipeline nem de credencial. Solicitamos a abertura de regra de firewall:

Origem: 10.190.160.208, 10.190.160.209 (e 10.190.160.210, HMP)
Destino: objeto COFRE_BEYOND_TRUST (incluindo a VIP 10.221.142.2)
Porta: TCP/443

Após a liberação, o pod precisará ser recriado para buscar os segredos novamente.

Atenciosamente,
Esteira DevOps DES TQS NPRD
