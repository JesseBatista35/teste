REQ000145742862 — Ajuste de DeploymentConfig (HTTP_PROXY/HTTPS_PROXY/NO_PROXY)

Atendendo à solicitação do CETEL (conforme orientação da REQ000145689716), foram adicionadas as variáveis de ambiente HTTP_PROXY, HTTPS_PROXY e NO_PROXY (apontando para proxydes.caixa:80) nos DeploymentConfigs dos seguintes serviços, via inclusão nos respectivos Variable Groups do Azure DevOps e novo Release:

sipgc-api-agrupamento-des — concluído
sipgc-api-papel-des — concluído
sipgc-api-membros-des — concluído
sipgc-api-seguranca-des — concluído
SIPGC-api-informacoes-des — concluído
sipgc-api-seguranca-tqs — concluído
sipgc-api-portfolio-des — pendente, aguardando merge da branch pelo Pablo antes de aplicar

Validação: chamada externa testada via Swagger (retorno HTTP 200) após aplicação no agrupamento-des, confirmada pelo Pablo. Demais serviços seguiram o mesmo padrão sem intercorrências.

Ambiente TQS: os demais serviços do TQS (além do seguranca-tqs) ficaram sob responsabilidade da própria equipe/CETEL para ajuste.

Pendência remanescente: sipgc-api-portfolio-des, a ser aplicado assim que o merge for concluído.
