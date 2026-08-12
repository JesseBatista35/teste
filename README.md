Causa raiz: Deploys da revisão 38 a 48 falhando com CrashLoopBackOff (exit code 1) devido a variáveis API_KEY e API_CLIENT_SECRET ausentes na aplicação em runtime. Investigação identificou que a task de release "Exporta Variáveis de Ambiente '_SECRET.'" depende do prefixo _SECRET. para capturar essas variáveis e populá-las no Secret OpenShift siint-saquetecban-pendencia-api-des, consumido pela aplicação via SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS. Alteração temporária do prefixo para _ENV. (tentativa de correção anterior) quebrou esse mecanismo, gerando secret vazio.

Correção: Variáveis revertidas para _SECRET.API_KEY e _SECRET.API_CLIENT_SECRET no grupo SIINT-SAQUETECBAN-PENDENCIA-API-DES (scope EC DES), mantendo padrão original. Novo release (rev. 49) executado com sucesso — pod siint-saquetecban-pendencia-api-des-49-ntlzh em 1/1 Running.

Validação: Deploy estável, sem restarts, substituindo pod legado (rev. 37, imagem SNAPSHOT antiga).



