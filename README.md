Prezados,

Após a inclusão das libraries SIACC-BT-VAULT-SECRET-TQS e SIACC-PIXAUTOMATICO-BT-VAULT-TQS e das tasks do BeyondTrust nas releases de TQS, os módulos abaixo foram normalizados:

Módulo	TAG	Situação
SIACC-pixautomatico-api-controle-requisicoes	1.1.0.4	Release TQS concluída com sucesso
SIACC-pixautomatico-api-simulador	1.3.2.2	Release TQS concluída com sucesso em 08/10/2026
SIACC-pixautomatico-auditoria	1.0.1.0	Release TQS concluída com sucesso

O SIACC-pixautomatico-api-convenio está sendo tratado na REQ000146496677.

Causa no simulador: após a inclusão do BeyondTrust, a release passou a enviar a senha do banco (QUARKUS_DATASOURCE_PASSWORD) apenas pela referência ${saccts01_oracle}. Essa referência não era resolvida pela aplicação, e a senha chegava nula, gerando ORA-01005: null password given; logon denied na subida do pod.

Correção: seguindo o mesmo padrão já aplicado ao controle-requisicoes, foram incluídas no grupo SIACC-PIXAUTOMATICO-API-SIMULADOR-TQS as variáveis DB_PASSWD (secreta) e _SECRET.QUARKUS_DATASOURCE_PASSWORD. Com isso a senha passa a ser entregue via Secret do OpenShift. A release foi reexecutada e a aplicação subiu normalmente, com conexão ao banco validada.

Observação: o agente do BeyondTrust grava os segredos em /usr/src/app/secrets_files/SIACC_TQS/, mas a variável SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS (grupo compartilhado SIACC-PIXAUTOMATICO-SUPORTE-TQS) aponta para .../siacc_tqs/, em minúsculas. Por isso, hoje os módulos não leem os segredos do cofre e usam as Secrets do OpenShift. Caso a equipe deseje passar a consumir os segredos diretamente do cofre, é necessário alinhar esse caminho, o que impacta todos os módulos que usam o grupo.

Também permanece o aviso do Application Insights (No connection string provided) em TQS. Ele não impede a execução da aplicação.

Demanda encerrada.
