# 1. f517263 consegue ler?
su - f517263 -c "head -c1 /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks >/dev/null && echo LEITURA OK"

# 2. o truststore tem a cadeia do SSO? (Enter na senha se pedir; o -list funciona sem ela)
keytool -list -keystore /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks | grep -i -E "caixa|ac" 
openssl s_client -connect login.des.caixa:443 -showcerts </dev/null 2>/dev/null | grep -E "s:|i:"
