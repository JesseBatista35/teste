Problema relatado:
Falha na task "Criando nova APP", com o erro:
error processing template "openshift/angular-caixa-release": the namespace of the provided object does not match the namespace sent on the request

Causa identificada:
As tasks "Cria_APP_OKD" e "Exporta_Variable_Cria_Projeto_OKD" estavam configuradas com uma versão antiga (12.), desatualizada em relação à versão mais recente (13.) do template.

Ação realizada:
Atualizadas as duas tasks para a versão 13.*. Uma nova release foi disparada em seguida.

Resultado:
Deploy concluído com sucesso em TQS. Pipeline executando normalmente.
