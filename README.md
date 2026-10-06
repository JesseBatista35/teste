Análise realizada no agente Control-M caddeapllx2695.agil.nprd.caixa.gov.br (CTMD_DES), job CX_101-abertura-movimento-aporte (Folder SIIFX_CAIXINHAS_DES, Application SIIFX_DES).

Ações executadas no escopo de infraestrutura/esteira (DES):

Verificado que o job type IIFX está distribuído no agente (apps-repo/IIFX).
Importado o certificado AC Interna APL no truststore do Application Integrator (/opt/ctmage/ctm/cm/AI/data/security/apcerts) e no cacerts do Java do agente (/opt/ctmage/JRE/lib/security/cacerts), com backup prévio dos dois arquivos. Corrigido o erro PKIX na comunicação com o BeyondTrust (sicsn.caixa).
Removido o BOM dos scripts /producao/executa-job.sh e /producao/env_config.sh, com backup prévio.
Instalado o pacote jq, dependência do env_config.sh.
Agente reiniciado e comunicação com o servidor sspdeaprlx0028 validada (ag_diag_comm com pings OK).

Resultado:
Após as correções, os passos Gerar token, Login no Beyond Trust e Logout executam com sucesso. O job falha no passo "Obter credencial" com HTTP 401 "User not authenticated".

Evidência:
Teste manual via curl a partir do próprio agente, com a mesma credencial configurada no job type, executou com sucesso o fluxo completo (token, SignAppin e Secrets-Safe na pasta SIIFX_BATCH_DES), todos com HTTP 200. O cookie de sessão ASP.NET_SessionId é emitido na chamada de token e deve ser reenviado nas chamadas seguintes.

Conclusão:
O ambiente (máquina, agente, certificados e acesso ao BeyondTrust) está funcional. A falha remanescente está na configuração do job type IIFX do Application Integrator, no repasse da sessão entre os passos.

Encaminhamento:
Solicito à comunidade/equipe responsável pelo job type IIFX a análise e o ajuste, considerando:

Desativar a criptografia do parâmetro SESSIONID no passo Gerar token (keepParamEncrypt = false) e testar.
Caso não resolva, ativar o gerenciamento de cookies (setCookie = true) no passo Gerar token.
Caso persista, verificar junto à BMC possível problema conhecido de repasse de cookies entre passos do Application Integrator.

Pendências de correção definitiva fora deste atendimento:

Equipe do SIIFX: salvar os scripts do repositório SIIFX-caixinhas-batch como UTF-8 sem BOM e com fim de linha LF.
Esteira/template da VM Control-M: incluir o jq e a cadeia de certificados AC Interna da Caixa, para que novos deploys não reintroduzam os problemas.

Encerrando este atendimento no escopo de infraestrutura/esteira DES.
