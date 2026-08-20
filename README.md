
^C
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$ ps -ef | grep java
p585600   170138  134578  0 12:02 pts/1    00:00:00 grep --color=auto java
[p585600@caddeapllx1992 logs]$ ps -ef | grep jboss
p585600   170200  134578  0 12:02 pts/1    00:00:00 grep --color=auto jboss
[p585600@caddeapllx1992 logs]$ tail -f /logs/jboss/jboss-eap/standalone/siatd-intranet-vm/server.log
2026-08-20 11:53:37,050 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-4) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-08-20 11:53:37,065 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 71) WFLYUT0014: Criando identificador de arquivo para caminho de acesso '/opt/jboss-eap/welcome-content' com as opções [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2026-08-20 11:53:37,087 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-4) WFLYMAIL0001: Sessão de e-mail associada [java:jboss/mail/caixamail]
2026-08-20 11:53:37,087 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-4) WFLYMAIL0001: Sessão de e-mail associada [java:jboss/mail/sisou]
2026-08-20 11:53:55,045 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0022: O procedimento da implantação "siatdEAR.ear" foi revertido sem mensagem de falha
2026-08-20 11:53:55,047 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0022: O procedimento da implantação "applicationinsights-agent.jar" foi revertido sem mensagem de falha
2026-08-20 11:53:55,047 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0022: O procedimento da implantação "ojdbc17.jar" foi revertido sem mensagem de falha
2026-08-20 11:53:55,047 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0022: O procedimento da implantação "wmq.jmsra.rar" foi revertido sem mensagem de falha
2026-08-20 11:53:55,047 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0022: O procedimento da implantação "framework.jar" foi revertido sem mensagem de falha
2026-08-20 11:53:55,070 INFO  [org.jboss.as] (MSC service thread 1-3) WFLYSRV0050: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) interrompido em 2148ms
^C
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$ watch -2 "ss-tlnp | grep 9990"
watch: opção inválida -- “2”

Usage:
 watch [options] command

Options:
  -b, --beep             beep if command has a non-zero exit
  -c, --color            interpret ANSI color and style sequences
  -d, --differences[=<permanent>]
                         highlight changes between updates
  -e, --errexit          exit if command has a non-zero exit
  -g, --chgexit          exit when output from command changes
  -n, --interval <secs>  seconds to wait between updates
  -p, --precise          attempt run command in precise intervals
  -t, --no-title         turn off header
  -w, --no-wrap          turn off line wrapping
  -x, --exec             pass command to exec instead of "sh -c"

 -h, --help     display this help and exit
 -v, --version  output version information and exit

For more details see watch(1).
[p585600@caddeapllx1992 logs]$ watch -n 2 "ss-tlnp | grep 9990"
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$ watch -n 2 "ss -tlnp | grep 9990"
[p585600@caddeapllx1992 logs]$




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
   JAVA_OPTS="$JAVA_OPTS -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500"
   JAVA_OPTS="$JAVA_OPTS -Xbootclasspath/a:${JBOSS_HOME}/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar"
   JAVA_OPTS="$JAVA_OPTS -Xbootclasspath/a:${JBOSS_HOME}/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar"
   #JAVA_OPTS="$JAVA_OPTS -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager"
   JAVA_OPTS="$JAVA_OPTS -Dsun.util.logging.disableCallerCheck=true"
   JAVA_OPTS="$JAVA_OPTS -Djava.util.logging.manager=org.jboss.logmanager.LogManager"   
   #JAVA_OPTS="$JAVA_OPTS -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml"
   #JAVA_OPTS="$JAVA_OPTS -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm-1.15.0.properties -Delastic.apm.service_name=__SistemaNome__ -Delastic.apm.environment=__SistemaAmbiente__ -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=__URL_APM_SERVER__ -Delastic.apm.global_labels=deployment=__DEPLOYMENT__"
   JAVA_OPTS="$JAVA_OPTS -javaagent:$JBOSS_HOME/standalone/deployments/applicationinsights-agent.jar -Dapplicationinsights.configuration.file=$JBOSS_HOME/standalone/configuration/applicationinsights.json"
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

# CONFIGURACAO DE PROXY PARA O APPLICATION INSIGHTS

# Use system or custom proxies, but not BOTH.
JAVA_OPTS="$JAVA_OPTS -Djava.net.useSystemProxies=false"

# CUSTOM Proxies.
JAVA_OPTS="$JAVA_OPTS -Dhttp.proxyHost=__URL_PROXY__"
JAVA_OPTS="$JAVA_OPTS -Dhttp.proxyPort=80"

JAVA_OPTS="$JAVA_OPTS -Dhttps.proxyHost=__URL_PROXY__"
JAVA_OPTS="$JAVA_OPTS -Dhttps.proxyPort=80"

# NO_PROXY
JAVA_OPTS="$JAVA_OPTS -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa\|*.caixa.gov.br"

# enable garbage collection logging if not set in environment differently
if [ "x$GC_LOG" = "x" ]; then
   GC_LOG="true"
else
   echo "GC_LOG set in environment to $GC_LOG"
fi
