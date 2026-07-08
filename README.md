Prezados,
Referente à demanda do pipeline SIPBS-revendedor-batch, informo que o erro inicialmente reportado no ambiente DES foi resolvido.
No ambiente TQS, o erro de secure file não encontrado (caixa-trust-SIPBS-revend-batch-nprd.jks) também foi corrigido, com a configuração do secure file no pipeline.
Durante a análise do deploy em TQS, identificamos que o Variable Group SIPBS-REVENDEDOR-BATCH-TQS está sem as variáveis PRODUTOS e REDIS_PROXY_DURATION_DAYS, presentes no grupo equivalente de DES, o que causa falha na etapa de Replace Tokens.
O ponto foi tratado em sala do Teams com o demandante, que foi informado sobre as variáveis faltantes e ficou de realizar a configuração dessas variáveis no Variable Group de TQS.
Dessa forma, o erro originalmente reportado nesta demanda está resolvido. A subida completa do deploy em TQS fica condicionada à configuração das variáveis PRODUTOS e REDIS_PROXY_DURATION_DAYS pelo demandante no respectivo Variable Group.
Encerro a demanda por aqui, ficando à disposição para novo chamado caso necessário.
Atenciosamente,
Jessé Mouta Pereira Batista
CTIS/CESTI
