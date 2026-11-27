Atualização – 27/11/2026

Análise realizada no ambiente TQS do sicmu-intranet-update (VM caddeapllx2540).

Diagnóstico:
- O erro ManagedBeanCreationException (consultaOperacaoHabitacionalBean) é consequência da falha de conexão dos datasources java:/db2cmu e java:/db2cdm com o DB2 de TQS (jdbc:db2://10.216.80.111:446/RJKDB2DSDH).
- O DB2 recusa a autenticação do usuário SCMUTR01: SqlInvalidAuthorizationSpecException, ERRORCODE=-4214, SQLSTATE=28000.
- A configuração da esteira, da VM e do JBoss foi validada: URL, schema TQSCMU e usuário SCMUTR01 estão corretos para TQS, e a senha está sendo aplicada sem falha de substituição. A senha no grupo de variáveis de TQS está sem alteração desde 02/09/2026.

Ação realizada pela CESTI:
- Corrigida a variável CONNECTOR do grupo SICMU-INTRANET-UPDATE-TQS (caminho inexistente /opt/jboss/jboss-eap/.../sicmu_jconnector_properties → /opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties). Nova release executada e configuração validada na VM.

Pendência (solicitante):
- Solicitar ao time de banco/segurança a verificação e o reset/desbloqueio do usuário SCMUTR01 no DB2 de TQS (RJKDB2DSDH) e informar a nova senha.
- Após o reset, a CESTI atualizará DB2_CMU_PWD e CICSCMU_PASS no grupo de TQS, executará nova release e validará a conexão.

Observação: a variável KEYSTORE_PASSWORD de TQS está como "pasword" (DES: "password"). Solicitante deve confirmar se o valor está correto.

Status: Pendente – aguardando solicitante.
