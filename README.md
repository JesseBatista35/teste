
-sh-4.2$ cat /etc/jboss-as/jboss-as.conf
# General configuration for the init.d scripts,
# not necessarily for JBoss AS itself.

# The username who should own the process.
#
JBOSS_HOME=/home/siaoi/jboss-eap-6.4
JBOSS_USER=root

# The amount of time to wait for startup
#
STARTUP_WAIT=30

# The amount of time to wait for shutdown
#
SHUTDOWN_WAIT=30

# Location to keep the console log
#
# JBOSS_CONSOLE_LOG=/var/log/jboss-as/console.log
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -r "port-offset\|socket-binding" /home/siaoi/jboss-eap-6.4/CSD2/configuration/standalone.xml | head -5
                <socket-binding native="management-native"/>
                <socket-binding http="management-http"/>
                <smtp-server outbound-socket-binding-ref="mail-smtp"/>
            <connector name="remoting-connector" socket-binding="remoting" security-realm="ApplicationRealm"/>
            <recovery-environment socket-binding="txn-recovery-environment" status-socket-binding="txn-status-manager"/>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -r "port-offset\|socket-binding" /home/siaoi/jboss-eap-6.4/CSD6/configuration/standalone.xml | head -5
                <socket-binding native="management-native"/>
                <socket-binding http="management-http"/>
                <smtp-server outbound-socket-binding-ref="mail-smtp"/>
            <connector name="remoting-connector" socket-binding="remoting" security-realm="ApplicationRealm"/>
            <recovery-environment socket-binding="txn-recovery-environment" status-socket-binding="txn-status-manager"/>
-sh-4.2$
