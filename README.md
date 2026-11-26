1. Montar o .jks definitivo (dentro do pod)
bash
cd /tmp
export https_proxy=http://proxydes.caixa:80
for c in AmazonRootCA1 AmazonRootCA2 AmazonRootCA3 AmazonRootCA4 SFSRootCAG2; do
  curl -sSf -o $c.pem https://www.amazontrust.com/repository/$c.pem && echo "OK $c"
done

cp /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20260827.jks \
   caixa-truststore-acteste-nprd-sisou-20261126.jks

for c in AmazonRootCA1 AmazonRootCA2 AmazonRootCA3 AmazonRootCA4 SFSRootCAG2; do
  keytool -importcert -noprompt -alias "$(echo $c | tr 'A-Z' 'a-z')" -file $c.pem \
    -keystore caixa-truststore-acteste-nprd-sisou-20261126.jks -storepass changeit
done

keytool -list -storepass changeit -keystore caixa-truststore-acteste-nprd-sisou-20261126.jks | grep contains   # esperado: 44
keytool -list -v -storepass changeit -keystore caixa-truststore-acteste-nprd-sisou-20261126.jks \
  | grep "^Owner:" | grep -i -E "amazon root|starfield"

Se o curl falhar (por proxy ou CA), use a raiz que já foi tirada do handshake: keytool -importcert -noprompt -alias amazonrootca1 -file /tmp/cert-02 .... Ela já resolve a IndeCX.

2. Trazer o arquivo para a máquina de salto

Saia do pod com exit e rode:

bash
oc get pod -n sisou-des -l name=sisou-sac-okd-des
oc cp sisou-des/<pod>:/tmp/caixa-truststore-acteste-nprd-sisou-20261126.jks ./caixa-truststore-acteste-nprd-sisou-20261126.jks
ls -l caixa-truststore-acteste-nprd-sisou-20261126.jks
3. Descobrir de onde o .jks vem
bash
oc get dc sisou-sac-okd-des -n sisou-des -o yaml | grep -i -E -B2 -A6 "truststore|\.jks"
oc get dc sisou-sac-okd-des -n sisou-des -o jsonpath='{range .spec.template.spec.volumes[*]}{.name}{" -> "}{.configMap.name}{.secret.secretName}{"\n"}{end}'
oc get cm,secret -n sisou-des | grep -i -E "trust|jks|cert"

Se não aparecer como volume, o arquivo está embutido na imagem. Nesse caso ele vem do secure file da Library do Azure DevOps ou do repositório de config do SISOU (configuration/), copiado na build/release. Para confirmar, procure por 20260827 na release, em Library → Secure files e no repo de config.

4a. Se for um configmap/secret montado
bash
# exemplo para secret; troque <nome> e <chave> pelo que apareceu no passo 3
oc get secret <nome> -n sisou-des -o yaml > backup-<nome>-20261126.yaml
oc create secret generic <nome> -n sisou-des \
  --from-file=<chave>=caixa-truststore-acteste-nprd-sisou-20261126.jks \
  --dry-run=client -o yaml | oc replace -f -

Se a chave tiver o nome antigo (...20260827.jks), mantenha o mesmo nome de chave para não precisar mexer no JAVA_OPTS. Ou ajuste o JAVA_OPTS para o nome novo.

4b. Se for secure file ou repo de config
Secure file: suba o ...20261126.jks em Library → Secure files, troque a referência na task da release e ajuste o -Djavax.net.ssl.trustStore na variável ou grupo onde o JAVA_OPTS é montado.
Repo de config: faça commit do arquivo novo em configuration/ e atualize a referência no JAVA_OPTS. Se for mais simples, mantenha o nome antigo e substitua o conteúdo.

Faça a mesma troca no grupo de TQS.

5. Rodar a release de novo e validar
bash
oc get pod -n sisou-des -l name=sisou-sac-okd-des -w        # esperar o pod novo ficar Running
oc logs <pod-novo> -c sisou-sac-okd-des -n sisou-des | grep -o "trustStore=[^ ]*"
oc rsh <pod-novo> keytool -list -storepass changeit \
  -keystore /opt/jboss/standalone/configuration/<arquivo-em-uso>.jks | grep contains
oc logs -f <pod-novo> -c sisou-sac-okd-des -n sisou-des | grep -i -E "indecx|PKIX"

Peça ao dev para disparar a integração. Se não aparecer PKIX no log, está corrigido.

Se você me colar a saída do passo 3, eu te digo qual dos caminhos 4a/4b seguir e os comandos exatos.
