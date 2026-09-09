keytool -list -v -keystore /infra_app/config/sifug/IF104.p12 -storetype PKCS12 -storepass 123456 | grep -i "alias\|valid\|until"

openssl x509 -in /opt/open/jboss/7.0.0/domain/configuration/keystoreIF104_1.crt -noout -dates
