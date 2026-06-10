# Manual de Erros Comuns em Deployments

## Erro 1: Pod em estado Progressing indefinidamente

PROBLEMA: Pod fica com status Progressing por muito tempo, depois falha com ProgressDeadlineExceeded. Os eventos mostram FailedScheduling e "0/6 nodes are available".

CAUSA: O pod não consegue ser agendado em nenhum nó do cluster porque não tem toleração para os taints dos nós.

COMO IDENTIFICAR: Abra o pod no ArgoCD, vá na aba Events e procure por "FailedScheduling" e mensagens como "untolerated taint {nuvem.caixa/nodepoolname: ...}".

SOLUÇÃO: Adicione a toleração correta no values.yaml do Helm. Procure pela seção tolerations e complete com o valor do nodepool. Exemplo:

tolerations:
  - key: "nuvem.caixa/nodepoolname"
    effect: "NoSchedule"
    operator: "Equal"
    value: "appssiiga"

Se não souber qual é o valor correto, procure no values.yaml de outro ambiente que está funcionando e copie de lá.

ARQUIVO: values.yaml da sua aplicação no repositório de infra.

---

## Erro 2: SharedResourceWarning - Recursos compartilhados

PROBLEMA: ArgoCD mostra warning "ConfigMap/XXX is part of applications openshift-gitops/aplicacao-tqs and aplicacao-des". A sincronização fica instável entre ambientes.

CAUSA: Dois aplicativos (diferentes ambientes) estão gerenciando o mesmo recurso com o mesmo nome. Isso causa conflito de propriedade no ArgoCD.

COMO IDENTIFICAR: Na página da aplicação no ArgoCD, vá em "APP CONDITIONS" e procure por "SharedResourceWarning".

SOLUÇÃO: Separe os recursos por ambiente. Se o recurso se chama "cm-siiga-frontend", renomeie para "cm-siiga-frontend-tqs" para TQS e "cm-siiga-frontend-des" para DES. Isso deve ser feito em três lugares:

1. No arquivo templates/RECURSO.yaml mude a linha: name: novo-nome-com-ambiente
2. No values.yaml mude as referências para apontar ao novo nome
3. Sincronize no ArgoCD e verifique se o warning desapareceu

RECURSOS AFETADOS: ConfigMaps, Secrets, AzureKeyVaultSecrets (qualquer coisa que tem metadata.name).

---

## Erro 3: Toleração vazia ou incorreta

PROBLEMA: Pod não consegue ser agendado mesmo depois de adicionar toleração. Fica com status Progressing.

CAUSA: A toleração foi adicionada mas com value vazio ("") ou com valor incorreto que não corresponde a nenhum nó disponível.

COMO IDENTIFICAR: Verifique o arquivo values.yaml. Se a toleração tem value: "" ou um valor que você não tem certeza, é provavelmente esse o problema.

SOLUÇÃO: Corrija o valor da toleração para corresponder ao nodepool correto do seu cluster. Procure em outro ambiente que está funcionando qual é o valor usado e copie. Depois faça commit e sincronize no ArgoCD.

DICA: Os valores comuns são "appssiiga", "appssiiad", "websitesiiga", "websitesiiad", "infra", "spot". Se não souber qual usar, procure na documentação do cluster ou pergunte ao time de infra.

---

## Erro 4: OutOfSync com labels conflitantes

PROBLEMA: ArgoCD mostra status OutOfSync mesmo depois de sincronizar. Os labels do recurso no cluster são diferentes dos labels definidos no Git.

CAUSA: Dois Helm charts estão gerando labels diferentes para o mesmo recurso, causando conflito.

COMO IDENTIFICAR: Clique no recurso OutOfSync no ArgoCD. Vá em "MANIFEST DIFF" e procure por diferenças nos campos de labels, especialmente app.kubernetes.io/instance.

SOLUÇÃO: Certifique-se que cada ambiente tem seu próprio ConfigMap/Secret com nomes diferentes e referências diferentes no values.yaml. Depois sincronize novamente.

---

## Erro 5: Pod rodando mas sem logs

PROBLEMA: Pod está com status Healthy mas não gera nenhum log. Container aparentemente roda mas sem output.

CAUSA: Pode ser probes desabilitadas, aplicação não gera logs, ou erro na inicialização que não aparece.

COMO IDENTIFICAR: Clique no pod no ArgoCD e vá em Events. Se não há mensagens de erro, a aplicação pode estar iniciando corretamente mas sem gerar saída.

SOLUÇÃO: Verifique se a aplicação está realmente respondendo nas portas esperadas. Se a probes estão desabilitadas (probes.enabled: false), considere habilitá-las para debug. Ou verifique a documentação da aplicação para entender por que não há logs.

---

## Erro 6: ConfigMap não encontrado

PROBLEMA: Pod falha com erro "error: couldn't find key ... in ConfigMap" ou simplesmente não consegue iniciar.

CAUSA: O ConfigMap que o pod tenta referenciar não existe ou tem nome diferente.

COMO IDENTIFICAR: Nos eventos do pod, procure por erros mencionando ConfigMap. Verifique se o nome no values.yaml (campo configMapRefs) corresponde ao nome real do ConfigMap no cluster.

SOLUÇÃO: Confirme que o ConfigMap existe e tem o nome exato. Se mudou o nome recentemente, atualize a referência no values.yaml e sincronize novamente.

---

## Checklist rápido quando algo falha

1. Pod em Progressing? Verifique FailedScheduling e tolerações.
2. SharedResourceWarning? Separe recursos por ambiente.
3. OutOfSync? Verifique labels conflitantes, sincronize novamente.
4. Pod não inicia? Verifique ConfigMap e Secrets existem.
5. Tudo parece certo mas falha? Faça Force Sync no ArgoCD.

---

## Comandos úteis

Para ver eventos de um pod em detalhes, abra o pod no ArgoCD e vá em "Events" ou execute no terminal:

kubectl describe pod NOME_DO_POD -n NAMESPACE

Para listar todos os ConfigMaps do namespace:

kubectl get configmap -n NAMESPACE

Para verificar qual nó o pod está rodando:

kubectl get pod NOME_DO_POD -n NAMESPACE -o wide

---
