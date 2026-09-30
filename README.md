Prezado Ronaldo,

Após reavaliação, retificamos a análise anterior. As imagens continuavam sendo geradas, porém no ImageStream build-images-ads/sirex-agenda-api-esteiras, enquanto a Release consulta build-images-ads/sirex-agenda-api, o que resultava em HTTP 404.

Causa: a task "CRIA_IMAGE_OKD_QUARKUS - Application Insights" é legada e usa a convenção de nomes do OKD3 (sufixo -esteiras). Ela não corresponde ao procedimento vigente para Application Insights em Quarkus. Além disso, o grupo SIREX-AGENDA-API-DES recebeu apenas o -javaagent, sem as demais configurações necessárias (APPLICATIONINSIGHTS_CONNECTION_STRING, proxy, JKS com a cadeia da Azure). Por isso, a Release das ~10:43 gerou o rollout 81, que falhou: o -javaagent foi aplicado sobre a imagem anterior, que não contém o agente.

Ações realizadas:

Restaurada a task padrão "CRIA_IMAGE_OKD_QUARKUS" no pipeline de Build;
Removido o -javaagent de _ENV.JAVA_OPTIONS_APPEND no grupo SIREX-AGENDA-API-DES;
Executada nova Build (20260930.1412-0.2.4.5-SNAPSHOT) e Release em EC DES com sucesso. Aplicação em execução (rollout 82). Uma primeira tentativa de build falhou por indisponibilidade momentânea do cluster OKD produtos4, que afetou outros sistemas no mesmo horário.

Próximos passos (time de desenvolvimento): para habilitar o Application Insights, favor seguir a wiki "Configuração do Application Insights no Quarkus" (Caixa.wiki):

Incluir a dependência com.microsoft.azure:applicationinsights-agent no pom.xml;
Abrir REQ à CETAD36 (CETAD - Suporte Não-Produção → Suporte à Aplicação Multiplataforma) para inclusão das variáveis APPLICATIONINSIGHTS_* e do -javaagent no grupo de DES, com o path gerado pela Build (/deployments/lib/main/...);
Ajustar o JKS da aplicação para conter a cadeia de certificados da Azure.

Observação: a aplicação registra em log os headers completos das requisições REST, incluindo apiKey e token Bearer. Recomendamos remover esse log e avaliar a rotação da apiKey.

Atenciosamente,
Jessé Batista – Esteira DevOps DES/TQS NPRD
