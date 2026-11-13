1. Intranet: reabrir o pedido de instalação do certificado

O certificado já foi gerado e só falta instalar.

Tente reabrir a REQ000146906949. Se o sistema não deixar, abra uma REQ nova do mesmo tipo.
Texto:

Reabertura da REQ000146906949 / WO0000082187699, encerrada por ausência do IP do VIP. O certificado (PKCS#12) já foi disponibilizado pela CEPRO na WO0000082187699.
• FQDN: sigsj-intranet.des.caixa (ainda sem DNS)
• IP do VIP: 10.116.180.8
• Balanceador: CADDEAPRLB003-1 — Vserver SSL: LB_VS_10.116.180.8_SSL_443
• VIP criado na WO0000082200842, que aguarda o certificado.
Favor seguir com a instalação no VIP.

2. Internet: ver a REQ000146906957 e pedir a instalação
Abra o histórico da WO dela.
Se o certificado foi gerado e a demanda fechou por falta do VIP, que é o mais provável: reabra ou abra uma nova com o mesmo texto do passo 1, trocando:
FQDN: sigsj-internet.des.caixa
IP do VIP: 10.116.181.214, vserver LB_VS_10.116.181.214_SSL_443
VIP criado na WO0000082201229
Se ainda estiver aberta: inclua uma nota informando o IP do VIP.
3. Boleto: abrir a REQ de certificado (TE079)

O certificado do boleto nunca foi gerado.

Certificado digital para sigsj-boleto.des.caixa (DES) – instalação em VIP
• FQDN: sigsj-boleto.des.caixa (ainda sem DNS)
• IP do VIP: 10.116.181.215
• Balanceador: CADDEAPRLB003-1 — Vserver SSL: LB_VS_10.116.181.215_SSL_443
• VIP criado na WO0000082200691, sem certificado. Nome sugerido: CT2026_SIGSJ-BOLETO.DES.CAIXA_WO82200691.
Favor gerar o certificado e seguir com a instalação no VIP.

4. Avisar na sala

Faça isso logo depois de abrir as REQs:

Pessoal, verifiquei as demandas de certificado:
• Intranet: o certificado já tinha sido gerado, mas a instalação parou porque o FQDN ainda não tem DNS e o IP do VIP não foi informado. Reabri/abri a REQ <número> informando o VIP 10.116.180.8.
• Internet: REQ <número> com o VIP 10.116.181.214.
• Boleto: o certificado não havia sido solicitado; abri a REQ <número> com o VIP 10.116.181.215.
Após a instalação dos certificados, sigo com as REQs de DNS.

5. Quando os certificados estiverem instalados
Abrir as REQs de DNS:
sigsj-intranet.des.caixa → 10.116.180.8
sigsj-internet.des.caixa → 10.116.181.214
sigsj-boleto.des.caixa → 10.116.181.215
Ajustar as variáveis de URL (URL_CUSTOMIZADA, URL_ALIAS, URL_REDIRECT, URL_REWRITE) nas três releases e rodar o DES.
Testar com nslookup <url>, que deve retornar o IP do VIP, e abrindo https://<url>/<contexto>/ no navegador.
6. Depois: TQS

Mesmo fluxo para as três aplicações em TQS: certificado com o VIP, criação do VIP, DNS e esteira. Também falta aplicar o log4j nas VMs de TQS (2863, 2865 e 2862).

Quando abrir as REQs, me passa os números que eu completo a mensagem da sala.
