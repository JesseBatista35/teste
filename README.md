
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$ grep -i -E "sincad|b3|keystore|cert|senha|password" /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/sinac-siarq.properties
sinac.api.crypto.parametros.url=https://api.des.caixa:8443/seguranca/criptografia-senhas/ecc/parametrospublicos
sinac.api.crypto.traducao.url=https://api.des.caixa:8443/seguranca/criptografia-senhas/ecc/traducao
# API B3I PORTABILIDADE
sinac.b3i.api.responseauthorizations.url=https://sinac-proxy-des.apps.nprd.caixa/b3/api/response-authorizations/v2/tokens
sinac.b3i.api.responseauthorizations.transactionid=CEF-987654321000
sinac.b3i.api.responseauthorizations.documenttypename=CPF
sinac.b3i.api.requesttransactions.url=https://sinac-proxy-des.apps.nprd.caixa/b3/api/assets-transactions/v1/transactions
sinac.b3i.api.requesttransactions.documenttypename=CPF
sinac.b3i.api.requesttransactions.cnpjcaixa=00360305000104
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$ keytool -list -v -storetype PKCS12 -keystore /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12 -storepass changeit 2>&1 | grep -A2 "Valid from\|Owner\|Alias"
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$
[p585600@cspdeapllx011 tmp]$ keytool -list -v -storetype PKCS12 -keystore /opt/keystore/s-4570-5_CERT.p12 -storepass changeit 2>&1 | grep -A2 "Valid from\|Owner\|Alias"
[p585600@cspdeapllx011 tmp]$ ls -la /opt/keystore/
total 32
drwxr-xr-x  2 root    root   4096 Ago 21 15:03 .
drwxr-xr-x 17 root    root   4096 Ago 25  2025 ..
-rw-r--r--  1 c160397 desenv 1730 Mai 29  2025 b3_portabilidade.key
-rw-r--r--  1 root    root   2175 Fev  2  2015 ca.crt
-rw-r--r--  1 root    root   1228 Ago 21 15:03 s-4570-5_CERT.cer
-rw-r--r--  1 root    root   1703 Ago 21 15:03 s-4570-5_CERT.key
-rw-r--r--  1 root    root   5384 Ago 21 15:03 s-4570-5_CERT.p12
[p585600@cspdeapllx011 tmp]$ file /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/siran/keystore
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/siran/keystore: directory
[p585600@cspdeapllx011 tmp]$
