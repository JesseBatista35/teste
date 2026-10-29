2026-10-29T12:08:26.9362448Z ##[section]Starting: Verificando Status do Deployment
2026-10-29T12:08:26.9366205Z ==============================================================================
2026-10-29T12:08:26.9366319Z Task         : Bash
2026-10-29T12:08:26.9366365Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-29T12:08:26.9366428Z Version      : 3.227.0
2026-10-29T12:08:26.9366507Z Author       : Microsoft Corporation
2026-10-29T12:08:26.9366571Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-29T12:08:26.9366644Z ==============================================================================
2026-10-29T12:08:27.0822118Z Generating script.
2026-10-29T12:08:27.0833013Z ========================== Starting Command Output ===========================
2026-10-29T12:08:27.0842001Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/0cf70c20-ac65-4801-a5f8-565e37a60cd0.sh
2026-10-29T12:08:27.1710918Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-10-29T12:08:29.6444817Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-10-29T12:08:29.7158534Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-10-29T12:14:34.4472356Z ##[error]The task has timed out.
2026-10-29T12:14:34.4473840Z ##[section]Finishing: Verificando Status do Deployment


2026-10-29T12:14:34.4497168Z ##[section]Starting: Logs da Aplicação
2026-10-29T12:14:34.4500593Z ==============================================================================
2026-10-29T12:14:34.4500675Z Task         : Bash
2026-10-29T12:14:34.4500720Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-29T12:14:34.4500855Z Version      : 3.227.0
2026-10-29T12:14:34.4500906Z Author       : Microsoft Corporation
2026-10-29T12:14:34.4500957Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-29T12:14:34.4501067Z ==============================================================================
2026-10-29T12:14:34.5981388Z Generating script.
2026-10-29T12:14:34.5994278Z ========================== Starting Command Output ===========================
2026-10-29T12:14:34.6001443Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/e13e24be-88dc-4925-9f74-5505af20ae04.sh
2026-10-29T12:14:34.6057326Z + shopt -s expand_aliases
2026-10-29T12:14:34.6057524Z + [[ -n okd4_nprd ]]
2026-10-29T12:14:34.6057963Z + [[ okd4_nprd =~ ocp ]]
2026-10-29T12:14:34.6058404Z + [[ -n okd4_nprd ]]
2026-10-29T12:14:34.6058520Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-10-29T12:14:34.6058731Z + app=sifap-centralizadora-backend-intranet-des
2026-10-29T12:14:34.6058880Z + oc version
2026-10-29T12:14:34.6712910Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-10-29T12:14:34.6713389Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-10-29T12:14:34.6713652Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-10-29T12:14:34.6753745Z ++ oc get pod -l name=sifap-centralizadora-backend-intranet-des -n sifap-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-29T12:14:34.6754587Z ++ tac
2026-10-29T12:14:34.6757080Z ++ grep -v '^$'
2026-10-29T12:14:34.6757393Z ++ head -n1
2026-10-29T12:14:34.7546064Z + last_pod=sifap-centralizadora-backend-intranet-des-111-pgs42
2026-10-29T12:14:34.7546386Z + echo 'Logs do POD: sifap-centralizadora-backend-intranet-des-111-pgs42'
2026-10-29T12:14:34.7546764Z + oc logs sifap-centralizadora-backend-intranet-des-111-pgs42 -c sifap-centralizadora-backend-intranet-des -n sifap-des
2026-10-29T12:14:34.7547207Z Logs do POD: sifap-centralizadora-backend-intranet-des-111-pgs42
2026-10-29T12:14:34.8300752Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=JKS -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.6.2.jar -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-10-29T12:14:34.8301572Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-10-29T12:14:34.8302077Z 2026-10-29 09:12:09.291-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.6.2 started successfully (PID 8, JVM running for 2.49 s)
2026-10-29T12:14:34.8302597Z 2026-10-29 09:12:09.293-03:00 INFO  c.m.applicationinsights.agent - Java version: 21.0.1, vendor: Oracle Corporation, home: /usr/java/jdk-21.0.1
2026-10-29T12:14:34.8302880Z __  ____  __  _____   ___  __ ____  ______ 
2026-10-29T12:14:34.8303134Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-10-29T12:14:34.8303281Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-10-29T12:14:34.8303509Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-10-29T12:14:34.8304141Z 2026-10-29 09:12:08,731 DEBUG [jdk.eve.security] (main) X509Certificate: Alg:SHA384withRSA, Serial:59b1b579e8e2132e23907bda777755c, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:1057369358, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-10-29T12:14:34.8305156Z 2026-10-29 09:12:08,735 DEBUG [jdk.eve.security] (main) X509Certificate: Alg:SHA384withRSA, Serial:8ad40b260d29c4c9f5ecda9bd93aed9, Subject:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3406046841, Valid from:4/28/21, 9:00?PM, Valid until:4/28/36, 8:59?PM
2026-10-29T12:14:34.8306710Z 2026-10-29 09:12:08,736 DEBUG [jdk.eve.security] (main) X509Certificate: Alg:SHA256withRSA, Serial:d1f02a4a2c5a3d3a37dda07199a3620, Subject:CN=Microsoft Corporation, OU=Java Signing (SHA2), O=Microsoft Corporation, L=Redmond, ST=Washington, C=US, Issuer:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:1223504232, Valid from:8/29/24, 9:00?PM, Valid until:10/29/27, 8:59?PM
2026-10-29T12:14:34.8307546Z 2026-10-29 09:12:08,745 DEBUG [jdk.eve.security] (main) X509Certificate: Alg:SHA256withRSA, Serial:bae66bc5aba7f9587c6f9e904e33304, Subject:CN=DigiCert Timestamp 2024, O=DigiCert, C=US, Issuer:CN=DigiCert Trusted G4 RSA4096 SHA256 TimeStamping CA, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:3934399196, Valid from:9/25/24, 9:00?PM, Valid until:11/25/35, 8:59?PM
2026-10-29T12:14:34.8308474Z 2026-10-29 09:12:08,745 DEBUG [jdk.eve.security] (main) X509Certificate: Alg:SHA256withRSA, Serial:73637b724547cd847acfd28662a5e5b, Subject:CN=DigiCert Trusted G4 RSA4096 SHA256 TimeStamping CA, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3207540671, Valid from:3/22/22, 9:00?PM, Valid until:3/22/37, 8:59?PM
2026-10-29T12:14:34.8309376Z 2026-10-29 09:12:08,745 DEBUG [jdk.eve.security] (main) X509Certificate: Alg:SHA384withRSA, Serial:e9b188ef9d02de7efdb50e20840185a, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:845088433, Valid from:7/31/22, 9:00?PM, Valid until:11/9/31, 8:59?PM
2026-10-29T12:14:34.8310256Z 2026-10-29 09:12:09,590 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:ce22972800344766b49ca5d407cd039, Subject:CN=Valid Certificadora RSA DV SSL CA, O=Valid Certificadora Digital LTDA, C=BR, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:3072, Cert Id:131886298, Valid from:8/1/23, 9:00?PM, Valid until:8/1/33, 8:59?PM
2026-10-29T12:14:34.8311122Z 2026-10-29 09:12:09,600 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:83be056904246b1a1756ac95991c74a, Subject:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1341898239, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-10-29T12:14:34.8312028Z 2026-10-29 09:12:09,601 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:397a66cc2756362e0daa87ca6eabe3b1, Subject:CN=Sectigo Public Server Authentication CA DV R36, O=Sectigo Limited, C=GB, Issuer:CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB, Key type:RSA, Length:3072, Cert Id:1180805919, Valid from:3/21/21, 9:00?PM, Valid until:3/21/36, 8:59?PM
2026-10-29T12:14:34.8313097Z 2026-10-29 09:12:09,602 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:47b583ffce303b8047ba716d908e88d2, Subject:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:71683228, Valid from:12/23/22, 11:55?AM, Valid until:12/23/42, 12:05?PM
2026-10-29T12:14:34.8314002Z 2026-10-29 09:12:09,603 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:1, Subject:CN=Autoridade Certificadora Raiz Brasileira v5, OU=Instituto Nacional de Tecnologia da Informacao - ITI, O=ICP-Brasil, C=BR, Issuer:CN=Autoridade Certificadora Raiz Brasileira v5, OU=Instituto Nacional de Tecnologia da Informacao - ITI, O=ICP-Brasil, C=BR, Key type:RSA, Length:4096, Cert Id:827042461, Valid from:3/2/16, 10:01?AM, Valid until:3/2/29, 8:59?PM
2026-10-29T12:14:34.8315316Z 2026-10-29 09:12:09,604 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:1ed397095fd8b4b347701eaabe7f45b3, Subject:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:2848349048, Valid from:12/18/19, 7:51?PM, Valid until:7/18/42, 8:00?PM
2026-10-29T12:14:34.8316809Z 2026-10-29 09:12:09,605 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:36825e7fb5a481937ef6d1736bb93ca6, Subject:CN=COMODO RSA Organization Validation Secure Server CA, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:245647897, Valid from:2/11/14, 10:00?PM, Valid until:2/11/29, 8:59?PM
2026-10-29T12:14:34.8317974Z 2026-10-29 09:12:09,606 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:1ee5f221dfc623bd4333a8557, Subject:CN=GlobalSign RSA OV SSL CA 2018, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Key type:RSA, Length:2048, Cert Id:930132802, Valid from:11/20/18, 10:00?PM, Valid until:11/20/28, 9:00?PM
2026-10-29T12:14:34.8318990Z 2026-10-29 09:12:09,606 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:3972443af922b751d7d36c10dd313595, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:4096, Cert Id:3160189236, Valid from:3/11/19, 9:00?PM, Valid until:12/31/28, 8:59?PM
2026-10-29T12:14:34.8319949Z 2026-10-29 09:12:09,607 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:2, Subject:CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR, Issuer:CN=Autoridade Certificadora SERPRO v4, OU=Autoridade Certificadora Raiz Brasileira v5, O=ICP-Brasil, C=BR, Key type:RSA, Length:4096, Cert Id:4146249541, Valid from:1/9/17, 5:36?PM, Valid until:2/15/29, 4:36?PM
2026-10-29T12:14:34.8320883Z 2026-10-29 09:12:09,608 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:600000000299b24b9d7901ea84000000000002, Subject:CN=AC Icptestes Sub, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:2447629493, Valid from:12/23/22, 12:47?PM, Valid until:12/23/42, 12:05?PM
2026-10-29T12:14:34.8321855Z 2026-10-29 09:12:09,609 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:758dfd8bae7c0700faa925a7e1c7ad14, Subject:CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB, Issuer:CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB, Key type:RSA, Length:4096, Cert Id:3806652169, Valid from:3/21/21, 9:00?PM, Valid until:3/21/46, 8:59?PM
2026-10-29T12:14:34.8322952Z 2026-10-29 09:12:09,610 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:1fd6d30fca3ca51a81bbc640e35032d, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:4096, Cert Id:3947601401, Valid from:1/31/10, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-10-29T12:14:34.8323793Z 2026-10-29 09:12:09,610 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:40000000001154b5ac394, Subject:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Key type:RSA, Length:2048, Cert Id:536948034, Valid from:9/1/98, 9:00?AM, Valid until:1/28/28, 9:00?AM
2026-10-29T12:14:34.8324823Z 2026-10-29 09:12:09,611 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:33af1e6a711a9a0bb2864b11d09fae5, Subject:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1136084297, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-10-29T12:14:34.8325857Z 2026-10-29 09:12:09,612 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:7d5b5126b476ba11db74160bbc530da7, Subject:CN=Sectigo RSA Domain Validation Secure Server CA, O=Sectigo Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:2048, Cert Id:2459870160, Valid from:11/1/18, 9:00?PM, Valid until:12/31/30, 8:59?PM
2026-10-29T12:14:34.8326562Z 2026-10-29 09:12:09,612 DEBUG [org.jbo.logging] (main) Logging Provider: org.jboss.logging.JBossLogManagerProvider
2026-10-29T12:14:34.8326987Z 2026-10-29 09:12:09,613 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource BuildTime RunTime Fixed with ordinal 2147483647
2026-10-29T12:14:34.8327367Z 2026-10-29 09:12:09,613 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource SysPropConfigSource with ordinal 400
2026-10-29T12:14:34.8327719Z 2026-10-29 09:12:09,613 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource EnvConfigSource with ordinal 300
2026-10-29T12:14:34.8328184Z 2026-10-29 09:12:09,613 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource PropertiesConfigSource[source=jar:file:///deployments/app/sifap-centralizadora-1.0.0-SNAPSHOT.jar!/application.properties] with ordinal 250
2026-10-29T12:14:34.8328612Z 2026-10-29 09:12:09,613 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource DefaultValuesConfigSource with ordinal -2147483648
2026-10-29T12:14:34.8329272Z 2026-10-29 09:12:09,613 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:90ee8c5de5bfa62d2ae2ff7097c4857, Subject:CN=Thawte TLS RSA CA G1, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:96139010, Valid from:11/2/17, 10:24?AM, Valid until:11/2/27, 9:24?AM
2026-10-29T12:14:34.8330096Z 2026-10-29 09:12:09,613 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:83be056904246b1a1756ac95991c74a, Subject:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1341898239, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-10-29T12:14:34.8330904Z 2026-10-29 09:12:09,614 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:4188b0e1a030eda84084ca76a3b1be32, Subject:CN=AC Interna Caixa, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Interna Caixa, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:2506492458, Valid from:10/13/22, 2:25?PM, Valid until:10/13/42, 2:35?PM
2026-10-29T12:14:34.8331685Z 2026-10-29 09:12:09,615 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:62000000027328772c722ac752000000000002, Subject:CN=AC Interna APL, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Interna Caixa, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:3746844432, Valid from:10/13/22, 3:34?PM, Valid until:10/13/42, 2:35?PM
2026-10-29T12:14:34.8332545Z 2026-10-29 09:12:09,615 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:3972443af922b751d7d36c10dd313595, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:4096, Cert Id:3160189236, Valid from:3/11/19, 9:00?PM, Valid until:12/31/28, 8:59?PM
2026-10-29T12:14:34.8333743Z 2026-10-29 09:12:09,616 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:1ee5f221dfc623bd4333a8557, Subject:CN=GlobalSign RSA OV SSL CA 2018, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Key type:RSA, Length:2048, Cert Id:930132802, Valid from:11/20/18, 10:00?PM, Valid until:11/20/28, 9:00?PM
2026-10-29T12:14:34.8334796Z 2026-10-29 09:12:09,617 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:5, Subject:CN=Autoridade Certificadora SERPRO v4, OU=Autoridade Certificadora Raiz Brasileira v5, O=ICP-Brasil, C=BR, Issuer:CN=Autoridade Certificadora Raiz Brasileira v5, OU=Instituto Nacional de Tecnologia da Informacao - ITI, O=ICP-Brasil, C=BR, Key type:RSA, Length:4096, Cert Id:1380576325, Valid from:9/14/16, 10:10?AM, Valid until:3/2/29, 9:00?AM
2026-10-29T12:14:34.8335816Z 2026-10-29 09:12:09,617 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:3097386402, Valid from:12/31/03, 10:00?PM, Valid until:12/31/28, 8:59?PM
2026-10-29T12:14:34.8336641Z 2026-10-29 09:12:09,618 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:3097386402, Valid from:12/31/03, 10:00?PM, Valid until:12/31/28, 8:59?PM
2026-10-29T12:14:34.8337543Z 2026-10-29 09:12:09,618 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:7d5b5126b476ba11db74160bbc530da7, Subject:CN=Sectigo RSA Domain Validation Secure Server CA, O=Sectigo Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:2048, Cert Id:2459870160, Valid from:11/1/18, 9:00?PM, Valid until:12/31/30, 8:59?PM
2026-10-29T12:14:34.8338536Z 2026-10-29 09:12:09,619 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:36825e7fb5a481937ef6d1736bb93ca6, Subject:CN=COMODO RSA Organization Validation Secure Server CA, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:245647897, Valid from:2/11/14, 10:00?PM, Valid until:2/11/29, 8:59?PM
2026-10-29T12:14:34.8339268Z 2026-10-29 09:12:09,806 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.rest-client."ministerio-farmacia-api".disable-default-mapper" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-10-29T12:14:34.8339846Z 2026-10-29 09:12:09,813 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.rest-client.ministerio-farmacia-api.disable-default-mapper" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-10-29T12:14:34.8340482Z 2026-10-29 09:12:09,997 DEBUG [org.hib.qua.feature] (main) Hibernate Features Enabled
2026-10-29T12:14:34.8340799Z 2026-10-29 09:12:09,998 DEBUG [io.qua.hib.orm] (main) List of entities found by Quarkus deployment:
2026-10-29T12:14:34.8341689Z [br.com.caixa.sifap.entity.AnaliseDocumento, br.com.caixa.sifap.entity.ControleDocumento, br.com.caixa.sifap.entity.Farmaceutico, br.com.caixa.sifap.entity.Farmacia, br.com.caixa.sifap.entity.FarmaciaAuxiliar, br.com.caixa.sifap.entity.HistoricoAnaliseDocumento, br.com.caixa.sifap.entity.ItemAnaliseDocumento, br.com.caixa.sifap.entity.ItemValidacao, br.com.caixa.sifap.entity.RepresentacaoFarmacia, br.com.caixa.sifap.entity.RepresentacaoTecnica, br.com.caixa.sifap.entity.RepresentanteFarmacia, br.com.caixa.sifap.entity.SituacaoFarmacia, br.com.caixa.sifap.entity.SqlMappings, br.com.caixa.sifap.entity.TipoDocumento, br.com.caixa.sifap.entity.TipoDocumentoFarmacia, br.com.caixa.sifap.entity.TipoDocumentoItemValidacao, br.com.caixa.sifap.entity.TipoSituacaoFarmacia]
2026-10-29T12:14:34.8344789Z 2026-10-29 09:12:10,099 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:41011a4d0efb710c519f47e8e10000011a4d0e, Subject:CN=Microsoft TLS G2 RSA CA OCSP 02 External OCSP Responder 2026-09-, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 02, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:2334543075, Valid from:9/29/26, 7:04?PM, Valid until:3/28/27, 7:04?PM
2026-10-29T12:14:34.8346950Z 2026-10-29 09:12:10,100 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:4101381e7c06a2f5a036c9997a000001381e7c, Subject:CN=in.applicationinsights.azure.com, O=Microsoft Corporation, L=Redmond, ST=WA, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 02, O=Microsoft Corporation, C=US, Key type:RSA, Length:2048, Cert Id:1163172566, Valid from:10/13/26, 6:58?PM, Valid until:1/21/27, 5:58?PM
2026-10-29T12:14:34.8348770Z 2026-10-29 09:12:10,101 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:330000000c4964a16f44203b2200000000000c, Subject:CN=Microsoft TLS G2 RSA CA OCSP 02, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:4116687715, Valid from:8/1/25, 5:03?PM, Valid until:6/3/29, 5:03?PM
2026-10-29T12:14:34.8350148Z 2026-10-29 09:12:10,102 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:b0c6b2c466917b04773c647d4afc0c8, Subject:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3081933591, Valid from:5/20/25, 9:00?PM, Valid until:6/19/29, 8:59?PM
2026-10-29T12:14:34.8351091Z 2026-10-29 09:12:10,116 DEBUG [jdk.eve.security] (reactor-http-epoll-1) ValidationChain: 1136084297, 3081933591, 4116687715, 1163172566
2026-10-29T12:14:34.8352112Z 2026-10-29 09:12:10,118 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:570a119742c4e3cc, Subject:CN=Actalis Authentication Root CA, O=Actalis S.p.A./03358520967, L=Milan, C=IT, Issuer:CN=Actalis Authentication Root CA, O=Actalis S.p.A./03358520967, L=Milan, C=IT, Key type:RSA, Length:4096, Cert Id:1729119956, Valid from:9/22/11, 8:22?AM, Valid until:9/22/30, 8:22?AM
2026-10-29T12:14:34.8352965Z 2026-10-29 09:12:10,119 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AddTrust External CA Root, OU=AddTrust External TTP Network, O=AddTrust AB, C=SE, Issuer:CN=AddTrust External CA Root, OU=AddTrust External TTP Network, O=AddTrust AB, C=SE, Key type:RSA, Length:2048, Cert Id:3968614624, Valid from:5/30/00, 7:48?AM, Valid until:5/30/20, 7:48?AM
2026-10-29T12:14:34.8353776Z 2026-10-29 09:12:10,120 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AddTrust Qualified CA Root, OU=AddTrust TTP Network, O=AddTrust AB, C=SE, Issuer:CN=AddTrust Qualified CA Root, OU=AddTrust TTP Network, O=AddTrust AB, C=SE, Key type:RSA, Length:2048, Cert Id:607365522, Valid from:5/30/00, 7:44?AM, Valid until:5/30/20, 7:44?AM
2026-10-29T12:14:34.8354806Z 2026-10-29 09:12:10,120 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:7777062726a9b17c, Subject:CN=AffirmTrust Commercial, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Commercial, O=AffirmTrust, C=US, Key type:RSA, Length:2048, Cert Id:630485644, Valid from:1/29/10, 12:06?PM, Valid until:12/31/30, 11:06?AM
2026-10-29T12:14:34.8355772Z 2026-10-29 09:12:10,121 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:7c4f04391cd4992d, Subject:CN=AffirmTrust Networking, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Networking, O=AffirmTrust, C=US, Key type:RSA, Length:2048, Cert Id:651670175, Valid from:1/29/10, 12:08?PM, Valid until:12/31/30, 11:08?AM
2026-10-29T12:14:34.8356990Z 2026-10-29 09:12:10,121 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:6d8c1446b1a60aee, Subject:CN=AffirmTrust Premium, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Premium, O=AffirmTrust, C=US, Key type:RSA, Length:4096, Cert Id:2164683341, Valid from:1/29/10, 12:10?PM, Valid until:12/31/40, 11:10?AM
2026-10-29T12:14:34.8358174Z 2026-10-29 09:12:10,122 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:7497258ac73f7a54, Subject:CN=AffirmTrust Premium ECC, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Premium ECC, O=AffirmTrust, C=US, Key type:EC, Length:384, Cert Id:2214603510, Valid from:1/29/10, 12:20?PM, Valid until:12/31/40, 11:20?AM
2026-10-29T12:14:34.8359129Z 2026-10-29 09:12:10,122 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:66c9fcf99bf8c0a39e2f0788a43e696365bca, Subject:CN=Amazon Root CA 1, O=Amazon, C=US, Issuer:CN=Amazon Root CA 1, O=Amazon, C=US, Key type:RSA, Length:2048, Cert Id:2822522334, Valid from:5/25/15, 9:00?PM, Valid until:1/16/38, 9:00?PM
2026-10-29T12:14:34.8359865Z 2026-10-29 09:12:10,123 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:66c9fd29635869f0a0fe58678f85b26bb8a37, Subject:CN=Amazon Root CA 2, O=Amazon, C=US, Issuer:CN=Amazon Root CA 2, O=Amazon, C=US, Key type:RSA, Length:4096, Cert Id:2528834908, Valid from:5/25/15, 9:00?PM, Valid until:5/25/40, 9:00?PM
2026-10-29T12:14:34.8360758Z 2026-10-29 09:12:10,123 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withECDSA, Serial:66c9fd5749736663f3b0b9ad9e89e7603f24a, Subject:CN=Amazon Root CA 3, O=Amazon, C=US, Issuer:CN=Amazon Root CA 3, O=Amazon, C=US, Key type:EC, Length:256, Cert Id:2732679773, Valid from:5/25/15, 9:00?PM, Valid until:5/25/40, 9:00?PM
2026-10-29T12:14:34.8361905Z 2026-10-29 09:12:10,124 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:66c9fd7c1bb104c2943e5717b7b2cc81ac10e, Subject:CN=Amazon Root CA 4, O=Amazon, C=US, Issuer:CN=Amazon Root CA 4, O=Amazon, C=US, Key type:EC, Length:384, Cert Id:2640694783, Valid from:5/25/15, 9:00?PM, Valid until:5/25/40, 9:00?PM
2026-10-29T12:14:34.8363034Z 2026-10-29 09:12:10,124 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:20000b9, Subject:CN=Baltimore CyberTrust Root, OU=CyberTrust, O=Baltimore, C=IE, Issuer:CN=Baltimore CyberTrust Root, OU=CyberTrust, O=Baltimore, C=IE, Key type:RSA, Length:2048, Cert Id:1425294543, Valid from:5/12/00, 3:46?PM, Valid until:5/12/25, 8:59?PM
2026-10-29T12:14:34.8363802Z 2026-10-29 09:12:10,125 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:2, Subject:CN=Buypass Class 2 Root CA, O=Buypass AS-983163327, C=NO, Issuer:CN=Buypass Class 2 Root CA, O=Buypass AS-983163327, C=NO, Key type:RSA, Length:4096, Cert Id:969960563, Valid from:10/26/10, 6:38?AM, Valid until:10/26/40, 5:38?AM
2026-10-29T12:14:34.8364657Z 2026-10-29 09:12:10,125 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:2, Subject:CN=Buypass Class 3 Root CA, O=Buypass AS-983163327, C=NO, Issuer:CN=Buypass Class 3 Root CA, O=Buypass AS-983163327, C=NO, Key type:RSA, Length:4096, Cert Id:1264269967, Valid from:10/26/10, 6:28?AM, Valid until:10/26/40, 5:28?AM
2026-10-29T12:14:34.8365879Z 2026-10-29 09:12:10,126 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:a3da427ea4b1aeda, Subject:CN=Chambers of Commerce Root - 2008, O=AC Camerfirma S.A., SERIALNUMBER=A82743287, L=Madrid (see current address at www.camerfirma.com/address), C=EU, Issuer:CN=Chambers of Commerce Root - 2008, O=AC Camerfirma S.A., SERIALNUMBER=A82743287, L=Madrid (see current address at www.camerfirma.com/address), C=EU, Key type:RSA, Length:4096, Cert Id:4266703372, Valid from:8/1/08, 9:29?AM, Valid until:7/31/38, 9:29?AM
2026-10-29T12:14:34.8366972Z 2026-10-29 09:12:10,127 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:0, Subject:CN=Chambers of Commerce Root, OU=http://www.chambersign.org, O=AC Camerfirma SA CIF A82743287, C=EU, Issuer:CN=Chambers of Commerce Root, OU=http://www.chambersign.org, O=AC Camerfirma SA CIF A82743287, C=EU, Key type:RSA, Length:2048, Cert Id:1827306452, Valid from:9/30/03, 1:13?PM, Valid until:9/30/37, 1:13?PM
2026-10-29T12:14:34.8367995Z 2026-10-29 09:12:10,127 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:c9cdd3e9d57d23ce, Subject:CN=Global Chambersign Root - 2008, O=AC Camerfirma S.A., SERIALNUMBER=A82743287, L=Madrid (see current address at www.camerfirma.com/address), C=EU, Issuer:CN=Global Chambersign Root - 2008, O=AC Camerfirma S.A., SERIALNUMBER=A82743287, L=Madrid (see current address at www.camerfirma.com/address), C=EU, Key type:RSA, Length:4096, Cert Id:1271252776, Valid from:8/1/08, 9:31?AM, Valid until:7/31/38, 9:31?AM
2026-10-29T12:14:34.8368832Z 2026-10-29 09:12:10,128 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:fedce3010fc948ff, Subject:CN=Certigna, O=Dhimyotis, C=FR, Issuer:CN=Certigna, O=Dhimyotis, C=FR, Key type:RSA, Length:2048, Cert Id:3506875840, Valid from:6/29/07, 12:13?PM, Valid until:6/29/27, 12:13?PM
2026-10-29T12:14:34.8369670Z 2026-10-29 09:12:10,129 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:cae91b89f155030da3e6416dc4e3a6e1, Subject:CN=Certigna Root CA, OU=0002 48146308100036, O=Dhimyotis, C=FR, Issuer:CN=Certigna Root CA, OU=0002 48146308100036, O=Dhimyotis, C=FR, Key type:RSA, Length:4096, Cert Id:356684591, Valid from:10/1/13, 5:32?AM, Valid until:10/1/33, 5:32?AM
2026-10-29T12:14:34.8370425Z 2026-10-29 09:12:10,129 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:10020, Subject:CN=Certum CA, O=Unizeto Sp. z o.o., C=PL, Issuer:CN=Certum CA, O=Unizeto Sp. z o.o., C=PL, Key type:RSA, Length:2048, Cert Id:3550516030, Valid from:6/11/02, 7:46?AM, Valid until:6/11/27, 7:46?AM
2026-10-29T12:14:34.8371369Z 2026-10-29 09:12:10,130 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:444c0, Subject:CN=Certum Trusted Network CA, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Issuer:CN=Certum Trusted Network CA, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Key type:RSA, Length:2048, Cert Id:2014002193, Valid from:10/22/08, 10:07?AM, Valid until:12/31/29, 9:07?AM
2026-10-29T12:14:34.8372291Z 2026-10-29 09:12:10,130 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:15c8bd65475cafb897005ee406d2bc9d, Subject:OU=ePKI Root Certification Authority, O="Chunghwa Telecom Co., Ltd.", C=TW, Issuer:OU=ePKI Root Certification Authority, O="Chunghwa Telecom Co., Ltd.", C=TW, Key type:RSA, Length:4096, Cert Id:3632331159, Valid from:12/20/04, 12:31?AM, Valid until:12/19/34, 11:31?PM
2026-10-29T12:14:34.8373219Z 2026-10-29 09:12:10,130 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:3097386402, Valid from:12/31/03, 10:00?PM, Valid until:12/31/28, 8:59?PM
2026-10-29T12:14:34.8374127Z 2026-10-29 09:12:10,131 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:1f47afaa62007050544c019e9b63992a, Subject:CN=COMODO ECC Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO ECC Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:EC, Length:384, Cert Id:1146488932, Valid from:3/5/08, 9:00?PM, Valid until:1/18/38, 8:59?PM
2026-10-29T12:14:34.8375192Z 2026-10-29 09:12:10,131 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:4caaf9cadb636fe01ff74ed85b03869d, Subject:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:4096, Cert Id:1769425049, Valid from:1/18/10, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-10-29T12:14:34.8376109Z 2026-10-29 09:12:10,132 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:b931c3ad63967ea6723bfc3af9af44b, Subject:CN=DigiCert Assured ID Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:3909568913, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-10-29T12:14:34.8377089Z 2026-10-29 09:12:10,132 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:ba15afa1ddfa0b54944afcd24a06cec, Subject:CN=DigiCert Assured ID Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:EC, Length:384, Cert Id:3649430051, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-10-29T12:14:34.8378141Z 2026-10-29 09:12:10,133 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:ce7e0e517d846fe8fe560fc1bf03039, Subject:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:3434562768, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-10-29T12:14:34.8379108Z 2026-10-29 09:12:10,133 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:83be056904246b1a1756ac95991c74a, Subject:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1341898239, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-10-29T12:14:34.8379969Z 2026-10-29 09:12:10,134 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:33af1e6a711a9a0bb2864b11d09fae5, Subject:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1136084297, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-10-29T12:14:34.8380807Z 2026-10-29 09:12:10,134 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:55556bcf25ea43535c3a40fd5ab4572, Subject:CN=DigiCert Global Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:EC, Length:384, Cert Id:3498998753, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-10-29T12:14:34.8381705Z 2026-10-29 09:12:10,134 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:2ac5c266a0b409b8f0b79f2ae462577, Subject:CN=DigiCert High Assurance EV Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert High Assurance EV Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:2884286942, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-10-29T12:14:34.8382581Z 2026-10-29 09:12:10,135 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:59b1b579e8e2132e23907bda777755c, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:1057369358, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-10-29T12:14:34.8383431Z 2026-10-29 09:12:10,135 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:983f3, Subject:CN=D-TRUST Root Class 3 CA 2 2009, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST Root Class 3 CA 2 2009, O=D-Trust GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:1430153102, Valid from:11/5/09, 6:35?AM, Valid until:11/5/29, 5:35?AM
2026-10-29T12:14:34.8384318Z 2026-10-29 09:12:10,136 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:983f4, Subject:CN=D-TRUST Root Class 3 CA 2 EV 2009, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST Root Class 3 CA 2 EV 2009, O=D-Trust GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:971313728, Valid from:11/5/09, 6:50?AM, Valid until:11/5/29, 5:50?AM
2026-10-29T12:14:34.8385431Z 2026-10-29 09:12:10,136 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:3863def8, Subject:CN=Entrust.net Certification Authority (2048), OU=(c) 1999 Entrust.net Limited, OU=www.entrust.net/CPS_2048 incorp. by ref. (limits liab.), O=Entrust.net, Issuer:CN=Entrust.net Certification Authority (2048), OU=(c) 1999 Entrust.net Limited, OU=www.entrust.net/CPS_2048 incorp. by ref. (limits liab.), O=Entrust.net, Key type:RSA, Length:2048, Cert Id:3966431214, Valid from:12/24/99, 3:50?PM, Valid until:7/24/29, 11:15?AM
2026-10-29T12:14:34.8386513Z 2026-10-29 09:12:10,137 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:456b5054, Subject:CN=Entrust Root Certification Authority, OU="(c) 2006 Entrust, Inc.", OU=www.entrust.net/CPS is incorporated by reference, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority, OU="(c) 2006 Entrust, Inc.", OU=www.entrust.net/CPS is incorporated by reference, O="Entrust, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:3033563200, Valid from:11/27/06, 6:23?PM, Valid until:11/27/26, 5:53?PM
2026-10-29T12:14:34.8387535Z 2026-10-29 09:12:10,183 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:a68b79290000000050d091f9, Subject:CN=Entrust Root Certification Authority - EC1, OU="(c) 2012 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority - EC1, OU="(c) 2012 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Key type:EC, Length:384, Cert Id:924514073, Valid from:12/18/12, 1:25?PM, Valid until:12/18/37, 12:55?PM
2026-10-29T12:14:34.8388555Z 2026-10-29 09:12:10,183 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:4a538c28, Subject:CN=Entrust Root Certification Authority - G2, OU="(c) 2009 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority - G2, OU="(c) 2009 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:1936920337, Valid from:7/7/09, 2:25?PM, Valid until:12/7/30, 2:55?PM
2026-10-29T12:14:34.8389654Z 2026-10-29 09:12:10,184 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:d9b5437fafa9390f000000005565ad58, Subject:CN=Entrust Root Certification Authority - G4, OU="(c) 2015 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority - G4, OU="(c) 2015 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:1368037548, Valid from:5/27/15, 8:11?AM, Valid until:12/27/37, 8:41?AM
2026-10-29T12:14:34.8390492Z 2026-10-29 09:12:10,184 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:23456, Subject:CN=GeoTrust Global CA, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Global CA, O=GeoTrust Inc., C=US, Key type:RSA, Length:2048, Cert Id:2266349922, Valid from:5/21/02, 1:00?AM, Valid until:5/21/22, 1:00?AM
2026-10-29T12:14:34.8391359Z 2026-10-29 09:12:10,185 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:18acb56afd69b6153a636cafdafac4a1, Subject:CN=GeoTrust Primary Certification Authority, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Primary Certification Authority, O=GeoTrust Inc., C=US, Key type:RSA, Length:2048, Cert Id:3329622139, Valid from:11/26/06, 10:00?PM, Valid until:7/16/36, 8:59?PM
2026-10-29T12:14:34.8392384Z 2026-10-29 09:12:10,185 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:3cb2f4480a00e2feeb243b5e603ec36b, Subject:CN=GeoTrust Primary Certification Authority - G2, OU=(c) 2007 GeoTrust Inc. - For authorized use only, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Primary Certification Authority - G2, OU=(c) 2007 GeoTrust Inc. - For authorized use only, O=GeoTrust Inc., C=US, Key type:EC, Length:384, Cert Id:3180663474, Valid from:11/4/07, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-10-29T12:14:34.8393429Z 2026-10-29 09:12:10,185 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:15ac6e9419b2794b41f627a9c3180f1f, Subject:CN=GeoTrust Primary Certification Authority - G3, OU=(c) 2008 GeoTrust Inc. - For authorized use only, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Primary Certification Authority - G3, OU=(c) 2008 GeoTrust Inc. - For authorized use only, O=GeoTrust Inc., C=US, Key type:RSA, Length:2048, Cert Id:2964813538, Valid from:4/1/08, 9:00?PM, Valid until:12/1/37, 8:59?PM
2026-10-29T12:14:34.8394363Z 2026-10-29 09:12:10,186 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=GeoTrust Universal CA, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Universal CA, O=GeoTrust Inc., C=US, Key type:RSA, Length:4096, Cert Id:313566089, Valid from:3/4/04, 2:00?AM, Valid until:3/4/29, 2:00?AM
2026-10-29T12:14:34.8395192Z 2026-10-29 09:12:10,186 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:40000000001154b5ac394, Subject:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Key type:RSA, Length:2048, Cert Id:536948034, Valid from:9/1/98, 9:00?AM, Valid until:1/28/28, 9:00?AM
2026-10-29T12:14:34.8396082Z 2026-10-29 09:12:10,187 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withECDSA, Serial:2a38a41c960a04de42b228a50be8349802, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R4, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R4, Key type:EC, Length:256, Cert Id:2371693751, Valid from:11/12/12, 10:00?PM, Valid until:1/19/38, 12:14?AM
2026-10-29T12:14:34.8396895Z 2026-10-29 09:12:10,187 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:605949e0262ebb55f90a778a71f94ad86c, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R5, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R5, Key type:EC, Length:384, Cert Id:1997048439, Valid from:11/12/12, 10:00?PM, Valid until:1/19/38, 12:14?AM
2026-10-29T12:14:34.8397674Z 2026-10-29 09:12:10,188 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:4000000000121585308a2, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Key type:RSA, Length:2048, Cert Id:733875591, Valid from:3/18/09, 7:00?AM, Valid until:3/18/29, 7:00?AM
2026-10-29T12:14:34.8398448Z 2026-10-29 09:12:10,188 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:45e6bb038333c3856548e6ff4551, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R6, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R6, Key type:RSA, Length:4096, Cert Id:3788339543, Valid from:12/9/14, 10:00?PM, Valid until:12/9/34, 9:00?PM
2026-10-29T12:14:34.8399404Z 2026-10-29 09:12:10,188 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:0, Subject:OU=Go Daddy Class 2 Certification Authority, O="The Go Daddy Group, Inc.", C=US, Issuer:OU=Go Daddy Class 2 Certification Authority, O="The Go Daddy Group, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:4023522997, Valid from:6/29/04, 2:06?PM, Valid until:6/29/34, 2:06?PM
2026-10-29T12:14:34.8400261Z 2026-10-29 09:12:10,189 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Go Daddy Root Certificate Authority - G2, O="GoDaddy.com, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Go Daddy Root Certificate Authority - G2, O="GoDaddy.com, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:439600313, Valid from:8/31/09, 9:00?PM, Valid until:12/31/37, 8:59?PM
2026-10-29T12:14:34.8401326Z 2026-10-29 09:12:10,189 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:203e5936f31b01349886ba217, Subject:CN=GTS Root R1, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R1, O=Google Trust Services LLC, C=US, Key type:RSA, Length:4096, Cert Id:657172038, Valid from:6/21/16, 9:00?PM, Valid until:6/21/36, 9:00?PM
2026-10-29T12:14:34.8402106Z 2026-10-29 09:12:10,190 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:203e5aec58d04251aab1125aa, Subject:CN=GTS Root R2, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R2, O=Google Trust Services LLC, C=US, Key type:RSA, Length:4096, Cert Id:948387669, Valid from:6/21/16, 9:00?PM, Valid until:6/21/36, 9:00?PM
2026-10-29T12:14:34.8402861Z 2026-10-29 09:12:10,190 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:203e5b882eb20f825276d3d66, Subject:CN=GTS Root R3, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R3, O=Google Trust Services LLC, C=US, Key type:EC, Length:384, Cert Id:1163081155, Valid from:6/21/16, 9:00?PM, Valid until:6/21/36, 9:00?PM
2026-10-29T12:14:34.8404292Z 2026-10-29 09:12:10,190 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:203e5c068ef631a9c72905052, Subject:CN=GTS Root R4, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R4, O=Google Trust Services LLC, C=US, Key type:EC, Length:384, Cert Id:1326433111, Valid from:6/21/16, 9:00?PM, Valid until:6/21/36, 9:00?PM
2026-10-29T12:14:34.8405319Z 2026-10-29 09:12:10,191 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withECDSA, Serial:0, Subject:CN=Hellenic Academic and Research Institutions ECC RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Issuer:CN=Hellenic Academic and Research Institutions ECC RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Key type:EC, Length:384, Cert Id:513613456, Valid from:7/7/15, 7:37?AM, Valid until:6/30/40, 7:37?AM
2026-10-29T12:14:34.8406374Z 2026-10-29 09:12:10,191 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Hellenic Academic and Research Institutions RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Issuer:CN=Hellenic Academic and Research Institutions RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Key type:RSA, Length:4096, Cert Id:3491990565, Valid from:7/7/15, 7:11?AM, Valid until:6/30/40, 7:11?AM
2026-10-29T12:14:34.8407373Z 2026-10-29 09:12:10,192 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:a0142800000014523c844b500000002, Subject:CN=IdenTrust Commercial Root CA 1, O=IdenTrust, C=US, Issuer:CN=IdenTrust Commercial Root CA 1, O=IdenTrust, C=US, Key type:RSA, Length:4096, Cert Id:1232565210, Valid from:1/16/14, 4:12?PM, Valid until:1/16/34, 3:12?PM
2026-10-29T12:14:34.8408374Z 2026-10-29 09:12:10,192 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:a0142800000014523cf467c00000002, Subject:CN=IdenTrust Public Sector Root CA 1, O=IdenTrust, C=US, Issuer:CN=IdenTrust Public Sector Root CA 1, O=IdenTrust, C=US, Key type:RSA, Length:4096, Cert Id:2123370772, Valid from:1/16/14, 3:53?PM, Valid until:1/16/34, 2:53?PM
2026-10-29T12:14:34.8409408Z 2026-10-29 09:12:10,192 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:8210cfb0d240e3594463e0bb63828b00, Subject:CN=ISRG Root X1, O=Internet Security Research Group, C=US, Issuer:CN=ISRG Root X1, O=Internet Security Research Group, C=US, Key type:RSA, Length:4096, Cert Id:1521974916, Valid from:6/4/15, 8:04?AM, Valid until:6/4/35, 8:04?AM
2026-10-29T12:14:34.8410209Z 2026-10-29 09:12:10,193 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:a7ea6df4b449eda6a24859ee6b815d3167fbbb1, Subject:CN=LuxTrust Global Root 2, O=LuxTrust S.A., C=LU, Issuer:CN=LuxTrust Global Root 2, O=LuxTrust S.A., C=LU, Key type:RSA, Length:4096, Cert Id:3055636602, Valid from:3/5/15, 10:21?AM, Valid until:3/5/35, 10:21?AM
2026-10-29T12:14:34.8411338Z 2026-10-29 09:12:10,193 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:bb8, Subject:CN=LuxTrust Global Root, O=LuxTrust s.a., C=LU, Issuer:CN=LuxTrust Global Root, O=LuxTrust s.a., C=LU, Key type:RSA, Length:2048, Cert Id:1714819687, Valid from:3/17/11, 6:51?AM, Valid until:3/17/21, 6:51?AM
2026-10-29T12:14:34.8412218Z 2026-10-29 09:12:10,194 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:66f23daf87de8bb14aea0c573101c2ec, Subject:CN=Microsoft ECC Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft ECC Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:EC, Length:384, Cert Id:3240761285, Valid from:12/18/19, 8:06?PM, Valid until:7/18/42, 8:16?PM
2026-10-29T12:14:34.8413158Z 2026-10-29 09:12:10,194 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:1ed397095fd8b4b347701eaabe7f45b3, Subject:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:2848349048, Valid from:12/18/19, 7:51?PM, Valid until:7/18/42, 8:00?PM
2026-10-29T12:14:34.8414082Z 2026-10-29 09:12:10,194 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:3ab6508b, Subject:CN=QuoVadis Root Certification Authority, OU=Root Certification Authority, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root Certification Authority, OU=Root Certification Authority, O=QuoVadis Limited, C=BM, Key type:RSA, Length:2048, Cert Id:2412561694, Valid from:3/19/01, 3:33?PM, Valid until:3/17/21, 3:33?PM
2026-10-29T12:14:34.8414979Z 2026-10-29 09:12:10,195 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:78585f2ead2c194be3370735341328b596d46593, Subject:CN=QuoVadis Root CA 1 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 1 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:3532531262, Valid from:1/12/12, 3:27?PM, Valid until:1/12/42, 2:27?PM
2026-10-29T12:14:34.8415758Z 2026-10-29 09:12:10,195 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:509, Subject:CN=QuoVadis Root CA 2, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 2, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:338250116, Valid from:11/24/06, 4:27?PM, Valid until:11/24/31, 3:23?PM
2026-10-29T12:14:34.8416753Z 2026-10-29 09:12:10,195 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:445734245b81899b35f2ceb82b3b5ba726f07528, Subject:CN=QuoVadis Root CA 2 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 2 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:696763521, Valid from:1/12/12, 4:59?PM, Valid until:1/12/42, 3:59?PM
2026-10-29T12:14:34.8417598Z 2026-10-29 09:12:10,196 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:5c6, Subject:CN=QuoVadis Root CA 3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:1470392860, Valid from:11/24/06, 5:11?PM, Valid until:11/24/31, 4:06?PM
2026-10-29T12:14:34.8418364Z 2026-10-29 09:12:10,196 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:2ef59b0228a7db7affd5a3a9eebd03a0cf126a1d, Subject:CN=QuoVadis Root CA 3 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 3 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:3589344305, Valid from:1/12/12, 6:26?PM, Valid until:1/12/42, 5:26?PM
2026-10-29T12:14:34.8419147Z 2026-10-29 09:12:10,196 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:OU=Security Communication RootCA2, O="SECOM Trust Systems CO.,LTD.", C=JP, Issuer:OU=Security Communication RootCA2, O="SECOM Trust Systems CO.,LTD.", C=JP, Key type:RSA, Length:2048, Cert Id:1521072570, Valid from:5/29/09, 2:00?AM, Valid until:5/29/29, 2:00?AM
2026-10-29T12:14:34.8420046Z 2026-10-29 09:12:10,197 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:cf08e5c0816a5ad427ff0eb271859d0, Subject:CN=SecureTrust CA, O=SecureTrust Corporation, C=US, Issuer:CN=SecureTrust CA, O=SecureTrust Corporation, C=US, Key type:RSA, Length:2048, Cert Id:2034155325, Valid from:11/7/06, 5:31?PM, Valid until:12/31/29, 4:40?PM
2026-10-29T12:14:34.8420920Z 2026-10-29 09:12:10,197 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withECDSA, Serial:75e6dfcbc1685ba8, Subject:CN=SSL.com Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:EC, Length:384, Cert Id:2926673683, Valid from:2/12/16, 4:14?PM, Valid until:2/12/41, 3:14?PM
2026-10-29T12:14:34.8421824Z 2026-10-29 09:12:10,198 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:56b629cd34bc78f6, Subject:CN=SSL.com EV Root Certification Authority RSA R2, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com EV Root Certification Authority RSA R2, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:RSA, Length:4096, Cert Id:1381862403, Valid from:5/31/17, 3:14?PM, Valid until:5/30/42, 3:14?PM
2026-10-29T12:14:34.8422701Z 2026-10-29 09:12:10,198 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:7b2c9bd316803299, Subject:CN=SSL.com Root Certification Authority RSA, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com Root Certification Authority RSA, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:RSA, Length:4096, Cert Id:156725711, Valid from:2/12/16, 3:39?PM, Valid until:2/12/41, 2:39?PM
2026-10-29T12:14:34.8423534Z 2026-10-29 09:12:10,198 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:0, Subject:OU=Starfield Class 2 Certification Authority, O="Starfield Technologies, Inc.", C=US, Issuer:OU=Starfield Class 2 Certification Authority, O="Starfield Technologies, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:1825617644, Valid from:6/29/04, 2:39?PM, Valid until:6/29/34, 2:39?PM
2026-10-29T12:14:34.8424474Z 2026-10-29 09:12:10,199 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Starfield Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Starfield Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:3268325709, Valid from:8/31/09, 9:00?PM, Valid until:12/31/37, 8:59?PM
2026-10-29T12:14:34.8425661Z 2026-10-29 09:12:10,199 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Starfield Services Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Starfield Services Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:1964785574, Valid from:8/31/09, 9:00?PM, Valid until:12/31/37, 8:59?PM
2026-10-29T12:14:34.8426616Z 2026-10-29 09:12:10,200 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:bb401c43f55e4fb0, Subject:CN=SwissSign Gold CA - G2, O=SwissSign AG, C=CH, Issuer:CN=SwissSign Gold CA - G2, O=SwissSign AG, C=CH, Key type:RSA, Length:4096, Cert Id:1516221943, Valid from:10/25/06, 5:30?AM, Valid until:10/25/36, 5:30?AM
2026-10-29T12:14:34.8427405Z 2026-10-29 09:12:10,200 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:4eb200670c035d4f, Subject:CN=SwissSign Platinum CA - G2, O=SwissSign AG, C=CH, Issuer:CN=SwissSign Platinum CA - G2, O=SwissSign AG, C=CH, Key type:RSA, Length:4096, Cert Id:771312514, Valid from:10/25/06, 5:36?AM, Valid until:10/25/36, 5:36?AM
2026-10-29T12:14:34.8428252Z 2026-10-29 09:12:10,200 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:4f1bd42f54bb2f4b, Subject:CN=SwissSign Silver CA - G2, O=SwissSign AG, C=CH, Issuer:CN=SwissSign Silver CA - G2, O=SwissSign AG, C=CH, Key type:RSA, Length:4096, Cert Id:126726124, Valid from:10/25/06, 5:32?AM, Valid until:10/25/36, 5:32?AM
2026-10-29T12:14:34.8429006Z 2026-10-29 09:12:10,201 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:95be16a0f72e46f17b398272fa8bcd96, Subject:CN=TeliaSonera Root CA v1, O=TeliaSonera, Issuer:CN=TeliaSonera Root CA v1, O=TeliaSonera, Key type:RSA, Length:4096, Cert Id:1495358374, Valid from:10/18/07, 10:00?AM, Valid until:10/18/32, 9:00?AM
2026-10-29T12:14:34.8429963Z 2026-10-29 09:12:10,201 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:344ed55720d5edec49f42fce37db2b6d, Subject:CN=thawte Primary Root CA, OU="(c) 2006 thawte, Inc. - For authorized use only", OU=Certification Services Division, O="thawte, Inc.", C=US, Issuer:CN=thawte Primary Root CA, OU="(c) 2006 thawte, Inc. - For authorized use only", OU=Certification Services Division, O="thawte, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:643000026, Valid from:11/16/06, 10:00?PM, Valid until:7/16/36, 8:59?PM
2026-10-29T12:14:34.8430967Z 2026-10-29 09:12:10,201 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:35fc265cd9844fc93d263d579baed756, Subject:CN=thawte Primary Root CA - G2, OU="(c) 2007 thawte, Inc. - For authorized use only", O="thawte, Inc.", C=US, Issuer:CN=thawte Primary Root CA - G2, OU="(c) 2007 thawte, Inc. - For authorized use only", O="thawte, Inc.", C=US, Key type:EC, Length:384, Cert Id:2068083090, Valid from:11/4/07, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-10-29T12:14:34.8432072Z 2026-10-29 09:12:10,202 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:600197b746a7eab4b49ad64b2ff790fb, Subject:CN=thawte Primary Root CA - G3, OU="(c) 2008 thawte, Inc. - For authorized use only", OU=Certification Services Division, O="thawte, Inc.", C=US, Issuer:CN=thawte Primary Root CA - G3, OU="(c) 2008 thawte, Inc. - For authorized use only", OU=Certification Services Division, O="thawte, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:1032730720, Valid from:4/1/08, 9:00?PM, Valid until:12/1/37, 8:59?PM
2026-10-29T12:14:34.8433056Z 2026-10-29 09:12:10,202 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:1, Subject:CN=T-TeleSec GlobalRoot Class 2, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Issuer:CN=T-TeleSec GlobalRoot Class 2, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:3056503257, Valid from:10/1/08, 7:40?AM, Valid until:10/1/33, 8:59?PM
2026-10-29T12:14:34.8434049Z 2026-10-29 09:12:10,203 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:1, Subject:CN=T-TeleSec GlobalRoot Class 3, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Issuer:CN=T-TeleSec GlobalRoot Class 3, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:1894096264, Valid from:10/1/08, 7:29?AM, Valid until:10/1/33, 8:59?PM
2026-10-29T12:14:34.8434965Z 2026-10-29 09:12:10,203 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:cbe, Subject:CN=TWCA Global Root CA, OU=Root CA, O=TAIWAN-CA, C=TW, Issuer:CN=TWCA Global Root CA, OU=Root CA, O=TAIWAN-CA, C=TW, Key type:RSA, Length:4096, Cert Id:861175838, Valid from:6/27/12, 3:28?AM, Valid until:12/31/30, 12:59?PM
2026-10-29T12:14:34.8435879Z 2026-10-29 09:12:10,203 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:5c8b99c55a94c5d27156decd8980cc26, Subject:CN=USERTrust ECC Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust ECC Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:EC, Length:384, Cert Id:3329287386, Valid from:1/31/10, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-10-29T12:14:34.8436826Z 2026-10-29 09:12:10,204 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:1fd6d30fca3ca51a81bbc640e35032d, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:4096, Cert Id:3947601401, Valid from:1/31/10, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-10-29T12:14:34.8437905Z 2026-10-29 09:12:10,204 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:44be0c8b500024b411d3362de0b35f1b, Subject:CN=UTN-USERFirst-Object, OU=http://www.usertrust.com, O=The USERTRUST Network, L=Salt Lake City, ST=UT, C=US, Issuer:CN=UTN-USERFirst-Object, OU=http://www.usertrust.com, O=The USERTRUST Network, L=Salt Lake City, ST=UT, C=US, Key type:RSA, Length:2048, Cert Id:3997913868, Valid from:7/9/99, 3:31?PM, Valid until:7/9/19, 3:40?PM
2026-10-29T12:14:34.8439056Z 2026-10-29 09:12:10,204 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:9b7e0649a33e62b9d5ee90487129ef57, Subject:CN=VeriSign Class 3 Public Primary Certification Authority - G3, OU="(c) 1999 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Issuer:CN=VeriSign Class 3 Public Primary Certification Authority - G3, OU="(c) 1999 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:2057300190, Valid from:9/30/99, 9:00?PM, Valid until:7/16/36, 8:59?PM
2026-10-29T12:14:34.8440384Z 2026-10-29 09:12:10,205 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:2f80fe238c0e220f486712289187acb3, Subject:CN=VeriSign Class 3 Public Primary Certification Authority - G4, OU="(c) 2007 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Issuer:CN=VeriSign Class 3 Public Primary Certification Authority - G4, OU="(c) 2007 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Key type:EC, Length:384, Cert Id:4163473319, Valid from:11/4/07, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-10-29T12:14:34.8441553Z 2026-10-29 09:12:10,205 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:18dad19e267de8bb4a2158cdcc6b3b4a, Subject:CN=VeriSign Class 3 Public Primary Certification Authority - G5, OU="(c) 2006 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Issuer:CN=VeriSign Class 3 Public Primary Certification Authority - G5, OU="(c) 2006 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:303010488, Valid from:11/7/06, 10:00?PM, Valid until:7/16/36, 8:59?PM
2026-10-29T12:14:34.8442801Z 2026-10-29 09:12:10,206 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:401ac46421b31321030ebbe4121ac51d, Subject:CN=VeriSign Universal Root Certification Authority, OU="(c) 2008 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Issuer:CN=VeriSign Universal Root Certification Authority, OU="(c) 2008 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:2318285810, Valid from:4/1/08, 9:00?PM, Valid until:12/1/37, 8:59?PM
2026-10-29T12:14:34.8443862Z 2026-10-29 09:12:10,206 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:50946cec18ead59c4dd597ef758fa0ad, Subject:CN=XRamp Global Certification Authority, O=XRamp Security Services Inc, OU=www.xrampsecurity.com, C=US, Issuer:CN=XRamp Global Certification Authority, O=XRamp Security Services Inc, OU=www.xrampsecurity.com, C=US, Key type:RSA, Length:2048, Cert Id:3342493210, Valid from:11/1/04, 2:14?PM, Valid until:1/1/35, 2:37?AM
2026-10-29T12:14:34.8448633Z 2026-10-29 09:12:10,217 DEBUG [jdk.eve.security] (reactor-http-epoll-1)  TLSHandshake: brazilsouth-1.in.applicationinsights.azure.com:443, TLSv1.3, TLS_AES_256_GCM_SHA384, 1163172566
2026-10-29T12:14:34.8449022Z 2026-10-29 09:12:10,441 DEBUG [io.net.uti.int.log.InternalLoggerFactory] (main) Using SLF4J as the default logging framework
2026-10-29T12:14:34.8449375Z 2026-10-29 09:12:10,442 DEBUG [io.net.uti.int.InternalThreadLocalMap] (main) -Dio.netty.threadLocalMap.stringBuilder.initialSize: 1024
2026-10-29T12:14:34.8449768Z 2026-10-29 09:12:10,442 DEBUG [io.net.uti.int.InternalThreadLocalMap] (main) -Dio.netty.threadLocalMap.stringBuilder.maxSize: 4096
2026-10-29T12:14:34.8450132Z 2026-10-29 09:12:10,455 DEBUG [io.qua.arc.impl] (main) ArC DI container initialized [beans=162, observers=8]
2026-10-29T12:14:34.8450468Z 2026-10-29 09:12:10,469 DEBUG [org.hib.jpa.int.uti.LogHelper] (main) PersistenceUnitInfo [
2026-10-29T12:14:34.8450775Z 	name: <default>
2026-10-29T12:14:34.8450977Z 	persistence provider classname: null
2026-10-29T12:14:34.8451155Z 	classloader: null
2026-10-29T12:14:34.8451267Z 	excludeUnlistedClasses: true
2026-10-29T12:14:34.8451455Z 	JTA datasource: null
2026-10-29T12:14:34.8451630Z 	Non JTA datasource: null
2026-10-29T12:14:34.8451812Z 	Transaction type: JTA
2026-10-29T12:14:34.8451983Z 	PU root URL: null
2026-10-29T12:14:34.8452158Z 	Shared Cache Mode: null
2026-10-29T12:14:34.8452437Z 	Validation Mode: null
2026-10-29T12:14:34.8452683Z 	Jar files URLs []
2026-10-29T12:14:34.8452793Z 	Managed classes names [
2026-10-29T12:14:34.8452985Z 		br.com.caixa.sifap.entity.Farmaceutico
2026-10-29T12:14:34.8453187Z 		br.com.caixa.sifap.entity.RepresentacaoFarmacia
2026-10-29T12:14:34.8453394Z 		br.com.caixa.sifap.entity.SituacaoFarmacia
2026-10-29T12:14:34.8453592Z 		br.com.caixa.sifap.entity.TipoDocumentoFarmacia
2026-10-29T12:14:34.8453792Z 		br.com.caixa.sifap.entity.ControleDocumento
2026-10-29T12:14:34.8454023Z 		br.com.caixa.sifap.entity.HistoricoAnaliseDocumento
2026-10-29T12:14:34.8454317Z 		br.com.caixa.sifap.entity.RepresentacaoTecnica
2026-10-29T12:14:34.8454461Z 		br.com.caixa.sifap.entity.HistoricoAnaliseDocumentoId
2026-10-29T12:14:34.8454664Z 		br.com.caixa.sifap.entity.ItemValidacao
2026-10-29T12:14:34.8454864Z 		br.com.caixa.sifap.entity.TipoSituacaoFarmacia
2026-10-29T12:14:34.8455063Z 		io.quarkus.hibernate.orm.panache.PanacheEntity
2026-10-29T12:14:34.8455258Z 		br.com.caixa.sifap.entity.Farmacia
2026-10-29T12:14:34.8455453Z 		br.com.caixa.sifap.entity.RepresentanteFarmacia
2026-10-29T12:14:34.8455778Z 		br.com.caixa.sifap.entity.AnaliseDocumento
2026-10-29T12:14:34.8455974Z 		br.com.caixa.sifap.entity.SqlMappings
2026-10-29T12:14:34.8456098Z 		br.com.caixa.sifap.entity.FarmaciaAuxiliar
2026-10-29T12:14:34.8456317Z 		io.quarkus.hibernate.orm.panache.PanacheEntityBase
2026-10-29T12:14:34.8456571Z 		br.com.caixa.sifap.entity.TipoDocumento
2026-10-29T12:14:34.8456779Z 		br.com.caixa.sifap.entity.ItemAnaliseDocumento
2026-10-29T12:14:34.8456979Z 		br.com.caixa.sifap.entity.TipoDocumentoItemValidacao]
2026-10-29T12:14:34.8457167Z 	Mapping files names []
2026-10-29T12:14:34.8457334Z 	Properties [
2026-10-29T12:14:34.8457519Z 		jakarta.persistence.validation.mode: CALLBACK
2026-10-29T12:14:34.8457650Z 		jakarta.persistence.sharedCache.mode: null
2026-10-29T12:14:34.8457855Z 		hibernate.cache.use_second_level_cache: null
2026-10-29T12:14:34.8458066Z 		hibernate.hbm2ddl.charset_name: UTF-8
2026-10-29T12:14:34.8458391Z 		hibernate.default_batch_fetch_size: 16
2026-10-29T12:14:34.8458598Z 		hibernate.hbm2ddl.skip_default_import_file: true
2026-10-29T12:14:34.8458957Z 		jakarta.persistence.database-product-version: 13.0.5026.0
2026-10-29T12:14:34.8459163Z 		hibernate.id.optimizer.pooled.preferred: pooled-lo
2026-10-29T12:14:34.8459330Z 		hibernate.cache.use_query_cache: null
2026-10-29T12:14:34.8459521Z 		jakarta.persistence.database-product-name: Microsoft SQL Server
2026-10-29T12:14:34.8459704Z 		hibernate.id.sequence.increment_size_mismatch_strategy: null
2026-10-29T12:14:34.8459876Z 		hibernate.query.in_clause_parameter_padding: true
2026-10-29T12:14:34.8460103Z 		hibernate.order_by.default_null_ordering: none
2026-10-29T12:14:34.8460291Z 		hibernate.cache.use_reference_entries: null
2026-10-29T12:14:34.8460516Z 		hibernate.discriminator.ignore_explicit_for_joined: false
2026-10-29T12:14:34.8460689Z 		hibernate.query.plan_cache_max_size: 2048
2026-10-29T12:14:34.8460841Z 		hibernate.hbm2ddl.import_files: 
2026-10-29T12:14:34.8461010Z 		hibernate.batch_fetch_style: PADDED]
2026-10-29T12:14:34.8461260Z 2026-10-29 09:12:10,631 DEBUG [org.hib.Version] (main) HHH000412: Hibernate ORM core version 7.0.3.Final
2026-10-29T12:14:34.8461575Z 2026-10-29 09:12:10,632 DEBUG [org.hib.cfg.Environment] (main) HHH000206: 'hibernate.properties' not found
2026-10-29T12:14:34.8461923Z 2026-10-29 09:12:10,639 DEBUG [org.hib.orm.idg.factory] (main) Ignoring CDI for resolving IdentifierGenerator instances as extended or delayed CDI support was enabled
2026-10-29T12:14:34.8462278Z 2026-10-29 09:12:10,642 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [uuid2] -> [org.hibernate.id.UUIDGenerator]
2026-10-29T12:14:34.8462640Z 2026-10-29 09:12:10,642 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [guid] -> [org.hibernate.id.GUIDGenerator]
2026-10-29T12:14:34.8463047Z 2026-10-29 09:12:10,643 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [uuid] -> [org.hibernate.id.UUIDHexGenerator]
2026-10-29T12:14:34.8463402Z 2026-10-29 09:12:10,643 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [uuid.hex] -> [org.hibernate.id.UUIDHexGenerator]
2026-10-29T12:14:34.8463744Z 2026-10-29 09:12:10,643 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [assigned] -> [org.hibernate.id.Assigned]
2026-10-29T12:14:34.8464084Z 2026-10-29 09:12:10,644 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [identity] -> [org.hibernate.id.IdentityGenerator]
2026-10-29T12:14:34.8464507Z 2026-10-29 09:12:10,644 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [select] -> [org.hibernate.id.SelectGenerator]
2026-10-29T12:14:34.8464870Z 2026-10-29 09:12:10,645 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [sequence] -> [org.hibernate.id.enhanced.SequenceStyleGenerator]
2026-10-29T12:14:34.8465304Z 2026-10-29 09:12:10,645 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [increment] -> [org.hibernate.id.IncrementGenerator]
2026-10-29T12:14:34.8465748Z 2026-10-29 09:12:10,646 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [foreign] -> [org.hibernate.id.ForeignGenerator]
2026-10-29T12:14:34.8466146Z 2026-10-29 09:12:10,646 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [enhanced-sequence] -> [org.hibernate.id.enhanced.SequenceStyleGenerator]
2026-10-29T12:14:34.8466518Z 2026-10-29 09:12:10,647 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [enhanced-table] -> [org.hibernate.id.enhanced.TableGenerator]
2026-10-29T12:14:34.8466876Z 2026-10-29 09:12:10,736 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration boolean -> org.hibernate.type.BasicTypeReference@1fb00a6d
2026-10-29T12:14:34.8467272Z 2026-10-29 09:12:10,736 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration boolean -> org.hibernate.type.BasicTypeReference@1fb00a6d
2026-10-29T12:14:34.8467640Z 2026-10-29 09:12:10,736 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Boolean -> org.hibernate.type.BasicTypeReference@1fb00a6d
2026-10-29T12:14:34.8468038Z 2026-10-29 09:12:10,736 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration numeric_boolean -> org.hibernate.type.BasicTypeReference@f0d01c9
2026-10-29T12:14:34.8468424Z 2026-10-29 09:12:10,736 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.NumericBooleanConverter -> org.hibernate.type.BasicTypeReference@f0d01c9
2026-10-29T12:14:34.8468795Z 2026-10-29 09:12:10,736 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration true_false -> org.hibernate.type.BasicTypeReference@3c205259
2026-10-29T12:14:34.8469177Z 2026-10-29 09:12:10,736 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.TrueFalseConverter -> org.hibernate.type.BasicTypeReference@3c205259
2026-10-29T12:14:34.8469506Z 2026-10-29 09:12:10,736 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration yes_no -> org.hibernate.type.BasicTypeReference@5b2c41f9
2026-10-29T12:14:34.8469879Z 2026-10-29 09:12:10,736 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.YesNoConverter -> org.hibernate.type.BasicTypeReference@5b2c41f9
2026-10-29T12:14:34.8470236Z 2026-10-29 09:12:10,736 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte -> org.hibernate.type.BasicTypeReference@2f5a092e
2026-10-29T12:14:34.8470639Z 2026-10-29 09:12:10,736 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte -> org.hibernate.type.BasicTypeReference@2f5a092e
2026-10-29T12:14:34.8471004Z 2026-10-29 09:12:10,736 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Byte -> org.hibernate.type.BasicTypeReference@2f5a092e
2026-10-29T12:14:34.8471370Z 2026-10-29 09:12:10,736 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration binary -> org.hibernate.type.BasicTypeReference@3810806c
2026-10-29T12:14:34.8471723Z 2026-10-29 09:12:10,736 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte[] -> org.hibernate.type.BasicTypeReference@3810806c
2026-10-29T12:14:34.8472076Z 2026-10-29 09:12:10,736 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration [B -> org.hibernate.type.BasicTypeReference@3810806c
2026-10-29T12:14:34.8472429Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration binary_wrapper -> org.hibernate.type.BasicTypeReference@67b20b4c
2026-10-29T12:14:34.8472782Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration wrapper-binary -> org.hibernate.type.BasicTypeReference@67b20b4c
2026-10-29T12:14:34.8473134Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration image -> org.hibernate.type.BasicTypeReference@abe7d36
2026-10-29T12:14:34.8473476Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration blob -> org.hibernate.type.BasicTypeReference@740fccd2
2026-10-29T12:14:34.8473858Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Blob -> org.hibernate.type.BasicTypeReference@740fccd2
2026-10-29T12:14:34.8474289Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_blob -> org.hibernate.type.BasicTypeReference@1165a952
2026-10-29T12:14:34.8474717Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_blob_wrapper -> org.hibernate.type.BasicTypeReference@102f3f05
2026-10-29T12:14:34.8475139Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration short -> org.hibernate.type.BasicTypeReference@2a7b5925
2026-10-29T12:14:34.8475485Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration short -> org.hibernate.type.BasicTypeReference@2a7b5925
2026-10-29T12:14:34.8475842Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Short -> org.hibernate.type.BasicTypeReference@2a7b5925
2026-10-29T12:14:34.8476233Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration integer -> org.hibernate.type.BasicTypeReference@4889fbba
2026-10-29T12:14:34.8476585Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration int -> org.hibernate.type.BasicTypeReference@4889fbba
2026-10-29T12:14:34.8476944Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Integer -> org.hibernate.type.BasicTypeReference@4889fbba
2026-10-29T12:14:34.8477290Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration long -> org.hibernate.type.BasicTypeReference@31ab75a5
2026-10-29T12:14:34.8477633Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration long -> org.hibernate.type.BasicTypeReference@31ab75a5
2026-10-29T12:14:34.8477985Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Long -> org.hibernate.type.BasicTypeReference@31ab75a5
2026-10-29T12:14:34.8478300Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration float -> org.hibernate.type.BasicTypeReference@31e9d94f
2026-10-29T12:14:34.8478642Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration float -> org.hibernate.type.BasicTypeReference@31e9d94f
2026-10-29T12:14:34.8479048Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Float -> org.hibernate.type.BasicTypeReference@31e9d94f
2026-10-29T12:14:34.8479422Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration double -> org.hibernate.type.BasicTypeReference@41e76252
2026-10-29T12:14:34.8479767Z 2026-10-29 09:12:10,737 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration double -> org.hibernate.type.BasicTypeReference@41e76252
2026-10-29T12:14:34.8480118Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Double -> org.hibernate.type.BasicTypeReference@41e76252
2026-10-29T12:14:34.8480468Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration big_integer -> org.hibernate.type.BasicTypeReference@7c59cf66
2026-10-29T12:14:34.8480832Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.math.BigInteger -> org.hibernate.type.BasicTypeReference@7c59cf66
2026-10-29T12:14:34.8481263Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration big_decimal -> org.hibernate.type.BasicTypeReference@7a74672
2026-10-29T12:14:34.8481626Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.math.BigDecimal -> org.hibernate.type.BasicTypeReference@7a74672
2026-10-29T12:14:34.8482018Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration character -> org.hibernate.type.BasicTypeReference@5a8835c6
2026-10-29T12:14:34.8482363Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration char -> org.hibernate.type.BasicTypeReference@5a8835c6
2026-10-29T12:14:34.8482718Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Character -> org.hibernate.type.BasicTypeReference@5a8835c6
2026-10-29T12:14:34.8483079Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration character_nchar -> org.hibernate.type.BasicTypeReference@17c72ffa
2026-10-29T12:14:34.8483494Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration string -> org.hibernate.type.BasicTypeReference@2e1c8027
2026-10-29T12:14:34.8483858Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.String -> org.hibernate.type.BasicTypeReference@2e1c8027
2026-10-29T12:14:34.8484285Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration nstring -> org.hibernate.type.BasicTypeReference@7b43f95c
2026-10-29T12:14:34.8484647Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration characters -> org.hibernate.type.BasicTypeReference@7ef3aa21
2026-10-29T12:14:34.8485055Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration char[] -> org.hibernate.type.BasicTypeReference@7ef3aa21
2026-10-29T12:14:34.8485410Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration [C -> org.hibernate.type.BasicTypeReference@7ef3aa21
2026-10-29T12:14:34.8485769Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration wrapper-characters -> org.hibernate.type.BasicTypeReference@3962b216
2026-10-29T12:14:34.8486129Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration text -> org.hibernate.type.BasicTypeReference@31a80c88
2026-10-29T12:14:34.8486490Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ntext -> org.hibernate.type.BasicTypeReference@5a5c2889
2026-10-29T12:14:34.8486832Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration clob -> org.hibernate.type.BasicTypeReference@75566f4
2026-10-29T12:14:34.8487177Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Clob -> org.hibernate.type.BasicTypeReference@75566f4
2026-10-29T12:14:34.8487487Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration nclob -> org.hibernate.type.BasicTypeReference@6d38a81d
2026-10-29T12:14:34.8487837Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.NClob -> org.hibernate.type.BasicTypeReference@6d38a81d
2026-10-29T12:14:34.8488203Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_clob -> org.hibernate.type.BasicTypeReference@61d527ac
2026-10-29T12:14:34.8488574Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_clob_char_array -> org.hibernate.type.BasicTypeReference@380e3122
2026-10-29T12:14:34.8489150Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_clob_character_array -> org.hibernate.type.BasicTypeReference@1fc386f8
2026-10-29T12:14:34.8489536Z 2026-10-29 09:12:10,738 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_nclob -> org.hibernate.type.BasicTypeReference@3777fc44
2026-10-29T12:14:34.8489917Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_nclob_character_array -> org.hibernate.type.BasicTypeReference@7ab2e018
2026-10-29T12:14:34.8490349Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_nclob_char_array -> org.hibernate.type.BasicTypeReference@468eff41
2026-10-29T12:14:34.8490710Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration Duration -> org.hibernate.type.BasicTypeReference@78ab63b5
2026-10-29T12:14:34.8491078Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.Duration -> org.hibernate.type.BasicTypeReference@78ab63b5
2026-10-29T12:14:34.8491507Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration LocalDateTime -> org.hibernate.type.BasicTypeReference@2809e38a
2026-10-29T12:14:34.8491929Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.LocalDateTime -> org.hibernate.type.BasicTypeReference@2809e38a
2026-10-29T12:14:34.8492297Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration LocalDate -> org.hibernate.type.BasicTypeReference@16f2d883
2026-10-29T12:14:34.8492701Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.LocalDate -> org.hibernate.type.BasicTypeReference@16f2d883
2026-10-29T12:14:34.8493061Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration LocalTime -> org.hibernate.type.BasicTypeReference@69988d42
2026-10-29T12:14:34.8493426Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.LocalTime -> org.hibernate.type.BasicTypeReference@69988d42
2026-10-29T12:14:34.8493789Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetDateTime -> org.hibernate.type.BasicTypeReference@65f96d58
2026-10-29T12:14:34.8494155Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.OffsetDateTime -> org.hibernate.type.BasicTypeReference@65f96d58
2026-10-29T12:14:34.8494598Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetDateTimeWithTimezone -> org.hibernate.type.BasicTypeReference@37d8562f
2026-10-29T12:14:34.8494984Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetDateTimeWithoutTimezone -> org.hibernate.type.BasicTypeReference@614ae4eb
2026-10-29T12:14:34.8495388Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTime -> org.hibernate.type.BasicTypeReference@594f508f
2026-10-29T12:14:34.8495790Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.OffsetTime -> org.hibernate.type.BasicTypeReference@594f508f
2026-10-29T12:14:34.8496197Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTimeUtc -> org.hibernate.type.BasicTypeReference@69c51fdb
2026-10-29T12:14:34.8496615Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTimeWithTimezone -> org.hibernate.type.BasicTypeReference@68a97fc1
2026-10-29T12:14:34.8497062Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTimeWithoutTimezone -> org.hibernate.type.BasicTypeReference@63053b71
2026-10-29T12:14:34.8497431Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZonedDateTime -> org.hibernate.type.BasicTypeReference@65f3f9e2
2026-10-29T12:14:34.8497801Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.ZonedDateTime -> org.hibernate.type.BasicTypeReference@65f3f9e2
2026-10-29T12:14:34.8498239Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZonedDateTimeWithTimezone -> org.hibernate.type.BasicTypeReference@bae5e58
2026-10-29T12:14:34.8498638Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZonedDateTimeWithoutTimezone -> org.hibernate.type.BasicTypeReference@257708e
2026-10-29T12:14:34.8498995Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration date -> org.hibernate.type.BasicTypeReference@6167a456
2026-10-29T12:14:34.8499344Z 2026-10-29 09:12:10,739 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Date -> org.hibernate.type.BasicTypeReference@6167a456
2026-10-29T12:14:34.8499688Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration time -> org.hibernate.type.BasicTypeReference@66e434e8
2026-10-29T12:14:34.8500091Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Time -> org.hibernate.type.BasicTypeReference@66e434e8
2026-10-29T12:14:34.8500442Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration timestamp -> org.hibernate.type.BasicTypeReference@55300b93
2026-10-29T12:14:34.8500839Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Timestamp -> org.hibernate.type.BasicTypeReference@55300b93
2026-10-29T12:14:34.8501200Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Date -> org.hibernate.type.BasicTypeReference@55300b93
2026-10-29T12:14:34.8501550Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration calendar -> org.hibernate.type.BasicTypeReference@3b1895e
2026-10-29T12:14:34.8502113Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Calendar -> org.hibernate.type.BasicTypeReference@3b1895e
2026-10-29T12:14:34.8502490Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.GregorianCalendar -> org.hibernate.type.BasicTypeReference@3b1895e
2026-10-29T12:14:34.8502863Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration calendar_date -> org.hibernate.type.BasicTypeReference@775a5a67
2026-10-29T12:14:34.8503219Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration calendar_time -> org.hibernate.type.BasicTypeReference@8d52313
2026-10-29T12:14:34.8503573Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration instant -> org.hibernate.type.BasicTypeReference@23e3a27f
2026-10-29T12:14:34.8503931Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.Instant -> org.hibernate.type.BasicTypeReference@23e3a27f
2026-10-29T12:14:34.8504349Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration uuid -> org.hibernate.type.BasicTypeReference@2d94279f
2026-10-29T12:14:34.8504709Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.UUID -> org.hibernate.type.BasicTypeReference@2d94279f
2026-10-29T12:14:34.8505060Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration pg-uuid -> org.hibernate.type.BasicTypeReference@2d94279f
2026-10-29T12:14:34.8505411Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration uuid-binary -> org.hibernate.type.BasicTypeReference@5d957cf0
2026-10-29T12:14:34.8505762Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration uuid-char -> org.hibernate.type.BasicTypeReference@1221d607
2026-10-29T12:14:34.8506104Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration class -> org.hibernate.type.BasicTypeReference@3dc14f80
2026-10-29T12:14:34.8506457Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Class -> org.hibernate.type.BasicTypeReference@3dc14f80
2026-10-29T12:14:34.8506853Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration currency -> org.hibernate.type.BasicTypeReference@1b901f7b
2026-10-29T12:14:34.8507327Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration Currency -> org.hibernate.type.BasicTypeReference@1b901f7b
2026-10-29T12:14:34.8507707Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Currency -> org.hibernate.type.BasicTypeReference@1b901f7b
2026-10-29T12:14:34.8508026Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration locale -> org.hibernate.type.BasicTypeReference@400d1c30
2026-10-29T12:14:34.8508387Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Locale -> org.hibernate.type.BasicTypeReference@400d1c30
2026-10-29T12:14:34.8508744Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration serializable -> org.hibernate.type.BasicTypeReference@663e1144
2026-10-29T12:14:34.8509150Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.io.Serializable -> org.hibernate.type.BasicTypeReference@663e1144
2026-10-29T12:14:34.8509501Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration timezone -> org.hibernate.type.BasicTypeReference@2041c9a3
2026-10-29T12:14:34.8509856Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.TimeZone -> org.hibernate.type.BasicTypeReference@2041c9a3
2026-10-29T12:14:34.8510210Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZoneOffset -> org.hibernate.type.BasicTypeReference@52a2e2fb
2026-10-29T12:14:34.8510567Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.ZoneOffset -> org.hibernate.type.BasicTypeReference@52a2e2fb
2026-10-29T12:14:34.8511042Z 2026-10-29 09:12:10,740 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration url -> org.hibernate.type.BasicTypeReference@1164990a
2026-10-29T12:14:34.8511403Z 2026-10-29 09:12:10,741 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.net.URL -> org.hibernate.type.BasicTypeReference@1164990a
2026-10-29T12:14:34.8511749Z 2026-10-29 09:12:10,741 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration vector -> org.hibernate.type.BasicTypeReference@346a2799
2026-10-29T12:14:34.8512099Z 2026-10-29 09:12:10,741 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration float_vector -> org.hibernate.type.BasicTypeReference@75b4db22
2026-10-29T12:14:34.8512452Z 2026-10-29 09:12:10,741 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration double_vector -> org.hibernate.type.BasicTypeReference@23909b3
2026-10-29T12:14:34.8512800Z 2026-10-29 09:12:10,741 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte_vector -> org.hibernate.type.BasicTypeReference@4a490518
2026-10-29T12:14:34.8513155Z 2026-10-29 09:12:10,741 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration row_version -> org.hibernate.type.BasicTypeReference@32ae11c9
2026-10-29T12:14:34.8513499Z 2026-10-29 09:12:10,747 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration object -> org.hibernate.type.JavaObjectType@7f6a6d46
2026-10-29T12:14:34.8513852Z 2026-10-29 09:12:10,747 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Object -> org.hibernate.type.JavaObjectType@7f6a6d46
2026-10-29T12:14:34.8514250Z 2026-10-29 09:12:10,748 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration null -> org.hibernate.type.NullType@5857d723
2026-10-29T12:14:34.8514609Z 2026-10-29 09:12:10,748 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_date -> org.hibernate.type.BasicTypeReference@294a3f2a
2026-10-29T12:14:34.8514997Z 2026-10-29 09:12:10,748 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_time -> org.hibernate.type.BasicTypeReference@84e43fb
2026-10-29T12:14:34.8515354Z 2026-10-29 09:12:10,748 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_timestamp -> org.hibernate.type.BasicTypeReference@37a14aa1
2026-10-29T12:14:34.8515708Z 2026-10-29 09:12:10,748 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_calendar -> org.hibernate.type.BasicTypeReference@106f2425
2026-10-29T12:14:34.8516066Z 2026-10-29 09:12:10,748 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_calendar_date -> org.hibernate.type.BasicTypeReference@362fd4e9
2026-10-29T12:14:34.8517576Z 2026-10-29 09:12:10,748 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_calendar_time -> org.hibernate.type.BasicTypeReference@1299c874
2026-10-29T12:14:34.8517935Z 2026-10-29 09:12:10,748 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_binary -> org.hibernate.type.BasicTypeReference@629cf53c
2026-10-29T12:14:34.8518342Z 2026-10-29 09:12:10,748 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_serializable -> org.hibernate.type.BasicTypeReference@3182143c
2026-10-29T12:14:34.8518709Z 2026-10-29 09:12:10,751 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting Scanner [io.quarkus.hibernate.orm.runtime.boot.scan.QuarkusScanner@1248f83] into BootstrapContext; was [null]
2026-10-29T12:14:34.8519157Z 2026-10-29 09:12:10,752 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting ScanEnvironment [org.hibernate.jpa.boot.internal.StandardJpaScanEnvironmentImpl@6e149395] into BootstrapContext; was [null]
2026-10-29T12:14:34.8519658Z 2026-10-29 09:12:10,752 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting ScanOptions [org.hibernate.boot.archive.scan.internal.StandardScanOptions@6cfac0bd] into BootstrapContext; was [org.hibernate.boot.archive.scan.internal.StandardScanOptions@549debdb]
2026-10-29T12:14:34.8520223Z 2026-10-29 09:12:10,757 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting JPA temp ClassLoader [null] into BootstrapContext; was [null]
2026-10-29T12:14:34.8520536Z 2026-10-29 09:12:10,757 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) ClassLoaderAccessImpl#injectTempClassLoader(null) [was null]
2026-10-29T12:14:34.8520879Z 2026-10-29 09:12:10,803 DEBUG [org.hib.orm.dialect] (main) HHH035001: Using dialect: org.hibernate.dialect.SQLServerDialect, version: 13.0
2026-10-29T12:14:34.8521409Z 2026-10-29 09:12:10,809 DEBUG [org.hib.eng.jdb.env.spi.IdentifierHelperBuilder] (main) IdentifierCaseStrategy for both quoted and unquoted identifiers was set to the same strategy [MIXED]; that will likely lead to problems in schema update and validation if using quoted identifiers
2026-10-29T12:14:34.8521807Z 2026-10-29 09:12:10,813 DEBUG [org.hib.orm.jdb.lob] (main) HHH10010002: Disabling contextual LOB creation as connection was null
2026-10-29T12:14:34.8522096Z 2026-10-29 09:12:10,820 DEBUG [org.hib.orm.con.pooling] (main) HHH10001005: Database info:
2026-10-29T12:14:34.8522283Z 	Database JDBC URL [undefined/unknown]
2026-10-29T12:14:34.8522437Z 	Database driver: undefined/unknown
2026-10-29T12:14:34.8522586Z 	Database version: 13.0
2026-10-29T12:14:34.8522729Z 	Autocommit mode: undefined/unknown
2026-10-29T12:14:34.8522873Z 	Isolation level: <unknown>
2026-10-29T12:14:34.8523017Z 	Minimum pool size: undefined/unknown
2026-10-29T12:14:34.8523133Z 	Maximum pool size: undefined/unknown
2026-10-29T12:14:34.8523452Z 2026-10-29 09:12:10,829 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(NCharTypeDescriptor) replaced previous registration(CharTypeDescriptor)
2026-10-29T12:14:34.8523918Z 2026-10-29 09:12:10,829 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(NVarcharTypeDescriptor) replaced previous registration(VarcharTypeDescriptor)
2026-10-29T12:14:34.8524392Z 2026-10-29 09:12:10,829 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(LongNVarcharTypeDescriptor) replaced previous registration(LongVarcharTypeDescriptor)
2026-10-29T12:14:34.8524876Z 2026-10-29 09:12:10,831 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(NClobTypeDescriptor(DEFAULT)) replaced previous registration(ClobTypeDescriptor(DEFAULT))
2026-10-29T12:14:34.8525266Z 2026-10-29 09:12:10,832 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(TimestampUtcDescriptor) replaced previous registration(TimestampUtcDescriptor)
2026-10-29T12:14:34.8525651Z 2026-10-29 09:12:10,833 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(-6, TinyIntTypeDescriptor) replaced previous registration(TinyIntTypeDescriptor)
2026-10-29T12:14:34.8526027Z 2026-10-29 09:12:10,838 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.DurationType -> basicType@1(java.time.Duration,3015)
2026-10-29T12:14:34.8526377Z 2026-10-29 09:12:10,839 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration Duration -> basicType@1(java.time.Duration,3015)
2026-10-29T12:14:34.8526761Z 2026-10-29 09:12:10,839 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.Duration -> basicType@1(java.time.Duration,3015)
2026-10-29T12:14:34.8527225Z 2026-10-29 09:12:10,842 DEBUG [org.hib.typ.spi.TypeConfiguration$Scope] (main) Scoping TypeConfiguration [org.hibernate.type.spi.TypeConfiguration@1e2bc241] to MetadataBuildingContext [org.hibernate.boot.internal.MetadataBuildingContextRootImpl@543196f9]
2026-10-29T12:14:34.8527680Z 2026-10-29 09:12:10,863 DEBUG [org.hib.boo.mod.rel.Namespace] (main) Created database namespace [logicalName=Name{catalog=null, schema=null}, physicalName=Name{catalog=null, schema=null}]
2026-10-29T12:14:34.8528271Z 2026-10-29 09:12:10,866 DEBUG [org.hib.boo.mod.sou.int.ann.AnnotationMetadataSourceProcessorImpl] (main) Skipping explicit MappedSuperclass io.quarkus.hibernate.orm.panache.PanacheEntity, the class will be discovered analyzing the implementing class
2026-10-29T12:14:34.8528733Z 2026-10-29 09:12:10,896 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.TipoDocumentoItemValidacao
2026-10-29T12:14:34.8529064Z 2026-10-29 09:12:10,900 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name TipoDocumentoItemValidacao
2026-10-29T12:14:34.8529444Z 2026-10-29 09:12:10,903 DEBUG [org.hib.boo.mod.rel.Namespace] (main) Created database namespace [logicalName=Name{catalog=FAPDB001, schema=dbo}, physicalName=Name{catalog=FAPDB001, schema=dbo}]
2026-10-29T12:14:34.8529933Z 2026-10-29 09:12:10,906 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.TipoDocumentoItemValidacao on table FAPTB017_TIPO_DCMTO_ITM_VLDCO
2026-10-29T12:14:34.8530291Z 2026-10-29 09:12:10,913 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29T12:14:34.8530627Z 2026-10-29 09:12:10,932 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DCMTO_ITM_VLDCO')
2026-10-29T12:14:34.8531001Z 2026-10-29 09:12:10,933 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao] is safe
2026-10-29T12:14:34.8531432Z 2026-10-29 09:12:10,933 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoDocumentoItemValidacao
2026-10-29T12:14:34.8531808Z 2026-10-29 09:12:10,935 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDcmtoItmVldco with lazy=false
2026-10-29T12:14:34.8532244Z 2026-10-29 09:12:10,938 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao:nuTipoDcmtoItmVldco]
2026-10-29T12:14:34.8532626Z 2026-10-29 09:12:10,942 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDcmtoItmVldco
2026-10-29T12:14:34.8533001Z 2026-10-29 09:12:10,944 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB017_TIPO_DCMTO_ITM_VLDCO.NU_TIPO_DCMTO_ITM_VLDCO
2026-10-29T12:14:34.8533316Z 2026-10-29 09:12:10,944 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDcmtoItmVldco
2026-10-29T12:14:34.8533637Z 2026-10-29 09:12:10,948 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_JUSTIFICATIVA_PADRAO')
2026-10-29T12:14:34.8533980Z 2026-10-29 09:12:10,948 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deJustificativaPadrao with lazy=false
2026-10-29T12:14:34.8534484Z 2026-10-29 09:12:10,948 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao:deJustificativaPadrao]
2026-10-29T12:14:34.8535074Z 2026-10-29 09:12:10,949 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deJustificativaPadrao
2026-10-29T12:14:34.8535567Z 2026-10-29 09:12:10,949 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB017_TIPO_DCMTO_ITM_VLDCO.DE_JUSTIFICATIVA_PADRAO
2026-10-29T12:14:34.8535890Z 2026-10-29 09:12:10,949 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deJustificativaPadrao
2026-10-29T12:14:34.8536248Z 2026-10-29 09:12:10,951 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_ITEM_VALIDACAO',referencedColumn='NU_ITEM_VALIDACAO')
2026-10-29T12:14:34.8536583Z 2026-10-29 09:12:10,953 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8536875Z 2026-10-29 09:12:10,956 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property itemValidacao
2026-10-29T12:14:34.8537194Z 2026-10-29 09:12:10,957 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_ITEM_VALIDACAO')
2026-10-29T12:14:34.8537603Z 2026-10-29 09:12:10,957 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuItemValidacao with lazy=false
2026-10-29T12:14:34.8538046Z 2026-10-29 09:12:10,957 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao:nuItemValidacao]
2026-10-29T12:14:34.8538426Z 2026-10-29 09:12:10,957 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuItemValidacao
2026-10-29T12:14:34.8538756Z 2026-10-29 09:12:10,957 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB017_TIPO_DCMTO_ITM_VLDCO.NU_ITEM_VALIDACAO
2026-10-29T12:14:34.8539071Z 2026-10-29 09:12:10,957 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuItemValidacao
2026-10-29T12:14:34.8539383Z 2026-10-29 09:12:10,957 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DOCUMENTO')
2026-10-29T12:14:34.8539719Z 2026-10-29 09:12:10,957 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDocumento with lazy=false
2026-10-29T12:14:34.8540148Z 2026-10-29 09:12:10,957 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao:nuTipoDocumento]
2026-10-29T12:14:34.8540593Z 2026-10-29 09:12:10,957 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDocumento
2026-10-29T12:14:34.8540931Z 2026-10-29 09:12:10,957 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB017_TIPO_DCMTO_ITM_VLDCO.NU_TIPO_DOCUMENTO
2026-10-29T12:14:34.8541234Z 2026-10-29 09:12:10,957 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDocumento
2026-10-29T12:14:34.8541595Z 2026-10-29 09:12:10,958 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_TIPO_DOCUMENTO',referencedColumn='NU_TIPO_DOCUMENTO')
2026-10-29T12:14:34.8541958Z 2026-10-29 09:12:10,958 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8542213Z 2026-10-29 09:12:10,958 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tipoDocumento
2026-10-29T12:14:34.8542560Z 2026-10-29 09:12:10,958 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29T12:14:34.8542927Z 2026-10-29 09:12:10,963 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.AnaliseDocumento
2026-10-29T12:14:34.8543249Z 2026-10-29 09:12:10,963 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name AnaliseDocumento
2026-10-29T12:14:34.8543590Z 2026-10-29 09:12:10,964 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.AnaliseDocumento on table FAPTB019_ANALISE_DOCUMENTO
2026-10-29T12:14:34.8543962Z 2026-10-29 09:12:10,964 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29T12:14:34.8544355Z 2026-10-29 09:12:10,969 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_SQNCL_ANALISE_DOCUMENTO')
2026-10-29T12:14:34.8544729Z 2026-10-29 09:12:10,969 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.AnaliseDocumento] is safe
2026-10-29T12:14:34.8545146Z 2026-10-29 09:12:10,969 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.AnaliseDocumento
2026-10-29T12:14:34.8545524Z 2026-10-29 09:12:10,969 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuSqnclAnaliseDocumento with lazy=false
2026-10-29T12:14:34.8545950Z 2026-10-29 09:12:10,970 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:nuSqnclAnaliseDocumento]
2026-10-29T12:14:34.8546327Z 2026-10-29 09:12:10,970 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuSqnclAnaliseDocumento
2026-10-29T12:14:34.8546786Z 2026-10-29 09:12:10,970 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.NU_SQNCL_ANALISE_DOCUMENTO
2026-10-29T12:14:34.8547157Z 2026-10-29 09:12:10,970 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuSqnclAnaliseDocumento
2026-10-29T12:14:34.8547520Z 2026-10-29 09:12:10,971 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_SQNCL_ANALISE_DOCUMENTO)]), nuSqnclAnaliseDocumento, identity, , ...)
2026-10-29T12:14:34.8547873Z 2026-10-29 09:12:10,983 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_CPF_CNPJ_DOCUMENTO')
2026-10-29T12:14:34.8548212Z 2026-10-29 09:12:10,983 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coCpfCnpjDocumento with lazy=false
2026-10-29T12:14:34.8548634Z 2026-10-29 09:12:10,983 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:coCpfCnpjDocumento]
2026-10-29T12:14:34.8549013Z 2026-10-29 09:12:10,983 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coCpfCnpjDocumento
2026-10-29T12:14:34.8549341Z 2026-10-29 09:12:10,983 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.CO_CPF_CNPJ_DOCUMENTO
2026-10-29T12:14:34.8549652Z 2026-10-29 09:12:10,983 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coCpfCnpjDocumento
2026-10-29T12:14:34.8549944Z 2026-10-29 09:12:10,983 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ANALISE_DOCUMENTO')
2026-10-29T12:14:34.8550395Z 2026-10-29 09:12:10,983 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAnaliseDocumento with lazy=false
2026-10-29T12:14:34.8550931Z 2026-10-29 09:12:10,983 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:coUsuarioAnaliseDocumento]
2026-10-29T12:14:34.8551316Z 2026-10-29 09:12:10,983 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAnaliseDocumento
2026-10-29T12:14:34.8551659Z 2026-10-29 09:12:10,983 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.CO_USUARIO_ANALISE_DOCUMENTO
2026-10-29T12:14:34.8552001Z 2026-10-29 09:12:10,983 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAnaliseDocumento
2026-10-29T12:14:34.8552385Z 2026-10-29 09:12:10,984 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_JUSTIFICATIVA')
2026-10-29T12:14:34.8552760Z 2026-10-29 09:12:10,984 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deJustificativa with lazy=false
2026-10-29T12:14:34.8553175Z 2026-10-29 09:12:10,984 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:deJustificativa]
2026-10-29T12:14:34.8553537Z 2026-10-29 09:12:10,984 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deJustificativa
2026-10-29T12:14:34.8553858Z 2026-10-29 09:12:10,984 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.DE_JUSTIFICATIVA
2026-10-29T12:14:34.8554162Z 2026-10-29 09:12:10,984 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deJustificativa
2026-10-29T12:14:34.8554552Z 2026-10-29 09:12:10,984 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_ANALISE_DOCUMENTO')
2026-10-29T12:14:34.8554890Z 2026-10-29 09:12:10,984 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhAnaliseDocumento with lazy=false
2026-10-29T12:14:34.8555379Z 2026-10-29 09:12:10,984 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:dhAnaliseDocumento]
2026-10-29T12:14:34.8555751Z 2026-10-29 09:12:10,984 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhAnaliseDocumento
2026-10-29T12:14:34.8556082Z 2026-10-29 09:12:10,984 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.DH_ANALISE_DOCUMENTO
2026-10-29T12:14:34.8556390Z 2026-10-29 09:12:10,984 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhAnaliseDocumento
2026-10-29T12:14:34.8556712Z 2026-10-29 09:12:10,984 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_FIM_ANALISE_DOCUMENTO')
2026-10-29T12:14:34.8557045Z 2026-10-29 09:12:10,984 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhFimAnaliseDocumento with lazy=false
2026-10-29T12:14:34.8557438Z 2026-10-29 09:12:10,984 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:dhFimAnaliseDocumento]
2026-10-29T12:14:34.8557809Z 2026-10-29 09:12:10,984 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhFimAnaliseDocumento
2026-10-29T12:14:34.8558144Z 2026-10-29 09:12:10,985 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.DH_FIM_ANALISE_DOCUMENTO
2026-10-29T12:14:34.8558461Z 2026-10-29 09:12:10,985 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhFimAnaliseDocumento
2026-10-29T12:14:34.8558896Z 2026-10-29 09:12:10,985 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_ANALISE_DOCUMENTO')
2026-10-29T12:14:34.8559238Z 2026-10-29 09:12:10,985 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icAnaliseDocumento with lazy=false
2026-10-29T12:14:34.8559715Z 2026-10-29 09:12:10,985 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:icAnaliseDocumento]
2026-10-29T12:14:34.8560081Z 2026-10-29 09:12:10,985 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icAnaliseDocumento
2026-10-29T12:14:34.8560477Z 2026-10-29 09:12:10,985 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.IC_ANALISE_DOCUMENTO
2026-10-29T12:14:34.8560793Z 2026-10-29 09:12:10,985 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icAnaliseDocumento
2026-10-29T12:14:34.8561232Z 2026-10-29 09:12:10,985 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_CPF_CNPJ_DOCUMENTO')
2026-10-29T12:14:34.8561657Z 2026-10-29 09:12:10,985 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icCpfCnpjDocumento with lazy=false
2026-10-29T12:14:34.8562073Z 2026-10-29 09:12:10,985 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:icCpfCnpjDocumento]
2026-10-29T12:14:34.8562440Z 2026-10-29 09:12:10,985 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icCpfCnpjDocumento
2026-10-29T12:14:34.8562766Z 2026-10-29 09:12:10,985 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.IC_CPF_CNPJ_DOCUMENTO
2026-10-29T12:14:34.8563323Z 2026-10-29 09:12:10,985 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icCpfCnpjDocumento
2026-10-29T12:14:34.8563695Z 2026-10-29 09:12:10,986 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_USUARIO_ANALISE_DOCUMENTO')
2026-10-29T12:14:34.8564061Z 2026-10-29 09:12:10,986 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icUsuarioAnaliseDocumento with lazy=false
2026-10-29T12:14:34.8564546Z 2026-10-29 09:12:10,986 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:icUsuarioAnaliseDocumento]
2026-10-29T12:14:34.8564926Z 2026-10-29 09:12:10,986 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icUsuarioAnaliseDocumento
2026-10-29T12:14:34.8565269Z 2026-10-29 09:12:10,986 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.IC_USUARIO_ANALISE_DOCUMENTO
2026-10-29T12:14:34.8565590Z 2026-10-29 09:12:10,986 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icUsuarioAnaliseDocumento
2026-10-29T12:14:34.8565859Z 2026-10-29 09:12:10,986 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29T12:14:34.8566149Z 2026-10-29 09:12:10,986 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8566463Z 2026-10-29 09:12:10,996 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: IndexColumn(column='itensAnalise_ORDER')
2026-10-29T12:14:34.8566765Z 2026-10-29 09:12:10,998 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8567078Z 2026-10-29 09:12:10,998 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='itensAnalise_KEY')
2026-10-29T12:14:34.8567407Z 2026-10-29 09:12:10,998 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='itensAnalise_KEY')
2026-10-29T12:14:34.8567763Z 2026-10-29 09:12:10,999 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29T12:14:34.8568059Z 2026-10-29 09:12:10,999 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29T12:14:34.8568505Z 2026-10-29 09:12:11,001 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Collection role: br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise
2026-10-29T12:14:34.8568815Z 2026-10-29 09:12:11,002 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property itensAnalise
2026-10-29T12:14:34.8569141Z 2026-10-29 09:12:11,002 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_IDENTIFICADOR_DOCUMENTO')
2026-10-29T12:14:34.8569483Z 2026-10-29 09:12:11,002 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuIdentificadorDocumento with lazy=false
2026-10-29T12:14:34.8569910Z 2026-10-29 09:12:11,002 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:nuIdentificadorDocumento]
2026-10-29T12:14:34.8570402Z 2026-10-29 09:12:11,002 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuIdentificadorDocumento
2026-10-29T12:14:34.8570741Z 2026-10-29 09:12:11,002 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.NU_IDENTIFICADOR_DOCUMENTO
2026-10-29T12:14:34.8571061Z 2026-10-29 09:12:11,002 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuIdentificadorDocumento
2026-10-29T12:14:34.8571381Z 2026-10-29 09:12:11,002 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DOCUMENTO')
2026-10-29T12:14:34.8571678Z 2026-10-29 09:12:11,003 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDocumento with lazy=false
2026-10-29T12:14:34.8572092Z 2026-10-29 09:12:11,003 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:nuTipoDocumento]
2026-10-29T12:14:34.8572529Z 2026-10-29 09:12:11,003 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDocumento
2026-10-29T12:14:34.8572867Z 2026-10-29 09:12:11,003 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.NU_TIPO_DOCUMENTO
2026-10-29T12:14:34.8573167Z 2026-10-29 09:12:11,003 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDocumento
2026-10-29T12:14:34.8573516Z 2026-10-29 09:12:11,003 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_TIPO_DOCUMENTO',referencedColumn='NU_TIPO_DOCUMENTO')
2026-10-29T12:14:34.8573840Z 2026-10-29 09:12:11,003 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8574122Z 2026-10-29 09:12:11,003 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tipoDocumento
2026-10-29T12:14:34.8574519Z 2026-10-29 09:12:11,003 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_FIM_PERIODO')
2026-10-29T12:14:34.8574850Z 2026-10-29 09:12:11,003 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsFimPeriodo with lazy=false
2026-10-29T12:14:34.8575263Z 2026-10-29 09:12:11,003 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:tsFimPeriodo]
2026-10-29T12:14:34.8575621Z 2026-10-29 09:12:11,003 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsFimPeriodo
2026-10-29T12:14:34.8575942Z 2026-10-29 09:12:11,003 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.TS_FIM_PERIODO
2026-10-29T12:14:34.8576251Z 2026-10-29 09:12:11,003 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsFimPeriodo
2026-10-29T12:14:34.8576611Z 2026-10-29 09:12:11,003 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_PERIODO')
2026-10-29T12:14:34.8577012Z 2026-10-29 09:12:11,003 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioPeriodo with lazy=false
2026-10-29T12:14:34.8577431Z 2026-10-29 09:12:11,003 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:tsInicioPeriodo]
2026-10-29T12:14:34.8577791Z 2026-10-29 09:12:11,004 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioPeriodo
2026-10-29T12:14:34.8578112Z 2026-10-29 09:12:11,004 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.TS_INICIO_PERIODO
2026-10-29T12:14:34.8578381Z 2026-10-29 09:12:11,004 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioPeriodo
2026-10-29T12:14:34.8578770Z 2026-10-29 09:12:11,004 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29T12:14:34.8579135Z 2026-10-29 09:12:11,005 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.TipoDocumentoFarmacia
2026-10-29T12:14:34.8579451Z 2026-10-29 09:12:11,005 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name TipoDocumentoFarmacia
2026-10-29T12:14:34.8579820Z 2026-10-29 09:12:11,006 DEBUG [org.hib.boo.mod.rel.Namespace] (main) Created database namespace [logicalName=Name{catalog=null, schema=dbo}, physicalName=Name{catalog=null, schema=dbo}]
2026-10-29T12:14:34.8580210Z 2026-10-29 09:12:11,006 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.TipoDocumentoFarmacia on table FAPTB006_TIPO_DOCUMENTO
2026-10-29T12:14:34.8580806Z 2026-10-29 09:12:11,006 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29T12:14:34.8581139Z 2026-10-29 09:12:11,007 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DOCUMENTO')
2026-10-29T12:14:34.8581507Z 2026-10-29 09:12:11,007 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoDocumentoFarmacia] is safe
2026-10-29T12:14:34.8581942Z 2026-10-29 09:12:11,007 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoDocumentoFarmacia
2026-10-29T12:14:34.8582320Z 2026-10-29 09:12:11,007 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDocumento with lazy=false
2026-10-29T12:14:34.8582753Z 2026-10-29 09:12:11,007 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoFarmacia:nuTipoDocumento]
2026-10-29T12:14:34.8583129Z 2026-10-29 09:12:11,007 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDocumento
2026-10-29T12:14:34.8583666Z 2026-10-29 09:12:11,007 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.NU_TIPO_DOCUMENTO
2026-10-29T12:14:34.8583994Z 2026-10-29 09:12:11,007 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDocumento
2026-10-29T12:14:34.8584423Z 2026-10-29 09:12:11,007 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_TIPOLOGIA_DOCUMENTO')
2026-10-29T12:14:34.8584777Z 2026-10-29 09:12:11,007 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coTipologiaDocumento with lazy=false
2026-10-29T12:14:34.8585318Z 2026-10-29 09:12:11,007 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoFarmacia:coTipologiaDocumento]
2026-10-29T12:14:34.8585753Z 2026-10-29 09:12:11,008 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coTipologiaDocumento
2026-10-29T12:14:34.8586086Z 2026-10-29 09:12:11,008 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.CO_TIPOLOGIA_DOCUMENTO
2026-10-29T12:14:34.8586461Z 2026-10-29 09:12:11,008 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coTipologiaDocumento
2026-10-29T12:14:34.8586798Z 2026-10-29 09:12:11,008 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_TIPO_DOCUMENTO_FARMACIA')
2026-10-29T12:14:34.8587190Z 2026-10-29 09:12:11,008 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deTipoDocumentoFarmacia with lazy=false
2026-10-29T12:14:34.8587636Z 2026-10-29 09:12:11,008 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoFarmacia:deTipoDocumentoFarmacia]
2026-10-29T12:14:34.8588063Z 2026-10-29 09:12:11,008 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deTipoDocumentoFarmacia
2026-10-29T12:14:34.8588398Z 2026-10-29 09:12:11,008 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.DE_TIPO_DOCUMENTO_FARMACIA
2026-10-29T12:14:34.8588712Z 2026-10-29 09:12:11,008 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deTipoDocumentoFarmacia
2026-10-29T12:14:34.8589038Z 2026-10-29 09:12:11,008 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_CLASSE_TIPO_DOCUMENTO')
2026-10-29T12:14:34.8589343Z 2026-10-29 09:12:11,008 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icClasseTipoDocumento with lazy=false
2026-10-29T12:14:34.8589841Z 2026-10-29 09:12:11,008 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoFarmacia:icClasseTipoDocumento]
2026-10-29T12:14:34.8590221Z 2026-10-29 09:12:11,008 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icClasseTipoDocumento
2026-10-29T12:14:34.8590555Z 2026-10-29 09:12:11,008 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.IC_CLASSE_TIPO_DOCUMENTO
2026-10-29T12:14:34.8590869Z 2026-10-29 09:12:11,008 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icClasseTipoDocumento
2026-10-29T12:14:34.8591194Z 2026-10-29 09:12:11,008 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_DOCUMENTO_OBRIGATORIO')
2026-10-29T12:14:34.8591533Z 2026-10-29 09:12:11,008 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icDocumentoObrigatorio with lazy=false
2026-10-29T12:14:34.8591966Z 2026-10-29 09:12:11,008 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoFarmacia:icDocumentoObrigatorio]
2026-10-29T12:14:34.8592414Z 2026-10-29 09:12:11,008 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icDocumentoObrigatorio
2026-10-29T12:14:34.8592755Z 2026-10-29 09:12:11,008 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.IC_DOCUMENTO_OBRIGATORIO
2026-10-29T12:14:34.8593062Z 2026-10-29 09:12:11,008 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icDocumentoObrigatorio
2026-10-29T12:14:34.8593412Z 2026-10-29 09:12:11,008 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29T12:14:34.8593807Z 2026-10-29 09:12:11,010 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.RepresentacaoFarmacia
2026-10-29T12:14:34.8594296Z 2026-10-29 09:12:11,010 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name RepresentacaoFarmacia
2026-10-29T12:14:34.8594656Z 2026-10-29 09:12:11,010 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.RepresentacaoFarmacia on table FAPTB011_RPRTO_FARMACIA
2026-10-29T12:14:34.8595000Z 2026-10-29 09:12:11,010 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29T12:14:34.8595334Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_REPRESENTACAO_FARMACIA')
2026-10-29T12:14:34.8595698Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.RepresentacaoFarmacia] is safe
2026-10-29T12:14:34.8596119Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.RepresentacaoFarmacia
2026-10-29T12:14:34.8596530Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuRepresentacaoFarmacia with lazy=false
2026-10-29T12:14:34.8596969Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:nuRepresentacaoFarmacia]
2026-10-29T12:14:34.8597354Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuRepresentacaoFarmacia
2026-10-29T12:14:34.8597686Z 2026-10-29 09:12:11,012 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.NU_REPRESENTACAO_FARMACIA
2026-10-29T12:14:34.8597968Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuRepresentacaoFarmacia
2026-10-29T12:14:34.8598336Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_REPRESENTACAO_FARMACIA)]), nuRepresentacaoFarmacia, identity, , ...)
2026-10-29T12:14:34.8598764Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ACAO_REPRESENTACAO')
2026-10-29T12:14:34.8599113Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAcaoRepresentacao with lazy=false
2026-10-29T12:14:34.8599548Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:coUsuarioAcaoRepresentacao]
2026-10-29T12:14:34.8599939Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAcaoRepresentacao
2026-10-29T12:14:34.8600328Z 2026-10-29 09:12:11,012 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.CO_USUARIO_ACAO_REPRESENTACAO
2026-10-29T12:14:34.8600652Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAcaoRepresentacao
2026-10-29T12:14:34.8600981Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_EMAIL_REPRESENTANTE')
2026-10-29T12:14:34.8601317Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEmailRepresentante with lazy=false
2026-10-29T12:14:34.8601740Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:deEmailRepresentante]
2026-10-29T12:14:34.8602114Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEmailRepresentante
2026-10-29T12:14:34.8602486Z 2026-10-29 09:12:11,012 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.DE_EMAIL_REPRESENTANTE
2026-10-29T12:14:34.8602798Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEmailRepresentante
2026-10-29T12:14:34.8603123Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_ENDERECO_IP_REPRESENTACAO')
2026-10-29T12:14:34.8603467Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEnderecoIpRepresentacao with lazy=false
2026-10-29T12:14:34.8603894Z 2026-10-29 09:12:11,012 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:deEnderecoIpRepresentacao]
2026-10-29T12:14:34.8604328Z 2026-10-29 09:12:11,013 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEnderecoIpRepresentacao
2026-10-29T12:14:34.8604702Z 2026-10-29 09:12:11,013 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.DE_ENDERECO_IP_REPRESENTACAO
2026-10-29T12:14:34.8605017Z 2026-10-29 09:12:11,013 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEnderecoIpRepresentacao
2026-10-29T12:14:34.8605340Z 2026-10-29 09:12:11,013 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_FIM_REPRESENTACAO')
2026-10-29T12:14:34.8605761Z 2026-10-29 09:12:11,013 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtFimRepresentacao with lazy=false
2026-10-29T12:14:34.8606157Z 2026-10-29 09:12:11,013 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:dtFimRepresentacao]
2026-10-29T12:14:34.8606530Z 2026-10-29 09:12:11,013 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtFimRepresentacao
2026-10-29T12:14:34.8606860Z 2026-10-29 09:12:11,013 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.DT_FIM_REPRESENTACAO
2026-10-29T12:14:34.8607166Z 2026-10-29 09:12:11,013 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtFimRepresentacao
2026-10-29T12:14:34.8607549Z 2026-10-29 09:12:11,013 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_INICIO_REPRESENTACAO')
2026-10-29T12:14:34.8607890Z 2026-10-29 09:12:11,013 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtInicioRepresentacao with lazy=false
2026-10-29T12:14:34.8608310Z 2026-10-29 09:12:11,013 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:dtInicioRepresentacao]
2026-10-29T12:14:34.8608681Z 2026-10-29 09:12:11,013 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtInicioRepresentacao
2026-10-29T12:14:34.8609013Z 2026-10-29 09:12:11,013 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.DT_INICIO_REPRESENTACAO
2026-10-29T12:14:34.8609322Z 2026-10-29 09:12:11,013 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtInicioRepresentacao
2026-10-29T12:14:34.8609638Z 2026-10-29 09:12:11,013 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_FARMACIA')
2026-10-29T12:14:34.8609996Z 2026-10-29 09:12:11,013 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8610290Z 2026-10-29 09:12:11,013 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property farmacia
2026-10-29T12:14:34.8610596Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_RESPONSAVEL_LEGAL')
2026-10-29T12:14:34.8610975Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icResponsavelLegal with lazy=false
2026-10-29T12:14:34.8611398Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:icResponsavelLegal]
2026-10-29T12:14:34.8611765Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icResponsavelLegal
2026-10-29T12:14:34.8612089Z 2026-10-29 09:12:11,014 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.IC_RESPONSAVEL_LEGAL
2026-10-29T12:14:34.8612398Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icResponsavelLegal
2026-10-29T12:14:34.8612674Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_TIPO_ACAO')
2026-10-29T12:14:34.8613040Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icTipoAcao with lazy=false
2026-10-29T12:14:34.8613452Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:icTipoAcao]
2026-10-29T12:14:34.8613826Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icTipoAcao
2026-10-29T12:14:34.8614259Z 2026-10-29 09:12:11,014 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.IC_TIPO_ACAO
2026-10-29T12:14:34.8614574Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icTipoAcao
2026-10-29T12:14:34.8614887Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_DDD_REPRESENTANTE')
2026-10-29T12:14:34.8615224Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuDddRepresentante with lazy=false
2026-10-29T12:14:34.8615646Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:nuDddRepresentante]
2026-10-29T12:14:34.8616017Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuDddRepresentante
2026-10-29T12:14:34.8616529Z 2026-10-29 09:12:11,014 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.NU_DDD_REPRESENTANTE
2026-10-29T12:14:34.8616981Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuDddRepresentante
2026-10-29T12:14:34.8617308Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TELEFONE_REPRESENTANTE')
2026-10-29T12:14:34.8617654Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTelefoneRepresentante with lazy=false
2026-10-29T12:14:34.8618079Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:nuTelefoneRepresentante]
2026-10-29T12:14:34.8618450Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTelefoneRepresentante
2026-10-29T12:14:34.8618779Z 2026-10-29 09:12:11,014 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.NU_TELEFONE_REPRESENTANTE
2026-10-29T12:14:34.8619093Z 2026-10-29 09:12:11,014 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTelefoneRepresentante
2026-10-29T12:14:34.8619420Z 2026-10-29 09:12:11,015 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_REPRESENTANTE_FARMACIA')
2026-10-29T12:14:34.8619774Z 2026-10-29 09:12:11,015 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8620091Z 2026-10-29 09:12:11,015 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property representante
2026-10-29T12:14:34.8620467Z 2026-10-29 09:12:11,015 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_FIM_PERIODO')
2026-10-29T12:14:34.8620798Z 2026-10-29 09:12:11,015 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsFimPeriodo with lazy=false
2026-10-29T12:14:34.8621212Z 2026-10-29 09:12:11,015 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:tsFimPeriodo]
2026-10-29T12:14:34.8621572Z 2026-10-29 09:12:11,015 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsFimPeriodo
2026-10-29T12:14:34.8621930Z 2026-10-29 09:12:11,015 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.TS_FIM_PERIODO
2026-10-29T12:14:34.8622230Z 2026-10-29 09:12:11,015 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsFimPeriodo
2026-10-29T12:14:34.8622542Z 2026-10-29 09:12:11,015 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_PERIODO')
2026-10-29T12:14:34.8622870Z 2026-10-29 09:12:11,015 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioPeriodo with lazy=false
2026-10-29T12:14:34.8623287Z 2026-10-29 09:12:11,015 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:tsInicioPeriodo]
2026-10-29T12:14:34.8623646Z 2026-10-29 09:12:11,015 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioPeriodo
2026-10-29T12:14:34.8623967Z 2026-10-29 09:12:11,015 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.TS_INICIO_PERIODO
2026-10-29T12:14:34.8624318Z 2026-10-29 09:12:11,015 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioPeriodo
2026-10-29T12:14:34.8624672Z 2026-10-29 09:12:11,015 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29T12:14:34.8625106Z 2026-10-29 09:12:11,016 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.ItemValidacao
2026-10-29T12:14:34.8625414Z 2026-10-29 09:12:11,016 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name ItemValidacao
2026-10-29T12:14:34.8625777Z 2026-10-29 09:12:11,017 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.ItemValidacao on table FAPTB016_ITEM_VALIDACAO
2026-10-29T12:14:34.8626154Z 2026-10-29 09:12:11,017 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29T12:14:34.8626445Z 2026-10-29 09:12:11,017 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_ITEM_VALIDACAO')
2026-10-29T12:14:34.8626800Z 2026-10-29 09:12:11,017 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.ItemValidacao] is safe
2026-10-29T12:14:34.8627208Z 2026-10-29 09:12:11,017 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.ItemValidacao
2026-10-29T12:14:34.8627578Z 2026-10-29 09:12:11,018 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuItemValidacao with lazy=false
2026-10-29T12:14:34.8627999Z 2026-10-29 09:12:11,018 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemValidacao:nuItemValidacao]
2026-10-29T12:14:34.8628402Z 2026-10-29 09:12:11,018 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuItemValidacao
2026-10-29T12:14:34.8628727Z 2026-10-29 09:12:11,018 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB016_ITEM_VALIDACAO.NU_ITEM_VALIDACAO
2026-10-29T12:14:34.8629029Z 2026-10-29 09:12:11,018 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuItemValidacao
2026-10-29T12:14:34.8629341Z 2026-10-29 09:12:11,018 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NO_ITEM_VALIDADO')
2026-10-29T12:14:34.8629671Z 2026-10-29 09:12:11,018 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property noItemValidado with lazy=false
2026-10-29T12:14:34.8630073Z 2026-10-29 09:12:11,018 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemValidacao:noItemValidado]
2026-10-29T12:14:34.8630470Z 2026-10-29 09:12:11,018 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for noItemValidado
2026-10-29T12:14:34.8630836Z 2026-10-29 09:12:11,018 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB016_ITEM_VALIDACAO.NO_ITEM_VALIDADO
2026-10-29T12:14:34.8631142Z 2026-10-29 09:12:11,018 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property noItemValidado
2026-10-29T12:14:34.8631481Z 2026-10-29 09:12:11,018 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29T12:14:34.8631846Z 2026-10-29 09:12:11,019 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.ControleDocumento
2026-10-29T12:14:34.8632154Z 2026-10-29 09:12:11,019 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name ControleDocumento
2026-10-29T12:14:34.8632504Z 2026-10-29 09:12:11,019 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.ControleDocumento on table FAPTB014_CONTROLE_DOCUMENTO
2026-10-29T12:14:34.8632844Z 2026-10-29 09:12:11,019 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29T12:14:34.8633218Z 2026-10-29 09:12:11,020 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CONTROLE_DOCUMENTO')
2026-10-29T12:14:34.8633605Z 2026-10-29 09:12:11,020 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.ControleDocumento] is safe
2026-10-29T12:14:34.8633996Z 2026-10-29 09:12:11,020 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.ControleDocumento
2026-10-29T12:14:34.8634487Z 2026-10-29 09:12:11,020 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuControleDocumento with lazy=false
2026-10-29T12:14:34.8635039Z 2026-10-29 09:12:11,020 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:nuControleDocumento]
2026-10-29T12:14:34.8635473Z 2026-10-29 09:12:11,020 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuControleDocumento
2026-10-29T12:14:34.8635867Z 2026-10-29 09:12:11,020 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.NU_CONTROLE_DOCUMENTO
2026-10-29T12:14:34.8636181Z 2026-10-29 09:12:11,020 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuControleDocumento
2026-10-29T12:14:34.8636536Z 2026-10-29 09:12:11,020 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_CONTROLE_DOCUMENTO)]), nuControleDocumento, identity, , ...)
2026-10-29T12:14:34.8637084Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_ENVIO_DOCUMENTO')
2026-10-29T12:14:34.8637416Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhEnvioDocumento with lazy=false
2026-10-29T12:14:34.8637835Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:dhEnvioDocumento]
2026-10-29T12:14:34.8638204Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhEnvioDocumento
2026-10-29T12:14:34.8638532Z 2026-10-29 09:12:11,021 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.DH_ENVIO_DOCUMENTO
2026-10-29T12:14:34.8638838Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhEnvioDocumento
2026-10-29T12:14:34.8639204Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_FARMACIA')
2026-10-29T12:14:34.8639508Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8639794Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property farmacia
2026-10-29T12:14:34.8640102Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_DOCUMENTO_LOCAL')
2026-10-29T12:14:34.8640436Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icDocumentoLocal with lazy=false
2026-10-29T12:14:34.8640852Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:icDocumentoLocal]
2026-10-29T12:14:34.8641227Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icDocumentoLocal
2026-10-29T12:14:34.8641588Z 2026-10-29 09:12:11,021 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.IC_DOCUMENTO_LOCAL
2026-10-29T12:14:34.8641913Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icDocumentoLocal
2026-10-29T12:14:34.8642224Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_FARMACEUTICO')
2026-10-29T12:14:34.8642551Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuFarmaceutico with lazy=false
2026-10-29T12:14:34.8642965Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:nuFarmaceutico]
2026-10-29T12:14:34.8643333Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuFarmaceutico
2026-10-29T12:14:34.8643654Z 2026-10-29 09:12:11,021 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.NU_FARMACEUTICO
2026-10-29T12:14:34.8643953Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuFarmaceutico
2026-10-29T12:14:34.8644310Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_FARMACIA')
2026-10-29T12:14:34.8644712Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuFarmacia with lazy=false
2026-10-29T12:14:34.8645125Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:nuFarmacia]
2026-10-29T12:14:34.8645620Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuFarmacia
2026-10-29T12:14:34.8645951Z 2026-10-29 09:12:11,021 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.NU_FARMACIA
2026-10-29T12:14:34.8646306Z 2026-10-29 09:12:11,021 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuFarmacia
2026-10-29T12:14:34.8646622Z 2026-10-29 09:12:11,022 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_REPRESENTANTE_FARMACIA')
2026-10-29T12:14:34.8646963Z 2026-10-29 09:12:11,022 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuRepresentanteFarmacia with lazy=false
2026-10-29T12:14:34.8647387Z 2026-10-29 09:12:11,022 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:nuRepresentanteFarmacia]
2026-10-29T12:14:34.8647798Z 2026-10-29 09:12:11,022 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuRepresentanteFarmacia
2026-10-29T12:14:34.8648137Z 2026-10-29 09:12:11,022 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.NU_REPRESENTANTE_FARMACIA
2026-10-29T12:14:34.8648453Z 2026-10-29 09:12:11,022 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuRepresentanteFarmacia
2026-10-29T12:14:34.8648738Z 2026-10-29 09:12:11,022 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DOCUMENTO')
2026-10-29T12:14:34.8649071Z 2026-10-29 09:12:11,022 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDocumento with lazy=false
2026-10-29T12:14:34.8649485Z 2026-10-29 09:12:11,022 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:nuTipoDocumento]
2026-10-29T12:14:34.8649853Z 2026-10-29 09:12:11,022 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDocumento
2026-10-29T12:14:34.8650176Z 2026-10-29 09:12:11,022 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.NU_TIPO_DOCUMENTO
2026-10-29T12:14:34.8650478Z 2026-10-29 09:12:11,022 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDocumento
2026-10-29T12:14:34.8650839Z 2026-10-29 09:12:11,022 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_TIPO_DOCUMENTO',referencedColumn='NU_TIPO_DOCUMENTO')
2026-10-29T12:14:34.8651169Z 2026-10-29 09:12:11,022 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8651458Z 2026-10-29 09:12:11,022 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tipoDocumento
2026-10-29T12:14:34.8651805Z 2026-10-29 09:12:11,022 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29T12:14:34.8652178Z 2026-10-29 09:12:11,023 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.HistoricoAnaliseDocumento
2026-10-29T12:14:34.8652509Z 2026-10-29 09:12:11,023 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name HistoricoAnaliseDocumento
2026-10-29T12:14:34.8652951Z 2026-10-29 09:12:11,023 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.HistoricoAnaliseDocumento on table FAPTB119_HSTRO_ANLSE_DOCUMENTO
2026-10-29T12:14:34.8653371Z 2026-10-29 09:12:11,023 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29T12:14:34.8653678Z 2026-10-29 09:12:11,026 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8654032Z 2026-10-29 09:12:11,026 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento] is safe
2026-10-29T12:14:34.8654559Z 2026-10-29 09:12:11,026 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.HistoricoAnaliseDocumento
2026-10-29T12:14:34.8654942Z 2026-10-29 09:12:11,032 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_SQNCL_ANALISE_DOCUMENTO')
2026-10-29T12:14:34.8655314Z 2026-10-29 09:12:11,032 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuSqnclAnaliseDocumento with lazy=false
2026-10-29T12:14:34.8655764Z 2026-10-29 09:12:11,032 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.id:nuSqnclAnaliseDocumento]
2026-10-29T12:14:34.8656237Z 2026-10-29 09:12:11,032 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuSqnclAnaliseDocumento
2026-10-29T12:14:34.8656724Z 2026-10-29 09:12:11,032 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.NU_SQNCL_ANALISE_DOCUMENTO
2026-10-29T12:14:34.8657164Z 2026-10-29 09:12:11,032 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuSqnclAnaliseDocumento
2026-10-29T12:14:34.8657629Z 2026-10-29 09:12:11,032 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_PERIODO')
2026-10-29T12:14:34.8658108Z 2026-10-29 09:12:11,032 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioPeriodo with lazy=false
2026-10-29T12:14:34.8658546Z 2026-10-29 09:12:11,032 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.id:tsInicioPeriodo]
2026-10-29T12:14:34.8658929Z 2026-10-29 09:12:11,032 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioPeriodo
2026-10-29T12:14:34.8659257Z 2026-10-29 09:12:11,032 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.TS_INICIO_PERIODO
2026-10-29T12:14:34.8660076Z 2026-10-29 09:12:11,032 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioPeriodo
2026-10-29T12:14:34.8660363Z 2026-10-29 09:12:11,032 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property id
2026-10-29T12:14:34.8660766Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_CPF_CNPJ_DOCUMENTO')
2026-10-29T12:14:34.8661111Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coCpfCnpjDocumento with lazy=false
2026-10-29T12:14:34.8661537Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:coCpfCnpjDocumento]
2026-10-29T12:14:34.8661918Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coCpfCnpjDocumento
2026-10-29T12:14:34.8662250Z 2026-10-29 09:12:11,033 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.CO_CPF_CNPJ_DOCUMENTO
2026-10-29T12:14:34.8662570Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coCpfCnpjDocumento
2026-10-29T12:14:34.8662897Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ANALISE_DOCUMENTO')
2026-10-29T12:14:34.8663242Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAnaliseDocumento with lazy=false
2026-10-29T12:14:34.8663754Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:coUsuarioAnaliseDocumento]
2026-10-29T12:14:34.8664144Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAnaliseDocumento
2026-10-29T12:14:34.8664564Z 2026-10-29 09:12:11,033 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.CO_USUARIO_ANALISE_DOCUMENTO
2026-10-29T12:14:34.8664890Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAnaliseDocumento
2026-10-29T12:14:34.8665176Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_JUSTIFICATIVA')
2026-10-29T12:14:34.8665578Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deJustificativa with lazy=false
2026-10-29T12:14:34.8666061Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:deJustificativa]
2026-10-29T12:14:34.8666437Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deJustificativa
2026-10-29T12:14:34.8666768Z 2026-10-29 09:12:11,033 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.DE_JUSTIFICATIVA
2026-10-29T12:14:34.8667079Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deJustificativa
2026-10-29T12:14:34.8667397Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_ANALISE_DOCUMENTO')
2026-10-29T12:14:34.8667739Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhAnaliseDocumento with lazy=false
2026-10-29T12:14:34.8668329Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:dhAnaliseDocumento]
2026-10-29T12:14:34.8668896Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhAnaliseDocumento
2026-10-29T12:14:34.8669403Z 2026-10-29 09:12:11,033 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.DH_ANALISE_DOCUMENTO
2026-10-29T12:14:34.8669890Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhAnaliseDocumento
2026-10-29T12:14:34.8670411Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_FIM_ANALISE_DOCUMENTO')
2026-10-29T12:14:34.8670967Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhFimAnaliseDocumento with lazy=false
2026-10-29T12:14:34.8671688Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:dhFimAnaliseDocumento]
2026-10-29T12:14:34.8672321Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhFimAnaliseDocumento
2026-10-29T12:14:34.8672861Z 2026-10-29 09:12:11,033 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.DH_FIM_ANALISE_DOCUMENTO
2026-10-29T12:14:34.8673353Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhFimAnaliseDocumento
2026-10-29T12:14:34.8673705Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_ANALISE_DOCUMENTO')
2026-10-29T12:14:34.8674038Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icAnaliseDocumento with lazy=false
2026-10-29T12:14:34.8674722Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:icAnaliseDocumento]
2026-10-29T12:14:34.8675105Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icAnaliseDocumento
2026-10-29T12:14:34.8675510Z 2026-10-29 09:12:11,033 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.IC_ANALISE_DOCUMENTO
2026-10-29T12:14:34.8675829Z 2026-10-29 09:12:11,033 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icAnaliseDocumento
2026-10-29T12:14:34.8676157Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_CPF_CNPJ_DOCUMENTO')
2026-10-29T12:14:34.8676556Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icCpfCnpjDocumento with lazy=false
2026-10-29T12:14:34.8677059Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:icCpfCnpjDocumento]
2026-10-29T12:14:34.8677433Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icCpfCnpjDocumento
2026-10-29T12:14:34.8677769Z 2026-10-29 09:12:11,034 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.IC_CPF_CNPJ_DOCUMENTO
2026-10-29T12:14:34.8678086Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icCpfCnpjDocumento
2026-10-29T12:14:34.8678421Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_USUARIO_ANALISE_DOCUMENTO')
2026-10-29T12:14:34.8678767Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icUsuarioAnaliseDocumento with lazy=false
2026-10-29T12:14:34.8679290Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:icUsuarioAnaliseDocumento]
2026-10-29T12:14:34.8679700Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icUsuarioAnaliseDocumento
2026-10-29T12:14:34.8680043Z 2026-10-29 09:12:11,034 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.IC_USUARIO_ANALISE_DOCUMENTO
2026-10-29T12:14:34.8680370Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icUsuarioAnaliseDocumento
2026-10-29T12:14:34.8680698Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_IDENTIFICADOR_DOCUMENTO')
2026-10-29T12:14:34.8681043Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuIdentificadorDocumento with lazy=false
2026-10-29T12:14:34.8681481Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:nuIdentificadorDocumento]
2026-10-29T12:14:34.8681928Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuIdentificadorDocumento
2026-10-29T12:14:34.8682270Z 2026-10-29 09:12:11,034 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.NU_IDENTIFICADOR_DOCUMENTO
2026-10-29T12:14:34.8682597Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuIdentificadorDocumento
2026-10-29T12:14:34.8682881Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DOCUMENTO')
2026-10-29T12:14:34.8683268Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDocumento with lazy=false
2026-10-29T12:14:34.8683765Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:nuTipoDocumento]
2026-10-29T12:14:34.8684141Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDocumento
2026-10-29T12:14:34.8684534Z 2026-10-29 09:12:11,034 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.NU_TIPO_DOCUMENTO
2026-10-29T12:14:34.8684843Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDocumento
2026-10-29T12:14:34.8685203Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_TIPO_DOCUMENTO',referencedColumn='NU_TIPO_DOCUMENTO')
2026-10-29T12:14:34.8685641Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8685931Z 2026-10-29 09:12:11,034 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tipoDocumento
2026-10-29T12:14:34.8686282Z 2026-10-29 09:12:11,034 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29T12:14:34.8686640Z 2026-10-29 09:12:11,035 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.SqlMappings
2026-10-29T12:14:34.8686952Z 2026-10-29 09:12:11,036 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name SqlMappings
2026-10-29T12:14:34.8687276Z 2026-10-29 09:12:11,036 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.SqlMappings on table SqlMappings
2026-10-29T12:14:34.8687609Z 2026-10-29 09:12:11,036 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29T12:14:34.8688117Z 2026-10-29 09:12:11,037 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8688488Z 2026-10-29 09:12:11,037 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.SqlMappings] is safe
2026-10-29T12:14:34.8688901Z 2026-10-29 09:12:11,037 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.SqlMappings
2026-10-29T12:14:34.8689261Z 2026-10-29 09:12:11,037 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property id with lazy=false
2026-10-29T12:14:34.8689710Z 2026-10-29 09:12:11,037 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SqlMappings:id]
2026-10-29T12:14:34.8690095Z 2026-10-29 09:12:11,037 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for id
2026-10-29T12:14:34.8690357Z 2026-10-29 09:12:11,037 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: SqlMappings.id
2026-10-29T12:14:34.8690638Z 2026-10-29 09:12:11,037 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property id
2026-10-29T12:14:34.8690952Z 2026-10-29 09:12:11,037 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(id)]), id, identity, , ...)
2026-10-29T12:14:34.8691315Z 2026-10-29 09:12:11,037 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29T12:14:34.8691673Z 2026-10-29 09:12:11,038 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.TipoDocumento
2026-10-29T12:14:34.8692044Z 2026-10-29 09:12:11,038 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name TipoDocumento
2026-10-29T12:14:34.8692391Z 2026-10-29 09:12:11,038 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.TipoDocumento on table FAPTB006_TIPO_DOCUMENTO
2026-10-29T12:14:34.8692731Z 2026-10-29 09:12:11,038 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29T12:14:34.8693068Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DOCUMENTO')
2026-10-29T12:14:34.8693435Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoDocumento] is safe
2026-10-29T12:14:34.8693918Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoDocumento
2026-10-29T12:14:34.8694371Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDocumento with lazy=false
2026-10-29T12:14:34.8694797Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumento:nuTipoDocumento]
2026-10-29T12:14:34.8695164Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDocumento
2026-10-29T12:14:34.8695553Z 2026-10-29 09:12:11,039 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.NU_TIPO_DOCUMENTO
2026-10-29T12:14:34.8695855Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDocumento
2026-10-29T12:14:34.8696187Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_TIPOLOGIA_DOCUMENTO')
2026-10-29T12:14:34.8696532Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coTipologiaDocumento with lazy=false
2026-10-29T12:14:34.8696961Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumento:coTipologiaDocumento]
2026-10-29T12:14:34.8697332Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coTipologiaDocumento
2026-10-29T12:14:34.8697630Z 2026-10-29 09:12:11,039 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.CO_TIPOLOGIA_DOCUMENTO
2026-10-29T12:14:34.8697938Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coTipologiaDocumento
2026-10-29T12:14:34.8698263Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_TIPO_DOCUMENTO_FARMACIA')
2026-10-29T12:14:34.8698694Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deTipoDocumentoFarmacia with lazy=false
2026-10-29T12:14:34.8699170Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumento:deTipoDocumentoFarmacia]
2026-10-29T12:14:34.8699593Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deTipoDocumentoFarmacia
2026-10-29T12:14:34.8699962Z 2026-10-29 09:12:11,039 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.DE_TIPO_DOCUMENTO_FARMACIA
2026-10-29T12:14:34.8700279Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deTipoDocumentoFarmacia
2026-10-29T12:14:34.8700647Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_CLASSE_TIPO_DOCUMENTO')
2026-10-29T12:14:34.8700987Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icClasseTipoDocumento with lazy=false
2026-10-29T12:14:34.8701404Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumento:icClasseTipoDocumento]
2026-10-29T12:14:34.8701860Z 2026-10-29 09:12:11,039 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icClasseTipoDocumento
2026-10-29T12:14:34.8702338Z 2026-10-29 09:12:11,040 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.IC_CLASSE_TIPO_DOCUMENTO
2026-10-29T12:14:34.8702709Z 2026-10-29 09:12:11,040 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icClasseTipoDocumento
2026-10-29T12:14:34.8703072Z 2026-10-29 09:12:11,040 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_DOCUMENTO_OBRIGATORIO')
2026-10-29T12:14:34.8703403Z 2026-10-29 09:12:11,040 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icDocumentoObrigatorio with lazy=false
2026-10-29T12:14:34.8703823Z 2026-10-29 09:12:11,040 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumento:icDocumentoObrigatorio]
2026-10-29T12:14:34.8704252Z 2026-10-29 09:12:11,040 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icDocumentoObrigatorio
2026-10-29T12:14:34.8704603Z 2026-10-29 09:12:11,040 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.IC_DOCUMENTO_OBRIGATORIO
2026-10-29T12:14:34.8704978Z 2026-10-29 09:12:11,040 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icDocumentoObrigatorio
2026-10-29T12:14:34.8705382Z 2026-10-29 09:12:11,040 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29T12:14:34.8705742Z 2026-10-29 09:12:11,041 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.Farmacia
2026-10-29T12:14:34.8706050Z 2026-10-29 09:12:11,041 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name Farmacia
2026-10-29T12:14:34.8706374Z 2026-10-29 09:12:11,044 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.Farmacia on table FAPTB001_FARMACIA
2026-10-29T12:14:34.8706711Z 2026-10-29 09:12:11,044 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29T12:14:34.8707035Z 2026-10-29 09:12:11,048 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_FARMACIA')
2026-10-29T12:14:34.8707390Z 2026-10-29 09:12:11,048 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.Farmacia] is safe
2026-10-29T12:14:34.8707788Z 2026-10-29 09:12:11,048 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.Farmacia
2026-10-29T12:14:34.8708149Z 2026-10-29 09:12:11,048 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuFarmacia with lazy=false
2026-10-29T12:14:34.8708552Z 2026-10-29 09:12:11,048 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuFarmacia]
2026-10-29T12:14:34.8708907Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuFarmacia
2026-10-29T12:14:34.8709274Z 2026-10-29 09:12:11,049 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_FARMACIA
2026-10-29T12:14:34.8709570Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuFarmacia
2026-10-29T12:14:34.8709899Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_FARMACIA)]), nuFarmacia, identity, , ...)
2026-10-29T12:14:34.8710252Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_CNPJ_ESTABELECIMENTO_LEGADO')
2026-10-29T12:14:34.8710604Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coCnpjEstabelecimentoLegado with lazy=false
2026-10-29T12:14:34.8711097Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:coCnpjEstabelecimentoLegado]
2026-10-29T12:14:34.8711540Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coCnpjEstabelecimentoLegado
2026-10-29T12:14:34.8711875Z 2026-10-29 09:12:11,049 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.CO_CNPJ_ESTABELECIMENTO_LEGADO
2026-10-29T12:14:34.8712196Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coCnpjEstabelecimentoLegado
2026-10-29T12:14:34.8712524Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_LICENCA_FUNCIONAMENTO')
2026-10-29T12:14:34.8712832Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coLicencaFuncionamento with lazy=false
2026-10-29T12:14:34.8713248Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:coLicencaFuncionamento]
2026-10-29T12:14:34.8713619Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coLicencaFuncionamento
2026-10-29T12:14:34.8713949Z 2026-10-29 09:12:11,049 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.CO_LICENCA_FUNCIONAMENTO
2026-10-29T12:14:34.8714369Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coLicencaFuncionamento
2026-10-29T12:14:34.8714704Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_PROCESSO_SEI')
2026-10-29T12:14:34.8715031Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coProcessoSei with lazy=false
2026-10-29T12:14:34.8715496Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:coProcessoSei]
2026-10-29T12:14:34.8715865Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coProcessoSei
2026-10-29T12:14:34.8716207Z 2026-10-29 09:12:11,049 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.CO_PROCESSO_SEI
2026-10-29T12:14:34.8716621Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coProcessoSei
2026-10-29T12:14:34.8717002Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ACAO_FARMACIA')
2026-10-29T12:14:34.8717340Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAcaoFarmacia with lazy=false
2026-10-29T12:14:34.8717757Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:coUsuarioAcaoFarmacia]
2026-10-29T12:14:34.8718245Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAcaoFarmacia
2026-10-29T12:14:34.8718569Z 2026-10-29 09:12:11,049 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.CO_USUARIO_ACAO_FARMACIA
2026-10-29T12:14:34.8718884Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAcaoFarmacia
2026-10-29T12:14:34.8719197Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_EMAIL_FARMACIA')
2026-10-29T12:14:34.8719543Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEmailFarmacia with lazy=false
2026-10-29T12:14:34.8719980Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:deEmailFarmacia]
2026-10-29T12:14:34.8720383Z 2026-10-29 09:12:11,049 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEmailFarmacia
2026-10-29T12:14:34.8720700Z 2026-10-29 09:12:11,050 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.DE_EMAIL_FARMACIA
2026-10-29T12:14:34.8720998Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEmailFarmacia
2026-10-29T12:14:34.8721320Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_ENDERECO_IP_FARMACIA')
2026-10-29T12:14:34.8721654Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEnderecoIpFarmacia with lazy=false
2026-10-29T12:14:34.8722065Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:deEnderecoIpFarmacia]
2026-10-29T12:14:34.8722437Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEnderecoIpFarmacia
2026-10-29T12:14:34.8722762Z 2026-10-29 09:12:11,050 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.DE_ENDERECO_IP_FARMACIA
2026-10-29T12:14:34.8723123Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEnderecoIpFarmacia
2026-10-29T12:14:34.8723450Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_ATUALIZACAO_FARMACIA')
2026-10-29T12:14:34.8723788Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhAtualizacaoFarmacia with lazy=false
2026-10-29T12:14:34.8724283Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:dhAtualizacaoFarmacia]
2026-10-29T12:14:34.8724673Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhAtualizacaoFarmacia
2026-10-29T12:14:34.8724993Z 2026-10-29 09:12:11,050 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.DH_ATUALIZACAO_FARMACIA
2026-10-29T12:14:34.8725342Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhAtualizacaoFarmacia
2026-10-29T12:14:34.8725678Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_SUBMISSAO_SLCTO_CADASTRO')
2026-10-29T12:14:34.8726020Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhSubmissaoSlctoCadastro with lazy=false
2026-10-29T12:14:34.8726443Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:dhSubmissaoSlctoCadastro]
2026-10-29T12:14:34.8726862Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhSubmissaoSlctoCadastro
2026-10-29T12:14:34.8727155Z 2026-10-29 09:12:11,050 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.DH_SUBMISSAO_SLCTO_CADASTRO
2026-10-29T12:14:34.8727466Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhSubmissaoSlctoCadastro
2026-10-29T12:14:34.8727785Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_VENCIMENTO_CND')
2026-10-29T12:14:34.8728189Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtVencimentoCnd with lazy=false
2026-10-29T12:14:34.8728594Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:dtVencimentoCnd]
2026-10-29T12:14:34.8728991Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtVencimentoCnd
2026-10-29T12:14:34.8729300Z 2026-10-29 09:12:11,050 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.DT_VENCIMENTO_CND
2026-10-29T12:14:34.8729602Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtVencimentoCnd
2026-10-29T12:14:34.8729920Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_VNCMO_LICENCA_FNCMO')
2026-10-29T12:14:34.8730263Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtVencimentoLicencaFncmo with lazy=false
2026-10-29T12:14:34.8730686Z 2026-10-29 09:12:11,050 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:dtVencimentoLicencaFncmo]
2026-10-29T12:14:34.8731059Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtVencimentoLicencaFncmo
2026-10-29T12:14:34.8731382Z 2026-10-29 09:12:11,051 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.DT_VNCMO_LICENCA_FNCMO
2026-10-29T12:14:34.8731696Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtVencimentoLicencaFncmo
2026-10-29T12:14:34.8732019Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_FARMACIA_MATRIZ')
2026-10-29T12:14:34.8732325Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8732615Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property farmaciaMatriz
2026-10-29T12:14:34.8732926Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_EFETUA_VENDA')
2026-10-29T12:14:34.8733293Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icEfetuaVenda with lazy=false
2026-10-29T12:14:34.8733711Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:icEfetuaVenda]
2026-10-29T12:14:34.8734079Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icEfetuaVenda
2026-10-29T12:14:34.8734457Z 2026-10-29 09:12:11,051 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.IC_EFETUA_VENDA
2026-10-29T12:14:34.8734758Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icEfetuaVenda
2026-10-29T12:14:34.8735082Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_EMISSAO_FISCAL_ELETRONICO')
2026-10-29T12:14:34.8735818Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icEmissaoFiscalEletronico with lazy=false
2026-10-29T12:14:34.8736245Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:icEmissaoFiscalEletronico]
2026-10-29T12:14:34.8736623Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icEmissaoFiscalEletronico
2026-10-29T12:14:34.8736959Z 2026-10-29 09:12:11,051 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.IC_EMISSAO_FISCAL_ELETRONICO
2026-10-29T12:14:34.8737283Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icEmissaoFiscalEletronico
2026-10-29T12:14:34.8737599Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_TIPO_ACAO')
2026-10-29T12:14:34.8737965Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icTipoAcao with lazy=false
2026-10-29T12:14:34.8738365Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:icTipoAcao]
2026-10-29T12:14:34.8738774Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icTipoAcao
2026-10-29T12:14:34.8739083Z 2026-10-29 09:12:11,051 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.IC_TIPO_ACAO
2026-10-29T12:14:34.8739375Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icTipoAcao
2026-10-29T12:14:34.8739700Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NO_TITULARIDADE_CONTA_CREDITO')
2026-10-29T12:14:34.8740051Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property noTitularidadeContaCredito with lazy=false
2026-10-29T12:14:34.8740446Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:noTitularidadeContaCredito]
2026-10-29T12:14:34.8740830Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for noTitularidadeContaCredito
2026-10-29T12:14:34.8741165Z 2026-10-29 09:12:11,051 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NO_TITULARIDADE_CONTA_CREDITO
2026-10-29T12:14:34.8741485Z 2026-10-29 09:12:11,051 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property noTitularidadeContaCredito
2026-10-29T12:14:34.8741797Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_AGENCIA')
2026-10-29T12:14:34.8742131Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuAgencia with lazy=false
2026-10-29T12:14:34.8742533Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuAgencia]
2026-10-29T12:14:34.8742888Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuAgencia
2026-10-29T12:14:34.8743193Z 2026-10-29 09:12:11,052 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_AGENCIA
2026-10-29T12:14:34.8743484Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuAgencia
2026-10-29T12:14:34.8743783Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_BANCO')
2026-10-29T12:14:34.8744141Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuBanco with lazy=false
2026-10-29T12:14:34.8744672Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuBanco]
2026-10-29T12:14:34.8745022Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuBanco
2026-10-29T12:14:34.8745381Z 2026-10-29 09:12:11,052 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_BANCO
2026-10-29T12:14:34.8745679Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuBanco
2026-10-29T12:14:34.8746001Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CNPJ_ESTABELECIMENTO')
2026-10-29T12:14:34.8746349Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuCnpjEstabelecimento with lazy=false
2026-10-29T12:14:34.8746770Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuCnpjEstabelecimento]
2026-10-29T12:14:34.8747215Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuCnpjEstabelecimento
2026-10-29T12:14:34.8747542Z 2026-10-29 09:12:11,052 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_CNPJ_ESTABELECIMENTO
2026-10-29T12:14:34.8747851Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuCnpjEstabelecimento
2026-10-29T12:14:34.8748161Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CONTA')
2026-10-29T12:14:34.8748480Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuConta with lazy=false
2026-10-29T12:14:34.8748879Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuConta]
2026-10-29T12:14:34.8749229Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuConta
2026-10-29T12:14:34.8749532Z 2026-10-29 09:12:11,052 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_CONTA
2026-10-29T12:14:34.8749829Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuConta
2026-10-29T12:14:34.8750144Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_DDD_ALTERNATIVO')
2026-10-29T12:14:34.8750475Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuDddAlternativo with lazy=false
2026-10-29T12:14:34.8750889Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuDddAlternativo]
2026-10-29T12:14:34.8751250Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuDddAlternativo
2026-10-29T12:14:34.8751565Z 2026-10-29 09:12:11,052 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_DDD_ALTERNATIVO
2026-10-29T12:14:34.8751865Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuDddAlternativo
2026-10-29T12:14:34.8752178Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_DDD_PRINCIPAL')
2026-10-29T12:14:34.8752504Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuDddPrincipal with lazy=false
2026-10-29T12:14:34.8752920Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuDddPrincipal]
2026-10-29T12:14:34.8753281Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuDddPrincipal
2026-10-29T12:14:34.8753598Z 2026-10-29 09:12:11,052 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_DDD_PRINCIPAL
2026-10-29T12:14:34.8753976Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuDddPrincipal
2026-10-29T12:14:34.8754456Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_DV_AGENCIA')
2026-10-29T12:14:34.8754832Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuDvAgencia with lazy=false
2026-10-29T12:14:34.8755326Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuDvAgencia]
2026-10-29T12:14:34.8755724Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuDvAgencia
2026-10-29T12:14:34.8756028Z 2026-10-29 09:12:11,052 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_DV_AGENCIA
2026-10-29T12:14:34.8756324Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuDvAgencia
2026-10-29T12:14:34.8756635Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_DV_CONTA')
2026-10-29T12:14:34.8756955Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuDvConta with lazy=false
2026-10-29T12:14:34.8757356Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuDvConta]
2026-10-29T12:14:34.8757708Z 2026-10-29 09:12:11,052 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuDvConta
2026-10-29T12:14:34.8758012Z 2026-10-29 09:12:11,053 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_DV_CONTA
2026-10-29T12:14:34.8758300Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuDvConta
2026-10-29T12:14:34.8758611Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_IBGE_MUNICIPIO')
2026-10-29T12:14:34.8758945Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuIbgeMunicipio with lazy=false
2026-10-29T12:14:34.8759381Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuIbgeMunicipio]
2026-10-29T12:14:34.8759747Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuIbgeMunicipio
2026-10-29T12:14:34.8760064Z 2026-10-29 09:12:11,053 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_IBGE_MUNICIPIO
2026-10-29T12:14:34.8760363Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuIbgeMunicipio
2026-10-29T12:14:34.8760676Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_INSCRICAO_INSS')
2026-10-29T12:14:34.8761012Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuInscricaoInss with lazy=false
2026-10-29T12:14:34.8761479Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuInscricaoInss]
2026-10-29T12:14:34.8761882Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuInscricaoInss
2026-10-29T12:14:34.8762197Z 2026-10-29 09:12:11,053 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_INSCRICAO_INSS
2026-10-29T12:14:34.8762495Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuInscricaoInss
2026-10-29T12:14:34.8762816Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_REGISTRO_JUNTA_COMERCIAL')
2026-10-29T12:14:34.8763158Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuRegistroJuntaComercial with lazy=false
2026-10-29T12:14:34.8763579Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuRegistroJuntaComercial]
2026-10-29T12:14:34.8763982Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuRegistroJuntaComercial
2026-10-29T12:14:34.8764449Z 2026-10-29 09:12:11,053 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_REGISTRO_JUNTA_COMERCIAL
2026-10-29T12:14:34.8764875Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuRegistroJuntaComercial
2026-10-29T12:14:34.8765257Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TELEFONE_ALTERNATIVO')
2026-10-29T12:14:34.8765718Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTelefoneAlternativo with lazy=false
2026-10-29T12:14:34.8766142Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuTelefoneAlternativo]
2026-10-29T12:14:34.8766515Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTelefoneAlternativo
2026-10-29T12:14:34.8766805Z 2026-10-29 09:12:11,053 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_TELEFONE_ALTERNATIVO
2026-10-29T12:14:34.8767114Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTelefoneAlternativo
2026-10-29T12:14:34.8767436Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TELEFONE_PRINCIPAL')
2026-10-29T12:14:34.8767767Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTelefonePrincipal with lazy=false
2026-10-29T12:14:34.8768179Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuTelefonePrincipal]
2026-10-29T12:14:34.8768545Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTelefonePrincipal
2026-10-29T12:14:34.8768920Z 2026-10-29 09:12:11,053 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_TELEFONE_PRINCIPAL
2026-10-29T12:14:34.8769378Z 2026-10-29 09:12:11,053 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTelefonePrincipal
2026-10-29T12:14:34.8769857Z 2026-10-29 09:12:11,054 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_CONTA')
2026-10-29T12:14:34.8770311Z 2026-10-29 09:12:11,054 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoConta with lazy=false
2026-10-29T12:14:34.8770847Z 2026-10-29 09:12:11,054 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuTipoConta]
2026-10-29T12:14:34.8771389Z 2026-10-29 09:12:11,054 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoConta
2026-10-29T12:14:34.8771844Z 2026-10-29 09:12:11,054 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_TIPO_CONTA
2026-10-29T12:14:34.8772146Z 2026-10-29 09:12:11,054 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoConta
2026-10-29T12:14:34.8772503Z 2026-10-29 09:12:11,054 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29T12:14:34.8772796Z 2026-10-29 09:12:11,054 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8773114Z 2026-10-29 09:12:11,055 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: IndexColumn(column='representacoes_ORDER')
2026-10-29T12:14:34.8773426Z 2026-10-29 09:12:11,055 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8773738Z 2026-10-29 09:12:11,055 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='representacoes_KEY')
2026-10-29T12:14:34.8774070Z 2026-10-29 09:12:11,055 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='representacoes_KEY')
2026-10-29T12:14:34.8774451Z 2026-10-29 09:12:11,055 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29T12:14:34.8774744Z 2026-10-29 09:12:11,055 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29T12:14:34.8775073Z 2026-10-29 09:12:11,056 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Collection role: br.com.caixa.sifap.entity.Farmacia.representacoes
2026-10-29T12:14:34.8775461Z 2026-10-29 09:12:11,056 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property representacoes
2026-10-29T12:14:34.8775768Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29T12:14:34.8776058Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8776380Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: IndexColumn(column='representacoesTecnica_ORDER')
2026-10-29T12:14:34.8776697Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8777010Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='representacoesTecnica_KEY')
2026-10-29T12:14:34.8777342Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='representacoesTecnica_KEY')
2026-10-29T12:14:34.8777657Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29T12:14:34.8777949Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29T12:14:34.8778285Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Collection role: br.com.caixa.sifap.entity.Farmacia.representacoesTecnica
2026-10-29T12:14:34.8778570Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property representacoesTecnica
2026-10-29T12:14:34.8778896Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='SG_UF_FARMACIA')
2026-10-29T12:14:34.8779338Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property sgUfFarmacia with lazy=false
2026-10-29T12:14:34.8779745Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:sgUfFarmacia]
2026-10-29T12:14:34.8780188Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for sgUfFarmacia
2026-10-29T12:14:34.8780550Z 2026-10-29 09:12:11,057 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.SG_UF_FARMACIA
2026-10-29T12:14:34.8780907Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property sgUfFarmacia
2026-10-29T12:14:34.8781206Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29T12:14:34.8781499Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8781810Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: IndexColumn(column='situacoes_ORDER')
2026-10-29T12:14:34.8782116Z 2026-10-29 09:12:11,057 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8782476Z 2026-10-29 09:12:11,058 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='situacoes_KEY')
2026-10-29T12:14:34.8782803Z 2026-10-29 09:12:11,058 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='situacoes_KEY')
2026-10-29T12:14:34.8783177Z 2026-10-29 09:12:11,058 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29T12:14:34.8783476Z 2026-10-29 09:12:11,058 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-10-29T12:14:34.8783800Z 2026-10-29 09:12:11,058 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Collection role: br.com.caixa.sifap.entity.Farmacia.situacoes
2026-10-29T12:14:34.8784068Z 2026-10-29 09:12:11,058 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property situacoes
2026-10-29T12:14:34.8784466Z 2026-10-29 09:12:11,058 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_FIM_VIGENCIA_FARMACIA')
2026-10-29T12:14:34.8784810Z 2026-10-29 09:12:11,058 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsFimVigenciaFarmacia with lazy=false
2026-10-29T12:14:34.8785223Z 2026-10-29 09:12:11,058 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:tsFimVigenciaFarmacia]
2026-10-29T12:14:34.8785603Z 2026-10-29 09:12:11,058 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsFimVigenciaFarmacia
2026-10-29T12:14:34.8785934Z 2026-10-29 09:12:11,058 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.TS_FIM_VIGENCIA_FARMACIA
2026-10-29T12:14:34.8786246Z 2026-10-29 09:12:11,058 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsFimVigenciaFarmacia
2026-10-29T12:14:34.8786577Z 2026-10-29 09:12:11,058 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_VIGENCIA_FARMACIA')
2026-10-29T12:14:34.8786926Z 2026-10-29 09:12:11,058 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioVigenciaFarmacia with lazy=false
2026-10-29T12:14:34.8787345Z 2026-10-29 09:12:11,058 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:tsInicioVigenciaFarmacia]
2026-10-29T12:14:34.8787727Z 2026-10-29 09:12:11,058 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioVigenciaFarmacia
2026-10-29T12:14:34.8788057Z 2026-10-29 09:12:11,058 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.TS_INICIO_VIGENCIA_FARMACIA
2026-10-29T12:14:34.8788370Z 2026-10-29 09:12:11,058 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioVigenciaFarmacia
2026-10-29T12:14:34.8788772Z 2026-10-29 09:12:11,058 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29T12:14:34.8789218Z 2026-10-29 09:12:11,083 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.RepresentacaoTecnica
2026-10-29T12:14:34.8789545Z 2026-10-29 09:12:11,083 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name RepresentacaoTecnica
2026-10-29T12:14:34.8789895Z 2026-10-29 09:12:11,084 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.RepresentacaoTecnica on table FAPTB005_RPRSE_TECNICA
2026-10-29T12:14:34.8790240Z 2026-10-29 09:12:11,084 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29T12:14:34.8790573Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_REPRESENTACAO_TECNICA')
2026-10-29T12:14:34.8790953Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.RepresentacaoTecnica] is safe
2026-10-29T12:14:34.8791468Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.RepresentacaoTecnica
2026-10-29T12:14:34.8791845Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuRepresentacaoTecnica with lazy=false
2026-10-29T12:14:34.8792283Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:nuRepresentacaoTecnica]
2026-10-29T12:14:34.8792671Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuRepresentacaoTecnica
2026-10-29T12:14:34.8793008Z 2026-10-29 09:12:11,085 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.NU_REPRESENTACAO_TECNICA
2026-10-29T12:14:34.8793323Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuRepresentacaoTecnica
2026-10-29T12:14:34.8793697Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_REPRESENTACAO_TECNICA)]), nuRepresentacaoTecnica, identity, , ...)
2026-10-29T12:14:34.8794065Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ACAO_REPRESENTACAO')
2026-10-29T12:14:34.8794491Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAcaoRepresentacao with lazy=false
2026-10-29T12:14:34.8794929Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:coUsuarioAcaoRepresentacao]
2026-10-29T12:14:34.8795316Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAcaoRepresentacao
2026-10-29T12:14:34.8795652Z 2026-10-29 09:12:11,085 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.CO_USUARIO_ACAO_REPRESENTACAO
2026-10-29T12:14:34.8796031Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAcaoRepresentacao
2026-10-29T12:14:34.8796363Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_ENDERECO_IP_REPRESENTACAO')
2026-10-29T12:14:34.8796706Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEnderecoIpRepresentacao with lazy=false
2026-10-29T12:14:34.8797140Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:deEnderecoIpRepresentacao]
2026-10-29T12:14:34.8797653Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEnderecoIpRepresentacao
2026-10-29T12:14:34.8798008Z 2026-10-29 09:12:11,085 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.DE_ENDERECO_IP_REPRESENTACAO
2026-10-29T12:14:34.8798329Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEnderecoIpRepresentacao
2026-10-29T12:14:34.8798651Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_FIM_REPRESENTACAO')
2026-10-29T12:14:34.8799149Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtFimRepresentacao with lazy=false
2026-10-29T12:14:34.8799661Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:dtFimRepresentacao]
2026-10-29T12:14:34.8800031Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtFimRepresentacao
2026-10-29T12:14:34.8800358Z 2026-10-29 09:12:11,085 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.DT_FIM_REPRESENTACAO
2026-10-29T12:14:34.8800627Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtFimRepresentacao
2026-10-29T12:14:34.8800946Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_INICIO_REPRESENTACAO')
2026-10-29T12:14:34.8801287Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtInicioRepresentacao with lazy=false
2026-10-29T12:14:34.8801720Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:dtInicioRepresentacao]
2026-10-29T12:14:34.8802094Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtInicioRepresentacao
2026-10-29T12:14:34.8802421Z 2026-10-29 09:12:11,085 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.DT_INICIO_REPRESENTACAO
2026-10-29T12:14:34.8802736Z 2026-10-29 09:12:11,085 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtInicioRepresentacao
2026-10-29T12:14:34.8803062Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_VNCMO_CERTIDAO_REGULARIDADE')
2026-10-29T12:14:34.8803417Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtVencimentoCertidaoRegularidade with lazy=false
2026-10-29T12:14:34.8803862Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:dtVencimentoCertidaoRegularidade]
2026-10-29T12:14:34.8804420Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtVencimentoCertidaoRegularidade
2026-10-29T12:14:34.8804772Z 2026-10-29 09:12:11,086 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.DT_VNCMO_CERTIDAO_REGULARIDADE
2026-10-29T12:14:34.8805098Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtVencimentoCertidaoRegularidade
2026-10-29T12:14:34.8805420Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_FARMACEUTICO')
2026-10-29T12:14:34.8805771Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8806160Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property farmaceutico
2026-10-29T12:14:34.8806474Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_FARMACIA')
2026-10-29T12:14:34.8806773Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8807062Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property farmacia
2026-10-29T12:14:34.8807338Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_TIPO_ACAO')
2026-10-29T12:14:34.8807658Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icTipoAcao with lazy=false
2026-10-29T12:14:34.8808073Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:icTipoAcao]
2026-10-29T12:14:34.8808483Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icTipoAcao
2026-10-29T12:14:34.8808792Z 2026-10-29 09:12:11,086 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.IC_TIPO_ACAO
2026-10-29T12:14:34.8809553Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icTipoAcao
2026-10-29T12:14:34.8809881Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_FIM_PERIODO')
2026-10-29T12:14:34.8810293Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsFimPeriodo with lazy=false
2026-10-29T12:14:34.8810708Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:tsFimPeriodo]
2026-10-29T12:14:34.8811138Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsFimPeriodo
2026-10-29T12:14:34.8811460Z 2026-10-29 09:12:11,086 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.TS_FIM_PERIODO
2026-10-29T12:14:34.8811760Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsFimPeriodo
2026-10-29T12:14:34.8812073Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_PERIODO')
2026-10-29T12:14:34.8812400Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioPeriodo with lazy=false
2026-10-29T12:14:34.8812826Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:tsInicioPeriodo]
2026-10-29T12:14:34.8813435Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioPeriodo
2026-10-29T12:14:34.8813776Z 2026-10-29 09:12:11,086 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.TS_INICIO_PERIODO
2026-10-29T12:14:34.8814149Z 2026-10-29 09:12:11,086 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioPeriodo
2026-10-29T12:14:34.8814598Z 2026-10-29 09:12:11,086 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29T12:14:34.8814973Z 2026-10-29 09:12:11,087 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.RepresentanteFarmacia
2026-10-29T12:14:34.8815293Z 2026-10-29 09:12:11,087 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name RepresentanteFarmacia
2026-10-29T12:14:34.8815793Z 2026-10-29 09:12:11,088 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.RepresentanteFarmacia on table FAPTB010_RPRSE_FARMACIA
2026-10-29T12:14:34.8816160Z 2026-10-29 09:12:11,088 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29T12:14:34.8816665Z 2026-10-29 09:12:11,089 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_REPRESENTANTE_FARMACIA')
2026-10-29T12:14:34.8817056Z 2026-10-29 09:12:11,089 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.RepresentanteFarmacia] is safe
2026-10-29T12:14:34.8817482Z 2026-10-29 09:12:11,089 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.RepresentanteFarmacia
2026-10-29T12:14:34.8817915Z 2026-10-29 09:12:11,089 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuRepresentanteFarmacia with lazy=false
2026-10-29T12:14:34.8818351Z 2026-10-29 09:12:11,089 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:nuRepresentanteFarmacia]
2026-10-29T12:14:34.8818724Z 2026-10-29 09:12:11,089 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuRepresentanteFarmacia
2026-10-29T12:14:34.8819060Z 2026-10-29 09:12:11,089 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.NU_REPRESENTANTE_FARMACIA
2026-10-29T12:14:34.8819374Z 2026-10-29 09:12:11,089 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuRepresentanteFarmacia
2026-10-29T12:14:34.8819736Z 2026-10-29 09:12:11,089 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_REPRESENTANTE_FARMACIA)]), nuRepresentanteFarmacia, identity, , ...)
2026-10-29T12:14:34.8820539Z 2026-10-29 09:12:11,089 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ACAO_REPRESENTANTE')
2026-10-29T12:14:34.8820904Z 2026-10-29 09:12:11,089 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAcaoRepresentante with lazy=false
2026-10-29T12:14:34.8821346Z 2026-10-29 09:12:11,089 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:coUsuarioAcaoRepresentante]
2026-10-29T12:14:34.8821727Z 2026-10-29 09:12:11,089 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAcaoRepresentante
2026-10-29T12:14:34.8822065Z 2026-10-29 09:12:11,089 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.CO_USUARIO_ACAO_REPRESENTANTE
2026-10-29T12:14:34.8822396Z 2026-10-29 09:12:11,089 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAcaoRepresentante
2026-10-29T12:14:34.8822730Z 2026-10-29 09:12:11,089 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_ENDERECO_IP_REPRESENTANTE')
2026-10-29T12:14:34.8823071Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEnderecoIpRepresentante with lazy=false
2026-10-29T12:14:34.8823500Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:deEnderecoIpRepresentante]
2026-10-29T12:14:34.8823881Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEnderecoIpRepresentante
2026-10-29T12:14:34.8824267Z 2026-10-29 09:12:11,090 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.DE_ENDERECO_IP_REPRESENTANTE
2026-10-29T12:14:34.8824669Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEnderecoIpRepresentante
2026-10-29T12:14:34.8824994Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_TIPO_ACAO')
2026-10-29T12:14:34.8825381Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icTipoAcao with lazy=false
2026-10-29T12:14:34.8825829Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:icTipoAcao]
2026-10-29T12:14:34.8826193Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icTipoAcao
2026-10-29T12:14:34.8826511Z 2026-10-29 09:12:11,090 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.IC_TIPO_ACAO
2026-10-29T12:14:34.8826855Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icTipoAcao
2026-10-29T12:14:34.8827249Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CPF_REPRESENTANTE')
2026-10-29T12:14:34.8827597Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuCpfRepresentante with lazy=false
2026-10-29T12:14:34.8828269Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:nuCpfRepresentante]
2026-10-29T12:14:34.8828643Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuCpfRepresentante
2026-10-29T12:14:34.8828966Z 2026-10-29 09:12:11,090 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.NU_CPF_REPRESENTANTE
2026-10-29T12:14:34.8829281Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuCpfRepresentante
2026-10-29T12:14:34.8829603Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_FIM_VIGENCIA_RPRSE')
2026-10-29T12:14:34.8829938Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsFimVigenciaRprse with lazy=false
2026-10-29T12:14:34.8830361Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:tsFimVigenciaRprse]
2026-10-29T12:14:34.8830741Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsFimVigenciaRprse
2026-10-29T12:14:34.8831073Z 2026-10-29 09:12:11,090 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.TS_FIM_VIGENCIA_RPRSE
2026-10-29T12:14:34.8831389Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsFimVigenciaRprse
2026-10-29T12:14:34.8831678Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_VIGENCIA_RPRSE')
2026-10-29T12:14:34.8832018Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioVigenciaRprse with lazy=false
2026-10-29T12:14:34.8832448Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:tsInicioVigenciaRprse]
2026-10-29T12:14:34.8832822Z 2026-10-29 09:12:11,090 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioVigenciaRprse
2026-10-29T12:14:34.8833220Z 2026-10-29 09:12:11,090 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.TS_INICIO_VIGENCIA_RPRSE
2026-10-29T12:14:34.8833534Z 2026-10-29 09:12:11,091 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioVigenciaRprse
2026-10-29T12:14:34.8833878Z 2026-10-29 09:12:11,091 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29T12:14:34.8834288Z 2026-10-29 09:12:11,091 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.SituacaoFarmacia
2026-10-29T12:14:34.8834620Z 2026-10-29 09:12:11,091 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name SituacaoFarmacia
2026-10-29T12:14:34.8834966Z 2026-10-29 09:12:11,091 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.SituacaoFarmacia on table FAPTB002_SITUACAO_FARMACIA
2026-10-29T12:14:34.8835315Z 2026-10-29 09:12:11,092 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29T12:14:34.8835700Z 2026-10-29 09:12:11,092 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_SITUACAO_FARMACIA')
2026-10-29T12:14:34.8836066Z 2026-10-29 09:12:11,092 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.SituacaoFarmacia] is safe
2026-10-29T12:14:34.8836489Z 2026-10-29 09:12:11,092 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.SituacaoFarmacia
2026-10-29T12:14:34.8836948Z 2026-10-29 09:12:11,092 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuSituacaoFarmacia with lazy=false
2026-10-29T12:14:34.8837373Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:nuSituacaoFarmacia]
2026-10-29T12:14:34.8837834Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuSituacaoFarmacia
2026-10-29T12:14:34.8838174Z 2026-10-29 09:12:11,093 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.NU_SITUACAO_FARMACIA
2026-10-29T12:14:34.8838490Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuSituacaoFarmacia
2026-10-29T12:14:34.8838840Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_SITUACAO_FARMACIA)]), nuSituacaoFarmacia, identity, , ...)
2026-10-29T12:14:34.8839196Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ACAO_SITUACAO')
2026-10-29T12:14:34.8839537Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAcaoSituacao with lazy=false
2026-10-29T12:14:34.8839936Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:coUsuarioAcaoSituacao]
2026-10-29T12:14:34.8840314Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAcaoSituacao
2026-10-29T12:14:34.8840659Z 2026-10-29 09:12:11,093 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.CO_USUARIO_ACAO_SITUACAO
2026-10-29T12:14:34.8840978Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAcaoSituacao
2026-10-29T12:14:34.8841312Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ALTERACAO_SITUACAO')
2026-10-29T12:14:34.8841793Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAlteracaoSituacao with lazy=false
2026-10-29T12:14:34.8842230Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:coUsuarioAlteracaoSituacao]
2026-10-29T12:14:34.8842616Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAlteracaoSituacao
2026-10-29T12:14:34.8842957Z 2026-10-29 09:12:11,093 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.CO_USUARIO_ALTERACAO_SITUACAO
2026-10-29T12:14:34.8843280Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAlteracaoSituacao
2026-10-29T12:14:34.8843611Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_JUSTIFICATIVA_SITUACAO')
2026-10-29T12:14:34.8844093Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deJustificativaSituacao with lazy=false
2026-10-29T12:14:34.8844652Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:deJustificativaSituacao]
2026-10-29T12:14:34.8845039Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deJustificativaSituacao
2026-10-29T12:14:34.8845416Z 2026-10-29 09:12:11,093 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.DE_JUSTIFICATIVA_SITUACAO
2026-10-29T12:14:34.8845744Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deJustificativaSituacao
2026-10-29T12:14:34.8846065Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_SITUACAO_FARMACIA')
2026-10-29T12:14:34.8846402Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhSituacaoFarmacia with lazy=false
2026-10-29T12:14:34.8846825Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:dhSituacaoFarmacia]
2026-10-29T12:14:34.8847194Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhSituacaoFarmacia
2026-10-29T12:14:34.8847519Z 2026-10-29 09:12:11,093 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.DH_SITUACAO_FARMACIA
2026-10-29T12:14:34.8847828Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhSituacaoFarmacia
2026-10-29T12:14:34.8848105Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_FARMACIA')
2026-10-29T12:14:34.8848416Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8848751Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property farmacia
2026-10-29T12:14:34.8849062Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_RENOVACAO')
2026-10-29T12:14:34.8849382Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icRenovacao with lazy=false
2026-10-29T12:14:34.8849791Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:icRenovacao]
2026-10-29T12:14:34.8850155Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icRenovacao
2026-10-29T12:14:34.8850526Z 2026-10-29 09:12:11,093 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.IC_RENOVACAO
2026-10-29T12:14:34.8850824Z 2026-10-29 09:12:11,093 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icRenovacao
2026-10-29T12:14:34.8851129Z 2026-10-29 09:12:11,094 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_MOTIVO_BLOQUEIO')
2026-10-29T12:14:34.8851462Z 2026-10-29 09:12:11,094 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuMotivoBloqueio with lazy=false
2026-10-29T12:14:34.8851877Z 2026-10-29 09:12:11,094 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:nuMotivoBloqueio]
2026-10-29T12:14:34.8852332Z 2026-10-29 09:12:11,094 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuMotivoBloqueio
2026-10-29T12:14:34.8852699Z 2026-10-29 09:12:11,094 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.NU_MOTIVO_BLOQUEIO
2026-10-29T12:14:34.8853007Z 2026-10-29 09:12:11,094 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuMotivoBloqueio
2026-10-29T12:14:34.8853332Z 2026-10-29 09:12:11,094 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_SITUACAO_FARMACIA')
2026-10-29T12:14:34.8853663Z 2026-10-29 09:12:11,094 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoSituacao with lazy=false
2026-10-29T12:14:34.8854046Z 2026-10-29 09:12:11,094 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:nuTipoSituacao]
2026-10-29T12:14:34.8854470Z 2026-10-29 09:12:11,094 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoSituacao
2026-10-29T12:14:34.8854804Z 2026-10-29 09:12:11,094 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.NU_TIPO_SITUACAO_FARMACIA
2026-10-29T12:14:34.8855114Z 2026-10-29 09:12:11,094 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoSituacao
2026-10-29T12:14:34.8855503Z 2026-10-29 09:12:11,094 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_TIPO_SITUACAO_FARMACIA')
2026-10-29T12:14:34.8855815Z 2026-10-29 09:12:11,094 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8856123Z 2026-10-29 09:12:11,094 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tipoSituacao
2026-10-29T12:14:34.8856469Z 2026-10-29 09:12:11,094 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29T12:14:34.8856826Z 2026-10-29 09:12:11,095 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.Farmaceutico
2026-10-29T12:14:34.8857140Z 2026-10-29 09:12:11,095 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name Farmaceutico
2026-10-29T12:14:34.8857472Z 2026-10-29 09:12:11,095 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.Farmaceutico on table FAPTB004_FARMACEUTICO
2026-10-29T12:14:34.8857807Z 2026-10-29 09:12:11,095 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29T12:14:34.8858134Z 2026-10-29 09:12:11,096 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_FARMACEUTICO')
2026-10-29T12:14:34.8858490Z 2026-10-29 09:12:11,096 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.Farmaceutico] is safe
2026-10-29T12:14:34.8858898Z 2026-10-29 09:12:11,096 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.Farmaceutico
2026-10-29T12:14:34.8859390Z 2026-10-29 09:12:11,096 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuFarmaceutico with lazy=false
2026-10-29T12:14:34.8859801Z 2026-10-29 09:12:11,096 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:nuFarmaceutico]
2026-10-29T12:14:34.8860168Z 2026-10-29 09:12:11,096 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuFarmaceutico
2026-10-29T12:14:34.8860488Z 2026-10-29 09:12:11,096 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.NU_FARMACEUTICO
2026-10-29T12:14:34.8860787Z 2026-10-29 09:12:11,096 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuFarmaceutico
2026-10-29T12:14:34.8861095Z 2026-10-29 09:12:11,096 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_FARMACEUTICO)]), nuFarmaceutico, identity, , ...)
2026-10-29T12:14:34.8861489Z 2026-10-29 09:12:11,096 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_IDENTIFICACAO_FARMACEUTICO')
2026-10-29T12:14:34.8861868Z 2026-10-29 09:12:11,096 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coIdentificacaoFarmaceutico with lazy=false
2026-10-29T12:14:34.8862356Z 2026-10-29 09:12:11,096 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:coIdentificacaoFarmaceutico]
2026-10-29T12:14:34.8862741Z 2026-10-29 09:12:11,096 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coIdentificacaoFarmaceutico
2026-10-29T12:14:34.8863083Z 2026-10-29 09:12:11,096 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.CO_IDENTIFICACAO_FARMACEUTICO
2026-10-29T12:14:34.8863410Z 2026-10-29 09:12:11,096 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coIdentificacaoFarmaceutico
2026-10-29T12:14:34.8863736Z 2026-10-29 09:12:11,096 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ACAO_FARMACEUTICO')
2026-10-29T12:14:34.8864149Z 2026-10-29 09:12:11,096 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAcaoFarmaceutico with lazy=false
2026-10-29T12:14:34.8864657Z 2026-10-29 09:12:11,096 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:coUsuarioAcaoFarmaceutico]
2026-10-29T12:14:34.8865041Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAcaoFarmaceutico
2026-10-29T12:14:34.8865387Z 2026-10-29 09:12:11,097 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.CO_USUARIO_ACAO_FARMACEUTICO
2026-10-29T12:14:34.8865703Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAcaoFarmaceutico
2026-10-29T12:14:34.8866031Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_ENDERECO_IP_FARMACEUTICO')
2026-10-29T12:14:34.8866384Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEnderecoIpFarmaceutico with lazy=false
2026-10-29T12:14:34.8866803Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:deEnderecoIpFarmaceutico]
2026-10-29T12:14:34.8867183Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEnderecoIpFarmaceutico
2026-10-29T12:14:34.8867694Z 2026-10-29 09:12:11,097 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.DE_ENDERECO_IP_FARMACEUTICO
2026-10-29T12:14:34.8868106Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEnderecoIpFarmaceutico
2026-10-29T12:14:34.8868430Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_VENCIMENTO_REGISTRO')
2026-10-29T12:14:34.8868769Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtVencimentoRegistro with lazy=false
2026-10-29T12:14:34.8869148Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:dtVencimentoRegistro]
2026-10-29T12:14:34.8869518Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtVencimentoRegistro
2026-10-29T12:14:34.8869949Z 2026-10-29 09:12:11,097 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.DT_VENCIMENTO_REGISTRO
2026-10-29T12:14:34.8870264Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtVencimentoRegistro
2026-10-29T12:14:34.8870580Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_TIPO_ACAO')
2026-10-29T12:14:34.8870902Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icTipoAcao with lazy=false
2026-10-29T12:14:34.8871304Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:icTipoAcao]
2026-10-29T12:14:34.8871664Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icTipoAcao
2026-10-29T12:14:34.8871986Z 2026-10-29 09:12:11,097 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.IC_TIPO_ACAO
2026-10-29T12:14:34.8872287Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icTipoAcao
2026-10-29T12:14:34.8872602Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CPF_FARMACEUTICO')
2026-10-29T12:14:34.8872935Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuCpfFarmaceutico with lazy=false
2026-10-29T12:14:34.8873350Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:nuCpfFarmaceutico]
2026-10-29T12:14:34.8873709Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuCpfFarmaceutico
2026-10-29T12:14:34.8874033Z 2026-10-29 09:12:11,097 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.NU_CPF_FARMACEUTICO
2026-10-29T12:14:34.8874533Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuCpfFarmaceutico
2026-10-29T12:14:34.8874875Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='SG_IDENTIFICACAO_FARMACEUTICO')
2026-10-29T12:14:34.8875230Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property sgIdentificacaoFarmaceutico with lazy=false
2026-10-29T12:14:34.8875659Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:sgIdentificacaoFarmaceutico]
2026-10-29T12:14:34.8876036Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for sgIdentificacaoFarmaceutico
2026-10-29T12:14:34.8876421Z 2026-10-29 09:12:11,097 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.SG_IDENTIFICACAO_FARMACEUTICO
2026-10-29T12:14:34.8876745Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property sgIdentificacaoFarmaceutico
2026-10-29T12:14:34.8877074Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_FIM_VIGENCIA_FARMACEUTICO')
2026-10-29T12:14:34.8877420Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsFimVigenciaFarmaceutico with lazy=false
2026-10-29T12:14:34.8877842Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:tsFimVigenciaFarmaceutico]
2026-10-29T12:14:34.8878216Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsFimVigenciaFarmaceutico
2026-10-29T12:14:34.8878589Z 2026-10-29 09:12:11,097 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.TS_FIM_VIGENCIA_FARMACEUTICO
2026-10-29T12:14:34.8878986Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsFimVigenciaFarmaceutico
2026-10-29T12:14:34.8879318Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_VIGENCIA_FRMCO')
2026-10-29T12:14:34.8879655Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioVigenciaFrmco with lazy=false
2026-10-29T12:14:34.8880073Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:tsInicioVigenciaFrmco]
2026-10-29T12:14:34.8880438Z 2026-10-29 09:12:11,097 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioVigenciaFrmco
2026-10-29T12:14:34.8880770Z 2026-10-29 09:12:11,098 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.TS_INICIO_VIGENCIA_FRMCO
2026-10-29T12:14:34.8881080Z 2026-10-29 09:12:11,098 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioVigenciaFrmco
2026-10-29T12:14:34.8881421Z 2026-10-29 09:12:11,098 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29T12:14:34.8881780Z 2026-10-29 09:12:11,098 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.TipoSituacaoFarmacia
2026-10-29T12:14:34.8882134Z 2026-10-29 09:12:11,098 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name TipoSituacaoFarmacia
2026-10-29T12:14:34.8882552Z 2026-10-29 09:12:11,099 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.TipoSituacaoFarmacia on table FAPTB003_TIPO_STCO_FARMACIA
2026-10-29T12:14:34.8882902Z 2026-10-29 09:12:11,099 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29T12:14:34.8883238Z 2026-10-29 09:12:11,099 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_SITUACAO_FARMACIA')
2026-10-29T12:14:34.8883611Z 2026-10-29 09:12:11,099 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoSituacaoFarmacia] is safe
2026-10-29T12:14:34.8884001Z 2026-10-29 09:12:11,099 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoSituacaoFarmacia
2026-10-29T12:14:34.8884473Z 2026-10-29 09:12:11,100 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoSituacaoFarmacia with lazy=false
2026-10-29T12:14:34.8884929Z 2026-10-29 09:12:11,100 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoSituacaoFarmacia:nuTipoSituacaoFarmacia]
2026-10-29T12:14:34.8885304Z 2026-10-29 09:12:11,100 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoSituacaoFarmacia
2026-10-29T12:14:34.8885647Z 2026-10-29 09:12:11,100 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB003_TIPO_STCO_FARMACIA.NU_TIPO_SITUACAO_FARMACIA
2026-10-29T12:14:34.8885965Z 2026-10-29 09:12:11,100 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoSituacaoFarmacia
2026-10-29T12:14:34.8886293Z 2026-10-29 09:12:11,100 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_TIPO_SITUACAO_FARMACIA')
2026-10-29T12:14:34.8886631Z 2026-10-29 09:12:11,100 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deTipoSituacaoFarmacia with lazy=false
2026-10-29T12:14:34.8887182Z 2026-10-29 09:12:11,100 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoSituacaoFarmacia:deTipoSituacaoFarmacia]
2026-10-29T12:14:34.8887561Z 2026-10-29 09:12:11,100 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deTipoSituacaoFarmacia
2026-10-29T12:14:34.8887894Z 2026-10-29 09:12:11,100 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB003_TIPO_STCO_FARMACIA.DE_TIPO_SITUACAO_FARMACIA
2026-10-29T12:14:34.8888203Z 2026-10-29 09:12:11,100 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deTipoSituacaoFarmacia
2026-10-29T12:14:34.8888552Z 2026-10-29 09:12:11,100 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29T12:14:34.8888918Z 2026-10-29 09:12:11,101 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.FarmaciaAuxiliar
2026-10-29T12:14:34.8889234Z 2026-10-29 09:12:11,101 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name FarmaciaAuxiliar
2026-10-29T12:14:34.8889589Z 2026-10-29 09:12:11,101 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.FarmaciaAuxiliar on table FAPTB012_FARMACIA_AUXILIAR
2026-10-29T12:14:34.8889933Z 2026-10-29 09:12:11,101 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29T12:14:34.8890262Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_FARMACIA_AUXILIAR')
2026-10-29T12:14:34.8890625Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.FarmaciaAuxiliar] is safe
2026-10-29T12:14:34.8891064Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.FarmaciaAuxiliar
2026-10-29T12:14:34.8891491Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuFarmaciaAuxiliar with lazy=false
2026-10-29T12:14:34.8891912Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:nuFarmaciaAuxiliar]
2026-10-29T12:14:34.8892363Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuFarmaciaAuxiliar
2026-10-29T12:14:34.8892700Z 2026-10-29 09:12:11,102 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.NU_FARMACIA_AUXILIAR
2026-10-29T12:14:34.8892976Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuFarmaciaAuxiliar
2026-10-29T12:14:34.8893374Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_FARMACIA_AUXILIAR)]), nuFarmaciaAuxiliar, identity, , ...)
2026-10-29T12:14:34.8893732Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_CNPJ_ESTABELECIMENTO_LEGADO')
2026-10-29T12:14:34.8894081Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coCnpjEstabelecimentoLegado with lazy=false
2026-10-29T12:14:34.8894888Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:coCnpjEstabelecimentoLegado]
2026-10-29T12:14:34.8895274Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coCnpjEstabelecimentoLegado
2026-10-29T12:14:34.8895677Z 2026-10-29 09:12:11,102 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.CO_CNPJ_ESTABELECIMENTO_LEGADO
2026-10-29T12:14:34.8896007Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coCnpjEstabelecimentoLegado
2026-10-29T12:14:34.8896353Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_CNPJ_MATRIZ_LEGADO')
2026-10-29T12:14:34.8896690Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coCnpjMatrizLegado with lazy=false
2026-10-29T12:14:34.8897111Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:coCnpjMatrizLegado]
2026-10-29T12:14:34.8897481Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coCnpjMatrizLegado
2026-10-29T12:14:34.8897818Z 2026-10-29 09:12:11,102 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.CO_CNPJ_MATRIZ_LEGADO
2026-10-29T12:14:34.8898186Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coCnpjMatrizLegado
2026-10-29T12:14:34.8898511Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_MOTIVO_BLOQUEIO')
2026-10-29T12:14:34.8898845Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deMotivoBloqueio with lazy=false
2026-10-29T12:14:34.8899257Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:deMotivoBloqueio]
2026-10-29T12:14:34.8899624Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deMotivoBloqueio
2026-10-29T12:14:34.8899959Z 2026-10-29 09:12:11,102 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.DE_MOTIVO_BLOQUEIO
2026-10-29T12:14:34.8900269Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deMotivoBloqueio
2026-10-29T12:14:34.8900589Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_ATUALIZACAO_CADASTRO')
2026-10-29T12:14:34.8900891Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhAtualizacaoCadastro with lazy=false
2026-10-29T12:14:34.8901315Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:dhAtualizacaoCadastro]
2026-10-29T12:14:34.8901690Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhAtualizacaoCadastro
2026-10-29T12:14:34.8902080Z 2026-10-29 09:12:11,102 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.DH_ATUALIZACAO_CADASTRO
2026-10-29T12:14:34.8902390Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhAtualizacaoCadastro
2026-10-29T12:14:34.8902697Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_BLOQUEIO')
2026-10-29T12:14:34.8903025Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtBloqueio with lazy=false
2026-10-29T12:14:34.8903435Z 2026-10-29 09:12:11,102 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:dtBloqueio]
2026-10-29T12:14:34.8903884Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtBloqueio
2026-10-29T12:14:34.8904515Z 2026-10-29 09:12:11,103 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.DT_BLOQUEIO
2026-10-29T12:14:34.8904925Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtBloqueio
2026-10-29T12:14:34.8905374Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_ATUALIZACAO_CADASTRO')
2026-10-29T12:14:34.8905832Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icAtualizacaoCadastro with lazy=false
2026-10-29T12:14:34.8906342Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:icAtualizacaoCadastro]
2026-10-29T12:14:34.8906721Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icAtualizacaoCadastro
2026-10-29T12:14:34.8907056Z 2026-10-29 09:12:11,103 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.IC_ATUALIZACAO_CADASTRO
2026-10-29T12:14:34.8907368Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icAtualizacaoCadastro
2026-10-29T12:14:34.8907690Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CNPJ_ESTABELECIMENTO')
2026-10-29T12:14:34.8908028Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuCnpjEstabelecimento with lazy=false
2026-10-29T12:14:34.8908449Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:nuCnpjEstabelecimento]
2026-10-29T12:14:34.8908828Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuCnpjEstabelecimento
2026-10-29T12:14:34.8909128Z 2026-10-29 09:12:11,103 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.NU_CNPJ_ESTABELECIMENTO
2026-10-29T12:14:34.8909444Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuCnpjEstabelecimento
2026-10-29T12:14:34.8909767Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CNPJ_MATRIZ')
2026-10-29T12:14:34.8910092Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuCnpjMatriz with lazy=false
2026-10-29T12:14:34.8910495Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:nuCnpjMatriz]
2026-10-29T12:14:34.8910950Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuCnpjMatriz
2026-10-29T12:14:34.8911273Z 2026-10-29 09:12:11,103 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.NU_CNPJ_MATRIZ
2026-10-29T12:14:34.8911577Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuCnpjMatriz
2026-10-29T12:14:34.8911888Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_MOTIVO_BLOQUEIO')
2026-10-29T12:14:34.8912231Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuMotivoBloqueio with lazy=false
2026-10-29T12:14:34.8912729Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:nuMotivoBloqueio]
2026-10-29T12:14:34.8913175Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuMotivoBloqueio
2026-10-29T12:14:34.8913550Z 2026-10-29 09:12:11,103 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.NU_MOTIVO_BLOQUEIO
2026-10-29T12:14:34.8913854Z 2026-10-29 09:12:11,103 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuMotivoBloqueio
2026-10-29T12:14:34.8914247Z 2026-10-29 09:12:11,103 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29T12:14:34.8914630Z 2026-10-29 09:12:11,104 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.ItemAnaliseDocumento
2026-10-29T12:14:34.8914952Z 2026-10-29 09:12:11,104 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name ItemAnaliseDocumento
2026-10-29T12:14:34.8915309Z 2026-10-29 09:12:11,104 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.ItemAnaliseDocumento on table FAPTB018_ITEM_ANALISE_DCMTO
2026-10-29T12:14:34.8915732Z 2026-10-29 09:12:11,104 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-10-29T12:14:34.8916043Z 2026-10-29 09:12:11,105 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_ITEM_ANALISE_DOCUMENTO')
2026-10-29T12:14:34.8916565Z 2026-10-29 09:12:11,105 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.ItemAnaliseDocumento] is safe
2026-10-29T12:14:34.8917008Z 2026-10-29 09:12:11,105 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.ItemAnaliseDocumento
2026-10-29T12:14:34.8917386Z 2026-10-29 09:12:11,105 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuItemAnaliseDocumento with lazy=false
2026-10-29T12:14:34.8917826Z 2026-10-29 09:12:11,105 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemAnaliseDocumento:nuItemAnaliseDocumento]
2026-10-29T12:14:34.8918207Z 2026-10-29 09:12:11,105 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuItemAnaliseDocumento
2026-10-29T12:14:34.8918552Z 2026-10-29 09:12:11,105 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB018_ITEM_ANALISE_DCMTO.NU_ITEM_ANALISE_DOCUMENTO
2026-10-29T12:14:34.8918871Z 2026-10-29 09:12:11,105 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuItemAnaliseDocumento
2026-10-29T12:14:34.8919233Z 2026-10-29 09:12:11,105 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_ITEM_ANALISE_DOCUMENTO)]), nuItemAnaliseDocumento, identity, , ...)
2026-10-29T12:14:34.8919641Z 2026-10-29 09:12:11,105 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_SQNCL_ANALISE_DOCUMENTO',referencedColumn='NU_SQNCL_ANALISE_DOCUMENTO')
2026-10-29T12:14:34.8920049Z 2026-10-29 09:12:11,105 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8920341Z 2026-10-29 09:12:11,105 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property analiseDocumento
2026-10-29T12:14:34.8920659Z 2026-10-29 09:12:11,105 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_ITEM_ANALISE')
2026-10-29T12:14:34.8921078Z 2026-10-29 09:12:11,105 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhItemAnalise with lazy=false
2026-10-29T12:14:34.8921495Z 2026-10-29 09:12:11,105 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemAnaliseDocumento:dhItemAnalise]
2026-10-29T12:14:34.8921859Z 2026-10-29 09:12:11,105 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhItemAnalise
2026-10-29T12:14:34.8922225Z 2026-10-29 09:12:11,105 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB018_ITEM_ANALISE_DCMTO.DH_ITEM_ANALISE
2026-10-29T12:14:34.8922535Z 2026-10-29 09:12:11,105 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhItemAnalise
2026-10-29T12:14:34.8922848Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_ITEM_PENDENTE')
2026-10-29T12:14:34.8923176Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icItemPendente with lazy=false
2026-10-29T12:14:34.8923594Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemAnaliseDocumento:icItemPendente]
2026-10-29T12:14:34.8923962Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icItemPendente
2026-10-29T12:14:34.8924305Z 2026-10-29 09:12:11,106 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB018_ITEM_ANALISE_DCMTO.IC_ITEM_PENDENTE
2026-10-29T12:14:34.8924634Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icItemPendente
2026-10-29T12:14:34.8924945Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_MATRICULA')
2026-10-29T12:14:34.8925273Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuMatricula with lazy=false
2026-10-29T12:14:34.8925683Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemAnaliseDocumento:nuMatricula]
2026-10-29T12:14:34.8926045Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuMatricula
2026-10-29T12:14:34.8926360Z 2026-10-29 09:12:11,106 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB018_ITEM_ANALISE_DCMTO.NU_MATRICULA
2026-10-29T12:14:34.8926652Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuMatricula
2026-10-29T12:14:34.8926967Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_SQNCL_ANALISE_DOCUMENTO')
2026-10-29T12:14:34.8927302Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuSqnclAnaliseDocumento with lazy=false
2026-10-29T12:14:34.8927734Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemAnaliseDocumento:nuSqnclAnaliseDocumento]
2026-10-29T12:14:34.8928165Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuSqnclAnaliseDocumento
2026-10-29T12:14:34.8928508Z 2026-10-29 09:12:11,106 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB018_ITEM_ANALISE_DCMTO.NU_SQNCL_ANALISE_DOCUMENTO
2026-10-29T12:14:34.8928828Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuSqnclAnaliseDocumento
2026-10-29T12:14:34.8929151Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DCMTO_ITM_VLDCO')
2026-10-29T12:14:34.8929488Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDcmtoItmVldco with lazy=false
2026-10-29T12:14:34.8929908Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemAnaliseDocumento:nuTipoDcmtoItmVldco]
2026-10-29T12:14:34.8930320Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDcmtoItmVldco
2026-10-29T12:14:34.8930657Z 2026-10-29 09:12:11,106 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB018_ITEM_ANALISE_DCMTO.NU_TIPO_DCMTO_ITM_VLDCO
2026-10-29T12:14:34.8930969Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDcmtoItmVldco
2026-10-29T12:14:34.8931308Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_TIPO_DCMTO_ITM_VLDCO',referencedColumn='NU_TIPO_DCMTO_ITM_VLDCO')
2026-10-29T12:14:34.8931643Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-10-29T12:14:34.8931944Z 2026-10-29 09:12:11,106 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tipoDocumentoItemValidacao
2026-10-29T12:14:34.8932301Z 2026-10-29 09:12:11,106 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-10-29T12:14:34.8932659Z 2026-10-29 09:12:11,108 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDcmtoItmVldco
2026-10-29T12:14:34.8932997Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deJustificativaPadrao
2026-10-29T12:14:34.8933334Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuItemValidacao
2026-10-29T12:14:34.8933661Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDocumento
2026-10-29T12:14:34.8933998Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuSqnclAnaliseDocumento
2026-10-29T12:14:34.8934456Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coCpfCnpjDocumento
2026-10-29T12:14:34.8934809Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAnaliseDocumento
2026-10-29T12:14:34.8935148Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deJustificativa
2026-10-29T12:14:34.8935480Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhAnaliseDocumento
2026-10-29T12:14:34.8935821Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhFimAnaliseDocumento
2026-10-29T12:14:34.8936155Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icAnaliseDocumento
2026-10-29T12:14:34.8936533Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icCpfCnpjDocumento
2026-10-29T12:14:34.8936874Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icUsuarioAnaliseDocumento
2026-10-29T12:14:34.8937222Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuIdentificadorDocumento
2026-10-29T12:14:34.8937560Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDocumento
2026-10-29T12:14:34.8937884Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsFimPeriodo
2026-10-29T12:14:34.8938184Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioPeriodo
2026-10-29T12:14:34.8938555Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDocumento
2026-10-29T12:14:34.8938980Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coTipologiaDocumento
2026-10-29T12:14:34.8939335Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deTipoDocumentoFarmacia
2026-10-29T12:14:34.8939678Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icClasseTipoDocumento
2026-10-29T12:14:34.8940016Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icDocumentoObrigatorio
2026-10-29T12:14:34.8940354Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuRepresentacaoFarmacia
2026-10-29T12:14:34.8940804Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAcaoRepresentacao
2026-10-29T12:14:34.8941387Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEmailRepresentante
2026-10-29T12:14:34.8941740Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEnderecoIpRepresentacao
2026-10-29T12:14:34.8942126Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtFimRepresentacao
2026-10-29T12:14:34.8942695Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtInicioRepresentacao
2026-10-29T12:14:34.8943100Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icResponsavelLegal
2026-10-29T12:14:34.8943446Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icTipoAcao
2026-10-29T12:14:34.8943781Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuDddRepresentante
2026-10-29T12:14:34.8944113Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTelefoneRepresentante
2026-10-29T12:14:34.8944520Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsFimPeriodo
2026-10-29T12:14:34.8944851Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioPeriodo
2026-10-29T12:14:34.8945180Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuItemValidacao
2026-10-29T12:14:34.8945664Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for noItemValidado
2026-10-29T12:14:34.8945966Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuControleDocumento
2026-10-29T12:14:34.8946299Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhEnvioDocumento
2026-10-29T12:14:34.8946626Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icDocumentoLocal
2026-10-29T12:14:34.8946957Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuFarmaceutico
2026-10-29T12:14:34.8947285Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuFarmacia
2026-10-29T12:14:34.8947664Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuRepresentanteFarmacia
2026-10-29T12:14:34.8948028Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDocumento
2026-10-29T12:14:34.8948420Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuSqnclAnaliseDocumento
2026-10-29T12:14:34.8948754Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioPeriodo
2026-10-29T12:14:34.8949089Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coCpfCnpjDocumento
2026-10-29T12:14:34.8949426Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAnaliseDocumento
2026-10-29T12:14:34.8949759Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deJustificativa
2026-10-29T12:14:34.8950089Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhAnaliseDocumento
2026-10-29T12:14:34.8950479Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhFimAnaliseDocumento
2026-10-29T12:14:34.8950820Z 2026-10-29 09:12:11,110 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icAnaliseDocumento
2026-10-29T12:14:34.8951148Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icCpfCnpjDocumento
2026-10-29T12:14:34.8951489Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icUsuarioAnaliseDocumento
2026-10-29T12:14:34.8951838Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuIdentificadorDocumento
2026-10-29T12:14:34.8952176Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDocumento
2026-10-29T12:14:34.8952490Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for id
2026-10-29T12:14:34.8952779Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDocumento
2026-10-29T12:14:34.8953111Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coTipologiaDocumento
2026-10-29T12:14:34.8953450Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deTipoDocumentoFarmacia
2026-10-29T12:14:34.8953830Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icClasseTipoDocumento
2026-10-29T12:14:34.8954176Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icDocumentoObrigatorio
2026-10-29T12:14:34.8954573Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuFarmacia
2026-10-29T12:14:34.8954910Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coCnpjEstabelecimentoLegado
2026-10-29T12:14:34.8955252Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coLicencaFuncionamento
2026-10-29T12:14:34.8955588Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coProcessoSei
2026-10-29T12:14:34.8955975Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAcaoFarmacia
2026-10-29T12:14:34.8956307Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEmailFarmacia
2026-10-29T12:14:34.8956640Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEnderecoIpFarmacia
2026-10-29T12:14:34.8956976Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhAtualizacaoFarmacia
2026-10-29T12:14:34.8957318Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhSubmissaoSlctoCadastro
2026-10-29T12:14:34.8957806Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtVencimentoCnd
2026-10-29T12:14:34.8958148Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtVencimentoLicencaFncmo
2026-10-29T12:14:34.8958477Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icEfetuaVenda
2026-10-29T12:14:34.8958813Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icEmissaoFiscalEletronico
2026-10-29T12:14:34.8959142Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icTipoAcao
2026-10-29T12:14:34.8959481Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for noTitularidadeContaCredito
2026-10-29T12:14:34.8959831Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuAgencia
2026-10-29T12:14:34.8960227Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuBanco
2026-10-29T12:14:34.8960628Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuCnpjEstabelecimento
2026-10-29T12:14:34.8960956Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuConta
2026-10-29T12:14:34.8961279Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuDddAlternativo
2026-10-29T12:14:34.8961606Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuDddPrincipal
2026-10-29T12:14:34.8961934Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuDvAgencia
2026-10-29T12:14:34.8962306Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuDvConta
2026-10-29T12:14:34.8962633Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuIbgeMunicipio
2026-10-29T12:14:34.8962966Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuInscricaoInss
2026-10-29T12:14:34.8963298Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuRegistroJuntaComercial
2026-10-29T12:14:34.8963636Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTelefoneAlternativo
2026-10-29T12:14:34.8963967Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTelefonePrincipal
2026-10-29T12:14:34.8964386Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoConta
2026-10-29T12:14:34.8964717Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for sgUfFarmacia
2026-10-29T12:14:34.8965062Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsFimVigenciaFarmacia
2026-10-29T12:14:34.8965591Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioVigenciaFarmacia
2026-10-29T12:14:34.8965992Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuRepresentacaoTecnica
2026-10-29T12:14:34.8966341Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAcaoRepresentacao
2026-10-29T12:14:34.8966658Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEnderecoIpRepresentacao
2026-10-29T12:14:34.8967068Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtFimRepresentacao
2026-10-29T12:14:34.8967498Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtInicioRepresentacao
2026-10-29T12:14:34.8967854Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtVencimentoCertidaoRegularidade
2026-10-29T12:14:34.8968197Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icTipoAcao
2026-10-29T12:14:34.8968528Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsFimPeriodo
2026-10-29T12:14:34.8968933Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioPeriodo
2026-10-29T12:14:34.8969406Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuRepresentanteFarmacia
2026-10-29T12:14:34.8969774Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAcaoRepresentante
2026-10-29T12:14:34.8970190Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEnderecoIpRepresentante
2026-10-29T12:14:34.8970574Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icTipoAcao
2026-10-29T12:14:34.8970973Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuCpfRepresentante
2026-10-29T12:14:34.8971313Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsFimVigenciaRprse
2026-10-29T12:14:34.8971651Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioVigenciaRprse
2026-10-29T12:14:34.8972108Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuSituacaoFarmacia
2026-10-29T12:14:34.8972436Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAcaoSituacao
2026-10-29T12:14:34.8972772Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAlteracaoSituacao
2026-10-29T12:14:34.8973174Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deJustificativaSituacao
2026-10-29T12:14:34.8973571Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhSituacaoFarmacia
2026-10-29T12:14:34.8973932Z 2026-10-29 09:12:11,111 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icRenovacao
2026-10-29T12:14:34.8974318Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuMotivoBloqueio
2026-10-29T12:14:34.8974630Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoSituacao
2026-10-29T12:14:34.8974961Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuFarmaceutico
2026-10-29T12:14:34.8975352Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coIdentificacaoFarmaceutico
2026-10-29T12:14:34.8975734Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAcaoFarmaceutico
2026-10-29T12:14:34.8976075Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEnderecoIpFarmaceutico
2026-10-29T12:14:34.8976416Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtVencimentoRegistro
2026-10-29T12:14:34.8976765Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icTipoAcao
2026-10-29T12:14:34.8977144Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuCpfFarmaceutico
2026-10-29T12:14:34.8977526Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for sgIdentificacaoFarmaceutico
2026-10-29T12:14:34.8977873Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsFimVigenciaFarmaceutico
2026-10-29T12:14:34.8978208Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioVigenciaFrmco
2026-10-29T12:14:34.8978541Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoSituacaoFarmacia
2026-10-29T12:14:34.8978995Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deTipoSituacaoFarmacia
2026-10-29T12:14:34.8979342Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuFarmaciaAuxiliar
2026-10-29T12:14:34.8979730Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coCnpjEstabelecimentoLegado
2026-10-29T12:14:34.8980218Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coCnpjMatrizLegado
2026-10-29T12:14:34.8980611Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deMotivoBloqueio
2026-10-29T12:14:34.8980992Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhAtualizacaoCadastro
2026-10-29T12:14:34.8981327Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtBloqueio
2026-10-29T12:14:34.8981664Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icAtualizacaoCadastro
2026-10-29T12:14:34.8982073Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuCnpjEstabelecimento
2026-10-29T12:14:34.8982405Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuCnpjMatriz
2026-10-29T12:14:34.8982737Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuMotivoBloqueio
2026-10-29T12:14:34.8983069Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuItemAnaliseDocumento
2026-10-29T12:14:34.8983402Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhItemAnalise
2026-10-29T12:14:34.8983762Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icItemPendente
2026-10-29T12:14:34.8984129Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuMatricula
2026-10-29T12:14:34.8984582Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuSqnclAnaliseDocumento
2026-10-29T12:14:34.8984984Z 2026-10-29 09:12:11,112 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDcmtoItmVldco
2026-10-29T12:14:34.8985366Z 2026-10-29 09:12:11,119 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_tipo_dcmto_itm_vldco] to be non-null as it is part of the primary key for table [faptb017_tipo_dcmto_itm_vldco]
2026-10-29T12:14:34.8985853Z 2026-10-29 09:12:11,119 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_sqncl_analise_documento] to be non-null as it is part of the primary key for table [faptb019_analise_documento]
2026-10-29T12:14:34.8986309Z 2026-10-29 09:12:11,119 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_tipo_documento] to be non-null as it is part of the primary key for table [faptb006_tipo_documento]
2026-10-29T12:14:34.8986752Z 2026-10-29 09:12:11,119 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_representacao_farmacia] to be non-null as it is part of the primary key for table [faptb011_rprto_farmacia]
2026-10-29T12:14:34.8987174Z 2026-10-29 09:12:11,119 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_item_validacao] to be non-null as it is part of the primary key for table [faptb016_item_validacao]
2026-10-29T12:14:34.8987634Z 2026-10-29 09:12:11,119 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_controle_documento] to be non-null as it is part of the primary key for table [faptb014_controle_documento]
2026-10-29T12:14:34.8988118Z 2026-10-29 09:12:11,119 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_sqncl_analise_documento] to be non-null as it is part of the primary key for table [faptb119_hstro_anlse_documento]
2026-10-29T12:14:34.8988573Z 2026-10-29 09:12:11,119 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [ts_inicio_periodo] to be non-null as it is part of the primary key for table [faptb119_hstro_anlse_documento]
2026-10-29T12:14:34.8988934Z 2026-10-29 09:12:11,119 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [id] to be non-null as it is part of the primary key for table [sqlmappings]
2026-10-29T12:14:34.8989311Z 2026-10-29 09:12:11,119 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_tipo_documento] to be non-null as it is part of the primary key for table [faptb006_tipo_documento]
2026-10-29T12:14:34.8989687Z 2026-10-29 09:12:11,119 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_farmacia] to be non-null as it is part of the primary key for table [faptb001_farmacia]
2026-10-29T12:14:34.8990122Z 2026-10-29 09:12:11,119 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_representacao_tecnica] to be non-null as it is part of the primary key for table [faptb005_rprse_tecnica]
2026-10-29T12:14:34.8990581Z 2026-10-29 09:12:11,119 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_representante_farmacia] to be non-null as it is part of the primary key for table [faptb010_rprse_farmacia]
2026-10-29T12:14:34.8990979Z 2026-10-29 09:12:11,119 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_situacao_farmacia] to be non-null as it is part of the primary key for table [faptb002_situacao_farmacia]
2026-10-29T12:14:34.8991401Z 2026-10-29 09:12:11,119 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_farmaceutico] to be non-null as it is part of the primary key for table [faptb004_farmaceutico]
2026-10-29T12:14:34.8991888Z 2026-10-29 09:12:11,119 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_tipo_situacao_farmacia] to be non-null as it is part of the primary key for table [faptb003_tipo_stco_farmacia]
2026-10-29T12:14:34.8992335Z 2026-10-29 09:12:11,119 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_farmacia_auxiliar] to be non-null as it is part of the primary key for table [faptb012_farmacia_auxiliar]
2026-10-29T12:14:34.8992736Z 2026-10-29 09:12:11,119 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_item_analise_documento] to be non-null as it is part of the primary key for table [faptb018_item_analise_dcmto]
2026-10-29T12:14:34.8993125Z 2026-10-29 09:12:11,122 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Second pass for collection: br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise
2026-10-29T12:14:34.8993525Z 2026-10-29 09:12:11,122 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Binding a OneToMany: br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise through a foreign key
2026-10-29T12:14:34.8994067Z 2026-10-29 09:12:11,124 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Mapping collection: br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise -> FAPTB018_ITEM_ANALISE_DCMTO
2026-10-29T12:14:34.8994530Z 2026-10-29 09:12:11,135 DEBUG [org.hib.boo.mod.int.TableBinder] (main) Retrieving property br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento
2026-10-29T12:14:34.8994937Z 2026-10-29 09:12:11,136 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Mapped collection key: NU_SQNCL_ANALISE_DOCUMENTO, one-to-many: br.com.caixa.sifap.entity.ItemAnaliseDocumento
2026-10-29T12:14:34.8995329Z 2026-10-29 09:12:11,136 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Second pass for collection: br.com.caixa.sifap.entity.Farmacia.representacoes
2026-10-29T12:14:34.8995808Z 2026-10-29 09:12:11,136 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Binding a OneToMany: br.com.caixa.sifap.entity.Farmacia.representacoes through a foreign key
2026-10-29T12:14:34.8996250Z 2026-10-29 09:12:11,136 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Mapping collection: br.com.caixa.sifap.entity.Farmacia.representacoes -> FAPTB011_RPRTO_FARMACIA
2026-10-29T12:14:34.8996619Z 2026-10-29 09:12:11,136 DEBUG [org.hib.boo.mod.int.TableBinder] (main) Retrieving property br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia
2026-10-29T12:14:34.8997098Z 2026-10-29 09:12:11,136 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Mapped collection key: NU_FARMACIA, one-to-many: br.com.caixa.sifap.entity.RepresentacaoFarmacia
2026-10-29T12:14:34.8997621Z 2026-10-29 09:12:11,136 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Second pass for collection: br.com.caixa.sifap.entity.Farmacia.representacoesTecnica
2026-10-29T12:14:34.8998013Z 2026-10-29 09:12:11,136 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Binding a OneToMany: br.com.caixa.sifap.entity.Farmacia.representacoesTecnica through a foreign key
2026-10-29T12:14:34.8998573Z 2026-10-29 09:12:11,136 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Mapping collection: br.com.caixa.sifap.entity.Farmacia.representacoesTecnica -> FAPTB005_RPRSE_TECNICA
2026-10-29T12:14:34.8999111Z 2026-10-29 09:12:11,137 DEBUG [org.hib.boo.mod.int.TableBinder] (main) Retrieving property br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia
2026-10-29T12:14:34.8999809Z 2026-10-29 09:12:11,137 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Mapped collection key: NU_FARMACIA, one-to-many: br.com.caixa.sifap.entity.RepresentacaoTecnica
2026-10-29T12:14:34.9000259Z 2026-10-29 09:12:11,137 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Second pass for collection: br.com.caixa.sifap.entity.Farmacia.situacoes
2026-10-29T12:14:34.9000655Z 2026-10-29 09:12:11,137 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Binding a OneToMany: br.com.caixa.sifap.entity.Farmacia.situacoes through a foreign key
2026-10-29T12:14:34.9001043Z 2026-10-29 09:12:11,137 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Mapping collection: br.com.caixa.sifap.entity.Farmacia.situacoes -> FAPTB002_SITUACAO_FARMACIA
2026-10-29T12:14:34.9001476Z 2026-10-29 09:12:11,137 DEBUG [org.hib.boo.mod.int.TableBinder] (main) Retrieving property br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia
2026-10-29T12:14:34.9001888Z 2026-10-29 09:12:11,137 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Mapped collection key: NU_FARMACIA, one-to-many: br.com.caixa.sifap.entity.SituacaoFarmacia
2026-10-29T12:14:34.9002215Z 2026-10-29 09:12:11,215 DEBUG [org.inf.qua.hib.cac.QuarkusInfinispanRegionFactory] (main) Stop region factory
2026-10-29T12:14:34.9002520Z 2026-10-29 09:12:11,215 DEBUG [org.inf.qua.hib.cac.QuarkusInfinispanRegionFactory] (main) Clear region references
2026-10-29T12:14:34.9002882Z 2026-10-29 09:12:11,216 DEBUG [org.hib.boo.reg.int.BootstrapServiceRegistryImpl] (main) Implicitly destroying Boot-strap registry on de-registration of all child ServiceRegistries
2026-10-29T12:14:34.9003268Z 2026-10-29 09:12:11,216 DEBUG [org.hib.boo.reg.int.BootstrapServiceRegistryImpl] (main) Implicitly destroying Boot-strap registry on de-registration of all child ServiceRegistries
2026-10-29T12:14:34.9003732Z 2026-10-29 09:12:11,217 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.Farmaceutico] is safe
2026-10-29T12:14:34.9004148Z 2026-10-29 09:12:11,217 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.Farmaceutico
2026-10-29T12:14:34.9004610Z 2026-10-29 09:12:11,219 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.RepresentacaoFarmacia] is safe
2026-10-29T12:14:34.9005074Z 2026-10-29 09:12:11,219 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.RepresentacaoFarmacia
2026-10-29T12:14:34.9005468Z 2026-10-29 09:12:11,221 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.SituacaoFarmacia] is safe
2026-10-29T12:14:34.9005955Z 2026-10-29 09:12:11,221 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.SituacaoFarmacia
2026-10-29T12:14:34.9006424Z 2026-10-29 09:12:11,222 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoDocumentoFarmacia] is safe
2026-10-29T12:14:34.9006929Z 2026-10-29 09:12:11,222 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoDocumentoFarmacia
2026-10-29T12:14:34.9007354Z 2026-10-29 09:12:11,223 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.ControleDocumento] is safe
2026-10-29T12:14:34.9007817Z 2026-10-29 09:12:11,223 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.ControleDocumento
2026-10-29T12:14:34.9008271Z 2026-10-29 09:12:11,224 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento] is safe
2026-10-29T12:14:34.9008746Z 2026-10-29 09:12:11,224 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.HistoricoAnaliseDocumento
2026-10-29T12:14:34.9009148Z 2026-10-29 09:12:11,235 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.RepresentacaoTecnica] is safe
2026-10-29T12:14:34.9009561Z 2026-10-29 09:12:11,236 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.RepresentacaoTecnica
2026-10-29T12:14:34.9010008Z 2026-10-29 09:12:11,238 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.ItemValidacao] is safe
2026-10-29T12:14:34.9010572Z 2026-10-29 09:12:11,238 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.ItemValidacao
2026-10-29T12:14:34.9011117Z 2026-10-29 09:12:11,239 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoSituacaoFarmacia] is safe
2026-10-29T12:14:34.9011610Z 2026-10-29 09:12:11,239 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoSituacaoFarmacia
2026-10-29T12:14:34.9012193Z 2026-10-29 09:12:11,240 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.Farmacia] is safe
2026-10-29T12:14:34.9012777Z 2026-10-29 09:12:11,240 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.Farmacia
2026-10-29T12:14:34.9013399Z 2026-10-29 09:12:11,243 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.RepresentanteFarmacia] is safe
2026-10-29T12:14:34.9014571Z 2026-10-29 09:12:11,243 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.RepresentanteFarmacia
2026-10-29T12:14:34.9015203Z 2026-10-29 09:12:11,244 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.AnaliseDocumento] is safe
2026-10-29T12:14:34.9015797Z 2026-10-29 09:12:11,244 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.AnaliseDocumento
2026-10-29T12:14:34.9016499Z 2026-10-29 09:12:11,245 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.SqlMappings] is safe
2026-10-29T12:14:34.9016923Z 2026-10-29 09:12:11,245 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.SqlMappings
2026-10-29T12:14:34.9017308Z 2026-10-29 09:12:11,246 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.FarmaciaAuxiliar] is safe
2026-10-29T12:14:34.9017812Z 2026-10-29 09:12:11,246 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.FarmaciaAuxiliar
2026-10-29T12:14:34.9018240Z 2026-10-29 09:12:11,247 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoDocumento] is safe
2026-10-29T12:14:34.9018702Z 2026-10-29 09:12:11,247 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoDocumento
2026-10-29T12:14:34.9019098Z 2026-10-29 09:12:11,248 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.ItemAnaliseDocumento] is safe
2026-10-29T12:14:34.9019515Z 2026-10-29 09:12:11,248 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.ItemAnaliseDocumento
2026-10-29T12:14:34.9019915Z 2026-10-29 09:12:11,249 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao] is safe
2026-10-29T12:14:34.9020333Z 2026-10-29 09:12:11,249 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoDocumentoItemValidacao
2026-10-29T12:14:34.9020738Z 2026-10-29 09:12:11,254 DEBUG [io.qua.arc.run.ArcRecorder] (main) Bean container listener io.quarkus.hibernate.orm.runtime.HibernateOrmRecorder$1 finished in 796 ms
2026-10-29T12:14:34.9021066Z 2026-10-29 09:12:11,291 DEBUG [org.hib.val.int.uti.Version] (main) HV000001: Hibernate Validator 8.0.2.Final
2026-10-29T12:14:34.9021446Z 2026-10-29 09:12:11,294 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom LocaleResolver of type io.quarkus.hibernate.validator.runtime.locale.LocaleResolversWrapper
2026-10-29T12:14:34.9021883Z 2026-10-29 09:12:11,296 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom BeanMetaDataClassNormalizer of type io.quarkus.hibernate.validator.runtime.ArcProxyBeanMetaDataClassNormalizer
2026-10-29T12:14:34.9022210Z 2026-10-29 09:12:11,318 DEBUG [io.qua.arc.impl] (main) Loaded 66 removed beans lazily
2026-10-29T12:14:34.9022680Z 2026-10-29 09:12:11,319 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom ConstraintValidatorFactory of type io.quarkus.hibernate.validator.runtime.ArcConstraintValidatorFactoryImpl
2026-10-29T12:14:34.9023108Z 2026-10-29 09:12:11,320 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom TraversableResolver of type org.hibernate.validator.internal.engine.resolver.JPATraversableResolver
2026-10-29T12:14:34.9023624Z 2026-10-29 09:12:11,321 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom ClockProvider of type io.quarkus.hibernate.validator.runtime.clockprovider.RuntimeReinitializedDefaultClockProvider
2026-10-29T12:14:34.9023980Z 2026-10-29 09:12:11,322 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) HV000002: Ignoring XML configuration.
2026-10-29T12:14:34.9024377Z 2026-10-29 09:12:11,385 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) ValidationMessages not found.
2026-10-29T12:14:34.9024823Z 2026-10-29 09:12:11,386 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000255: Using io.quarkus.hibernate.validator.runtime.locale.LocaleResolversWrapper as locale resolver.
2026-10-29T12:14:34.9025181Z 2026-10-29 09:12:11,387 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) ContributorValidationMessages not found.
2026-10-29T12:14:34.9025511Z 2026-10-29 09:12:11,388 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) org.hibernate.validator.ValidationMessages found.
2026-10-29T12:14:34.9025847Z 2026-10-29 09:12:11,394 DEBUG [org.hib.val.mes.ResourceBundleMessageInterpolator] (main) Loaded expression factory via original TCCL
2026-10-29T12:14:34.9026251Z 2026-10-29 09:12:11,398 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000252: Using org.hibernate.validator.internal.engine.DefaultPropertyNodeNameProvider as property node name provider.
2026-10-29T12:14:34.9026727Z 2026-10-29 09:12:11,427 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator as ValidatorFactory-scoped message interpolator.
2026-10-29T12:14:34.9027364Z 2026-10-29 09:12:11,427 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.engine.resolver.JPATraversableResolver as ValidatorFactory-scoped traversable resolver.
2026-10-29T12:14:34.9027834Z 2026-10-29 09:12:11,427 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.util.ExecutableParameterNameProvider as ValidatorFactory-scoped parameter name provider.
2026-10-29T12:14:34.9028324Z 2026-10-29 09:12:11,427 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using io.quarkus.hibernate.validator.runtime.clockprovider.RuntimeReinitializedDefaultClockProvider as ValidatorFactory-scoped clock provider.
2026-10-29T12:14:34.9028817Z 2026-10-29 09:12:11,427 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.engine.scripting.DefaultScriptEvaluatorFactory as ValidatorFactory-scoped script evaluator factory.
2026-10-29T12:14:34.9029246Z 2026-10-29 09:12:11,433 DEBUG [io.qua.arc.run.ArcRecorder] (main) Bean container listener io.quarkus.hibernate.validator.runtime.HibernateValidatorRecorder$2 finished in 179 ms
2026-10-29T12:14:34.9029704Z 2026-10-29 09:12:11,437 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type interface br.com.caixa.sifap.client.SimtrApiClient and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9030301Z 2026-10-29 09:12:11,437 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type interface br.com.caixa.sifap.client.SimtrAzureApiClient and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9030850Z 2026-10-29 09:12:11,438 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class br.com.caixa.sifap.client.SimtrApiClient$$CDIWrapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9031349Z 2026-10-29 09:12:11,438 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class br.com.caixa.sifap.client.SimtrAzureApiClient$$CDIWrapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9031867Z 2026-10-29 09:12:11,449 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerVertxBufferMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9032402Z 2026-10-29 09:12:11,450 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerMutinyBufferMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9032971Z 2026-10-29 09:12:11,451 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerVertxAsyncFileMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9033494Z 2026-10-29 09:12:11,452 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerMutinyAsyncFileMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9034032Z 2026-10-29 09:12:11,454 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonArrayMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9034733Z 2026-10-29 09:12:11,455 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonObjectMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9035317Z 2026-10-29 09:12:11,455 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.QuarkusServerPathBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9035938Z 2026-10-29 09:12:11,456 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonArrayMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9036484Z 2026-10-29 09:12:11,456 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonObjectMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9037010Z 2026-10-29 09:12:11,456 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9037532Z 2026-10-29 09:12:11,456 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9038141Z 2026-10-29 09:12:11,456 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9038702Z 2026-10-29 09:12:11,456 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9039228Z 2026-10-29 09:12:11,456 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9039744Z 2026-10-29 09:12:11,456 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerCharArrayMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9040320Z 2026-10-29 09:12:11,456 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerByteArrayMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9040842Z 2026-10-29 09:12:11,457 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerFormUrlEncodedProvider and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9041365Z 2026-10-29 09:12:11,457 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerInputStreamMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9042009Z 2026-10-29 09:12:11,457 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.StreamingOutputMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9042587Z 2026-10-29 09:12:11,457 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerReaderBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9043096Z 2026-10-29 09:12:11,457 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerFileBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9043616Z 2026-10-29 09:12:11,457 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerFilePartBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9044127Z 2026-10-29 09:12:11,457 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.core.multipart.MultipartMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9044702Z 2026-10-29 09:12:11,457 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerPathBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9045214Z 2026-10-29 09:12:11,457 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerPathPartBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9045884Z 2026-10-29 09:12:11,457 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9046421Z 2026-10-29 09:12:11,457 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerBooleanMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9046948Z 2026-10-29 09:12:11,457 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerCharacterMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9047519Z 2026-10-29 09:12:11,457 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerNumberMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9048047Z 2026-10-29 09:12:11,457 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerInputStreamMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9048579Z 2026-10-29 09:12:11,457 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerReaderBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9049161Z 2026-10-29 09:12:11,457 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.QuarkusServerFileBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9049747Z 2026-10-29 09:12:11,458 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerByteArrayMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9050276Z 2026-10-29 09:12:11,458 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerDefaultTextPlainBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9050800Z 2026-10-29 09:12:11,459 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.exceptionmappers.ForbiddenExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9051340Z 2026-10-29 09:12:11,459 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.mappers.BuiltinMismatchedInputExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9051882Z 2026-10-29 09:12:11,460 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.exceptionmappers.AuthenticationRedirectExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9052418Z 2026-10-29 09:12:11,460 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.exceptionmappers.AuthenticationCompletionExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9052914Z 2026-10-29 09:12:11,460 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.rest.runtime.__QuarkusInit and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9053429Z 2026-10-29 09:12:11,557 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonArrayBasicMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9054049Z 2026-10-29 09:12:11,558 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonObjectBasicMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9054713Z 2026-10-29 09:12:11,558 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonArrayBasicMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9055275Z 2026-10-29 09:12:11,558 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonObjectBasicMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-10-29T12:14:34.9055724Z 2026-10-29 09:12:11,584 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource BuildTime RunTime Fixed with ordinal 2147483647
2026-10-29T12:14:34.9056060Z 2026-10-29 09:12:11,584 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource SysPropConfigSource with ordinal 400
2026-10-29T12:14:34.9056407Z 2026-10-29 09:12:11,584 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource EnvConfigSource with ordinal 300
2026-10-29T12:14:34.9056826Z 2026-10-29 09:12:11,584 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource PropertiesConfigSource[source=jar:file:///deployments/app/sifap-centralizadora-1.0.0-SNAPSHOT.jar!/application.properties] with ordinal 250
2026-10-29T12:14:34.9057286Z 2026-10-29 09:12:11,584 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource DefaultValuesConfigSource with ordinal -2147483648
2026-10-29T12:14:34.9057578Z 2026-10-29 09:12:11,744 DEBUG [io.net.uti.int.PlatformDependent0] (main) Java version: 21
2026-10-29T12:14:34.9057862Z 2026-10-29 09:12:11,744 DEBUG [io.net.uti.int.PlatformDependent0] (main) -Dio.netty.noUnsafe: false
2026-10-29T12:14:34.9058231Z 2026-10-29 09:12:11,746 DEBUG [io.net.uti.int.PlatformDependent0] (main) java.nio.Buffer.address: available
2026-10-29T12:14:34.9058536Z 2026-10-29 09:12:11,747 DEBUG [io.net.uti.int.PlatformDependent0] (main) java.nio.Bits.unaligned: available, true
2026-10-29T12:14:34.9058859Z 2026-10-29 09:12:11,748 DEBUG [io.net.uti.int.PlatformDependent0] (main) java.nio.DirectByteBuffer.<init>(long, {int,long}): unavailable
2026-10-29T12:14:34.9059155Z 2026-10-29 09:12:11,748 DEBUG [io.net.uti.int.PlatformDependent] (main) sun.misc.Unsafe: available
2026-10-29T12:14:34.9059455Z 2026-10-29 09:12:11,748 DEBUG [io.net.uti.int.PlatformDependent] (main) -Dio.netty.tmpdir: /tmp (java.io.tmpdir)
2026-10-29T12:14:34.9059727Z 2026-10-29 09:12:11,748 DEBUG [io.net.uti.int.PlatformDependent] (main) -Dio.netty.bitMode: 64 (sun.arch.data.model)
2026-10-29T12:14:34.9060031Z 2026-10-29 09:12:11,749 DEBUG [io.net.uti.int.PlatformDependent] (main) -Dio.netty.maxDirectMemory: -1 bytes
2026-10-29T12:14:34.9060345Z 2026-10-29 09:12:11,749 DEBUG [io.net.uti.int.PlatformDependent] (main) -Dio.netty.uninitializedArrayAllocationThreshold: -1
2026-10-29T12:14:34.9060652Z 2026-10-29 09:12:11,749 DEBUG [io.net.uti.int.CleanerJava9] (main) java.nio.ByteBuffer.cleaner(): available
2026-10-29T12:14:34.9060948Z 2026-10-29 09:12:11,749 DEBUG [io.net.uti.int.PlatformDependent] (main) -Dio.netty.noPreferDirect: false
2026-10-29T12:14:34.9061250Z 2026-10-29 09:12:11,759 DEBUG [io.net.cha.DefaultChannelId] (Thread-16) -Dio.netty.processId: 8 (auto-detected)
2026-10-29T12:14:34.9061583Z 2026-10-29 09:12:11,760 DEBUG [io.net.cha.DefaultChannelId] (Thread-16) -Dio.netty.machineId: 7e:56:37:43:7e:18:49:c8 (user-set)
2026-10-29T12:14:34.9061903Z 2026-10-29 09:12:11,831 DEBUG [io.ver.cor.log.LoggerFactory] (main) Using io.vertx.core.logging.SLF4JLogDelegateFactory
2026-10-29T12:14:34.9062234Z 2026-10-29 09:12:11,838 DEBUG [io.qua.ver.cor.run.VertxCoreRecorder] (main) Vert.x Cache configured to: /tmp/vertx-cache/2850190651895560903
2026-10-29T12:14:34.9062603Z 2026-10-29 09:12:11,857 DEBUG [io.net.uti.ResourceLeakDetector] (main) -Dio.netty.leakDetection.level: simple
2026-10-29T12:14:34.9062918Z 2026-10-29 09:12:11,858 DEBUG [io.net.uti.ResourceLeakDetector] (main) -Dio.netty.leakDetection.targetRecords: 4
2026-10-29T12:14:34.9063320Z 2026-10-29 09:12:11,923 DEBUG [io.net.cha.MultithreadEventLoopGroup] (main) -Dio.netty.eventLoopThreads: 4
2026-10-29T12:14:34.9063637Z 2026-10-29 09:12:11,960 DEBUG [io.net.uti.con.GlobalEventExecutor] (main) -Dio.netty.globalEventExecutor.quietPeriodSeconds: 1
2026-10-29T12:14:34.9063941Z 2026-10-29 09:12:12,026 DEBUG [io.net.cha.nio.NioEventLoop] (main) -Dio.netty.noKeySetOptimization: false
2026-10-29T12:14:34.9064613Z 2026-10-29 09:12:12,026 DEBUG [io.net.cha.nio.NioEventLoop] (main) -Dio.netty.selectorAutoRebuildThreshold: 512
2026-10-29T12:14:34.9064944Z 2026-10-29 09:12:12,032 DEBUG [io.net.uti.int.PlatformDependent] (main) org.jctools-core.MpscChunkedArrayQueue: available
2026-10-29T12:14:34.9065287Z 2026-10-29 09:12:12,051 DEBUG [io.qua.ver.cor.run.VertxCoreRecorder] (main) Vertx has Native Transport Enabled: false
2026-10-29T12:14:34.9065656Z 2026-10-29 09:12:12,077 DEBUG [com.arj.ats.jta] (main) Setting up node identifiers '[quarkus]' for which recovery will be performed
2026-10-29T12:14:34.9066063Z 2026-10-29 09:12:12,226 DEBUG [org.hib.orm.beans] (main) HHH10005004: Stopping BeanContainer: io.quarkus.hibernate.orm.runtime.cdi.QuarkusArcBeanContainer@4df25105
2026-10-29T12:14:34.9066367Z 2026-10-29 09:12:12,227 DEBUG [io.qua.arc.impl] (main) ArC DI container shut down
2026-10-29T12:14:34.9066690Z 2026-10-29 09:12:12,252 DEBUG [io.qua.ver.cor.run.NoopShutdownExecutorService] (vert.x-eventloop-thread-0) shutdownNow() deliberately not delegated
2026-10-29T12:14:34.9067135Z 2026-10-29 09:12:12,260 DEBUG [io.qua.thread-pool] (main) loop: 1, remaining: 60000000000, intervalRemaining: 5000000000, interruptRemaining: 10000000000
2026-10-29T12:14:34.9067374Z Failed to load config value of type class java.lang.String for: ministerio.farmacia.api-key
2026-10-29T12:14:34.9067452Z 
2026-10-29T12:14:34.9067679Z 2026-10-29 09:12:12,262 DEBUG [io.qua.run.Application] (main) Stopping application
2026-10-29T12:14:34.9067957Z 2026-10-29 09:12:12,262 DEBUG [io.qua.run.Application] (main) Shutting down with exit code 1
2026-10-29T12:14:34.9068381Z 2026-10-29 09:12:12,262 DEBUG [jav.lan.Runtime] (main) Runtime.exit() called with status: 1: java.lang.Throwable: Runtime.exit(1)
2026-10-29T12:14:34.9068698Z 	at java.base/java.lang.Shutdown.logRuntimeExit(Shutdown.java:179)
2026-10-29T12:14:34.9069057Z 	at java.base/java.lang.Shutdown.exit(Shutdown.java:160)
2026-10-29T12:14:34.9069316Z 	at java.base/java.lang.Runtime.exit(Runtime.java:188)
2026-10-29T12:14:34.9069498Z 	at java.base/java.lang.System.exit(System.java:1916)
2026-10-29T12:14:34.9069681Z 	at io.quarkus.runtime.ApplicationLifecycleManager$1.accept(ApplicationLifecycleManager.java:61)
2026-10-29T12:14:34.9069917Z 	at io.quarkus.runtime.ApplicationLifecycleManager$1.accept(ApplicationLifecycleManager.java:53)
2026-10-29T12:14:34.9070160Z 	at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:221)
2026-10-29T12:14:34.9070365Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:71)
2026-10-29T12:14:34.9070576Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:44)
2026-10-29T12:14:34.9070847Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:124)
2026-10-29T12:14:34.9071115Z 	at io.quarkus.runner.GeneratedMain.main(Unknown Source)
2026-10-29T12:14:34.9071426Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-10-29T12:14:34.9071653Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-10-29T12:14:34.9071859Z 	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:62)
2026-10-29T12:14:34.9072045Z 	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:33)
2026-10-29T12:14:34.9072167Z 
2026-10-29T12:14:34.9075272Z ##[section]Finishing: Logs da Aplicação
