Finalizamos a investigação do erro de deploy do sisgf-backend. O aplicativo falhava ao tentar carregar a configuração api.key.
Causa Raiz Identificada:
A variável SISGF_APIKEY não estava definida na variable group SISGF-backend-des do Azure DevOps, causando o erro: "Failed to load config value of type class java.lang.String for: api.key"
Ações Executadas:

Adição do maven-dependency-plugin no pom.xml para copiar o Application Insights Agent JAR
Configuração do api.key no application.properties para leitura via variável de ambiente
Atualização do Dockerfile.jvm com script para exportar secrets do BeyondTrust como variáveis de ambiente
Criação da variável SISGF_APIKEY na variable group SISGF-backend-des

Próximas Ações Necessárias:

Preencher o valor da variável SISGF_APIKEY na variable group SISGF-backend-des (já criada, aguardando valor)
Aplicar as alterações dos arquivos pom.xml, application.properties e Dockerfile.jvm da branch cesti-teste
Executar o build e release da pipeline
Validar o deploy confirmando que o erro de api.key não aparece mais nos logs

Favor confirmar quando o valor for adicionado na variable group para prosseguirmos com o deploy.
