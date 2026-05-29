####
# This Dockerfile is used in order to build a container that runs the Quarkus application in JVM mode
#
# Before building the container image run:
#
# ./mvnw package
#
# Then, build the image with:
#
# docker build -f src/main/docker/Dockerfile.jvm -t quarkus/siopm-micro-jvm .
#
# Then run the container using:
#
# docker run -i --rm -p 8080:8080 quarkus/siopm-micro-jvm
#
# If you want to include the debug port into your docker image
# you will have to expose the debug port (default 5005) like this :  EXPOSE 8080 5005
#
# Then run the container using :
#
# docker run -i --rm -p 8080:8080 -p 5005:5005 -e JAVA_ENABLE_DEBUG="true" quarkus/siopm-micro-jvm
#
###
FROM registry.access.redhat.com/ubi8/ubi-minimal:8.4 
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
    && echo "securerandom.source=file:/dev/urandom" >> /etc/alternatives/jre/conf/security/java.security
# Configure the JAVA_OPTIONS, you can add -XshowSettings:vm to also display the heap size.
ENV JAVA_OPTIONS="-Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager"
# We make four distinct layers so if there are application changes the library layers can be re-used
COPY --chown=1001 target/quarkus-app/lib/ /deployments/lib/
COPY --chown=1001 target/quarkus-app/*.jar /deployments/
COPY --chown=1001 target/quarkus-app/app/ /deployments/app/
COPY --chown=1001 target/quarkus-app/quarkus/ /deployments/quarkus/

# Script para exportar secrets do BeyondTrust como variáveis de ambiente
RUN echo '#!/bin/bash' > /deployments/export-secrets.sh && \
    echo 'export SIFUG_DATASOURCE_02=$(cat /usr/src/app/secrets_files/SIOFG_DES/SIFUG_DATASOURCE_02 2>/dev/null)' >> /deployments/export-secrets.sh && \
    echo 'export SIFUG_DATASOURCE_15=$(cat /usr/src/app/secrets_files/SIOFG_DES/SIFUG_DATASOURCE_15 2>/dev/null)' >> /deployments/export-secrets.sh && \
    echo 'export SIOFG_XMQD1=$(cat /usr/src/app/secrets_files/SIOFG_DES/SIOFG_XMQD1 2>/dev/null)' >> /deployments/export-secrets.sh && \
    echo 'export SIFUG_BT_APIKEY=$(cat /usr/src/app/secrets_files/SIOFG_DES/SIFUG_BT_APIKEY 2>/dev/null)' >> /deployments/export-secrets.sh && \
    echo 'export CLISERFUG_SSO_INTER=$(cat /usr/src/app/secrets_files/SIOFG_DES/CLISERFUG_SSO_INTER 2>/dev/null)' >> /deployments/export-secrets.sh && \
    chmod +x /deployments/export-secrets.sh

EXPOSE 8080
USER 1001
ENTRYPOINT [ "sh", "-c", "/deployments/export-secrets.sh && /deployments/run-java.sh" ]
