Problema identificado:
Pipeline de build (Azure DevOps, task "Executando Build S2I Binary") apresentava falha ao executar "oc start-build" via "instantiatebinary", com erro "unexpected EOF" logo após o upload do binário. Ao investigar via console OpenShift, foi constatado que o namespace build-images-ads apresentava acúmulo de builds anteriores do buildconfig siifx-api-aplicacao presos no status "New" (builds -1 a -9), nunca chegando a ser agendados/executados. Diagnóstico de saúde do cluster (clusteroperators, kube-apiserver, conectividade via curl no endpoint healthz) não identificou degradação; a causa raiz foi a fila de builds travada, provavelmente pelo runPolicy Serial do buildconfig aguardando indefinidamente o build mais antigo da fila.

Ação realizada:
Limpeza dos builds antigos travados em status "New" no namespace build-images-ads realizada pelo time de INFRA, liberando a fila do buildconfig. Após a limpeza, novo build do siifx-api-aplicacao foi disparado.

Resultado:
Build executado com sucesso após a liberação da fila.
