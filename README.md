2. Abrir a nova REQ do intranet

Os campos do formulário ficam iguais aos que você usou, só os dados complementares mudam:

Campo	Valor
CN (URL)	sigsj-intranet.des.caixa
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

Nova solicitação referente à REQ000146906949 / WO0000082188297, encerrada por ausência do IP do VIP.

• FQDN: sigsj-intranet.des.caixa (ainda sem DNS; a resolução será criada após a instalação)
• IP do VIP: 10.116.180.8
• Balanceador: CADDEAPRLB003-1
• Vserver SSL: LB_VS_10.116.180.8_SSL_443
• Nome sugerido: CT2026_SIGSJ-INTRANET.DES.CAIXA_WO82200842
• VIP criado pela Rede na WO0000082200842, que aguarda o certificado.

Favor gerar o certificado e seguir com a instalação no VIP.

3. Abrir a REQ do internet

Mesmo formulário, com CN (URL) = sigsj-internet.des.caixa.

Dados Complementares:

Nova solicitação referente à REQ000146906957 / WO0000082187699, encerrada por ausência do IP do VIP. O certificado (PKCS#12) já foi disponibilizado pela CEPRO na WO0000082187699.

• FQDN: sigsj-internet.des.caixa (ainda sem DNS; a resolução será criada após a instalação)
• IP do VIP: 10.116.181.214
• Balanceador: CADDEAPRLB003-1
• Vserver SSL: LB_VS_10.116.181.214_SSL_443
• Nome sugerido: CT2026_SIGSJ-INTERNET.DES.CAIXA_WO82201229
• VIP criado pela Rede na WO0000082201229, sem certificado.

Favor seguir com a instalação do certificado no VIP.

4. Abrir a REQ do boleto

Mesmo formulário, com CN (URL) = sigsj-boleto.des.caixa.

Dados Complementares:

Novo certificado para instalação em VIP.

• FQDN: sigsj-boleto.des.caixa (ainda sem DNS; a resolução será criada após a instalação)
• IP do VIP: 10.116.181.215
• Balanceador: CADDEAPRLB003-1
• Vserver SSL: LB_VS_10.116.181.215_SSL_443
• Nome sugerido: CT2026_SIGSJ-BOLETO.DES.CAIXA_WO82200691
• VIP criado pela Rede na WO0000082200691, sem certificado.

Favor gerar o certificado e seguir com a instalação no VIP.

5. Avisar na sala

Depois de abrir as três:

Pessoal, as REQs de certificado do intranet (REQ000146906949) e do internet (REQ000146906957) foram encerradas porque o FQDN ainda não tem DNS e faltava o IP do VIP. Abri novas solicitações já com VIP, balanceador e nome sugerido:
• sigsj-intranet.des.caixa → VIP 10.116.180.8 – REQ <nº>
• sigsj-internet.des.caixa → VIP 10.116.181.214 – REQ <nº>
• sigsj-boleto.des.caixa → VIP 10.116.181.215 – REQ <nº>
Após a instalação dos certificados, sigo com as REQs de DNS.

6. Depois da instalação dos certificados
Abrir as REQs de DNS: cada URL apontando para o IP do seu VIP.
Ajustar as variáveis de URL nas releases e rodar o DES.
Validar com nslookup <url> e https://<url>/<contexto>/.
Repetir todo o fluxo para TQS.

Me passa os três números de REQ quando abrir, que eu fecho a mensagem da sala.
