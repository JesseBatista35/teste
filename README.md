Prezados,

Analisamos o histórico de builds no Jenkins e identificamos que a última tentativa de deploy (#2197, 27/08 às 12:17) falhou por conteúdo travado no repositório do Domain Controller — mesmo padrão de erro já tratado anteriormente em outro sistema:

Undeploy failed: {"host-failure-descriptions" => {"sbrdeapllx104_credito" => 
"WFLYDC0080: Timed out after 305000 ms awaiting host prepared response(s)"}}
'SIMCN' already exists in the deployment repository (use --force to replace the existing content in the repository).

Importante: essa falha é anterior à nossa intervenção. Realizamos a limpeza completa do deployment SIMCN no Domain Controller (remoção do server-group e do repositório) às 17h de hoje (27/08), justamente para eliminar esse travamento.

Verificamos que, até o momento, não houve nenhuma nova tentativa de deploy após essa correção — não há registro de build nova no Jenkins nem de deployment do SIMCN no repositório do Domain Controller.

O ambiente está limpo e a instância JBoss está ativa e pronta para receber a aplicação. Solicitamos que seja executado um novo deploy agora, após as 17h de hoje — o erro de "already exists" não deve mais ocorrer, já que a causa foi eliminada.

Seguem evidências anexas.

Ficamos à disposição para apoiar caso o novo deploy apresente algum erro.

Jessé Batista, CTIS/CESTI — Esteira DevOps DES TQS NPRD
