Pessoal,

Sobre a demanda do SIMCX-backend em TQS, consegui identificar e corrigir uma parte do problema: no grupo de variáveis SIMCX-BACKEND-BT-VAULT-TQS do Azure DevOps havia uma variável fora do padrão (SMCXTB03_PASSWORD), que não existe no ambiente DES e estava causando inconsistência. Já removi essa variável e deixei o grupo TQS no mesmo padrão do DES.

Porém, ao analisar o log do secrets-agent-sidecar, identifiquei que o erro real da pipeline é outro: o segredo SIMCX_TQS/SMCXTB03_ORACLE (senha do usuário Oracle SMCXTB03, schema mcx) nunca foi cadastrado no cofre do BeyondTrust para o ambiente TQS - só existem lá os segredos CLISERMCX_SSO_INTRA e SIMCX_BT_APIKEY. Sem esse segredo, o pod não sobe (fica travado em PodInitializing) e a pipeline estoura o timeout.

Esse cadastro só pode ser feito pela equipe de Segurança, e como é um item novo (o TQS nunca chegou a rodar antes), entendo que precisa ser tratado em uma REQ própria, separada da que está aberta.

Minha sugestão é: encerramos essa REQ atual, já que o ajuste de configuração da pipeline foi feito e não depende mais de nós, e vocês abrem uma nova REQ direcionada à Segurança pedindo o cadastro do segredo SMCXTB03_ORACLE no path SIMCX_TQS do BeyondTrust, seguindo o mesmo padrão do SMCXDB03_ORACLE que já existe no DES. Assim evitamos ficar no meio do fogo cruzado entre as equipes numa REQ que não é mais nossa.

Qualquer dúvida, fico à disposição.

Att,
Jessé Batista
