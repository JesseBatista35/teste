exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=JKS -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.6.2.jar -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-10-29 14:29:04.445-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.6.2 started successfully (PID 8, JVM running for 2.808 s)
2026-10-29 14:29:04.448-03:00 INFO  c.m.applicationinsights.agent - Java version: 21.0.1, vendor: Oracle Corporation, home: /usr/java/jdk-21.0.1
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-10-29 14:29:03,816 DEBUG [jdk.eve.security] (main) X509Certificate: Alg:SHA384withRSA, Serial:59b1b579e8e2132e23907bda777755c, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:1057369358, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-10-29 14:29:03,822 DEBUG [jdk.eve.security] (main) X509Certificate: Alg:SHA384withRSA, Serial:8ad40b260d29c4c9f5ecda9bd93aed9, Subject:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3406046841, Valid from:4/28/21, 9:00?PM, Valid until:4/28/36, 8:59?PM
2026-10-29 14:29:03,822 DEBUG [jdk.eve.security] (main) X509Certificate: Alg:SHA256withRSA, Serial:d1f02a4a2c5a3d3a37dda07199a3620, Subject:CN=Microsoft Corporation, OU=Java Signing (SHA2), O=Microsoft Corporation, L=Redmond, ST=Washington, C=US, Issuer:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:1223504232, Valid from:8/29/24, 9:00?PM, Valid until:10/29/27, 8:59?PM
2026-10-29 14:29:03,831 DEBUG [jdk.eve.security] (main) X509Certificate: Alg:SHA256withRSA, Serial:bae66bc5aba7f9587c6f9e904e33304, Subject:CN=DigiCert Timestamp 2024, O=DigiCert, C=US, Issuer:CN=DigiCert Trusted G4 RSA4096 SHA256 TimeStamping CA, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:3934399196, Valid from:9/25/24, 9:00?PM, Valid until:11/25/35, 8:59?PM
2026-10-29 14:29:03,831 DEBUG [jdk.eve.security] (main) X509Certificate: Alg:SHA256withRSA, Serial:73637b724547cd847acfd28662a5e5b, Subject:CN=DigiCert Trusted G4 RSA4096 SHA256 TimeStamping CA, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3207540671, Valid from:3/22/22, 9:00?PM, Valid until:3/22/37, 8:59?PM
2026-10-29 14:29:03,831 DEBUG [jdk.eve.security] (main) X509Certificate: Alg:SHA384withRSA, Serial:e9b188ef9d02de7efdb50e20840185a, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:845088433, Valid from:7/31/22, 9:00?PM, Valid until:11/9/31, 8:59?PM
2026-10-29 14:29:04,747 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:ce22972800344766b49ca5d407cd039, Subject:CN=Valid Certificadora RSA DV SSL CA, O=Valid Certificadora Digital LTDA, C=BR, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:3072, Cert Id:131886298, Valid from:8/1/23, 9:00?PM, Valid until:8/1/33, 8:59?PM
2026-10-29 14:29:04,812 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:83be056904246b1a1756ac95991c74a, Subject:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1341898239, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-10-29 14:29:04,813 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:397a66cc2756362e0daa87ca6eabe3b1, Subject:CN=Sectigo Public Server Authentication CA DV R36, O=Sectigo Limited, C=GB, Issuer:CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB, Key type:RSA, Length:3072, Cert Id:1180805919, Valid from:3/21/21, 9:00?PM, Valid until:3/21/36, 8:59?PM
2026-10-29 14:29:04,815 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:47b583ffce303b8047ba716d908e88d2, Subject:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:71683228, Valid from:12/23/22, 11:55?AM, Valid until:12/23/42, 12:05?PM
2026-10-29 14:29:04,816 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:1, Subject:CN=Autoridade Certificadora Raiz Brasileira v5, OU=Instituto Nacional de Tecnologia da Informacao - ITI, O=ICP-Brasil, C=BR, Issuer:CN=Autoridade Certificadora Raiz Brasileira v5, OU=Instituto Nacional de Tecnologia da Informacao - ITI, O=ICP-Brasil, C=BR, Key type:RSA, Length:4096, Cert Id:827042461, Valid from:3/2/16, 10:01?AM, Valid until:3/2/29, 8:59?PM
2026-10-29 14:29:04,816 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:1ed397095fd8b4b347701eaabe7f45b3, Subject:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:2848349048, Valid from:12/18/19, 7:51?PM, Valid until:7/18/42, 8:00?PM
2026-10-29 14:29:04,817 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:36825e7fb5a481937ef6d1736bb93ca6, Subject:CN=COMODO RSA Organization Validation Secure Server CA, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:245647897, Valid from:2/11/14, 10:00?PM, Valid until:2/11/29, 8:59?PM
2026-10-29 14:29:04,818 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:1ee5f221dfc623bd4333a8557, Subject:CN=GlobalSign RSA OV SSL CA 2018, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Key type:RSA, Length:2048, Cert Id:930132802, Valid from:11/20/18, 10:00?PM, Valid until:11/20/28, 9:00?PM
2026-10-29 14:29:04,819 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:3972443af922b751d7d36c10dd313595, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:4096, Cert Id:3160189236, Valid from:3/11/19, 9:00?PM, Valid until:12/31/28, 8:59?PM
2026-10-29 14:29:04,820 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:2, Subject:CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR, Issuer:CN=Autoridade Certificadora SERPRO v4, OU=Autoridade Certificadora Raiz Brasileira v5, O=ICP-Brasil, C=BR, Key type:RSA, Length:4096, Cert Id:4146249541, Valid from:1/9/17, 5:36?PM, Valid until:2/15/29, 4:36?PM
2026-10-29 14:29:04,820 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:600000000299b24b9d7901ea84000000000002, Subject:CN=AC Icptestes Sub, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:2447629493, Valid from:12/23/22, 12:47?PM, Valid until:12/23/42, 12:05?PM
2026-10-29 14:29:04,821 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:758dfd8bae7c0700faa925a7e1c7ad14, Subject:CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB, Issuer:CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB, Key type:RSA, Length:4096, Cert Id:3806652169, Valid from:3/21/21, 9:00?PM, Valid until:3/21/46, 8:59?PM
2026-10-29 14:29:04,822 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:1fd6d30fca3ca51a81bbc640e35032d, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:4096, Cert Id:3947601401, Valid from:1/31/10, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-10-29 14:29:04,822 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:40000000001154b5ac394, Subject:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Key type:RSA, Length:2048, Cert Id:536948034, Valid from:9/1/98, 9:00?AM, Valid until:1/28/28, 9:00?AM
2026-10-29 14:29:04,823 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:33af1e6a711a9a0bb2864b11d09fae5, Subject:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1136084297, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-10-29 14:29:04,823 DEBUG [org.jbo.logging] (main) Logging Provider: org.jboss.logging.JBossLogManagerProvider
2026-10-29 14:29:04,824 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource BuildTime RunTime Fixed with ordinal 2147483647
2026-10-29 14:29:04,824 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource SysPropConfigSource with ordinal 400
2026-10-29 14:29:04,824 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource EnvConfigSource with ordinal 300
2026-10-29 14:29:04,824 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:7d5b5126b476ba11db74160bbc530da7, Subject:CN=Sectigo RSA Domain Validation Secure Server CA, O=Sectigo Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:2048, Cert Id:2459870160, Valid from:11/1/18, 9:00?PM, Valid until:12/31/30, 8:59?PM
2026-10-29 14:29:04,824 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource PropertiesConfigSource[source=jar:file:///deployments/app/sifap-centralizadora-1.0.0-SNAPSHOT.jar!/application.properties] with ordinal 250
2026-10-29 14:29:04,824 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource DefaultValuesConfigSource with ordinal -2147483648
2026-10-29 14:29:04,825 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:90ee8c5de5bfa62d2ae2ff7097c4857, Subject:CN=Thawte TLS RSA CA G1, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:96139010, Valid from:11/2/17, 10:24?AM, Valid until:11/2/27, 9:24?AM
2026-10-29 14:29:04,825 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:83be056904246b1a1756ac95991c74a, Subject:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1341898239, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-10-29 14:29:04,826 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:4188b0e1a030eda84084ca76a3b1be32, Subject:CN=AC Interna Caixa, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Interna Caixa, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:2506492458, Valid from:10/13/22, 2:25?PM, Valid until:10/13/42, 2:35?PM
2026-10-29 14:29:04,827 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:62000000027328772c722ac752000000000002, Subject:CN=AC Interna APL, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Interna Caixa, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:3746844432, Valid from:10/13/22, 3:34?PM, Valid until:10/13/42, 2:35?PM
2026-10-29 14:29:04,827 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:3972443af922b751d7d36c10dd313595, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:4096, Cert Id:3160189236, Valid from:3/11/19, 9:00?PM, Valid until:12/31/28, 8:59?PM
2026-10-29 14:29:04,828 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:1ee5f221dfc623bd4333a8557, Subject:CN=GlobalSign RSA OV SSL CA 2018, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Key type:RSA, Length:2048, Cert Id:930132802, Valid from:11/20/18, 10:00?PM, Valid until:11/20/28, 9:00?PM
2026-10-29 14:29:04,829 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:5, Subject:CN=Autoridade Certificadora SERPRO v4, OU=Autoridade Certificadora Raiz Brasileira v5, O=ICP-Brasil, C=BR, Issuer:CN=Autoridade Certificadora Raiz Brasileira v5, OU=Instituto Nacional de Tecnologia da Informacao - ITI, O=ICP-Brasil, C=BR, Key type:RSA, Length:4096, Cert Id:1380576325, Valid from:9/14/16, 10:10?AM, Valid until:3/2/29, 9:00?AM
2026-10-29 14:29:04,830 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:3097386402, Valid from:12/31/03, 10:00?PM, Valid until:12/31/28, 8:59?PM
2026-10-29 14:29:04,830 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:3097386402, Valid from:12/31/03, 10:00?PM, Valid until:12/31/28, 8:59?PM
2026-10-29 14:29:04,831 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:7d5b5126b476ba11db74160bbc530da7, Subject:CN=Sectigo RSA Domain Validation Secure Server CA, O=Sectigo Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:2048, Cert Id:2459870160, Valid from:11/1/18, 9:00?PM, Valid until:12/31/30, 8:59?PM
2026-10-29 14:29:04,831 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:36825e7fb5a481937ef6d1736bb93ca6, Subject:CN=COMODO RSA Organization Validation Secure Server CA, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:245647897, Valid from:2/11/14, 10:00?PM, Valid until:2/11/29, 8:59?PM
2026-10-29 14:29:05,037 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.rest-client."ministerio-farmacia-api".disable-default-mapper" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-10-29 14:29:05,045 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.rest-client.ministerio-farmacia-api.disable-default-mapper" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-10-29 14:29:05,236 DEBUG [org.hib.qua.feature] (main) Hibernate Features Enabled
2026-10-29 14:29:05,236 DEBUG [io.qua.hib.orm] (main) List of entities found by Quarkus deployment:
[br.com.caixa.sifap.entity.AnaliseDocumento, br.com.caixa.sifap.entity.ControleDocumento, br.com.caixa.sifap.entity.Farmaceutico, br.com.caixa.sifap.entity.Farmacia, br.com.caixa.sifap.entity.FarmaciaAuxiliar, br.com.caixa.sifap.entity.HistoricoAnaliseDocumento, br.com.caixa.sifap.entity.ItemAnaliseDocumento, br.com.caixa.sifap.entity.ItemValidacao, br.com.caixa.sifap.entity.RepresentacaoFarmacia, br.com.caixa.sifap.entity.RepresentacaoTecnica, br.com.caixa.sifap.entity.RepresentanteFarmacia, br.com.caixa.sifap.entity.SituacaoFarmacia, br.com.caixa.sifap.entity.SqlMappings, br.com.caixa.sifap.entity.TipoDocumento, br.com.caixa.sifap.entity.TipoDocumentoFarmacia, br.com.caixa.sifap.entity.TipoDocumentoItemValidacao, br.com.caixa.sifap.entity.TipoSituacaoFarmacia]
2026-10-29 14:29:05,369 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:550117f07d2db81b1866569d1b00000117f07d, Subject:CN=Microsoft TLS G2 RSA CA OCSP 16 External OCSP Responder 2026-09-, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 16, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:1072370733, Valid from:9/29/26, 7:04?PM, Valid until:3/28/27, 7:04?PM
2026-10-29 14:29:05,371 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:55012ca20461ee0c11200b4a830000012ca204, Subject:CN=in.applicationinsights.azure.com, O=Microsoft Corporation, L=Redmond, ST=WA, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 16, O=Microsoft Corporation, C=US, Key type:RSA, Length:2048, Cert Id:93357892, Valid from:10/12/26, 9:57?AM, Valid until:1/20/27, 8:57?AM
2026-10-29 14:29:05,404 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:330000000e42938f25dc51a99b00000000000e, Subject:CN=Microsoft TLS G2 RSA CA OCSP 16, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:501155815, Valid from:8/1/25, 5:03?PM, Valid until:6/3/29, 5:03?PM
2026-10-29 14:29:05,405 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:b0c6b2c466917b04773c647d4afc0c8, Subject:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3081933591, Valid from:5/20/25, 9:00?PM, Valid until:6/19/29, 8:59?PM
2026-10-29 14:29:05,420 DEBUG [jdk.eve.security] (reactor-http-epoll-1) ValidationChain: 1136084297, 3081933591, 501155815, 93357892
2026-10-29 14:29:05,423 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:570a119742c4e3cc, Subject:CN=Actalis Authentication Root CA, O=Actalis S.p.A./03358520967, L=Milan, C=IT, Issuer:CN=Actalis Authentication Root CA, O=Actalis S.p.A./03358520967, L=Milan, C=IT, Key type:RSA, Length:4096, Cert Id:1729119956, Valid from:9/22/11, 8:22?AM, Valid until:9/22/30, 8:22?AM
2026-10-29 14:29:05,424 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AddTrust External CA Root, OU=AddTrust External TTP Network, O=AddTrust AB, C=SE, Issuer:CN=AddTrust External CA Root, OU=AddTrust External TTP Network, O=AddTrust AB, C=SE, Key type:RSA, Length:2048, Cert Id:3968614624, Valid from:5/30/00, 7:48?AM, Valid until:5/30/20, 7:48?AM
2026-10-29 14:29:05,425 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AddTrust Qualified CA Root, OU=AddTrust TTP Network, O=AddTrust AB, C=SE, Issuer:CN=AddTrust Qualified CA Root, OU=AddTrust TTP Network, O=AddTrust AB, C=SE, Key type:RSA, Length:2048, Cert Id:607365522, Valid from:5/30/00, 7:44?AM, Valid until:5/30/20, 7:44?AM
2026-10-29 14:29:05,425 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:7777062726a9b17c, Subject:CN=AffirmTrust Commercial, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Commercial, O=AffirmTrust, C=US, Key type:RSA, Length:2048, Cert Id:630485644, Valid from:1/29/10, 12:06?PM, Valid until:12/31/30, 11:06?AM
2026-10-29 14:29:05,426 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:7c4f04391cd4992d, Subject:CN=AffirmTrust Networking, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Networking, O=AffirmTrust, C=US, Key type:RSA, Length:2048, Cert Id:651670175, Valid from:1/29/10, 12:08?PM, Valid until:12/31/30, 11:08?AM
2026-10-29 14:29:05,426 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:6d8c1446b1a60aee, Subject:CN=AffirmTrust Premium, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Premium, O=AffirmTrust, C=US, Key type:RSA, Length:4096, Cert Id:2164683341, Valid from:1/29/10, 12:10?PM, Valid until:12/31/40, 11:10?AM
2026-10-29 14:29:05,427 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:7497258ac73f7a54, Subject:CN=AffirmTrust Premium ECC, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Premium ECC, O=AffirmTrust, C=US, Key type:EC, Length:384, Cert Id:2214603510, Valid from:1/29/10, 12:20?PM, Valid until:12/31/40, 11:20?AM
2026-10-29 14:29:05,427 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:66c9fcf99bf8c0a39e2f0788a43e696365bca, Subject:CN=Amazon Root CA 1, O=Amazon, C=US, Issuer:CN=Amazon Root CA 1, O=Amazon, C=US, Key type:RSA, Length:2048, Cert Id:2822522334, Valid from:5/25/15, 9:00?PM, Valid until:1/16/38, 9:00?PM
2026-10-29 14:29:05,428 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:66c9fd29635869f0a0fe58678f85b26bb8a37, Subject:CN=Amazon Root CA 2, O=Amazon, C=US, Issuer:CN=Amazon Root CA 2, O=Amazon, C=US, Key type:RSA, Length:4096, Cert Id:2528834908, Valid from:5/25/15, 9:00?PM, Valid until:5/25/40, 9:00?PM
2026-10-29 14:29:05,429 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withECDSA, Serial:66c9fd5749736663f3b0b9ad9e89e7603f24a, Subject:CN=Amazon Root CA 3, O=Amazon, C=US, Issuer:CN=Amazon Root CA 3, O=Amazon, C=US, Key type:EC, Length:256, Cert Id:2732679773, Valid from:5/25/15, 9:00?PM, Valid until:5/25/40, 9:00?PM
2026-10-29 14:29:05,429 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:66c9fd7c1bb104c2943e5717b7b2cc81ac10e, Subject:CN=Amazon Root CA 4, O=Amazon, C=US, Issuer:CN=Amazon Root CA 4, O=Amazon, C=US, Key type:EC, Length:384, Cert Id:2640694783, Valid from:5/25/15, 9:00?PM, Valid until:5/25/40, 9:00?PM
2026-10-29 14:29:05,430 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:20000b9, Subject:CN=Baltimore CyberTrust Root, OU=CyberTrust, O=Baltimore, C=IE, Issuer:CN=Baltimore CyberTrust Root, OU=CyberTrust, O=Baltimore, C=IE, Key type:RSA, Length:2048, Cert Id:1425294543, Valid from:5/12/00, 3:46?PM, Valid until:5/12/25, 8:59?PM
2026-10-29 14:29:05,430 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:2, Subject:CN=Buypass Class 2 Root CA, O=Buypass AS-983163327, C=NO, Issuer:CN=Buypass Class 2 Root CA, O=Buypass AS-983163327, C=NO, Key type:RSA, Length:4096, Cert Id:969960563, Valid from:10/26/10, 6:38?AM, Valid until:10/26/40, 5:38?AM
2026-10-29 14:29:05,431 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:2, Subject:CN=Buypass Class 3 Root CA, O=Buypass AS-983163327, C=NO, Issuer:CN=Buypass Class 3 Root CA, O=Buypass AS-983163327, C=NO, Key type:RSA, Length:4096, Cert Id:1264269967, Valid from:10/26/10, 6:28?AM, Valid until:10/26/40, 5:28?AM
2026-10-29 14:29:05,431 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:a3da427ea4b1aeda, Subject:CN=Chambers of Commerce Root - 2008, O=AC Camerfirma S.A., SERIALNUMBER=A82743287, L=Madrid (see current address at www.camerfirma.com/address), C=EU, Issuer:CN=Chambers of Commerce Root - 2008, O=AC Camerfirma S.A., SERIALNUMBER=A82743287, L=Madrid (see current address at www.camerfirma.com/address), C=EU, Key type:RSA, Length:4096, Cert Id:4266703372, Valid from:8/1/08, 9:29?AM, Valid until:7/31/38, 9:29?AM
2026-10-29 14:29:05,432 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:0, Subject:CN=Chambers of Commerce Root, OU=http://www.chambersign.org, O=AC Camerfirma SA CIF A82743287, C=EU, Issuer:CN=Chambers of Commerce Root, OU=http://www.chambersign.org, O=AC Camerfirma SA CIF A82743287, C=EU, Key type:RSA, Length:2048, Cert Id:1827306452, Valid from:9/30/03, 1:13?PM, Valid until:9/30/37, 1:13?PM
2026-10-29 14:29:05,433 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:c9cdd3e9d57d23ce, Subject:CN=Global Chambersign Root - 2008, O=AC Camerfirma S.A., SERIALNUMBER=A82743287, L=Madrid (see current address at www.camerfirma.com/address), C=EU, Issuer:CN=Global Chambersign Root - 2008, O=AC Camerfirma S.A., SERIALNUMBER=A82743287, L=Madrid (see current address at www.camerfirma.com/address), C=EU, Key type:RSA, Length:4096, Cert Id:1271252776, Valid from:8/1/08, 9:31?AM, Valid until:7/31/38, 9:31?AM
2026-10-29 14:29:05,433 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:fedce3010fc948ff, Subject:CN=Certigna, O=Dhimyotis, C=FR, Issuer:CN=Certigna, O=Dhimyotis, C=FR, Key type:RSA, Length:2048, Cert Id:3506875840, Valid from:6/29/07, 12:13?PM, Valid until:6/29/27, 12:13?PM
2026-10-29 14:29:05,434 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:cae91b89f155030da3e6416dc4e3a6e1, Subject:CN=Certigna Root CA, OU=0002 48146308100036, O=Dhimyotis, C=FR, Issuer:CN=Certigna Root CA, OU=0002 48146308100036, O=Dhimyotis, C=FR, Key type:RSA, Length:4096, Cert Id:356684591, Valid from:10/1/13, 5:32?AM, Valid until:10/1/33, 5:32?AM
2026-10-29 14:29:05,435 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:10020, Subject:CN=Certum CA, O=Unizeto Sp. z o.o., C=PL, Issuer:CN=Certum CA, O=Unizeto Sp. z o.o., C=PL, Key type:RSA, Length:2048, Cert Id:3550516030, Valid from:6/11/02, 7:46?AM, Valid until:6/11/27, 7:46?AM
2026-10-29 14:29:05,435 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:444c0, Subject:CN=Certum Trusted Network CA, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Issuer:CN=Certum Trusted Network CA, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Key type:RSA, Length:2048, Cert Id:2014002193, Valid from:10/22/08, 10:07?AM, Valid until:12/31/29, 9:07?AM
2026-10-29 14:29:05,436 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:15c8bd65475cafb897005ee406d2bc9d, Subject:OU=ePKI Root Certification Authority, O="Chunghwa Telecom Co., Ltd.", C=TW, Issuer:OU=ePKI Root Certification Authority, O="Chunghwa Telecom Co., Ltd.", C=TW, Key type:RSA, Length:4096, Cert Id:3632331159, Valid from:12/20/04, 12:31?AM, Valid until:12/19/34, 11:31?PM
2026-10-29 14:29:05,436 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:3097386402, Valid from:12/31/03, 10:00?PM, Valid until:12/31/28, 8:59?PM
2026-10-29 14:29:05,437 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:1f47afaa62007050544c019e9b63992a, Subject:CN=COMODO ECC Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO ECC Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:EC, Length:384, Cert Id:1146488932, Valid from:3/5/08, 9:00?PM, Valid until:1/18/38, 8:59?PM
2026-10-29 14:29:05,437 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:4caaf9cadb636fe01ff74ed85b03869d, Subject:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:4096, Cert Id:1769425049, Valid from:1/18/10, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-10-29 14:29:05,438 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:b931c3ad63967ea6723bfc3af9af44b, Subject:CN=DigiCert Assured ID Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:3909568913, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-10-29 14:29:05,439 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:ba15afa1ddfa0b54944afcd24a06cec, Subject:CN=DigiCert Assured ID Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:EC, Length:384, Cert Id:3649430051, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-10-29 14:29:05,439 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:ce7e0e517d846fe8fe560fc1bf03039, Subject:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:3434562768, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-10-29 14:29:05,439 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:83be056904246b1a1756ac95991c74a, Subject:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1341898239, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-10-29 14:29:05,440 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:33af1e6a711a9a0bb2864b11d09fae5, Subject:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1136084297, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-10-29 14:29:05,440 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:55556bcf25ea43535c3a40fd5ab4572, Subject:CN=DigiCert Global Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:EC, Length:384, Cert Id:3498998753, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-10-29 14:29:05,441 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:2ac5c266a0b409b8f0b79f2ae462577, Subject:CN=DigiCert High Assurance EV Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert High Assurance EV Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:2884286942, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-10-29 14:29:05,441 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:59b1b579e8e2132e23907bda777755c, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:1057369358, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-10-29 14:29:05,442 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:983f3, Subject:CN=D-TRUST Root Class 3 CA 2 2009, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST Root Class 3 CA 2 2009, O=D-Trust GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:1430153102, Valid from:11/5/09, 6:35?AM, Valid until:11/5/29, 5:35?AM
2026-10-29 14:29:05,442 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:983f4, Subject:CN=D-TRUST Root Class 3 CA 2 EV 2009, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST Root Class 3 CA 2 EV 2009, O=D-Trust GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:971313728, Valid from:11/5/09, 6:50?AM, Valid until:11/5/29, 5:50?AM
2026-10-29 14:29:05,443 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:3863def8, Subject:CN=Entrust.net Certification Authority (2048), OU=(c) 1999 Entrust.net Limited, OU=www.entrust.net/CPS_2048 incorp. by ref. (limits liab.), O=Entrust.net, Issuer:CN=Entrust.net Certification Authority (2048), OU=(c) 1999 Entrust.net Limited, OU=www.entrust.net/CPS_2048 incorp. by ref. (limits liab.), O=Entrust.net, Key type:RSA, Length:2048, Cert Id:3966431214, Valid from:12/24/99, 3:50?PM, Valid until:7/24/29, 11:15?AM
2026-10-29 14:29:05,444 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:456b5054, Subject:CN=Entrust Root Certification Authority, OU="(c) 2006 Entrust, Inc.", OU=www.entrust.net/CPS is incorporated by reference, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority, OU="(c) 2006 Entrust, Inc.", OU=www.entrust.net/CPS is incorporated by reference, O="Entrust, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:3033563200, Valid from:11/27/06, 6:23?PM, Valid until:11/27/26, 5:53?PM
2026-10-29 14:29:05,444 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:a68b79290000000050d091f9, Subject:CN=Entrust Root Certification Authority - EC1, OU="(c) 2012 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority - EC1, OU="(c) 2012 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Key type:EC, Length:384, Cert Id:924514073, Valid from:12/18/12, 1:25?PM, Valid until:12/18/37, 12:55?PM
2026-10-29 14:29:05,445 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:4a538c28, Subject:CN=Entrust Root Certification Authority - G2, OU="(c) 2009 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority - G2, OU="(c) 2009 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:1936920337, Valid from:7/7/09, 2:25?PM, Valid until:12/7/30, 2:55?PM
2026-10-29 14:29:05,445 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:d9b5437fafa9390f000000005565ad58, Subject:CN=Entrust Root Certification Authority - G4, OU="(c) 2015 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority - G4, OU="(c) 2015 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:1368037548, Valid from:5/27/15, 8:11?AM, Valid until:12/27/37, 8:41?AM
2026-10-29 14:29:05,446 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:23456, Subject:CN=GeoTrust Global CA, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Global CA, O=GeoTrust Inc., C=US, Key type:RSA, Length:2048, Cert Id:2266349922, Valid from:5/21/02, 1:00?AM, Valid until:5/21/22, 1:00?AM
2026-10-29 14:29:05,446 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:18acb56afd69b6153a636cafdafac4a1, Subject:CN=GeoTrust Primary Certification Authority, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Primary Certification Authority, O=GeoTrust Inc., C=US, Key type:RSA, Length:2048, Cert Id:3329622139, Valid from:11/26/06, 10:00?PM, Valid until:7/16/36, 8:59?PM
2026-10-29 14:29:05,447 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:3cb2f4480a00e2feeb243b5e603ec36b, Subject:CN=GeoTrust Primary Certification Authority - G2, OU=(c) 2007 GeoTrust Inc. - For authorized use only, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Primary Certification Authority - G2, OU=(c) 2007 GeoTrust Inc. - For authorized use only, O=GeoTrust Inc., C=US, Key type:EC, Length:384, Cert Id:3180663474, Valid from:11/4/07, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-10-29 14:29:05,447 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:15ac6e9419b2794b41f627a9c3180f1f, Subject:CN=GeoTrust Primary Certification Authority - G3, OU=(c) 2008 GeoTrust Inc. - For authorized use only, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Primary Certification Authority - G3, OU=(c) 2008 GeoTrust Inc. - For authorized use only, O=GeoTrust Inc., C=US, Key type:RSA, Length:2048, Cert Id:2964813538, Valid from:4/1/08, 9:00?PM, Valid until:12/1/37, 8:59?PM
2026-10-29 14:29:05,448 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=GeoTrust Universal CA, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Universal CA, O=GeoTrust Inc., C=US, Key type:RSA, Length:4096, Cert Id:313566089, Valid from:3/4/04, 2:00?AM, Valid until:3/4/29, 2:00?AM
2026-10-29 14:29:05,448 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:40000000001154b5ac394, Subject:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Key type:RSA, Length:2048, Cert Id:536948034, Valid from:9/1/98, 9:00?AM, Valid until:1/28/28, 9:00?AM
2026-10-29 14:29:05,448 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withECDSA, Serial:2a38a41c960a04de42b228a50be8349802, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R4, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R4, Key type:EC, Length:256, Cert Id:2371693751, Valid from:11/12/12, 10:00?PM, Valid until:1/19/38, 12:14?AM
2026-10-29 14:29:05,449 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:605949e0262ebb55f90a778a71f94ad86c, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R5, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R5, Key type:EC, Length:384, Cert Id:1997048439, Valid from:11/12/12, 10:00?PM, Valid until:1/19/38, 12:14?AM
2026-10-29 14:29:05,449 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:4000000000121585308a2, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Key type:RSA, Length:2048, Cert Id:733875591, Valid from:3/18/09, 7:00?AM, Valid until:3/18/29, 7:00?AM
2026-10-29 14:29:05,450 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:45e6bb038333c3856548e6ff4551, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R6, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R6, Key type:RSA, Length:4096, Cert Id:3788339543, Valid from:12/9/14, 10:00?PM, Valid until:12/9/34, 9:00?PM
2026-10-29 14:29:05,450 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:0, Subject:OU=Go Daddy Class 2 Certification Authority, O="The Go Daddy Group, Inc.", C=US, Issuer:OU=Go Daddy Class 2 Certification Authority, O="The Go Daddy Group, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:4023522997, Valid from:6/29/04, 2:06?PM, Valid until:6/29/34, 2:06?PM
2026-10-29 14:29:05,451 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Go Daddy Root Certificate Authority - G2, O="GoDaddy.com, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Go Daddy Root Certificate Authority - G2, O="GoDaddy.com, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:439600313, Valid from:8/31/09, 9:00?PM, Valid until:12/31/37, 8:59?PM
2026-10-29 14:29:05,451 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:203e5936f31b01349886ba217, Subject:CN=GTS Root R1, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R1, O=Google Trust Services LLC, C=US, Key type:RSA, Length:4096, Cert Id:657172038, Valid from:6/21/16, 9:00?PM, Valid until:6/21/36, 9:00?PM
2026-10-29 14:29:05,451 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:203e5aec58d04251aab1125aa, Subject:CN=GTS Root R2, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R2, O=Google Trust Services LLC, C=US, Key type:RSA, Length:4096, Cert Id:948387669, Valid from:6/21/16, 9:00?PM, Valid until:6/21/36, 9:00?PM
2026-10-29 14:29:05,452 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:203e5b882eb20f825276d3d66, Subject:CN=GTS Root R3, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R3, O=Google Trust Services LLC, C=US, Key type:EC, Length:384, Cert Id:1163081155, Valid from:6/21/16, 9:00?PM, Valid until:6/21/36, 9:00?PM
2026-10-29 14:29:05,452 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:203e5c068ef631a9c72905052, Subject:CN=GTS Root R4, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R4, O=Google Trust Services LLC, C=US, Key type:EC, Length:384, Cert Id:1326433111, Valid from:6/21/16, 9:00?PM, Valid until:6/21/36, 9:00?PM
2026-10-29 14:29:05,453 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withECDSA, Serial:0, Subject:CN=Hellenic Academic and Research Institutions ECC RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Issuer:CN=Hellenic Academic and Research Institutions ECC RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Key type:EC, Length:384, Cert Id:513613456, Valid from:7/7/15, 7:37?AM, Valid until:6/30/40, 7:37?AM
2026-10-29 14:29:05,453 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Hellenic Academic and Research Institutions RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Issuer:CN=Hellenic Academic and Research Institutions RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Key type:RSA, Length:4096, Cert Id:3491990565, Valid from:7/7/15, 7:11?AM, Valid until:6/30/40, 7:11?AM
2026-10-29 14:29:05,454 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:a0142800000014523c844b500000002, Subject:CN=IdenTrust Commercial Root CA 1, O=IdenTrust, C=US, Issuer:CN=IdenTrust Commercial Root CA 1, O=IdenTrust, C=US, Key type:RSA, Length:4096, Cert Id:1232565210, Valid from:1/16/14, 4:12?PM, Valid until:1/16/34, 3:12?PM
2026-10-29 14:29:05,454 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:a0142800000014523cf467c00000002, Subject:CN=IdenTrust Public Sector Root CA 1, O=IdenTrust, C=US, Issuer:CN=IdenTrust Public Sector Root CA 1, O=IdenTrust, C=US, Key type:RSA, Length:4096, Cert Id:2123370772, Valid from:1/16/14, 3:53?PM, Valid until:1/16/34, 2:53?PM
2026-10-29 14:29:05,455 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:8210cfb0d240e3594463e0bb63828b00, Subject:CN=ISRG Root X1, O=Internet Security Research Group, C=US, Issuer:CN=ISRG Root X1, O=Internet Security Research Group, C=US, Key type:RSA, Length:4096, Cert Id:1521974916, Valid from:6/4/15, 8:04?AM, Valid until:6/4/35, 8:04?AM
2026-10-29 14:29:05,455 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:a7ea6df4b449eda6a24859ee6b815d3167fbbb1, Subject:CN=LuxTrust Global Root 2, O=LuxTrust S.A., C=LU, Issuer:CN=LuxTrust Global Root 2, O=LuxTrust S.A., C=LU, Key type:RSA, Length:4096, Cert Id:3055636602, Valid from:3/5/15, 10:21?AM, Valid until:3/5/35, 10:21?AM
2026-10-29 14:29:05,455 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:bb8, Subject:CN=LuxTrust Global Root, O=LuxTrust s.a., C=LU, Issuer:CN=LuxTrust Global Root, O=LuxTrust s.a., C=LU, Key type:RSA, Length:2048, Cert Id:1714819687, Valid from:3/17/11, 6:51?AM, Valid until:3/17/21, 6:51?AM
2026-10-29 14:29:05,456 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:66f23daf87de8bb14aea0c573101c2ec, Subject:CN=Microsoft ECC Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft ECC Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:EC, Length:384, Cert Id:3240761285, Valid from:12/18/19, 8:06?PM, Valid until:7/18/42, 8:16?PM
2026-10-29 14:29:05,456 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:1ed397095fd8b4b347701eaabe7f45b3, Subject:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:2848349048, Valid from:12/18/19, 7:51?PM, Valid until:7/18/42, 8:00?PM
2026-10-29 14:29:05,457 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:3ab6508b, Subject:CN=QuoVadis Root Certification Authority, OU=Root Certification Authority, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root Certification Authority, OU=Root Certification Authority, O=QuoVadis Limited, C=BM, Key type:RSA, Length:2048, Cert Id:2412561694, Valid from:3/19/01, 3:33?PM, Valid until:3/17/21, 3:33?PM
2026-10-29 14:29:05,457 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:78585f2ead2c194be3370735341328b596d46593, Subject:CN=QuoVadis Root CA 1 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 1 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:3532531262, Valid from:1/12/12, 3:27?PM, Valid until:1/12/42, 2:27?PM
2026-10-29 14:29:05,457 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:509, Subject:CN=QuoVadis Root CA 2, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 2, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:338250116, Valid from:11/24/06, 4:27?PM, Valid until:11/24/31, 3:23?PM
2026-10-29 14:29:05,458 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:445734245b81899b35f2ceb82b3b5ba726f07528, Subject:CN=QuoVadis Root CA 2 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 2 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:696763521, Valid from:1/12/12, 4:59?PM, Valid until:1/12/42, 3:59?PM
2026-10-29 14:29:05,458 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:5c6, Subject:CN=QuoVadis Root CA 3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:1470392860, Valid from:11/24/06, 5:11?PM, Valid until:11/24/31, 4:06?PM
2026-10-29 14:29:05,459 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:2ef59b0228a7db7affd5a3a9eebd03a0cf126a1d, Subject:CN=QuoVadis Root CA 3 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 3 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:3589344305, Valid from:1/12/12, 6:26?PM, Valid until:1/12/42, 5:26?PM
2026-10-29 14:29:05,459 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:OU=Security Communication RootCA2, O="SECOM Trust Systems CO.,LTD.", C=JP, Issuer:OU=Security Communication RootCA2, O="SECOM Trust Systems CO.,LTD.", C=JP, Key type:RSA, Length:2048, Cert Id:1521072570, Valid from:5/29/09, 2:00?AM, Valid until:5/29/29, 2:00?AM
2026-10-29 14:29:05,459 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:cf08e5c0816a5ad427ff0eb271859d0, Subject:CN=SecureTrust CA, O=SecureTrust Corporation, C=US, Issuer:CN=SecureTrust CA, O=SecureTrust Corporation, C=US, Key type:RSA, Length:2048, Cert Id:2034155325, Valid from:11/7/06, 5:31?PM, Valid until:12/31/29, 4:40?PM
2026-10-29 14:29:05,460 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withECDSA, Serial:75e6dfcbc1685ba8, Subject:CN=SSL.com Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:EC, Length:384, Cert Id:2926673683, Valid from:2/12/16, 4:14?PM, Valid until:2/12/41, 3:14?PM
2026-10-29 14:29:05,504 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:56b629cd34bc78f6, Subject:CN=SSL.com EV Root Certification Authority RSA R2, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com EV Root Certification Authority RSA R2, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:RSA, Length:4096, Cert Id:1381862403, Valid from:5/31/17, 3:14?PM, Valid until:5/30/42, 3:14?PM
2026-10-29 14:29:05,505 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:7b2c9bd316803299, Subject:CN=SSL.com Root Certification Authority RSA, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com Root Certification Authority RSA, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:RSA, Length:4096, Cert Id:156725711, Valid from:2/12/16, 3:39?PM, Valid until:2/12/41, 2:39?PM
2026-10-29 14:29:05,505 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:0, Subject:OU=Starfield Class 2 Certification Authority, O="Starfield Technologies, Inc.", C=US, Issuer:OU=Starfield Class 2 Certification Authority, O="Starfield Technologies, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:1825617644, Valid from:6/29/04, 2:39?PM, Valid until:6/29/34, 2:39?PM
2026-10-29 14:29:05,506 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Starfield Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Starfield Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:3268325709, Valid from:8/31/09, 9:00?PM, Valid until:12/31/37, 8:59?PM
2026-10-29 14:29:05,506 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Starfield Services Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Starfield Services Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:1964785574, Valid from:8/31/09, 9:00?PM, Valid until:12/31/37, 8:59?PM
2026-10-29 14:29:05,507 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:bb401c43f55e4fb0, Subject:CN=SwissSign Gold CA - G2, O=SwissSign AG, C=CH, Issuer:CN=SwissSign Gold CA - G2, O=SwissSign AG, C=CH, Key type:RSA, Length:4096, Cert Id:1516221943, Valid from:10/25/06, 5:30?AM, Valid until:10/25/36, 5:30?AM
2026-10-29 14:29:05,507 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:4eb200670c035d4f, Subject:CN=SwissSign Platinum CA - G2, O=SwissSign AG, C=CH, Issuer:CN=SwissSign Platinum CA - G2, O=SwissSign AG, C=CH, Key type:RSA, Length:4096, Cert Id:771312514, Valid from:10/25/06, 5:36?AM, Valid until:10/25/36, 5:36?AM
2026-10-29 14:29:05,508 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:4f1bd42f54bb2f4b, Subject:CN=SwissSign Silver CA - G2, O=SwissSign AG, C=CH, Issuer:CN=SwissSign Silver CA - G2, O=SwissSign AG, C=CH, Key type:RSA, Length:4096, Cert Id:126726124, Valid from:10/25/06, 5:32?AM, Valid until:10/25/36, 5:32?AM
2026-10-29 14:29:05,508 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:95be16a0f72e46f17b398272fa8bcd96, Subject:CN=TeliaSonera Root CA v1, O=TeliaSonera, Issuer:CN=TeliaSonera Root CA v1, O=TeliaSonera, Key type:RSA, Length:4096, Cert Id:1495358374, Valid from:10/18/07, 10:00?AM, Valid until:10/18/32, 9:00?AM
2026-10-29 14:29:05,508 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:344ed55720d5edec49f42fce37db2b6d, Subject:CN=thawte Primary Root CA, OU="(c) 2006 thawte, Inc. - For authorized use only", OU=Certification Services Division, O="thawte, Inc.", C=US, Issuer:CN=thawte Primary Root CA, OU="(c) 2006 thawte, Inc. - For authorized use only", OU=Certification Services Division, O="thawte, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:643000026, Valid from:11/16/06, 10:00?PM, Valid until:7/16/36, 8:59?PM
2026-10-29 14:29:05,509 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:35fc265cd9844fc93d263d579baed756, Subject:CN=thawte Primary Root CA - G2, OU="(c) 2007 thawte, Inc. - For authorized use only", O="thawte, Inc.", C=US, Issuer:CN=thawte Primary Root CA - G2, OU="(c) 2007 thawte, Inc. - For authorized use only", O="thawte, Inc.", C=US, Key type:EC, Length:384, Cert Id:2068083090, Valid from:11/4/07, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-10-29 14:29:05,509 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:600197b746a7eab4b49ad64b2ff790fb, Subject:CN=thawte Primary Root CA - G3, OU="(c) 2008 thawte, Inc. - For authorized use only", OU=Certification Services Division, O="thawte, Inc.", C=US, Issuer:CN=thawte Primary Root CA - G3, OU="(c) 2008 thawte, Inc. - For authorized use only", OU=Certification Services Division, O="thawte, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:1032730720, Valid from:4/1/08, 9:00?PM, Valid until:12/1/37, 8:59?PM
2026-10-29 14:29:05,510 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:1, Subject:CN=T-TeleSec GlobalRoot Class 2, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Issuer:CN=T-TeleSec GlobalRoot Class 2, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:3056503257, Valid from:10/1/08, 7:40?AM, Valid until:10/1/33, 8:59?PM
2026-10-29 14:29:05,510 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:1, Subject:CN=T-TeleSec GlobalRoot Class 3, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Issuer:CN=T-TeleSec GlobalRoot Class 3, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:1894096264, Valid from:10/1/08, 7:29?AM, Valid until:10/1/33, 8:59?PM
2026-10-29 14:29:05,510 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:cbe, Subject:CN=TWCA Global Root CA, OU=Root CA, O=TAIWAN-CA, C=TW, Issuer:CN=TWCA Global Root CA, OU=Root CA, O=TAIWAN-CA, C=TW, Key type:RSA, Length:4096, Cert Id:861175838, Valid from:6/27/12, 3:28?AM, Valid until:12/31/30, 12:59?PM
2026-10-29 14:29:05,511 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:5c8b99c55a94c5d27156decd8980cc26, Subject:CN=USERTrust ECC Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust ECC Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:EC, Length:384, Cert Id:3329287386, Valid from:1/31/10, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-10-29 14:29:05,511 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:1fd6d30fca3ca51a81bbc640e35032d, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:4096, Cert Id:3947601401, Valid from:1/31/10, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-10-29 14:29:05,512 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:44be0c8b500024b411d3362de0b35f1b, Subject:CN=UTN-USERFirst-Object, OU=http://www.usertrust.com, O=The USERTRUST Network, L=Salt Lake City, ST=UT, C=US, Issuer:CN=UTN-USERFirst-Object, OU=http://www.usertrust.com, O=The USERTRUST Network, L=Salt Lake City, ST=UT, C=US, Key type:RSA, Length:2048, Cert Id:3997913868, Valid from:7/9/99, 3:31?PM, Valid until:7/9/19, 3:40?PM
2026-10-29 14:29:05,512 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:9b7e0649a33e62b9d5ee90487129ef57, Subject:CN=VeriSign Class 3 Public Primary Certification Authority - G3, OU="(c) 1999 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Issuer:CN=VeriSign Class 3 Public Primary Certification Authority - G3, OU="(c) 1999 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:2057300190, Valid from:9/30/99, 9:00?PM, Valid until:7/16/36, 8:59?PM
2026-10-29 14:29:05,512 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:2f80fe238c0e220f486712289187acb3, Subject:CN=VeriSign Class 3 Public Primary Certification Authority - G4, OU="(c) 2007 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Issuer:CN=VeriSign Class 3 Public Primary Certification Authority - G4, OU="(c) 2007 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Key type:EC, Length:384, Cert Id:4163473319, Valid from:11/4/07, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-10-29 14:29:05,513 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:18dad19e267de8bb4a2158cdcc6b3b4a, Subject:CN=VeriSign Class 3 Public Primary Certification Authority - G5, OU="(c) 2006 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Issuer:CN=VeriSign Class 3 Public Primary Certification Authority - G5, OU="(c) 2006 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:303010488, Valid from:11/7/06, 10:00?PM, Valid until:7/16/36, 8:59?PM
2026-10-29 14:29:05,513 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:401ac46421b31321030ebbe4121ac51d, Subject:CN=VeriSign Universal Root Certification Authority, OU="(c) 2008 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Issuer:CN=VeriSign Universal Root Certification Authority, OU="(c) 2008 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:2318285810, Valid from:4/1/08, 9:00?PM, Valid until:12/1/37, 8:59?PM
2026-10-29 14:29:05,513 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:50946cec18ead59c4dd597ef758fa0ad, Subject:CN=XRamp Global Certification Authority, O=XRamp Security Services Inc, OU=www.xrampsecurity.com, C=US, Issuer:CN=XRamp Global Certification Authority, O=XRamp Security Services Inc, OU=www.xrampsecurity.com, C=US, Key type:RSA, Length:2048, Cert Id:3342493210, Valid from:11/1/04, 2:14?PM, Valid until:1/1/35, 2:37?AM
2026-10-29 14:29:05,554 DEBUG [jdk.eve.security] (reactor-http-epoll-1)  TLSHandshake: brazilsouth-1.in.applicationinsights.azure.com:443, TLSv1.3, TLS_AES_256_GCM_SHA384, 93357892
2026-10-29 14:29:05,750 DEBUG [io.net.uti.int.log.InternalLoggerFactory] (main) Using SLF4J as the default logging framework
2026-10-29 14:29:05,751 DEBUG [io.net.uti.int.InternalThreadLocalMap] (main) -Dio.netty.threadLocalMap.stringBuilder.initialSize: 1024
2026-10-29 14:29:05,751 DEBUG [io.net.uti.int.InternalThreadLocalMap] (main) -Dio.netty.threadLocalMap.stringBuilder.maxSize: 4096
2026-10-29 14:29:05,766 DEBUG [io.qua.arc.impl] (main) ArC DI container initialized [beans=162, observers=8]
2026-10-29 14:29:05,813 DEBUG [org.hib.jpa.int.uti.LogHelper] (main) PersistenceUnitInfo [
	name: <default>
	persistence provider classname: null
	classloader: null
	excludeUnlistedClasses: true
	JTA datasource: null
	Non JTA datasource: null
	Transaction type: JTA
	PU root URL: null
	Shared Cache Mode: null
	Validation Mode: null
	Jar files URLs []
	Managed classes names [
		br.com.caixa.sifap.entity.Farmaceutico
		br.com.caixa.sifap.entity.RepresentacaoFarmacia
		br.com.caixa.sifap.entity.SituacaoFarmacia
		br.com.caixa.sifap.entity.TipoDocumentoFarmacia
		br.com.caixa.sifap.entity.ControleDocumento
		br.com.caixa.sifap.entity.HistoricoAnaliseDocumento
		br.com.caixa.sifap.entity.RepresentacaoTecnica
		br.com.caixa.sifap.entity.HistoricoAnaliseDocumentoId
		br.com.caixa.sifap.entity.ItemValidacao
		br.com.caixa.sifap.entity.TipoSituacaoFarmacia
		io.quarkus.hibernate.orm.panache.PanacheEntity
		br.com.caixa.sifap.entity.Farmacia
		br.com.caixa.sifap.entity.RepresentanteFarmacia
		br.com.caixa.sifap.entity.AnaliseDocumento
		br.com.caixa.sifap.entity.SqlMappings
		br.com.caixa.sifap.entity.FarmaciaAuxiliar
		io.quarkus.hibernate.orm.panache.PanacheEntityBase
		br.com.caixa.sifap.entity.TipoDocumento
		br.com.caixa.sifap.entity.ItemAnaliseDocumento
		br.com.caixa.sifap.entity.TipoDocumentoItemValidacao]
	Mapping files names []
	Properties [
		jakarta.persistence.validation.mode: CALLBACK
		jakarta.persistence.sharedCache.mode: null
		hibernate.cache.use_second_level_cache: null
		hibernate.hbm2ddl.charset_name: UTF-8
		hibernate.default_batch_fetch_size: 16
		hibernate.hbm2ddl.skip_default_import_file: true
		jakarta.persistence.database-product-version: 13.0.5026.0
		hibernate.id.optimizer.pooled.preferred: pooled-lo
		hibernate.cache.use_query_cache: null
		jakarta.persistence.database-product-name: Microsoft SQL Server
		hibernate.id.sequence.increment_size_mismatch_strategy: null
		hibernate.query.in_clause_parameter_padding: true
		hibernate.order_by.default_null_ordering: none
		hibernate.cache.use_reference_entries: null
		hibernate.discriminator.ignore_explicit_for_joined: false
		hibernate.query.plan_cache_max_size: 2048
		hibernate.hbm2ddl.import_files: 
		hibernate.batch_fetch_style: PADDED]
2026-10-29 14:29:05,987 DEBUG [org.hib.Version] (main) HHH000412: Hibernate ORM core version 7.0.3.Final
2026-10-29 14:29:05,988 DEBUG [org.hib.cfg.Environment] (main) HHH000206: 'hibernate.properties' not found
2026-10-29 14:29:05,996 DEBUG [org.hib.orm.idg.factory] (main) Ignoring CDI for resolving IdentifierGenerator instances as extended or delayed CDI support was enabled
2026-10-29 14:29:05,999 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [uuid2] -> [org.hibernate.id.UUIDGenerator]
2026-10-29 14:29:05,999 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [guid] -> [org.hibernate.id.GUIDGenerator]
2026-10-29 14:29:06,000 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [uuid] -> [org.hibernate.id.UUIDHexGenerator]
2026-10-29 14:29:06,000 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [uuid.hex] -> [org.hibernate.id.UUIDHexGenerator]
2026-10-29 14:29:06,000 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [assigned] -> [org.hibernate.id.Assigned]
2026-10-29 14:29:06,003 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [identity] -> [org.hibernate.id.IdentityGenerator]
2026-10-29 14:29:06,004 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [select] -> [org.hibernate.id.SelectGenerator]
2026-10-29 14:29:06,005 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [sequence] -> [org.hibernate.id.enhanced.SequenceStyleGenerator]
2026-10-29 14:29:06,005 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [increment] -> [org.hibernate.id.IncrementGenerator]
2026-10-29 14:29:06,006 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [foreign] -> [org.hibernate.id.ForeignGenerator]
2026-10-29 14:29:06,006 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [enhanced-sequence] -> [org.hibernate.id.enhanced.SequenceStyleGenerator]
2026-10-29 14:29:06,007 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [enhanced-table] -> [org.hibernate.id.enhanced.TableGenerator]
2026-10-29 14:29:06,097 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration boolean -> org.hibernate.type.BasicTypeReference@70044113
2026-10-29 14:29:06,097 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration boolean -> org.hibernate.type.BasicTypeReference@70044113
2026-10-29 14:29:06,097 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Boolean -> org.hibernate.type.BasicTypeReference@70044113
2026-10-29 14:29:06,097 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration numeric_boolean -> org.hibernate.type.BasicTypeReference@3b11deb6
2026-10-29 14:29:06,097 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.NumericBooleanConverter -> org.hibernate.type.BasicTypeReference@3b11deb6
2026-10-29 14:29:06,097 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration true_false -> org.hibernate.type.BasicTypeReference@4d7f9b33
2026-10-29 14:29:06,097 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.TrueFalseConverter -> org.hibernate.type.BasicTypeReference@4d7f9b33
2026-10-29 14:29:06,097 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration yes_no -> org.hibernate.type.BasicTypeReference@2643ed03
2026-10-29 14:29:06,097 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.YesNoConverter -> org.hibernate.type.BasicTypeReference@2643ed03
2026-10-29 14:29:06,097 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte -> org.hibernate.type.BasicTypeReference@1c65ec63
2026-10-29 14:29:06,097 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte -> org.hibernate.type.BasicTypeReference@1c65ec63
2026-10-29 14:29:06,097 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Byte -> org.hibernate.type.BasicTypeReference@1c65ec63
2026-10-29 14:29:06,097 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration binary -> org.hibernate.type.BasicTypeReference@3c38e2bf
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte[] -> org.hibernate.type.BasicTypeReference@3c38e2bf
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration [B -> org.hibernate.type.BasicTypeReference@3c38e2bf
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration binary_wrapper -> org.hibernate.type.BasicTypeReference@20923380
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration wrapper-binary -> org.hibernate.type.BasicTypeReference@20923380
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration image -> org.hibernate.type.BasicTypeReference@1ee52741
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration blob -> org.hibernate.type.BasicTypeReference@1640a6b5
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Blob -> org.hibernate.type.BasicTypeReference@1640a6b5
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_blob -> org.hibernate.type.BasicTypeReference@3810806c
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_blob_wrapper -> org.hibernate.type.BasicTypeReference@7bd7c4cf
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration short -> org.hibernate.type.BasicTypeReference@67b20b4c
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration short -> org.hibernate.type.BasicTypeReference@67b20b4c
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Short -> org.hibernate.type.BasicTypeReference@67b20b4c
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration integer -> org.hibernate.type.BasicTypeReference@7da1ef46
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration int -> org.hibernate.type.BasicTypeReference@7da1ef46
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Integer -> org.hibernate.type.BasicTypeReference@7da1ef46
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration long -> org.hibernate.type.BasicTypeReference@1165a952
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration long -> org.hibernate.type.BasicTypeReference@1165a952
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Long -> org.hibernate.type.BasicTypeReference@1165a952
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration float -> org.hibernate.type.BasicTypeReference@2a7b5925
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration float -> org.hibernate.type.BasicTypeReference@2a7b5925
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Float -> org.hibernate.type.BasicTypeReference@2a7b5925
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration double -> org.hibernate.type.BasicTypeReference@4889fbba
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration double -> org.hibernate.type.BasicTypeReference@4889fbba
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Double -> org.hibernate.type.BasicTypeReference@4889fbba
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration big_integer -> org.hibernate.type.BasicTypeReference@31ab75a5
2026-10-29 14:29:06,098 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.math.BigInteger -> org.hibernate.type.BasicTypeReference@31ab75a5
2026-10-29 14:29:06,099 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration big_decimal -> org.hibernate.type.BasicTypeReference@5b8599c7
2026-10-29 14:29:06,099 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.math.BigDecimal -> org.hibernate.type.BasicTypeReference@5b8599c7
2026-10-29 14:29:06,099 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration character -> org.hibernate.type.BasicTypeReference@4987142d
2026-10-29 14:29:06,099 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration char -> org.hibernate.type.BasicTypeReference@4987142d
2026-10-29 14:29:06,099 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Character -> org.hibernate.type.BasicTypeReference@4987142d
2026-10-29 14:29:06,099 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration character_nchar -> org.hibernate.type.BasicTypeReference@67376bae
2026-10-29 14:29:06,099 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration string -> org.hibernate.type.BasicTypeReference@7c59cf66
2026-10-29 14:29:06,099 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.String -> org.hibernate.type.BasicTypeReference@7c59cf66
2026-10-29 14:29:06,099 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration nstring -> org.hibernate.type.BasicTypeReference@7a74672
2026-10-29 14:29:06,103 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration characters -> org.hibernate.type.BasicTypeReference@664083f6
2026-10-29 14:29:06,103 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration char[] -> org.hibernate.type.BasicTypeReference@664083f6
2026-10-29 14:29:06,103 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration [C -> org.hibernate.type.BasicTypeReference@664083f6
2026-10-29 14:29:06,103 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration wrapper-characters -> org.hibernate.type.BasicTypeReference@c7a1db6
2026-10-29 14:29:06,103 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration text -> org.hibernate.type.BasicTypeReference@7b6b99c5
2026-10-29 14:29:06,103 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ntext -> org.hibernate.type.BasicTypeReference@72d7afff
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration clob -> org.hibernate.type.BasicTypeReference@7b43f95c
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Clob -> org.hibernate.type.BasicTypeReference@7b43f95c
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration nclob -> org.hibernate.type.BasicTypeReference@2dd4a7a9
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.NClob -> org.hibernate.type.BasicTypeReference@2dd4a7a9
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_clob -> org.hibernate.type.BasicTypeReference@3962b216
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_clob_char_array -> org.hibernate.type.BasicTypeReference@31a80c88
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_clob_character_array -> org.hibernate.type.BasicTypeReference@5a5c2889
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_nclob -> org.hibernate.type.BasicTypeReference@75566f4
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_nclob_character_array -> org.hibernate.type.BasicTypeReference@5c261c74
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_nclob_char_array -> org.hibernate.type.BasicTypeReference@41f61188
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration Duration -> org.hibernate.type.BasicTypeReference@61d527ac
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.Duration -> org.hibernate.type.BasicTypeReference@61d527ac
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration LocalDateTime -> org.hibernate.type.BasicTypeReference@576323ff
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.LocalDateTime -> org.hibernate.type.BasicTypeReference@576323ff
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration LocalDate -> org.hibernate.type.BasicTypeReference@3777fc44
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.LocalDate -> org.hibernate.type.BasicTypeReference@3777fc44
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration LocalTime -> org.hibernate.type.BasicTypeReference@4e13af1b
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.LocalTime -> org.hibernate.type.BasicTypeReference@4e13af1b
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetDateTime -> org.hibernate.type.BasicTypeReference@78ab63b5
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.OffsetDateTime -> org.hibernate.type.BasicTypeReference@78ab63b5
2026-10-29 14:29:06,104 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetDateTimeWithTimezone -> org.hibernate.type.BasicTypeReference@2809e38a
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetDateTimeWithoutTimezone -> org.hibernate.type.BasicTypeReference@3b399f5a
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTime -> org.hibernate.type.BasicTypeReference@71806c64
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.OffsetTime -> org.hibernate.type.BasicTypeReference@71806c64
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTimeUtc -> org.hibernate.type.BasicTypeReference@69ae7632
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTimeWithTimezone -> org.hibernate.type.BasicTypeReference@65f96d58
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTimeWithoutTimezone -> org.hibernate.type.BasicTypeReference@52a3eef8
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZonedDateTime -> org.hibernate.type.BasicTypeReference@19656e21
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.ZonedDateTime -> org.hibernate.type.BasicTypeReference@19656e21
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZonedDateTimeWithTimezone -> org.hibernate.type.BasicTypeReference@594f508f
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZonedDateTimeWithoutTimezone -> org.hibernate.type.BasicTypeReference@5d32f5db
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration date -> org.hibernate.type.BasicTypeReference@4aadf144
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Date -> org.hibernate.type.BasicTypeReference@4aadf144
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration time -> org.hibernate.type.BasicTypeReference@63053b71
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Time -> org.hibernate.type.BasicTypeReference@63053b71
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration timestamp -> org.hibernate.type.BasicTypeReference@394950ad
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Timestamp -> org.hibernate.type.BasicTypeReference@394950ad
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Date -> org.hibernate.type.BasicTypeReference@394950ad
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration calendar -> org.hibernate.type.BasicTypeReference@257708e
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Calendar -> org.hibernate.type.BasicTypeReference@257708e
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.GregorianCalendar -> org.hibernate.type.BasicTypeReference@257708e
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration calendar_date -> org.hibernate.type.BasicTypeReference@6d01f2e5
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration calendar_time -> org.hibernate.type.BasicTypeReference@3a7d6976
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration instant -> org.hibernate.type.BasicTypeReference@55300b93
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.Instant -> org.hibernate.type.BasicTypeReference@55300b93
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration uuid -> org.hibernate.type.BasicTypeReference@56887c8f
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.UUID -> org.hibernate.type.BasicTypeReference@56887c8f
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration pg-uuid -> org.hibernate.type.BasicTypeReference@56887c8f
2026-10-29 14:29:06,105 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration uuid-binary -> org.hibernate.type.BasicTypeReference@782ed745
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration uuid-char -> org.hibernate.type.BasicTypeReference@58c16efd
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration class -> org.hibernate.type.BasicTypeReference@64f49b3
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Class -> org.hibernate.type.BasicTypeReference@64f49b3
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration currency -> org.hibernate.type.BasicTypeReference@51eafec0
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration Currency -> org.hibernate.type.BasicTypeReference@51eafec0
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Currency -> org.hibernate.type.BasicTypeReference@51eafec0
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration locale -> org.hibernate.type.BasicTypeReference@51b11186
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Locale -> org.hibernate.type.BasicTypeReference@51b11186
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration serializable -> org.hibernate.type.BasicTypeReference@1221d607
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.io.Serializable -> org.hibernate.type.BasicTypeReference@1221d607
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration timezone -> org.hibernate.type.BasicTypeReference@627a890f
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.TimeZone -> org.hibernate.type.BasicTypeReference@627a890f
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZoneOffset -> org.hibernate.type.BasicTypeReference@2c9aeec6
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.ZoneOffset -> org.hibernate.type.BasicTypeReference@2c9aeec6
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration url -> org.hibernate.type.BasicTypeReference@400d1c30
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.net.URL -> org.hibernate.type.BasicTypeReference@400d1c30
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration vector -> org.hibernate.type.BasicTypeReference@663e1144
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration float_vector -> org.hibernate.type.BasicTypeReference@24bba1b7
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration double_vector -> org.hibernate.type.BasicTypeReference@36e358de
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte_vector -> org.hibernate.type.BasicTypeReference@52a2e2fb
2026-10-29 14:29:06,106 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration row_version -> org.hibernate.type.BasicTypeReference@5089a72b
2026-10-29 14:29:06,113 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration object -> org.hibernate.type.JavaObjectType@e5f05f8
2026-10-29 14:29:06,113 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Object -> org.hibernate.type.JavaObjectType@e5f05f8
2026-10-29 14:29:06,114 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration null -> org.hibernate.type.NullType@238a7e3d
2026-10-29 14:29:06,115 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_date -> org.hibernate.type.BasicTypeReference@6bec566e
2026-10-29 14:29:06,115 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_time -> org.hibernate.type.BasicTypeReference@374bf34b
2026-10-29 14:29:06,115 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_timestamp -> org.hibernate.type.BasicTypeReference@6efc9d3f
2026-10-29 14:29:06,115 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_calendar -> org.hibernate.type.BasicTypeReference@4172c967
2026-10-29 14:29:06,115 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_calendar_date -> org.hibernate.type.BasicTypeReference@7bb3294c
2026-10-29 14:29:06,115 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_calendar_time -> org.hibernate.type.BasicTypeReference@5857d723
2026-10-29 14:29:06,115 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_binary -> org.hibernate.type.BasicTypeReference@294a3f2a
2026-10-29 14:29:06,115 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_serializable -> org.hibernate.type.BasicTypeReference@84e43fb
2026-10-29 14:29:06,118 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting Scanner [io.quarkus.hibernate.orm.runtime.boot.scan.QuarkusScanner@127320df] into BootstrapContext; was [null]
2026-10-29 14:29:06,119 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting ScanEnvironment [org.hibernate.jpa.boot.internal.StandardJpaScanEnvironmentImpl@54f4734e] into BootstrapContext; was [null]
2026-10-29 14:29:06,119 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting ScanOptions [org.hibernate.boot.archive.scan.internal.StandardScanOptions@4be1c797] into BootstrapContext; was [org.hibernate.boot.archive.scan.internal.StandardScanOptions@76bdfc19]
2026-10-29 14:29:06,124 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting JPA temp ClassLoader [null] into BootstrapContext; was [null]
2026-10-29 14:29:06,124 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) ClassLoaderAccessImpl#injectTempClassLoader(null) [was null]
2026-10-29 14:29:06,169 DEBUG [org.hib.orm.dialect] (main) HHH035001: Using dialect: org.hibernate.dialect.SQLServerDialect, version: 13.0
2026-10-29 14:29:06,176 DEBUG [org.hib.eng.jdb.env.spi.IdentifierHelperBuilder] (main) IdentifierCaseStrategy for both quoted and unquoted identifiers was set to the same strategy [MIXED]; that will likely lead to problems in schema update and validation if using quoted identifiers
2026-10-29 14:29:06,180 DEBUG [org.hib.orm.jdb.lob] (main) HHH10010002: Disabling contextual LOB creation as connection was null
2026-10-29 14:29:06,188 DEBUG [org.hib.orm.con.pooling] (main) HHH10001005: Database info:
	Database JDBC URL [undefined/unknown]
	Database driver: undefined/unknown
	Database version: 13.0
	Autocommit mode: undefined/unknown
	Isolation level: <unknown>
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2026-10-29 14:29:06,206 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(NCharTypeDescriptor) replaced previous registration(CharTypeDescriptor)
2026-10-29 14:29:06,206 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(NVarcharTypeDescriptor) replaced previous registration(VarcharTypeDescriptor)
2026-10-29 14:29:06,207 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(LongNVarcharTypeDescriptor) replaced previous registration(LongVarcharTypeDescriptor)
2026-10-29 14:29:06,209 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(NClobTypeDescriptor(DEFAULT)) replaced previous registration(ClobTypeDescriptor(DEFAULT))
2026-10-29 14:29:06,210 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(TimestampUtcDescriptor) replaced previous registration(TimestampUtcDescriptor)
2026-10-29 14:29:06,210 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(-6, TinyIntTypeDescriptor) replaced previous registration(TinyIntTypeDescriptor)
2026-10-29 14:29:06,217 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.DurationType -> basicType@1(java.time.Duration,3015)
2026-10-29 14:29:06,217 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration Duration -> basicType@1(java.time.Duration,3015)
2026-10-29 14:29:06,217 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.Duration -> basicType@1(java.time.Duration,3015)
2026-10-29 14:29:06,220 DEBUG [org.hib.typ.spi.TypeConfiguration$Scope] (main) Scoping TypeConfiguration [org.hibernate.type.spi.TypeConfiguration@70d16858] to MetadataBuildingContext [org.hibernate.boot.internal.MetadataBuildingContextRootImpl@789f5552]
2026-10-29 14:29:06,242 DEBUG [org.hib.boo.mod.rel.Namespace] (main) Created database namespace [logicalName=Name{catalog=null, schema=null}, physicalName=Name{catalog=null, schema=null}]
2026-10-29 14:29:06,246 DEBUG [org.hib.boo.mod.sou.int.ann.AnnotationMetadataSourceProcessorImpl] (main) Skipping explicit MappedSuperclass io.quarkus.hibernate.orm.panache.PanacheEntity, the class will be discovered analyzing the implementing class
2026-10-29 14:29:06,274 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.TipoDocumento
2026-10-29 14:29:06,279 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name TipoDocumento
2026-10-29 14:29:06,282 DEBUG [org.hib.boo.mod.rel.Namespace] (main) Created database namespace [logicalName=Name{catalog=FAPDB001, schema=dbo}, physicalName=Name{catalog=FAPDB001, schema=dbo}]
2026-10-29 14:29:06,286 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.TipoDocumento on table FAPTB006_TIPO_DOCUMENTO
2026-10-29 14:29:06,295 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29 14:29:06,320 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DOCUMENTO')
2026-10-29 14:29:06,321 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoDocumento] is safe
2026-10-29 14:29:06,321 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoDocumento
2026-10-29 14:29:06,324 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDocumento with lazy=false
2026-10-29 14:29:06,327 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumento:nuTipoDocumento]
2026-10-29 14:29:06,331 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDocumento
2026-10-29 14:29:06,333 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.NU_TIPO_DOCUMENTO
2026-10-29 14:29:06,334 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDocumento
2026-10-29 14:29:06,338 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_TIPOLOGIA_DOCUMENTO')
2026-10-29 14:29:06,338 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coTipologiaDocumento with lazy=false
2026-10-29 14:29:06,338 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumento:coTipologiaDocumento]
2026-10-29 14:29:06,338 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coTipologiaDocumento
2026-10-29 14:29:06,338 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.CO_TIPOLOGIA_DOCUMENTO
2026-10-29 14:29:06,338 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coTipologiaDocumento
2026-10-29 14:29:06,339 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_TIPO_DOCUMENTO_FARMACIA')
2026-10-29 14:29:06,339 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deTipoDocumentoFarmacia with lazy=false
2026-10-29 14:29:06,339 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumento:deTipoDocumentoFarmacia]
2026-10-29 14:29:06,339 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deTipoDocumentoFarmacia
2026-10-29 14:29:06,339 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.DE_TIPO_DOCUMENTO_FARMACIA
2026-10-29 14:29:06,339 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deTipoDocumentoFarmacia
2026-10-29 14:29:06,340 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_CLASSE_TIPO_DOCUMENTO')
2026-10-29 14:29:06,340 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icClasseTipoDocumento with lazy=false
2026-10-29 14:29:06,340 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumento:icClasseTipoDocumento]
2026-10-29 14:29:06,340 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icClasseTipoDocumento
2026-10-29 14:29:06,340 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.IC_CLASSE_TIPO_DOCUMENTO
2026-10-29 14:29:06,340 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icClasseTipoDocumento
2026-10-29 14:29:06,340 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_DOCUMENTO_OBRIGATORIO')
2026-10-29 14:29:06,340 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icDocumentoObrigatorio with lazy=false
2026-10-29 14:29:06,340 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumento:icDocumentoObrigatorio]
2026-10-29 14:29:06,340 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icDocumentoObrigatorio
2026-10-29 14:29:06,340 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.IC_DOCUMENTO_OBRIGATORIO
2026-10-29 14:29:06,340 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icDocumentoObrigatorio
2026-10-29 14:29:06,341 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29 14:29:06,346 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.ControleDocumento
2026-10-29 14:29:06,346 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name ControleDocumento
2026-10-29 14:29:06,347 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.ControleDocumento on table FAPTB014_CONTROLE_DOCUMENTO
2026-10-29 14:29:06,347 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29 14:29:06,352 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CONTROLE_DOCUMENTO')
2026-10-29 14:29:06,352 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.ControleDocumento] is safe
2026-10-29 14:29:06,352 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.ControleDocumento
2026-10-29 14:29:06,352 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuControleDocumento with lazy=false
2026-10-29 14:29:06,352 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:nuControleDocumento]
2026-10-29 14:29:06,352 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuControleDocumento
2026-10-29 14:29:06,352 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.NU_CONTROLE_DOCUMENTO
2026-10-29 14:29:06,352 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuControleDocumento
2026-10-29 14:29:06,354 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_CONTROLE_DOCUMENTO)]), nuControleDocumento, identity, , ...)
2026-10-29 14:29:06,355 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_ENVIO_DOCUMENTO')
2026-10-29 14:29:06,355 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhEnvioDocumento with lazy=false
2026-10-29 14:29:06,355 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:dhEnvioDocumento]
2026-10-29 14:29:06,355 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhEnvioDocumento
2026-10-29 14:29:06,355 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.DH_ENVIO_DOCUMENTO
2026-10-29 14:29:06,355 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhEnvioDocumento
2026-10-29 14:29:06,358 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_FARMACIA')
2026-10-29 14:29:06,359 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,365 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property farmacia
2026-10-29 14:29:06,366 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_DOCUMENTO_LOCAL')
2026-10-29 14:29:06,366 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icDocumentoLocal with lazy=false
2026-10-29 14:29:06,366 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:icDocumentoLocal]
2026-10-29 14:29:06,366 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icDocumentoLocal
2026-10-29 14:29:06,366 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.IC_DOCUMENTO_LOCAL
2026-10-29 14:29:06,366 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icDocumentoLocal
2026-10-29 14:29:06,367 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_FARMACEUTICO')
2026-10-29 14:29:06,367 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuFarmaceutico with lazy=false
2026-10-29 14:29:06,367 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:nuFarmaceutico]
2026-10-29 14:29:06,367 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuFarmaceutico
2026-10-29 14:29:06,367 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.NU_FARMACEUTICO
2026-10-29 14:29:06,367 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuFarmaceutico
2026-10-29 14:29:06,367 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_FARMACIA')
2026-10-29 14:29:06,367 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuFarmacia with lazy=false
2026-10-29 14:29:06,367 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:nuFarmacia]
2026-10-29 14:29:06,367 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuFarmacia
2026-10-29 14:29:06,367 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.NU_FARMACIA
2026-10-29 14:29:06,367 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuFarmacia
2026-10-29 14:29:06,368 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_REPRESENTANTE_FARMACIA')
2026-10-29 14:29:06,368 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuRepresentanteFarmacia with lazy=false
2026-10-29 14:29:06,368 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:nuRepresentanteFarmacia]
2026-10-29 14:29:06,368 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuRepresentanteFarmacia
2026-10-29 14:29:06,368 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.NU_REPRESENTANTE_FARMACIA
2026-10-29 14:29:06,368 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuRepresentanteFarmacia
2026-10-29 14:29:06,368 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DOCUMENTO')
2026-10-29 14:29:06,368 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDocumento with lazy=false
2026-10-29 14:29:06,368 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:nuTipoDocumento]
2026-10-29 14:29:06,368 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDocumento
2026-10-29 14:29:06,368 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.NU_TIPO_DOCUMENTO
2026-10-29 14:29:06,368 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDocumento
2026-10-29 14:29:06,369 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_TIPO_DOCUMENTO',referencedColumn='NU_TIPO_DOCUMENTO')
2026-10-29 14:29:06,369 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,369 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tipoDocumento
2026-10-29 14:29:06,369 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29 14:29:06,370 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.ItemValidacao
2026-10-29 14:29:06,371 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name ItemValidacao
2026-10-29 14:29:06,371 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.ItemValidacao on table FAPTB016_ITEM_VALIDACAO
2026-10-29 14:29:06,371 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29 14:29:06,372 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_ITEM_VALIDACAO')
2026-10-29 14:29:06,372 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.ItemValidacao] is safe
2026-10-29 14:29:06,372 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.ItemValidacao
2026-10-29 14:29:06,372 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuItemValidacao with lazy=false
2026-10-29 14:29:06,372 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemValidacao:nuItemValidacao]
2026-10-29 14:29:06,372 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuItemValidacao
2026-10-29 14:29:06,373 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB016_ITEM_VALIDACAO.NU_ITEM_VALIDACAO
2026-10-29 14:29:06,373 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuItemValidacao
2026-10-29 14:29:06,373 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NO_ITEM_VALIDADO')
2026-10-29 14:29:06,373 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property noItemValidado with lazy=false
2026-10-29 14:29:06,373 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemValidacao:noItemValidado]
2026-10-29 14:29:06,373 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for noItemValidado
2026-10-29 14:29:06,373 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB016_ITEM_VALIDACAO.NO_ITEM_VALIDADO
2026-10-29 14:29:06,373 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property noItemValidado
2026-10-29 14:29:06,373 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29 14:29:06,374 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.TipoSituacaoFarmacia
2026-10-29 14:29:06,374 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name TipoSituacaoFarmacia
2026-10-29 14:29:06,375 DEBUG [org.hib.boo.mod.rel.Namespace] (main) Created database namespace [logicalName=Name{catalog=null, schema=dbo}, physicalName=Name{catalog=null, schema=dbo}]
2026-10-29 14:29:06,375 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.TipoSituacaoFarmacia on table FAPTB003_TIPO_STCO_FARMACIA
2026-10-29 14:29:06,375 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29 14:29:06,376 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_SITUACAO_FARMACIA')
2026-10-29 14:29:06,376 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoSituacaoFarmacia] is safe
2026-10-29 14:29:06,376 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoSituacaoFarmacia
2026-10-29 14:29:06,376 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoSituacaoFarmacia with lazy=false
2026-10-29 14:29:06,376 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoSituacaoFarmacia:nuTipoSituacaoFarmacia]
2026-10-29 14:29:06,376 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoSituacaoFarmacia
2026-10-29 14:29:06,376 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB003_TIPO_STCO_FARMACIA.NU_TIPO_SITUACAO_FARMACIA
2026-10-29 14:29:06,376 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoSituacaoFarmacia
2026-10-29 14:29:06,376 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_TIPO_SITUACAO_FARMACIA')
2026-10-29 14:29:06,376 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deTipoSituacaoFarmacia with lazy=false
2026-10-29 14:29:06,376 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoSituacaoFarmacia:deTipoSituacaoFarmacia]
2026-10-29 14:29:06,376 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deTipoSituacaoFarmacia
2026-10-29 14:29:06,376 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB003_TIPO_STCO_FARMACIA.DE_TIPO_SITUACAO_FARMACIA
2026-10-29 14:29:06,377 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deTipoSituacaoFarmacia
2026-10-29 14:29:06,377 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29 14:29:06,378 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.HistoricoAnaliseDocumento
2026-10-29 14:29:06,378 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name HistoricoAnaliseDocumento
2026-10-29 14:29:06,378 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.HistoricoAnaliseDocumento on table FAPTB119_HSTRO_ANLSE_DOCUMENTO
2026-10-29 14:29:06,378 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29 14:29:06,381 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,381 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento] is safe
2026-10-29 14:29:06,381 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.HistoricoAnaliseDocumento
2026-10-29 14:29:06,408 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_SQNCL_ANALISE_DOCUMENTO')
2026-10-29 14:29:06,408 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuSqnclAnaliseDocumento with lazy=false
2026-10-29 14:29:06,408 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.id:nuSqnclAnaliseDocumento]
2026-10-29 14:29:06,408 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuSqnclAnaliseDocumento
2026-10-29 14:29:06,408 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.NU_SQNCL_ANALISE_DOCUMENTO
2026-10-29 14:29:06,408 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuSqnclAnaliseDocumento
2026-10-29 14:29:06,409 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_PERIODO')
2026-10-29 14:29:06,409 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioPeriodo with lazy=false
2026-10-29 14:29:06,409 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.id:tsInicioPeriodo]
2026-10-29 14:29:06,409 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioPeriodo
2026-10-29 14:29:06,409 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.TS_INICIO_PERIODO
2026-10-29 14:29:06,409 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioPeriodo
2026-10-29 14:29:06,409 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property id
2026-10-29 14:29:06,409 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_CPF_CNPJ_DOCUMENTO')
2026-10-29 14:29:06,409 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coCpfCnpjDocumento with lazy=false
2026-10-29 14:29:06,409 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:coCpfCnpjDocumento]
2026-10-29 14:29:06,409 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coCpfCnpjDocumento
2026-10-29 14:29:06,409 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.CO_CPF_CNPJ_DOCUMENTO
2026-10-29 14:29:06,409 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coCpfCnpjDocumento
2026-10-29 14:29:06,409 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ANALISE_DOCUMENTO')
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAnaliseDocumento with lazy=false
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:coUsuarioAnaliseDocumento]
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAnaliseDocumento
2026-10-29 14:29:06,410 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.CO_USUARIO_ANALISE_DOCUMENTO
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAnaliseDocumento
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_JUSTIFICATIVA')
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deJustificativa with lazy=false
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:deJustificativa]
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deJustificativa
2026-10-29 14:29:06,410 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.DE_JUSTIFICATIVA
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deJustificativa
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_ANALISE_DOCUMENTO')
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhAnaliseDocumento with lazy=false
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:dhAnaliseDocumento]
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhAnaliseDocumento
2026-10-29 14:29:06,410 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.DH_ANALISE_DOCUMENTO
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhAnaliseDocumento
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_FIM_ANALISE_DOCUMENTO')
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhFimAnaliseDocumento with lazy=false
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:dhFimAnaliseDocumento]
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhFimAnaliseDocumento
2026-10-29 14:29:06,410 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.DH_FIM_ANALISE_DOCUMENTO
2026-10-29 14:29:06,410 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhFimAnaliseDocumento
2026-10-29 14:29:06,411 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_ANALISE_DOCUMENTO')
2026-10-29 14:29:06,411 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icAnaliseDocumento with lazy=false
2026-10-29 14:29:06,411 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:icAnaliseDocumento]
2026-10-29 14:29:06,411 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icAnaliseDocumento
2026-10-29 14:29:06,411 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.IC_ANALISE_DOCUMENTO
2026-10-29 14:29:06,411 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icAnaliseDocumento
2026-10-29 14:29:06,411 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_CPF_CNPJ_DOCUMENTO')
2026-10-29 14:29:06,411 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icCpfCnpjDocumento with lazy=false
2026-10-29 14:29:06,411 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:icCpfCnpjDocumento]
2026-10-29 14:29:06,411 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icCpfCnpjDocumento
2026-10-29 14:29:06,411 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.IC_CPF_CNPJ_DOCUMENTO
2026-10-29 14:29:06,411 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icCpfCnpjDocumento
2026-10-29 14:29:06,411 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_USUARIO_ANALISE_DOCUMENTO')
2026-10-29 14:29:06,411 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icUsuarioAnaliseDocumento with lazy=false
2026-10-29 14:29:06,411 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:icUsuarioAnaliseDocumento]
2026-10-29 14:29:06,411 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icUsuarioAnaliseDocumento
2026-10-29 14:29:06,411 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.IC_USUARIO_ANALISE_DOCUMENTO
2026-10-29 14:29:06,411 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icUsuarioAnaliseDocumento
2026-10-29 14:29:06,412 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_IDENTIFICADOR_DOCUMENTO')
2026-10-29 14:29:06,412 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuIdentificadorDocumento with lazy=false
2026-10-29 14:29:06,412 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:nuIdentificadorDocumento]
2026-10-29 14:29:06,412 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuIdentificadorDocumento
2026-10-29 14:29:06,412 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.NU_IDENTIFICADOR_DOCUMENTO
2026-10-29 14:29:06,412 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuIdentificadorDocumento
2026-10-29 14:29:06,412 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DOCUMENTO')
2026-10-29 14:29:06,412 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDocumento with lazy=false
2026-10-29 14:29:06,412 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:nuTipoDocumento]
2026-10-29 14:29:06,412 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDocumento
2026-10-29 14:29:06,412 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.NU_TIPO_DOCUMENTO
2026-10-29 14:29:06,412 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDocumento
2026-10-29 14:29:06,412 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_TIPO_DOCUMENTO',referencedColumn='NU_TIPO_DOCUMENTO')
2026-10-29 14:29:06,412 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,412 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tipoDocumento
2026-10-29 14:29:06,412 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29 14:29:06,414 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.Farmacia
2026-10-29 14:29:06,415 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name Farmacia
2026-10-29 14:29:06,418 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.Farmacia on table FAPTB001_FARMACIA
2026-10-29 14:29:06,418 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_FARMACIA')
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.Farmacia] is safe
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.Farmacia
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuFarmacia with lazy=false
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuFarmacia]
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuFarmacia
2026-10-29 14:29:06,427 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_FARMACIA
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuFarmacia
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_FARMACIA)]), nuFarmacia, identity, , ...)
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_CNPJ_ESTABELECIMENTO_LEGADO')
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coCnpjEstabelecimentoLegado with lazy=false
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:coCnpjEstabelecimentoLegado]
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coCnpjEstabelecimentoLegado
2026-10-29 14:29:06,427 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.CO_CNPJ_ESTABELECIMENTO_LEGADO
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coCnpjEstabelecimentoLegado
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_LICENCA_FUNCIONAMENTO')
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coLicencaFuncionamento with lazy=false
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:coLicencaFuncionamento]
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coLicencaFuncionamento
2026-10-29 14:29:06,427 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.CO_LICENCA_FUNCIONAMENTO
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coLicencaFuncionamento
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_PROCESSO_SEI')
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coProcessoSei with lazy=false
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:coProcessoSei]
2026-10-29 14:29:06,427 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coProcessoSei
2026-10-29 14:29:06,428 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.CO_PROCESSO_SEI
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coProcessoSei
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ACAO_FARMACIA')
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAcaoFarmacia with lazy=false
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:coUsuarioAcaoFarmacia]
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAcaoFarmacia
2026-10-29 14:29:06,428 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.CO_USUARIO_ACAO_FARMACIA
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAcaoFarmacia
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_EMAIL_FARMACIA')
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEmailFarmacia with lazy=false
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:deEmailFarmacia]
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEmailFarmacia
2026-10-29 14:29:06,428 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.DE_EMAIL_FARMACIA
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEmailFarmacia
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_ENDERECO_IP_FARMACIA')
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEnderecoIpFarmacia with lazy=false
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:deEnderecoIpFarmacia]
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEnderecoIpFarmacia
2026-10-29 14:29:06,428 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.DE_ENDERECO_IP_FARMACIA
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEnderecoIpFarmacia
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_ATUALIZACAO_FARMACIA')
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhAtualizacaoFarmacia with lazy=false
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:dhAtualizacaoFarmacia]
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhAtualizacaoFarmacia
2026-10-29 14:29:06,428 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.DH_ATUALIZACAO_FARMACIA
2026-10-29 14:29:06,428 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhAtualizacaoFarmacia
2026-10-29 14:29:06,429 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_SUBMISSAO_SLCTO_CADASTRO')
2026-10-29 14:29:06,429 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhSubmissaoSlctoCadastro with lazy=false
2026-10-29 14:29:06,429 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:dhSubmissaoSlctoCadastro]
2026-10-29 14:29:06,429 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhSubmissaoSlctoCadastro
2026-10-29 14:29:06,429 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.DH_SUBMISSAO_SLCTO_CADASTRO
2026-10-29 14:29:06,429 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhSubmissaoSlctoCadastro
2026-10-29 14:29:06,429 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_VENCIMENTO_CND')
2026-10-29 14:29:06,429 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtVencimentoCnd with lazy=false
2026-10-29 14:29:06,429 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:dtVencimentoCnd]
2026-10-29 14:29:06,429 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtVencimentoCnd
2026-10-29 14:29:06,429 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.DT_VENCIMENTO_CND
2026-10-29 14:29:06,429 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtVencimentoCnd
2026-10-29 14:29:06,429 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_VNCMO_LICENCA_FNCMO')
2026-10-29 14:29:06,429 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtVencimentoLicencaFncmo with lazy=false
2026-10-29 14:29:06,429 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:dtVencimentoLicencaFncmo]
2026-10-29 14:29:06,429 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtVencimentoLicencaFncmo
2026-10-29 14:29:06,429 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.DT_VNCMO_LICENCA_FNCMO
2026-10-29 14:29:06,429 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtVencimentoLicencaFncmo
2026-10-29 14:29:06,429 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_FARMACIA_MATRIZ')
2026-10-29 14:29:06,429 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,429 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property farmaciaMatriz
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_EFETUA_VENDA')
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icEfetuaVenda with lazy=false
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:icEfetuaVenda]
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icEfetuaVenda
2026-10-29 14:29:06,430 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.IC_EFETUA_VENDA
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icEfetuaVenda
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_EMISSAO_FISCAL_ELETRONICO')
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icEmissaoFiscalEletronico with lazy=false
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:icEmissaoFiscalEletronico]
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icEmissaoFiscalEletronico
2026-10-29 14:29:06,430 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.IC_EMISSAO_FISCAL_ELETRONICO
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icEmissaoFiscalEletronico
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_TIPO_ACAO')
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icTipoAcao with lazy=false
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:icTipoAcao]
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icTipoAcao
2026-10-29 14:29:06,430 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.IC_TIPO_ACAO
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icTipoAcao
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NO_TITULARIDADE_CONTA_CREDITO')
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property noTitularidadeContaCredito with lazy=false
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:noTitularidadeContaCredito]
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for noTitularidadeContaCredito
2026-10-29 14:29:06,430 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NO_TITULARIDADE_CONTA_CREDITO
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property noTitularidadeContaCredito
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_AGENCIA')
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuAgencia with lazy=false
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuAgencia]
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuAgencia
2026-10-29 14:29:06,430 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_AGENCIA
2026-10-29 14:29:06,430 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuAgencia
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_BANCO')
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuBanco with lazy=false
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuBanco]
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuBanco
2026-10-29 14:29:06,431 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_BANCO
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuBanco
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CNPJ_ESTABELECIMENTO')
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuCnpjEstabelecimento with lazy=false
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuCnpjEstabelecimento]
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuCnpjEstabelecimento
2026-10-29 14:29:06,431 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_CNPJ_ESTABELECIMENTO
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuCnpjEstabelecimento
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CONTA')
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuConta with lazy=false
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuConta]
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuConta
2026-10-29 14:29:06,431 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_CONTA
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuConta
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_DDD_ALTERNATIVO')
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuDddAlternativo with lazy=false
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuDddAlternativo]
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuDddAlternativo
2026-10-29 14:29:06,431 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_DDD_ALTERNATIVO
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuDddAlternativo
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_DDD_PRINCIPAL')
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuDddPrincipal with lazy=false
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuDddPrincipal]
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuDddPrincipal
2026-10-29 14:29:06,431 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_DDD_PRINCIPAL
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuDddPrincipal
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_DV_AGENCIA')
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuDvAgencia with lazy=false
2026-10-29 14:29:06,431 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuDvAgencia]
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuDvAgencia
2026-10-29 14:29:06,432 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_DV_AGENCIA
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuDvAgencia
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_DV_CONTA')
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuDvConta with lazy=false
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuDvConta]
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuDvConta
2026-10-29 14:29:06,432 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_DV_CONTA
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuDvConta
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_IBGE_MUNICIPIO')
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuIbgeMunicipio with lazy=false
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuIbgeMunicipio]
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuIbgeMunicipio
2026-10-29 14:29:06,432 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_IBGE_MUNICIPIO
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuIbgeMunicipio
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_INSCRICAO_INSS')
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuInscricaoInss with lazy=false
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuInscricaoInss]
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuInscricaoInss
2026-10-29 14:29:06,432 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_INSCRICAO_INSS
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuInscricaoInss
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_REGISTRO_JUNTA_COMERCIAL')
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuRegistroJuntaComercial with lazy=false
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuRegistroJuntaComercial]
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuRegistroJuntaComercial
2026-10-29 14:29:06,432 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_REGISTRO_JUNTA_COMERCIAL
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuRegistroJuntaComercial
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TELEFONE_ALTERNATIVO')
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTelefoneAlternativo with lazy=false
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuTelefoneAlternativo]
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTelefoneAlternativo
2026-10-29 14:29:06,432 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_TELEFONE_ALTERNATIVO
2026-10-29 14:29:06,432 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTelefoneAlternativo
2026-10-29 14:29:06,433 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TELEFONE_PRINCIPAL')
2026-10-29 14:29:06,433 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTelefonePrincipal with lazy=false
2026-10-29 14:29:06,433 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuTelefonePrincipal]
2026-10-29 14:29:06,433 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTelefonePrincipal
2026-10-29 14:29:06,433 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_TELEFONE_PRINCIPAL
2026-10-29 14:29:06,433 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTelefonePrincipal
2026-10-29 14:29:06,433 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_CONTA')
2026-10-29 14:29:06,433 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoConta with lazy=false
2026-10-29 14:29:06,433 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuTipoConta]
2026-10-29 14:29:06,433 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoConta
2026-10-29 14:29:06,433 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_TIPO_CONTA
2026-10-29 14:29:06,433 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoConta
2026-10-29 14:29:06,433 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29 14:29:06,433 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,443 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: IndexColumn(column='representacoes_ORDER')
2026-10-29 14:29:06,445 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,445 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='representacoes_KEY')
2026-10-29 14:29:06,445 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='representacoes_KEY')
2026-10-29 14:29:06,446 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29 14:29:06,446 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29 14:29:06,448 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Collection role: br.com.caixa.sifap.entity.Farmacia.representacoes
2026-10-29 14:29:06,450 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property representacoes
2026-10-29 14:29:06,450 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29 14:29:06,450 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,450 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: IndexColumn(column='representacoesTecnica_ORDER')
2026-10-29 14:29:06,450 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,450 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='representacoesTecnica_KEY')
2026-10-29 14:29:06,450 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='representacoesTecnica_KEY')
2026-10-29 14:29:06,450 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29 14:29:06,450 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29 14:29:06,450 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Collection role: br.com.caixa.sifap.entity.Farmacia.representacoesTecnica
2026-10-29 14:29:06,450 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property representacoesTecnica
2026-10-29 14:29:06,450 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='SG_UF_FARMACIA')
2026-10-29 14:29:06,450 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property sgUfFarmacia with lazy=false
2026-10-29 14:29:06,450 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:sgUfFarmacia]
2026-10-29 14:29:06,450 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for sgUfFarmacia
2026-10-29 14:29:06,450 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.SG_UF_FARMACIA
2026-10-29 14:29:06,450 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property sgUfFarmacia
2026-10-29 14:29:06,451 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29 14:29:06,451 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,451 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: IndexColumn(column='situacoes_ORDER')
2026-10-29 14:29:06,452 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,452 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='situacoes_KEY')
2026-10-29 14:29:06,452 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='situacoes_KEY')
2026-10-29 14:29:06,452 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29 14:29:06,452 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29 14:29:06,452 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Collection role: br.com.caixa.sifap.entity.Farmacia.situacoes
2026-10-29 14:29:06,452 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property situacoes
2026-10-29 14:29:06,452 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_FIM_VIGENCIA_FARMACIA')
2026-10-29 14:29:06,452 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsFimVigenciaFarmacia with lazy=false
2026-10-29 14:29:06,452 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:tsFimVigenciaFarmacia]
2026-10-29 14:29:06,452 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsFimVigenciaFarmacia
2026-10-29 14:29:06,453 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.TS_FIM_VIGENCIA_FARMACIA
2026-10-29 14:29:06,453 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsFimVigenciaFarmacia
2026-10-29 14:29:06,453 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_VIGENCIA_FARMACIA')
2026-10-29 14:29:06,453 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioVigenciaFarmacia with lazy=false
2026-10-29 14:29:06,453 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:tsInicioVigenciaFarmacia]
2026-10-29 14:29:06,453 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioVigenciaFarmacia
2026-10-29 14:29:06,453 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.TS_INICIO_VIGENCIA_FARMACIA
2026-10-29 14:29:06,453 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioVigenciaFarmacia
2026-10-29 14:29:06,453 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29 14:29:06,455 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.ItemAnaliseDocumento
2026-10-29 14:29:06,455 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name ItemAnaliseDocumento
2026-10-29 14:29:06,455 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.ItemAnaliseDocumento on table FAPTB018_ITEM_ANALISE_DCMTO
2026-10-29 14:29:06,455 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29 14:29:06,456 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_ITEM_ANALISE_DOCUMENTO')
2026-10-29 14:29:06,456 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.ItemAnaliseDocumento] is safe
2026-10-29 14:29:06,456 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.ItemAnaliseDocumento
2026-10-29 14:29:06,456 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuItemAnaliseDocumento with lazy=false
2026-10-29 14:29:06,456 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemAnaliseDocumento:nuItemAnaliseDocumento]
2026-10-29 14:29:06,456 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuItemAnaliseDocumento
2026-10-29 14:29:06,456 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB018_ITEM_ANALISE_DCMTO.NU_ITEM_ANALISE_DOCUMENTO
2026-10-29 14:29:06,457 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuItemAnaliseDocumento
2026-10-29 14:29:06,457 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_ITEM_ANALISE_DOCUMENTO)]), nuItemAnaliseDocumento, identity, , ...)
2026-10-29 14:29:06,457 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_SQNCL_ANALISE_DOCUMENTO',referencedColumn='NU_SQNCL_ANALISE_DOCUMENTO')
2026-10-29 14:29:06,457 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,457 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property analiseDocumento
2026-10-29 14:29:06,457 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_ITEM_ANALISE')
2026-10-29 14:29:06,457 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhItemAnalise with lazy=false
2026-10-29 14:29:06,457 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemAnaliseDocumento:dhItemAnalise]
2026-10-29 14:29:06,457 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhItemAnalise
2026-10-29 14:29:06,457 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB018_ITEM_ANALISE_DCMTO.DH_ITEM_ANALISE
2026-10-29 14:29:06,457 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhItemAnalise
2026-10-29 14:29:06,457 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_ITEM_PENDENTE')
2026-10-29 14:29:06,457 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icItemPendente with lazy=false
2026-10-29 14:29:06,457 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemAnaliseDocumento:icItemPendente]
2026-10-29 14:29:06,457 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icItemPendente
2026-10-29 14:29:06,457 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB018_ITEM_ANALISE_DCMTO.IC_ITEM_PENDENTE
2026-10-29 14:29:06,457 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icItemPendente
2026-10-29 14:29:06,457 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_MATRICULA')
2026-10-29 14:29:06,457 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuMatricula with lazy=false
2026-10-29 14:29:06,457 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemAnaliseDocumento:nuMatricula]
2026-10-29 14:29:06,458 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuMatricula
2026-10-29 14:29:06,458 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB018_ITEM_ANALISE_DCMTO.NU_MATRICULA
2026-10-29 14:29:06,458 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuMatricula
2026-10-29 14:29:06,458 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_SQNCL_ANALISE_DOCUMENTO')
2026-10-29 14:29:06,458 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuSqnclAnaliseDocumento with lazy=false
2026-10-29 14:29:06,458 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemAnaliseDocumento:nuSqnclAnaliseDocumento]
2026-10-29 14:29:06,458 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuSqnclAnaliseDocumento
2026-10-29 14:29:06,458 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB018_ITEM_ANALISE_DCMTO.NU_SQNCL_ANALISE_DOCUMENTO
2026-10-29 14:29:06,458 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuSqnclAnaliseDocumento
2026-10-29 14:29:06,458 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DCMTO_ITM_VLDCO')
2026-10-29 14:29:06,458 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDcmtoItmVldco with lazy=false
2026-10-29 14:29:06,458 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemAnaliseDocumento:nuTipoDcmtoItmVldco]
2026-10-29 14:29:06,458 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDcmtoItmVldco
2026-10-29 14:29:06,458 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB018_ITEM_ANALISE_DCMTO.NU_TIPO_DCMTO_ITM_VLDCO
2026-10-29 14:29:06,458 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDcmtoItmVldco
2026-10-29 14:29:06,458 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_TIPO_DCMTO_ITM_VLDCO',referencedColumn='NU_TIPO_DCMTO_ITM_VLDCO')
2026-10-29 14:29:06,458 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,458 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tipoDocumentoItemValidacao
2026-10-29 14:29:06,458 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29 14:29:06,460 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.FarmaciaAuxiliar
2026-10-29 14:29:06,460 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name FarmaciaAuxiliar
2026-10-29 14:29:06,460 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.FarmaciaAuxiliar on table FAPTB012_FARMACIA_AUXILIAR
2026-10-29 14:29:06,460 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29 14:29:06,462 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_FARMACIA_AUXILIAR')
2026-10-29 14:29:06,462 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.FarmaciaAuxiliar] is safe
2026-10-29 14:29:06,462 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.FarmaciaAuxiliar
2026-10-29 14:29:06,462 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuFarmaciaAuxiliar with lazy=false
2026-10-29 14:29:06,462 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:nuFarmaciaAuxiliar]
2026-10-29 14:29:06,462 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuFarmaciaAuxiliar
2026-10-29 14:29:06,462 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.NU_FARMACIA_AUXILIAR
2026-10-29 14:29:06,462 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuFarmaciaAuxiliar
2026-10-29 14:29:06,462 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_FARMACIA_AUXILIAR)]), nuFarmaciaAuxiliar, identity, , ...)
2026-10-29 14:29:06,462 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_CNPJ_ESTABELECIMENTO_LEGADO')
2026-10-29 14:29:06,462 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coCnpjEstabelecimentoLegado with lazy=false
2026-10-29 14:29:06,462 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:coCnpjEstabelecimentoLegado]
2026-10-29 14:29:06,462 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coCnpjEstabelecimentoLegado
2026-10-29 14:29:06,462 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.CO_CNPJ_ESTABELECIMENTO_LEGADO
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coCnpjEstabelecimentoLegado
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_CNPJ_MATRIZ_LEGADO')
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coCnpjMatrizLegado with lazy=false
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:coCnpjMatrizLegado]
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coCnpjMatrizLegado
2026-10-29 14:29:06,463 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.CO_CNPJ_MATRIZ_LEGADO
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coCnpjMatrizLegado
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_MOTIVO_BLOQUEIO')
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deMotivoBloqueio with lazy=false
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:deMotivoBloqueio]
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deMotivoBloqueio
2026-10-29 14:29:06,463 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.DE_MOTIVO_BLOQUEIO
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deMotivoBloqueio
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_ATUALIZACAO_CADASTRO')
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhAtualizacaoCadastro with lazy=false
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:dhAtualizacaoCadastro]
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhAtualizacaoCadastro
2026-10-29 14:29:06,463 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.DH_ATUALIZACAO_CADASTRO
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhAtualizacaoCadastro
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_BLOQUEIO')
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtBloqueio with lazy=false
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:dtBloqueio]
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtBloqueio
2026-10-29 14:29:06,463 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.DT_BLOQUEIO
2026-10-29 14:29:06,463 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtBloqueio
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_ATUALIZACAO_CADASTRO')
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icAtualizacaoCadastro with lazy=false
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:icAtualizacaoCadastro]
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icAtualizacaoCadastro
2026-10-29 14:29:06,464 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.IC_ATUALIZACAO_CADASTRO
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icAtualizacaoCadastro
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CNPJ_ESTABELECIMENTO')
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuCnpjEstabelecimento with lazy=false
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:nuCnpjEstabelecimento]
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuCnpjEstabelecimento
2026-10-29 14:29:06,464 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.NU_CNPJ_ESTABELECIMENTO
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuCnpjEstabelecimento
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CNPJ_MATRIZ')
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuCnpjMatriz with lazy=false
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:nuCnpjMatriz]
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuCnpjMatriz
2026-10-29 14:29:06,464 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.NU_CNPJ_MATRIZ
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuCnpjMatriz
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_MOTIVO_BLOQUEIO')
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuMotivoBloqueio with lazy=false
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:nuMotivoBloqueio]
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuMotivoBloqueio
2026-10-29 14:29:06,464 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.NU_MOTIVO_BLOQUEIO
2026-10-29 14:29:06,464 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuMotivoBloqueio
2026-10-29 14:29:06,464 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29 14:29:06,466 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.RepresentanteFarmacia
2026-10-29 14:29:06,466 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name RepresentanteFarmacia
2026-10-29 14:29:06,466 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.RepresentanteFarmacia on table FAPTB010_RPRSE_FARMACIA
2026-10-29 14:29:06,466 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29 14:29:06,468 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_REPRESENTANTE_FARMACIA')
2026-10-29 14:29:06,468 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.RepresentanteFarmacia] is safe
2026-10-29 14:29:06,468 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.RepresentanteFarmacia
2026-10-29 14:29:06,468 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuRepresentanteFarmacia with lazy=false
2026-10-29 14:29:06,468 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:nuRepresentanteFarmacia]
2026-10-29 14:29:06,468 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuRepresentanteFarmacia
2026-10-29 14:29:06,468 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.NU_REPRESENTANTE_FARMACIA
2026-10-29 14:29:06,468 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuRepresentanteFarmacia
2026-10-29 14:29:06,468 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_REPRESENTANTE_FARMACIA)]), nuRepresentanteFarmacia, identity, , ...)
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ACAO_REPRESENTANTE')
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAcaoRepresentante with lazy=false
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:coUsuarioAcaoRepresentante]
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAcaoRepresentante
2026-10-29 14:29:06,469 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.CO_USUARIO_ACAO_REPRESENTANTE
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAcaoRepresentante
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_ENDERECO_IP_REPRESENTANTE')
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEnderecoIpRepresentante with lazy=false
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:deEnderecoIpRepresentante]
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEnderecoIpRepresentante
2026-10-29 14:29:06,469 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.DE_ENDERECO_IP_REPRESENTANTE
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEnderecoIpRepresentante
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_TIPO_ACAO')
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icTipoAcao with lazy=false
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:icTipoAcao]
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icTipoAcao
2026-10-29 14:29:06,469 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.IC_TIPO_ACAO
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icTipoAcao
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CPF_REPRESENTANTE')
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuCpfRepresentante with lazy=false
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:nuCpfRepresentante]
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuCpfRepresentante
2026-10-29 14:29:06,469 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.NU_CPF_REPRESENTANTE
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuCpfRepresentante
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_FIM_VIGENCIA_RPRSE')
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsFimVigenciaRprse with lazy=false
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:tsFimVigenciaRprse]
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsFimVigenciaRprse
2026-10-29 14:29:06,469 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.TS_FIM_VIGENCIA_RPRSE
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsFimVigenciaRprse
2026-10-29 14:29:06,469 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_VIGENCIA_RPRSE')
2026-10-29 14:29:06,470 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioVigenciaRprse with lazy=false
2026-10-29 14:29:06,470 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:tsInicioVigenciaRprse]
2026-10-29 14:29:06,470 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioVigenciaRprse
2026-10-29 14:29:06,470 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.TS_INICIO_VIGENCIA_RPRSE
2026-10-29 14:29:06,470 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioVigenciaRprse
2026-10-29 14:29:06,470 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29 14:29:06,471 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.SituacaoFarmacia
2026-10-29 14:29:06,471 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name SituacaoFarmacia
2026-10-29 14:29:06,471 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.SituacaoFarmacia on table FAPTB002_SITUACAO_FARMACIA
2026-10-29 14:29:06,471 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29 14:29:06,472 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_SITUACAO_FARMACIA')
2026-10-29 14:29:06,472 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.SituacaoFarmacia] is safe
2026-10-29 14:29:06,472 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.SituacaoFarmacia
2026-10-29 14:29:06,472 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuSituacaoFarmacia with lazy=false
2026-10-29 14:29:06,472 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:nuSituacaoFarmacia]
2026-10-29 14:29:06,472 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuSituacaoFarmacia
2026-10-29 14:29:06,472 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.NU_SITUACAO_FARMACIA
2026-10-29 14:29:06,472 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuSituacaoFarmacia
2026-10-29 14:29:06,472 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_SITUACAO_FARMACIA)]), nuSituacaoFarmacia, identity, , ...)
2026-10-29 14:29:06,472 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ACAO_SITUACAO')
2026-10-29 14:29:06,472 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAcaoSituacao with lazy=false
2026-10-29 14:29:06,472 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:coUsuarioAcaoSituacao]
2026-10-29 14:29:06,472 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAcaoSituacao
2026-10-29 14:29:06,472 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.CO_USUARIO_ACAO_SITUACAO
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAcaoSituacao
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ALTERACAO_SITUACAO')
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAlteracaoSituacao with lazy=false
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:coUsuarioAlteracaoSituacao]
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAlteracaoSituacao
2026-10-29 14:29:06,473 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.CO_USUARIO_ALTERACAO_SITUACAO
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAlteracaoSituacao
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_JUSTIFICATIVA_SITUACAO')
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deJustificativaSituacao with lazy=false
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:deJustificativaSituacao]
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deJustificativaSituacao
2026-10-29 14:29:06,473 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.DE_JUSTIFICATIVA_SITUACAO
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deJustificativaSituacao
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_SITUACAO_FARMACIA')
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhSituacaoFarmacia with lazy=false
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:dhSituacaoFarmacia]
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhSituacaoFarmacia
2026-10-29 14:29:06,473 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.DH_SITUACAO_FARMACIA
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhSituacaoFarmacia
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_FARMACIA')
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property farmacia
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_RENOVACAO')
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icRenovacao with lazy=false
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:icRenovacao]
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icRenovacao
2026-10-29 14:29:06,473 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.IC_RENOVACAO
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icRenovacao
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_MOTIVO_BLOQUEIO')
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuMotivoBloqueio with lazy=false
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:nuMotivoBloqueio]
2026-10-29 14:29:06,473 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuMotivoBloqueio
2026-10-29 14:29:06,473 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.NU_MOTIVO_BLOQUEIO
2026-10-29 14:29:06,474 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuMotivoBloqueio
2026-10-29 14:29:06,474 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_SITUACAO_FARMACIA')
2026-10-29 14:29:06,474 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoSituacao with lazy=false
2026-10-29 14:29:06,474 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:nuTipoSituacao]
2026-10-29 14:29:06,474 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoSituacao
2026-10-29 14:29:06,474 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.NU_TIPO_SITUACAO_FARMACIA
2026-10-29 14:29:06,474 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoSituacao
2026-10-29 14:29:06,474 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_TIPO_SITUACAO_FARMACIA')
2026-10-29 14:29:06,474 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,474 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tipoSituacao
2026-10-29 14:29:06,474 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29 14:29:06,475 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.RepresentacaoTecnica
2026-10-29 14:29:06,475 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name RepresentacaoTecnica
2026-10-29 14:29:06,475 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.RepresentacaoTecnica on table FAPTB005_RPRSE_TECNICA
2026-10-29 14:29:06,475 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_REPRESENTACAO_TECNICA')
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.RepresentacaoTecnica] is safe
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.RepresentacaoTecnica
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuRepresentacaoTecnica with lazy=false
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:nuRepresentacaoTecnica]
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuRepresentacaoTecnica
2026-10-29 14:29:06,476 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.NU_REPRESENTACAO_TECNICA
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuRepresentacaoTecnica
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_REPRESENTACAO_TECNICA)]), nuRepresentacaoTecnica, identity, , ...)
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ACAO_REPRESENTACAO')
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAcaoRepresentacao with lazy=false
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:coUsuarioAcaoRepresentacao]
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAcaoRepresentacao
2026-10-29 14:29:06,476 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.CO_USUARIO_ACAO_REPRESENTACAO
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAcaoRepresentacao
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_ENDERECO_IP_REPRESENTACAO')
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEnderecoIpRepresentacao with lazy=false
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:deEnderecoIpRepresentacao]
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEnderecoIpRepresentacao
2026-10-29 14:29:06,476 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.DE_ENDERECO_IP_REPRESENTACAO
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEnderecoIpRepresentacao
2026-10-29 14:29:06,476 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_FIM_REPRESENTACAO')
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtFimRepresentacao with lazy=false
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:dtFimRepresentacao]
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtFimRepresentacao
2026-10-29 14:29:06,477 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.DT_FIM_REPRESENTACAO
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtFimRepresentacao
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_INICIO_REPRESENTACAO')
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtInicioRepresentacao with lazy=false
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:dtInicioRepresentacao]
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtInicioRepresentacao
2026-10-29 14:29:06,477 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.DT_INICIO_REPRESENTACAO
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtInicioRepresentacao
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_VNCMO_CERTIDAO_REGULARIDADE')
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtVencimentoCertidaoRegularidade with lazy=false
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:dtVencimentoCertidaoRegularidade]
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtVencimentoCertidaoRegularidade
2026-10-29 14:29:06,477 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.DT_VNCMO_CERTIDAO_REGULARIDADE
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtVencimentoCertidaoRegularidade
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_FARMACEUTICO')
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property farmaceutico
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_FARMACIA')
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property farmacia
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_TIPO_ACAO')
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icTipoAcao with lazy=false
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:icTipoAcao]
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icTipoAcao
2026-10-29 14:29:06,477 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.IC_TIPO_ACAO
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icTipoAcao
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_FIM_PERIODO')
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsFimPeriodo with lazy=false
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:tsFimPeriodo]
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsFimPeriodo
2026-10-29 14:29:06,477 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.TS_FIM_PERIODO
2026-10-29 14:29:06,477 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsFimPeriodo
2026-10-29 14:29:06,478 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_PERIODO')
2026-10-29 14:29:06,478 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioPeriodo with lazy=false
2026-10-29 14:29:06,478 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:tsInicioPeriodo]
2026-10-29 14:29:06,478 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioPeriodo
2026-10-29 14:29:06,478 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.TS_INICIO_PERIODO
2026-10-29 14:29:06,478 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioPeriodo
2026-10-29 14:29:06,478 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29 14:29:06,479 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.AnaliseDocumento
2026-10-29 14:29:06,479 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name AnaliseDocumento
2026-10-29 14:29:06,479 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.AnaliseDocumento on table FAPTB019_ANALISE_DOCUMENTO
2026-10-29 14:29:06,479 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_SQNCL_ANALISE_DOCUMENTO')
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.AnaliseDocumento] is safe
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.AnaliseDocumento
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuSqnclAnaliseDocumento with lazy=false
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:nuSqnclAnaliseDocumento]
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuSqnclAnaliseDocumento
2026-10-29 14:29:06,480 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.NU_SQNCL_ANALISE_DOCUMENTO
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuSqnclAnaliseDocumento
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_SQNCL_ANALISE_DOCUMENTO)]), nuSqnclAnaliseDocumento, identity, , ...)
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_CPF_CNPJ_DOCUMENTO')
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coCpfCnpjDocumento with lazy=false
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:coCpfCnpjDocumento]
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coCpfCnpjDocumento
2026-10-29 14:29:06,480 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.CO_CPF_CNPJ_DOCUMENTO
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coCpfCnpjDocumento
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ANALISE_DOCUMENTO')
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAnaliseDocumento with lazy=false
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:coUsuarioAnaliseDocumento]
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAnaliseDocumento
2026-10-29 14:29:06,480 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.CO_USUARIO_ANALISE_DOCUMENTO
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAnaliseDocumento
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_JUSTIFICATIVA')
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deJustificativa with lazy=false
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:deJustificativa]
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deJustificativa
2026-10-29 14:29:06,480 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.DE_JUSTIFICATIVA
2026-10-29 14:29:06,480 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deJustificativa
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_ANALISE_DOCUMENTO')
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhAnaliseDocumento with lazy=false
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:dhAnaliseDocumento]
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhAnaliseDocumento
2026-10-29 14:29:06,481 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.DH_ANALISE_DOCUMENTO
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhAnaliseDocumento
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_FIM_ANALISE_DOCUMENTO')
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhFimAnaliseDocumento with lazy=false
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:dhFimAnaliseDocumento]
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhFimAnaliseDocumento
2026-10-29 14:29:06,481 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.DH_FIM_ANALISE_DOCUMENTO
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhFimAnaliseDocumento
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_ANALISE_DOCUMENTO')
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icAnaliseDocumento with lazy=false
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:icAnaliseDocumento]
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icAnaliseDocumento
2026-10-29 14:29:06,481 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.IC_ANALISE_DOCUMENTO
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icAnaliseDocumento
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_CPF_CNPJ_DOCUMENTO')
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icCpfCnpjDocumento with lazy=false
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:icCpfCnpjDocumento]
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icCpfCnpjDocumento
2026-10-29 14:29:06,481 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.IC_CPF_CNPJ_DOCUMENTO
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icCpfCnpjDocumento
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_USUARIO_ANALISE_DOCUMENTO')
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icUsuarioAnaliseDocumento with lazy=false
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:icUsuarioAnaliseDocumento]
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icUsuarioAnaliseDocumento
2026-10-29 14:29:06,481 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.IC_USUARIO_ANALISE_DOCUMENTO
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icUsuarioAnaliseDocumento
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: IndexColumn(column='itensAnalise_ORDER')
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,481 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='itensAnalise_KEY')
2026-10-29 14:29:06,482 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='itensAnalise_KEY')
2026-10-29 14:29:06,482 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29 14:29:06,482 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29 14:29:06,482 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Collection role: br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise
2026-10-29 14:29:06,482 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property itensAnalise
2026-10-29 14:29:06,482 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_IDENTIFICADOR_DOCUMENTO')
2026-10-29 14:29:06,482 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuIdentificadorDocumento with lazy=false
2026-10-29 14:29:06,482 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:nuIdentificadorDocumento]
2026-10-29 14:29:06,482 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuIdentificadorDocumento
2026-10-29 14:29:06,482 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.NU_IDENTIFICADOR_DOCUMENTO
2026-10-29 14:29:06,482 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuIdentificadorDocumento
2026-10-29 14:29:06,482 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DOCUMENTO')
2026-10-29 14:29:06,503 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDocumento with lazy=false
2026-10-29 14:29:06,503 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:nuTipoDocumento]
2026-10-29 14:29:06,503 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDocumento
2026-10-29 14:29:06,503 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.NU_TIPO_DOCUMENTO
2026-10-29 14:29:06,503 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDocumento
2026-10-29 14:29:06,503 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_TIPO_DOCUMENTO',referencedColumn='NU_TIPO_DOCUMENTO')
2026-10-29 14:29:06,504 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,504 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tipoDocumento
2026-10-29 14:29:06,504 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_FIM_PERIODO')
2026-10-29 14:29:06,504 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsFimPeriodo with lazy=false
2026-10-29 14:29:06,504 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:tsFimPeriodo]
2026-10-29 14:29:06,504 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsFimPeriodo
2026-10-29 14:29:06,504 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.TS_FIM_PERIODO
2026-10-29 14:29:06,504 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsFimPeriodo
2026-10-29 14:29:06,504 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_PERIODO')
2026-10-29 14:29:06,504 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioPeriodo with lazy=false
2026-10-29 14:29:06,504 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:tsInicioPeriodo]
2026-10-29 14:29:06,504 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioPeriodo
2026-10-29 14:29:06,504 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.TS_INICIO_PERIODO
2026-10-29 14:29:06,504 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioPeriodo
2026-10-29 14:29:06,504 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29 14:29:06,506 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.SqlMappings
2026-10-29 14:29:06,506 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name SqlMappings
2026-10-29 14:29:06,507 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.SqlMappings on table SqlMappings
2026-10-29 14:29:06,507 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29 14:29:06,508 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,508 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.SqlMappings] is safe
2026-10-29 14:29:06,508 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.SqlMappings
2026-10-29 14:29:06,508 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property id with lazy=false
2026-10-29 14:29:06,508 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SqlMappings:id]
2026-10-29 14:29:06,508 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for id
2026-10-29 14:29:06,508 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: SqlMappings.id
2026-10-29 14:29:06,508 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property id
2026-10-29 14:29:06,508 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(id)]), id, identity, , ...)
2026-10-29 14:29:06,508 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29 14:29:06,509 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.TipoDocumentoItemValidacao
2026-10-29 14:29:06,509 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name TipoDocumentoItemValidacao
2026-10-29 14:29:06,509 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.TipoDocumentoItemValidacao on table FAPTB017_TIPO_DCMTO_ITM_VLDCO
2026-10-29 14:29:06,509 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DCMTO_ITM_VLDCO')
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao] is safe
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoDocumentoItemValidacao
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDcmtoItmVldco with lazy=false
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao:nuTipoDcmtoItmVldco]
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDcmtoItmVldco
2026-10-29 14:29:06,510 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB017_TIPO_DCMTO_ITM_VLDCO.NU_TIPO_DCMTO_ITM_VLDCO
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDcmtoItmVldco
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_JUSTIFICATIVA_PADRAO')
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deJustificativaPadrao with lazy=false
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao:deJustificativaPadrao]
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deJustificativaPadrao
2026-10-29 14:29:06,510 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB017_TIPO_DCMTO_ITM_VLDCO.DE_JUSTIFICATIVA_PADRAO
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deJustificativaPadrao
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_ITEM_VALIDACAO',referencedColumn='NU_ITEM_VALIDACAO')
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property itemValidacao
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_ITEM_VALIDACAO')
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuItemValidacao with lazy=false
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao:nuItemValidacao]
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuItemValidacao
2026-10-29 14:29:06,510 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB017_TIPO_DCMTO_ITM_VLDCO.NU_ITEM_VALIDACAO
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuItemValidacao
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DOCUMENTO')
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDocumento with lazy=false
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao:nuTipoDocumento]
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDocumento
2026-10-29 14:29:06,510 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB017_TIPO_DCMTO_ITM_VLDCO.NU_TIPO_DOCUMENTO
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDocumento
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_TIPO_DOCUMENTO',referencedColumn='NU_TIPO_DOCUMENTO')
2026-10-29 14:29:06,510 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,511 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tipoDocumento
2026-10-29 14:29:06,511 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29 14:29:06,511 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.TipoDocumentoFarmacia
2026-10-29 14:29:06,512 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name TipoDocumentoFarmacia
2026-10-29 14:29:06,512 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.TipoDocumentoFarmacia on table FAPTB006_TIPO_DOCUMENTO
2026-10-29 14:29:06,512 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DOCUMENTO')
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoDocumentoFarmacia] is safe
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoDocumentoFarmacia
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDocumento with lazy=false
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoFarmacia:nuTipoDocumento]
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDocumento
2026-10-29 14:29:06,513 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.NU_TIPO_DOCUMENTO
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDocumento
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_TIPOLOGIA_DOCUMENTO')
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coTipologiaDocumento with lazy=false
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoFarmacia:coTipologiaDocumento]
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coTipologiaDocumento
2026-10-29 14:29:06,513 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.CO_TIPOLOGIA_DOCUMENTO
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coTipologiaDocumento
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_TIPO_DOCUMENTO_FARMACIA')
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deTipoDocumentoFarmacia with lazy=false
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoFarmacia:deTipoDocumentoFarmacia]
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deTipoDocumentoFarmacia
2026-10-29 14:29:06,513 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.DE_TIPO_DOCUMENTO_FARMACIA
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deTipoDocumentoFarmacia
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_CLASSE_TIPO_DOCUMENTO')
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icClasseTipoDocumento with lazy=false
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoFarmacia:icClasseTipoDocumento]
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icClasseTipoDocumento
2026-10-29 14:29:06,513 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.IC_CLASSE_TIPO_DOCUMENTO
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icClasseTipoDocumento
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_DOCUMENTO_OBRIGATORIO')
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icDocumentoObrigatorio with lazy=false
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoFarmacia:icDocumentoObrigatorio]
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icDocumentoObrigatorio
2026-10-29 14:29:06,513 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.IC_DOCUMENTO_OBRIGATORIO
2026-10-29 14:29:06,513 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icDocumentoObrigatorio
2026-10-29 14:29:06,513 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29 14:29:06,514 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.Farmaceutico
2026-10-29 14:29:06,514 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name Farmaceutico
2026-10-29 14:29:06,515 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.Farmaceutico on table FAPTB004_FARMACEUTICO
2026-10-29 14:29:06,515 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_FARMACEUTICO')
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.Farmaceutico] is safe
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.Farmaceutico
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuFarmaceutico with lazy=false
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:nuFarmaceutico]
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuFarmaceutico
2026-10-29 14:29:06,516 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.NU_FARMACEUTICO
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuFarmaceutico
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_FARMACEUTICO)]), nuFarmaceutico, identity, , ...)
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_IDENTIFICACAO_FARMACEUTICO')
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coIdentificacaoFarmaceutico with lazy=false
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:coIdentificacaoFarmaceutico]
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coIdentificacaoFarmaceutico
2026-10-29 14:29:06,516 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.CO_IDENTIFICACAO_FARMACEUTICO
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coIdentificacaoFarmaceutico
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ACAO_FARMACEUTICO')
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAcaoFarmaceutico with lazy=false
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:coUsuarioAcaoFarmaceutico]
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAcaoFarmaceutico
2026-10-29 14:29:06,516 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.CO_USUARIO_ACAO_FARMACEUTICO
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAcaoFarmaceutico
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_ENDERECO_IP_FARMACEUTICO')
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEnderecoIpFarmaceutico with lazy=false
2026-10-29 14:29:06,516 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:deEnderecoIpFarmaceutico]
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEnderecoIpFarmaceutico
2026-10-29 14:29:06,517 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.DE_ENDERECO_IP_FARMACEUTICO
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEnderecoIpFarmaceutico
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_VENCIMENTO_REGISTRO')
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtVencimentoRegistro with lazy=false
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:dtVencimentoRegistro]
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtVencimentoRegistro
2026-10-29 14:29:06,517 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.DT_VENCIMENTO_REGISTRO
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtVencimentoRegistro
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_TIPO_ACAO')
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icTipoAcao with lazy=false
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:icTipoAcao]
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icTipoAcao
2026-10-29 14:29:06,517 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.IC_TIPO_ACAO
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icTipoAcao
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CPF_FARMACEUTICO')
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuCpfFarmaceutico with lazy=false
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:nuCpfFarmaceutico]
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuCpfFarmaceutico
2026-10-29 14:29:06,517 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.NU_CPF_FARMACEUTICO
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuCpfFarmaceutico
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='SG_IDENTIFICACAO_FARMACEUTICO')
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property sgIdentificacaoFarmaceutico with lazy=false
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:sgIdentificacaoFarmaceutico]
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for sgIdentificacaoFarmaceutico
2026-10-29 14:29:06,517 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.SG_IDENTIFICACAO_FARMACEUTICO
2026-10-29 14:29:06,517 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property sgIdentificacaoFarmaceutico
2026-10-29 14:29:06,518 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_FIM_VIGENCIA_FARMACEUTICO')
2026-10-29 14:29:06,518 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsFimVigenciaFarmaceutico with lazy=false
2026-10-29 14:29:06,518 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:tsFimVigenciaFarmaceutico]
2026-10-29 14:29:06,518 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsFimVigenciaFarmaceutico
2026-10-29 14:29:06,518 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.TS_FIM_VIGENCIA_FARMACEUTICO
2026-10-29 14:29:06,518 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsFimVigenciaFarmaceutico
2026-10-29 14:29:06,518 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_VIGENCIA_FRMCO')
2026-10-29 14:29:06,518 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioVigenciaFrmco with lazy=false
2026-10-29 14:29:06,518 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:tsInicioVigenciaFrmco]
2026-10-29 14:29:06,518 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioVigenciaFrmco
2026-10-29 14:29:06,518 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.TS_INICIO_VIGENCIA_FRMCO
2026-10-29 14:29:06,518 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioVigenciaFrmco
2026-10-29 14:29:06,518 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29 14:29:06,519 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.RepresentacaoFarmacia
2026-10-29 14:29:06,519 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name RepresentacaoFarmacia
2026-10-29 14:29:06,519 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.RepresentacaoFarmacia on table FAPTB011_RPRTO_FARMACIA
2026-10-29 14:29:06,519 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29 14:29:06,520 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_REPRESENTACAO_FARMACIA')
2026-10-29 14:29:06,520 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.RepresentacaoFarmacia] is safe
2026-10-29 14:29:06,520 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.RepresentacaoFarmacia
2026-10-29 14:29:06,520 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuRepresentacaoFarmacia with lazy=false
2026-10-29 14:29:06,520 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:nuRepresentacaoFarmacia]
2026-10-29 14:29:06,520 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuRepresentacaoFarmacia
2026-10-29 14:29:06,520 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.NU_REPRESENTACAO_FARMACIA
2026-10-29 14:29:06,520 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuRepresentacaoFarmacia
2026-10-29 14:29:06,520 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_REPRESENTACAO_FARMACIA)]), nuRepresentacaoFarmacia, identity, , ...)
2026-10-29 14:29:06,520 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ACAO_REPRESENTACAO')
2026-10-29 14:29:06,520 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAcaoRepresentacao with lazy=false
2026-10-29 14:29:06,520 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:coUsuarioAcaoRepresentacao]
2026-10-29 14:29:06,520 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAcaoRepresentacao
2026-10-29 14:29:06,520 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.CO_USUARIO_ACAO_REPRESENTACAO
2026-10-29 14:29:06,520 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAcaoRepresentacao
2026-10-29 14:29:06,520 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_EMAIL_REPRESENTANTE')
2026-10-29 14:29:06,520 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEmailRepresentante with lazy=false
2026-10-29 14:29:06,520 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:deEmailRepresentante]
2026-10-29 14:29:06,520 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEmailRepresentante
2026-10-29 14:29:06,520 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.DE_EMAIL_REPRESENTANTE
2026-10-29 14:29:06,520 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEmailRepresentante
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_ENDERECO_IP_REPRESENTACAO')
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEnderecoIpRepresentacao with lazy=false
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:deEnderecoIpRepresentacao]
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEnderecoIpRepresentacao
2026-10-29 14:29:06,521 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.DE_ENDERECO_IP_REPRESENTACAO
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEnderecoIpRepresentacao
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_FIM_REPRESENTACAO')
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtFimRepresentacao with lazy=false
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:dtFimRepresentacao]
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtFimRepresentacao
2026-10-29 14:29:06,521 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.DT_FIM_REPRESENTACAO
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtFimRepresentacao
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_INICIO_REPRESENTACAO')
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtInicioRepresentacao with lazy=false
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:dtInicioRepresentacao]
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtInicioRepresentacao
2026-10-29 14:29:06,521 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.DT_INICIO_REPRESENTACAO
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtInicioRepresentacao
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_FARMACIA')
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property farmacia
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_RESPONSAVEL_LEGAL')
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icResponsavelLegal with lazy=false
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:icResponsavelLegal]
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icResponsavelLegal
2026-10-29 14:29:06,521 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.IC_RESPONSAVEL_LEGAL
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icResponsavelLegal
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_TIPO_ACAO')
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icTipoAcao with lazy=false
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:icTipoAcao]
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icTipoAcao
2026-10-29 14:29:06,521 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.IC_TIPO_ACAO
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icTipoAcao
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_DDD_REPRESENTANTE')
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuDddRepresentante with lazy=false
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:nuDddRepresentante]
2026-10-29 14:29:06,521 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuDddRepresentante
2026-10-29 14:29:06,522 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.NU_DDD_REPRESENTANTE
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuDddRepresentante
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TELEFONE_REPRESENTANTE')
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTelefoneRepresentante with lazy=false
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:nuTelefoneRepresentante]
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTelefoneRepresentante
2026-10-29 14:29:06,522 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.NU_TELEFONE_REPRESENTANTE
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTelefoneRepresentante
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_REPRESENTANTE_FARMACIA')
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property representante
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_FIM_PERIODO')
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsFimPeriodo with lazy=false
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:tsFimPeriodo]
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsFimPeriodo
2026-10-29 14:29:06,522 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.TS_FIM_PERIODO
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsFimPeriodo
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_PERIODO')
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioPeriodo with lazy=false
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:tsInicioPeriodo]
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioPeriodo
2026-10-29 14:29:06,522 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.TS_INICIO_PERIODO
2026-10-29 14:29:06,522 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioPeriodo
2026-10-29 14:29:06,522 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29 14:29:06,524 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDocumento
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coTipologiaDocumento
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deTipoDocumentoFarmacia
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icClasseTipoDocumento
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icDocumentoObrigatorio
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuControleDocumento
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhEnvioDocumento
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icDocumentoLocal
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuFarmaceutico
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuFarmacia
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuRepresentanteFarmacia
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDocumento
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuItemValidacao
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for noItemValidado
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoSituacaoFarmacia
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deTipoSituacaoFarmacia
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuSqnclAnaliseDocumento
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioPeriodo
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coCpfCnpjDocumento
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAnaliseDocumento
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deJustificativa
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhAnaliseDocumento
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhFimAnaliseDocumento
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icAnaliseDocumento
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icCpfCnpjDocumento
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icUsuarioAnaliseDocumento
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuIdentificadorDocumento
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDocumento
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuFarmacia
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coCnpjEstabelecimentoLegado
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coLicencaFuncionamento
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coProcessoSei
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAcaoFarmacia
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEmailFarmacia
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEnderecoIpFarmacia
2026-10-29 14:29:06,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhAtualizacaoFarmacia
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhSubmissaoSlctoCadastro
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtVencimentoCnd
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtVencimentoLicencaFncmo
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icEfetuaVenda
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icEmissaoFiscalEletronico
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icTipoAcao
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for noTitularidadeContaCredito
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuAgencia
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuBanco
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuCnpjEstabelecimento
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuConta
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuDddAlternativo
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuDddPrincipal
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuDvAgencia
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuDvConta
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuIbgeMunicipio
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuInscricaoInss
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuRegistroJuntaComercial
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTelefoneAlternativo
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTelefonePrincipal
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoConta
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for sgUfFarmacia
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsFimVigenciaFarmacia
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioVigenciaFarmacia
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuItemAnaliseDocumento
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhItemAnalise
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icItemPendente
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuMatricula
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuSqnclAnaliseDocumento
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDcmtoItmVldco
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuFarmaciaAuxiliar
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coCnpjEstabelecimentoLegado
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coCnpjMatrizLegado
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deMotivoBloqueio
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhAtualizacaoCadastro
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtBloqueio
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icAtualizacaoCadastro
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuCnpjEstabelecimento
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuCnpjMatriz
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuMotivoBloqueio
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuRepresentanteFarmacia
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAcaoRepresentante
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEnderecoIpRepresentante
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icTipoAcao
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuCpfRepresentante
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsFimVigenciaRprse
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioVigenciaRprse
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuSituacaoFarmacia
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAcaoSituacao
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAlteracaoSituacao
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deJustificativaSituacao
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhSituacaoFarmacia
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icRenovacao
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuMotivoBloqueio
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoSituacao
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuRepresentacaoTecnica
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAcaoRepresentacao
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEnderecoIpRepresentacao
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtFimRepresentacao
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtInicioRepresentacao
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtVencimentoCertidaoRegularidade
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icTipoAcao
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsFimPeriodo
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioPeriodo
2026-10-29 14:29:06,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuSqnclAnaliseDocumento
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coCpfCnpjDocumento
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAnaliseDocumento
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deJustificativa
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhAnaliseDocumento
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhFimAnaliseDocumento
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icAnaliseDocumento
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icCpfCnpjDocumento
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icUsuarioAnaliseDocumento
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuIdentificadorDocumento
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDocumento
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsFimPeriodo
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioPeriodo
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for id
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDcmtoItmVldco
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deJustificativaPadrao
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuItemValidacao
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDocumento
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDocumento
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coTipologiaDocumento
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deTipoDocumentoFarmacia
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icClasseTipoDocumento
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icDocumentoObrigatorio
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuFarmaceutico
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coIdentificacaoFarmaceutico
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAcaoFarmaceutico
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEnderecoIpFarmaceutico
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtVencimentoRegistro
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icTipoAcao
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuCpfFarmaceutico
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for sgIdentificacaoFarmaceutico
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsFimVigenciaFarmaceutico
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioVigenciaFrmco
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuRepresentacaoFarmacia
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAcaoRepresentacao
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEmailRepresentante
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEnderecoIpRepresentacao
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtFimRepresentacao
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtInicioRepresentacao
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icResponsavelLegal
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icTipoAcao
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuDddRepresentante
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTelefoneRepresentante
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsFimPeriodo
2026-10-29 14:29:06,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioPeriodo
2026-10-29 14:29:06,534 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_tipo_documento] to be non-null as it is part of the primary key for table [faptb006_tipo_documento]
2026-10-29 14:29:06,534 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_controle_documento] to be non-null as it is part of the primary key for table [faptb014_controle_documento]
2026-10-29 14:29:06,534 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_item_validacao] to be non-null as it is part of the primary key for table [faptb016_item_validacao]
2026-10-29 14:29:06,534 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_tipo_situacao_farmacia] to be non-null as it is part of the primary key for table [faptb003_tipo_stco_farmacia]
2026-10-29 14:29:06,534 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_sqncl_analise_documento] to be non-null as it is part of the primary key for table [faptb119_hstro_anlse_documento]
2026-10-29 14:29:06,534 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [ts_inicio_periodo] to be non-null as it is part of the primary key for table [faptb119_hstro_anlse_documento]
2026-10-29 14:29:06,534 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_farmacia] to be non-null as it is part of the primary key for table [faptb001_farmacia]
2026-10-29 14:29:06,534 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_item_analise_documento] to be non-null as it is part of the primary key for table [faptb018_item_analise_dcmto]
2026-10-29 14:29:06,534 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_farmacia_auxiliar] to be non-null as it is part of the primary key for table [faptb012_farmacia_auxiliar]
2026-10-29 14:29:06,534 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_representante_farmacia] to be non-null as it is part of the primary key for table [faptb010_rprse_farmacia]
2026-10-29 14:29:06,534 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_situacao_farmacia] to be non-null as it is part of the primary key for table [faptb002_situacao_farmacia]
2026-10-29 14:29:06,535 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_representacao_tecnica] to be non-null as it is part of the primary key for table [faptb005_rprse_tecnica]
2026-10-29 14:29:06,535 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_sqncl_analise_documento] to be non-null as it is part of the primary key for table [faptb019_analise_documento]
2026-10-29 14:29:06,535 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [id] to be non-null as it is part of the primary key for table [sqlmappings]
2026-10-29 14:29:06,535 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_tipo_dcmto_itm_vldco] to be non-null as it is part of the primary key for table [faptb017_tipo_dcmto_itm_vldco]
2026-10-29 14:29:06,535 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_tipo_documento] to be non-null as it is part of the primary key for table [faptb006_tipo_documento]
2026-10-29 14:29:06,535 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_farmaceutico] to be non-null as it is part of the primary key for table [faptb004_farmaceutico]
2026-10-29 14:29:06,535 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_representacao_farmacia] to be non-null as it is part of the primary key for table [faptb011_rprto_farmacia]
2026-10-29 14:29:06,538 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Second pass for collection: br.com.caixa.sifap.entity.Farmacia.representacoes
2026-10-29 14:29:06,539 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Binding a OneToMany: br.com.caixa.sifap.entity.Farmacia.representacoes through a foreign key
2026-10-29 14:29:06,541 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Mapping collection: br.com.caixa.sifap.entity.Farmacia.representacoes -> FAPTB011_RPRTO_FARMACIA
2026-10-29 14:29:06,552 DEBUG [org.hib.boo.mod.int.TableBinder] (main) Retrieving property br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia
2026-10-29 14:29:06,553 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Mapped collection key: NU_FARMACIA, one-to-many: br.com.caixa.sifap.entity.RepresentacaoFarmacia
2026-10-29 14:29:06,553 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Second pass for collection: br.com.caixa.sifap.entity.Farmacia.representacoesTecnica
2026-10-29 14:29:06,553 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Binding a OneToMany: br.com.caixa.sifap.entity.Farmacia.representacoesTecnica through a foreign key
2026-10-29 14:29:06,553 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Mapping collection: br.com.caixa.sifap.entity.Farmacia.representacoesTecnica -> FAPTB005_RPRSE_TECNICA
2026-10-29 14:29:06,553 DEBUG [org.hib.boo.mod.int.TableBinder] (main) Retrieving property br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia
2026-10-29 14:29:06,553 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Mapped collection key: NU_FARMACIA, one-to-many: br.com.caixa.sifap.entity.RepresentacaoTecnica
2026-10-29 14:29:06,553 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Second pass for collection: br.com.caixa.sifap.entity.Farmacia.situacoes
2026-10-29 14:29:06,553 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Binding a OneToMany: br.com.caixa.sifap.entity.Farmacia.situacoes through a foreign key
2026-10-29 14:29:06,553 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Mapping collection: br.com.caixa.sifap.entity.Farmacia.situacoes -> FAPTB002_SITUACAO_FARMACIA
2026-10-29 14:29:06,553 DEBUG [org.hib.boo.mod.int.TableBinder] (main) Retrieving property br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia
2026-10-29 14:29:06,553 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Mapped collection key: NU_FARMACIA, one-to-many: br.com.caixa.sifap.entity.SituacaoFarmacia
2026-10-29 14:29:06,553 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Second pass for collection: br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise
2026-10-29 14:29:06,553 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Binding a OneToMany: br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise through a foreign key
2026-10-29 14:29:06,553 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Mapping collection: br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise -> FAPTB018_ITEM_ANALISE_DCMTO
2026-10-29 14:29:06,554 DEBUG [org.hib.boo.mod.int.TableBinder] (main) Retrieving property br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento
2026-10-29 14:29:06,554 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Mapped collection key: NU_SQNCL_ANALISE_DOCUMENTO, one-to-many: br.com.caixa.sifap.entity.ItemAnaliseDocumento
2026-10-29 14:29:06,615 DEBUG [org.inf.qua.hib.cac.QuarkusInfinispanRegionFactory] (main) Stop region factory
2026-10-29 14:29:06,615 DEBUG [org.inf.qua.hib.cac.QuarkusInfinispanRegionFactory] (main) Clear region references
2026-10-29 14:29:06,616 DEBUG [org.hib.boo.reg.int.BootstrapServiceRegistryImpl] (main) Implicitly destroying Boot-strap registry on de-registration of all child ServiceRegistries
2026-10-29 14:29:06,616 DEBUG [org.hib.boo.reg.int.BootstrapServiceRegistryImpl] (main) Implicitly destroying Boot-strap registry on de-registration of all child ServiceRegistries
2026-10-29 14:29:06,617 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.Farmaceutico] is safe
2026-10-29 14:29:06,617 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.Farmaceutico
2026-10-29 14:29:06,619 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.RepresentacaoFarmacia] is safe
2026-10-29 14:29:06,619 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.RepresentacaoFarmacia
2026-10-29 14:29:06,621 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.SituacaoFarmacia] is safe
2026-10-29 14:29:06,621 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.SituacaoFarmacia
2026-10-29 14:29:06,622 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoDocumentoFarmacia] is safe
2026-10-29 14:29:06,622 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoDocumentoFarmacia
2026-10-29 14:29:06,623 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.ControleDocumento] is safe
2026-10-29 14:29:06,623 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.ControleDocumento
2026-10-29 14:29:06,624 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento] is safe
2026-10-29 14:29:06,624 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.HistoricoAnaliseDocumento
2026-10-29 14:29:06,626 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.RepresentacaoTecnica] is safe
2026-10-29 14:29:06,626 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.RepresentacaoTecnica
2026-10-29 14:29:06,627 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.ItemValidacao] is safe
2026-10-29 14:29:06,627 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.ItemValidacao
2026-10-29 14:29:06,628 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoSituacaoFarmacia] is safe
2026-10-29 14:29:06,628 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoSituacaoFarmacia
2026-10-29 14:29:06,629 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.Farmacia] is safe
2026-10-29 14:29:06,629 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.Farmacia
2026-10-29 14:29:06,632 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.RepresentanteFarmacia] is safe
2026-10-29 14:29:06,632 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.RepresentanteFarmacia
2026-10-29 14:29:06,633 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.AnaliseDocumento] is safe
2026-10-29 14:29:06,633 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.AnaliseDocumento
2026-10-29 14:29:06,634 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.SqlMappings] is safe
2026-10-29 14:29:06,634 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.SqlMappings
2026-10-29 14:29:06,635 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.FarmaciaAuxiliar] is safe
2026-10-29 14:29:06,635 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.FarmaciaAuxiliar
2026-10-29 14:29:06,636 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoDocumento] is safe
2026-10-29 14:29:06,636 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoDocumento
2026-10-29 14:29:06,637 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.ItemAnaliseDocumento] is safe
2026-10-29 14:29:06,637 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.ItemAnaliseDocumento
2026-10-29 14:29:06,638 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao] is safe
2026-10-29 14:29:06,638 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoDocumentoItemValidacao
2026-10-29 14:29:06,658 DEBUG [io.qua.arc.run.ArcRecorder] (main) Bean container listener io.quarkus.hibernate.orm.runtime.HibernateOrmRecorder$1 finished in 869 ms
2026-10-29 14:29:06,671 DEBUG [org.hib.val.int.uti.Version] (main) HV000001: Hibernate Validator 8.0.2.Final
2026-10-29 14:29:06,675 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom LocaleResolver of type io.quarkus.hibernate.validator.runtime.locale.LocaleResolversWrapper
2026-10-29 14:29:06,677 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom BeanMetaDataClassNormalizer of type io.quarkus.hibernate.validator.runtime.ArcProxyBeanMetaDataClassNormalizer
2026-10-29 14:29:06,692 DEBUG [io.qua.arc.impl] (main) Loaded 66 removed beans lazily
2026-10-29 14:29:06,704 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom ConstraintValidatorFactory of type io.quarkus.hibernate.validator.runtime.ArcConstraintValidatorFactoryImpl
2026-10-29 14:29:06,705 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom TraversableResolver of type org.hibernate.validator.internal.engine.resolver.JPATraversableResolver
2026-10-29 14:29:06,705 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom ClockProvider of type io.quarkus.hibernate.validator.runtime.clockprovider.RuntimeReinitializedDefaultClockProvider
2026-10-29 14:29:06,707 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) HV000002: Ignoring XML configuration.
2026-10-29 14:29:06,758 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) ValidationMessages not found.
2026-10-29 14:29:06,759 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000255: Using io.quarkus.hibernate.validator.runtime.locale.LocaleResolversWrapper as locale resolver.
2026-10-29 14:29:06,760 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) ContributorValidationMessages not found.
2026-10-29 14:29:06,762 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) org.hibernate.validator.ValidationMessages found.
2026-10-29 14:29:06,769 DEBUG [org.hib.val.mes.ResourceBundleMessageInterpolator] (main) Loaded expression factory via original TCCL
2026-10-29 14:29:06,773 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000252: Using org.hibernate.validator.internal.engine.DefaultPropertyNodeNameProvider as property node name provider.
2026-10-29 14:29:06,844 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator as ValidatorFactory-scoped message interpolator.
2026-10-29 14:29:06,845 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.engine.resolver.JPATraversableResolver as ValidatorFactory-scoped traversable resolver.
2026-10-29 14:29:06,845 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.util.ExecutableParameterNameProvider as ValidatorFactory-scoped parameter name provider.
2026-10-29 14:29:06,845 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using io.quarkus.hibernate.validator.runtime.clockprovider.RuntimeReinitializedDefaultClockProvider as ValidatorFactory-scoped clock provider.
2026-10-29 14:29:06,845 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.engine.scripting.DefaultScriptEvaluatorFactory as ValidatorFactory-scoped script evaluator factory.
2026-10-29 14:29:06,851 DEBUG [io.qua.arc.run.ArcRecorder] (main) Bean container listener io.quarkus.hibernate.validator.runtime.HibernateValidatorRecorder$2 finished in 193 ms
2026-10-29 14:29:06,855 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type interface br.com.caixa.sifap.client.SimtrApiClient and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,856 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type interface br.com.caixa.sifap.client.SimtrAzureApiClient and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,856 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class br.com.caixa.sifap.client.SimtrApiClient$$CDIWrapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,856 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class br.com.caixa.sifap.client.SimtrAzureApiClient$$CDIWrapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,868 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerVertxBufferMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,869 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerMutinyBufferMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,870 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerVertxAsyncFileMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,871 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerMutinyAsyncFileMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,873 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonArrayMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,874 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonObjectMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,874 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.QuarkusServerPathBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,875 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonArrayMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,875 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonObjectMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,875 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,875 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerCharArrayMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerByteArrayMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerFormUrlEncodedProvider and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerInputStreamMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.StreamingOutputMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerReaderBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerFileBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerFilePartBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.core.multipart.MultipartMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerPathBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerPathPartBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerBooleanMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerCharacterMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerNumberMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerInputStreamMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,876 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerReaderBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,877 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.QuarkusServerFileBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,877 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerByteArrayMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,877 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerDefaultTextPlainBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,878 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.exceptionmappers.ForbiddenExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,879 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.mappers.BuiltinMismatchedInputExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,879 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.exceptionmappers.AuthenticationRedirectExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,879 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.exceptionmappers.AuthenticationCompletionExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:06,879 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.rest.runtime.__QuarkusInit and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:07,019 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonArrayBasicMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:07,019 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonObjectBasicMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:07,019 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonArrayBasicMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:07,019 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonObjectBasicMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29 14:29:07,054 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource BuildTime RunTime Fixed with ordinal 2147483647
2026-10-29 14:29:07,054 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource SysPropConfigSource with ordinal 400
2026-10-29 14:29:07,054 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource EnvConfigSource with ordinal 300
2026-10-29 14:29:07,054 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource PropertiesConfigSource[source=jar:file:///deployments/app/sifap-centralizadora-1.0.0-SNAPSHOT.jar!/application.properties] with ordinal 250
2026-10-29 14:29:07,054 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource DefaultValuesConfigSource with ordinal -2147483648
2026-10-29 14:29:07,304 DEBUG [io.net.uti.int.PlatformDependent0] (main) Java version: 21
2026-10-29 14:29:07,304 DEBUG [io.net.uti.int.PlatformDependent0] (main) -Dio.netty.noUnsafe: false
2026-10-29 14:29:07,306 DEBUG [io.net.uti.int.PlatformDependent0] (main) java.nio.Buffer.address: available
2026-10-29 14:29:07,308 DEBUG [io.net.uti.int.PlatformDependent0] (main) java.nio.Bits.unaligned: available, true
2026-10-29 14:29:07,308 DEBUG [io.net.uti.int.PlatformDependent0] (main) java.nio.DirectByteBuffer.<init>(long, {int,long}): unavailable
2026-10-29 14:29:07,308 DEBUG [io.net.uti.int.PlatformDependent] (main) sun.misc.Unsafe: available
2026-10-29 14:29:07,309 DEBUG [io.net.uti.int.PlatformDependent] (main) -Dio.netty.tmpdir: /tmp (java.io.tmpdir)
2026-10-29 14:29:07,309 DEBUG [io.net.uti.int.PlatformDependent] (main) -Dio.netty.bitMode: 64 (sun.arch.data.model)
2026-10-29 14:29:07,310 DEBUG [io.net.uti.int.PlatformDependent] (main) -Dio.netty.maxDirectMemory: -1 bytes
2026-10-29 14:29:07,310 DEBUG [io.net.uti.int.PlatformDependent] (main) -Dio.netty.uninitializedArrayAllocationThreshold: -1
2026-10-29 14:29:07,310 DEBUG [io.net.uti.int.CleanerJava9] (main) java.nio.ByteBuffer.cleaner(): available
2026-10-29 14:29:07,310 DEBUG [io.net.uti.int.PlatformDependent] (main) -Dio.netty.noPreferDirect: false
2026-10-29 14:29:07,321 DEBUG [io.net.cha.DefaultChannelId] (Thread-16) -Dio.netty.processId: 8 (auto-detected)
2026-10-29 14:29:07,323 DEBUG [io.net.cha.DefaultChannelId] (Thread-16) -Dio.netty.machineId: 7e:56:37:43:7e:18:49:c8 (user-set)
2026-10-29 14:29:07,390 DEBUG [io.ver.cor.log.LoggerFactory] (main) Using io.vertx.core.logging.SLF4JLogDelegateFactory
2026-10-29 14:29:07,406 DEBUG [io.qua.ver.cor.run.VertxCoreRecorder] (main) Vert.x Cache configured to: /tmp/vertx-cache/4709424356591354578
2026-10-29 14:29:07,428 DEBUG [io.net.uti.ResourceLeakDetector] (main) -Dio.netty.leakDetection.level: simple
2026-10-29 14:29:07,428 DEBUG [io.net.uti.ResourceLeakDetector] (main) -Dio.netty.leakDetection.targetRecords: 4
2026-10-29 14:29:07,491 DEBUG [io.net.cha.MultithreadEventLoopGroup] (main) -Dio.netty.eventLoopThreads: 4
2026-10-29 14:29:07,541 DEBUG [io.net.uti.con.GlobalEventExecutor] (main) -Dio.netty.globalEventExecutor.quietPeriodSeconds: 1
2026-10-29 14:29:07,591 DEBUG [io.net.cha.nio.NioEventLoop] (main) -Dio.netty.noKeySetOptimization: false
2026-10-29 14:29:07,591 DEBUG [io.net.cha.nio.NioEventLoop] (main) -Dio.netty.selectorAutoRebuildThreshold: 512
2026-10-29 14:29:07,606 DEBUG [io.net.uti.int.PlatformDependent] (main) org.jctools-core.MpscChunkedArrayQueue: available
2026-10-29 14:29:07,636 DEBUG [io.qua.ver.cor.run.VertxCoreRecorder] (main) Vertx has Native Transport Enabled: false
2026-10-29 14:29:07,664 DEBUG [com.arj.ats.jta] (main) Setting up node identifiers '[quarkus]' for which recovery will be performed
2026-10-29 14:29:07,832 DEBUG [io.qua.hib.orm.run.FastBootHibernatePersistenceProvider] (JPA Startup Thread) Located 1 persistence units; checking each
2026-10-29 14:29:07,833 DEBUG [io.qua.hib.orm.run.FastBootHibernatePersistenceProvider] (JPA Startup Thread) Checking persistence-unit [name=<default>, explicit-provider=null] against incoming persistence unit name [<default>]
2026-10-29 14:29:07,833 DEBUG [io.qua.hib.orm.run.FastBootHibernatePersistenceProvider] (JPA Startup Thread) No PersistenceProvider explicitly requested, assuming Hibernate
2026-10-29 14:29:07,854 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA384withRSA, Serial:59b1b579e8e2132e23907bda777755c, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:1057369358, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-10-29 14:29:07,855 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA384withRSA, Serial:8ad40b260d29c4c9f5ecda9bd93aed9, Subject:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3406046841, Valid from:4/28/21, 9:00?PM, Valid until:4/28/36, 8:59?PM
2026-10-29 14:29:07,856 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA256withRSA, Serial:c26e750be1b79211a147046343311c3, Subject:CN=Microsoft Corporation, OU=Java Signing (SHA2), O=Microsoft Corporation, L=Redmond, ST=Washington, C=US, Issuer:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:536829827, Valid from:8/2/21, 9:00?PM, Valid until:10/30/24, 8:59?PM
2026-10-29 14:29:07,857 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA256withRSA, Serial:544aff3949d0839a6bfdb3f5fe56116, Subject:CN=DigiCert Timestamp 2023, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted G4 RSA4096 SHA256 TimeStamping CA, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:85613909, Valid from:7/13/23, 9:00?PM, Valid until:10/13/34, 8:59?PM
2026-10-29 14:29:07,858 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA256withRSA, Serial:73637b724547cd847acfd28662a5e5b, Subject:CN=DigiCert Trusted G4 RSA4096 SHA256 TimeStamping CA, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3207540671, Valid from:3/22/22, 9:00?PM, Valid until:3/22/37, 8:59?PM
2026-10-29 14:29:07,858 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA384withRSA, Serial:e9b188ef9d02de7efdb50e20840185a, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:845088433, Valid from:7/31/22, 9:00?PM, Valid until:11/9/31, 8:59?PM
2026-10-29 14:29:07,864 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA384withRSA, Serial:59b1b579e8e2132e23907bda777755c, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:1057369358, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-10-29 14:29:07,865 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA384withRSA, Serial:8ad40b260d29c4c9f5ecda9bd93aed9, Subject:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3406046841, Valid from:4/28/21, 9:00?PM, Valid until:4/28/36, 8:59?PM
2026-10-29 14:29:07,865 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA256withRSA, Serial:c26e750be1b79211a147046343311c3, Subject:CN=Microsoft Corporation, OU=Java Signing (SHA2), O=Microsoft Corporation, L=Redmond, ST=Washington, C=US, Issuer:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:536829827, Valid from:8/2/21, 9:00?PM, Valid until:10/30/24, 8:59?PM
2026-10-29 14:29:07,866 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA256withRSA, Serial:544aff3949d0839a6bfdb3f5fe56116, Subject:CN=DigiCert Timestamp 2023, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted G4 RSA4096 SHA256 TimeStamping CA, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:85613909, Valid from:7/13/23, 9:00?PM, Valid until:10/13/34, 8:59?PM
2026-10-29 14:29:07,866 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA256withRSA, Serial:73637b724547cd847acfd28662a5e5b, Subject:CN=DigiCert Trusted G4 RSA4096 SHA256 TimeStamping CA, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3207540671, Valid from:3/22/22, 9:00?PM, Valid until:3/22/37, 8:59?PM
2026-10-29 14:29:07,867 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA384withRSA, Serial:e9b188ef9d02de7efdb50e20840185a, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:845088433, Valid from:7/31/22, 9:00?PM, Valid until:11/9/31, 8:59?PM
2026-10-29 14:29:07,939 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (JPA Startup Thread) Property:serverName Value:10.116.92.87
2026-10-29 14:29:07,939 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (JPA Startup Thread) Property:portNumber Value:1433
2026-10-29 14:29:07,939 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (JPA Startup Thread) Property:databaseName Value:FAPDB001
2026-10-29 14:29:07,939 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (JPA Startup Thread) Property:encrypt Value:false
2026-10-29 14:29:07,939 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (JPA Startup Thread) Property:trustServerCertificate Value:true
2026-10-29 14:29:07,947 DEBUG [io.qua.agr.run.DataSources] (JPA Startup Thread) Started datasource <default> connected to jdbc:sqlserver://10.116.92.87:1433;databaseName=FAPDB001;encrypt=false;trustServerCertificate=true
2026-10-29 14:29:07,963 DEBUG [org.hib.res.jdb.int.LogicalConnectionManagedImpl] (JPA Startup Thread) `hibernate.connection.provider_disables_autocommit` was enabled.  This setting should only be enabled when you are certain that the Connections given to Hibernate by the ConnectionProvider have auto-commit disabled.  Enabling this setting when the Connections do not have auto-commit disabled will lead to Hibernate executing SQL operations outside of any JDBC/SQL transaction.
2026-10-29 14:29:08,008 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:43012c986d4559cd42b7ea298c0000012c986d, Subject:CN=Microsoft TLS G2 RSA CA OCSP 04 External OCSP Responder 2026-09-, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 04, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:1205376199, Valid from:9/29/26, 7:03?PM, Valid until:3/28/27, 7:03?PM
2026-10-29 14:29:08,009 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:430146991169d05ba1713fbd20000001469911, Subject:CN=live.applicationinsights.azure.com, O=Microsoft Corporation, L=Redmond, ST=WA, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 04, O=Microsoft Corporation, C=US, Key type:RSA, Length:2048, Cert Id:2641376945, Valid from:10/13/26, 8:30?AM, Valid until:1/21/27, 7:30?AM
2026-10-29 14:29:08,009 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:330000000b13e5667d4a9b558000000000000b, Subject:CN=Microsoft TLS G2 RSA CA OCSP 04, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:451853138, Valid from:8/1/25, 5:02?PM, Valid until:6/3/29, 5:02?PM
2026-10-29 14:29:08,009 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:b0c6b2c466917b04773c647d4afc0c8, Subject:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3081933591, Valid from:5/20/25, 9:00?PM, Valid until:6/19/29, 8:59?PM
2026-10-29 14:29:08,012 DEBUG [jdk.eve.security] (reactor-http-epoll-1) ValidationChain: 1136084297, 3081933591, 451853138, 2641376945
2026-10-29 14:29:08,014 DEBUG [jdk.eve.security] (reactor-http-epoll-1)  TLSHandshake: brazilsouth.livediagnostics.monitor.azure.com:443, TLSv1.3, TLS_AES_256_GCM_SHA384, 2641376945
2026-10-29 14:29:08,021 FINE  [com.mic.sql.jdb.Driver] (agroal-11) Microsoft JDBC Driver 12.8.1.0 for SQL Server
2026-10-29 14:29:08,022 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (agroal-11) Property:serverName Value:10.116.92.87
2026-10-29 14:29:08,022 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (agroal-11) Property:portNumber Value:1433
2026-10-29 14:29:08,022 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (agroal-11) Property:databaseName Value:FAPDB001
2026-10-29 14:29:08,022 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (agroal-11) Property:encrypt Value:false
2026-10-29 14:29:08,022 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (agroal-11) Property:trustServerCertificate Value:true
2026-10-29 14:29:08,075 FINE  [com.mic.sql.jdb.int.SQLServerConnection] (agroal-11) ConnectionID:1 created by (SQLServerDriver:3)
2026-10-29 14:29:08,080 FINE  [com.mic.sql.jdb.int.SQLServerConnection] (agroal-11) ConnectionID:1 Connecting with server: 10.116.92.87 port: 1433 Timeout slice: 3749 Timeout Full: 30
2026-10-29 14:29:08,117 FINE  [com.mic.sql.jdb.int.SQLServerConnection] (agroal-11) ConnectionID:1 ClientConnectionId: 452a903b-be7b-4109-863b-f0e916e81862 Server returned major version:13
2026-10-29 14:29:08,125 DEBUG [jdk.eve.security] (agroal-11) X509Certificate: Alg:SHA1withRSA, Serial:4d4253f451ecdd9d4aa38b3419ccc25a, Subject:CN=SSL_Self_Signed_Fallback, Issuer:CN=SSL_Self_Signed_Fallback, Key type:RSA, Length:2048, Cert Id:3910152483, Valid from:9/4/26, 10:26?PM, Valid until:9/4/56, 10:26?PM
2026-10-29 14:29:08,134 DEBUG [jdk.eve.security] (agroal-11)  TLSHandshake: 10.116.92.87:1433, TLSv1.2, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, 3910152483
2026-10-29 14:29:08,171 FINE  [com.mic.sql.jdb.int.SQLServerDatabaseMetaData] (JPA Startup Thread)  SQLServerDatabaseMetaData:1 created by (ConnectionID:1 ClientConnectionId: 452a903b-be7b-4109-863b-f0e916e81862)
2026-10-29 14:29:08,172 DEBUG [org.hib.eng.jdb.env.int.JdbcEnvironmentInitiator] (JPA Startup Thread) Database ->
	   name : Microsoft SQL Server
	version : 13.00.5026
	  major : 13
	  minor : 0
2026-10-29 14:29:08,172 DEBUG [org.hib.eng.jdb.env.int.JdbcEnvironmentInitiator] (JPA Startup Thread) Driver ->
	   name : Microsoft JDBC Driver 12.8 for SQL Server
	version : 12.8.1.0
	  major : 12
	  minor : 8
2026-10-29 14:29:08,172 DEBUG [org.hib.eng.jdb.env.int.JdbcEnvironmentInitiator] (JPA Startup Thread) JDBC version : 4.3
2026-10-29 14:29:08,172 DEBUG [org.hib.eng.jdb.env.spi.IdentifierHelperBuilder] (JPA Startup Thread) IdentifierCaseStrategy for both quoted and unquoted identifiers was set to the same strategy [MIXED]; that will likely lead to problems in schema update and validation if using quoted identifiers
2026-10-29 14:29:08,177 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA384withRSA, Serial:59b1b579e8e2132e23907bda777755c, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:1057369358, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-10-29 14:29:08,177 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA384withRSA, Serial:8ad40b260d29c4c9f5ecda9bd93aed9, Subject:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3406046841, Valid from:4/28/21, 9:00?PM, Valid until:4/28/36, 8:59?PM
2026-10-29 14:29:08,178 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA256withRSA, Serial:c26e750be1b79211a147046343311c3, Subject:CN=Microsoft Corporation, OU=Java Signing (SHA2), O=Microsoft Corporation, L=Redmond, ST=Washington, C=US, Issuer:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:536829827, Valid from:8/2/21, 9:00?PM, Valid until:10/30/24, 8:59?PM
2026-10-29 14:29:08,178 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA256withRSA, Serial:544aff3949d0839a6bfdb3f5fe56116, Subject:CN=DigiCert Timestamp 2023, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted G4 RSA4096 SHA256 TimeStamping CA, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:85613909, Valid from:7/13/23, 9:00?PM, Valid until:10/13/34, 8:59?PM
2026-10-29 14:29:08,179 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA256withRSA, Serial:73637b724547cd847acfd28662a5e5b, Subject:CN=DigiCert Trusted G4 RSA4096 SHA256 TimeStamping CA, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3207540671, Valid from:3/22/22, 9:00?PM, Valid until:3/22/37, 8:59?PM
2026-10-29 14:29:08,179 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA384withRSA, Serial:e9b188ef9d02de7efdb50e20840185a, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:845088433, Valid from:7/31/22, 9:00?PM, Valid until:11/9/31, 8:59?PM
2026-10-29 14:29:08,192 FINE  [com.mic.sql.jdb.int.SQLServerStatement] (JPA Startup Thread) SQLServerStatement:1 created by (ConnectionID:1 ClientConnectionId: 452a903b-be7b-4109-863b-f0e916e81862)
2026-10-29 14:29:08,193 FINE  [com.mic.sql.jdb.int.SQLServerStatement] (JPA Startup Thread) SQLServerStatement:1 Executing (not server cursor) SELECT SCHEMA_NAME()
2026-10-29 14:29:08,226 FINE  [com.mic.sql.jdb.int.SQLServerResultSet] (JPA Startup Thread) SQLServerResultSet:1 created by (SQLServerStatement:1)
2026-10-29 14:29:08,232 FINE  [com.mic.sql.jdb.int.SQLServerStatement] (JPA Startup Thread) SQLServerStatement:2 created by (ConnectionID:1 ClientConnectionId: 452a903b-be7b-4109-863b-f0e916e81862)
2026-10-29 14:29:08,232 FINE  [com.mic.sql.jdb.int.SQLServerStatement] (JPA Startup Thread) SQLServerStatement:2 Executing (not server cursor) SELECT SCHEMA_NAME()
2026-10-29 14:29:08,233 FINE  [com.mic.sql.jdb.int.SQLServerResultSet] (JPA Startup Thread) SQLServerResultSet:2 created by (SQLServerStatement:2)
2026-10-29 14:29:08,235 FINE  [com.mic.sql.jdb.int.SQLServerClob] (JPA Startup Thread) SQLServerClob:1 created by (ConnectionID:1 ClientConnectionId: 452a903b-be7b-4109-863b-f0e916e81862)
2026-10-29 14:29:08,235 FINE  [com.mic.sql.jdb.int.SQLServerNClob] (JPA Startup Thread) SQLServerNClob:2 created by (ConnectionID:1 ClientConnectionId: 452a903b-be7b-4109-863b-f0e916e81862)
2026-10-29 14:29:08,236 DEBUG [org.hib.orm.con.pooling] (JPA Startup Thread) HHH10001005: Database info:
	Database JDBC URL [undefined/unknown]
	Database driver: undefined/unknown
	Database version: 13.0
	Autocommit mode: undefined/unknown
	Isolation level: undefined/unknown
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2026-10-29 14:29:08,264 DEBUG [org.hib.int.SessionFactoryImpl] (JPA Startup Thread) Building session factory
2026-10-29 14:29:08,297 DEBUG [org.hib.ser.int.SessionFactoryServiceRegistryImpl] (JPA Startup Thread) EventListenerRegistry access via ServiceRegistry is deprecated.  Use `sessionFactory.getEventEngine().getListenerRegistry()` instead
2026-10-29 14:29:08,298 DEBUG [org.hib.int.SessionFactoryImpl] (JPA Startup Thread) Instantiating SessionFactory with settings: {jakarta.persistence.validation.mode=CALLBACK, hibernate.format_sql=true, hibernate.hbm2ddl.schema-generation.script.append=false, hibernate.connection.handling_mode=DELAYED_ACQUISITION_AND_RELEASE_BEFORE_TRANSACTION_COMPLETION, hibernate.cache.use_query_cache=true, hibernate.xml_mapping_enabled=false, jakarta.persistence.database-product-name=Microsoft SQL Server, hibernate.hbm2ddl.charset_name=UTF-8, hibernate.highlight_sql=true, hibernate.query.plan_cache_max_size=2048, hibernate.id.sequence.increment_size_mismatch_strategy=NONE, hibernate.hbm2ddl.skip_default_import_file=true, jakarta.persistence.sharedCache.mode=ENABLE_SELECTIVE, hibernate.id.optimizer.pooled.preferred=pooled-lo, org.hibernate.flushMode=AUTO, hibernate.show_sql=true, jakarta.persistence.create-database-schemas=false, hibernate.order_updates=true, hibernate.order_by.default_null_ordering=none, jakarta.persistence.schema-generation.scripts.action=none, hibernate.allow_update_outside_transaction=false, javax.persistence.validation.factory=org.hibernate.validator.internal.engine.PredefinedScopeValidatorFactoryImpl@2792543c, hibernate.boot.allow_jdbc_metadata_access=true, hibernate.cache.use_reference_entries=true, hibernate.cache.use_second_level_cache=true, hibernate.persistenceUnitName=<default>, hibernate.query.in_clause_parameter_padding=true, jakarta.persistence.validation.factory=org.hibernate.validator.internal.engine.PredefinedScopeValidatorFactoryImpl@2792543c, hibernate.transaction.coordinator_class=class org.hibernate.resource.transaction.backend.jta.internal.JtaTransactionCoordinatorBuilderImpl, hibernate.discriminator.ignore_explicit_for_joined=false, hibernate.type.json_format_mapper=org.hibernate.type.format.jackson.JacksonJsonFormatMapper@4159922c, hibernate.connection.provider_disables_autocommit=true, hibernate.connection.datasource=io.agroal.pool.DataSource@3d476071, hibernate.hbm2ddl.import_files=, hibernate.cache.region.factory_class=org.infinispan.quarkus.hibernate.cache.QuarkusInfinispanRegionFactory, jakarta.persistence.database-product-version=13.0.5026.0, jakarta.persistence.schema-generation.database.action=none, hibernate.default_batch_fetch_size=16, hibernate.batch_fetch_style=PADDED}
2026-10-29 14:29:08,305 DEBUG [org.inf.qua.hib.cac.QuarkusInfinispanRegionFactory] (JPA Startup Thread) Starting Infinispan region factory
2026-10-29 14:29:08,308 DEBUG [org.inf.qua.hib.cac.QuarkusInfinispanRegionFactory] (JPA Startup Thread) Building timestamps cache region [default-update-timestamps-region]
2026-10-29 14:29:08,316 DEBUG [org.inf.qua.hib.cac.QuarkusInfinispanRegionFactory] (JPA Startup Thread) Building query results cache region [default-query-results-region]
2026-10-29 14:29:08,337 DEBUG [org.hib.int.SessionFactoryImpl] (JPA Startup Thread) Session factory constructed with filter configurations : {}
2026-10-29 14:29:08,341 DEBUG [org.hib.ser.int.SessionFactoryServiceRegistryImpl] (JPA Startup Thread) EventListenerRegistry access via ServiceRegistry is deprecated.  Use `sessionFactory.getEventEngine().getListenerRegistry()` instead
2026-10-29 14:29:08,346 DEBUG [org.hib.too.sch.spi.SchemaManagementToolCoordinator] (JPA Startup Thread) No schema actions specified for contributor `orm`; doing nothing
2026-10-29 14:29:08,379 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(max)] under max; prior registration was null
2026-10-29 14:29:08,380 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(min)] under min; prior registration was null
2026-10-29 14:29:08,380 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(sum)] under sum; prior registration was null
2026-10-29 14:29:08,380 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(avg)] under avg; prior registration was null
2026-10-29 14:29:08,382 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CountFunction@75cdae7] under count; prior registration was null
2026-10-29 14:29:08,382 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.EveryAnyEmulation@30b15373] under every; prior registration was null
2026-10-29 14:29:08,382 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.EveryAnyEmulation@359c0192] under any; prior registration was null
2026-10-29 14:29:08,383 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(floor)] under floor; prior registration was null
2026-10-29 14:29:08,383 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(ceiling)] under ceiling; prior registration was null
2026-10-29 14:29:08,383 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(mod)] under mod; prior registration was null
2026-10-29 14:29:08,383 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(abs)] under abs; prior registration was null
2026-10-29 14:29:08,383 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(sign)] under sign; prior registration was null
2026-10-29 14:29:08,383 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(sqrt)] under sqrt; prior registration was null
2026-10-29 14:29:08,383 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(ln)] under ln; prior registration was null
2026-10-29 14:29:08,383 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(exp)] under exp; prior registration was null
2026-10-29 14:29:08,383 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(power)] under power; prior registration was null
2026-10-29 14:29:08,383 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(round)] under round; prior registration was null
2026-10-29 14:29:08,383 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(sin)] under sin; prior registration was null
2026-10-29 14:29:08,383 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(cos)] under cos; prior registration was null
2026-10-29 14:29:08,383 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(tan)] under tan; prior registration was null
2026-10-29 14:29:08,383 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(asin)] under asin; prior registration was null
2026-10-29 14:29:08,383 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(acos)] under acos; prior registration was null
2026-10-29 14:29:08,383 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(atan)] under atan; prior registration was null
2026-10-29 14:29:08,384 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(atan2)] under atan2; prior registration was null
2026-10-29 14:29:08,385 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@2881105c] under sinh; prior registration was null
2026-10-29 14:29:08,385 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@68ec7105] under cosh; prior registration was null
2026-10-29 14:29:08,385 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@45400f2e] under tanh; prior registration was null
2026-10-29 14:29:08,385 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@23fe56f5] under pi; prior registration was null
2026-10-29 14:29:08,385 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@1c9afd49] under log; prior registration was null
2026-10-29 14:29:08,385 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(coalesce)] under coalesce; prior registration was null
2026-10-29 14:29:08,385 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(nullif)] under nullif; prior registration was null
2026-10-29 14:29:08,385 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(left)] under left; prior registration was null
2026-10-29 14:29:08,385 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(right)] under right; prior registration was null
2026-10-29 14:29:08,385 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(replace)] under replace; prior registration was null
2026-10-29 14:29:08,386 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(concat)] under concat; prior registration was null
2026-10-29 14:29:08,386 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(lower)] under lower; prior registration was null
2026-10-29 14:29:08,386 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(upper)] under upper; prior registration was null
2026-10-29 14:29:08,386 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(substring)] under substring; prior registration was null
2026-10-29 14:29:08,386 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(locate)] under locate; prior registration was null
2026-10-29 14:29:08,386 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(character_length)] under character_length; prior registration was null
2026-10-29 14:29:08,386 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : length -> character_length
2026-10-29 14:29:08,386 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.LocatePositionEmulation@23590afd] under position; prior registration was null
2026-10-29 14:29:08,388 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.InsertSubstringOverlayEmulation@21060e4f] under overlay; prior registration was null
2026-10-29 14:29:08,388 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.TrimFunction@1d64e138] under trim; prior registration was null
2026-10-29 14:29:08,389 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CastFunction@52256ea3] under cast; prior registration was null
2026-10-29 14:29:08,389 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@75bda852] under collate; prior registration was null
2026-10-29 14:29:08,390 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.ExtractFunction@47da1981] under extract; prior registration was null
2026-10-29 14:29:08,390 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(least)] under least; prior registration was null
2026-10-29 14:29:08,390 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(greatest)] under greatest; prior registration was null
2026-10-29 14:29:08,390 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CoalesceIfnullEmulation@5fc70667] under ifnull; prior registration was null
2026-10-29 14:29:08,390 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(lpad)] under lpad; prior registration was null
2026-10-29 14:29:08,390 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(rpad)] under rpad; prior registration was null
2026-10-29 14:29:08,391 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.LpadRpadPadEmulation@26d52430] under pad; prior registration was null
2026-10-29 14:29:08,391 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CastStrEmulation@4d093b91] under str; prior registration was null
2026-10-29 14:29:08,394 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.FormatFunction@2b68ecda] under format; prior registration was null
2026-10-29 14:29:08,395 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.TimestampaddFunction@1c136e3f] under timestampadd; prior registration was null
2026-10-29 14:29:08,395 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.TimestampdiffFunction@3a12d2d3] under timestampdiff; prior registration was null
2026-10-29 14:29:08,395 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : dateadd -> timestampadd
2026-10-29 14:29:08,395 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : datediff -> timestampdiff
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@7c401397] under current_date; prior registration was null
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@55c2277b] under current_time; prior registration was null
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@18bf1297] under current_timestamp; prior registration was null
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : current date -> current_date
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : current time -> current_time
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : current timestamp -> current_timestamp
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@250b3d10] under local_date; prior registration was null
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@71328183] under local_time; prior registration was null
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@4f234da6] under local_datetime; prior registration was null
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@2dadf2f4] under offset_datetime; prior registration was null
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : local date -> local_date
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : local time -> local_time
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : local datetime -> local_datetime
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : offset datetime -> offset_datetime
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@1f96f2dd] under instant; prior registration was null
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : current_instant -> instant
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.SqlFunction@19a6f79e] under sql; prior registration was null
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(cot)] under cot; prior registration was null
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(log)] under ln; prior registration was NamedSqmFunctionTemplate(ln)
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@3d6ba0b5] under log; prior registration was org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@1c9afd49
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(log10)] under log10; prior registration was null
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(atn2)] under atan2; prior registration was NamedSqmFunctionTemplate(atan2)
2026-10-29 14:29:08,396 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@30af03f2] under mod; prior registration was NamedSqmFunctionTemplate(mod)
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(square)] under square; prior registration was null
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(rand)] under rand; prior registration was null
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(radians)] under radians; prior registration was null
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(degrees)] under degrees; prior registration was null
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(pi)] under pi; prior registration was org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@23fe56f5
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(reverse)] under reverse; prior registration was null
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(space)] under space; prior registration was null
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.MultipatternSqmFunctionDescriptor@2700c94a] under lpad; prior registration was NamedSqmFunctionTemplate(lpad)
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.MultipatternSqmFunctionDescriptor@6d4e3fc5] under rpad; prior registration was NamedSqmFunctionTemplate(rpad)
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(day)] under day; prior registration was null
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(month)] under month; prior registration was null
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(year)] under year; prior registration was null
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(ascii)] under ascii; prior registration was null
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(char)] under char; prior registration was null
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : chr -> char
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(ltrim)] under ltrim; prior registration was null
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(rtrim)] under rtrim; prior registration was null
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(replicate)] under replicate; prior registration was null
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : repeat -> replicate
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(len)] under character_length; prior registration was NamedSqmFunctionTemplate(character_length)
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : len -> character_length
2026-10-29 14:29:08,397 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : length -> character_length
2026-10-29 14:29:08,398 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.MultipatternSqmFunctionDescriptor@338242c6] under substring; prior registration was NamedSqmFunctionTemplate(substring)
2026-10-29 14:29:08,398 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(datepart)] under datepart; prior registration was null
2026-10-29 14:29:08,398 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(datename)] under datename; prior registration was null
2026-10-29 14:29:08,398 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(eomonth)] under eomonth; prior registration was null
2026-10-29 14:29:08,398 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : last_date -> eomonth
2026-10-29 14:29:08,398 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@56fac710] under bitand; prior registration was null
2026-10-29 14:29:08,398 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@5875871d] under bitor; prior registration was null
2026-10-29 14:29:08,398 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@1f4f45f0] under bitxor; prior registration was null
2026-10-29 14:29:08,398 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@1eef83d1] under bitnot; prior registration was null
2026-10-29 14:29:08,398 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CaseLeastGreatestEmulation@177d7ebc] under least; prior registration was NamedSqmFunctionTemplate(least)
2026-10-29 14:29:08,398 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CaseLeastGreatestEmulation@3a1c1bc4] under greatest; prior registration was NamedSqmFunctionTemplate(greatest)
2026-10-29 14:29:08,399 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.TransactSQLStrFunction@3741a582] under str; prior registration was org.hibernate.dialect.function.CastStrEmulation@4d093b91
2026-10-29 14:29:08,403 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CastingConcatFunction@60ef6d2d] under concat; prior registration was NamedSqmFunctionTemplate(concat)
2026-10-29 14:29:08,403 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CountFunction@59d8929d] under count; prior registration was org.hibernate.dialect.function.CountFunction@75cdae7
2026-10-29 14:29:08,404 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.AvgFunction@4ad480f7] under avg; prior registration was NamedSqmFunctionTemplate(avg)
2026-10-29 14:29:08,404 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@144222ab] under log; prior registration was org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@3d6ba0b5
2026-10-29 14:29:08,404 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.MultipatternSqmFunctionDescriptor@6e3d2cd7] under round; prior registration was NamedSqmFunctionTemplate(round)
2026-10-29 14:29:08,405 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.SQLServerEveryAnyEmulation@31e90bb2] under every; prior registration was org.hibernate.dialect.function.EveryAnyEmulation@30b15373
2026-10-29 14:29:08,405 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.SQLServerEveryAnyEmulation@46c1b75e] under any; prior registration was org.hibernate.dialect.function.EveryAnyEmulation@359c0192
2026-10-29 14:29:08,405 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@14e7dd56] under octet_length; prior registration was null
2026-10-29 14:29:08,405 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@472698a2] under bit_length; prior registration was null
2026-10-29 14:29:08,405 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(charindex)] under charindex; prior registration was null
2026-10-29 14:29:08,405 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : locate -> charindex
2026-10-29 14:29:08,405 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(stdev)] under stdev; prior registration was null
2026-10-29 14:29:08,405 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(stdevp)] under stdevp; prior registration was null
2026-10-29 14:29:08,405 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : stddev_samp -> stdev
2026-10-29 14:29:08,405 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : stddev_pop -> stdevp
2026-10-29 14:29:08,405 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(var)] under var; prior registration was null
2026-10-29 14:29:08,405 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(varp)] under varp; prior registration was null
2026-10-29 14:29:08,405 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : var_samp -> var
2026-10-29 14:29:08,405 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : var_pop -> varp
2026-10-29 14:29:08,405 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.SQLServerFormatEmulation@557d8cb9] under format; prior registration was org.hibernate.dialect.function.FormatFunction@2b68ecda
2026-10-29 14:29:08,405 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(translate)] under translate; prior registration was null
2026-10-29 14:29:08,405 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@428722bf] under median; prior registration was null
2026-10-29 14:29:08,406 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(datefromparts)] under datefromparts; prior registration was null
2026-10-29 14:29:08,406 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(timefromparts)] under timefromparts; prior registration was null
2026-10-29 14:29:08,406 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(smalldatetimefromparts)] under smalldatetimefromparts; prior registration was null
2026-10-29 14:29:08,406 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(datetimefromparts)] under datetimefromparts; prior registration was null
2026-10-29 14:29:08,406 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(datetime2fromparts)] under datetime2fromparts; prior registration was null
2026-10-29 14:29:08,406 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(datetimeoffsetfromparts)] under datetimeoffsetfromparts; prior registration was null
2026-10-29 14:29:08,406 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(row_number)] under row_number; prior registration was null
2026-10-29 14:29:08,406 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(lag)] under lag; prior registration was null
2026-10-29 14:29:08,406 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(lead)] under lead; prior registration was null
2026-10-29 14:29:08,406 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(first_value)] under first_value; prior registration was null
2026-10-29 14:29:08,406 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(last_value)] under last_value; prior registration was null
2026-10-29 14:29:08,407 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(nth_value)] under nth_value; prior registration was null
2026-10-29 14:29:08,409 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.InverseDistributionWindowEmulation@26514ec1] under percentile_cont; prior registration was null
2026-10-29 14:29:08,409 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.InverseDistributionWindowEmulation@4338b1b8] under percentile_disc; prior registration was null
2026-10-29 14:29:08,410 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.HypotheticalSetWindowEmulation@bc491ee] under rank; prior registration was null
2026-10-29 14:29:08,410 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.HypotheticalSetWindowEmulation@749ecd47] under dense_rank; prior registration was null
2026-10-29 14:29:08,410 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.HypotheticalSetWindowEmulation@4c15ed5c] under percent_rank; prior registration was null
2026-10-29 14:29:08,410 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.HypotheticalSetWindowEmulation@145958d3] under cume_dist; prior registration was null
2026-10-29 14:29:08,413 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.SqlServerConvertTruncFunction@5f74bcab] under trunc; prior registration was null
2026-10-29 14:29:08,413 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : truncate -> trunc
2026-10-29 14:29:08,414 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) abs(NUMERIC arg)
2026-10-29 14:29:08,414 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double acos(NUMERIC arg)
2026-10-29 14:29:08,414 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Boolean any(BOOLEAN arg)
2026-10-29 14:29:08,414 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer ascii(STRING arg)
2026-10-29 14:29:08,414 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double asin(NUMERIC arg)
2026-10-29 14:29:08,414 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double atan(NUMERIC arg)
2026-10-29 14:29:08,414 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double atan2(NUMERIC arg0, NUMERIC arg1)
2026-10-29 14:29:08,414 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) avg(NUMERIC arg)
2026-10-29 14:29:08,414 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer bit_length(STRING_OR_CLOB arg)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) bitand(arg0, arg1)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) bitnot(arg)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) bitor(arg0, arg1)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) bitxor(arg0, arg1)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) cast(arg as Type)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) ceiling(NUMERIC arg)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Character char(INTEGER arg)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer character_length(STRING_OR_CLOB arg)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer charindex(STRING pattern, STRING string[, INTEGER start])
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Character chr(INTEGER arg)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) coalesce(arg0[, arg1[, ...]])
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String collate(STRING string as COLLATION collation)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String concat(arg0[, arg1[, ...]])
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double cos(NUMERIC arg)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double cosh(NUMERIC arg)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double cot(NUMERIC arg)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long count([distinct ]{arg|*})
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double cume_dist([arg0[, ...]])
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Date current date
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Time current time
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Timestamp current timestamp
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Date current_date
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Instant current_instant
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Time current_time
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Timestamp current_timestamp
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) dateadd(TEMPORAL_UNIT field, INTEGER magnitude, TEMPORAL datetime)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long|Double datediff(TEMPORAL_UNIT field, TEMPORAL start, TEMPORAL end)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Date datefromparts(INTEGER arg0, INTEGER arg1, INTEGER arg2)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String datename(TEMPORAL_UNIT field, TEMPORAL arg)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) datepart(TEMPORAL_UNIT field, TEMPORAL arg)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Timestamp datetime2fromparts(INTEGER arg0, INTEGER arg1, INTEGER arg2, INTEGER arg3, INTEGER arg4, INTEGER arg5, INTEGER arg6, INTEGER arg7)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Timestamp datetimefromparts(INTEGER arg0, INTEGER arg1, INTEGER arg2, INTEGER arg3, INTEGER arg4, INTEGER arg5, INTEGER arg6)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Timestamp datetimeoffsetfromparts(INTEGER arg0, INTEGER arg1, INTEGER arg2, INTEGER arg3, INTEGER arg4, INTEGER arg5, INTEGER arg6, INTEGER arg7, INTEGER arg8, INTEGER arg9)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer day(DATE arg)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double degrees(NUMERIC arg)
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long dense_rank([arg0[, ...]])
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Date eomonth(DATE arg0[, INTEGER arg1])
2026-10-29 14:29:08,415 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Boolean every(BOOLEAN arg)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double exp(NUMERIC arg)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) extract(TEMPORAL_UNIT field from TEMPORAL arg)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) first_valueANY value
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) floor(NUMERIC arg)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String format(TEMPORAL datetime as STRING pattern)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) greatest(COMPARABLE arg0[, COMPARABLE arg1[, ...]])
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) ifnull(arg0, arg1)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Instant instant
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) lagANY value[, INTEGER offset[, ANY default]]
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Date last_date(DATE arg0[, INTEGER arg1])
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) last_valueANY value
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) leadANY value[, INTEGER offset[, ANY default]]
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) least(COMPARABLE arg0[, COMPARABLE arg1[, ...]])
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String left(STRING string, INTEGER length)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer len(STRING_OR_CLOB arg)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer length(STRING_OR_CLOB arg)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double ln(NUMERIC arg)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) LocalDate local date
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) LocalDateTime local datetime
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) LocalTime local time
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) LocalDate local_date
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) LocalDateTime local_datetime
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) LocalTime local_time
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer locate(STRING pattern, STRING string[, INTEGER start])
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double log(NUMERIC base, NUMERIC arg)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double log10(NUMERIC arg)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String lower(STRING string)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String lpad(string, length[, padding])
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String ltrim(STRING string)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) max(COMPARABLE arg)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double median(NUMERIC arg)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) min(COMPARABLE arg)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer mod(INTEGER arg0, INTEGER arg1)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer month(DATE arg)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) nth_valueANY value, INTEGER nth
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) nullif(arg0, arg1)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer octet_length(STRING_OR_CLOB arg)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) OffsetDateTime offset datetime
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) OffsetDateTime offset_datetime
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String overlay(STRING string placing STRING replacement from INTEGER start[ for INTEGER length])
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String pad(STRING string with INTEGER length {leading|trailing}[ STRING character])
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double percent_rank([arg0[, ...]])
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) percentile_cont(NUMERIC arg)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) percentile_disc(NUMERIC arg)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double pi
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer position(STRING pattern in STRING string)
2026-10-29 14:29:08,416 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double power(NUMERIC arg0, NUMERIC arg1)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double radians(NUMERIC arg)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double rand([INTEGER seed])
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long rank([arg0[, ...]])
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String repeat(STRING string, INTEGER times)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String replace(STRING string, STRING pattern, STRING replacement)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String replicate(STRING string, INTEGER times)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String reverse(STRING arg)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String right(STRING string, INTEGER length)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) round(NUMERIC number[, INTEGER places])
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long row_number()
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String rpad(string, length[, padding])
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String rtrim(STRING string)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer sign(NUMERIC arg)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double sin(NUMERIC arg)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double sinh(NUMERIC arg)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Timestamp smalldatetimefromparts(INTEGER arg0, INTEGER arg1, INTEGER arg2, INTEGER arg3, INTEGER arg4)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String space(INTEGER arg)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Object sql
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double sqrt(NUMERIC arg)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) square(NUMERIC arg)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double stddev_pop(NUMERIC arg)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double stddev_samp(NUMERIC arg)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double stdev(NUMERIC arg)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double stdevp(NUMERIC arg)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String str(arg0[, arg1, arg2])
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String substring(STRING string{ from|,} INTEGER start[{ for|,} INTEGER length])
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) sum(arg)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double tan(NUMERIC arg)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double tanh(NUMERIC arg)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Time timefromparts(INTEGER arg0, INTEGER arg1, INTEGER arg2, INTEGER arg3, INTEGER arg4)
2026-10-29 14:29:08,417 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) timestampadd(TEMPORAL_UNIT field, INTEGER magnitude, TEMPORAL datetime)
2026-10-29 14:29:08,418 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long|Double timestampdiff(TEMPORAL_UNIT field, TEMPORAL start, TEMPORAL end)
2026-10-29 14:29:08,418 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String translate(STRING arg0, STRING arg1, STRING arg2)
2026-10-29 14:29:08,418 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String trim([[{leading|trailing|both} ][STRING arg0 ]from] STRING arg1)
2026-10-29 14:29:08,418 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) trunc( ... )
2026-10-29 14:29:08,418 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) truncate( ... )
2026-10-29 14:29:08,418 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String upper(STRING string)
2026-10-29 14:29:08,418 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double var(NUMERIC arg)
2026-10-29 14:29:08,418 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double var_pop(NUMERIC arg)
2026-10-29 14:29:08,418 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double var_samp(NUMERIC arg)
2026-10-29 14:29:08,418 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double varp(NUMERIC arg)
2026-10-29 14:29:08,418 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer year(DATE arg)
2026-10-29 14:29:08,422 DEBUG [org.hib.orm.que.pla.cache] (JPA Startup Thread) Starting QueryInterpretationCache(2048)
2026-10-29 14:29:08,524 DEBUG [org.hib.ser.int.SessionFactoryServiceRegistryImpl] (JPA Startup Thread) EventListenerRegistry access via ServiceRegistry is deprecated.  Use `sessionFactory.getEventEngine().getListenerRegistry()` instead
2026-10-29 14:29:08,525 DEBUG [org.hib.eve.int.EntityCopyObserverFactoryInitiator] (JPA Startup Thread) Configured EntityCopyObserver strategy: disallow
2026-10-29 14:29:08,654 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection (re)creation - br.com.caixa.sifap.entity.Farmacia.situacoes
2026-10-29 14:29:08,655 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection row deletions - br.com.caixa.sifap.entity.Farmacia.situacoes
2026-10-29 14:29:08,656 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection removals - br.com.caixa.sifap.entity.Farmacia.situacoes
2026-10-29 14:29:08,656 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection (re)creation - br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise
2026-10-29 14:29:08,656 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection row deletions - br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise
2026-10-29 14:29:08,656 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection removals - br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise
2026-10-29 14:29:08,656 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection (re)creation - br.com.caixa.sifap.entity.Farmacia.representacoesTecnica
2026-10-29 14:29:08,656 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection row deletions - br.com.caixa.sifap.entity.Farmacia.representacoesTecnica
2026-10-29 14:29:08,656 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection removals - br.com.caixa.sifap.entity.Farmacia.representacoesTecnica
2026-10-29 14:29:08,656 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection (re)creation - br.com.caixa.sifap.entity.Farmacia.representacoes
2026-10-29 14:29:08,656 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection row deletions - br.com.caixa.sifap.entity.Farmacia.representacoes
2026-10-29 14:29:08,656 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection removals - br.com.caixa.sifap.entity.Farmacia.representacoes
2026-10-29 14:29:08,713 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting post-init callbacks
2026-10-29 14:29:08,714 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.Farmaceutico) `staticFetchableList` generator
2026-10-29 14:29:08,714 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia]
2026-10-29 14:29:08,719 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante]
2026-10-29 14:29:08,719 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.RepresentacaoFarmacia) `staticFetchableList` generator
2026-10-29 14:29:08,719 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia]
2026-10-29 14:29:08,719 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao]
2026-10-29 14:29:08,719 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.SituacaoFarmacia) `staticFetchableList` generator
2026-10-29 14:29:08,719 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.TipoDocumentoFarmacia) `staticFetchableList` generator
2026-10-29 14:29:08,719 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.ControleDocumento.farmacia]
2026-10-29 14:29:08,719 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.ControleDocumento.tipoDocumento]
2026-10-29 14:29:08,719 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.ControleDocumento) `staticFetchableList` generator
2026-10-29 14:29:08,719 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : EmbeddableMappingType(br.com.caixa.sifap.entity.HistoricoAnaliseDocumento#{id})#finishInitialization
2026-10-29 14:29:08,720 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.tipoDocumento]
2026-10-29 14:29:08,720 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.HistoricoAnaliseDocumento) `staticFetchableList` generator
2026-10-29 14:29:08,720 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico]
2026-10-29 14:29:08,720 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia]
2026-10-29 14:29:08,720 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.RepresentacaoTecnica) `staticFetchableList` generator
2026-10-29 14:29:08,720 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.ItemValidacao) `staticFetchableList` generator
2026-10-29 14:29:08,720 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.TipoSituacaoFarmacia) `staticFetchableList` generator
2026-10-29 14:29:08,720 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.Farmacia.farmaciaMatriz]
2026-10-29 14:29:08,720 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping( NavigableRole[br.com.caixa.sifap.entity.Farmacia.representacoes#{element}]) - element descriptor
2026-10-29 14:29:08,720 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping(br.com.caixa.sifap.entity.Farmacia.representacoes)#finishInitialization
2026-10-29 14:29:08,720 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping(br.com.caixa.sifap.entity.Farmacia.representacoes) - key descriptor
2026-10-29 14:29:08,720 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping( NavigableRole[br.com.caixa.sifap.entity.Farmacia.representacoesTecnica#{element}]) - element descriptor
2026-10-29 14:29:08,720 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping(br.com.caixa.sifap.entity.Farmacia.representacoesTecnica)#finishInitialization
2026-10-29 14:29:08,720 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping(br.com.caixa.sifap.entity.Farmacia.representacoesTecnica) - key descriptor
2026-10-29 14:29:08,720 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping( NavigableRole[br.com.caixa.sifap.entity.Farmacia.situacoes#{element}]) - element descriptor
2026-10-29 14:29:08,720 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping(br.com.caixa.sifap.entity.Farmacia.situacoes)#finishInitialization
2026-10-29 14:29:08,721 DEBUG [org.hib.met.map.int.PluralAttributeMappingImpl] (JPA Startup Thread) Translating order-by fragment [dhSituacaoFarmacia DESC, nuSituacaoFarmacia DESC] for collection role : br.com.caixa.sifap.entity.Farmacia.situacoes
2026-10-29 14:29:08,765 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping(br.com.caixa.sifap.entity.Farmacia.situacoes) - key descriptor
2026-10-29 14:29:08,765 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.Farmacia) `staticFetchableList` generator
2026-10-29 14:29:08,765 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.RepresentanteFarmacia) `staticFetchableList` generator
2026-10-29 14:29:08,765 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping( NavigableRole[br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise#{element}]) - element descriptor
2026-10-29 14:29:08,765 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping(br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise)#finishInitialization
2026-10-29 14:29:08,765 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping(br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise) - key descriptor
2026-10-29 14:29:08,766 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento]
2026-10-29 14:29:08,766 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.AnaliseDocumento) `staticFetchableList` generator
2026-10-29 14:29:08,766 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.SqlMappings) `staticFetchableList` generator
2026-10-29 14:29:08,766 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.FarmaciaAuxiliar) `staticFetchableList` generator
2026-10-29 14:29:08,766 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.TipoDocumento) `staticFetchableList` generator
2026-10-29 14:29:08,766 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento]
2026-10-29 14:29:08,766 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.ItemAnaliseDocumento.tipoDocumentoItemValidacao]
2026-10-29 14:29:08,766 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.ItemAnaliseDocumento) `staticFetchableList` generator
2026-10-29 14:29:08,766 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.itemValidacao]
2026-10-29 14:29:08,766 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.tipoDocumento]
2026-10-29 14:29:08,766 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.TipoDocumentoItemValidacao) `staticFetchableList` generator
2026-10-29 14:29:08,766 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping( NavigableRole[br.com.caixa.sifap.entity.Farmacia.representacoes#{element}]) - element descriptor
2026-10-29 14:29:08,766 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping( NavigableRole[br.com.caixa.sifap.entity.Farmacia.representacoesTecnica#{element}]) - element descriptor
2026-10-29 14:29:08,766 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping( NavigableRole[br.com.caixa.sifap.entity.Farmacia.situacoes#{element}]) - element descriptor
2026-10-29 14:29:08,766 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping( NavigableRole[br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise#{element}]) - element descriptor
2026-10-29 14:29:08,766 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : EmbeddableMappingType(br.com.caixa.sifap.entity.HistoricoAnaliseDocumento#{id})#initColumnMappings
2026-10-29 14:29:08,876 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-10-29 14:29:08,879 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmaceutico)] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmaceutico] for NavigablePath [br.com.caixa.sifap.entity.Farmaceutico] 
2026-10-29 14:29:08,896 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.Farmaceutico]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.coIdentificacaoFarmaceutico]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.coUsuarioAcaoFarmaceutico]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.deEnderecoIpFarmaceutico]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.dtVencimentoRegistro]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.icTipoAcao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.nuCpfFarmaceutico]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.sgIdentificacaoFarmaceutico]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.tsFimVigenciaFarmaceutico]
 |  \-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.tsInicioVigenciaFrmco]

2026-10-29 14:29:08,909 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (f1 : br.com.caixa.sifap.entity.Farmaceutico) {
          primaryTableReference : FAPDB001.dbo.FAPTB004_FARMACEUTICO as f1_0
        }
      }
    }

2026-10-29 14:29:08,919 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.Farmaceutico` entity using padded IN-list : 16 (16)
2026-10-29 14:29:08,919 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-10-29 14:29:08,920 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmaceutico)] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmaceutico] for NavigablePath [br.com.caixa.sifap.entity.Farmaceutico] 
2026-10-29 14:29:08,921 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.Farmaceutico]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.coIdentificacaoFarmaceutico]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.coUsuarioAcaoFarmaceutico]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.deEnderecoIpFarmaceutico]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.dtVencimentoRegistro]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.icTipoAcao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.nuCpfFarmaceutico]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.sgIdentificacaoFarmaceutico]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.tsFimVigenciaFarmaceutico]
 |  \-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.tsInicioVigenciaFrmco]

2026-10-29 14:29:08,921 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (f1 : br.com.caixa.sifap.entity.Farmaceutico) {
          primaryTableReference : FAPDB001.dbo.FAPTB004_FARMACEUTICO as f1_0
        }
      }
    }

2026-10-29 14:29:08,923 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.Farmaceutico
2026-10-29 14:29:08,923 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_FARMACEUTICO from FAPDB001.dbo.FAPTB004_FARMACEUTICO where NU_FARMACEUTICO=?
2026-10-29 14:29:08,923 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB004_FARMACEUTICO (CO_IDENTIFICACAO_FARMACEUTICO,CO_USUARIO_ACAO_FARMACEUTICO,DE_ENDERECO_IP_FARMACEUTICO,DT_VENCIMENTO_REGISTRO,IC_TIPO_ACAO,NU_CPF_FARMACEUTICO,SG_IDENTIFICACAO_FARMACEUTICO,TS_FIM_VIGENCIA_FARMACEUTICO,TS_INICIO_VIGENCIA_FRMCO) values (?,?,?,?,?,?,?,?,?)
2026-10-29 14:29:08,923 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB004_FARMACEUTICO set CO_IDENTIFICACAO_FARMACEUTICO=?,CO_USUARIO_ACAO_FARMACEUTICO=?,DE_ENDERECO_IP_FARMACEUTICO=?,DT_VENCIMENTO_REGISTRO=?,IC_TIPO_ACAO=?,NU_CPF_FARMACEUTICO=?,SG_IDENTIFICACAO_FARMACEUTICO=?,TS_FIM_VIGENCIA_FARMACEUTICO=?,TS_INICIO_VIGENCIA_FRMCO=? where NU_FARMACEUTICO=?
2026-10-29 14:29:08,924 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB004_FARMACEUTICO where NU_FARMACEUTICO=?
2026-10-29 14:29:08,924 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : rf1_0
2026-10-29 14:29:08,924 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.RepresentacaoFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoFarmacia] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoFarmacia] 
2026-10-29 14:29:08,936 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@3741ad39] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia] 
2026-10-29 14:29:08,940 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-10-29 14:29:08,942 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@13eb7aec] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.farmaciaMatriz] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.farmaciaMatriz] 
2026-10-29 14:29:08,944 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@610ce0a6] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante] 
2026-10-29 14:29:08,945 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : r1_0
2026-10-29 14:29:08,945 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.RepresentacaoFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.coUsuarioAcaoRepresentacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.deEmailRepresentante]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.deEnderecoIpRepresentacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.dtFimRepresentacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.dtInicioRepresentacao]
 |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.coCnpjEstabelecimentoLegado]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.coLicencaFuncionamento]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.coProcessoSei]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.coUsuarioAcaoFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.deEmailFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.deEnderecoIpFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.dhAtualizacaoFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.dhSubmissaoSlctoCadastro]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.dtVencimentoCnd]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.dtVencimentoLicencaFncmo]
 |  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.farmaciaMatriz]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.icEfetuaVenda]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.icEmissaoFiscalEletronico]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.icTipoAcao]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.noTitularidadeContaCredito]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuAgencia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuBanco]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuCnpjEstabelecimento]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuConta]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuDddAlternativo]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuDddPrincipal]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuDvAgencia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuDvConta]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuIbgeMunicipio]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuInscricaoInss]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuRegistroJuntaComercial]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuTelefoneAlternativo]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuTelefonePrincipal]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuTipoConta]
 |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.representacoes]
 |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.representacoesTecnica]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.sgUfFarmacia]
 |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.situacoes]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.tsFimVigenciaFarmacia]
 |  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.tsInicioVigenciaFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.icResponsavelLegal]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.icTipoAcao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.nuDddRepresentante]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.nuTelefoneRepresentante]
 |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.coUsuarioAcaoRepresentante]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.deEnderecoIpRepresentante]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.icTipoAcao]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.nuCpfRepresentante]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.tsFimVigenciaRprse]
 |  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.tsInicioVigenciaRprse]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.tsFimPeriodo]
 |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.tsInicioPeriodo]

2026-10-29 14:29:08,950 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (rf1 : br.com.caixa.sifap.entity.RepresentacaoFarmacia) {
          primaryTableReference : FAPDB001.dbo.FAPTB011_RPRTO_FARMACIA as rf1_0
          TableGroupJoins {
             join LazyTableGroup (f1 : br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia) {
              primaryTableReference : FAPDB001.dbo.FAPTB001_FARMACIA as f1_0
              TableGroupJoins {
                left  join LazyTableGroup (fm1 : br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.farmaciaMatriz) {
                }
              }
            }
             join LazyTableGroup (r1 : br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante) {
              primaryTableReference : FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA as r1_0
            }
          }
        }
      }
    }

2026-10-29 14:29:08,953 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.RepresentacaoFarmacia` entity using padded IN-list : 16 (16)
2026-10-29 14:29:08,953 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : rf1_0
2026-10-29 14:29:08,953 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.RepresentacaoFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoFarmacia] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoFarmacia] 
2026-10-29 14:29:08,954 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@beca546] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia] 
2026-10-29 14:29:08,954 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-10-29 14:29:08,954 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@65d55e7f] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.farmaciaMatriz] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.farmaciaMatriz] 
2026-10-29 14:29:08,954 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@455d9005] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante] 
2026-10-29 14:29:08,954 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : r1_0
2026-10-29 14:29:08,954 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.RepresentacaoFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.coUsuarioAcaoRepresentacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.deEmailRepresentante]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.deEnderecoIpRepresentacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.dtFimRepresentacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.dtInicioRepresentacao]
 |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.coCnpjEstabelecimentoLegado]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.coLicencaFuncionamento]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.coProcessoSei]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.coUsuarioAcaoFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.deEmailFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.deEnderecoIpFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.dhAtualizacaoFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.dhSubmissaoSlctoCadastro]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.dtVencimentoCnd]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.dtVencimentoLicencaFncmo]
 |  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.farmaciaMatriz]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.icEfetuaVenda]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.icEmissaoFiscalEletronico]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.icTipoAcao]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.noTitularidadeContaCredito]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuAgencia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuBanco]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuCnpjEstabelecimento]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuConta]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuDddAlternativo]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuDddPrincipal]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuDvAgencia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuDvConta]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuIbgeMunicipio]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuInscricaoInss]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuRegistroJuntaComercial]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuTelefoneAlternativo]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuTelefonePrincipal]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuTipoConta]
 |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.representacoes]
 |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.representacoesTecnica]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.sgUfFarmacia]
 |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.situacoes]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.tsFimVigenciaFarmacia]
 |  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.tsInicioVigenciaFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.icResponsavelLegal]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.icTipoAcao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.nuDddRepresentante]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.nuTelefoneRepresentante]
 |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.coUsuarioAcaoRepresentante]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.deEnderecoIpRepresentante]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.icTipoAcao]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.nuCpfRepresentante]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.tsFimVigenciaRprse]
 |  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.tsInicioVigenciaRprse]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.tsFimPeriodo]
 |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.tsInicioPeriodo]

2026-10-29 14:29:08,955 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (rf1 : br.com.caixa.sifap.entity.RepresentacaoFarmacia) {
          primaryTableReference : FAPDB001.dbo.FAPTB011_RPRTO_FARMACIA as rf1_0
          TableGroupJoins {
             join LazyTableGroup (f1 : br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia) {
              primaryTableReference : FAPDB001.dbo.FAPTB001_FARMACIA as f1_0
              TableGroupJoins {
                left  join LazyTableGroup (fm1 : br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.farmaciaMatriz) {
                }
              }
            }
             join LazyTableGroup (r1 : br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante) {
              primaryTableReference : FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA as r1_0
            }
          }
        }
      }
    }

2026-10-29 14:29:08,955 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.RepresentacaoFarmacia
2026-10-29 14:29:08,955 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_REPRESENTACAO_FARMACIA from FAPDB001.dbo.FAPTB011_RPRTO_FARMACIA where NU_REPRESENTACAO_FARMACIA=?
2026-10-29 14:29:08,955 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB011_RPRTO_FARMACIA (CO_USUARIO_ACAO_REPRESENTACAO,DE_EMAIL_REPRESENTANTE,DE_ENDERECO_IP_REPRESENTACAO,DT_FIM_REPRESENTACAO,DT_INICIO_REPRESENTACAO,NU_FARMACIA,IC_RESPONSAVEL_LEGAL,IC_TIPO_ACAO,NU_DDD_REPRESENTANTE,NU_TELEFONE_REPRESENTANTE,NU_REPRESENTANTE_FARMACIA,TS_FIM_PERIODO,TS_INICIO_PERIODO) values (?,?,?,?,?,?,?,?,?,?,?,?,?)
2026-10-29 14:29:08,955 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB011_RPRTO_FARMACIA set CO_USUARIO_ACAO_REPRESENTACAO=?,DE_EMAIL_REPRESENTANTE=?,DE_ENDERECO_IP_REPRESENTACAO=?,DT_FIM_REPRESENTACAO=?,DT_INICIO_REPRESENTACAO=?,NU_FARMACIA=?,IC_RESPONSAVEL_LEGAL=?,IC_TIPO_ACAO=?,NU_DDD_REPRESENTANTE=?,NU_TELEFONE_REPRESENTANTE=?,NU_REPRESENTANTE_FARMACIA=?,TS_FIM_PERIODO=?,TS_INICIO_PERIODO=? where NU_REPRESENTACAO_FARMACIA=?
2026-10-29 14:29:08,955 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB011_RPRTO_FARMACIA where NU_REPRESENTACAO_FARMACIA=?
2026-10-29 14:29:08,955 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : sf1_0
2026-10-29 14:29:08,955 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.SituacaoFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.SituacaoFarmacia] for NavigablePath [br.com.caixa.sifap.entity.SituacaoFarmacia] 
2026-10-29 14:29:08,955 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@5a3fcd4f] with identifierForTableGroup [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia] for NavigablePath [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia] 
2026-10-29 14:29:08,955 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-10-29 14:29:08,955 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@58bba6f2] with identifierForTableGroup [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.farmaciaMatriz] for NavigablePath [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.farmaciaMatriz] 
2026-10-29 14:29:08,956 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@1c5e5149] with identifierForTableGroup [br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao] for NavigablePath [br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao] 
2026-10-29 14:29:08,956 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : ts1_0
2026-10-29 14:29:08,956 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.SituacaoFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.coUsuarioAcaoSituacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.coUsuarioAlteracaoSituacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.deJustificativaSituacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.dhSituacaoFarmacia]
 |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.coCnpjEstabelecimentoLegado]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.coLicencaFuncionamento]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.coProcessoSei]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.coUsuarioAcaoFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.deEmailFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.deEnderecoIpFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.dhAtualizacaoFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.dhSubmissaoSlctoCadastro]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.dtVencimentoCnd]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.dtVencimentoLicencaFncmo]
 |  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.farmaciaMatriz]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.icEfetuaVenda]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.icEmissaoFiscalEletronico]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.icTipoAcao]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.noTitularidadeContaCredito]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuAgencia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuBanco]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuCnpjEstabelecimento]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuConta]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuDddAlternativo]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuDddPrincipal]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuDvAgencia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuDvConta]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuIbgeMunicipio]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuInscricaoInss]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuRegistroJuntaComercial]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuTelefoneAlternativo]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuTelefonePrincipal]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuTipoConta]
 |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.representacoes]
 |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.representacoesTecnica]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.sgUfFarmacia]
 |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.situacoes]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.tsFimVigenciaFarmacia]
 |  |  \-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.tsInicioVigenciaFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.icRenovacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.nuMotivoBloqueio]
 |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.nuTipoSituacao]
 |  \-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao]
 |  |  \-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao.deTipoSituacaoFarmacia]

2026-10-29 14:29:08,956 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (sf1 : br.com.caixa.sifap.entity.SituacaoFarmacia) {
          primaryTableReference : dbo.FAPTB002_SITUACAO_FARMACIA as sf1_0
          TableGroupJoins {
             join LazyTableGroup (f1 : br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia) {
              primaryTableReference : FAPDB001.dbo.FAPTB001_FARMACIA as f1_0
              TableGroupJoins {
                left  join LazyTableGroup (fm1 : br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.farmaciaMatriz) {
                }
              }
            }
             join LazyTableGroup (ts1 : br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao) {
              primaryTableReference : dbo.FAPTB003_TIPO_STCO_FARMACIA as ts1_0
            }
          }
        }
      }
    }

2026-10-29 14:29:08,956 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.SituacaoFarmacia` entity using padded IN-list : 16 (16)
2026-10-29 14:29:08,956 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : sf1_0
2026-10-29 14:29:08,956 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.SituacaoFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.SituacaoFarmacia] for NavigablePath [br.com.caixa.sifap.entity.SituacaoFarmacia] 
2026-10-29 14:29:08,956 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@a9eb5fc] with identifierForTableGroup [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia] for NavigablePath [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia] 
2026-10-29 14:29:08,956 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-10-29 14:29:08,957 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@42fba8ef] with identifierForTableGroup [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.farmaciaMatriz] for NavigablePath [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.farmaciaMatriz] 
2026-10-29 14:29:08,957 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@3ba9f655] with identifierForTableGroup [br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao] for NavigablePath [br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao] 
2026-10-29 14:29:08,957 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : ts1_0
2026-10-29 14:29:08,957 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.SituacaoFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.coUsuarioAcaoSituacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.coUsuarioAlteracaoSituacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.deJustificativaSituacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.dhSituacaoFarmacia]
 |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.coCnpjEstabelecimentoLegado]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.coLicencaFuncionamento]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.coProcessoSei]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.coUsuarioAcaoFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.deEmailFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.deEnderecoIpFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.dhAtualizacaoFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.dhSubmissaoSlctoCadastro]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.dtVencimentoCnd]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.dtVencimentoLicencaFncmo]
 |  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.farmaciaMatriz]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.icEfetuaVenda]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.icEmissaoFiscalEletronico]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.icTipoAcao]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.noTitularidadeContaCredito]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuAgencia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuBanco]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuCnpjEstabelecimento]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuConta]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuDddAlternativo]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuDddPrincipal]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuDvAgencia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuDvConta]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuIbgeMunicipio]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuInscricaoInss]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuRegistroJuntaComercial]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuTelefoneAlternativo]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuTelefonePrincipal]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuTipoConta]
 |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.representacoes]
 |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.representacoesTecnica]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.sgUfFarmacia]
 |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.situacoes]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.tsFimVigenciaFarmacia]
 |  |  \-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.tsInicioVigenciaFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.icRenovacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.nuMotivoBloqueio]
 |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.nuTipoSituacao]
 |  \-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao]
 |  |  \-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao.deTipoSituacaoFarmacia]

2026-10-29 14:29:08,957 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (sf1 : br.com.caixa.sifap.entity.SituacaoFarmacia) {
          primaryTableReference : dbo.FAPTB002_SITUACAO_FARMACIA as sf1_0
          TableGroupJoins {
             join LazyTableGroup (f1 : br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia) {
              primaryTableReference : FAPDB001.dbo.FAPTB001_FARMACIA as f1_0
              TableGroupJoins {
                left  join LazyTableGroup (fm1 : br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.farmaciaMatriz) {
                }
              }
            }
             join LazyTableGroup (ts1 : br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao) {
              primaryTableReference : dbo.FAPTB003_TIPO_STCO_FARMACIA as ts1_0
            }
          }
        }
      }
    }

2026-10-29 14:29:08,957 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.SituacaoFarmacia
2026-10-29 14:29:08,957 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_SITUACAO_FARMACIA from dbo.FAPTB002_SITUACAO_FARMACIA where NU_SITUACAO_FARMACIA=?
2026-10-29 14:29:08,957 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into dbo.FAPTB002_SITUACAO_FARMACIA (CO_USUARIO_ACAO_SITUACAO,CO_USUARIO_ALTERACAO_SITUACAO,DE_JUSTIFICATIVA_SITUACAO,DH_SITUACAO_FARMACIA,NU_FARMACIA,IC_RENOVACAO,NU_MOTIVO_BLOQUEIO,NU_TIPO_SITUACAO_FARMACIA) values (?,?,?,?,?,?,?,?)
2026-10-29 14:29:08,957 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update dbo.FAPTB002_SITUACAO_FARMACIA set CO_USUARIO_ACAO_SITUACAO=?,CO_USUARIO_ALTERACAO_SITUACAO=?,DE_JUSTIFICATIVA_SITUACAO=?,DH_SITUACAO_FARMACIA=?,NU_FARMACIA=?,IC_RENOVACAO=?,NU_MOTIVO_BLOQUEIO=?,NU_TIPO_SITUACAO_FARMACIA=? where NU_SITUACAO_FARMACIA=?
2026-10-29 14:29:08,957 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from dbo.FAPTB002_SITUACAO_FARMACIA where NU_SITUACAO_FARMACIA=?
2026-10-29 14:29:08,957 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : tdf1_0
2026-10-29 14:29:08,958 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.TipoDocumentoFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumentoFarmacia] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumentoFarmacia] 
2026-10-29 14:29:08,958 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.TipoDocumentoFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoFarmacia.coTipologiaDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoFarmacia.deTipoDocumentoFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoFarmacia.icClasseTipoDocumento]
 |  \-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoFarmacia.icDocumentoObrigatorio]

2026-10-29 14:29:08,958 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (tdf1 : br.com.caixa.sifap.entity.TipoDocumentoFarmacia) {
          primaryTableReference : dbo.FAPTB006_TIPO_DOCUMENTO as tdf1_0
        }
      }
    }

2026-10-29 14:29:08,958 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.TipoDocumentoFarmacia` entity using padded IN-list : 16 (16)
2026-10-29 14:29:08,958 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : tdf1_0
2026-10-29 14:29:08,958 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.TipoDocumentoFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumentoFarmacia] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumentoFarmacia] 
2026-10-29 14:29:08,958 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.TipoDocumentoFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoFarmacia.coTipologiaDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoFarmacia.deTipoDocumentoFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoFarmacia.icClasseTipoDocumento]
 |  \-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoFarmacia.icDocumentoObrigatorio]

2026-10-29 14:29:08,958 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (tdf1 : br.com.caixa.sifap.entity.TipoDocumentoFarmacia) {
          primaryTableReference : dbo.FAPTB006_TIPO_DOCUMENTO as tdf1_0
        }
      }
    }

2026-10-29 14:29:08,958 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.TipoDocumentoFarmacia
2026-10-29 14:29:08,958 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_TIPO_DOCUMENTO from dbo.FAPTB006_TIPO_DOCUMENTO where NU_TIPO_DOCUMENTO=?
2026-10-29 14:29:08,958 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into dbo.FAPTB006_TIPO_DOCUMENTO (CO_TIPOLOGIA_DOCUMENTO,DE_TIPO_DOCUMENTO_FARMACIA,IC_CLASSE_TIPO_DOCUMENTO,IC_DOCUMENTO_OBRIGATORIO,NU_TIPO_DOCUMENTO) values (?,?,?,?,?)
2026-10-29 14:29:08,958 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update dbo.FAPTB006_TIPO_DOCUMENTO set CO_TIPOLOGIA_DOCUMENTO=?,DE_TIPO_DOCUMENTO_FARMACIA=?,IC_CLASSE_TIPO_DOCUMENTO=?,IC_DOCUMENTO_OBRIGATORIO=? where NU_TIPO_DOCUMENTO=?
2026-10-29 14:29:08,958 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from dbo.FAPTB006_TIPO_DOCUMENTO where NU_TIPO_DOCUMENTO=?
2026-10-29 14:29:08,958 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : cd1_0
2026-10-29 14:29:08,958 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.ControleDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.ControleDocumento] for NavigablePath [br.com.caixa.sifap.entity.ControleDocumento] 
2026-10-29 14:29:08,958 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@1ca81974] with identifierForTableGroup [br.com.caixa.sifap.entity.ControleDocumento.farmacia] for NavigablePath [br.com.caixa.sifap.entity.ControleDocumento.farmacia] 
2026-10-29 14:29:08,958 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@177d710f] with identifierForTableGroup [br.com.caixa.sifap.entity.ControleDocumento.tipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.ControleDocumento.tipoDocumento] 
2026-10-29 14:29:08,959 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.ControleDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.dhEnvioDocumento]
 |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.ControleDocumento.farmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.icDocumentoLocal]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.nuFarmaceutico]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.nuFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.nuRepresentanteFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.nuTipoDocumento]
 |  \-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.ControleDocumento.tipoDocumento]

2026-10-29 14:29:08,959 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (cd1 : br.com.caixa.sifap.entity.ControleDocumento) {
          primaryTableReference : FAPDB001.dbo.FAPTB014_CONTROLE_DOCUMENTO as cd1_0
          TableGroupJoins {
            left  join LazyTableGroup (f1 : br.com.caixa.sifap.entity.ControleDocumento.farmacia) {
            }
            left  join LazyTableGroup (td1 : br.com.caixa.sifap.entity.ControleDocumento.tipoDocumento) {
            }
          }
        }
      }
    }

2026-10-29 14:29:08,959 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.ControleDocumento` entity using padded IN-list : 16 (16)
2026-10-29 14:29:08,959 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : cd1_0
2026-10-29 14:29:08,959 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.ControleDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.ControleDocumento] for NavigablePath [br.com.caixa.sifap.entity.ControleDocumento] 
2026-10-29 14:29:08,959 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@77f309f7] with identifierForTableGroup [br.com.caixa.sifap.entity.ControleDocumento.farmacia] for NavigablePath [br.com.caixa.sifap.entity.ControleDocumento.farmacia] 
2026-10-29 14:29:08,959 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@43ed0a88] with identifierForTableGroup [br.com.caixa.sifap.entity.ControleDocumento.tipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.ControleDocumento.tipoDocumento] 
2026-10-29 14:29:08,959 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.ControleDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.dhEnvioDocumento]
 |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.ControleDocumento.farmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.icDocumentoLocal]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.nuFarmaceutico]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.nuFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.nuRepresentanteFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.nuTipoDocumento]
 |  \-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.ControleDocumento.tipoDocumento]

2026-10-29 14:29:08,959 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (cd1 : br.com.caixa.sifap.entity.ControleDocumento) {
          primaryTableReference : FAPDB001.dbo.FAPTB014_CONTROLE_DOCUMENTO as cd1_0
          TableGroupJoins {
            left  join LazyTableGroup (f1 : br.com.caixa.sifap.entity.ControleDocumento.farmacia) {
            }
            left  join LazyTableGroup (td1 : br.com.caixa.sifap.entity.ControleDocumento.tipoDocumento) {
            }
          }
        }
      }
    }

2026-10-29 14:29:08,959 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.ControleDocumento
2026-10-29 14:29:08,959 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_CONTROLE_DOCUMENTO from FAPDB001.dbo.FAPTB014_CONTROLE_DOCUMENTO where NU_CONTROLE_DOCUMENTO=?
2026-10-29 14:29:08,959 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB014_CONTROLE_DOCUMENTO (DH_ENVIO_DOCUMENTO,NU_FARMACIA,IC_DOCUMENTO_LOCAL,NU_FARMACEUTICO,NU_REPRESENTANTE_FARMACIA,NU_TIPO_DOCUMENTO) values (?,?,?,?,?,?)
2026-10-29 14:29:08,959 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB014_CONTROLE_DOCUMENTO set DH_ENVIO_DOCUMENTO=?,NU_FARMACIA=?,IC_DOCUMENTO_LOCAL=?,NU_FARMACEUTICO=?,NU_REPRESENTANTE_FARMACIA=?,NU_TIPO_DOCUMENTO=? where NU_CONTROLE_DOCUMENTO=?
2026-10-29 14:29:08,959 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB014_CONTROLE_DOCUMENTO where NU_CONTROLE_DOCUMENTO=?
2026-10-29 14:29:08,959 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : had1_0
2026-10-29 14:29:08,959 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.HistoricoAnaliseDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento] for NavigablePath [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento] 
2026-10-29 14:29:08,961 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardVirtualTableGroup(br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.{id})] with identifierForTableGroup [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.{id}] for NavigablePath [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.{id}] 
2026-10-29 14:29:08,962 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@7bf89b1b] with identifierForTableGroup [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.tipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.tipoDocumento] 
2026-10-29 14:29:08,963 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.coCpfCnpjDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.coUsuarioAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.deJustificativa]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.dhAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.dhFimAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.icAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.icCpfCnpjDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.icUsuarioAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.nuIdentificadorDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.nuTipoDocumento]
 |  \-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.tipoDocumento]

2026-10-29 14:29:08,963 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (had1 : br.com.caixa.sifap.entity.HistoricoAnaliseDocumento) {
          primaryTableReference : FAPDB001.dbo.FAPTB119_HSTRO_ANLSE_DOCUMENTO as had1_0
          TableGroupJoins {
             join StandardVirtualTableGroup (null : br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.{id}) {
              primaryTableReference : FAPDB001.dbo.FAPTB119_HSTRO_ANLSE_DOCUMENTO as had1_0
            }
            left  join LazyTableGroup (td1 : br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.tipoDocumento) {
            }
          }
        }
      }
    }

2026-10-29 14:29:08,963 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.HistoricoAnaliseDocumento` entity using padded IN-list : 16 (16)
2026-10-29 14:29:08,964 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : had1_0
2026-10-29 14:29:08,964 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.HistoricoAnaliseDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento] for NavigablePath [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento] 
2026-10-29 14:29:08,964 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardVirtualTableGroup(br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.{id})] with identifierForTableGroup [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.{id}] for NavigablePath [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.{id}] 
2026-10-29 14:29:08,964 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@1ebd70fc] with identifierForTableGroup [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.tipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.tipoDocumento] 
2026-10-29 14:29:08,964 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.coCpfCnpjDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.coUsuarioAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.deJustificativa]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.dhAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.dhFimAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.icAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.icCpfCnpjDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.icUsuarioAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.nuIdentificadorDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.nuTipoDocumento]
 |  \-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.tipoDocumento]

2026-10-29 14:29:08,964 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (had1 : br.com.caixa.sifap.entity.HistoricoAnaliseDocumento) {
          primaryTableReference : FAPDB001.dbo.FAPTB119_HSTRO_ANLSE_DOCUMENTO as had1_0
          TableGroupJoins {
             join StandardVirtualTableGroup (null : br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.{id}) {
              primaryTableReference : FAPDB001.dbo.FAPTB119_HSTRO_ANLSE_DOCUMENTO as had1_0
            }
            left  join LazyTableGroup (td1 : br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.tipoDocumento) {
            }
          }
        }
      }
    }

2026-10-29 14:29:08,964 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.HistoricoAnaliseDocumento
2026-10-29 14:29:08,964 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_SQNCL_ANALISE_DOCUMENTO, TS_INICIO_PERIODO from FAPDB001.dbo.FAPTB119_HSTRO_ANLSE_DOCUMENTO where NU_SQNCL_ANALISE_DOCUMENTO=? and TS_INICIO_PERIODO=?
2026-10-29 14:29:08,964 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB119_HSTRO_ANLSE_DOCUMENTO (CO_CPF_CNPJ_DOCUMENTO,CO_USUARIO_ANALISE_DOCUMENTO,DE_JUSTIFICATIVA,DH_ANALISE_DOCUMENTO,DH_FIM_ANALISE_DOCUMENTO,IC_ANALISE_DOCUMENTO,IC_CPF_CNPJ_DOCUMENTO,IC_USUARIO_ANALISE_DOCUMENTO,NU_IDENTIFICADOR_DOCUMENTO,NU_TIPO_DOCUMENTO,NU_SQNCL_ANALISE_DOCUMENTO,TS_INICIO_PERIODO) values (?,?,?,?,?,?,?,?,?,?,?,?)
2026-10-29 14:29:08,964 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB119_HSTRO_ANLSE_DOCUMENTO set CO_CPF_CNPJ_DOCUMENTO=?,CO_USUARIO_ANALISE_DOCUMENTO=?,DE_JUSTIFICATIVA=?,DH_ANALISE_DOCUMENTO=?,DH_FIM_ANALISE_DOCUMENTO=?,IC_ANALISE_DOCUMENTO=?,IC_CPF_CNPJ_DOCUMENTO=?,IC_USUARIO_ANALISE_DOCUMENTO=?,NU_IDENTIFICADOR_DOCUMENTO=?,NU_TIPO_DOCUMENTO=? where NU_SQNCL_ANALISE_DOCUMENTO=? and TS_INICIO_PERIODO=?
2026-10-29 14:29:08,964 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB119_HSTRO_ANLSE_DOCUMENTO where NU_SQNCL_ANALISE_DOCUMENTO=? and TS_INICIO_PERIODO=?
2026-10-29 14:29:08,964 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : rt1_0
2026-10-29 14:29:08,964 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.RepresentacaoTecnica)] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoTecnica] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoTecnica] 
2026-10-29 14:29:08,965 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@71c063b9] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico] 
2026-10-29 14:29:08,965 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-10-29 14:29:08,965 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@5788e253] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia] 
2026-10-29 14:29:08,965 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f2_0
2026-10-29 14:29:08,965 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@6b59c028] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.farmaciaMatriz] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.farmaciaMatriz] 
2026-10-29 14:29:08,965 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.RepresentacaoTecnica]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.coUsuarioAcaoRepresentacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.deEnderecoIpRepresentacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.dtFimRepresentacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.dtInicioRepresentacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.dtVencimentoCertidaoRegularidade]
 |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.coIdentificacaoFarmaceutico]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.coUsuarioAcaoFarmaceutico]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.deEnderecoIpFarmaceutico]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.dtVencimentoRegistro]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.icTipoAcao]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.nuCpfFarmaceutico]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.sgIdentificacaoFarmaceutico]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.tsFimVigenciaFarmaceutico]
 |  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.tsInicioVigenciaFrmco]
 |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.coCnpjEstabelecimentoLegado]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.coLicencaFuncionamento]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.coProcessoSei]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.coUsuarioAcaoFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.deEmailFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.deEnderecoIpFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.dhAtualizacaoFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.dhSubmissaoSlctoCadastro]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.dtVencimentoCnd]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.dtVencimentoLicencaFncmo]
 |  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.farmaciaMatriz]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.icEfetuaVenda]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.icEmissaoFiscalEletronico]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.icTipoAcao]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.noTitularidadeContaCredito]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuAgencia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuBanco]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuCnpjEstabelecimento]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuConta]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuDddAlternativo]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuDddPrincipal]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuDvAgencia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuDvConta]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuIbgeMunicipio]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuInscricaoInss]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuRegistroJuntaComercial]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuTelefoneAlternativo]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuTelefonePrincipal]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuTipoConta]
 |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.representacoes]
 |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.representacoesTecnica]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.sgUfFarmacia]
 |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.situacoes]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.tsFimVigenciaFarmacia]
 |  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.tsInicioVigenciaFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.icTipoAcao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.tsFimPeriodo]
 |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.tsInicioPeriodo]

2026-10-29 14:29:08,965 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (rt1 : br.com.caixa.sifap.entity.RepresentacaoTecnica) {
          primaryTableReference : FAPDB001.dbo.FAPTB005_RPRSE_TECNICA as rt1_0
          TableGroupJoins {
             join LazyTableGroup (f1 : br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico) {
              primaryTableReference : FAPDB001.dbo.FAPTB004_FARMACEUTICO as f1_0
            }
             join LazyTableGroup (f2 : br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia) {
              primaryTableReference : FAPDB001.dbo.FAPTB001_FARMACIA as f2_0
              TableGroupJoins {
                left  join LazyTableGroup (fm1 : br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.farmaciaMatriz) {
                }
              }
            }
          }
        }
      }
    }

2026-10-29 14:29:08,966 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.RepresentacaoTecnica` entity using padded IN-list : 16 (16)
2026-10-29 14:29:08,966 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : rt1_0
2026-10-29 14:29:08,966 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.RepresentacaoTecnica)] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoTecnica] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoTecnica] 
2026-10-29 14:29:08,966 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@6d51a687] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico] 
2026-10-29 14:29:08,966 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-10-29 14:29:08,966 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@434f9ba7] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia] 
2026-10-29 14:29:08,966 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f2_0
2026-10-29 14:29:08,966 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@65f5c3f2] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.farmaciaMatriz] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.farmaciaMatriz] 
2026-10-29 14:29:08,966 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.RepresentacaoTecnica]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.coUsuarioAcaoRepresentacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.deEnderecoIpRepresentacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.dtFimRepresentacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.dtInicioRepresentacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.dtVencimentoCertidaoRegularidade]
 |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.coIdentificacaoFarmaceutico]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.coUsuarioAcaoFarmaceutico]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.deEnderecoIpFarmaceutico]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.dtVencimentoRegistro]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.icTipoAcao]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.nuCpfFarmaceutico]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.sgIdentificacaoFarmaceutico]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.tsFimVigenciaFarmaceutico]
 |  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.tsInicioVigenciaFrmco]
 |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.coCnpjEstabelecimentoLegado]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.coLicencaFuncionamento]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.coProcessoSei]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.coUsuarioAcaoFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.deEmailFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.deEnderecoIpFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.dhAtualizacaoFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.dhSubmissaoSlctoCadastro]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.dtVencimentoCnd]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.dtVencimentoLicencaFncmo]
 |  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.farmaciaMatriz]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.icEfetuaVenda]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.icEmissaoFiscalEletronico]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.icTipoAcao]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.noTitularidadeContaCredito]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuAgencia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuBanco]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuCnpjEstabelecimento]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuConta]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuDddAlternativo]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuDddPrincipal]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuDvAgencia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuDvConta]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuIbgeMunicipio]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuInscricaoInss]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuRegistroJuntaComercial]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuTelefoneAlternativo]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuTelefonePrincipal]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuTipoConta]
 |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.representacoes]
 |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.representacoesTecnica]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.sgUfFarmacia]
 |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.situacoes]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.tsFimVigenciaFarmacia]
 |  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.tsInicioVigenciaFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.icTipoAcao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.tsFimPeriodo]
 |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.tsInicioPeriodo]

2026-10-29 14:29:08,967 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (rt1 : br.com.caixa.sifap.entity.RepresentacaoTecnica) {
          primaryTableReference : FAPDB001.dbo.FAPTB005_RPRSE_TECNICA as rt1_0
          TableGroupJoins {
             join LazyTableGroup (f1 : br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico) {
              primaryTableReference : FAPDB001.dbo.FAPTB004_FARMACEUTICO as f1_0
            }
             join LazyTableGroup (f2 : br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia) {
              primaryTableReference : FAPDB001.dbo.FAPTB001_FARMACIA as f2_0
              TableGroupJoins {
                left  join LazyTableGroup (fm1 : br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.farmaciaMatriz) {
                }
              }
            }
          }
        }
      }
    }

2026-10-29 14:29:08,967 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.RepresentacaoTecnica
2026-10-29 14:29:08,967 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_REPRESENTACAO_TECNICA from FAPDB001.dbo.FAPTB005_RPRSE_TECNICA where NU_REPRESENTACAO_TECNICA=?
2026-10-29 14:29:08,967 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB005_RPRSE_TECNICA (CO_USUARIO_ACAO_REPRESENTACAO,DE_ENDERECO_IP_REPRESENTACAO,DT_FIM_REPRESENTACAO,DT_INICIO_REPRESENTACAO,DT_VNCMO_CERTIDAO_REGULARIDADE,NU_FARMACEUTICO,NU_FARMACIA,IC_TIPO_ACAO,TS_FIM_PERIODO,TS_INICIO_PERIODO) values (?,?,?,?,?,?,?,?,?,?)
2026-10-29 14:29:08,967 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB005_RPRSE_TECNICA set CO_USUARIO_ACAO_REPRESENTACAO=?,DE_ENDERECO_IP_REPRESENTACAO=?,DT_FIM_REPRESENTACAO=?,DT_INICIO_REPRESENTACAO=?,DT_VNCMO_CERTIDAO_REGULARIDADE=?,NU_FARMACEUTICO=?,NU_FARMACIA=?,IC_TIPO_ACAO=?,TS_FIM_PERIODO=?,TS_INICIO_PERIODO=? where NU_REPRESENTACAO_TECNICA=?
2026-10-29 14:29:08,967 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB005_RPRSE_TECNICA where NU_REPRESENTACAO_TECNICA=?
2026-10-29 14:29:08,967 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : iv1_0
2026-10-29 14:29:08,967 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.ItemValidacao)] with identifierForTableGroup [br.com.caixa.sifap.entity.ItemValidacao] for NavigablePath [br.com.caixa.sifap.entity.ItemValidacao] 
2026-10-29 14:29:08,967 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.ItemValidacao]
 |  \-BasicFetch [br.com.caixa.sifap.entity.ItemValidacao.noItemValidado]

2026-10-29 14:29:08,967 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (iv1 : br.com.caixa.sifap.entity.ItemValidacao) {
          primaryTableReference : FAPDB001.dbo.FAPTB016_ITEM_VALIDACAO as iv1_0
        }
      }
    }

2026-10-29 14:29:08,967 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.ItemValidacao` entity using padded IN-list : 16 (16)
2026-10-29 14:29:08,967 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : iv1_0
2026-10-29 14:29:08,967 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.ItemValidacao)] with identifierForTableGroup [br.com.caixa.sifap.entity.ItemValidacao] for NavigablePath [br.com.caixa.sifap.entity.ItemValidacao] 
2026-10-29 14:29:08,967 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.ItemValidacao]
 |  \-BasicFetch [br.com.caixa.sifap.entity.ItemValidacao.noItemValidado]

2026-10-29 14:29:08,967 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (iv1 : br.com.caixa.sifap.entity.ItemValidacao) {
          primaryTableReference : FAPDB001.dbo.FAPTB016_ITEM_VALIDACAO as iv1_0
        }
      }
    }

2026-10-29 14:29:08,967 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.ItemValidacao
2026-10-29 14:29:08,968 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_ITEM_VALIDACAO from FAPDB001.dbo.FAPTB016_ITEM_VALIDACAO where NU_ITEM_VALIDACAO=?
2026-10-29 14:29:08,968 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB016_ITEM_VALIDACAO (NO_ITEM_VALIDADO,NU_ITEM_VALIDACAO) values (?,?)
2026-10-29 14:29:08,968 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB016_ITEM_VALIDACAO set NO_ITEM_VALIDADO=? where NU_ITEM_VALIDACAO=?
2026-10-29 14:29:08,968 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB016_ITEM_VALIDACAO where NU_ITEM_VALIDACAO=?
2026-10-29 14:29:08,968 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : tsf1_0
2026-10-29 14:29:08,968 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.TipoSituacaoFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoSituacaoFarmacia] for NavigablePath [br.com.caixa.sifap.entity.TipoSituacaoFarmacia] 
2026-10-29 14:29:08,968 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.TipoSituacaoFarmacia]
 |  \-BasicFetch [br.com.caixa.sifap.entity.TipoSituacaoFarmacia.deTipoSituacaoFarmacia]

2026-10-29 14:29:08,968 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (tsf1 : br.com.caixa.sifap.entity.TipoSituacaoFarmacia) {
          primaryTableReference : dbo.FAPTB003_TIPO_STCO_FARMACIA as tsf1_0
        }
      }
    }

2026-10-29 14:29:08,968 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.TipoSituacaoFarmacia` entity using padded IN-list : 16 (16)
2026-10-29 14:29:08,968 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : tsf1_0
2026-10-29 14:29:08,968 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.TipoSituacaoFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoSituacaoFarmacia] for NavigablePath [br.com.caixa.sifap.entity.TipoSituacaoFarmacia] 
2026-10-29 14:29:08,968 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.TipoSituacaoFarmacia]
 |  \-BasicFetch [br.com.caixa.sifap.entity.TipoSituacaoFarmacia.deTipoSituacaoFarmacia]

2026-10-29 14:29:08,968 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (tsf1 : br.com.caixa.sifap.entity.TipoSituacaoFarmacia) {
          primaryTableReference : dbo.FAPTB003_TIPO_STCO_FARMACIA as tsf1_0
        }
      }
    }

2026-10-29 14:29:08,968 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.TipoSituacaoFarmacia
2026-10-29 14:29:08,968 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_TIPO_SITUACAO_FARMACIA from dbo.FAPTB003_TIPO_STCO_FARMACIA where NU_TIPO_SITUACAO_FARMACIA=?
2026-10-29 14:29:08,968 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into dbo.FAPTB003_TIPO_STCO_FARMACIA (DE_TIPO_SITUACAO_FARMACIA,NU_TIPO_SITUACAO_FARMACIA) values (?,?)
2026-10-29 14:29:08,968 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update dbo.FAPTB003_TIPO_STCO_FARMACIA set DE_TIPO_SITUACAO_FARMACIA=? where NU_TIPO_SITUACAO_FARMACIA=?
2026-10-29 14:29:08,968 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from dbo.FAPTB003_TIPO_STCO_FARMACIA where NU_TIPO_SITUACAO_FARMACIA=?
2026-10-29 14:29:08,968 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-10-29 14:29:08,968 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia] for NavigablePath [br.com.caixa.sifap.entity.Farmacia] 
2026-10-29 14:29:08,968 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@2af033a4] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.farmaciaMatriz] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.farmaciaMatriz] 
2026-10-29 14:29:08,969 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.Farmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.coCnpjEstabelecimentoLegado]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.coLicencaFuncionamento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.coProcessoSei]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.coUsuarioAcaoFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.deEmailFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.deEnderecoIpFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.dhAtualizacaoFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.dhSubmissaoSlctoCadastro]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.dtVencimentoCnd]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.dtVencimentoLicencaFncmo]
 |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.Farmacia.farmaciaMatriz]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.icEfetuaVenda]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.icEmissaoFiscalEletronico]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.icTipoAcao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.noTitularidadeContaCredito]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuAgencia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuBanco]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuCnpjEstabelecimento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuConta]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuDddAlternativo]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuDddPrincipal]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuDvAgencia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuDvConta]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuIbgeMunicipio]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuInscricaoInss]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuRegistroJuntaComercial]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuTelefoneAlternativo]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuTelefonePrincipal]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuTipoConta]
 |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.Farmacia.representacoes]
 |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.sgUfFarmacia]
 |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.Farmacia.situacoes]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.tsFimVigenciaFarmacia]
 |  \-BasicFetch [br.com.caixa.sifap.entity.Farmacia.tsInicioVigenciaFarmacia]

2026-10-29 14:29:08,969 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (f1 : br.com.caixa.sifap.entity.Farmacia) {
          primaryTableReference : FAPDB001.dbo.FAPTB001_FARMACIA as f1_0
          TableGroupJoins {
            left  join LazyTableGroup (fm1 : br.com.caixa.sifap.entity.Farmacia.farmaciaMatriz) {
            }
          }
        }
      }
    }

2026-10-29 14:29:08,969 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.Farmacia` entity using padded IN-list : 16 (16)
2026-10-29 14:29:08,969 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-10-29 14:29:08,969 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia] for NavigablePath [br.com.caixa.sifap.entity.Farmacia] 
2026-10-29 14:29:08,969 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@ee43757] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.farmaciaMatriz] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.farmaciaMatriz] 
2026-10-29 14:29:08,969 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.Farmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.coCnpjEstabelecimentoLegado]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.coLicencaFuncionamento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.coProcessoSei]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.coUsuarioAcaoFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.deEmailFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.deEnderecoIpFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.dhAtualizacaoFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.dhSubmissaoSlctoCadastro]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.dtVencimentoCnd]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.dtVencimentoLicencaFncmo]
 |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.Farmacia.farmaciaMatriz]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.icEfetuaVenda]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.icEmissaoFiscalEletronico]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.icTipoAcao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.noTitularidadeContaCredito]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuAgencia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuBanco]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuCnpjEstabelecimento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuConta]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuDddAlternativo]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuDddPrincipal]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuDvAgencia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuDvConta]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuIbgeMunicipio]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuInscricaoInss]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuRegistroJuntaComercial]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuTelefoneAlternativo]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuTelefonePrincipal]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuTipoConta]
 |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.Farmacia.representacoes]
 |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.sgUfFarmacia]
 |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.Farmacia.situacoes]
 |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.tsFimVigenciaFarmacia]
 |  \-BasicFetch [br.com.caixa.sifap.entity.Farmacia.tsInicioVigenciaFarmacia]

2026-10-29 14:29:08,970 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (f1 : br.com.caixa.sifap.entity.Farmacia) {
          primaryTableReference : FAPDB001.dbo.FAPTB001_FARMACIA as f1_0
          TableGroupJoins {
            left  join LazyTableGroup (fm1 : br.com.caixa.sifap.entity.Farmacia.farmaciaMatriz) {
            }
          }
        }
      }
    }

2026-10-29 14:29:08,970 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.Farmacia
2026-10-29 14:29:08,970 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_FARMACIA from FAPDB001.dbo.FAPTB001_FARMACIA where NU_FARMACIA=?
2026-10-29 14:29:08,970 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB001_FARMACIA (CO_CNPJ_ESTABELECIMENTO_LEGADO,CO_LICENCA_FUNCIONAMENTO,CO_PROCESSO_SEI,CO_USUARIO_ACAO_FARMACIA,DE_EMAIL_FARMACIA,DE_ENDERECO_IP_FARMACIA,DH_ATUALIZACAO_FARMACIA,DH_SUBMISSAO_SLCTO_CADASTRO,DT_VENCIMENTO_CND,DT_VNCMO_LICENCA_FNCMO,NU_FARMACIA_MATRIZ,IC_EFETUA_VENDA,IC_EMISSAO_FISCAL_ELETRONICO,IC_TIPO_ACAO,NO_TITULARIDADE_CONTA_CREDITO,NU_AGENCIA,NU_BANCO,NU_CNPJ_ESTABELECIMENTO,NU_CONTA,NU_DDD_ALTERNATIVO,NU_DDD_PRINCIPAL,NU_DV_AGENCIA,NU_DV_CONTA,NU_IBGE_MUNICIPIO,NU_INSCRICAO_INSS,NU_REGISTRO_JUNTA_COMERCIAL,NU_TELEFONE_ALTERNATIVO,NU_TELEFONE_PRINCIPAL,NU_TIPO_CONTA,SG_UF_FARMACIA) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
2026-10-29 14:29:08,970 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB001_FARMACIA set CO_CNPJ_ESTABELECIMENTO_LEGADO=?,CO_LICENCA_FUNCIONAMENTO=?,CO_PROCESSO_SEI=?,CO_USUARIO_ACAO_FARMACIA=?,DE_EMAIL_FARMACIA=?,DE_ENDERECO_IP_FARMACIA=?,DH_ATUALIZACAO_FARMACIA=?,DH_SUBMISSAO_SLCTO_CADASTRO=?,DT_VENCIMENTO_CND=?,DT_VNCMO_LICENCA_FNCMO=?,NU_FARMACIA_MATRIZ=?,IC_EFETUA_VENDA=?,IC_EMISSAO_FISCAL_ELETRONICO=?,IC_TIPO_ACAO=?,NO_TITULARIDADE_CONTA_CREDITO=?,NU_AGENCIA=?,NU_BANCO=?,NU_CNPJ_ESTABELECIMENTO=?,NU_CONTA=?,NU_DDD_ALTERNATIVO=?,NU_DDD_PRINCIPAL=?,NU_DV_AGENCIA=?,NU_DV_CONTA=?,NU_IBGE_MUNICIPIO=?,NU_INSCRICAO_INSS=?,NU_REGISTRO_JUNTA_COMERCIAL=?,NU_TELEFONE_ALTERNATIVO=?,NU_TELEFONE_PRINCIPAL=?,NU_TIPO_CONTA=?,SG_UF_FARMACIA=? where NU_FARMACIA=?
2026-10-29 14:29:08,970 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB001_FARMACIA where NU_FARMACIA=?
2026-10-29 14:29:08,970 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : rf1_0
2026-10-29 14:29:08,970 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.RepresentanteFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentanteFarmacia] for NavigablePath [br.com.caixa.sifap.entity.RepresentanteFarmacia] 
2026-10-29 14:29:08,970 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.RepresentanteFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.coUsuarioAcaoRepresentante]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.deEnderecoIpRepresentante]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.icTipoAcao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.nuCpfRepresentante]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.tsFimVigenciaRprse]
 |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.tsInicioVigenciaRprse]

2026-10-29 14:29:08,970 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (rf1 : br.com.caixa.sifap.entity.RepresentanteFarmacia) {
          primaryTableReference : FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA as rf1_0
        }
      }
    }

2026-10-29 14:29:08,970 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.RepresentanteFarmacia` entity using padded IN-list : 16 (16)
2026-10-29 14:29:08,970 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : rf1_0
2026-10-29 14:29:08,970 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.RepresentanteFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentanteFarmacia] for NavigablePath [br.com.caixa.sifap.entity.RepresentanteFarmacia] 
2026-10-29 14:29:08,970 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.RepresentanteFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.coUsuarioAcaoRepresentante]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.deEnderecoIpRepresentante]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.icTipoAcao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.nuCpfRepresentante]
 |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.tsFimVigenciaRprse]
 |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.tsInicioVigenciaRprse]

2026-10-29 14:29:08,970 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (rf1 : br.com.caixa.sifap.entity.RepresentanteFarmacia) {
          primaryTableReference : FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA as rf1_0
        }
      }
    }

2026-10-29 14:29:08,971 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.RepresentanteFarmacia
2026-10-29 14:29:08,971 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_REPRESENTANTE_FARMACIA from FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA where NU_REPRESENTANTE_FARMACIA=?
2026-10-29 14:29:08,971 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA (CO_USUARIO_ACAO_REPRESENTANTE,DE_ENDERECO_IP_REPRESENTANTE,IC_TIPO_ACAO,NU_CPF_REPRESENTANTE,TS_FIM_VIGENCIA_RPRSE,TS_INICIO_VIGENCIA_RPRSE) values (?,?,?,?,?,?)
2026-10-29 14:29:08,971 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA set CO_USUARIO_ACAO_REPRESENTANTE=?,DE_ENDERECO_IP_REPRESENTANTE=?,IC_TIPO_ACAO=?,NU_CPF_REPRESENTANTE=?,TS_FIM_VIGENCIA_RPRSE=?,TS_INICIO_VIGENCIA_RPRSE=? where NU_REPRESENTANTE_FARMACIA=?
2026-10-29 14:29:08,971 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA where NU_REPRESENTANTE_FARMACIA=?
2026-10-29 14:29:08,971 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : ad1_0
2026-10-29 14:29:08,971 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.AnaliseDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento] 
2026-10-29 14:29:08,971 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@4152fe7] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento] 
2026-10-29 14:29:08,971 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : td1_0
2026-10-29 14:29:08,971 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.AnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.coCpfCnpjDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.coUsuarioAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.deJustificativa]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.dhAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.dhFimAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.icAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.icCpfCnpjDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.icUsuarioAnaliseDocumento]
 |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.nuIdentificadorDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.nuTipoDocumento]
 |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento.coTipologiaDocumento]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento.deTipoDocumentoFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento.icClasseTipoDocumento]
 |  |  \-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento.icDocumentoObrigatorio]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tsFimPeriodo]
 |  \-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tsInicioPeriodo]

2026-10-29 14:29:08,971 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (ad1 : br.com.caixa.sifap.entity.AnaliseDocumento) {
          primaryTableReference : FAPDB001.dbo.FAPTB019_ANALISE_DOCUMENTO as ad1_0
          TableGroupJoins {
            left  join LazyTableGroup (td1 : br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento) {
              primaryTableReference : FAPDB001.dbo.FAPTB006_TIPO_DOCUMENTO as td1_0
            }
          }
        }
      }
    }

2026-10-29 14:29:08,971 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.AnaliseDocumento` entity using padded IN-list : 16 (16)
2026-10-29 14:29:08,971 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : ad1_0
2026-10-29 14:29:08,971 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.AnaliseDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento] 
2026-10-29 14:29:08,971 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@1cdd4c2e] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento] 
2026-10-29 14:29:08,971 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : td1_0
2026-10-29 14:29:08,972 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.AnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.coCpfCnpjDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.coUsuarioAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.deJustificativa]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.dhAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.dhFimAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.icAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.icCpfCnpjDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.icUsuarioAnaliseDocumento]
 |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.nuIdentificadorDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.nuTipoDocumento]
 |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento.coTipologiaDocumento]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento.deTipoDocumentoFarmacia]
 |  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento.icClasseTipoDocumento]
 |  |  \-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento.icDocumentoObrigatorio]
 |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tsFimPeriodo]
 |  \-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tsInicioPeriodo]

2026-10-29 14:29:08,972 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (ad1 : br.com.caixa.sifap.entity.AnaliseDocumento) {
          primaryTableReference : FAPDB001.dbo.FAPTB019_ANALISE_DOCUMENTO as ad1_0
          TableGroupJoins {
            left  join LazyTableGroup (td1 : br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento) {
              primaryTableReference : FAPDB001.dbo.FAPTB006_TIPO_DOCUMENTO as td1_0
            }
          }
        }
      }
    }

2026-10-29 14:29:08,972 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.AnaliseDocumento
2026-10-29 14:29:08,972 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_SQNCL_ANALISE_DOCUMENTO from FAPDB001.dbo.FAPTB019_ANALISE_DOCUMENTO where NU_SQNCL_ANALISE_DOCUMENTO=?
2026-10-29 14:29:08,972 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB019_ANALISE_DOCUMENTO (CO_CPF_CNPJ_DOCUMENTO,CO_USUARIO_ANALISE_DOCUMENTO,DE_JUSTIFICATIVA,DH_ANALISE_DOCUMENTO,DH_FIM_ANALISE_DOCUMENTO,IC_ANALISE_DOCUMENTO,IC_CPF_CNPJ_DOCUMENTO,IC_USUARIO_ANALISE_DOCUMENTO,NU_IDENTIFICADOR_DOCUMENTO,NU_TIPO_DOCUMENTO) values (?,?,?,?,?,?,?,?,?,?)
2026-10-29 14:29:08,972 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB019_ANALISE_DOCUMENTO set CO_CPF_CNPJ_DOCUMENTO=?,CO_USUARIO_ANALISE_DOCUMENTO=?,DE_JUSTIFICATIVA=?,DH_ANALISE_DOCUMENTO=?,DH_FIM_ANALISE_DOCUMENTO=?,IC_ANALISE_DOCUMENTO=?,IC_CPF_CNPJ_DOCUMENTO=?,IC_USUARIO_ANALISE_DOCUMENTO=?,NU_IDENTIFICADOR_DOCUMENTO=?,NU_TIPO_DOCUMENTO=? where NU_SQNCL_ANALISE_DOCUMENTO=?
2026-10-29 14:29:08,972 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB019_ANALISE_DOCUMENTO where NU_SQNCL_ANALISE_DOCUMENTO=?
2026-10-29 14:29:08,972 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : sm1_0
2026-10-29 14:29:08,972 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.SqlMappings)] with identifierForTableGroup [br.com.caixa.sifap.entity.SqlMappings] for NavigablePath [br.com.caixa.sifap.entity.SqlMappings] 
2026-10-29 14:29:08,972 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.SqlMappings]

2026-10-29 14:29:08,972 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (sm1 : br.com.caixa.sifap.entity.SqlMappings) {
          primaryTableReference : SqlMappings as sm1_0
        }
      }
    }

2026-10-29 14:29:08,972 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.SqlMappings` entity using padded IN-list : 16 (16)
2026-10-29 14:29:08,972 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : sm1_0
2026-10-29 14:29:08,972 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.SqlMappings)] with identifierForTableGroup [br.com.caixa.sifap.entity.SqlMappings] for NavigablePath [br.com.caixa.sifap.entity.SqlMappings] 
2026-10-29 14:29:08,972 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.SqlMappings]

2026-10-29 14:29:08,972 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (sm1 : br.com.caixa.sifap.entity.SqlMappings) {
          primaryTableReference : SqlMappings as sm1_0
        }
      }
    }

2026-10-29 14:29:08,972 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.SqlMappings
2026-10-29 14:29:08,972 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select id from SqlMappings where id=?
2026-10-29 14:29:08,972 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into SqlMappings default values
2026-10-29 14:29:08,972 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from SqlMappings where id=?
2026-10-29 14:29:08,972 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : fa1_0
2026-10-29 14:29:08,973 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.FarmaciaAuxiliar)] with identifierForTableGroup [br.com.caixa.sifap.entity.FarmaciaAuxiliar] for NavigablePath [br.com.caixa.sifap.entity.FarmaciaAuxiliar] 
2026-10-29 14:29:08,973 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.FarmaciaAuxiliar]
 |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.coCnpjEstabelecimentoLegado]
 |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.coCnpjMatrizLegado]
 |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.deMotivoBloqueio]
 |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.dhAtualizacaoCadastro]
 |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.dtBloqueio]
 |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.icAtualizacaoCadastro]
 |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.nuCnpjEstabelecimento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.nuCnpjMatriz]
 |  \-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.nuMotivoBloqueio]

2026-10-29 14:29:08,973 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (fa1 : br.com.caixa.sifap.entity.FarmaciaAuxiliar) {
          primaryTableReference : FAPDB001.dbo.FAPTB012_FARMACIA_AUXILIAR as fa1_0
        }
      }
    }

2026-10-29 14:29:08,973 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.FarmaciaAuxiliar` entity using padded IN-list : 16 (16)
2026-10-29 14:29:08,973 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : fa1_0
2026-10-29 14:29:08,973 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.FarmaciaAuxiliar)] with identifierForTableGroup [br.com.caixa.sifap.entity.FarmaciaAuxiliar] for NavigablePath [br.com.caixa.sifap.entity.FarmaciaAuxiliar] 
2026-10-29 14:29:08,973 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.FarmaciaAuxiliar]
 |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.coCnpjEstabelecimentoLegado]
 |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.coCnpjMatrizLegado]
 |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.deMotivoBloqueio]
 |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.dhAtualizacaoCadastro]
 |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.dtBloqueio]
 |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.icAtualizacaoCadastro]
 |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.nuCnpjEstabelecimento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.nuCnpjMatriz]
 |  \-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.nuMotivoBloqueio]

2026-10-29 14:29:08,973 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (fa1 : br.com.caixa.sifap.entity.FarmaciaAuxiliar) {
          primaryTableReference : FAPDB001.dbo.FAPTB012_FARMACIA_AUXILIAR as fa1_0
        }
      }
    }

2026-10-29 14:29:08,973 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.FarmaciaAuxiliar
2026-10-29 14:29:08,973 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_FARMACIA_AUXILIAR from FAPDB001.dbo.FAPTB012_FARMACIA_AUXILIAR where NU_FARMACIA_AUXILIAR=?
2026-10-29 14:29:08,973 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB012_FARMACIA_AUXILIAR (CO_CNPJ_ESTABELECIMENTO_LEGADO,CO_CNPJ_MATRIZ_LEGADO,DE_MOTIVO_BLOQUEIO,DH_ATUALIZACAO_CADASTRO,DT_BLOQUEIO,IC_ATUALIZACAO_CADASTRO,NU_CNPJ_ESTABELECIMENTO,NU_CNPJ_MATRIZ,NU_MOTIVO_BLOQUEIO) values (?,?,?,?,?,?,?,?,?)
2026-10-29 14:29:08,973 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB012_FARMACIA_AUXILIAR set CO_CNPJ_ESTABELECIMENTO_LEGADO=?,CO_CNPJ_MATRIZ_LEGADO=?,DE_MOTIVO_BLOQUEIO=?,DH_ATUALIZACAO_CADASTRO=?,DT_BLOQUEIO=?,IC_ATUALIZACAO_CADASTRO=?,NU_CNPJ_ESTABELECIMENTO=?,NU_CNPJ_MATRIZ=?,NU_MOTIVO_BLOQUEIO=? where NU_FARMACIA_AUXILIAR=?
2026-10-29 14:29:08,973 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB012_FARMACIA_AUXILIAR where NU_FARMACIA_AUXILIAR=?
2026-10-29 14:29:08,973 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : td1_0
2026-10-29 14:29:08,973 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.TipoDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumento] 
2026-10-29 14:29:08,973 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.TipoDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumento.coTipologiaDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumento.deTipoDocumentoFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumento.icClasseTipoDocumento]
 |  \-BasicFetch [br.com.caixa.sifap.entity.TipoDocumento.icDocumentoObrigatorio]

2026-10-29 14:29:08,973 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (td1 : br.com.caixa.sifap.entity.TipoDocumento) {
          primaryTableReference : FAPDB001.dbo.FAPTB006_TIPO_DOCUMENTO as td1_0
        }
      }
    }

2026-10-29 14:29:08,974 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.TipoDocumento` entity using padded IN-list : 16 (16)
2026-10-29 14:29:08,974 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : td1_0
2026-10-29 14:29:08,974 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.TipoDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumento] 
2026-10-29 14:29:08,974 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.TipoDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumento.coTipologiaDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumento.deTipoDocumentoFarmacia]
 |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumento.icClasseTipoDocumento]
 |  \-BasicFetch [br.com.caixa.sifap.entity.TipoDocumento.icDocumentoObrigatorio]

2026-10-29 14:29:08,974 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (td1 : br.com.caixa.sifap.entity.TipoDocumento) {
          primaryTableReference : FAPDB001.dbo.FAPTB006_TIPO_DOCUMENTO as td1_0
        }
      }
    }

2026-10-29 14:29:08,974 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.TipoDocumento
2026-10-29 14:29:08,974 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_TIPO_DOCUMENTO from FAPDB001.dbo.FAPTB006_TIPO_DOCUMENTO where NU_TIPO_DOCUMENTO=?
2026-10-29 14:29:08,974 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB006_TIPO_DOCUMENTO (CO_TIPOLOGIA_DOCUMENTO,DE_TIPO_DOCUMENTO_FARMACIA,IC_CLASSE_TIPO_DOCUMENTO,IC_DOCUMENTO_OBRIGATORIO,NU_TIPO_DOCUMENTO) values (?,?,?,?,?)
2026-10-29 14:29:08,974 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB006_TIPO_DOCUMENTO set CO_TIPOLOGIA_DOCUMENTO=?,DE_TIPO_DOCUMENTO_FARMACIA=?,IC_CLASSE_TIPO_DOCUMENTO=?,IC_DOCUMENTO_OBRIGATORIO=? where NU_TIPO_DOCUMENTO=?
2026-10-29 14:29:08,974 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB006_TIPO_DOCUMENTO where NU_TIPO_DOCUMENTO=?
2026-10-29 14:29:08,974 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : iad1_0
2026-10-29 14:29:08,974 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.ItemAnaliseDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.ItemAnaliseDocumento] for NavigablePath [br.com.caixa.sifap.entity.ItemAnaliseDocumento] 
2026-10-29 14:29:08,974 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@5f65a933] with identifierForTableGroup [br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento] for NavigablePath [br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento] 
2026-10-29 14:29:08,974 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@5bfccbb0] with identifierForTableGroup [br.com.caixa.sifap.entity.ItemAnaliseDocumento.tipoDocumentoItemValidacao] for NavigablePath [br.com.caixa.sifap.entity.ItemAnaliseDocumento.tipoDocumentoItemValidacao] 
2026-10-29 14:29:08,974 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.ItemAnaliseDocumento]
 |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.dhItemAnalise]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.icItemPendente]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.nuMatricula]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.nuSqnclAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.nuTipoDcmtoItmVldco]
 |  \-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.ItemAnaliseDocumento.tipoDocumentoItemValidacao]

2026-10-29 14:29:08,974 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (iad1 : br.com.caixa.sifap.entity.ItemAnaliseDocumento) {
          primaryTableReference : FAPDB001.dbo.FAPTB018_ITEM_ANALISE_DCMTO as iad1_0
          TableGroupJoins {
            left  join LazyTableGroup (ad1 : br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento) {
            }
            left  join LazyTableGroup (tdiv1 : br.com.caixa.sifap.entity.ItemAnaliseDocumento.tipoDocumentoItemValidacao) {
            }
          }
        }
      }
    }

2026-10-29 14:29:08,974 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.ItemAnaliseDocumento` entity using padded IN-list : 16 (16)
2026-10-29 14:29:08,974 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : iad1_0
2026-10-29 14:29:08,974 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.ItemAnaliseDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.ItemAnaliseDocumento] for NavigablePath [br.com.caixa.sifap.entity.ItemAnaliseDocumento] 
2026-10-29 14:29:08,974 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@14dc45ab] with identifierForTableGroup [br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento] for NavigablePath [br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento] 
2026-10-29 14:29:08,975 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@1520e4c1] with identifierForTableGroup [br.com.caixa.sifap.entity.ItemAnaliseDocumento.tipoDocumentoItemValidacao] for NavigablePath [br.com.caixa.sifap.entity.ItemAnaliseDocumento.tipoDocumentoItemValidacao] 
2026-10-29 14:29:08,975 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.ItemAnaliseDocumento]
 |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.dhItemAnalise]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.icItemPendente]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.nuMatricula]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.nuSqnclAnaliseDocumento]
 |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.nuTipoDcmtoItmVldco]
 |  \-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.ItemAnaliseDocumento.tipoDocumentoItemValidacao]

2026-10-29 14:29:08,975 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (iad1 : br.com.caixa.sifap.entity.ItemAnaliseDocumento) {
          primaryTableReference : FAPDB001.dbo.FAPTB018_ITEM_ANALISE_DCMTO as iad1_0
          TableGroupJoins {
            left  join LazyTableGroup (ad1 : br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento) {
            }
            left  join LazyTableGroup (tdiv1 : br.com.caixa.sifap.entity.ItemAnaliseDocumento.tipoDocumentoItemValidacao) {
            }
          }
        }
      }
    }

2026-10-29 14:29:08,975 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.ItemAnaliseDocumento
2026-10-29 14:29:08,975 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_ITEM_ANALISE_DOCUMENTO from FAPDB001.dbo.FAPTB018_ITEM_ANALISE_DCMTO where NU_ITEM_ANALISE_DOCUMENTO=?
2026-10-29 14:29:08,975 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB018_ITEM_ANALISE_DCMTO (DH_ITEM_ANALISE,IC_ITEM_PENDENTE,NU_MATRICULA,NU_SQNCL_ANALISE_DOCUMENTO,NU_TIPO_DCMTO_ITM_VLDCO) values (?,?,?,?,?)
2026-10-29 14:29:08,975 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB018_ITEM_ANALISE_DCMTO set DH_ITEM_ANALISE=?,IC_ITEM_PENDENTE=?,NU_MATRICULA=?,NU_SQNCL_ANALISE_DOCUMENTO=?,NU_TIPO_DCMTO_ITM_VLDCO=? where NU_ITEM_ANALISE_DOCUMENTO=?
2026-10-29 14:29:08,975 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB018_ITEM_ANALISE_DCMTO where NU_ITEM_ANALISE_DOCUMENTO=?
2026-10-29 14:29:08,975 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : tdiv1_0
2026-10-29 14:29:08,975 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.TipoDocumentoItemValidacao)] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao] 
2026-10-29 14:29:08,975 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@f8b43d0] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.itemValidacao] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.itemValidacao] 
2026-10-29 14:29:08,975 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@53858ab7] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.tipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.tipoDocumento] 
2026-10-29 14:29:08,975 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.deJustificativaPadrao]
 |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.itemValidacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.nuItemValidacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.nuTipoDocumento]
 |  \-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.tipoDocumento]

2026-10-29 14:29:08,975 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (tdiv1 : br.com.caixa.sifap.entity.TipoDocumentoItemValidacao) {
          primaryTableReference : FAPDB001.dbo.FAPTB017_TIPO_DCMTO_ITM_VLDCO as tdiv1_0
          TableGroupJoins {
            left  join LazyTableGroup (iv1 : br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.itemValidacao) {
            }
            left  join LazyTableGroup (td1 : br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.tipoDocumento) {
            }
          }
        }
      }
    }

2026-10-29 14:29:08,975 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.TipoDocumentoItemValidacao` entity using padded IN-list : 16 (16)
2026-10-29 14:29:08,975 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : tdiv1_0
2026-10-29 14:29:08,975 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.TipoDocumentoItemValidacao)] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao] 
2026-10-29 14:29:08,975 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@485cee23] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.itemValidacao] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.itemValidacao] 
2026-10-29 14:29:08,975 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@1983815] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.tipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.tipoDocumento] 
2026-10-29 14:29:08,975 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.deJustificativaPadrao]
 |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.itemValidacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.nuItemValidacao]
 |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.nuTipoDocumento]
 |  \-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.tipoDocumento]

2026-10-29 14:29:08,975 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (tdiv1 : br.com.caixa.sifap.entity.TipoDocumentoItemValidacao) {
          primaryTableReference : FAPDB001.dbo.FAPTB017_TIPO_DCMTO_ITM_VLDCO as tdiv1_0
          TableGroupJoins {
            left  join LazyTableGroup (iv1 : br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.itemValidacao) {
            }
            left  join LazyTableGroup (td1 : br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.tipoDocumento) {
            }
          }
        }
      }
    }

2026-10-29 14:29:08,976 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.TipoDocumentoItemValidacao
2026-10-29 14:29:08,976 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_TIPO_DCMTO_ITM_VLDCO from FAPDB001.dbo.FAPTB017_TIPO_DCMTO_ITM_VLDCO where NU_TIPO_DCMTO_ITM_VLDCO=?
2026-10-29 14:29:08,976 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB017_TIPO_DCMTO_ITM_VLDCO (DE_JUSTIFICATIVA_PADRAO,NU_ITEM_VALIDACAO,NU_TIPO_DOCUMENTO,NU_TIPO_DCMTO_ITM_VLDCO) values (?,?,?,?)
2026-10-29 14:29:08,976 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB017_TIPO_DCMTO_ITM_VLDCO set DE_JUSTIFICATIVA_PADRAO=?,NU_ITEM_VALIDACAO=?,NU_TIPO_DOCUMENTO=? where NU_TIPO_DCMTO_ITM_VLDCO=?
2026-10-29 14:29:08,976 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB017_TIPO_DCMTO_ITM_VLDCO where NU_TIPO_DCMTO_ITM_VLDCO=?
2026-10-29 14:29:08,978 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : s1_0
2026-10-29 14:29:08,979 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.OneToManyTableGroup@2c75234a] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.situacoes] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.situacoes] 
2026-10-29 14:29:08,980 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmacia.situacoes.{element})] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}] 
2026-10-29 14:29:08,983 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@200e1943] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.farmacia] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.farmacia] 
2026-10-29 14:29:08,984 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@70b3de46] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.tipoSituacao] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.tipoSituacao] 
2026-10-29 14:29:08,984 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : ts1_0
2026-10-29 14:29:08,988 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-CollectionDomainResult [br.com.caixa.sifap.entity.Farmacia.situacoes]

2026-10-29 14:29:08,988 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        OneToManyTableGroup (s1 : br.com.caixa.sifap.entity.Farmacia.situacoes) {
          primaryTableReference : dbo.FAPTB002_SITUACAO_FARMACIA as s1_0
          TableGroupJoins {
            left  join LazyTableGroup (f1 : br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.farmacia) {
            }
            left  join LazyTableGroup (ts1 : br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.tipoSituacao) {
              primaryTableReference : dbo.FAPTB003_TIPO_STCO_FARMACIA as ts1_0
            }
          }
        }
      }
    }

2026-10-29 14:29:08,988 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Using IN-predicate batch fetching strategy for collection `br.com.caixa.sifap.entity.Farmacia.situacoes` : 16 (16)
2026-10-29 14:29:08,989 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : s1_0
2026-10-29 14:29:08,989 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.OneToManyTableGroup@7ffdeb9b] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.situacoes] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.situacoes] 
2026-10-29 14:29:08,989 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmacia.situacoes.{element})] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}] 
2026-10-29 14:29:08,989 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@11d1a6e0] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.farmacia] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.farmacia] 
2026-10-29 14:29:08,989 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@33565043] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.tipoSituacao] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.tipoSituacao] 
2026-10-29 14:29:08,989 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : ts1_0
2026-10-29 14:29:08,989 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-CollectionDomainResult [br.com.caixa.sifap.entity.Farmacia.situacoes]

2026-10-29 14:29:08,990 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        OneToManyTableGroup (s1 : br.com.caixa.sifap.entity.Farmacia.situacoes) {
          primaryTableReference : dbo.FAPTB002_SITUACAO_FARMACIA as s1_0
          TableGroupJoins {
            left  join LazyTableGroup (f1 : br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.farmacia) {
            }
            left  join LazyTableGroup (ts1 : br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.tipoSituacao) {
              primaryTableReference : dbo.FAPTB003_TIPO_STCO_FARMACIA as ts1_0
            }
          }
        }
      }
    }

2026-10-29 14:29:08,990 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Static SQL for collection: br.com.caixa.sifap.entity.Farmacia.situacoes
2026-10-29 14:29:08,990 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : ia1_0
2026-10-29 14:29:08,990 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.OneToManyTableGroup@7b46f645] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise] 
2026-10-29 14:29:08,990 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element})] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}] 
2026-10-29 14:29:08,990 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@4bcd6991] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.analiseDocumento] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.analiseDocumento] 
2026-10-29 14:29:08,990 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@5d0399c5] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.tipoDocumentoItemValidacao] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.tipoDocumentoItemValidacao] 
2026-10-29 14:29:08,990 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-CollectionDomainResult [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise]

2026-10-29 14:29:08,990 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        OneToManyTableGroup (ia1 : br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise) {
          primaryTableReference : FAPDB001.dbo.FAPTB018_ITEM_ANALISE_DCMTO as ia1_0
          TableGroupJoins {
            left  join LazyTableGroup (ad1 : br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.analiseDocumento) {
            }
            left  join LazyTableGroup (tdiv1 : br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.tipoDocumentoItemValidacao) {
            }
          }
        }
      }
    }

2026-10-29 14:29:08,990 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Using IN-predicate batch fetching strategy for collection `br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise` : 16 (16)
2026-10-29 14:29:08,990 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : ia1_0
2026-10-29 14:29:08,990 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.OneToManyTableGroup@260bb1b3] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise] 
2026-10-29 14:29:08,990 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element})] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}] 
2026-10-29 14:29:08,991 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@2cfa3c37] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.analiseDocumento] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.analiseDocumento] 
2026-10-29 14:29:08,991 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@504e347f] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.tipoDocumentoItemValidacao] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.tipoDocumentoItemValidacao] 
2026-10-29 14:29:08,991 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-CollectionDomainResult [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise]

2026-10-29 14:29:08,991 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        OneToManyTableGroup (ia1 : br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise) {
          primaryTableReference : FAPDB001.dbo.FAPTB018_ITEM_ANALISE_DCMTO as ia1_0
          TableGroupJoins {
            left  join LazyTableGroup (ad1 : br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.analiseDocumento) {
            }
            left  join LazyTableGroup (tdiv1 : br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.tipoDocumentoItemValidacao) {
            }
          }
        }
      }
    }

2026-10-29 14:29:08,991 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Static SQL for collection: br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise
2026-10-29 14:29:08,991 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : rt1_0
2026-10-29 14:29:08,991 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.OneToManyTableGroup@7d38993] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica] 
2026-10-29 14:29:08,991 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element})] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}] 
2026-10-29 14:29:08,991 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@4004aa4c] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmaceutico] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmaceutico] 
2026-10-29 14:29:08,991 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-10-29 14:29:08,991 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@5b93d3ae] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmacia] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmacia] 
2026-10-29 14:29:08,992 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-CollectionDomainResult [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica]

2026-10-29 14:29:08,992 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        OneToManyTableGroup (rt1 : br.com.caixa.sifap.entity.Farmacia.representacoesTecnica) {
          primaryTableReference : FAPDB001.dbo.FAPTB005_RPRSE_TECNICA as rt1_0
          TableGroupJoins {
            left  join LazyTableGroup (f1 : br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmaceutico) {
              primaryTableReference : FAPDB001.dbo.FAPTB004_FARMACEUTICO as f1_0
            }
            left  join LazyTableGroup (f2 : br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmacia) {
            }
          }
        }
      }
    }

2026-10-29 14:29:09,003 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Using IN-predicate batch fetching strategy for collection `br.com.caixa.sifap.entity.Farmacia.representacoesTecnica` : 16 (16)
2026-10-29 14:29:09,004 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : rt1_0
2026-10-29 14:29:09,004 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.OneToManyTableGroup@5bb04ca6] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica] 
2026-10-29 14:29:09,004 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element})] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}] 
2026-10-29 14:29:09,004 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@22914e52] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmaceutico] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmaceutico] 
2026-10-29 14:29:09,004 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-10-29 14:29:09,004 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@4b908d63] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmacia] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmacia] 
2026-10-29 14:29:09,004 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-CollectionDomainResult [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica]

2026-10-29 14:29:09,004 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        OneToManyTableGroup (rt1 : br.com.caixa.sifap.entity.Farmacia.representacoesTecnica) {
          primaryTableReference : FAPDB001.dbo.FAPTB005_RPRSE_TECNICA as rt1_0
          TableGroupJoins {
            left  join LazyTableGroup (f1 : br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmaceutico) {
              primaryTableReference : FAPDB001.dbo.FAPTB004_FARMACEUTICO as f1_0
            }
            left  join LazyTableGroup (f2 : br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmacia) {
            }
          }
        }
      }
    }

2026-10-29 14:29:09,004 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Static SQL for collection: br.com.caixa.sifap.entity.Farmacia.representacoesTecnica
2026-10-29 14:29:09,005 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : r1_0
2026-10-29 14:29:09,005 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.OneToManyTableGroup@489d62fc] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoes] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoes] 
2026-10-29 14:29:09,005 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmacia.representacoes.{element})] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}] 
2026-10-29 14:29:09,005 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@28ff74cd] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.farmacia] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.farmacia] 
2026-10-29 14:29:09,005 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@683c4875] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.representante] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.representante] 
2026-10-29 14:29:09,005 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : r2_0
2026-10-29 14:29:09,005 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-CollectionDomainResult [br.com.caixa.sifap.entity.Farmacia.representacoes]

2026-10-29 14:29:09,005 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        OneToManyTableGroup (r1 : br.com.caixa.sifap.entity.Farmacia.representacoes) {
          primaryTableReference : FAPDB001.dbo.FAPTB011_RPRTO_FARMACIA as r1_0
          TableGroupJoins {
            left  join LazyTableGroup (f1 : br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.farmacia) {
            }
            left  join LazyTableGroup (r2 : br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.representante) {
              primaryTableReference : FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA as r2_0
            }
          }
        }
      }
    }

2026-10-29 14:29:09,005 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Using IN-predicate batch fetching strategy for collection `br.com.caixa.sifap.entity.Farmacia.representacoes` : 16 (16)
2026-10-29 14:29:09,005 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : r1_0
2026-10-29 14:29:09,005 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.OneToManyTableGroup@40fa6d35] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoes] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoes] 
2026-10-29 14:29:09,005 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmacia.representacoes.{element})] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}] 
2026-10-29 14:29:09,005 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@5c3ce75e] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.farmacia] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.farmacia] 
2026-10-29 14:29:09,005 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@6abba20] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.representante] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.representante] 
2026-10-29 14:29:09,005 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : r2_0
2026-10-29 14:29:09,006 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-CollectionDomainResult [br.com.caixa.sifap.entity.Farmacia.representacoes]

2026-10-29 14:29:09,006 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        OneToManyTableGroup (r1 : br.com.caixa.sifap.entity.Farmacia.representacoes) {
          primaryTableReference : FAPDB001.dbo.FAPTB011_RPRTO_FARMACIA as r1_0
          TableGroupJoins {
            left  join LazyTableGroup (f1 : br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.farmacia) {
            }
            left  join LazyTableGroup (r2 : br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.representante) {
              primaryTableReference : FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA as r2_0
            }
          }
        }
      }
    }

2026-10-29 14:29:09,006 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Static SQL for collection: br.com.caixa.sifap.entity.Farmacia.representacoes
2026-10-29 14:29:09,040 DEBUG [org.hib.typ.spi.TypeConfiguration$Scope] (JPA Startup Thread) Scoping TypeConfiguration [org.hibernate.type.spi.TypeConfiguration@70d16858] to SessionFactoryImplementor [org.hibernate.internal.SessionFactoryImpl@48329d01]
2026-10-29 14:29:09,041 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating InstantiationResultMappingMemento for JPA ConstructorResult(br.com.caixa.sifap.dto.FarmaciaSituacaoDTO) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-10-29 14:29:09,042 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(nuSituacaoFarmacia) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-10-29 14:29:09,043 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(nuTipoSituacaoFarmacia) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-10-29 14:29:09,043 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(descricaoSituacao) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-10-29 14:29:09,043 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(nuFarmacia) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-10-29 14:29:09,043 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(dhSituacaoFarmacia) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-10-29 14:29:09,043 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(analistaBloqueio) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-10-29 14:29:09,043 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(cnpj) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-10-29 14:29:09,043 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(uf) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-10-29 14:29:09,043 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(municipio) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-10-29 14:29:09,043 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(etapa) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-10-29 14:29:09,043 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(ultimoAnalista) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-10-29 14:29:09,045 DEBUG [org.hib.que.nam.NamedObjectRepository] (JPA Startup Thread) Checking 0 named HQL queries
2026-10-29 14:29:09,045 DEBUG [org.hib.que.nam.NamedObjectRepository] (JPA Startup Thread) Checking 0 named SQL queries
2026-10-29 14:29:09,046 DEBUG [org.hib.too.sch.spi.SchemaManagementToolCoordinator] (JPA Startup Thread) No schema actions specified for contributor `orm`; doing nothing
2026-10-29 14:29:09,046 DEBUG [org.hib.too.sch.spi.SchemaManagementToolCoordinator] (JPA Startup Thread) No actions found; doing nothing
2026-10-29 14:29:09,046 DEBUG [io.qua.hib.orm.run.ser.QuarkusRuntimeInitDialectFactory] (JPA Startup Thread) Persistence unit <default>: Skipping database version check; expecting database version to be at least 13.0.0
2026-10-29 14:29:09,046 DEBUG [org.hib.int.SessionFactoryImpl] (JPA Startup Thread) Instantiated SessionFactory
2026-10-29 14:29:09,133 DEBUG [io.net.uti.NetUtil] (vert.x-eventloop-thread-0) -Djava.net.preferIPv4Stack: false
2026-10-29 14:29:09,136 DEBUG [io.net.uti.NetUtil] (vert.x-eventloop-thread-0) -Djava.net.preferIPv6Addresses: false
2026-10-29 14:29:09,138 DEBUG [io.net.uti.NetUtilInitializations] (vert.x-eventloop-thread-0) Loopback interface: lo (lo, 0:0:0:0:0:0:0:1%lo)
2026-10-29 14:29:09,138 DEBUG [io.net.uti.NetUtil] (vert.x-eventloop-thread-0) /proc/sys/net/core/somaxconn: 4096
2026-10-29 14:29:09,182 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-0) -Dio.netty.allocator.numHeapArenas: 4
2026-10-29 14:29:09,182 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-0) -Dio.netty.allocator.numDirectArenas: 4
2026-10-29 14:29:09,182 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-0) -Dio.netty.allocator.pageSize: 8192
2026-10-29 14:29:09,182 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-0) -Dio.netty.allocator.maxOrder: 3
2026-10-29 14:29:09,182 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-0) -Dio.netty.allocator.chunkSize: 65536
2026-10-29 14:29:09,182 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-0) -Dio.netty.allocator.smallCacheSize: 256
2026-10-29 14:29:09,182 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-0) -Dio.netty.allocator.normalCacheSize: 64
2026-10-29 14:29:09,182 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-0) -Dio.netty.allocator.maxCachedBufferCapacity: 32768
2026-10-29 14:29:09,182 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-0) -Dio.netty.allocator.cacheTrimInterval: 8192
2026-10-29 14:29:09,182 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-0) -Dio.netty.allocator.cacheTrimIntervalMillis: 0
2026-10-29 14:29:09,182 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-0) -Dio.netty.allocator.useCacheForAllThreads: false
2026-10-29 14:29:09,182 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-0) -Dio.netty.allocator.maxCachedByteBuffersPerChunk: 1023
2026-10-29 14:29:09,182 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-0) -Dio.netty.allocator.disableCacheFinalizersForFastThreadLocalThreads: false
2026-10-29 14:29:09,314 DEBUG [io.net.buf.ByteBufUtil] (vert.x-eventloop-thread-0) -Dio.netty.allocator.type: pooled
2026-10-29 14:29:09,314 DEBUG [io.net.buf.ByteBufUtil] (vert.x-eventloop-thread-0) -Dio.netty.threadLocalDirectBufferSize: 0
2026-10-29 14:29:09,314 DEBUG [io.net.buf.ByteBufUtil] (vert.x-eventloop-thread-0) -Dio.netty.maxThreadLocalCharBufferSize: 16384
2026-10-29 14:29:09,316 DEBUG [io.net.boo.ChannelInitializerExtensions] (vert.x-eventloop-thread-0) -Dio.netty.bootstrap.extensions: null
2026-10-29 14:29:09,407 INFO  [io.quarkus] (main) sifap-centralizadora 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.15.7) started in 4.946s. Listening on: http://0.0.0.0:8080
2026-10-29 14:29:09,408 INFO  [io.quarkus] (main) Profile prod activated. 
2026-10-29 14:29:09,408 INFO  [io.quarkus] (main) Installed features: [agroal, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-h2, jdbc-mssql, narayana-jta, oidc, rest, rest-client, rest-client-jackson, rest-jackson, security, smallrye-context-propagation, smallrye-openapi, vertx]
2026-10-29 14:29:09,514 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:41011a4d0efb710c519f47e8e10000011a4d0e, Subject:CN=Microsoft TLS G2 RSA CA OCSP 02 External OCSP Responder 2026-09-, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 02, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:2334543075, Valid from:9/29/26, 7:04?PM, Valid until:3/28/27, 7:04?PM
2026-10-29 14:29:09,516 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:4101551763ec7dc43a7351f09a000001551763, Subject:CN=*.azureserviceprofiler.net, O=Microsoft Corporation, L=Redmond, ST=WA, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 02, O=Microsoft Corporation, C=US, Key type:RSA, Length:2048, Cert Id:2069525155, Valid from:10/29/26, 2:04?AM, Valid until:2/6/27, 1:04?AM
2026-10-29 14:29:09,516 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:330000000c4964a16f44203b2200000000000c, Subject:CN=Microsoft TLS G2 RSA CA OCSP 02, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:4116687715, Valid from:8/1/25, 5:03?PM, Valid until:6/3/29, 5:03?PM
2026-10-29 14:29:09,517 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:b0c6b2c466917b04773c647d4afc0c8, Subject:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3081933591, Valid from:5/20/25, 9:00?PM, Valid until:6/19/29, 8:59?PM
2026-10-29 14:29:09,519 DEBUG [jdk.eve.security] (reactor-http-epoll-1) ValidationChain: 1136084297, 3081933591, 4116687715, 2069525155
2026-10-29 14:29:09,524 DEBUG [jdk.eve.security] (reactor-http-epoll-1)  TLSHandshake: agent.azureserviceprofiler.net:443, TLSv1.3, TLS_AES_256_GCM_SHA384, 2069525155
2026-10-29 14:29:13,399 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-0) -Dio.netty.recycler.maxCapacityPerThread: 4096
2026-10-29 14:29:13,399 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-0) -Dio.netty.recycler.ratio: 8
2026-10-29 14:29:13,399 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-0) -Dio.netty.recycler.chunkSize: 32
2026-10-29 14:29:13,399 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-0) -Dio.netty.recycler.blocking: false
2026-10-29 14:29:13,399 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-0) -Dio.netty.recycler.batchFastThreadLocalOnly: true
2026-10-29 14:29:13,406 DEBUG [io.net.buf.AbstractByteBuf] (vert.x-eventloop-thread-0) -Dio.netty.buffer.checkAccessible: true
2026-10-29 14:29:13,406 DEBUG [io.net.buf.AbstractByteBuf] (vert.x-eventloop-thread-0) -Dio.netty.buffer.checkBounds: true
2026-10-29 14:29:13,407 DEBUG [io.net.uti.ResourceLeakDetectorFactory] (vert.x-eventloop-thread-0) Loaded default ResourceLeakDetector: io.netty.util.ResourceLeakDetector@3c98bedc
2026-10-29 14:29:13,535 DEBUG [io.qua.ver.htt.run.sec.HttpAuthenticator] (vert.x-eventloop-thread-0) BasicAuthenticationMechanism has been enabled because no other authentication mechanism has been
detected, but there is no IdentityProvider based on username and password. Please use
one of supported extensions if you plan to use the mechanism.
For more information go to the https://quarkus.io/guides/security-basic-authentication-howto.

2026-10-29 14:29:13,641 INFO  [io.qua.htt.access-log] (executor-thread-1) 25.2.20.1 - - [29/Oct/2026:14:29:13 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:29:13,641 INFO  [io.qua.htt.access-log] (executor-thread-2) 25.2.20.1 - - [29/Oct/2026:14:29:13 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:29:23,372 INFO  [io.qua.htt.access-log] (executor-thread-1) 25.2.20.1 - - [29/Oct/2026:14:29:23 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:29:23,372 INFO  [io.qua.htt.access-log] (executor-thread-2) 25.2.20.1 - - [29/Oct/2026:14:29:23 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:29:33,372 INFO  [io.qua.htt.access-log] (executor-thread-1) 25.2.20.1 - - [29/Oct/2026:14:29:33 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:29:33,372 INFO  [io.qua.htt.access-log] (executor-thread-2) 25.2.20.1 - - [29/Oct/2026:14:29:33 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:29:43,373 INFO  [io.qua.htt.access-log] (executor-thread-2) 25.2.20.1 - - [29/Oct/2026:14:29:43 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:29:43,373 INFO  [io.qua.htt.access-log] (executor-thread-1) 25.2.20.1 - - [29/Oct/2026:14:29:43 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:29:53,372 INFO  [io.qua.htt.access-log] (executor-thread-1) 25.2.20.1 - - [29/Oct/2026:14:29:53 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:29:53,372 INFO  [io.qua.htt.access-log] (executor-thread-2) 25.2.20.1 - - [29/Oct/2026:14:29:53 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:30:03,211 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:4901179cdee33c8aeb09b9934f000001179cde, Subject:CN=Microsoft TLS G2 RSA CA OCSP 10 External OCSP Responder 2026-09-, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 10, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:2354293734, Valid from:9/29/26, 7:03?PM, Valid until:3/28/27, 7:03?PM
2026-10-29 14:30:03,213 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:4901360047ac082594f498e70f000001360047, Subject:CN=in.applicationinsights.azure.com, O=Microsoft Corporation, L=Redmond, ST=WA, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 10, O=Microsoft Corporation, C=US, Key type:RSA, Length:2048, Cert Id:3454775792, Valid from:10/13/26, 9:56?PM, Valid until:1/21/27, 8:56?PM
2026-10-29 14:30:03,213 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:330000000f33206537ee42ae4f00000000000f, Subject:CN=Microsoft TLS G2 RSA CA OCSP 10, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:517509489, Valid from:8/1/25, 5:03?PM, Valid until:6/3/29, 5:03?PM
2026-10-29 14:30:03,214 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:b0c6b2c466917b04773c647d4afc0c8, Subject:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3081933591, Valid from:5/20/25, 9:00?PM, Valid until:6/19/29, 8:59?PM
2026-10-29 14:30:03,216 DEBUG [jdk.eve.security] (reactor-http-epoll-1) ValidationChain: 1136084297, 3081933591, 517509489, 3454775792
2026-10-29 14:30:03,217 DEBUG [jdk.eve.security] (reactor-http-epoll-1)  TLSHandshake: westus-0.in.applicationinsights.azure.com:443, TLSv1.3, TLS_AES_256_GCM_SHA384, 3454775792
2026-10-29 14:30:03,220 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:4901179cdee33c8aeb09b9934f000001179cde, Subject:CN=Microsoft TLS G2 RSA CA OCSP 10 External OCSP Responder 2026-09-, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 10, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:2354293734, Valid from:9/29/26, 7:03?PM, Valid until:3/28/27, 7:03?PM
2026-10-29 14:30:03,221 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:4901360047ac082594f498e70f000001360047, Subject:CN=in.applicationinsights.azure.com, O=Microsoft Corporation, L=Redmond, ST=WA, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 10, O=Microsoft Corporation, C=US, Key type:RSA, Length:2048, Cert Id:3454775792, Valid from:10/13/26, 9:56?PM, Valid until:1/21/27, 8:56?PM
2026-10-29 14:30:03,221 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:330000000f33206537ee42ae4f00000000000f, Subject:CN=Microsoft TLS G2 RSA CA OCSP 10, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:517509489, Valid from:8/1/25, 5:03?PM, Valid until:6/3/29, 5:03?PM
2026-10-29 14:30:03,221 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:b0c6b2c466917b04773c647d4afc0c8, Subject:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3081933591, Valid from:5/20/25, 9:00?PM, Valid until:6/19/29, 8:59?PM
2026-10-29 14:30:03,222 DEBUG [jdk.eve.security] (reactor-http-epoll-1) ValidationChain: 1136084297, 3081933591, 517509489, 3454775792
2026-10-29 14:30:03,223 DEBUG [jdk.eve.security] (reactor-http-epoll-1)  TLSHandshake: westus-0.in.applicationinsights.azure.com:443, TLSv1.3, TLS_AES_256_GCM_SHA384, 3454775792
2026-10-29 14:30:03,372 INFO  [io.qua.htt.access-log] (executor-thread-1) 25.2.20.1 - - [29/Oct/2026:14:30:03 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:30:03,372 INFO  [io.qua.htt.access-log] (executor-thread-2) 25.2.20.1 - - [29/Oct/2026:14:30:03 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:30:04,557 DEBUG [jav.lan.ProcessBuilder] (PerformanceCounterContainer-0) ProcessBuilder.start(): pid: 141, dir: null, cmd: "/sbin/ldconfig": java.lang.RuntimeException: ProcessBuilder.start() debug
	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1147)
	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1089)
	at java.base/java.lang.Runtime.exec(Runtime.java:681)
	at java.base/java.lang.Runtime.exec(Runtime.java:491)
	at java.base/java.lang.Runtime.exec(Runtime.java:366)
	at com.sun.jna.NativeLibrary.getLinuxLdPaths(NativeLibrary.java:1023)
	at com.sun.jna.NativeLibrary.<clinit>(NativeLibrary.java:965)
	at com.sun.jna.Library$Handler.<init>(Library.java:197)
	at com.sun.jna.Native.load(Native.java:618)
	at com.sun.jna.Native.load(Native.java:592)
	at com.sun.jna.platform.linux.Udev.<clinit>(Udev.java:37)
	at oshi.software.os.linux.LinuxOperatingSystem.<clinit>(LinuxOperatingSystem.java:86)
	at oshi.SystemInfo.createOperatingSystem(SystemInfo.java:85)
	at oshi.util.Memoizer$1.get(Memoizer.java:61)
	at oshi.SystemInfo.getOperatingSystem(SystemInfo.java:76)
	at com.microsoft.applicationinsights.agent.internal.perfcounter.OshiPerformanceCounter.report(OshiPerformanceCounter.java:47)
	at com.microsoft.applicationinsights.agent.internal.perfcounter.PerformanceCounterContainer$1.run(PerformanceCounterContainer.java:130)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:358)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

2026-10-29 14:30:04,577 DEBUG [jav.lan.ProcessBuilder] (PerformanceCounterContainer-0) ProcessBuilder.start(): pid: 144, dir: null, cmd: "uname": java.lang.RuntimeException: ProcessBuilder.start() debug
	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1147)
	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1089)
	at java.base/java.lang.Runtime.exec(Runtime.java:681)
	at java.base/java.lang.Runtime.exec(Runtime.java:577)
	at oshi.util.ExecutingCommand.runNative(ExecutingCommand.java:86)
	at oshi.util.ExecutingCommand.runNative(ExecutingCommand.java:68)
	at oshi.util.ExecutingCommand.runNative(ExecutingCommand.java:55)
	at oshi.util.ExecutingCommand.getAnswerAt(ExecutingCommand.java:154)
	at oshi.util.ExecutingCommand.getFirstAnswer(ExecutingCommand.java:143)
	at oshi.software.os.linux.LinuxOperatingSystem.<clinit>(LinuxOperatingSystem.java:142)
	at oshi.SystemInfo.createOperatingSystem(SystemInfo.java:85)
	at oshi.util.Memoizer$1.get(Memoizer.java:61)
	at oshi.SystemInfo.getOperatingSystem(SystemInfo.java:76)
	at com.microsoft.applicationinsights.agent.internal.perfcounter.OshiPerformanceCounter.report(OshiPerformanceCounter.java:47)
	at com.microsoft.applicationinsights.agent.internal.perfcounter.PerformanceCounterContainer$1.run(PerformanceCounterContainer.java:130)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:358)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

2026-10-29 14:30:13,372 INFO  [io.qua.htt.access-log] (executor-thread-2) 25.2.20.1 - - [29/Oct/2026:14:30:13 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:30:13,376 INFO  [io.qua.htt.access-log] (executor-thread-2) 25.2.20.1 - - [29/Oct/2026:14:30:13 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:30:23,372 INFO  [io.qua.htt.access-log] (executor-thread-2) 25.2.20.1 - - [29/Oct/2026:14:30:23 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:30:23,372 INFO  [io.qua.htt.access-log] (executor-thread-1) 25.2.20.1 - - [29/Oct/2026:14:30:23 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:30:33,372 INFO  [io.qua.htt.access-log] (executor-thread-2) 25.2.20.1 - - [29/Oct/2026:14:30:33 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:30:33,372 INFO  [io.qua.htt.access-log] (executor-thread-1) 25.2.20.1 - - [29/Oct/2026:14:30:33 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:30:43,372 INFO  [io.qua.htt.access-log] (executor-thread-1) 25.2.20.1 - - [29/Oct/2026:14:30:43 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:30:43,372 INFO  [io.qua.htt.access-log] (executor-thread-2) 25.2.20.1 - - [29/Oct/2026:14:30:43 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:30:53,372 INFO  [io.qua.htt.access-log] (executor-thread-2) 25.2.20.1 - - [29/Oct/2026:14:30:53 -0300] "GET / HTTP/1.1" 200 2
2026-10-29 14:30:53,372 INFO  [io.qua.htt.access-log] (executor-thread-1) 25.2.20.1 - - [29/Oct/2026:14:30:53 -0300] "GET / HTTP/1.1" 200 2


Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIFAP-centralizadora-backend-intranet
/
SIFAP-centralizadora-backend-intranet-1.3.0.25(3)
Search








SIFAP-centralizadora-backend-intranet

SIFAP-centralizadora-backend-intranet-1.3.0.25(3)


EC DES

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Agent job
Started: 29/10/2026, 14:28:09
Pool:
Release-Linux-OKD4
·
Agent: azp-ads-agent-release-5cd876f98-whjb5

1m 13s

Initialize job
·
succeeded
<1s

Pre-job: Download secure file
·
succeeded
<1s

Download Artifacts
·
succeeded
1 warning
<1s

Exportando as variáveis do arquivo Trust Store
·
succeeded
<1s

Recuperando nome do repositório
·
succeeded
1s

Convertendo Minúsculo e Definindo nome do Projeto/Repositório
·
succeeded
<1s

Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
·
succeeded
<1s

Cria Streams Graylog
·
succeeded
5s

Recupera VEC
·
succeeded
<1s

VEC - Aferição
·
succeeded
<1s

Login OpenShift
·
succeeded
<1s

Exportando Variáveis de Ambiente "_ENV."
·
succeeded
<1s

Criando novo Projeto
·
succeeded
<1s

Adicionando ISTIO_INJECTION
·
skipped


Criando nova APP
·
succeeded
<1s

Atualizando Variáveis de Ambiente
·
succeeded
2s

Criando Rota Customizada
·
succeeded
<1s

Aplicando Service Mesh
·
skipped


Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-beyondtrust-check
·
succeeded
<1s

Create BT Secret
·
succeeded
<1s

Create BT Shared Volume
·
succeeded
<1s

Create BT Sidecar
·
succeeded
<1s

Create Secret Check Script
·
succeeded
<1s

Create Secret Check
·
succeeded
<1s

Create BT App Mount Volume
·
succeeded
<1s

Exporta Variáveis de Ambiente "_SECRET."
·
succeeded
<1s

Alterando valores placeholder no exec_secret.sh
·
succeeded
<1s

Criando Secrets
·
succeeded
<1s

Vinculando Secrets
·
succeeded
<1s

Adicionando Multiplas Secrets
·
succeeded
<1s

Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
·
succeeded
20s

Concedendo Acesso OKD
·
succeeded
<1s

Verificando IP de Saída
·
succeeded
<1s

Configurando IP de Saída - deployment
·
skipped


Configurando IP de Saída - deploymentconfig
·
succeeded
<1s

Cadastrando no Portal IIF
·
succeeded
<1s

Verificando Status do Deployment
·
succeeded

28s

Logs da Aplicação
·
succeeded
<1s

Resumo da Release
·
succeeded
<1s

Coletando dados da imagem
·
succeeded
3s

Atualizando versão no PortalIF
·
succeeded
<1s

Realizando Logout OKD
·
succeeded
<1s

Finalize Job
·
succeeded
<1s
View detailed logs
Row 2

Showing filters 1 through 2

Row 2

Row 2



subiu me ajuda com a ota para fechar a demanda



