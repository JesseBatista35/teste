Boa tarde, Flávio!

Sim, ficou faltando a instalação dos certificados. Segue o status consolidado e os próximos passos:

🌐 Situação dos VIPs (DES)
• sigsj-internet.des.caixa → VIP 10.116.181.214 (WO0000082201229 – encerrada)
• sigsj-boleto.des.caixa → VIP 10.116.181.215 (WO0000082200691 – encerrada)
• sigsj-intranet.des.caixa → VIP 10.116.180.8 (WO0000082200842 – em andamento)

Os três VIPs já foram criados pela Rede, apontando para as VMs na porta 80. As WOs do internet e do boleto foram encerradas após a criação, mas com o script retificado para sair sem certificado, pois ele ainda não havia sido gerado. A própria Rede registrou que esses VIPs ficam DOWN até a instalação do certificado.
A WO do intranet segue aberta aguardando a Segurança disponibilizar o certificado no balanceador (REQ000146906949).

📌 Próximos passos
1. Intranet: cobrar na WO0000082200842 e na REQ000146906949 a disponibilização do certificado. Nesta WO, a própria Rede fará a instalação assim que o certificado estiver disponível.
2. Internet e boleto: abrir nova solicitação para importar os certificados no balanceador (CADDEAPRLB003-1) e vincular aos VIPs. Antes, confirmar se os certificados já foram emitidos (internet: REQ000146906957; boleto: verificar se a REQ de certificado foi aberta).
3. Com os certificados instalados: abrir as REQs de DNS das três URLs para os respectivos VIPs.
4. Esteira: ajustar as variáveis de URL nas releases e validar o acesso pelas novas URLs.

Alinho com o Evandro para não duplicarmos solicitações e sigo com a abertura das REQs pendentes.
