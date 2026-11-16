Oi Vitor, ótimo, DNS de DES concluído! 🙌

Sobre TQS: os VIPs ainda não foram criados. Para não repetirmos o que aconteceu em DES, a ordem é:

Emissão dos certificados e criação dos VIPs: podem ser abertas agora, em paralelo.
Instalação dos certificados e DNS: só depois que a Rede informar o IP de cada VIP.

Você consegue abrir as 6 REQs abaixo?

1) Emissão do certificado (3 REQs)
Serviço: Solicitar Certificado Digital – CSR – TE079
Campos iguais nas três:

Autoridade Certificadora: AC Interna
Ambiente: TQS
Sistema: SIGSJ
CSR emitido pela Caixa: Sim
Local de instalação: Balanceador
Outro local: Não
Instalado na Caixa: Sim (CAIXA / CESOA / Comunidades CESOA)
Indisponibilidade: Não

Muda em cada uma:

CN: sigsj-intranet.tqs.caixa – Dados complementares: “Emissão de certificado para a URL sigsj-intranet.tqs.caixa (TQS), servidor caddeapllx2863 (10.116.202.53). A instalação no VIP será solicitada via ‘Instalar Certificado Digital Existente – TE079’ após a criação do VIP.”
CN: sigsj-internet.tqs.caixa – mesmo texto, servidor caddeapllx2865 (10.116.202.55)
CN: sigsj-boleto.tqs.caixa – mesmo texto, servidor caddeapllx2862 (10.116.202.52)

2) Criação do VIP (3 REQs)
Serviço: Alterar configurações em balanceador → VIP → Solicitar inclusão de VIP (mesmo usado em DES)
Texto (exemplo do intranet):
“Criação de VIP para a URL sigsj-intranet.tqs.caixa (TQS)
Apontamento/Balanceamento para o servidor:
IP: 10.116.202.53
HOST: caddeapllx2863.agil.nprd.caixa.gov.br
Porta 80
http://sigsj-intranet.tqs.caixa → https://sigsj-intranet.tqs.caixa
Certificado em emissão na REQ <nº da emissão>; a instalação no VIP será solicitada via TE079 após a criação.”

Para os outros dois, troque a URL, o IP e o HOST:

sigsj-internet.tqs.caixa → 10.116.202.55 / caddeapllx2865.agil.nprd.caixa.gov.br
sigsj-boleto.tqs.caixa → 10.116.202.52 / caddeapllx2862.agil.nprd.caixa.gov.br

3) Depois que a Rede informar os IPs dos VIPs

Instalar Certificado Digital Existente – TE079 (uma por URL, informando o IP do VIP, o balanceador e o vserver)
DNS Host (A) (uma por URL, apontando para o IP do VIP)

Quando abrir, me passa os números que eu acompanho junto. Valeu!

Em DES, com o DNS pronto, falta só a instalação dos certificados nas REQs TE079 que o Vitor abriu na sexta. Depois disso, ajustamos as releases e testamos as URLs.
