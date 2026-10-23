oc exec sicow-penhor-okd-des-60-ndhzc -n sicow-des -- find /opt/jboss/modules -iname "*siusr*"

oc exec sicow-penhor-okd-des-60-ndhzc -n sicow-des -- sh -c 'grep -rn "jboss-modules" /usr/local/s2i/ $STI_SCRIPTS_PATH 2>/dev/null'

