
[root@caddeapllx2540 /]# grep -A2 'SCMUTR01' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml | grep '<password>' | head -1 | sed -E 's#.*<password>(.*)</password>.*#\1#' | md5sum
6d5c1d43675ce3f0f9cc02a2a5f0c1c9  -
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
