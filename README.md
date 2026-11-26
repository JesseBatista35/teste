oc project sisou-des
oc get pod -l name=sisou-sac-okd-des
oc rsh <pod-running>

# 1) Cadeia que o pod recebe da IndeCX, passando pelo proxydes
keytool -printcert -sslserver indecx.com:443 \
  -J-Dhttps.proxyHost=proxydes.caixa -J-Dhttps.proxyPort=80 \
  | grep -E "^Certificate|Owner:|Issuer:|Valid from"

# 2) Senha do truststore (no log ela aparece mascarada, mas na linha de comando do processo não)
ps -ef | grep -o 'trustStorePassword=[^ ]*' | head -1

# 3) Conteúdo do truststore em uso
keytool -list -v -storepass '<senha_do_passo_2>' \
  -keystore /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20260827.jks \
  | grep -E "^Alias|^Owner:"
