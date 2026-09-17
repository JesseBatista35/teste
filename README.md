ls -la /infra_app/config/sifug/IF104.p12.bak_20260917 /infra_app/config/sifug/IF104.p12

chown spjbotr2:<grupo_do_backup> /infra_app/config/sifug/IF104.p12
chmod --reference=/infra_app/config/sifug/IF104.p12.bak_20260917 /infra_app/config/sifug/IF104.p12

keytool -list -keystore /infra_app/config/sifug/IF104.p12 -storetype PKCS12 -storepass <senha_que_te_passaram>
