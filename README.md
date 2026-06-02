-sh-4.2$ oc exec -n sisou-des sisou-sac-okd-des-42-9xlw2 -- cat /opt/jboss/bin/standalone.conf > /tmp/sac.conf && oc exec -n sisou-des sisou-vivavoz-okd-des-41-deploy -- cat /opt/jboss/bin/standalone.conf > /tmp/vivavoz.conf && diff /tmp/sac.conf /tmp/vivavoz.conf
error: cannot exec into a container in a completed pod; current phase is Failed
-sh-4.2$ cat /tmp/sac.conf | head -35
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

-sh-4.2$
