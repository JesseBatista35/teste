cd /tmp
openssl s_client -connect api.des.caixa:8443 -showcerts </dev/null 2>/dev/null | \
awk '/BEGIN CERT/,/END CERT/{print > ("cert" n ".pem")} /END CERT/{n++}'


ls -la cert*.pem


sudo keytool -importcert -alias icptestes-raiz -file cert2.pem \
  -keystore /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/lib/security/cacerts -storepass changeit


  sudo keytool -importcert -alias icptestes-sub -file cert1.pem \
  -keystore /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/lib/security/cacerts -storepass changeit


  sudo keytool -importcert -alias apim-des-caixa -file cert0.pem \
  -keystore /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/lib/security/cacerts -storepass changeit


  sudo keytool -list -keystore /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/lib/security/cacerts -storepass changeit | grep -i icptestes
