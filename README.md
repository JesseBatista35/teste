
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -n -A30 -E 'java:/(db2cmu|db2cdm)' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml \
>   | grep -E 'jndi-name|connection-url|currentSchema|TQS|DES|user-name|security-domain'
146:                <datasource jta="false" jndi-name="java:/db2cmu" pool-name="db2cmu" enabled="true">
147-                    <connection-url>jdbc:db2://10.216.80.110:448/RJKDB2DSD0</connection-url>
149-                    <connection-property name="currentSchema">
150-                        DESCMU
161-                        <user-name>SCMUDR01</user-name>
178:                <datasource jta="false" jndi-name="java:/db2cdm" pool-name="db2cdm" enabled="true">
179-                    <connection-url>jdbc:db2://10.216.80.110:448/RJKDB2DSD0</connection-url>
181-                    <connection-property name="currentSchema">
182-                        DESCMU
193-                        <user-name>SCMUDR01</user-name>
-sh-4.2$
-sh-4.2$
-sh-4.2$ hostname -i
10.116.200.228
-sh-4.2$ hostname -f
caddeapllx2484.agil.nprd.caixa.gov.br
-sh-4.2$




[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]# sed -n '160,176p;192,208p' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml \
>   | sed -E 's#(<password>)[^<]*#\1*****#'
                    <security>
                        <user-name>SCMUTR01</user-name>
                        <password>*****</password>
                    </security>
                    <validation>
                        <valid-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2ValidConnectionChecker"/>
                        <validate-on-match>true</validate-on-match>
                        <background-validation>false</background-validation>
                        <stale-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2StaleConnectionChecker"/>
                        <exception-sorter class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2ExceptionSorter"/>
                    </validation>
                    <timeout>
                        <idle-timeout-minutes>5</idle-timeout-minutes>
                    </timeout>
                    <statement>
                        <track-statements>true</track-statements>
                    </statement>
                    <security>
                        <user-name>SCMUTR01</user-name>
                        <password>*****</password>
                    </security>
                    <validation>
                        <valid-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2ValidConnectionChecker"/>
                        <validate-on-match>true</validate-on-match>
                        <background-validation>false</background-validation>
                        <stale-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2StaleConnectionChecker"/>
                        <exception-sorter class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2ExceptionSorter"/>
                    </validation>
                    <timeout>
                        <idle-timeout-minutes>5</idle-timeout-minutes>
                    </timeout>
                    <statement>
                        <track-statements>true</track-statements>
                    </statement>
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]# hostname -i
10.116.201.150
[root@caddeapllx2540 /]# hostname -f
caddeapllx2540.agil.nprd.caixa.gov.br
[root@caddeapllx2540 /]#

