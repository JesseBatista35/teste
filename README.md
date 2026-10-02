Causa: a aplicação não inicializava porque a biblioteca SICBP-infra-componentes-2.16.0.1 passou a exigir a propriedade API_TRILHA_URL, que não existia nos grupos de variáveis do ambiente DES. Havia apenas API_TRILHA_BASEPATH, no grupo SICBP-COMMON-BACKEND-DES. Sem a propriedade, o pod falhava na subida e a task "Verificando Status do Deployment" encerrava por timeout.

Solução: incluída a variável _ENV.API_TRILHA_URL no grupo SICBP-MENUDINAMICO-BACKEND-DES. Após reexecução da release, o deploy foi concluído com sucesso, o pod está saudável e a aplicação responde normalmente.

Observações à equipe de desenvolvimento:

Para promoção a TQS, será necessário incluir API_TRILHA_URL também no grupo SICBP-MENUDINAMICO-BACKEND-TQS, com o endereço da trilha de TQS.
A aplicação ainda inicializa com o agente Elastic APM (-javaagent:/opt/apm_agent/elastic-apm-agent.jar), que não consegue conectar ao servidor APM e gera erros recorrentes no log. Como a aplicação já utiliza Application Insights, recomenda-se removê-lo da imagem/script de inicialização.

Demanda concluída.
