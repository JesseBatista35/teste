Precisamos da inclusão das Properties abaixo no standalone do SISMH para Propriedades necessárias para validação e acesso a api do sistema
<property name="sismh.api.keycloak.public.key" value="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB"/>
<property name="sismh.api.clients.servico.id" value="cli-ser-smh"/>



## -*- shell-script -*- ######################################################
##                                                                          ##
##  JBoss EAP Bootstrap Script Configuration                                ##
##                                                                          ##
##############################################################################
#
# This file is optional; it may be removed if not needed.
#

#
# Specify the maximum file descriptor limit, use "max" or "maximum" to use
# the default, as queried by the system.
#
# Defaults to "maximum"
#
#MAX_FD="maximum"

#
# Specify the profiler configuration file to load.
#
# Default is to not load profiler configuration file.
#
#PROFILER=""

#
# Specify the location of the Java home directory.  If set then $JAVA will
# be defined to $JAVA_HOME/bin/java, else $JAVA will be "java".
#
#JAVA_HOME="/opt/java/jdk"

#
# Specify the exact Java VM executable to use.
#
#JAVA=""

if [ "x$JBOSS_MODULES_SYSTEM_PKGS" = "x" ]; then
  JBOSS_MODULES_SYSTEM_PKGS="org.jboss.byteman,org.jboss.logmanager"
fi

# Uncomment the following line to prevent manipulation of JVM options
# by shell scripts.
#
#PRESERVE_JAVA_OPTS=true

#
# Specify options to pass to the Java VM.
#
if [ "x$JAVA_OPTS" = "x" ]; then
   JAVA_OPTS="-Xms__JVM_HEAP_MIN__ -Xmx__JVM_HEAP_MAX__ -XX:MetaspaceSize=__JVM_METASPACE_MIN__ -XX:MaxMetaspaceSize=__JVM_METASPACE_MAX__ -Djava.net.preferIPv4Stack=true"
   JAVA_OPTS="$JAVA_OPTS -Djboss.modules.system.pkgs=$JBOSS_MODULES_SYSTEM_PKGS -Djava.awt.headless=true"
   JAVA_OPTS="$JAVA_OPTS -Djavax.net.ssl.trustStore=$JBOSS_HOME/standalone/configuration/__JKS_FILE__ -Djavax.net.ssl.trustStorePassword=__PASSWORD_TRUSTSTORE__"
   JAVA_OPTS="$JAVA_OPTS -Djboss.modules.policy-permissions=true"
   JAVA_OPTS="$JAVA_OPTS -Xbootclasspath/a:$JBOSS_HOME/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar:$JBOSS_HOME/modules/system/layers/base/org/jboss/log4j/logmanager/main/log4j-jboss-logmanager-1.2.0.Final-redhat-00001.jar:$JBOSS_HOME/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar"
   JAVA_OPTS="$JAVA_OPTS -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager"
   JAVA_OPTS="$JAVA_OPTS -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dsun.util.logging.disableCallerCheck=true"   
   JAVA_OPTS="$JAVA_OPTS -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500"
   #JAVA_OPTS="--module-path $JBOSS_HOME/modules/system/layers/base/org/bouncycastle/bcprov/main/bcprov-jdk15on-1.68.0.redhat-00005.jar"
   #JAVA_OPTS="$JAVA_OPTS -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml"
   #JAVA_OPTS="$JAVA_OPTS -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm-1.15.0.properties -Delastic.apm.service_name=__SistemaNome__ -Delastic.apm.environment=__SistemaAmbiente__ -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=__URL_APM_SERVER__ -Delastic.apm.global_labels=deployment=__DEPLOYMENT__"

else
   echo "JAVA_OPTS already set in environment; overriding default settings with values: $JAVA_OPTS"
fi

# Sample JPDA settings for remote socket debugging
#JAVA_OPTS="$JAVA_OPTS -agentlib:jdwp=transport=dt_socket,address=8787,server=y,suspend=n"

# Sample JPDA settings for shared memory debugging
#JAVA_OPTS="$JAVA_OPTS -agentlib:jdwp=transport=dt_shmem,server=y,suspend=n,address=jboss"

# Uncomment to not use JBoss Modules lockless mode
#JAVA_OPTS="$JAVA_OPTS -Djboss.modules.lockless=false"

# Uncomment to gather JBoss Modules metrics
#JAVA_OPTS="$JAVA_OPTS -Djboss.modules.metrics=true"

# Uncomment this to run with a security manager enabled
# SECMGR="true"

# Uncomment this in order to be able to run WildFly on FreeBSD
# when you get "epoll_create function not implemented" message in dmesg output
#JAVA_OPTS="$JAVA_OPTS -Djava.nio.channels.spi.SelectorProvider=sun.nio.ch.PollSelectorProvider"

# Use system or custom proxies, but not BOTH.
JAVA_OPTS="$JAVA_OPTS -Djava.net.useSystemProxies=false"


# enable garbage collection logging if not set in environment differently
if [ "x$GC_LOG" = "x" ]; then
   GC_LOG="true"
else
   echo "GC_LOG set in environment to $GC_LOG"
fi
