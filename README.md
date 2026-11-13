Isso, o boleto é aberto pelo mesmo formulário TE079, igual ao intranet e ao internet. Ele vai preenchido assim:

Campo	Valor
CN (URL)	sigsj-boleto.des.caixa
Autoridade Certificadora	AC Interna
Ambiente	DES
Sistema	SIGSJ
CSR emitido pela Caixa	Sim
Local de instalação	Balanceador
Outro local	Não
Janela	início hoje, fim alguns dias úteis à frente
Instalado na Caixa	Sim, CAIXA / CESOA / Comunidades CESOA
Indisponibilidade	Não

Dados Complementares:

Novo certificado para instalação em VIP.

• FQDN: sigsj-boleto.des.caixa (ainda sem DNS; a resolução será criada após a instalação)
• IP do VIP: 10.116.181.215
• Balanceador: CADDEAPRLB003-1
• Vserver SSL: LB_VS_10.116.181.215_SSL_443
• Nome sugerido: CT2026_SIGSJ-BOLETO.DES.CAIXA_WO82200691
• VIP criado pela Rede na WO0000082200691, sem certificado.

Favor gerar o certificado e seguir com a instalação no VIP.

Quando abrir, me passa o número, junto com os do intranet (o novo) e do internet, que eu monto a mensagem para a sala.
