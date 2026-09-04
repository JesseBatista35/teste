Nota de encerramento

Sintoma inicial: Falha no health check da esteira CI/CD (gsc-integration-generic-pipeline) da aplicação sigex-frontend-painel-presi-gestao, ambiente DES, com erro jq: parse error: Invalid numeric literal durante o polling de status do ArgoCD, acompanhado de warning de "orphaned resource" na Application.

Investigação: A aplicação é um componente novo (primeiro deploy, criado via Fusionx na semana anterior). Durante a análise foram identificados os seguintes pontos de configuração incompleta, herdados do template padrão e ainda não customizados para esta aplicação:

Bloco HTTPS/TLS do values.yaml comentado (aplicação expõe apenas porta 80/HTTP interno).
Manifesto akvs-sigex-frontend-painel-presi-gestao.yaml (AzureKeyVaultSecret) referenciando um Key Vault placeholder (<NOME_DO_KEYVAULT>) e um secret que não existe no vault correto (kv-gestao-nprd), tornando-se um recurso órfão na Application do ArgoCD.
ConfigMap (cm-sigex-frontend-painel-presi-gestao.yaml) ainda com dado placeholder (KEY: VALUE).
Arquivos environment.ts/environment.development.ts do Angular sem configuração de API, autenticação Azure AD ou host definidos.

Resolução: Em nova execução manual da esteira (run #3, develop_337760348045.3), o pipeline completou com sucesso (Status: Success, 7m54s) — todos os jobs (VALIDATION, Dockerfile validation, BUILD, ArgoCD_Deploy) concluídos e o container subiu normalmente. O bloqueio identificado nas execuções anteriores não se repetiu, indicando que a causa provável foi um problema pontual de tempo de sincronização no primeiro registro da Application no ArgoCD, e não um bloqueio estrutural causado pelo recurso órfão.

Pendências (não bloqueiam a esteira, mas seguem em aberto):

Definir host/domínio oficial da aplicação e, se necessário, associar certificado TLS existente em kv-gestao-nprd (padrão observado: certificados compartilhados por domínio, ex. gestao-controladoria-des-caixa, não por nome de aplicação).
Preencher o ConfigMap com as variáveis reais de ambiente (API, autenticação, Application Insights).
Corrigir ou remover o manifesto akvs-sigex-frontend-painel-presi-gestao.yaml conforme decisão acima, para eliminar o recurso órfão reportado pelo ArgoCD.

Encaminhamento: Pendências de configuração de negócio (host/domínio) e onboarding a serem tratadas com o time responsável pelo componente (group:default/g_az_idp_presi_arquiteto).
