À CAIXA

Prezados,

Analisada a evidência encaminhada pela colaboradora Jacqueline (matrícula f915141), verificou-se que o erro apresentado no Android Studio ("fatal: Authentication failed for 'https://devops.caixa/projetos/Caixa/_git/SIECO-Android/'") ocorre na etapa de autenticação do cliente Git da estação de trabalho. Não se trata de falha na esteira nem de ausência de permissão no repositório.

Esse comportamento indica que as credenciais armazenadas localmente pelo Git Credential Manager estão inválidas ou desatualizadas, por exemplo após troca de senha de rede ou expiração de token de acesso pessoal (PAT).

Complementarmente, como a colaboradora realiza operações de envio (push) de branches, foi ajustada a permissão do grupo ARRECADACAO-squad-spread no repositório SIECO-Android, que passou a contar também com as permissões Contribute e Create branch (Allow), além da permissão Read concedida anteriormente.

Solicitamos que a colaboradora execute os procedimentos abaixo em sua estação:

Acessar o Painel de Controle > Gerenciador de Credenciais > Credenciais do Windows.
Remover as entradas referentes a git:https://devops.caixa (e variações com "devops.caixa").
Opcionalmente, executar no terminal: git credential-manager erase informando protocol=https e host=devops.caixa, ou simplesmente repetir o push após a remoção.
Refazer o push pelo Android Studio e informar novamente as credenciais quando solicitado (usuário e senha de rede atuais ou um novo PAT gerado no Azure DevOps).

Para confirmar que o acesso ao repositório está regular, a colaboradora pode abrir o endereço https://devops.caixa/projetos/Caixa/_git/SIECO-Android no navegador. Se o conteúdo for exibido, as permissões estão corretas e o problema se restringe às credenciais locais do Git.

Caso o erro persista após esses procedimentos, solicitamos o retorno com nova evidência para continuidade da análise.

Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
