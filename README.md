
-sh-4.2$
-sh-4.2$ cat /home/siaoi/scripts/jboss-eap6.sh | head -50
#!/bin/sh
#
# JBoss standalone control script
#
# chkconfig: - 80 20
# description: JBoss AS Standalone
# processname: standalone
# pidfile: /var/run/jboss-as/jboss-as-standalone.pid
# config: /etc/jboss-as/jboss-as.conf

# Source function library.
. /etc/init.d/functions

# Load Java configuration.
[ -r /etc/java/java.conf ] && . /etc/java/java.conf
export JAVA_HOME

# Load JBoss AS init.d configuration.
if [ -z "$JBOSS_CONF" ]; then
  JBOSS_CONF="/etc/jboss-as/jboss-as.conf"
fi

[ -r "$JBOSS_CONF" ] && . "${JBOSS_CONF}"

# Set defaults.

if [ -z "$JBOSS_HOME" ]; then
  JBOSS_HOME=/home/siaoi/jboss-eap-6.4
fi
export JBOSS_HOME

if [ -z "$JBOSS_NODE" ]; then
  JBOSS_NODE=CSD1
fi
export JBOSS_NODE

if [ -z "$JBOSS_NODE_PORT_OFFSET" ]; then
  JBOSS_NODE_PORT_OFFSET=150
fi
export JBOSS_NODE_PORT_OFFSET

if [ -z "$JBOSS_PIDFILE" ]; then
  JBOSS_PIDFILE=/var/run/jboss-as/standalone$JBOSS_NODE.pid
fi
export JBOSS_PIDFILE

if [ -z "$JBOSS_CONSOLE_LOG" ]; then
  JBOSS_CONSOLE_LOG=/var/log/jboss-as/console$JBOSS_NODE.log
fi

-sh-4.2$ /home/siaoi/scripts/jboss-eap6.sh
Usage: /home/siaoi/scripts/jboss-eap6.sh {start|stop|status|restart|reload}
-sh-4.2$
