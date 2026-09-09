
[p585600@srjtqapllx0021 ~]$ keytool -list -v -keystore /infra_app/config/sifug/IF104.p12 -storetype PKCS12 -storepass 123456 | grep -i "alias\|valid\|until"
Alias name: 1
Valid from: Mon Aug 25 13:53:04 BRT 2025 until: Tue Aug 25 13:53:04 BRT 2026
Valid from: Wed Nov 08 11:29:23 BRT 2023 until: Mon Nov 06 11:29:23 BRT 2028
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$ openssl x509 -in /opt/open/jboss/7.0.0/domain/configuration/keystoreIF104_1.crt -noout -dates
unable to load certificate
139758731511624:error:0906D06C:PEM routines:PEM_read_bio:no start line:pem_lib.c:703:Expecting: TRUSTED CERTIFICATE
[p585600@srjtqapllx0021 ~]$
