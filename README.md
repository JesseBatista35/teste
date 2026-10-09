Análise: a aplicação sipdm-api-estudante (DES, namespace sipdm-des) retornava HTTP 500 porque não conseguia conectar ao SQL Server do PDM (CRJDEDADNT009 – 10.116.100.127:1433, banco PDMDB001). O log apresentava SQLServerException: Connect timed out em todas as operações com banco.

Causa: o namespace sipdm-des sai para a rede com o egress IP dedicado 10.116.221.183, que não possui regra de firewall liberando acesso ao banco. Foram validados:

teste TCP do pod para o banco → timeout;
teste a partir do bastion → sucesso (banco ativo);
ausência de NetworkPolicy ou EgressNetworkPolicy no namespace.

Ação: registrada solicitação de regra de firewall ID 98173 (origem 10.116.221.183 → destino 10.116.100.127, TCP/1433), em aprovação.

Após a aplicação da regra, a aplicação volta a conectar ao banco automaticamente, sem necessidade de redeploy. Para validar: timeout 5 bash -c '</dev/tcp/10.116.100.127/1433' de dentro do pod.

E a mensagem para o Flávio:

Depois que a regra for executada, lembre de validar em até 24h: a CETEL encerra a tarefa de validação por decurso de prazo.
