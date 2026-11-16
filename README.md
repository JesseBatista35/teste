Oi Vitor, ótimo, DNS de DES concluído! 🙌

Para TQS, vamos uma etapa por vez, para não repetir o que aconteceu em DES. Os VIPs ainda não existem, então o primeiro passo é só criar os VIPs, porque é isso que gera o IP. Certificado e DNS ficam para depois que a Rede concluir.

Como abrir (uma REQ para cada URL):

No SIGSC, busque “data center” e abra Suporte à Rede Data Center.
Preencha:
• Qual o tipo de serviço? → Alterar configurações em balanceador
• Detalhe do serviço → VIP
• Atividade a ser executada → Solicitar inclusão de VIP
• Data e hora de execução → hoje
• Prazo final do atendimento → daqui a uma semana
Na Descrição, cole o texto correspondente:

REQ 1 – Intranet
Criação de VIP para a URL sigsj-intranet.tqs.caixa (TQS)
Apontamento/Balanceamento para o servidor:
IP: 10.116.202.53
HOST: caddeapllx2863.agil.nprd.caixa.gov.br
Porta 80
http://sigsj-intranet.tqs.caixa → https://sigsj-intranet.tqs.caixa

REQ 2 – Internet
Criação de VIP para a URL sigsj-internet.tqs.caixa (TQS)
Apontamento/Balanceamento para o servidor:
IP: 10.116.202.55
HOST: caddeapllx2865.agil.nprd.caixa.gov.br
Porta 80
http://sigsj-internet.tqs.caixa → https://sigsj-internet.tqs.caixa

REQ 3 – Boleto
Criação de VIP para a URL sigsj-boleto.tqs.caixa (TQS)
Apontamento/Balanceamento para o servidor:
IP: 10.116.202.52
HOST: caddeapllx2862.agil.nprd.caixa.gov.br
Porta 80
http://sigsj-boleto.tqs.caixa → https://sigsj-boleto.tqs.caixa

Assim que a Rede concluir e informar o IP de cada VIP, seguimos com o certificado (já com o IP do VIP) e depois com o DNS. Me passa os números quando abrir. Valeu!
