Prezados,

Solicito avaliação e correção de um defeito identificado na Action compartilhada DevSecOps-Actions, no arquivo .github/integrations/argocd/logs/action.yaml, utilizada por pipelines de diversos times para coleta automática de logs de pods via ArgoCD após o deploy.

Descrição do problema:

O script seleciona o pod mais recente da aplicação a partir do resource-tree do ArgoCD, ordenando todos os Pods do namespace exclusivamente pelo campo createdAt, sem aplicar nenhum filtro por nome ou label que garanta que o pod escolhido pertença de fato ao componente principal da aplicação. Com isso, caso exista qualquer outro pod associado à mesma aplicação com criação mais recente, como um pod de sidecar ou de coleta (por exemplo, OpenTelemetry Collector), esse pod acaba sendo selecionado indevidamente no lugar do pod da aplicação.

Como consequência, o script tenta buscar logs do container com nome da aplicação dentro de um pod que não o possui, gerando a falha container [nome] is not valid for pod [nome do pod incorreto] e resultando em exit code 1, mesmo quando o deploy da aplicação foi concluído com sucesso e o pod real está com status Healthy e Synced no ArgoCD. Isso gera falso-positivo de falha de pipeline sem impacto funcional real no ambiente.

Exemplo observado:

Aplicação silce-carrinho-des, execução do workflow em 22/07/2026. O ArgoCD confirmou a aplicação como Synced e Healthy, com o pod silce-carrinho-des-85b474cbf7-bc59b iniciado corretamente e em execução normal. No entanto, a Action selecionou o pod otel-silce-carrinho-des-56cfd9f455-wbtpv como mais recente, resultando na falha reportada.

Sugestão de correção:

Incluir um filtro adicional no jq responsável por selecionar o pod, restringindo a seleção a pods cujo nome inicie com o nome da aplicação (REPO_NAME-environment), antes de aplicar a ordenação por createdAt. Isso evitaria que pods de componentes auxiliares, como sidecars de observabilidade, sejam selecionados incorretamente no lugar do pod principal da aplicação.

Como esse arquivo é mantido de forma centralizada e utilizado por múltiplos times, não temos permissão para alterá-lo diretamente. Solicitamos avaliação e, se pertinente, a correção do filtro de seleção de pod nessa Action, uma vez que o problema tende a se repetir em outras aplicações que também possuam pods auxiliares no mesmo namespace.

Ficamos à disposição para mais detalhes ou testes adicionais, caso necessário.
