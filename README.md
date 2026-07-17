Saquei, sem entregar o valor que a gente já suspeita — só descrever o sintoma e pedir que eles confirmem do zero:

Atualização da demanda:
Referente à REQ [número], repositório siaci-api-integracao-padrao-java: a configuração do cluster de destino (aks-hab-des) para os ambientes DES e TQS foi realizada conforme solicitado, e a Application do ArgoCD para TQS já está registrada e sincronizada com sucesso (Sync OK).
Durante a validação, identificamos um novo problema: o pod não consegue subir em nenhum nó do cluster, com o evento "0/17 nodes are available: node(s) had untolerated taint(s)", indicando divergência entre a toleration configurada na aplicação e o taint real do node pool de destino.
Solicitamos ao time responsável pelo node pool (COE/Infra AKS) a confirmação do valor exato do taint nuvem.caixa/nodepoolname configurado tanto no node pool de DES quanto no de TQS, para que possamos parametrizar corretamente o values.yaml de ambos os ambientes e resolver o erro de agendamento (scheduling) dos pods.
