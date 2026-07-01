Prezados,
Analisando a falha de startup da aplicação em DES (erro abaixo), identificamos que o application.properties do módulo não possui nenhuma configuração quarkus.tls.* para o keystore mTLS da aplicação. Existe apenas configuração de keystore/truststore para Kafka (kafka.ssl.truststore.*) e para o MQ (via JAVA_OPTIONS_APPEND), mas nada relacionado ao certificado mTLS do listener HTTP.
Erro apresentado no startup:
Caused by: java.lang.IllegalStateException: Invalid P12 key store configuration for certificate '<default>' - the key store password is not set and cannot be retrieved from the credential provider.
Do lado de infraestrutura, já deixamos preparado o secure file, secret no Vault e variáveis de ambiente para disponibilizar o keystore e a senha no container, no caminho obrigatório definido na demanda (/certs/webhook-mtls-keystore.p12), aguardando também a geração do certificado pela Segurança. Porém, sem a property correspondente no código, a aplicação não sabe onde buscar esse keystore nem como resolver a senha — por isso o erro persiste independente da infra.
Solicitamos a inclusão das seguintes properties no application.properties (ajustar nomes conforme padrão do projeto se necessário):
quarkus.tls.key-store.p12.path=${WEBHOOK_MTLS_KEYSTORE_LOCATION}
quarkus.tls.key-store.p12.password=${WEBHOOK_MTLS_KEYSTORE_PASSWORD}
Se o objetivo for mTLS completo (validação de certificado do client, não só apresentação do certificado do servidor), também será necessário configurar o trust-store correspondente:
quarkus.tls.trust-store.p12.path=${WEBHOOK_MTLS_TRUSTSTORE_LOCATION}
quarkus.tls.trust-store.p12.password=${WEBHOOK_MTLS_TRUSTSTORE_PASSWORD}
O keystore será montado no container no caminho fixo /certs/webhook-mtls-keystore.p12, conforme especificado na demanda original. As variáveis de ambiente acima (WEBHOOK_MTLS_KEYSTORE_LOCATION, WEBHOOK_MTLS_KEYSTORE_PASSWORD) já estão nomeadas conforme o padrão que vamos configurar no grupo de variáveis do pipeline DES. Caso o time de desenvolvimento prefira outros nomes, por favor nos informe para alinharmos antes de subir a configuração.
Ficamos no aguardo da confirmação e do ajuste para prosseguirmos com a validação em DES.
Atenciosamente,
Jessé Batista
CTIS / CESTI Esteiras DEVOPS DES TQS NPRD
