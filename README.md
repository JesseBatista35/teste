Analisei o código do SICIA e descobri como funciona o acesso em HMP/PILOTO/PRD. Não precisa criar usuário novo nem mexer em nenhuma configuração do legado.

Como o login funciona:

O SICIA valida sua matrícula e senha de rede no LDAP corporativo.
Depois confere se sua matrícula está em um dos grupos LDAP do SICIA. É o grupo que libera o acesso e define o perfil.
No primeiro login, a aplicação cria seu usuário automaticamente na base.

Então o que precisa ser feito é incluir a sua matrícula (f737796) no grupo LDAP do perfil que você vai usar. Essa inclusão é feita pela CEST – Gestão de Identidade e Acesso.

Os grupos do SICIA são:

CIA_GESTORGESFI
CIA_GERENTEGISEG
CIA_GISEG
CIA_AUDITOR
CIA_TI
CIA_OPERADORCENTRAL
CIA_MANTENEDORA
CIA_VISUALNACIONAL
CIA_VISUALREGIONAL

Em qual desses grupos você precisa ser incluído? Assim que você confirmar, eu atualizo a demanda com a solicitação correta e encaminho para a CEST.
