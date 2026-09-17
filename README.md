keytool -list -v -keystore /infra_app/config/sifug/IF104.p12 -storetype PKCS12


grep -ri "pkcs11\|dinamo" /opt/open/java/jdk1.8.0_121/jre/lib/security/java.security
find / -iname "*dinamo*" 2>/dev/null
