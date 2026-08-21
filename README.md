cat /tmp/s-4570-5_senha_certificado_CERT

keytool -list -storetype PKCS12 -keystore /opt/keystore/s-4570-5_CERT.p12 -storepass "SENHA_AQUI" 2>&1

keytool -list -v -storetype PKCS12 -keystore /opt/keystore/s-4570-5_CERT.p12 -storepass "SENHA_AQUI" 2>&1 | grep -A2 "Valid from"
keytool -list -v -storetype PKCS12 -keystore /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12 -storepass "SENHA_ANTIGA_SE_SOUBER" 2>&1 | grep -A2 "Valid from"
