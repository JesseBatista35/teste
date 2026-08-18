Prezados,

Estamos avaliando a implantação do Azure Application Insights no sistema SIATD, inicialmente para o ambiente DES.

Durante a análise técnica foram consultadas as documentações corporativas da Esteira DevOps relacionadas ao Azure Application Insights para aplicações Java/JBoss e Quarkus. A documentação orienta que a variável APPLICATIONINSIGHTS_CONNECTION_STRING deve ser obtida a partir do workspace da comunidade na Azure.

Também foram analisados os artefatos disponíveis na Esteira DevOps do SIATD, incluindo repositório de configuração, histórico do arquivo applicationinsights.json, Pull Requests, Variable Groups de referência, Wikis, código-fonte e Work Items, sem que fosse possível identificar:

• o workspace Azure da comunidade responsável pelo SIATD;
• a existência de recurso Azure Application Insights provisionado para o sistema;
• a APPLICATIONINSIGHTS_CONNECTION_STRING a ser utilizada.

Solicitamos orientação quanto ao workspace Azure associado ao SIATD, existência de recurso Application Insights já provisionado e obtenção da APPLICATIONINSIGHTS_CONNECTION_STRING.

Caso não exista recurso previamente provisionado, solicitamos orientação quanto ao fluxo adequado para criação/provisionamento do Azure Application Insights para o SIATD.

Objetivo: viabilizar a implantação da monitoração do SIATD via Azure Application Insights conforme as orientações da Esteira DevOps.


Atenciosamente,


Ronaldo C. Oliveira
c140030
