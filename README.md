
[INFO] --- jacoco-maven-plugin:0.8.14:prepare-agent (prepare-jacoco-agent) @ simtx.arrecadacoes.barra ---
[INFO] argLine set to -javaagent:/opt/ads-agent/cache-tools/.m2/repository/org/jacoco/org.jacoco.agent/0.8.14/org.jacoco.agent-0.8.14-runtime.jar=destfile=/opt/ads-agent/_work/47/s/target/jacoco.exec --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-exports=java.base/jdk.internal.module=ALL-UNNAMED
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ simtx.arrecadacoes.barra ---
[INFO] Copying 2 resources from src/main/resources to target/classes
[INFO] 
[INFO] --- quarkus-maven-plugin:3.33.2.SP1-redhat-00001:generate-code (default-generate-code) @ simtx.arrecadacoes.barra ---
Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/br/simtx.arrecadacoes.barra/1.0.0-SNAPSHOT/maven-metadata.xml
[INFO] [io.quarkiverse.cxf.deployment.codegen.Wsdl2JavaCodeGen] wsdl2java processed 0 WSDL files under src/main/resources
[INFO] 
[INFO] --- quarkus-maven-plugin:3.33.2.SP1-redhat-00001:generate-code (default) @ simtx.arrecadacoes.barra ---
[INFO] [io.quarkiverse.cxf.deployment.codegen.Wsdl2JavaCodeGen] wsdl2java processed 0 WSDL files under src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.15.0:compile (default-compile) @ simtx.arrecadacoes.barra ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 3 source files with javac [debug parameters release 21] to target/classes
[INFO] 
[INFO] --- quarkus-maven-plugin:3.33.2.SP1-redhat-00001:generate-code-tests (default) @ simtx.arrecadacoes.barra ---
[INFO] [io.quarkiverse.cxf.deployment.codegen.Wsdl2JavaCodeGen] wsdl2java processed 0 WSDL files under src/test/resources
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ simtx.arrecadacoes.barra ---
[INFO] Copying 1 resource from src/test/resources to target/test-classes
[INFO] 
[INFO] --- quarkus-maven-plugin:3.33.2.SP1-redhat-00001:generate-code-tests (default-generate-code-tests) @ simtx.arrecadacoes.barra ---
[INFO] [io.quarkiverse.cxf.deployment.codegen.Wsdl2JavaCodeGen] wsdl2java processed 0 WSDL files under src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.15.0:testCompile (default-testCompile) @ simtx.arrecadacoes.barra ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 1 source file with javac [debug parameters release 21] to target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:3.5.6:test (default-test) @ simtx.arrecadacoes.barra ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S

    
	java.util.NoSuchElementException: SRCFG00011: Could not expand value TAREFA_100214_VALIDA_TITULAR_CONTA_SIDEC_V1_TIPO_TOKEN in property client.valida-titular-conta-sidec-v1.token-type
	java.util.NoSuchElementException: SRCFG00011: Could not expand value URL_APIMANAGER in property client.valida-titular-conta-sidec-v1.url
	java.util.NoSuchElementException: SRCFG00011: Could not expand value TAREFA_100040_VALIDA_PERMISSAO_V3_TIMEOUT_CONEXAO in property simtx.valida.permissao.tarefa100040.v3.timeout-conexao
	java.util.NoSuchElementException: SRCFG00011: Could not expand value TAREFA_100040_VALIDA_PERMISSAO_V3_TIMEOUT_RESPOSTA in property simtx.valida.permissao.tarefa100040.v3.timeout-resposta
	java.util.NoSuchElementException: SRCFG00011: Could not expand value TAREFA_100116_VALIDA_TITULAR_V2_TIMEOUT_CONEXAO in property simtx.valida.titular.tarefa100116.v2.timeout-conexao
	java.util.NoSuchElementException: SRCFG00011: Could not expand value TAREFA_100116_VALIDA_TITULAR_V2_TIMEOUT_RESPOSTA in property simtx.valida.titular.tarefa100116.v2.timeout-resposta
	java.util.NoSuchElementException: SRCFG00011: Could not expand value WMQ_SICCO_RECEBE_TRANSACAO_REQ_FILA in property sicco.req.recebe_informacao.fila
	java.util.NoSuchElementException: SRCFG00011: Could not expand value WMQ_SICCO_RECEBE_TRANSACAO_REQ_POOL_SIZE in property sicco.req.recebe_informacao.poolsize
	java.util.NoSuchElementException: SRCFG00011: Could not expand value WMQ_SICCO_RECEBE_TRANSACAO_REQ_TIMEOUT in property sicco.req.recebe_informacao.timeout
	java.util.NoSuchElementException: SRCFG00011: Could not expand value TAREFA_100043_VALIDA_ASSINATURA_SIMPLES_V3_TIMEOUT_CONEXAO in property simtx.valida.assinatura.simples.tarefa100043.v3.timeout-conexao
	java.util.NoSuchElementException: SRCFG00011: Could not expand value TAREFA_100043_VALIDA_ASSINATURA_SIMPLES_V3_TIMEOUT_RESPOSTA in property simtx.valida.assinatura.simples.tarefa100043.v3.timeout-resposta
	java.util.NoSuchElementException: SRCFG00011: Could not expand value TAREFA_100208_VALIDA_TRANSACAO_V1_TIMEOUT in property simtx.valida.transacao.100208.v1.timeoutconexao
	java.util.NoSuchElementException: SRCFG00011: Could not expand value TAREFA_100208_VALIDA_TRANSACAO_V1_TIMEOUT in property simtx.valida.transacao.100208.v1.timeoutresposta
	java.util.NoSuchElementException: SRCFG00011: Could not expand value WMQ_HOSTNAME in property wmq.alta.connection.hostname
	java.util.NoSuchElementException: SRCFG00011: Could not expand value WMQ_PORT in property wmq.alta.connection.port
	java.util.NoSuchElementException: SRCFG00011: Could not expand value WMQ_QUEUEMANAGER in property wmq.alta.connection.queuemanager
	java.util.NoSuchElementException: SRCFG00011: Could not expand value WMQ_USER in property wmq.alta.connection.username
	at io.smallrye.config.SmallRyeConfig.buildMappings(SmallRyeConfig.java:172)
	at io.smallrye.config.SmallRyeConfig.<init>(SmallRyeConfig.java:126)
	at io.smallrye.config.SmallRyeConfigBuilder.build(SmallRyeConfigBuilder.java:785)
	at io.quarkus.runtime.generated.Config.<clinit>(Unknown Source)
	... 9 more

    java.util.NoSuchElementException: SRCFG00011: Could not expand value TAREFA_100116_VALIDA_TITULAR_V2_TIMEOUT_CONEXAO in property simtx.valida.titular.tarefa100116.v2.timeout-conexao
	java.util.NoSuchElementException: SRCFG00011: Could not expand value TAREFA_100116_VALIDA_TITULAR_V2_TIMEOUT_RESPOSTA in property simtx.valida.titular.tarefa100116.v2.timeout-resposta
	java.util.NoSuchElementException: SRCFG00011: Could not expand value WMQ_SICCO_RECEBE_TRANSACAO_REQ_FILA in property sicco.req.recebe_informacao.fila
	java.util.NoSuchElementException: SRCFG00011: Could not expand value WMQ_SICCO_RECEBE_TRANSACAO_REQ_POOL_SIZE in property sicco.req.recebe_informacao.poolsize
	java.util.NoSuchElementException: SRCFG00011: Could not expand value WMQ_SICCO_RECEBE_TRANSACAO_REQ_TIMEOUT in property sicco.req.recebe_informacao.timeout
	java.util.NoSuchElementException: SRCFG00011: Could not expand value TAREFA_100043_VALIDA_ASSINATURA_SIMPLES_V3_TIMEOUT_CONEXAO in property simtx.valida.assinatura.simples.tarefa100043.v3.timeout-conexao
	java.util.NoSuchElementException: SRCFG00011: Could not expand value TAREFA_100043_VALIDA_ASSINATURA_SIMPLES_V3_TIMEOUT_RESPOSTA in property simtx.valida.assinatura.simples.tarefa100043.v3.timeout-resposta
	java.util.NoSuchElementException: SRCFG00011: Could not expand value TAREFA_100208_VALIDA_TRANSACAO_V1_TIMEOUT in property simtx.valida.transacao.100208.v1.timeoutconexao
	java.util.NoSuchElementException: SRCFG00011: Could not expand value TAREFA_100208_VALIDA_TRANSACAO_V1_TIMEOUT in property simtx.valida.transacao.100208.v1.timeoutresposta
	java.util.NoSuchElementException: SRCFG00011: Could not expand value WMQ_HOSTNAME in property wmq.alta.connection.hostname
	java.util.NoSuchElementException: SRCFG00011: Could not expand value WMQ_PORT in property wmq.alta.connection.port
	java.util.NoSuchElementException: SRCFG00011: Could not expand value WMQ_QUEUEMANAGER in property wmq.alta.connection.queuemanager
	java.util.NoSuchElementException: SRCFG00011: Could not expand value WMQ_USER in property wmq.alta.connection.username
	at io.smallrye.config.SmallRyeConfig.buildMappings(SmallRyeConfig.java:172)
	at io.smallrye.config.SmallRyeConfig.<init>(SmallRyeConfig.java:126)
	at io.smallrye.config.SmallRyeConfigBuilder.build(SmallRyeConfigBuilder.java:785)
	at io.quarkus.runtime.generated.Config.<clinit>(Unknown Source)
	... 9 more

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   GreetingResourceTest.testHelloEndpoint » Runtime java.lang.ExceptionInInitializerError
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  33.518 s
