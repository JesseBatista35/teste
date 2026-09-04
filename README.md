Prezados,

Durante a análise do deploy do pipeline SIICO-api-segmento-operacional no ambiente EC DES, identificamos que a aplicação está falhando na inicialização com o seguinte erro:

System.ArgumentException: Startup hook assembly '/opt/app-root/apm_agent/ElasticApmAgentStartupHook.dll' failed to load. System.IO.FileNotFoundException: Could not load file or assembly '/opt/app-root/apm_agent/ElasticApmAgentStartupHook.dll'. The system cannot find the file specified.

A variável de ambiente _ENV.DOTNET_STARTUP_HOOKS está configurada para carregar o agente Elastic APM no startup da aplicação .NET, porém o arquivo referenciado não está presente no container em tempo de execução, causando falha imediata da aplicação.

Esse comportamento indica um problema de instrumentação/dependência da própria aplicação (ausência ou falha no empacotamento do agente Elastic APM na imagem/publicação da aplicação), e não um problema de infraestrutura ou de configuração de pipeline por parte da esteira DevOps.

Solicitamos que o time de desenvolvimento verifique:

Se o pacote/agente Elastic APM está corretamente incluído no build/publish da aplicação
Se a versão da aplicação está compatível com o startup hook configurado
Se é necessário ajuste no processo de build para garantir que o arquivo ElasticApmAgentStartupHook.dll seja empacotado corretamente na imagem
