Causa raiz: a pipeline do SIACC-pixautomatico-mq-suporte tinha uma demand fixando a execução sempre no agente cadsvaprlx020.intra.caixa.gov.br. Esse agente específico não tinha em cache o artefato SIACC-pixautomatico-api-suporte:1.0.186-SNAPSHOT, e por isso a etapa Maven falhava ao resolver a dependência, mesmo o artefato existindo normalmente no Nexus.

Resolução: removida a demand que fixava o agente. Novo build rodou em outro agente do pool e passou sem erro (Maven, testes e análise de código OK).

Status: Resolvido.
