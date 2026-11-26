L=/logs/jboss/jboss-eap/standalone/sigec-csc/server.log
grep -iE 'UT000020|UT000047|larger than|max-post-size|RequestTooBig' $L | tail -10
grep -n '11:4[5-9]' $L | grep -iE 'ERROR|WARN' | tail -20
