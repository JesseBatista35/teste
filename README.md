Boa tarde, por favor

verificar se as senhas salvas na seguinte lib estão corretas: 

https://devops.caixa/projetos/Caixa/_library?itemType=VariableGroups&view=VariableGroupView&variableGroupId=18305&path=SIMPI-DICT-API-DES

utilizadas para acessar o keystore: 
/deployments/sispi_user_keystore_kafka_des.p12 

que já consta na pipeline:
https://devops.caixa/projetos/Caixa/_releaseDefinition?definitionId=6519&_a=definition-tasks&environmentId=29878

Pois em tempo de release o projeto está recebendo o seguinte erro: 

__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
14:04:52 ERROR  [CORRELATION-ID - ] [io.sm.re.me.kafka] (smallrye-kafka-producer-thread-0) [SIMPI-API] SRMSG18261: Unable to initialize producer from channel monitoria.: org.apache.kafka.common.KafkaException: Failed to construct kafka producer
	at org.apache.kafka.clients.producer.KafkaProducer.<init>(KafkaProducer.java:465)
	at org.apache.kafka.clients.producer.KafkaProducer.<init>(KafkaProducer.java:301)
	at io.smallrye.reactive.messaging.kafka.impl.ReactiveKafkaProducer.lambda$new$0(ReactiveKafkaProducer.java:122)
	at java.base/java.util.concurrent.atomic.AtomicReference.updateAndGet(AtomicReference.java:206)
	at io.smallrye.reactive.messaging.kafka.impl.ReactiveKafkaProducer.lambda$new$1(ReactiveKafkaProducer.java:118)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniOnItemConsume.subscribe(UniOnItemConsume.java:34)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.groups.UniSubscribe.withSubscriber(UniSubscribe.java:51)
	at io.smallrye.mutiny.operators.uni.UniMemoizeOp.subscribe(UniMemoizeOp.java:82)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.apache.kafka.common.KafkaException: Failed to create new NetworkClient
	at org.apache.kafka.clients.ClientUtils.createNetworkClient(ClientUtils.java:256)
	at org.apache.kafka.clients.ClientUtils.createNetworkClient(ClientUtils.java:163)
	at org.apache.kafka.clients.producer.KafkaProducer.newSender(KafkaProducer.java:515)
	at org.apache.kafka.clients.producer.KafkaProducer.<init>(KafkaProducer.java:454)
	... 16 more
Caused by: org.apache.kafka.common.KafkaException: Failed to load SSL keystore /deployments/sispi_user_keystore_kafka_des.p12 of type PKCS12
	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory$FileBasedStore.load(DefaultSslEngineFactory.java:380)
	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory$FileBasedStore.<init>(DefaultSslEngineFactory.java:352)
	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory.createKeystore(DefaultSslEngineFactory.java:302)
	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory.configure(DefaultSslEngineFactory.java:162)
	at org.apache.kafka.common.security.ssl.SslFactory.instantiateSslEngineFactory(SslFactory.java:147)
	at org.apache.kafka.common.security.ssl.SslFactory.configure(SslFactory.java:100)
	at org.apache.kafka.common.network.SslChannelBuilder.configure(SslChannelBuilder.java:70)
	at org.apache.kafka.common.network.ChannelBuilders.create(ChannelBuilders.java:188)
	at org.apache.kafka.common.network.ChannelBuilders.clientChannelBuilder(ChannelBuilders.java:79)
	at org.apache.kafka.clients.ClientUtils.createChannelBuilder(ClientUtils.java:120)
	at org.apache.kafka.clients.ClientUtils.createNetworkClient(ClientUtils.java:224)
	... 19 more
Caused by: java.io.IOException: keystore password was incorrect
	at java.base/sun.security.pkcs12.PKCS12KeyStore.engineLoad(PKCS12KeyStore.java:2109)
	at java.base/sun.security.util.KeyStoreDelegator.engineLoad(KeyStoreDelegator.java:226)
	at java.base/java.security.KeyStore.load(KeyStore.java:1522)
	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory$FileBasedStore.load(DefaultSslEngineFactory.java:377)
	... 29 more
Caused by: java.security.UnrecoverableKeyException: failed to decrypt safe contents entry: javax.crypto.BadPaddingException: Given final block not properly padded. Such issues can arise if a bad key is used during decryption.
	... 33 more


grato

Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Library
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings

Library

SIMPI-DICT-API-DES

Variable group
Properties
Variable group name
SIMPI-DICT-API-DES
Description
Grupo de variáveis de SIMPI-DICT-API-DES


Variables
_ENV.BACEN_MAX_CONNECTIONS
50
_ENV.BACEN_V2_HOST
dict-h.pi.rsfn.net.br
_ENV.BACEN_V2_URL
https://dict-h.pi.rsfn.net.br:16522/api/v2
_ENV.CERT_ASSINATURA_ISSUER_NAME
'${SIMPI_ISSUER_CERT}'
_ENV.CERT_ASSINATURA_SERIAL_NUMBER
'${SIMPI_SN_CERT}'
_ENV.HSM_CERT_SERIAL_41844103406841463730731802981
bacen_pub_t512
_ENV.HSM_HOSTNAME
"hsmdes.extra.caixa.gov.br"
_ENV.HSM_PASSWORD
'${SMPISD01_HSM}'
_ENV.HSM_PRIVATE_KEY_NAME
'${SIMPI_ALIAS_CERT}'
_ENV.HSM_USER_ID
SMPISD01
_ENV.ISPB_CAIXA
00360305
_ENV.JAVA_OPTIONS_APPEND
"-Xms1280m -Xmx1280m -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.KAFKA_BOOTSTRAP_PORT
443
_ENV.KAFKA_BOOTSTRAP_SERVER
"development-kafka-bootstrap-cp4i.apps.pixnprd4.caixa"
_ENV.KAFKA_PASS
'${SIMPI_KAFKA}'
_ENV.KAFKA_USER
mpiclient
_ENV.KEY_STORE_KAFKA_CLIENT_LOCATION
/deployments/sispi_user_keystore_kafka_des.p12
_ENV.KEY_STORE_KAFKA_CLIENT_PASSWORD
'${SIMPI_USER_KEYSTORE}'
_ENV.KEYSTORE_PASSWORD
'${SIMPI_KSPIX_01}'
_ENV.KEYSTORE_PATH
/deployments/simpi-des-keystore-082026.jks
_ENV.PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_EMISSOR_0
"https://login.des.caixa/auth/realms/intranet"
_ENV.PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_URL_0
"https://login.des.caixa/auth/realms/intranet"
_ENV.PIX_FRAMEWORK_VALIDACAO_TOKEN_VALIDACAO_GLOBAL
true
_ENV.TOPICO_MONITORIA_MPI
PIX.DICT.AUDITORIA.MENSAGERIA.BACEN
_ENV.TRUST_STORE_KAFKA_LOCATION
/deployments/keystore_event_streams.p12
_ENV.TRUST_STORE_KAFKA_PASSWORD
'${SIMPI_KAFKA_TRUSTSTORE}'
_ENV.TRUSTSTORE_PASSWORD
123456
_ENV.TRUSTSTORE_PATH
/deployments/simpi-des-truststore-202602.jks
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
INIT
Criado via api
VAULT_LOCATION
/usr/src/app/secrets_files/SIMPI_DES



2026-10-05T17:08:01.4191493Z ##[section]Starting: Logs da Aplicação
2026-10-05T17:08:01.4194946Z ==============================================================================
2026-10-05T17:08:01.4195034Z Task         : Bash
2026-10-05T17:08:01.4195094Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-05T17:08:01.4195156Z Version      : 3.227.0
2026-10-05T17:08:01.4195207Z Author       : Microsoft Corporation
2026-10-05T17:08:01.4195256Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-05T17:08:01.4195327Z ==============================================================================
2026-10-05T17:08:02.1920227Z Generating script.
2026-10-05T17:08:02.1933161Z ========================== Starting Command Output ===========================
2026-10-05T17:08:02.1946312Z [command]/bin/bash /opt/ads-agent/_work/_temp/b6a7a2c4-f98a-42b5-b528-248b13abec0c.sh
2026-10-05T17:08:02.1986630Z + shopt -s expand_aliases
2026-10-05T17:08:02.1987179Z + [[ -n ocp_nprd ]]
2026-10-05T17:08:02.1987401Z + [[ ocp_nprd =~ ocp ]]
2026-10-05T17:08:02.1987564Z + app=simpi-dict-api-des
2026-10-05T17:08:02.1987747Z + arquivo=/usr/local/bin/oc-v4.13
2026-10-05T17:08:02.1987918Z + '[' -e /usr/local/bin/oc-v4.13 ']'
2026-10-05T17:08:02.1988086Z + alias oc=/usr/local/bin/oc-v4.13
2026-10-05T17:08:02.1988242Z + /usr/local/bin/oc-v4.13 version
2026-10-05T17:08:02.2963790Z Client Version: 4.13.0-202307282024.p0.ge251b5e.assembly.stream-e251b5e
2026-10-05T17:08:02.2964397Z Kustomize Version: v4.5.7
2026-10-05T17:08:02.2964675Z Server Version: 4.15.59
2026-10-05T17:08:02.2965383Z Kubernetes Version: v1.28.15+d227d65
2026-10-05T17:08:02.3000959Z ++ /usr/local/bin/oc-v4.13 get pod -l name=simpi-dict-api-des -n simpi-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-05T17:08:02.3001733Z ++ tac
2026-10-05T17:08:02.3002024Z ++ grep -v '^$'
2026-10-05T17:08:02.3002272Z ++ head -n1
2026-10-05T17:08:02.4248518Z + last_pod=simpi-dict-api-des-137-wc8pc
2026-10-05T17:08:02.4250288Z + echo 'Logs do POD: simpi-dict-api-des-137-wc8pc'
2026-10-05T17:08:02.4250580Z + /usr/local/bin/oc-v4.13 logs simpi-dict-api-des-137-wc8pc -c simpi-dict-api-des -n simpi-des
2026-10-05T17:08:02.4251267Z Logs do POD: simpi-dict-api-des-137-wc8pc
2026-10-05T17:08:02.5387802Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Xms1280m -Xmx1280m -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-10-05T17:08:02.5388294Z __  ____  __  _____   ___  __ ____  ______ 
2026-10-05T17:08:02.5388460Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-10-05T17:08:02.5388617Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-10-05T17:08:02.5388776Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-10-05T17:08:02.5389243Z 14:06:20 ERROR  [CORRELATION-ID - ] [io.sm.re.me.kafka] (smallrye-kafka-producer-thread-0) [SIMPI-API] SRMSG18261: Unable to initialize producer from channel monitoria.: org.apache.kafka.common.KafkaException: Failed to construct kafka producer
2026-10-05T17:08:02.5389553Z 	at org.apache.kafka.clients.producer.KafkaProducer.<init>(KafkaProducer.java:465)
2026-10-05T17:08:02.5390069Z 	at org.apache.kafka.clients.producer.KafkaProducer.<init>(KafkaProducer.java:301)
2026-10-05T17:08:02.5390274Z 	at io.smallrye.reactive.messaging.kafka.impl.ReactiveKafkaProducer.lambda$new$0(ReactiveKafkaProducer.java:122)
2026-10-05T17:08:02.5390491Z 	at java.base/java.util.concurrent.atomic.AtomicReference.updateAndGet(AtomicReference.java:206)
2026-10-05T17:08:02.5390702Z 	at io.smallrye.reactive.messaging.kafka.impl.ReactiveKafkaProducer.lambda$new$1(ReactiveKafkaProducer.java:118)
2026-10-05T17:08:02.5390919Z 	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
2026-10-05T17:08:02.5391137Z 	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
2026-10-05T17:08:02.5391415Z 	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
2026-10-05T17:08:02.5391607Z 	at io.smallrye.mutiny.operators.uni.UniOnItemConsume.subscribe(UniOnItemConsume.java:34)
2026-10-05T17:08:02.5391796Z 	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
2026-10-05T17:08:02.5391970Z 	at io.smallrye.mutiny.groups.UniSubscribe.withSubscriber(UniSubscribe.java:51)
2026-10-05T17:08:02.5392145Z 	at io.smallrye.mutiny.operators.uni.UniMemoizeOp.subscribe(UniMemoizeOp.java:82)
2026-10-05T17:08:02.5392326Z 	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
2026-10-05T17:08:02.5392516Z 	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
2026-10-05T17:08:02.5392805Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
2026-10-05T17:08:02.5393007Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
2026-10-05T17:08:02.5393187Z 	at java.base/java.lang.Thread.run(Thread.java:1474)
2026-10-05T17:08:02.5393379Z Caused by: org.apache.kafka.common.KafkaException: Failed to create new NetworkClient
2026-10-05T17:08:02.5393567Z 	at org.apache.kafka.clients.ClientUtils.createNetworkClient(ClientUtils.java:256)
2026-10-05T17:08:02.5393837Z 	at org.apache.kafka.clients.ClientUtils.createNetworkClient(ClientUtils.java:163)
2026-10-05T17:08:02.5394027Z 	at org.apache.kafka.clients.producer.KafkaProducer.newSender(KafkaProducer.java:515)
2026-10-05T17:08:02.5394215Z 	at org.apache.kafka.clients.producer.KafkaProducer.<init>(KafkaProducer.java:454)
2026-10-05T17:08:02.5394354Z 	... 16 more
2026-10-05T17:08:02.5394508Z Caused by: org.apache.kafka.common.KafkaException: Failed to load SSL keystore /deployments/sispi_user_keystore_kafka_des.p12 of type PKCS12
2026-10-05T17:08:02.5394734Z 	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory$FileBasedStore.load(DefaultSslEngineFactory.java:380)
2026-10-05T17:08:02.5394966Z 	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory$FileBasedStore.<init>(DefaultSslEngineFactory.java:352)
2026-10-05T17:08:02.5395186Z 	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory.createKeystore(DefaultSslEngineFactory.java:302)
2026-10-05T17:08:02.5395403Z 	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory.configure(DefaultSslEngineFactory.java:162)
2026-10-05T17:08:02.5395617Z 	at org.apache.kafka.common.security.ssl.SslFactory.instantiateSslEngineFactory(SslFactory.java:147)
2026-10-05T17:08:02.5395809Z 	at org.apache.kafka.common.security.ssl.SslFactory.configure(SslFactory.java:100)
2026-10-05T17:08:02.5395997Z 	at org.apache.kafka.common.network.SslChannelBuilder.configure(SslChannelBuilder.java:70)
2026-10-05T17:08:02.5396188Z 	at org.apache.kafka.common.network.ChannelBuilders.create(ChannelBuilders.java:188)
2026-10-05T17:08:02.5396385Z 	at org.apache.kafka.common.network.ChannelBuilders.clientChannelBuilder(ChannelBuilders.java:79)
2026-10-05T17:08:02.5396772Z 	at org.apache.kafka.clients.ClientUtils.createChannelBuilder(ClientUtils.java:120)
2026-10-05T17:08:02.5396973Z 	at org.apache.kafka.clients.ClientUtils.createNetworkClient(ClientUtils.java:224)
2026-10-05T17:08:02.5397187Z 	... 19 more
2026-10-05T17:08:02.5397301Z Caused by: java.io.IOException: keystore password was incorrect
2026-10-05T17:08:02.5397471Z 	at java.base/sun.security.pkcs12.PKCS12KeyStore.engineLoad(PKCS12KeyStore.java:2109)
2026-10-05T17:08:02.5397659Z 	at java.base/sun.security.util.KeyStoreDelegator.engineLoad(KeyStoreDelegator.java:226)
2026-10-05T17:08:02.5397835Z 	at java.base/java.security.KeyStore.load(KeyStore.java:1522)
2026-10-05T17:08:02.5398030Z 	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory$FileBasedStore.load(DefaultSslEngineFactory.java:377)
2026-10-05T17:08:02.5398190Z 	... 29 more
2026-10-05T17:08:02.5398387Z Caused by: java.security.UnrecoverableKeyException: failed to decrypt safe contents entry: javax.crypto.BadPaddingException: Given final block not properly padded. Such issues can arise if a bad key is used during decryption.
2026-10-05T17:08:02.5398648Z 	... 33 more
2026-10-05T17:08:02.5398689Z 
2026-10-05T17:08:02.5399041Z 14:06:20 ERROR  [CORRELATION-ID - ] [io.sm.re.me.provider] (main) [SIMPI-API] SRMSG00230: Unable to create the publisher or subscriber during initialization: org.apache.kafka.common.KafkaException: Failed to construct kafka producer
2026-10-05T17:08:02.5399403Z 	at org.apache.kafka.clients.producer.KafkaProducer.<init>(KafkaProducer.java:465)
2026-10-05T17:08:02.5399589Z 	at org.apache.kafka.clients.producer.KafkaProducer.<init>(KafkaProducer.java:301)
2026-10-05T17:08:02.5399789Z 	at io.smallrye.reactive.messaging.kafka.impl.ReactiveKafkaProducer.lambda$new$0(ReactiveKafkaProducer.java:122)
2026-10-05T17:08:02.5400003Z 	at java.base/java.util.concurrent.atomic.AtomicReference.updateAndGet(AtomicReference.java:206)
2026-10-05T17:08:02.5400206Z 	at io.smallrye.reactive.messaging.kafka.impl.ReactiveKafkaProducer.lambda$new$1(ReactiveKafkaProducer.java:118)
2026-10-05T17:08:02.5400420Z 	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
2026-10-05T17:08:02.5400626Z 	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
2026-10-05T17:08:02.5400825Z 	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
2026-10-05T17:08:02.5401007Z 	at io.smallrye.mutiny.operators.uni.UniOnItemConsume.subscribe(UniOnItemConsume.java:34)
2026-10-05T17:08:02.5401187Z 	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
2026-10-05T17:08:02.5401360Z 	at io.smallrye.mutiny.groups.UniSubscribe.withSubscriber(UniSubscribe.java:51)
2026-10-05T17:08:02.5401541Z 	at io.smallrye.mutiny.operators.uni.UniMemoizeOp.subscribe(UniMemoizeOp.java:82)
2026-10-05T17:08:02.5401718Z 	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
2026-10-05T17:08:02.5401909Z 	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
2026-10-05T17:08:02.5402113Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
2026-10-05T17:08:02.5402313Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
2026-10-05T17:08:02.5402481Z 	at java.base/java.lang.Thread.run(Thread.java:1474)
2026-10-05T17:08:02.5402632Z Caused by: org.apache.kafka.common.KafkaException: Failed to create new NetworkClient
2026-10-05T17:08:02.5402803Z 	at org.apache.kafka.clients.ClientUtils.createNetworkClient(ClientUtils.java:256)
2026-10-05T17:08:02.5402990Z 	at org.apache.kafka.clients.ClientUtils.createNetworkClient(ClientUtils.java:163)
2026-10-05T17:08:02.5403170Z 	at org.apache.kafka.clients.producer.KafkaProducer.newSender(KafkaProducer.java:515)
2026-10-05T17:08:02.5403358Z 	at org.apache.kafka.clients.producer.KafkaProducer.<init>(KafkaProducer.java:454)
2026-10-05T17:08:02.5403495Z 	... 16 more
2026-10-05T17:08:02.5403653Z Caused by: org.apache.kafka.common.KafkaException: Failed to load SSL keystore /deployments/sispi_user_keystore_kafka_des.p12 of type PKCS12
2026-10-05T17:08:02.5403988Z 	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory$FileBasedStore.load(DefaultSslEngineFactory.java:380)
2026-10-05T17:08:02.5404218Z 	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory$FileBasedStore.<init>(DefaultSslEngineFactory.java:352)
2026-10-05T17:08:02.5404477Z 	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory.createKeystore(DefaultSslEngineFactory.java:302)
2026-10-05T17:08:02.5404705Z 	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory.configure(DefaultSslEngineFactory.java:162)
2026-10-05T17:08:02.5404912Z 	at org.apache.kafka.common.security.ssl.SslFactory.instantiateSslEngineFactory(SslFactory.java:147)
2026-10-05T17:08:02.5405095Z 	at org.apache.kafka.common.security.ssl.SslFactory.configure(SslFactory.java:100)
2026-10-05T17:08:02.5405283Z 	at org.apache.kafka.common.network.SslChannelBuilder.configure(SslChannelBuilder.java:70)
2026-10-05T17:08:02.5405595Z 	at org.apache.kafka.common.network.ChannelBuilders.create(ChannelBuilders.java:188)
2026-10-05T17:08:02.5405794Z 	at org.apache.kafka.common.network.ChannelBuilders.clientChannelBuilder(ChannelBuilders.java:79)
2026-10-05T17:08:02.5405988Z 	at org.apache.kafka.clients.ClientUtils.createChannelBuilder(ClientUtils.java:120)
2026-10-05T17:08:02.5406172Z 	at org.apache.kafka.clients.ClientUtils.createNetworkClient(ClientUtils.java:224)
2026-10-05T17:08:02.5406306Z 	... 19 more
2026-10-05T17:08:02.5406426Z Caused by: java.io.IOException: keystore password was incorrect
2026-10-05T17:08:02.5406592Z 	at java.base/sun.security.pkcs12.PKCS12KeyStore.engineLoad(PKCS12KeyStore.java:2109)
2026-10-05T17:08:02.5406778Z 	at java.base/sun.security.util.KeyStoreDelegator.engineLoad(KeyStoreDelegator.java:226)
2026-10-05T17:08:02.5406940Z 	at java.base/java.security.KeyStore.load(KeyStore.java:1522)
2026-10-05T17:08:02.5407133Z 	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory$FileBasedStore.load(DefaultSslEngineFactory.java:377)
2026-10-05T17:08:02.5407298Z 	... 29 more
2026-10-05T17:08:02.5407496Z Caused by: java.security.UnrecoverableKeyException: failed to decrypt safe contents entry: javax.crypto.BadPaddingException: Given final block not properly padded. Such issues can arise if a bad key is used during decryption.
2026-10-05T17:08:02.5407687Z 	... 33 more
2026-10-05T17:08:02.5407726Z 
2026-10-05T17:08:02.5407999Z 14:06:20 ERROR  [CORRELATION-ID - ] [io.qu.ru.Application] (main) [SIMPI-API] Failed to start application: java.lang.RuntimeException: Failed to start quarkus
2026-10-05T17:08:02.5408184Z 	at io.quarkus.runner.ApplicationImpl.doStart(Unknown Source)
2026-10-05T17:08:02.5408388Z 	at io.quarkus.runtime.Application.start(Application.java:112)
2026-10-05T17:08:02.5408573Z 	at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:127)
2026-10-05T17:08:02.5408793Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:79)
2026-10-05T17:08:02.5408948Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:50)
2026-10-05T17:08:02.5409095Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:143)
2026-10-05T17:08:02.5409317Z 	at io.quarkus.runner.GeneratedMain.main(Unknown Source)
2026-10-05T17:08:02.5409473Z 	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:86)
2026-10-05T17:08:02.5409657Z 	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:37)
2026-10-05T17:08:02.5409857Z Caused by: jakarta.enterprise.inject.spi.DeploymentException: org.apache.kafka.common.KafkaException: Failed to construct kafka producer
2026-10-05T17:08:02.5410099Z 	at io.quarkus.smallrye.reactivemessaging.runtime.SmallRyeReactiveMessagingLifecycle.onApplicationStart(SmallRyeReactiveMessagingLifecycle.java:58)
2026-10-05T17:08:02.5410356Z 	at io.quarkus.smallrye.reactivemessaging.runtime.SmallRyeReactiveMessagingLifecycle_Observer_onApplicationStart_JSJcBUQWq_sOCsdRnImWMl3KQNE.notify(Unknown Source)
2026-10-05T17:08:02.5410567Z 	at io.quarkus.arc.impl.EventImpl$Notifier.notifyObservers(EventImpl.java:366)
2026-10-05T17:08:02.5410738Z 	at io.quarkus.arc.impl.EventImpl$Notifier.notify(EventImpl.java:348)
2026-10-05T17:08:02.5410969Z 	at io.quarkus.arc.impl.EventImpl.fire(EventImpl.java:81)
2026-10-05T17:08:02.5411136Z 	at io.quarkus.arc.runtime.ArcRecorder.fireLifecycleEvent(ArcRecorder.java:165)
2026-10-05T17:08:02.5411313Z 	at io.quarkus.arc.runtime.ArcRecorder.handleLifecycleEvents(ArcRecorder.java:115)
2026-10-05T17:08:02.5411494Z 	at io.quarkus.runner.recorded.LifecycleEventsBuildStep$startupEvent1144526294.deploy_0(Unknown Source)
2026-10-05T17:08:02.5411672Z 	at io.quarkus.runner.recorded.LifecycleEventsBuildStep$startupEvent1144526294.deploy(Unknown Source)
2026-10-05T17:08:02.5411807Z 	... 9 more
2026-10-05T17:08:02.5411930Z Caused by: org.apache.kafka.common.KafkaException: Failed to construct kafka producer
2026-10-05T17:08:02.5412104Z 	at org.apache.kafka.clients.producer.KafkaProducer.<init>(KafkaProducer.java:465)
2026-10-05T17:08:02.5412353Z 	at org.apache.kafka.clients.producer.KafkaProducer.<init>(KafkaProducer.java:301)
2026-10-05T17:08:02.5412556Z 	at io.smallrye.reactive.messaging.kafka.impl.ReactiveKafkaProducer.lambda$new$0(ReactiveKafkaProducer.java:122)
2026-10-05T17:08:02.5412769Z 	at java.base/java.util.concurrent.atomic.AtomicReference.updateAndGet(AtomicReference.java:206)
2026-10-05T17:08:02.5412975Z 	at io.smallrye.reactive.messaging.kafka.impl.ReactiveKafkaProducer.lambda$new$1(ReactiveKafkaProducer.java:118)
2026-10-05T17:08:02.5413184Z 	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
2026-10-05T17:08:02.5413436Z 	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
2026-10-05T17:08:02.5413645Z 	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
2026-10-05T17:08:02.5413829Z 	at io.smallrye.mutiny.operators.uni.UniOnItemConsume.subscribe(UniOnItemConsume.java:34)
2026-10-05T17:08:02.5414006Z 	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
2026-10-05T17:08:02.5414183Z 	at io.smallrye.mutiny.groups.UniSubscribe.withSubscriber(UniSubscribe.java:51)
2026-10-05T17:08:02.5414365Z 	at io.smallrye.mutiny.operators.uni.UniMemoizeOp.subscribe(UniMemoizeOp.java:82)
2026-10-05T17:08:02.5414546Z 	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
2026-10-05T17:08:02.5414796Z 	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
2026-10-05T17:08:02.5414998Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
2026-10-05T17:08:02.5415192Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
2026-10-05T17:08:02.5415413Z 	at java.base/java.lang.Thread.run(Thread.java:1474)
2026-10-05T17:08:02.5415576Z Caused by: org.apache.kafka.common.KafkaException: Failed to create new NetworkClient
2026-10-05T17:08:02.5415751Z 	at org.apache.kafka.clients.ClientUtils.createNetworkClient(ClientUtils.java:256)
2026-10-05T17:08:02.5415933Z 	at org.apache.kafka.clients.ClientUtils.createNetworkClient(ClientUtils.java:163)
2026-10-05T17:08:02.5416106Z 	at org.apache.kafka.clients.producer.KafkaProducer.newSender(KafkaProducer.java:515)
2026-10-05T17:08:02.5416290Z 	at org.apache.kafka.clients.producer.KafkaProducer.<init>(KafkaProducer.java:454)
2026-10-05T17:08:02.5416428Z 	... 16 more
2026-10-05T17:08:02.5416584Z Caused by: org.apache.kafka.common.KafkaException: Failed to load SSL keystore /deployments/sispi_user_keystore_kafka_des.p12 of type PKCS12
2026-10-05T17:08:02.5416805Z 	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory$FileBasedStore.load(DefaultSslEngineFactory.java:380)
2026-10-05T17:08:02.5417032Z 	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory$FileBasedStore.<init>(DefaultSslEngineFactory.java:352)
2026-10-05T17:08:02.5417301Z 	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory.createKeystore(DefaultSslEngineFactory.java:302)
2026-10-05T17:08:02.5417592Z 	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory.configure(DefaultSslEngineFactory.java:162)
2026-10-05T17:08:02.5417910Z 	at org.apache.kafka.common.security.ssl.SslFactory.instantiateSslEngineFactory(SslFactory.java:147)
2026-10-05T17:08:02.5418139Z 	at org.apache.kafka.common.security.ssl.SslFactory.configure(SslFactory.java:100)
2026-10-05T17:08:02.5418339Z 	at org.apache.kafka.common.network.SslChannelBuilder.configure(SslChannelBuilder.java:70)
2026-10-05T17:08:02.5418528Z 	at org.apache.kafka.common.network.ChannelBuilders.create(ChannelBuilders.java:188)
2026-10-05T17:08:02.5418719Z 	at org.apache.kafka.common.network.ChannelBuilders.clientChannelBuilder(ChannelBuilders.java:79)
2026-10-05T17:08:02.5418967Z 	at org.apache.kafka.clients.ClientUtils.createChannelBuilder(ClientUtils.java:120)
2026-10-05T17:08:02.5419217Z 	at org.apache.kafka.clients.ClientUtils.createNetworkClient(ClientUtils.java:224)
2026-10-05T17:08:02.5419415Z 	... 19 more
2026-10-05T17:08:02.5419539Z Caused by: java.io.IOException: keystore password was incorrect
2026-10-05T17:08:02.5419738Z 	at java.base/sun.security.pkcs12.PKCS12KeyStore.engineLoad(PKCS12KeyStore.java:2109)
2026-10-05T17:08:02.5419937Z 	at java.base/sun.security.util.KeyStoreDelegator.engineLoad(KeyStoreDelegator.java:226)
2026-10-05T17:08:02.5420110Z 	at java.base/java.security.KeyStore.load(KeyStore.java:1522)
2026-10-05T17:08:02.5420301Z 	at org.apache.kafka.common.security.ssl.DefaultSslEngineFactory$FileBasedStore.load(DefaultSslEngineFactory.java:377)
2026-10-05T17:08:02.5420460Z 	... 29 more
2026-10-05T17:08:02.5420644Z Caused by: java.security.UnrecoverableKeyException: failed to decrypt safe contents entry: javax.crypto.BadPaddingException: Given final block not properly padded. Such issues can arise if a bad key is used during decryption.
2026-10-05T17:08:02.5420836Z 	... 33 more
2026-10-05T17:08:02.5420885Z 
2026-10-05T17:08:02.5470382Z ##[section]Finishing: Logs da Aplicação
