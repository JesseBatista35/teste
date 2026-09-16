Todos Boa tarde
 
Estou convocando esta sala devido ao caso do SIPGE-webhook (ambiente DES), que já teve várias REQs abertas sem chegarmos a uma solução definitiva:
 
REQ000145877393

REQ000145975274

REQ000145878577
 
Estou adicionando os envolvidos até aqui (Izabella e Pedro ) para tratarmos em conjunto, já que o problema está passando entre esteira e segurança sem fechamento.
 
Resumo do problema: Desde 09/09/2026, quando o BT_CLIENT_SECRET passou a ser preenchido via BeyondTrust Vault (antes disso a release funcionava com o valor direto na variável de ambiente da library), a release do SIPGE-webhook (DES) passou a falhar. 
 
O pod fica em Init:CrashLoopBackOff no container secrets-agent-sidecar, com a mensagem "Não foram encontrados arquivos com segredos no diretório /usr/src/app/secrets_files".
 
Diagnóstico feito: O log do sidecar mostra que o erro real não é timeout de rede, e sim MaxRetryError por "too many 400 error responses" na chamada POST /BeyondTrust/api/public/v3/Auth/connect/token (sicsn.caixa).
 
 Um 400 nesse endpoint de token indica falha de autenticação (client_id/client_secret inválidos ou incompatíveis) a esteira nunca chega a obter o token de acesso, e por isso nunca chega a consultar o segredo em si.
 
Isso explica também a informação passada pela Segurança de que "não existe requisição de consulta" no cofre quando a release roda: como a autenticação falha antes, o pod nunca chega à etapa de consulta do segredo, só à etapa de obtenção do token, que aparentemente não está sendo olhada nos logs de auditoria de consulta.
 
Reforça esse diagnóstico o fato de o mesmo BT_CLIENT_ID (0f501d71-12ca-4389-bde3-96ce9262c3ec) estar cadastrado tanto na library SIPGE-BT-VAULT-SECRET-DES (webhook, que falha) quanto na SIPGE-BACKEND-BT-VAULT-DES (backend, que funciona normalmente). 
 
Se esse client_id tiver client_secrets diferentes por aplicação/escopo no BeyondTrust, e apenas o do backend estiver correto/atualizado, isso explica exatamente por que um módulo autentica e o outro não. 
 
O secret bt-client-secret-sipge-webhook-des foi recriado em 09/09/2026, mesma data em que as falhas começaram a ser recorrentes.
 
Solicitação para o Pedro Henrique Paiva de Souza (Segurança):
 
Confirmar se o client_secret vinculado a esse BT_CLIENT_ID no BeyondTrust é idêntico ao valor atualmente cadastrado na library SIPGE-BT-VAULT-SECRET-DES (não só se existe/está cadastrado, mas se bate com o que foi gerado em 09/09).


Verificar os logs de autenticação/token do BeyondTrust (não o log de consulta de segredo) no horário das releases do SIPGE-webhook, já que é nessa etapa que os 400 estão ocorrendo.


Checar se esse client_id possui client_secrets diferentes por aplicação/escopo (webhook vs. backend), e se a limpeza feita anteriormente na library SIPGE-BACKEND-BT-VAULT-DES não deixou apenas a associação do backend válida.
 
Patricia Vourakis Barbosa Braga, PC. 
 
Jesse Mouta Pereira Batista adicionou Jorge Milis de Almeida Junior ao chat e compartilhou todo o histórico de chats.

 
Jorge Milis de Almeida Junior. PC
 
Pedro Henrique Paiva de Souza, consegue entrar em sala?
 
Jorge Milis de Almeida Junior
Pedro Henrique Paiva de Souza, consegue entrar em sala?
acabei de entrar em contato com um colega dele, falou que ele deve vim amanha, que hoje esta em uma consulta médica dos filhos
 
Precisamos do apoio da equipe de segurança porque realmente aqui está cadastrado o secret correto porém não está conectando no cofre
 
requests.exceptions.RetryError: HTTPSConnectionPool(host='sicsn.caixa', port=443): Max retries exceeded with url: /BeyondTrust/api/public/v3/Auth/connect/token (Caused by ResponseError('too many 400 error responses'))
2026-09-15 18:14:17,764 ERROR (43399ad6-b131-11f1-9517-0a581902187c) There was an error in the execution: HTTPSConnectionPool(host='sicsn.caixa', port=443): Max retries exceeded with url: /BeyondTrust/api/public/v3/Auth/connect/token (Caused by ResponseError('too many 400 error responses'))
 
enviei para o colega dele pra saber quem além dele podemos ver essa situação também
 
Se conseguir pode incluir ele aqui nesse chat Izabella Christina Brandao Silva
 
Jorge, sabe se o no webhook esta em minúsculo na esteira faz diferença para o nome na library?
 
Izabella Christina Brandao Silva
Jorge, sabe se o no webhook esta em minúsculo na esteira faz diferença para o nome na library? 📷
isso não impacta não
 
Jorge, vi aqui na library do SIPGE-BACKEND-BT-VAULT-DES que está sendo utilizado no módulo SIPGE-backend que foi removido o BT_CLIENT_ID e BT_CLIENT_SECRET, então agora
SIPGE-backend e SIPGE-webhook está utilizando a mesma library de SIPGE-BT-VAULT-SECRET-DES para BT_CLIENT_ID e BT_CLIENT_SECRET
 
daí gerei uma release nova para SIPGE-backend e está com problema também, porém nao consigo ver o log do pod, apenas que deu timeout
sipge-backend-des-109-mxs78 · Details · OKD
 
consegue ver pra gente?
 
Jorge Milis de Almeida Junior
Se conseguir pode incluir ele aqui nesse chat Izabella Christina Brandao Silva
ele falou que tava pra sair e o Pedro voltaria amanha por volta as 9h-10h
 
requests.exceptions.RetryError: HTTPSConnectionPool(host='sicsn.caixa', port=443): Max retries exceeded with url: /BeyondTrust/api/public/v3/Auth/connect/token (Caused by ResponseError('too many 400 error responses'))
2026-09-15 20:37:36,157 ERROR (48478380-b145-11f1-96a2-0a58190324f1) There was an error in the execution: HTTPSConnectionPool(host='sicsn.caixa', port=443): Max retries exceeded with url: /BeyondTrust/api/public/v3/Auth/connect/token (Caused by ResponseError('too many 400 error responses'))
 
deu o mesmo erro para o Backend
 
o erro pode estar na secret ou no client
 
agora bate o problema pois os dois módulos apresentaram o mesmo erro
 
sim, acredito que o problema será na library SIPGE-BT-VAULT-SECRET-DES 
 
ooi pessoal, bom diaa...
vi aqui que parece que o ymal do POD do SIPGE-backend parece que tenta pegar a BT_CLIENT_SECRET e CLIENT_ID do SIPGE-BACKEND-BT-VAULT-DES ao invés do SIPGE-BT-VAULT-SECRET-DES, tem alguma outra configuração para esse mudar esse vinculo para SIPGE-BT-VAULT-SECRET-DES?
 
 
Izabella Christina Brandao Silva
ooi pessoal, bom diaa... vi aqui que parece que o ymal do POD do SIPGE-backend parece que tenta pegar a BT_CLIENT_SECRET e CLIENT_ID do SIPGE-BACKEND-BT-VAULT-DES ao invés do SIPGE-BT-VAULT-SECRET-DE…
Jesse Mouta Pereira Batista, poderia verificar o questionamento por gentileza
 
do SIPGE-webhook parece ta tentando pegar do SIPGE-webhook-BT-VAULT-DES:


 
o pessoal da segurança inseriu novamente a senha no SIPGE-BT-VAULT-SECRET-DES, vou tentar gerar a release aqui
 
Thiago Rafael Cavalcante Pereira
Jesse Mouta Pereira Batista, poderia verificar o questionamento por gentileza
verificando. 
 
se não der certo, podemos ver de incluir o BT_CLIENT_SECRET e CLIENT_ID nas libraries SIPGE-BACKEND-BT-VAULT-DES e SIPGE-webhook-BT-VAULT-DES, se fazendo dessa outra forma funcionar, talvez tenha a ver com o vinculo


<img width="851" height="775" alt="image" src="https://github.com/user-attachments/assets/bc71564a-e871-44de-81c4-6fc8cb9e11a0" />




<img width="979" height="797" alt="image" src="https://github.com/user-attachments/assets/4b671a41-f93f-4257-b573-063fb36794cb" />



 
