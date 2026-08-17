Pessoal, bom dia.

Precisamos que seja solicitada uma regra de firewall no portal Regras Telecom (regras.telecom.caixa) para liberar o acesso à aplicação SIMRC.

O acesso ao sistema simrc-backend está funcionando normalmente via VPN, porém não é possível acessar a partir da rede presencial (prédio Caixa - Rio de Janeiro), o que indica ausência de regra de firewall liberando essa origem até o destino. Já validamos diretamente no servidor de destino que a aplicação está em execução e respondendo normalmente, descartando problema de aplicação.

Dados para abertura da regra:

Origem:
Hostname: caddeapllx2423.agil.nprd.caixa.gov.br

Destino:
Hostname: simrc-backend.esteiras.des.caixa
IP: 10.116.181.121
Máscara: 255.255.255.255

Protocolo: TCP
Porta: 8443

Sistema/serviço envolvido: SIMRC (simrc-backend)
Unidade: CESTI

Qualquer dúvida ou informação adicional necessária para a validação, estou à disposição.

Obrigado!
