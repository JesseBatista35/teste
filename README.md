Nota de encerramento – SIJUR-middleware-backend-v2 (DES) – Release 532811

Diagnóstico: a falha não é da esteira de deploy. A pipeline executou corretamente. O pod da nova versão não inicializa, fica em CrashLoopBackOff e o rollout expira por timeout na etapa "Verificando Status do Deployment".

Erro da aplicação:
BeanCreationException: Error creating bean with name 'logRepository' – Not a managed type: class br.com.sijur.componentes.model.Log

Causa raiz: o pom.xml declara a dependência br.com.caixa.sijur:SIJUR-componentes duas vezes, nas versões 1.0.29 e 1.0.25-SNAPSHOT. O Maven considera a última declaração, então a imagem 2.0.0.56 foi gerada com a SIJUR-componentes-1.0.25-SNAPSHOT.jar. A análise do jar mostrou que a entidade Log dessa versão usa anotações javax.persistence, incompatíveis com Spring Boot 3.5 / Hibernate 6.6, que reconhecem apenas jakarta.persistence. Por isso a classe não é reconhecida como entidade JPA.

Evidências:

A imagem 2.0.0.51 (deployment 31) segue em execução normal. A falha ocorre a partir da imagem 2.0.0.56 (deployments 33 a 35).
O jar da aplicação contém somente jakarta.persistence-api-3.1.0 e a lib SIJUR-componentes-1.0.25-SNAPSHOT.jar, com a classe Log anotada com javax.persistence.Entity.

Ação necessária (equipe de desenvolvimento):

Remover do pom.xml a declaração da SIJUR-componentes versão 1.0.25-SNAPSHOT, mantendo apenas a versão compatível com Jakarta (confirmar a 1.0.29).
Gerar novo build e novo release.

Observações (não impedem a inicialização):

Não há profile Spring ativo, então o application-des.yaml não é carregado. Caso seja necessário, podemos incluir SPRING_PROFILES_ACTIVE=des no grupo de variáveis SIJUR-MIDDLEWARE-BACKEND-V2-DES, mediante solicitação.
O log em arquivo aponta para /sijur/logs, diretório inexistente no container. Recomenda-se log apenas em stdout, ou definir PATH_DESTINO para um diretório gravável.
O agente Elastic APM presente na imagem é incompatível com Java 21 e não inicializa.
Há credenciais de banco em texto claro no application-des.yaml versionado. Recomenda-se movê-las para secret ou variáveis do release.

Não há ajuste de esteira ou de variáveis a realizar para a falha principal. Demanda encerrada, com orientação à equipe de desenvolvimento para correção no código.
