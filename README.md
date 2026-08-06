sudo keytool -importcert -alias apim-des-caixa -file cert.pem \
  -keystore /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/lib/security/cacerts -storepass changeit

  sudo keytool -list -keystore /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/lib/security/cacerts -storepass changeit | grep -i "icptestes\|apim"

  openssl x509 -in cert.pem -noout -subject -serial
