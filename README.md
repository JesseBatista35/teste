O deploy do SIHDG-jboss8 em DES foi normalizado. A versão 3.15.0.0 está no ar e funcionando (/sihdg-api respondendo).

O que aconteceu
Com a migração para JBoss EAP 8 + Java 21 (RHEL 9), a aplicação não conseguia conectar ao SQL Server de DES (10.116.93.91 / HDGDB001). O servidor de banco usa um certificado TLS assinado com SHA-1, algoritmo que o Java 21 no RHEL 9 bloqueia por padrão. Por isso o deploy falhava no início da aplicação (SecurityConfig / CacheConfig) e a esteira dava timeout. O trustServerCertificate=true da URL de conexão não contorna essa validação.

O que foi feito
Incluímos a flag -Djava.security.disableSystemPropertiesFile=true na variável _ENV.JAVA_OPTS_APPEND do grupo SIHDG-JBOSS8-DES da release. É um contorno temporário, válido só para DES.

Pontos de atenção

TQS, HMP e PRD: o mesmo erro deve aparecer nos próximos ambientes se o SQL Server de lá também usar certificado SHA-1. O sinal no log é Algorithm constraints check failed on signature algorithm: SHA1withRSA. Nos avisem antes da promoção para avaliarmos juntos.
Correção definitiva: o certificado da instância SQL Server precisa ser trocado por um SHA-256. Vamos abrir o chamado para a equipe de Banco de Dados. Quando for trocado, a flag será removida.
Dados sensíveis:
A chave siaud.int.siico.api.key aparece em texto aberto no log de inicialização do JBoss. Sugerimos mascará-la ou movê-la para secret.
A senha do datasource é igual ao usuário. Recomendamos trocá-la, e vamos marcar as senhas do grupo de variáveis como secret.
