
Boa tarde, pessoal. Jesse, pode nos ajudar no atendimento dessa REQ000147212537? Os ambientes DES, TQS e HMP estão apresentando instabilidade intermitente e impactando homologações prioritárias do gestor.
 
grata pela atenção.
 
Carine Nery da Costa Bastos
Boa tarde, pessoal. Jesse, pode nos ajudar no atendimento dessa REQ000147212537? Os ambientes DES, TQS e HMP estão apresentando instabilidade intermitente e impactando homologações prioritárias do ge…
Carine Nery da Costa Bastos, boa tarde, qual modulo do SIFAP? 
 
Centralizadora
 
Boa tarde
 
Ricardo Alex Santos de Moraes
Centralizadora
back ou front? 
 
A aplicação 
 
Não sabemos se é front ou back
 
pode enviar o link da release
 
Estão em todos os ambientes
 
DES, TQS e HMP
 

SIFAP-centralizadora-backend-intranet-1.3.0.30
 
SIFAP-centralizadora-frontend-intranet-1.3.0.52
 


2026-11-17T13:59:43.1825738Z ##[section]Starting: Logs da Aplicação
2026-11-17T13:59:43.1829247Z ==============================================================================
2026-11-17T13:59:43.1829332Z Task         : Bash
2026-11-17T13:59:43.1829382Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-17T13:59:43.1829492Z Version      : 3.227.0
2026-11-17T13:59:43.1829553Z Author       : Microsoft Corporation
2026-11-17T13:59:43.1829612Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-17T13:59:43.1829726Z ==============================================================================
2026-11-17T13:59:43.3279236Z Generating script.
2026-11-17T13:59:43.3290973Z ========================== Starting Command Output ===========================
2026-11-17T13:59:43.3299931Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/a62af513-f9f1-4d95-b158-ee37b574294d.sh
2026-11-17T13:59:43.3359935Z + shopt -s expand_aliases
2026-11-17T13:59:43.3360228Z + [[ -n okd4_nprd ]]
2026-11-17T13:59:43.3360573Z + [[ okd4_nprd =~ ocp ]]
2026-11-17T13:59:43.3360784Z + [[ -n okd4_nprd ]]
2026-11-17T13:59:43.3360893Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-11-17T13:59:43.3361146Z + app=sifap-centralizadora-backend-intranet-des
2026-11-17T13:59:43.3361339Z + oc version
2026-11-17T13:59:43.4061312Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-11-17T13:59:43.4061711Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-11-17T13:59:43.4061988Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-11-17T13:59:43.4099476Z ++ oc get pod -l name=sifap-centralizadora-backend-intranet-des -n sifap-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-11-17T13:59:43.4100036Z ++ tac
2026-11-17T13:59:43.4100419Z ++ grep -v '^$'
2026-11-17T13:59:43.4101847Z ++ head -n1
2026-11-17T13:59:43.4991102Z + last_pod=sifap-centralizadora-backend-intranet-des-123-tpf5l
2026-11-17T13:59:43.4991487Z + echo 'Logs do POD: sifap-centralizadora-backend-intranet-des-123-tpf5l'
2026-11-17T13:59:43.4991820Z + oc logs sifap-centralizadora-backend-intranet-des-123-tpf5l -c sifap-centralizadora-backend-intranet-des -n sifap-des
2026-11-17T13:59:43.4992102Z Logs do POD: sifap-centralizadora-backend-intranet-des-123-tpf5l
2026-11-17T13:59:43.5835160Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=JKS -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.6.2.jar -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-11-17T13:59:43.5851927Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-11-17T13:59:43.5852434Z 2026-11-17 10:59:29.577-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.6.2 started successfully (PID 8, JVM running for 2.783 s)
2026-11-17T13:59:43.5852837Z 2026-11-17 10:59:29.579-03:00 INFO  c.m.applicationinsights.agent - Java version: 21.0.1, vendor: Oracle Corporation, home: /usr/java/jdk-21.0.1
2026-11-17T13:59:43.5853251Z __  ____  __  _____   ___  __ ____  ______ 
2026-11-17T13:59:43.5853469Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-11-17T13:59:43.5854051Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-11-17T13:59:43.5856283Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-11-17T13:59:43.5856886Z 2026-11-17 10:59:28,993 DEBUG [jdk.eve.security] (main) X509Certificate: Alg:SHA384withRSA, Serial:59b1b579e8e2132e23907bda777755c, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:1057369358, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-11-17T13:59:43.5857783Z 2026-11-17 10:59:28,998 DEBUG [jdk.eve.security] (main) X509Certificate: Alg:SHA384withRSA, Serial:8ad40b260d29c4c9f5ecda9bd93aed9, Subject:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3406046841, Valid from:4/28/21, 9:00?PM, Valid until:4/28/36, 8:59?PM
2026-11-17T13:59:43.5858877Z 2026-11-17 10:59:28,998 DEBUG [jdk.eve.security] (main) X509Certificate: Alg:SHA256withRSA, Serial:d1f02a4a2c5a3d3a37dda07199a3620, Subject:CN=Microsoft Corporation, OU=Java Signing (SHA2), O=Microsoft Corporation, L=Redmond, ST=Washington, C=US, Issuer:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:1223504232, Valid from:8/29/24, 9:00?PM, Valid until:10/29/27, 8:59?PM
2026-11-17T13:59:43.5859704Z 2026-11-17 10:59:29,008 DEBUG [jdk.eve.security] (main) X509Certificate: Alg:SHA256withRSA, Serial:bae66bc5aba7f9587c6f9e904e33304, Subject:CN=DigiCert Timestamp 2024, O=DigiCert, C=US, Issuer:CN=DigiCert Trusted G4 RSA4096 SHA256 TimeStamping CA, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:3934399196, Valid from:9/25/24, 9:00?PM, Valid until:11/25/35, 8:59?PM
2026-11-17T13:59:43.5861923Z 2026-11-17 10:59:29,008 DEBUG [jdk.eve.security] (main) X509Certificate: Alg:SHA256withRSA, Serial:73637b724547cd847acfd28662a5e5b, Subject:CN=DigiCert Trusted G4 RSA4096 SHA256 TimeStamping CA, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3207540671, Valid from:3/22/22, 9:00?PM, Valid until:3/22/37, 8:59?PM
2026-11-17T13:59:43.5862746Z 2026-11-17 10:59:29,008 DEBUG [jdk.eve.security] (main) X509Certificate: Alg:SHA384withRSA, Serial:e9b188ef9d02de7efdb50e20840185a, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:845088433, Valid from:7/31/22, 9:00?PM, Valid until:11/9/31, 8:59?PM
2026-11-17T13:59:43.5863659Z 2026-11-17 10:59:29,896 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:ce22972800344766b49ca5d407cd039, Subject:CN=Valid Certificadora RSA DV SSL CA, O=Valid Certificadora Digital LTDA, C=BR, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:3072, Cert Id:131886298, Valid from:8/1/23, 9:00?PM, Valid until:8/1/33, 8:59?PM
2026-11-17T13:59:43.5864578Z 2026-11-17 10:59:29,906 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:83be056904246b1a1756ac95991c74a, Subject:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1341898239, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-11-17T13:59:43.5865423Z 2026-11-17 10:59:29,951 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:397a66cc2756362e0daa87ca6eabe3b1, Subject:CN=Sectigo Public Server Authentication CA DV R36, O=Sectigo Limited, C=GB, Issuer:CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB, Key type:RSA, Length:3072, Cert Id:1180805919, Valid from:3/21/21, 9:00?PM, Valid until:3/21/36, 8:59?PM
2026-11-17T13:59:43.5866264Z 2026-11-17 10:59:29,952 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:47b583ffce303b8047ba716d908e88d2, Subject:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:71683228, Valid from:12/23/22, 11:55?AM, Valid until:12/23/42, 12:05?PM
2026-11-17T13:59:43.5867134Z 2026-11-17 10:59:29,953 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:1, Subject:CN=Autoridade Certificadora Raiz Brasileira v5, OU=Instituto Nacional de Tecnologia da Informacao - ITI, O=ICP-Brasil, C=BR, Issuer:CN=Autoridade Certificadora Raiz Brasileira v5, OU=Instituto Nacional de Tecnologia da Informacao - ITI, O=ICP-Brasil, C=BR, Key type:RSA, Length:4096, Cert Id:827042461, Valid from:3/2/16, 10:01?AM, Valid until:3/2/29, 8:59?PM
2026-11-17T13:59:43.5868122Z 2026-11-17 10:59:29,954 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:1ed397095fd8b4b347701eaabe7f45b3, Subject:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:2848349048, Valid from:12/18/19, 7:51?PM, Valid until:7/18/42, 8:00?PM
2026-11-17T13:59:43.5869119Z 2026-11-17 10:59:29,955 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:36825e7fb5a481937ef6d1736bb93ca6, Subject:CN=COMODO RSA Organization Validation Secure Server CA, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:245647897, Valid from:2/11/14, 10:00?PM, Valid until:2/11/29, 8:59?PM
2026-11-17T13:59:43.5870121Z 2026-11-17 10:59:29,956 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:1ee5f221dfc623bd4333a8557, Subject:CN=GlobalSign RSA OV SSL CA 2018, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Key type:RSA, Length:2048, Cert Id:930132802, Valid from:11/20/18, 10:00?PM, Valid until:11/20/28, 9:00?PM
2026-11-17T13:59:43.5871111Z 2026-11-17 10:59:29,957 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:3972443af922b751d7d36c10dd313595, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:4096, Cert Id:3160189236, Valid from:3/11/19, 9:00?PM, Valid until:12/31/28, 8:59?PM
2026-11-17T13:59:43.5872086Z 2026-11-17 10:59:29,958 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:2, Subject:CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR, Issuer:CN=Autoridade Certificadora SERPRO v4, OU=Autoridade Certificadora Raiz Brasileira v5, O=ICP-Brasil, C=BR, Key type:RSA, Length:4096, Cert Id:4146249541, Valid from:1/9/17, 5:36?PM, Valid until:2/15/29, 4:36?PM
2026-11-17T13:59:43.5873223Z 2026-11-17 10:59:29,959 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:600000000299b24b9d7901ea84000000000002, Subject:CN=AC Icptestes Sub, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:2447629493, Valid from:12/23/22, 12:47?PM, Valid until:12/23/42, 12:05?PM
2026-11-17T13:59:43.5874163Z 2026-11-17 10:59:29,960 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:758dfd8bae7c0700faa925a7e1c7ad14, Subject:CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB, Issuer:CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB, Key type:RSA, Length:4096, Cert Id:3806652169, Valid from:3/21/21, 9:00?PM, Valid until:3/21/46, 8:59?PM
2026-11-17T13:59:43.5875189Z 2026-11-17 10:59:29,960 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:1fd6d30fca3ca51a81bbc640e35032d, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:4096, Cert Id:3947601401, Valid from:1/31/10, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-11-17T13:59:43.5875999Z 2026-11-17 10:59:29,961 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:40000000001154b5ac394, Subject:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Key type:RSA, Length:2048, Cert Id:536948034, Valid from:9/1/98, 9:00?AM, Valid until:1/28/28, 9:00?AM
2026-11-17T13:59:43.5876814Z 2026-11-17 10:59:29,962 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:33af1e6a711a9a0bb2864b11d09fae5, Subject:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1136084297, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-11-17T13:59:43.5877685Z 2026-11-17 10:59:29,963 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:7d5b5126b476ba11db74160bbc530da7, Subject:CN=Sectigo RSA Domain Validation Secure Server CA, O=Sectigo Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:2048, Cert Id:2459870160, Valid from:11/1/18, 9:00?PM, Valid until:12/31/30, 8:59?PM
2026-11-17T13:59:43.5878220Z 2026-11-17 10:59:29,962 DEBUG [org.jbo.logging] (main) Logging Provider: org.jboss.logging.JBossLogManagerProvider
2026-11-17T13:59:43.5878546Z 2026-11-17 10:59:29,964 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource BuildTime RunTime Fixed with ordinal 2147483647
2026-11-17T13:59:43.5878869Z 2026-11-17 10:59:29,964 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource SysPropConfigSource with ordinal 400
2026-11-17T13:59:43.5879183Z 2026-11-17 10:59:29,964 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource EnvConfigSource with ordinal 300
2026-11-17T13:59:43.5879798Z 2026-11-17 10:59:29,963 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:90ee8c5de5bfa62d2ae2ff7097c4857, Subject:CN=Thawte TLS RSA CA G1, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:96139010, Valid from:11/2/17, 10:24?AM, Valid until:11/2/27, 9:24?AM
2026-11-17T13:59:43.5880399Z 2026-11-17 10:59:29,964 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource PropertiesConfigSource[source=jar:file:///deployments/app/sifap-centralizadora-1.0.0-SNAPSHOT.jar!/application.properties] with ordinal 250
2026-11-17T13:59:43.5880791Z 2026-11-17 10:59:29,964 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource DefaultValuesConfigSource with ordinal -2147483648
2026-11-17T13:59:43.5881418Z 2026-11-17 10:59:29,964 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:83be056904246b1a1756ac95991c74a, Subject:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1341898239, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-11-17T13:59:43.5882183Z 2026-11-17 10:59:29,965 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:4188b0e1a030eda84084ca76a3b1be32, Subject:CN=AC Interna Caixa, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Interna Caixa, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:2506492458, Valid from:10/13/22, 2:25?PM, Valid until:10/13/42, 2:35?PM
2026-11-17T13:59:43.5882957Z 2026-11-17 10:59:29,965 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:62000000027328772c722ac752000000000002, Subject:CN=AC Interna APL, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Interna Caixa, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:3746844432, Valid from:10/13/22, 3:34?PM, Valid until:10/13/42, 2:35?PM
2026-11-17T13:59:43.5883894Z 2026-11-17 10:59:29,966 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:3972443af922b751d7d36c10dd313595, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:4096, Cert Id:3160189236, Valid from:3/11/19, 9:00?PM, Valid until:12/31/28, 8:59?PM
2026-11-17T13:59:43.5884822Z 2026-11-17 10:59:29,966 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:1ee5f221dfc623bd4333a8557, Subject:CN=GlobalSign RSA OV SSL CA 2018, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Key type:RSA, Length:2048, Cert Id:930132802, Valid from:11/20/18, 10:00?PM, Valid until:11/20/28, 9:00?PM
2026-11-17T13:59:43.5885653Z 2026-11-17 10:59:29,968 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:5, Subject:CN=Autoridade Certificadora SERPRO v4, OU=Autoridade Certificadora Raiz Brasileira v5, O=ICP-Brasil, C=BR, Issuer:CN=Autoridade Certificadora Raiz Brasileira v5, OU=Instituto Nacional de Tecnologia da Informacao - ITI, O=ICP-Brasil, C=BR, Key type:RSA, Length:4096, Cert Id:1380576325, Valid from:9/14/16, 10:10?AM, Valid until:3/2/29, 9:00?AM
2026-11-17T13:59:43.5886550Z 2026-11-17 10:59:29,969 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:3097386402, Valid from:12/31/03, 10:00?PM, Valid until:12/31/28, 8:59?PM
2026-11-17T13:59:43.5887393Z 2026-11-17 10:59:29,969 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:3097386402, Valid from:12/31/03, 10:00?PM, Valid until:12/31/28, 8:59?PM
2026-11-17T13:59:43.5888249Z 2026-11-17 10:59:29,969 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:7d5b5126b476ba11db74160bbc530da7, Subject:CN=Sectigo RSA Domain Validation Secure Server CA, O=Sectigo Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:2048, Cert Id:2459870160, Valid from:11/1/18, 9:00?PM, Valid until:12/31/30, 8:59?PM
2026-11-17T13:59:43.5889201Z 2026-11-17 10:59:29,970 DEBUG [jdk.eve.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:36825e7fb5a481937ef6d1736bb93ca6, Subject:CN=COMODO RSA Organization Validation Secure Server CA, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:245647897, Valid from:2/11/14, 10:00?PM, Valid until:2/11/29, 8:59?PM
2026-11-17T13:59:43.5889904Z 2026-11-17 10:59:30,171 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.rest-client."ministerio-farmacia-api".disable-default-mapper" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-11-17T13:59:43.5890478Z 2026-11-17 10:59:30,178 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.rest-client-oidc-token-propagation.exchange-token" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-11-17T13:59:43.5891020Z 2026-11-17 10:59:30,179 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.rest-client.ministerio-farmacia-api.disable-default-mapper" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-11-17T13:59:43.5891395Z 2026-11-17 10:59:30,382 DEBUG [org.hib.qua.feature] (main) Hibernate Features Enabled
2026-11-17T13:59:43.5891721Z 2026-11-17 10:59:30,383 DEBUG [io.qua.hib.orm] (main) List of entities found by Quarkus deployment:
2026-11-17T13:59:43.5892298Z [br.com.caixa.sifap.entity.AnaliseDocumento, br.com.caixa.sifap.entity.ControleDocumento, br.com.caixa.sifap.entity.Farmaceutico, br.com.caixa.sifap.entity.Farmacia, br.com.caixa.sifap.entity.FarmaciaAuxiliar, br.com.caixa.sifap.entity.HistoricoAnaliseDocumento, br.com.caixa.sifap.entity.ItemAnaliseDocumento, br.com.caixa.sifap.entity.ItemValidacao, br.com.caixa.sifap.entity.RepresentacaoFarmacia, br.com.caixa.sifap.entity.RepresentacaoTecnica, br.com.caixa.sifap.entity.RepresentanteFarmacia, br.com.caixa.sifap.entity.SituacaoFarmacia, br.com.caixa.sifap.entity.SqlMappings, br.com.caixa.sifap.entity.TipoDocumento, br.com.caixa.sifap.entity.TipoDocumentoFarmacia, br.com.caixa.sifap.entity.TipoDocumentoItemValidacao, br.com.caixa.sifap.entity.TipoSituacaoFarmacia]
2026-11-17T13:59:43.5893258Z 2026-11-17 10:59:30,518 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:4101776e6661120a4290f23a31000001776e66, Subject:CN=TLS-G2-RSA-02 OCSP Cert, O=Microsoft Corporation, L=Redmond, ST=WA, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 02, O=Microsoft Corporation, C=US, Key type:RSA, Length:2048, Cert Id:1096604650, Valid from:11/10/26, 8:20?AM, Valid until:5/9/27, 8:20?AM
2026-11-17T13:59:43.5894240Z 2026-11-17 10:59:30,552 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:4101381e7c06a2f5a036c9997a000001381e7c, Subject:CN=in.applicationinsights.azure.com, O=Microsoft Corporation, L=Redmond, ST=WA, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 02, O=Microsoft Corporation, C=US, Key type:RSA, Length:2048, Cert Id:1163172566, Valid from:10/13/26, 6:58?PM, Valid until:1/21/27, 5:58?PM
2026-11-17T13:59:43.5895066Z 2026-11-17 10:59:30,553 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:330000000c4964a16f44203b2200000000000c, Subject:CN=Microsoft TLS G2 RSA CA OCSP 02, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:4116687715, Valid from:8/1/25, 5:03?PM, Valid until:6/3/29, 5:03?PM
2026-11-17T13:59:43.5895860Z 2026-11-17 10:59:30,554 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:b0c6b2c466917b04773c647d4afc0c8, Subject:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3081933591, Valid from:5/20/25, 9:00?PM, Valid until:6/19/29, 8:59?PM
2026-11-17T13:59:43.5896371Z 2026-11-17 10:59:30,570 DEBUG [jdk.eve.security] (reactor-http-epoll-1) ValidationChain: 1136084297, 3081933591, 4116687715, 1163172566
2026-11-17T13:59:43.5897004Z 2026-11-17 10:59:30,572 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:570a119742c4e3cc, Subject:CN=Actalis Authentication Root CA, O=Actalis S.p.A./03358520967, L=Milan, C=IT, Issuer:CN=Actalis Authentication Root CA, O=Actalis S.p.A./03358520967, L=Milan, C=IT, Key type:RSA, Length:4096, Cert Id:1729119956, Valid from:9/22/11, 8:22?AM, Valid until:9/22/30, 8:22?AM
2026-11-17T13:59:43.5897796Z 2026-11-17 10:59:30,574 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AddTrust External CA Root, OU=AddTrust External TTP Network, O=AddTrust AB, C=SE, Issuer:CN=AddTrust External CA Root, OU=AddTrust External TTP Network, O=AddTrust AB, C=SE, Key type:RSA, Length:2048, Cert Id:3968614624, Valid from:5/30/00, 7:48?AM, Valid until:5/30/20, 7:48?AM
2026-11-17T13:59:43.5898606Z 2026-11-17 10:59:30,574 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AddTrust Qualified CA Root, OU=AddTrust TTP Network, O=AddTrust AB, C=SE, Issuer:CN=AddTrust Qualified CA Root, OU=AddTrust TTP Network, O=AddTrust AB, C=SE, Key type:RSA, Length:2048, Cert Id:607365522, Valid from:5/30/00, 7:44?AM, Valid until:5/30/20, 7:44?AM
2026-11-17T13:59:43.5899432Z 2026-11-17 10:59:30,575 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:7777062726a9b17c, Subject:CN=AffirmTrust Commercial, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Commercial, O=AffirmTrust, C=US, Key type:RSA, Length:2048, Cert Id:630485644, Valid from:1/29/10, 12:06?PM, Valid until:12/31/30, 11:06?AM
2026-11-17T13:59:43.5900156Z 2026-11-17 10:59:30,575 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:7c4f04391cd4992d, Subject:CN=AffirmTrust Networking, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Networking, O=AffirmTrust, C=US, Key type:RSA, Length:2048, Cert Id:651670175, Valid from:1/29/10, 12:08?PM, Valid until:12/31/30, 11:08?AM
2026-11-17T13:59:43.5900854Z 2026-11-17 10:59:30,576 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:6d8c1446b1a60aee, Subject:CN=AffirmTrust Premium, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Premium, O=AffirmTrust, C=US, Key type:RSA, Length:4096, Cert Id:2164683341, Valid from:1/29/10, 12:10?PM, Valid until:12/31/40, 11:10?AM
2026-11-17T13:59:43.5901573Z 2026-11-17 10:59:30,577 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:7497258ac73f7a54, Subject:CN=AffirmTrust Premium ECC, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Premium ECC, O=AffirmTrust, C=US, Key type:EC, Length:384, Cert Id:2214603510, Valid from:1/29/10, 12:20?PM, Valid until:12/31/40, 11:20?AM
2026-11-17T13:59:43.5902292Z 2026-11-17 10:59:30,577 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:66c9fcf99bf8c0a39e2f0788a43e696365bca, Subject:CN=Amazon Root CA 1, O=Amazon, C=US, Issuer:CN=Amazon Root CA 1, O=Amazon, C=US, Key type:RSA, Length:2048, Cert Id:2822522334, Valid from:5/25/15, 9:00?PM, Valid until:1/16/38, 9:00?PM
2026-11-17T13:59:43.5903365Z 2026-11-17 10:59:30,578 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:66c9fd29635869f0a0fe58678f85b26bb8a37, Subject:CN=Amazon Root CA 2, O=Amazon, C=US, Issuer:CN=Amazon Root CA 2, O=Amazon, C=US, Key type:RSA, Length:4096, Cert Id:2528834908, Valid from:5/25/15, 9:00?PM, Valid until:5/25/40, 9:00?PM
2026-11-17T13:59:43.5904162Z 2026-11-17 10:59:30,578 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withECDSA, Serial:66c9fd5749736663f3b0b9ad9e89e7603f24a, Subject:CN=Amazon Root CA 3, O=Amazon, C=US, Issuer:CN=Amazon Root CA 3, O=Amazon, C=US, Key type:EC, Length:256, Cert Id:2732679773, Valid from:5/25/15, 9:00?PM, Valid until:5/25/40, 9:00?PM
2026-11-17T13:59:43.5904981Z 2026-11-17 10:59:30,579 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:66c9fd7c1bb104c2943e5717b7b2cc81ac10e, Subject:CN=Amazon Root CA 4, O=Amazon, C=US, Issuer:CN=Amazon Root CA 4, O=Amazon, C=US, Key type:EC, Length:384, Cert Id:2640694783, Valid from:5/25/15, 9:00?PM, Valid until:5/25/40, 9:00?PM
2026-11-17T13:59:43.5905708Z 2026-11-17 10:59:30,579 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:20000b9, Subject:CN=Baltimore CyberTrust Root, OU=CyberTrust, O=Baltimore, C=IE, Issuer:CN=Baltimore CyberTrust Root, OU=CyberTrust, O=Baltimore, C=IE, Key type:RSA, Length:2048, Cert Id:1425294543, Valid from:5/12/00, 3:46?PM, Valid until:5/12/25, 8:59?PM
2026-11-17T13:59:43.5906492Z 2026-11-17 10:59:30,580 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:2, Subject:CN=Buypass Class 2 Root CA, O=Buypass AS-983163327, C=NO, Issuer:CN=Buypass Class 2 Root CA, O=Buypass AS-983163327, C=NO, Key type:RSA, Length:4096, Cert Id:969960563, Valid from:10/26/10, 6:38?AM, Valid until:10/26/40, 5:38?AM
2026-11-17T13:59:43.5907420Z 2026-11-17 10:59:30,580 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:2, Subject:CN=Buypass Class 3 Root CA, O=Buypass AS-983163327, C=NO, Issuer:CN=Buypass Class 3 Root CA, O=Buypass AS-983163327, C=NO, Key type:RSA, Length:4096, Cert Id:1264269967, Valid from:10/26/10, 6:28?AM, Valid until:10/26/40, 5:28?AM
2026-11-17T13:59:43.5908513Z 2026-11-17 10:59:30,581 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:a3da427ea4b1aeda, Subject:CN=Chambers of Commerce Root - 2008, O=AC Camerfirma S.A., SERIALNUMBER=A82743287, L=Madrid (see current address at www.camerfirma.com/address), C=EU, Issuer:CN=Chambers of Commerce Root - 2008, O=AC Camerfirma S.A., SERIALNUMBER=A82743287, L=Madrid (see current address at www.camerfirma.com/address), C=EU, Key type:RSA, Length:4096, Cert Id:4266703372, Valid from:8/1/08, 9:29?AM, Valid until:7/31/38, 9:29?AM
2026-11-17T13:59:43.5909446Z 2026-11-17 10:59:30,582 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:0, Subject:CN=Chambers of Commerce Root, OU=http://www.chambersign.org, O=AC Camerfirma SA CIF A82743287, C=EU, Issuer:CN=Chambers of Commerce Root, OU=http://www.chambersign.org, O=AC Camerfirma SA CIF A82743287, C=EU, Key type:RSA, Length:2048, Cert Id:1827306452, Valid from:9/30/03, 1:13?PM, Valid until:9/30/37, 1:13?PM
2026-11-17T13:59:43.5910378Z 2026-11-17 10:59:30,582 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:c9cdd3e9d57d23ce, Subject:CN=Global Chambersign Root - 2008, O=AC Camerfirma S.A., SERIALNUMBER=A82743287, L=Madrid (see current address at www.camerfirma.com/address), C=EU, Issuer:CN=Global Chambersign Root - 2008, O=AC Camerfirma S.A., SERIALNUMBER=A82743287, L=Madrid (see current address at www.camerfirma.com/address), C=EU, Key type:RSA, Length:4096, Cert Id:1271252776, Valid from:8/1/08, 9:31?AM, Valid until:7/31/38, 9:31?AM
2026-11-17T13:59:43.5911127Z 2026-11-17 10:59:30,583 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:fedce3010fc948ff, Subject:CN=Certigna, O=Dhimyotis, C=FR, Issuer:CN=Certigna, O=Dhimyotis, C=FR, Key type:RSA, Length:2048, Cert Id:3506875840, Valid from:6/29/07, 12:13?PM, Valid until:6/29/27, 12:13?PM
2026-11-17T13:59:43.5911873Z 2026-11-17 10:59:30,584 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:cae91b89f155030da3e6416dc4e3a6e1, Subject:CN=Certigna Root CA, OU=0002 48146308100036, O=Dhimyotis, C=FR, Issuer:CN=Certigna Root CA, OU=0002 48146308100036, O=Dhimyotis, C=FR, Key type:RSA, Length:4096, Cert Id:356684591, Valid from:10/1/13, 5:32?AM, Valid until:10/1/33, 5:32?AM
2026-11-17T13:59:43.5912607Z 2026-11-17 10:59:30,584 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:10020, Subject:CN=Certum CA, O=Unizeto Sp. z o.o., C=PL, Issuer:CN=Certum CA, O=Unizeto Sp. z o.o., C=PL, Key type:RSA, Length:2048, Cert Id:3550516030, Valid from:6/11/02, 7:46?AM, Valid until:6/11/27, 7:46?AM
2026-11-17T13:59:43.5913388Z 2026-11-17 10:59:30,585 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:444c0, Subject:CN=Certum Trusted Network CA, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Issuer:CN=Certum Trusted Network CA, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Key type:RSA, Length:2048, Cert Id:2014002193, Valid from:10/22/08, 10:07?AM, Valid until:12/31/29, 9:07?AM
2026-11-17T13:59:43.5914341Z 2026-11-17 10:59:30,585 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:15c8bd65475cafb897005ee406d2bc9d, Subject:OU=ePKI Root Certification Authority, O="Chunghwa Telecom Co., Ltd.", C=TW, Issuer:OU=ePKI Root Certification Authority, O="Chunghwa Telecom Co., Ltd.", C=TW, Key type:RSA, Length:4096, Cert Id:3632331159, Valid from:12/20/04, 12:31?AM, Valid until:12/19/34, 11:31?PM
2026-11-17T13:59:43.5915185Z 2026-11-17 10:59:30,586 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:3097386402, Valid from:12/31/03, 10:00?PM, Valid until:12/31/28, 8:59?PM
2026-11-17T13:59:43.5916101Z 2026-11-17 10:59:30,586 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:1f47afaa62007050544c019e9b63992a, Subject:CN=COMODO ECC Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO ECC Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:EC, Length:384, Cert Id:1146488932, Valid from:3/5/08, 9:00?PM, Valid until:1/18/38, 8:59?PM
2026-11-17T13:59:43.5917007Z 2026-11-17 10:59:30,586 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:4caaf9cadb636fe01ff74ed85b03869d, Subject:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:4096, Cert Id:1769425049, Valid from:1/18/10, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-11-17T13:59:43.5917899Z 2026-11-17 10:59:30,587 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:b931c3ad63967ea6723bfc3af9af44b, Subject:CN=DigiCert Assured ID Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:3909568913, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-11-17T13:59:43.5918716Z 2026-11-17 10:59:30,587 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:ba15afa1ddfa0b54944afcd24a06cec, Subject:CN=DigiCert Assured ID Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:EC, Length:384, Cert Id:3649430051, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-11-17T13:59:43.5919565Z 2026-11-17 10:59:30,588 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:ce7e0e517d846fe8fe560fc1bf03039, Subject:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:3434562768, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-11-17T13:59:43.5920496Z 2026-11-17 10:59:30,588 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:83be056904246b1a1756ac95991c74a, Subject:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1341898239, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-11-17T13:59:43.5921292Z 2026-11-17 10:59:30,589 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:33af1e6a711a9a0bb2864b11d09fae5, Subject:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1136084297, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-11-17T13:59:43.5922142Z 2026-11-17 10:59:30,589 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:55556bcf25ea43535c3a40fd5ab4572, Subject:CN=DigiCert Global Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:EC, Length:384, Cert Id:3498998753, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-11-17T13:59:43.5922988Z 2026-11-17 10:59:30,590 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:2ac5c266a0b409b8f0b79f2ae462577, Subject:CN=DigiCert High Assurance EV Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert High Assurance EV Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:2884286942, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-11-17T13:59:43.5923832Z 2026-11-17 10:59:30,590 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:59b1b579e8e2132e23907bda777755c, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:1057369358, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-11-17T13:59:43.5924648Z 2026-11-17 10:59:30,590 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:983f3, Subject:CN=D-TRUST Root Class 3 CA 2 2009, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST Root Class 3 CA 2 2009, O=D-Trust GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:1430153102, Valid from:11/5/09, 6:35?AM, Valid until:11/5/29, 5:35?AM
2026-11-17T13:59:43.5925383Z 2026-11-17 10:59:30,591 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:983f4, Subject:CN=D-TRUST Root Class 3 CA 2 EV 2009, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST Root Class 3 CA 2 EV 2009, O=D-Trust GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:971313728, Valid from:11/5/09, 6:50?AM, Valid until:11/5/29, 5:50?AM
2026-11-17T13:59:43.5926439Z 2026-11-17 10:59:30,591 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:3863def8, Subject:CN=Entrust.net Certification Authority (2048), OU=(c) 1999 Entrust.net Limited, OU=www.entrust.net/CPS_2048 incorp. by ref. (limits liab.), O=Entrust.net, Issuer:CN=Entrust.net Certification Authority (2048), OU=(c) 1999 Entrust.net Limited, OU=www.entrust.net/CPS_2048 incorp. by ref. (limits liab.), O=Entrust.net, Key type:RSA, Length:2048, Cert Id:3966431214, Valid from:12/24/99, 3:50?PM, Valid until:7/24/29, 11:15?AM
2026-11-17T13:59:43.5927432Z 2026-11-17 10:59:30,592 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:456b5054, Subject:CN=Entrust Root Certification Authority, OU="(c) 2006 Entrust, Inc.", OU=www.entrust.net/CPS is incorporated by reference, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority, OU="(c) 2006 Entrust, Inc.", OU=www.entrust.net/CPS is incorporated by reference, O="Entrust, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:3033563200, Valid from:11/27/06, 6:23?PM, Valid until:11/27/26, 5:53?PM
2026-11-17T13:59:43.5928647Z 2026-11-17 10:59:30,593 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:a68b79290000000050d091f9, Subject:CN=Entrust Root Certification Authority - EC1, OU="(c) 2012 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority - EC1, OU="(c) 2012 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Key type:EC, Length:384, Cert Id:924514073, Valid from:12/18/12, 1:25?PM, Valid until:12/18/37, 12:55?PM
2026-11-17T13:59:43.5929725Z 2026-11-17 10:59:30,593 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:4a538c28, Subject:CN=Entrust Root Certification Authority - G2, OU="(c) 2009 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority - G2, OU="(c) 2009 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:1936920337, Valid from:7/7/09, 2:25?PM, Valid until:12/7/30, 2:55?PM
2026-11-17T13:59:43.5930870Z 2026-11-17 10:59:30,594 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:d9b5437fafa9390f000000005565ad58, Subject:CN=Entrust Root Certification Authority - G4, OU="(c) 2015 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority - G4, OU="(c) 2015 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:1368037548, Valid from:5/27/15, 8:11?AM, Valid until:12/27/37, 8:41?AM
2026-11-17T13:59:43.5931808Z 2026-11-17 10:59:30,594 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:23456, Subject:CN=GeoTrust Global CA, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Global CA, O=GeoTrust Inc., C=US, Key type:RSA, Length:2048, Cert Id:2266349922, Valid from:5/21/02, 1:00?AM, Valid until:5/21/22, 1:00?AM
2026-11-17T13:59:43.5932619Z 2026-11-17 10:59:30,595 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:18acb56afd69b6153a636cafdafac4a1, Subject:CN=GeoTrust Primary Certification Authority, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Primary Certification Authority, O=GeoTrust Inc., C=US, Key type:RSA, Length:2048, Cert Id:3329622139, Valid from:11/26/06, 10:00?PM, Valid until:7/16/36, 8:59?PM
2026-11-17T13:59:43.5933524Z 2026-11-17 10:59:30,595 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:3cb2f4480a00e2feeb243b5e603ec36b, Subject:CN=GeoTrust Primary Certification Authority - G2, OU=(c) 2007 GeoTrust Inc. - For authorized use only, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Primary Certification Authority - G2, OU=(c) 2007 GeoTrust Inc. - For authorized use only, O=GeoTrust Inc., C=US, Key type:EC, Length:384, Cert Id:3180663474, Valid from:11/4/07, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-11-17T13:59:43.5934587Z 2026-11-17 10:59:30,596 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:15ac6e9419b2794b41f627a9c3180f1f, Subject:CN=GeoTrust Primary Certification Authority - G3, OU=(c) 2008 GeoTrust Inc. - For authorized use only, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Primary Certification Authority - G3, OU=(c) 2008 GeoTrust Inc. - For authorized use only, O=GeoTrust Inc., C=US, Key type:RSA, Length:2048, Cert Id:2964813538, Valid from:4/1/08, 9:00?PM, Valid until:12/1/37, 8:59?PM
2026-11-17T13:59:43.5935383Z 2026-11-17 10:59:30,596 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=GeoTrust Universal CA, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Universal CA, O=GeoTrust Inc., C=US, Key type:RSA, Length:4096, Cert Id:313566089, Valid from:3/4/04, 2:00?AM, Valid until:3/4/29, 2:00?AM
2026-11-17T13:59:43.5936101Z 2026-11-17 10:59:30,596 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:40000000001154b5ac394, Subject:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Key type:RSA, Length:2048, Cert Id:536948034, Valid from:9/1/98, 9:00?AM, Valid until:1/28/28, 9:00?AM
2026-11-17T13:59:43.5936883Z 2026-11-17 10:59:30,597 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withECDSA, Serial:2a38a41c960a04de42b228a50be8349802, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R4, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R4, Key type:EC, Length:256, Cert Id:2371693751, Valid from:11/12/12, 10:00?PM, Valid until:1/19/38, 12:14?AM
2026-11-17T13:59:43.5937716Z 2026-11-17 10:59:30,597 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:605949e0262ebb55f90a778a71f94ad86c, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R5, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R5, Key type:EC, Length:384, Cert Id:1997048439, Valid from:11/12/12, 10:00?PM, Valid until:1/19/38, 12:14?AM
2026-11-17T13:59:43.5938501Z 2026-11-17 10:59:30,598 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:4000000000121585308a2, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Key type:RSA, Length:2048, Cert Id:733875591, Valid from:3/18/09, 7:00?AM, Valid until:3/18/29, 7:00?AM
2026-11-17T13:59:43.5939290Z 2026-11-17 10:59:30,598 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:45e6bb038333c3856548e6ff4551, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R6, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R6, Key type:RSA, Length:4096, Cert Id:3788339543, Valid from:12/9/14, 10:00?PM, Valid until:12/9/34, 9:00?PM
2026-11-17T13:59:43.5940053Z 2026-11-17 10:59:30,598 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:0, Subject:OU=Go Daddy Class 2 Certification Authority, O="The Go Daddy Group, Inc.", C=US, Issuer:OU=Go Daddy Class 2 Certification Authority, O="The Go Daddy Group, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:4023522997, Valid from:6/29/04, 2:06?PM, Valid until:6/29/34, 2:06?PM
2026-11-17T13:59:43.5940861Z 2026-11-17 10:59:30,599 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Go Daddy Root Certificate Authority - G2, O="GoDaddy.com, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Go Daddy Root Certificate Authority - G2, O="GoDaddy.com, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:439600313, Valid from:8/31/09, 9:00?PM, Valid until:12/31/37, 8:59?PM
2026-11-17T13:59:43.5941620Z 2026-11-17 10:59:30,599 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:203e5936f31b01349886ba217, Subject:CN=GTS Root R1, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R1, O=Google Trust Services LLC, C=US, Key type:RSA, Length:4096, Cert Id:657172038, Valid from:6/21/16, 9:00?PM, Valid until:6/21/36, 9:00?PM
2026-11-17T13:59:43.5942346Z 2026-11-17 10:59:30,600 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:203e5aec58d04251aab1125aa, Subject:CN=GTS Root R2, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R2, O=Google Trust Services LLC, C=US, Key type:RSA, Length:4096, Cert Id:948387669, Valid from:6/21/16, 9:00?PM, Valid until:6/21/36, 9:00?PM
2026-11-17T13:59:43.5943081Z 2026-11-17 10:59:30,600 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:203e5b882eb20f825276d3d66, Subject:CN=GTS Root R3, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R3, O=Google Trust Services LLC, C=US, Key type:EC, Length:384, Cert Id:1163081155, Valid from:6/21/16, 9:00?PM, Valid until:6/21/36, 9:00?PM
2026-11-17T13:59:43.5943808Z 2026-11-17 10:59:30,601 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:203e5c068ef631a9c72905052, Subject:CN=GTS Root R4, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R4, O=Google Trust Services LLC, C=US, Key type:EC, Length:384, Cert Id:1326433111, Valid from:6/21/16, 9:00?PM, Valid until:6/21/36, 9:00?PM
2026-11-17T13:59:43.5944794Z 2026-11-17 10:59:30,601 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withECDSA, Serial:0, Subject:CN=Hellenic Academic and Research Institutions ECC RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Issuer:CN=Hellenic Academic and Research Institutions ECC RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Key type:EC, Length:384, Cert Id:513613456, Valid from:7/7/15, 7:37?AM, Valid until:6/30/40, 7:37?AM
2026-11-17T13:59:43.5945816Z 2026-11-17 10:59:30,601 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Hellenic Academic and Research Institutions RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Issuer:CN=Hellenic Academic and Research Institutions RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Key type:RSA, Length:4096, Cert Id:3491990565, Valid from:7/7/15, 7:11?AM, Valid until:6/30/40, 7:11?AM
2026-11-17T13:59:43.5946672Z 2026-11-17 10:59:30,602 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:a0142800000014523c844b500000002, Subject:CN=IdenTrust Commercial Root CA 1, O=IdenTrust, C=US, Issuer:CN=IdenTrust Commercial Root CA 1, O=IdenTrust, C=US, Key type:RSA, Length:4096, Cert Id:1232565210, Valid from:1/16/14, 4:12?PM, Valid until:1/16/34, 3:12?PM
2026-11-17T13:59:43.5947611Z 2026-11-17 10:59:30,602 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:a0142800000014523cf467c00000002, Subject:CN=IdenTrust Public Sector Root CA 1, O=IdenTrust, C=US, Issuer:CN=IdenTrust Public Sector Root CA 1, O=IdenTrust, C=US, Key type:RSA, Length:4096, Cert Id:2123370772, Valid from:1/16/14, 3:53?PM, Valid until:1/16/34, 2:53?PM
2026-11-17T13:59:43.5948373Z 2026-11-17 10:59:30,603 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:8210cfb0d240e3594463e0bb63828b00, Subject:CN=ISRG Root X1, O=Internet Security Research Group, C=US, Issuer:CN=ISRG Root X1, O=Internet Security Research Group, C=US, Key type:RSA, Length:4096, Cert Id:1521974916, Valid from:6/4/15, 8:04?AM, Valid until:6/4/35, 8:04?AM
2026-11-17T13:59:43.5949117Z 2026-11-17 10:59:30,603 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:a7ea6df4b449eda6a24859ee6b815d3167fbbb1, Subject:CN=LuxTrust Global Root 2, O=LuxTrust S.A., C=LU, Issuer:CN=LuxTrust Global Root 2, O=LuxTrust S.A., C=LU, Key type:RSA, Length:4096, Cert Id:3055636602, Valid from:3/5/15, 10:21?AM, Valid until:3/5/35, 10:21?AM
2026-11-17T13:59:43.5949857Z 2026-11-17 10:59:30,603 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:bb8, Subject:CN=LuxTrust Global Root, O=LuxTrust s.a., C=LU, Issuer:CN=LuxTrust Global Root, O=LuxTrust s.a., C=LU, Key type:RSA, Length:2048, Cert Id:1714819687, Valid from:3/17/11, 6:51?AM, Valid until:3/17/21, 6:51?AM
2026-11-17T13:59:43.5950797Z 2026-11-17 10:59:30,604 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:66f23daf87de8bb14aea0c573101c2ec, Subject:CN=Microsoft ECC Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft ECC Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:EC, Length:384, Cert Id:3240761285, Valid from:12/18/19, 8:06?PM, Valid until:7/18/42, 8:16?PM
2026-11-17T13:59:43.5951656Z 2026-11-17 10:59:30,604 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:1ed397095fd8b4b347701eaabe7f45b3, Subject:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:2848349048, Valid from:12/18/19, 7:51?PM, Valid until:7/18/42, 8:00?PM
2026-11-17T13:59:43.5952492Z 2026-11-17 10:59:30,605 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:3ab6508b, Subject:CN=QuoVadis Root Certification Authority, OU=Root Certification Authority, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root Certification Authority, OU=Root Certification Authority, O=QuoVadis Limited, C=BM, Key type:RSA, Length:2048, Cert Id:2412561694, Valid from:3/19/01, 3:33?PM, Valid until:3/17/21, 3:33?PM
2026-11-17T13:59:43.5953341Z 2026-11-17 10:59:30,605 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:78585f2ead2c194be3370735341328b596d46593, Subject:CN=QuoVadis Root CA 1 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 1 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:3532531262, Valid from:1/12/12, 3:27?PM, Valid until:1/12/42, 2:27?PM
2026-11-17T13:59:43.5954038Z 2026-11-17 10:59:30,651 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:509, Subject:CN=QuoVadis Root CA 2, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 2, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:338250116, Valid from:11/24/06, 4:27?PM, Valid until:11/24/31, 3:23?PM
2026-11-17T13:59:43.5954853Z 2026-11-17 10:59:30,652 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:445734245b81899b35f2ceb82b3b5ba726f07528, Subject:CN=QuoVadis Root CA 2 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 2 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:696763521, Valid from:1/12/12, 4:59?PM, Valid until:1/12/42, 3:59?PM
2026-11-17T13:59:43.5955555Z 2026-11-17 10:59:30,652 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:5c6, Subject:CN=QuoVadis Root CA 3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:1470392860, Valid from:11/24/06, 5:11?PM, Valid until:11/24/31, 4:06?PM
2026-11-17T13:59:43.5956312Z 2026-11-17 10:59:30,652 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:2ef59b0228a7db7affd5a3a9eebd03a0cf126a1d, Subject:CN=QuoVadis Root CA 3 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 3 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:3589344305, Valid from:1/12/12, 6:26?PM, Valid until:1/12/42, 5:26?PM
2026-11-17T13:59:43.5957054Z 2026-11-17 10:59:30,653 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:OU=Security Communication RootCA2, O="SECOM Trust Systems CO.,LTD.", C=JP, Issuer:OU=Security Communication RootCA2, O="SECOM Trust Systems CO.,LTD.", C=JP, Key type:RSA, Length:2048, Cert Id:1521072570, Valid from:5/29/09, 2:00?AM, Valid until:5/29/29, 2:00?AM
2026-11-17T13:59:43.5957796Z 2026-11-17 10:59:30,653 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:cf08e5c0816a5ad427ff0eb271859d0, Subject:CN=SecureTrust CA, O=SecureTrust Corporation, C=US, Issuer:CN=SecureTrust CA, O=SecureTrust Corporation, C=US, Key type:RSA, Length:2048, Cert Id:2034155325, Valid from:11/7/06, 5:31?PM, Valid until:12/31/29, 4:40?PM
2026-11-17T13:59:43.5958599Z 2026-11-17 10:59:30,654 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withECDSA, Serial:75e6dfcbc1685ba8, Subject:CN=SSL.com Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:EC, Length:384, Cert Id:2926673683, Valid from:2/12/16, 4:14?PM, Valid until:2/12/41, 3:14?PM
2026-11-17T13:59:43.5959449Z 2026-11-17 10:59:30,654 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:56b629cd34bc78f6, Subject:CN=SSL.com EV Root Certification Authority RSA R2, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com EV Root Certification Authority RSA R2, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:RSA, Length:4096, Cert Id:1381862403, Valid from:5/31/17, 3:14?PM, Valid until:5/30/42, 3:14?PM
2026-11-17T13:59:43.5960268Z 2026-11-17 10:59:30,654 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:7b2c9bd316803299, Subject:CN=SSL.com Root Certification Authority RSA, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com Root Certification Authority RSA, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:RSA, Length:4096, Cert Id:156725711, Valid from:2/12/16, 3:39?PM, Valid until:2/12/41, 2:39?PM
2026-11-17T13:59:43.5961405Z 2026-11-17 10:59:30,655 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:0, Subject:OU=Starfield Class 2 Certification Authority, O="Starfield Technologies, Inc.", C=US, Issuer:OU=Starfield Class 2 Certification Authority, O="Starfield Technologies, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:1825617644, Valid from:6/29/04, 2:39?PM, Valid until:6/29/34, 2:39?PM
2026-11-17T13:59:43.5962248Z 2026-11-17 10:59:30,655 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Starfield Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Starfield Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:3268325709, Valid from:8/31/09, 9:00?PM, Valid until:12/31/37, 8:59?PM
2026-11-17T13:59:43.5963197Z 2026-11-17 10:59:30,655 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Starfield Services Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Starfield Services Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:1964785574, Valid from:8/31/09, 9:00?PM, Valid until:12/31/37, 8:59?PM
2026-11-17T13:59:43.5963979Z 2026-11-17 10:59:30,656 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:bb401c43f55e4fb0, Subject:CN=SwissSign Gold CA - G2, O=SwissSign AG, C=CH, Issuer:CN=SwissSign Gold CA - G2, O=SwissSign AG, C=CH, Key type:RSA, Length:4096, Cert Id:1516221943, Valid from:10/25/06, 5:30?AM, Valid until:10/25/36, 5:30?AM
2026-11-17T13:59:43.5964747Z 2026-11-17 10:59:30,656 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:4eb200670c035d4f, Subject:CN=SwissSign Platinum CA - G2, O=SwissSign AG, C=CH, Issuer:CN=SwissSign Platinum CA - G2, O=SwissSign AG, C=CH, Key type:RSA, Length:4096, Cert Id:771312514, Valid from:10/25/06, 5:36?AM, Valid until:10/25/36, 5:36?AM
2026-11-17T13:59:43.5965451Z 2026-11-17 10:59:30,657 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:4f1bd42f54bb2f4b, Subject:CN=SwissSign Silver CA - G2, O=SwissSign AG, C=CH, Issuer:CN=SwissSign Silver CA - G2, O=SwissSign AG, C=CH, Key type:RSA, Length:4096, Cert Id:126726124, Valid from:10/25/06, 5:32?AM, Valid until:10/25/36, 5:32?AM
2026-11-17T13:59:43.5966160Z 2026-11-17 10:59:30,657 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:95be16a0f72e46f17b398272fa8bcd96, Subject:CN=TeliaSonera Root CA v1, O=TeliaSonera, Issuer:CN=TeliaSonera Root CA v1, O=TeliaSonera, Key type:RSA, Length:4096, Cert Id:1495358374, Valid from:10/18/07, 10:00?AM, Valid until:10/18/32, 9:00?AM
2026-11-17T13:59:43.5967064Z 2026-11-17 10:59:30,657 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:344ed55720d5edec49f42fce37db2b6d, Subject:CN=thawte Primary Root CA, OU="(c) 2006 thawte, Inc. - For authorized use only", OU=Certification Services Division, O="thawte, Inc.", C=US, Issuer:CN=thawte Primary Root CA, OU="(c) 2006 thawte, Inc. - For authorized use only", OU=Certification Services Division, O="thawte, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:643000026, Valid from:11/16/06, 10:00?PM, Valid until:7/16/36, 8:59?PM
2026-11-17T13:59:43.5968050Z 2026-11-17 10:59:30,658 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:35fc265cd9844fc93d263d579baed756, Subject:CN=thawte Primary Root CA - G2, OU="(c) 2007 thawte, Inc. - For authorized use only", O="thawte, Inc.", C=US, Issuer:CN=thawte Primary Root CA - G2, OU="(c) 2007 thawte, Inc. - For authorized use only", O="thawte, Inc.", C=US, Key type:EC, Length:384, Cert Id:2068083090, Valid from:11/4/07, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-11-17T13:59:43.5972982Z 2026-11-17 10:59:30,658 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:600197b746a7eab4b49ad64b2ff790fb, Subject:CN=thawte Primary Root CA - G3, OU="(c) 2008 thawte, Inc. - For authorized use only", OU=Certification Services Division, O="thawte, Inc.", C=US, Issuer:CN=thawte Primary Root CA - G3, OU="(c) 2008 thawte, Inc. - For authorized use only", OU=Certification Services Division, O="thawte, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:1032730720, Valid from:4/1/08, 9:00?PM, Valid until:12/1/37, 8:59?PM
2026-11-17T13:59:43.5974012Z 2026-11-17 10:59:30,659 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:1, Subject:CN=T-TeleSec GlobalRoot Class 2, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Issuer:CN=T-TeleSec GlobalRoot Class 2, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:3056503257, Valid from:10/1/08, 7:40?AM, Valid until:10/1/33, 8:59?PM
2026-11-17T13:59:43.5974958Z 2026-11-17 10:59:30,659 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:1, Subject:CN=T-TeleSec GlobalRoot Class 3, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Issuer:CN=T-TeleSec GlobalRoot Class 3, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:1894096264, Valid from:10/1/08, 7:29?AM, Valid until:10/1/33, 8:59?PM
2026-11-17T13:59:43.5975773Z 2026-11-17 10:59:30,659 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:cbe, Subject:CN=TWCA Global Root CA, OU=Root CA, O=TAIWAN-CA, C=TW, Issuer:CN=TWCA Global Root CA, OU=Root CA, O=TAIWAN-CA, C=TW, Key type:RSA, Length:4096, Cert Id:861175838, Valid from:6/27/12, 3:28?AM, Valid until:12/31/30, 12:59?PM
2026-11-17T13:59:43.5976724Z 2026-11-17 10:59:30,660 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:5c8b99c55a94c5d27156decd8980cc26, Subject:CN=USERTrust ECC Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust ECC Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:EC, Length:384, Cert Id:3329287386, Valid from:1/31/10, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-11-17T13:59:43.5977627Z 2026-11-17 10:59:30,660 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:1fd6d30fca3ca51a81bbc640e35032d, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:4096, Cert Id:3947601401, Valid from:1/31/10, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-11-17T13:59:43.5978587Z 2026-11-17 10:59:30,660 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:44be0c8b500024b411d3362de0b35f1b, Subject:CN=UTN-USERFirst-Object, OU=http://www.usertrust.com, O=The USERTRUST Network, L=Salt Lake City, ST=UT, C=US, Issuer:CN=UTN-USERFirst-Object, OU=http://www.usertrust.com, O=The USERTRUST Network, L=Salt Lake City, ST=UT, C=US, Key type:RSA, Length:2048, Cert Id:3997913868, Valid from:7/9/99, 3:31?PM, Valid until:7/9/19, 3:40?PM
2026-11-17T13:59:43.5979658Z 2026-11-17 10:59:30,661 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:9b7e0649a33e62b9d5ee90487129ef57, Subject:CN=VeriSign Class 3 Public Primary Certification Authority - G3, OU="(c) 1999 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Issuer:CN=VeriSign Class 3 Public Primary Certification Authority - G3, OU="(c) 1999 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:2057300190, Valid from:9/30/99, 9:00?PM, Valid until:7/16/36, 8:59?PM
2026-11-17T13:59:43.5980851Z 2026-11-17 10:59:30,661 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:2f80fe238c0e220f486712289187acb3, Subject:CN=VeriSign Class 3 Public Primary Certification Authority - G4, OU="(c) 2007 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Issuer:CN=VeriSign Class 3 Public Primary Certification Authority - G4, OU="(c) 2007 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Key type:EC, Length:384, Cert Id:4163473319, Valid from:11/4/07, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-11-17T13:59:43.5981975Z 2026-11-17 10:59:30,662 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:18dad19e267de8bb4a2158cdcc6b3b4a, Subject:CN=VeriSign Class 3 Public Primary Certification Authority - G5, OU="(c) 2006 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Issuer:CN=VeriSign Class 3 Public Primary Certification Authority - G5, OU="(c) 2006 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:303010488, Valid from:11/7/06, 10:00?PM, Valid until:7/16/36, 8:59?PM
2026-11-17T13:59:43.5983026Z 2026-11-17 10:59:30,662 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:401ac46421b31321030ebbe4121ac51d, Subject:CN=VeriSign Universal Root Certification Authority, OU="(c) 2008 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Issuer:CN=VeriSign Universal Root Certification Authority, OU="(c) 2008 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:2318285810, Valid from:4/1/08, 9:00?PM, Valid until:12/1/37, 8:59?PM
2026-11-17T13:59:43.5983972Z 2026-11-17 10:59:30,662 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:50946cec18ead59c4dd597ef758fa0ad, Subject:CN=XRamp Global Certification Authority, O=XRamp Security Services Inc, OU=www.xrampsecurity.com, C=US, Issuer:CN=XRamp Global Certification Authority, O=XRamp Security Services Inc, OU=www.xrampsecurity.com, C=US, Key type:RSA, Length:2048, Cert Id:3342493210, Valid from:11/1/04, 2:14?PM, Valid until:1/1/35, 2:37?AM
2026-11-17T13:59:43.5984692Z 2026-11-17 10:59:30,702 DEBUG [jdk.eve.security] (reactor-http-epoll-1)  TLSHandshake: brazilsouth-1.in.applicationinsights.azure.com:443, TLSv1.3, TLS_AES_256_GCM_SHA384, 1163172566
2026-11-17T13:59:43.5985047Z 2026-11-17 10:59:30,900 DEBUG [io.net.uti.int.log.InternalLoggerFactory] (main) Using SLF4J as the default logging framework
2026-11-17T13:59:43.5985402Z 2026-11-17 10:59:30,900 DEBUG [io.net.uti.int.InternalThreadLocalMap] (main) -Dio.netty.threadLocalMap.stringBuilder.initialSize: 1024
2026-11-17T13:59:43.5986128Z 2026-11-17 10:59:30,900 DEBUG [io.net.uti.int.InternalThreadLocalMap] (main) -Dio.netty.threadLocalMap.stringBuilder.maxSize: 4096
2026-11-17T13:59:43.5986428Z 2026-11-17 10:59:30,915 DEBUG [io.qua.arc.impl] (main) ArC DI container initialized [beans=162, observers=8]
2026-11-17T13:59:43.5986714Z 2026-11-17 10:59:30,930 DEBUG [org.hib.jpa.int.uti.LogHelper] (main) PersistenceUnitInfo [
2026-11-17T13:59:43.5986890Z 	name: <default>
2026-11-17T13:59:43.5987036Z 	persistence provider classname: null
2026-11-17T13:59:43.5987179Z 	classloader: null
2026-11-17T13:59:43.5987322Z 	excludeUnlistedClasses: true
2026-11-17T13:59:43.5987466Z 	JTA datasource: null
2026-11-17T13:59:43.5987599Z 	Non JTA datasource: null
2026-11-17T13:59:43.5987738Z 	Transaction type: JTA
2026-11-17T13:59:43.5987838Z 	PU root URL: null
2026-11-17T13:59:43.5987971Z 	Shared Cache Mode: null
2026-11-17T13:59:43.5988115Z 	Validation Mode: null
2026-11-17T13:59:43.5988248Z 	Jar files URLs []
2026-11-17T13:59:43.5988380Z 	Managed classes names [
2026-11-17T13:59:43.5988530Z 		br.com.caixa.sifap.entity.Farmaceutico
2026-11-17T13:59:43.5988743Z 		br.com.caixa.sifap.entity.RepresentacaoFarmacia
2026-11-17T13:59:43.5988873Z 		br.com.caixa.sifap.entity.SituacaoFarmacia
2026-11-17T13:59:43.5989039Z 		br.com.caixa.sifap.entity.TipoDocumentoFarmacia
2026-11-17T13:59:43.5989202Z 		br.com.caixa.sifap.entity.ControleDocumento
2026-11-17T13:59:43.5989366Z 		br.com.caixa.sifap.entity.HistoricoAnaliseDocumento
2026-11-17T13:59:43.5989533Z 		br.com.caixa.sifap.entity.RepresentacaoTecnica
2026-11-17T13:59:43.5989702Z 		br.com.caixa.sifap.entity.HistoricoAnaliseDocumentoId
2026-11-17T13:59:43.5989864Z 		br.com.caixa.sifap.entity.ItemValidacao
2026-11-17T13:59:43.5990101Z 		br.com.caixa.sifap.entity.TipoSituacaoFarmacia
2026-11-17T13:59:43.5990285Z 		io.quarkus.hibernate.orm.panache.PanacheEntity
2026-11-17T13:59:43.5990498Z 		br.com.caixa.sifap.entity.Farmacia
2026-11-17T13:59:43.5990754Z 		br.com.caixa.sifap.entity.RepresentanteFarmacia
2026-11-17T13:59:43.5990963Z 		br.com.caixa.sifap.entity.AnaliseDocumento
2026-11-17T13:59:43.5991132Z 		br.com.caixa.sifap.entity.SqlMappings
2026-11-17T13:59:43.5991296Z 		br.com.caixa.sifap.entity.FarmaciaAuxiliar
2026-11-17T13:59:43.5991462Z 		io.quarkus.hibernate.orm.panache.PanacheEntityBase
2026-11-17T13:59:43.5991622Z 		br.com.caixa.sifap.entity.TipoDocumento
2026-11-17T13:59:43.5991744Z 		br.com.caixa.sifap.entity.ItemAnaliseDocumento
2026-11-17T13:59:43.5991911Z 		br.com.caixa.sifap.entity.TipoDocumentoItemValidacao]
2026-11-17T13:59:43.5992066Z 	Mapping files names []
2026-11-17T13:59:43.5992201Z 	Properties [
2026-11-17T13:59:43.5992351Z 		jakarta.persistence.validation.mode: CALLBACK
2026-11-17T13:59:43.5992517Z 		jakarta.persistence.sharedCache.mode: null
2026-11-17T13:59:43.5992678Z 		hibernate.cache.use_second_level_cache: null
2026-11-17T13:59:43.5992832Z 		hibernate.hbm2ddl.charset_name: UTF-8
2026-11-17T13:59:43.5992953Z 		hibernate.default_batch_fetch_size: 16
2026-11-17T13:59:43.5993112Z 		hibernate.hbm2ddl.skip_default_import_file: true
2026-11-17T13:59:43.5993360Z 		jakarta.persistence.database-product-version: 13.0.5026.0
2026-11-17T13:59:43.5993533Z 		hibernate.id.optimizer.pooled.preferred: pooled-lo
2026-11-17T13:59:43.5993697Z 		hibernate.cache.use_query_cache: null
2026-11-17T13:59:43.5993928Z 		jakarta.persistence.database-product-name: Microsoft SQL Server
2026-11-17T13:59:43.5994113Z 		hibernate.id.sequence.increment_size_mismatch_strategy: null
2026-11-17T13:59:43.5994379Z 		hibernate.query.in_clause_parameter_padding: true
2026-11-17T13:59:43.5994546Z 		hibernate.order_by.default_null_ordering: none
2026-11-17T13:59:43.5994674Z 		hibernate.cache.use_reference_entries: null
2026-11-17T13:59:43.5994837Z 		hibernate.discriminator.ignore_explicit_for_joined: false
2026-11-17T13:59:43.5995004Z 		hibernate.query.plan_cache_max_size: 2048
2026-11-17T13:59:43.5995159Z 		hibernate.hbm2ddl.import_files: 
2026-11-17T13:59:43.5995308Z 		hibernate.batch_fetch_style: PADDED]
2026-11-17T13:59:43.5995583Z 2026-11-17 10:59:31,110 DEBUG [org.hib.Version] (main) HHH000412: Hibernate ORM core version 7.0.3.Final
2026-11-17T13:59:43.5995885Z 2026-11-17 10:59:31,111 DEBUG [org.hib.cfg.Environment] (main) HHH000206: 'hibernate.properties' not found
2026-11-17T13:59:43.5996240Z 2026-11-17 10:59:31,119 DEBUG [org.hib.orm.idg.factory] (main) Ignoring CDI for resolving IdentifierGenerator instances as extended or delayed CDI support was enabled
2026-11-17T13:59:43.5996601Z 2026-11-17 10:59:31,122 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [uuid2] -> [org.hibernate.id.UUIDGenerator]
2026-11-17T13:59:43.5996955Z 2026-11-17 10:59:31,122 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [guid] -> [org.hibernate.id.GUIDGenerator]
2026-11-17T13:59:43.5997300Z 2026-11-17 10:59:31,123 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [uuid] -> [org.hibernate.id.UUIDHexGenerator]
2026-11-17T13:59:43.5997620Z 2026-11-17 10:59:31,123 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [uuid.hex] -> [org.hibernate.id.UUIDHexGenerator]
2026-11-17T13:59:43.5998028Z 2026-11-17 10:59:31,123 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [assigned] -> [org.hibernate.id.Assigned]
2026-11-17T13:59:43.5998378Z 2026-11-17 10:59:31,124 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [identity] -> [org.hibernate.id.IdentityGenerator]
2026-11-17T13:59:43.5998722Z 2026-11-17 10:59:31,124 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [select] -> [org.hibernate.id.SelectGenerator]
2026-11-17T13:59:43.5999086Z 2026-11-17 10:59:31,125 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [sequence] -> [org.hibernate.id.enhanced.SequenceStyleGenerator]
2026-11-17T13:59:43.5999485Z 2026-11-17 10:59:31,125 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [increment] -> [org.hibernate.id.IncrementGenerator]
2026-11-17T13:59:43.5999835Z 2026-11-17 10:59:31,126 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [foreign] -> [org.hibernate.id.ForeignGenerator]
2026-11-17T13:59:43.6000223Z 2026-11-17 10:59:31,126 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [enhanced-sequence] -> [org.hibernate.id.enhanced.SequenceStyleGenerator]
2026-11-17T13:59:43.6000602Z 2026-11-17 10:59:31,127 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [enhanced-table] -> [org.hibernate.id.enhanced.TableGenerator]
2026-11-17T13:59:43.6001034Z 2026-11-17 10:59:31,231 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration boolean -> org.hibernate.type.BasicTypeReference@1dbf727a
2026-11-17T13:59:43.6001405Z 2026-11-17 10:59:31,231 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration boolean -> org.hibernate.type.BasicTypeReference@1dbf727a
2026-11-17T13:59:43.6001774Z 2026-11-17 10:59:31,231 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Boolean -> org.hibernate.type.BasicTypeReference@1dbf727a
2026-11-17T13:59:43.6002141Z 2026-11-17 10:59:31,231 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration numeric_boolean -> org.hibernate.type.BasicTypeReference@21be80f6
2026-11-17T13:59:43.6002532Z 2026-11-17 10:59:31,231 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.NumericBooleanConverter -> org.hibernate.type.BasicTypeReference@21be80f6
2026-11-17T13:59:43.6002916Z 2026-11-17 10:59:31,231 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration true_false -> org.hibernate.type.BasicTypeReference@2de82bf8
2026-11-17T13:59:43.6003310Z 2026-11-17 10:59:31,231 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.TrueFalseConverter -> org.hibernate.type.BasicTypeReference@2de82bf8
2026-11-17T13:59:43.6003685Z 2026-11-17 10:59:31,231 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration yes_no -> org.hibernate.type.BasicTypeReference@71b32407
2026-11-17T13:59:43.6004069Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.YesNoConverter -> org.hibernate.type.BasicTypeReference@71b32407
2026-11-17T13:59:43.6004504Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte -> org.hibernate.type.BasicTypeReference@70044113
2026-11-17T13:59:43.6004851Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte -> org.hibernate.type.BasicTypeReference@70044113
2026-11-17T13:59:43.6005204Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Byte -> org.hibernate.type.BasicTypeReference@70044113
2026-11-17T13:59:43.6005556Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration binary -> org.hibernate.type.BasicTypeReference@3b11deb6
2026-11-17T13:59:43.6005904Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte[] -> org.hibernate.type.BasicTypeReference@3b11deb6
2026-11-17T13:59:43.6006375Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration [B -> org.hibernate.type.BasicTypeReference@3b11deb6
2026-11-17T13:59:43.6006727Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration binary_wrapper -> org.hibernate.type.BasicTypeReference@782e0844
2026-11-17T13:59:43.6007083Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration wrapper-binary -> org.hibernate.type.BasicTypeReference@782e0844
2026-11-17T13:59:43.6007493Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration image -> org.hibernate.type.BasicTypeReference@17d45cfb
2026-11-17T13:59:43.6007805Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration blob -> org.hibernate.type.BasicTypeReference@1c65ec63
2026-11-17T13:59:43.6008162Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Blob -> org.hibernate.type.BasicTypeReference@1c65ec63
2026-11-17T13:59:43.6008524Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_blob -> org.hibernate.type.BasicTypeReference@f0d01c9
2026-11-17T13:59:43.6008904Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_blob_wrapper -> org.hibernate.type.BasicTypeReference@205b73d8
2026-11-17T13:59:43.6009265Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration short -> org.hibernate.type.BasicTypeReference@5bc40f5d
2026-11-17T13:59:43.6009619Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration short -> org.hibernate.type.BasicTypeReference@5bc40f5d
2026-11-17T13:59:43.6009968Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Short -> org.hibernate.type.BasicTypeReference@5bc40f5d
2026-11-17T13:59:43.6010321Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration integer -> org.hibernate.type.BasicTypeReference@1ee52741
2026-11-17T13:59:43.6010679Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration int -> org.hibernate.type.BasicTypeReference@1ee52741
2026-11-17T13:59:43.6011039Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Integer -> org.hibernate.type.BasicTypeReference@1ee52741
2026-11-17T13:59:43.6011396Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration long -> org.hibernate.type.BasicTypeReference@47fce2c4
2026-11-17T13:59:43.6011739Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration long -> org.hibernate.type.BasicTypeReference@47fce2c4
2026-11-17T13:59:43.6012097Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Long -> org.hibernate.type.BasicTypeReference@47fce2c4
2026-11-17T13:59:43.6012445Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration float -> org.hibernate.type.BasicTypeReference@5b9df3b3
2026-11-17T13:59:43.6012781Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration float -> org.hibernate.type.BasicTypeReference@5b9df3b3
2026-11-17T13:59:43.6013133Z 2026-11-17 10:59:31,232 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Float -> org.hibernate.type.BasicTypeReference@5b9df3b3
2026-11-17T13:59:43.6013505Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration double -> org.hibernate.type.BasicTypeReference@abe7d36
2026-11-17T13:59:43.6013860Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration double -> org.hibernate.type.BasicTypeReference@abe7d36
2026-11-17T13:59:43.6014296Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Double -> org.hibernate.type.BasicTypeReference@abe7d36
2026-11-17T13:59:43.6014673Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration big_integer -> org.hibernate.type.BasicTypeReference@63ccb1b2
2026-11-17T13:59:43.6015033Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.math.BigInteger -> org.hibernate.type.BasicTypeReference@63ccb1b2
2026-11-17T13:59:43.6015397Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration big_decimal -> org.hibernate.type.BasicTypeReference@102f3f05
2026-11-17T13:59:43.6015791Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.math.BigDecimal -> org.hibernate.type.BasicTypeReference@102f3f05
2026-11-17T13:59:43.6016146Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration character -> org.hibernate.type.BasicTypeReference@5a5b394
2026-11-17T13:59:43.6016460Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration char -> org.hibernate.type.BasicTypeReference@5a5b394
2026-11-17T13:59:43.6016813Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Character -> org.hibernate.type.BasicTypeReference@5a5b394
2026-11-17T13:59:43.6017177Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration character_nchar -> org.hibernate.type.BasicTypeReference@6018d82c
2026-11-17T13:59:43.6017531Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration string -> org.hibernate.type.BasicTypeReference@36f80ceb
2026-11-17T13:59:43.6017887Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.String -> org.hibernate.type.BasicTypeReference@36f80ceb
2026-11-17T13:59:43.6018245Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration nstring -> org.hibernate.type.BasicTypeReference@2dec57c5
2026-11-17T13:59:43.6018593Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration characters -> org.hibernate.type.BasicTypeReference@31e9d94f
2026-11-17T13:59:43.6018938Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration char[] -> org.hibernate.type.BasicTypeReference@31e9d94f
2026-11-17T13:59:43.6019277Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration [C -> org.hibernate.type.BasicTypeReference@31e9d94f
2026-11-17T13:59:43.6019639Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration wrapper-characters -> org.hibernate.type.BasicTypeReference@41e76252
2026-11-17T13:59:43.6019987Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration text -> org.hibernate.type.BasicTypeReference@67376bae
2026-11-17T13:59:43.6020336Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ntext -> org.hibernate.type.BasicTypeReference@7c59cf66
2026-11-17T13:59:43.6020676Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration clob -> org.hibernate.type.BasicTypeReference@37816ea6
2026-11-17T13:59:43.6021024Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Clob -> org.hibernate.type.BasicTypeReference@37816ea6
2026-11-17T13:59:43.6021374Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration nclob -> org.hibernate.type.BasicTypeReference@664083f6
2026-11-17T13:59:43.6021743Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.NClob -> org.hibernate.type.BasicTypeReference@664083f6
2026-11-17T13:59:43.6022162Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_clob -> org.hibernate.type.BasicTypeReference@6ec77cab
2026-11-17T13:59:43.6022554Z 2026-11-17 10:59:31,233 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_clob_char_array -> org.hibernate.type.BasicTypeReference@17c72ffa
2026-11-17T13:59:43.6022943Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_clob_character_array -> org.hibernate.type.BasicTypeReference@2e1c8027
2026-11-17T13:59:43.6023313Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_nclob -> org.hibernate.type.BasicTypeReference@5c41f6a0
2026-11-17T13:59:43.6023723Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_nclob_character_array -> org.hibernate.type.BasicTypeReference@311453ab
2026-11-17T13:59:43.6024105Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_nclob_char_array -> org.hibernate.type.BasicTypeReference@2dd4a7a9
2026-11-17T13:59:43.6024529Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration Duration -> org.hibernate.type.BasicTypeReference@5a23b9d1
2026-11-17T13:59:43.6024895Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.Duration -> org.hibernate.type.BasicTypeReference@5a23b9d1
2026-11-17T13:59:43.6025255Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration LocalDateTime -> org.hibernate.type.BasicTypeReference@31a80c88
2026-11-17T13:59:43.6025630Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.LocalDateTime -> org.hibernate.type.BasicTypeReference@31a80c88
2026-11-17T13:59:43.6025956Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration LocalDate -> org.hibernate.type.BasicTypeReference@7668f8fd
2026-11-17T13:59:43.6026321Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.LocalDate -> org.hibernate.type.BasicTypeReference@7668f8fd
2026-11-17T13:59:43.6026685Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration LocalTime -> org.hibernate.type.BasicTypeReference@5c261c74
2026-11-17T13:59:43.6027050Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.LocalTime -> org.hibernate.type.BasicTypeReference@5c261c74
2026-11-17T13:59:43.6027415Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetDateTime -> org.hibernate.type.BasicTypeReference@d7c4fcb
2026-11-17T13:59:43.6027790Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.OffsetDateTime -> org.hibernate.type.BasicTypeReference@d7c4fcb
2026-11-17T13:59:43.6028174Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetDateTimeWithTimezone -> org.hibernate.type.BasicTypeReference@380e3122
2026-11-17T13:59:43.6028552Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetDateTimeWithoutTimezone -> org.hibernate.type.BasicTypeReference@1fc386f8
2026-11-17T13:59:43.6028919Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTime -> org.hibernate.type.BasicTypeReference@3777fc44
2026-11-17T13:59:43.6029284Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.OffsetTime -> org.hibernate.type.BasicTypeReference@3777fc44
2026-11-17T13:59:43.6029644Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTimeUtc -> org.hibernate.type.BasicTypeReference@4e13af1b
2026-11-17T13:59:43.6030055Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTimeWithTimezone -> org.hibernate.type.BasicTypeReference@1574f323
2026-11-17T13:59:43.6030425Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTimeWithoutTimezone -> org.hibernate.type.BasicTypeReference@2b9370cc
2026-11-17T13:59:43.6030787Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZonedDateTime -> org.hibernate.type.BasicTypeReference@2809e38a
2026-11-17T13:59:43.6031144Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.ZonedDateTime -> org.hibernate.type.BasicTypeReference@2809e38a
2026-11-17T13:59:43.6031543Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZonedDateTimeWithTimezone -> org.hibernate.type.BasicTypeReference@16f2d883
2026-11-17T13:59:43.6031917Z 2026-11-17 10:59:31,234 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZonedDateTimeWithoutTimezone -> org.hibernate.type.BasicTypeReference@1e2c0292
2026-11-17T13:59:43.6032279Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration date -> org.hibernate.type.BasicTypeReference@69ae7632
2026-11-17T13:59:43.6032632Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Date -> org.hibernate.type.BasicTypeReference@69ae7632
2026-11-17T13:59:43.6032976Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration time -> org.hibernate.type.BasicTypeReference@48a61e38
2026-11-17T13:59:43.6033323Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Time -> org.hibernate.type.BasicTypeReference@48a61e38
2026-11-17T13:59:43.6033671Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration timestamp -> org.hibernate.type.BasicTypeReference@19656e21
2026-11-17T13:59:43.6034032Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Timestamp -> org.hibernate.type.BasicTypeReference@19656e21
2026-11-17T13:59:43.6034451Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Date -> org.hibernate.type.BasicTypeReference@19656e21
2026-11-17T13:59:43.6034808Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration calendar -> org.hibernate.type.BasicTypeReference@6b6939e1
2026-11-17T13:59:43.6035170Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Calendar -> org.hibernate.type.BasicTypeReference@6b6939e1
2026-11-17T13:59:43.6035546Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.GregorianCalendar -> org.hibernate.type.BasicTypeReference@6b6939e1
2026-11-17T13:59:43.6035908Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration calendar_date -> org.hibernate.type.BasicTypeReference@68a97fc1
2026-11-17T13:59:43.6036349Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration calendar_time -> org.hibernate.type.BasicTypeReference@63053b71
2026-11-17T13:59:43.6036663Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration instant -> org.hibernate.type.BasicTypeReference@65f3f9e2
2026-11-17T13:59:43.6037026Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.Instant -> org.hibernate.type.BasicTypeReference@65f3f9e2
2026-11-17T13:59:43.6037377Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration uuid -> org.hibernate.type.BasicTypeReference@bae5e58
2026-11-17T13:59:43.6037724Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.UUID -> org.hibernate.type.BasicTypeReference@bae5e58
2026-11-17T13:59:43.6038120Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration pg-uuid -> org.hibernate.type.BasicTypeReference@bae5e58
2026-11-17T13:59:43.6038474Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration uuid-binary -> org.hibernate.type.BasicTypeReference@6167a456
2026-11-17T13:59:43.6038827Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration uuid-char -> org.hibernate.type.BasicTypeReference@6d01f2e5
2026-11-17T13:59:43.6039174Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration class -> org.hibernate.type.BasicTypeReference@3a7d6976
2026-11-17T13:59:43.6039573Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Class -> org.hibernate.type.BasicTypeReference@3a7d6976
2026-11-17T13:59:43.6040030Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration currency -> org.hibernate.type.BasicTypeReference@123426a9
2026-11-17T13:59:43.6040401Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration Currency -> org.hibernate.type.BasicTypeReference@123426a9
2026-11-17T13:59:43.6040768Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Currency -> org.hibernate.type.BasicTypeReference@123426a9
2026-11-17T13:59:43.6041128Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration locale -> org.hibernate.type.BasicTypeReference@3083e6ef
2026-11-17T13:59:43.6041494Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Locale -> org.hibernate.type.BasicTypeReference@3083e6ef
2026-11-17T13:59:43.6041856Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration serializable -> org.hibernate.type.BasicTypeReference@775a5a67
2026-11-17T13:59:43.6042229Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.io.Serializable -> org.hibernate.type.BasicTypeReference@775a5a67
2026-11-17T13:59:43.6042587Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration timezone -> org.hibernate.type.BasicTypeReference@64f49b3
2026-11-17T13:59:43.6042944Z 2026-11-17 10:59:31,235 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.TimeZone -> org.hibernate.type.BasicTypeReference@64f49b3
2026-11-17T13:59:43.6043295Z 2026-11-17 10:59:31,236 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZoneOffset -> org.hibernate.type.BasicTypeReference@51eafec0
2026-11-17T13:59:43.6043656Z 2026-11-17 10:59:31,236 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.ZoneOffset -> org.hibernate.type.BasicTypeReference@51eafec0
2026-11-17T13:59:43.6044005Z 2026-11-17 10:59:31,236 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration url -> org.hibernate.type.BasicTypeReference@57abe94d
2026-11-17T13:59:43.6044478Z 2026-11-17 10:59:31,236 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.net.URL -> org.hibernate.type.BasicTypeReference@57abe94d
2026-11-17T13:59:43.6044840Z 2026-11-17 10:59:31,236 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration vector -> org.hibernate.type.BasicTypeReference@1a48a582
2026-11-17T13:59:43.6045195Z 2026-11-17 10:59:31,236 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration float_vector -> org.hibernate.type.BasicTypeReference@4b45c8e4
2026-11-17T13:59:43.6045557Z 2026-11-17 10:59:31,236 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration double_vector -> org.hibernate.type.BasicTypeReference@627a890f
2026-11-17T13:59:43.6045878Z 2026-11-17 10:59:31,236 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte_vector -> org.hibernate.type.BasicTypeReference@1b901f7b
2026-11-17T13:59:43.6046279Z 2026-11-17 10:59:31,236 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration row_version -> org.hibernate.type.BasicTypeReference@1a1e38ab
2026-11-17T13:59:43.6046634Z 2026-11-17 10:59:31,242 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration object -> org.hibernate.type.JavaObjectType@169d5567
2026-11-17T13:59:43.6047007Z 2026-11-17 10:59:31,243 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Object -> org.hibernate.type.JavaObjectType@169d5567
2026-11-17T13:59:43.6047362Z 2026-11-17 10:59:31,244 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration null -> org.hibernate.type.NullType@e5f05f8
2026-11-17T13:59:43.6047745Z 2026-11-17 10:59:31,244 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_date -> org.hibernate.type.BasicTypeReference@36ce0bc2
2026-11-17T13:59:43.6048096Z 2026-11-17 10:59:31,244 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_time -> org.hibernate.type.BasicTypeReference@477906cf
2026-11-17T13:59:43.6048447Z 2026-11-17 10:59:31,244 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_timestamp -> org.hibernate.type.BasicTypeReference@4004bfba
2026-11-17T13:59:43.6048798Z 2026-11-17 10:59:31,244 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_calendar -> org.hibernate.type.BasicTypeReference@3599b18
2026-11-17T13:59:43.6049157Z 2026-11-17 10:59:31,244 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_calendar_date -> org.hibernate.type.BasicTypeReference@712594f4
2026-11-17T13:59:43.6049519Z 2026-11-17 10:59:31,244 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_calendar_time -> org.hibernate.type.BasicTypeReference@7f6a6d46
2026-11-17T13:59:43.6049869Z 2026-11-17 10:59:31,244 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_binary -> org.hibernate.type.BasicTypeReference@7ed5cc8c
2026-11-17T13:59:43.6050219Z 2026-11-17 10:59:31,244 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_serializable -> org.hibernate.type.BasicTypeReference@47400608
2026-11-17T13:59:43.6050619Z 2026-11-17 10:59:31,253 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting Scanner [io.quarkus.hibernate.orm.runtime.boot.scan.QuarkusScanner@76c85485] into BootstrapContext; was [null]
2026-11-17T13:59:43.6051080Z 2026-11-17 10:59:31,254 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting ScanEnvironment [org.hibernate.jpa.boot.internal.StandardJpaScanEnvironmentImpl@469bd719] into BootstrapContext; was [null]
2026-11-17T13:59:43.6051570Z 2026-11-17 10:59:31,254 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting ScanOptions [org.hibernate.boot.archive.scan.internal.StandardScanOptions@f6e3b67] into BootstrapContext; was [org.hibernate.boot.archive.scan.internal.StandardScanOptions@1dc2c13c]
2026-11-17T13:59:43.6051988Z 2026-11-17 10:59:31,260 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting JPA temp ClassLoader [null] into BootstrapContext; was [null]
2026-11-17T13:59:43.6052332Z 2026-11-17 10:59:31,260 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) ClassLoaderAccessImpl#injectTempClassLoader(null) [was null]
2026-11-17T13:59:43.6052671Z 2026-11-17 10:59:31,304 DEBUG [org.hib.orm.dialect] (main) HHH035001: Using dialect: org.hibernate.dialect.SQLServerDialect, version: 13.0
2026-11-17T13:59:43.6053143Z 2026-11-17 10:59:31,312 DEBUG [org.hib.eng.jdb.env.spi.IdentifierHelperBuilder] (main) IdentifierCaseStrategy for both quoted and unquoted identifiers was set to the same strategy [MIXED]; that will likely lead to problems in schema update and validation if using quoted identifiers
2026-11-17T13:59:43.6053531Z 2026-11-17 10:59:31,316 DEBUG [org.hib.orm.jdb.lob] (main) HHH10010002: Disabling contextual LOB creation as connection was null
2026-11-17T13:59:43.6053819Z 2026-11-17 10:59:31,325 DEBUG [org.hib.orm.con.pooling] (main) HHH10001005: Database info:
2026-11-17T13:59:43.6054047Z 	Database JDBC URL [undefined/unknown]
2026-11-17T13:59:43.6054273Z 	Database driver: undefined/unknown
2026-11-17T13:59:43.6054395Z 	Database version: 13.0
2026-11-17T13:59:43.6054545Z 	Autocommit mode: undefined/unknown
2026-11-17T13:59:43.6054686Z 	Isolation level: <unknown>
2026-11-17T13:59:43.6054834Z 	Minimum pool size: undefined/unknown
2026-11-17T13:59:43.6054984Z 	Maximum pool size: undefined/unknown
2026-11-17T13:59:43.6055304Z 2026-11-17 10:59:31,335 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(NCharTypeDescriptor) replaced previous registration(CharTypeDescriptor)
2026-11-17T13:59:43.6055690Z 2026-11-17 10:59:31,335 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(NVarcharTypeDescriptor) replaced previous registration(VarcharTypeDescriptor)
2026-11-17T13:59:43.6056119Z 2026-11-17 10:59:31,335 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(LongNVarcharTypeDescriptor) replaced previous registration(LongVarcharTypeDescriptor)
2026-11-17T13:59:43.6056526Z 2026-11-17 10:59:31,337 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(NClobTypeDescriptor(DEFAULT)) replaced previous registration(ClobTypeDescriptor(DEFAULT))
2026-11-17T13:59:43.6056940Z 2026-11-17 10:59:31,338 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(TimestampUtcDescriptor) replaced previous registration(TimestampUtcDescriptor)
2026-11-17T13:59:43.6057328Z 2026-11-17 10:59:31,339 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(-6, TinyIntTypeDescriptor) replaced previous registration(TinyIntTypeDescriptor)
2026-11-17T13:59:43.6057815Z 2026-11-17 10:59:31,355 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.DurationType -> basicType@1(java.time.Duration,3015)
2026-11-17T13:59:43.6058169Z 2026-11-17 10:59:31,355 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration Duration -> basicType@1(java.time.Duration,3015)
2026-11-17T13:59:43.6058529Z 2026-11-17 10:59:31,355 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.Duration -> basicType@1(java.time.Duration,3015)
2026-11-17T13:59:43.6058996Z 2026-11-17 10:59:31,359 DEBUG [org.hib.typ.spi.TypeConfiguration$Scope] (main) Scoping TypeConfiguration [org.hibernate.type.spi.TypeConfiguration@3958db82] to MetadataBuildingContext [org.hibernate.boot.internal.MetadataBuildingContextRootImpl@577f81a0]
2026-11-17T13:59:43.6059442Z 2026-11-17 10:59:31,382 DEBUG [org.hib.boo.mod.rel.Namespace] (main) Created database namespace [logicalName=Name{catalog=null, schema=null}, physicalName=Name{catalog=null, schema=null}]
2026-11-17T13:59:43.6061701Z 2026-11-17 10:59:31,385 DEBUG [org.hib.boo.mod.sou.int.ann.AnnotationMetadataSourceProcessorImpl] (main) Skipping explicit MappedSuperclass io.quarkus.hibernate.orm.panache.PanacheEntity, the class will be discovered analyzing the implementing class
2026-11-17T13:59:43.6062106Z 2026-11-17 10:59:31,413 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.SituacaoFarmacia
2026-11-17T13:59:43.6062429Z 2026-11-17 10:59:31,418 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name SituacaoFarmacia
2026-11-17T13:59:43.6062797Z 2026-11-17 10:59:31,421 DEBUG [org.hib.boo.mod.rel.Namespace] (main) Created database namespace [logicalName=Name{catalog=null, schema=dbo}, physicalName=Name{catalog=null, schema=dbo}]
2026-11-17T13:59:43.6063185Z 2026-11-17 10:59:31,425 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.SituacaoFarmacia on table FAPTB002_SITUACAO_FARMACIA
2026-11-17T13:59:43.6063537Z 2026-11-17 10:59:31,435 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-11-17T13:59:43.6063876Z 2026-11-17 10:59:31,465 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_SITUACAO_FARMACIA')
2026-11-17T13:59:43.6064318Z 2026-11-17 10:59:31,466 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.SituacaoFarmacia] is safe
2026-11-17T13:59:43.6064816Z 2026-11-17 10:59:31,466 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.SituacaoFarmacia
2026-11-17T13:59:43.6065193Z 2026-11-17 10:59:31,469 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuSituacaoFarmacia with lazy=false
2026-11-17T13:59:43.6065622Z 2026-11-17 10:59:31,473 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:nuSituacaoFarmacia]
2026-11-17T13:59:43.6066080Z 2026-11-17 10:59:31,477 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuSituacaoFarmacia
2026-11-17T13:59:43.6066450Z 2026-11-17 10:59:31,479 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.NU_SITUACAO_FARMACIA
2026-11-17T13:59:43.6066766Z 2026-11-17 10:59:31,480 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuSituacaoFarmacia
2026-11-17T13:59:43.6067119Z 2026-11-17 10:59:31,485 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_SITUACAO_FARMACIA)]), nuSituacaoFarmacia, identity, , ...)
2026-11-17T13:59:43.6067442Z 2026-11-17 10:59:31,487 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ACAO_SITUACAO')
2026-11-17T13:59:43.6067781Z 2026-11-17 10:59:31,487 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAcaoSituacao with lazy=false
2026-11-17T13:59:43.6068207Z 2026-11-17 10:59:31,487 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:coUsuarioAcaoSituacao]
2026-11-17T13:59:43.6068591Z 2026-11-17 10:59:31,487 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAcaoSituacao
2026-11-17T13:59:43.6068930Z 2026-11-17 10:59:31,487 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.CO_USUARIO_ACAO_SITUACAO
2026-11-17T13:59:43.6069250Z 2026-11-17 10:59:31,487 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAcaoSituacao
2026-11-17T13:59:43.6069579Z 2026-11-17 10:59:31,488 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ALTERACAO_SITUACAO')
2026-11-17T13:59:43.6069924Z 2026-11-17 10:59:31,488 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAlteracaoSituacao with lazy=false
2026-11-17T13:59:43.6070374Z 2026-11-17 10:59:31,488 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:coUsuarioAlteracaoSituacao]
2026-11-17T13:59:43.6070762Z 2026-11-17 10:59:31,488 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAlteracaoSituacao
2026-11-17T13:59:43.6071110Z 2026-11-17 10:59:31,488 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.CO_USUARIO_ALTERACAO_SITUACAO
2026-11-17T13:59:43.6071438Z 2026-11-17 10:59:31,488 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAlteracaoSituacao
2026-11-17T13:59:43.6071768Z 2026-11-17 10:59:31,488 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_JUSTIFICATIVA_SITUACAO')
2026-11-17T13:59:43.6072113Z 2026-11-17 10:59:31,488 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deJustificativaSituacao with lazy=false
2026-11-17T13:59:43.6072545Z 2026-11-17 10:59:31,488 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:deJustificativaSituacao]
2026-11-17T13:59:43.6073001Z 2026-11-17 10:59:31,488 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deJustificativaSituacao
2026-11-17T13:59:43.6073340Z 2026-11-17 10:59:31,488 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.DE_JUSTIFICATIVA_SITUACAO
2026-11-17T13:59:43.6073656Z 2026-11-17 10:59:31,488 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deJustificativaSituacao
2026-11-17T13:59:43.6073974Z 2026-11-17 10:59:31,490 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_SITUACAO_FARMACIA')
2026-11-17T13:59:43.6074406Z 2026-11-17 10:59:31,490 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhSituacaoFarmacia with lazy=false
2026-11-17T13:59:43.6074843Z 2026-11-17 10:59:31,490 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:dhSituacaoFarmacia]
2026-11-17T13:59:43.6075216Z 2026-11-17 10:59:31,490 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhSituacaoFarmacia
2026-11-17T13:59:43.6075513Z 2026-11-17 10:59:31,490 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.DH_SITUACAO_FARMACIA
2026-11-17T13:59:43.6075829Z 2026-11-17 10:59:31,490 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhSituacaoFarmacia
2026-11-17T13:59:43.6076146Z 2026-11-17 10:59:31,493 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_FARMACIA')
2026-11-17T13:59:43.6076459Z 2026-11-17 10:59:31,494 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6076750Z 2026-11-17 10:59:31,498 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property farmacia
2026-11-17T13:59:43.6077063Z 2026-11-17 10:59:31,499 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_RENOVACAO')
2026-11-17T13:59:43.6077387Z 2026-11-17 10:59:31,499 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icRenovacao with lazy=false
2026-11-17T13:59:43.6077802Z 2026-11-17 10:59:31,499 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:icRenovacao]
2026-11-17T13:59:43.6078165Z 2026-11-17 10:59:31,499 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icRenovacao
2026-11-17T13:59:43.6078490Z 2026-11-17 10:59:31,499 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.IC_RENOVACAO
2026-11-17T13:59:43.6078792Z 2026-11-17 10:59:31,499 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icRenovacao
2026-11-17T13:59:43.6079108Z 2026-11-17 10:59:31,499 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_MOTIVO_BLOQUEIO')
2026-11-17T13:59:43.6079440Z 2026-11-17 10:59:31,499 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuMotivoBloqueio with lazy=false
2026-11-17T13:59:43.6079858Z 2026-11-17 10:59:31,499 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:nuMotivoBloqueio]
2026-11-17T13:59:43.6080224Z 2026-11-17 10:59:31,499 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuMotivoBloqueio
2026-11-17T13:59:43.6080550Z 2026-11-17 10:59:31,499 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.NU_MOTIVO_BLOQUEIO
2026-11-17T13:59:43.6080852Z 2026-11-17 10:59:31,500 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuMotivoBloqueio
2026-11-17T13:59:43.6081218Z 2026-11-17 10:59:31,500 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_SITUACAO_FARMACIA')
2026-11-17T13:59:43.6081518Z 2026-11-17 10:59:31,500 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoSituacao with lazy=false
2026-11-17T13:59:43.6081928Z 2026-11-17 10:59:31,500 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SituacaoFarmacia:nuTipoSituacao]
2026-11-17T13:59:43.6082296Z 2026-11-17 10:59:31,500 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoSituacao
2026-11-17T13:59:43.6082667Z 2026-11-17 10:59:31,500 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB002_SITUACAO_FARMACIA.NU_TIPO_SITUACAO_FARMACIA
2026-11-17T13:59:43.6082980Z 2026-11-17 10:59:31,500 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoSituacao
2026-11-17T13:59:43.6083310Z 2026-11-17 10:59:31,500 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_TIPO_SITUACAO_FARMACIA')
2026-11-17T13:59:43.6083614Z 2026-11-17 10:59:31,500 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6083898Z 2026-11-17 10:59:31,500 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tipoSituacao
2026-11-17T13:59:43.6084298Z 2026-11-17 10:59:31,501 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-11-17T13:59:43.6084673Z 2026-11-17 10:59:31,507 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.TipoDocumento
2026-11-17T13:59:43.6084986Z 2026-11-17 10:59:31,507 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name TipoDocumento
2026-11-17T13:59:43.6085500Z 2026-11-17 10:59:31,507 DEBUG [org.hib.boo.mod.rel.Namespace] (main) Created database namespace [logicalName=Name{catalog=FAPDB001, schema=dbo}, physicalName=Name{catalog=FAPDB001, schema=dbo}]
2026-11-17T13:59:43.6085898Z 2026-11-17 10:59:31,507 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.TipoDocumento on table FAPTB006_TIPO_DOCUMENTO
2026-11-17T13:59:43.6086241Z 2026-11-17 10:59:31,508 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-11-17T13:59:43.6086571Z 2026-11-17 10:59:31,509 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DOCUMENTO')
2026-11-17T13:59:43.6086931Z 2026-11-17 10:59:31,509 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoDocumento] is safe
2026-11-17T13:59:43.6087349Z 2026-11-17 10:59:31,509 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoDocumento
2026-11-17T13:59:43.6087718Z 2026-11-17 10:59:31,509 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDocumento with lazy=false
2026-11-17T13:59:43.6088133Z 2026-11-17 10:59:31,509 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumento:nuTipoDocumento]
2026-11-17T13:59:43.6088499Z 2026-11-17 10:59:31,509 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDocumento
2026-11-17T13:59:43.6088822Z 2026-11-17 10:59:31,509 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.NU_TIPO_DOCUMENTO
2026-11-17T13:59:43.6089092Z 2026-11-17 10:59:31,509 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDocumento
2026-11-17T13:59:43.6089420Z 2026-11-17 10:59:31,510 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_TIPOLOGIA_DOCUMENTO')
2026-11-17T13:59:43.6089841Z 2026-11-17 10:59:31,510 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coTipologiaDocumento with lazy=false
2026-11-17T13:59:43.6090255Z 2026-11-17 10:59:31,510 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumento:coTipologiaDocumento]
2026-11-17T13:59:43.6090629Z 2026-11-17 10:59:31,510 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coTipologiaDocumento
2026-11-17T13:59:43.6090957Z 2026-11-17 10:59:31,510 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.CO_TIPOLOGIA_DOCUMENTO
2026-11-17T13:59:43.6091303Z 2026-11-17 10:59:31,510 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coTipologiaDocumento
2026-11-17T13:59:43.6091627Z 2026-11-17 10:59:31,510 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_TIPO_DOCUMENTO_FARMACIA')
2026-11-17T13:59:43.6091978Z 2026-11-17 10:59:31,510 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deTipoDocumentoFarmacia with lazy=false
2026-11-17T13:59:43.6092412Z 2026-11-17 10:59:31,510 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumento:deTipoDocumentoFarmacia]
2026-11-17T13:59:43.6092792Z 2026-11-17 10:59:31,510 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deTipoDocumentoFarmacia
2026-11-17T13:59:43.6093153Z 2026-11-17 10:59:31,510 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.DE_TIPO_DOCUMENTO_FARMACIA
2026-11-17T13:59:43.6093472Z 2026-11-17 10:59:31,510 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deTipoDocumentoFarmacia
2026-11-17T13:59:43.6093804Z 2026-11-17 10:59:31,511 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_CLASSE_TIPO_DOCUMENTO')
2026-11-17T13:59:43.6094148Z 2026-11-17 10:59:31,511 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icClasseTipoDocumento with lazy=false
2026-11-17T13:59:43.6094669Z 2026-11-17 10:59:31,511 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumento:icClasseTipoDocumento]
2026-11-17T13:59:43.6095315Z 2026-11-17 10:59:31,511 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icClasseTipoDocumento
2026-11-17T13:59:43.6095656Z 2026-11-17 10:59:31,511 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.IC_CLASSE_TIPO_DOCUMENTO
2026-11-17T13:59:43.6095968Z 2026-11-17 10:59:31,511 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icClasseTipoDocumento
2026-11-17T13:59:43.6096315Z 2026-11-17 10:59:31,511 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_DOCUMENTO_OBRIGATORIO')
2026-11-17T13:59:43.6096661Z 2026-11-17 10:59:31,511 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icDocumentoObrigatorio with lazy=false
2026-11-17T13:59:43.6097047Z 2026-11-17 10:59:31,511 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumento:icDocumentoObrigatorio]
2026-11-17T13:59:43.6097420Z 2026-11-17 10:59:31,511 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icDocumentoObrigatorio
2026-11-17T13:59:43.6097755Z 2026-11-17 10:59:31,511 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.IC_DOCUMENTO_OBRIGATORIO
2026-11-17T13:59:43.6098076Z 2026-11-17 10:59:31,511 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icDocumentoObrigatorio
2026-11-17T13:59:43.6098484Z 2026-11-17 10:59:31,512 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-11-17T13:59:43.6098851Z 2026-11-17 10:59:31,513 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.HistoricoAnaliseDocumento
2026-11-17T13:59:43.6099176Z 2026-11-17 10:59:31,513 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name HistoricoAnaliseDocumento
2026-11-17T13:59:43.6099536Z 2026-11-17 10:59:31,513 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.HistoricoAnaliseDocumento on table FAPTB119_HSTRO_ANLSE_DOCUMENTO
2026-11-17T13:59:43.6099920Z 2026-11-17 10:59:31,513 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-11-17T13:59:43.6100227Z 2026-11-17 10:59:31,516 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6100583Z 2026-11-17 10:59:31,516 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento] is safe
2026-11-17T13:59:43.6101026Z 2026-11-17 10:59:31,516 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.HistoricoAnaliseDocumento
2026-11-17T13:59:43.6101410Z 2026-11-17 10:59:31,525 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_SQNCL_ANALISE_DOCUMENTO')
2026-11-17T13:59:43.6101757Z 2026-11-17 10:59:31,525 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuSqnclAnaliseDocumento with lazy=false
2026-11-17T13:59:43.6102200Z 2026-11-17 10:59:31,525 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.id:nuSqnclAnaliseDocumento]
2026-11-17T13:59:43.6102596Z 2026-11-17 10:59:31,525 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuSqnclAnaliseDocumento
2026-11-17T13:59:43.6102939Z 2026-11-17 10:59:31,525 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.NU_SQNCL_ANALISE_DOCUMENTO
2026-11-17T13:59:43.6103261Z 2026-11-17 10:59:31,525 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuSqnclAnaliseDocumento
2026-11-17T13:59:43.6103581Z 2026-11-17 10:59:31,526 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_PERIODO')
2026-11-17T13:59:43.6103916Z 2026-11-17 10:59:31,526 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioPeriodo with lazy=false
2026-11-17T13:59:43.6104395Z 2026-11-17 10:59:31,526 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.id:tsInicioPeriodo]
2026-11-17T13:59:43.6104787Z 2026-11-17 10:59:31,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioPeriodo
2026-11-17T13:59:43.6105113Z 2026-11-17 10:59:31,526 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.TS_INICIO_PERIODO
2026-11-17T13:59:43.6105436Z 2026-11-17 10:59:31,526 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioPeriodo
2026-11-17T13:59:43.6105681Z 2026-11-17 10:59:31,526 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property id
2026-11-17T13:59:43.6106032Z 2026-11-17 10:59:31,526 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_CPF_CNPJ_DOCUMENTO')
2026-11-17T13:59:43.6106414Z 2026-11-17 10:59:31,526 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coCpfCnpjDocumento with lazy=false
2026-11-17T13:59:43.6106888Z 2026-11-17 10:59:31,526 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:coCpfCnpjDocumento]
2026-11-17T13:59:43.6107260Z 2026-11-17 10:59:31,526 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coCpfCnpjDocumento
2026-11-17T13:59:43.6107598Z 2026-11-17 10:59:31,526 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.CO_CPF_CNPJ_DOCUMENTO
2026-11-17T13:59:43.6107910Z 2026-11-17 10:59:31,526 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coCpfCnpjDocumento
2026-11-17T13:59:43.6108272Z 2026-11-17 10:59:31,527 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ANALISE_DOCUMENTO')
2026-11-17T13:59:43.6108617Z 2026-11-17 10:59:31,527 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAnaliseDocumento with lazy=false
2026-11-17T13:59:43.6109062Z 2026-11-17 10:59:31,527 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:coUsuarioAnaliseDocumento]
2026-11-17T13:59:43.6109447Z 2026-11-17 10:59:31,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAnaliseDocumento
2026-11-17T13:59:43.6109792Z 2026-11-17 10:59:31,527 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.CO_USUARIO_ANALISE_DOCUMENTO
2026-11-17T13:59:43.6110133Z 2026-11-17 10:59:31,527 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAnaliseDocumento
2026-11-17T13:59:43.6110469Z 2026-11-17 10:59:31,527 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_JUSTIFICATIVA')
2026-11-17T13:59:43.6110802Z 2026-11-17 10:59:31,527 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deJustificativa with lazy=false
2026-11-17T13:59:43.6111228Z 2026-11-17 10:59:31,527 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:deJustificativa]
2026-11-17T13:59:43.6111598Z 2026-11-17 10:59:31,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deJustificativa
2026-11-17T13:59:43.6111924Z 2026-11-17 10:59:31,527 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.DE_JUSTIFICATIVA
2026-11-17T13:59:43.6112231Z 2026-11-17 10:59:31,527 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deJustificativa
2026-11-17T13:59:43.6112550Z 2026-11-17 10:59:31,527 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_ANALISE_DOCUMENTO')
2026-11-17T13:59:43.6112848Z 2026-11-17 10:59:31,527 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhAnaliseDocumento with lazy=false
2026-11-17T13:59:43.6113271Z 2026-11-17 10:59:31,527 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:dhAnaliseDocumento]
2026-11-17T13:59:43.6113639Z 2026-11-17 10:59:31,527 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhAnaliseDocumento
2026-11-17T13:59:43.6113969Z 2026-11-17 10:59:31,527 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.DH_ANALISE_DOCUMENTO
2026-11-17T13:59:43.6114355Z 2026-11-17 10:59:31,527 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhAnaliseDocumento
2026-11-17T13:59:43.6114684Z 2026-11-17 10:59:31,528 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_FIM_ANALISE_DOCUMENTO')
2026-11-17T13:59:43.6115026Z 2026-11-17 10:59:31,528 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhFimAnaliseDocumento with lazy=false
2026-11-17T13:59:43.6115648Z 2026-11-17 10:59:31,528 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:dhFimAnaliseDocumento]
2026-11-17T13:59:43.6116189Z 2026-11-17 10:59:31,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhFimAnaliseDocumento
2026-11-17T13:59:43.6116600Z 2026-11-17 10:59:31,528 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.DH_FIM_ANALISE_DOCUMENTO
2026-11-17T13:59:43.6116963Z 2026-11-17 10:59:31,528 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhFimAnaliseDocumento
2026-11-17T13:59:43.6117289Z 2026-11-17 10:59:31,528 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_ANALISE_DOCUMENTO')
2026-11-17T13:59:43.6117631Z 2026-11-17 10:59:31,528 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icAnaliseDocumento with lazy=false
2026-11-17T13:59:43.6118058Z 2026-11-17 10:59:31,528 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:icAnaliseDocumento]
2026-11-17T13:59:43.6118440Z 2026-11-17 10:59:31,528 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icAnaliseDocumento
2026-11-17T13:59:43.6118773Z 2026-11-17 10:59:31,528 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.IC_ANALISE_DOCUMENTO
2026-11-17T13:59:43.6119086Z 2026-11-17 10:59:31,528 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icAnaliseDocumento
2026-11-17T13:59:43.6119407Z 2026-11-17 10:59:31,528 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_CPF_CNPJ_DOCUMENTO')
2026-11-17T13:59:43.6119747Z 2026-11-17 10:59:31,528 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icCpfCnpjDocumento with lazy=false
2026-11-17T13:59:43.6120169Z 2026-11-17 10:59:31,529 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:icCpfCnpjDocumento]
2026-11-17T13:59:43.6120542Z 2026-11-17 10:59:31,529 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icCpfCnpjDocumento
2026-11-17T13:59:43.6120878Z 2026-11-17 10:59:31,529 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.IC_CPF_CNPJ_DOCUMENTO
2026-11-17T13:59:43.6121159Z 2026-11-17 10:59:31,529 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icCpfCnpjDocumento
2026-11-17T13:59:43.6121486Z 2026-11-17 10:59:31,529 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_USUARIO_ANALISE_DOCUMENTO')
2026-11-17T13:59:43.6121833Z 2026-11-17 10:59:31,529 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icUsuarioAnaliseDocumento with lazy=false
2026-11-17T13:59:43.6122269Z 2026-11-17 10:59:31,529 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:icUsuarioAnaliseDocumento]
2026-11-17T13:59:43.6122656Z 2026-11-17 10:59:31,529 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icUsuarioAnaliseDocumento
2026-11-17T13:59:43.6123001Z 2026-11-17 10:59:31,529 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.IC_USUARIO_ANALISE_DOCUMENTO
2026-11-17T13:59:43.6123323Z 2026-11-17 10:59:31,529 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icUsuarioAnaliseDocumento
2026-11-17T13:59:43.6123648Z 2026-11-17 10:59:31,529 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_IDENTIFICADOR_DOCUMENTO')
2026-11-17T13:59:43.6124023Z 2026-11-17 10:59:31,529 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuIdentificadorDocumento with lazy=false
2026-11-17T13:59:43.6124519Z 2026-11-17 10:59:31,529 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:nuIdentificadorDocumento]
2026-11-17T13:59:43.6124906Z 2026-11-17 10:59:31,529 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuIdentificadorDocumento
2026-11-17T13:59:43.6125285Z 2026-11-17 10:59:31,529 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.NU_IDENTIFICADOR_DOCUMENTO
2026-11-17T13:59:43.6125610Z 2026-11-17 10:59:31,529 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuIdentificadorDocumento
2026-11-17T13:59:43.6125930Z 2026-11-17 10:59:31,530 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DOCUMENTO')
2026-11-17T13:59:43.6126263Z 2026-11-17 10:59:31,530 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDocumento with lazy=false
2026-11-17T13:59:43.6126688Z 2026-11-17 10:59:31,530 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento:nuTipoDocumento]
2026-11-17T13:59:43.6127060Z 2026-11-17 10:59:31,530 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDocumento
2026-11-17T13:59:43.6127389Z 2026-11-17 10:59:31,530 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB119_HSTRO_ANLSE_DOCUMENTO.NU_TIPO_DOCUMENTO
2026-11-17T13:59:43.6127702Z 2026-11-17 10:59:31,530 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDocumento
2026-11-17T13:59:43.6128060Z 2026-11-17 10:59:31,530 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_TIPO_DOCUMENTO',referencedColumn='NU_TIPO_DOCUMENTO')
2026-11-17T13:59:43.6128391Z 2026-11-17 10:59:31,530 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6128648Z 2026-11-17 10:59:31,530 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tipoDocumento
2026-11-17T13:59:43.6128992Z 2026-11-17 10:59:31,530 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-11-17T13:59:43.6129357Z 2026-11-17 10:59:31,532 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.TipoDocumentoFarmacia
2026-11-17T13:59:43.6129677Z 2026-11-17 10:59:31,532 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name TipoDocumentoFarmacia
2026-11-17T13:59:43.6130034Z 2026-11-17 10:59:31,532 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.TipoDocumentoFarmacia on table FAPTB006_TIPO_DOCUMENTO
2026-11-17T13:59:43.6130375Z 2026-11-17 10:59:31,532 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-11-17T13:59:43.6130708Z 2026-11-17 10:59:31,533 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DOCUMENTO')
2026-11-17T13:59:43.6131070Z 2026-11-17 10:59:31,533 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoDocumentoFarmacia] is safe
2026-11-17T13:59:43.6131502Z 2026-11-17 10:59:31,533 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoDocumentoFarmacia
2026-11-17T13:59:43.6131872Z 2026-11-17 10:59:31,533 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDocumento with lazy=false
2026-11-17T13:59:43.6132342Z 2026-11-17 10:59:31,533 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoFarmacia:nuTipoDocumento]
2026-11-17T13:59:43.6132714Z 2026-11-17 10:59:31,533 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDocumento
2026-11-17T13:59:43.6133039Z 2026-11-17 10:59:31,533 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.NU_TIPO_DOCUMENTO
2026-11-17T13:59:43.6133405Z 2026-11-17 10:59:31,533 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDocumento
2026-11-17T13:59:43.6133719Z 2026-11-17 10:59:31,534 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_TIPOLOGIA_DOCUMENTO')
2026-11-17T13:59:43.6134058Z 2026-11-17 10:59:31,534 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coTipologiaDocumento with lazy=false
2026-11-17T13:59:43.6134618Z 2026-11-17 10:59:31,534 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoFarmacia:coTipologiaDocumento]
2026-11-17T13:59:43.6135011Z 2026-11-17 10:59:31,534 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coTipologiaDocumento
2026-11-17T13:59:43.6135343Z 2026-11-17 10:59:31,534 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.CO_TIPOLOGIA_DOCUMENTO
2026-11-17T13:59:43.6135661Z 2026-11-17 10:59:31,534 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coTipologiaDocumento
2026-11-17T13:59:43.6135986Z 2026-11-17 10:59:31,534 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_TIPO_DOCUMENTO_FARMACIA')
2026-11-17T13:59:43.6136297Z 2026-11-17 10:59:31,534 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deTipoDocumentoFarmacia with lazy=false
2026-11-17T13:59:43.6136728Z 2026-11-17 10:59:31,534 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoFarmacia:deTipoDocumentoFarmacia]
2026-11-17T13:59:43.6137108Z 2026-11-17 10:59:31,534 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deTipoDocumentoFarmacia
2026-11-17T13:59:43.6137445Z 2026-11-17 10:59:31,534 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.DE_TIPO_DOCUMENTO_FARMACIA
2026-11-17T13:59:43.6137762Z 2026-11-17 10:59:31,534 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deTipoDocumentoFarmacia
2026-11-17T13:59:43.6138097Z 2026-11-17 10:59:31,534 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_CLASSE_TIPO_DOCUMENTO')
2026-11-17T13:59:43.6138443Z 2026-11-17 10:59:31,534 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icClasseTipoDocumento with lazy=false
2026-11-17T13:59:43.6138871Z 2026-11-17 10:59:31,534 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoFarmacia:icClasseTipoDocumento]
2026-11-17T13:59:43.6139239Z 2026-11-17 10:59:31,534 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icClasseTipoDocumento
2026-11-17T13:59:43.6139574Z 2026-11-17 10:59:31,534 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.IC_CLASSE_TIPO_DOCUMENTO
2026-11-17T13:59:43.6139882Z 2026-11-17 10:59:31,534 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icClasseTipoDocumento
2026-11-17T13:59:43.6140207Z 2026-11-17 10:59:31,534 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_DOCUMENTO_OBRIGATORIO')
2026-11-17T13:59:43.6140588Z 2026-11-17 10:59:31,535 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icDocumentoObrigatorio with lazy=false
2026-11-17T13:59:43.6141027Z 2026-11-17 10:59:31,535 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoFarmacia:icDocumentoObrigatorio]
2026-11-17T13:59:43.6141408Z 2026-11-17 10:59:31,535 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icDocumentoObrigatorio
2026-11-17T13:59:43.6141741Z 2026-11-17 10:59:31,535 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB006_TIPO_DOCUMENTO.IC_DOCUMENTO_OBRIGATORIO
2026-11-17T13:59:43.6142087Z 2026-11-17 10:59:31,535 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icDocumentoObrigatorio
2026-11-17T13:59:43.6142437Z 2026-11-17 10:59:31,535 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-11-17T13:59:43.6142795Z 2026-11-17 10:59:31,536 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.AnaliseDocumento
2026-11-17T13:59:43.6143104Z 2026-11-17 10:59:31,536 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name AnaliseDocumento
2026-11-17T13:59:43.6143447Z 2026-11-17 10:59:31,536 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.AnaliseDocumento on table FAPTB019_ANALISE_DOCUMENTO
2026-11-17T13:59:43.6143788Z 2026-11-17 10:59:31,550 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-11-17T13:59:43.6144117Z 2026-11-17 10:59:31,556 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_SQNCL_ANALISE_DOCUMENTO')
2026-11-17T13:59:43.6144507Z 2026-11-17 10:59:31,556 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.AnaliseDocumento] is safe
2026-11-17T13:59:43.6144928Z 2026-11-17 10:59:31,556 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.AnaliseDocumento
2026-11-17T13:59:43.6145301Z 2026-11-17 10:59:31,556 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuSqnclAnaliseDocumento with lazy=false
2026-11-17T13:59:43.6145727Z 2026-11-17 10:59:31,556 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:nuSqnclAnaliseDocumento]
2026-11-17T13:59:43.6146108Z 2026-11-17 10:59:31,557 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuSqnclAnaliseDocumento
2026-11-17T13:59:43.6146440Z 2026-11-17 10:59:31,557 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.NU_SQNCL_ANALISE_DOCUMENTO
2026-11-17T13:59:43.6146762Z 2026-11-17 10:59:31,557 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuSqnclAnaliseDocumento
2026-11-17T13:59:43.6147245Z 2026-11-17 10:59:31,557 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_SQNCL_ANALISE_DOCUMENTO)]), nuSqnclAnaliseDocumento, identity, , ...)
2026-11-17T13:59:43.6147653Z 2026-11-17 10:59:31,557 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_CPF_CNPJ_DOCUMENTO')
2026-11-17T13:59:43.6147984Z 2026-11-17 10:59:31,557 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coCpfCnpjDocumento with lazy=false
2026-11-17T13:59:43.6148399Z 2026-11-17 10:59:31,557 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:coCpfCnpjDocumento]
2026-11-17T13:59:43.6148814Z 2026-11-17 10:59:31,557 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coCpfCnpjDocumento
2026-11-17T13:59:43.6149141Z 2026-11-17 10:59:31,557 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.CO_CPF_CNPJ_DOCUMENTO
2026-11-17T13:59:43.6149447Z 2026-11-17 10:59:31,557 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coCpfCnpjDocumento
2026-11-17T13:59:43.6149769Z 2026-11-17 10:59:31,557 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ANALISE_DOCUMENTO')
2026-11-17T13:59:43.6150147Z 2026-11-17 10:59:31,557 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAnaliseDocumento with lazy=false
2026-11-17T13:59:43.6150575Z 2026-11-17 10:59:31,557 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:coUsuarioAnaliseDocumento]
2026-11-17T13:59:43.6150954Z 2026-11-17 10:59:31,557 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAnaliseDocumento
2026-11-17T13:59:43.6151293Z 2026-11-17 10:59:31,557 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.CO_USUARIO_ANALISE_DOCUMENTO
2026-11-17T13:59:43.6151607Z 2026-11-17 10:59:31,557 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAnaliseDocumento
2026-11-17T13:59:43.6151922Z 2026-11-17 10:59:31,557 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_JUSTIFICATIVA')
2026-11-17T13:59:43.6152254Z 2026-11-17 10:59:31,557 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deJustificativa with lazy=false
2026-11-17T13:59:43.6152662Z 2026-11-17 10:59:31,557 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:deJustificativa]
2026-11-17T13:59:43.6153023Z 2026-11-17 10:59:31,557 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deJustificativa
2026-11-17T13:59:43.6153309Z 2026-11-17 10:59:31,557 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.DE_JUSTIFICATIVA
2026-11-17T13:59:43.6153609Z 2026-11-17 10:59:31,558 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deJustificativa
2026-11-17T13:59:43.6153928Z 2026-11-17 10:59:31,558 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_ANALISE_DOCUMENTO')
2026-11-17T13:59:43.6154313Z 2026-11-17 10:59:31,558 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhAnaliseDocumento with lazy=false
2026-11-17T13:59:43.6154743Z 2026-11-17 10:59:31,558 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:dhAnaliseDocumento]
2026-11-17T13:59:43.6155114Z 2026-11-17 10:59:31,558 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhAnaliseDocumento
2026-11-17T13:59:43.6155443Z 2026-11-17 10:59:31,558 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.DH_ANALISE_DOCUMENTO
2026-11-17T13:59:43.6155750Z 2026-11-17 10:59:31,558 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhAnaliseDocumento
2026-11-17T13:59:43.6156116Z 2026-11-17 10:59:31,558 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_FIM_ANALISE_DOCUMENTO')
2026-11-17T13:59:43.6156479Z 2026-11-17 10:59:31,558 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhFimAnaliseDocumento with lazy=false
2026-11-17T13:59:43.6157006Z 2026-11-17 10:59:31,558 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:dhFimAnaliseDocumento]
2026-11-17T13:59:43.6157474Z 2026-11-17 10:59:31,558 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhFimAnaliseDocumento
2026-11-17T13:59:43.6157810Z 2026-11-17 10:59:31,558 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.DH_FIM_ANALISE_DOCUMENTO
2026-11-17T13:59:43.6158125Z 2026-11-17 10:59:31,558 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhFimAnaliseDocumento
2026-11-17T13:59:43.6158446Z 2026-11-17 10:59:31,558 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_ANALISE_DOCUMENTO')
2026-11-17T13:59:43.6158814Z 2026-11-17 10:59:31,558 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icAnaliseDocumento with lazy=false
2026-11-17T13:59:43.6159236Z 2026-11-17 10:59:31,558 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:icAnaliseDocumento]
2026-11-17T13:59:43.6159620Z 2026-11-17 10:59:31,558 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icAnaliseDocumento
2026-11-17T13:59:43.6159959Z 2026-11-17 10:59:31,558 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.IC_ANALISE_DOCUMENTO
2026-11-17T13:59:43.6160267Z 2026-11-17 10:59:31,558 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icAnaliseDocumento
2026-11-17T13:59:43.6160553Z 2026-11-17 10:59:31,559 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_CPF_CNPJ_DOCUMENTO')
2026-11-17T13:59:43.6160894Z 2026-11-17 10:59:31,559 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icCpfCnpjDocumento with lazy=false
2026-11-17T13:59:43.6161318Z 2026-11-17 10:59:31,559 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:icCpfCnpjDocumento]
2026-11-17T13:59:43.6161689Z 2026-11-17 10:59:31,559 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icCpfCnpjDocumento
2026-11-17T13:59:43.6162026Z 2026-11-17 10:59:31,559 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.IC_CPF_CNPJ_DOCUMENTO
2026-11-17T13:59:43.6162339Z 2026-11-17 10:59:31,559 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icCpfCnpjDocumento
2026-11-17T13:59:43.6162660Z 2026-11-17 10:59:31,559 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_USUARIO_ANALISE_DOCUMENTO')
2026-11-17T13:59:43.6163009Z 2026-11-17 10:59:31,559 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icUsuarioAnaliseDocumento with lazy=false
2026-11-17T13:59:43.6163434Z 2026-11-17 10:59:31,559 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:icUsuarioAnaliseDocumento]
2026-11-17T13:59:43.6163814Z 2026-11-17 10:59:31,559 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icUsuarioAnaliseDocumento
2026-11-17T13:59:43.6164158Z 2026-11-17 10:59:31,559 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.IC_USUARIO_ANALISE_DOCUMENTO
2026-11-17T13:59:43.6164554Z 2026-11-17 10:59:31,559 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icUsuarioAnaliseDocumento
2026-11-17T13:59:43.6164862Z 2026-11-17 10:59:31,559 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-11-17T13:59:43.6165157Z 2026-11-17 10:59:31,559 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6165469Z 2026-11-17 10:59:31,571 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: IndexColumn(column='itensAnalise_ORDER')
2026-11-17T13:59:43.6165817Z 2026-11-17 10:59:31,573 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6166132Z 2026-11-17 10:59:31,573 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='itensAnalise_KEY')
2026-11-17T13:59:43.6166461Z 2026-11-17 10:59:31,573 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='itensAnalise_KEY')
2026-11-17T13:59:43.6166736Z 2026-11-17 10:59:31,574 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-11-17T13:59:43.6167062Z 2026-11-17 10:59:31,574 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-11-17T13:59:43.6167395Z 2026-11-17 10:59:31,576 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Collection role: br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise
2026-11-17T13:59:43.6167708Z 2026-11-17 10:59:31,577 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property itensAnalise
2026-11-17T13:59:43.6168034Z 2026-11-17 10:59:31,577 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_IDENTIFICADOR_DOCUMENTO')
2026-11-17T13:59:43.6168380Z 2026-11-17 10:59:31,578 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuIdentificadorDocumento with lazy=false
2026-11-17T13:59:43.6168806Z 2026-11-17 10:59:31,578 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:nuIdentificadorDocumento]
2026-11-17T13:59:43.6169179Z 2026-11-17 10:59:31,578 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuIdentificadorDocumento
2026-11-17T13:59:43.6169515Z 2026-11-17 10:59:31,578 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.NU_IDENTIFICADOR_DOCUMENTO
2026-11-17T13:59:43.6169838Z 2026-11-17 10:59:31,578 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuIdentificadorDocumento
2026-11-17T13:59:43.6170156Z 2026-11-17 10:59:31,578 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DOCUMENTO')
2026-11-17T13:59:43.6170500Z 2026-11-17 10:59:31,578 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDocumento with lazy=false
2026-11-17T13:59:43.6170923Z 2026-11-17 10:59:31,578 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:nuTipoDocumento]
2026-11-17T13:59:43.6171287Z 2026-11-17 10:59:31,578 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDocumento
2026-11-17T13:59:43.6171609Z 2026-11-17 10:59:31,578 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.NU_TIPO_DOCUMENTO
2026-11-17T13:59:43.6171912Z 2026-11-17 10:59:31,578 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDocumento
2026-11-17T13:59:43.6172261Z 2026-11-17 10:59:31,578 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_TIPO_DOCUMENTO',referencedColumn='NU_TIPO_DOCUMENTO')
2026-11-17T13:59:43.6172584Z 2026-11-17 10:59:31,578 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6172870Z 2026-11-17 10:59:31,578 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tipoDocumento
2026-11-17T13:59:43.6173148Z 2026-11-17 10:59:31,578 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_FIM_PERIODO')
2026-11-17T13:59:43.6173471Z 2026-11-17 10:59:31,579 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsFimPeriodo with lazy=false
2026-11-17T13:59:43.6173883Z 2026-11-17 10:59:31,579 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:tsFimPeriodo]
2026-11-17T13:59:43.6174342Z 2026-11-17 10:59:31,579 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsFimPeriodo
2026-11-17T13:59:43.6174674Z 2026-11-17 10:59:31,579 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.TS_FIM_PERIODO
2026-11-17T13:59:43.6174977Z 2026-11-17 10:59:31,579 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsFimPeriodo
2026-11-17T13:59:43.6175289Z 2026-11-17 10:59:31,579 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_PERIODO')
2026-11-17T13:59:43.6175666Z 2026-11-17 10:59:31,579 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioPeriodo with lazy=false
2026-11-17T13:59:43.6176081Z 2026-11-17 10:59:31,579 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.AnaliseDocumento:tsInicioPeriodo]
2026-11-17T13:59:43.6176454Z 2026-11-17 10:59:31,579 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioPeriodo
2026-11-17T13:59:43.6176784Z 2026-11-17 10:59:31,579 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB019_ANALISE_DOCUMENTO.TS_INICIO_PERIODO
2026-11-17T13:59:43.6177087Z 2026-11-17 10:59:31,579 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioPeriodo
2026-11-17T13:59:43.6177434Z 2026-11-17 10:59:31,579 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-11-17T13:59:43.6177789Z 2026-11-17 10:59:31,580 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.Farmaceutico
2026-11-17T13:59:43.6178097Z 2026-11-17 10:59:31,580 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name Farmaceutico
2026-11-17T13:59:43.6178431Z 2026-11-17 10:59:31,584 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.Farmaceutico on table FAPTB004_FARMACEUTICO
2026-11-17T13:59:43.6178768Z 2026-11-17 10:59:31,584 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-11-17T13:59:43.6179097Z 2026-11-17 10:59:31,586 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_FARMACEUTICO')
2026-11-17T13:59:43.6179448Z 2026-11-17 10:59:31,586 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.Farmaceutico] is safe
2026-11-17T13:59:43.6179828Z 2026-11-17 10:59:31,586 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.Farmaceutico
2026-11-17T13:59:43.6180195Z 2026-11-17 10:59:31,586 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuFarmaceutico with lazy=false
2026-11-17T13:59:43.6180609Z 2026-11-17 10:59:31,586 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:nuFarmaceutico]
2026-11-17T13:59:43.6180969Z 2026-11-17 10:59:31,586 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuFarmaceutico
2026-11-17T13:59:43.6181289Z 2026-11-17 10:59:31,586 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.NU_FARMACEUTICO
2026-11-17T13:59:43.6181593Z 2026-11-17 10:59:31,586 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuFarmaceutico
2026-11-17T13:59:43.6181931Z 2026-11-17 10:59:31,586 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_FARMACEUTICO)]), nuFarmaceutico, identity, , ...)
2026-11-17T13:59:43.6182323Z 2026-11-17 10:59:31,586 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_IDENTIFICACAO_FARMACEUTICO')
2026-11-17T13:59:43.6182671Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coIdentificacaoFarmaceutico with lazy=false
2026-11-17T13:59:43.6183104Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:coIdentificacaoFarmaceutico]
2026-11-17T13:59:43.6183487Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coIdentificacaoFarmaceutico
2026-11-17T13:59:43.6183969Z 2026-11-17 10:59:31,587 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.CO_IDENTIFICACAO_FARMACEUTICO
2026-11-17T13:59:43.6184413Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coIdentificacaoFarmaceutico
2026-11-17T13:59:43.6184762Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ACAO_FARMACEUTICO')
2026-11-17T13:59:43.6185107Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAcaoFarmaceutico with lazy=false
2026-11-17T13:59:43.6185543Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:coUsuarioAcaoFarmaceutico]
2026-11-17T13:59:43.6185925Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAcaoFarmaceutico
2026-11-17T13:59:43.6186264Z 2026-11-17 10:59:31,587 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.CO_USUARIO_ACAO_FARMACEUTICO
2026-11-17T13:59:43.6186583Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAcaoFarmaceutico
2026-11-17T13:59:43.6186912Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_ENDERECO_IP_FARMACEUTICO')
2026-11-17T13:59:43.6187249Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEnderecoIpFarmaceutico with lazy=false
2026-11-17T13:59:43.6187670Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:deEnderecoIpFarmaceutico]
2026-11-17T13:59:43.6188045Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEnderecoIpFarmaceutico
2026-11-17T13:59:43.6188346Z 2026-11-17 10:59:31,587 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.DE_ENDERECO_IP_FARMACEUTICO
2026-11-17T13:59:43.6188661Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEnderecoIpFarmaceutico
2026-11-17T13:59:43.6188983Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_VENCIMENTO_REGISTRO')
2026-11-17T13:59:43.6189326Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtVencimentoRegistro with lazy=false
2026-11-17T13:59:43.6189736Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:dtVencimentoRegistro]
2026-11-17T13:59:43.6190106Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtVencimentoRegistro
2026-11-17T13:59:43.6190549Z 2026-11-17 10:59:31,587 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.DT_VENCIMENTO_REGISTRO
2026-11-17T13:59:43.6190943Z 2026-11-17 10:59:31,587 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtVencimentoRegistro
2026-11-17T13:59:43.6191258Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_TIPO_ACAO')
2026-11-17T13:59:43.6191587Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icTipoAcao with lazy=false
2026-11-17T13:59:43.6191997Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:icTipoAcao]
2026-11-17T13:59:43.6192394Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icTipoAcao
2026-11-17T13:59:43.6192711Z 2026-11-17 10:59:31,588 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.IC_TIPO_ACAO
2026-11-17T13:59:43.6193009Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icTipoAcao
2026-11-17T13:59:43.6193327Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CPF_FARMACEUTICO')
2026-11-17T13:59:43.6193668Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuCpfFarmaceutico with lazy=false
2026-11-17T13:59:43.6194082Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:nuCpfFarmaceutico]
2026-11-17T13:59:43.6194532Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuCpfFarmaceutico
2026-11-17T13:59:43.6194872Z 2026-11-17 10:59:31,588 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.NU_CPF_FARMACEUTICO
2026-11-17T13:59:43.6195182Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuCpfFarmaceutico
2026-11-17T13:59:43.6195476Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='SG_IDENTIFICACAO_FARMACEUTICO')
2026-11-17T13:59:43.6195831Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property sgIdentificacaoFarmaceutico with lazy=false
2026-11-17T13:59:43.6196262Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:sgIdentificacaoFarmaceutico]
2026-11-17T13:59:43.6196642Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for sgIdentificacaoFarmaceutico
2026-11-17T13:59:43.6196986Z 2026-11-17 10:59:31,588 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.SG_IDENTIFICACAO_FARMACEUTICO
2026-11-17T13:59:43.6197317Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property sgIdentificacaoFarmaceutico
2026-11-17T13:59:43.6197650Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_FIM_VIGENCIA_FARMACEUTICO')
2026-11-17T13:59:43.6197994Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsFimVigenciaFarmaceutico with lazy=false
2026-11-17T13:59:43.6198419Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:tsFimVigenciaFarmaceutico]
2026-11-17T13:59:43.6198792Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsFimVigenciaFarmaceutico
2026-11-17T13:59:43.6199130Z 2026-11-17 10:59:31,588 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.TS_FIM_VIGENCIA_FARMACEUTICO
2026-11-17T13:59:43.6199507Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsFimVigenciaFarmaceutico
2026-11-17T13:59:43.6199833Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_VIGENCIA_FRMCO')
2026-11-17T13:59:43.6200176Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioVigenciaFrmco with lazy=false
2026-11-17T13:59:43.6200590Z 2026-11-17 10:59:31,588 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmaceutico:tsInicioVigenciaFrmco]
2026-11-17T13:59:43.6200990Z 2026-11-17 10:59:31,589 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioVigenciaFrmco
2026-11-17T13:59:43.6201316Z 2026-11-17 10:59:31,589 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB004_FARMACEUTICO.TS_INICIO_VIGENCIA_FRMCO
2026-11-17T13:59:43.6201631Z 2026-11-17 10:59:31,589 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioVigenciaFrmco
2026-11-17T13:59:43.6201978Z 2026-11-17 10:59:31,589 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-11-17T13:59:43.6202346Z 2026-11-17 10:59:31,590 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.ItemAnaliseDocumento
2026-11-17T13:59:43.6202670Z 2026-11-17 10:59:31,590 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name ItemAnaliseDocumento
2026-11-17T13:59:43.6202986Z 2026-11-17 10:59:31,590 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.ItemAnaliseDocumento on table FAPTB018_ITEM_ANALISE_DCMTO
2026-11-17T13:59:43.6203329Z 2026-11-17 10:59:31,590 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-11-17T13:59:43.6203666Z 2026-11-17 10:59:31,591 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_ITEM_ANALISE_DOCUMENTO')
2026-11-17T13:59:43.6204035Z 2026-11-17 10:59:31,591 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.ItemAnaliseDocumento] is safe
2026-11-17T13:59:43.6204593Z 2026-11-17 10:59:31,591 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.ItemAnaliseDocumento
2026-11-17T13:59:43.6204978Z 2026-11-17 10:59:31,592 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuItemAnaliseDocumento with lazy=false
2026-11-17T13:59:43.6205413Z 2026-11-17 10:59:31,592 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemAnaliseDocumento:nuItemAnaliseDocumento]
2026-11-17T13:59:43.6205879Z 2026-11-17 10:59:31,592 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuItemAnaliseDocumento
2026-11-17T13:59:43.6206224Z 2026-11-17 10:59:31,592 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB018_ITEM_ANALISE_DCMTO.NU_ITEM_ANALISE_DOCUMENTO
2026-11-17T13:59:43.6206543Z 2026-11-17 10:59:31,592 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuItemAnaliseDocumento
2026-11-17T13:59:43.6206910Z 2026-11-17 10:59:31,592 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_ITEM_ANALISE_DOCUMENTO)]), nuItemAnaliseDocumento, identity, , ...)
2026-11-17T13:59:43.6207320Z 2026-11-17 10:59:31,592 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_SQNCL_ANALISE_DOCUMENTO',referencedColumn='NU_SQNCL_ANALISE_DOCUMENTO')
2026-11-17T13:59:43.6207718Z 2026-11-17 10:59:31,592 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6208013Z 2026-11-17 10:59:31,592 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property analiseDocumento
2026-11-17T13:59:43.6208334Z 2026-11-17 10:59:31,592 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_ITEM_ANALISE')
2026-11-17T13:59:43.6208707Z 2026-11-17 10:59:31,592 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhItemAnalise with lazy=false
2026-11-17T13:59:43.6209126Z 2026-11-17 10:59:31,592 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemAnaliseDocumento:dhItemAnalise]
2026-11-17T13:59:43.6209530Z 2026-11-17 10:59:31,592 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhItemAnalise
2026-11-17T13:59:43.6209853Z 2026-11-17 10:59:31,592 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB018_ITEM_ANALISE_DCMTO.DH_ITEM_ANALISE
2026-11-17T13:59:43.6210157Z 2026-11-17 10:59:31,592 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhItemAnalise
2026-11-17T13:59:43.6210467Z 2026-11-17 10:59:31,592 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_ITEM_PENDENTE')
2026-11-17T13:59:43.6210796Z 2026-11-17 10:59:31,592 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icItemPendente with lazy=false
2026-11-17T13:59:43.6211183Z 2026-11-17 10:59:31,592 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemAnaliseDocumento:icItemPendente]
2026-11-17T13:59:43.6211549Z 2026-11-17 10:59:31,592 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icItemPendente
2026-11-17T13:59:43.6211878Z 2026-11-17 10:59:31,592 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB018_ITEM_ANALISE_DCMTO.IC_ITEM_PENDENTE
2026-11-17T13:59:43.6212182Z 2026-11-17 10:59:31,592 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icItemPendente
2026-11-17T13:59:43.6212490Z 2026-11-17 10:59:31,593 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_MATRICULA')
2026-11-17T13:59:43.6212812Z 2026-11-17 10:59:31,593 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuMatricula with lazy=false
2026-11-17T13:59:43.6213221Z 2026-11-17 10:59:31,593 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemAnaliseDocumento:nuMatricula]
2026-11-17T13:59:43.6213581Z 2026-11-17 10:59:31,593 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuMatricula
2026-11-17T13:59:43.6213895Z 2026-11-17 10:59:31,593 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB018_ITEM_ANALISE_DCMTO.NU_MATRICULA
2026-11-17T13:59:43.6214353Z 2026-11-17 10:59:31,593 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuMatricula
2026-11-17T13:59:43.6214711Z 2026-11-17 10:59:31,593 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_SQNCL_ANALISE_DOCUMENTO')
2026-11-17T13:59:43.6215054Z 2026-11-17 10:59:31,593 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuSqnclAnaliseDocumento with lazy=false
2026-11-17T13:59:43.6215490Z 2026-11-17 10:59:31,593 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemAnaliseDocumento:nuSqnclAnaliseDocumento]
2026-11-17T13:59:43.6215870Z 2026-11-17 10:59:31,593 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuSqnclAnaliseDocumento
2026-11-17T13:59:43.6216381Z 2026-11-17 10:59:31,593 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB018_ITEM_ANALISE_DCMTO.NU_SQNCL_ANALISE_DOCUMENTO
2026-11-17T13:59:43.6216811Z 2026-11-17 10:59:31,593 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuSqnclAnaliseDocumento
2026-11-17T13:59:43.6217205Z 2026-11-17 10:59:31,593 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DCMTO_ITM_VLDCO')
2026-11-17T13:59:43.6217538Z 2026-11-17 10:59:31,593 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDcmtoItmVldco with lazy=false
2026-11-17T13:59:43.6218016Z 2026-11-17 10:59:31,593 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemAnaliseDocumento:nuTipoDcmtoItmVldco]
2026-11-17T13:59:43.6218391Z 2026-11-17 10:59:31,593 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDcmtoItmVldco
2026-11-17T13:59:43.6218726Z 2026-11-17 10:59:31,593 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB018_ITEM_ANALISE_DCMTO.NU_TIPO_DCMTO_ITM_VLDCO
2026-11-17T13:59:43.6219012Z 2026-11-17 10:59:31,593 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDcmtoItmVldco
2026-11-17T13:59:43.6219381Z 2026-11-17 10:59:31,593 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_TIPO_DCMTO_ITM_VLDCO',referencedColumn='NU_TIPO_DCMTO_ITM_VLDCO')
2026-11-17T13:59:43.6219717Z 2026-11-17 10:59:31,593 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6220019Z 2026-11-17 10:59:31,593 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tipoDocumentoItemValidacao
2026-11-17T13:59:43.6220380Z 2026-11-17 10:59:31,593 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-11-17T13:59:43.6220745Z 2026-11-17 10:59:31,594 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.RepresentacaoFarmacia
2026-11-17T13:59:43.6221066Z 2026-11-17 10:59:31,594 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name RepresentacaoFarmacia
2026-11-17T13:59:43.6221413Z 2026-11-17 10:59:31,595 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.RepresentacaoFarmacia on table FAPTB011_RPRTO_FARMACIA
2026-11-17T13:59:43.6221752Z 2026-11-17 10:59:31,595 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-11-17T13:59:43.6222088Z 2026-11-17 10:59:31,596 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_REPRESENTACAO_FARMACIA')
2026-11-17T13:59:43.6222457Z 2026-11-17 10:59:31,596 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.RepresentacaoFarmacia] is safe
2026-11-17T13:59:43.6222892Z 2026-11-17 10:59:31,596 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.RepresentacaoFarmacia
2026-11-17T13:59:43.6223270Z 2026-11-17 10:59:31,596 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuRepresentacaoFarmacia with lazy=false
2026-11-17T13:59:43.6223705Z 2026-11-17 10:59:31,596 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:nuRepresentacaoFarmacia]
2026-11-17T13:59:43.6224169Z 2026-11-17 10:59:31,596 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuRepresentacaoFarmacia
2026-11-17T13:59:43.6224744Z 2026-11-17 10:59:31,596 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.NU_REPRESENTACAO_FARMACIA
2026-11-17T13:59:43.6225259Z 2026-11-17 10:59:31,596 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuRepresentacaoFarmacia
2026-11-17T13:59:43.6225746Z 2026-11-17 10:59:31,596 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_REPRESENTACAO_FARMACIA)]), nuRepresentacaoFarmacia, identity, , ...)
2026-11-17T13:59:43.6226313Z 2026-11-17 10:59:31,596 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ACAO_REPRESENTACAO')
2026-11-17T13:59:43.6226757Z 2026-11-17 10:59:31,596 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAcaoRepresentacao with lazy=false
2026-11-17T13:59:43.6227349Z 2026-11-17 10:59:31,596 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:coUsuarioAcaoRepresentacao]
2026-11-17T13:59:43.6227742Z 2026-11-17 10:59:31,596 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAcaoRepresentacao
2026-11-17T13:59:43.6228091Z 2026-11-17 10:59:31,596 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.CO_USUARIO_ACAO_REPRESENTACAO
2026-11-17T13:59:43.6228452Z 2026-11-17 10:59:31,596 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAcaoRepresentacao
2026-11-17T13:59:43.6228853Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_EMAIL_REPRESENTANTE')
2026-11-17T13:59:43.6229199Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEmailRepresentante with lazy=false
2026-11-17T13:59:43.6229640Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:deEmailRepresentante]
2026-11-17T13:59:43.6230014Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEmailRepresentante
2026-11-17T13:59:43.6230342Z 2026-11-17 10:59:31,597 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.DE_EMAIL_REPRESENTANTE
2026-11-17T13:59:43.6230660Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEmailRepresentante
2026-11-17T13:59:43.6230986Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_ENDERECO_IP_REPRESENTACAO')
2026-11-17T13:59:43.6231330Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEnderecoIpRepresentacao with lazy=false
2026-11-17T13:59:43.6231774Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:deEnderecoIpRepresentacao]
2026-11-17T13:59:43.6232156Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEnderecoIpRepresentacao
2026-11-17T13:59:43.6232547Z 2026-11-17 10:59:31,597 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.DE_ENDERECO_IP_REPRESENTACAO
2026-11-17T13:59:43.6232860Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEnderecoIpRepresentacao
2026-11-17T13:59:43.6233182Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_FIM_REPRESENTACAO')
2026-11-17T13:59:43.6233517Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtFimRepresentacao with lazy=false
2026-11-17T13:59:43.6233933Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:dtFimRepresentacao]
2026-11-17T13:59:43.6234434Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtFimRepresentacao
2026-11-17T13:59:43.6234766Z 2026-11-17 10:59:31,597 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.DT_FIM_REPRESENTACAO
2026-11-17T13:59:43.6235080Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtFimRepresentacao
2026-11-17T13:59:43.6235406Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_INICIO_REPRESENTACAO')
2026-11-17T13:59:43.6235794Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtInicioRepresentacao with lazy=false
2026-11-17T13:59:43.6236188Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:dtInicioRepresentacao]
2026-11-17T13:59:43.6236565Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtInicioRepresentacao
2026-11-17T13:59:43.6236898Z 2026-11-17 10:59:31,597 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.DT_INICIO_REPRESENTACAO
2026-11-17T13:59:43.6237206Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtInicioRepresentacao
2026-11-17T13:59:43.6237529Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_FARMACIA')
2026-11-17T13:59:43.6237832Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6238120Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property farmacia
2026-11-17T13:59:43.6238433Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_RESPONSAVEL_LEGAL')
2026-11-17T13:59:43.6238767Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icResponsavelLegal with lazy=false
2026-11-17T13:59:43.6239195Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:icResponsavelLegal]
2026-11-17T13:59:43.6239563Z 2026-11-17 10:59:31,597 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icResponsavelLegal
2026-11-17T13:59:43.6239891Z 2026-11-17 10:59:31,598 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.IC_RESPONSAVEL_LEGAL
2026-11-17T13:59:43.6240199Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icResponsavelLegal
2026-11-17T13:59:43.6240514Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_TIPO_ACAO')
2026-11-17T13:59:43.6240842Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icTipoAcao with lazy=false
2026-11-17T13:59:43.6241260Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:icTipoAcao]
2026-11-17T13:59:43.6241624Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icTipoAcao
2026-11-17T13:59:43.6241948Z 2026-11-17 10:59:31,598 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.IC_TIPO_ACAO
2026-11-17T13:59:43.6242245Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icTipoAcao
2026-11-17T13:59:43.6242530Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_DDD_REPRESENTANTE')
2026-11-17T13:59:43.6242908Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuDddRepresentante with lazy=false
2026-11-17T13:59:43.6243332Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:nuDddRepresentante]
2026-11-17T13:59:43.6243707Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuDddRepresentante
2026-11-17T13:59:43.6244065Z 2026-11-17 10:59:31,598 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.NU_DDD_REPRESENTANTE
2026-11-17T13:59:43.6244472Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuDddRepresentante
2026-11-17T13:59:43.6244796Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TELEFONE_REPRESENTANTE')
2026-11-17T13:59:43.6245140Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTelefoneRepresentante with lazy=false
2026-11-17T13:59:43.6245574Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:nuTelefoneRepresentante]
2026-11-17T13:59:43.6245948Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTelefoneRepresentante
2026-11-17T13:59:43.6246290Z 2026-11-17 10:59:31,598 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.NU_TELEFONE_REPRESENTANTE
2026-11-17T13:59:43.6246612Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTelefoneRepresentante
2026-11-17T13:59:43.6246977Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_REPRESENTANTE_FARMACIA')
2026-11-17T13:59:43.6247431Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6247731Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property representante
2026-11-17T13:59:43.6248043Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_FIM_PERIODO')
2026-11-17T13:59:43.6248372Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsFimPeriodo with lazy=false
2026-11-17T13:59:43.6248795Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:tsFimPeriodo]
2026-11-17T13:59:43.6249167Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsFimPeriodo
2026-11-17T13:59:43.6249454Z 2026-11-17 10:59:31,598 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.TS_FIM_PERIODO
2026-11-17T13:59:43.6249756Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsFimPeriodo
2026-11-17T13:59:43.6250083Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_PERIODO')
2026-11-17T13:59:43.6250420Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioPeriodo with lazy=false
2026-11-17T13:59:43.6250843Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoFarmacia:tsInicioPeriodo]
2026-11-17T13:59:43.6251272Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioPeriodo
2026-11-17T13:59:43.6251592Z 2026-11-17 10:59:31,598 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB011_RPRTO_FARMACIA.TS_INICIO_PERIODO
2026-11-17T13:59:43.6251896Z 2026-11-17 10:59:31,598 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioPeriodo
2026-11-17T13:59:43.6252242Z 2026-11-17 10:59:31,599 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-11-17T13:59:43.6252601Z 2026-11-17 10:59:31,600 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.SqlMappings
2026-11-17T13:59:43.6252977Z 2026-11-17 10:59:31,600 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name SqlMappings
2026-11-17T13:59:43.6253303Z 2026-11-17 10:59:31,601 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.SqlMappings on table SqlMappings
2026-11-17T13:59:43.6253639Z 2026-11-17 10:59:31,601 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-11-17T13:59:43.6253941Z 2026-11-17 10:59:31,601 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6254484Z 2026-11-17 10:59:31,601 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.SqlMappings] is safe
2026-11-17T13:59:43.6254919Z 2026-11-17 10:59:31,601 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.SqlMappings
2026-11-17T13:59:43.6255272Z 2026-11-17 10:59:31,601 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property id with lazy=false
2026-11-17T13:59:43.6255668Z 2026-11-17 10:59:31,601 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.SqlMappings:id]
2026-11-17T13:59:43.6256014Z 2026-11-17 10:59:31,602 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for id
2026-11-17T13:59:43.6256272Z 2026-11-17 10:59:31,602 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: SqlMappings.id
2026-11-17T13:59:43.6256556Z 2026-11-17 10:59:31,602 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property id
2026-11-17T13:59:43.6256869Z 2026-11-17 10:59:31,602 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(id)]), id, identity, , ...)
2026-11-17T13:59:43.6257235Z 2026-11-17 10:59:31,602 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-11-17T13:59:43.6257600Z 2026-11-17 10:59:31,602 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.RepresentanteFarmacia
2026-11-17T13:59:43.6257928Z 2026-11-17 10:59:31,603 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name RepresentanteFarmacia
2026-11-17T13:59:43.6258274Z 2026-11-17 10:59:31,603 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.RepresentanteFarmacia on table FAPTB010_RPRSE_FARMACIA
2026-11-17T13:59:43.6258619Z 2026-11-17 10:59:31,603 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-11-17T13:59:43.6258952Z 2026-11-17 10:59:31,604 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_REPRESENTANTE_FARMACIA')
2026-11-17T13:59:43.6259318Z 2026-11-17 10:59:31,604 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.RepresentanteFarmacia] is safe
2026-11-17T13:59:43.6259743Z 2026-11-17 10:59:31,604 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.RepresentanteFarmacia
2026-11-17T13:59:43.6260153Z 2026-11-17 10:59:31,604 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuRepresentanteFarmacia with lazy=false
2026-11-17T13:59:43.6260717Z 2026-11-17 10:59:31,604 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:nuRepresentanteFarmacia]
2026-11-17T13:59:43.6261105Z 2026-11-17 10:59:31,604 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuRepresentanteFarmacia
2026-11-17T13:59:43.6261548Z 2026-11-17 10:59:31,604 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.NU_REPRESENTANTE_FARMACIA
2026-11-17T13:59:43.6261865Z 2026-11-17 10:59:31,604 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuRepresentanteFarmacia
2026-11-17T13:59:43.6262231Z 2026-11-17 10:59:31,604 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_REPRESENTANTE_FARMACIA)]), nuRepresentanteFarmacia, identity, , ...)
2026-11-17T13:59:43.6262594Z 2026-11-17 10:59:31,604 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ACAO_REPRESENTANTE')
2026-11-17T13:59:43.6262941Z 2026-11-17 10:59:31,604 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAcaoRepresentante with lazy=false
2026-11-17T13:59:43.6263384Z 2026-11-17 10:59:31,604 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:coUsuarioAcaoRepresentante]
2026-11-17T13:59:43.6263770Z 2026-11-17 10:59:31,604 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAcaoRepresentante
2026-11-17T13:59:43.6264113Z 2026-11-17 10:59:31,604 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.CO_USUARIO_ACAO_REPRESENTANTE
2026-11-17T13:59:43.6266771Z 2026-11-17 10:59:31,604 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAcaoRepresentante
2026-11-17T13:59:43.6267072Z 2026-11-17 10:59:31,604 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_ENDERECO_IP_REPRESENTANTE')
2026-11-17T13:59:43.6267420Z 2026-11-17 10:59:31,604 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEnderecoIpRepresentante with lazy=false
2026-11-17T13:59:43.6267861Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:deEnderecoIpRepresentante]
2026-11-17T13:59:43.6268244Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEnderecoIpRepresentante
2026-11-17T13:59:43.6268588Z 2026-11-17 10:59:31,605 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.DE_ENDERECO_IP_REPRESENTANTE
2026-11-17T13:59:43.6268904Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEnderecoIpRepresentante
2026-11-17T13:59:43.6269224Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_TIPO_ACAO')
2026-11-17T13:59:43.6269549Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icTipoAcao with lazy=false
2026-11-17T13:59:43.6269967Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:icTipoAcao]
2026-11-17T13:59:43.6270325Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icTipoAcao
2026-11-17T13:59:43.6270694Z 2026-11-17 10:59:31,605 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.IC_TIPO_ACAO
2026-11-17T13:59:43.6270990Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icTipoAcao
2026-11-17T13:59:43.6271302Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CPF_REPRESENTANTE')
2026-11-17T13:59:43.6271634Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuCpfRepresentante with lazy=false
2026-11-17T13:59:43.6272091Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:nuCpfRepresentante]
2026-11-17T13:59:43.6272459Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuCpfRepresentante
2026-11-17T13:59:43.6272788Z 2026-11-17 10:59:31,605 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.NU_CPF_REPRESENTANTE
2026-11-17T13:59:43.6273104Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuCpfRepresentante
2026-11-17T13:59:43.6273427Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_FIM_VIGENCIA_RPRSE')
2026-11-17T13:59:43.6273764Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsFimVigenciaRprse with lazy=false
2026-11-17T13:59:43.6274152Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:tsFimVigenciaRprse]
2026-11-17T13:59:43.6274592Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsFimVigenciaRprse
2026-11-17T13:59:43.6274920Z 2026-11-17 10:59:31,605 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.TS_FIM_VIGENCIA_RPRSE
2026-11-17T13:59:43.6275224Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsFimVigenciaRprse
2026-11-17T13:59:43.6275546Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_VIGENCIA_RPRSE')
2026-11-17T13:59:43.6275881Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioVigenciaRprse with lazy=false
2026-11-17T13:59:43.6276308Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentanteFarmacia:tsInicioVigenciaRprse]
2026-11-17T13:59:43.6276680Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioVigenciaRprse
2026-11-17T13:59:43.6277012Z 2026-11-17 10:59:31,605 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB010_RPRSE_FARMACIA.TS_INICIO_VIGENCIA_RPRSE
2026-11-17T13:59:43.6277323Z 2026-11-17 10:59:31,605 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioVigenciaRprse
2026-11-17T13:59:43.6277666Z 2026-11-17 10:59:31,605 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-11-17T13:59:43.6278023Z 2026-11-17 10:59:31,606 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.ControleDocumento
2026-11-17T13:59:43.6278342Z 2026-11-17 10:59:31,606 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name ControleDocumento
2026-11-17T13:59:43.6278687Z 2026-11-17 10:59:31,606 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.ControleDocumento on table FAPTB014_CONTROLE_DOCUMENTO
2026-11-17T13:59:43.6279066Z 2026-11-17 10:59:31,607 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-11-17T13:59:43.6279396Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CONTROLE_DOCUMENTO')
2026-11-17T13:59:43.6279760Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.ControleDocumento] is safe
2026-11-17T13:59:43.6280207Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.ControleDocumento
2026-11-17T13:59:43.6280577Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuControleDocumento with lazy=false
2026-11-17T13:59:43.6280998Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:nuControleDocumento]
2026-11-17T13:59:43.6281361Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuControleDocumento
2026-11-17T13:59:43.6281692Z 2026-11-17 10:59:31,608 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.NU_CONTROLE_DOCUMENTO
2026-11-17T13:59:43.6281969Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuControleDocumento
2026-11-17T13:59:43.6282319Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_CONTROLE_DOCUMENTO)]), nuControleDocumento, identity, , ...)
2026-11-17T13:59:43.6282664Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_ENVIO_DOCUMENTO')
2026-11-17T13:59:43.6282995Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhEnvioDocumento with lazy=false
2026-11-17T13:59:43.6283416Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:dhEnvioDocumento]
2026-11-17T13:59:43.6283778Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhEnvioDocumento
2026-11-17T13:59:43.6284103Z 2026-11-17 10:59:31,608 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.DH_ENVIO_DOCUMENTO
2026-11-17T13:59:43.6284490Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhEnvioDocumento
2026-11-17T13:59:43.6284799Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_FARMACIA')
2026-11-17T13:59:43.6285104Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6285385Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property farmacia
2026-11-17T13:59:43.6285696Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_DOCUMENTO_LOCAL')
2026-11-17T13:59:43.6286025Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icDocumentoLocal with lazy=false
2026-11-17T13:59:43.6286446Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:icDocumentoLocal]
2026-11-17T13:59:43.6286813Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icDocumentoLocal
2026-11-17T13:59:43.6287182Z 2026-11-17 10:59:31,608 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.IC_DOCUMENTO_LOCAL
2026-11-17T13:59:43.6287495Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icDocumentoLocal
2026-11-17T13:59:43.6287801Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_FARMACEUTICO')
2026-11-17T13:59:43.6288093Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuFarmaceutico with lazy=false
2026-11-17T13:59:43.6288544Z 2026-11-17 10:59:31,608 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:nuFarmaceutico]
2026-11-17T13:59:43.6288906Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuFarmaceutico
2026-11-17T13:59:43.6289232Z 2026-11-17 10:59:31,609 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.NU_FARMACEUTICO
2026-11-17T13:59:43.6289532Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuFarmaceutico
2026-11-17T13:59:43.6289836Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_FARMACIA')
2026-11-17T13:59:43.6290157Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuFarmacia with lazy=false
2026-11-17T13:59:43.6290574Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:nuFarmacia]
2026-11-17T13:59:43.6290924Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuFarmacia
2026-11-17T13:59:43.6291247Z 2026-11-17 10:59:31,609 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.NU_FARMACIA
2026-11-17T13:59:43.6291540Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuFarmacia
2026-11-17T13:59:43.6291859Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_REPRESENTANTE_FARMACIA')
2026-11-17T13:59:43.6292196Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuRepresentanteFarmacia with lazy=false
2026-11-17T13:59:43.6292618Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:nuRepresentanteFarmacia]
2026-11-17T13:59:43.6293011Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuRepresentanteFarmacia
2026-11-17T13:59:43.6293352Z 2026-11-17 10:59:31,609 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.NU_REPRESENTANTE_FARMACIA
2026-11-17T13:59:43.6293671Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuRepresentanteFarmacia
2026-11-17T13:59:43.6293983Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DOCUMENTO')
2026-11-17T13:59:43.6294418Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDocumento with lazy=false
2026-11-17T13:59:43.6294847Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ControleDocumento:nuTipoDocumento]
2026-11-17T13:59:43.6295208Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDocumento
2026-11-17T13:59:43.6295543Z 2026-11-17 10:59:31,609 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB014_CONTROLE_DOCUMENTO.NU_TIPO_DOCUMENTO
2026-11-17T13:59:43.6295850Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDocumento
2026-11-17T13:59:43.6296209Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_TIPO_DOCUMENTO',referencedColumn='NU_TIPO_DOCUMENTO')
2026-11-17T13:59:43.6296534Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6296863Z 2026-11-17 10:59:31,609 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tipoDocumento
2026-11-17T13:59:43.6297210Z 2026-11-17 10:59:31,609 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-11-17T13:59:43.6297580Z 2026-11-17 10:59:31,610 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.TipoSituacaoFarmacia
2026-11-17T13:59:43.6297900Z 2026-11-17 10:59:31,611 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name TipoSituacaoFarmacia
2026-11-17T13:59:43.6298255Z 2026-11-17 10:59:31,611 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.TipoSituacaoFarmacia on table FAPTB003_TIPO_STCO_FARMACIA
2026-11-17T13:59:43.6298600Z 2026-11-17 10:59:31,611 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-11-17T13:59:43.6298934Z 2026-11-17 10:59:31,612 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_SITUACAO_FARMACIA')
2026-11-17T13:59:43.6299294Z 2026-11-17 10:59:31,612 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoSituacaoFarmacia] is safe
2026-11-17T13:59:43.6299722Z 2026-11-17 10:59:31,612 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoSituacaoFarmacia
2026-11-17T13:59:43.6300094Z 2026-11-17 10:59:31,612 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoSituacaoFarmacia with lazy=false
2026-11-17T13:59:43.6300524Z 2026-11-17 10:59:31,612 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoSituacaoFarmacia:nuTipoSituacaoFarmacia]
2026-11-17T13:59:43.6300901Z 2026-11-17 10:59:31,612 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoSituacaoFarmacia
2026-11-17T13:59:43.6301242Z 2026-11-17 10:59:31,612 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB003_TIPO_STCO_FARMACIA.NU_TIPO_SITUACAO_FARMACIA
2026-11-17T13:59:43.6301558Z 2026-11-17 10:59:31,612 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoSituacaoFarmacia
2026-11-17T13:59:43.6301882Z 2026-11-17 10:59:31,612 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_TIPO_SITUACAO_FARMACIA')
2026-11-17T13:59:43.6302218Z 2026-11-17 10:59:31,612 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deTipoSituacaoFarmacia with lazy=false
2026-11-17T13:59:43.6302619Z 2026-11-17 10:59:31,612 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoSituacaoFarmacia:deTipoSituacaoFarmacia]
2026-11-17T13:59:43.6302997Z 2026-11-17 10:59:31,612 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deTipoSituacaoFarmacia
2026-11-17T13:59:43.6303334Z 2026-11-17 10:59:31,612 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB003_TIPO_STCO_FARMACIA.DE_TIPO_SITUACAO_FARMACIA
2026-11-17T13:59:43.6303678Z 2026-11-17 10:59:31,612 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deTipoSituacaoFarmacia
2026-11-17T13:59:43.6304028Z 2026-11-17 10:59:31,612 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-11-17T13:59:43.6304513Z 2026-11-17 10:59:31,613 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.TipoDocumentoItemValidacao
2026-11-17T13:59:43.6304904Z 2026-11-17 10:59:31,613 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name TipoDocumentoItemValidacao
2026-11-17T13:59:43.6305312Z 2026-11-17 10:59:31,613 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.TipoDocumentoItemValidacao on table FAPTB017_TIPO_DCMTO_ITM_VLDCO
2026-11-17T13:59:43.6305664Z 2026-11-17 10:59:31,613 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-11-17T13:59:43.6305999Z 2026-11-17 10:59:31,614 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DCMTO_ITM_VLDCO')
2026-11-17T13:59:43.6306386Z 2026-11-17 10:59:31,614 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao] is safe
2026-11-17T13:59:43.6306811Z 2026-11-17 10:59:31,614 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoDocumentoItemValidacao
2026-11-17T13:59:43.6307195Z 2026-11-17 10:59:31,614 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDcmtoItmVldco with lazy=false
2026-11-17T13:59:43.6307634Z 2026-11-17 10:59:31,614 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao:nuTipoDcmtoItmVldco]
2026-11-17T13:59:43.6308011Z 2026-11-17 10:59:31,614 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDcmtoItmVldco
2026-11-17T13:59:43.6308347Z 2026-11-17 10:59:31,614 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB017_TIPO_DCMTO_ITM_VLDCO.NU_TIPO_DCMTO_ITM_VLDCO
2026-11-17T13:59:43.6308660Z 2026-11-17 10:59:31,614 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDcmtoItmVldco
2026-11-17T13:59:43.6308981Z 2026-11-17 10:59:31,614 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_JUSTIFICATIVA_PADRAO')
2026-11-17T13:59:43.6309325Z 2026-11-17 10:59:31,614 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deJustificativaPadrao with lazy=false
2026-11-17T13:59:43.6309758Z 2026-11-17 10:59:31,614 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao:deJustificativaPadrao]
2026-11-17T13:59:43.6310133Z 2026-11-17 10:59:31,614 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deJustificativaPadrao
2026-11-17T13:59:43.6310469Z 2026-11-17 10:59:31,614 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB017_TIPO_DCMTO_ITM_VLDCO.DE_JUSTIFICATIVA_PADRAO
2026-11-17T13:59:43.6310783Z 2026-11-17 10:59:31,614 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deJustificativaPadrao
2026-11-17T13:59:43.6311133Z 2026-11-17 10:59:31,614 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_ITEM_VALIDACAO',referencedColumn='NU_ITEM_VALIDACAO')
2026-11-17T13:59:43.6311455Z 2026-11-17 10:59:31,614 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6311708Z 2026-11-17 10:59:31,615 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property itemValidacao
2026-11-17T13:59:43.6312052Z 2026-11-17 10:59:31,615 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_ITEM_VALIDACAO')
2026-11-17T13:59:43.6312379Z 2026-11-17 10:59:31,615 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuItemValidacao with lazy=false
2026-11-17T13:59:43.6312805Z 2026-11-17 10:59:31,615 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao:nuItemValidacao]
2026-11-17T13:59:43.6313197Z 2026-11-17 10:59:31,615 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuItemValidacao
2026-11-17T13:59:43.6313520Z 2026-11-17 10:59:31,615 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB017_TIPO_DCMTO_ITM_VLDCO.NU_ITEM_VALIDACAO
2026-11-17T13:59:43.6313823Z 2026-11-17 10:59:31,615 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuItemValidacao
2026-11-17T13:59:43.6314137Z 2026-11-17 10:59:31,615 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_DOCUMENTO')
2026-11-17T13:59:43.6314526Z 2026-11-17 10:59:31,615 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoDocumento with lazy=false
2026-11-17T13:59:43.6314956Z 2026-11-17 10:59:31,615 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao:nuTipoDocumento]
2026-11-17T13:59:43.6315327Z 2026-11-17 10:59:31,615 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoDocumento
2026-11-17T13:59:43.6315655Z 2026-11-17 10:59:31,615 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB017_TIPO_DCMTO_ITM_VLDCO.NU_TIPO_DOCUMENTO
2026-11-17T13:59:43.6315961Z 2026-11-17 10:59:31,615 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoDocumento
2026-11-17T13:59:43.6316318Z 2026-11-17 10:59:31,615 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_TIPO_DOCUMENTO',referencedColumn='NU_TIPO_DOCUMENTO')
2026-11-17T13:59:43.6316640Z 2026-11-17 10:59:31,615 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6316928Z 2026-11-17 10:59:31,615 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tipoDocumento
2026-11-17T13:59:43.6317266Z 2026-11-17 10:59:31,615 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-11-17T13:59:43.6317615Z 2026-11-17 10:59:31,616 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.Farmacia
2026-11-17T13:59:43.6317884Z 2026-11-17 10:59:31,616 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name Farmacia
2026-11-17T13:59:43.6318207Z 2026-11-17 10:59:31,617 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.Farmacia on table FAPTB001_FARMACIA
2026-11-17T13:59:43.6318538Z 2026-11-17 10:59:31,617 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-11-17T13:59:43.6318858Z 2026-11-17 10:59:31,621 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_FARMACIA')
2026-11-17T13:59:43.6319201Z 2026-11-17 10:59:31,621 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.Farmacia] is safe
2026-11-17T13:59:43.6319612Z 2026-11-17 10:59:31,621 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.Farmacia
2026-11-17T13:59:43.6319969Z 2026-11-17 10:59:31,621 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuFarmacia with lazy=false
2026-11-17T13:59:43.6320420Z 2026-11-17 10:59:31,621 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuFarmacia]
2026-11-17T13:59:43.6320769Z 2026-11-17 10:59:31,621 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuFarmacia
2026-11-17T13:59:43.6321077Z 2026-11-17 10:59:31,621 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_FARMACIA
2026-11-17T13:59:43.6321368Z 2026-11-17 10:59:31,621 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuFarmacia
2026-11-17T13:59:43.6321734Z 2026-11-17 10:59:31,621 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_FARMACIA)]), nuFarmacia, identity, , ...)
2026-11-17T13:59:43.6322087Z 2026-11-17 10:59:31,621 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_CNPJ_ESTABELECIMENTO_LEGADO')
2026-11-17T13:59:43.6322435Z 2026-11-17 10:59:31,621 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coCnpjEstabelecimentoLegado with lazy=false
2026-11-17T13:59:43.6322856Z 2026-11-17 10:59:31,621 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:coCnpjEstabelecimentoLegado]
2026-11-17T13:59:43.6323234Z 2026-11-17 10:59:31,621 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coCnpjEstabelecimentoLegado
2026-11-17T13:59:43.6323567Z 2026-11-17 10:59:31,621 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.CO_CNPJ_ESTABELECIMENTO_LEGADO
2026-11-17T13:59:43.6323885Z 2026-11-17 10:59:31,621 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coCnpjEstabelecimentoLegado
2026-11-17T13:59:43.6324282Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_LICENCA_FUNCIONAMENTO')
2026-11-17T13:59:43.6324642Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coLicencaFuncionamento with lazy=false
2026-11-17T13:59:43.6325024Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:coLicencaFuncionamento]
2026-11-17T13:59:43.6325393Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coLicencaFuncionamento
2026-11-17T13:59:43.6325723Z 2026-11-17 10:59:31,622 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.CO_LICENCA_FUNCIONAMENTO
2026-11-17T13:59:43.6326156Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coLicencaFuncionamento
2026-11-17T13:59:43.6326481Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_PROCESSO_SEI')
2026-11-17T13:59:43.6326813Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coProcessoSei with lazy=false
2026-11-17T13:59:43.6327217Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:coProcessoSei]
2026-11-17T13:59:43.6327573Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coProcessoSei
2026-11-17T13:59:43.6327888Z 2026-11-17 10:59:31,622 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.CO_PROCESSO_SEI
2026-11-17T13:59:43.6328190Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coProcessoSei
2026-11-17T13:59:43.6328512Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ACAO_FARMACIA')
2026-11-17T13:59:43.6328928Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAcaoFarmacia with lazy=false
2026-11-17T13:59:43.6329341Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:coUsuarioAcaoFarmacia]
2026-11-17T13:59:43.6329711Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAcaoFarmacia
2026-11-17T13:59:43.6330072Z 2026-11-17 10:59:31,622 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.CO_USUARIO_ACAO_FARMACIA
2026-11-17T13:59:43.6330387Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAcaoFarmacia
2026-11-17T13:59:43.6330702Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_EMAIL_FARMACIA')
2026-11-17T13:59:43.6331036Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEmailFarmacia with lazy=false
2026-11-17T13:59:43.6331444Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:deEmailFarmacia]
2026-11-17T13:59:43.6331804Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEmailFarmacia
2026-11-17T13:59:43.6332087Z 2026-11-17 10:59:31,622 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.DE_EMAIL_FARMACIA
2026-11-17T13:59:43.6332385Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEmailFarmacia
2026-11-17T13:59:43.6332701Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_ENDERECO_IP_FARMACIA')
2026-11-17T13:59:43.6333040Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEnderecoIpFarmacia with lazy=false
2026-11-17T13:59:43.6333449Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:deEnderecoIpFarmacia]
2026-11-17T13:59:43.6333819Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEnderecoIpFarmacia
2026-11-17T13:59:43.6334148Z 2026-11-17 10:59:31,622 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.DE_ENDERECO_IP_FARMACIA
2026-11-17T13:59:43.6334579Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEnderecoIpFarmacia
2026-11-17T13:59:43.6334906Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_ATUALIZACAO_FARMACIA')
2026-11-17T13:59:43.6335251Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhAtualizacaoFarmacia with lazy=false
2026-11-17T13:59:43.6335672Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:dhAtualizacaoFarmacia]
2026-11-17T13:59:43.6336040Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhAtualizacaoFarmacia
2026-11-17T13:59:43.6336366Z 2026-11-17 10:59:31,622 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.DH_ATUALIZACAO_FARMACIA
2026-11-17T13:59:43.6336679Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhAtualizacaoFarmacia
2026-11-17T13:59:43.6337011Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_SUBMISSAO_SLCTO_CADASTRO')
2026-11-17T13:59:43.6337416Z 2026-11-17 10:59:31,622 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhSubmissaoSlctoCadastro with lazy=false
2026-11-17T13:59:43.6337845Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:dhSubmissaoSlctoCadastro]
2026-11-17T13:59:43.6338217Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhSubmissaoSlctoCadastro
2026-11-17T13:59:43.6338587Z 2026-11-17 10:59:31,623 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.DH_SUBMISSAO_SLCTO_CADASTRO
2026-11-17T13:59:43.6338899Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhSubmissaoSlctoCadastro
2026-11-17T13:59:43.6339185Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_VENCIMENTO_CND')
2026-11-17T13:59:43.6339522Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtVencimentoCnd with lazy=false
2026-11-17T13:59:43.6339928Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:dtVencimentoCnd]
2026-11-17T13:59:43.6340290Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtVencimentoCnd
2026-11-17T13:59:43.6340611Z 2026-11-17 10:59:31,623 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.DT_VENCIMENTO_CND
2026-11-17T13:59:43.6340915Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtVencimentoCnd
2026-11-17T13:59:43.6341336Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_VNCMO_LICENCA_FNCMO')
2026-11-17T13:59:43.6341782Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtVencimentoLicencaFncmo with lazy=false
2026-11-17T13:59:43.6342209Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:dtVencimentoLicencaFncmo]
2026-11-17T13:59:43.6342583Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtVencimentoLicencaFncmo
2026-11-17T13:59:43.6342918Z 2026-11-17 10:59:31,623 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.DT_VNCMO_LICENCA_FNCMO
2026-11-17T13:59:43.6343227Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtVencimentoLicencaFncmo
2026-11-17T13:59:43.6343553Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_FARMACIA_MATRIZ')
2026-11-17T13:59:43.6343861Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6344156Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property farmaciaMatriz
2026-11-17T13:59:43.6344625Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_EFETUA_VENDA')
2026-11-17T13:59:43.6344960Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icEfetuaVenda with lazy=false
2026-11-17T13:59:43.6345364Z 2026-11-17 10:59:31,623 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:icEfetuaVenda]
2026-11-17T13:59:43.6345751Z 2026-11-17 10:59:31,650 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icEfetuaVenda
2026-11-17T13:59:43.6346064Z 2026-11-17 10:59:31,650 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.IC_EFETUA_VENDA
2026-11-17T13:59:43.6346365Z 2026-11-17 10:59:31,650 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icEfetuaVenda
2026-11-17T13:59:43.6346692Z 2026-11-17 10:59:31,651 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_EMISSAO_FISCAL_ELETRONICO')
2026-11-17T13:59:43.6347136Z 2026-11-17 10:59:31,651 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icEmissaoFiscalEletronico with lazy=false
2026-11-17T13:59:43.6347695Z 2026-11-17 10:59:31,651 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:icEmissaoFiscalEletronico]
2026-11-17T13:59:43.6348074Z 2026-11-17 10:59:31,651 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icEmissaoFiscalEletronico
2026-11-17T13:59:43.6348410Z 2026-11-17 10:59:31,651 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.IC_EMISSAO_FISCAL_ELETRONICO
2026-11-17T13:59:43.6348727Z 2026-11-17 10:59:31,651 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icEmissaoFiscalEletronico
2026-11-17T13:59:43.6349040Z 2026-11-17 10:59:31,651 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_TIPO_ACAO')
2026-11-17T13:59:43.6349362Z 2026-11-17 10:59:31,651 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icTipoAcao with lazy=false
2026-11-17T13:59:43.6349759Z 2026-11-17 10:59:31,651 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:icTipoAcao]
2026-11-17T13:59:43.6350114Z 2026-11-17 10:59:31,651 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icTipoAcao
2026-11-17T13:59:43.6350431Z 2026-11-17 10:59:31,651 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.IC_TIPO_ACAO
2026-11-17T13:59:43.6350732Z 2026-11-17 10:59:31,651 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icTipoAcao
2026-11-17T13:59:43.6351058Z 2026-11-17 10:59:31,651 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NO_TITULARIDADE_CONTA_CREDITO')
2026-11-17T13:59:43.6351550Z 2026-11-17 10:59:31,651 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property noTitularidadeContaCredito with lazy=false
2026-11-17T13:59:43.6352139Z 2026-11-17 10:59:31,651 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:noTitularidadeContaCredito]
2026-11-17T13:59:43.6352634Z 2026-11-17 10:59:31,651 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for noTitularidadeContaCredito
2026-11-17T13:59:43.6353086Z 2026-11-17 10:59:31,651 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NO_TITULARIDADE_CONTA_CREDITO
2026-11-17T13:59:43.6353484Z 2026-11-17 10:59:31,651 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property noTitularidadeContaCredito
2026-11-17T13:59:43.6353903Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_AGENCIA')
2026-11-17T13:59:43.6354438Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuAgencia with lazy=false
2026-11-17T13:59:43.6354998Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuAgencia]
2026-11-17T13:59:43.6355504Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuAgencia
2026-11-17T13:59:43.6356045Z 2026-11-17 10:59:31,652 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_AGENCIA
2026-11-17T13:59:43.6356456Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuAgencia
2026-11-17T13:59:43.6356866Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_BANCO')
2026-11-17T13:59:43.6357289Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuBanco with lazy=false
2026-11-17T13:59:43.6357888Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuBanco]
2026-11-17T13:59:43.6358392Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuBanco
2026-11-17T13:59:43.6358718Z 2026-11-17 10:59:31,652 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_BANCO
2026-11-17T13:59:43.6359009Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuBanco
2026-11-17T13:59:43.6359320Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CNPJ_ESTABELECIMENTO')
2026-11-17T13:59:43.6359661Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuCnpjEstabelecimento with lazy=false
2026-11-17T13:59:43.6360079Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuCnpjEstabelecimento]
2026-11-17T13:59:43.6360450Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuCnpjEstabelecimento
2026-11-17T13:59:43.6360746Z 2026-11-17 10:59:31,652 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_CNPJ_ESTABELECIMENTO
2026-11-17T13:59:43.6361058Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuCnpjEstabelecimento
2026-11-17T13:59:43.6361369Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CONTA')
2026-11-17T13:59:43.6361686Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuConta with lazy=false
2026-11-17T13:59:43.6362084Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuConta]
2026-11-17T13:59:43.6362432Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuConta
2026-11-17T13:59:43.6362738Z 2026-11-17 10:59:31,652 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_CONTA
2026-11-17T13:59:43.6363026Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuConta
2026-11-17T13:59:43.6363344Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_DDD_ALTERNATIVO')
2026-11-17T13:59:43.6363677Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuDddAlternativo with lazy=false
2026-11-17T13:59:43.6364087Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuDddAlternativo]
2026-11-17T13:59:43.6364580Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuDddAlternativo
2026-11-17T13:59:43.6364905Z 2026-11-17 10:59:31,652 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_DDD_ALTERNATIVO
2026-11-17T13:59:43.6365292Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuDddAlternativo
2026-11-17T13:59:43.6365604Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_DDD_PRINCIPAL')
2026-11-17T13:59:43.6365936Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuDddPrincipal with lazy=false
2026-11-17T13:59:43.6366418Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuDddPrincipal]
2026-11-17T13:59:43.6366819Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuDddPrincipal
2026-11-17T13:59:43.6367102Z 2026-11-17 10:59:31,652 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_DDD_PRINCIPAL
2026-11-17T13:59:43.6367401Z 2026-11-17 10:59:31,652 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuDddPrincipal
2026-11-17T13:59:43.6367713Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_DV_AGENCIA')
2026-11-17T13:59:43.6368037Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuDvAgencia with lazy=false
2026-11-17T13:59:43.6368438Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuDvAgencia]
2026-11-17T13:59:43.6368799Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuDvAgencia
2026-11-17T13:59:43.6369109Z 2026-11-17 10:59:31,653 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_DV_AGENCIA
2026-11-17T13:59:43.6369402Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuDvAgencia
2026-11-17T13:59:43.6369708Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_DV_CONTA')
2026-11-17T13:59:43.6370031Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuDvConta with lazy=false
2026-11-17T13:59:43.6370424Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuDvConta]
2026-11-17T13:59:43.6370780Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuDvConta
2026-11-17T13:59:43.6371084Z 2026-11-17 10:59:31,653 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_DV_CONTA
2026-11-17T13:59:43.6371375Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuDvConta
2026-11-17T13:59:43.6371685Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_IBGE_MUNICIPIO')
2026-11-17T13:59:43.6372017Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuIbgeMunicipio with lazy=false
2026-11-17T13:59:43.6372422Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuIbgeMunicipio]
2026-11-17T13:59:43.6372958Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuIbgeMunicipio
2026-11-17T13:59:43.6373307Z 2026-11-17 10:59:31,653 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_IBGE_MUNICIPIO
2026-11-17T13:59:43.6373608Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuIbgeMunicipio
2026-11-17T13:59:43.6373981Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_INSCRICAO_INSS')
2026-11-17T13:59:43.6374385Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuInscricaoInss with lazy=false
2026-11-17T13:59:43.6374799Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuInscricaoInss]
2026-11-17T13:59:43.6375208Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuInscricaoInss
2026-11-17T13:59:43.6375521Z 2026-11-17 10:59:31,653 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_INSCRICAO_INSS
2026-11-17T13:59:43.6375821Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuInscricaoInss
2026-11-17T13:59:43.6376150Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_REGISTRO_JUNTA_COMERCIAL')
2026-11-17T13:59:43.6376497Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuRegistroJuntaComercial with lazy=false
2026-11-17T13:59:43.6376919Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuRegistroJuntaComercial]
2026-11-17T13:59:43.6377304Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuRegistroJuntaComercial
2026-11-17T13:59:43.6377639Z 2026-11-17 10:59:31,653 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_REGISTRO_JUNTA_COMERCIAL
2026-11-17T13:59:43.6377955Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuRegistroJuntaComercial
2026-11-17T13:59:43.6378281Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TELEFONE_ALTERNATIVO')
2026-11-17T13:59:43.6378615Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTelefoneAlternativo with lazy=false
2026-11-17T13:59:43.6379024Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuTelefoneAlternativo]
2026-11-17T13:59:43.6379397Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTelefoneAlternativo
2026-11-17T13:59:43.6379721Z 2026-11-17 10:59:31,653 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_TELEFONE_ALTERNATIVO
2026-11-17T13:59:43.6380001Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTelefoneAlternativo
2026-11-17T13:59:43.6380334Z 2026-11-17 10:59:31,653 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TELEFONE_PRINCIPAL')
2026-11-17T13:59:43.6380667Z 2026-11-17 10:59:31,654 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTelefonePrincipal with lazy=false
2026-11-17T13:59:43.6381076Z 2026-11-17 10:59:31,654 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuTelefonePrincipal]
2026-11-17T13:59:43.6381443Z 2026-11-17 10:59:31,654 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTelefonePrincipal
2026-11-17T13:59:43.6381763Z 2026-11-17 10:59:31,654 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_TELEFONE_PRINCIPAL
2026-11-17T13:59:43.6382121Z 2026-11-17 10:59:31,654 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTelefonePrincipal
2026-11-17T13:59:43.6382435Z 2026-11-17 10:59:31,654 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TIPO_CONTA')
2026-11-17T13:59:43.6382760Z 2026-11-17 10:59:31,654 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuTipoConta with lazy=false
2026-11-17T13:59:43.6383164Z 2026-11-17 10:59:31,654 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:nuTipoConta]
2026-11-17T13:59:43.6383547Z 2026-11-17 10:59:31,654 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuTipoConta
2026-11-17T13:59:43.6383856Z 2026-11-17 10:59:31,654 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.NU_TIPO_CONTA
2026-11-17T13:59:43.6384154Z 2026-11-17 10:59:31,654 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuTipoConta
2026-11-17T13:59:43.6384507Z 2026-11-17 10:59:31,654 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-11-17T13:59:43.6384800Z 2026-11-17 10:59:31,654 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6385112Z 2026-11-17 10:59:31,655 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: IndexColumn(column='representacoes_ORDER')
2026-11-17T13:59:43.6385419Z 2026-11-17 10:59:31,655 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6385700Z 2026-11-17 10:59:31,655 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='representacoes_KEY')
2026-11-17T13:59:43.6386026Z 2026-11-17 10:59:31,655 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='representacoes_KEY')
2026-11-17T13:59:43.6386338Z 2026-11-17 10:59:31,655 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-11-17T13:59:43.6386640Z 2026-11-17 10:59:31,655 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-11-17T13:59:43.6386973Z 2026-11-17 10:59:31,656 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Collection role: br.com.caixa.sifap.entity.Farmacia.representacoes
2026-11-17T13:59:43.6387282Z 2026-11-17 10:59:31,656 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property representacoes
2026-11-17T13:59:43.6387579Z 2026-11-17 10:59:31,656 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-11-17T13:59:43.6387874Z 2026-11-17 10:59:31,656 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6388193Z 2026-11-17 10:59:31,656 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: IndexColumn(column='representacoesTecnica_ORDER')
2026-11-17T13:59:43.6388508Z 2026-11-17 10:59:31,656 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6388833Z 2026-11-17 10:59:31,656 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='representacoesTecnica_KEY')
2026-11-17T13:59:43.6389172Z 2026-11-17 10:59:31,656 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='representacoesTecnica_KEY')
2026-11-17T13:59:43.6389484Z 2026-11-17 10:59:31,656 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-11-17T13:59:43.6389773Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-11-17T13:59:43.6390116Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Collection role: br.com.caixa.sifap.entity.Farmacia.representacoesTecnica
2026-11-17T13:59:43.6390433Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property representacoesTecnica
2026-11-17T13:59:43.6390792Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='SG_UF_FARMACIA')
2026-11-17T13:59:43.6391119Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property sgUfFarmacia with lazy=false
2026-11-17T13:59:43.6391525Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:sgUfFarmacia]
2026-11-17T13:59:43.6391884Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for sgUfFarmacia
2026-11-17T13:59:43.6392252Z 2026-11-17 10:59:31,657 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.SG_UF_FARMACIA
2026-11-17T13:59:43.6392549Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property sgUfFarmacia
2026-11-17T13:59:43.6392842Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-11-17T13:59:43.6393134Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6393447Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: IndexColumn(column='situacoes_ORDER')
2026-11-17T13:59:43.6393744Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6394050Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='situacoes_KEY')
2026-11-17T13:59:43.6394442Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='situacoes_KEY')
2026-11-17T13:59:43.6394750Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-11-17T13:59:43.6395044Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn()
2026-11-17T13:59:43.6395369Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Collection role: br.com.caixa.sifap.entity.Farmacia.situacoes
2026-11-17T13:59:43.6395665Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property situacoes
2026-11-17T13:59:43.6395952Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_FIM_VIGENCIA_FARMACIA')
2026-11-17T13:59:43.6396374Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsFimVigenciaFarmacia with lazy=false
2026-11-17T13:59:43.6396789Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:tsFimVigenciaFarmacia]
2026-11-17T13:59:43.6397163Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsFimVigenciaFarmacia
2026-11-17T13:59:43.6397490Z 2026-11-17 10:59:31,657 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.TS_FIM_VIGENCIA_FARMACIA
2026-11-17T13:59:43.6397800Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsFimVigenciaFarmacia
2026-11-17T13:59:43.6398131Z 2026-11-17 10:59:31,657 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_VIGENCIA_FARMACIA')
2026-11-17T13:59:43.6398478Z 2026-11-17 10:59:31,658 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioVigenciaFarmacia with lazy=false
2026-11-17T13:59:43.6398925Z 2026-11-17 10:59:31,658 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.Farmacia:tsInicioVigenciaFarmacia]
2026-11-17T13:59:43.6399378Z 2026-11-17 10:59:31,658 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioVigenciaFarmacia
2026-11-17T13:59:43.6399709Z 2026-11-17 10:59:31,658 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB001_FARMACIA.TS_INICIO_VIGENCIA_FARMACIA
2026-11-17T13:59:43.6400022Z 2026-11-17 10:59:31,658 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioVigenciaFarmacia
2026-11-17T13:59:43.6400376Z 2026-11-17 10:59:31,658 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-11-17T13:59:43.6400810Z 2026-11-17 10:59:31,659 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.ItemValidacao
2026-11-17T13:59:43.6401121Z 2026-11-17 10:59:31,660 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name ItemValidacao
2026-11-17T13:59:43.6401461Z 2026-11-17 10:59:31,660 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.ItemValidacao on table FAPTB016_ITEM_VALIDACAO
2026-11-17T13:59:43.6401797Z 2026-11-17 10:59:31,660 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-11-17T13:59:43.6402125Z 2026-11-17 10:59:31,661 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_ITEM_VALIDACAO')
2026-11-17T13:59:43.6402477Z 2026-11-17 10:59:31,661 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.ItemValidacao] is safe
2026-11-17T13:59:43.6402895Z 2026-11-17 10:59:31,661 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.ItemValidacao
2026-11-17T13:59:43.6403265Z 2026-11-17 10:59:31,661 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuItemValidacao with lazy=false
2026-11-17T13:59:43.6403648Z 2026-11-17 10:59:31,661 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemValidacao:nuItemValidacao]
2026-11-17T13:59:43.6404009Z 2026-11-17 10:59:31,661 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuItemValidacao
2026-11-17T13:59:43.6404507Z 2026-11-17 10:59:31,661 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB016_ITEM_VALIDACAO.NU_ITEM_VALIDACAO
2026-11-17T13:59:43.6404813Z 2026-11-17 10:59:31,661 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuItemValidacao
2026-11-17T13:59:43.6405129Z 2026-11-17 10:59:31,661 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NO_ITEM_VALIDADO')
2026-11-17T13:59:43.6405455Z 2026-11-17 10:59:31,661 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property noItemValidado with lazy=false
2026-11-17T13:59:43.6405865Z 2026-11-17 10:59:31,661 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.ItemValidacao:noItemValidado]
2026-11-17T13:59:43.6406223Z 2026-11-17 10:59:31,661 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for noItemValidado
2026-11-17T13:59:43.6406544Z 2026-11-17 10:59:31,661 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB016_ITEM_VALIDACAO.NO_ITEM_VALIDADO
2026-11-17T13:59:43.6406845Z 2026-11-17 10:59:31,661 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property noItemValidado
2026-11-17T13:59:43.6407194Z 2026-11-17 10:59:31,661 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-11-17T13:59:43.6407561Z 2026-11-17 10:59:31,662 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.RepresentacaoTecnica
2026-11-17T13:59:43.6407929Z 2026-11-17 10:59:31,662 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name RepresentacaoTecnica
2026-11-17T13:59:43.6408281Z 2026-11-17 10:59:31,662 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.RepresentacaoTecnica on table FAPTB005_RPRSE_TECNICA
2026-11-17T13:59:43.6408626Z 2026-11-17 10:59:31,662 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-11-17T13:59:43.6408964Z 2026-11-17 10:59:31,663 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_REPRESENTACAO_TECNICA')
2026-11-17T13:59:43.6409367Z 2026-11-17 10:59:31,663 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.RepresentacaoTecnica] is safe
2026-11-17T13:59:43.6409793Z 2026-11-17 10:59:31,663 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.RepresentacaoTecnica
2026-11-17T13:59:43.6410174Z 2026-11-17 10:59:31,663 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuRepresentacaoTecnica with lazy=false
2026-11-17T13:59:43.6410606Z 2026-11-17 10:59:31,663 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:nuRepresentacaoTecnica]
2026-11-17T13:59:43.6410977Z 2026-11-17 10:59:31,663 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuRepresentacaoTecnica
2026-11-17T13:59:43.6411312Z 2026-11-17 10:59:31,664 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.NU_REPRESENTACAO_TECNICA
2026-11-17T13:59:43.6411591Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuRepresentacaoTecnica
2026-11-17T13:59:43.6411957Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_REPRESENTACAO_TECNICA)]), nuRepresentacaoTecnica, identity, , ...)
2026-11-17T13:59:43.6412322Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_USUARIO_ACAO_REPRESENTACAO')
2026-11-17T13:59:43.6412670Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coUsuarioAcaoRepresentacao with lazy=false
2026-11-17T13:59:43.6413103Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:coUsuarioAcaoRepresentacao]
2026-11-17T13:59:43.6413481Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coUsuarioAcaoRepresentacao
2026-11-17T13:59:43.6413822Z 2026-11-17 10:59:31,664 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.CO_USUARIO_ACAO_REPRESENTACAO
2026-11-17T13:59:43.6414139Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coUsuarioAcaoRepresentacao
2026-11-17T13:59:43.6414584Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_ENDERECO_IP_REPRESENTACAO')
2026-11-17T13:59:43.6414927Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deEnderecoIpRepresentacao with lazy=false
2026-11-17T13:59:43.6415369Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:deEnderecoIpRepresentacao]
2026-11-17T13:59:43.6415753Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deEnderecoIpRepresentacao
2026-11-17T13:59:43.6416142Z 2026-11-17 10:59:31,664 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.DE_ENDERECO_IP_REPRESENTACAO
2026-11-17T13:59:43.6416461Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deEnderecoIpRepresentacao
2026-11-17T13:59:43.6416786Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_FIM_REPRESENTACAO')
2026-11-17T13:59:43.6417130Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtFimRepresentacao with lazy=false
2026-11-17T13:59:43.6417590Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:dtFimRepresentacao]
2026-11-17T13:59:43.6417972Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtFimRepresentacao
2026-11-17T13:59:43.6418312Z 2026-11-17 10:59:31,664 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.DT_FIM_REPRESENTACAO
2026-11-17T13:59:43.6418759Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtFimRepresentacao
2026-11-17T13:59:43.6419158Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_INICIO_REPRESENTACAO')
2026-11-17T13:59:43.6419466Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtInicioRepresentacao with lazy=false
2026-11-17T13:59:43.6419978Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:dtInicioRepresentacao]
2026-11-17T13:59:43.6420417Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtInicioRepresentacao
2026-11-17T13:59:43.6420765Z 2026-11-17 10:59:31,664 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.DT_INICIO_REPRESENTACAO
2026-11-17T13:59:43.6421077Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtInicioRepresentacao
2026-11-17T13:59:43.6421474Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_VNCMO_CERTIDAO_REGULARIDADE')
2026-11-17T13:59:43.6421827Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtVencimentoCertidaoRegularidade with lazy=false
2026-11-17T13:59:43.6422410Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:dtVencimentoCertidaoRegularidade]
2026-11-17T13:59:43.6422845Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtVencimentoCertidaoRegularidade
2026-11-17T13:59:43.6423250Z 2026-11-17 10:59:31,664 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.DT_VNCMO_CERTIDAO_REGULARIDADE
2026-11-17T13:59:43.6423627Z 2026-11-17 10:59:31,664 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtVencimentoCertidaoRegularidade
2026-11-17T13:59:43.6424032Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_FARMACEUTICO')
2026-11-17T13:59:43.6424596Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6424896Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property farmaceutico
2026-11-17T13:59:43.6425205Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedJoinColumn(column='NU_FARMACIA')
2026-11-17T13:59:43.6425587Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn()
2026-11-17T13:59:43.6425870Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property farmacia
2026-11-17T13:59:43.6426225Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_TIPO_ACAO')
2026-11-17T13:59:43.6426561Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icTipoAcao with lazy=false
2026-11-17T13:59:43.6426996Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:icTipoAcao]
2026-11-17T13:59:43.6427362Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icTipoAcao
2026-11-17T13:59:43.6427675Z 2026-11-17 10:59:31,665 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.IC_TIPO_ACAO
2026-11-17T13:59:43.6427970Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icTipoAcao
2026-11-17T13:59:43.6428277Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_FIM_PERIODO')
2026-11-17T13:59:43.6428601Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsFimPeriodo with lazy=false
2026-11-17T13:59:43.6429021Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:tsFimPeriodo]
2026-11-17T13:59:43.6429379Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsFimPeriodo
2026-11-17T13:59:43.6429699Z 2026-11-17 10:59:31,665 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.TS_FIM_PERIODO
2026-11-17T13:59:43.6430001Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsFimPeriodo
2026-11-17T13:59:43.6430313Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='TS_INICIO_PERIODO')
2026-11-17T13:59:43.6430642Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property tsInicioPeriodo with lazy=false
2026-11-17T13:59:43.6431065Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.RepresentacaoTecnica:tsInicioPeriodo]
2026-11-17T13:59:43.6431434Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for tsInicioPeriodo
2026-11-17T13:59:43.6431753Z 2026-11-17 10:59:31,665 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB005_RPRSE_TECNICA.TS_INICIO_PERIODO
2026-11-17T13:59:43.6432051Z 2026-11-17 10:59:31,665 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property tsInicioPeriodo
2026-11-17T13:59:43.6432399Z 2026-11-17 10:59:31,665 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-11-17T13:59:43.6432756Z 2026-11-17 10:59:31,666 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.com.caixa.sifap.entity.FarmaciaAuxiliar
2026-11-17T13:59:43.6433075Z 2026-11-17 10:59:31,666 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name FarmaciaAuxiliar
2026-11-17T13:59:43.6433383Z 2026-11-17 10:59:31,666 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.com.caixa.sifap.entity.FarmaciaAuxiliar on table FAPTB012_FARMACIA_AUXILIAR
2026-11-17T13:59:43.6433815Z 2026-11-17 10:59:31,666 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-11-17T13:59:43.6434150Z 2026-11-17 10:59:31,667 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_FARMACIA_AUXILIAR')
2026-11-17T13:59:43.6434586Z 2026-11-17 10:59:31,667 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.FarmaciaAuxiliar] is safe
2026-11-17T13:59:43.6435008Z 2026-11-17 10:59:31,667 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.FarmaciaAuxiliar
2026-11-17T13:59:43.6435420Z 2026-11-17 10:59:31,667 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuFarmaciaAuxiliar with lazy=false
2026-11-17T13:59:43.6435839Z 2026-11-17 10:59:31,667 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:nuFarmaciaAuxiliar]
2026-11-17T13:59:43.6436209Z 2026-11-17 10:59:31,667 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuFarmaciaAuxiliar
2026-11-17T13:59:43.6436536Z 2026-11-17 10:59:31,667 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.NU_FARMACIA_AUXILIAR
2026-11-17T13:59:43.6436928Z 2026-11-17 10:59:31,667 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuFarmaciaAuxiliar
2026-11-17T13:59:43.6437327Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.BinderHelper] (main) #makeIdGenerator(BasicValue([Column(NU_FARMACIA_AUXILIAR)]), nuFarmaciaAuxiliar, identity, , ...)
2026-11-17T13:59:43.6437693Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_CNPJ_ESTABELECIMENTO_LEGADO')
2026-11-17T13:59:43.6438041Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coCnpjEstabelecimentoLegado with lazy=false
2026-11-17T13:59:43.6438481Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:coCnpjEstabelecimentoLegado]
2026-11-17T13:59:43.6438863Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coCnpjEstabelecimentoLegado
2026-11-17T13:59:43.6439210Z 2026-11-17 10:59:31,668 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.CO_CNPJ_ESTABELECIMENTO_LEGADO
2026-11-17T13:59:43.6439540Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coCnpjEstabelecimentoLegado
2026-11-17T13:59:43.6439865Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='CO_CNPJ_MATRIZ_LEGADO')
2026-11-17T13:59:43.6440202Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property coCnpjMatrizLegado with lazy=false
2026-11-17T13:59:43.6440618Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:coCnpjMatrizLegado]
2026-11-17T13:59:43.6440988Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for coCnpjMatrizLegado
2026-11-17T13:59:43.6441316Z 2026-11-17 10:59:31,668 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.CO_CNPJ_MATRIZ_LEGADO
2026-11-17T13:59:43.6441623Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property coCnpjMatrizLegado
2026-11-17T13:59:43.6441903Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DE_MOTIVO_BLOQUEIO')
2026-11-17T13:59:43.6442265Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property deMotivoBloqueio with lazy=false
2026-11-17T13:59:43.6442684Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:deMotivoBloqueio]
2026-11-17T13:59:43.6443050Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for deMotivoBloqueio
2026-11-17T13:59:43.6443369Z 2026-11-17 10:59:31,668 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.DE_MOTIVO_BLOQUEIO
2026-11-17T13:59:43.6443768Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property deMotivoBloqueio
2026-11-17T13:59:43.6444090Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DH_ATUALIZACAO_CADASTRO')
2026-11-17T13:59:43.6444547Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dhAtualizacaoCadastro with lazy=false
2026-11-17T13:59:43.6444975Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:dhAtualizacaoCadastro]
2026-11-17T13:59:43.6445351Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dhAtualizacaoCadastro
2026-11-17T13:59:43.6445682Z 2026-11-17 10:59:31,668 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.DH_ATUALIZACAO_CADASTRO
2026-11-17T13:59:43.6445999Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dhAtualizacaoCadastro
2026-11-17T13:59:43.6446310Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_BLOQUEIO')
2026-11-17T13:59:43.6446634Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dtBloqueio with lazy=false
2026-11-17T13:59:43.6447111Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:dtBloqueio]
2026-11-17T13:59:43.6447588Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dtBloqueio
2026-11-17T13:59:43.6447955Z 2026-11-17 10:59:31,668 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.DT_BLOQUEIO
2026-11-17T13:59:43.6448251Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dtBloqueio
2026-11-17T13:59:43.6448567Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='IC_ATUALIZACAO_CADASTRO')
2026-11-17T13:59:43.6448874Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property icAtualizacaoCadastro with lazy=false
2026-11-17T13:59:43.6449288Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:icAtualizacaoCadastro]
2026-11-17T13:59:43.6449656Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for icAtualizacaoCadastro
2026-11-17T13:59:43.6449988Z 2026-11-17 10:59:31,668 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.IC_ATUALIZACAO_CADASTRO
2026-11-17T13:59:43.6450301Z 2026-11-17 10:59:31,668 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property icAtualizacaoCadastro
2026-11-17T13:59:43.6450624Z 2026-11-17 10:59:31,669 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CNPJ_ESTABELECIMENTO')
2026-11-17T13:59:43.6451013Z 2026-11-17 10:59:31,669 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuCnpjEstabelecimento with lazy=false
2026-11-17T13:59:43.6451430Z 2026-11-17 10:59:31,669 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:nuCnpjEstabelecimento]
2026-11-17T13:59:43.6451799Z 2026-11-17 10:59:31,669 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuCnpjEstabelecimento
2026-11-17T13:59:43.6452129Z 2026-11-17 10:59:31,669 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.NU_CNPJ_ESTABELECIMENTO
2026-11-17T13:59:43.6452483Z 2026-11-17 10:59:31,669 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuCnpjEstabelecimento
2026-11-17T13:59:43.6452795Z 2026-11-17 10:59:31,669 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CNPJ_MATRIZ')
2026-11-17T13:59:43.6453120Z 2026-11-17 10:59:31,669 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuCnpjMatriz with lazy=false
2026-11-17T13:59:43.6453527Z 2026-11-17 10:59:31,669 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:nuCnpjMatriz]
2026-11-17T13:59:43.6453884Z 2026-11-17 10:59:31,669 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuCnpjMatriz
2026-11-17T13:59:43.6454257Z 2026-11-17 10:59:31,669 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.NU_CNPJ_MATRIZ
2026-11-17T13:59:43.6454570Z 2026-11-17 10:59:31,669 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuCnpjMatriz
2026-11-17T13:59:43.6454881Z 2026-11-17 10:59:31,669 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_MOTIVO_BLOQUEIO')
2026-11-17T13:59:43.6455209Z 2026-11-17 10:59:31,669 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nuMotivoBloqueio with lazy=false
2026-11-17T13:59:43.6455621Z 2026-11-17 10:59:31,669 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.com.caixa.sifap.entity.FarmaciaAuxiliar:nuMotivoBloqueio]
2026-11-17T13:59:43.6455949Z 2026-11-17 10:59:31,669 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nuMotivoBloqueio
2026-11-17T13:59:43.6456280Z 2026-11-17 10:59:31,669 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: FAPTB012_FARMACIA_AUXILIAR.NU_MOTIVO_BLOQUEIO
2026-11-17T13:59:43.6456582Z 2026-11-17 10:59:31,669 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nuMotivoBloqueio
2026-11-17T13:59:43.6456922Z 2026-11-17 10:59:31,669 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.com.caixa.sifap.entity
2026-11-17T13:59:43.6457271Z 2026-11-17 10:59:31,671 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuSituacaoFarmacia
2026-11-17T13:59:43.6457608Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAcaoSituacao
2026-11-17T13:59:43.6457950Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAlteracaoSituacao
2026-11-17T13:59:43.6458293Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deJustificativaSituacao
2026-11-17T13:59:43.6458631Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhSituacaoFarmacia
2026-11-17T13:59:43.6458965Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icRenovacao
2026-11-17T13:59:43.6459353Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuMotivoBloqueio
2026-11-17T13:59:43.6459684Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoSituacao
2026-11-17T13:59:43.6460010Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDocumento
2026-11-17T13:59:43.6460347Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coTipologiaDocumento
2026-11-17T13:59:43.6460715Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deTipoDocumentoFarmacia
2026-11-17T13:59:43.6461054Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icClasseTipoDocumento
2026-11-17T13:59:43.6461394Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icDocumentoObrigatorio
2026-11-17T13:59:43.6461731Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuSqnclAnaliseDocumento
2026-11-17T13:59:43.6462059Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioPeriodo
2026-11-17T13:59:43.6462393Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coCpfCnpjDocumento
2026-11-17T13:59:43.6462698Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAnaliseDocumento
2026-11-17T13:59:43.6463030Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deJustificativa
2026-11-17T13:59:43.6463356Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhAnaliseDocumento
2026-11-17T13:59:43.6463694Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhFimAnaliseDocumento
2026-11-17T13:59:43.6464027Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icAnaliseDocumento
2026-11-17T13:59:43.6464421Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icCpfCnpjDocumento
2026-11-17T13:59:43.6464768Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icUsuarioAnaliseDocumento
2026-11-17T13:59:43.6465110Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuIdentificadorDocumento
2026-11-17T13:59:43.6465442Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDocumento
2026-11-17T13:59:43.6465764Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDocumento
2026-11-17T13:59:43.6466347Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coTipologiaDocumento
2026-11-17T13:59:43.6466691Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deTipoDocumentoFarmacia
2026-11-17T13:59:43.6467032Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icClasseTipoDocumento
2026-11-17T13:59:43.6467406Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icDocumentoObrigatorio
2026-11-17T13:59:43.6467749Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuSqnclAnaliseDocumento
2026-11-17T13:59:43.6468082Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coCpfCnpjDocumento
2026-11-17T13:59:43.6468420Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAnaliseDocumento
2026-11-17T13:59:43.6468792Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deJustificativa
2026-11-17T13:59:43.6469121Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhAnaliseDocumento
2026-11-17T13:59:43.6469453Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhFimAnaliseDocumento
2026-11-17T13:59:43.6469784Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icAnaliseDocumento
2026-11-17T13:59:43.6470078Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icCpfCnpjDocumento
2026-11-17T13:59:43.6470413Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icUsuarioAnaliseDocumento
2026-11-17T13:59:43.6470750Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuIdentificadorDocumento
2026-11-17T13:59:43.6471081Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDocumento
2026-11-17T13:59:43.6471408Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsFimPeriodo
2026-11-17T13:59:43.6471731Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioPeriodo
2026-11-17T13:59:43.6472053Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuFarmaceutico
2026-11-17T13:59:43.6472388Z 2026-11-17 10:59:31,673 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coIdentificacaoFarmaceutico
2026-11-17T13:59:43.6472733Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAcaoFarmaceutico
2026-11-17T13:59:43.6473069Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEnderecoIpFarmaceutico
2026-11-17T13:59:43.6473405Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtVencimentoRegistro
2026-11-17T13:59:43.6473731Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icTipoAcao
2026-11-17T13:59:43.6474059Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuCpfFarmaceutico
2026-11-17T13:59:43.6474467Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for sgIdentificacaoFarmaceutico
2026-11-17T13:59:43.6474814Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsFimVigenciaFarmaceutico
2026-11-17T13:59:43.6475155Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioVigenciaFrmco
2026-11-17T13:59:43.6475530Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuItemAnaliseDocumento
2026-11-17T13:59:43.6475862Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhItemAnalise
2026-11-17T13:59:43.6476190Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icItemPendente
2026-11-17T13:59:43.6476516Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuMatricula
2026-11-17T13:59:43.6476843Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuSqnclAnaliseDocumento
2026-11-17T13:59:43.6477183Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDcmtoItmVldco
2026-11-17T13:59:43.6477523Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuRepresentacaoFarmacia
2026-11-17T13:59:43.6477863Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAcaoRepresentacao
2026-11-17T13:59:43.6478208Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEmailRepresentante
2026-11-17T13:59:43.6478547Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEnderecoIpRepresentacao
2026-11-17T13:59:43.6478882Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtFimRepresentacao
2026-11-17T13:59:43.6479214Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtInicioRepresentacao
2026-11-17T13:59:43.6479548Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icResponsavelLegal
2026-11-17T13:59:43.6479866Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icTipoAcao
2026-11-17T13:59:43.6480194Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuDddRepresentante
2026-11-17T13:59:43.6480528Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTelefoneRepresentante
2026-11-17T13:59:43.6480854Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsFimPeriodo
2026-11-17T13:59:43.6481177Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioPeriodo
2026-11-17T13:59:43.6481496Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for id
2026-11-17T13:59:43.6481828Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuRepresentanteFarmacia
2026-11-17T13:59:43.6482168Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAcaoRepresentante
2026-11-17T13:59:43.6482508Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEnderecoIpRepresentante
2026-11-17T13:59:43.6482836Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icTipoAcao
2026-11-17T13:59:43.6483160Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuCpfRepresentante
2026-11-17T13:59:43.6483483Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsFimVigenciaRprse
2026-11-17T13:59:43.6483814Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioVigenciaRprse
2026-11-17T13:59:43.6484143Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuControleDocumento
2026-11-17T13:59:43.6484536Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhEnvioDocumento
2026-11-17T13:59:43.6484900Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icDocumentoLocal
2026-11-17T13:59:43.6485229Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuFarmaceutico
2026-11-17T13:59:43.6485555Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuFarmacia
2026-11-17T13:59:43.6485884Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuRepresentanteFarmacia
2026-11-17T13:59:43.6486216Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDocumento
2026-11-17T13:59:43.6486547Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoSituacaoFarmacia
2026-11-17T13:59:43.6486889Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deTipoSituacaoFarmacia
2026-11-17T13:59:43.6487221Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDcmtoItmVldco
2026-11-17T13:59:43.6487553Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deJustificativaPadrao
2026-11-17T13:59:43.6487881Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuItemValidacao
2026-11-17T13:59:43.6488214Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoDocumento
2026-11-17T13:59:43.6488540Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuFarmacia
2026-11-17T13:59:43.6488878Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coCnpjEstabelecimentoLegado
2026-11-17T13:59:43.6489217Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coLicencaFuncionamento
2026-11-17T13:59:43.6489548Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coProcessoSei
2026-11-17T13:59:43.6489877Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAcaoFarmacia
2026-11-17T13:59:43.6490172Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEmailFarmacia
2026-11-17T13:59:43.6490501Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEnderecoIpFarmacia
2026-11-17T13:59:43.6490834Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhAtualizacaoFarmacia
2026-11-17T13:59:43.6491205Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhSubmissaoSlctoCadastro
2026-11-17T13:59:43.6491538Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtVencimentoCnd
2026-11-17T13:59:43.6491873Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtVencimentoLicencaFncmo
2026-11-17T13:59:43.6492220Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icEfetuaVenda
2026-11-17T13:59:43.6492580Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icEmissaoFiscalEletronico
2026-11-17T13:59:43.6492905Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icTipoAcao
2026-11-17T13:59:43.6493243Z 2026-11-17 10:59:31,674 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for noTitularidadeContaCredito
2026-11-17T13:59:43.6493574Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuAgencia
2026-11-17T13:59:43.6493894Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuBanco
2026-11-17T13:59:43.6494274Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuCnpjEstabelecimento
2026-11-17T13:59:43.6494609Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuConta
2026-11-17T13:59:43.6494935Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuDddAlternativo
2026-11-17T13:59:43.6495258Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuDddPrincipal
2026-11-17T13:59:43.6495580Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuDvAgencia
2026-11-17T13:59:43.6495896Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuDvConta
2026-11-17T13:59:43.6496288Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuIbgeMunicipio
2026-11-17T13:59:43.6496586Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuInscricaoInss
2026-11-17T13:59:43.6496923Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuRegistroJuntaComercial
2026-11-17T13:59:43.6497263Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTelefoneAlternativo
2026-11-17T13:59:43.6497592Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTelefonePrincipal
2026-11-17T13:59:43.6497917Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuTipoConta
2026-11-17T13:59:43.6498240Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for sgUfFarmacia
2026-11-17T13:59:43.6498568Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsFimVigenciaFarmacia
2026-11-17T13:59:43.6498901Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioVigenciaFarmacia
2026-11-17T13:59:43.6499391Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuItemValidacao
2026-11-17T13:59:43.6499717Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for noItemValidado
2026-11-17T13:59:43.6500050Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuRepresentacaoTecnica
2026-11-17T13:59:43.6500391Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coUsuarioAcaoRepresentacao
2026-11-17T13:59:43.6500759Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deEnderecoIpRepresentacao
2026-11-17T13:59:43.6501092Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtFimRepresentacao
2026-11-17T13:59:43.6501429Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtInicioRepresentacao
2026-11-17T13:59:43.6501779Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtVencimentoCertidaoRegularidade
2026-11-17T13:59:43.6502114Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icTipoAcao
2026-11-17T13:59:43.6502442Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsFimPeriodo
2026-11-17T13:59:43.6502770Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for tsInicioPeriodo
2026-11-17T13:59:43.6503102Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuFarmaciaAuxiliar
2026-11-17T13:59:43.6503411Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coCnpjEstabelecimentoLegado
2026-11-17T13:59:43.6503745Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for coCnpjMatrizLegado
2026-11-17T13:59:43.6504074Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for deMotivoBloqueio
2026-11-17T13:59:43.6504532Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dhAtualizacaoCadastro
2026-11-17T13:59:43.6504863Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dtBloqueio
2026-11-17T13:59:43.6505192Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for icAtualizacaoCadastro
2026-11-17T13:59:43.6505529Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuCnpjEstabelecimento
2026-11-17T13:59:43.6505856Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuCnpjMatriz
2026-11-17T13:59:43.6506182Z 2026-11-17 10:59:31,675 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nuMotivoBloqueio
2026-11-17T13:59:43.6506561Z 2026-11-17 10:59:31,683 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_situacao_farmacia] to be non-null as it is part of the primary key for table [faptb002_situacao_farmacia]
2026-11-17T13:59:43.6506949Z 2026-11-17 10:59:31,683 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_tipo_documento] to be non-null as it is part of the primary key for table [faptb006_tipo_documento]
2026-11-17T13:59:43.6507355Z 2026-11-17 10:59:31,684 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_sqncl_analise_documento] to be non-null as it is part of the primary key for table [faptb119_hstro_anlse_documento]
2026-11-17T13:59:43.6507788Z 2026-11-17 10:59:31,684 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [ts_inicio_periodo] to be non-null as it is part of the primary key for table [faptb119_hstro_anlse_documento]
2026-11-17T13:59:43.6508175Z 2026-11-17 10:59:31,684 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_tipo_documento] to be non-null as it is part of the primary key for table [faptb006_tipo_documento]
2026-11-17T13:59:43.6508568Z 2026-11-17 10:59:31,684 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_sqncl_analise_documento] to be non-null as it is part of the primary key for table [faptb019_analise_documento]
2026-11-17T13:59:43.6508985Z 2026-11-17 10:59:31,684 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_farmaceutico] to be non-null as it is part of the primary key for table [faptb004_farmaceutico]
2026-11-17T13:59:43.6509379Z 2026-11-17 10:59:31,684 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_item_analise_documento] to be non-null as it is part of the primary key for table [faptb018_item_analise_dcmto]
2026-11-17T13:59:43.6509770Z 2026-11-17 10:59:31,684 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_representacao_farmacia] to be non-null as it is part of the primary key for table [faptb011_rprto_farmacia]
2026-11-17T13:59:43.6510131Z 2026-11-17 10:59:31,684 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [id] to be non-null as it is part of the primary key for table [sqlmappings]
2026-11-17T13:59:43.6510511Z 2026-11-17 10:59:31,684 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_representante_farmacia] to be non-null as it is part of the primary key for table [faptb010_rprse_farmacia]
2026-11-17T13:59:43.6510905Z 2026-11-17 10:59:31,684 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_controle_documento] to be non-null as it is part of the primary key for table [faptb014_controle_documento]
2026-11-17T13:59:43.6511299Z 2026-11-17 10:59:31,684 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_tipo_situacao_farmacia] to be non-null as it is part of the primary key for table [faptb003_tipo_stco_farmacia]
2026-11-17T13:59:43.6511692Z 2026-11-17 10:59:31,684 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_tipo_dcmto_itm_vldco] to be non-null as it is part of the primary key for table [faptb017_tipo_dcmto_itm_vldco]
2026-11-17T13:59:43.6512072Z 2026-11-17 10:59:31,684 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_farmacia] to be non-null as it is part of the primary key for table [faptb001_farmacia]
2026-11-17T13:59:43.6512449Z 2026-11-17 10:59:31,684 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_item_validacao] to be non-null as it is part of the primary key for table [faptb016_item_validacao]
2026-11-17T13:59:43.6512834Z 2026-11-17 10:59:31,684 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_representacao_tecnica] to be non-null as it is part of the primary key for table [faptb005_rprse_tecnica]
2026-11-17T13:59:43.6513228Z 2026-11-17 10:59:31,684 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [nu_farmacia_auxiliar] to be non-null as it is part of the primary key for table [faptb012_farmacia_auxiliar]
2026-11-17T13:59:43.6513602Z 2026-11-17 10:59:31,687 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Second pass for collection: br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise
2026-11-17T13:59:43.6513983Z 2026-11-17 10:59:31,688 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Binding a OneToMany: br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise through a foreign key
2026-11-17T13:59:43.6514432Z 2026-11-17 10:59:31,690 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Mapping collection: br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise -> FAPTB018_ITEM_ANALISE_DCMTO
2026-11-17T13:59:43.6514805Z 2026-11-17 10:59:31,702 DEBUG [org.hib.boo.mod.int.TableBinder] (main) Retrieving property br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento
2026-11-17T13:59:43.6515244Z 2026-11-17 10:59:31,703 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Mapped collection key: NU_SQNCL_ANALISE_DOCUMENTO, one-to-many: br.com.caixa.sifap.entity.ItemAnaliseDocumento
2026-11-17T13:59:43.6515617Z 2026-11-17 10:59:31,703 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Second pass for collection: br.com.caixa.sifap.entity.Farmacia.representacoes
2026-11-17T13:59:43.6515959Z 2026-11-17 10:59:31,703 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Binding a OneToMany: br.com.caixa.sifap.entity.Farmacia.representacoes through a foreign key
2026-11-17T13:59:43.6516386Z 2026-11-17 10:59:31,704 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Mapping collection: br.com.caixa.sifap.entity.Farmacia.representacoes -> FAPTB011_RPRTO_FARMACIA
2026-11-17T13:59:43.6516750Z 2026-11-17 10:59:31,704 DEBUG [org.hib.boo.mod.int.TableBinder] (main) Retrieving property br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia
2026-11-17T13:59:43.6517125Z 2026-11-17 10:59:31,704 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Mapped collection key: NU_FARMACIA, one-to-many: br.com.caixa.sifap.entity.RepresentacaoFarmacia
2026-11-17T13:59:43.6517500Z 2026-11-17 10:59:31,704 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Second pass for collection: br.com.caixa.sifap.entity.Farmacia.representacoesTecnica
2026-11-17T13:59:43.6517880Z 2026-11-17 10:59:31,704 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Binding a OneToMany: br.com.caixa.sifap.entity.Farmacia.representacoesTecnica through a foreign key
2026-11-17T13:59:43.6518271Z 2026-11-17 10:59:31,704 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Mapping collection: br.com.caixa.sifap.entity.Farmacia.representacoesTecnica -> FAPTB005_RPRSE_TECNICA
2026-11-17T13:59:43.6518636Z 2026-11-17 10:59:31,704 DEBUG [org.hib.boo.mod.int.TableBinder] (main) Retrieving property br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia
2026-11-17T13:59:43.6519006Z 2026-11-17 10:59:31,704 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Mapped collection key: NU_FARMACIA, one-to-many: br.com.caixa.sifap.entity.RepresentacaoTecnica
2026-11-17T13:59:43.6519369Z 2026-11-17 10:59:31,704 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Second pass for collection: br.com.caixa.sifap.entity.Farmacia.situacoes
2026-11-17T13:59:43.6519730Z 2026-11-17 10:59:31,704 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Binding a OneToMany: br.com.caixa.sifap.entity.Farmacia.situacoes through a foreign key
2026-11-17T13:59:43.6520101Z 2026-11-17 10:59:31,704 DEBUG [org.hib.boo.mod.int.CollectionBinder] (main) Mapping collection: br.com.caixa.sifap.entity.Farmacia.situacoes -> FAPTB002_SITUACAO_FARMACIA
2026-11-17T13:59:43.6520450Z 2026-11-17 10:59:31,704 DEBUG [org.hib.boo.mod.int.TableBinder] (main) Retrieving property br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia
2026-11-17T13:59:43.6520812Z 2026-11-17 10:59:31,704 DEBUG [org.hib.boo.mod.int.CollectionSecondPass] (main) Mapped collection key: NU_FARMACIA, one-to-many: br.com.caixa.sifap.entity.SituacaoFarmacia
2026-11-17T13:59:43.6521139Z 2026-11-17 10:59:31,783 DEBUG [org.inf.qua.hib.cac.QuarkusInfinispanRegionFactory] (main) Stop region factory
2026-11-17T13:59:43.6521443Z 2026-11-17 10:59:31,783 DEBUG [org.inf.qua.hib.cac.QuarkusInfinispanRegionFactory] (main) Clear region references
2026-11-17T13:59:43.6521801Z 2026-11-17 10:59:31,784 DEBUG [org.hib.boo.reg.int.BootstrapServiceRegistryImpl] (main) Implicitly destroying Boot-strap registry on de-registration of all child ServiceRegistries
2026-11-17T13:59:43.6522188Z 2026-11-17 10:59:31,784 DEBUG [org.hib.boo.reg.int.BootstrapServiceRegistryImpl] (main) Implicitly destroying Boot-strap registry on de-registration of all child ServiceRegistries
2026-11-17T13:59:43.6522556Z 2026-11-17 10:59:31,785 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.Farmaceutico] is safe
2026-11-17T13:59:43.6522963Z 2026-11-17 10:59:31,785 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.Farmaceutico
2026-11-17T13:59:43.6523403Z 2026-11-17 10:59:31,788 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.RepresentacaoFarmacia] is safe
2026-11-17T13:59:43.6523824Z 2026-11-17 10:59:31,788 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.RepresentacaoFarmacia
2026-11-17T13:59:43.6524301Z 2026-11-17 10:59:31,789 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.SituacaoFarmacia] is safe
2026-11-17T13:59:43.6524721Z 2026-11-17 10:59:31,789 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.SituacaoFarmacia
2026-11-17T13:59:43.6525126Z 2026-11-17 10:59:31,791 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoDocumentoFarmacia] is safe
2026-11-17T13:59:43.6525539Z 2026-11-17 10:59:31,791 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoDocumentoFarmacia
2026-11-17T13:59:43.6525940Z 2026-11-17 10:59:31,792 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento] is safe
2026-11-17T13:59:43.6526554Z 2026-11-17 10:59:31,792 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.HistoricoAnaliseDocumento
2026-11-17T13:59:43.6526951Z 2026-11-17 10:59:31,794 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.ControleDocumento] is safe
2026-11-17T13:59:43.6527363Z 2026-11-17 10:59:31,794 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.ControleDocumento
2026-11-17T13:59:43.6527754Z 2026-11-17 10:59:31,795 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.RepresentacaoTecnica] is safe
2026-11-17T13:59:43.6528171Z 2026-11-17 10:59:31,795 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.RepresentacaoTecnica
2026-11-17T13:59:43.6528556Z 2026-11-17 10:59:31,797 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.ItemValidacao] is safe
2026-11-17T13:59:43.6528965Z 2026-11-17 10:59:31,797 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.ItemValidacao
2026-11-17T13:59:43.6529356Z 2026-11-17 10:59:31,798 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoSituacaoFarmacia] is safe
2026-11-17T13:59:43.6529771Z 2026-11-17 10:59:31,798 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoSituacaoFarmacia
2026-11-17T13:59:43.6530165Z 2026-11-17 10:59:31,799 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.RepresentanteFarmacia] is safe
2026-11-17T13:59:43.6530583Z 2026-11-17 10:59:31,799 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.RepresentanteFarmacia
2026-11-17T13:59:43.6531003Z 2026-11-17 10:59:31,800 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.Farmacia] is safe
2026-11-17T13:59:43.6531366Z 2026-11-17 10:59:31,800 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.Farmacia
2026-11-17T13:59:43.6531743Z 2026-11-17 10:59:31,803 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.AnaliseDocumento] is safe
2026-11-17T13:59:43.6532171Z 2026-11-17 10:59:31,803 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.AnaliseDocumento
2026-11-17T13:59:43.6532542Z 2026-11-17 10:59:31,805 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.SqlMappings] is safe
2026-11-17T13:59:43.6532940Z 2026-11-17 10:59:31,805 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.SqlMappings
2026-11-17T13:59:43.6533321Z 2026-11-17 10:59:31,805 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.FarmaciaAuxiliar] is safe
2026-11-17T13:59:43.6533723Z 2026-11-17 10:59:31,805 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.FarmaciaAuxiliar
2026-11-17T13:59:43.6534103Z 2026-11-17 10:59:31,807 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoDocumento] is safe
2026-11-17T13:59:43.6534569Z 2026-11-17 10:59:31,807 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoDocumento
2026-11-17T13:59:43.6534960Z 2026-11-17 10:59:31,808 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.ItemAnaliseDocumento] is safe
2026-11-17T13:59:43.6535370Z 2026-11-17 10:59:31,808 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.ItemAnaliseDocumento
2026-11-17T13:59:43.6535765Z 2026-11-17 10:59:31,809 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao] is safe
2026-11-17T13:59:43.6536183Z 2026-11-17 10:59:31,809 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.com.caixa.sifap.entity.TipoDocumentoItemValidacao
2026-11-17T13:59:43.6536578Z 2026-11-17 10:59:31,813 DEBUG [io.qua.arc.run.ArcRecorder] (main) Bean container listener io.quarkus.hibernate.orm.runtime.HibernateOrmRecorder$1 finished in 895 ms
2026-11-17T13:59:43.6536897Z 2026-11-17 10:59:31,826 DEBUG [org.hib.val.int.uti.Version] (main) HV000001: Hibernate Validator 8.0.2.Final
2026-11-17T13:59:43.6537265Z 2026-11-17 10:59:31,829 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom LocaleResolver of type io.quarkus.hibernate.validator.runtime.locale.LocaleResolversWrapper
2026-11-17T13:59:43.6537692Z 2026-11-17 10:59:31,831 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom BeanMetaDataClassNormalizer of type io.quarkus.hibernate.validator.runtime.ArcProxyBeanMetaDataClassNormalizer
2026-11-17T13:59:43.6538026Z 2026-11-17 10:59:31,866 DEBUG [io.qua.arc.impl] (main) Loaded 66 removed beans lazily
2026-11-17T13:59:43.6538412Z 2026-11-17 10:59:31,867 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom ConstraintValidatorFactory of type io.quarkus.hibernate.validator.runtime.ArcConstraintValidatorFactoryImpl
2026-11-17T13:59:43.6538889Z 2026-11-17 10:59:31,869 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom TraversableResolver of type org.hibernate.validator.internal.engine.resolver.JPATraversableResolver
2026-11-17T13:59:43.6539330Z 2026-11-17 10:59:31,870 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom ClockProvider of type io.quarkus.hibernate.validator.runtime.clockprovider.RuntimeReinitializedDefaultClockProvider
2026-11-17T13:59:43.6539721Z 2026-11-17 10:59:31,871 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) HV000002: Ignoring XML configuration.
2026-11-17T13:59:43.6540026Z 2026-11-17 10:59:31,963 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) ValidationMessages not found.
2026-11-17T13:59:43.6540418Z 2026-11-17 10:59:31,963 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000255: Using io.quarkus.hibernate.validator.runtime.locale.LocaleResolversWrapper as locale resolver.
2026-11-17T13:59:43.6540771Z 2026-11-17 10:59:31,965 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) ContributorValidationMessages not found.
2026-11-17T13:59:43.6541102Z 2026-11-17 10:59:31,967 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) org.hibernate.validator.ValidationMessages found.
2026-11-17T13:59:43.6541434Z 2026-11-17 10:59:31,973 DEBUG [org.hib.val.mes.ResourceBundleMessageInterpolator] (main) Loaded expression factory via original TCCL
2026-11-17T13:59:43.6541838Z 2026-11-17 10:59:31,977 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000252: Using org.hibernate.validator.internal.engine.DefaultPropertyNodeNameProvider as property node name provider.
2026-11-17T13:59:43.6542312Z 2026-11-17 10:59:32,011 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator as ValidatorFactory-scoped message interpolator.
2026-11-17T13:59:43.6542827Z 2026-11-17 10:59:32,011 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.engine.resolver.JPATraversableResolver as ValidatorFactory-scoped traversable resolver.
2026-11-17T13:59:43.6543295Z 2026-11-17 10:59:32,011 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.util.ExecutableParameterNameProvider as ValidatorFactory-scoped parameter name provider.
2026-11-17T13:59:43.6543782Z 2026-11-17 10:59:32,011 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using io.quarkus.hibernate.validator.runtime.clockprovider.RuntimeReinitializedDefaultClockProvider as ValidatorFactory-scoped clock provider.
2026-11-17T13:59:43.6544320Z 2026-11-17 10:59:32,011 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.engine.scripting.DefaultScriptEvaluatorFactory as ValidatorFactory-scoped script evaluator factory.
2026-11-17T13:59:43.6544756Z 2026-11-17 10:59:32,018 DEBUG [io.qua.arc.run.ArcRecorder] (main) Bean container listener io.quarkus.hibernate.validator.runtime.HibernateValidatorRecorder$2 finished in 205 ms
2026-11-17T13:59:43.6545212Z 2026-11-17 10:59:32,024 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type interface br.com.caixa.sifap.client.SimtrApiClient and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6545694Z 2026-11-17 10:59:32,024 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type interface br.com.caixa.sifap.client.SimtrAzureApiClient and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6546177Z 2026-11-17 10:59:32,025 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class br.com.caixa.sifap.client.SimtrApiClient$$CDIWrapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6546706Z 2026-11-17 10:59:32,025 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class br.com.caixa.sifap.client.SimtrAzureApiClient$$CDIWrapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6547255Z 2026-11-17 10:59:32,060 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerVertxBufferMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6547828Z 2026-11-17 10:59:32,061 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerMutinyBufferMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6548371Z 2026-11-17 10:59:32,063 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerVertxAsyncFileMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6548905Z 2026-11-17 10:59:32,064 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerMutinyAsyncFileMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6549448Z 2026-11-17 10:59:32,066 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonArrayMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6549989Z 2026-11-17 10:59:32,067 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonObjectMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6550506Z 2026-11-17 10:59:32,067 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.QuarkusServerPathBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6551036Z 2026-11-17 10:59:32,068 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonArrayMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6551586Z 2026-11-17 10:59:32,068 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonObjectMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6552118Z 2026-11-17 10:59:32,068 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6552644Z 2026-11-17 10:59:32,068 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6553204Z 2026-11-17 10:59:32,068 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6553743Z 2026-11-17 10:59:32,068 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6554303Z 2026-11-17 10:59:32,068 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6554864Z 2026-11-17 10:59:32,068 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerCharArrayMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6555380Z 2026-11-17 10:59:32,068 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerByteArrayMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6555900Z 2026-11-17 10:59:32,069 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerFormUrlEncodedProvider and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6556476Z 2026-11-17 10:59:32,069 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerInputStreamMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6557008Z 2026-11-17 10:59:32,069 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.StreamingOutputMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6557527Z 2026-11-17 10:59:32,069 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerReaderBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6558035Z 2026-11-17 10:59:32,069 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerFileBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6558552Z 2026-11-17 10:59:32,069 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerFilePartBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6559065Z 2026-11-17 10:59:32,069 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.core.multipart.MultipartMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6559572Z 2026-11-17 10:59:32,069 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerPathBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6560088Z 2026-11-17 10:59:32,069 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerPathPartBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6560645Z 2026-11-17 10:59:32,069 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6561165Z 2026-11-17 10:59:32,069 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerBooleanMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6561708Z 2026-11-17 10:59:32,069 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerCharacterMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6562230Z 2026-11-17 10:59:32,069 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerNumberMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6562762Z 2026-11-17 10:59:32,069 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerInputStreamMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6563310Z 2026-11-17 10:59:32,069 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerReaderBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6563818Z 2026-11-17 10:59:32,069 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.QuarkusServerFileBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6564391Z 2026-11-17 10:59:32,070 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerByteArrayMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6564927Z 2026-11-17 10:59:32,070 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerDefaultTextPlainBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6565647Z 2026-11-17 10:59:32,071 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.exceptionmappers.ForbiddenExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6566189Z 2026-11-17 10:59:32,071 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.mappers.BuiltinMismatchedInputExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6566735Z 2026-11-17 10:59:32,072 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.exceptionmappers.AuthenticationRedirectExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6567439Z 2026-11-17 10:59:32,072 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.exceptionmappers.AuthenticationCompletionExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6568000Z 2026-11-17 10:59:32,072 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.rest.runtime.__QuarkusInit and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6568619Z 2026-11-17 10:59:32,188 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonArrayBasicMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6569254Z 2026-11-17 10:59:32,188 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonObjectBasicMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6569893Z 2026-11-17 10:59:32,188 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonArrayBasicMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6570508Z 2026-11-17 10:59:32,188 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonObjectBasicMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-11-17T13:59:43.6570914Z 2026-11-17 10:59:32,213 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource BuildTime RunTime Fixed with ordinal 2147483647
2026-11-17T13:59:43.6571301Z 2026-11-17 10:59:32,213 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource SysPropConfigSource with ordinal 400
2026-11-17T13:59:43.6571618Z 2026-11-17 10:59:32,213 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource EnvConfigSource with ordinal 300
2026-11-17T13:59:43.6572042Z 2026-11-17 10:59:32,213 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource PropertiesConfigSource[source=jar:file:///deployments/app/sifap-centralizadora-1.0.0-SNAPSHOT.jar!/application.properties] with ordinal 250
2026-11-17T13:59:43.6572432Z 2026-11-17 10:59:32,213 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource DefaultValuesConfigSource with ordinal -2147483648
2026-11-17T13:59:43.6572730Z 2026-11-17 10:59:32,399 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-16) Java version: 21
2026-11-17T13:59:43.6573027Z 2026-11-17 10:59:32,399 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-16) -Dio.netty.noUnsafe: false
2026-11-17T13:59:43.6573328Z 2026-11-17 10:59:32,401 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-16) java.nio.Buffer.address: available
2026-11-17T13:59:43.6573650Z 2026-11-17 10:59:32,402 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-16) java.nio.Bits.unaligned: available, true
2026-11-17T13:59:43.6573982Z 2026-11-17 10:59:32,403 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-16) java.nio.DirectByteBuffer.<init>(long, {int,long}): unavailable
2026-11-17T13:59:43.6574350Z 2026-11-17 10:59:32,403 DEBUG [io.net.uti.int.PlatformDependent] (Thread-16) sun.misc.Unsafe: available
2026-11-17T13:59:43.6574661Z 2026-11-17 10:59:32,403 DEBUG [io.net.uti.int.PlatformDependent] (Thread-16) -Dio.netty.tmpdir: /tmp (java.io.tmpdir)
2026-11-17T13:59:43.6574943Z 2026-11-17 10:59:32,403 DEBUG [io.net.uti.int.PlatformDependent] (Thread-16) -Dio.netty.bitMode: 64 (sun.arch.data.model)
2026-11-17T13:59:43.6575256Z 2026-11-17 10:59:32,404 DEBUG [io.net.uti.int.PlatformDependent] (Thread-16) -Dio.netty.maxDirectMemory: -1 bytes
2026-11-17T13:59:43.6575568Z 2026-11-17 10:59:32,404 DEBUG [io.net.uti.int.PlatformDependent] (Thread-16) -Dio.netty.uninitializedArrayAllocationThreshold: -1
2026-11-17T13:59:43.6575875Z 2026-11-17 10:59:32,404 DEBUG [io.net.uti.int.CleanerJava9] (Thread-16) java.nio.ByteBuffer.cleaner(): available
2026-11-17T13:59:43.6576240Z 2026-11-17 10:59:32,404 DEBUG [io.net.uti.int.PlatformDependent] (Thread-16) -Dio.netty.noPreferDirect: false
2026-11-17T13:59:43.6576542Z 2026-11-17 10:59:32,406 DEBUG [io.net.cha.DefaultChannelId] (Thread-16) -Dio.netty.processId: 8 (auto-detected)
2026-11-17T13:59:43.6576867Z 2026-11-17 10:59:32,407 DEBUG [io.net.cha.DefaultChannelId] (Thread-16) -Dio.netty.machineId: 61:28:00:dd:a9:0d:d0:55 (user-set)
2026-11-17T13:59:43.6577187Z 2026-11-17 10:59:32,498 DEBUG [io.ver.cor.log.LoggerFactory] (main) Using io.vertx.core.logging.SLF4JLogDelegateFactory
2026-11-17T13:59:43.6577549Z 2026-11-17 10:59:32,506 DEBUG [io.qua.ver.cor.run.VertxCoreRecorder] (main) Vert.x Cache configured to: /tmp/vertx-cache/9122206956625086017
2026-11-17T13:59:43.6577856Z 2026-11-17 10:59:32,530 DEBUG [io.net.uti.ResourceLeakDetector] (main) -Dio.netty.leakDetection.level: simple
2026-11-17T13:59:43.6578158Z 2026-11-17 10:59:32,530 DEBUG [io.net.uti.ResourceLeakDetector] (main) -Dio.netty.leakDetection.targetRecords: 4
2026-11-17T13:59:43.6578451Z 2026-11-17 10:59:32,603 DEBUG [io.net.cha.MultithreadEventLoopGroup] (main) -Dio.netty.eventLoopThreads: 4
2026-11-17T13:59:43.6578761Z 2026-11-17 10:59:32,654 DEBUG [io.net.uti.con.GlobalEventExecutor] (main) -Dio.netty.globalEventExecutor.quietPeriodSeconds: 1
2026-11-17T13:59:43.6579065Z 2026-11-17 10:59:32,702 DEBUG [io.net.cha.nio.NioEventLoop] (main) -Dio.netty.noKeySetOptimization: false
2026-11-17T13:59:43.6579366Z 2026-11-17 10:59:32,702 DEBUG [io.net.cha.nio.NioEventLoop] (main) -Dio.netty.selectorAutoRebuildThreshold: 512
2026-11-17T13:59:43.6579638Z 2026-11-17 10:59:32,718 DEBUG [io.net.uti.int.PlatformDependent] (main) org.jctools-core.MpscChunkedArrayQueue: available
2026-11-17T13:59:43.6579946Z 2026-11-17 10:59:32,751 DEBUG [io.qua.ver.cor.run.VertxCoreRecorder] (main) Vertx has Native Transport Enabled: false
2026-11-17T13:59:43.6580264Z 2026-11-17 10:59:32,782 DEBUG [com.arj.ats.jta] (main) Setting up node identifiers '[quarkus]' for which recovery will be performed
2026-11-17T13:59:43.6580851Z 2026-11-17 10:59:32,806 WARN  [io.qua.run.log.LoggingSetupRecorder] (main) Log level TRACE for category 'br.com.caixa.sifap.client.MinisterioFarmaciaAuthRequestFilter' set below minimum logging level DEBUG, promoting it to DEBUG. Set the build time configuration property 'quarkus.log.category."br.com.caixa.sifap.client.MinisterioFarmaciaAuthRequestFilter".min-level' to 'TRACE' to avoid this warning
2026-11-17T13:59:43.6581543Z 2026-11-17 10:59:32,806 WARN  [io.qua.run.log.LoggingSetupRecorder] (main) Log level TRACE for category 'br.com.caixa.sifap.service.MinisterioFarmaciaService' set below minimum logging level DEBUG, promoting it to DEBUG. Set the build time configuration property 'quarkus.log.category."br.com.caixa.sifap.service.MinisterioFarmaciaService".min-level' to 'TRACE' to avoid this warning
2026-11-17T13:59:43.6582031Z 2026-11-17 10:59:32,973 DEBUG [io.qua.hib.orm.run.FastBootHibernatePersistenceProvider] (JPA Startup Thread) Located 1 persistence units; checking each
2026-11-17T13:59:43.6582428Z 2026-11-17 10:59:32,973 DEBUG [io.qua.hib.orm.run.FastBootHibernatePersistenceProvider] (JPA Startup Thread) Checking persistence-unit [name=<default>, explicit-provider=null] against incoming persistence unit name [<default>]
2026-11-17T13:59:43.6582831Z 2026-11-17 10:59:32,973 DEBUG [io.qua.hib.orm.run.FastBootHibernatePersistenceProvider] (JPA Startup Thread) No PersistenceProvider explicitly requested, assuming Hibernate
2026-11-17T13:59:43.6583489Z 2026-11-17 10:59:32,991 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA384withRSA, Serial:59b1b579e8e2132e23907bda777755c, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:1057369358, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-11-17T13:59:43.6584399Z 2026-11-17 10:59:32,992 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA384withRSA, Serial:8ad40b260d29c4c9f5ecda9bd93aed9, Subject:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3406046841, Valid from:4/28/21, 9:00?PM, Valid until:4/28/36, 8:59?PM
2026-11-17T13:59:43.6585318Z 2026-11-17 10:59:32,993 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA256withRSA, Serial:c26e750be1b79211a147046343311c3, Subject:CN=Microsoft Corporation, OU=Java Signing (SHA2), O=Microsoft Corporation, L=Redmond, ST=Washington, C=US, Issuer:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:536829827, Valid from:8/2/21, 9:00?PM, Valid until:10/30/24, 8:59?PM
2026-11-17T13:59:43.6586199Z 2026-11-17 10:59:32,994 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA256withRSA, Serial:544aff3949d0839a6bfdb3f5fe56116, Subject:CN=DigiCert Timestamp 2023, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted G4 RSA4096 SHA256 TimeStamping CA, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:85613909, Valid from:7/13/23, 9:00?PM, Valid until:10/13/34, 8:59?PM
2026-11-17T13:59:43.6587027Z 2026-11-17 10:59:32,994 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA256withRSA, Serial:73637b724547cd847acfd28662a5e5b, Subject:CN=DigiCert Trusted G4 RSA4096 SHA256 TimeStamping CA, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3207540671, Valid from:3/22/22, 9:00?PM, Valid until:3/22/37, 8:59?PM
2026-11-17T13:59:43.6587813Z 2026-11-17 10:59:32,994 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA384withRSA, Serial:e9b188ef9d02de7efdb50e20840185a, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:845088433, Valid from:7/31/22, 9:00?PM, Valid until:11/9/31, 8:59?PM
2026-11-17T13:59:43.6588612Z 2026-11-17 10:59:32,998 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA384withRSA, Serial:59b1b579e8e2132e23907bda777755c, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:1057369358, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-11-17T13:59:43.6589432Z 2026-11-17 10:59:32,998 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA384withRSA, Serial:8ad40b260d29c4c9f5ecda9bd93aed9, Subject:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3406046841, Valid from:4/28/21, 9:00?PM, Valid until:4/28/36, 8:59?PM
2026-11-17T13:59:43.6590283Z 2026-11-17 10:59:32,999 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA256withRSA, Serial:c26e750be1b79211a147046343311c3, Subject:CN=Microsoft Corporation, OU=Java Signing (SHA2), O=Microsoft Corporation, L=Redmond, ST=Washington, C=US, Issuer:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:536829827, Valid from:8/2/21, 9:00?PM, Valid until:10/30/24, 8:59?PM
2026-11-17T13:59:43.6591091Z 2026-11-17 10:59:32,999 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA256withRSA, Serial:544aff3949d0839a6bfdb3f5fe56116, Subject:CN=DigiCert Timestamp 2023, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted G4 RSA4096 SHA256 TimeStamping CA, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:85613909, Valid from:7/13/23, 9:00?PM, Valid until:10/13/34, 8:59?PM
2026-11-17T13:59:43.6591876Z 2026-11-17 10:59:33,000 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA256withRSA, Serial:73637b724547cd847acfd28662a5e5b, Subject:CN=DigiCert Trusted G4 RSA4096 SHA256 TimeStamping CA, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3207540671, Valid from:3/22/22, 9:00?PM, Valid until:3/22/37, 8:59?PM
2026-11-17T13:59:43.6592698Z 2026-11-17 10:59:33,000 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA384withRSA, Serial:e9b188ef9d02de7efdb50e20840185a, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:845088433, Valid from:7/31/22, 9:00?PM, Valid until:11/9/31, 8:59?PM
2026-11-17T13:59:43.6593231Z 2026-11-17 10:59:33,073 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (JPA Startup Thread) Property:serverName Value:10.116.92.87
2026-11-17T13:59:43.6593572Z 2026-11-17 10:59:33,074 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (JPA Startup Thread) Property:portNumber Value:1433
2026-11-17T13:59:43.6593921Z 2026-11-17 10:59:33,074 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (JPA Startup Thread) Property:databaseName Value:FAPDB001
2026-11-17T13:59:43.6594312Z 2026-11-17 10:59:33,074 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (JPA Startup Thread) Property:encrypt Value:false
2026-11-17T13:59:43.6594668Z 2026-11-17 10:59:33,074 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (JPA Startup Thread) Property:trustServerCertificate Value:true
2026-11-17T13:59:43.6595220Z 2026-11-17 10:59:33,082 DEBUG [io.qua.agr.run.DataSources] (JPA Startup Thread) Started datasource <default> connected to jdbc:sqlserver://10.116.92.87:1433;databaseName=FAPDB001;encrypt=false;trustServerCertificate=true
2026-11-17T13:59:43.6595996Z 2026-11-17 10:59:33,099 DEBUG [org.hib.res.jdb.int.LogicalConnectionManagedImpl] (JPA Startup Thread) `hibernate.connection.provider_disables_autocommit` was enabled.  This setting should only be enabled when you are certain that the Connections given to Hibernate by the ConnectionProvider have auto-commit disabled.  Enabling this setting when the Connections do not have auto-commit disabled will lead to Hibernate executing SQL operations outside of any JDBC/SQL transaction.
2026-11-17T13:59:43.6596470Z 2026-11-17 10:59:33,121 FINE  [com.mic.sql.jdb.Driver] (agroal-11) Microsoft JDBC Driver 12.8.1.0 for SQL Server
2026-11-17T13:59:43.6596787Z 2026-11-17 10:59:33,121 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (agroal-11) Property:serverName Value:10.116.92.87
2026-11-17T13:59:43.6597117Z 2026-11-17 10:59:33,121 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (agroal-11) Property:portNumber Value:1433
2026-11-17T13:59:43.6597442Z 2026-11-17 10:59:33,121 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (agroal-11) Property:databaseName Value:FAPDB001
2026-11-17T13:59:43.6597765Z 2026-11-17 10:59:33,121 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (agroal-11) Property:encrypt Value:false
2026-11-17T13:59:43.6598096Z 2026-11-17 10:59:33,121 FINE  [com.mic.sql.jdb.int.SQLServerDriver] (agroal-11) Property:trustServerCertificate Value:true
2026-11-17T13:59:43.6598778Z 2026-11-17 10:59:33,155 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:43012c986d4559cd42b7ea298c0000012c986d, Subject:CN=Microsoft TLS G2 RSA CA OCSP 04 External OCSP Responder 2026-09-, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 04, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:1205376199, Valid from:9/29/26, 7:03?PM, Valid until:3/28/27, 7:03?PM
2026-11-17T13:59:43.6599628Z 2026-11-17 10:59:33,156 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:430146991169d05ba1713fbd20000001469911, Subject:CN=live.applicationinsights.azure.com, O=Microsoft Corporation, L=Redmond, ST=WA, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 04, O=Microsoft Corporation, C=US, Key type:RSA, Length:2048, Cert Id:2641376945, Valid from:10/13/26, 8:30?AM, Valid until:1/21/27, 7:30?AM
2026-11-17T13:59:43.6600464Z 2026-11-17 10:59:33,156 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:330000000b13e5667d4a9b558000000000000b, Subject:CN=Microsoft TLS G2 RSA CA OCSP 04, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:451853138, Valid from:8/1/25, 5:02?PM, Valid until:6/3/29, 5:02?PM
2026-11-17T13:59:43.6601237Z 2026-11-17 10:59:33,156 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:b0c6b2c466917b04773c647d4afc0c8, Subject:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3081933591, Valid from:5/20/25, 9:00?PM, Valid until:6/19/29, 8:59?PM
2026-11-17T13:59:43.6601758Z 2026-11-17 10:59:33,159 DEBUG [jdk.eve.security] (reactor-http-epoll-1) ValidationChain: 1136084297, 3081933591, 451853138, 2641376945
2026-11-17T13:59:43.6602157Z 2026-11-17 10:59:33,161 DEBUG [jdk.eve.security] (reactor-http-epoll-1)  TLSHandshake: brazilsouth.livediagnostics.monitor.azure.com:443, TLSv1.3, TLS_AES_256_GCM_SHA384, 2641376945
2026-11-17T13:59:43.6602528Z 2026-11-17 10:59:33,189 FINE  [com.mic.sql.jdb.int.SQLServerConnection] (agroal-11) ConnectionID:1 created by (SQLServerDriver:3)
2026-11-17T13:59:43.6602925Z 2026-11-17 10:59:33,195 FINE  [com.mic.sql.jdb.int.SQLServerConnection] (agroal-11) ConnectionID:1 Connecting with server: 10.116.92.87 port: 1433 Timeout slice: 3749 Timeout Full: 30
2026-11-17T13:59:43.6603363Z 2026-11-17 10:59:33,214 FINE  [com.mic.sql.jdb.int.SQLServerConnection] (agroal-11) ConnectionID:1 ClientConnectionId: 341f1ae0-2e0f-43e8-b793-41c2f3dea517 Server returned major version:13
2026-11-17T13:59:43.6603958Z 2026-11-17 10:59:33,225 DEBUG [jdk.eve.security] (agroal-11) X509Certificate: Alg:SHA1withRSA, Serial:4d4253f451ecdd9d4aa38b3419ccc25a, Subject:CN=SSL_Self_Signed_Fallback, Issuer:CN=SSL_Self_Signed_Fallback, Key type:RSA, Length:2048, Cert Id:3910152483, Valid from:9/4/26, 10:26?PM, Valid until:9/4/56, 10:26?PM
2026-11-17T13:59:43.6604495Z 2026-11-17 10:59:33,255 DEBUG [jdk.eve.security] (agroal-11)  TLSHandshake: 10.116.92.87:1433, TLSv1.2, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, 3910152483
2026-11-17T13:59:43.6604946Z 2026-11-17 10:59:33,295 FINE  [com.mic.sql.jdb.int.SQLServerDatabaseMetaData] (JPA Startup Thread)  SQLServerDatabaseMetaData:1 created by (ConnectionID:1 ClientConnectionId: 341f1ae0-2e0f-43e8-b793-41c2f3dea517)
2026-11-17T13:59:43.6605318Z 2026-11-17 10:59:33,296 DEBUG [org.hib.eng.jdb.env.int.JdbcEnvironmentInitiator] (JPA Startup Thread) Database ->
2026-11-17T13:59:43.6605501Z 	   name : Microsoft SQL Server
2026-11-17T13:59:43.6605643Z 	version : 13.00.5026
2026-11-17T13:59:43.6605776Z 	  major : 13
2026-11-17T13:59:43.6605895Z 	  minor : 0
2026-11-17T13:59:43.6606143Z 2026-11-17 10:59:33,296 DEBUG [org.hib.eng.jdb.env.int.JdbcEnvironmentInitiator] (JPA Startup Thread) Driver ->
2026-11-17T13:59:43.6606305Z 	   name : Microsoft JDBC Driver 12.8 for SQL Server
2026-11-17T13:59:43.6606452Z 	version : 12.8.1.0
2026-11-17T13:59:43.6606576Z 	  major : 12
2026-11-17T13:59:43.6606699Z 	  minor : 8
2026-11-17T13:59:43.6606959Z 2026-11-17 10:59:33,296 DEBUG [org.hib.eng.jdb.env.int.JdbcEnvironmentInitiator] (JPA Startup Thread) JDBC version : 4.3
2026-11-17T13:59:43.6607433Z 2026-11-17 10:59:33,297 DEBUG [org.hib.eng.jdb.env.spi.IdentifierHelperBuilder] (JPA Startup Thread) IdentifierCaseStrategy for both quoted and unquoted identifiers was set to the same strategy [MIXED]; that will likely lead to problems in schema update and validation if using quoted identifiers
2026-11-17T13:59:43.6608145Z 2026-11-17 10:59:33,302 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA384withRSA, Serial:59b1b579e8e2132e23907bda777755c, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:1057369358, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-11-17T13:59:43.6608998Z 2026-11-17 10:59:33,302 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA384withRSA, Serial:8ad40b260d29c4c9f5ecda9bd93aed9, Subject:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3406046841, Valid from:4/28/21, 9:00?PM, Valid until:4/28/36, 8:59?PM
2026-11-17T13:59:43.6609857Z 2026-11-17 10:59:33,302 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA256withRSA, Serial:c26e750be1b79211a147046343311c3, Subject:CN=Microsoft Corporation, OU=Java Signing (SHA2), O=Microsoft Corporation, L=Redmond, ST=Washington, C=US, Issuer:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:536829827, Valid from:8/2/21, 9:00?PM, Valid until:10/30/24, 8:59?PM
2026-11-17T13:59:43.6610693Z 2026-11-17 10:59:33,303 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA256withRSA, Serial:544aff3949d0839a6bfdb3f5fe56116, Subject:CN=DigiCert Timestamp 2023, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted G4 RSA4096 SHA256 TimeStamping CA, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:85613909, Valid from:7/13/23, 9:00?PM, Valid until:10/13/34, 8:59?PM
2026-11-17T13:59:43.6611506Z 2026-11-17 10:59:33,303 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA256withRSA, Serial:73637b724547cd847acfd28662a5e5b, Subject:CN=DigiCert Trusted G4 RSA4096 SHA256 TimeStamping CA, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3207540671, Valid from:3/22/22, 9:00?PM, Valid until:3/22/37, 8:59?PM
2026-11-17T13:59:43.6612285Z 2026-11-17 10:59:33,304 DEBUG [jdk.eve.security] (JPA Startup Thread) X509Certificate: Alg:SHA384withRSA, Serial:e9b188ef9d02de7efdb50e20840185a, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:845088433, Valid from:7/31/22, 9:00?PM, Valid until:11/9/31, 8:59?PM
2026-11-17T13:59:43.6612858Z 2026-11-17 10:59:33,318 FINE  [com.mic.sql.jdb.int.SQLServerStatement] (JPA Startup Thread) SQLServerStatement:1 created by (ConnectionID:1 ClientConnectionId: 341f1ae0-2e0f-43e8-b793-41c2f3dea517)
2026-11-17T13:59:43.6613270Z 2026-11-17 10:59:33,319 FINE  [com.mic.sql.jdb.int.SQLServerStatement] (JPA Startup Thread) SQLServerStatement:1 Executing (not server cursor) SELECT SCHEMA_NAME()
2026-11-17T13:59:43.6613648Z 2026-11-17 10:59:33,355 FINE  [com.mic.sql.jdb.int.SQLServerResultSet] (JPA Startup Thread) SQLServerResultSet:1 created by (SQLServerStatement:1)
2026-11-17T13:59:43.6614079Z 2026-11-17 10:59:33,361 FINE  [com.mic.sql.jdb.int.SQLServerStatement] (JPA Startup Thread) SQLServerStatement:2 created by (ConnectionID:1 ClientConnectionId: 341f1ae0-2e0f-43e8-b793-41c2f3dea517)
2026-11-17T13:59:43.6614614Z 2026-11-17 10:59:33,362 FINE  [com.mic.sql.jdb.int.SQLServerStatement] (JPA Startup Thread) SQLServerStatement:2 Executing (not server cursor) SELECT SCHEMA_NAME()
2026-11-17T13:59:43.6614990Z 2026-11-17 10:59:33,363 FINE  [com.mic.sql.jdb.int.SQLServerResultSet] (JPA Startup Thread) SQLServerResultSet:2 created by (SQLServerStatement:2)
2026-11-17T13:59:43.6615412Z 2026-11-17 10:59:33,365 FINE  [com.mic.sql.jdb.int.SQLServerClob] (JPA Startup Thread) SQLServerClob:1 created by (ConnectionID:1 ClientConnectionId: 341f1ae0-2e0f-43e8-b793-41c2f3dea517)
2026-11-17T13:59:43.6615852Z 2026-11-17 10:59:33,366 FINE  [com.mic.sql.jdb.int.SQLServerNClob] (JPA Startup Thread) SQLServerNClob:2 created by (ConnectionID:1 ClientConnectionId: 341f1ae0-2e0f-43e8-b793-41c2f3dea517)
2026-11-17T13:59:43.6616196Z 2026-11-17 10:59:33,366 DEBUG [org.hib.orm.con.pooling] (JPA Startup Thread) HHH10001005: Database info:
2026-11-17T13:59:43.6616424Z 	Database JDBC URL [undefined/unknown]
2026-11-17T13:59:43.6616546Z 	Database driver: undefined/unknown
2026-11-17T13:59:43.6616700Z 	Database version: 13.0
2026-11-17T13:59:43.6616846Z 	Autocommit mode: undefined/unknown
2026-11-17T13:59:43.6616990Z 	Isolation level: undefined/unknown
2026-11-17T13:59:43.6617133Z 	Minimum pool size: undefined/unknown
2026-11-17T13:59:43.6617283Z 	Maximum pool size: undefined/unknown
2026-11-17T13:59:43.6617559Z 2026-11-17 10:59:33,397 DEBUG [org.hib.int.SessionFactoryImpl] (JPA Startup Thread) Building session factory
2026-11-17T13:59:43.6618202Z 2026-11-17 10:59:33,432 DEBUG [org.hib.ser.int.SessionFactoryServiceRegistryImpl] (JPA Startup Thread) EventListenerRegistry access via ServiceRegistry is deprecated.  Use `sessionFactory.getEventEngine().getListenerRegistry()` instead
2026-11-17T13:59:43.6620867Z 2026-11-17 10:59:33,433 DEBUG [org.hib.int.SessionFactoryImpl] (JPA Startup Thread) Instantiating SessionFactory with settings: {jakarta.persistence.validation.mode=CALLBACK, hibernate.format_sql=true, hibernate.hbm2ddl.schema-generation.script.append=false, hibernate.connection.handling_mode=DELAYED_ACQUISITION_AND_RELEASE_BEFORE_TRANSACTION_COMPLETION, hibernate.cache.use_query_cache=true, jakarta.persistence.database-product-name=Microsoft SQL Server, hibernate.hbm2ddl.charset_name=UTF-8, hibernate.xml_mapping_enabled=false, hibernate.highlight_sql=true, hibernate.query.plan_cache_max_size=2048, hibernate.id.sequence.increment_size_mismatch_strategy=NONE, hibernate.hbm2ddl.skip_default_import_file=true, jakarta.persistence.sharedCache.mode=ENABLE_SELECTIVE, hibernate.id.optimizer.pooled.preferred=pooled-lo, org.hibernate.flushMode=AUTO, hibernate.show_sql=true, jakarta.persistence.create-database-schemas=false, hibernate.order_updates=true, hibernate.order_by.default_null_ordering=none, jakarta.persistence.schema-generation.scripts.action=none, hibernate.allow_update_outside_transaction=false, javax.persistence.validation.factory=org.hibernate.validator.internal.engine.PredefinedScopeValidatorFactoryImpl@3c62c83c, hibernate.boot.allow_jdbc_metadata_access=true, hibernate.cache.use_reference_entries=true, hibernate.cache.use_second_level_cache=true, hibernate.persistenceUnitName=<default>, hibernate.query.in_clause_parameter_padding=true, jakarta.persistence.validation.factory=org.hibernate.validator.internal.engine.PredefinedScopeValidatorFactoryImpl@3c62c83c, hibernate.discriminator.ignore_explicit_for_joined=false, hibernate.transaction.coordinator_class=class org.hibernate.resource.transaction.backend.jta.internal.JtaTransactionCoordinatorBuilderImpl, hibernate.type.json_format_mapper=org.hibernate.type.format.jackson.JacksonJsonFormatMapper@7642ed94, hibernate.connection.provider_disables_autocommit=true, hibernate.connection.datasource=io.agroal.pool.DataSource@17eca2a7, hibernate.hbm2ddl.import_files=, hibernate.cache.region.factory_class=org.infinispan.quarkus.hibernate.cache.QuarkusInfinispanRegionFactory, jakarta.persistence.database-product-version=13.0.5026.0, jakarta.persistence.schema-generation.database.action=none, hibernate.default_batch_fetch_size=16, hibernate.batch_fetch_style=PADDED}
2026-11-17T13:59:43.6622553Z 2026-11-17 10:59:33,435 DEBUG [org.inf.qua.hib.cac.QuarkusInfinispanRegionFactory] (JPA Startup Thread) Starting Infinispan region factory
2026-11-17T13:59:43.6622923Z 2026-11-17 10:59:33,437 DEBUG [org.inf.qua.hib.cac.QuarkusInfinispanRegionFactory] (JPA Startup Thread) Building timestamps cache region [default-update-timestamps-region]
2026-11-17T13:59:43.6623303Z 2026-11-17 10:59:33,452 DEBUG [org.inf.qua.hib.cac.QuarkusInfinispanRegionFactory] (JPA Startup Thread) Building query results cache region [default-query-results-region]
2026-11-17T13:59:43.6623659Z 2026-11-17 10:59:33,474 DEBUG [org.hib.int.SessionFactoryImpl] (JPA Startup Thread) Session factory constructed with filter configurations : {}
2026-11-17T13:59:43.6624082Z 2026-11-17 10:59:33,478 DEBUG [org.hib.ser.int.SessionFactoryServiceRegistryImpl] (JPA Startup Thread) EventListenerRegistry access via ServiceRegistry is deprecated.  Use `sessionFactory.getEventEngine().getListenerRegistry()` instead
2026-11-17T13:59:43.6624626Z 2026-11-17 10:59:33,484 DEBUG [org.hib.too.sch.spi.SchemaManagementToolCoordinator] (JPA Startup Thread) No schema actions specified for contributor `orm`; doing nothing
2026-11-17T13:59:43.6625033Z 2026-11-17 10:59:33,517 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(max)] under max; prior registration was null
2026-11-17T13:59:43.6625498Z 2026-11-17 10:59:33,518 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(min)] under min; prior registration was null
2026-11-17T13:59:43.6625897Z 2026-11-17 10:59:33,518 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(sum)] under sum; prior registration was null
2026-11-17T13:59:43.6626293Z 2026-11-17 10:59:33,519 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(avg)] under avg; prior registration was null
2026-11-17T13:59:43.6626718Z 2026-11-17 10:59:33,520 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CountFunction@1187e494] under count; prior registration was null
2026-11-17T13:59:43.6627163Z 2026-11-17 10:59:33,520 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.EveryAnyEmulation@2882eb4c] under every; prior registration was null
2026-11-17T13:59:43.6627605Z 2026-11-17 10:59:33,521 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.EveryAnyEmulation@32d78b93] under any; prior registration was null
2026-11-17T13:59:43.6628036Z 2026-11-17 10:59:33,521 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(floor)] under floor; prior registration was null
2026-11-17T13:59:43.6628461Z 2026-11-17 10:59:33,521 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(ceiling)] under ceiling; prior registration was null
2026-11-17T13:59:43.6628873Z 2026-11-17 10:59:33,521 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(mod)] under mod; prior registration was null
2026-11-17T13:59:43.6629278Z 2026-11-17 10:59:33,521 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(abs)] under abs; prior registration was null
2026-11-17T13:59:43.6629677Z 2026-11-17 10:59:33,521 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(sign)] under sign; prior registration was null
2026-11-17T13:59:43.6630086Z 2026-11-17 10:59:33,521 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(sqrt)] under sqrt; prior registration was null
2026-11-17T13:59:43.6630482Z 2026-11-17 10:59:33,521 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(ln)] under ln; prior registration was null
2026-11-17T13:59:43.6630884Z 2026-11-17 10:59:33,521 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(exp)] under exp; prior registration was null
2026-11-17T13:59:43.6631293Z 2026-11-17 10:59:33,521 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(power)] under power; prior registration was null
2026-11-17T13:59:43.6631746Z 2026-11-17 10:59:33,521 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(round)] under round; prior registration was null
2026-11-17T13:59:43.6632150Z 2026-11-17 10:59:33,521 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(sin)] under sin; prior registration was null
2026-11-17T13:59:43.6632549Z 2026-11-17 10:59:33,521 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(cos)] under cos; prior registration was null
2026-11-17T13:59:43.6632982Z 2026-11-17 10:59:33,521 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(tan)] under tan; prior registration was null
2026-11-17T13:59:43.6633385Z 2026-11-17 10:59:33,521 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(asin)] under asin; prior registration was null
2026-11-17T13:59:43.6633793Z 2026-11-17 10:59:33,522 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(acos)] under acos; prior registration was null
2026-11-17T13:59:43.6634253Z 2026-11-17 10:59:33,522 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(atan)] under atan; prior registration was null
2026-11-17T13:59:43.6634670Z 2026-11-17 10:59:33,522 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(atan2)] under atan2; prior registration was null
2026-11-17T13:59:43.6635096Z 2026-11-17 10:59:33,523 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@6496ef53] under sinh; prior registration was null
2026-11-17T13:59:43.6635613Z 2026-11-17 10:59:33,523 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@2a63c5db] under cosh; prior registration was null
2026-11-17T13:59:43.6636130Z 2026-11-17 10:59:33,523 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@2c7865d7] under tanh; prior registration was null
2026-11-17T13:59:43.6636619Z 2026-11-17 10:59:33,523 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@52562ad5] under pi; prior registration was null
2026-11-17T13:59:43.6637085Z 2026-11-17 10:59:33,523 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@7de04ffc] under log; prior registration was null
2026-11-17T13:59:43.6637520Z 2026-11-17 10:59:33,523 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(coalesce)] under coalesce; prior registration was null
2026-11-17T13:59:43.6637935Z 2026-11-17 10:59:33,523 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(nullif)] under nullif; prior registration was null
2026-11-17T13:59:43.6638337Z 2026-11-17 10:59:33,523 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(left)] under left; prior registration was null
2026-11-17T13:59:43.6638746Z 2026-11-17 10:59:33,523 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(right)] under right; prior registration was null
2026-11-17T13:59:43.6639213Z 2026-11-17 10:59:33,523 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(replace)] under replace; prior registration was null
2026-11-17T13:59:43.6639621Z 2026-11-17 10:59:33,524 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(concat)] under concat; prior registration was null
2026-11-17T13:59:43.6640021Z 2026-11-17 10:59:33,524 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(lower)] under lower; prior registration was null
2026-11-17T13:59:43.6640458Z 2026-11-17 10:59:33,524 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(upper)] under upper; prior registration was null
2026-11-17T13:59:43.6640870Z 2026-11-17 10:59:33,524 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(substring)] under substring; prior registration was null
2026-11-17T13:59:43.6641285Z 2026-11-17 10:59:33,524 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(locate)] under locate; prior registration was null
2026-11-17T13:59:43.6641713Z 2026-11-17 10:59:33,524 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(character_length)] under character_length; prior registration was null
2026-11-17T13:59:43.6642088Z 2026-11-17 10:59:33,524 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : length -> character_length
2026-11-17T13:59:43.6642475Z 2026-11-17 10:59:33,524 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.LocatePositionEmulation@50decdbc] under position; prior registration was null
2026-11-17T13:59:43.6642947Z 2026-11-17 10:59:33,526 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.InsertSubstringOverlayEmulation@3eecbf50] under overlay; prior registration was null
2026-11-17T13:59:43.6643429Z 2026-11-17 10:59:33,526 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.TrimFunction@776dc736] under trim; prior registration was null
2026-11-17T13:59:43.6643863Z 2026-11-17 10:59:33,527 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CastFunction@30bd5122] under cast; prior registration was null
2026-11-17T13:59:43.6644376Z 2026-11-17 10:59:33,527 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@218a6db6] under collate; prior registration was null
2026-11-17T13:59:43.6644845Z 2026-11-17 10:59:33,528 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.ExtractFunction@67bf2b36] under extract; prior registration was null
2026-11-17T13:59:43.6645262Z 2026-11-17 10:59:33,528 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(least)] under least; prior registration was null
2026-11-17T13:59:43.6645675Z 2026-11-17 10:59:33,528 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(greatest)] under greatest; prior registration was null
2026-11-17T13:59:43.6646116Z 2026-11-17 10:59:33,528 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CoalesceIfnullEmulation@6395a739] under ifnull; prior registration was null
2026-11-17T13:59:43.6646602Z 2026-11-17 10:59:33,528 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(lpad)] under lpad; prior registration was null
2026-11-17T13:59:43.6647047Z 2026-11-17 10:59:33,528 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(rpad)] under rpad; prior registration was null
2026-11-17T13:59:43.6647599Z 2026-11-17 10:59:33,528 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.LpadRpadPadEmulation@2a424fd5] under pad; prior registration was null
2026-11-17T13:59:43.6648100Z 2026-11-17 10:59:33,529 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CastStrEmulation@252a95ac] under str; prior registration was null
2026-11-17T13:59:43.6648545Z 2026-11-17 10:59:33,531 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.FormatFunction@45e406e0] under format; prior registration was null
2026-11-17T13:59:43.6648993Z 2026-11-17 10:59:33,532 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.TimestampaddFunction@5136531f] under timestampadd; prior registration was null
2026-11-17T13:59:43.6649455Z 2026-11-17 10:59:33,532 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.TimestampdiffFunction@7378c99a] under timestampdiff; prior registration was null
2026-11-17T13:59:43.6649838Z 2026-11-17 10:59:33,533 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : dateadd -> timestampadd
2026-11-17T13:59:43.6650181Z 2026-11-17 10:59:33,533 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : datediff -> timestampdiff
2026-11-17T13:59:43.6650595Z 2026-11-17 10:59:33,533 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@6126004c] under current_date; prior registration was null
2026-11-17T13:59:43.6651047Z 2026-11-17 10:59:33,533 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@77d4e977] under current_time; prior registration was null
2026-11-17T13:59:43.6651498Z 2026-11-17 10:59:33,533 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@6c8e121b] under current_timestamp; prior registration was null
2026-11-17T13:59:43.6651879Z 2026-11-17 10:59:33,533 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : current date -> current_date
2026-11-17T13:59:43.6652224Z 2026-11-17 10:59:33,533 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : current time -> current_time
2026-11-17T13:59:43.6652546Z 2026-11-17 10:59:33,533 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : current timestamp -> current_timestamp
2026-11-17T13:59:43.6652965Z 2026-11-17 10:59:33,533 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@35cdf0b8] under local_date; prior registration was null
2026-11-17T13:59:43.6653418Z 2026-11-17 10:59:33,533 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@55e9eef4] under local_time; prior registration was null
2026-11-17T13:59:43.6653874Z 2026-11-17 10:59:33,533 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@6575160f] under local_datetime; prior registration was null
2026-11-17T13:59:43.6654473Z 2026-11-17 10:59:33,533 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@396e4d5b] under offset_datetime; prior registration was null
2026-11-17T13:59:43.6654862Z 2026-11-17 10:59:33,533 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : local date -> local_date
2026-11-17T13:59:43.6655202Z 2026-11-17 10:59:33,533 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : local time -> local_time
2026-11-17T13:59:43.6655599Z 2026-11-17 10:59:33,533 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : local datetime -> local_datetime
2026-11-17T13:59:43.6655948Z 2026-11-17 10:59:33,533 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : offset datetime -> offset_datetime
2026-11-17T13:59:43.6656366Z 2026-11-17 10:59:33,533 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@4436b0e7] under instant; prior registration was null
2026-11-17T13:59:43.6656741Z 2026-11-17 10:59:33,533 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : current_instant -> instant
2026-11-17T13:59:43.6657146Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.SqlFunction@2f142038] under sql; prior registration was null
2026-11-17T13:59:43.6657568Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(cot)] under cot; prior registration was null
2026-11-17T13:59:43.6657995Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(log)] under ln; prior registration was NamedSqmFunctionTemplate(ln)
2026-11-17T13:59:43.6658530Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@4fe5a577] under log; prior registration was org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@7de04ffc
2026-11-17T13:59:43.6658996Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(log10)] under log10; prior registration was null
2026-11-17T13:59:43.6659439Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(atn2)] under atan2; prior registration was NamedSqmFunctionTemplate(atan2)
2026-11-17T13:59:43.6659927Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@738fd004] under mod; prior registration was NamedSqmFunctionTemplate(mod)
2026-11-17T13:59:43.6660380Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(square)] under square; prior registration was null
2026-11-17T13:59:43.6660793Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(rand)] under rand; prior registration was null
2026-11-17T13:59:43.6661205Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(radians)] under radians; prior registration was null
2026-11-17T13:59:43.6661619Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(degrees)] under degrees; prior registration was null
2026-11-17T13:59:43.6662133Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(pi)] under pi; prior registration was org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@52562ad5
2026-11-17T13:59:43.6662576Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(reverse)] under reverse; prior registration was null
2026-11-17T13:59:43.6663022Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(space)] under space; prior registration was null
2026-11-17T13:59:43.6663717Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.MultipatternSqmFunctionDescriptor@746db4a1] under lpad; prior registration was NamedSqmFunctionTemplate(lpad)
2026-11-17T13:59:43.6664312Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.MultipatternSqmFunctionDescriptor@1677069e] under rpad; prior registration was NamedSqmFunctionTemplate(rpad)
2026-11-17T13:59:43.6664846Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(day)] under day; prior registration was null
2026-11-17T13:59:43.6665325Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(month)] under month; prior registration was null
2026-11-17T13:59:43.6665741Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(year)] under year; prior registration was null
2026-11-17T13:59:43.6666229Z 2026-11-17 10:59:33,534 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(ascii)] under ascii; prior registration was null
2026-11-17T13:59:43.6666676Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(char)] under char; prior registration was null
2026-11-17T13:59:43.6667073Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : chr -> char
2026-11-17T13:59:43.6667480Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(ltrim)] under ltrim; prior registration was null
2026-11-17T13:59:43.6667886Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(rtrim)] under rtrim; prior registration was null
2026-11-17T13:59:43.6668302Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(replicate)] under replicate; prior registration was null
2026-11-17T13:59:43.6668660Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : repeat -> replicate
2026-11-17T13:59:43.6669089Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(len)] under character_length; prior registration was NamedSqmFunctionTemplate(character_length)
2026-11-17T13:59:43.6669485Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : len -> character_length
2026-11-17T13:59:43.6669906Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : length -> character_length
2026-11-17T13:59:43.6670368Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.MultipatternSqmFunctionDescriptor@3fa5579c] under substring; prior registration was NamedSqmFunctionTemplate(substring)
2026-11-17T13:59:43.6670825Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(datepart)] under datepart; prior registration was null
2026-11-17T13:59:43.6671291Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(datename)] under datename; prior registration was null
2026-11-17T13:59:43.6671711Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(eomonth)] under eomonth; prior registration was null
2026-11-17T13:59:43.6672072Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : last_date -> eomonth
2026-11-17T13:59:43.6672494Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@68a05b4] under bitand; prior registration was null
2026-11-17T13:59:43.6672968Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@76b7dd30] under bitor; prior registration was null
2026-11-17T13:59:43.6673438Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@1586f28] under bitxor; prior registration was null
2026-11-17T13:59:43.6673903Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@65635848] under bitnot; prior registration was null
2026-11-17T13:59:43.6674451Z 2026-11-17 10:59:33,535 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CaseLeastGreatestEmulation@782502c1] under least; prior registration was NamedSqmFunctionTemplate(least)
2026-11-17T13:59:43.6674969Z 2026-11-17 10:59:33,536 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CaseLeastGreatestEmulation@4b93eb75] under greatest; prior registration was NamedSqmFunctionTemplate(greatest)
2026-11-17T13:59:43.6675497Z 2026-11-17 10:59:33,536 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.TransactSQLStrFunction@927aa13] under str; prior registration was org.hibernate.dialect.function.CastStrEmulation@252a95ac
2026-11-17T13:59:43.6676041Z 2026-11-17 10:59:33,536 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CastingConcatFunction@24c9c8ce] under concat; prior registration was NamedSqmFunctionTemplate(concat)
2026-11-17T13:59:43.6676568Z 2026-11-17 10:59:33,537 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CountFunction@48add738] under count; prior registration was org.hibernate.dialect.function.CountFunction@1187e494
2026-11-17T13:59:43.6677055Z 2026-11-17 10:59:33,537 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.AvgFunction@2c285f1e] under avg; prior registration was NamedSqmFunctionTemplate(avg)
2026-11-17T13:59:43.6677635Z 2026-11-17 10:59:33,537 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@35428d01] under log; prior registration was org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@4fe5a577
2026-11-17T13:59:43.6678195Z 2026-11-17 10:59:33,537 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.MultipatternSqmFunctionDescriptor@4a348116] under round; prior registration was NamedSqmFunctionTemplate(round)
2026-11-17T13:59:43.6678745Z 2026-11-17 10:59:33,537 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.SQLServerEveryAnyEmulation@46ea6da3] under every; prior registration was org.hibernate.dialect.function.EveryAnyEmulation@2882eb4c
2026-11-17T13:59:43.6679274Z 2026-11-17 10:59:33,537 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.SQLServerEveryAnyEmulation@7106f3f9] under any; prior registration was org.hibernate.dialect.function.EveryAnyEmulation@32d78b93
2026-11-17T13:59:43.6679775Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@72c0082b] under octet_length; prior registration was null
2026-11-17T13:59:43.6680252Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@4e4215c9] under bit_length; prior registration was null
2026-11-17T13:59:43.6680692Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(charindex)] under charindex; prior registration was null
2026-11-17T13:59:43.6681084Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : locate -> charindex
2026-11-17T13:59:43.6681628Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(stdev)] under stdev; prior registration was null
2026-11-17T13:59:43.6682063Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(stdevp)] under stdevp; prior registration was null
2026-11-17T13:59:43.6682482Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : stddev_samp -> stdev
2026-11-17T13:59:43.6682811Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : stddev_pop -> stdevp
2026-11-17T13:59:43.6683193Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(var)] under var; prior registration was null
2026-11-17T13:59:43.6683591Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(varp)] under varp; prior registration was null
2026-11-17T13:59:43.6683941Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : var_samp -> var
2026-11-17T13:59:43.6684340Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : var_pop -> varp
2026-11-17T13:59:43.6684778Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.SQLServerFormatEmulation@5b1f5bbe] under format; prior registration was org.hibernate.dialect.function.FormatFunction@45e406e0
2026-11-17T13:59:43.6685322Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(translate)] under translate; prior registration was null
2026-11-17T13:59:43.6685782Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@4e4a1eef] under median; prior registration was null
2026-11-17T13:59:43.6686256Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(datefromparts)] under datefromparts; prior registration was null
2026-11-17T13:59:43.6686698Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(timefromparts)] under timefromparts; prior registration was null
2026-11-17T13:59:43.6687151Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(smalldatetimefromparts)] under smalldatetimefromparts; prior registration was null
2026-11-17T13:59:43.6687607Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(datetimefromparts)] under datetimefromparts; prior registration was null
2026-11-17T13:59:43.6688051Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(datetime2fromparts)] under datetime2fromparts; prior registration was null
2026-11-17T13:59:43.6688513Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(datetimeoffsetfromparts)] under datetimeoffsetfromparts; prior registration was null
2026-11-17T13:59:43.6688949Z 2026-11-17 10:59:33,538 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(row_number)] under row_number; prior registration was null
2026-11-17T13:59:43.6689358Z 2026-11-17 10:59:33,539 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(lag)] under lag; prior registration was null
2026-11-17T13:59:43.6689758Z 2026-11-17 10:59:33,539 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(lead)] under lead; prior registration was null
2026-11-17T13:59:43.6690181Z 2026-11-17 10:59:33,539 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(first_value)] under first_value; prior registration was null
2026-11-17T13:59:43.6690608Z 2026-11-17 10:59:33,539 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(last_value)] under last_value; prior registration was null
2026-11-17T13:59:43.6691027Z 2026-11-17 10:59:33,539 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(nth_value)] under nth_value; prior registration was null
2026-11-17T13:59:43.6691695Z 2026-11-17 10:59:33,541 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.InverseDistributionWindowEmulation@2e70f8] under percentile_cont; prior registration was null
2026-11-17T13:59:43.6692209Z 2026-11-17 10:59:33,541 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.InverseDistributionWindowEmulation@5860c681] under percentile_disc; prior registration was null
2026-11-17T13:59:43.6692727Z 2026-11-17 10:59:33,542 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.HypotheticalSetWindowEmulation@37065112] under rank; prior registration was null
2026-11-17T13:59:43.6693197Z 2026-11-17 10:59:33,542 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.HypotheticalSetWindowEmulation@308451ae] under dense_rank; prior registration was null
2026-11-17T13:59:43.6693668Z 2026-11-17 10:59:33,542 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.HypotheticalSetWindowEmulation@1021aaa4] under percent_rank; prior registration was null
2026-11-17T13:59:43.6694160Z 2026-11-17 10:59:33,543 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.HypotheticalSetWindowEmulation@3903f019] under cume_dist; prior registration was null
2026-11-17T13:59:43.6694735Z 2026-11-17 10:59:33,546 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.SqlServerConvertTruncFunction@2b637cc1] under trunc; prior registration was null
2026-11-17T13:59:43.6695112Z 2026-11-17 10:59:33,546 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : truncate -> trunc
2026-11-17T13:59:43.6695408Z 2026-11-17 10:59:33,551 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) abs(NUMERIC arg)
2026-11-17T13:59:43.6695695Z 2026-11-17 10:59:33,551 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double acos(NUMERIC arg)
2026-11-17T13:59:43.6695946Z 2026-11-17 10:59:33,551 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Boolean any(BOOLEAN arg)
2026-11-17T13:59:43.6696230Z 2026-11-17 10:59:33,551 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer ascii(STRING arg)
2026-11-17T13:59:43.6696520Z 2026-11-17 10:59:33,551 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double asin(NUMERIC arg)
2026-11-17T13:59:43.6696802Z 2026-11-17 10:59:33,551 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double atan(NUMERIC arg)
2026-11-17T13:59:43.6697098Z 2026-11-17 10:59:33,551 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double atan2(NUMERIC arg0, NUMERIC arg1)
2026-11-17T13:59:43.6697382Z 2026-11-17 10:59:33,551 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) avg(NUMERIC arg)
2026-11-17T13:59:43.6697674Z 2026-11-17 10:59:33,551 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer bit_length(STRING_OR_CLOB arg)
2026-11-17T13:59:43.6697967Z 2026-11-17 10:59:33,551 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) bitand(arg0, arg1)
2026-11-17T13:59:43.6698237Z 2026-11-17 10:59:33,551 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) bitnot(arg)
2026-11-17T13:59:43.6698509Z 2026-11-17 10:59:33,551 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) bitor(arg0, arg1)
2026-11-17T13:59:43.6698789Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) bitxor(arg0, arg1)
2026-11-17T13:59:43.6699060Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) cast(arg as Type)
2026-11-17T13:59:43.6699302Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) ceiling(NUMERIC arg)
2026-11-17T13:59:43.6699591Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Character char(INTEGER arg)
2026-11-17T13:59:43.6699892Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer character_length(STRING_OR_CLOB arg)
2026-11-17T13:59:43.6700229Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer charindex(STRING pattern, STRING string[, INTEGER start])
2026-11-17T13:59:43.6700529Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Character chr(INTEGER arg)
2026-11-17T13:59:43.6700817Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) coalesce(arg0[, arg1[, ...]])
2026-11-17T13:59:43.6701185Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String collate(STRING string as COLLATION collation)
2026-11-17T13:59:43.6701490Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String concat(arg0[, arg1[, ...]])
2026-11-17T13:59:43.6701770Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double cos(NUMERIC arg)
2026-11-17T13:59:43.6702053Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double cosh(NUMERIC arg)
2026-11-17T13:59:43.6702330Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double cot(NUMERIC arg)
2026-11-17T13:59:43.6702642Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long count([distinct ]{arg|*})
2026-11-17T13:59:43.6702928Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double cume_dist([arg0[, ...]])
2026-11-17T13:59:43.6703186Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Date current date
2026-11-17T13:59:43.6703424Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Time current time
2026-11-17T13:59:43.6703681Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Timestamp current timestamp
2026-11-17T13:59:43.6703928Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Date current_date
2026-11-17T13:59:43.6704178Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Instant current_instant
2026-11-17T13:59:43.6704532Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Time current_time
2026-11-17T13:59:43.6704787Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Timestamp current_timestamp
2026-11-17T13:59:43.6705080Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) dateadd(TEMPORAL_UNIT field, INTEGER magnitude, TEMPORAL datetime)
2026-11-17T13:59:43.6705401Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long|Double datediff(TEMPORAL_UNIT field, TEMPORAL start, TEMPORAL end)
2026-11-17T13:59:43.6705710Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Date datefromparts(INTEGER arg0, INTEGER arg1, INTEGER arg2)
2026-11-17T13:59:43.6706004Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String datename(TEMPORAL_UNIT field, TEMPORAL arg)
2026-11-17T13:59:43.6706285Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) datepart(TEMPORAL_UNIT field, TEMPORAL arg)
2026-11-17T13:59:43.6706663Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Timestamp datetime2fromparts(INTEGER arg0, INTEGER arg1, INTEGER arg2, INTEGER arg3, INTEGER arg4, INTEGER arg5, INTEGER arg6, INTEGER arg7)
2026-11-17T13:59:43.6707061Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Timestamp datetimefromparts(INTEGER arg0, INTEGER arg1, INTEGER arg2, INTEGER arg3, INTEGER arg4, INTEGER arg5, INTEGER arg6)
2026-11-17T13:59:43.6707499Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Timestamp datetimeoffsetfromparts(INTEGER arg0, INTEGER arg1, INTEGER arg2, INTEGER arg3, INTEGER arg4, INTEGER arg5, INTEGER arg6, INTEGER arg7, INTEGER arg8, INTEGER arg9)
2026-11-17T13:59:43.6707820Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer day(DATE arg)
2026-11-17T13:59:43.6708077Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double degrees(NUMERIC arg)
2026-11-17T13:59:43.6708328Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long dense_rank([arg0[, ...]])
2026-11-17T13:59:43.6708599Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Date eomonth(DATE arg0[, INTEGER arg1])
2026-11-17T13:59:43.6708860Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Boolean every(BOOLEAN arg)
2026-11-17T13:59:43.6709160Z 2026-11-17 10:59:33,552 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double exp(NUMERIC arg)
2026-11-17T13:59:43.6709435Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) extract(TEMPORAL_UNIT field from TEMPORAL arg)
2026-11-17T13:59:43.6709696Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) first_valueANY value
2026-11-17T13:59:43.6709940Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) floor(NUMERIC arg)
2026-11-17T13:59:43.6710212Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String format(TEMPORAL datetime as STRING pattern)
2026-11-17T13:59:43.6710540Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) greatest(COMPARABLE arg0[, COMPARABLE arg1[, ...]])
2026-11-17T13:59:43.6710799Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) ifnull(arg0, arg1)
2026-11-17T13:59:43.6711048Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Instant instant
2026-11-17T13:59:43.6711314Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) lagANY value[, INTEGER offset[, ANY default]]
2026-11-17T13:59:43.6711596Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Date last_date(DATE arg0[, INTEGER arg1])
2026-11-17T13:59:43.6711854Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) last_valueANY value
2026-11-17T13:59:43.6712118Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) leadANY value[, INTEGER offset[, ANY default]]
2026-11-17T13:59:43.6712402Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) least(COMPARABLE arg0[, COMPARABLE arg1[, ...]])
2026-11-17T13:59:43.6712676Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String left(STRING string, INTEGER length)
2026-11-17T13:59:43.6712940Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer len(STRING_OR_CLOB arg)
2026-11-17T13:59:43.6713203Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer length(STRING_OR_CLOB arg)
2026-11-17T13:59:43.6713456Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double ln(NUMERIC arg)
2026-11-17T13:59:43.6713704Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) LocalDate local date
2026-11-17T13:59:43.6713959Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) LocalDateTime local datetime
2026-11-17T13:59:43.6714270Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) LocalTime local time
2026-11-17T13:59:43.6714531Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) LocalDate local_date
2026-11-17T13:59:43.6714782Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) LocalDateTime local_datetime
2026-11-17T13:59:43.6715036Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) LocalTime local_time
2026-11-17T13:59:43.6715309Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer locate(STRING pattern, STRING string[, INTEGER start])
2026-11-17T13:59:43.6715700Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double log(NUMERIC base, NUMERIC arg)
2026-11-17T13:59:43.6715963Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double log10(NUMERIC arg)
2026-11-17T13:59:43.6716220Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String lower(STRING string)
2026-11-17T13:59:43.6716487Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String lpad(string, length[, padding])
2026-11-17T13:59:43.6716749Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String ltrim(STRING string)
2026-11-17T13:59:43.6717000Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) max(COMPARABLE arg)
2026-11-17T13:59:43.6717314Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double median(NUMERIC arg)
2026-11-17T13:59:43.6717659Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) min(COMPARABLE arg)
2026-11-17T13:59:43.6718054Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer mod(INTEGER arg0, INTEGER arg1)
2026-11-17T13:59:43.6718317Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer month(DATE arg)
2026-11-17T13:59:43.6718578Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) nth_valueANY value, INTEGER nth
2026-11-17T13:59:43.6718881Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) nullif(arg0, arg1)
2026-11-17T13:59:43.6719136Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer octet_length(STRING_OR_CLOB arg)
2026-11-17T13:59:43.6719403Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) OffsetDateTime offset datetime
2026-11-17T13:59:43.6719665Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) OffsetDateTime offset_datetime
2026-11-17T13:59:43.6719990Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String overlay(STRING string placing STRING replacement from INTEGER start[ for INTEGER length])
2026-11-17T13:59:43.6720333Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String pad(STRING string with INTEGER length {leading|trailing}[ STRING character])
2026-11-17T13:59:43.6720624Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double percent_rank([arg0[, ...]])
2026-11-17T13:59:43.6720886Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) percentile_cont(NUMERIC arg)
2026-11-17T13:59:43.6721146Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) percentile_disc(NUMERIC arg)
2026-11-17T13:59:43.6721398Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double pi
2026-11-17T13:59:43.6721670Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer position(STRING pattern in STRING string)
2026-11-17T13:59:43.6721949Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double power(NUMERIC arg0, NUMERIC arg1)
2026-11-17T13:59:43.6722213Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double radians(NUMERIC arg)
2026-11-17T13:59:43.6722471Z 2026-11-17 10:59:33,553 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double rand([INTEGER seed])
2026-11-17T13:59:43.6722727Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long rank([arg0[, ...]])
2026-11-17T13:59:43.6722989Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String repeat(STRING string, INTEGER times)
2026-11-17T13:59:43.6723290Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String replace(STRING string, STRING pattern, STRING replacement)
2026-11-17T13:59:43.6723585Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String replicate(STRING string, INTEGER times)
2026-11-17T13:59:43.6723852Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String reverse(STRING arg)
2026-11-17T13:59:43.6724122Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String right(STRING string, INTEGER length)
2026-11-17T13:59:43.6724563Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) round(NUMERIC number[, INTEGER places])
2026-11-17T13:59:43.6724819Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long row_number()
2026-11-17T13:59:43.6725082Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String rpad(string, length[, padding])
2026-11-17T13:59:43.6725343Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String rtrim(STRING string)
2026-11-17T13:59:43.6725661Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer sign(NUMERIC arg)
2026-11-17T13:59:43.6725916Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double sin(NUMERIC arg)
2026-11-17T13:59:43.6726169Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double sinh(NUMERIC arg)
2026-11-17T13:59:43.6726501Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Timestamp smalldatetimefromparts(INTEGER arg0, INTEGER arg1, INTEGER arg2, INTEGER arg3, INTEGER arg4)
2026-11-17T13:59:43.6726793Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String space(INTEGER arg)
2026-11-17T13:59:43.6727066Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Object sql
2026-11-17T13:59:43.6727316Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double sqrt(NUMERIC arg)
2026-11-17T13:59:43.6727567Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) square(NUMERIC arg)
2026-11-17T13:59:43.6727823Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double stddev_pop(NUMERIC arg)
2026-11-17T13:59:43.6728087Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double stddev_samp(NUMERIC arg)
2026-11-17T13:59:43.6728342Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double stdev(NUMERIC arg)
2026-11-17T13:59:43.6728597Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double stdevp(NUMERIC arg)
2026-11-17T13:59:43.6728857Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String str(arg0[, arg1, arg2])
2026-11-17T13:59:43.6729163Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String substring(STRING string{ from|,} INTEGER start[{ for|,} INTEGER length])
2026-11-17T13:59:43.6729428Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) sum(arg)
2026-11-17T13:59:43.6729674Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double tan(NUMERIC arg)
2026-11-17T13:59:43.6729925Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double tanh(NUMERIC arg)
2026-11-17T13:59:43.6730239Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Time timefromparts(INTEGER arg0, INTEGER arg1, INTEGER arg2, INTEGER arg3, INTEGER arg4)
2026-11-17T13:59:43.6730561Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) timestampadd(TEMPORAL_UNIT field, INTEGER magnitude, TEMPORAL datetime)
2026-11-17T13:59:43.6730885Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long|Double timestampdiff(TEMPORAL_UNIT field, TEMPORAL start, TEMPORAL end)
2026-11-17T13:59:43.6731192Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String translate(STRING arg0, STRING arg1, STRING arg2)
2026-11-17T13:59:43.6731506Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String trim([[{leading|trailing|both} ][STRING arg0 ]from] STRING arg1)
2026-11-17T13:59:43.6731775Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) trunc( ... )
2026-11-17T13:59:43.6732016Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) truncate( ... )
2026-11-17T13:59:43.6732274Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String upper(STRING string)
2026-11-17T13:59:43.6732668Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double var(NUMERIC arg)
2026-11-17T13:59:43.6732934Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double var_pop(NUMERIC arg)
2026-11-17T13:59:43.6733192Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double var_samp(NUMERIC arg)
2026-11-17T13:59:43.6733444Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double varp(NUMERIC arg)
2026-11-17T13:59:43.6733740Z 2026-11-17 10:59:33,554 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer year(DATE arg)
2026-11-17T13:59:43.6734013Z 2026-11-17 10:59:33,559 DEBUG [org.hib.orm.que.pla.cache] (JPA Startup Thread) Starting QueryInterpretationCache(2048)
2026-11-17T13:59:43.6734518Z 2026-11-17 10:59:33,658 DEBUG [org.hib.ser.int.SessionFactoryServiceRegistryImpl] (JPA Startup Thread) EventListenerRegistry access via ServiceRegistry is deprecated.  Use `sessionFactory.getEventEngine().getListenerRegistry()` instead
2026-11-17T13:59:43.6734915Z 2026-11-17 10:59:33,659 DEBUG [org.hib.eve.int.EntityCopyObserverFactoryInitiator] (JPA Startup Thread) Configured EntityCopyObserver strategy: disallow
2026-11-17T13:59:43.6735312Z 2026-11-17 10:59:33,793 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection (re)creation - br.com.caixa.sifap.entity.Farmacia.situacoes
2026-11-17T13:59:43.6735787Z 2026-11-17 10:59:33,794 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection row deletions - br.com.caixa.sifap.entity.Farmacia.situacoes
2026-11-17T13:59:43.6736124Z 2026-11-17 10:59:33,794 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection removals - br.com.caixa.sifap.entity.Farmacia.situacoes
2026-11-17T13:59:43.6736473Z 2026-11-17 10:59:33,794 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection (re)creation - br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise
2026-11-17T13:59:43.6736830Z 2026-11-17 10:59:33,795 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection row deletions - br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise
2026-11-17T13:59:43.6737185Z 2026-11-17 10:59:33,795 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection removals - br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise
2026-11-17T13:59:43.6737532Z 2026-11-17 10:59:33,795 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection (re)creation - br.com.caixa.sifap.entity.Farmacia.representacoesTecnica
2026-11-17T13:59:43.6737888Z 2026-11-17 10:59:33,795 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection row deletions - br.com.caixa.sifap.entity.Farmacia.representacoesTecnica
2026-11-17T13:59:43.6738235Z 2026-11-17 10:59:33,795 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection removals - br.com.caixa.sifap.entity.Farmacia.representacoesTecnica
2026-11-17T13:59:43.6738581Z 2026-11-17 10:59:33,795 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection (re)creation - br.com.caixa.sifap.entity.Farmacia.representacoes
2026-11-17T13:59:43.6738997Z 2026-11-17 10:59:33,795 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection row deletions - br.com.caixa.sifap.entity.Farmacia.representacoes
2026-11-17T13:59:43.6739341Z 2026-11-17 10:59:33,795 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Skipping collection removals - br.com.caixa.sifap.entity.Farmacia.representacoes
2026-11-17T13:59:43.6739638Z 2026-11-17 10:59:33,851 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting post-init callbacks
2026-11-17T13:59:43.6739987Z 2026-11-17 10:59:33,851 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.Farmaceutico) `staticFetchableList` generator
2026-11-17T13:59:43.6740391Z 2026-11-17 10:59:33,852 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia]
2026-11-17T13:59:43.6740799Z 2026-11-17 10:59:33,858 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante]
2026-11-17T13:59:43.6741212Z 2026-11-17 10:59:33,858 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.RepresentacaoFarmacia) `staticFetchableList` generator
2026-11-17T13:59:43.6741666Z 2026-11-17 10:59:33,859 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia]
2026-11-17T13:59:43.6742057Z 2026-11-17 10:59:33,859 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao]
2026-11-17T13:59:43.6742447Z 2026-11-17 10:59:33,859 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.SituacaoFarmacia) `staticFetchableList` generator
2026-11-17T13:59:43.6742968Z 2026-11-17 10:59:33,859 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.TipoDocumentoFarmacia) `staticFetchableList` generator
2026-11-17T13:59:43.6743379Z 2026-11-17 10:59:33,859 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : EmbeddableMappingType(br.com.caixa.sifap.entity.HistoricoAnaliseDocumento#{id})#finishInitialization
2026-11-17T13:59:43.6743791Z 2026-11-17 10:59:33,859 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.tipoDocumento]
2026-11-17T13:59:43.6744256Z 2026-11-17 10:59:33,860 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.HistoricoAnaliseDocumento) `staticFetchableList` generator
2026-11-17T13:59:43.6744664Z 2026-11-17 10:59:33,860 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.ControleDocumento.farmacia]
2026-11-17T13:59:43.6745056Z 2026-11-17 10:59:33,860 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.ControleDocumento.tipoDocumento]
2026-11-17T13:59:43.6745453Z 2026-11-17 10:59:33,860 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.ControleDocumento) `staticFetchableList` generator
2026-11-17T13:59:43.6745843Z 2026-11-17 10:59:33,860 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico]
2026-11-17T13:59:43.6746227Z 2026-11-17 10:59:33,860 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia]
2026-11-17T13:59:43.6746620Z 2026-11-17 10:59:33,860 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.RepresentacaoTecnica) `staticFetchableList` generator
2026-11-17T13:59:43.6747102Z 2026-11-17 10:59:33,860 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.ItemValidacao) `staticFetchableList` generator
2026-11-17T13:59:43.6747584Z 2026-11-17 10:59:33,860 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.TipoSituacaoFarmacia) `staticFetchableList` generator
2026-11-17T13:59:43.6747981Z 2026-11-17 10:59:33,860 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.RepresentanteFarmacia) `staticFetchableList` generator
2026-11-17T13:59:43.6748369Z 2026-11-17 10:59:33,860 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.Farmacia.farmaciaMatriz]
2026-11-17T13:59:43.6748792Z 2026-11-17 10:59:33,860 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping( NavigableRole[br.com.caixa.sifap.entity.Farmacia.representacoes#{element}]) - element descriptor
2026-11-17T13:59:43.6749299Z 2026-11-17 10:59:33,860 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping(br.com.caixa.sifap.entity.Farmacia.representacoes)#finishInitialization
2026-11-17T13:59:43.6749695Z 2026-11-17 10:59:33,860 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping(br.com.caixa.sifap.entity.Farmacia.representacoes) - key descriptor
2026-11-17T13:59:43.6750133Z 2026-11-17 10:59:33,860 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping( NavigableRole[br.com.caixa.sifap.entity.Farmacia.representacoesTecnica#{element}]) - element descriptor
2026-11-17T13:59:43.6750618Z 2026-11-17 10:59:33,860 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping(br.com.caixa.sifap.entity.Farmacia.representacoesTecnica)#finishInitialization
2026-11-17T13:59:43.6751037Z 2026-11-17 10:59:33,860 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping(br.com.caixa.sifap.entity.Farmacia.representacoesTecnica) - key descriptor
2026-11-17T13:59:43.6751458Z 2026-11-17 10:59:33,860 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping( NavigableRole[br.com.caixa.sifap.entity.Farmacia.situacoes#{element}]) - element descriptor
2026-11-17T13:59:43.6751872Z 2026-11-17 10:59:33,861 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping(br.com.caixa.sifap.entity.Farmacia.situacoes)#finishInitialization
2026-11-17T13:59:43.6752323Z 2026-11-17 10:59:33,861 DEBUG [org.hib.met.map.int.PluralAttributeMappingImpl] (JPA Startup Thread) Translating order-by fragment [dhSituacaoFarmacia DESC, nuSituacaoFarmacia DESC] for collection role : br.com.caixa.sifap.entity.Farmacia.situacoes
2026-11-17T13:59:43.6752738Z 2026-11-17 10:59:33,915 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping(br.com.caixa.sifap.entity.Farmacia.situacoes) - key descriptor
2026-11-17T13:59:43.6753119Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.Farmacia) `staticFetchableList` generator
2026-11-17T13:59:43.6753543Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping( NavigableRole[br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise#{element}]) - element descriptor
2026-11-17T13:59:43.6753966Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping(br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise)#finishInitialization
2026-11-17T13:59:43.6754444Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping(br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise) - key descriptor
2026-11-17T13:59:43.6754849Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento]
2026-11-17T13:59:43.6755240Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.AnaliseDocumento) `staticFetchableList` generator
2026-11-17T13:59:43.6755627Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.SqlMappings) `staticFetchableList` generator
2026-11-17T13:59:43.6756013Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.FarmaciaAuxiliar) `staticFetchableList` generator
2026-11-17T13:59:43.6756440Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.TipoDocumento) `staticFetchableList` generator
2026-11-17T13:59:43.6756841Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento]
2026-11-17T13:59:43.6757249Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.ItemAnaliseDocumento.tipoDocumentoItemValidacao]
2026-11-17T13:59:43.6757684Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.ItemAnaliseDocumento) `staticFetchableList` generator
2026-11-17T13:59:43.6758090Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.itemValidacao]
2026-11-17T13:59:43.6758492Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : To-one key - NavigableRole[br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.tipoDocumento]
2026-11-17T13:59:43.6758901Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.com.caixa.sifap.entity.TipoDocumentoItemValidacao) `staticFetchableList` generator
2026-11-17T13:59:43.6759335Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping( NavigableRole[br.com.caixa.sifap.entity.Farmacia.representacoes#{element}]) - element descriptor
2026-11-17T13:59:43.6759793Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping( NavigableRole[br.com.caixa.sifap.entity.Farmacia.representacoesTecnica#{element}]) - element descriptor
2026-11-17T13:59:43.6760236Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping( NavigableRole[br.com.caixa.sifap.entity.Farmacia.situacoes#{element}]) - element descriptor
2026-11-17T13:59:43.6760676Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : PluralAttributeMapping( NavigableRole[br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise#{element}]) - element descriptor
2026-11-17T13:59:43.6761110Z 2026-11-17 10:59:33,916 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : EmbeddableMappingType(br.com.caixa.sifap.entity.HistoricoAnaliseDocumento#{id})#initColumnMappings
2026-11-17T13:59:43.6761437Z 2026-11-17 10:59:34,020 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-11-17T13:59:43.6761890Z 2026-11-17 10:59:34,022 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmaceutico)] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmaceutico] for NavigablePath [br.com.caixa.sifap.entity.Farmaceutico] 
2026-11-17T13:59:43.6762242Z 2026-11-17 10:59:34,036 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6762468Z  \-EntityResultImpl [br.com.caixa.sifap.entity.Farmaceutico]
2026-11-17T13:59:43.6762700Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.coIdentificacaoFarmaceutico]
2026-11-17T13:59:43.6762932Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.coUsuarioAcaoFarmaceutico]
2026-11-17T13:59:43.6763163Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.deEnderecoIpFarmaceutico]
2026-11-17T13:59:43.6763420Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.dtVencimentoRegistro]
2026-11-17T13:59:43.6763640Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.icTipoAcao]
2026-11-17T13:59:43.6763877Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.nuCpfFarmaceutico]
2026-11-17T13:59:43.6764107Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.sgIdentificacaoFarmaceutico]
2026-11-17T13:59:43.6764400Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.tsFimVigenciaFarmaceutico]
2026-11-17T13:59:43.6764632Z  |  \-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.tsInicioVigenciaFrmco]
2026-11-17T13:59:43.6764751Z 
2026-11-17T13:59:43.6764965Z 2026-11-17 10:59:34,050 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6765113Z     SelectStatement {
2026-11-17T13:59:43.6765219Z       FromClause {
2026-11-17T13:59:43.6765355Z         StandardTableGroup (f1 : br.com.caixa.sifap.entity.Farmaceutico) {
2026-11-17T13:59:43.6765524Z           primaryTableReference : FAPDB001.dbo.FAPTB004_FARMACEUTICO as f1_0
2026-11-17T13:59:43.6765642Z         }
2026-11-17T13:59:43.6765730Z       }
2026-11-17T13:59:43.6765819Z     }
2026-11-17T13:59:43.6765855Z 
2026-11-17T13:59:43.6766185Z 2026-11-17 10:59:34,059 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.Farmaceutico` entity using padded IN-list : 16 (16)
2026-11-17T13:59:43.6766512Z 2026-11-17 10:59:34,060 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-11-17T13:59:43.6766972Z 2026-11-17 10:59:34,060 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmaceutico)] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmaceutico] for NavigablePath [br.com.caixa.sifap.entity.Farmaceutico] 
2026-11-17T13:59:43.6767340Z 2026-11-17 10:59:34,062 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6767565Z  \-EntityResultImpl [br.com.caixa.sifap.entity.Farmaceutico]
2026-11-17T13:59:43.6767794Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.coIdentificacaoFarmaceutico]
2026-11-17T13:59:43.6768033Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.coUsuarioAcaoFarmaceutico]
2026-11-17T13:59:43.6768262Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.deEnderecoIpFarmaceutico]
2026-11-17T13:59:43.6768485Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.dtVencimentoRegistro]
2026-11-17T13:59:43.6768701Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.icTipoAcao]
2026-11-17T13:59:43.6768932Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.nuCpfFarmaceutico]
2026-11-17T13:59:43.6769158Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.sgIdentificacaoFarmaceutico]
2026-11-17T13:59:43.6769378Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.tsFimVigenciaFarmaceutico]
2026-11-17T13:59:43.6769603Z  |  \-BasicFetch [br.com.caixa.sifap.entity.Farmaceutico.tsInicioVigenciaFrmco]
2026-11-17T13:59:43.6769681Z 
2026-11-17T13:59:43.6769887Z 2026-11-17 10:59:34,062 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6770026Z     SelectStatement {
2026-11-17T13:59:43.6770133Z       FromClause {
2026-11-17T13:59:43.6770268Z         StandardTableGroup (f1 : br.com.caixa.sifap.entity.Farmaceutico) {
2026-11-17T13:59:43.6770425Z           primaryTableReference : FAPDB001.dbo.FAPTB004_FARMACEUTICO as f1_0
2026-11-17T13:59:43.6770546Z         }
2026-11-17T13:59:43.6770633Z       }
2026-11-17T13:59:43.6770723Z     }
2026-11-17T13:59:43.6770762Z 
2026-11-17T13:59:43.6771030Z 2026-11-17 10:59:34,063 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.Farmaceutico
2026-11-17T13:59:43.6771413Z 2026-11-17 10:59:34,064 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_FARMACEUTICO from FAPDB001.dbo.FAPTB004_FARMACEUTICO where NU_FARMACEUTICO=?
2026-11-17T13:59:43.6772068Z 2026-11-17 10:59:34,064 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB004_FARMACEUTICO (CO_IDENTIFICACAO_FARMACEUTICO,CO_USUARIO_ACAO_FARMACEUTICO,DE_ENDERECO_IP_FARMACEUTICO,DT_VENCIMENTO_REGISTRO,IC_TIPO_ACAO,NU_CPF_FARMACEUTICO,SG_IDENTIFICACAO_FARMACEUTICO,TS_FIM_VIGENCIA_FARMACEUTICO,TS_INICIO_VIGENCIA_FRMCO) values (?,?,?,?,?,?,?,?,?)
2026-11-17T13:59:43.6772774Z 2026-11-17 10:59:34,064 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB004_FARMACEUTICO set CO_IDENTIFICACAO_FARMACEUTICO=?,CO_USUARIO_ACAO_FARMACEUTICO=?,DE_ENDERECO_IP_FARMACEUTICO=?,DT_VENCIMENTO_REGISTRO=?,IC_TIPO_ACAO=?,NU_CPF_FARMACEUTICO=?,SG_IDENTIFICACAO_FARMACEUTICO=?,TS_FIM_VIGENCIA_FARMACEUTICO=?,TS_INICIO_VIGENCIA_FRMCO=? where NU_FARMACEUTICO=?
2026-11-17T13:59:43.6773285Z 2026-11-17 10:59:34,064 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB004_FARMACEUTICO where NU_FARMACEUTICO=?
2026-11-17T13:59:43.6773588Z 2026-11-17 10:59:34,064 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : rf1_0
2026-11-17T13:59:43.6774140Z 2026-11-17 10:59:34,064 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.RepresentacaoFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoFarmacia] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoFarmacia] 
2026-11-17T13:59:43.6774837Z 2026-11-17 10:59:34,074 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@5bc0a6bf] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia] 
2026-11-17T13:59:43.6775227Z 2026-11-17 10:59:34,077 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-11-17T13:59:43.6775735Z 2026-11-17 10:59:34,079 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@7f3b7c3d] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.farmaciaMatriz] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.farmaciaMatriz] 
2026-11-17T13:59:43.6776350Z 2026-11-17 10:59:34,082 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@7edf0e5b] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante] 
2026-11-17T13:59:43.6776734Z 2026-11-17 10:59:34,082 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : r1_0
2026-11-17T13:59:43.6776990Z 2026-11-17 10:59:34,082 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6777218Z  \-EntityResultImpl [br.com.caixa.sifap.entity.RepresentacaoFarmacia]
2026-11-17T13:59:43.6777455Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.coUsuarioAcaoRepresentacao]
2026-11-17T13:59:43.6777697Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.deEmailRepresentante]
2026-11-17T13:59:43.6777939Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.deEnderecoIpRepresentacao]
2026-11-17T13:59:43.6778175Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.dtFimRepresentacao]
2026-11-17T13:59:43.6778410Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.dtInicioRepresentacao]
2026-11-17T13:59:43.6778649Z  |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia]
2026-11-17T13:59:43.6778896Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.coCnpjEstabelecimentoLegado]
2026-11-17T13:59:43.6779208Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.coLicencaFuncionamento]
2026-11-17T13:59:43.6779452Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.coProcessoSei]
2026-11-17T13:59:43.6779697Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.coUsuarioAcaoFarmacia]
2026-11-17T13:59:43.6779945Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.deEmailFarmacia]
2026-11-17T13:59:43.6780190Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.deEnderecoIpFarmacia]
2026-11-17T13:59:43.6780520Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.dhAtualizacaoFarmacia]
2026-11-17T13:59:43.6780776Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.dhSubmissaoSlctoCadastro]
2026-11-17T13:59:43.6781108Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.dtVencimentoCnd]
2026-11-17T13:59:43.6781368Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.dtVencimentoLicencaFncmo]
2026-11-17T13:59:43.6781626Z  |  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.farmaciaMatriz]
2026-11-17T13:59:43.6781875Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.icEfetuaVenda]
2026-11-17T13:59:43.6782121Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.icEmissaoFiscalEletronico]
2026-11-17T13:59:43.6782365Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.icTipoAcao]
2026-11-17T13:59:43.6782616Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.noTitularidadeContaCredito]
2026-11-17T13:59:43.6782856Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuAgencia]
2026-11-17T13:59:43.6783087Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuBanco]
2026-11-17T13:59:43.6783331Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuCnpjEstabelecimento]
2026-11-17T13:59:43.6783569Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuConta]
2026-11-17T13:59:43.6783808Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuDddAlternativo]
2026-11-17T13:59:43.6784048Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuDddPrincipal]
2026-11-17T13:59:43.6784353Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuDvAgencia]
2026-11-17T13:59:43.6784595Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuDvConta]
2026-11-17T13:59:43.6784836Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuIbgeMunicipio]
2026-11-17T13:59:43.6785064Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuInscricaoInss]
2026-11-17T13:59:43.6785314Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuRegistroJuntaComercial]
2026-11-17T13:59:43.6785571Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuTelefoneAlternativo]
2026-11-17T13:59:43.6785817Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuTelefonePrincipal]
2026-11-17T13:59:43.6786058Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuTipoConta]
2026-11-17T13:59:43.6786306Z  |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.representacoes]
2026-11-17T13:59:43.6786575Z  |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.representacoesTecnica]
2026-11-17T13:59:43.6786824Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.sgUfFarmacia]
2026-11-17T13:59:43.6787068Z  |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.situacoes]
2026-11-17T13:59:43.6787368Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.tsFimVigenciaFarmacia]
2026-11-17T13:59:43.6787623Z  |  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.tsInicioVigenciaFarmacia]
2026-11-17T13:59:43.6787862Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.icResponsavelLegal]
2026-11-17T13:59:43.6788082Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.icTipoAcao]
2026-11-17T13:59:43.6788307Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.nuDddRepresentante]
2026-11-17T13:59:43.6788544Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.nuTelefoneRepresentante]
2026-11-17T13:59:43.6788820Z  |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante]
2026-11-17T13:59:43.6789080Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.coUsuarioAcaoRepresentante]
2026-11-17T13:59:43.6789342Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.deEnderecoIpRepresentante]
2026-11-17T13:59:43.6789638Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.icTipoAcao]
2026-11-17T13:59:43.6789986Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.nuCpfRepresentante]
2026-11-17T13:59:43.6790241Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.tsFimVigenciaRprse]
2026-11-17T13:59:43.6790539Z  |  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.tsInicioVigenciaRprse]
2026-11-17T13:59:43.6790832Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.tsFimPeriodo]
2026-11-17T13:59:43.6791063Z  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.tsInicioPeriodo]
2026-11-17T13:59:43.6791141Z 
2026-11-17T13:59:43.6791409Z 2026-11-17 10:59:34,087 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6791568Z     SelectStatement {
2026-11-17T13:59:43.6791672Z       FromClause {
2026-11-17T13:59:43.6791804Z         StandardTableGroup (rf1 : br.com.caixa.sifap.entity.RepresentacaoFarmacia) {
2026-11-17T13:59:43.6791968Z           primaryTableReference : FAPDB001.dbo.FAPTB011_RPRTO_FARMACIA as rf1_0
2026-11-17T13:59:43.6792134Z           TableGroupJoins {
2026-11-17T13:59:43.6792327Z              join LazyTableGroup (f1 : br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia) {
2026-11-17T13:59:43.6792497Z               primaryTableReference : FAPDB001.dbo.FAPTB001_FARMACIA as f1_0
2026-11-17T13:59:43.6792626Z               TableGroupJoins {
2026-11-17T13:59:43.6792784Z                 left  join LazyTableGroup (fm1 : br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.farmaciaMatriz) {
2026-11-17T13:59:43.6792940Z                 }
2026-11-17T13:59:43.6793085Z               }
2026-11-17T13:59:43.6793193Z             }
2026-11-17T13:59:43.6793398Z              join LazyTableGroup (r1 : br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante) {
2026-11-17T13:59:43.6793627Z               primaryTableReference : FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA as r1_0
2026-11-17T13:59:43.6793796Z             }
2026-11-17T13:59:43.6793929Z           }
2026-11-17T13:59:43.6794067Z         }
2026-11-17T13:59:43.6794257Z       }
2026-11-17T13:59:43.6794351Z     }
2026-11-17T13:59:43.6794397Z 
2026-11-17T13:59:43.6794708Z 2026-11-17 10:59:34,091 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.RepresentacaoFarmacia` entity using padded IN-list : 16 (16)
2026-11-17T13:59:43.6795023Z 2026-11-17 10:59:34,091 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : rf1_0
2026-11-17T13:59:43.6795507Z 2026-11-17 10:59:34,091 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.RepresentacaoFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoFarmacia] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoFarmacia] 
2026-11-17T13:59:43.6796185Z 2026-11-17 10:59:34,091 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@45cd0692] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia] 
2026-11-17T13:59:43.6796571Z 2026-11-17 10:59:34,091 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-11-17T13:59:43.6797083Z 2026-11-17 10:59:34,091 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@5adffdd2] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.farmaciaMatriz] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.farmaciaMatriz] 
2026-11-17T13:59:43.6797742Z 2026-11-17 10:59:34,092 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@61b33d19] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante] 
2026-11-17T13:59:43.6798117Z 2026-11-17 10:59:34,092 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : r1_0
2026-11-17T13:59:43.6798374Z 2026-11-17 10:59:34,092 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6798605Z  \-EntityResultImpl [br.com.caixa.sifap.entity.RepresentacaoFarmacia]
2026-11-17T13:59:43.6798842Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.coUsuarioAcaoRepresentacao]
2026-11-17T13:59:43.6799077Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.deEmailRepresentante]
2026-11-17T13:59:43.6799326Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.deEnderecoIpRepresentacao]
2026-11-17T13:59:43.6799563Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.dtFimRepresentacao]
2026-11-17T13:59:43.6799797Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.dtInicioRepresentacao]
2026-11-17T13:59:43.6800028Z  |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia]
2026-11-17T13:59:43.6800285Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.coCnpjEstabelecimentoLegado]
2026-11-17T13:59:43.6800543Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.coLicencaFuncionamento]
2026-11-17T13:59:43.6800790Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.coProcessoSei]
2026-11-17T13:59:43.6801036Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.coUsuarioAcaoFarmacia]
2026-11-17T13:59:43.6801279Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.deEmailFarmacia]
2026-11-17T13:59:43.6801525Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.deEnderecoIpFarmacia]
2026-11-17T13:59:43.6801776Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.dhAtualizacaoFarmacia]
2026-11-17T13:59:43.6802018Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.dhSubmissaoSlctoCadastro]
2026-11-17T13:59:43.6802261Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.dtVencimentoCnd]
2026-11-17T13:59:43.6802509Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.dtVencimentoLicencaFncmo]
2026-11-17T13:59:43.6802760Z  |  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.farmaciaMatriz]
2026-11-17T13:59:43.6803004Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.icEfetuaVenda]
2026-11-17T13:59:43.6803251Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.icEmissaoFiscalEletronico]
2026-11-17T13:59:43.6803520Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.icTipoAcao]
2026-11-17T13:59:43.6803873Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.noTitularidadeContaCredito]
2026-11-17T13:59:43.6804117Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuAgencia]
2026-11-17T13:59:43.6804526Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuBanco]
2026-11-17T13:59:43.6804775Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuCnpjEstabelecimento]
2026-11-17T13:59:43.6805014Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuConta]
2026-11-17T13:59:43.6805298Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuDddAlternativo]
2026-11-17T13:59:43.6805542Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuDddPrincipal]
2026-11-17T13:59:43.6805779Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuDvAgencia]
2026-11-17T13:59:43.6806054Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuDvConta]
2026-11-17T13:59:43.6806307Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuIbgeMunicipio]
2026-11-17T13:59:43.6806613Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuInscricaoInss]
2026-11-17T13:59:43.6806861Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuRegistroJuntaComercial]
2026-11-17T13:59:43.6807114Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuTelefoneAlternativo]
2026-11-17T13:59:43.6807365Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuTelefonePrincipal]
2026-11-17T13:59:43.6807599Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.nuTipoConta]
2026-11-17T13:59:43.6807848Z  |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.representacoes]
2026-11-17T13:59:43.6808122Z  |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.representacoesTecnica]
2026-11-17T13:59:43.6808362Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.sgUfFarmacia]
2026-11-17T13:59:43.6808611Z  |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.situacoes]
2026-11-17T13:59:43.6808865Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.tsFimVigenciaFarmacia]
2026-11-17T13:59:43.6809115Z  |  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.tsInicioVigenciaFarmacia]
2026-11-17T13:59:43.6809355Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.icResponsavelLegal]
2026-11-17T13:59:43.6809581Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.icTipoAcao]
2026-11-17T13:59:43.6809811Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.nuDddRepresentante]
2026-11-17T13:59:43.6810050Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.nuTelefoneRepresentante]
2026-11-17T13:59:43.6810289Z  |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante]
2026-11-17T13:59:43.6810546Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.coUsuarioAcaoRepresentante]
2026-11-17T13:59:43.6810809Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.deEnderecoIpRepresentante]
2026-11-17T13:59:43.6811057Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.icTipoAcao]
2026-11-17T13:59:43.6811296Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.nuCpfRepresentante]
2026-11-17T13:59:43.6811763Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.tsFimVigenciaRprse]
2026-11-17T13:59:43.6812018Z  |  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante.tsInicioVigenciaRprse]
2026-11-17T13:59:43.6812301Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.tsFimPeriodo]
2026-11-17T13:59:43.6812528Z  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoFarmacia.tsInicioPeriodo]
2026-11-17T13:59:43.6812605Z 
2026-11-17T13:59:43.6812814Z 2026-11-17 10:59:34,092 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6812957Z     SelectStatement {
2026-11-17T13:59:43.6813061Z       FromClause {
2026-11-17T13:59:43.6813200Z         StandardTableGroup (rf1 : br.com.caixa.sifap.entity.RepresentacaoFarmacia) {
2026-11-17T13:59:43.6813364Z           primaryTableReference : FAPDB001.dbo.FAPTB011_RPRTO_FARMACIA as rf1_0
2026-11-17T13:59:43.6813532Z           TableGroupJoins {
2026-11-17T13:59:43.6813753Z              join LazyTableGroup (f1 : br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia) {
2026-11-17T13:59:43.6813926Z               primaryTableReference : FAPDB001.dbo.FAPTB001_FARMACIA as f1_0
2026-11-17T13:59:43.6814052Z               TableGroupJoins {
2026-11-17T13:59:43.6814264Z                 left  join LazyTableGroup (fm1 : br.com.caixa.sifap.entity.RepresentacaoFarmacia.farmacia.farmaciaMatriz) {
2026-11-17T13:59:43.6814421Z                 }
2026-11-17T13:59:43.6814512Z               }
2026-11-17T13:59:43.6814604Z             }
2026-11-17T13:59:43.6814741Z              join LazyTableGroup (r1 : br.com.caixa.sifap.entity.RepresentacaoFarmacia.representante) {
2026-11-17T13:59:43.6814908Z               primaryTableReference : FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA as r1_0
2026-11-17T13:59:43.6815028Z             }
2026-11-17T13:59:43.6815111Z           }
2026-11-17T13:59:43.6815199Z         }
2026-11-17T13:59:43.6815287Z       }
2026-11-17T13:59:43.6815374Z     }
2026-11-17T13:59:43.6815409Z 
2026-11-17T13:59:43.6815691Z 2026-11-17 10:59:34,092 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.RepresentacaoFarmacia
2026-11-17T13:59:43.6816098Z 2026-11-17 10:59:34,092 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_REPRESENTACAO_FARMACIA from FAPDB001.dbo.FAPTB011_RPRTO_FARMACIA where NU_REPRESENTACAO_FARMACIA=?
2026-11-17T13:59:43.6816743Z 2026-11-17 10:59:34,092 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB011_RPRTO_FARMACIA (CO_USUARIO_ACAO_REPRESENTACAO,DE_EMAIL_REPRESENTANTE,DE_ENDERECO_IP_REPRESENTACAO,DT_FIM_REPRESENTACAO,DT_INICIO_REPRESENTACAO,NU_FARMACIA,IC_RESPONSAVEL_LEGAL,IC_TIPO_ACAO,NU_DDD_REPRESENTANTE,NU_TELEFONE_REPRESENTANTE,NU_REPRESENTANTE_FARMACIA,TS_FIM_PERIODO,TS_INICIO_PERIODO) values (?,?,?,?,?,?,?,?,?,?,?,?,?)
2026-11-17T13:59:43.6817538Z 2026-11-17 10:59:34,092 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB011_RPRTO_FARMACIA set CO_USUARIO_ACAO_REPRESENTACAO=?,DE_EMAIL_REPRESENTANTE=?,DE_ENDERECO_IP_REPRESENTACAO=?,DT_FIM_REPRESENTACAO=?,DT_INICIO_REPRESENTACAO=?,NU_FARMACIA=?,IC_RESPONSAVEL_LEGAL=?,IC_TIPO_ACAO=?,NU_DDD_REPRESENTANTE=?,NU_TELEFONE_REPRESENTANTE=?,NU_REPRESENTANTE_FARMACIA=?,TS_FIM_PERIODO=?,TS_INICIO_PERIODO=? where NU_REPRESENTACAO_FARMACIA=?
2026-11-17T13:59:43.6818074Z 2026-11-17 10:59:34,093 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB011_RPRTO_FARMACIA where NU_REPRESENTACAO_FARMACIA=?
2026-11-17T13:59:43.6818385Z 2026-11-17 10:59:34,093 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : sf1_0
2026-11-17T13:59:43.6818843Z 2026-11-17 10:59:34,093 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.SituacaoFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.SituacaoFarmacia] for NavigablePath [br.com.caixa.sifap.entity.SituacaoFarmacia] 
2026-11-17T13:59:43.6819420Z 2026-11-17 10:59:34,093 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@404bc800] with identifierForTableGroup [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia] for NavigablePath [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia] 
2026-11-17T13:59:43.6819836Z 2026-11-17 10:59:34,093 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-11-17T13:59:43.6820336Z 2026-11-17 10:59:34,093 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@517e81fa] with identifierForTableGroup [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.farmaciaMatriz] for NavigablePath [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.farmaciaMatriz] 
2026-11-17T13:59:43.6820956Z 2026-11-17 10:59:34,093 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@150e2f60] with identifierForTableGroup [br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao] for NavigablePath [br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao] 
2026-11-17T13:59:43.6821327Z 2026-11-17 10:59:34,093 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : ts1_0
2026-11-17T13:59:43.6821581Z 2026-11-17 10:59:34,094 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6821798Z  \-EntityResultImpl [br.com.caixa.sifap.entity.SituacaoFarmacia]
2026-11-17T13:59:43.6822015Z  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.coUsuarioAcaoSituacao]
2026-11-17T13:59:43.6822248Z  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.coUsuarioAlteracaoSituacao]
2026-11-17T13:59:43.6822486Z  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.deJustificativaSituacao]
2026-11-17T13:59:43.6822713Z  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.dhSituacaoFarmacia]
2026-11-17T13:59:43.6822938Z  |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia]
2026-11-17T13:59:43.6823188Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.coCnpjEstabelecimentoLegado]
2026-11-17T13:59:43.6823439Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.coLicencaFuncionamento]
2026-11-17T13:59:43.6823679Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.coProcessoSei]
2026-11-17T13:59:43.6823924Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.coUsuarioAcaoFarmacia]
2026-11-17T13:59:43.6824163Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.deEmailFarmacia]
2026-11-17T13:59:43.6824477Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.deEnderecoIpFarmacia]
2026-11-17T13:59:43.6824717Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.dhAtualizacaoFarmacia]
2026-11-17T13:59:43.6824963Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.dhSubmissaoSlctoCadastro]
2026-11-17T13:59:43.6825208Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.dtVencimentoCnd]
2026-11-17T13:59:43.6825451Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.dtVencimentoLicencaFncmo]
2026-11-17T13:59:43.6825703Z  |  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.farmaciaMatriz]
2026-11-17T13:59:43.6825940Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.icEfetuaVenda]
2026-11-17T13:59:43.6826186Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.icEmissaoFiscalEletronico]
2026-11-17T13:59:43.6826422Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.icTipoAcao]
2026-11-17T13:59:43.6826663Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.noTitularidadeContaCredito]
2026-11-17T13:59:43.6826895Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuAgencia]
2026-11-17T13:59:43.6827116Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuBanco]
2026-11-17T13:59:43.6827394Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuCnpjEstabelecimento]
2026-11-17T13:59:43.6827613Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuConta]
2026-11-17T13:59:43.6827842Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuDddAlternativo]
2026-11-17T13:59:43.6828078Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuDddPrincipal]
2026-11-17T13:59:43.6828307Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuDvAgencia]
2026-11-17T13:59:43.6828533Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuDvConta]
2026-11-17T13:59:43.6828796Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuIbgeMunicipio]
2026-11-17T13:59:43.6829029Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuInscricaoInss]
2026-11-17T13:59:43.6829271Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuRegistroJuntaComercial]
2026-11-17T13:59:43.6829516Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuTelefoneAlternativo]
2026-11-17T13:59:43.6830730Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuTelefonePrincipal]
2026-11-17T13:59:43.6830959Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuTipoConta]
2026-11-17T13:59:43.6831204Z  |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.representacoes]
2026-11-17T13:59:43.6831457Z  |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.representacoesTecnica]
2026-11-17T13:59:43.6831700Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.sgUfFarmacia]
2026-11-17T13:59:43.6831945Z  |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.situacoes]
2026-11-17T13:59:43.6832187Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.tsFimVigenciaFarmacia]
2026-11-17T13:59:43.6832434Z  |  |  \-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.tsInicioVigenciaFarmacia]
2026-11-17T13:59:43.6832657Z  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.icRenovacao]
2026-11-17T13:59:43.6832882Z  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.nuMotivoBloqueio]
2026-11-17T13:59:43.6833102Z  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.nuTipoSituacao]
2026-11-17T13:59:43.6833329Z  |  \-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao]
2026-11-17T13:59:43.6833574Z  |  |  \-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao.deTipoSituacaoFarmacia]
2026-11-17T13:59:43.6833656Z 
2026-11-17T13:59:43.6833860Z 2026-11-17 10:59:34,094 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6834003Z     SelectStatement {
2026-11-17T13:59:43.6834106Z       FromClause {
2026-11-17T13:59:43.6834292Z         StandardTableGroup (sf1 : br.com.caixa.sifap.entity.SituacaoFarmacia) {
2026-11-17T13:59:43.6834470Z           primaryTableReference : dbo.FAPTB002_SITUACAO_FARMACIA as sf1_0
2026-11-17T13:59:43.6834717Z           TableGroupJoins {
2026-11-17T13:59:43.6834860Z              join LazyTableGroup (f1 : br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia) {
2026-11-17T13:59:43.6835025Z               primaryTableReference : FAPDB001.dbo.FAPTB001_FARMACIA as f1_0
2026-11-17T13:59:43.6835158Z               TableGroupJoins {
2026-11-17T13:59:43.6835311Z                 left  join LazyTableGroup (fm1 : br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.farmaciaMatriz) {
2026-11-17T13:59:43.6835459Z                 }
2026-11-17T13:59:43.6835550Z               }
2026-11-17T13:59:43.6835632Z             }
2026-11-17T13:59:43.6835768Z              join LazyTableGroup (ts1 : br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao) {
2026-11-17T13:59:43.6835935Z               primaryTableReference : dbo.FAPTB003_TIPO_STCO_FARMACIA as ts1_0
2026-11-17T13:59:43.6836113Z             }
2026-11-17T13:59:43.6836204Z           }
2026-11-17T13:59:43.6836291Z         }
2026-11-17T13:59:43.6836380Z       }
2026-11-17T13:59:43.6836468Z     }
2026-11-17T13:59:43.6836503Z 
2026-11-17T13:59:43.6836790Z 2026-11-17 10:59:34,094 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.SituacaoFarmacia` entity using padded IN-list : 16 (16)
2026-11-17T13:59:43.6837090Z 2026-11-17 10:59:34,094 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : sf1_0
2026-11-17T13:59:43.6837555Z 2026-11-17 10:59:34,094 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.SituacaoFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.SituacaoFarmacia] for NavigablePath [br.com.caixa.sifap.entity.SituacaoFarmacia] 
2026-11-17T13:59:43.6838157Z 2026-11-17 10:59:34,094 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@3e060a46] with identifierForTableGroup [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia] for NavigablePath [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia] 
2026-11-17T13:59:43.6838650Z 2026-11-17 10:59:34,094 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-11-17T13:59:43.6839150Z 2026-11-17 10:59:34,094 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@1743a456] with identifierForTableGroup [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.farmaciaMatriz] for NavigablePath [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.farmaciaMatriz] 
2026-11-17T13:59:43.6839750Z 2026-11-17 10:59:34,095 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@154fd306] with identifierForTableGroup [br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao] for NavigablePath [br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao] 
2026-11-17T13:59:43.6840122Z 2026-11-17 10:59:34,095 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : ts1_0
2026-11-17T13:59:43.6840379Z 2026-11-17 10:59:34,095 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6840611Z  \-EntityResultImpl [br.com.caixa.sifap.entity.SituacaoFarmacia]
2026-11-17T13:59:43.6840954Z  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.coUsuarioAcaoSituacao]
2026-11-17T13:59:43.6841199Z  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.coUsuarioAlteracaoSituacao]
2026-11-17T13:59:43.6841431Z  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.deJustificativaSituacao]
2026-11-17T13:59:43.6841659Z  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.dhSituacaoFarmacia]
2026-11-17T13:59:43.6841885Z  |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia]
2026-11-17T13:59:43.6842133Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.coCnpjEstabelecimentoLegado]
2026-11-17T13:59:43.6842384Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.coLicencaFuncionamento]
2026-11-17T13:59:43.6842623Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.coProcessoSei]
2026-11-17T13:59:43.6842863Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.coUsuarioAcaoFarmacia]
2026-11-17T13:59:43.6843097Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.deEmailFarmacia]
2026-11-17T13:59:43.6843333Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.deEnderecoIpFarmacia]
2026-11-17T13:59:43.6843572Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.dhAtualizacaoFarmacia]
2026-11-17T13:59:43.6843813Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.dhSubmissaoSlctoCadastro]
2026-11-17T13:59:43.6844042Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.dtVencimentoCnd]
2026-11-17T13:59:43.6844396Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.dtVencimentoLicencaFncmo]
2026-11-17T13:59:43.6844651Z  |  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.farmaciaMatriz]
2026-11-17T13:59:43.6844889Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.icEfetuaVenda]
2026-11-17T13:59:43.6845132Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.icEmissaoFiscalEletronico]
2026-11-17T13:59:43.6845366Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.icTipoAcao]
2026-11-17T13:59:43.6845657Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.noTitularidadeContaCredito]
2026-11-17T13:59:43.6845890Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuAgencia]
2026-11-17T13:59:43.6846111Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuBanco]
2026-11-17T13:59:43.6846347Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuCnpjEstabelecimento]
2026-11-17T13:59:43.6846576Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuConta]
2026-11-17T13:59:43.6846805Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuDddAlternativo]
2026-11-17T13:59:43.6847176Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuDddPrincipal]
2026-11-17T13:59:43.6847480Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuDvAgencia]
2026-11-17T13:59:43.6847710Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuDvConta]
2026-11-17T13:59:43.6847943Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuIbgeMunicipio]
2026-11-17T13:59:43.6848172Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuInscricaoInss]
2026-11-17T13:59:43.6848412Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuRegistroJuntaComercial]
2026-11-17T13:59:43.6848657Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuTelefoneAlternativo]
2026-11-17T13:59:43.6848895Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuTelefonePrincipal]
2026-11-17T13:59:43.6849123Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.nuTipoConta]
2026-11-17T13:59:43.6849363Z  |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.representacoes]
2026-11-17T13:59:43.6849623Z  |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.representacoesTecnica]
2026-11-17T13:59:43.6849857Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.sgUfFarmacia]
2026-11-17T13:59:43.6850096Z  |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.situacoes]
2026-11-17T13:59:43.6850338Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.tsFimVigenciaFarmacia]
2026-11-17T13:59:43.6850579Z  |  |  \-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.tsInicioVigenciaFarmacia]
2026-11-17T13:59:43.6850807Z  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.icRenovacao]
2026-11-17T13:59:43.6851028Z  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.nuMotivoBloqueio]
2026-11-17T13:59:43.6851250Z  |  +-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.nuTipoSituacao]
2026-11-17T13:59:43.6851479Z  |  \-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao]
2026-11-17T13:59:43.6851741Z  |  |  \-BasicFetch [br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao.deTipoSituacaoFarmacia]
2026-11-17T13:59:43.6851825Z 
2026-11-17T13:59:43.6852029Z 2026-11-17 10:59:34,095 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6852172Z     SelectStatement {
2026-11-17T13:59:43.6852277Z       FromClause {
2026-11-17T13:59:43.6852414Z         StandardTableGroup (sf1 : br.com.caixa.sifap.entity.SituacaoFarmacia) {
2026-11-17T13:59:43.6852610Z           primaryTableReference : dbo.FAPTB002_SITUACAO_FARMACIA as sf1_0
2026-11-17T13:59:43.6852742Z           TableGroupJoins {
2026-11-17T13:59:43.6852884Z              join LazyTableGroup (f1 : br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia) {
2026-11-17T13:59:43.6853047Z               primaryTableReference : FAPDB001.dbo.FAPTB001_FARMACIA as f1_0
2026-11-17T13:59:43.6853179Z               TableGroupJoins {
2026-11-17T13:59:43.6853333Z                 left  join LazyTableGroup (fm1 : br.com.caixa.sifap.entity.SituacaoFarmacia.farmacia.farmaciaMatriz) {
2026-11-17T13:59:43.6853513Z                 }
2026-11-17T13:59:43.6853605Z               }
2026-11-17T13:59:43.6853697Z             }
2026-11-17T13:59:43.6853823Z              join LazyTableGroup (ts1 : br.com.caixa.sifap.entity.SituacaoFarmacia.tipoSituacao) {
2026-11-17T13:59:43.6853989Z               primaryTableReference : dbo.FAPTB003_TIPO_STCO_FARMACIA as ts1_0
2026-11-17T13:59:43.6854112Z             }
2026-11-17T13:59:43.6854262Z           }
2026-11-17T13:59:43.6854361Z         }
2026-11-17T13:59:43.6854527Z       }
2026-11-17T13:59:43.6854624Z     }
2026-11-17T13:59:43.6854660Z 
2026-11-17T13:59:43.6854933Z 2026-11-17 10:59:34,095 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.SituacaoFarmacia
2026-11-17T13:59:43.6855322Z 2026-11-17 10:59:34,095 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_SITUACAO_FARMACIA from dbo.FAPTB002_SITUACAO_FARMACIA where NU_SITUACAO_FARMACIA=?
2026-11-17T13:59:43.6855864Z 2026-11-17 10:59:34,095 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into dbo.FAPTB002_SITUACAO_FARMACIA (CO_USUARIO_ACAO_SITUACAO,CO_USUARIO_ALTERACAO_SITUACAO,DE_JUSTIFICATIVA_SITUACAO,DH_SITUACAO_FARMACIA,NU_FARMACIA,IC_RENOVACAO,NU_MOTIVO_BLOQUEIO,NU_TIPO_SITUACAO_FARMACIA) values (?,?,?,?,?,?,?,?)
2026-11-17T13:59:43.6856492Z 2026-11-17 10:59:34,095 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update dbo.FAPTB002_SITUACAO_FARMACIA set CO_USUARIO_ACAO_SITUACAO=?,CO_USUARIO_ALTERACAO_SITUACAO=?,DE_JUSTIFICATIVA_SITUACAO=?,DH_SITUACAO_FARMACIA=?,NU_FARMACIA=?,IC_RENOVACAO=?,NU_MOTIVO_BLOQUEIO=?,NU_TIPO_SITUACAO_FARMACIA=? where NU_SITUACAO_FARMACIA=?
2026-11-17T13:59:43.6856948Z 2026-11-17 10:59:34,095 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from dbo.FAPTB002_SITUACAO_FARMACIA where NU_SITUACAO_FARMACIA=?
2026-11-17T13:59:43.6857256Z 2026-11-17 10:59:34,095 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : tdf1_0
2026-11-17T13:59:43.6857734Z 2026-11-17 10:59:34,095 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.TipoDocumentoFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumentoFarmacia] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumentoFarmacia] 
2026-11-17T13:59:43.6858100Z 2026-11-17 10:59:34,095 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6858328Z  \-EntityResultImpl [br.com.caixa.sifap.entity.TipoDocumentoFarmacia]
2026-11-17T13:59:43.6858561Z  |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoFarmacia.coTipologiaDocumento]
2026-11-17T13:59:43.6858798Z  |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoFarmacia.deTipoDocumentoFarmacia]
2026-11-17T13:59:43.6859040Z  |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoFarmacia.icClasseTipoDocumento]
2026-11-17T13:59:43.6859280Z  |  \-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoFarmacia.icDocumentoObrigatorio]
2026-11-17T13:59:43.6859357Z 
2026-11-17T13:59:43.6859555Z 2026-11-17 10:59:34,096 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6859695Z     SelectStatement {
2026-11-17T13:59:43.6859797Z       FromClause {
2026-11-17T13:59:43.6859969Z         StandardTableGroup (tdf1 : br.com.caixa.sifap.entity.TipoDocumentoFarmacia) {
2026-11-17T13:59:43.6860129Z           primaryTableReference : dbo.FAPTB006_TIPO_DOCUMENTO as tdf1_0
2026-11-17T13:59:43.6860247Z         }
2026-11-17T13:59:43.6860332Z       }
2026-11-17T13:59:43.6860418Z     }
2026-11-17T13:59:43.6860454Z 
2026-11-17T13:59:43.6860732Z 2026-11-17 10:59:34,096 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.TipoDocumentoFarmacia` entity using padded IN-list : 16 (16)
2026-11-17T13:59:43.6861036Z 2026-11-17 10:59:34,096 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : tdf1_0
2026-11-17T13:59:43.6861544Z 2026-11-17 10:59:34,096 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.TipoDocumentoFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumentoFarmacia] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumentoFarmacia] 
2026-11-17T13:59:43.6861906Z 2026-11-17 10:59:34,096 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6862130Z  \-EntityResultImpl [br.com.caixa.sifap.entity.TipoDocumentoFarmacia]
2026-11-17T13:59:43.6862357Z  |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoFarmacia.coTipologiaDocumento]
2026-11-17T13:59:43.6862597Z  |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoFarmacia.deTipoDocumentoFarmacia]
2026-11-17T13:59:43.6862830Z  |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoFarmacia.icClasseTipoDocumento]
2026-11-17T13:59:43.6863063Z  |  \-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoFarmacia.icDocumentoObrigatorio]
2026-11-17T13:59:43.6863140Z 
2026-11-17T13:59:43.6863335Z 2026-11-17 10:59:34,096 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6863475Z     SelectStatement {
2026-11-17T13:59:43.6863576Z       FromClause {
2026-11-17T13:59:43.6863704Z         StandardTableGroup (tdf1 : br.com.caixa.sifap.entity.TipoDocumentoFarmacia) {
2026-11-17T13:59:43.6863866Z           primaryTableReference : dbo.FAPTB006_TIPO_DOCUMENTO as tdf1_0
2026-11-17T13:59:43.6863983Z         }
2026-11-17T13:59:43.6864067Z       }
2026-11-17T13:59:43.6864152Z     }
2026-11-17T13:59:43.6864236Z 
2026-11-17T13:59:43.6864519Z 2026-11-17 10:59:34,096 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.TipoDocumentoFarmacia
2026-11-17T13:59:43.6864897Z 2026-11-17 10:59:34,096 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_TIPO_DOCUMENTO from dbo.FAPTB006_TIPO_DOCUMENTO where NU_TIPO_DOCUMENTO=?
2026-11-17T13:59:43.6865368Z 2026-11-17 10:59:34,096 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into dbo.FAPTB006_TIPO_DOCUMENTO (CO_TIPOLOGIA_DOCUMENTO,DE_TIPO_DOCUMENTO_FARMACIA,IC_CLASSE_TIPO_DOCUMENTO,IC_DOCUMENTO_OBRIGATORIO,NU_TIPO_DOCUMENTO) values (?,?,?,?,?)
2026-11-17T13:59:43.6865888Z 2026-11-17 10:59:34,096 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update dbo.FAPTB006_TIPO_DOCUMENTO set CO_TIPOLOGIA_DOCUMENTO=?,DE_TIPO_DOCUMENTO_FARMACIA=?,IC_CLASSE_TIPO_DOCUMENTO=?,IC_DOCUMENTO_OBRIGATORIO=? where NU_TIPO_DOCUMENTO=?
2026-11-17T13:59:43.6866299Z 2026-11-17 10:59:34,096 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from dbo.FAPTB006_TIPO_DOCUMENTO where NU_TIPO_DOCUMENTO=?
2026-11-17T13:59:43.6866598Z 2026-11-17 10:59:34,096 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : had1_0
2026-11-17T13:59:43.6867088Z 2026-11-17 10:59:34,096 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.HistoricoAnaliseDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento] for NavigablePath [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento] 
2026-11-17T13:59:43.6867738Z 2026-11-17 10:59:34,098 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardVirtualTableGroup(br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.{id})] with identifierForTableGroup [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.{id}] for NavigablePath [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.{id}] 
2026-11-17T13:59:43.6868356Z 2026-11-17 10:59:34,099 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@63c4edeb] with identifierForTableGroup [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.tipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.tipoDocumento] 
2026-11-17T13:59:43.6868760Z 2026-11-17 10:59:34,100 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6868985Z  \-EntityResultImpl [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento]
2026-11-17T13:59:43.6869217Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.coCpfCnpjDocumento]
2026-11-17T13:59:43.6869458Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.coUsuarioAnaliseDocumento]
2026-11-17T13:59:43.6869692Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.deJustificativa]
2026-11-17T13:59:43.6869925Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.dhAnaliseDocumento]
2026-11-17T13:59:43.6870162Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.dhFimAnaliseDocumento]
2026-11-17T13:59:43.6870404Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.icAnaliseDocumento]
2026-11-17T13:59:43.6870640Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.icCpfCnpjDocumento]
2026-11-17T13:59:43.6870882Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.icUsuarioAnaliseDocumento]
2026-11-17T13:59:43.6871116Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.nuIdentificadorDocumento]
2026-11-17T13:59:43.6871355Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.nuTipoDocumento]
2026-11-17T13:59:43.6871596Z  |  \-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.tipoDocumento]
2026-11-17T13:59:43.6871680Z 
2026-11-17T13:59:43.6871878Z 2026-11-17 10:59:34,101 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6872011Z     SelectStatement {
2026-11-17T13:59:43.6872114Z       FromClause {
2026-11-17T13:59:43.6872254Z         StandardTableGroup (had1 : br.com.caixa.sifap.entity.HistoricoAnaliseDocumento) {
2026-11-17T13:59:43.6872425Z           primaryTableReference : FAPDB001.dbo.FAPTB119_HSTRO_ANLSE_DOCUMENTO as had1_0
2026-11-17T13:59:43.6872567Z           TableGroupJoins {
2026-11-17T13:59:43.6872716Z              join StandardVirtualTableGroup (null : br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.{id}) {
2026-11-17T13:59:43.6872891Z               primaryTableReference : FAPDB001.dbo.FAPTB119_HSTRO_ANLSE_DOCUMENTO as had1_0
2026-11-17T13:59:43.6873017Z             }
2026-11-17T13:59:43.6873160Z             left  join LazyTableGroup (td1 : br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.tipoDocumento) {
2026-11-17T13:59:43.6873287Z             }
2026-11-17T13:59:43.6873375Z           }
2026-11-17T13:59:43.6873465Z         }
2026-11-17T13:59:43.6873553Z       }
2026-11-17T13:59:43.6873642Z     }
2026-11-17T13:59:43.6873678Z 
2026-11-17T13:59:43.6873964Z 2026-11-17 10:59:34,101 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.HistoricoAnaliseDocumento` entity using padded IN-list : 16 (16)
2026-11-17T13:59:43.6874388Z 2026-11-17 10:59:34,101 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : had1_0
2026-11-17T13:59:43.6874892Z 2026-11-17 10:59:34,101 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.HistoricoAnaliseDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento] for NavigablePath [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento] 
2026-11-17T13:59:43.6875536Z 2026-11-17 10:59:34,101 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardVirtualTableGroup(br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.{id})] with identifierForTableGroup [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.{id}] for NavigablePath [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.{id}] 
2026-11-17T13:59:43.6876142Z 2026-11-17 10:59:34,101 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@1c5833e8] with identifierForTableGroup [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.tipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.tipoDocumento] 
2026-11-17T13:59:43.6876542Z 2026-11-17 10:59:34,101 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6876776Z  \-EntityResultImpl [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento]
2026-11-17T13:59:43.6877008Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.coCpfCnpjDocumento]
2026-11-17T13:59:43.6877249Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.coUsuarioAnaliseDocumento]
2026-11-17T13:59:43.6877486Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.deJustificativa]
2026-11-17T13:59:43.6877720Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.dhAnaliseDocumento]
2026-11-17T13:59:43.6877962Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.dhFimAnaliseDocumento]
2026-11-17T13:59:43.6878202Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.icAnaliseDocumento]
2026-11-17T13:59:43.6878439Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.icCpfCnpjDocumento]
2026-11-17T13:59:43.6878672Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.icUsuarioAnaliseDocumento]
2026-11-17T13:59:43.6878919Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.nuIdentificadorDocumento]
2026-11-17T13:59:43.6879153Z  |  +-BasicFetch [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.nuTipoDocumento]
2026-11-17T13:59:43.6879392Z  |  \-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.tipoDocumento]
2026-11-17T13:59:43.6879481Z 
2026-11-17T13:59:43.6879675Z 2026-11-17 10:59:34,101 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6879814Z     SelectStatement {
2026-11-17T13:59:43.6879921Z       FromClause {
2026-11-17T13:59:43.6880061Z         StandardTableGroup (had1 : br.com.caixa.sifap.entity.HistoricoAnaliseDocumento) {
2026-11-17T13:59:43.6880227Z           primaryTableReference : FAPDB001.dbo.FAPTB119_HSTRO_ANLSE_DOCUMENTO as had1_0
2026-11-17T13:59:43.6880364Z           TableGroupJoins {
2026-11-17T13:59:43.6880516Z              join StandardVirtualTableGroup (null : br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.{id}) {
2026-11-17T13:59:43.6880694Z               primaryTableReference : FAPDB001.dbo.FAPTB119_HSTRO_ANLSE_DOCUMENTO as had1_0
2026-11-17T13:59:43.6880820Z             }
2026-11-17T13:59:43.6880956Z             left  join LazyTableGroup (td1 : br.com.caixa.sifap.entity.HistoricoAnaliseDocumento.tipoDocumento) {
2026-11-17T13:59:43.6881097Z             }
2026-11-17T13:59:43.6881185Z           }
2026-11-17T13:59:43.6881271Z         }
2026-11-17T13:59:43.6881357Z       }
2026-11-17T13:59:43.6881444Z     }
2026-11-17T13:59:43.6881480Z 
2026-11-17T13:59:43.6881757Z 2026-11-17 10:59:34,102 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.HistoricoAnaliseDocumento
2026-11-17T13:59:43.6882199Z 2026-11-17 10:59:34,102 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_SQNCL_ANALISE_DOCUMENTO, TS_INICIO_PERIODO from FAPDB001.dbo.FAPTB119_HSTRO_ANLSE_DOCUMENTO where NU_SQNCL_ANALISE_DOCUMENTO=? and TS_INICIO_PERIODO=?
2026-11-17T13:59:43.6882910Z 2026-11-17 10:59:34,102 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB119_HSTRO_ANLSE_DOCUMENTO (CO_CPF_CNPJ_DOCUMENTO,CO_USUARIO_ANALISE_DOCUMENTO,DE_JUSTIFICATIVA,DH_ANALISE_DOCUMENTO,DH_FIM_ANALISE_DOCUMENTO,IC_ANALISE_DOCUMENTO,IC_CPF_CNPJ_DOCUMENTO,IC_USUARIO_ANALISE_DOCUMENTO,NU_IDENTIFICADOR_DOCUMENTO,NU_TIPO_DOCUMENTO,NU_SQNCL_ANALISE_DOCUMENTO,TS_INICIO_PERIODO) values (?,?,?,?,?,?,?,?,?,?,?,?)
2026-11-17T13:59:43.6883684Z 2026-11-17 10:59:34,102 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB119_HSTRO_ANLSE_DOCUMENTO set CO_CPF_CNPJ_DOCUMENTO=?,CO_USUARIO_ANALISE_DOCUMENTO=?,DE_JUSTIFICATIVA=?,DH_ANALISE_DOCUMENTO=?,DH_FIM_ANALISE_DOCUMENTO=?,IC_ANALISE_DOCUMENTO=?,IC_CPF_CNPJ_DOCUMENTO=?,IC_USUARIO_ANALISE_DOCUMENTO=?,NU_IDENTIFICADOR_DOCUMENTO=?,NU_TIPO_DOCUMENTO=? where NU_SQNCL_ANALISE_DOCUMENTO=? and TS_INICIO_PERIODO=?
2026-11-17T13:59:43.6884302Z 2026-11-17 10:59:34,102 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB119_HSTRO_ANLSE_DOCUMENTO where NU_SQNCL_ANALISE_DOCUMENTO=? and TS_INICIO_PERIODO=?
2026-11-17T13:59:43.6884651Z 2026-11-17 10:59:34,102 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : cd1_0
2026-11-17T13:59:43.6885120Z 2026-11-17 10:59:34,102 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.ControleDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.ControleDocumento] for NavigablePath [br.com.caixa.sifap.entity.ControleDocumento] 
2026-11-17T13:59:43.6885695Z 2026-11-17 10:59:34,102 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@45c46004] with identifierForTableGroup [br.com.caixa.sifap.entity.ControleDocumento.farmacia] for NavigablePath [br.com.caixa.sifap.entity.ControleDocumento.farmacia] 
2026-11-17T13:59:43.6886283Z 2026-11-17 10:59:34,102 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@4891a0ee] with identifierForTableGroup [br.com.caixa.sifap.entity.ControleDocumento.tipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.ControleDocumento.tipoDocumento] 
2026-11-17T13:59:43.6886664Z 2026-11-17 10:59:34,102 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6886887Z  \-EntityResultImpl [br.com.caixa.sifap.entity.ControleDocumento]
2026-11-17T13:59:43.6887108Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.dhEnvioDocumento]
2026-11-17T13:59:43.6887345Z  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.ControleDocumento.farmacia]
2026-11-17T13:59:43.6887573Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.icDocumentoLocal]
2026-11-17T13:59:43.6887796Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.nuFarmaceutico]
2026-11-17T13:59:43.6888012Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.nuFarmacia]
2026-11-17T13:59:43.6888246Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.nuRepresentanteFarmacia]
2026-11-17T13:59:43.6888476Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.nuTipoDocumento]
2026-11-17T13:59:43.6888710Z  |  \-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.ControleDocumento.tipoDocumento]
2026-11-17T13:59:43.6888788Z 
2026-11-17T13:59:43.6888995Z 2026-11-17 10:59:34,102 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6889141Z     SelectStatement {
2026-11-17T13:59:43.6889245Z       FromClause {
2026-11-17T13:59:43.6889384Z         StandardTableGroup (cd1 : br.com.caixa.sifap.entity.ControleDocumento) {
2026-11-17T13:59:43.6889545Z           primaryTableReference : FAPDB001.dbo.FAPTB014_CONTROLE_DOCUMENTO as cd1_0
2026-11-17T13:59:43.6889732Z           TableGroupJoins {
2026-11-17T13:59:43.6889877Z             left  join LazyTableGroup (f1 : br.com.caixa.sifap.entity.ControleDocumento.farmacia) {
2026-11-17T13:59:43.6890014Z             }
2026-11-17T13:59:43.6890151Z             left  join LazyTableGroup (td1 : br.com.caixa.sifap.entity.ControleDocumento.tipoDocumento) {
2026-11-17T13:59:43.6890287Z             }
2026-11-17T13:59:43.6890378Z           }
2026-11-17T13:59:43.6890466Z         }
2026-11-17T13:59:43.6890545Z       }
2026-11-17T13:59:43.6890636Z     }
2026-11-17T13:59:43.6890678Z 
2026-11-17T13:59:43.6890952Z 2026-11-17 10:59:34,102 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.ControleDocumento` entity using padded IN-list : 16 (16)
2026-11-17T13:59:43.6891295Z 2026-11-17 10:59:34,102 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : cd1_0
2026-11-17T13:59:43.6891783Z 2026-11-17 10:59:34,102 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.ControleDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.ControleDocumento] for NavigablePath [br.com.caixa.sifap.entity.ControleDocumento] 
2026-11-17T13:59:43.6892355Z 2026-11-17 10:59:34,102 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@26defae4] with identifierForTableGroup [br.com.caixa.sifap.entity.ControleDocumento.farmacia] for NavigablePath [br.com.caixa.sifap.entity.ControleDocumento.farmacia] 
2026-11-17T13:59:43.6892946Z 2026-11-17 10:59:34,102 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@8db33d9] with identifierForTableGroup [br.com.caixa.sifap.entity.ControleDocumento.tipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.ControleDocumento.tipoDocumento] 
2026-11-17T13:59:43.6893314Z 2026-11-17 10:59:34,102 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6893539Z  \-EntityResultImpl [br.com.caixa.sifap.entity.ControleDocumento]
2026-11-17T13:59:43.6893752Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.dhEnvioDocumento]
2026-11-17T13:59:43.6893980Z  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.ControleDocumento.farmacia]
2026-11-17T13:59:43.6894248Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.icDocumentoLocal]
2026-11-17T13:59:43.6894486Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.nuFarmaceutico]
2026-11-17T13:59:43.6894706Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.nuFarmacia]
2026-11-17T13:59:43.6894935Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.nuRepresentanteFarmacia]
2026-11-17T13:59:43.6895165Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ControleDocumento.nuTipoDocumento]
2026-11-17T13:59:43.6895399Z  |  \-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.ControleDocumento.tipoDocumento]
2026-11-17T13:59:43.6895477Z 
2026-11-17T13:59:43.6895679Z 2026-11-17 10:59:34,103 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6895821Z     SelectStatement {
2026-11-17T13:59:43.6895925Z       FromClause {
2026-11-17T13:59:43.6896124Z         StandardTableGroup (cd1 : br.com.caixa.sifap.entity.ControleDocumento) {
2026-11-17T13:59:43.6896299Z           primaryTableReference : FAPDB001.dbo.FAPTB014_CONTROLE_DOCUMENTO as cd1_0
2026-11-17T13:59:43.6896430Z           TableGroupJoins {
2026-11-17T13:59:43.6896576Z             left  join LazyTableGroup (f1 : br.com.caixa.sifap.entity.ControleDocumento.farmacia) {
2026-11-17T13:59:43.6896712Z             }
2026-11-17T13:59:43.6896848Z             left  join LazyTableGroup (td1 : br.com.caixa.sifap.entity.ControleDocumento.tipoDocumento) {
2026-11-17T13:59:43.6896977Z             }
2026-11-17T13:59:43.6897067Z           }
2026-11-17T13:59:43.6897156Z         }
2026-11-17T13:59:43.6897297Z       }
2026-11-17T13:59:43.6897375Z     }
2026-11-17T13:59:43.6897418Z 
2026-11-17T13:59:43.6897691Z 2026-11-17 10:59:34,103 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.ControleDocumento
2026-11-17T13:59:43.6898097Z 2026-11-17 10:59:34,103 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_CONTROLE_DOCUMENTO from FAPDB001.dbo.FAPTB014_CONTROLE_DOCUMENTO where NU_CONTROLE_DOCUMENTO=?
2026-11-17T13:59:43.6898591Z 2026-11-17 10:59:34,103 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB014_CONTROLE_DOCUMENTO (DH_ENVIO_DOCUMENTO,NU_FARMACIA,IC_DOCUMENTO_LOCAL,NU_FARMACEUTICO,NU_REPRESENTANTE_FARMACIA,NU_TIPO_DOCUMENTO) values (?,?,?,?,?,?)
2026-11-17T13:59:43.6899172Z 2026-11-17 10:59:34,103 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB014_CONTROLE_DOCUMENTO set DH_ENVIO_DOCUMENTO=?,NU_FARMACIA=?,IC_DOCUMENTO_LOCAL=?,NU_FARMACEUTICO=?,NU_REPRESENTANTE_FARMACIA=?,NU_TIPO_DOCUMENTO=? where NU_CONTROLE_DOCUMENTO=?
2026-11-17T13:59:43.6899611Z 2026-11-17 10:59:34,103 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB014_CONTROLE_DOCUMENTO where NU_CONTROLE_DOCUMENTO=?
2026-11-17T13:59:43.6899916Z 2026-11-17 10:59:34,103 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : rt1_0
2026-11-17T13:59:43.6900388Z 2026-11-17 10:59:34,103 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.RepresentacaoTecnica)] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoTecnica] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoTecnica] 
2026-11-17T13:59:43.6900983Z 2026-11-17 10:59:34,103 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@3d063440] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico] 
2026-11-17T13:59:43.6901361Z 2026-11-17 10:59:34,103 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-11-17T13:59:43.6901846Z 2026-11-17 10:59:34,103 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@26790341] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia] 
2026-11-17T13:59:43.6902222Z 2026-11-17 10:59:34,103 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f2_0
2026-11-17T13:59:43.6902725Z 2026-11-17 10:59:34,103 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@245aa2bc] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.farmaciaMatriz] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.farmaciaMatriz] 
2026-11-17T13:59:43.6903091Z 2026-11-17 10:59:34,104 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6903319Z  \-EntityResultImpl [br.com.caixa.sifap.entity.RepresentacaoTecnica]
2026-11-17T13:59:43.6903552Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.coUsuarioAcaoRepresentacao]
2026-11-17T13:59:43.6903789Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.deEnderecoIpRepresentacao]
2026-11-17T13:59:43.6904033Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.dtFimRepresentacao]
2026-11-17T13:59:43.6904321Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.dtInicioRepresentacao]
2026-11-17T13:59:43.6904580Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.dtVencimentoCertidaoRegularidade]
2026-11-17T13:59:43.6904865Z  |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico]
2026-11-17T13:59:43.6905126Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.coIdentificacaoFarmaceutico]
2026-11-17T13:59:43.6905400Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.coUsuarioAcaoFarmaceutico]
2026-11-17T13:59:43.6905669Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.deEnderecoIpFarmaceutico]
2026-11-17T13:59:43.6905934Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.dtVencimentoRegistro]
2026-11-17T13:59:43.6906236Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.icTipoAcao]
2026-11-17T13:59:43.6906488Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.nuCpfFarmaceutico]
2026-11-17T13:59:43.6906824Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.sgIdentificacaoFarmaceutico]
2026-11-17T13:59:43.6907085Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.tsFimVigenciaFarmaceutico]
2026-11-17T13:59:43.6907347Z  |  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.tsInicioVigenciaFrmco]
2026-11-17T13:59:43.6907590Z  |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia]
2026-11-17T13:59:43.6907845Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.coCnpjEstabelecimentoLegado]
2026-11-17T13:59:43.6908098Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.coLicencaFuncionamento]
2026-11-17T13:59:43.6908350Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.coProcessoSei]
2026-11-17T13:59:43.6908595Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.coUsuarioAcaoFarmacia]
2026-11-17T13:59:43.6908838Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.deEmailFarmacia]
2026-11-17T13:59:43.6909082Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.deEnderecoIpFarmacia]
2026-11-17T13:59:43.6909331Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.dhAtualizacaoFarmacia]
2026-11-17T13:59:43.6909577Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.dhSubmissaoSlctoCadastro]
2026-11-17T13:59:43.6909823Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.dtVencimentoCnd]
2026-11-17T13:59:43.6910062Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.dtVencimentoLicencaFncmo]
2026-11-17T13:59:43.6910324Z  |  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.farmaciaMatriz]
2026-11-17T13:59:43.6910571Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.icEfetuaVenda]
2026-11-17T13:59:43.6910817Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.icEmissaoFiscalEletronico]
2026-11-17T13:59:43.6911057Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.icTipoAcao]
2026-11-17T13:59:43.6911301Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.noTitularidadeContaCredito]
2026-11-17T13:59:43.6911540Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuAgencia]
2026-11-17T13:59:43.6911767Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuBanco]
2026-11-17T13:59:43.6912008Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuCnpjEstabelecimento]
2026-11-17T13:59:43.6912243Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuConta]
2026-11-17T13:59:43.6912480Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuDddAlternativo]
2026-11-17T13:59:43.6912718Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuDddPrincipal]
2026-11-17T13:59:43.6912982Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuDvAgencia]
2026-11-17T13:59:43.6913213Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuDvConta]
2026-11-17T13:59:43.6913451Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuIbgeMunicipio]
2026-11-17T13:59:43.6913690Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuInscricaoInss]
2026-11-17T13:59:43.6913933Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuRegistroJuntaComercial]
2026-11-17T13:59:43.6914228Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuTelefoneAlternativo]
2026-11-17T13:59:43.6914534Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuTelefonePrincipal]
2026-11-17T13:59:43.6914772Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuTipoConta]
2026-11-17T13:59:43.6915029Z  |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.representacoes]
2026-11-17T13:59:43.6915299Z  |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.representacoesTecnica]
2026-11-17T13:59:43.6915554Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.sgUfFarmacia]
2026-11-17T13:59:43.6915804Z  |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.situacoes]
2026-11-17T13:59:43.6916050Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.tsFimVigenciaFarmacia]
2026-11-17T13:59:43.6916302Z  |  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.tsInicioVigenciaFarmacia]
2026-11-17T13:59:43.6916538Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.icTipoAcao]
2026-11-17T13:59:43.6916763Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.tsFimPeriodo]
2026-11-17T13:59:43.6916990Z  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.tsInicioPeriodo]
2026-11-17T13:59:43.6917066Z 
2026-11-17T13:59:43.6917273Z 2026-11-17 10:59:34,104 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6917419Z     SelectStatement {
2026-11-17T13:59:43.6917524Z       FromClause {
2026-11-17T13:59:43.6917665Z         StandardTableGroup (rt1 : br.com.caixa.sifap.entity.RepresentacaoTecnica) {
2026-11-17T13:59:43.6917829Z           primaryTableReference : FAPDB001.dbo.FAPTB005_RPRSE_TECNICA as rt1_0
2026-11-17T13:59:43.6917963Z           TableGroupJoins {
2026-11-17T13:59:43.6918109Z              join LazyTableGroup (f1 : br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico) {
2026-11-17T13:59:43.6918283Z               primaryTableReference : FAPDB001.dbo.FAPTB004_FARMACEUTICO as f1_0
2026-11-17T13:59:43.6918399Z             }
2026-11-17T13:59:43.6918535Z              join LazyTableGroup (f2 : br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia) {
2026-11-17T13:59:43.6918700Z               primaryTableReference : FAPDB001.dbo.FAPTB001_FARMACIA as f2_0
2026-11-17T13:59:43.6918830Z               TableGroupJoins {
2026-11-17T13:59:43.6918986Z                 left  join LazyTableGroup (fm1 : br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.farmaciaMatriz) {
2026-11-17T13:59:43.6919131Z                 }
2026-11-17T13:59:43.6919221Z               }
2026-11-17T13:59:43.6919311Z             }
2026-11-17T13:59:43.6919393Z           }
2026-11-17T13:59:43.6919481Z         }
2026-11-17T13:59:43.6919569Z       }
2026-11-17T13:59:43.6919658Z     }
2026-11-17T13:59:43.6919694Z 
2026-11-17T13:59:43.6919985Z 2026-11-17 10:59:34,104 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.RepresentacaoTecnica` entity using padded IN-list : 16 (16)
2026-11-17T13:59:43.6920295Z 2026-11-17 10:59:34,104 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : rt1_0
2026-11-17T13:59:43.6920782Z 2026-11-17 10:59:34,104 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.RepresentacaoTecnica)] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoTecnica] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoTecnica] 
2026-11-17T13:59:43.6921399Z 2026-11-17 10:59:34,104 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@53e6774f] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico] 
2026-11-17T13:59:43.6921831Z 2026-11-17 10:59:34,104 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-11-17T13:59:43.6922308Z 2026-11-17 10:59:34,104 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@4bd080fe] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia] 
2026-11-17T13:59:43.6922676Z 2026-11-17 10:59:34,104 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f2_0
2026-11-17T13:59:43.6923167Z 2026-11-17 10:59:34,104 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@13908374] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.farmaciaMatriz] for NavigablePath [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.farmaciaMatriz] 
2026-11-17T13:59:43.6923538Z 2026-11-17 10:59:34,105 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6923763Z  \-EntityResultImpl [br.com.caixa.sifap.entity.RepresentacaoTecnica]
2026-11-17T13:59:43.6923996Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.coUsuarioAcaoRepresentacao]
2026-11-17T13:59:43.6924292Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.deEnderecoIpRepresentacao]
2026-11-17T13:59:43.6924550Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.dtFimRepresentacao]
2026-11-17T13:59:43.6924786Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.dtInicioRepresentacao]
2026-11-17T13:59:43.6925033Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.dtVencimentoCertidaoRegularidade]
2026-11-17T13:59:43.6925279Z  |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico]
2026-11-17T13:59:43.6925540Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.coIdentificacaoFarmaceutico]
2026-11-17T13:59:43.6925811Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.coUsuarioAcaoFarmaceutico]
2026-11-17T13:59:43.6926117Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.deEnderecoIpFarmaceutico]
2026-11-17T13:59:43.6926393Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.dtVencimentoRegistro]
2026-11-17T13:59:43.6926643Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.icTipoAcao]
2026-11-17T13:59:43.6926891Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.nuCpfFarmaceutico]
2026-11-17T13:59:43.6927151Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.sgIdentificacaoFarmaceutico]
2026-11-17T13:59:43.6927413Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.tsFimVigenciaFarmaceutico]
2026-11-17T13:59:43.6927668Z  |  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico.tsInicioVigenciaFrmco]
2026-11-17T13:59:43.6927907Z  |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia]
2026-11-17T13:59:43.6928161Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.coCnpjEstabelecimentoLegado]
2026-11-17T13:59:43.6928463Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.coLicencaFuncionamento]
2026-11-17T13:59:43.6928705Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.coProcessoSei]
2026-11-17T13:59:43.6928947Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.coUsuarioAcaoFarmacia]
2026-11-17T13:59:43.6929181Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.deEmailFarmacia]
2026-11-17T13:59:43.6929430Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.deEnderecoIpFarmacia]
2026-11-17T13:59:43.6929683Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.dhAtualizacaoFarmacia]
2026-11-17T13:59:43.6929970Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.dhSubmissaoSlctoCadastro]
2026-11-17T13:59:43.6930215Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.dtVencimentoCnd]
2026-11-17T13:59:43.6930462Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.dtVencimentoLicencaFncmo]
2026-11-17T13:59:43.6930717Z  |  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.farmaciaMatriz]
2026-11-17T13:59:43.6930963Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.icEfetuaVenda]
2026-11-17T13:59:43.6931210Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.icEmissaoFiscalEletronico]
2026-11-17T13:59:43.6931453Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.icTipoAcao]
2026-11-17T13:59:43.6931715Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.noTitularidadeContaCredito]
2026-11-17T13:59:43.6931962Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuAgencia]
2026-11-17T13:59:43.6932183Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuBanco]
2026-11-17T13:59:43.6932426Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuCnpjEstabelecimento]
2026-11-17T13:59:43.6932660Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuConta]
2026-11-17T13:59:43.6932894Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuDddAlternativo]
2026-11-17T13:59:43.6933135Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuDddPrincipal]
2026-11-17T13:59:43.6933370Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuDvAgencia]
2026-11-17T13:59:43.6933604Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuDvConta]
2026-11-17T13:59:43.6933840Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuIbgeMunicipio]
2026-11-17T13:59:43.6934077Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuInscricaoInss]
2026-11-17T13:59:43.6934380Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuRegistroJuntaComercial]
2026-11-17T13:59:43.6934639Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuTelefoneAlternativo]
2026-11-17T13:59:43.6934883Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuTelefonePrincipal]
2026-11-17T13:59:43.6935111Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.nuTipoConta]
2026-11-17T13:59:43.6935361Z  |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.representacoes]
2026-11-17T13:59:43.6935626Z  |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.representacoesTecnica]
2026-11-17T13:59:43.6935873Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.sgUfFarmacia]
2026-11-17T13:59:43.6936117Z  |  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.situacoes]
2026-11-17T13:59:43.6936361Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.tsFimVigenciaFarmacia]
2026-11-17T13:59:43.6936646Z  |  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.tsInicioVigenciaFarmacia]
2026-11-17T13:59:43.6936878Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.icTipoAcao]
2026-11-17T13:59:43.6937103Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.tsFimPeriodo]
2026-11-17T13:59:43.6937327Z  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentacaoTecnica.tsInicioPeriodo]
2026-11-17T13:59:43.6937401Z 
2026-11-17T13:59:43.6937601Z 2026-11-17 10:59:34,105 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6937744Z     SelectStatement {
2026-11-17T13:59:43.6937880Z       FromClause {
2026-11-17T13:59:43.6938016Z         StandardTableGroup (rt1 : br.com.caixa.sifap.entity.RepresentacaoTecnica) {
2026-11-17T13:59:43.6938176Z           primaryTableReference : FAPDB001.dbo.FAPTB005_RPRSE_TECNICA as rt1_0
2026-11-17T13:59:43.6938311Z           TableGroupJoins {
2026-11-17T13:59:43.6938459Z              join LazyTableGroup (f1 : br.com.caixa.sifap.entity.RepresentacaoTecnica.farmaceutico) {
2026-11-17T13:59:43.6938624Z               primaryTableReference : FAPDB001.dbo.FAPTB004_FARMACEUTICO as f1_0
2026-11-17T13:59:43.6938745Z             }
2026-11-17T13:59:43.6938878Z              join LazyTableGroup (f2 : br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia) {
2026-11-17T13:59:43.6939041Z               primaryTableReference : FAPDB001.dbo.FAPTB001_FARMACIA as f2_0
2026-11-17T13:59:43.6939167Z               TableGroupJoins {
2026-11-17T13:59:43.6939318Z                 left  join LazyTableGroup (fm1 : br.com.caixa.sifap.entity.RepresentacaoTecnica.farmacia.farmaciaMatriz) {
2026-11-17T13:59:43.6939452Z                 }
2026-11-17T13:59:43.6939541Z               }
2026-11-17T13:59:43.6939629Z             }
2026-11-17T13:59:43.6939715Z           }
2026-11-17T13:59:43.6939802Z         }
2026-11-17T13:59:43.6939886Z       }
2026-11-17T13:59:43.6939971Z     }
2026-11-17T13:59:43.6940007Z 
2026-11-17T13:59:43.6940277Z 2026-11-17 10:59:34,105 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.RepresentacaoTecnica
2026-11-17T13:59:43.6940679Z 2026-11-17 10:59:34,105 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_REPRESENTACAO_TECNICA from FAPDB001.dbo.FAPTB005_RPRSE_TECNICA where NU_REPRESENTACAO_TECNICA=?
2026-11-17T13:59:43.6941262Z 2026-11-17 10:59:34,105 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB005_RPRSE_TECNICA (CO_USUARIO_ACAO_REPRESENTACAO,DE_ENDERECO_IP_REPRESENTACAO,DT_FIM_REPRESENTACAO,DT_INICIO_REPRESENTACAO,DT_VNCMO_CERTIDAO_REGULARIDADE,NU_FARMACEUTICO,NU_FARMACIA,IC_TIPO_ACAO,TS_FIM_PERIODO,TS_INICIO_PERIODO) values (?,?,?,?,?,?,?,?,?,?)
2026-11-17T13:59:43.6941943Z 2026-11-17 10:59:34,105 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB005_RPRSE_TECNICA set CO_USUARIO_ACAO_REPRESENTACAO=?,DE_ENDERECO_IP_REPRESENTACAO=?,DT_FIM_REPRESENTACAO=?,DT_INICIO_REPRESENTACAO=?,DT_VNCMO_CERTIDAO_REGULARIDADE=?,NU_FARMACEUTICO=?,NU_FARMACIA=?,IC_TIPO_ACAO=?,TS_FIM_PERIODO=?,TS_INICIO_PERIODO=? where NU_REPRESENTACAO_TECNICA=?
2026-11-17T13:59:43.6942430Z 2026-11-17 10:59:34,105 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB005_RPRSE_TECNICA where NU_REPRESENTACAO_TECNICA=?
2026-11-17T13:59:43.6942737Z 2026-11-17 10:59:34,105 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : iv1_0
2026-11-17T13:59:43.6943195Z 2026-11-17 10:59:34,105 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.ItemValidacao)] with identifierForTableGroup [br.com.caixa.sifap.entity.ItemValidacao] for NavigablePath [br.com.caixa.sifap.entity.ItemValidacao] 
2026-11-17T13:59:43.6943541Z 2026-11-17 10:59:34,105 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6943789Z  \-EntityResultImpl [br.com.caixa.sifap.entity.ItemValidacao]
2026-11-17T13:59:43.6944004Z  |  \-BasicFetch [br.com.caixa.sifap.entity.ItemValidacao.noItemValidado]
2026-11-17T13:59:43.6944074Z 
2026-11-17T13:59:43.6944332Z 2026-11-17 10:59:34,105 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6944487Z     SelectStatement {
2026-11-17T13:59:43.6944588Z       FromClause {
2026-11-17T13:59:43.6944718Z         StandardTableGroup (iv1 : br.com.caixa.sifap.entity.ItemValidacao) {
2026-11-17T13:59:43.6944881Z           primaryTableReference : FAPDB001.dbo.FAPTB016_ITEM_VALIDACAO as iv1_0
2026-11-17T13:59:43.6945031Z         }
2026-11-17T13:59:43.6945118Z       }
2026-11-17T13:59:43.6945208Z     }
2026-11-17T13:59:43.6945244Z 
2026-11-17T13:59:43.6945523Z 2026-11-17 10:59:34,105 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.ItemValidacao` entity using padded IN-list : 16 (16)
2026-11-17T13:59:43.6945825Z 2026-11-17 10:59:34,105 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : iv1_0
2026-11-17T13:59:43.6946272Z 2026-11-17 10:59:34,105 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.ItemValidacao)] with identifierForTableGroup [br.com.caixa.sifap.entity.ItemValidacao] for NavigablePath [br.com.caixa.sifap.entity.ItemValidacao] 
2026-11-17T13:59:43.6946630Z 2026-11-17 10:59:34,106 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6946849Z  \-EntityResultImpl [br.com.caixa.sifap.entity.ItemValidacao]
2026-11-17T13:59:43.6947092Z  |  \-BasicFetch [br.com.caixa.sifap.entity.ItemValidacao.noItemValidado]
2026-11-17T13:59:43.6947162Z 
2026-11-17T13:59:43.6947361Z 2026-11-17 10:59:34,106 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6947505Z     SelectStatement {
2026-11-17T13:59:43.6947613Z       FromClause {
2026-11-17T13:59:43.6947745Z         StandardTableGroup (iv1 : br.com.caixa.sifap.entity.ItemValidacao) {
2026-11-17T13:59:43.6947902Z           primaryTableReference : FAPDB001.dbo.FAPTB016_ITEM_VALIDACAO as iv1_0
2026-11-17T13:59:43.6948027Z         }
2026-11-17T13:59:43.6948117Z       }
2026-11-17T13:59:43.6948196Z     }
2026-11-17T13:59:43.6948239Z 
2026-11-17T13:59:43.6948506Z 2026-11-17 10:59:34,106 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.ItemValidacao
2026-11-17T13:59:43.6948892Z 2026-11-17 10:59:34,106 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_ITEM_VALIDACAO from FAPDB001.dbo.FAPTB016_ITEM_VALIDACAO where NU_ITEM_VALIDACAO=?
2026-11-17T13:59:43.6949296Z 2026-11-17 10:59:34,106 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB016_ITEM_VALIDACAO (NO_ITEM_VALIDADO,NU_ITEM_VALIDACAO) values (?,?)
2026-11-17T13:59:43.6949691Z 2026-11-17 10:59:34,106 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB016_ITEM_VALIDACAO set NO_ITEM_VALIDADO=? where NU_ITEM_VALIDACAO=?
2026-11-17T13:59:43.6950061Z 2026-11-17 10:59:34,106 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB016_ITEM_VALIDACAO where NU_ITEM_VALIDACAO=?
2026-11-17T13:59:43.6950368Z 2026-11-17 10:59:34,106 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : tsf1_0
2026-11-17T13:59:43.6950837Z 2026-11-17 10:59:34,106 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.TipoSituacaoFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoSituacaoFarmacia] for NavigablePath [br.com.caixa.sifap.entity.TipoSituacaoFarmacia] 
2026-11-17T13:59:43.6951206Z 2026-11-17 10:59:34,106 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6951463Z  \-EntityResultImpl [br.com.caixa.sifap.entity.TipoSituacaoFarmacia]
2026-11-17T13:59:43.6951694Z  |  \-BasicFetch [br.com.caixa.sifap.entity.TipoSituacaoFarmacia.deTipoSituacaoFarmacia]
2026-11-17T13:59:43.6951781Z 
2026-11-17T13:59:43.6951980Z 2026-11-17 10:59:34,106 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6952116Z     SelectStatement {
2026-11-17T13:59:43.6952219Z       FromClause {
2026-11-17T13:59:43.6952354Z         StandardTableGroup (tsf1 : br.com.caixa.sifap.entity.TipoSituacaoFarmacia) {
2026-11-17T13:59:43.6952554Z           primaryTableReference : dbo.FAPTB003_TIPO_STCO_FARMACIA as tsf1_0
2026-11-17T13:59:43.6952676Z         }
2026-11-17T13:59:43.6952765Z       }
2026-11-17T13:59:43.6952851Z     }
2026-11-17T13:59:43.6952886Z 
2026-11-17T13:59:43.6953168Z 2026-11-17 10:59:34,106 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.TipoSituacaoFarmacia` entity using padded IN-list : 16 (16)
2026-11-17T13:59:43.6953476Z 2026-11-17 10:59:34,106 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : tsf1_0
2026-11-17T13:59:43.6953945Z 2026-11-17 10:59:34,106 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.TipoSituacaoFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoSituacaoFarmacia] for NavigablePath [br.com.caixa.sifap.entity.TipoSituacaoFarmacia] 
2026-11-17T13:59:43.6954367Z 2026-11-17 10:59:34,106 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6954602Z  \-EntityResultImpl [br.com.caixa.sifap.entity.TipoSituacaoFarmacia]
2026-11-17T13:59:43.6954836Z  |  \-BasicFetch [br.com.caixa.sifap.entity.TipoSituacaoFarmacia.deTipoSituacaoFarmacia]
2026-11-17T13:59:43.6954914Z 
2026-11-17T13:59:43.6955111Z 2026-11-17 10:59:34,106 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6955256Z     SelectStatement {
2026-11-17T13:59:43.6955515Z       FromClause {
2026-11-17T13:59:43.6955669Z         StandardTableGroup (tsf1 : br.com.caixa.sifap.entity.TipoSituacaoFarmacia) {
2026-11-17T13:59:43.6955825Z           primaryTableReference : dbo.FAPTB003_TIPO_STCO_FARMACIA as tsf1_0
2026-11-17T13:59:43.6955946Z         }
2026-11-17T13:59:43.6956033Z       }
2026-11-17T13:59:43.6956120Z     }
2026-11-17T13:59:43.6956156Z 
2026-11-17T13:59:43.6956435Z 2026-11-17 10:59:34,106 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.TipoSituacaoFarmacia
2026-11-17T13:59:43.6956832Z 2026-11-17 10:59:34,106 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_TIPO_SITUACAO_FARMACIA from dbo.FAPTB003_TIPO_STCO_FARMACIA where NU_TIPO_SITUACAO_FARMACIA=?
2026-11-17T13:59:43.6957258Z 2026-11-17 10:59:34,106 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into dbo.FAPTB003_TIPO_STCO_FARMACIA (DE_TIPO_SITUACAO_FARMACIA,NU_TIPO_SITUACAO_FARMACIA) values (?,?)
2026-11-17T13:59:43.6957672Z 2026-11-17 10:59:34,106 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update dbo.FAPTB003_TIPO_STCO_FARMACIA set DE_TIPO_SITUACAO_FARMACIA=? where NU_TIPO_SITUACAO_FARMACIA=?
2026-11-17T13:59:43.6958056Z 2026-11-17 10:59:34,106 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from dbo.FAPTB003_TIPO_STCO_FARMACIA where NU_TIPO_SITUACAO_FARMACIA=?
2026-11-17T13:59:43.6958364Z 2026-11-17 10:59:34,106 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : rf1_0
2026-11-17T13:59:43.6958840Z 2026-11-17 10:59:34,106 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.RepresentanteFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentanteFarmacia] for NavigablePath [br.com.caixa.sifap.entity.RepresentanteFarmacia] 
2026-11-17T13:59:43.6959252Z 2026-11-17 10:59:34,107 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6959483Z  \-EntityResultImpl [br.com.caixa.sifap.entity.RepresentanteFarmacia]
2026-11-17T13:59:43.6959717Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.coUsuarioAcaoRepresentante]
2026-11-17T13:59:43.6959963Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.deEnderecoIpRepresentante]
2026-11-17T13:59:43.6960191Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.icTipoAcao]
2026-11-17T13:59:43.6960450Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.nuCpfRepresentante]
2026-11-17T13:59:43.6960680Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.tsFimVigenciaRprse]
2026-11-17T13:59:43.6960911Z  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.tsInicioVigenciaRprse]
2026-11-17T13:59:43.6960987Z 
2026-11-17T13:59:43.6961184Z 2026-11-17 10:59:34,107 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6961327Z     SelectStatement {
2026-11-17T13:59:43.6961429Z       FromClause {
2026-11-17T13:59:43.6961558Z         StandardTableGroup (rf1 : br.com.caixa.sifap.entity.RepresentanteFarmacia) {
2026-11-17T13:59:43.6961722Z           primaryTableReference : FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA as rf1_0
2026-11-17T13:59:43.6961840Z         }
2026-11-17T13:59:43.6961926Z       }
2026-11-17T13:59:43.6962011Z     }
2026-11-17T13:59:43.6962046Z 
2026-11-17T13:59:43.6962322Z 2026-11-17 10:59:34,107 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.RepresentanteFarmacia` entity using padded IN-list : 16 (16)
2026-11-17T13:59:43.6962625Z 2026-11-17 10:59:34,107 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : rf1_0
2026-11-17T13:59:43.6963086Z 2026-11-17 10:59:34,107 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.RepresentanteFarmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.RepresentanteFarmacia] for NavigablePath [br.com.caixa.sifap.entity.RepresentanteFarmacia] 
2026-11-17T13:59:43.6963455Z 2026-11-17 10:59:34,107 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6963683Z  \-EntityResultImpl [br.com.caixa.sifap.entity.RepresentanteFarmacia]
2026-11-17T13:59:43.6963914Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.coUsuarioAcaoRepresentante]
2026-11-17T13:59:43.6964156Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.deEnderecoIpRepresentante]
2026-11-17T13:59:43.6964460Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.icTipoAcao]
2026-11-17T13:59:43.6964690Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.nuCpfRepresentante]
2026-11-17T13:59:43.6964910Z  |  +-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.tsFimVigenciaRprse]
2026-11-17T13:59:43.6965142Z  |  \-BasicFetch [br.com.caixa.sifap.entity.RepresentanteFarmacia.tsInicioVigenciaRprse]
2026-11-17T13:59:43.6965223Z 
2026-11-17T13:59:43.6965419Z 2026-11-17 10:59:34,107 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6965562Z     SelectStatement {
2026-11-17T13:59:43.6965659Z       FromClause {
2026-11-17T13:59:43.6965793Z         StandardTableGroup (rf1 : br.com.caixa.sifap.entity.RepresentanteFarmacia) {
2026-11-17T13:59:43.6965954Z           primaryTableReference : FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA as rf1_0
2026-11-17T13:59:43.6966074Z         }
2026-11-17T13:59:43.6966161Z       }
2026-11-17T13:59:43.6966247Z     }
2026-11-17T13:59:43.6966283Z 
2026-11-17T13:59:43.6966548Z 2026-11-17 10:59:34,107 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.RepresentanteFarmacia
2026-11-17T13:59:43.6966944Z 2026-11-17 10:59:34,107 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_REPRESENTANTE_FARMACIA from FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA where NU_REPRESENTANTE_FARMACIA=?
2026-11-17T13:59:43.6967488Z 2026-11-17 10:59:34,107 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA (CO_USUARIO_ACAO_REPRESENTANTE,DE_ENDERECO_IP_REPRESENTANTE,IC_TIPO_ACAO,NU_CPF_REPRESENTANTE,TS_FIM_VIGENCIA_RPRSE,TS_INICIO_VIGENCIA_RPRSE) values (?,?,?,?,?,?)
2026-11-17T13:59:43.6968059Z 2026-11-17 10:59:34,107 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA set CO_USUARIO_ACAO_REPRESENTANTE=?,DE_ENDERECO_IP_REPRESENTANTE=?,IC_TIPO_ACAO=?,NU_CPF_REPRESENTANTE=?,TS_FIM_VIGENCIA_RPRSE=?,TS_INICIO_VIGENCIA_RPRSE=? where NU_REPRESENTANTE_FARMACIA=?
2026-11-17T13:59:43.6968533Z 2026-11-17 10:59:34,107 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA where NU_REPRESENTANTE_FARMACIA=?
2026-11-17T13:59:43.6968835Z 2026-11-17 10:59:34,107 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-11-17T13:59:43.6969272Z 2026-11-17 10:59:34,107 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia] for NavigablePath [br.com.caixa.sifap.entity.Farmacia] 
2026-11-17T13:59:43.6969817Z 2026-11-17 10:59:34,107 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@66a246e2] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.farmaciaMatriz] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.farmaciaMatriz] 
2026-11-17T13:59:43.6970184Z 2026-11-17 10:59:34,108 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6970398Z  \-EntityResultImpl [br.com.caixa.sifap.entity.Farmacia]
2026-11-17T13:59:43.6970617Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.coCnpjEstabelecimentoLegado]
2026-11-17T13:59:43.6970840Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.coLicencaFuncionamento]
2026-11-17T13:59:43.6971052Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.coProcessoSei]
2026-11-17T13:59:43.6971267Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.coUsuarioAcaoFarmacia]
2026-11-17T13:59:43.6971477Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.deEmailFarmacia]
2026-11-17T13:59:43.6971680Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.deEnderecoIpFarmacia]
2026-11-17T13:59:43.6971893Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.dhAtualizacaoFarmacia]
2026-11-17T13:59:43.6972112Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.dhSubmissaoSlctoCadastro]
2026-11-17T13:59:43.6972324Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.dtVencimentoCnd]
2026-11-17T13:59:43.6972538Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.dtVencimentoLicencaFncmo]
2026-11-17T13:59:43.6972761Z  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.Farmacia.farmaciaMatriz]
2026-11-17T13:59:43.6972972Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.icEfetuaVenda]
2026-11-17T13:59:43.6973188Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.icEmissaoFiscalEletronico]
2026-11-17T13:59:43.6973393Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.icTipoAcao]
2026-11-17T13:59:43.6973603Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.noTitularidadeContaCredito]
2026-11-17T13:59:43.6973811Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuAgencia]
2026-11-17T13:59:43.6974008Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuBanco]
2026-11-17T13:59:43.6974304Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuCnpjEstabelecimento]
2026-11-17T13:59:43.6974521Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuConta]
2026-11-17T13:59:43.6974766Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuDddAlternativo]
2026-11-17T13:59:43.6974977Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuDddPrincipal]
2026-11-17T13:59:43.6975180Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuDvAgencia]
2026-11-17T13:59:43.6975378Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuDvConta]
2026-11-17T13:59:43.6975583Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuIbgeMunicipio]
2026-11-17T13:59:43.6975783Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuInscricaoInss]
2026-11-17T13:59:43.6976030Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuRegistroJuntaComercial]
2026-11-17T13:59:43.6976309Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuTelefoneAlternativo]
2026-11-17T13:59:43.6976525Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuTelefonePrincipal]
2026-11-17T13:59:43.6976732Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuTipoConta]
2026-11-17T13:59:43.6976955Z  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.Farmacia.representacoes]
2026-11-17T13:59:43.6977188Z  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica]
2026-11-17T13:59:43.6977407Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.sgUfFarmacia]
2026-11-17T13:59:43.6977621Z  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.Farmacia.situacoes]
2026-11-17T13:59:43.6977838Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.tsFimVigenciaFarmacia]
2026-11-17T13:59:43.6978047Z  |  \-BasicFetch [br.com.caixa.sifap.entity.Farmacia.tsInicioVigenciaFarmacia]
2026-11-17T13:59:43.6978125Z 
2026-11-17T13:59:43.6978325Z 2026-11-17 10:59:34,108 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6978471Z     SelectStatement {
2026-11-17T13:59:43.6978567Z       FromClause {
2026-11-17T13:59:43.6978698Z         StandardTableGroup (f1 : br.com.caixa.sifap.entity.Farmacia) {
2026-11-17T13:59:43.6978851Z           primaryTableReference : FAPDB001.dbo.FAPTB001_FARMACIA as f1_0
2026-11-17T13:59:43.6978982Z           TableGroupJoins {
2026-11-17T13:59:43.6979125Z             left  join LazyTableGroup (fm1 : br.com.caixa.sifap.entity.Farmacia.farmaciaMatriz) {
2026-11-17T13:59:43.6979257Z             }
2026-11-17T13:59:43.6979347Z           }
2026-11-17T13:59:43.6979437Z         }
2026-11-17T13:59:43.6979515Z       }
2026-11-17T13:59:43.6979603Z     }
2026-11-17T13:59:43.6979646Z 
2026-11-17T13:59:43.6979912Z 2026-11-17 10:59:34,108 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.Farmacia` entity using padded IN-list : 16 (16)
2026-11-17T13:59:43.6980213Z 2026-11-17 10:59:34,108 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-11-17T13:59:43.6980653Z 2026-11-17 10:59:34,108 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmacia)] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia] for NavigablePath [br.com.caixa.sifap.entity.Farmacia] 
2026-11-17T13:59:43.6981207Z 2026-11-17 10:59:34,108 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@580eb30] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.farmaciaMatriz] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.farmaciaMatriz] 
2026-11-17T13:59:43.6981562Z 2026-11-17 10:59:34,108 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6981773Z  \-EntityResultImpl [br.com.caixa.sifap.entity.Farmacia]
2026-11-17T13:59:43.6981989Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.coCnpjEstabelecimentoLegado]
2026-11-17T13:59:43.6982215Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.coLicencaFuncionamento]
2026-11-17T13:59:43.6982427Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.coProcessoSei]
2026-11-17T13:59:43.6982636Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.coUsuarioAcaoFarmacia]
2026-11-17T13:59:43.6982891Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.deEmailFarmacia]
2026-11-17T13:59:43.6983103Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.deEnderecoIpFarmacia]
2026-11-17T13:59:43.6983323Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.dhAtualizacaoFarmacia]
2026-11-17T13:59:43.6983540Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.dhSubmissaoSlctoCadastro]
2026-11-17T13:59:43.6983744Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.dtVencimentoCnd]
2026-11-17T13:59:43.6983959Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.dtVencimentoLicencaFncmo]
2026-11-17T13:59:43.6984370Z  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.Farmacia.farmaciaMatriz]
2026-11-17T13:59:43.6984588Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.icEfetuaVenda]
2026-11-17T13:59:43.6984805Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.icEmissaoFiscalEletronico]
2026-11-17T13:59:43.6985012Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.icTipoAcao]
2026-11-17T13:59:43.6985234Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.noTitularidadeContaCredito]
2026-11-17T13:59:43.6985442Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuAgencia]
2026-11-17T13:59:43.6985640Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuBanco]
2026-11-17T13:59:43.6985849Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuCnpjEstabelecimento]
2026-11-17T13:59:43.6986043Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuConta]
2026-11-17T13:59:43.6986252Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuDddAlternativo]
2026-11-17T13:59:43.6986459Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuDddPrincipal]
2026-11-17T13:59:43.6986663Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuDvAgencia]
2026-11-17T13:59:43.6986861Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuDvConta]
2026-11-17T13:59:43.6987065Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuIbgeMunicipio]
2026-11-17T13:59:43.6987275Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuInscricaoInss]
2026-11-17T13:59:43.6987490Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuRegistroJuntaComercial]
2026-11-17T13:59:43.6987704Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuTelefoneAlternativo]
2026-11-17T13:59:43.6987909Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuTelefonePrincipal]
2026-11-17T13:59:43.6988114Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.nuTipoConta]
2026-11-17T13:59:43.6988331Z  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.Farmacia.representacoes]
2026-11-17T13:59:43.6988563Z  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica]
2026-11-17T13:59:43.6988780Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.sgUfFarmacia]
2026-11-17T13:59:43.6988993Z  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.Farmacia.situacoes]
2026-11-17T13:59:43.6989208Z  |  +-BasicFetch [br.com.caixa.sifap.entity.Farmacia.tsFimVigenciaFarmacia]
2026-11-17T13:59:43.6989426Z  |  \-BasicFetch [br.com.caixa.sifap.entity.Farmacia.tsInicioVigenciaFarmacia]
2026-11-17T13:59:43.6989492Z 
2026-11-17T13:59:43.6989693Z 2026-11-17 10:59:34,108 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.6989835Z     SelectStatement {
2026-11-17T13:59:43.6989936Z       FromClause {
2026-11-17T13:59:43.6990064Z         StandardTableGroup (f1 : br.com.caixa.sifap.entity.Farmacia) {
2026-11-17T13:59:43.6990220Z           primaryTableReference : FAPDB001.dbo.FAPTB001_FARMACIA as f1_0
2026-11-17T13:59:43.6990344Z           TableGroupJoins {
2026-11-17T13:59:43.6990488Z             left  join LazyTableGroup (fm1 : br.com.caixa.sifap.entity.Farmacia.farmaciaMatriz) {
2026-11-17T13:59:43.6990620Z             }
2026-11-17T13:59:43.6990712Z           }
2026-11-17T13:59:43.6990800Z         }
2026-11-17T13:59:43.6990884Z       }
2026-11-17T13:59:43.6990969Z     }
2026-11-17T13:59:43.6991004Z 
2026-11-17T13:59:43.6991258Z 2026-11-17 10:59:34,108 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.Farmacia
2026-11-17T13:59:43.6991690Z 2026-11-17 10:59:34,108 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_FARMACIA from FAPDB001.dbo.FAPTB001_FARMACIA where NU_FARMACIA=?
2026-11-17T13:59:43.6992766Z 2026-11-17 10:59:34,108 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB001_FARMACIA (CO_CNPJ_ESTABELECIMENTO_LEGADO,CO_LICENCA_FUNCIONAMENTO,CO_PROCESSO_SEI,CO_USUARIO_ACAO_FARMACIA,DE_EMAIL_FARMACIA,DE_ENDERECO_IP_FARMACIA,DH_ATUALIZACAO_FARMACIA,DH_SUBMISSAO_SLCTO_CADASTRO,DT_VENCIMENTO_CND,DT_VNCMO_LICENCA_FNCMO,NU_FARMACIA_MATRIZ,IC_EFETUA_VENDA,IC_EMISSAO_FISCAL_ELETRONICO,IC_TIPO_ACAO,NO_TITULARIDADE_CONTA_CREDITO,NU_AGENCIA,NU_BANCO,NU_CNPJ_ESTABELECIMENTO,NU_CONTA,NU_DDD_ALTERNATIVO,NU_DDD_PRINCIPAL,NU_DV_AGENCIA,NU_DV_CONTA,NU_IBGE_MUNICIPIO,NU_INSCRICAO_INSS,NU_REGISTRO_JUNTA_COMERCIAL,NU_TELEFONE_ALTERNATIVO,NU_TELEFONE_PRINCIPAL,NU_TIPO_CONTA,SG_UF_FARMACIA) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
2026-11-17T13:59:43.6994706Z 2026-11-17 10:59:34,108 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB001_FARMACIA set CO_CNPJ_ESTABELECIMENTO_LEGADO=?,CO_LICENCA_FUNCIONAMENTO=?,CO_PROCESSO_SEI=?,CO_USUARIO_ACAO_FARMACIA=?,DE_EMAIL_FARMACIA=?,DE_ENDERECO_IP_FARMACIA=?,DH_ATUALIZACAO_FARMACIA=?,DH_SUBMISSAO_SLCTO_CADASTRO=?,DT_VENCIMENTO_CND=?,DT_VNCMO_LICENCA_FNCMO=?,NU_FARMACIA_MATRIZ=?,IC_EFETUA_VENDA=?,IC_EMISSAO_FISCAL_ELETRONICO=?,IC_TIPO_ACAO=?,NO_TITULARIDADE_CONTA_CREDITO=?,NU_AGENCIA=?,NU_BANCO=?,NU_CNPJ_ESTABELECIMENTO=?,NU_CONTA=?,NU_DDD_ALTERNATIVO=?,NU_DDD_PRINCIPAL=?,NU_DV_AGENCIA=?,NU_DV_CONTA=?,NU_IBGE_MUNICIPIO=?,NU_INSCRICAO_INSS=?,NU_REGISTRO_JUNTA_COMERCIAL=?,NU_TELEFONE_ALTERNATIVO=?,NU_TELEFONE_PRINCIPAL=?,NU_TIPO_CONTA=?,SG_UF_FARMACIA=? where NU_FARMACIA=?
2026-11-17T13:59:43.6995681Z 2026-11-17 10:59:34,109 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB001_FARMACIA where NU_FARMACIA=?
2026-11-17T13:59:43.6996091Z 2026-11-17 10:59:34,109 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : ad1_0
2026-11-17T13:59:43.6996725Z 2026-11-17 10:59:34,109 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.AnaliseDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento] 
2026-11-17T13:59:43.6997508Z 2026-11-17 10:59:34,109 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@6c7fcf9a] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento] 
2026-11-17T13:59:43.6998039Z 2026-11-17 10:59:34,109 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : td1_0
2026-11-17T13:59:43.6998396Z 2026-11-17 10:59:34,109 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.6998690Z  \-EntityResultImpl [br.com.caixa.sifap.entity.AnaliseDocumento]
2026-11-17T13:59:43.6998976Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.coCpfCnpjDocumento]
2026-11-17T13:59:43.6999283Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.coUsuarioAnaliseDocumento]
2026-11-17T13:59:43.6999513Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.deJustificativa]
2026-11-17T13:59:43.6999740Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.dhAnaliseDocumento]
2026-11-17T13:59:43.6999970Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.dhFimAnaliseDocumento]
2026-11-17T13:59:43.7000193Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.icAnaliseDocumento]
2026-11-17T13:59:43.7000559Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.icCpfCnpjDocumento]
2026-11-17T13:59:43.7000859Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.icUsuarioAnaliseDocumento]
2026-11-17T13:59:43.7001179Z  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise]
2026-11-17T13:59:43.7001456Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.nuIdentificadorDocumento]
2026-11-17T13:59:43.7001671Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.nuTipoDocumento]
2026-11-17T13:59:43.7001902Z  |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento]
2026-11-17T13:59:43.7002201Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento.coTipologiaDocumento]
2026-11-17T13:59:43.7002461Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento.deTipoDocumentoFarmacia]
2026-11-17T13:59:43.7002713Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento.icClasseTipoDocumento]
2026-11-17T13:59:43.7002968Z  |  |  \-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento.icDocumentoObrigatorio]
2026-11-17T13:59:43.7003193Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tsFimPeriodo]
2026-11-17T13:59:43.7003411Z  |  \-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tsInicioPeriodo]
2026-11-17T13:59:43.7003480Z 
2026-11-17T13:59:43.7003681Z 2026-11-17 10:59:34,109 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7003824Z     SelectStatement {
2026-11-17T13:59:43.7003926Z       FromClause {
2026-11-17T13:59:43.7004061Z         StandardTableGroup (ad1 : br.com.caixa.sifap.entity.AnaliseDocumento) {
2026-11-17T13:59:43.7004307Z           primaryTableReference : FAPDB001.dbo.FAPTB019_ANALISE_DOCUMENTO as ad1_0
2026-11-17T13:59:43.7004453Z           TableGroupJoins {
2026-11-17T13:59:43.7004592Z             left  join LazyTableGroup (td1 : br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento) {
2026-11-17T13:59:43.7004765Z               primaryTableReference : FAPDB001.dbo.FAPTB006_TIPO_DOCUMENTO as td1_0
2026-11-17T13:59:43.7004886Z             }
2026-11-17T13:59:43.7004974Z           }
2026-11-17T13:59:43.7005063Z         }
2026-11-17T13:59:43.7005148Z       }
2026-11-17T13:59:43.7005239Z     }
2026-11-17T13:59:43.7005275Z 
2026-11-17T13:59:43.7005554Z 2026-11-17 10:59:34,109 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.AnaliseDocumento` entity using padded IN-list : 16 (16)
2026-11-17T13:59:43.7005859Z 2026-11-17 10:59:34,109 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : ad1_0
2026-11-17T13:59:43.7006380Z 2026-11-17 10:59:34,109 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.AnaliseDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento] 
2026-11-17T13:59:43.7006966Z 2026-11-17 10:59:34,109 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@8320975] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento] 
2026-11-17T13:59:43.7007333Z 2026-11-17 10:59:34,109 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : td1_0
2026-11-17T13:59:43.7007588Z 2026-11-17 10:59:34,110 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7007809Z  \-EntityResultImpl [br.com.caixa.sifap.entity.AnaliseDocumento]
2026-11-17T13:59:43.7008030Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.coCpfCnpjDocumento]
2026-11-17T13:59:43.7008249Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.coUsuarioAnaliseDocumento]
2026-11-17T13:59:43.7008476Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.deJustificativa]
2026-11-17T13:59:43.7008759Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.dhAnaliseDocumento]
2026-11-17T13:59:43.7008984Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.dhFimAnaliseDocumento]
2026-11-17T13:59:43.7009208Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.icAnaliseDocumento]
2026-11-17T13:59:43.7009430Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.icCpfCnpjDocumento]
2026-11-17T13:59:43.7009660Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.icUsuarioAnaliseDocumento]
2026-11-17T13:59:43.7009894Z  |  +-DelayedCollectionFetch [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise]
2026-11-17T13:59:43.7010159Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.nuIdentificadorDocumento]
2026-11-17T13:59:43.7010381Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.nuTipoDocumento]
2026-11-17T13:59:43.7010609Z  |  +-EntityFetchJoinedImpl [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento]
2026-11-17T13:59:43.7010845Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento.coTipologiaDocumento]
2026-11-17T13:59:43.7011095Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento.deTipoDocumentoFarmacia]
2026-11-17T13:59:43.7011349Z  |  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento.icClasseTipoDocumento]
2026-11-17T13:59:43.7011594Z  |  |  \-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento.icDocumentoObrigatorio]
2026-11-17T13:59:43.7011817Z  |  +-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tsFimPeriodo]
2026-11-17T13:59:43.7012034Z  |  \-BasicFetch [br.com.caixa.sifap.entity.AnaliseDocumento.tsInicioPeriodo]
2026-11-17T13:59:43.7012101Z 
2026-11-17T13:59:43.7012300Z 2026-11-17 10:59:34,110 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7012441Z     SelectStatement {
2026-11-17T13:59:43.7012543Z       FromClause {
2026-11-17T13:59:43.7012679Z         StandardTableGroup (ad1 : br.com.caixa.sifap.entity.AnaliseDocumento) {
2026-11-17T13:59:43.7012840Z           primaryTableReference : FAPDB001.dbo.FAPTB019_ANALISE_DOCUMENTO as ad1_0
2026-11-17T13:59:43.7012971Z           TableGroupJoins {
2026-11-17T13:59:43.7013116Z             left  join LazyTableGroup (td1 : br.com.caixa.sifap.entity.AnaliseDocumento.tipoDocumento) {
2026-11-17T13:59:43.7013276Z               primaryTableReference : FAPDB001.dbo.FAPTB006_TIPO_DOCUMENTO as td1_0
2026-11-17T13:59:43.7013431Z             }
2026-11-17T13:59:43.7013563Z           }
2026-11-17T13:59:43.7013671Z         }
2026-11-17T13:59:43.7013786Z       }
2026-11-17T13:59:43.7013905Z     }
2026-11-17T13:59:43.7013941Z 
2026-11-17T13:59:43.7014300Z 2026-11-17 10:59:34,110 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.AnaliseDocumento
2026-11-17T13:59:43.7014720Z 2026-11-17 10:59:34,110 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_SQNCL_ANALISE_DOCUMENTO from FAPDB001.dbo.FAPTB019_ANALISE_DOCUMENTO where NU_SQNCL_ANALISE_DOCUMENTO=?
2026-11-17T13:59:43.7015325Z 2026-11-17 10:59:34,110 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB019_ANALISE_DOCUMENTO (CO_CPF_CNPJ_DOCUMENTO,CO_USUARIO_ANALISE_DOCUMENTO,DE_JUSTIFICATIVA,DH_ANALISE_DOCUMENTO,DH_FIM_ANALISE_DOCUMENTO,IC_ANALISE_DOCUMENTO,IC_CPF_CNPJ_DOCUMENTO,IC_USUARIO_ANALISE_DOCUMENTO,NU_IDENTIFICADOR_DOCUMENTO,NU_TIPO_DOCUMENTO) values (?,?,?,?,?,?,?,?,?,?)
2026-11-17T13:59:43.7016056Z 2026-11-17 10:59:34,110 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB019_ANALISE_DOCUMENTO set CO_CPF_CNPJ_DOCUMENTO=?,CO_USUARIO_ANALISE_DOCUMENTO=?,DE_JUSTIFICATIVA=?,DH_ANALISE_DOCUMENTO=?,DH_FIM_ANALISE_DOCUMENTO=?,IC_ANALISE_DOCUMENTO=?,IC_CPF_CNPJ_DOCUMENTO=?,IC_USUARIO_ANALISE_DOCUMENTO=?,NU_IDENTIFICADOR_DOCUMENTO=?,NU_TIPO_DOCUMENTO=? where NU_SQNCL_ANALISE_DOCUMENTO=?
2026-11-17T13:59:43.7016608Z 2026-11-17 10:59:34,110 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB019_ANALISE_DOCUMENTO where NU_SQNCL_ANALISE_DOCUMENTO=?
2026-11-17T13:59:43.7016958Z 2026-11-17 10:59:34,110 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : sm1_0
2026-11-17T13:59:43.7017533Z 2026-11-17 10:59:34,110 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.SqlMappings)] with identifierForTableGroup [br.com.caixa.sifap.entity.SqlMappings] for NavigablePath [br.com.caixa.sifap.entity.SqlMappings] 
2026-11-17T13:59:43.7017930Z 2026-11-17 10:59:34,110 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7018239Z  \-EntityResultImpl [br.com.caixa.sifap.entity.SqlMappings]
2026-11-17T13:59:43.7018303Z 
2026-11-17T13:59:43.7018508Z 2026-11-17 10:59:34,110 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7018650Z     SelectStatement {
2026-11-17T13:59:43.7018753Z       FromClause {
2026-11-17T13:59:43.7018957Z         StandardTableGroup (sm1 : br.com.caixa.sifap.entity.SqlMappings) {
2026-11-17T13:59:43.7019110Z           primaryTableReference : SqlMappings as sm1_0
2026-11-17T13:59:43.7019222Z         }
2026-11-17T13:59:43.7019309Z       }
2026-11-17T13:59:43.7019387Z     }
2026-11-17T13:59:43.7019431Z 
2026-11-17T13:59:43.7019784Z 2026-11-17 10:59:34,110 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.SqlMappings` entity using padded IN-list : 16 (16)
2026-11-17T13:59:43.7020088Z 2026-11-17 10:59:34,110 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : sm1_0
2026-11-17T13:59:43.7020630Z 2026-11-17 10:59:34,110 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.SqlMappings)] with identifierForTableGroup [br.com.caixa.sifap.entity.SqlMappings] for NavigablePath [br.com.caixa.sifap.entity.SqlMappings] 
2026-11-17T13:59:43.7021016Z 2026-11-17 10:59:34,110 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7021220Z  \-EntityResultImpl [br.com.caixa.sifap.entity.SqlMappings]
2026-11-17T13:59:43.7021287Z 
2026-11-17T13:59:43.7021572Z 2026-11-17 10:59:34,110 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7021779Z     SelectStatement {
2026-11-17T13:59:43.7021926Z       FromClause {
2026-11-17T13:59:43.7022067Z         StandardTableGroup (sm1 : br.com.caixa.sifap.entity.SqlMappings) {
2026-11-17T13:59:43.7022222Z           primaryTableReference : SqlMappings as sm1_0
2026-11-17T13:59:43.7022333Z         }
2026-11-17T13:59:43.7022419Z       }
2026-11-17T13:59:43.7022504Z     }
2026-11-17T13:59:43.7022539Z 
2026-11-17T13:59:43.7022806Z 2026-11-17 10:59:34,110 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.SqlMappings
2026-11-17T13:59:43.7023132Z 2026-11-17 10:59:34,110 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select id from SqlMappings where id=?
2026-11-17T13:59:43.7023453Z 2026-11-17 10:59:34,110 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into SqlMappings default values
2026-11-17T13:59:43.7023765Z 2026-11-17 10:59:34,110 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from SqlMappings where id=?
2026-11-17T13:59:43.7024049Z 2026-11-17 10:59:34,110 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : fa1_0
2026-11-17T13:59:43.7024744Z 2026-11-17 10:59:34,110 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.FarmaciaAuxiliar)] with identifierForTableGroup [br.com.caixa.sifap.entity.FarmaciaAuxiliar] for NavigablePath [br.com.caixa.sifap.entity.FarmaciaAuxiliar] 
2026-11-17T13:59:43.7025229Z 2026-11-17 10:59:34,111 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7025450Z  \-EntityResultImpl [br.com.caixa.sifap.entity.FarmaciaAuxiliar]
2026-11-17T13:59:43.7025680Z  |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.coCnpjEstabelecimentoLegado]
2026-11-17T13:59:43.7025906Z  |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.coCnpjMatrizLegado]
2026-11-17T13:59:43.7026130Z  |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.deMotivoBloqueio]
2026-11-17T13:59:43.7026400Z  |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.dhAtualizacaoCadastro]
2026-11-17T13:59:43.7026623Z  |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.dtBloqueio]
2026-11-17T13:59:43.7026847Z  |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.icAtualizacaoCadastro]
2026-11-17T13:59:43.7027080Z  |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.nuCnpjEstabelecimento]
2026-11-17T13:59:43.7027371Z  |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.nuCnpjMatriz]
2026-11-17T13:59:43.7027621Z  |  \-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.nuMotivoBloqueio]
2026-11-17T13:59:43.7027691Z 
2026-11-17T13:59:43.7027894Z 2026-11-17 10:59:34,111 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7028039Z     SelectStatement {
2026-11-17T13:59:43.7028144Z       FromClause {
2026-11-17T13:59:43.7028278Z         StandardTableGroup (fa1 : br.com.caixa.sifap.entity.FarmaciaAuxiliar) {
2026-11-17T13:59:43.7028442Z           primaryTableReference : FAPDB001.dbo.FAPTB012_FARMACIA_AUXILIAR as fa1_0
2026-11-17T13:59:43.7028560Z         }
2026-11-17T13:59:43.7028646Z       }
2026-11-17T13:59:43.7028734Z     }
2026-11-17T13:59:43.7028777Z 
2026-11-17T13:59:43.7029050Z 2026-11-17 10:59:34,111 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.FarmaciaAuxiliar` entity using padded IN-list : 16 (16)
2026-11-17T13:59:43.7029357Z 2026-11-17 10:59:34,111 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : fa1_0
2026-11-17T13:59:43.7029905Z 2026-11-17 10:59:34,111 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.FarmaciaAuxiliar)] with identifierForTableGroup [br.com.caixa.sifap.entity.FarmaciaAuxiliar] for NavigablePath [br.com.caixa.sifap.entity.FarmaciaAuxiliar] 
2026-11-17T13:59:43.7030273Z 2026-11-17 10:59:34,111 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7030494Z  \-EntityResultImpl [br.com.caixa.sifap.entity.FarmaciaAuxiliar]
2026-11-17T13:59:43.7030718Z  |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.coCnpjEstabelecimentoLegado]
2026-11-17T13:59:43.7030946Z  |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.coCnpjMatrizLegado]
2026-11-17T13:59:43.7031163Z  |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.deMotivoBloqueio]
2026-11-17T13:59:43.7031389Z  |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.dhAtualizacaoCadastro]
2026-11-17T13:59:43.7031606Z  |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.dtBloqueio]
2026-11-17T13:59:43.7031830Z  |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.icAtualizacaoCadastro]
2026-11-17T13:59:43.7032100Z  |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.nuCnpjEstabelecimento]
2026-11-17T13:59:43.7032324Z  |  +-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.nuCnpjMatriz]
2026-11-17T13:59:43.7032585Z  |  \-BasicFetch [br.com.caixa.sifap.entity.FarmaciaAuxiliar.nuMotivoBloqueio]
2026-11-17T13:59:43.7032664Z 
2026-11-17T13:59:43.7032865Z 2026-11-17 10:59:34,111 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7033000Z     SelectStatement {
2026-11-17T13:59:43.7033104Z       FromClause {
2026-11-17T13:59:43.7033235Z         StandardTableGroup (fa1 : br.com.caixa.sifap.entity.FarmaciaAuxiliar) {
2026-11-17T13:59:43.7033443Z           primaryTableReference : FAPDB001.dbo.FAPTB012_FARMACIA_AUXILIAR as fa1_0
2026-11-17T13:59:43.7033565Z         }
2026-11-17T13:59:43.7033651Z       }
2026-11-17T13:59:43.7033737Z     }
2026-11-17T13:59:43.7033772Z 
2026-11-17T13:59:43.7034033Z 2026-11-17 10:59:34,111 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.FarmaciaAuxiliar
2026-11-17T13:59:43.7034529Z 2026-11-17 10:59:34,111 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_FARMACIA_AUXILIAR from FAPDB001.dbo.FAPTB012_FARMACIA_AUXILIAR where NU_FARMACIA_AUXILIAR=?
2026-11-17T13:59:43.7035229Z 2026-11-17 10:59:34,111 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB012_FARMACIA_AUXILIAR (CO_CNPJ_ESTABELECIMENTO_LEGADO,CO_CNPJ_MATRIZ_LEGADO,DE_MOTIVO_BLOQUEIO,DH_ATUALIZACAO_CADASTRO,DT_BLOQUEIO,IC_ATUALIZACAO_CADASTRO,NU_CNPJ_ESTABELECIMENTO,NU_CNPJ_MATRIZ,NU_MOTIVO_BLOQUEIO) values (?,?,?,?,?,?,?,?,?)
2026-11-17T13:59:43.7035913Z 2026-11-17 10:59:34,111 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB012_FARMACIA_AUXILIAR set CO_CNPJ_ESTABELECIMENTO_LEGADO=?,CO_CNPJ_MATRIZ_LEGADO=?,DE_MOTIVO_BLOQUEIO=?,DH_ATUALIZACAO_CADASTRO=?,DT_BLOQUEIO=?,IC_ATUALIZACAO_CADASTRO=?,NU_CNPJ_ESTABELECIMENTO=?,NU_CNPJ_MATRIZ=?,NU_MOTIVO_BLOQUEIO=? where NU_FARMACIA_AUXILIAR=?
2026-11-17T13:59:43.7036447Z 2026-11-17 10:59:34,111 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB012_FARMACIA_AUXILIAR where NU_FARMACIA_AUXILIAR=?
2026-11-17T13:59:43.7036758Z 2026-11-17 10:59:34,111 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : td1_0
2026-11-17T13:59:43.7037211Z 2026-11-17 10:59:34,111 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.TipoDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumento] 
2026-11-17T13:59:43.7037695Z 2026-11-17 10:59:34,111 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7037995Z  \-EntityResultImpl [br.com.caixa.sifap.entity.TipoDocumento]
2026-11-17T13:59:43.7038214Z  |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumento.coTipologiaDocumento]
2026-11-17T13:59:43.7038438Z  |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumento.deTipoDocumentoFarmacia]
2026-11-17T13:59:43.7038666Z  |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumento.icClasseTipoDocumento]
2026-11-17T13:59:43.7038890Z  |  \-BasicFetch [br.com.caixa.sifap.entity.TipoDocumento.icDocumentoObrigatorio]
2026-11-17T13:59:43.7038963Z 
2026-11-17T13:59:43.7039161Z 2026-11-17 10:59:34,112 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7039303Z     SelectStatement {
2026-11-17T13:59:43.7039405Z       FromClause {
2026-11-17T13:59:43.7039529Z         StandardTableGroup (td1 : br.com.caixa.sifap.entity.TipoDocumento) {
2026-11-17T13:59:43.7039687Z           primaryTableReference : FAPDB001.dbo.FAPTB006_TIPO_DOCUMENTO as td1_0
2026-11-17T13:59:43.7039806Z         }
2026-11-17T13:59:43.7039890Z       }
2026-11-17T13:59:43.7039976Z     }
2026-11-17T13:59:43.7040011Z 
2026-11-17T13:59:43.7040284Z 2026-11-17 10:59:34,112 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.TipoDocumento` entity using padded IN-list : 16 (16)
2026-11-17T13:59:43.7040579Z 2026-11-17 10:59:34,112 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : td1_0
2026-11-17T13:59:43.7041032Z 2026-11-17 10:59:34,112 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.TipoDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumento] 
2026-11-17T13:59:43.7041432Z 2026-11-17 10:59:34,112 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7041651Z  \-EntityResultImpl [br.com.caixa.sifap.entity.TipoDocumento]
2026-11-17T13:59:43.7041866Z  |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumento.coTipologiaDocumento]
2026-11-17T13:59:43.7042092Z  |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumento.deTipoDocumentoFarmacia]
2026-11-17T13:59:43.7042319Z  |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumento.icClasseTipoDocumento]
2026-11-17T13:59:43.7042593Z  |  \-BasicFetch [br.com.caixa.sifap.entity.TipoDocumento.icDocumentoObrigatorio]
2026-11-17T13:59:43.7042666Z 
2026-11-17T13:59:43.7042864Z 2026-11-17 10:59:34,112 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7043006Z     SelectStatement {
2026-11-17T13:59:43.7043108Z       FromClause {
2026-11-17T13:59:43.7043233Z         StandardTableGroup (td1 : br.com.caixa.sifap.entity.TipoDocumento) {
2026-11-17T13:59:43.7043390Z           primaryTableReference : FAPDB001.dbo.FAPTB006_TIPO_DOCUMENTO as td1_0
2026-11-17T13:59:43.7043506Z         }
2026-11-17T13:59:43.7043589Z       }
2026-11-17T13:59:43.7043674Z     }
2026-11-17T13:59:43.7043708Z 
2026-11-17T13:59:43.7043965Z 2026-11-17 10:59:34,112 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.TipoDocumento
2026-11-17T13:59:43.7044421Z 2026-11-17 10:59:34,112 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_TIPO_DOCUMENTO from FAPDB001.dbo.FAPTB006_TIPO_DOCUMENTO where NU_TIPO_DOCUMENTO=?
2026-11-17T13:59:43.7044924Z 2026-11-17 10:59:34,112 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB006_TIPO_DOCUMENTO (CO_TIPOLOGIA_DOCUMENTO,DE_TIPO_DOCUMENTO_FARMACIA,IC_CLASSE_TIPO_DOCUMENTO,IC_DOCUMENTO_OBRIGATORIO,NU_TIPO_DOCUMENTO) values (?,?,?,?,?)
2026-11-17T13:59:43.7045452Z 2026-11-17 10:59:34,112 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB006_TIPO_DOCUMENTO set CO_TIPOLOGIA_DOCUMENTO=?,DE_TIPO_DOCUMENTO_FARMACIA=?,IC_CLASSE_TIPO_DOCUMENTO=?,IC_DOCUMENTO_OBRIGATORIO=? where NU_TIPO_DOCUMENTO=?
2026-11-17T13:59:43.7045876Z 2026-11-17 10:59:34,112 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB006_TIPO_DOCUMENTO where NU_TIPO_DOCUMENTO=?
2026-11-17T13:59:43.7046186Z 2026-11-17 10:59:34,112 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : iad1_0
2026-11-17T13:59:43.7046665Z 2026-11-17 10:59:34,112 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.ItemAnaliseDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.ItemAnaliseDocumento] for NavigablePath [br.com.caixa.sifap.entity.ItemAnaliseDocumento] 
2026-11-17T13:59:43.7047399Z 2026-11-17 10:59:34,112 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@246cca22] with identifierForTableGroup [br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento] for NavigablePath [br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento] 
2026-11-17T13:59:43.7048039Z 2026-11-17 10:59:34,112 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@7dad9132] with identifierForTableGroup [br.com.caixa.sifap.entity.ItemAnaliseDocumento.tipoDocumentoItemValidacao] for NavigablePath [br.com.caixa.sifap.entity.ItemAnaliseDocumento.tipoDocumentoItemValidacao] 
2026-11-17T13:59:43.7048409Z 2026-11-17 10:59:34,112 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7048634Z  \-EntityResultImpl [br.com.caixa.sifap.entity.ItemAnaliseDocumento]
2026-11-17T13:59:43.7048913Z  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento]
2026-11-17T13:59:43.7049147Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.dhItemAnalise]
2026-11-17T13:59:43.7049369Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.icItemPendente]
2026-11-17T13:59:43.7049588Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.nuMatricula]
2026-11-17T13:59:43.7049817Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.nuSqnclAnaliseDocumento]
2026-11-17T13:59:43.7050046Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.nuTipoDcmtoItmVldco]
2026-11-17T13:59:43.7050335Z  |  \-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.ItemAnaliseDocumento.tipoDocumentoItemValidacao]
2026-11-17T13:59:43.7050420Z 
2026-11-17T13:59:43.7050618Z 2026-11-17 10:59:34,112 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7050759Z     SelectStatement {
2026-11-17T13:59:43.7050864Z       FromClause {
2026-11-17T13:59:43.7051016Z         StandardTableGroup (iad1 : br.com.caixa.sifap.entity.ItemAnaliseDocumento) {
2026-11-17T13:59:43.7051176Z           primaryTableReference : FAPDB001.dbo.FAPTB018_ITEM_ANALISE_DCMTO as iad1_0
2026-11-17T13:59:43.7051310Z           TableGroupJoins {
2026-11-17T13:59:43.7051462Z             left  join LazyTableGroup (ad1 : br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento) {
2026-11-17T13:59:43.7051622Z             }
2026-11-17T13:59:43.7051772Z             left  join LazyTableGroup (tdiv1 : br.com.caixa.sifap.entity.ItemAnaliseDocumento.tipoDocumentoItemValidacao) {
2026-11-17T13:59:43.7051915Z             }
2026-11-17T13:59:43.7052002Z           }
2026-11-17T13:59:43.7052088Z         }
2026-11-17T13:59:43.7052166Z       }
2026-11-17T13:59:43.7052255Z     }
2026-11-17T13:59:43.7052297Z 
2026-11-17T13:59:43.7052568Z 2026-11-17 10:59:34,112 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.ItemAnaliseDocumento` entity using padded IN-list : 16 (16)
2026-11-17T13:59:43.7052876Z 2026-11-17 10:59:34,112 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : iad1_0
2026-11-17T13:59:43.7053347Z 2026-11-17 10:59:34,112 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.ItemAnaliseDocumento)] with identifierForTableGroup [br.com.caixa.sifap.entity.ItemAnaliseDocumento] for NavigablePath [br.com.caixa.sifap.entity.ItemAnaliseDocumento] 
2026-11-17T13:59:43.7053941Z 2026-11-17 10:59:34,113 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@6b13f184] with identifierForTableGroup [br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento] for NavigablePath [br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento] 
2026-11-17T13:59:43.7054636Z 2026-11-17 10:59:34,113 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@7735c294] with identifierForTableGroup [br.com.caixa.sifap.entity.ItemAnaliseDocumento.tipoDocumentoItemValidacao] for NavigablePath [br.com.caixa.sifap.entity.ItemAnaliseDocumento.tipoDocumentoItemValidacao] 
2026-11-17T13:59:43.7055023Z 2026-11-17 10:59:34,113 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7055251Z  \-EntityResultImpl [br.com.caixa.sifap.entity.ItemAnaliseDocumento]
2026-11-17T13:59:43.7055480Z  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento]
2026-11-17T13:59:43.7055714Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.dhItemAnalise]
2026-11-17T13:59:43.7055936Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.icItemPendente]
2026-11-17T13:59:43.7056152Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.nuMatricula]
2026-11-17T13:59:43.7056421Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.nuSqnclAnaliseDocumento]
2026-11-17T13:59:43.7056652Z  |  +-BasicFetch [br.com.caixa.sifap.entity.ItemAnaliseDocumento.nuTipoDcmtoItmVldco]
2026-11-17T13:59:43.7056903Z  |  \-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.ItemAnaliseDocumento.tipoDocumentoItemValidacao]
2026-11-17T13:59:43.7056985Z 
2026-11-17T13:59:43.7057185Z 2026-11-17 10:59:34,113 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7057326Z     SelectStatement {
2026-11-17T13:59:43.7057428Z       FromClause {
2026-11-17T13:59:43.7057564Z         StandardTableGroup (iad1 : br.com.caixa.sifap.entity.ItemAnaliseDocumento) {
2026-11-17T13:59:43.7057767Z           primaryTableReference : FAPDB001.dbo.FAPTB018_ITEM_ANALISE_DCMTO as iad1_0
2026-11-17T13:59:43.7057899Z           TableGroupJoins {
2026-11-17T13:59:43.7058042Z             left  join LazyTableGroup (ad1 : br.com.caixa.sifap.entity.ItemAnaliseDocumento.analiseDocumento) {
2026-11-17T13:59:43.7058183Z             }
2026-11-17T13:59:43.7058330Z             left  join LazyTableGroup (tdiv1 : br.com.caixa.sifap.entity.ItemAnaliseDocumento.tipoDocumentoItemValidacao) {
2026-11-17T13:59:43.7058470Z             }
2026-11-17T13:59:43.7058558Z           }
2026-11-17T13:59:43.7058647Z         }
2026-11-17T13:59:43.7058732Z       }
2026-11-17T13:59:43.7058819Z     }
2026-11-17T13:59:43.7058854Z 
2026-11-17T13:59:43.7059124Z 2026-11-17 10:59:34,113 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.ItemAnaliseDocumento
2026-11-17T13:59:43.7059526Z 2026-11-17 10:59:34,113 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_ITEM_ANALISE_DOCUMENTO from FAPDB001.dbo.FAPTB018_ITEM_ANALISE_DCMTO where NU_ITEM_ANALISE_DOCUMENTO=?
2026-11-17T13:59:43.7060010Z 2026-11-17 10:59:34,113 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB018_ITEM_ANALISE_DCMTO (DH_ITEM_ANALISE,IC_ITEM_PENDENTE,NU_MATRICULA,NU_SQNCL_ANALISE_DOCUMENTO,NU_TIPO_DCMTO_ITM_VLDCO) values (?,?,?,?,?)
2026-11-17T13:59:43.7060528Z 2026-11-17 10:59:34,113 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB018_ITEM_ANALISE_DCMTO set DH_ITEM_ANALISE=?,IC_ITEM_PENDENTE=?,NU_MATRICULA=?,NU_SQNCL_ANALISE_DOCUMENTO=?,NU_TIPO_DCMTO_ITM_VLDCO=? where NU_ITEM_ANALISE_DOCUMENTO=?
2026-11-17T13:59:43.7060964Z 2026-11-17 10:59:34,113 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB018_ITEM_ANALISE_DCMTO where NU_ITEM_ANALISE_DOCUMENTO=?
2026-11-17T13:59:43.7061271Z 2026-11-17 10:59:34,113 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : tdiv1_0
2026-11-17T13:59:43.7061760Z 2026-11-17 10:59:34,113 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.TipoDocumentoItemValidacao)] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao] 
2026-11-17T13:59:43.7062366Z 2026-11-17 10:59:34,113 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@7d4baff5] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.itemValidacao] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.itemValidacao] 
2026-11-17T13:59:43.7062962Z 2026-11-17 10:59:34,113 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@7d2c2f30] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.tipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.tipoDocumento] 
2026-11-17T13:59:43.7063337Z 2026-11-17 10:59:34,113 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7063596Z  \-EntityResultImpl [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao]
2026-11-17T13:59:43.7063836Z  |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.deJustificativaPadrao]
2026-11-17T13:59:43.7064086Z  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.itemValidacao]
2026-11-17T13:59:43.7064388Z  |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.nuItemValidacao]
2026-11-17T13:59:43.7064632Z  |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.nuTipoDocumento]
2026-11-17T13:59:43.7064882Z  |  \-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.tipoDocumento]
2026-11-17T13:59:43.7064997Z 
2026-11-17T13:59:43.7065196Z 2026-11-17 10:59:34,113 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7065337Z     SelectStatement {
2026-11-17T13:59:43.7065439Z       FromClause {
2026-11-17T13:59:43.7065572Z         StandardTableGroup (tdiv1 : br.com.caixa.sifap.entity.TipoDocumentoItemValidacao) {
2026-11-17T13:59:43.7065740Z           primaryTableReference : FAPDB001.dbo.FAPTB017_TIPO_DCMTO_ITM_VLDCO as tdiv1_0
2026-11-17T13:59:43.7065874Z           TableGroupJoins {
2026-11-17T13:59:43.7066066Z             left  join LazyTableGroup (iv1 : br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.itemValidacao) {
2026-11-17T13:59:43.7066217Z             }
2026-11-17T13:59:43.7066357Z             left  join LazyTableGroup (td1 : br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.tipoDocumento) {
2026-11-17T13:59:43.7066482Z             }
2026-11-17T13:59:43.7066571Z           }
2026-11-17T13:59:43.7066651Z         }
2026-11-17T13:59:43.7066738Z       }
2026-11-17T13:59:43.7066824Z     }
2026-11-17T13:59:43.7066866Z 
2026-11-17T13:59:43.7067149Z 2026-11-17 10:59:34,113 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.com.caixa.sifap.entity.TipoDocumentoItemValidacao` entity using padded IN-list : 16 (16)
2026-11-17T13:59:43.7067459Z 2026-11-17 10:59:34,113 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : tdiv1_0
2026-11-17T13:59:43.7067937Z 2026-11-17 10:59:34,113 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.TipoDocumentoItemValidacao)] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao] 
2026-11-17T13:59:43.7068543Z 2026-11-17 10:59:34,113 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@7e6413eb] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.itemValidacao] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.itemValidacao] 
2026-11-17T13:59:43.7069149Z 2026-11-17 10:59:34,113 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@4933503] with identifierForTableGroup [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.tipoDocumento] for NavigablePath [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.tipoDocumento] 
2026-11-17T13:59:43.7069538Z 2026-11-17 10:59:34,114 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7069757Z  \-EntityResultImpl [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao]
2026-11-17T13:59:43.7069990Z  |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.deJustificativaPadrao]
2026-11-17T13:59:43.7070240Z  |  +-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.itemValidacao]
2026-11-17T13:59:43.7070481Z  |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.nuItemValidacao]
2026-11-17T13:59:43.7070715Z  |  +-BasicFetch [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.nuTipoDocumento]
2026-11-17T13:59:43.7070958Z  |  \-EntityDelayedFetchImpl [br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.tipoDocumento]
2026-11-17T13:59:43.7071082Z 
2026-11-17T13:59:43.7071280Z 2026-11-17 10:59:34,114 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7071422Z     SelectStatement {
2026-11-17T13:59:43.7071525Z       FromClause {
2026-11-17T13:59:43.7071662Z         StandardTableGroup (tdiv1 : br.com.caixa.sifap.entity.TipoDocumentoItemValidacao) {
2026-11-17T13:59:43.7071829Z           primaryTableReference : FAPDB001.dbo.FAPTB017_TIPO_DCMTO_ITM_VLDCO as tdiv1_0
2026-11-17T13:59:43.7071960Z           TableGroupJoins {
2026-11-17T13:59:43.7072109Z             left  join LazyTableGroup (iv1 : br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.itemValidacao) {
2026-11-17T13:59:43.7072278Z             }
2026-11-17T13:59:43.7072407Z             left  join LazyTableGroup (td1 : br.com.caixa.sifap.entity.TipoDocumentoItemValidacao.tipoDocumento) {
2026-11-17T13:59:43.7072543Z             }
2026-11-17T13:59:43.7072634Z           }
2026-11-17T13:59:43.7072722Z         }
2026-11-17T13:59:43.7072808Z       }
2026-11-17T13:59:43.7072893Z     }
2026-11-17T13:59:43.7072928Z 
2026-11-17T13:59:43.7073199Z 2026-11-17 10:59:34,114 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.com.caixa.sifap.entity.TipoDocumentoItemValidacao
2026-11-17T13:59:43.7073606Z 2026-11-17 10:59:34,114 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select NU_TIPO_DCMTO_ITM_VLDCO from FAPDB001.dbo.FAPTB017_TIPO_DCMTO_ITM_VLDCO where NU_TIPO_DCMTO_ITM_VLDCO=?
2026-11-17T13:59:43.7074077Z 2026-11-17 10:59:34,114 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into FAPDB001.dbo.FAPTB017_TIPO_DCMTO_ITM_VLDCO (DE_JUSTIFICATIVA_PADRAO,NU_ITEM_VALIDACAO,NU_TIPO_DOCUMENTO,NU_TIPO_DCMTO_ITM_VLDCO) values (?,?,?,?)
2026-11-17T13:59:43.7074737Z 2026-11-17 10:59:34,114 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update FAPDB001.dbo.FAPTB017_TIPO_DCMTO_ITM_VLDCO set DE_JUSTIFICATIVA_PADRAO=?,NU_ITEM_VALIDACAO=?,NU_TIPO_DOCUMENTO=? where NU_TIPO_DCMTO_ITM_VLDCO=?
2026-11-17T13:59:43.7075155Z 2026-11-17 10:59:34,114 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from FAPDB001.dbo.FAPTB017_TIPO_DCMTO_ITM_VLDCO where NU_TIPO_DCMTO_ITM_VLDCO=?
2026-11-17T13:59:43.7075469Z 2026-11-17 10:59:34,117 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : s1_0
2026-11-17T13:59:43.7075939Z 2026-11-17 10:59:34,118 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.OneToManyTableGroup@20b33c26] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.situacoes] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.situacoes] 
2026-11-17T13:59:43.7076530Z 2026-11-17 10:59:34,118 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmacia.situacoes.{element})] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}] 
2026-11-17T13:59:43.7077138Z 2026-11-17 10:59:34,121 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@b80703b] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.farmacia] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.farmacia] 
2026-11-17T13:59:43.7077732Z 2026-11-17 10:59:34,122 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@10e42f7d] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.tipoSituacao] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.tipoSituacao] 
2026-11-17T13:59:43.7078122Z 2026-11-17 10:59:34,123 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : ts1_0
2026-11-17T13:59:43.7078428Z 2026-11-17 10:59:34,126 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7078658Z  \-CollectionDomainResult [br.com.caixa.sifap.entity.Farmacia.situacoes]
2026-11-17T13:59:43.7078729Z 
2026-11-17T13:59:43.7078928Z 2026-11-17 10:59:34,126 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7079071Z     SelectStatement {
2026-11-17T13:59:43.7079171Z       FromClause {
2026-11-17T13:59:43.7079305Z         OneToManyTableGroup (s1 : br.com.caixa.sifap.entity.Farmacia.situacoes) {
2026-11-17T13:59:43.7079502Z           primaryTableReference : dbo.FAPTB002_SITUACAO_FARMACIA as s1_0
2026-11-17T13:59:43.7079632Z           TableGroupJoins {
2026-11-17T13:59:43.7079781Z             left  join LazyTableGroup (f1 : br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.farmacia) {
2026-11-17T13:59:43.7079917Z             }
2026-11-17T13:59:43.7080055Z             left  join LazyTableGroup (ts1 : br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.tipoSituacao) {
2026-11-17T13:59:43.7080228Z               primaryTableReference : dbo.FAPTB003_TIPO_STCO_FARMACIA as ts1_0
2026-11-17T13:59:43.7080347Z             }
2026-11-17T13:59:43.7080435Z           }
2026-11-17T13:59:43.7080522Z         }
2026-11-17T13:59:43.7080609Z       }
2026-11-17T13:59:43.7080693Z     }
2026-11-17T13:59:43.7080727Z 
2026-11-17T13:59:43.7081019Z 2026-11-17 10:59:34,127 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Using IN-predicate batch fetching strategy for collection `br.com.caixa.sifap.entity.Farmacia.situacoes` : 16 (16)
2026-11-17T13:59:43.7081332Z 2026-11-17 10:59:34,127 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : s1_0
2026-11-17T13:59:43.7081785Z 2026-11-17 10:59:34,127 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.OneToManyTableGroup@148ff269] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.situacoes] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.situacoes] 
2026-11-17T13:59:43.7082375Z 2026-11-17 10:59:34,127 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmacia.situacoes.{element})] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}] 
2026-11-17T13:59:43.7082956Z 2026-11-17 10:59:34,127 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@766fbfa] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.farmacia] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.farmacia] 
2026-11-17T13:59:43.7083556Z 2026-11-17 10:59:34,127 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@2df59a12] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.tipoSituacao] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.tipoSituacao] 
2026-11-17T13:59:43.7083942Z 2026-11-17 10:59:34,127 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : ts1_0
2026-11-17T13:59:43.7084256Z 2026-11-17 10:59:34,128 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7084505Z  \-CollectionDomainResult [br.com.caixa.sifap.entity.Farmacia.situacoes]
2026-11-17T13:59:43.7084578Z 
2026-11-17T13:59:43.7084780Z 2026-11-17 10:59:34,128 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7084923Z     SelectStatement {
2026-11-17T13:59:43.7085027Z       FromClause {
2026-11-17T13:59:43.7085163Z         OneToManyTableGroup (s1 : br.com.caixa.sifap.entity.Farmacia.situacoes) {
2026-11-17T13:59:43.7085324Z           primaryTableReference : dbo.FAPTB002_SITUACAO_FARMACIA as s1_0
2026-11-17T13:59:43.7085493Z           TableGroupJoins {
2026-11-17T13:59:43.7085635Z             left  join LazyTableGroup (f1 : br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.farmacia) {
2026-11-17T13:59:43.7085768Z             }
2026-11-17T13:59:43.7085908Z             left  join LazyTableGroup (ts1 : br.com.caixa.sifap.entity.Farmacia.situacoes.{element}.tipoSituacao) {
2026-11-17T13:59:43.7086077Z               primaryTableReference : dbo.FAPTB003_TIPO_STCO_FARMACIA as ts1_0
2026-11-17T13:59:43.7086199Z             }
2026-11-17T13:59:43.7086288Z           }
2026-11-17T13:59:43.7086373Z         }
2026-11-17T13:59:43.7086491Z       }
2026-11-17T13:59:43.7086570Z     }
2026-11-17T13:59:43.7086613Z 
2026-11-17T13:59:43.7086864Z 2026-11-17 10:59:34,128 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Static SQL for collection: br.com.caixa.sifap.entity.Farmacia.situacoes
2026-11-17T13:59:43.7087156Z 2026-11-17 10:59:34,128 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : ia1_0
2026-11-17T13:59:43.7087636Z 2026-11-17 10:59:34,128 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.OneToManyTableGroup@1df78da0] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise] 
2026-11-17T13:59:43.7088275Z 2026-11-17 10:59:34,128 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element})] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}] 
2026-11-17T13:59:43.7088922Z 2026-11-17 10:59:34,128 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@205e0dbb] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.analiseDocumento] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.analiseDocumento] 
2026-11-17T13:59:43.7089587Z 2026-11-17 10:59:34,128 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@4939bd92] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.tipoDocumentoItemValidacao] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.tipoDocumentoItemValidacao] 
2026-11-17T13:59:43.7089982Z 2026-11-17 10:59:34,129 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7090217Z  \-CollectionDomainResult [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise]
2026-11-17T13:59:43.7090291Z 
2026-11-17T13:59:43.7090489Z 2026-11-17 10:59:34,129 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7090629Z     SelectStatement {
2026-11-17T13:59:43.7090730Z       FromClause {
2026-11-17T13:59:43.7090866Z         OneToManyTableGroup (ia1 : br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise) {
2026-11-17T13:59:43.7091049Z           primaryTableReference : FAPDB001.dbo.FAPTB018_ITEM_ANALISE_DCMTO as ia1_0
2026-11-17T13:59:43.7091182Z           TableGroupJoins {
2026-11-17T13:59:43.7091332Z             left  join LazyTableGroup (ad1 : br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.analiseDocumento) {
2026-11-17T13:59:43.7091476Z             }
2026-11-17T13:59:43.7091629Z             left  join LazyTableGroup (tdiv1 : br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.tipoDocumentoItemValidacao) {
2026-11-17T13:59:43.7091779Z             }
2026-11-17T13:59:43.7091866Z           }
2026-11-17T13:59:43.7091952Z         }
2026-11-17T13:59:43.7092035Z       }
2026-11-17T13:59:43.7092119Z     }
2026-11-17T13:59:43.7092154Z 
2026-11-17T13:59:43.7092498Z 2026-11-17 10:59:34,129 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Using IN-predicate batch fetching strategy for collection `br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise` : 16 (16)
2026-11-17T13:59:43.7092809Z 2026-11-17 10:59:34,129 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : ia1_0
2026-11-17T13:59:43.7093278Z 2026-11-17 10:59:34,129 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.OneToManyTableGroup@6cdca1f] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise] 
2026-11-17T13:59:43.7093935Z 2026-11-17 10:59:34,129 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element})] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}] 
2026-11-17T13:59:43.7094634Z 2026-11-17 10:59:34,129 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@59e443e7] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.analiseDocumento] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.analiseDocumento] 
2026-11-17T13:59:43.7095298Z 2026-11-17 10:59:34,129 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@447ba750] with identifierForTableGroup [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.tipoDocumentoItemValidacao] for NavigablePath [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.tipoDocumentoItemValidacao] 
2026-11-17T13:59:43.7095681Z 2026-11-17 10:59:34,129 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7095921Z  \-CollectionDomainResult [br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise]
2026-11-17T13:59:43.7096033Z 
2026-11-17T13:59:43.7096252Z 2026-11-17 10:59:34,129 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7096394Z     SelectStatement {
2026-11-17T13:59:43.7096495Z       FromClause {
2026-11-17T13:59:43.7096632Z         OneToManyTableGroup (ia1 : br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise) {
2026-11-17T13:59:43.7096802Z           primaryTableReference : FAPDB001.dbo.FAPTB018_ITEM_ANALISE_DCMTO as ia1_0
2026-11-17T13:59:43.7096933Z           TableGroupJoins {
2026-11-17T13:59:43.7097087Z             left  join LazyTableGroup (ad1 : br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.analiseDocumento) {
2026-11-17T13:59:43.7097229Z             }
2026-11-17T13:59:43.7097372Z             left  join LazyTableGroup (tdiv1 : br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise.{element}.tipoDocumentoItemValidacao) {
2026-11-17T13:59:43.7097519Z             }
2026-11-17T13:59:43.7097604Z           }
2026-11-17T13:59:43.7097690Z         }
2026-11-17T13:59:43.7097774Z       }
2026-11-17T13:59:43.7097859Z     }
2026-11-17T13:59:43.7097893Z 
2026-11-17T13:59:43.7098157Z 2026-11-17 10:59:34,129 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Static SQL for collection: br.com.caixa.sifap.entity.AnaliseDocumento.itensAnalise
2026-11-17T13:59:43.7098450Z 2026-11-17 10:59:34,129 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : rt1_0
2026-11-17T13:59:43.7098938Z 2026-11-17 10:59:34,129 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.OneToManyTableGroup@2d15f5ea] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica] 
2026-11-17T13:59:43.7099580Z 2026-11-17 10:59:34,129 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element})] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}] 
2026-11-17T13:59:43.7100301Z 2026-11-17 10:59:34,129 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@1ca3e1a4] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmaceutico] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmaceutico] 
2026-11-17T13:59:43.7100734Z 2026-11-17 10:59:34,129 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-11-17T13:59:43.7101246Z 2026-11-17 10:59:34,130 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@115048eb] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmacia] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmacia] 
2026-11-17T13:59:43.7101629Z 2026-11-17 10:59:34,130 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7101868Z  \-CollectionDomainResult [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica]
2026-11-17T13:59:43.7101946Z 
2026-11-17T13:59:43.7102143Z 2026-11-17 10:59:34,130 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7102286Z     SelectStatement {
2026-11-17T13:59:43.7102387Z       FromClause {
2026-11-17T13:59:43.7102529Z         OneToManyTableGroup (rt1 : br.com.caixa.sifap.entity.Farmacia.representacoesTecnica) {
2026-11-17T13:59:43.7102696Z           primaryTableReference : FAPDB001.dbo.FAPTB005_RPRSE_TECNICA as rt1_0
2026-11-17T13:59:43.7102830Z           TableGroupJoins {
2026-11-17T13:59:43.7102985Z             left  join LazyTableGroup (f1 : br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmaceutico) {
2026-11-17T13:59:43.7103166Z               primaryTableReference : FAPDB001.dbo.FAPTB004_FARMACEUTICO as f1_0
2026-11-17T13:59:43.7103280Z             }
2026-11-17T13:59:43.7103426Z             left  join LazyTableGroup (f2 : br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmacia) {
2026-11-17T13:59:43.7103566Z             }
2026-11-17T13:59:43.7103652Z           }
2026-11-17T13:59:43.7103742Z         }
2026-11-17T13:59:43.7103828Z       }
2026-11-17T13:59:43.7103914Z     }
2026-11-17T13:59:43.7103949Z 
2026-11-17T13:59:43.7104337Z 2026-11-17 10:59:34,130 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Using IN-predicate batch fetching strategy for collection `br.com.caixa.sifap.entity.Farmacia.representacoesTecnica` : 16 (16)
2026-11-17T13:59:43.7104669Z 2026-11-17 10:59:34,130 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : rt1_0
2026-11-17T13:59:43.7105156Z 2026-11-17 10:59:34,130 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.OneToManyTableGroup@68b58c9b] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica] 
2026-11-17T13:59:43.7105794Z 2026-11-17 10:59:34,130 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element})] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}] 
2026-11-17T13:59:43.7106445Z 2026-11-17 10:59:34,130 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@5c7fed8] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmaceutico] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmaceutico] 
2026-11-17T13:59:43.7106868Z 2026-11-17 10:59:34,130 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : f1_0
2026-11-17T13:59:43.7107373Z 2026-11-17 10:59:34,131 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@7cce4321] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmacia] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmacia] 
2026-11-17T13:59:43.7107771Z 2026-11-17 10:59:34,131 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7108012Z  \-CollectionDomainResult [br.com.caixa.sifap.entity.Farmacia.representacoesTecnica]
2026-11-17T13:59:43.7108089Z 
2026-11-17T13:59:43.7108289Z 2026-11-17 10:59:34,131 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7108430Z     SelectStatement {
2026-11-17T13:59:43.7108531Z       FromClause {
2026-11-17T13:59:43.7108674Z         OneToManyTableGroup (rt1 : br.com.caixa.sifap.entity.Farmacia.representacoesTecnica) {
2026-11-17T13:59:43.7108844Z           primaryTableReference : FAPDB001.dbo.FAPTB005_RPRSE_TECNICA as rt1_0
2026-11-17T13:59:43.7108974Z           TableGroupJoins {
2026-11-17T13:59:43.7109131Z             left  join LazyTableGroup (f1 : br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmaceutico) {
2026-11-17T13:59:43.7109310Z               primaryTableReference : FAPDB001.dbo.FAPTB004_FARMACEUTICO as f1_0
2026-11-17T13:59:43.7109423Z             }
2026-11-17T13:59:43.7109571Z             left  join LazyTableGroup (f2 : br.com.caixa.sifap.entity.Farmacia.representacoesTecnica.{element}.farmacia) {
2026-11-17T13:59:43.7109710Z             }
2026-11-17T13:59:43.7109798Z           }
2026-11-17T13:59:43.7109887Z         }
2026-11-17T13:59:43.7109972Z       }
2026-11-17T13:59:43.7110058Z     }
2026-11-17T13:59:43.7110096Z 
2026-11-17T13:59:43.7110361Z 2026-11-17 10:59:34,131 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Static SQL for collection: br.com.caixa.sifap.entity.Farmacia.representacoesTecnica
2026-11-17T13:59:43.7110656Z 2026-11-17 10:59:34,131 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : r1_0
2026-11-17T13:59:43.7111122Z 2026-11-17 10:59:34,131 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.OneToManyTableGroup@34e52a47] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoes] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoes] 
2026-11-17T13:59:43.7111734Z 2026-11-17 10:59:34,131 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmacia.representacoes.{element})] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}] 
2026-11-17T13:59:43.7112349Z 2026-11-17 10:59:34,131 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@15221c35] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.farmacia] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.farmacia] 
2026-11-17T13:59:43.7112965Z 2026-11-17 10:59:34,131 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@55dab0f9] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.representante] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.representante] 
2026-11-17T13:59:43.7113377Z 2026-11-17 10:59:34,131 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : r2_0
2026-11-17T13:59:43.7113632Z 2026-11-17 10:59:34,131 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7113864Z  \-CollectionDomainResult [br.com.caixa.sifap.entity.Farmacia.representacoes]
2026-11-17T13:59:43.7113939Z 
2026-11-17T13:59:43.7114138Z 2026-11-17 10:59:34,132 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7114394Z     SelectStatement {
2026-11-17T13:59:43.7114498Z       FromClause {
2026-11-17T13:59:43.7114638Z         OneToManyTableGroup (r1 : br.com.caixa.sifap.entity.Farmacia.representacoes) {
2026-11-17T13:59:43.7114843Z           primaryTableReference : FAPDB001.dbo.FAPTB011_RPRTO_FARMACIA as r1_0
2026-11-17T13:59:43.7114973Z           TableGroupJoins {
2026-11-17T13:59:43.7115117Z             left  join LazyTableGroup (f1 : br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.farmacia) {
2026-11-17T13:59:43.7115256Z             }
2026-11-17T13:59:43.7115397Z             left  join LazyTableGroup (r2 : br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.representante) {
2026-11-17T13:59:43.7115574Z               primaryTableReference : FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA as r2_0
2026-11-17T13:59:43.7115693Z             }
2026-11-17T13:59:43.7115781Z           }
2026-11-17T13:59:43.7115868Z         }
2026-11-17T13:59:43.7115954Z       }
2026-11-17T13:59:43.7116033Z     }
2026-11-17T13:59:43.7116075Z 
2026-11-17T13:59:43.7116377Z 2026-11-17 10:59:34,132 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Using IN-predicate batch fetching strategy for collection `br.com.caixa.sifap.entity.Farmacia.representacoes` : 16 (16)
2026-11-17T13:59:43.7116692Z 2026-11-17 10:59:34,132 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : r1_0
2026-11-17T13:59:43.7117155Z 2026-11-17 10:59:34,132 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.OneToManyTableGroup@7aeb5519] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoes] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoes] 
2026-11-17T13:59:43.7117769Z 2026-11-17 10:59:34,132 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.com.caixa.sifap.entity.Farmacia.representacoes.{element})] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}] 
2026-11-17T13:59:43.7118381Z 2026-11-17 10:59:34,132 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@3aebed5b] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.farmacia] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.farmacia] 
2026-11-17T13:59:43.7118994Z 2026-11-17 10:59:34,132 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [org.hibernate.sql.ast.tree.from.LazyTableGroup@1cb4681b] with identifierForTableGroup [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.representante] for NavigablePath [br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.representante] 
2026-11-17T13:59:43.7119366Z 2026-11-17 10:59:34,132 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : r2_0
2026-11-17T13:59:43.7119620Z 2026-11-17 10:59:34,132 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
2026-11-17T13:59:43.7119851Z  \-CollectionDomainResult [br.com.caixa.sifap.entity.Farmacia.representacoes]
2026-11-17T13:59:43.7119926Z 
2026-11-17T13:59:43.7120121Z 2026-11-17 10:59:34,132 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
2026-11-17T13:59:43.7120267Z     SelectStatement {
2026-11-17T13:59:43.7120372Z       FromClause {
2026-11-17T13:59:43.7120509Z         OneToManyTableGroup (r1 : br.com.caixa.sifap.entity.Farmacia.representacoes) {
2026-11-17T13:59:43.7120743Z           primaryTableReference : FAPDB001.dbo.FAPTB011_RPRTO_FARMACIA as r1_0
2026-11-17T13:59:43.7120867Z           TableGroupJoins {
2026-11-17T13:59:43.7121017Z             left  join LazyTableGroup (f1 : br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.farmacia) {
2026-11-17T13:59:43.7121151Z             }
2026-11-17T13:59:43.7121292Z             left  join LazyTableGroup (r2 : br.com.caixa.sifap.entity.Farmacia.representacoes.{element}.representante) {
2026-11-17T13:59:43.7121468Z               primaryTableReference : FAPDB001.dbo.FAPTB010_RPRSE_FARMACIA as r2_0
2026-11-17T13:59:43.7121619Z             }
2026-11-17T13:59:43.7121708Z           }
2026-11-17T13:59:43.7121795Z         }
2026-11-17T13:59:43.7121880Z       }
2026-11-17T13:59:43.7121958Z     }
2026-11-17T13:59:43.7122000Z 
2026-11-17T13:59:43.7122263Z 2026-11-17 10:59:34,132 DEBUG [org.hib.orm.jdb.mutation] (JPA Startup Thread) Static SQL for collection: br.com.caixa.sifap.entity.Farmacia.representacoes
2026-11-17T13:59:43.7122692Z 2026-11-17 10:59:34,186 DEBUG [org.hib.typ.spi.TypeConfiguration$Scope] (JPA Startup Thread) Scoping TypeConfiguration [org.hibernate.type.spi.TypeConfiguration@3958db82] to SessionFactoryImplementor [org.hibernate.internal.SessionFactoryImpl@4fad083e]
2026-11-17T13:59:43.7123171Z 2026-11-17 10:59:34,188 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating InstantiationResultMappingMemento for JPA ConstructorResult(br.com.caixa.sifap.dto.FarmaciaSituacaoDTO) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-11-17T13:59:43.7123587Z 2026-11-17 10:59:34,189 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(nuSituacaoFarmacia) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-11-17T13:59:43.7124001Z 2026-11-17 10:59:34,190 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(nuTipoSituacaoFarmacia) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-11-17T13:59:43.7124452Z 2026-11-17 10:59:34,190 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(descricaoSituacao) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-11-17T13:59:43.7124852Z 2026-11-17 10:59:34,190 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(nuFarmacia) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-11-17T13:59:43.7125245Z 2026-11-17 10:59:34,190 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(dhSituacaoFarmacia) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-11-17T13:59:43.7125638Z 2026-11-17 10:59:34,190 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(analistaBloqueio) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-11-17T13:59:43.7126014Z 2026-11-17 10:59:34,190 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(cnpj) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-11-17T13:59:43.7126385Z 2026-11-17 10:59:34,190 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(uf) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-11-17T13:59:43.7126763Z 2026-11-17 10:59:34,190 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(municipio) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-11-17T13:59:43.7127141Z 2026-11-17 10:59:34,190 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(etapa) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-11-17T13:59:43.7127523Z 2026-11-17 10:59:34,190 DEBUG [org.hib.orm.boo.query] (JPA Startup Thread) Generating ScalarResultMappingMemento for JPA ColumnResult(ultimoAnalista) for ResultSet mapping `FarmaciaSituacaoDTOMapping`
2026-11-17T13:59:43.7127885Z 2026-11-17 10:59:34,192 DEBUG [org.hib.que.nam.NamedObjectRepository] (JPA Startup Thread) Checking 0 named HQL queries
2026-11-17T13:59:43.7128169Z 2026-11-17 10:59:34,192 DEBUG [org.hib.que.nam.NamedObjectRepository] (JPA Startup Thread) Checking 0 named SQL queries
2026-11-17T13:59:43.7128499Z 2026-11-17 10:59:34,193 DEBUG [org.hib.too.sch.spi.SchemaManagementToolCoordinator] (JPA Startup Thread) No schema actions specified for contributor `orm`; doing nothing
2026-11-17T13:59:43.7128828Z 2026-11-17 10:59:34,193 DEBUG [org.hib.too.sch.spi.SchemaManagementToolCoordinator] (JPA Startup Thread) No actions found; doing nothing
2026-11-17T13:59:43.7129250Z 2026-11-17 10:59:34,193 DEBUG [io.qua.hib.orm.run.ser.QuarkusRuntimeInitDialectFactory] (JPA Startup Thread) Persistence unit <default>: Skipping database version check; expecting database version to be at least 13.0.0
2026-11-17T13:59:43.7129578Z 2026-11-17 10:59:34,193 DEBUG [org.hib.int.SessionFactoryImpl] (JPA Startup Thread) Instantiated SessionFactory
2026-11-17T13:59:43.7129854Z 2026-11-17 10:59:34,281 DEBUG [io.net.uti.NetUtil] (vert.x-eventloop-thread-1) -Djava.net.preferIPv4Stack: false
2026-11-17T13:59:43.7130138Z 2026-11-17 10:59:34,284 DEBUG [io.net.uti.NetUtil] (vert.x-eventloop-thread-1) -Djava.net.preferIPv6Addresses: false
2026-11-17T13:59:43.7130453Z 2026-11-17 10:59:34,285 DEBUG [io.net.uti.NetUtilInitializations] (vert.x-eventloop-thread-1) Loopback interface: lo (lo, 0:0:0:0:0:0:0:1%lo)
2026-11-17T13:59:43.7130748Z 2026-11-17 10:59:34,286 DEBUG [io.net.uti.NetUtil] (vert.x-eventloop-thread-1) /proc/sys/net/core/somaxconn: 4096
2026-11-17T13:59:43.7131064Z 2026-11-17 10:59:34,358 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.numHeapArenas: 4
2026-11-17T13:59:43.7131368Z 2026-11-17 10:59:34,358 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.numDirectArenas: 4
2026-11-17T13:59:43.7131670Z 2026-11-17 10:59:34,359 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.pageSize: 8192
2026-11-17T13:59:43.7131962Z 2026-11-17 10:59:34,359 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.maxOrder: 3
2026-11-17T13:59:43.7132257Z 2026-11-17 10:59:34,359 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.chunkSize: 65536
2026-11-17T13:59:43.7132557Z 2026-11-17 10:59:34,359 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.smallCacheSize: 256
2026-11-17T13:59:43.7132862Z 2026-11-17 10:59:34,359 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.normalCacheSize: 64
2026-11-17T13:59:43.7133176Z 2026-11-17 10:59:34,359 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.maxCachedBufferCapacity: 32768
2026-11-17T13:59:43.7133489Z 2026-11-17 10:59:34,359 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.cacheTrimInterval: 8192
2026-11-17T13:59:43.7133804Z 2026-11-17 10:59:34,359 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.cacheTrimIntervalMillis: 0
2026-11-17T13:59:43.7134118Z 2026-11-17 10:59:34,359 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.useCacheForAllThreads: false
2026-11-17T13:59:43.7134509Z 2026-11-17 10:59:34,359 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.maxCachedByteBuffersPerChunk: 1023
2026-11-17T13:59:43.7134865Z 2026-11-17 10:59:34,359 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.disableCacheFinalizersForFastThreadLocalThreads: false
2026-11-17T13:59:43.7135167Z 2026-11-17 10:59:34,498 DEBUG [io.net.buf.ByteBufUtil] (vert.x-eventloop-thread-1) -Dio.netty.allocator.type: pooled
2026-11-17T13:59:43.7135452Z 2026-11-17 10:59:34,498 DEBUG [io.net.buf.ByteBufUtil] (vert.x-eventloop-thread-1) -Dio.netty.threadLocalDirectBufferSize: 0
2026-11-17T13:59:43.7135790Z 2026-11-17 10:59:34,498 DEBUG [io.net.buf.ByteBufUtil] (vert.x-eventloop-thread-1) -Dio.netty.maxThreadLocalCharBufferSize: 16384
2026-11-17T13:59:43.7136157Z 2026-11-17 10:59:34,500 DEBUG [io.net.boo.ChannelInitializerExtensions] (vert.x-eventloop-thread-1) -Dio.netty.bootstrap.extensions: null
2026-11-17T13:59:43.7136564Z 2026-11-17 10:59:34,565 INFO  [io.quarkus] (main) sifap-centralizadora 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.15.7) started in 4.975s. Listening on: http://0.0.0.0:8080
2026-11-17T13:59:43.7136883Z 2026-11-17 10:59:34,565 INFO  [io.quarkus] (main) Profile prod activated. 
2026-11-17T13:59:43.7137328Z 2026-11-17 10:59:34,565 INFO  [io.quarkus] (main) Installed features: [agroal, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-h2, jdbc-mssql, narayana-jta, oidc, rest, rest-client, rest-client-jackson, rest-jackson, security, smallrye-context-propagation, smallrye-openapi, vertx]
2026-11-17T13:59:43.7138073Z 2026-11-17 10:59:34,644 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:49003f78145c11bb768c84e0c90000003f7814, Subject:CN=Microsoft TLS G2 RSA CA OCSP 10 External OCSP Responder 2026-06-, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 10, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:2098166502, Valid from:6/1/26, 3:50?PM, Valid until:11/28/26, 3:50?PM
2026-11-17T13:59:43.7138891Z 2026-11-17 10:59:34,645 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:49015d9bf5d9efb59dfedcac8c0000015d9bf5, Subject:CN=*.azureserviceprofiler.net, O=Microsoft Corporation, L=Redmond, ST=WA, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 10, O=Microsoft Corporation, C=US, Key type:RSA, Length:2048, Cert Id:1705008369, Valid from:11/16/26, 3:32?PM, Valid until:2/24/27, 2:32?PM
2026-11-17T13:59:43.7139662Z 2026-11-17 10:59:34,646 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:330000000f33206537ee42ae4f00000000000f, Subject:CN=Microsoft TLS G2 RSA CA OCSP 10, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:517509489, Valid from:8/1/25, 5:03?PM, Valid until:6/3/29, 5:03?PM
2026-11-17T13:59:43.7140418Z 2026-11-17 10:59:34,646 DEBUG [jdk.eve.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:b0c6b2c466917b04773c647d4afc0c8, Subject:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3081933591, Valid from:5/20/25, 9:00?PM, Valid until:6/19/29, 8:59?PM
2026-11-17T13:59:43.7140893Z 2026-11-17 10:59:34,648 DEBUG [jdk.eve.security] (reactor-http-epoll-1) ValidationChain: 1136084297, 3081933591, 517509489, 1705008369
2026-11-17T13:59:43.7141244Z 2026-11-17 10:59:34,660 DEBUG [jdk.eve.security] (reactor-http-epoll-1)  TLSHandshake: agent.azureserviceprofiler.net:443, TLSv1.3, TLS_AES_256_GCM_SHA384, 1705008369
2026-11-17T13:59:43.7141568Z 2026-11-17 10:59:37,969 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.maxCapacityPerThread: 4096
2026-11-17T13:59:43.7141847Z 2026-11-17 10:59:37,969 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.ratio: 8
2026-11-17T13:59:43.7142122Z 2026-11-17 10:59:37,969 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.chunkSize: 32
2026-11-17T13:59:43.7142398Z 2026-11-17 10:59:37,969 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.blocking: false
2026-11-17T13:59:43.7142692Z 2026-11-17 10:59:37,969 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.batchFastThreadLocalOnly: true
2026-11-17T13:59:43.7142988Z 2026-11-17 10:59:37,977 DEBUG [io.net.buf.AbstractByteBuf] (vert.x-eventloop-thread-1) -Dio.netty.buffer.checkAccessible: true
2026-11-17T13:59:43.7143309Z 2026-11-17 10:59:37,977 DEBUG [io.net.buf.AbstractByteBuf] (vert.x-eventloop-thread-1) -Dio.netty.buffer.checkBounds: true
2026-11-17T13:59:43.7143654Z 2026-11-17 10:59:37,977 DEBUG [io.net.uti.ResourceLeakDetectorFactory] (vert.x-eventloop-thread-1) Loaded default ResourceLeakDetector: io.netty.util.ResourceLeakDetector@4409f590
2026-11-17T13:59:43.7144048Z 2026-11-17 10:59:38,123 DEBUG [io.qua.ver.htt.run.sec.HttpAuthenticator] (vert.x-eventloop-thread-0) BasicAuthenticationMechanism has been enabled because no other authentication mechanism has been
2026-11-17T13:59:43.7144340Z detected, but there is no IdentityProvider based on username and password. Please use
2026-11-17T13:59:43.7144534Z one of supported extensions if you plan to use the mechanism.
2026-11-17T13:59:43.7144768Z For more information go to the https://quarkus.io/guides/security-basic-authentication-howto.
2026-11-17T13:59:43.7144849Z 
2026-11-17T13:59:43.7145102Z 2026-11-17 10:59:38,272 INFO  [io.qua.htt.access-log] (executor-thread-1) 25.1.10.1 - - [17/Nov/2026:10:59:38 -0300] "GET / HTTP/1.1" 200 2
2026-11-17T13:59:43.7145425Z 2026-11-17 10:59:38,272 INFO  [io.qua.htt.access-log] (executor-thread-2) 25.1.10.1 - - [17/Nov/2026:10:59:38 -0300] "GET / HTTP/1.1" 200 2
2026-11-17T13:59:43.7148372Z ##[section]Finishing: Logs da Aplicação




