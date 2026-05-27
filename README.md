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

# =============================================================
# CORRECAO: Versao do Application Insights Agent
# Ajuste a versao abaixo conforme necessario (3.3.1 ou 3.5.1)
# =============================================================
ARG APPINSIGHTS_VERSION=3.3.1

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

# =============================================================
# CORRECAO: Cria o diretorio e baixa o Application Insights JAR
# durante o build da imagem.
#
# OPCAO A (usada aqui): Download direto do Maven Central.
# Requer acesso a internet durante o build.
#
# OPCAO B (sem internet no build): Remova o bloco RUN abaixo e
# descomente a linha COPY, colocando o JAR em:
# src/main/docker/agents/com.microsoft.azure.applicationinsights-agent-3.3.1.jar
# =============================================================
RUN mkdir -p /deployments/lib/main \
    && curl -L \
       https://repo1.maven.org/maven2/com/microsoft/azure/applicationinsights-agent/${APPINSIGHTS_VERSION}/applicationinsights-agent-${APPINSIGHTS_VERSION}.jar \
       -o /deployments/lib/main/com.microsoft.azure.applicationinsights-agent-${APPINSIGHTS_VERSION}.jar \
    && chown -R 1001:root /deployments/lib/main \
    && chmod -R g+rwX /deployments/lib/main

# OPCAO B - descomente se nao houver acesso a internet no build:
# COPY --chown=1001 src/main/docker/agents/com.microsoft.azure.applicationinsights-agent-3.3.1.jar \
#      /deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar

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
