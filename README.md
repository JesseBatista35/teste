Olá, bom dia.

Sobre o problema de acesso ao SIMRC que vocês reportaram (funciona pela VPN, mas não na rede presencial do prédio Caixa - RJ): já validamos que a aplicação está em execução normalmente no servidor, então o problema é falta de regra de firewall liberando o acesso a partir da rede de vocês até o servidor.

Como o solicitante da regra precisa ser de quem está tentando o acesso, peço que vocês mesmos abram a solicitação no portal Regras Telecom (regras.telecom.caixa), na opção "Inclusão de Regras".

Dados que já temos para o campo Destino:

Hostname: simrc-backend.esteiras.des.caixa
IP: 10.116.181.121
Máscara: 255.255.255.255
Protocolo: TCP
Porta: 8443

O que falta preencher é o campo Origem, com o IP e a máscara de sub-rede da rede/estação de onde partiu o acesso com falha. Para isso, rodem o comando "ipconfig" na estação que apresentou o erro e usem o Endereço IPv4 e a Máscara de sub-rede exibidos.

Na justificativa, pode-se descrever: acesso ao sistema SIMRC (simrc-backend) funciona via VPN mas apresenta timeout a partir da rede presencial do prédio; aplicação já validada como ativa e respondendo normalmente no servidor de destino, indicando ausência de regra de firewall.

Qualquer dúvida no preenchimento, estamos à disposição.

Obrigado!
