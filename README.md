sudo su
CFG=/opt/jboss/jboss-eap/standalone/configuration/standalone-full-ha.xml
grep -n 'ajp-listener\|max-post-size\|node-timeout' $CFG
grep -iE 'UT000020|UT000047|larger than|max-post-size' /opt/jboss/jboss-eap/standalone/log/server.log | tail
