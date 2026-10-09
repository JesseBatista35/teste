Prezado(a),

Conforme solicitado em demanda, o atendimento foi realizado. O SIFGD-backend em DES (OKD4, namespace sifgd-des) foi analisado e os ajustes de esteira foram aplicados.

Ajustes realizados:

Runtime da aplicação adequado ao Java 25, versão com que o projeto é compilado.
Grupo de variáveis SIFGD-BACKEND-DES corrigido: a DB_URL ficou sem o parâmetro currentSchema, e o schema FUG passou a ser informado pela variável SPRING_DATASOURCE_HIKARI_SCHEMA. A aplicação conectou com sucesso ao banco DB2 (RJKDB2DSD0).

Pendências da equipe de desenvolvimento:

A release segue falhando porque as probes de readiness e liveness do OKD (/actuator/health/readiness e /actuator/health/liveness) retornam 404: o projeto não possui o Spring Boot Actuator. É necessário:
incluir a dependência spring-boot-starter-actuator no pom.xml;
configurar management.endpoint.health.probes.enabled=true;
caso utilize Spring Security, liberar o acesso a /actuator/health/**.
Após o ajuste, gerar nova build e nova release.
Para TQS, aplicar no grupo SIFGD-BACKEND-TQS o mesmo ajuste da DB_URL e da variável de schema, e renomear a variável USERNAME para DB_USERNAME.
O agente Elastic APM da imagem não é compatível com Java 25 e não inicializa. Isso não impede o funcionamento da aplicação, mas não há coleta de telemetria.
