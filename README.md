Oi Vitor, ótimo, DNS de DES concluído! 🙌

Para TQS, vamos fazer uma etapa por vez, para não repetir o que aconteceu em DES. Os VIPs ainda não existem, então o primeiro passo é só a criação dos VIPs, que é o que gera o IP. Pode abrir as 3 REQs abaixo?

Serviço: Alterar configurações em balanceador → VIP → Solicitar inclusão de VIP (o mesmo usado em DES)

1. Intranet
Criação de VIP para a URL sigsj-intranet.tqs.caixa (TQS)
Apontamento/Balanceamento para o servidor:
IP: 10.116.202.53
HOST: caddeapllx2863.agil.nprd.caixa.gov.br
Porta 80
http://sigsj-intranet.tqs.caixa → https://sigsj-intranet.tqs.caixa

2. Internet
Criação de VIP para a URL sigsj-internet.tqs.caixa (TQS)
Apontamento/Balanceamento para o servidor:
IP: 10.116.202.55
HOST: caddeapllx2865.agil.nprd.caixa.gov.br
Porta 80
http://sigsj-internet.tqs.caixa → https://sigsj-internet.tqs.caixa

3. Boleto
Criação de VIP para a URL sigsj-boleto.tqs.caixa (TQS)
Apontamento/Balanceamento para o servidor:
IP: 10.116.202.52
HOST: caddeapllx2862.agil.nprd.caixa.gov.br
Porta 80
http://sigsj-boleto.tqs.caixa → https://sigsj-boleto.tqs.caixa

Assim que a Rede concluir e informar o IP de cada VIP, seguimos com o certificado (já com o IP do VIP) e depois com o DNS. Me passa os números quando abrir. Valeu!

Próximas etapas, para depois que os VIPs forem concluídos:

Certificado: a emissão, já informando o IP do VIP, e em seguida o TE079 de instalação.
DNS: cada URL apontando para o IP do seu VIP.
Esteira: ajustar as variáveis de URL no EC TQS e rodar as releases.
