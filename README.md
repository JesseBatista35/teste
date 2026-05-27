

Favor verificar, Estou tentando realizar o deploy em DES e TQS do sisgf-back, porém o mesmo não inicia. Fica dando time out

https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=475720&environmentId=2216198




LOG DA RELEASE AZUREDEVIPS CLASSIC:


2026-05-27T14:43:08.0845350Z ##[section]Starting: Verificando Status do Deployment
2026-05-27T14:43:08.0851248Z ==============================================================================
2026-05-27T14:43:08.0851331Z Task         : Bash
2026-05-27T14:43:08.0851414Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-05-27T14:43:08.0851477Z Version      : 3.227.0
2026-05-27T14:43:08.0851532Z Author       : Microsoft Corporation
2026-05-27T14:43:08.0851619Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-05-27T14:43:08.0851695Z ==============================================================================
2026-05-27T14:43:08.2578982Z Generating script.
2026-05-27T14:43:08.2588128Z ========================== Starting Command Output ===========================
2026-05-27T14:43:08.2595348Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/fcbda942-6805-4e2f-8613-afc713d09955.sh
2026-05-27T14:43:08.3445058Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-05-27T14:43:11.1743067Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-05-27T14:43:11.2922494Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-05-27T14:49:15.5954431Z ##[error]The task has timed out.
2026-05-27T14:49:15.5955974Z ##[section]Finishing: Verificando Status do Deployment










LOG DO OKS:   POD: 
sisgf-backend-des-216-wldnz



exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
Error occurred during initialization of VM
agent library failed to init: instrument
Error opening zip file or JAR manifest missing : /deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar




NOTA QUE OUTRO ANALISTA COLOCOU:


À CAIXA,

Prezados,


Identificado erro no processo de deploy relacionado à inicialização da JVM durante o start da aplicação no container. O log apresenta a seguinte falha:

exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent
Error occurred during initialization of VM
agent library failed to init: instrument
Error opening zip file or JAR manifest missing : /deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.5.1.jar


O container não possui o arquivo do agente Application Insights no caminho esperado. O parâmetro -javaagent está configurado, porém o arquivo JAR não está sendo incluído na imagem durante o build do Docker.


A JVM falha na inicialização, impedindo que a aplicação suba corretamente. Como consequência, o pod não atinge o estado Ready, o rollout do deployment não é concluído e a pipeline falha por timeout.


Ajustar o Dockerfile para garantir que o arquivo applicationinsights-agent-3.5.1.jar seja copiado para o diretório /deployments/lib/main/ durante o processo de build da imagem.


Após a correção, a JVM deve iniciar normalmente, o container deve subir sem falhas e o deployment deve concluir com sucesso.


o dokefilie ta asim:



####
# This Dockerfile is used in order to build a container that runs the Quarkus application in JVM mode
#
# Before building the container image run:
#
# ./mvnw package
#
# Then, build the image with:
#
# docker build -f src/main/docker/Dockerfile.jvm -t quarkus/sisgf-backend-jvm .
#
# Then run the container using:
#
# docker run -i --rm -p 8080:8080 quarkus/sisgf-backend-jvm
#
# If you want to include the debug port into your docker image
# you will have to expose the debug port (default 5005) like this :  EXPOSE 8080 5050
#
# Then run the container using :
#
# docker run -i --rm -p 8080:8080 -p 5005:5005 -e JAVA_ENABLE_DEBUG="true" quarkus/sisgf-backend-jvm
#
###
FROM registry.access.redhat.com/ubi8/ubi-minimal:8.3 

ARG JAVA_PACKAGE=java-11-openjdk-headless
ARG RUN_JAVA_VERSION=1.3.8
ENV LANG='en_US.UTF-8' LANGUAGE='en_US:en'
# Install java and the run-java script
# Also set up permissions for user `1001`
RUN microdnf install curl ca-certificates ${JAVA_PACKAGE} \
    && microdnf update \
    && microdnf clean all \
    && mkdir /deployments \
    && chown 1001 /deployments \
    && chmod "g+rwX" /deployments \
    && chown 1001:root /deployments \
    && curl https://repo1.maven.org/maven2/io/fabric8/run-java-sh/${RUN_JAVA_VERSION}/run-java-sh-${RUN_JAVA_VERSION}-sh.sh -o /deployments/run-java.sh \
    && chown 1001 /deployments/run-java.sh \
    && chmod 540 /deployments/run-java.sh \
    && echo "securerandom.source=file:/dev/urandom" >> /etc/alternatives/jre/lib/security/java.security

# Configure the JAVA_OPTIONS, you can add -XshowSettings:vm to also display the heap size.
ENV JAVA_OPTIONS="-Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager"
# We make four distinct layers so if there are application changes the library layers can be re-used
COPY --chown=1001 target/quarkus-app/lib/ /deployments/lib/
COPY --chown=1001 target/quarkus-app/*.jar /deployments/
COPY --chown=1001 target/quarkus-app/app/ /deployments/app/
COPY --chown=1001 target/quarkus-app/quarkus/ /deployments/quarkus/

EXPOSE 8080
USER 1001

ENTRYPOINT [ "/deployments/run-java.sh" ]

