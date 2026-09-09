Prezados,

A configuração do Application Insights para o SISGF-backend-des (DES) foi concluída e validada.

Ajustes aplicados:
- Correção do NO_PROXY (tráfego para a Azure passando corretamente pelo proxydes.caixa)
- Ampliação da ResourceQuota do namespace sisgf-des
- Correção do JAVA_OPTIONS_APPEND (versão do agente 3.3.1 consistente com a imagem)

Após o deploy, confirmei no Application Map do Application Insights que a telemetria está chegando normalmente: 7 instâncias ativas, com chamadas de dependência sendo capturadas (DB2, Oracle e Keycloak/OIDC) e latências sendo medidas corretamente.

Considero a demanda encerrada. Qualquer ajuste adicional que precisarem, seguimos à disposição.

Atenciosamente,
Jessé Batista
