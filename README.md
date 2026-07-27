Prezado(a),

Após análise técnica, foi identificado que a aplicação SISGR, ao executar o fluxo de autorização de usuário externo (matrizacesso), apresentava falha na comunicação com o serviço SISET (https://logindes.caixa.gov.br), retornando a mensagem: Não foi possível executar a ação devido a falha de comunicação com o SISET.

A causa raiz do problema foi identificada como uma falha de handshake TLS decorrente da renovação do certificado do SISET sob uma nova cadeia da autoridade certificadora Sectigo (Sectigo Public Server Authentication CA DV R36 e Root R46). O truststore customizado da aplicação, localizado no servidor srjdeapllx130, ainda continha apenas a cadeia Sectigo anterior, o que impedia a validação do novo certificado e resultava na rejeição da conexão.

Foi realizada a atualização do truststore da aplicação com a importação da nova cadeia de certificados Sectigo, seguida de backup do arquivo original e reinicialização dos servidores JBoss (srjdeapllx130_acessoseguro_intra_5500 e srjdeapllx130_webservice_intra_5502) para que a nova configuração fosse carregada.

Após a reinicialização, o ambiente foi validado pelo solicitante, que confirmou o restabelecimento da comunicação com o SISET e o funcionamento correto da aplicação.

Diante do exposto, encerramos esta demanda como concluída com sucesso.

Atte.

Jessé Batista / CTIS/CESTI — Esteira DevOps DES TQS NPRD
