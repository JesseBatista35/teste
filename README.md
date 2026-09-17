keytool -list -v -keystore /infra_app/config/sifug/IF104.p12 -storetype PKCS12

openssl pkcs12 -in /infra_app/config/sifug/IF104.p12 -clcerts -nokeys -passin pass: | openssl x509 -noout -subject -issuer -serial -dates
