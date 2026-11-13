Próximos passos

1. Ver como estão as outras REQs de certificado.

REQ000146906957 (internet): confira se foi encerrada pelo mesmo motivo. É provável, porque foi aberta antes de o VIP existir.
Boleto: confira se existe REQ de certificado. Se não existir, abra agora.

2. Abrir uma nova demanda de instalação de certificado (TE079) para cada URL, já com o IP do VIP. Use o mesmo tipo da REQ000146906949, que a CEPRO chama de “instalação”. O texto é igual para as três, trocando só os dados:

Instalação de certificado digital no VIP – sigsj-intranet.des.caixa

Reabertura da REQ000146906949, encerrada por ausência de informação (IP do VIP).

• FQDN: sigsj-intranet.des.caixa
• IP do VIP: 10.116.180.8
• Balanceador: CADDEAPRLB003-1
• Vserver: LB_VS_10.116.180.8_SSL_443
• VIP criado na WO0000082200842 (Rede), que aguarda o certificado para concluir.

Favor importar o certificado no balanceador e disponibilizá-lo para vínculo ao VIP.

FQDN	IP do VIP	Vserver	WO do VIP	Observação
sigsj-intranet.des.caixa	10.116.180.8	LB_VS_10.116.180.8_SSL_443	WO0000082200842 (aberta)	reabertura da REQ000146906949
sigsj-internet.des.caixa	10.116.181.214	LB_VS_10.116.181.214_SSL_443	WO0000082201229 (encerrada sem certificado)	nome sugerido: CT2026_SIGSJ-INTERNET.DES.CAIXA_WO82201229
sigsj-boleto.des.caixa	10.116.181.215	LB_VS_10.116.181.215_SSL_443	WO0000082200691 (encerrada sem certificado)	nome sugerido: CT2026_SIGSJ-BOLETO.DES.CAIXA_WO82200691

3. Responder na sala, com os números das REQs novas depois de abrir:

Pessoal, sobre a REQ000146906949: a CEPRO encerrou por falta do IP do VIP. Abri novas demandas de instalação de certificado já informando os IPs dos VIPs:
• sigsj-intranet.des.caixa → VIP 10.116.180.8 – REQ <número>
• sigsj-internet.des.caixa → VIP 10.116.181.214 – REQ <número>
• sigsj-boleto.des.caixa → VIP 10.116.181.215 – REQ <número>

Assim que os certificados forem instalados, sigo com as REQs de DNS.

4. Depois dos certificados:

REQs de DNS, cada URL apontando para o IP do seu VIP;
ajustar as variáveis de URL nas releases;
testar com nslookup <url> e acessar https://<url>/<contexto>/.
