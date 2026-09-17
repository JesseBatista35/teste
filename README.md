Pessoal, bom dia!

Enquanto vocês seguem analisando, encontramos um ponto que pode ajudar a direcionar a investigação: comparamos as variáveis de ambiente configuradas na pipeline (Azure DevOps) entre DES e TQS, e notamos uma diferença na porta HTTPS do endpoint CICS Web:

DES: cicsweb.des.caixa:32587
TQS: cicsweb.tqs.caixa:2587

A porta HTTP (2584) é igual nos dois ambientes, mas a HTTPS diverge — DES usa 32587 e TQS usa 2587. Como o erro que estamos vendo é justamente na chamada para cicsweb.tqs.caixa:2587, e o URIMAP já foi criado nessa porta mas a transação ainda não está chegando ao CICS, será que essa é de fato a porta correta do TCPIPSERVICE ativo em TQS?

Poderiam confirmar:

Qual TCPIPSERVICE está ativo/ouvindo em TQS e em qual porta HTTPS ele está configurado?
Se a porta correta para TQS realmente é 2587, ou se deveria ser 32587 (como em DES)?

Isso pode explicar por que mesmo com o URIMAP já definido a transação continua não chegando ao CICS.
