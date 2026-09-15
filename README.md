C159073


Prezados(as),

Estou convocando esta sala devido ao caso do SIPGE-webhook (ambiente DES), que já teve várias WOs/REQs abertas sem chegarmos a uma solução definitiva:

WO0000081624581
WO0000081652883
WO0000081625081
REQ000145877393
REQ000145975274
REQ000145878577

Estou adicionando os envolvidos até aqui (Kallebe, Hugo, Pedro - Segurança) para tratarmos em conjunto, já que o problema está passando entre esteira e segurança sem fechamento.

Resumo do problema: Desde 09/09/2026, quando o BT_CLIENT_SECRET passou a ser preenchido via BeyondTrust Vault (antes disso a release funcionava com o valor direto na variável de ambiente da library), a release do SIPGE-webhook (DES) passou a falhar. O pod fica em Init:CrashLoopBackOff no container secrets-agent-sidecar, com a mensagem "Não foram encontrados arquivos com segredos no diretório /usr/src/app/secrets_files".

Diagnóstico feito: O log do sidecar mostra que o erro real não é timeout de rede, e sim MaxRetryError por "too many 400 error responses" na chamada POST /BeyondTrust/api/public/v3/Auth/connect/token (sicsn.caixa). Um 400 nesse endpoint de token indica falha de autenticação (client_id/client_secret inválidos ou incompatíveis) — a esteira nunca chega a obter o token de acesso, e por isso nunca chega a consultar o segredo em si.

Isso explica também a informação passada pela Segurança de que "não existe requisição de consulta" no cofre quando a release roda: como a autenticação falha antes, o pod nunca chega à etapa de consulta do segredo — só à etapa de obtenção do token, que aparentemente não está sendo olhada nos logs de auditoria de consulta.

Reforça esse diagnóstico o fato de o mesmo BT_CLIENT_ID (0f501d71-12ca-4389-bde3-96ce9262c3ec) estar cadastrado tanto na library SIPGE-BT-VAULT-SECRET-DES (webhook, que falha) quanto na SIPGE-BACKEND-BT-VAULT-DES (backend, que funciona normalmente). Se esse client_id tiver client_secrets diferentes por aplicação/escopo no BeyondTrust, e apenas o do backend estiver correto/atualizado, isso explica exatamente por que um módulo autentica e o outro não. O secret bt-client-secret-sipge-webhook-des foi recriado em 09/09/2026, mesma data em que as falhas começaram a ser recorrentes.

Solicitação para o Pedro (Segurança):

Confirmar se o client_secret vinculado a esse BT_CLIENT_ID no BeyondTrust é idêntico ao valor atualmente cadastrado na library SIPGE-BT-VAULT-SECRET-DES (não só se existe/está cadastrado, mas se bate com o que foi gerado em 09/09).
Verificar os logs de autenticação/token do BeyondTrust (não o log de consulta de segredo) no horário das releases do SIPGE-webhook, já que é nessa etapa que os 400 estão ocorrendo.
Checar se esse client_id possui client_secrets diferentes por aplicação/escopo (webhook vs. backend), e se a limpeza feita anteriormente na library SIPGE-BACKEND-BT-VAULT-DES não deixou apenas a associação do backend válida.
