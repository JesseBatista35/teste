O driver é o ojdbc8-23.26.0.0.0.jar. No Maven/Nexus, o artefato é com.oracle.database.jdbc:ojdbc8:23.26.0.0.0.

1. jboss-deployments (novo, na raiz do SIGSJ-internet-config):

group_id:artifact_id:version:extension
com.oracle.database.jdbc:ojdbc8:23.26.0.0.0:jar

2. Nome do driver na datasource: com o SIROT vimos que a esteira grava o arquivo como artifact_id.extension, sem a versão (sirotcon-ejb.jar). Então o ojdbc deve chegar como ojdbc8.jar, e esse é o nome do driver:

xml
<datasource jndi-name="java:jboss/datasources/SIGSJ04" pool-name="SIGSJ04" enabled="true" use-java-context="true" statistics-enabled="true">
    <connection-url>__SIGSJ04_CONNECTION_STRING__</connection-url>
    <driver>ojdbc8.jar</driver>
    <pool>
        <min-pool-size>1</min-pool-size>
        <max-pool-size>50</max-pool-size>
        <flush-strategy>IdleConnections</flush-strategy>
    </pool>
    <security>
        <user-name>__SIGSJ04_USER__</user-name>
        <password>__SIGSJ04_PASSWORD__</password>
    </security>
    <timeout>
        <idle-timeout-minutes>5</idle-timeout-minutes>
    </timeout>
    <validation>
        <valid-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.oracle.OracleValidConnectionChecker"/>
        <validate-on-match>true</validate-on-match>
        <stale-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.oracle.OracleStaleConnectionChecker"/>
        <exception-sorter class-name="org.jboss.jca.adapters.jdbc.extensions.oracle.OracleExceptionSorter"/>
    </validation>
</datasource>

Esse bloco entra dentro de <datasources>, depois do ExampleDS.

3. Library SIGSJ-INTERNET-DES:

Variável	Valor	Secreta
SIGSJ04_CONNECTION_STRING	jdbc:oracle:thin:@//HOST:PORTA/SERVICE	não
SIGSJ04_USER	usuário do SIGSJ04	não
SIGSJ04_PASSWORD	senha	sim

Host, porta, service e usuário ainda dependem do time do SIGSJ.

Antes de subir, confira duas coisas:

Nome do driver: abra o jboss-deployments do SICLI-ncc-config. Se ali estiver ...:db2jcc4:... e o driver do standalone for db2jcc4.36.6.jar, então a esteira mantém a versão no nome em algum caso, e o <driver> vira ojdbc8-23.26.0.0.0.jar. Depois da release, o log confirma o nome real:
bash
  grep -n "WFLYJCA0018" /logs/jboss/jboss-eap/standalone/sigsj-internet/server.log | tail -3

O que aparecer em nome-do-driver = ... é o que vai no <driver>.

Nexus: confirme que o com.oracle.database.jdbc:ojdbc8:23.26.0.0.0 existe no binario.caixa.

Quer que eu monte o standalone-full-ha.xml completo do internet com a datasource? Para isso, me manda o arquivo atual do SIGSJ-internet-config.
