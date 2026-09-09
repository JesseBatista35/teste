
Last login: Mon Aug 24 10:32:33 2026 from 10.122.150.31
-sh-4.2$ ps -ef | grep jboss
p585600   32062  32019  0 18:33 pts/0    00:00:00 grep --color=auto jboss
-sh-4.2$ ps -ef | grep java
p585600   32067  32019  0 18:33 pts/0    00:00:00 grep --color=auto java
-sh-4.2$ hostname -i
10.116.94.211
-sh-4.2$ hostname -f
sbrdeapllx104.extra.caixa.gov.br
-sh-4.2$


Prezados,

Concluímos a configuração do Application Insights para o SISGF (módulo sisgf-backend-des) no ambiente DES/NPRD.

Foram identificados e corrigidos os seguintes pontos:
- Variável _ENV.NO_PROXY estava configurada de forma invertida, fazendo o tráfego para os endpoints da Azure (*.applicationinsights.azure.com e *.livediagnostics.monitor.azure.com) tentar sair direto para a internet em vez de passar pelo proxydes.caixa. Corrigido para .caixa,.caixa.gov.br.
- ResourceQuota do namespace sisgf-des estava no limite (requests.cpu 4050m de 5), impedindo a subida de novos pods durante o rolling update. Ampliado o limite para 6 cores.
- Variável _ENV.JAVA_OPTIONS_APPEND estava temporariamente divergente da versão do agente empacotada na imagem, causando falha de inicialização (JAR manifest missing). Corrigido para apontar para a versão 3.3.1, consistente com o pom.xml.

Após os ajustes, o release foi executado com sucesso: rollout completo (3 de 3 réplicas), agente Application Insights 3.3.1 iniciado sem erros, telemetria fluindo para o workspace configurado (Instrumentation Key 99ee6c02-0bc8-4c2e-8109-b744a54e07ae).

Solicito que vocês validem a chegada dos dados no workspace do Application Insights e, caso positivo, considerem a demanda encerrada. Qualquer necessidade de novo deploy ou ajuste adicional, seguimos à disposição.

Atenciosamente,
Jessé Batista
