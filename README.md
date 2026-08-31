Olá, Yuri, tudo certo.

A configuração CORS do SIAVL em DES foi ajustada nos 5 sites de intranet (siavl, siavl02, siavl03, siavl04, siavl05), conforme o novo checklist: o bloco de headers foi simplificado para usar Access-Control-Allow-Origin fixo ("*"), no lugar do modelo condicional anterior (que dependia de SetEnvIf/Origin e não estava retornando o header corretamente em algumas situações).

Já testei com requisição OPTIONS em todos os 5 sites e o header Access-Control-Allow-Origin: * está retornando normalmente, junto com Allow-Methods e Allow-Headers. Podem testar a chamada do serviço de vocês agora.

Sobre o tempo que levou: durante a aplicação, tivemos dois imprevistos técnicos que exigiram investigação antes de prosseguir com segurança — uma falha silenciosa em um dos comandos de edição (que fazia parecer que a alteração tinha sido aplicada quando na verdade não tinha) e uma queda breve do processo Apache do site siavl04 durante o reload, que foi identificada e corrigida em seguida (o site ficou indisponível por poucos minutos e já está normalizado). Preferi confirmar cada etapa com testes antes de seguir para não aplicar uma mudança incompleta ou gerar inconsistência entre os ambientes.

Backup de todos os arquivos originais foi feito antes de cada alteração. Qualquer teste adicional que precisarem, só avisar.
