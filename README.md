sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cat ~/.bash_history 2>/dev/null | grep -i "port-offset\|CSD2\|CSD6"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cat /root/.bash_history 2>/dev/null | grep -i "port-offset\|CSD2\|CSD6"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -i "port-offset\|Command Line" /home/siaoi/jboss-eap-6.4/CSD6/log/server.log | head -5
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la /etc/systemd/system/ | grep -i siaoi
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ -sh-4.2$ cat /etc/jboss-as/jboss-as.conf
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
-sh: -sh-4.2$: command not found
-sh-4.2$ # General configuration for the init.d scripts,
-sh-4.2$ # not necessarily for JBoss AS itself.
-sh-4.2$
-sh-4.2$ # The username who should own the process.
-sh-4.2$ #
-sh-4.2$ JBOSS_HOME=/home/siaoi/jboss-eap-6.4
-sh-4.2$ JBOSS_USER=root
-sh-4.2$
-sh-4.2$ # The amount of time to wait for startup
-sh-4.2$ #
-sh-4.2$ STARTUP_WAIT=30
-sh-4.2$
-sh-4.2$ # The amount of time to wait for shutdown
-sh-4.2$ #
-sh-4.2$ SHUTDOWN_WAIT=30
-sh-4.2$
-sh-4.2$ # Location to keep the console log
-sh-4.2$ #
-sh-4.2$ # JBOSS_CONSOLE_LOG=/var/log/jboss-as/console.log
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: command not found
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: command not found
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: command not found
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: command not found
-sh-4.2$ -sh-4.2$ grep -r "port-offset\|socket-binding" /home/siaoi/jboss-eap-6.4/CSD2/configuration/standalone.xml | head -5
-sh: -sh-4.2$: command not found
-sh-4.2$                 <socket-binding native="management-native"/>
-sh: syntax error near unexpected token `newline'
-sh-4.2$                 <socket-binding http="management-http"/>
-sh: syntax error near unexpected token `newline'
-sh-4.2$                 <smtp-server outbound-socket-binding-ref="mail-smtp"/>
-sh: syntax error near unexpected token `newline'
-sh-4.2$             <connector name="remoting-connector" socket-binding="remoting" security-realm="ApplicationRealm"/>
-sh: syntax error near unexpected token `newline'
-sh-4.2$             <recovery-environment socket-binding="txn-recovery-environment" status-socket-binding="txn-status-manager"/>
-sh: syntax error near unexpected token `newline'
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: command not found
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: command not found
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: command not found
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: command not found
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: command not found
-sh-4.2$ -sh-4.2$ grep -r "port-offset\|socket-binding" /home/siaoi/jboss-eap-6.4/CSD6/configuration/standalone.xml | head -5
-sh: -sh-4.2$: command not found
-sh-4.2$                 <socket-binding native="management-native"/>
-sh: syntax error near unexpected token `newline'
-sh-4.2$                 <socket-binding http="management-http"/>
-sh: syntax error near unexpected token `newline'
-sh-4.2$                 <smtp-server outbound-socket-binding-ref="mail-smtp"/>
-sh: syntax error near unexpected token `newline'
-sh-4.2$             <connector name="remoting-connector" socket-binding="remoting" security-realm="ApplicationRealm"/>
-sh: syntax error near unexpected token `newline'
-sh-4.2$             <recovery-environment socket-binding="txn-recovery-environment" status-socket-binding="txn-status-manager"/>
-sh: syntax error near unexpected token `newline'
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: command not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la /etc/jboss-as/
total 16
drwxrwxrwx    2 root root   27 Nov  3  2025 .
drwxr-xr-x. 103 root root 8192 Aug 22 23:34 ..
-rwxrwxrwx    1 root root  396 Jun 27  2023 jboss-as.conf
-sh-4.2$ netstat -tlnp 2>/dev/null | grep java
-sh-4.2$
