
-sh-4.2$
-sh-4.2$ sudo keytool -importcert -alias apim-des-caixa -file cert.pem \
>   -keystore /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/lib/security/cacerts -storepass changeit
O certificado foi adicionado à área de armazenamento de chaves
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$  sudo keytool -list -keystore /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/lib/security/cacerts -storepass changeit | grep -i "icptestes\|apim"
icptestes-raiz, 06/08/2026, trustedCertEntry,
icptestes-sub, 06/08/2026, trustedCertEntry,
apim-des-caixa, 06/08/2026, trustedCertEntry,
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ openssl x509 -in cert.pem -noout -subject -serial
subject= /C=BR/O=Caixa Economica Federal/CN=api.des.caixa
serial=7E00000860471C4EEDC7EA0650000000000860
-sh-4.2$
-sh-4.2$
-sh-4.2$
