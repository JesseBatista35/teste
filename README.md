keytool -list -v -storetype PKCS12 -keystore /tmp/s-4570-5_CERT_legacy.p12 -storepass 'G8KwaJ'

openssl x509 -in /tmp/cert_full.pem -noout -subject -dates
