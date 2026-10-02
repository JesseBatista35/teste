
Prezados,

Foi realizada a implantação do Azure Application Insights no ambiente TQS do sistema SIREX Agenda.

A implantação foi concluída com sucesso e o agente foi iniciado corretamente, conforme evidência abaixo:

Application Insights Java Agent 3.7.10 started successfully


Também foi validado o carregamento do agente pela JVM:

-javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.10.jar


Entretanto, a telemetria não está sendo enviada ao Azure devido a bloqueio de comunicação identificado nos logs da aplicação.

Erro encontrado:

HttpProxyConnectException

status: 502 Proxy Error

Forefront TMG denied the specified Uniform Resource Locator (URL)


Endpoints afetados:

https://brazilsouth-1.in.applicationinsights.azure.com

https://brazilsouth.livediagnostics.monitor.azure.com


Solicitamos apoio para validação e eventual liberação de comunicação do ambiente TQS com os endpoints Azure necessários ao funcionamento do Application Insights.

Evidência anexada:

Log do pod sirex-agenda-api-tqs-19-kkkjn
Trechos contendo:
Application Insights Java Agent 3.7.10 started successfully
HttpProxyConnectException
502 Proxy Error
Forefront TMG denied the specified Uniform Resource Locator (URL)

Atenciosamente,

Ronaldo C. Oliveira
c140030



me ajdua a repsonder essa w.o

Todos, conforme orientações da CESTI36 e trecho abaixo retirado da WIKI:
 
 "Não é para configurar o Application Insights em ambiente de TQS"
 
 
"Como a quantidade de dados enviados a nuvem impacta no custo de utilização da ferramenta, temos adotado o procedimento de validar as configurações apenas em DES e, uma vez que os parâmetros de análise estejam corretamente ajustados, partimos direto para o ambiente PRD."


<img width="1919" height="1037" alt="image" src="https://github.com/user-attachments/assets/c4ed87bb-5276-45b0-a881-8d35d4ee36eb" />


