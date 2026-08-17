Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SISGH-link-okd4
/
SISGH-link-20260814.1247-9.4.0.20-SNAPSHOT(2)
Search








SISGH-link-okd4

SISGH-link-20260814.1247-9.4.0.20-SNAPSHOT(2)
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
Started: 17/08/2026, 15:58:55
Pool:
Release-Linux-OKD4
·
Agent: azp-ads-agent-release-5cd876f98-rjttk

2m 0s

Initialize job
·
succeeded
<1s

Pre-job: Download secure file
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
1s

Recupera VEC
·
succeeded
1s

VEC - Aferição
·
succeeded
1 warning
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
3s

Criando Rota Customizada
·
succeeded
<1s

Aplicando Service Mesh
·
skipped


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
1s

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
1m 16s

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
4s

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
38 pipelines found

Select a release pipeline to view its releases

10 pipelines found

2 pipelines found

2 pipelines found

Select a release pipeline to view its releases

2 pipelines found

2 pipelines found

Row 2

Row 3

Row 3

Expanded

Row 3

Collapsed

Row 3

2 pipelines found

Row 3

Showing 26 deployments

Row 2

Row 2

exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-sisgh.jks -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.8.jar -Dhttps.proxyHost=proxydes.caixa -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-08-17 15:59:44.684-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.7.8 started successfully (PID 8, JVM running for 3.432 s)
2026-08-17 15:59:44.687-03:00 INFO  c.m.applicationinsights.agent - Java version: 21.0.1, vendor: Oracle Corporation, home: /usr/java/jdk-21.0.1
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-08-17 15:59:44,084 DEBUG [jdk.event.security] (main) X509Certificate: Alg:SHA384withRSA, Serial:59b1b579e8e2132e23907bda777755c, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:1057369358, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-08-17 15:59:44,089 DEBUG [jdk.event.security] (main) X509Certificate: Alg:SHA384withRSA, Serial:8ad40b260d29c4c9f5ecda9bd93aed9, Subject:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3406046841, Valid from:4/28/21, 9:00?PM, Valid until:4/28/36, 8:59?PM
2026-08-17 15:59:44,090 DEBUG [jdk.event.security] (main) X509Certificate: Alg:SHA256withRSA, Serial:d1f02a4a2c5a3d3a37dda07199a3620, Subject:CN=Microsoft Corporation, OU=Java Signing (SHA2), O=Microsoft Corporation, L=Redmond, ST=Washington, C=US, Issuer:CN=DigiCert Trusted G4 Code Signing RSA4096 SHA384 2021 CA1, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:1223504232, Valid from:8/29/24, 9:00?PM, Valid until:10/29/27, 8:59?PM
2026-08-17 15:59:44,099 DEBUG [jdk.event.security] (main) X509Certificate: Alg:SHA256withRSA, Serial:a80ef184b8df10582d1c476a7957468, Subject:CN=DigiCert SHA256 RSA4096 Timestamp Responder 2025 1, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted G4 TimeStamping RSA4096 SHA256 2025 CA1, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:2267438615, Valid from:6/3/25, 9:00?PM, Valid until:9/3/36, 8:59?PM
2026-08-17 15:59:44,099 DEBUG [jdk.event.security] (main) X509Certificate: Alg:SHA256withRSA, Serial:dc7ac5705ff21992e4043220c3a4986, Subject:CN=DigiCert Trusted G4 TimeStamping RSA4096 SHA256 2025 CA1, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:838034565, Valid from:5/6/25, 9:00?PM, Valid until:1/14/38, 8:59?PM
2026-08-17 15:59:44,099 DEBUG [jdk.event.security] (main) X509Certificate: Alg:SHA384withRSA, Serial:e9b188ef9d02de7efdb50e20840185a, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:845088433, Valid from:7/31/22, 9:00?PM, Valid until:11/9/31, 8:59?PM
2026-08-17 15:59:44,970 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:ce22972800344766b49ca5d407cd039, Subject:CN=Valid Certificadora RSA DV SSL CA, O=Valid Certificadora Digital LTDA, C=BR, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:3072, Cert Id:131886298, Valid from:8/1/23, 9:00?PM, Valid until:8/1/33, 8:59?PM
2026-08-17 15:59:45,047 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:83be056904246b1a1756ac95991c74a, Subject:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1341898239, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-08-17 15:59:45,048 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:bfd73675145a353d28059aaf86e6349, Subject:CN=*.mtls.api.hm.bb.com.br, O=BANCO DO BRASIL S.A., L=Brasilia, ST=Distrito Federal, C=BR, Issuer:CN=GeoTrust TLS RSA CA G1, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1071268244, Valid from:4/9/26, 9:00?PM, Valid until:10/25/26, 8:59?PM
2026-08-17 15:59:45,049 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:397a66cc2756362e0daa87ca6eabe3b1, Subject:CN=Sectigo Public Server Authentication CA DV R36, O=Sectigo Limited, C=GB, Issuer:CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB, Key type:RSA, Length:3072, Cert Id:1180805919, Valid from:3/21/21, 9:00?PM, Valid until:3/21/36, 8:59?PM
2026-08-17 15:59:45,050 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:47b583ffce303b8047ba716d908e88d2, Subject:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:71683228, Valid from:12/23/22, 11:55?AM, Valid until:12/23/42, 12:05?PM
2026-08-17 15:59:45,051 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:1, Subject:CN=Autoridade Certificadora Raiz Brasileira v5, OU=Instituto Nacional de Tecnologia da Informacao - ITI, O=ICP-Brasil, C=BR, Issuer:CN=Autoridade Certificadora Raiz Brasileira v5, OU=Instituto Nacional de Tecnologia da Informacao - ITI, O=ICP-Brasil, C=BR, Key type:RSA, Length:4096, Cert Id:827042461, Valid from:3/2/16, 10:01?AM, Valid until:3/2/29, 8:59?PM
2026-08-17 15:59:45,052 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:1ed397095fd8b4b347701eaabe7f45b3, Subject:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:2848349048, Valid from:12/18/19, 7:51?PM, Valid until:7/18/42, 8:00?PM
2026-08-17 15:59:45,052 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:36825e7fb5a481937ef6d1736bb93ca6, Subject:CN=COMODO RSA Organization Validation Secure Server CA, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:245647897, Valid from:2/11/14, 10:00?PM, Valid until:2/11/29, 8:59?PM
2026-08-17 15:59:45,053 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:1ee5f221dfc623bd4333a8557, Subject:CN=GlobalSign RSA OV SSL CA 2018, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Key type:RSA, Length:2048, Cert Id:930132802, Valid from:11/20/18, 10:00?PM, Valid until:11/20/28, 9:00?PM
2026-08-17 15:59:45,054 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:3972443af922b751d7d36c10dd313595, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:4096, Cert Id:3160189236, Valid from:3/11/19, 9:00?PM, Valid until:12/31/28, 8:59?PM
2026-08-17 15:59:45,055 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:2, Subject:CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR, Issuer:CN=Autoridade Certificadora SERPRO v4, OU=Autoridade Certificadora Raiz Brasileira v5, O=ICP-Brasil, C=BR, Key type:RSA, Length:4096, Cert Id:4146249541, Valid from:1/9/17, 5:36?PM, Valid until:2/15/29, 4:36?PM
2026-08-17 15:59:45,056 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:600000000299b24b9d7901ea84000000000002, Subject:CN=AC Icptestes Sub, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:2447629493, Valid from:12/23/22, 12:47?PM, Valid until:12/23/42, 12:05?PM
2026-08-17 15:59:45,057 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:758dfd8bae7c0700faa925a7e1c7ad14, Subject:CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB, Issuer:CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB, Key type:RSA, Length:4096, Cert Id:3806652169, Valid from:3/21/21, 9:00?PM, Valid until:3/21/46, 8:59?PM
2026-08-17 15:59:45,057 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:1fd6d30fca3ca51a81bbc640e35032d, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:4096, Cert Id:3947601401, Valid from:1/31/10, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-08-17 15:59:45,058 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:40000000001154b5ac394, Subject:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Key type:RSA, Length:2048, Cert Id:536948034, Valid from:9/1/98, 9:00?AM, Valid until:1/28/28, 9:00?AM
2026-08-17 15:59:45,059 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:33af1e6a711a9a0bb2864b11d09fae5, Subject:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1136084297, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-08-17 15:59:45,060 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:7d5b5126b476ba11db74160bbc530da7, Subject:CN=Sectigo RSA Domain Validation Secure Server CA, O=Sectigo Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:2048, Cert Id:2459870160, Valid from:11/1/18, 9:00?PM, Valid until:12/31/30, 8:59?PM
2026-08-17 15:59:45,061 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:d07782a133fc6f9a57296e131ffd179, Subject:CN=GeoTrust TLS RSA CA G1, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:2112502032, Valid from:11/2/17, 10:23?AM, Valid until:11/2/27, 9:23?AM
2026-08-17 15:59:45,061 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:90ee8c5de5bfa62d2ae2ff7097c4857, Subject:CN=Thawte TLS RSA CA G1, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:96139010, Valid from:11/2/17, 10:24?AM, Valid until:11/2/27, 9:24?AM
2026-08-17 15:59:45,062 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:83be056904246b1a1756ac95991c74a, Subject:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1341898239, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-08-17 15:59:45,063 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:4188b0e1a030eda84084ca76a3b1be32, Subject:CN=AC Interna Caixa, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Interna Caixa, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:2506492458, Valid from:10/13/22, 2:25?PM, Valid until:10/13/42, 2:35?PM
2026-08-17 15:59:45,063 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:62000000027328772c722ac752000000000002, Subject:CN=AC Interna APL, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Interna Caixa, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:3746844432, Valid from:10/13/22, 3:34?PM, Valid until:10/13/42, 2:35?PM
2026-08-17 15:59:45,064 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:521d, Subject:CN=api.externo.hm.bb.com.br, OU=Servidores, O=BB, C=BR, Issuer:CN=AC Banco do Brasil - Servidores v3 HOM, OU=ICP-BB, O=Banco do Brasil S.A., C=BR, Key type:RSA, Length:2048, Cert Id:2881607512, Valid from:7/21/26, 12:00?AM, Valid until:7/20/27, 11:59?PM
2026-08-17 15:59:45,064 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:3972443af922b751d7d36c10dd313595, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:4096, Cert Id:3160189236, Valid from:3/11/19, 9:00?PM, Valid until:12/31/28, 8:59?PM
2026-08-17 15:59:45,065 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA256withRSA, Serial:1ee5f221dfc623bd4333a8557, Subject:CN=GlobalSign RSA OV SSL CA 2018, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Key type:RSA, Length:2048, Cert Id:930132802, Valid from:11/20/18, 10:00?PM, Valid until:11/20/28, 9:00?PM
2026-08-17 15:59:45,066 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA512withRSA, Serial:5, Subject:CN=Autoridade Certificadora SERPRO v4, OU=Autoridade Certificadora Raiz Brasileira v5, O=ICP-Brasil, C=BR, Issuer:CN=Autoridade Certificadora Raiz Brasileira v5, OU=Instituto Nacional de Tecnologia da Informacao - ITI, O=ICP-Brasil, C=BR, Key type:RSA, Length:4096, Cert Id:1380576325, Valid from:9/14/16, 10:10?AM, Valid until:3/2/29, 9:00?AM
2026-08-17 15:59:45,067 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:3097386402, Valid from:12/31/03, 10:00?PM, Valid until:12/31/28, 8:59?PM
2026-08-17 15:59:45,067 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:3097386402, Valid from:12/31/03, 10:00?PM, Valid until:12/31/28, 8:59?PM
2026-08-17 15:59:45,068 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:7d5b5126b476ba11db74160bbc530da7, Subject:CN=Sectigo RSA Domain Validation Secure Server CA, O=Sectigo Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:2048, Cert Id:2459870160, Valid from:11/1/18, 9:00?PM, Valid until:12/31/30, 8:59?PM
2026-08-17 15:59:45,068 DEBUG [jdk.event.security] (AppIdSupplier-0) X509Certificate: Alg:SHA384withRSA, Serial:36825e7fb5a481937ef6d1736bb93ca6, Subject:CN=COMODO RSA Organization Validation Secure Server CA, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:245647897, Valid from:2/11/14, 10:00?PM, Valid until:2/11/29, 8:59?PM
2026-08-17 15:59:45,137 DEBUG [org.jboss.logging] (main) Logging Provider: org.jboss.logging.JBossLogManagerProvider found via system property
2026-08-17 15:59:45,139 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource BuildTime RunTime Fixed with ordinal 2147483647
2026-08-17 15:59:45,139 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource DefaultValuesConfigSource with ordinal -2147483648
2026-08-17 15:59:45,240 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource BuildTime RunTime Fixed with ordinal 2147483647
2026-08-17 15:59:45,241 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource SysPropConfigSource with ordinal 400
2026-08-17 15:59:45,241 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource EnvConfigSource with ordinal 300
2026-08-17 15:59:45,241 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource PropertiesConfigSource[source=jar:file:///deployments/app/sisgh-link-9.4.0.20.jar!/application.properties] with ordinal 250
2026-08-17 15:59:45,241 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource Runtime Values with ordinal 0
2026-08-17 15:59:45,241 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource DefaultValuesConfigSource with ordinal -2147483648
2026-08-17 15:59:45,334 DEBUG [org.jose4j.jwa.AlgorithmFactoryFactory] (main) Initializing jose4j (running with Java 21.0.1 from Oracle Corporation at /usr/java/jdk-21.0.1 with [SUN version 21, SunRsaSign version 21, SunEC version 21, SunJSSE version 21, SunJCE version 21, SunJGSS version 21, SunSASL version 21, XMLDSig version 21, SunPCSC version 21, JdkLDAP version 21, JdkSASL version 21, SunPKCS11 version 21] security providers installed)...
2026-08-17 15:59:45,337 DEBUG [org.jose4j.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.UnsecuredNoneAlgorithm(none|null) registered for alg algorithm none
2026-08-17 15:59:45,340 DEBUG [org.jose4j.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.HmacUsingShaAlgorithm$HmacSha256(HS256|HmacSHA256) registered for alg algorithm HS256
2026-08-17 15:59:45,340 DEBUG [org.jose4j.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.HmacUsingShaAlgorithm$HmacSha384(HS384|HmacSHA384) registered for alg algorithm HS384
2026-08-17 15:59:45,341 DEBUG [org.jose4j.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.HmacUsingShaAlgorithm$HmacSha512(HS512|HmacSHA512) registered for alg algorithm HS512
2026-08-17 15:59:45,342 DEBUG [org.jose4j.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.EdDsaAlgorithm(EdDSA|EdDSA) registered for alg algorithm EdDSA
2026-08-17 15:59:45,343 DEBUG [org.jose4j.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.EcdsaUsingShaAlgorithm$EcdsaP256UsingSha256(ES256|SHA256withECDSA) registered for alg algorithm ES256
2026-08-17 15:59:45,344 DEBUG [org.jose4j.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.EcdsaUsingShaAlgorithm$EcdsaP384UsingSha384(ES384|SHA384withECDSA) registered for alg algorithm ES384
2026-08-17 15:59:45,344 DEBUG [org.jose4j.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.EcdsaUsingShaAlgorithm$EcdsaP521UsingSha512(ES512|SHA512withECDSA) registered for alg algorithm ES512
2026-08-17 15:59:45,360 DEBUG [org.jose4j.jws.EcdsaUsingShaAlgorithm$EcdsaSECP256K1UsingSha256] (main) ES256K is not available due to org.jose4j.lang.JoseException: Problem creating signature.; caused by: java.security.SignatureException: Curve not supported: java.security.spec.ECParameterSpec@11cc9e1e
2026-08-17 15:59:45,361 DEBUG [org.jose4j.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) ES256K is unavailable so will not be registered for alg algorithms.
2026-08-17 15:59:45,361 DEBUG [org.jose4j.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.RsaUsingShaAlgorithm$RsaSha256(RS256|SHA256withRSA) registered for alg algorithm RS256
2026-08-17 15:59:45,362 DEBUG [org.jose4j.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.RsaUsingShaAlgorithm$RsaSha384(RS384|SHA384withRSA) registered for alg algorithm RS384
2026-08-17 15:59:45,362 DEBUG [org.jose4j.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.RsaUsingShaAlgorithm$RsaSha512(RS512|SHA512withRSA) registered for alg algorithm RS512
2026-08-17 15:59:45,363 DEBUG [org.jose4j.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.RsaUsingShaAlgorithm$RsaPssSha256(PS256|RSASSA-PSS) registered for alg algorithm PS256
2026-08-17 15:59:45,364 DEBUG [org.jose4j.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.RsaUsingShaAlgorithm$RsaPssSha384(PS384|RSASSA-PSS) registered for alg algorithm PS384
2026-08-17 15:59:45,365 DEBUG [org.jose4j.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.RsaUsingShaAlgorithm$RsaPssSha512(PS512|RSASSA-PSS) registered for alg algorithm PS512
2026-08-17 15:59:45,365 DEBUG [org.jose4j.jwa.AlgorithmFactoryFactory] (main) JWS signature algorithms: [none, HS256, HS384, HS512, EdDSA, ES256, ES384, ES512, RS256, RS384, RS512, PS256, PS384, PS512]
2026-08-17 15:59:45,369 DEBUG [org.jose4j.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.RsaKeyManagementAlgorithm$Rsa1_5(RSA1_5|RSA/ECB/PKCS1Padding) registered for alg algorithm RSA1_5
2026-08-17 15:59:45,370 DEBUG [org.jose4j.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.RsaKeyManagementAlgorithm$RsaOaep(RSA-OAEP|RSA/ECB/OAEPWithSHA-1AndMGF1Padding) registered for alg algorithm RSA-OAEP
2026-08-17 15:59:45,378 DEBUG [org.jose4j.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.RsaKeyManagementAlgorithm$RsaOaep256(RSA-OAEP-256|RSA/ECB/OAEPWithSHA-256AndMGF1Padding) registered for alg algorithm RSA-OAEP-256
2026-08-17 15:59:45,378 DEBUG [org.jose4j.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.DirectKeyManagementAlgorithm(dir|null) registered for alg algorithm dir
2026-08-17 15:59:45,380 DEBUG [org.jose4j.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.AesKeyWrapManagementAlgorithm$Aes128(A128KW|AESWrap) registered for alg algorithm A128KW
2026-08-17 15:59:45,380 DEBUG [org.jose4j.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.AesKeyWrapManagementAlgorithm$Aes192(A192KW|AESWrap) registered for alg algorithm A192KW
2026-08-17 15:59:45,381 DEBUG [org.jose4j.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.AesKeyWrapManagementAlgorithm$Aes256(A256KW|AESWrap) registered for alg algorithm A256KW
2026-08-17 15:59:45,384 DEBUG [org.jose4j.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.EcdhKeyAgreementAlgorithm(ECDH-ES|ECDH) registered for alg algorithm ECDH-ES
2026-08-17 15:59:45,386 DEBUG [org.jose4j.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.EcdhKeyAgreementWithAesKeyWrapAlgorithm$EcdhKeyAgreementWithAes128KeyWrapAlgorithm(ECDH-ES+A128KW|N/A) registered for alg algorithm ECDH-ES+A128KW
2026-08-17 15:59:45,388 DEBUG [org.jose4j.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.EcdhKeyAgreementWithAesKeyWrapAlgorithm$EcdhKeyAgreementWithAes192KeyWrapAlgorithm(ECDH-ES+A192KW|N/A) registered for alg algorithm ECDH-ES+A192KW
2026-08-17 15:59:45,390 DEBUG [org.jose4j.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.EcdhKeyAgreementWithAesKeyWrapAlgorithm$EcdhKeyAgreementWithAes256KeyWrapAlgorithm(ECDH-ES+A256KW|N/A) registered for alg algorithm ECDH-ES+A256KW
2026-08-17 15:59:45,425 DEBUG [org.jose4j.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha256Aes128(PBES2-HS256+A128KW|n/a) registered for alg algorithm PBES2-HS256+A128KW
2026-08-17 15:59:45,426 DEBUG [org.jose4j.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha384Aes192(PBES2-HS384+A192KW|n/a) registered for alg algorithm PBES2-HS384+A192KW
2026-08-17 15:59:45,426 DEBUG [org.jose4j.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha512Aes256(PBES2-HS512+A256KW|n/a) registered for alg algorithm PBES2-HS512+A256KW
2026-08-17 15:59:45,430 DEBUG [org.jose4j.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.AesGcmKeyEncryptionAlgorithm$Aes128Gcm(A128GCMKW|AES/GCM/NoPadding) registered for alg algorithm A128GCMKW
2026-08-17 15:59:45,431 DEBUG [org.jose4j.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.AesGcmKeyEncryptionAlgorithm$Aes192Gcm(A192GCMKW|AES/GCM/NoPadding) registered for alg algorithm A192GCMKW
2026-08-17 15:59:45,432 DEBUG [org.jose4j.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.AesGcmKeyEncryptionAlgorithm$Aes256Gcm(A256GCMKW|AES/GCM/NoPadding) registered for alg algorithm A256GCMKW
2026-08-17 15:59:45,432 DEBUG [org.jose4j.jwa.AlgorithmFactoryFactory] (main) JWE key management algorithms: [RSA1_5, RSA-OAEP, RSA-OAEP-256, dir, A128KW, A192KW, A256KW, ECDH-ES, ECDH-ES+A128KW, ECDH-ES+A192KW, ECDH-ES+A256KW, PBES2-HS256+A128KW, PBES2-HS384+A192KW, PBES2-HS512+A256KW, A128GCMKW, A192GCMKW, A256GCMKW]
2026-08-17 15:59:45,433 DEBUG [org.jose4j.jwa.AlgorithmFactory->ContentEncryptionAlgorithm] (main) org.jose4j.jwe.AesCbcHmacSha2ContentEncryptionAlgorithm$Aes128CbcHmacSha256(A128CBC-HS256|AES/CBC/PKCS5Padding) registered for enc algorithm A128CBC-HS256
2026-08-17 15:59:45,433 DEBUG [org.jose4j.jwa.AlgorithmFactory->ContentEncryptionAlgorithm] (main) org.jose4j.jwe.AesCbcHmacSha2ContentEncryptionAlgorithm$Aes192CbcHmacSha384(A192CBC-HS384|AES/CBC/PKCS5Padding) registered for enc algorithm A192CBC-HS384
2026-08-17 15:59:45,433 DEBUG [org.jose4j.jwa.AlgorithmFactory->ContentEncryptionAlgorithm] (main) org.jose4j.jwe.AesCbcHmacSha2ContentEncryptionAlgorithm$Aes256CbcHmacSha512(A256CBC-HS512|AES/CBC/PKCS5Padding) registered for enc algorithm A256CBC-HS512
2026-08-17 15:59:45,434 DEBUG [org.jose4j.jwa.AlgorithmFactory->ContentEncryptionAlgorithm] (main) org.jose4j.jwe.AesGcmContentEncryptionAlgorithm$Aes128Gcm(A128GCM|AES/GCM/NoPadding) registered for enc algorithm A128GCM
2026-08-17 15:59:45,435 DEBUG [org.jose4j.jwa.AlgorithmFactory->ContentEncryptionAlgorithm] (main) org.jose4j.jwe.AesGcmContentEncryptionAlgorithm$Aes192Gcm(A192GCM|AES/GCM/NoPadding) registered for enc algorithm A192GCM
2026-08-17 15:59:45,435 DEBUG [org.jose4j.jwa.AlgorithmFactory->ContentEncryptionAlgorithm] (main) org.jose4j.jwe.AesGcmContentEncryptionAlgorithm$Aes256Gcm(A256GCM|AES/GCM/NoPadding) registered for enc algorithm A256GCM
2026-08-17 15:59:45,435 DEBUG [org.jose4j.jwa.AlgorithmFactoryFactory] (main) JWE content encryption algorithms: [A128CBC-HS256, A192CBC-HS384, A256CBC-HS512, A128GCM, A192GCM, A256GCM]
2026-08-17 15:59:45,436 DEBUG [org.jose4j.zip.DeflateRFC1951CompressionAlgorithm] (main) 
2026-08-17 15:59:45,436 DEBUG [org.jose4j.jwa.AlgorithmFactory->CompressionAlgorithm] (main) org.jose4j.zip.DeflateRFC1951CompressionAlgorithm@31533eb1 registered for zip algorithm DEF
2026-08-17 15:59:45,436 DEBUG [org.jose4j.jwa.AlgorithmFactoryFactory] (main) JWE compression algorithms: [DEF]
2026-08-17 15:59:45,436 DEBUG [org.jose4j.jwa.AlgorithmFactoryFactory] (main) Initialized jose4j in 101ms
2026-08-17 15:59:45,540 DEBUG [org.hibernate.quarkus.feature] (main) Hibernate Reactive Features Enabled
2026-08-17 15:59:45,542 DEBUG [io.quarkus.hibernate.orm] (main) List of entities found by Quarkus deployment:
[br.com.sisgh.link.entity.RequisicaoEntity]
2026-08-17 15:59:45,742 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:49003f78145c11bb768c84e0c90000003f7814, Subject:CN=Microsoft TLS G2 RSA CA OCSP 10 External OCSP Responder 2026-06-, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 10, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:2098166502, Valid from:6/1/26, 3:50?PM, Valid until:11/28/26, 3:50?PM
2026-08-17 15:59:45,743 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:4900a26967a160313f97b32d3a000000a26967, Subject:CN=in.applicationinsights.azure.com, O=Microsoft Corporation, L=Redmond, ST=WA, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 10, O=Microsoft Corporation, C=US, Key type:RSA, Length:2048, Cert Id:381841505, Valid from:8/14/26, 11:38?AM, Valid until:2/10/27, 11:38?AM
2026-08-17 15:59:45,744 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:330000000f33206537ee42ae4f00000000000f, Subject:CN=Microsoft TLS G2 RSA CA OCSP 10, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:517509489, Valid from:8/1/25, 5:03?PM, Valid until:6/3/29, 5:03?PM
2026-08-17 15:59:45,745 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:b0c6b2c466917b04773c647d4afc0c8, Subject:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3081933591, Valid from:5/20/25, 9:00?PM, Valid until:6/19/29, 8:59?PM
2026-08-17 15:59:45,762 DEBUG [jdk.event.security] (reactor-http-epoll-1) ValidationChain: 1136084297, 3081933591, 517509489, 381841505
2026-08-17 15:59:45,765 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:570a119742c4e3cc, Subject:CN=Actalis Authentication Root CA, O=Actalis S.p.A./03358520967, L=Milan, C=IT, Issuer:CN=Actalis Authentication Root CA, O=Actalis S.p.A./03358520967, L=Milan, C=IT, Key type:RSA, Length:4096, Cert Id:1729119956, Valid from:9/22/11, 8:22?AM, Valid until:9/22/30, 8:22?AM
2026-08-17 15:59:45,767 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AddTrust External CA Root, OU=AddTrust External TTP Network, O=AddTrust AB, C=SE, Issuer:CN=AddTrust External CA Root, OU=AddTrust External TTP Network, O=AddTrust AB, C=SE, Key type:RSA, Length:2048, Cert Id:3968614624, Valid from:5/30/00, 7:48?AM, Valid until:5/30/20, 7:48?AM
2026-08-17 15:59:45,768 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AddTrust Qualified CA Root, OU=AddTrust TTP Network, O=AddTrust AB, C=SE, Issuer:CN=AddTrust Qualified CA Root, OU=AddTrust TTP Network, O=AddTrust AB, C=SE, Key type:RSA, Length:2048, Cert Id:607365522, Valid from:5/30/00, 7:44?AM, Valid until:5/30/20, 7:44?AM
2026-08-17 15:59:45,768 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:7777062726a9b17c, Subject:CN=AffirmTrust Commercial, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Commercial, O=AffirmTrust, C=US, Key type:RSA, Length:2048, Cert Id:630485644, Valid from:1/29/10, 12:06?PM, Valid until:12/31/30, 11:06?AM
2026-08-17 15:59:45,769 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:7c4f04391cd4992d, Subject:CN=AffirmTrust Networking, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Networking, O=AffirmTrust, C=US, Key type:RSA, Length:2048, Cert Id:651670175, Valid from:1/29/10, 12:08?PM, Valid until:12/31/30, 11:08?AM
2026-08-17 15:59:45,769 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:6d8c1446b1a60aee, Subject:CN=AffirmTrust Premium, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Premium, O=AffirmTrust, C=US, Key type:RSA, Length:4096, Cert Id:2164683341, Valid from:1/29/10, 12:10?PM, Valid until:12/31/40, 11:10?AM
2026-08-17 15:59:45,770 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:7497258ac73f7a54, Subject:CN=AffirmTrust Premium ECC, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Premium ECC, O=AffirmTrust, C=US, Key type:EC, Length:384, Cert Id:2214603510, Valid from:1/29/10, 12:20?PM, Valid until:12/31/40, 11:20?AM
2026-08-17 15:59:45,770 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:66c9fcf99bf8c0a39e2f0788a43e696365bca, Subject:CN=Amazon Root CA 1, O=Amazon, C=US, Issuer:CN=Amazon Root CA 1, O=Amazon, C=US, Key type:RSA, Length:2048, Cert Id:2822522334, Valid from:5/25/15, 9:00?PM, Valid until:1/16/38, 9:00?PM
2026-08-17 15:59:45,771 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:66c9fd29635869f0a0fe58678f85b26bb8a37, Subject:CN=Amazon Root CA 2, O=Amazon, C=US, Issuer:CN=Amazon Root CA 2, O=Amazon, C=US, Key type:RSA, Length:4096, Cert Id:2528834908, Valid from:5/25/15, 9:00?PM, Valid until:5/25/40, 9:00?PM
2026-08-17 15:59:45,772 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withECDSA, Serial:66c9fd5749736663f3b0b9ad9e89e7603f24a, Subject:CN=Amazon Root CA 3, O=Amazon, C=US, Issuer:CN=Amazon Root CA 3, O=Amazon, C=US, Key type:EC, Length:256, Cert Id:2732679773, Valid from:5/25/15, 9:00?PM, Valid until:5/25/40, 9:00?PM
2026-08-17 15:59:45,772 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:66c9fd7c1bb104c2943e5717b7b2cc81ac10e, Subject:CN=Amazon Root CA 4, O=Amazon, C=US, Issuer:CN=Amazon Root CA 4, O=Amazon, C=US, Key type:EC, Length:384, Cert Id:2640694783, Valid from:5/25/15, 9:00?PM, Valid until:5/25/40, 9:00?PM
2026-08-17 15:59:45,773 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:20000b9, Subject:CN=Baltimore CyberTrust Root, OU=CyberTrust, O=Baltimore, C=IE, Issuer:CN=Baltimore CyberTrust Root, OU=CyberTrust, O=Baltimore, C=IE, Key type:RSA, Length:2048, Cert Id:1425294543, Valid from:5/12/00, 3:46?PM, Valid until:5/12/25, 8:59?PM
2026-08-17 15:59:45,773 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:2, Subject:CN=Buypass Class 2 Root CA, O=Buypass AS-983163327, C=NO, Issuer:CN=Buypass Class 2 Root CA, O=Buypass AS-983163327, C=NO, Key type:RSA, Length:4096, Cert Id:969960563, Valid from:10/26/10, 6:38?AM, Valid until:10/26/40, 5:38?AM
2026-08-17 15:59:45,774 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:2, Subject:CN=Buypass Class 3 Root CA, O=Buypass AS-983163327, C=NO, Issuer:CN=Buypass Class 3 Root CA, O=Buypass AS-983163327, C=NO, Key type:RSA, Length:4096, Cert Id:1264269967, Valid from:10/26/10, 6:28?AM, Valid until:10/26/40, 5:28?AM
2026-08-17 15:59:45,775 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:a3da427ea4b1aeda, Subject:CN=Chambers of Commerce Root - 2008, O=AC Camerfirma S.A., SERIALNUMBER=A82743287, L=Madrid (see current address at www.camerfirma.com/address), C=EU, Issuer:CN=Chambers of Commerce Root - 2008, O=AC Camerfirma S.A., SERIALNUMBER=A82743287, L=Madrid (see current address at www.camerfirma.com/address), C=EU, Key type:RSA, Length:4096, Cert Id:4266703372, Valid from:8/1/08, 9:29?AM, Valid until:7/31/38, 9:29?AM
2026-08-17 15:59:45,776 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:0, Subject:CN=Chambers of Commerce Root, OU=http://www.chambersign.org, O=AC Camerfirma SA CIF A82743287, C=EU, Issuer:CN=Chambers of Commerce Root, OU=http://www.chambersign.org, O=AC Camerfirma SA CIF A82743287, C=EU, Key type:RSA, Length:2048, Cert Id:1827306452, Valid from:9/30/03, 1:13?PM, Valid until:9/30/37, 1:13?PM
2026-08-17 15:59:45,777 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:c9cdd3e9d57d23ce, Subject:CN=Global Chambersign Root - 2008, O=AC Camerfirma S.A., SERIALNUMBER=A82743287, L=Madrid (see current address at www.camerfirma.com/address), C=EU, Issuer:CN=Global Chambersign Root - 2008, O=AC Camerfirma S.A., SERIALNUMBER=A82743287, L=Madrid (see current address at www.camerfirma.com/address), C=EU, Key type:RSA, Length:4096, Cert Id:1271252776, Valid from:8/1/08, 9:31?AM, Valid until:7/31/38, 9:31?AM
2026-08-17 15:59:45,777 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:fedce3010fc948ff, Subject:CN=Certigna, O=Dhimyotis, C=FR, Issuer:CN=Certigna, O=Dhimyotis, C=FR, Key type:RSA, Length:2048, Cert Id:3506875840, Valid from:6/29/07, 12:13?PM, Valid until:6/29/27, 12:13?PM
2026-08-17 15:59:45,778 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:cae91b89f155030da3e6416dc4e3a6e1, Subject:CN=Certigna Root CA, OU=0002 48146308100036, O=Dhimyotis, C=FR, Issuer:CN=Certigna Root CA, OU=0002 48146308100036, O=Dhimyotis, C=FR, Key type:RSA, Length:4096, Cert Id:356684591, Valid from:10/1/13, 5:32?AM, Valid until:10/1/33, 5:32?AM
2026-08-17 15:59:45,825 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:10020, Subject:CN=Certum CA, O=Unizeto Sp. z o.o., C=PL, Issuer:CN=Certum CA, O=Unizeto Sp. z o.o., C=PL, Key type:RSA, Length:2048, Cert Id:3550516030, Valid from:6/11/02, 7:46?AM, Valid until:6/11/27, 7:46?AM
2026-08-17 15:59:45,826 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:444c0, Subject:CN=Certum Trusted Network CA, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Issuer:CN=Certum Trusted Network CA, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Key type:RSA, Length:2048, Cert Id:2014002193, Valid from:10/22/08, 10:07?AM, Valid until:12/31/29, 9:07?AM
2026-08-17 15:59:45,826 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:15c8bd65475cafb897005ee406d2bc9d, Subject:OU=ePKI Root Certification Authority, O="Chunghwa Telecom Co., Ltd.", C=TW, Issuer:OU=ePKI Root Certification Authority, O="Chunghwa Telecom Co., Ltd.", C=TW, Key type:RSA, Length:4096, Cert Id:3632331159, Valid from:12/20/04, 12:31?AM, Valid until:12/19/34, 11:31?PM
2026-08-17 15:59:45,827 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:3097386402, Valid from:12/31/03, 10:00?PM, Valid until:12/31/28, 8:59?PM
2026-08-17 15:59:45,827 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:1f47afaa62007050544c019e9b63992a, Subject:CN=COMODO ECC Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO ECC Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:EC, Length:384, Cert Id:1146488932, Valid from:3/5/08, 9:00?PM, Valid until:1/18/38, 8:59?PM
2026-08-17 15:59:45,828 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:4caaf9cadb636fe01ff74ed85b03869d, Subject:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:4096, Cert Id:1769425049, Valid from:1/18/10, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-08-17 15:59:45,828 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:b931c3ad63967ea6723bfc3af9af44b, Subject:CN=DigiCert Assured ID Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:3909568913, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-08-17 15:59:45,829 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:ba15afa1ddfa0b54944afcd24a06cec, Subject:CN=DigiCert Assured ID Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:EC, Length:384, Cert Id:3649430051, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-08-17 15:59:45,829 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:ce7e0e517d846fe8fe560fc1bf03039, Subject:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:3434562768, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-08-17 15:59:45,830 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:83be056904246b1a1756ac95991c74a, Subject:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1341898239, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-08-17 15:59:45,830 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:33af1e6a711a9a0bb2864b11d09fae5, Subject:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1136084297, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-08-17 15:59:45,831 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:55556bcf25ea43535c3a40fd5ab4572, Subject:CN=DigiCert Global Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:EC, Length:384, Cert Id:3498998753, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-08-17 15:59:45,831 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:2ac5c266a0b409b8f0b79f2ae462577, Subject:CN=DigiCert High Assurance EV Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert High Assurance EV Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:2884286942, Valid from:11/9/06, 10:00?PM, Valid until:11/9/31, 9:00?PM
2026-08-17 15:59:45,831 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:59b1b579e8e2132e23907bda777755c, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:1057369358, Valid from:8/1/13, 9:00?AM, Valid until:1/15/38, 9:00?AM
2026-08-17 15:59:45,832 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:983f3, Subject:CN=D-TRUST Root Class 3 CA 2 2009, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST Root Class 3 CA 2 2009, O=D-Trust GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:1430153102, Valid from:11/5/09, 6:35?AM, Valid until:11/5/29, 5:35?AM
2026-08-17 15:59:45,833 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:983f4, Subject:CN=D-TRUST Root Class 3 CA 2 EV 2009, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST Root Class 3 CA 2 EV 2009, O=D-Trust GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:971313728, Valid from:11/5/09, 6:50?AM, Valid until:11/5/29, 5:50?AM
2026-08-17 15:59:45,833 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:3863def8, Subject:CN=Entrust.net Certification Authority (2048), OU=(c) 1999 Entrust.net Limited, OU=www.entrust.net/CPS_2048 incorp. by ref. (limits liab.), O=Entrust.net, Issuer:CN=Entrust.net Certification Authority (2048), OU=(c) 1999 Entrust.net Limited, OU=www.entrust.net/CPS_2048 incorp. by ref. (limits liab.), O=Entrust.net, Key type:RSA, Length:2048, Cert Id:3966431214, Valid from:12/24/99, 3:50?PM, Valid until:7/24/29, 11:15?AM
2026-08-17 15:59:45,834 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:456b5054, Subject:CN=Entrust Root Certification Authority, OU="(c) 2006 Entrust, Inc.", OU=www.entrust.net/CPS is incorporated by reference, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority, OU="(c) 2006 Entrust, Inc.", OU=www.entrust.net/CPS is incorporated by reference, O="Entrust, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:3033563200, Valid from:11/27/06, 6:23?PM, Valid until:11/27/26, 5:53?PM
2026-08-17 15:59:45,835 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:a68b79290000000050d091f9, Subject:CN=Entrust Root Certification Authority - EC1, OU="(c) 2012 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority - EC1, OU="(c) 2012 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Key type:EC, Length:384, Cert Id:924514073, Valid from:12/18/12, 1:25?PM, Valid until:12/18/37, 12:55?PM
2026-08-17 15:59:45,835 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:4a538c28, Subject:CN=Entrust Root Certification Authority - G2, OU="(c) 2009 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority - G2, OU="(c) 2009 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:1936920337, Valid from:7/7/09, 2:25?PM, Valid until:12/7/30, 2:55?PM
2026-08-17 15:59:45,836 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:d9b5437fafa9390f000000005565ad58, Subject:CN=Entrust Root Certification Authority - G4, OU="(c) 2015 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority - G4, OU="(c) 2015 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:1368037548, Valid from:5/27/15, 8:11?AM, Valid until:12/27/37, 8:41?AM
2026-08-17 15:59:45,836 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:23456, Subject:CN=GeoTrust Global CA, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Global CA, O=GeoTrust Inc., C=US, Key type:RSA, Length:2048, Cert Id:2266349922, Valid from:5/21/02, 1:00?AM, Valid until:5/21/22, 1:00?AM
2026-08-17 15:59:45,837 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:18acb56afd69b6153a636cafdafac4a1, Subject:CN=GeoTrust Primary Certification Authority, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Primary Certification Authority, O=GeoTrust Inc., C=US, Key type:RSA, Length:2048, Cert Id:3329622139, Valid from:11/26/06, 10:00?PM, Valid until:7/16/36, 8:59?PM
2026-08-17 15:59:45,837 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:3cb2f4480a00e2feeb243b5e603ec36b, Subject:CN=GeoTrust Primary Certification Authority - G2, OU=(c) 2007 GeoTrust Inc. - For authorized use only, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Primary Certification Authority - G2, OU=(c) 2007 GeoTrust Inc. - For authorized use only, O=GeoTrust Inc., C=US, Key type:EC, Length:384, Cert Id:3180663474, Valid from:11/4/07, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-08-17 15:59:45,838 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:15ac6e9419b2794b41f627a9c3180f1f, Subject:CN=GeoTrust Primary Certification Authority - G3, OU=(c) 2008 GeoTrust Inc. - For authorized use only, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Primary Certification Authority - G3, OU=(c) 2008 GeoTrust Inc. - For authorized use only, O=GeoTrust Inc., C=US, Key type:RSA, Length:2048, Cert Id:2964813538, Valid from:4/1/08, 9:00?PM, Valid until:12/1/37, 8:59?PM
2026-08-17 15:59:45,838 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=GeoTrust Universal CA, O=GeoTrust Inc., C=US, Issuer:CN=GeoTrust Universal CA, O=GeoTrust Inc., C=US, Key type:RSA, Length:4096, Cert Id:313566089, Valid from:3/4/04, 2:00?AM, Valid until:3/4/29, 2:00?AM
2026-08-17 15:59:45,838 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:40000000001154b5ac394, Subject:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Key type:RSA, Length:2048, Cert Id:536948034, Valid from:9/1/98, 9:00?AM, Valid until:1/28/28, 9:00?AM
2026-08-17 15:59:45,839 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withECDSA, Serial:2a38a41c960a04de42b228a50be8349802, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R4, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R4, Key type:EC, Length:256, Cert Id:2371693751, Valid from:11/12/12, 10:00?PM, Valid until:1/19/38, 12:14?AM
2026-08-17 15:59:45,839 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:605949e0262ebb55f90a778a71f94ad86c, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R5, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R5, Key type:EC, Length:384, Cert Id:1997048439, Valid from:11/12/12, 10:00?PM, Valid until:1/19/38, 12:14?AM
2026-08-17 15:59:45,840 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:4000000000121585308a2, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Key type:RSA, Length:2048, Cert Id:733875591, Valid from:3/18/09, 7:00?AM, Valid until:3/18/29, 7:00?AM
2026-08-17 15:59:45,840 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:45e6bb038333c3856548e6ff4551, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R6, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R6, Key type:RSA, Length:4096, Cert Id:3788339543, Valid from:12/9/14, 10:00?PM, Valid until:12/9/34, 9:00?PM
2026-08-17 15:59:45,840 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:0, Subject:OU=Go Daddy Class 2 Certification Authority, O="The Go Daddy Group, Inc.", C=US, Issuer:OU=Go Daddy Class 2 Certification Authority, O="The Go Daddy Group, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:4023522997, Valid from:6/29/04, 2:06?PM, Valid until:6/29/34, 2:06?PM
2026-08-17 15:59:45,841 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Go Daddy Root Certificate Authority - G2, O="GoDaddy.com, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Go Daddy Root Certificate Authority - G2, O="GoDaddy.com, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:439600313, Valid from:8/31/09, 9:00?PM, Valid until:12/31/37, 8:59?PM
2026-08-17 15:59:45,841 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:203e5936f31b01349886ba217, Subject:CN=GTS Root R1, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R1, O=Google Trust Services LLC, C=US, Key type:RSA, Length:4096, Cert Id:657172038, Valid from:6/21/16, 9:00?PM, Valid until:6/21/36, 9:00?PM
2026-08-17 15:59:45,842 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:203e5aec58d04251aab1125aa, Subject:CN=GTS Root R2, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R2, O=Google Trust Services LLC, C=US, Key type:RSA, Length:4096, Cert Id:948387669, Valid from:6/21/16, 9:00?PM, Valid until:6/21/36, 9:00?PM
2026-08-17 15:59:45,842 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:203e5b882eb20f825276d3d66, Subject:CN=GTS Root R3, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R3, O=Google Trust Services LLC, C=US, Key type:EC, Length:384, Cert Id:1163081155, Valid from:6/21/16, 9:00?PM, Valid until:6/21/36, 9:00?PM
2026-08-17 15:59:45,842 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:203e5c068ef631a9c72905052, Subject:CN=GTS Root R4, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R4, O=Google Trust Services LLC, C=US, Key type:EC, Length:384, Cert Id:1326433111, Valid from:6/21/16, 9:00?PM, Valid until:6/21/36, 9:00?PM
2026-08-17 15:59:45,843 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withECDSA, Serial:0, Subject:CN=Hellenic Academic and Research Institutions ECC RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Issuer:CN=Hellenic Academic and Research Institutions ECC RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Key type:EC, Length:384, Cert Id:513613456, Valid from:7/7/15, 7:37?AM, Valid until:6/30/40, 7:37?AM
2026-08-17 15:59:45,843 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Hellenic Academic and Research Institutions RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Issuer:CN=Hellenic Academic and Research Institutions RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Key type:RSA, Length:4096, Cert Id:3491990565, Valid from:7/7/15, 7:11?AM, Valid until:6/30/40, 7:11?AM
2026-08-17 15:59:45,844 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:a0142800000014523c844b500000002, Subject:CN=IdenTrust Commercial Root CA 1, O=IdenTrust, C=US, Issuer:CN=IdenTrust Commercial Root CA 1, O=IdenTrust, C=US, Key type:RSA, Length:4096, Cert Id:1232565210, Valid from:1/16/14, 4:12?PM, Valid until:1/16/34, 3:12?PM
2026-08-17 15:59:45,844 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:a0142800000014523cf467c00000002, Subject:CN=IdenTrust Public Sector Root CA 1, O=IdenTrust, C=US, Issuer:CN=IdenTrust Public Sector Root CA 1, O=IdenTrust, C=US, Key type:RSA, Length:4096, Cert Id:2123370772, Valid from:1/16/14, 3:53?PM, Valid until:1/16/34, 2:53?PM
2026-08-17 15:59:45,845 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:8210cfb0d240e3594463e0bb63828b00, Subject:CN=ISRG Root X1, O=Internet Security Research Group, C=US, Issuer:CN=ISRG Root X1, O=Internet Security Research Group, C=US, Key type:RSA, Length:4096, Cert Id:1521974916, Valid from:6/4/15, 8:04?AM, Valid until:6/4/35, 8:04?AM
2026-08-17 15:59:45,845 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:a7ea6df4b449eda6a24859ee6b815d3167fbbb1, Subject:CN=LuxTrust Global Root 2, O=LuxTrust S.A., C=LU, Issuer:CN=LuxTrust Global Root 2, O=LuxTrust S.A., C=LU, Key type:RSA, Length:4096, Cert Id:3055636602, Valid from:3/5/15, 10:21?AM, Valid until:3/5/35, 10:21?AM
2026-08-17 15:59:45,845 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:bb8, Subject:CN=LuxTrust Global Root, O=LuxTrust s.a., C=LU, Issuer:CN=LuxTrust Global Root, O=LuxTrust s.a., C=LU, Key type:RSA, Length:2048, Cert Id:1714819687, Valid from:3/17/11, 6:51?AM, Valid until:3/17/21, 6:51?AM
2026-08-17 15:59:45,846 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:66f23daf87de8bb14aea0c573101c2ec, Subject:CN=Microsoft ECC Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft ECC Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:EC, Length:384, Cert Id:3240761285, Valid from:12/18/19, 8:06?PM, Valid until:7/18/42, 8:16?PM
2026-08-17 15:59:45,846 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:1ed397095fd8b4b347701eaabe7f45b3, Subject:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:2848349048, Valid from:12/18/19, 7:51?PM, Valid until:7/18/42, 8:00?PM
2026-08-17 15:59:45,847 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:3ab6508b, Subject:CN=QuoVadis Root Certification Authority, OU=Root Certification Authority, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root Certification Authority, OU=Root Certification Authority, O=QuoVadis Limited, C=BM, Key type:RSA, Length:2048, Cert Id:2412561694, Valid from:3/19/01, 3:33?PM, Valid until:3/17/21, 3:33?PM
2026-08-17 15:59:45,847 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:78585f2ead2c194be3370735341328b596d46593, Subject:CN=QuoVadis Root CA 1 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 1 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:3532531262, Valid from:1/12/12, 3:27?PM, Valid until:1/12/42, 2:27?PM
2026-08-17 15:59:45,848 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:509, Subject:CN=QuoVadis Root CA 2, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 2, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:338250116, Valid from:11/24/06, 4:27?PM, Valid until:11/24/31, 3:23?PM
2026-08-17 15:59:45,848 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:445734245b81899b35f2ceb82b3b5ba726f07528, Subject:CN=QuoVadis Root CA 2 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 2 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:696763521, Valid from:1/12/12, 4:59?PM, Valid until:1/12/42, 3:59?PM
2026-08-17 15:59:45,849 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:5c6, Subject:CN=QuoVadis Root CA 3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:1470392860, Valid from:11/24/06, 5:11?PM, Valid until:11/24/31, 4:06?PM
2026-08-17 15:59:45,849 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:2ef59b0228a7db7affd5a3a9eebd03a0cf126a1d, Subject:CN=QuoVadis Root CA 3 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 3 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:3589344305, Valid from:1/12/12, 6:26?PM, Valid until:1/12/42, 5:26?PM
2026-08-17 15:59:45,850 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:OU=Security Communication RootCA2, O="SECOM Trust Systems CO.,LTD.", C=JP, Issuer:OU=Security Communication RootCA2, O="SECOM Trust Systems CO.,LTD.", C=JP, Key type:RSA, Length:2048, Cert Id:1521072570, Valid from:5/29/09, 2:00?AM, Valid until:5/29/29, 2:00?AM
2026-08-17 15:59:45,850 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:cf08e5c0816a5ad427ff0eb271859d0, Subject:CN=SecureTrust CA, O=SecureTrust Corporation, C=US, Issuer:CN=SecureTrust CA, O=SecureTrust Corporation, C=US, Key type:RSA, Length:2048, Cert Id:2034155325, Valid from:11/7/06, 5:31?PM, Valid until:12/31/29, 4:40?PM
2026-08-17 15:59:45,851 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withECDSA, Serial:75e6dfcbc1685ba8, Subject:CN=SSL.com Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:EC, Length:384, Cert Id:2926673683, Valid from:2/12/16, 4:14?PM, Valid until:2/12/41, 3:14?PM
2026-08-17 15:59:45,851 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:56b629cd34bc78f6, Subject:CN=SSL.com EV Root Certification Authority RSA R2, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com EV Root Certification Authority RSA R2, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:RSA, Length:4096, Cert Id:1381862403, Valid from:5/31/17, 3:14?PM, Valid until:5/30/42, 3:14?PM
2026-08-17 15:59:45,852 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:7b2c9bd316803299, Subject:CN=SSL.com Root Certification Authority RSA, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com Root Certification Authority RSA, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:RSA, Length:4096, Cert Id:156725711, Valid from:2/12/16, 3:39?PM, Valid until:2/12/41, 2:39?PM
2026-08-17 15:59:45,852 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:0, Subject:OU=Starfield Class 2 Certification Authority, O="Starfield Technologies, Inc.", C=US, Issuer:OU=Starfield Class 2 Certification Authority, O="Starfield Technologies, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:1825617644, Valid from:6/29/04, 2:39?PM, Valid until:6/29/34, 2:39?PM
2026-08-17 15:59:45,852 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Starfield Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Starfield Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:3268325709, Valid from:8/31/09, 9:00?PM, Valid until:12/31/37, 8:59?PM
2026-08-17 15:59:45,853 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Starfield Services Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Starfield Services Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:1964785574, Valid from:8/31/09, 9:00?PM, Valid until:12/31/37, 8:59?PM
2026-08-17 15:59:45,853 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:bb401c43f55e4fb0, Subject:CN=SwissSign Gold CA - G2, O=SwissSign AG, C=CH, Issuer:CN=SwissSign Gold CA - G2, O=SwissSign AG, C=CH, Key type:RSA, Length:4096, Cert Id:1516221943, Valid from:10/25/06, 5:30?AM, Valid until:10/25/36, 5:30?AM
2026-08-17 15:59:45,854 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:4eb200670c035d4f, Subject:CN=SwissSign Platinum CA - G2, O=SwissSign AG, C=CH, Issuer:CN=SwissSign Platinum CA - G2, O=SwissSign AG, C=CH, Key type:RSA, Length:4096, Cert Id:771312514, Valid from:10/25/06, 5:36?AM, Valid until:10/25/36, 5:36?AM
2026-08-17 15:59:45,854 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:4f1bd42f54bb2f4b, Subject:CN=SwissSign Silver CA - G2, O=SwissSign AG, C=CH, Issuer:CN=SwissSign Silver CA - G2, O=SwissSign AG, C=CH, Key type:RSA, Length:4096, Cert Id:126726124, Valid from:10/25/06, 5:32?AM, Valid until:10/25/36, 5:32?AM
2026-08-17 15:59:45,854 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:95be16a0f72e46f17b398272fa8bcd96, Subject:CN=TeliaSonera Root CA v1, O=TeliaSonera, Issuer:CN=TeliaSonera Root CA v1, O=TeliaSonera, Key type:RSA, Length:4096, Cert Id:1495358374, Valid from:10/18/07, 10:00?AM, Valid until:10/18/32, 9:00?AM
2026-08-17 15:59:45,855 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:344ed55720d5edec49f42fce37db2b6d, Subject:CN=thawte Primary Root CA, OU="(c) 2006 thawte, Inc. - For authorized use only", OU=Certification Services Division, O="thawte, Inc.", C=US, Issuer:CN=thawte Primary Root CA, OU="(c) 2006 thawte, Inc. - For authorized use only", OU=Certification Services Division, O="thawte, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:643000026, Valid from:11/16/06, 10:00?PM, Valid until:7/16/36, 8:59?PM
2026-08-17 15:59:45,855 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:35fc265cd9844fc93d263d579baed756, Subject:CN=thawte Primary Root CA - G2, OU="(c) 2007 thawte, Inc. - For authorized use only", O="thawte, Inc.", C=US, Issuer:CN=thawte Primary Root CA - G2, OU="(c) 2007 thawte, Inc. - For authorized use only", O="thawte, Inc.", C=US, Key type:EC, Length:384, Cert Id:2068083090, Valid from:11/4/07, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-08-17 15:59:45,856 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:600197b746a7eab4b49ad64b2ff790fb, Subject:CN=thawte Primary Root CA - G3, OU="(c) 2008 thawte, Inc. - For authorized use only", OU=Certification Services Division, O="thawte, Inc.", C=US, Issuer:CN=thawte Primary Root CA - G3, OU="(c) 2008 thawte, Inc. - For authorized use only", OU=Certification Services Division, O="thawte, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:1032730720, Valid from:4/1/08, 9:00?PM, Valid until:12/1/37, 8:59?PM
2026-08-17 15:59:45,856 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:1, Subject:CN=T-TeleSec GlobalRoot Class 2, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Issuer:CN=T-TeleSec GlobalRoot Class 2, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:3056503257, Valid from:10/1/08, 7:40?AM, Valid until:10/1/33, 8:59?PM
2026-08-17 15:59:45,856 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:1, Subject:CN=T-TeleSec GlobalRoot Class 3, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Issuer:CN=T-TeleSec GlobalRoot Class 3, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:1894096264, Valid from:10/1/08, 7:29?AM, Valid until:10/1/33, 8:59?PM
2026-08-17 15:59:45,857 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:cbe, Subject:CN=TWCA Global Root CA, OU=Root CA, O=TAIWAN-CA, C=TW, Issuer:CN=TWCA Global Root CA, OU=Root CA, O=TAIWAN-CA, C=TW, Key type:RSA, Length:4096, Cert Id:861175838, Valid from:6/27/12, 3:28?AM, Valid until:12/31/30, 12:59?PM
2026-08-17 15:59:45,857 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:5c8b99c55a94c5d27156decd8980cc26, Subject:CN=USERTrust ECC Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust ECC Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:EC, Length:384, Cert Id:3329287386, Valid from:1/31/10, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-08-17 15:59:45,858 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:1fd6d30fca3ca51a81bbc640e35032d, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:4096, Cert Id:3947601401, Valid from:1/31/10, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-08-17 15:59:45,858 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:44be0c8b500024b411d3362de0b35f1b, Subject:CN=UTN-USERFirst-Object, OU=http://www.usertrust.com, O=The USERTRUST Network, L=Salt Lake City, ST=UT, C=US, Issuer:CN=UTN-USERFirst-Object, OU=http://www.usertrust.com, O=The USERTRUST Network, L=Salt Lake City, ST=UT, C=US, Key type:RSA, Length:2048, Cert Id:3997913868, Valid from:7/9/99, 3:31?PM, Valid until:7/9/19, 3:40?PM
2026-08-17 15:59:45,858 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:9b7e0649a33e62b9d5ee90487129ef57, Subject:CN=VeriSign Class 3 Public Primary Certification Authority - G3, OU="(c) 1999 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Issuer:CN=VeriSign Class 3 Public Primary Certification Authority - G3, OU="(c) 1999 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:2057300190, Valid from:9/30/99, 9:00?PM, Valid until:7/16/36, 8:59?PM
2026-08-17 15:59:45,859 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withECDSA, Serial:2f80fe238c0e220f486712289187acb3, Subject:CN=VeriSign Class 3 Public Primary Certification Authority - G4, OU="(c) 2007 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Issuer:CN=VeriSign Class 3 Public Primary Certification Authority - G4, OU="(c) 2007 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Key type:EC, Length:384, Cert Id:4163473319, Valid from:11/4/07, 10:00?PM, Valid until:1/18/38, 8:59?PM
2026-08-17 15:59:45,859 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:18dad19e267de8bb4a2158cdcc6b3b4a, Subject:CN=VeriSign Class 3 Public Primary Certification Authority - G5, OU="(c) 2006 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Issuer:CN=VeriSign Class 3 Public Primary Certification Authority - G5, OU="(c) 2006 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:303010488, Valid from:11/7/06, 10:00?PM, Valid until:7/16/36, 8:59?PM
2026-08-17 15:59:45,860 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA256withRSA, Serial:401ac46421b31321030ebbe4121ac51d, Subject:CN=VeriSign Universal Root Certification Authority, OU="(c) 2008 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Issuer:CN=VeriSign Universal Root Certification Authority, OU="(c) 2008 VeriSign, Inc. - For authorized use only", OU=VeriSign Trust Network, O="VeriSign, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:2318285810, Valid from:4/1/08, 9:00?PM, Valid until:12/1/37, 8:59?PM
2026-08-17 15:59:45,860 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA1withRSA, Serial:50946cec18ead59c4dd597ef758fa0ad, Subject:CN=XRamp Global Certification Authority, O=XRamp Security Services Inc, OU=www.xrampsecurity.com, C=US, Issuer:CN=XRamp Global Certification Authority, O=XRamp Security Services Inc, OU=www.xrampsecurity.com, C=US, Key type:RSA, Length:2048, Cert Id:3342493210, Valid from:11/1/04, 2:14?PM, Valid until:1/1/35, 2:37?AM
2026-08-17 15:59:45,927 DEBUG [jdk.event.security] (reactor-http-epoll-1)  TLSHandshake: brazilsouth-1.in.applicationinsights.azure.com:443, TLSv1.3, TLS_AES_256_GCM_SHA384, 381841505
2026-08-17 15:59:46,149 DEBUG [io.quarkus.arc.impl] (main) ArC DI container initialized [beans=171, observers=16]
2026-08-17 15:59:46,159 DEBUG [org.hibernate.orm.jpa] (main) HHH008541: PersistenceUnitInfo [
	name: <default>
	persistence provider classname: null
	classloader: null
	excludeUnlistedClasses: true
	JTA datasource: null
	Non JTA datasource: null
	Transaction type: RESOURCE_LOCAL
	PU root URL: null
	Shared Cache Mode: null
	Validation Mode: null
	Jar files URLs []
	Managed classes names [
		br.com.sisgh.link.entity.RequisicaoEntity
		io.quarkus.hibernate.reactive.panache.PanacheEntity
		io.quarkus.hibernate.reactive.panache.PanacheEntityBase]
	Mapping files names []
	Properties [
		hibernate.hbm2ddl.skip_default_import_file: true
		hibernate.query.plan_cache_max_size: 2048
		hibernate.query.fail_on_pagination_over_collection_fetch: false
		hibernate.discriminator.ignore_explicit_for_joined: false
		hibernate.hbm2ddl.charset_name: UTF-8
		hibernate.cache.use_reference_entries: null
		hibernate.cache.use_query_cache: null
		hibernate.query.in_clause_parameter_padding: true
		hibernate.cache.use_second_level_cache: null
		jakarta.persistence.sharedCache.mode: null
		jakarta.persistence.database-product-name: Oracle
		hibernate.id.sequence.increment_size_mismatch_strategy: null
		hibernate.id.optimizer.pooled.preferred: pooled-lo
		hibernate.order_by.default_null_ordering: none
		jakarta.persistence.validation.mode: AUTO]
2026-08-17 15:59:46,374 DEBUG [org.hibernate.orm.core] (main) HHH000001: Hibernate ORM core version 7.2.6.Final
2026-08-17 15:59:46,380 DEBUG [org.hibernate.orm.core] (main) HHH000206: 'hibernate.properties' not found
2026-08-17 15:59:46,691 DEBUG [org.hibernate.orm.boot] (main) HHH160188: Ignoring 0 XML mappings due to 'hibernate.xml_mapping_enabled'
2026-08-17 15:59:47,098 DEBUG [org.hibernate.orm.dialect] (main) HHH035001: Using dialect: org.hibernate.dialect.OracleDialect, version: 19.0
2026-08-17 15:59:47,132 DEBUG [org.hibernate.orm.jdbc.lob] (main) HHH10010002: Disabling contextual LOB creation as connection was null
2026-08-17 15:59:47,134 DEBUG [org.hibernate.orm.jdbc] (main) HHH100122: Using default JDBC fetch size: -1
2026-08-17 15:59:47,139 DEBUG [org.hibernate.orm.connections.pooling] (main) HHH10001005: Database info:
	Database JDBC URL [undefined/unknown]
	Database driver: undefined/unknown
	Database dialect: OracleDialect
	Database version: 19.0
	Default catalog/schema: unknown/unknown
	Autocommit mode: undefined/unknown
	Isolation level: <unknown>
	JDBC fetch size: undefined/unknown
	Pool: undefined/unknown
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2026-08-17 15:59:47,141 DEBUG [org.hibernate.reactive.provider.service.NativeParametersHandling] (main) Initializing service JdbcParameterRenderer with implementation: class org.hibernate.sql.ast.internal.ParameterMarkerStrategyStandard
2026-08-17 15:59:47,360 DEBUG [org.infinispan.quarkus.hibernate.cache.QuarkusInfinispanRegionFactory] (main) Stop region factory
2026-08-17 15:59:47,360 DEBUG [org.infinispan.quarkus.hibernate.cache.QuarkusInfinispanRegionFactory] (main) Clear region references
2026-08-17 15:59:47,364 DEBUG [io.quarkus.arc.runtime.ArcRecorder] (main) Bean container listener io.quarkus.hibernate.orm.runtime.HibernateOrmRecorder$1 finished in 1211 ms
2026-08-17 15:59:47,381 DEBUG [org.hibernate.validator.internal.util.Version] (main) HV000001: Hibernate Validator 9.1.0.Final
2026-08-17 15:59:47,386 DEBUG [org.hibernate.validator.internal.engine.AbstractConfigurationImpl] (main) Setting custom LocaleResolver of type io.quarkus.hibernate.validator.runtime.locale.LocaleResolversWrapper
2026-08-17 15:59:47,389 DEBUG [org.hibernate.validator.internal.engine.AbstractConfigurationImpl] (main) Setting custom BeanMetaDataClassNormalizer of type io.quarkus.hibernate.validator.runtime.ArcProxyBeanMetaDataClassNormalizer
2026-08-17 15:59:47,390 DEBUG [org.hibernate.validator.internal.engine.AbstractConfigurationImpl] (main) Setting custom ConstraintValidatorFactory of type io.quarkus.hibernate.validator.runtime.ArcConstraintValidatorFactoryImpl
2026-08-17 15:59:47,390 DEBUG [org.hibernate.validator.internal.engine.AbstractConfigurationImpl] (main) Setting custom TraversableResolver of type io.quarkus.hibernate.validator.runtime.HibernateValidatorRecorder$DelegatingTraversableResolver
2026-08-17 15:59:47,391 DEBUG [org.hibernate.validator.internal.engine.AbstractConfigurationImpl] (main) Setting custom ClockProvider of type io.quarkus.hibernate.validator.runtime.clockprovider.RuntimeReinitializedDefaultClockProvider
2026-08-17 15:59:47,392 DEBUG [org.hibernate.validator.internal.engine.AbstractConfigurationImpl] (main) HV000002: Ignoring XML configuration.
2026-08-17 15:59:47,407 DEBUG [org.hibernate.validator.resourceloading.PlatformResourceBundleLocator] (main) ValidationMessages not found.
2026-08-17 15:59:47,407 DEBUG [org.hibernate.validator.resourceloading.PlatformResourceBundleLocator] (main) HV000270: Message resource bundle for the pt_BR locale is not available and was not pre-loaded.
2026-08-17 15:59:47,407 DEBUG [org.hibernate.validator.resourceloading.PlatformResourceBundleLocator] (main) ValidationMessages not found.
2026-08-17 15:59:47,407 DEBUG [org.hibernate.validator.resourceloading.PlatformResourceBundleLocator] (main) HV000270: Message resource bundle for the en_US locale is not available and was not pre-loaded.
2026-08-17 15:59:47,407 DEBUG [org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper] (main) HV000255: Using io.quarkus.hibernate.validator.runtime.locale.LocaleResolversWrapper as locale resolver.
2026-08-17 15:59:47,408 DEBUG [org.hibernate.validator.resourceloading.PlatformResourceBundleLocator] (main) ContributorValidationMessages not found.
2026-08-17 15:59:47,408 DEBUG [org.hibernate.validator.resourceloading.PlatformResourceBundleLocator] (main) HV000270: Message resource bundle for the en_US locale is not available and was not pre-loaded.
2026-08-17 15:59:47,409 DEBUG [org.hibernate.validator.resourceloading.PlatformResourceBundleLocator] (main) ContributorValidationMessages not found.
2026-08-17 15:59:47,409 DEBUG [org.hibernate.validator.resourceloading.PlatformResourceBundleLocator] (main) HV000270: Message resource bundle for the pt_BR locale is not available and was not pre-loaded.
2026-08-17 15:59:47,409 DEBUG [org.hibernate.validator.resourceloading.PlatformResourceBundleLocator] (main) org.hibernate.validator.ValidationMessages found.
2026-08-17 15:59:47,410 DEBUG [org.hibernate.validator.resourceloading.PlatformResourceBundleLocator] (main) org.hibernate.validator.ValidationMessages found.
2026-08-17 15:59:47,417 DEBUG [org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator] (main) Loaded expression factory via original TCCL
2026-08-17 15:59:47,428 DEBUG [org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper] (main) HV000252: Using org.hibernate.validator.internal.engine.DefaultPropertyNodeNameProvider as property node name provider.
2026-08-17 15:59:47,565 DEBUG [org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator as ValidatorFactory-scoped message interpolator.
2026-08-17 15:59:47,565 DEBUG [org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper] (main) HV000234: Using io.quarkus.hibernate.validator.runtime.HibernateValidatorRecorder$DelegatingTraversableResolver as ValidatorFactory-scoped traversable resolver.
2026-08-17 15:59:47,565 DEBUG [org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.util.ExecutableParameterNameProvider as ValidatorFactory-scoped parameter name provider.
2026-08-17 15:59:47,565 DEBUG [org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper] (main) HV000234: Using io.quarkus.hibernate.validator.runtime.clockprovider.RuntimeReinitializedDefaultClockProvider as ValidatorFactory-scoped clock provider.
2026-08-17 15:59:47,565 DEBUG [org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.engine.scripting.DefaultScriptEvaluatorFactory as ValidatorFactory-scoped script evaluator factory.
2026-08-17 15:59:47,597 DEBUG [io.quarkus.arc.impl] (main) Loaded 96 removed beans lazily
2026-08-17 15:59:47,597 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerVertxBufferMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,599 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerMutinyBufferMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,600 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerVertxAsyncFileMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,602 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerMutinyAsyncFileMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,604 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonArrayMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,605 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonObjectMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,605 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.QuarkusServerPathBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,606 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonArrayMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,607 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonObjectMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,607 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,607 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,607 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,607 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,607 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,607 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerCharArrayMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,607 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerByteArrayMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,608 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerFormUrlEncodedProvider and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,608 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerInputStreamMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,608 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.StreamingOutputMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,608 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerReaderBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,608 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerFileBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,608 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerFilePartBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,608 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.core.multipart.MultipartMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,608 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerPathBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,608 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerPathPartBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,608 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,608 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerBooleanMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,608 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerCharacterMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,608 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerNumberMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,608 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerInputStreamMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,608 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerReaderBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,609 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.QuarkusServerFileBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,609 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerByteArrayMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,609 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerDefaultTextPlainBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,625 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.common.runtime.serialisers.vertx.VertxJsonArrayBasicMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,625 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.common.runtime.serialisers.vertx.VertxJsonObjectBasicMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,625 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.common.runtime.serialisers.vertx.VertxJsonArrayBasicMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,625 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.common.runtime.serialisers.vertx.VertxJsonObjectBasicMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,627 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.exceptionmappers.ForbiddenExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,629 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.mappers.BuiltinMismatchedInputExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,629 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.exceptionmappers.AuthenticationRedirectExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,630 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.exceptionmappers.AuthenticationCompletionExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,630 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.rest.runtime.__QuarkusInit and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-17 15:59:47,711 DEBUG [io.netty.util.internal.logging.InternalLoggerFactory] (main) Using SLF4J as the default logging framework
2026-08-17 15:59:47,727 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource BuildTime RunTime Fixed with ordinal 2147483647
2026-08-17 15:59:47,727 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource ValueRegistryConfigSource with ordinal 2147483637
2026-08-17 15:59:47,727 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource DevServicesOverrideConfigSource with ordinal 410
2026-08-17 15:59:47,727 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource SysPropConfigSource with ordinal 400
2026-08-17 15:59:47,727 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource EnvConfigSource with ordinal 300
2026-08-17 15:59:47,727 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource PropertiesConfigSource[source=jar:file:///deployments/app/sisgh-link-9.4.0.20.jar!/application.properties] with ordinal 250
2026-08-17 15:59:47,727 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource DevServicesConfigSource with ordinal 240
2026-08-17 15:59:47,727 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource Runtime Values with ordinal 0
2026-08-17 15:59:47,728 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource QuarkusUUIDConfigSource with ordinal -2147483648
2026-08-17 15:59:47,728 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource DefaultValuesConfigSource with ordinal -2147483648
2026-08-17 15:59:47,864 WARN  [io.quarkus.config] (main) Unrecognized configuration key "quarkus.fgo.client-id" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-17 15:59:47,865 WARN  [io.quarkus.config] (main) Unrecognized configuration key "quarkus.hibernate-orm.schema-management.scripts.generation" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-17 15:59:47,865 WARN  [io.quarkus.config] (main) Unrecognized configuration key "quarkus.fgo.v2.url-base-oauth" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-17 15:59:47,865 WARN  [io.quarkus.config] (main) Unrecognized configuration key "quarkus.fgo.api-key" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-17 15:59:47,865 WARN  [io.quarkus.config] (main) Unrecognized configuration key "quarkus.fgo.v2.scope" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-17 15:59:47,865 WARN  [io.quarkus.config] (main) Unrecognized configuration key "quarkus.resteasy-reactive.path" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-17 15:59:47,865 WARN  [io.quarkus.config] (main) Unrecognized configuration key "quarkus.proxy.non-proxy-hosts-delimiter" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-17 15:59:47,866 WARN  [io.quarkus.config] (main) Unrecognized configuration key "quarkus.fgo.v2.client-secret" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-17 15:59:47,866 WARN  [io.quarkus.config] (main) Unrecognized configuration key "quarkus.fgo.client-secret" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-17 15:59:47,866 WARN  [io.quarkus.config] (main) Unrecognized configuration key "quarkus.http.cors" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-17 15:59:47,866 WARN  [io.quarkus.config] (main) Unrecognized configuration key "quarkus.fgo.v2.client-id" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-17 15:59:47,866 WARN  [io.quarkus.config] (main) Unrecognized configuration key "quarkus.fgo.v2.api-key" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-17 15:59:47,866 WARN  [io.quarkus.config] (main) Unrecognized configuration key "quarkus.fgo.scope" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-17 15:59:47,866 WARN  [io.quarkus.config] (main) Unrecognized configuration key "quarkus.fgo.v2.url-base-api" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-17 15:59:47,867 WARN  [io.quarkus.config] (main) Unrecognized configuration key "quarkus.fgo.url-base-api" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-17 15:59:47,867 WARN  [io.quarkus.config] (main) Unrecognized configuration key "quarkus.fgo.url-base-oauth" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-17 15:59:47,867 WARN  [io.quarkus.config] (main) Unrecognized configuration key "quarkus.fgo.ssl-trust-store-password" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-17 15:59:47,867 WARN  [io.quarkus.config] (main) Unrecognized configuration key "quarkus.fgo.ssl-trust-store" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-17 15:59:47,952 WARN  [io.quarkus.config] (main) The "quarkus.oidc-client.proxy.port" config property is deprecated and should not be used anymore.
2026-08-17 15:59:47,953 WARN  [io.quarkus.config] (main) The "quarkus.oidc-client.proxy.host" config property is deprecated and should not be used anymore.
2026-08-17 15:59:48,061 DEBUG [io.vertx.core.logging.LoggerFactory] (main) Using io.quarkus.vertx.core.runtime.VertxLogDelegateFactory
2026-08-17 15:59:48,083 DEBUG [io.quarkus.vertx.core.runtime.VertxCoreRecorder] (main) Vert.x Cache configured to: /tmp/vertx-cache/-1392808342592538586
2026-08-17 15:59:48,112 DEBUG [io.netty.util.internal.PlatformDependent0] (main) Java version: 21
2026-08-17 15:59:48,112 DEBUG [io.netty.util.internal.PlatformDependent0] (main) -Dio.netty.noUnsafe: false
2026-08-17 15:59:48,114 DEBUG [io.netty.util.internal.PlatformDependent0] (main) java.nio.Buffer.address: available
2026-08-17 15:59:48,114 DEBUG [io.netty.util.internal.PlatformDependent0] (main) java.nio.Bits.unaligned: available, true
2026-08-17 15:59:48,116 DEBUG [io.netty.util.internal.PlatformDependent0] (main) java.nio.DirectByteBuffer.<init>(long, {int,long}): unavailable
2026-08-17 15:59:48,117 DEBUG [io.netty.util.internal.PlatformDependent] (main) sun.misc.Unsafe: available
2026-08-17 15:59:48,117 DEBUG [io.netty.util.internal.PlatformDependent] (main) -Dio.netty.tmpdir: /tmp (java.io.tmpdir)
2026-08-17 15:59:48,117 DEBUG [io.netty.util.internal.PlatformDependent] (main) -Dio.netty.bitMode: 64 (sun.arch.data.model)
2026-08-17 15:59:48,118 DEBUG [io.netty.util.internal.PlatformDependent] (main) -Dio.netty.maxDirectMemory: -1 bytes
2026-08-17 15:59:48,118 DEBUG [io.netty.util.internal.PlatformDependent] (main) -Dio.netty.uninitializedArrayAllocationThreshold: -1
2026-08-17 15:59:48,124 DEBUG [io.netty.util.internal.CleanerJava9] (main) java.nio.ByteBuffer.cleaner(): available
2026-08-17 15:59:48,125 DEBUG [io.netty.util.internal.PlatformDependent] (main) -Dio.netty.noPreferDirect: false
2026-08-17 15:59:48,142 DEBUG [io.netty.util.ResourceLeakDetector] (main) -Dio.netty.leakDetection.level: simple
2026-08-17 15:59:48,143 DEBUG [io.netty.util.ResourceLeakDetector] (main) -Dio.netty.leakDetection.targetRecords: 4
2026-08-17 15:59:48,234 DEBUG [io.netty.channel.MultithreadEventLoopGroup] (main) -Dio.netty.eventLoopThreads: 4
2026-08-17 15:59:48,284 DEBUG [io.netty.util.concurrent.GlobalEventExecutor] (main) -Dio.netty.globalEventExecutor.quietPeriodSeconds: 1
2026-08-17 15:59:48,353 DEBUG [io.netty.util.internal.InternalThreadLocalMap] (main) -Dio.netty.threadLocalMap.stringBuilder.initialSize: 1024
2026-08-17 15:59:48,353 DEBUG [io.netty.util.internal.InternalThreadLocalMap] (main) -Dio.netty.threadLocalMap.stringBuilder.maxSize: 4096
2026-08-17 15:59:48,429 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:410043becc9b22e77ea829dd5600000043becc, Subject:CN=Microsoft TLS G2 RSA CA OCSP 02 External OCSP Responder 2026-06-, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 02, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:3855509503, Valid from:6/1/26, 3:47?PM, Valid until:11/28/26, 3:47?PM
2026-08-17 15:59:48,431 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:4100881e3079a1273092ae02f8000000881e30, Subject:CN=live.applicationinsights.azure.com, O=Microsoft Corporation, L=Redmond, ST=WA, C=US, Issuer:CN=Microsoft TLS G2 RSA CA OCSP 02, O=Microsoft Corporation, C=US, Key type:RSA, Length:2048, Cert Id:357999874, Valid from:7/22/26, 6:55?PM, Valid until:1/18/27, 6:55?PM
2026-08-17 15:59:48,432 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:330000000c4964a16f44203b2200000000000c, Subject:CN=Microsoft TLS G2 RSA CA OCSP 02, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:4116687715, Valid from:8/1/25, 5:03?PM, Valid until:6/3/29, 5:03?PM
2026-08-17 15:59:48,432 DEBUG [jdk.event.security] (reactor-http-epoll-1) X509Certificate: Alg:SHA384withRSA, Serial:b0c6b2c466917b04773c647d4afc0c8, Subject:CN=Microsoft TLS RSA Root G2, O=Microsoft Corporation, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:3081933591, Valid from:5/20/25, 9:00?PM, Valid until:6/19/29, 8:59?PM
2026-08-17 15:59:48,435 DEBUG [jdk.event.security] (reactor-http-epoll-1) ValidationChain: 1136084297, 3081933591, 4116687715, 357999874
2026-08-17 15:59:48,438 DEBUG [jdk.event.security] (reactor-http-epoll-1)  TLSHandshake: brazilsouth.livediagnostics.monitor.azure.com:443, TLSv1.3, TLS_AES_256_GCM_SHA384, 357999874
2026-08-17 15:59:48,466 DEBUG [io.netty.channel.nio.NioEventLoop] (main) -Dio.netty.noKeySetOptimization: false
2026-08-17 15:59:48,466 DEBUG [io.netty.channel.nio.NioEventLoop] (main) -Dio.netty.selectorAutoRebuildThreshold: 512
2026-08-17 15:59:48,473 DEBUG [io.netty.util.internal.PlatformDependent] (main) org.jctools-core.MpscChunkedArrayQueue: available
2026-08-17 15:59:48,543 DEBUG [io.quarkus.vertx.core.runtime.VertxCoreRecorder] (main) Vertx has Native Transport Enabled: false
2026-08-17 15:59:48,569 FINE  [jakarta.json.spi.JsonProvider] (main) Checking system property jakarta.json.provider
2026-08-17 15:59:48,569 FINE  [jakarta.json.spi.JsonProvider] (main) Checking ServiceLoader
2026-08-17 15:59:48,573 FINE  [jakarta.json.spi.JsonProvider] (main) ServiceLoader loading Facility used; returning object [org.eclipse.parsson.JsonProviderImpl]
2026-08-17 15:59:48,578 FINE  [jakarta.json.spi.JsonProvider] (main) Checking system property jakarta.json.provider
2026-08-17 15:59:48,579 FINE  [jakarta.json.spi.JsonProvider] (main) Checking ServiceLoader
2026-08-17 15:59:48,579 FINE  [jakarta.json.spi.JsonProvider] (main) ServiceLoader loading Facility used; returning object [org.eclipse.parsson.JsonProviderImpl]
2026-08-17 15:59:48,733 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource OpenApiConfigHelper with ordinal 1
2026-08-17 15:59:48,733 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource DefaultValuesConfigSource with ordinal -2147483648
2026-08-17 15:59:48,956 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,959 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,959 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,959 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,959 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,959 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,959 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,959 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,960 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,960 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,960 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,960 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,960 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,960 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,960 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,960 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,960 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,960 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,960 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,960 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,961 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,961 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,961 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,961 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,961 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,961 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,961 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,961 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,961 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,961 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,961 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,961 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,962 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,962 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,962 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,962 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,962 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,962 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,962 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,962 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,962 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,962 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,962 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,962 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,963 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,963 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,963 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,963 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,963 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,963 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,963 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,963 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,963 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,963 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,963 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,964 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,964 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,964 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,964 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,964 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,964 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,964 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,964 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,964 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,964 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,965 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,965 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,965 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,965 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,965 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,965 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,965 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,965 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,965 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,965 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,965 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,966 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,966 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,966 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,966 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,966 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,966 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,966 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,966 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,966 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,966 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,966 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,967 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,967 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,967 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,967 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,967 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,967 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,967 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,967 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,967 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,968 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,968 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,968 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,968 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,968 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,968 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,968 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,969 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,969 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,969 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,969 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,969 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,969 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,969 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,969 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,969 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,969 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,969 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,969 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,969 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,970 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,970 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,970 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,970 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,970 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,970 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,970 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,970 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,971 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,971 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,971 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,971 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,971 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,971 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,971 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,971 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,971 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,971 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,971 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,971 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,972 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,972 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,972 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,972 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,972 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,972 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,972 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,972 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,972 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,972 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,976 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,977 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,978 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,978 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,978 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,978 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,978 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,978 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,978 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,978 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,978 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,979 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,979 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,979 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,979 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,979 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,979 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,980 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,980 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,980 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,980 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,980 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,980 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,980 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,980 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,980 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,980 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,980 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,980 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,980 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,981 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,981 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,981 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,981 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,981 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,981 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,981 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,981 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,981 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,981 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,981 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,981 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,981 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,981 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,981 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,981 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,982 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,982 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,982 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,982 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,982 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,982 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,982 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,982 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,982 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,982 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,982 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,982 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,982 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,982 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,982 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,983 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,983 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,983 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,983 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,983 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,983 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,983 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,983 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,983 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,983 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,983 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,983 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,983 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,983 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,983 DEBUG [io.smallrye.openapi.runtime.io] (main) SROAP02009: Processing a single Schema json object.
2026-08-17 15:59:48,985 DEBUG [io.smallrye.openapi.api] (main) SROAP00500: Adding model from custom static file...
2026-08-17 15:59:48,986 DEBUG [io.smallrye.openapi.api] (main) SROAP00501: Adding model callbacks from custom static file: <no>
2026-08-17 15:59:48,986 DEBUG [io.smallrye.openapi.api] (main) SROAP00501: Adding model examples from custom static file: <no>
2026-08-17 15:59:48,986 DEBUG [io.smallrye.openapi.api] (main) SROAP00501: Adding model headers from custom static file: <no>
2026-08-17 15:59:48,986 DEBUG [io.smallrye.openapi.api] (main) SROAP00501: Adding model links from custom static file: <no>
2026-08-17 15:59:48,987 DEBUG [io.smallrye.openapi.api] (main) SROAP00501: Adding model parameters from custom static file: <no>
2026-08-17 15:59:48,987 DEBUG [io.smallrye.openapi.api] (main) SROAP00501: Adding model request bodies from custom static file: <no>
2026-08-17 15:59:48,987 DEBUG [io.smallrye.openapi.api] (main) SROAP00501: Adding model responses from custom static file: <no>
2026-08-17 15:59:48,987 DEBUG [io.smallrye.openapi.api] (main) SROAP00501: Adding model schemas from custom static file: 19
2026-08-17 15:59:48,988 DEBUG [io.smallrye.openapi.api] (main) SROAP00501: Adding model security schemes from custom static file: 3
2026-08-17 15:59:48,988 DEBUG [io.smallrye.openapi.api] (main) SROAP00501: Adding model servers from custom static file: <no>
2026-08-17 15:59:48,988 DEBUG [io.smallrye.openapi.api] (main) SROAP00501: Adding model path items from custom static file: 12
2026-08-17 15:59:48,988 DEBUG [io.smallrye.openapi.api] (main) SROAP00501: Adding model security from custom static file: 1
2026-08-17 15:59:48,988 DEBUG [io.smallrye.openapi.api] (main) SROAP00501: Adding model tags from custom static file: 3
2026-08-17 15:59:48,988 DEBUG [io.smallrye.openapi.api] (main) SROAP00501: Adding model extensions from custom static file: <no>
2026-08-17 15:59:49,169 DEBUG [io.netty.util.NetUtil] (main) -Djava.net.preferIPv4Stack: false
2026-08-17 15:59:49,169 DEBUG [io.netty.util.NetUtil] (main) -Djava.net.preferIPv6Addresses: false
2026-08-17 15:59:49,170 DEBUG [io.netty.util.NetUtilInitializations] (main) Loopback interface: lo (lo, 0:0:0:0:0:0:0:1%lo)
2026-08-17 15:59:49,171 DEBUG [io.netty.util.NetUtil] (main) /proc/sys/net/core/somaxconn: 4096
2026-08-17 15:59:49,276 DEBUG [io.netty.channel.DefaultChannelId] (vert.x-eventloop-thread-1) -Dio.netty.processId: 8 (auto-detected)
2026-08-17 15:59:49,276 DEBUG [io.netty.channel.DefaultChannelId] (vert.x-eventloop-thread-1) -Dio.netty.machineId: 67:2c:59:a4:40:9a:39:b7 (user-set)
2026-08-17 15:59:49,356 DEBUG [io.netty.buffer.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.numHeapArenas: 4
2026-08-17 15:59:49,357 DEBUG [io.netty.buffer.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.numDirectArenas: 4
2026-08-17 15:59:49,357 DEBUG [io.netty.buffer.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.pageSize: 8192
2026-08-17 15:59:49,357 DEBUG [io.netty.buffer.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.maxOrder: 3
2026-08-17 15:59:49,357 DEBUG [io.netty.buffer.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.chunkSize: 65536
2026-08-17 15:59:49,357 DEBUG [io.netty.buffer.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.smallCacheSize: 256
2026-08-17 15:59:49,357 DEBUG [io.netty.buffer.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.normalCacheSize: 64
2026-08-17 15:59:49,357 DEBUG [io.netty.buffer.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.maxCachedBufferCapacity: 32768
2026-08-17 15:59:49,357 DEBUG [io.netty.buffer.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.cacheTrimInterval: 8192
2026-08-17 15:59:49,357 DEBUG [io.netty.buffer.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.cacheTrimIntervalMillis: 0
2026-08-17 15:59:49,357 DEBUG [io.netty.buffer.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.useCacheForAllThreads: false
2026-08-17 15:59:49,357 DEBUG [io.netty.buffer.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.maxCachedByteBuffersPerChunk: 1023
2026-08-17 15:59:49,357 DEBUG [io.netty.buffer.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.disableCacheFinalizersForFastThreadLocalThreads: true
2026-08-17 15:59:49,379 DEBUG [io.netty.buffer.ByteBufUtil] (vert.x-eventloop-thread-1) -Dio.netty.allocator.type: pooled
2026-08-17 15:59:49,380 DEBUG [io.netty.buffer.ByteBufUtil] (vert.x-eventloop-thread-1) -Dio.netty.threadLocalDirectBufferSize: 0
2026-08-17 15:59:49,380 DEBUG [io.netty.buffer.ByteBufUtil] (vert.x-eventloop-thread-1) -Dio.netty.maxThreadLocalCharBufferSize: 16384
2026-08-17 15:59:49,395 DEBUG [io.netty.bootstrap.ChannelInitializerExtensions] (vert.x-eventloop-thread-1) -Dio.netty.bootstrap.extensions: null
2026-08-17 15:59:49,408 DEBUG [io.netty.handler.ssl.JdkSslContext] (vert.x-eventloop-thread-1) Default protocols (JDK): [TLSv1.3, TLSv1.2] 
2026-08-17 15:59:49,408 DEBUG [io.netty.handler.ssl.JdkSslContext] (vert.x-eventloop-thread-1) Default cipher suites (JDK): [TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_256_CBC_SHA, TLS_AES_128_GCM_SHA256, TLS_AES_256_GCM_SHA384]
2026-08-17 15:59:49,472 DEBUG [io.netty.buffer.AbstractByteBuf] (vert.x-eventloop-thread-1) -Dio.netty.buffer.checkAccessible: true
2026-08-17 15:59:49,472 DEBUG [io.netty.buffer.AbstractByteBuf] (vert.x-eventloop-thread-1) -Dio.netty.buffer.checkBounds: true
2026-08-17 15:59:49,473 DEBUG [io.netty.util.ResourceLeakDetectorFactory] (vert.x-eventloop-thread-1) Loaded default ResourceLeakDetector: io.netty.util.ResourceLeakDetector@8a43ee9
2026-08-17 15:59:49,479 DEBUG [io.netty.util.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.maxCapacityPerThread: 4096
2026-08-17 15:59:49,479 DEBUG [io.netty.util.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.ratio: 8
2026-08-17 15:59:49,479 DEBUG [io.netty.util.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.chunkSize: 32
2026-08-17 15:59:49,479 DEBUG [io.netty.util.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.blocking: false
2026-08-17 15:59:49,479 DEBUG [io.netty.util.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.batchFastThreadLocalOnly: true
2026-08-17 15:59:49,498 DEBUG [jdk.event.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:7e00000143ae5d3eeaa54228a8000000000143, Subject:CN=login.des.caixa, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Icptestes Sub, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:2048, Cert Id:3776494143, Valid from:6/4/24, 1:14?PM, Valid until:6/4/29, 1:24?PM
2026-08-17 15:59:49,499 DEBUG [jdk.event.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:600000000299b24b9d7901ea84000000000002, Subject:CN=AC Icptestes Sub, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:2447629493, Valid from:12/23/22, 12:47?PM, Valid until:12/23/42, 12:05?PM
2026-08-17 15:59:49,499 DEBUG [jdk.event.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:47b583ffce303b8047ba716d908e88d2, Subject:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:71683228, Valid from:12/23/22, 11:55?AM, Valid until:12/23/42, 12:05?PM
2026-08-17 15:59:49,501 DEBUG [jdk.event.security] (vert.x-eventloop-thread-1) ValidationChain: 2447629493, 3776494143
2026-08-17 15:59:49,513 DEBUG [jdk.event.security] (vert.x-eventloop-thread-1)  TLSHandshake: login.des.caixa:443, TLSv1.2, TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, 3776494143
2026-08-17 15:59:49,526 DEBUG [io.netty.handler.ssl.SslHandler] (vert.x-eventloop-thread-1) [id: 0xf28ddfd7, L:/25.1.18.132:51034 - R:login.des.caixa/10.116.81.74:443] HANDSHAKEN: protocol:TLSv1.2 cipher suite:TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256
2026-08-17 15:59:49,666 DEBUG [io.quarkus.oidc.common.runtime.OidcCommonUtils] (vert.x-eventloop-thread-1) Discovered OIDC metadata: {"issuer":"https://login.des.caixa/auth/realms/intranet","authorization_endpoint":"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/auth","token_endpoint":"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token","token_introspection_endpoint":"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token/introspect","userinfo_endpoint":"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/userinfo","end_session_endpoint":"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/logout","jwks_uri":"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/certs","check_session_iframe":"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/login-status-iframe.html","grant_types_supported":["authorization_code","implicit","refresh_token","password","client_credentials"],"response_types_supported":["code","none","id_token","token","id_token token","code id_token","code token","code id_token token"],"subject_types_supported":["public","pairwise"],"id_token_signing_alg_values_supported":["ES384","RS384","HS256","HS512","ES256","RS256","HS384","ES512","RS512"],"userinfo_signing_alg_values_supported":["ES384","RS384","HS256","HS512","ES256","RS256","HS384","ES512","RS512","none"],"request_object_signing_alg_values_supported":["ES384","RS384","ES256","RS256","ES512","RS512","none"],"response_modes_supported":["query","fragment","form_post"],"registration_endpoint":"https://login.des.caixa/auth/realms/intranet/clients-registrations/openid-connect","token_endpoint_auth_methods_supported":["private_key_jwt","client_secret_basic","client_secret_post","client_secret_jwt"],"token_endpoint_auth_signing_alg_values_supported":["RS256"],"claims_supported":["sub","iss","auth_time","name","given_name","family_name","preferred_username","email"],"claim_types_supported":["normal"],"claims_parameter_supported":false,"scopes_supported":["openid","profile","email","address","phone","offline_access","roles","web-origins","audience_cli-ser-nda","webhook.write","payloadlocation.write","manterImovel","consultarSimulacao","lotecobv.read","pix.read","audience_cli-ser-sgr","cob.write","cob.read","cobv.read","lotecobv.write","pix.write","payloadlocation.read","webhook.read","pld","cobv.write","consultarParametros","audience_cli-ser-cli","acessoIrrestrito","realizarSimulacao","segmento_sistema","instituicao_financeira","audience_cli-ser-set","audience_cli-ser-aic","agente_moradia","operacao_fiduciaria","cobr.write","payloadlocationrec.read","solicrec.write","payloadlocationrec.write","webhookrec.write","pixautomatico.read","acessoAdministracao","audience_cli-ser-d01","audience_cli-ser-mtc","audience_cli-ser-spl","audience_cli-ser-ibc","audience_cli-ser-dep-mmi","audience_cli-ser-wic-pes","audience_cli-ser-sem","audience_cli-ser-mpg","audience_cli-ser-ouv","audience_cli-ser-x04","audience_cli-ser-gro","audience_cli-ser-sde2","audience_cli-ser-don_teste","audience_cli-ser-naf","audience_cli-ser-abe","audience_cli-ser-acx","audience_cli-ser-ptn","audience_cli-ser-fug","audience_cli-ser-gel_novo","audience_cli-ser-tkn","audience_cli-ser-alc","audience_cli-ser-pnc","audience_cli-ser-brj","audience_cli-ser-itx","audience_cli-ser-apc","audience_cli-ser-agf-dados","audience_cli-ser-atr","audience_cli-ser-gce","audience_cli-ser-nda_avld","audience_cli-ser-rfo","audience_cli-ser-bko","audience_cli-ser-gsr","audience_cli-ser-pgp","audience_cli-ser-fgd","audience_cli-ser-gec","audience_cli-ser-pab","audience_cli-ser-sag","audience_cli-ser-nbc","audience_cli-ser-cvo","audience_cli-ser-mcn","audience_cli-ser-ccr","audience_cli-ser-voc","audience_cli-ser-sam","audience_cli-ser-mtr-val","audience_cli-ser-api-sgh","econsignado-fgts","solicrec.read","audience_cli-ser-gfa","instituicao_reformas","audience_cli-ser-aaf","audience_cli-ser-got","audience_cli-ser-nch","audience_cli-ser-ppm","audience_cli-ser-acg","audience_cli-ser-gdu","audience_cli-ser-dep-mif","audience_cli-ser-gam","audience_cli-ser-dep-guardiao","audience_cli-ser-ng","audience_cli-ser-vit","audience_cli-ser-com","audience_cli-ser-red","audience_cli-ser-pcs","audience_cli-web-avl","acessoConstrutoras","conformidade","sitrr","webhookrec.read","pixautomatico.write","audience_cli-ser-nda_gtl","audience_cli-ser-dmf","audience_cli-ser-pah","audience_cli-ser-ana","audience_cli-ser-gpd","audience_cli-ser-acm","audience_cli-ser-sde","audience_cli-ser-nda_icod","audience_cli-ser-mtr-flexdoc","audience_cli-ser-nda_perd","audience_cli-ser-cdc","audience_cli-ser-mai","audience_cli-ser-crd","audience_cli-ser-dep-sufug-fgts-servicos","audience_cli-ser-cap","audience_cli-ser-iso","Audience_cli-ser-cpl","audience_cli-ser-nda_cac","audience_cli-ser-gpi","audience_cli-ser-gpd1","audience_cli-ser-gec-opf","audience_cli-ser-ri","audience_cli-ser-nda_out","audience_cli-ser-spl-captacao","audience_cli-ser-bpm","audience_cli-ser-spf","audience_cli-ser-bot","audience_cli-ser-avo","audience_cli-ser-ipv","audience_cli-ser-spl-lotericas","audience_cli-ser-cbp","audience_cli-ser-bsa","audience_cli-ser-dep-sufug-fgts","audience_cli-ser-gvc","audience_cli-ser-npc","audience_cli-ser-gts","audience_cli-ser-mkt","audience_cli-ser-iag","audience_cli-ser-idx","audience_cli-ser-bar-catalogo","audience_cli-ser-crf","audience_cli-ser-sfg","audience_cli-ser-wpc","audience_cli-ser-mpi","audience_cli-ser-api-geate","audience_cli-ser-nda_pcs","audience_cli-ser-seg","audience_cli-ser-gcn","audience_cli-ser-dun_sgf","audience_cli-ser-jur-com","audience_cli-ser-d02","audience_cli-ser-dcn","audience_cli-ser-ran","audience_cli-ser-mil-precificacao-api","audience_cli-ser-ceh","audience_cli-ser-wic-pen","audience_cli-ser-gdf","audience_cli-ser-afs","audience_cli-ser-dun2","snd","convenio","webhookcobr.read","rec.write","rec.read","cobr.read","webhookcobr.write","scope:api_a","scope:api_b","audience_cli-ser-smn-05","audience_cli-ser-gal","audience_cli-ser-tax-api","audience_cli-ser-nda_ctdd","audience_cli-ser-cpc","audience_cli-ser-nda_pcsd","audience_cli-ser-saq","audience_cli-ser-x02","audience_cli-ser-gde","audience_cli-ser-iac","audience_cli-ser-jur","audience_cli-ser-pcl_bpm","audience_cli-ser-bem","audience_cli-ser-gai","audience_cli-ser-mtr-credmei","audience_cli-ser-dmp","audience_cli-ser-hab","audience_cli-ser-b24","audience_cli-ser-pge","audience_cli-ser-ath","audience_cli-ser-mpp","audience_cli-ser-nda_gms","audience_cli-ser-gsr-backend","audience_cli-ser-lic","audience_cli-ser-rfe","audience_cli-ser-cgr","audience_cli-ser-nda_ocrd","audience_cli-ser-sgf","audience_cli-ser-nda_pesd","audience_cli-ser-cuc","audience_cli-ser-rep","audience_cli-ser-dep-ouv","audience_cli-ser-rft","audience_cli-ser-cmo","audience_cli-ser-dep-sdcff","audience_cli-ser-avi","audience_cli-ser-cir","audience_cli-ser-aci","audience_cli-ser-mov","audience_cli-ser-aoc","audience_cli-ser-arj","audience_cli-ser-cql","audience_cli-ser-sib","audience_cli-ser-ecm","audience_cli-ser-gos","audience_cli-ser-pen","audience_cli-ser-apd","audience_cli-ser-dep-360","audience_cli-ser-nda_clid","audience_cli-ser-dep-genop","audience_cli-ser-cap-web","audience_cli-ser-inp","audience_cli-ser-spe","audience_cli-ser-png","audience_cli-ser-lcr","audience_cli-ser-sgc","audience_cli-ser-iad","audience_cli-ser-gcb","audience_cli-ser-cbs","audience_cli-ser-spx","audience_cli-ser-gct","audience_cli-ser-rex","audience_cli-ser-csu","audience_cli-ser-gip","audience_cli-ser-vir","audience_cli-ser-fes-mtr","audience_cli-ser-wic-apim","audience_cli-ser-nda_sid03","audience_cli-ser-nda_d09","audience_cli-ser-dro","audience_cli-ser-sme","audience_cli-ser-crb","audience_cli-ser-d03","audience_cli-ser-goc","audience_cli-ser-abm","audience_cli-ser-nbm","audience_cli-ser-dun","audience_cli-ser-nep","audience_cli-ser-pon-trava","audience_cli-ser-gta","audience_cli-ser-gpl","audience_cli-ser-atc","audience_cli-ser-ara","audience_cli-ser-x10","audience_cli-ser-bar","audience_cli-ser-vcc","audience_cli-ser-cdf","audience_cli-ser-caq","audience_cli-ser-aur","audience_cli-ser-epr","audience_cli-ser-dep-bdh","audience_cli-ser-aop","audience_cli-ser-ctd","audience_cli-ser-cft","audience_cli-ser-aoi","audience_cli-ser-obr","audience_cli-ser-cea","audience_cli-ser-nda_botd","audience_cli-ser-ipc-isd","audience_cli-ser-dep-pag","audience_cli-ser-contratos","audience_cli-ser-dep-sou","audience_cli-ser-nop","audience_cli-ser-nda_ofc","audience_cli-ser-opm","audience_cli-ser-x06","audience_cli-ser-caj_001","audience_cli-ser-per","audience_cli-ser-dpn","audience_cli-ser-acc-pxa","audience_cli-ser-tcs","audience_cli-ser-nda_frc","audience_cli-ser-apo","audience_cli-ser-hoj","audience_cli-ser-nda_ecmd","audience_cli-ser-atd","audience_cli-ser-wic-pesd","audience_cli-ser-rta","audience_cli-ser-rmc-marcas","audience_cli-ser-nda_atcd","Audience_cli-ser-bnc","audience_cli-ser-fcp","audience_cli-ser-dep-pld","audience_cli-ser-set-integra","audience_cli-ser-neb","audience_cli-ser-iav","audience_cli-ser-sph","audience_cli-ser-ipc","audience_cli-ser-fes","audience_cli-ser-lce","audience_cli-ser-mje","audience_cli-ser-ele","audience_cli-ser-gpf","audience_cli-ser-ncr-canais","audience_cli-ser-sns","audience_cli-ser-sfc","audience_cli-ser-trs","audience_cli-ser-sgr-intra","audience_cli-ser-vgl","audience_cli-ser-fdl","audience_cli-ser-erc","audience_cli-ser-spi-qrcode","audience_cli-ser-bbr","audience_cli-ser-mil","audience_cli-ser-pld","audience_cli-ser-crm","audience_cli-ser-mpl","audience_cli-ser-spb_tst","audience_cli-ser-smn","audience_cli-ser-ccv","audience_cli-ser-mpr","audience_cli-ser-sbg","audience_cli-ser-gpf-batch","audience_cli-ser-apf","audience_cli-ser-cfd","audience_cli-ser-nda_cacd","audience_cli-ser-caj","audience_cli-ser-aud","audience_cli-ser-pmc","audience_cli-ser-avd","audience_cli-ser-dep-vat","audience_cli-ser-gmc","audience_cli-ser-gbs","audience_cli-ser-ico","audience_cli-ser-mil-prc","audience_cli-ser-pag","audience_cli-ser-605","audience_cli-ser-mfi","audience_cli-ser-sdc","audience_cli-ser-dep-sufug-fgts-crm","audience_cli-ser-gic","audience_cli-ser-gsj","audience_cli-ser-int","audience_cli-ser-cgb","audience_cli-ser-na_d09d","audience_cli-ser-acc-convenios","audience_cli-ser-nda_pcsr","audience_cli-ser-acc","audience_cli-ser-deo","audience_cli-ser-qpe","audience_cli-ser-rur","audience_cli-ser-dep-epf","audience_cli-ser-alg","audience_cli-ser-pan","audience_cli-ser-nov","audience_cli-ser-gpn","audience_cli-ser-api-monitoracao","audience_cli-ser-adimplencia-dep","audience_cli-ser-aas","audience_cli-ser-exc","audience_cli-ser-gdd2","audience_cli-ser-ced","audience_cli-ser-fap","audience_cli-ser-smn-00","audience_cli-ser-sou","audience_cli-ser-sgr-profile","audience_cli-ser-mtx","audience_cli-ser-aff","audience_cli-ser-b2b","mp-desenrola-2.0-if","audience_cli-web-opl","audience_cli-ser-fec_api","audience_cli-ser-ead","audience_cli-ser-cco","audience_cli-ser-gec-com","audience_cli-ser-fec","audience_cli-ser-mtr-montreal","audience_cli-ser-acc-pix","audience_cli-ser-sra","audience_cli-ser-api","audience_cli-ser-efi","audience_cli-ser-don","audience_cli-ser-cvr","audience_cli-ser-fgg","audience_cli-ser-dep-sufug-ceemp","audience_cli-ser-cod","audience_cli-ser-dep-sufug-fgts-acessos","audience_cli-ser-pfi","audience_cli-ser-nda_gmsd","audience_cli-ser-wic-batch","audience_cli-ser-dis","audience_cli-ser-lis","audience_cli-ser-icd","audience_cli-ser-clb","audience_cli-ser-b2c","audience_cli-ser-lco","audience_cli-ser-clo","audience_cli-ser-epa","audience_cli-ser-rsa","audience_cli-ser-ipc-xid","audience_cli-ser-seq","audience_cli-ser-dep-iat","audience_cli-ser-dep-hoje","audience_cli-ser-dep-sufug-gerfu","audience_cli-ser-nda_ran","audience_cli-ser-apa","audience_cli-ser-pdd","audience_cli-ser-gcd","audience_cli-ser-alf","audience_cli-ser-nac","audience_cli-ser-cdt","audience_cli-ser-dce","audience_cli-ser-aef","audience_cli-ser-opl","audience_cli-ser-dev","audience_cli-ser-clg","audience_cli-ser-arg","audience_cli-ser-trr","audience_cli-ser-cld","audience_cli-ser-ncr","audience_cli-ser-gfp","audience_cli-ser-spl_jboss","audience_cli-ser-wfc","audience_cli-ser-avp","audience_cli-ser-iga","audience_cli-ser-cas","audience_cli-ser-sfw-teste","audience_cli-ser-bec","audience_cli-ser-acg_cip","audience_cli-ser-nda_pcse","audience_cli-ser-avo-gov","audience_cli-ser-pdc","audience_cli-ser-fin","audience_cli-ser-smn-10","audience_cli-ser-fep","audience_cli-ser-cac","audience_cli-ser-mtr","audience_cli-ser-ocr","audience_cli-ser-spl-atendimento","audience_cli-ser-ifx","audience_cli-ser-evj","audience_cli-ser-cfg","audience_cli-ser-autorh","audience_cli-ser-ach","audience_cli-ser-ags","audience_cli-ser-cet","audience_cli-ser-dep-sufug-fgts-tinegocios","audience_cli-ser-nda_simtr","audience_cli-ser-gdd","audience_cli-ser-ath-atendimento","audience_cli-ser-arq","audience_cli-ser-oba","audience_cli-ser-arr","audience_cli-ser-ago","audience_cli-ser-dep-sufug-ceret-indicadores","audience_cli-ser-alf-dep-opi","audience_cli-ser-nsh","audience_cli-ser-gms","audience_cli-ser-dcx","audience_cli-ser-ipc-novo","audience_cli-ser-wic","audience_cli-ser-pdm","audience_cli-ser-tma","audience_cli-ser-ifn","audience_cli-ser-nda_b24","audience_cli-ser-gcb-api","audience_cli-ser-sig","audience_cli-ser-dep-pju","audience_cli-ser-nda-flexd","audience_cli-ser-ceq-1","audience_cli-ser-fpp","audience_cli-ser-nrp","audience_cli-ser-otr","audience_cli-ser-tgv","audience_cli-ser-msc","audience_cli-ser-cve","tst_scope_opt","audience_cli-ser-aij","audience_cli-ser-dep-sufug-fgts-projetosti","audience_cli-ser-ati","audience_cli-ser-pbf","audience_cli-ser-spi","audience_cli-ser-nda_d09d","audience_cli-ser-mtr-bpm","audience_cli-ser-ife","audience_cli-ser-gcx","audience_cli-ser-gda","audience_cli-ser-fcg","audience_cli-ser-sgh","audience_cli-ser-pqv","audience_cli-ser-mtr-outsourcing","audience_cli-ser-tdf","audience_cli-ser-etl","audience_cli-ser-rff","audience_cli-ser-emp","audience_cli-ser-rpl","audience_cli-ser-dgc","audience_cli-ser-ehc","audience_cli-ser-cas_dep","audience_cli-ser-obs","audience_cli-ser-teste","audience_cli-ser-rin","audience_cli-ser-cpf","audience_cli-ser-agt","audience_cli-ser-pnl","audience_cli-ser-wpc-apis","audience_cli-ser-itl","audience_cli-ser-mcx","audience_cli-ser-agf","audience_cli-ser-pps","audience_cli-ser-nda_pes","audience_cli-ser-dmf_teste","audience_cli-ser-srh","audience_cli-wic-ser-pen","audience_cli-ser-dre","audience_cli-ser-ric","audience_cli-ser-gel","audience_cli-ser-pas","audience_cli-ser-pol","audience_cli-ser-azq","audience_cli-ser-gec-csc","audience_cli-ser-sun","audience_cli-ser-nda_mtrd","audience_cli-ser-mpd","audience_cli-ser-pdi","audience_cli-ser-igo","audience_cli-ser-bff","audience_cli-ser-dip","audience_cli-ser-gpd2","audience_cli-ser-pfb","audience_cli-ser-jks","audience_cli-ser-nda_mtr","audience_cli-ser-spb","audience_cli-ser-art","audience_cli-ser-dep-wfcv","audience_cli-ser-rmc","audience_cli-ser-avl","audience_cli-ser-connect-comex","audience_cli-ser-pix-tstprd","audience_cli-ser-fce","audience_cli-ser-fsa","audience_cli-ser-avs","audience_cli-ser-opi","audience_cli-ser-enc","audience_cli-ser-acc-api","audience_cli-ser-csd","audience_cli-ser-top-con","audience_cli-ser-ppg","audience_cli-ser-iso2","audience_cli-ser-rsp","audience_cli-ser-cow","audience_cli-ser-flow","audience_cli-ser-cid","audience_cli-ser-fge","audience_cli-ser-frs","audience_cli-ser-tch","audience_cli-ser-nda_rand","audience_cli-ser-asc","audience_cli-ser-pbs","audience_cli-ser-top","audience_cli-ser-ocg","audience_cli-ser-edd","audience_cli-ser-tae","audience_cli-ser-sei","audience_cli-ser-eti","mp-desenrola-2.0-trab","tst_scope_opt_2","audience_cli-ser-wic-fdeb","audience_cli-ser-dvi"],"request_parameter_supported":true,"request_uri_parameter_supported":true,"code_challenge_methods_supported":["plain","S256"],"tls_client_certificate_bound_access_tokens":true,"introspection_endpoint":"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token/introspect"}
2026-08-17 15:59:49,682 DEBUG [io.quarkus.oidc.runtime.OidcProviderClientImpl] (vert.x-eventloop-thread-1) Get verification JWT Key Set at https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/certs
2026-08-17 15:59:49,688 DEBUG [io.quarkus.oidc.runtime.OidcProviderClientImpl] (vert.x-eventloop-thread-1) Request succeeded: {"keys":[{"kid":"MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw","kty":"RSA","alg":"RS256","use":"sig","n":"zcYY_UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU-Ot-g1Pgwjze944ATUjZogEMko6jvqqUGTt_Nt64yCCIaMaTB119vOBExQim7vPHNe_o7hLxh6VBYINxFA_esxjz8j28_uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0--xfJ0jFYxQWs1jxhlfXdqr8NE5vfA_RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYw","e":"AQAB"}]}
2026-08-17 15:59:49,728 DEBUG [jdk.event.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:7e00000143ae5d3eeaa54228a8000000000143, Subject:CN=login.des.caixa, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Icptestes Sub, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:2048, Cert Id:3776494143, Valid from:6/4/24, 1:14?PM, Valid until:6/4/29, 1:24?PM
2026-08-17 15:59:49,729 DEBUG [jdk.event.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:600000000299b24b9d7901ea84000000000002, Subject:CN=AC Icptestes Sub, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:2447629493, Valid from:12/23/22, 12:47?PM, Valid until:12/23/42, 12:05?PM
2026-08-17 15:59:49,729 DEBUG [jdk.event.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:47b583ffce303b8047ba716d908e88d2, Subject:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:71683228, Valid from:12/23/22, 11:55?AM, Valid until:12/23/42, 12:05?PM
2026-08-17 15:59:49,730 DEBUG [jdk.event.security] (vert.x-eventloop-thread-1) ValidationChain: 2447629493, 3776494143
2026-08-17 15:59:49,735 DEBUG [jdk.event.security] (vert.x-eventloop-thread-1)  TLSHandshake: login.des.caixa:443, TLSv1.2, TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, 3776494143
2026-08-17 15:59:49,735 DEBUG [io.netty.handler.ssl.SslHandler] (vert.x-eventloop-thread-1) [id: 0xf4820f00, L:/25.1.18.132:51038 - R:login.des.caixa/10.116.81.74:443] HANDSHAKEN: protocol:TLSv1.2 cipher suite:TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256
2026-08-17 15:59:49,745 DEBUG [io.quarkus.oidc.common.runtime.OidcCommonUtils] (vert.x-eventloop-thread-1) Discovered OIDC metadata: {"issuer":"https://login.des.caixa/auth/realms/intranet","authorization_endpoint":"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/auth","token_endpoint":"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token","token_introspection_endpoint":"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token/introspect","userinfo_endpoint":"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/userinfo","end_session_endpoint":"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/logout","jwks_uri":"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/certs","check_session_iframe":"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/login-status-iframe.html","grant_types_supported":["authorization_code","implicit","refresh_token","password","client_credentials"],"response_types_supported":["code","none","id_token","token","id_token token","code id_token","code token","code id_token token"],"subject_types_supported":["public","pairwise"],"id_token_signing_alg_values_supported":["ES384","RS384","HS256","HS512","ES256","RS256","HS384","ES512","RS512"],"userinfo_signing_alg_values_supported":["ES384","RS384","HS256","HS512","ES256","RS256","HS384","ES512","RS512","none"],"request_object_signing_alg_values_supported":["ES384","RS384","ES256","RS256","ES512","RS512","none"],"response_modes_supported":["query","fragment","form_post"],"registration_endpoint":"https://login.des.caixa/auth/realms/intranet/clients-registrations/openid-connect","token_endpoint_auth_methods_supported":["private_key_jwt","client_secret_basic","client_secret_post","client_secret_jwt"],"token_endpoint_auth_signing_alg_values_supported":["RS256"],"claims_supported":["sub","iss","auth_time","name","given_name","family_name","preferred_username","email"],"claim_types_supported":["normal"],"claims_parameter_supported":false,"scopes_supported":["openid","profile","email","address","phone","offline_access","roles","web-origins","audience_cli-ser-nda","webhook.write","payloadlocation.write","manterImovel","consultarSimulacao","lotecobv.read","pix.read","audience_cli-ser-sgr","cob.write","cob.read","cobv.read","lotecobv.write","pix.write","payloadlocation.read","webhook.read","pld","cobv.write","consultarParametros","audience_cli-ser-cli","acessoIrrestrito","realizarSimulacao","segmento_sistema","instituicao_financeira","audience_cli-ser-set","audience_cli-ser-aic","agente_moradia","operacao_fiduciaria","cobr.write","payloadlocationrec.read","solicrec.write","payloadlocationrec.write","webhookrec.write","pixautomatico.read","acessoAdministracao","audience_cli-ser-d01","audience_cli-ser-mtc","audience_cli-ser-spl","audience_cli-ser-ibc","audience_cli-ser-dep-mmi","audience_cli-ser-wic-pes","audience_cli-ser-sem","audience_cli-ser-mpg","audience_cli-ser-ouv","audience_cli-ser-x04","audience_cli-ser-gro","audience_cli-ser-sde2","audience_cli-ser-don_teste","audience_cli-ser-naf","audience_cli-ser-abe","audience_cli-ser-acx","audience_cli-ser-ptn","audience_cli-ser-fug","audience_cli-ser-gel_novo","audience_cli-ser-tkn","audience_cli-ser-alc","audience_cli-ser-pnc","audience_cli-ser-brj","audience_cli-ser-itx","audience_cli-ser-apc","audience_cli-ser-agf-dados","audience_cli-ser-atr","audience_cli-ser-gce","audience_cli-ser-nda_avld","audience_cli-ser-rfo","audience_cli-ser-bko","audience_cli-ser-gsr","audience_cli-ser-pgp","audience_cli-ser-fgd","audience_cli-ser-gec","audience_cli-ser-pab","audience_cli-ser-sag","audience_cli-ser-nbc","audience_cli-ser-cvo","audience_cli-ser-mcn","audience_cli-ser-ccr","audience_cli-ser-voc","audience_cli-ser-sam","audience_cli-ser-mtr-val","audience_cli-ser-api-sgh","econsignado-fgts","solicrec.read","audience_cli-ser-gfa","instituicao_reformas","audience_cli-ser-aaf","audience_cli-ser-got","audience_cli-ser-nch","audience_cli-ser-ppm","audience_cli-ser-acg","audience_cli-ser-gdu","audience_cli-ser-dep-mif","audience_cli-ser-gam","audience_cli-ser-dep-guardiao","audience_cli-ser-ng","audience_cli-ser-vit","audience_cli-ser-com","audience_cli-ser-red","audience_cli-ser-pcs","audience_cli-web-avl","acessoConstrutoras","conformidade","sitrr","webhookrec.read","pixautomatico.write","audience_cli-ser-nda_gtl","audience_cli-ser-dmf","audience_cli-ser-pah","audience_cli-ser-ana","audience_cli-ser-gpd","audience_cli-ser-acm","audience_cli-ser-sde","audience_cli-ser-nda_icod","audience_cli-ser-mtr-flexdoc","audience_cli-ser-nda_perd","audience_cli-ser-cdc","audience_cli-ser-mai","audience_cli-ser-crd","audience_cli-ser-dep-sufug-fgts-servicos","audience_cli-ser-cap","audience_cli-ser-iso","Audience_cli-ser-cpl","audience_cli-ser-nda_cac","audience_cli-ser-gpi","audience_cli-ser-gpd1","audience_cli-ser-gec-opf","audience_cli-ser-ri","audience_cli-ser-nda_out","audience_cli-ser-spl-captacao","audience_cli-ser-bpm","audience_cli-ser-spf","audience_cli-ser-bot","audience_cli-ser-avo","audience_cli-ser-ipv","audience_cli-ser-spl-lotericas","audience_cli-ser-cbp","audience_cli-ser-bsa","audience_cli-ser-dep-sufug-fgts","audience_cli-ser-gvc","audience_cli-ser-npc","audience_cli-ser-gts","audience_cli-ser-mkt","audience_cli-ser-iag","audience_cli-ser-idx","audience_cli-ser-bar-catalogo","audience_cli-ser-crf","audience_cli-ser-sfg","audience_cli-ser-wpc","audience_cli-ser-mpi","audience_cli-ser-api-geate","audience_cli-ser-nda_pcs","audience_cli-ser-seg","audience_cli-ser-gcn","audience_cli-ser-dun_sgf","audience_cli-ser-jur-com","audience_cli-ser-d02","audience_cli-ser-dcn","audience_cli-ser-ran","audience_cli-ser-mil-precificacao-api","audience_cli-ser-ceh","audience_cli-ser-wic-pen","audience_cli-ser-gdf","audience_cli-ser-afs","audience_cli-ser-dun2","snd","convenio","webhookcobr.read","rec.write","rec.read","cobr.read","webhookcobr.write","scope:api_a","scope:api_b","audience_cli-ser-smn-05","audience_cli-ser-gal","audience_cli-ser-tax-api","audience_cli-ser-nda_ctdd","audience_cli-ser-cpc","audience_cli-ser-nda_pcsd","audience_cli-ser-saq","audience_cli-ser-x02","audience_cli-ser-gde","audience_cli-ser-iac","audience_cli-ser-jur","audience_cli-ser-pcl_bpm","audience_cli-ser-bem","audience_cli-ser-gai","audience_cli-ser-mtr-credmei","audience_cli-ser-dmp","audience_cli-ser-hab","audience_cli-ser-b24","audience_cli-ser-pge","audience_cli-ser-ath","audience_cli-ser-mpp","audience_cli-ser-nda_gms","audience_cli-ser-gsr-backend","audience_cli-ser-lic","audience_cli-ser-rfe","audience_cli-ser-cgr","audience_cli-ser-nda_ocrd","audience_cli-ser-sgf","audience_cli-ser-nda_pesd","audience_cli-ser-cuc","audience_cli-ser-rep","audience_cli-ser-dep-ouv","audience_cli-ser-rft","audience_cli-ser-cmo","audience_cli-ser-dep-sdcff","audience_cli-ser-avi","audience_cli-ser-cir","audience_cli-ser-aci","audience_cli-ser-mov","audience_cli-ser-aoc","audience_cli-ser-arj","audience_cli-ser-cql","audience_cli-ser-sib","audience_cli-ser-ecm","audience_cli-ser-gos","audience_cli-ser-pen","audience_cli-ser-apd","audience_cli-ser-dep-360","audience_cli-ser-nda_clid","audience_cli-ser-dep-genop","audience_cli-ser-cap-web","audience_cli-ser-inp","audience_cli-ser-spe","audience_cli-ser-png","audience_cli-ser-lcr","audience_cli-ser-sgc","audience_cli-ser-iad","audience_cli-ser-gcb","audience_cli-ser-cbs","audience_cli-ser-spx","audience_cli-ser-gct","audience_cli-ser-rex","audience_cli-ser-csu","audience_cli-ser-gip","audience_cli-ser-vir","audience_cli-ser-fes-mtr","audience_cli-ser-wic-apim","audience_cli-ser-nda_sid03","audience_cli-ser-nda_d09","audience_cli-ser-dro","audience_cli-ser-sme","audience_cli-ser-crb","audience_cli-ser-d03","audience_cli-ser-goc","audience_cli-ser-abm","audience_cli-ser-nbm","audience_cli-ser-dun","audience_cli-ser-nep","audience_cli-ser-pon-trava","audience_cli-ser-gta","audience_cli-ser-gpl","audience_cli-ser-atc","audience_cli-ser-ara","audience_cli-ser-x10","audience_cli-ser-bar","audience_cli-ser-vcc","audience_cli-ser-cdf","audience_cli-ser-caq","audience_cli-ser-aur","audience_cli-ser-epr","audience_cli-ser-dep-bdh","audience_cli-ser-aop","audience_cli-ser-ctd","audience_cli-ser-cft","audience_cli-ser-aoi","audience_cli-ser-obr","audience_cli-ser-cea","audience_cli-ser-nda_botd","audience_cli-ser-ipc-isd","audience_cli-ser-dep-pag","audience_cli-ser-contratos","audience_cli-ser-dep-sou","audience_cli-ser-nop","audience_cli-ser-nda_ofc","audience_cli-ser-opm","audience_cli-ser-x06","audience_cli-ser-caj_001","audience_cli-ser-per","audience_cli-ser-dpn","audience_cli-ser-acc-pxa","audience_cli-ser-tcs","audience_cli-ser-nda_frc","audience_cli-ser-apo","audience_cli-ser-hoj","audience_cli-ser-nda_ecmd","audience_cli-ser-atd","audience_cli-ser-wic-pesd","audience_cli-ser-rta","audience_cli-ser-rmc-marcas","audience_cli-ser-nda_atcd","Audience_cli-ser-bnc","audience_cli-ser-fcp","audience_cli-ser-dep-pld","audience_cli-ser-set-integra","audience_cli-ser-neb","audience_cli-ser-iav","audience_cli-ser-sph","audience_cli-ser-ipc","audience_cli-ser-fes","audience_cli-ser-lce","audience_cli-ser-mje","audience_cli-ser-ele","audience_cli-ser-gpf","audience_cli-ser-ncr-canais","audience_cli-ser-sns","audience_cli-ser-sfc","audience_cli-ser-trs","audience_cli-ser-sgr-intra","audience_cli-ser-vgl","audience_cli-ser-fdl","audience_cli-ser-erc","audience_cli-ser-spi-qrcode","audience_cli-ser-bbr","audience_cli-ser-mil","audience_cli-ser-pld","audience_cli-ser-crm","audience_cli-ser-mpl","audience_cli-ser-spb_tst","audience_cli-ser-smn","audience_cli-ser-ccv","audience_cli-ser-mpr","audience_cli-ser-sbg","audience_cli-ser-gpf-batch","audience_cli-ser-apf","audience_cli-ser-cfd","audience_cli-ser-nda_cacd","audience_cli-ser-caj","audience_cli-ser-aud","audience_cli-ser-pmc","audience_cli-ser-avd","audience_cli-ser-dep-vat","audience_cli-ser-gmc","audience_cli-ser-gbs","audience_cli-ser-ico","audience_cli-ser-mil-prc","audience_cli-ser-pag","audience_cli-ser-605","audience_cli-ser-mfi","audience_cli-ser-sdc","audience_cli-ser-dep-sufug-fgts-crm","audience_cli-ser-gic","audience_cli-ser-gsj","audience_cli-ser-int","audience_cli-ser-cgb","audience_cli-ser-na_d09d","audience_cli-ser-acc-convenios","audience_cli-ser-nda_pcsr","audience_cli-ser-acc","audience_cli-ser-deo","audience_cli-ser-qpe","audience_cli-ser-rur","audience_cli-ser-dep-epf","audience_cli-ser-alg","audience_cli-ser-pan","audience_cli-ser-nov","audience_cli-ser-gpn","audience_cli-ser-api-monitoracao","audience_cli-ser-adimplencia-dep","audience_cli-ser-aas","audience_cli-ser-exc","audience_cli-ser-gdd2","audience_cli-ser-ced","audience_cli-ser-fap","audience_cli-ser-smn-00","audience_cli-ser-sou","audience_cli-ser-sgr-profile","audience_cli-ser-mtx","audience_cli-ser-aff","audience_cli-ser-b2b","mp-desenrola-2.0-if","audience_cli-web-opl","audience_cli-ser-fec_api","audience_cli-ser-ead","audience_cli-ser-cco","audience_cli-ser-gec-com","audience_cli-ser-fec","audience_cli-ser-mtr-montreal","audience_cli-ser-acc-pix","audience_cli-ser-sra","audience_cli-ser-api","audience_cli-ser-efi","audience_cli-ser-don","audience_cli-ser-cvr","audience_cli-ser-fgg","audience_cli-ser-dep-sufug-ceemp","audience_cli-ser-cod","audience_cli-ser-dep-sufug-fgts-acessos","audience_cli-ser-pfi","audience_cli-ser-nda_gmsd","audience_cli-ser-wic-batch","audience_cli-ser-dis","audience_cli-ser-lis","audience_cli-ser-icd","audience_cli-ser-clb","audience_cli-ser-b2c","audience_cli-ser-lco","audience_cli-ser-clo","audience_cli-ser-epa","audience_cli-ser-rsa","audience_cli-ser-ipc-xid","audience_cli-ser-seq","audience_cli-ser-dep-iat","audience_cli-ser-dep-hoje","audience_cli-ser-dep-sufug-gerfu","audience_cli-ser-nda_ran","audience_cli-ser-apa","audience_cli-ser-pdd","audience_cli-ser-gcd","audience_cli-ser-alf","audience_cli-ser-nac","audience_cli-ser-cdt","audience_cli-ser-dce","audience_cli-ser-aef","audience_cli-ser-opl","audience_cli-ser-dev","audience_cli-ser-clg","audience_cli-ser-arg","audience_cli-ser-trr","audience_cli-ser-cld","audience_cli-ser-ncr","audience_cli-ser-gfp","audience_cli-ser-spl_jboss","audience_cli-ser-wfc","audience_cli-ser-avp","audience_cli-ser-iga","audience_cli-ser-cas","audience_cli-ser-sfw-teste","audience_cli-ser-bec","audience_cli-ser-acg_cip","audience_cli-ser-nda_pcse","audience_cli-ser-avo-gov","audience_cli-ser-pdc","audience_cli-ser-fin","audience_cli-ser-smn-10","audience_cli-ser-fep","audience_cli-ser-cac","audience_cli-ser-mtr","audience_cli-ser-ocr","audience_cli-ser-spl-atendimento","audience_cli-ser-ifx","audience_cli-ser-evj","audience_cli-ser-cfg","audience_cli-ser-autorh","audience_cli-ser-ach","audience_cli-ser-ags","audience_cli-ser-cet","audience_cli-ser-dep-sufug-fgts-tinegocios","audience_cli-ser-nda_simtr","audience_cli-ser-gdd","audience_cli-ser-ath-atendimento","audience_cli-ser-arq","audience_cli-ser-oba","audience_cli-ser-arr","audience_cli-ser-ago","audience_cli-ser-dep-sufug-ceret-indicadores","audience_cli-ser-alf-dep-opi","audience_cli-ser-nsh","audience_cli-ser-gms","audience_cli-ser-dcx","audience_cli-ser-ipc-novo","audience_cli-ser-wic","audience_cli-ser-pdm","audience_cli-ser-tma","audience_cli-ser-ifn","audience_cli-ser-nda_b24","audience_cli-ser-gcb-api","audience_cli-ser-sig","audience_cli-ser-dep-pju","audience_cli-ser-nda-flexd","audience_cli-ser-ceq-1","audience_cli-ser-fpp","audience_cli-ser-nrp","audience_cli-ser-otr","audience_cli-ser-tgv","audience_cli-ser-msc","audience_cli-ser-cve","tst_scope_opt","audience_cli-ser-aij","audience_cli-ser-dep-sufug-fgts-projetosti","audience_cli-ser-ati","audience_cli-ser-pbf","audience_cli-ser-spi","audience_cli-ser-nda_d09d","audience_cli-ser-mtr-bpm","audience_cli-ser-ife","audience_cli-ser-gcx","audience_cli-ser-gda","audience_cli-ser-fcg","audience_cli-ser-sgh","audience_cli-ser-pqv","audience_cli-ser-mtr-outsourcing","audience_cli-ser-tdf","audience_cli-ser-etl","audience_cli-ser-rff","audience_cli-ser-emp","audience_cli-ser-rpl","audience_cli-ser-dgc","audience_cli-ser-ehc","audience_cli-ser-cas_dep","audience_cli-ser-obs","audience_cli-ser-teste","audience_cli-ser-rin","audience_cli-ser-cpf","audience_cli-ser-agt","audience_cli-ser-pnl","audience_cli-ser-wpc-apis","audience_cli-ser-itl","audience_cli-ser-mcx","audience_cli-ser-agf","audience_cli-ser-pps","audience_cli-ser-nda_pes","audience_cli-ser-dmf_teste","audience_cli-ser-srh","audience_cli-wic-ser-pen","audience_cli-ser-dre","audience_cli-ser-ric","audience_cli-ser-gel","audience_cli-ser-pas","audience_cli-ser-pol","audience_cli-ser-azq","audience_cli-ser-gec-csc","audience_cli-ser-sun","audience_cli-ser-nda_mtrd","audience_cli-ser-mpd","audience_cli-ser-pdi","audience_cli-ser-igo","audience_cli-ser-bff","audience_cli-ser-dip","audience_cli-ser-gpd2","audience_cli-ser-pfb","audience_cli-ser-jks","audience_cli-ser-nda_mtr","audience_cli-ser-spb","audience_cli-ser-art","audience_cli-ser-dep-wfcv","audience_cli-ser-rmc","audience_cli-ser-avl","audience_cli-ser-connect-comex","audience_cli-ser-pix-tstprd","audience_cli-ser-fce","audience_cli-ser-fsa","audience_cli-ser-avs","audience_cli-ser-opi","audience_cli-ser-enc","audience_cli-ser-acc-api","audience_cli-ser-csd","audience_cli-ser-top-con","audience_cli-ser-ppg","audience_cli-ser-iso2","audience_cli-ser-rsp","audience_cli-ser-cow","audience_cli-ser-flow","audience_cli-ser-cid","audience_cli-ser-fge","audience_cli-ser-frs","audience_cli-ser-tch","audience_cli-ser-nda_rand","audience_cli-ser-asc","audience_cli-ser-pbs","audience_cli-ser-top","audience_cli-ser-ocg","audience_cli-ser-edd","audience_cli-ser-tae","audience_cli-ser-sei","audience_cli-ser-eti","mp-desenrola-2.0-trab","tst_scope_opt_2","audience_cli-ser-wic-fdeb","audience_cli-ser-dvi"],"request_parameter_supported":true,"request_uri_parameter_supported":true,"code_challenge_methods_supported":["plain","S256"],"tls_client_certificate_bound_access_tokens":true,"introspection_endpoint":"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token/introspect"}
2026-08-17 15:59:49,747 DEBUG [io.quarkus.oidc.runtime.OidcProviderClientImpl] (vert.x-eventloop-thread-1) Get verification JWT Key Set at https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/certs
2026-08-17 15:59:49,750 DEBUG [io.quarkus.oidc.runtime.OidcProviderClientImpl] (vert.x-eventloop-thread-1) Request succeeded: {"keys":[{"kid":"MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw","kty":"RSA","alg":"RS256","use":"sig","n":"zcYY_UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU-Ot-g1Pgwjze944ATUjZogEMko6jvqqUGTt_Nt64yCCIaMaTB119vOBExQim7vPHNe_o7hLxh6VBYINxFA_esxjz8j28_uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0--xfJ0jFYxQWs1jxhlfXdqr8NE5vfA_RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYw","e":"AQAB"}]}
2026-08-17 15:59:49,759 DEBUG [io.quarkus.hibernate.reactive.runtime.FastBootHibernateReactivePersistenceProvider] (JPA Startup Thread) Located 1 persistence units; checking each
2026-08-17 15:59:49,760 DEBUG [io.quarkus.hibernate.reactive.runtime.FastBootHibernateReactivePersistenceProvider] (JPA Startup Thread) Checking persistence-unit [name=<default>, explicit-provider=null] against incoming persistence unit name [<default>]
2026-08-17 15:59:49,761 DEBUG [io.quarkus.hibernate.orm.runtime.FastBootHibernatePersistenceProvider] (JPA Startup Thread) No PersistenceProvider explicitly requested, assuming Hibernate
2026-08-17 15:59:50,648 DEBUG [org.hibernate.orm.jdbc.lob] (JPA Startup Thread) HHH10010002: Disabling contextual LOB creation as connection was null
2026-08-17 15:59:50,649 DEBUG [org.hibernate.orm.jdbc] (JPA Startup Thread) HHH100122: Using default JDBC fetch size: -1
2026-08-17 15:59:50,650 DEBUG [org.hibernate.reactive.provider.service.NativeParametersHandling] (JPA Startup Thread) Initializing service JdbcParameterRenderer with implementation: class org.hibernate.sql.ast.internal.ParameterMarkerStrategyStandard
2026-08-17 15:59:50,751 DEBUG [org.hibernate.orm.factory] (JPA Startup Thread) HHH90020001: Instantiating factory [e7146495-a9b1-4340-867b-804c8e401480] with settings: {jakarta.persistence.validation.mode=AUTO, hibernate.hbm2ddl.schema-generation.script.append=false, hibernate.connection.handling_mode=DELAYED_ACQUISITION_AND_RELEASE_BEFORE_TRANSACTION_COMPLETION, jakarta.persistence.sql-load-script-source=null, hibernate.cache.use_query_cache=true, hibernate.xml_mapping_enabled=false, jakarta.persistence.database-product-name=Oracle, hibernate.hbm2ddl.charset_name=UTF-8, hibernate.query.plan_cache_max_size=2048, hibernate.id.sequence.increment_size_mismatch_strategy=NONE, hibernate.hbm2ddl.skip_default_import_file=true, jakarta.persistence.sharedCache.mode=ENABLE_SELECTIVE, hibernate.id.optimizer.pooled.preferred=pooled-lo, org.hibernate.flushMode=AUTO, jakarta.persistence.create-database-schemas=false, hibernate.query.fail_on_pagination_over_collection_fetch=false, hibernate.order_updates=true, hibernate.order_by.default_null_ordering=none, jakarta.persistence.schema-generation.scripts.action=none, hibernate.allow_update_outside_transaction=false, hibernate.cdi.extensions=false, hibernate.boot.allow_jdbc_metadata_access=true, hibernate.cache.use_reference_entries=true, hibernate.persistenceUnitName=<default>, hibernate.cache.use_second_level_cache=true, hibernate.query.in_clause_parameter_padding=true, hibernate.transaction.coordinator_class=class org.hibernate.resource.transaction.backend.jdbc.internal.JdbcResourceLocalTransactionCoordinatorBuilderImpl, hibernate.discriminator.ignore_explicit_for_joined=false, hibernate.type.json_format_mapper=org.hibernate.type.format.jackson.JacksonJsonFormatMapper@286d1f19, hibernate.connection.provider_disables_autocommit=true, hibernate.cache.region.factory_class=org.infinispan.quarkus.hibernate.cache.QuarkusInfinispanRegionFactory, jakarta.persistence.schema-generation.database.action=none, jakarta.persistence.database-product-version=null}
2026-08-17 15:59:50,755 DEBUG [org.infinispan.quarkus.hibernate.cache.QuarkusInfinispanRegionFactory] (JPA Startup Thread) Starting Infinispan region factory
2026-08-17 15:59:50,757 DEBUG [org.infinispan.quarkus.hibernate.cache.QuarkusInfinispanRegionFactory] (JPA Startup Thread) Building timestamps cache region [default-update-timestamps-region]
2026-08-17 15:59:50,770 DEBUG [org.infinispan.quarkus.hibernate.cache.QuarkusInfinispanRegionFactory] (JPA Startup Thread) Building query results cache region [default-query-results-region]
2026-08-17 15:59:50,813 DEBUG [org.hibernate.orm.service] (JPA Startup Thread) HHH010454: EventListenerRegistry access via ServiceRegistry is deprecated - use 'sessionFactory.getEventEngine().getListenerRegistry()' instead
2026-08-17 15:59:50,844 DEBUG [org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator] (JPA Startup Thread) No schema actions specified for contributor 'orm'
2026-08-17 15:59:50,965 DEBUG [org.hibernate.HQL_FUNCTIONS] (JPA Startup Thread) Available HQL Functions:
	abs(NUMERIC arg)
	Double acos(NUMERIC arg)
	add_months(DATE datetime, INTEGER months)
	Boolean any(BOOLEAN arg)
	array( ... )
	array_agg(arg)
	array_append( ... )
	array_concat( ... )
	Boolean array_contains(ARRAY haystackArray, OBJECT needleElementOrArray)
	Boolean array_contains_nullable(ARRAY haystackArray, OBJECT needleElementOrArray)
	array_fill(OBJECT element, INTEGER elementCount)
	array_fill_list(OBJECT element, INTEGER elementCount)
	array_get( ... )
	Boolean array_includes(ARRAY haystackArray, OBJECT needleArray)
	Boolean array_includes_nullable(ARRAY haystackArray, OBJECT needleArray)
	Boolean array_intersects(ARRAY array0, OBJECT array1)
	Boolean array_intersects_nullable(ARRAY array0, OBJECT array1)
	Integer array_length(ARRAY array)
	array_list( ... )
	Boolean array_overlaps(ARRAY array0, OBJECT array1)
	Boolean array_overlaps_nullable(ARRAY array0, OBJECT array1)
	Integer array_position(ARRAY array, OBJECT element[, INTEGER startPosition])
	int[] array_positions(ARRAY array, OBJECT element)
	List array_positions_list(ARRAY array, OBJECT element)
	array_prepend( ... )
	array_remove( ... )
	array_remove_index( ... )
	array_replace( ... )
	array_set( ... )
	array_slice( ... )
	String array_to_string( ... )
	array_trim( ... )
	Integer ascii(STRING arg)
	Double asin(NUMERIC arg)
	Double atan(NUMERIC arg)
	Double atan2(NUMERIC arg0, NUMERIC arg1)
	avg(arg)
	Integer bit_length(STRING_OR_CLOB arg)
	bitand(arg0, arg1)
	bitor(arg0, arg1)
	bitxor(arg0, arg1)
	cast(arg as Type)
	ceil(NUMERIC arg)
	ceiling(NUMERIC arg)
	Character char(INTEGER arg)
	Integer character_length(STRING_OR_CLOB arg)
	Character chr(INTEGER arg)
	coalesce(arg0[, arg1[, ...]])
	String collate(STRING string as COLLATION collation)
	String concat(STRING string0[, STRING string1[, ...]])
	Double corr(NUMERIC arg0, NUMERIC arg1)
	Double cos(NUMERIC arg)
	Double cosh(NUMERIC arg)
	Long count([distinct ]{arg|*})
	Double covar_pop(NUMERIC arg0, NUMERIC arg1)
	Double covar_samp(NUMERIC arg0, NUMERIC arg1)
	Double cume_dist([arg0[, ...]])
	Date current date
	Time current time
	Timestamp current timestamp
	Date current_date
	Instant current_instant
	Time current_time
	Timestamp current_timestamp
	dateadd(TEMPORAL_UNIT field, INTEGER magnitude, TEMPORAL datetime)
	Long|Double datediff(TEMPORAL_UNIT field, TEMPORAL start, TEMPORAL end)
	Double degrees(NUMERIC arg)
	Long dense_rank([arg0[, ...]])
	Boolean every(BOOLEAN arg)
	Double exp(NUMERIC arg)
	extract(TEMPORAL_UNIT field from TEMPORAL arg)
	first_valueANY value
	floor(NUMERIC arg)
	String format(TEMPORAL datetime as STRING pattern)
	greatest(COMPARABLE arg0, COMPARABLE arg1[, arg2[, ...]])
	String hex(arg)
	ifnull(arg0, arg1)
	String initcap(arg)
	Instant instant
	Integer instr(STRING string, STRING pattern[, INTEGER start[, INTEGER occurrence]])
	String json_array([arg0[, ...]])
	String json_array_append(IMPLICIT_JSON arg0, STRING arg1, ANY arg2)
	String json_array_insert(IMPLICIT_JSON arg0, STRING arg1, ANY arg2)
	String json_arrayagg(arg0[, arg1])
	Boolean json_exists(IMPLICIT_JSON arg0, STRING arg1)
	String json_insert(IMPLICIT_JSON arg0, STRING arg1, ANY arg2)
	String json_mergepatch(IMPLICIT_JSON arg0, IMPLICIT_JSON arg1[, arg2[, ...]])
	String json_object( ... )
	String json_objectagg(arg0, arg1[, arg2, arg3])
	String json_query( ... )
	String json_remove(IMPLICIT_JSON arg0, STRING arg1)
	String json_replace(IMPLICIT_JSON arg0, STRING arg1, ANY arg2)
	String json_set(IMPLICIT_JSON arg0, STRING arg1, ANY arg2)
	json_value( ... )
	lagANY value[, INTEGER offset[, ANY default]]
	Date last_day(DATE arg)
	last_valueANY value
	leadANY value[, INTEGER offset[, ANY default]]
	least(COMPARABLE arg0, COMPARABLE arg1[, arg2[, ...]])
	String left(STRING string, INTEGER length)
	length
	String listagg(STRING arg0, STRING arg1)
	Double ln(NUMERIC arg)
	LocalDate local date
	LocalDateTime local datetime
	LocalTime local time
	LocalDate local_date
	LocalDateTime local_datetime
	LocalTime local_time
	Integer locate(pattern, string[, start])
	Double log(NUMERIC arg0[, NUMERIC arg1])
	Double log10(NUMERIC arg)
	String lower(STRING string)
	String lpad(STRING string, INTEGER length[, STRING padding])
	String ltrim(STRING string[, STRING characters])
	max(COMPARABLE arg)
	byte[] md5(arg)
	Double median(NUMERIC arg)
	min(COMPARABLE arg)
	Integer mod(INTEGER arg0, INTEGER arg1)
	mode()
	Integer months_between(DATE end, DATE start)
	nth_valueANY value, INTEGER nth
	nullif(arg0, arg1)
	Integer octet_length(STRING_OR_CLOB arg)
	OffsetDateTime offset datetime
	OffsetDateTime offset_datetime
	Integer ordinal(ENUM arg)
	String overlay(STRING string placing STRING replacement from INTEGER start[ for INTEGER length])
	String pad(STRING string with INTEGER length {leading|trailing}[ STRING character])
	Double percent_rank([arg0[, ...]])
	percentile_cont(NUMERIC arg)
	percentile_disc(NUMERIC arg)
	Double pi
	Integer position(STRING pattern in STRING string)
	Double power(NUMERIC arg0, NUMERIC arg1)
	Double radians(NUMERIC arg)
	Long rank([arg0[, ...]])
	(STRING string, STRING pattern[, STRING flags])
	Double regr_avgx(NUMERIC arg0, NUMERIC arg1)
	Double regr_avgy(NUMERIC arg0, NUMERIC arg1)
	Double regr_count(NUMERIC arg0, NUMERIC arg1)
	Double regr_intercept(NUMERIC arg0, NUMERIC arg1)
	Double regr_r2(NUMERIC arg0, NUMERIC arg1)
	Double regr_slope(NUMERIC arg0, NUMERIC arg1)
	Double regr_sxx(NUMERIC arg0, NUMERIC arg1)
	Double regr_sxy(NUMERIC arg0, NUMERIC arg1)
	Double regr_syy(NUMERIC arg0, NUMERIC arg1)
	String repeat(STRING string, INTEGER times)
	String replace(STRING string, STRING pattern, STRING replacement)
	String right(STRING string, INTEGER length)
	round(NUMERIC number[, INTEGER places])
	Long row_number()
	Long rowid
	Long rownum
	String rpad(STRING string, INTEGER length[, STRING padding])
	String rtrim(STRING string[, STRING characters])
	byte[] sha(arg)
	Integer sign(NUMERIC arg)
	Double sin(NUMERIC arg)
	Double sinh(NUMERIC arg)
	String soundex(arg)
	sql
	Double sqrt(NUMERIC arg)
	Double stddev(NUMERIC arg)
	Double stddev_pop(NUMERIC arg)
	Double stddev_samp(NUMERIC arg)
	String str(arg)
	String string(ENUM arg)
	String substr(STRING string, INTEGER start[, INTEGER length])
	String substring(STRING string{ from|,} INTEGER start[{ for|,} INTEGER length])
	sum(arg)
	Timestamp sysdate
	Timestamp systimestamp
	Double tan(NUMERIC arg)
	Double tanh(NUMERIC arg)
	timestampadd(TEMPORAL_UNIT field, INTEGER magnitude, TEMPORAL datetime)
	Long|Double timestampdiff(TEMPORAL_UNIT field, TEMPORAL start, TEMPORAL end)
	String to_char(ANY arg0[, STRING arg1, STRING arg2])
	Date to_date(STRING arg0[, STRING arg1, STRING arg2])
	Double to_number(STRING arg0[, STRING arg1, STRING arg2])
	Timestamp to_timestamp(STRING arg0[, STRING arg1, STRING arg2])
	String translate(STRING arg0, STRING arg1, STRING arg2)
	String trim([[{leading|trailing|both} ][STRING arg0 ]from] STRING arg1)
	trunc( ... )
	truncate( ... )
	String upper(STRING string)
	Double var_pop(NUMERIC arg)
	Double var_samp(NUMERIC arg)
	Double variance(NUMERIC arg)
	String xmlagg( ... )
	String xmlcomment(STRING arg)
	String xmlconcat( ... )
	String xmlelement( ... )
	Boolean xmlexists( ... )
	String xmlforest( ... )
	String xmlpi( ... )
	String xmlquery( ... )

2026-08-17 15:59:51,236 INFO  [org.hibernate.orm.core] (JPA Startup Thread) HHH000182: No default (no-argument) constructor for class [br.com.sisgh.link.entity.RequisicaoEntity] (class must be instantiated by Interceptor)
2026-08-17 15:59:51,455 DEBUG [org.hibernate.orm.service] (JPA Startup Thread) HHH010454: EventListenerRegistry access via ServiceRegistry is deprecated - use 'sessionFactory.getEventEngine().getListenerRegistry()' instead
2026-08-17 15:59:51,456 DEBUG [org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator] (JPA Startup Thread) No schema actions specified for contributor 'orm'
2026-08-17 15:59:51,456 DEBUG [org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator] (JPA Startup Thread) No schema management actions found
2026-08-17 15:59:51,571 INFO  [io.quarkus] (main) sisgh-link 3.0.0-SNAPSHOT on JVM (powered by Quarkus 3.33.1) started in 6.842s. Listening on: http://0.0.0.0:8080
2026-08-17 15:59:51,571 INFO  [io.quarkus] (main) Profile dev activated. 
2026-08-17 15:59:51,571 INFO  [io.quarkus] (main) Installed features: [cdi, hibernate-orm, hibernate-reactive, hibernate-reactive-panache, hibernate-validator, jdbc-oracle, oidc, oidc-client, reactive-oracle-client, rest, rest-client, rest-client-jackson, rest-client-oidc-filter, rest-jackson, security, smallrye-context-propagation, smallrye-health, smallrye-jwt, smallrye-openapi, swagger-ui, vertx]
2026-08-17 16:00:44,680 DEBUG [java.lang.ProcessBuilder] (PerformanceCounterContainer-0) ProcessBuilder.start(): pid: 161, dir: null, cmd: "/sbin/ldconfig": java.lang.RuntimeException: ProcessBuilder.start() debug
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
	at oshi.software.os.linux.LinuxOperatingSystem.<clinit>(LinuxOperatingSystem.java:93)
	at oshi.SystemInfo.createOperatingSystem(SystemInfo.java:85)
	at oshi.util.Memoizer$1.get(Memoizer.java:65)
	at oshi.SystemInfo.getOperatingSystem(SystemInfo.java:76)
	at com.microsoft.applicationinsights.agent.internal.perfcounter.OshiPerformanceCounter.report(OshiPerformanceCounter.java:47)
	at com.microsoft.applicationinsights.agent.internal.perfcounter.PerformanceCounterContainer$1.run(PerformanceCounterContainer.java:131)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:358)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

2026-08-17 16:00:44,701 DEBUG [java.lang.ProcessBuilder] (PerformanceCounterContainer-0) ProcessBuilder.start(): pid: 164, dir: null, cmd: "uname": java.lang.RuntimeException: ProcessBuilder.start() debug
	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1147)
	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1089)
	at java.base/java.lang.Runtime.exec(Runtime.java:681)
	at java.base/java.lang.Runtime.exec(Runtime.java:577)
	at oshi.util.ExecutingCommand.runNative(ExecutingCommand.java:86)
	at oshi.util.ExecutingCommand.runNative(ExecutingCommand.java:68)
	at oshi.util.ExecutingCommand.runNative(ExecutingCommand.java:55)
	at oshi.util.ExecutingCommand.getAnswerAt(ExecutingCommand.java:154)
	at oshi.util.ExecutingCommand.getFirstAnswer(ExecutingCommand.java:143)
	at oshi.software.os.linux.LinuxOperatingSystem.<clinit>(LinuxOperatingSystem.java:149)
	at oshi.SystemInfo.createOperatingSystem(SystemInfo.java:85)
	at oshi.util.Memoizer$1.get(Memoizer.java:65)
	at oshi.SystemInfo.getOperatingSystem(SystemInfo.java:76)
	at com.microsoft.applicationinsights.agent.internal.perfcounter.OshiPerformanceCounter.report(OshiPerformanceCounter.java:47)
	at com.microsoft.applicationinsights.agent.internal.perfcounter.PerformanceCounterContainer$1.run(PerformanceCounterContainer.java:131)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:358)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)






