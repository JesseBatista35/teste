Pessoal, segue a atualização sobre o job CX_101-abertura-movimento-aporte (CTMD_DES, agente caddeapllx2695).

O que foi corrigido na máquina/agente:

Job type IIFX distribuído e presente no agente.
Certificado AC Interna APL importado no truststore do Application Integrator (apcerts) e no Java do agente (cacerts). O erro de certificado (PKIX) no acesso ao BeyondTrust (sicsn.caixa) foi resolvido.
Scripts executa-job.sh e env_config.sh corrigidos (estavam salvos com BOM, o que quebrava a primeira linha).
Pacote jq instalado (usado pelo env_config.sh).

Situação atual:
Os passos Gerar token, Login no Beyond Trust e Logout executam com sucesso. O job falha apenas no passo "Obter credencial", com HTTP 401 "User not authenticated". Com isso a credencial chega vazia ao script.

Validação feita:
Executei o mesmo fluxo via curl a partir do agente, com a mesma credencial do job. Token, SignAppin e consulta ao Secrets-Safe (pasta SIIFX_BATCH_DES) retornaram HTTP 200. Ou seja, a conta tem acesso e o BeyondTrust está respondendo corretamente. O cookie de sessão (ASP.NET_SessionId) é emitido na chamada de token e precisa ser reenviado nas chamadas seguintes.

Conclusão:
O problema está na configuração do job type IIFX (Application Integrator), na forma como a sessão é repassada entre os passos. Não é problema da máquina, do agente nem do BeyondTrust.

Sugestões para quem mantém o job type IIFX (testar uma de cada vez):

No passo Gerar token, desativar a criptografia do parâmetro SESSIONID (keepParamEncrypt = false), redistribuir no agente e testar com Run Now.
Se não resolver, ativar o gerenciamento de cookies (setCookie = true) também no passo Gerar token.
Se ainda persistir, verificar no portal da BMC se há problema conhecido de cookies não repassados entre passos do Application Integrator.

Vou registrar essas informações na REQ e encaminhar para a análise do job type.
