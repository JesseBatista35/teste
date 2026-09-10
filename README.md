Prezados,

Após análise, identificamos que o erro de inicialização dos pods (Init:Error no container secrets-check) apresentado nos pipelines SISAG-notificacao-api e SISAG-poupanca-integrada-backend (ambiente DES) tem a mesma causa raiz nos dois casos.

Diagnóstico:
Os pods não sobem porque o init container de validação de segredos (BeyondTrust) não localiza o seguinte segredo:

SISAG_DES/TOKEN_SAS/SISAG_TEAMS_IMAGENS_SAS

Esse caminho foi incluído na variável BT_SECRETS_LIST (grupo SISAG-BT-VAULT-DES) há aproximadamente 6 horas. Como o grupo de variáveis é compartilhado, o problema afeta todos os pipelines SISAG que o referenciam - por isso o mesmo erro aparece em mais de um sistema.

O padrão adotado pelo time (SISTEMA-MODULO-BT-VAULT-(AMBIENTE) com BT_SECRETS_LIST, e SISTEMA-BT-VAULT-SECRET-(AMBIENTE) com BT_CLIENT_ID/BT_CLIENT_SECRET) está configurado corretamente do lado do pipeline. O que falta é o provisionamento do dado no cofre: o segredo SISAG_TEAMS_IMAGENS_SAS (path TOKEN_SAS/) foi referenciado na lista, mas não há registro de solicitação à Segurança para criação/carga desse segredo no cofre do BeyondTrust.

Ajuste necessário (equipe de desenvolvimento):
1. Abrir solicitação junto à Segurança para criação do segredo SISAG_TEAMS_IMAGENS_SAS no path SISAG_DES/TOKEN_SAS/ do cofre BeyondTrust, associado ao BT_CLIENT_ID já utilizado pelo grupo SISAG-BT-VAULT-SECRET-DES.
2. Validar se o mesmo ajuste é necessário nos ambientes TQS/HMP/PRD, caso a mesma variável tenha sido incluída nesses grupos.
3. Após o provisionamento pela Segurança, reexecutar o release - não é necessário nenhum ajuste adicional de pipeline ou infraestrutura da nossa parte.

Dado o exposto, não há ação pendente de infraestrutura/esteiras; o encaminhamento segue para o time de desenvolvimento solicitar a inclusão do segredo junto à Segurança. Encerramos por aqui.

Atenciosamente,
Jessé Batista
