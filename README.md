Faz sentido — se não é escopo de vocês, o levantamento técnico é responsabilidade de quem vai executar (Redes). Segue nota pronta pra encaminhamento:

Nota de encaminhamento:

Prezados,

Encaminhamos a presente demanda para avaliação e tratativa da equipe de Redes/Teledata, tendo em vista que se trata de solicitação de liberação de comunicação (proxydes ou regra de firewall alternativa) para que o Nginx da aplicação SICPU-painel possa acessar endereço de destino externo/rede corporativa.

A demanda está fora do escopo de atendimento desta esteira (Esteira DevOps DES TQS NPRD), sendo necessária avaliação técnica da equipe de Redes quanto aos dados de origem/destino, portas e demais informações necessárias para a liberação.

Dados disponíveis até o momento:

Ambiente: DES/TQS
Namespace: sicpu-des (OpenShift/nprd.caixa)
Console do pod: https://console-openshift-console.apps.nprd.caixa/k8s/ns/sicpu-des/core~v1~Pod
Repositório da aplicação: https://devops.caixa/projetos/Caixa/_git/SICPU-painel
Repositório de configuração do Nginx: https://devops.caixa/projetos/Caixa/_git/SICPU-painel-config

O demandante não informou o endereço de destino, porta, nem se a comunicação é interna ou externa ao cluster. Solicitamos que a equipe de Redes realize o levantamento dessas informações diretamente com o demandante, conforme necessidade técnica para a análise e execução da liberação.
