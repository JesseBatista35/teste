
-sh-4.2$
-sh-4.2$ oc exec sicow-penhor-okd-des-60-ndhzc -n sicow-des -- find /opt/jboss/modules -iname "*siusr*"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec sicow-penhor-okd-des-60-ndhzc -n sicow-des -- sh -c 'grep -rn "jboss-modules" /usr/local/s2i/ $STI_SCRIPTS_PATH 2>/dev/null'
/usr/local/s2i/assemble:15:modules_file="/tmp/src/jboss-modules"
/usr/local/s2i/assemble:50:      # Removing commented line from jboss-modules
/usr/local/s2i/assemble:55:      for jars in $(cat /tmp/src/jboss-modules)
/usr/local/s2i/configure-jboss.sh:105:done < /usr/local/s2i/jboss-modules-default
-sh-4.2$
-sh-4.2$
