Boa tarde!
Definimos o URIMAP pois a fábrica não havia definido ainda em TQS, testamos e não está chegando no CICS ainda, continuaremos analisando para tentarmos encontrar o erro.
 
Certo! Obrigado pela atualização
 
Marcos Rodrigues da Silva
 
Todos, Já estamos a postos para reiniciarmos a verificação dos problemas de conexão que ainda persistem:
 
As ações de ontem: Definimos o URIMAP, pois a fábrica ainda não o havia configurado em TQS. Realizamos testes e analisamos os logs dos CICS de TQS, porém a transação ainda não está chegando ao CICS. Continuaremos a investigação e as análises para identificar a causa do problema e encontrar a solução.
 
Estamos a disposição para reiniciarmos as verificações.
Qualquer questão podem nos acionar.
 
Thiago Rafael Cavalcante Pereira, vamos precisar novamente do apoio de algum colega da sua equipe, para continuidade das análises
 
Bom dia Marcos Rodrigues da Silva um momento
 
Marcos Rodrigues da Silva
Todos, Já estamos a postos para reiniciarmos a verificação dos problemas de conexão que ainda persistem:   As ações de ontem: Definimos o URIMAP, pois a fábrica ainda não o havia configurado em TQS.…
Jesse Mouta Pereira Batista Bom dia, pode nos apoiar por gentileza 
 
Todos, bom dia
 


exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|10.0.0.0/8 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-09-16 11:59:20,123 INFO  [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (main) 
[issuers declarados na aplicacao]
https://login2tqs.caixa.gov.br/auth/realms/internet
https://logintqs.caixa.gov.br/auth/realms/internet
https://login.tqs.caixa/auth/realms/intranet

2026-09-16 11:59:20,705 INFO  [io.qua.sma.ope.run.OpenApiRecorder] (main) CORS filtering is disabled and cross-origin resource sharing is allowed without restriction, which is not recommended in production. Please configure the CORS filter through 'quarkus.http.cors.*' properties. For more information, see Quarkus HTTP CORS documentation
2026-09-16 11:59:21,111 INFO  [io.quarkus] (main) sid01-lancamentos-financeiros 1.5.0.2 on JVM (powered by Quarkus 2.13.8.Final) started in 3.501s. Listening on: http://0.0.0.0:8080
2026-09-16 11:59:21,112 INFO  [io.quarkus] (main) Profile prod activated. 
2026-09-16 11:59:21,112 INFO  [io.quarkus] (main) Installed features: [cdi, hibernate-validator, logging-gelf, resteasy, resteasy-jsonb, smallrye-context-propagation, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx]
2026-09-16 12:00:53,498 INFO  [org.apa.cxf.wsd.ser.fac.ReflectionServiceFactoryBean] (executor-thread-0) Creating Service {http://caixa.gov.br/sid01/lancamentoV4}D01POSOLService from WSDL: jar:file:/deployments/app/sid01-lancamentos-financeiros-1.5.0.2.jar!/wsdl/D01POSOL_N1W1.wsdl
2026-09-16 12:00:55,010 INFO  [org.apa.cxf.wsd.ser.fac.ReflectionServiceFactoryBean] (executor-thread-0) Creating Service {http://caixa.gov.br/sid01/lancamentoV4}D01POSOLService from WSDL: jar:file:/deployments/app/sid01-lancamentos-financeiros-1.5.0.2.jar!/wsdl/D01POSOL_N1W1.wsdl
2026-09-16 12:00:56,521 ERROR [br.gov.cai.sid.res.lan.cre.CreditoResource] (executor-thread-0) METODO: creditar DETALHE: javax.xml.ws.soap.SOAPFaultException: Resource https://cicsweb.tqs.caixa:2587/sid01/lancamentoV4 not found
 
2026-09-16 12:00:59,441 ERROR [br.gov.cai.sid.res.lan.cre.CreditoResource] (executor-thread-0) METODO: creditar DETALHE: javax.xml.ws.soap.SOAPFaultException: Resource https://cicsweb.tqs.caixa:2587/sid01/lancamentoV4 not found
 
2026-09-16 14:49:33,533 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-2) com.auth0.jwt.exceptions.TokenExpiredException: The Token has expired on 2026-09-16T15:05:49Z.
2026-09-16 14:49:33,534 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-2) com.auth0.jwt.exceptions.TokenExpiredException: Token expirado.
2026-09-16 14:49:38,437 ERROR [br.gov.cai.sid.res.lan.cre.CreditoResource] (executor-thread-2) METODO: creditar DETALHE: javax.xml.ws.soap.SOAPFaultException: Resource https://cicsweb.tqs.caixa:2587/sid01/lancamentoV4 not found
 
