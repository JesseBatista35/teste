Prezados,

Após análise, identificamos duas causas relacionadas ao erro de inicialização dos pods (Init:Error no container secrets-check) apresentado nos pipelines SISAG-notificacao-api e SISAG-poupanca-integrada-backend (ambiente DES).

Causa imediata:
Os pods não sobem porque o init container de validação de segredos (BeyondTrust) não localiza o segredo SISAG_DES/TOKEN_SAS/SISAG_TEAMS_IMAGENS_SAS, incluído na variável BT_SECRETS_LIST há aproximadamente 6 horas sem que o provisionamento correspondente tenha sido solicitado à Segurança/cofre BeyondTrust.

Causa estrutural (motivo do problema ter afetado dois sistemas diferentes):
Os pipelines SISAG-notificacao-api e SISAG-poupanca-integrada-backend estão compartilhando o mesmo grupo de variáveis SISAG-BT-VAULT-DES (mesma BT_SECRETS_LIST). O padrão correto é cada módulo possuir seu próprio grupo isolado:

SISTEMA-MODULO-BT-VAULT-(AMBIENTE), contendo BT_SECRETS_LIST
SISTEMA-MODULO-BT-VAULT-SECRET-(AMBIENTE), contendo BT_CLIENT_ID e BT_CLIENT_SECRET

Com o grupo compartilhado, um segredo adicionado para atender exclusivamente ao notificacao-api (SISAG_TEAMS_IMAGENS_SAS, usado no bot Teams/imagens) passou a ser exigido também na inicialização do poupanca-integrada-backend, que não consome esse segredo - por isso o mesmo erro apareceu nos dois sistemas. Enquanto os módulos continuarem compartilhando o mesmo grupo de vault, qualquer novo segredo adicionado por um módulo vai continuar quebrando a inicialização dos demais.

Ajustes necessários (equipe de desenvolvimento):
1. Solicitar à Segurança a criação/carga do segredo SISAG_TEAMS_IMAGENS_SAS no path SISAG_DES/TOKEN_SAS/ do cofre BeyondTrust, associado ao BT_CLIENT_ID correspondente, para destravar o deploy do notificacao-api.
2. Segregar os grupos de variáveis por módulo: criar um BT_SECRETS_LIST específico para SISAG-notificacao-api (contendo apenas os segredos que esse módulo consome, incluindo o SISAG_TEAMS_IMAGENS_SAS) e manter no poupanca-integrada-backend apenas os segredos que ele de fato utiliza, removendo a dependência cruzada do grupo SISAG-BT-VAULT-DES compartilhado.
3. Revisar se outros módulos SISAG também compartilham esse mesmo grupo e aplicar a mesma segregação, para evitar recorrência.
4. Após os ajustes, reexecutar os releases - não há pendência de infraestrutura/esteiras da nossa parte.

Encerramos o chamado com o encaminhamento acima para a equipe de desenvolvimento.

Atenciosamente,
Jessé Batista
