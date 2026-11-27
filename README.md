Encerramento – 27/11/2026

Demanda: revisão das configurações da esteira SICMU-intranet-update para o ambiente TQS.

Diagnóstico:
- O erro ManagedBeanCreationException (consultaOperacaoHabitacionalBean) em TQS é causado pela falha de autenticação dos datasources java:/db2cmu e java:/db2cdm no DB2 de TQS (jdbc:db2://10.216.80.111:446/RJKDB2DSDH).
- O DB2 recusa o usuário SCMUTR01: SqlInvalidAuthorizationSpecException, ERRORCODE=-4214, SQLSTATE=28000.
- A esteira, a VM (caddeapllx2540) e a configuração do JBoss foram validadas: URL, schema TQSCMU e usuário SCMUTR01 estão corretos para TQS, e a senha está sendo aplicada sem falha de substituição. A falha é da credencial no banco (senha expirada/revogada ou usuário sem acesso no RJKDB2DSDH), o que não é escopo da esteira.

Ação realizada pela CESTI:
- Corrigida a variável CONNECTOR do grupo SICMU-INTRANET-UPDATE-TQS, que apontava para um caminho inexistente. Novo valor: /opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties (igual ao DES). Release executada e configuração validada na VM.

Orientação ao solicitante:
- Solicitar ao time de banco/segurança a verificação e o reset/desbloqueio do usuário SCMUTR01 no DB2 de TQS (RJKDB2DSDH).
- Com a nova senha, abrir nova requisição à CESTI para atualizar DB2_CMU_PWD e CICSCMU_PASS no grupo SICMU-INTRANET-UPDATE-TQS e executar a release.
- Confirmar o valor da variável KEYSTORE_PASSWORD de TQS (está "pasword"; em DES é "password").

Solicitante ciente da devolutiva. Demanda encerrada no escopo da esteira.
