Prezados,

Conforme solicitação para análise do deploy do siidx-ferramenta-fakemail em DES,
identificamos e resolvemos o problema.

PROBLEMA IDENTIFICADO:
O arquivo de configuração (ConfigMap) continha valores booleanos sem aspas,
causando erro de sincronização no ArgoCD:
"ConfigMap data fields must be strings, not boolean"

SOLUÇÃO APLICADA:
Alteramos os valores booleanos para strings no arquivo:
cm-siidx-ferramenta-fakemail-edo-siidx-des.yaml

De:
  QUARKUS_SMALLRYE_OPENAPI_ENABLED: true
  QUARKUS_SWAGGER_UI_ENABLED: true

Para:
  QUARKUS_SMALLRYE_OPENAPI_ENABLED: "true"
  QUARKUS_SWAGGER_UI_ENABLED: "true"

STATUS ATUAL:
✅ APP HEALTH: Healthy
✅ SYNC STATUS: Synced
✅ LAST SYNC: Sync OK (concluído com sucesso)
✅ Todos os Pods: Operational

PRÓXIMAS AÇÕES:
Nenhuma ação adicional necessária. O deploy está estável.
Caso o problema se repita, favor entrar em contato.

Atenciosamente,
[Seu Nome]
Analista de Esteiras - NPRD (DES/TQS)
Data: 19/06/2026****
