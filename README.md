Prezados,

Analisada a falha no build/deploy em DES do sisph-bff-jnd-baixa-garantia (run #71 – “Falha na sincronização”).

Causa: a versão gerada no run #71 incluiu validação de configuração na inicialização da aplicação (ValidateOnStart), exigindo as chaves GeracaoDocumento__Provedor, Dados__Provedor, HistoricoEntrega__Provedor e DocumentoPreview__Provedor. No momento do deploy, o ConfigMap cm-sisph-bff-jnd-baixa-garantia-des não continha esses valores válidos. A aplicação falhava ao iniciar (“Hosting failed to start” / OptionsValidationException), o pod entrava em reinício contínuo (36 restarts) e a etapa de sincronização do pipeline expirava aguardando a aplicação ficar saudável.

Correção: o ConfigMap foi ajustado pelo time de desenvolvimento no repositório GitOps, com as quatro chaves definidas como Simulado. Após a sincronização no ArgoCD, foi realizado restart do deployment (Rev:75). O novo pod iniciou sem erros (“Application started”, porta 8080), sem reinícios, e a aplicação está Synced/Healthy. O pipeline foi reexecutado com sucesso.

Recomendação: ao incluir novas configurações obrigatórias no código, atualizar o ConfigMap correspondente no GitOps antes ou junto do deploy, para evitar indisponibilidade no startup.

Os erros 422 (“Contrato Liquidado” e “Data de assinatura posterior à data de referência”) observados nos logs são respostas de negócio da API de pós-venda e não têm relação com a falha do pipeline.

Demanda encerrada.
