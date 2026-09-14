Pessoal, sobre o SSO_TQS_LOGX (CRJTQAPLLX036, ambiente TQS - loginX):

Confirmado que a conta não está cadastrada no cofre de credenciais (busca no PAM retornou 0 itens). Isso explica por que ninguém tem a senha atual documentada - nem no cofre, nem em posse de alguém do time.

Para resolver, precisamos de duas ações em conjunto:

1. DBA: resetar a senha do usuário SSO_TQS_LOGX diretamente no Oracle.
2. Segurança: cadastrar essa conta no cofre (PAM) com a senha nova, para ficar gerenciada/rotacionada daí em diante e evitar esse problema no futuro.

Com a senha nova disponível no cofre, atualizamos a entrada no Vault do JBoss aqui no servidor (sem precisar que a senha circule por chat) e tentamos subir o serviço novamente.

Consegue nos ajudar com esses dois passos?
