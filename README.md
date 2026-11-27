Bom dia, Marcelo!

Analisamos o sicmu-intranet-update em TQS (VM caddeapllx2540) e segue o diagnóstico:

1) Causa do erro (ManagedBeanCreationException no consultaOperacaoHabitacionalBean)
Os datasources java:/db2cmu e java:/db2cdm não conseguem conectar no DB2 de TQS. O banco recusa a autenticação do usuário SCMUTR01:

jdbc:db2://10.216.80.111:446/RJKDB2DSDH
SqlInvalidAuthorizationSpecException: Ocorreu uma falha na autorização de conexão. ERRORCODE=-4214, SQLSTATE=28000

A esteira, a VM e a configuração do JBoss estão corretas: URL, schema TQSCMU e usuário SCMUTR01 estão coerentes com o ambiente, e a senha está sendo aplicada sem erro de substituição. O erro é de credencial no banco (senha expirada/revogada no RACF ou usuário sem acesso no RJKDB2DSDH). A senha no grupo de variáveis de TQS está sem alteração desde 02/09/2026.

2) Ajuste feito por nós
Corrigimos a variável CONNECTOR do grupo SICMU-INTRANET-UPDATE-TQS, que apontava para um caminho inexistente (/opt/jboss/jboss-eap/.../sicmu_jconnector_properties). Agora ela aponta para /opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties, igual ao DES. Release executada e conector validado.

3) Pendência com vocês
Por favor, solicitem ao time de banco/segurança a verificação e o reset/desbloqueio do usuário SCMUTR01 no DB2 de TQS (RJKDB2DSDH). Esse usuário também é usado no CICS (CICSCMU_USR).

Com a nova senha, atualizamos DB2_CMU_PWD e CICSCMU_PASS no grupo de TQS e executamos nova release. Recomendamos avisar antes do reset, para pararmos o JBoss e evitar que as tentativas de conexão revoguem o usuário novamente.

Observação: a variável KEYSTORE_PASSWORD de TQS está como "pasword" (em DES é "password"). Vale confirmar se está correto.

À disposição!
Jessé
