RESOLUÇÃO - FALHA DE SINCRONIZAÇÃO DEPLOY TQS

Foram identificados e resolvidos dois problemas na aplicação siiga-frontend-mfe-gestao-canais-tqs:

PROBLEMA 1: POD NÃO CONSEGUIA SER AGENDADO NO CLUSTER

O deployment do TQS não tinha toleração para os taints do nodepool. Os nós do cluster tinham a marca nuvem.caixa/nodepoolname, mas o TQS tinha uma toleração vazia para essa taint. Isso causava FailedScheduling e os pods ficavam em estado Progressing indefinidamente até exceder o timeout de 600 segundos.

SOLUÇÃO: Foi adicionado o valor correto na toleração do TQS. No arquivo siiga-frontend-mfe-gestao-canais-infranprd/tqs/values.yaml, foi alterado o campo tolerations para incluir value: "appssiiga" em vez de deixar vazio. Com isso, o pod consegue ser agendado nos nós que possuem o taint correspondente.

PROBLEMA 2: RECURSOS COMPARTILHADOS ENTRE TQS E DES

O ConfigMap cm-siiga-frontend-mfe-gestao-canais e o AzureKeyVaultSecret akvs-siiga-frontend-mfe-gestao-canais possuíam o mesmo nome em ambos os ambientes (TQS e DES). Isso causava conflitos de propriedade no ArgoCD, com warnings de SharedResourceWarning e sincronização instável.

SOLUÇÃO: Os recursos foram separados por ambiente. O ConfigMap do TQS passou a se chamar cm-siiga-frontend-mfe-gestao-canais-tqs e o do DES passou a ser cm-siiga-frontend-mfe-gestao-canais-des. O mesmo foi feito para o AzureKeyVaultSecret: akvs-siiga-frontend-mfe-gestao-canais-tqs para TQS e akvs-siiga-frontend-mfe-gestao-canais-des para DES. Os arquivos de templates e os values.yaml foram atualizados para referenciar os nomes corretos.

ARQUIVOS ALTERADOS:
- siiga-frontend-mfe-gestao-canais-infranprd/tqs/values.yaml (toleração e configMapRefs)
- siiga-frontend-mfe-gestao-canais-infranprd/des/values.yaml (configMapRefs)
- siiga-frontend-mfe-gestao-canais-infranprd/tqs/templates/cm-siiga-frontend-mfe-gestao-canais.yaml
- siiga-frontend-mfe-gestao-canais-infranprd/des/templates/cm-siiga-frontend-mfe-gestao-canais.yaml
- siiga-frontend-mfe-gestao-canais-infranprd/tqs/templates/akvs-siiga-frontend-mfe-gestao-canais.yaml
- siiga-frontend-mfe-gestao-canais-infranprd/des/templates/akvs-siiga-frontend-mfe-gestao-canais.yaml

STATUS ATUAL:
TQS: APP HEALTH Healthy, SYNC STATUS Synced, Pods rodando, ConfigMap cm-siiga-frontend-mfe-gestao-canais-tqs ativo, AzureKeyVaultSecret akvs-siiga-frontend-mfe-gestao-canais-tqs ativo.
DES: APP HEALTH Healthy, SYNC STATUS Synced, ConfigMap cm-siiga-frontend-mfe-gestao-canais-des ativo, AzureKeyVaultSecret akvs-siiga-frontend-mfe-gestao-canais-des ativo.
Todos os warnings foram eliminados. A sincronização está estável em ambos os ambientes.

VALIDAÇÃO:
Aplicação TQS está 100% funcional e sincronizada. Aplicação DES está 100% funcional e sincronizada. Não há mais conflitos de recursos, não há mais warnings no ArgoCD, health checks estão passando e os pods estão em estado Healthy.

Demanda encerrada com sucesso.
