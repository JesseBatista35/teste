grep -A2 'SCMUTR01' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml | grep '<password>' | head -1 | sed -E 's#.*<password>(.*)</password>.*#\1#' | md5sum
