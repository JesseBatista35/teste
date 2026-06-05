O pod sicbc-backend-des estava em CrashLoopBackOff. A aplicação Quarkus requer variáveis de ambiente para inicializar.
Causa Raiz:
As seguintes variáveis não estavam configuradas:

QUARKUS_OIDC_CLIENT_ID
QUARKUS_OIDC_AUTH_SERVER_URL
QUARKUS_HTTP_CORS_ORIGINS
QUARKUS_OIDC_CREDENTIALS_SECRET

Solução:
As variáveis já foram adicionadas ao Variable Group SICBC-BACKEND-DES do Azure DevOps.
Time de Desenvolvimento: Preencher os valores coretos nessas 4 variáveis.
Quando rodar a próxima release, as variáveis serão automaticamente injetadas no OKD e a aplicação iniciará corretamente.
