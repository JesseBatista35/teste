[root@sbrdeapllx099 bin]# find /opt/jboss -type d -name "deployments" 2>/dev/null
/opt/jboss/jboss-eap/standalone/deployments
[root@sbrdeapllx099 bin]# find /opt/jboss -name "*.ear" -o -name "*.war" 2>/dev/null | head -20
/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099/siosp-1.0.0.56-1.0.0.56-b362.ear.siosp-web.war
/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099/siosp-1.0.0.56-1.0.0.56-b362.ear.siosp-api.war
/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099/siosp-1.0.0.56-1.0.0.56-b363.ear.siosp-web.war
/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099/siosp-1.0.0.56-1.0.0.56-b363.ear.siosp-api.war
/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099/siosp-1.0.0.56-1.0.0.56-b364.ear.siosp-web.war
/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099/siosp-1.0.0.56-1.0.0.56-b364.ear.siosp-api.war
/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099/siosp-1.0.0.57-1.0.0.57-b365.ear.siosp-web.war
/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099/siosp-1.0.0.57-1.0.0.57-b365.ear.siosp-api.war
/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099/siosp-1.0.0.57-1.0.0.57-b366.ear.siosp-web.war
/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099/siosp-1.0.0.57-1.0.0.57-b366.ear.siosp-api.war
/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099/siosp-1.0.0.58-1.0.0.58-b367.ear.siosp-web.war
/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099/siosp-1.0.0.58-1.0.0.58-b367.ear.siosp-api.war
/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099/siosp-1.0.0.59-1.0.0.59-b368.ear.siosp-web.war
/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099/siosp-1.0.0.59-1.0.0.59-b368.ear.siosp-api.war
/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099/siosp-1.0.0.59-1.0.0.59-b369.ear.siosp-web.war
/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099/siosp-1.0.0.59-1.0.0.59-b369.ear.siosp-api.war
/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099/siosp-1.0.0.59-1.0.0.59-b370.ear.siosp-web.war
/opt/jboss/jboss-eap/hc/tmp/servers/siosp_node1_lx099/siosp-1.0.0.59-1.0.0.59-b370.ear.siosp-api.war
/opt/jboss/jboss-eap/hc/tmp/servers/sigfi_fgc_node1_lx099/sigfi-fgc-1.0.0.14-1.0.0.14-b131.ear.sigfi-fgc-web.war
/opt/jboss/jboss-eap/hc/tmp/servers/sigfi_fgc_node1_lx099/sigfi-fgc-1.0.0.14-1.0.0.14-b131.ear.sigfi-fgc-api.war
[root@sbrdeapllx099 bin]# grep -i "deployment" /opt/jboss/jboss-eap/hc/configuration/domain.xml | head -10
                            <permission class-name="org.wildfly.extension.batch.jberet.deployment.BatchPermission" module="org.wildfly.extension.batch.jberet" target-name="*"/>
                            <permission class-name="org.wildfly.extension.batch.jberet.deployment.BatchPermission" module="org.wildfly.extension.batch.jberet" target-name="*"/>
                <deployment-permissions>
                </deployment-permissions>
                            <permission class-name="org.wildfly.extension.batch.jberet.deployment.BatchPermission" module="org.wildfly.extension.batch.jberet" target-name="*"/>
                            <permission class-name="org.wildfly.extension.batch.jberet.deployment.BatchPermission" module="org.wildfly.extension.batch.jberet" target-name="*"/>
                <deployment-permissions>
                </deployment-permissions>
                            <permission class-name="org.wildfly.extension.batch.jberet.deployment.BatchPermission" module="org.wildfly.extension.batch.jberet" target-name="*"/>
                            <permission class-name="org.wildfly.extension.batch.jberet.deployment.BatchPermission" module="org.wildfly.extension.batch.jberet" target-name="*"/>
[root@sbrdeapllx099 bin]#



mais a aplicação não é a simcn que estamos mechedo?
