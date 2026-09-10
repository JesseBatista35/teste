Jonathan, obrigado pela captura — ela na verdade fecha o quadro em vez de contradizer o que achamos.

Sua captura mostra o TLS completando normalmente com o VIP 10.116.180.64, e só ~10s depois o lado SIGAQ fecha a conexão (FIN) — isso bate exatamente com o timeout de 15s que vemos na aplicação.

Só que reparamos uma coisa: 10.116.180.64 não é nenhum dos 4 nós reais do Router OpenShift (que estão em 10.116.208.26-29, outra sub-rede) — é um VIP/balanceador na frente deles. E nas nossas capturas feitas direto nos 4 nós, sem filtro de IP de destino, não chegou nenhum pacote dessa sub-rede da AKS, na mesma janela dos testes.

Isso indica que a conexão completa o TLS no nível do VIP, mas não está sendo encaminhada para nenhum backend real — sugere problema no próprio balanceador (health check de backend, persistência de sessão, ou pool sem membro saudável), não mais firewall/rota.

Você sabe quem administra esse VIP/LB especificamente (F5 ou equivalente)? Precisamos verificar se o pool de backends dele está apontando corretamente para os 4 nós do Router e se algum deles está marcado como unhealthy
