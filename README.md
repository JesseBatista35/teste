ATENÇÃO: DESCONSIDERAR A NOTA ANTERIOR.

Após alinhamento com o solicitante (Philipe de Souza Alcantara Pereira – matrícula f737796), a necessidade foi esclarecida. Não se trata de credencial ou conta de serviço de LDAP para a aplicação. A configuração e o comportamento atuais do SICIA devem permanecer inalterados.

SOLICITAÇÃO CORRETA:
Inclusão da matrícula f737796 no grupo LDAP [GRUPO] (ou=Groups, o=caixa), para acesso à aplicação SICIA nos ambientes HMP, PILOTO e PRD.

CONTEXTO TÉCNICO (verificado no código-fonte da aplicação):

O SICIA autentica o usuário com a matrícula e a senha de rede no LDAP corporativo (ldapcluster.corecaixa:489).
O acesso é liberado somente se a matrícula for membro (uniqueMember) de um dos grupos do SICIA em ou=Groups, o=caixa. O grupo define o perfil do usuário na aplicação.
Grupos do SICIA: CIA_GESTORGESFI, CIA_GERENTEGISEG, CIA_GISEG, CIA_AUDITOR, CIA_TI, CIA_OPERADORCENTRAL, CIA_MANTENEDORA, CIA_VISUALNACIONAL, CIA_VISUALREGIONAL.
No primeiro login, a aplicação cria o usuário automaticamente na base local. Não é necessário cadastro manual no banco nem alteração de configuração.

Demanda direcionada à CEST – Gestão de Identidade e Acesso para inclusão da matrícula no grupo indicado.

Atenciosamente,
Jessé Batista – DES/TQS NPRD
