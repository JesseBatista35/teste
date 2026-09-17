openssl pkcs12 -in /infra_app/config/sifug/IF104.p12 -clcerts -nokeys -passin pass:SENHA_AQUI | openssl x509 -noout -subject -issuer -serial -dates

sudo su
keytool -list -v -keystore /infra_app/config/sifug/IF104.p12 -storetype PKCS12 -storepass 'SENHA_AQUI'

grep "keystore.if104.password" /infra_app/config/sifug/sifug_sifgd.properties

sudo vi /infra_app/config/sifug/sifug_sifgd.properties

ls -la /infra_app/config/sifug/IF104.p12 /infra_app/config/sifug/IF104.p12.bak_20260917

sudo cp /infra_app/config/sifug/IF104.p12.bak_20260917 /infra_app/config/sifug/IF104.p12
