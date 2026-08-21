
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ cat /tmp/s-4570-5_senha_certificado_CERT
cat: /tmp/s-4570-5_senha_certificado_CERT: Arquivo ou diret▒rio n▒o encontrado
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ keytool -list -storetype PKCS12 -keystore /opt/keystore/s-4570-5_CERT.p12 -storepass "SENHA_AQUI" 2>&1
erro de keytool: java.io.IOException: parseAlgParameters failed: DER input not an octet string
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ ls -la /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12
-rw-r--r-- 1 c160397 desenv 5259 Nov 10  2025 /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ md5sum /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12 /opt/keystore/s-4570-5_CERT.p12
0a2fd3325b36803a3480bff15e4612b1  /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12
968a3502b5a85e5e3d207f6f9303e73a  /opt/keystore/s-4570-5_CERT.p12
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ grep -r -i "00360305000104\|keystore\|s-4570" /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/ 2>/dev/null
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/sinac-siarq.properties_251216_old:sinac.b3i.api.requesttransactions.cnpjcaixa=00360305000104
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/sinac-siarq.properties_bk_260819:sinac.b3i.api.requesttransactions.cnpjcaixa=00360305000104
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/sinac-siarq.properties_bk_260819:sinac.b3i.api.certificate=/conf/certs/00360305000104.p12
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/sinac-siarq.properties_bk_2026_07_02:sinac.b3i.api.requesttransactions.cnpjcaixa=00360305000104
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/sinac-siarq.properties_bk_2026_07_02:sinac.b3i.api.certificate=\\conf\\certs\\00360305000104.p12
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/sinac-siarq.properties:sinac.b3i.api.requesttransactions.cnpjcaixa=00360305000104
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/sinac-siarq.properties_20251217_old:sinac.b3i.api.requesttransactions.cnpjcaixa=00360305000104
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/sinac-siarq.properties_20251217_old:sinac.b3i.api.certificate=/conf/certs/00360305000104.p12
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/sinac-siarq.properties_bk_260707:sinac.b3i.api.requesttransactions.cnpjcaixa=00360305000104
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/sinac-siarq.properties_bk_260707:sinac.b3i.api.certificate=/conf/certs/00360305000104.p12
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/siran.properties:keystore.type=JCEKS
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/siran.properties:ks.xs51N4Q=../server/sinac/keystore/.xs51N4Q
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/siran.properties:ks.jx51N4Q=../server/sinac/keystore/.jx51N4Q
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/sinac-siarq.properties.backup.20260219_161236:sinac.b3i.api.requesttransactions.cnpjcaixa=00360305000104
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/sinac-siarq.properties.backup.20260219_161236:sinac.b3i.api.certificate=/conf/certs/00360305000104.p12
[p585600@cspdeapllx011 ~]$
