Jesse Mouta Pereira Batista
Everton Heleno de Almeida, Marcos Rodrigues da Silva e Rodrigo Portela das Chagas Boa tarde!   Consegui avançar na investigação com a informação das portas que o Everton levantou com o time de Redes…
Boa tarde, Jessé!
O URIMAP foi criado em todos os CICS de TQS
 
Poderiam testar novamente por favor, Pedro Barrella Vasconcellos 
 
Everton Heleno de Almeida
Poderiam testar novamente por favor, Pedro Barrella Vasconcellos
Boa tarde Everton! Testando agora mesmo!
 
Ainda sem sucesso Everton.
 
A requisição está retornando o erro 502/503 conforme o print a seguir:
 
Toda vez que a requisição bate no pod faz ele reiniciar com a seguinte mensagem de erro: 
 
2026-09-18 13:45:10,108 INFO [io.qua.sma.ope.run.OpenApiRecorder] (main) CORS filtering is disabled and cross-origin resource sharing is allowed without restriction, which is not recommended in production. Please configure the CORS filter through 'quarkus.http.cors.*' properties. For more information, see Quarkus HTTP CORS documentation
2026-09-18 13:45:11,375 INFO [io.quarkus] (main) sid01-lancamentos-financeiros 1.5.0.2 on JVM (powered by Quarkus 2.13.8.Final) started in 13.506s. Listening on: http://0.0.0.0:8080
2026-09-18 13:45:11,376 INFO [io.quarkus] (main) Profile prod activated.
2026-09-18 13:45:11,376 INFO [io.quarkus] (main) Installed features: [cdi, hibernate-validator, logging-gelf, resteasy, resteasy-jsonb, smallrye-context-propagation, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx]
2026-09-18 13:45:56.732-03:00 ERROR c.azure.core.http.policy.RetryPolicy - {"az.sdk.message":"Retry attempts have been exhausted.","exception":"http, none, proxydes.caixa/10.252.32.65:80 => /169.254.169.254:80, status: 502 Proxy Error ( The specified Secure Sockets Layer (SSL) port is not allowed. Forefront TMG is not configured to allow SSL requests from this port. Most Web browsers use port 443 for SSL requests. )","tryCount":3}
2026-09-18 13:46:25,292 INFO [org.apa.cxf.wsd.ser.fac.ReflectionServiceFactoryBean] (executor-thread-1) Creating Service {http://caixa.gov.br/sid01/lancamentoV4}D01POSOLService from WSDL: jar:file:/deployments/app/sid01-lancamentos-financeiros-1.5.0.2.jar!/wsdl/D01POSOL_N1W1.wsdl
/usr/local/s2i/run: line 6: 8 Killed /deployments/run-java.sh
 
 
Não está chegando nada aqui no CICS ainda, o URIMAP foi definido pois a fábrica não havia definido, 
 
Nos log dos CICS AOR e TOR WEB não chegou nenhuma mensagem de erro.
 
Por aqui continua no erro 502 também
 
 
Como vamos avançar nisso?
 
Lembrando que essa é uma demanda para seguirmos com uma homologação contábil de um produto estratégico da CAIXA
 
Precisamos do apoio de vocês. Caso precisem de algum outro técnico, nos avisem por favor
 
Everton Heleno de Almeida
Não está chegando nada aqui no CICS ainda, o URIMAP foi definido pois a fábrica não havia definido, 📷
Esse erro que está acontecendo no pod está bloqueando a chamada. Parece que o proxy está barrando a chamada nessa porta.
 
Jesse,  Thiago.
 
Nós vamos precisar que alguém da baixa dê uma olhada nesse problema
 
Pedro Barrella Vasconcellos
Esse erro que está acontecendo no pod está bloqueando a chamada. Parece que o proxy está barrando a chamada nessa porta.   Jesse,  Thiago.   Nós vamos precisar que alguém da baixa dê uma olhada nesse
vou verificar.




 <img width="1432" height="863" alt="image" src="https://github.com/user-attachments/assets/de041aa9-337c-40dc-bcd5-7aac9362678e" />


 <img width="1919" height="1040" alt="image" src="https://github.com/user-attachments/assets/5a275d97-3242-45f3-9d89-39f780427334" />


<img width="1399" height="874" alt="image" src="https://github.com/user-attachments/assets/2a8088e7-e44e-4d9a-b680-f764f20ae985" />


<img width="1258" height="808" alt="image" src="https://github.com/user-attachments/assets/03799514-50c0-4380-bfcc-c52602aeaf32" />



<img width="1908" height="1011" alt="image" src="https://github.com/user-attachments/assets/19e60859-da5e-4152-afa4-e5b0b5dbf099" />
