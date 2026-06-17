Ah, é que não tem permissão de escrita no truststore padrão. Vamos criar um truststore customizado:

OPÇÃO 1: Criar Truststore Customizado (mais simples)
bash# Criar novo truststore a partir do padrão
cp $JAVA_HOME/lib/security/cacerts /tmp/custom-truststore.jks

# Importar com permissão
keytool -import -alias logintqs-caixa -file /tmp/logintqs.pem -keystore /tmp/custom-truststore.jks -storepass changeit -noprompt
Verifique:
bashkeytool -list /tmp/custom-truststore.jks -storepass changeit | grep logintqs

OPÇÃO 2: Usar Variável de Ambiente (Solução Definitiva)
Depois que importar no /tmp/custom-truststore.jks, você precisa fazer a aplicação usar ele.
Adicione ao seu deployment no OpenShift a variável de ambiente:
bashoc set env deployment/sispl-consulta-transacao-ocp4-tqs \
  JAVA_TOOL_OPTIONS="-Djavax.net.ssl.trustStore=/tmp/custom-truststore.jks -Djavax.net.ssl.trustStorePassword=changeit"

OPÇÃO 3: Montar via ConfigMap (Solução Prod)
Se quer algo mais permanente:
bash# Criar ConfigMap com o truststore
oc create configmap custom-truststore --from-file=/tmp/custom-truststore.jks -n sispl-tqs
Depois edite o deployment:
bashoc edit deployment sispl-consulta-transacao-ocp4-tqs
E adicione no spec.template.spec.containers:
yamlvolumeMounts:
  - name: truststore
    mountPath: /etc/truststore
volumes:
  - name: truststore
    configMap:
      name: custom-truststore
env:
  - name: JAVA_TOOL_OPTIONS
    value: "-Djavax.net.ssl.trustStore=/etc/truststore/custom-truststore.jks -Djavax.net.ssl.trustStorePassword=changeit"

Qual opção prefere? A mais rápida é a OPÇÃO 1 + 2 👆
