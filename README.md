Boa, Vitor! Isso mesmo. Os VIPs do internet e do boleto foram criados, então já pode abrir a Solicitar Certificado Digital – CSR – TE079 para esses dois. O do intranet fica para quando a REQ000147073839 for concluída.

Para evitar o vai-e-volta que tivemos em DES, coloca na descrição os dados do VIP e pede que, depois de emitido, o certificado seja instalado no VIP:

Internet
Emissão de certificado digital para sigsj-internet.tqs.caixa (TQS), com instalação no VIP após a emissão.
VIP: 10.116.181.220
Balanceador: CADDEAPRLB003
Vserver: LB_VS_10.116.181.220_SSL_443
VIP criado na REQ000147074676 / WO0000082325423 (hoje em DOWN aguardando o certificado).

Boleto
Emissão de certificado digital para sigsj-boleto.tqs.caixa (TQS), com instalação no VIP após a emissão.
VIP: 10.116.181.221
Balanceador: CADDEAPRLB003
Vserver: LB_VS_10.116.181.221_SSL_443
VIP criado na REQ000147074916 / WO0000082324980 (hoje em DOWN aguardando o certificado).

Um ponto de atenção no boleto: o VIP 10.116.181.221 foi criado com o comentário “SIBDO-WEB.ESTEIRAS.DES.CAIXA”. O apontamento está correto (backend 10.116.202.52:80, a VM do boleto), então parece só o comentário copiado de outra REQ. Vale pedir na WO0000082324980 a correção do comentário para “SIGSJ-BOLETO.TQS.CAIXA”, para não confundir na hora da instalação do certificado.

O DNS a gente só abre depois que o certificado estiver no VIP. Me passa os números quando abrir. Valeu!
