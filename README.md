Assunto: Divergência em segredos BeyondTrust – SICFD_TQS (Vault SICFD-AFTER-GAME-BT-VAULT-TQS)

Prezados,

Durante execução da pipeline de release do sistema SICFD-after-game em ambiente TQS, foi identificada falha na materialização dos seguintes secrets no pod, via secrets-agent/BeyondTrust:

SICFD_TQS/CLISERCFD_TQS
SICFD_TQS/SCFDTR01_ORA

O secret SICFD_TQS/SCFDTR02_DB2, pertencente ao mesmo BT_SECRETS_LIST, foi materializado normalmente, o que indica que o problema está restrito aos dois itens acima e não à conectividade do client com o BeyondTrust de forma geral.

Dados para verificação:

Client ID: 1ae9bada-9b3f-45a7-b76c-93ace0da4642
Variable Group: SICFD-AFTER-GAME-BT-VAULT-TQS (WO0000080202014)
Ambiente: TQS
BT_SECRETS_LIST configurado: SICFD_TQS/SCFDTR02_DB2, SICFD_TQS/SCFDTR01_ORA, SICFD_TQS/CLISERCFD_TQS

Solicito verificação quanto a:

Existência dos secrets SICFD_TQS/CLISERCFD_TQS e SICFD_TQS/SCFDTR01_ORA no safe TQS, com atenção a eventual divergência de nomenclatura ou case-sensitivity;
Permissão de leitura (grant) do Client ID acima para esses dois secrets especificamente.

Os arquivos correspondentes estão sendo criados no pod, porém vazios, o que sugere negativa de permissão silenciosa em vez de ausência total do recurso.
