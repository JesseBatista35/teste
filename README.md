Resolução:

Analisadas as releases do SINEP-arquivos (533954), SINEP-notas-fiscais (533944) e sinep-api (533979) no ambiente TQS (OKD4 NPRD, namespace sinep-tqs).

Causa: as aplicações falharam no startup do Quarkus ao conectar no IBM MQ (QM BRD3, host 10.192.224.100, porta 1415). O retorno foi RC=2538 – MQRC_HOST_NOT_AVAILABLE / Connection refused. Com isso os pods novos não subiam, o rollout não concluía e a task "Verificando Status do Deployment" estourava o timeout. As falhas ocorreram entre ~10h20 e ~11h30 de 29/09/2026, período em que o queue manager/listener recusava conexões. As versões anteriores permaneceram em execução, sem indisponibilidade do ambiente.

Verificação: às 14h26 foi testada a conectividade a partir de um pod do namespace sinep-tqs, e a porta 1415 do host 10.192.224.100 respondia normalmente. A indisponibilidade do MQ foi temporária e já estava normalizada. Não houve problema na esteira nem na configuração das aplicações.

Ação: releases reexecutadas, com deploy concluído com sucesso (SINEP-arquivos-1.9.0.1(3) – EC TQS: Succeeded).

Observação: o sinep-relatorios também apresentou falha de rollout no mesmo horário, provavelmente pela mesma causa. Recomenda-se reexecutar a release caso ainda não tenha sido feito.

Chamado encerrado.
