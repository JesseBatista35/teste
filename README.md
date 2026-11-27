
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]# grep -n -B2 -A14 -E 'java:/(db2cmu|db2cdm)' /opt/jboss-eap/standalone/configuration/standalone*.xml \
>   | sed -E 's#(<password>)[^<]*#\1*****#'
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-144-        <subsystem xmlns="urn:jboss:domain:datasources:4.0">
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-145-            <datasources>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml:146:                <datasource jta="false" jndi-name="java:/db2cmu" pool-name="db2cmu" enabled="true">
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-147-                    <connection-url>jdbc:db2://10.216.80.111:446/RJKDB2DSDH</connection-url>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-148-                    <driver-class>com.ibm.db2.jcc.DB2Driver</driver-class>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-149-                    <connection-property name="currentSchema">
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-150-                        TQSCMU
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-151-                    </connection-property>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-152-                    <driver>db2</driver>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-153-                    <pool>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-154-                        <min-pool-size>5</min-pool-size>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-155-                        <max-pool-size>20</max-pool-size>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-156-                        <prefill>true</prefill>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-157-                        <use-strict-min>true</use-strict-min>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-158-                        <flush-strategy>FailingConnectionOnly</flush-strategy>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-159-                    </pool>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-160-                    <security>
--
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-176-                    </statement>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-177-                </datasource>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml:178:                <datasource jta="false" jndi-name="java:/db2cdm" pool-name="db2cdm" enabled="true">
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-179-                    <connection-url>jdbc:db2://10.216.80.111:446/RJKDB2DSDH</connection-url>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-180-                    <driver-class>com.ibm.db2.jcc.DB2Driver</driver-class>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-181-                    <connection-property name="currentSchema">
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-182-                        TQSCMU
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-183-                    </connection-property>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-184-                    <driver>db2</driver>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-185-                    <pool>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-186-                        <min-pool-size>5</min-pool-size>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-187-                        <max-pool-size>20</max-pool-size>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-188-                        <prefill>true</prefill>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-189-                        <use-strict-min>true</use-strict-min>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-190-                        <flush-strategy>FailingConnectionOnly</flush-strategy>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-191-                    </pool>
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml-192-                    <security>
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]# /opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources:read-children-names(child-type=data-source)"

Failed to connect to the controller: The controller is not available at localhost:9990: java.net.ConnectException: WFLYPRT0023: Não foi possível conectar-se ao remote+http://localhost:9990. A conexão entrou atingiu o tempo limite: WFLYPRT0023: Não foi possível conectar-se ao remote+http://localhost:9990. A conexão entrou atingiu o tempo limite
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]# /opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=db2cmu:test-connection-in-pool"
{
    "outcome" => "failed",
    "failure-description" => "WFLYJCA0040: falha ao invocar a operação: WFLYJCA0047: A conexão não é válida",
    "rolled-back" => true
}
[root@caddeapllx2540 /]# grep -rn -iE 'db2cmu|db2cdm|user|usuario' /opt/jboss-eap/standalone/configuration/*.properties 2>/dev/null \
>   | sed -E 's#(pass[a-z]*[=:]).*#\1*****#I'
/opt/jboss-eap/standalone/configuration/application-roles.properties:2:# Properties declaration of users roles for the realm 'ApplicationRealm' which is the default realm
/opt/jboss-eap/standalone/configuration/application-roles.properties:7:# Users can be added to this properties file at any time, updates after the server has started
/opt/jboss-eap/standalone/configuration/application-roles.properties:11:# username=role1,role2,role3
/opt/jboss-eap/standalone/configuration/application-roles.properties:13:# A utility script is provided which can be executed from the bin folder to add the users: -
/opt/jboss-eap/standalone/configuration/application-roles.properties:15:#  bin/add-user.sh
/opt/jboss-eap/standalone/configuration/application-roles.properties:18:#  bin\add-user.bat
/opt/jboss-eap/standalone/configuration/application-roles.properties:20:# The following illustrates how an admin user could be defined.
/opt/jboss-eap/standalone/configuration/application-roles.properties:22:#admin=PowerUser,BillingAdmin,
/opt/jboss-eap/standalone/configuration/application-users.properties:2:# Properties declaration of users for the realm 'ApplicationRealm' which is the default realm
/opt/jboss-eap/standalone/configuration/application-users.properties:7:# Users can be added to this properties file at any time, updates after the server has started
/opt/jboss-eap/standalone/configuration/application-users.properties:11:# username=HEX( MD5( username ':' realm ':' password))
/opt/jboss-eap/standalone/configuration/application-users.properties:13:# A utility script is provided which can be executed from the bin folder to add the users: -
/opt/jboss-eap/standalone/configuration/application-users.properties:15:#  bin/add-user.sh
/opt/jboss-eap/standalone/configuration/application-users.properties:18:#  bin\add-user.bat
/opt/jboss-eap/standalone/configuration/application-users.properties:20:#$REALM_NAME=ApplicationRealm$ This line is used by the add-user utility to identify the realm name already used in this file.
/opt/jboss-eap/standalone/configuration/application-users.properties:22:# The following illustrates how an admin user could be defined, this
/opt/jboss-eap/standalone/configuration/mgmt-groups.properties:2:# Properties declaration of users groups for the realm 'ManagementRealm'.
/opt/jboss-eap/standalone/configuration/mgmt-groups.properties:4:# This is used for domain management, users groups membership information is used to assign the user
/opt/jboss-eap/standalone/configuration/mgmt-groups.properties:7:# Users can be added to this properties file at any time, updates after the server has started
/opt/jboss-eap/standalone/configuration/mgmt-groups.properties:11:# username=role1,role2,role3
/opt/jboss-eap/standalone/configuration/mgmt-groups.properties:13:# A utility script is provided which can be executed from the bin folder to add the users: -
/opt/jboss-eap/standalone/configuration/mgmt-groups.properties:15:#  bin/add-user.sh
/opt/jboss-eap/standalone/configuration/mgmt-groups.properties:18:#  bin\add-user.bat
/opt/jboss-eap/standalone/configuration/mgmt-groups.properties:20:# The following illustrates how an admin user could be defined.
/opt/jboss-eap/standalone/configuration/mgmt-groups.properties:22:#admin=PowerUser,BillingAdmin,
/opt/jboss-eap/standalone/configuration/mgmt-users.properties:2:# Properties declaration of users for the realm 'ManagementRealm' which is the default realm
/opt/jboss-eap/standalone/configuration/mgmt-users.properties:6:# Users can be added to this properties file at any time, updates after the server has started
/opt/jboss-eap/standalone/configuration/mgmt-users.properties:10:# username=HEX( MD5( username ':' realm ':' password))
/opt/jboss-eap/standalone/configuration/mgmt-users.properties:12:# A utility script is provided which can be executed from the bin folder to add the users: -
/opt/jboss-eap/standalone/configuration/mgmt-users.properties:14:#  bin/add-user.sh
/opt/jboss-eap/standalone/configuration/mgmt-users.properties:17:#  bin\add-user.bat
/opt/jboss-eap/standalone/configuration/mgmt-users.properties:19:#$REALM_NAME=ManagementRealm$ This line is used by the add-user utility to identify the realm name already used in this file.
/opt/jboss-eap/standalone/configuration/mgmt-users.properties:21:# On start-up the server will also automatically add a user $local - this user is specifically
/opt/jboss-eap/standalone/configuration/mgmt-users.properties:24:# The following illustrates how an admin user could be defined, this
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
