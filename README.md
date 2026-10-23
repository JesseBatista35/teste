oc exec sicow-portal-okd-des-197-nzdl5 -n sicow-des -- grep -n -i -A30 "<system-properties>" /opt/jboss/standalone/configuration/standalone-okd.xml

oc exec sicow-portal-okd-des-197-nzdl5 -n sicow-des -- grep -rn -i "sicowportalURL" /opt/jboss/standalone/configuration/

