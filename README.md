openssl pkcs12 -in /infra_app/config/sifug/IF104.p12 -clcerts -nokeys | openssl x509 -noout -subject -issuer -serial -dates
