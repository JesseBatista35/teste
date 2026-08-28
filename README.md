Resumo: Deploy do serviço sifap-centralizadora-backend-intranet-tqs (ambiente TQS/OKD4-NPRD) apresentava falha de rollout, com a task Verificando Status do Deployment estourando timeout.

Causa raiz identificada: o pod não inicializava a JVM devido a erro no javaagent do Application Insights. O parametro JAVA_OPTIONS_APPEND na variavel de ambiente do pipeline apontava para a versao 3.3.1 do agente (com.microsoft.azure.applicationinsights-agent-3.3.1.jar), arquivo inexistente na imagem atual do container, gerando o erro "Error opening zip file or JAR manifest missing" e impedindo a subida da aplicacao.

Acao realizada: atualizada a variavel _ENV.JAVA_OPTIONS_APPEND no variable group SIFAP-CENTRALIZADORA-BACKEND-INTRANET-TQS no Azure DevOps, alterando a referencia do agente de 3.3.1 para 3.6.2, mesma versao ja utilizada no ambiente DES.

Resultado: Novo release executado apos o ajuste, deploy concluido com sucesso e pod em execucao normal no ambiente TQS.
