Prezados,

Em análise ao problema relatado (falha no deploy do projeto SIAVL-atddigital-backend, ambiente DES, com o pod ficando preso em PodInitializing e o OKD4 não conseguindo substituir a versão anterior), identificamos a causa raiz.

O pod não conclui a fase de inicialização porque o secret bt-client-secret-siavl-atddigital-backend-des, referente à nova configuração do BeyondTrust, não está sendo criado no namespace siavl-des. Esse secret depende do preenchimento das variáveis BT_CLIENT_ID e BT_CLIENT_SECRET na library SIAVL-BT-VAULT-SECRET-DES (WO0000081317011), criada recentemente para a nova integração com o BeyondTrust. Até o momento, essas variáveis não foram preenchidas pela equipe de Segurança responsável pela vault, motivo pelo qual a task da Release que provisiona o secret não possui os valores necessários para executá-lo.

Como consequência, todo novo pod gerado a partir de uma nova release fica preso na etapa Init (erro Init:CreateContainerConfigError, secret não encontrado), impedindo o rollout de concluir e o pod anterior de ser substituído.

Já estamos escalando o preenchimento das credenciais junto à equipe de Segurança responsável pela library SIAVL-BT-VAULT-SECRET-DES. Assim que os valores forem inseridos, uma nova release deverá ser disparada para que o secret seja provisionado corretamente e o deploy seja concluído.

Ficamos à disposição para alinhamentos adicionais.

Atenciosamente,
Jessé Batista
CTIS/CESTI - Esteira DevOps DES TQS NPRD
