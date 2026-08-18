Prezados,

Durante a investigação da falha de startup do sigfa-api-extratos em DES (pod em CrashLoopBackOff), identificamos e corrigimos os seguintes pontos do lado da esteira/infra:

1. Causa raiz identificada e corrigida (config source):
A variável VAULT_LOCATION no grupo SIGFA-API-EXTRATOS-BT-VAULT-DES/TQS estava com o token #{VAULT_LOCATION}# não resolvido. Corrigimos para o path literal /usr/src/app/secrets_files/SIGFA_DES/, alinhado ao mount do secrets-agent sidecar (BeyondTrust). Isso resolveu o NullPointerException inicial do FileSystemConfigSourceFactory.

2. Segunda causa identificada e corrigida (nome de variável OIDC):
Encontramos a variável _ENV.QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET no grupo SIGFA-API-EXTRATOS-DES/TQS. Essa env var mapeia para a propriedade quarkus.oidc-client.credentials.secret (extensão quarkus-oidc-client, usada para propagação de token em chamadas de saída), e não para quarkus.oidc.credentials.secret (extensão quarkus-oidc principal, que protege os endpoints da própria API — é exatamente onde o erro estava ocorrendo, em OidcProviderClientImpl/TenantContextFactory).

Renomeamos a variável para _ENV.QUARKUS_OIDC_CREDENTIALS_SECRET (mantendo o mesmo valor ${CLISERGFA_SSO_INTRA}) em DES e TQS, e disparamos novo release.

3. Situação atual:
Confirmamos que os secrets do BeyondTrust (SGFADS01_ORACLE, CLISERGFA_SSO_INTRA, SIGFA_APIKEY) estão sendo lidos corretamente pelo secrets-agent e gravados no path esperado — validado via secrets-check (init container) e inspeção direta do arquivo dentro do pod (conteúdo íntegro, sem caracteres inválidos).

Mesmo após a correção do nome da variável e novo deploy, o mesmo erro segue ocorrendo:

ERROR [io.quarkus.oidc.runtime.OidcProviderClientImpl] Failed to create OidcProviderClientImpl: java.util.NoSuchElementException: No value present
	at io.quarkus.oidc.common.runtime.OidcCommonUtils.initClientSecretBasicAuth(OidcCommonUtils.java:533)

Pedido ao time de desenvolvimento:
Como o valor do secret está confirmado íntegro no filesystem e o nome da env var já bate com a propriedade padrão do Quarkus (quarkus.oidc.credentials.secret), pedimos que revisem, no application.properties/application.yaml do código-fonte:

Se existe alguma propriedade quarkus.oidc.credentials.client-secret.* (formato estendido) conflitando ou sobrepondo quarkus.oidc.credentials.secret — o Quarkus pode estar priorizando uma sobre a outra.
Se há necessidade explícita de quarkus.oidc.credentials.client-secret.method=basic ou post configurado.
Se o profile %prod ou algum override de build-time está fixando essa config de outra forma.
Se o tenant OIDC (login.des.caixa/auth/realms/intranet, client cli-ser-gfa) está realmente exigindo client secret, ou se mudou o método de autenticação esperado do lado do Keycloak.
