Próximos passos para confirmar

No pod (oc rsh -n sisou-des sisou-sac-okd-des-252-56hk7):

bash
# 1) Cadeia que o pod recebe passando pelo proxy
echo | openssl s_client -connect indecx.com:443 -servername indecx.com \
  -proxy proxydes.caixa:80 -showcerts 2>/dev/null | grep -E "s:|i:"

# 2) O que existe no truststore em uso
keytool -list -v -keystore /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20260827.jks \
  -storepass '<senha>' | grep -E "^Alias|^Owner:"

Se o emissor raiz ou intermediário do passo 1 não aparecer no passo 2, a causa está confirmada.

Correção:

Exportar a raiz/intermediária da cadeia do passo 1 e importar no .jks com keytool -importcert. Se o proxy faz inspeção, o certificado a importar é o da CA do proxy.
Gerar o arquivo com data nova e atualizar na origem dele (secure file ou repositório de config do SISOU). Fazer igual nos grupos DES e TQS.
Rodar a release de novo e pedir ao dev para disparar a integração.

Em paralelo, a linha standalone.conf: line 37: =org.jboss.byteman: command not found no boot é um erro de sintaxe no standalone.conf, provavelmente uma atribuição sem nome de variável. Não tem relação com o PKIX, mas vale corrigir quando mexer na release.

Não redigi o texto da WO. Quando confirmar a cadeia e o truststore estiver corrigido, me passa o resultado que eu escrevo.
