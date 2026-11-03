
p585600@10.116.82.43's password:
Last login: Tue Nov  3 10:27:11 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ CLI="/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999"
-sh-4.2$
-sh-4.2$
-sh-4.2$ $CLI --command='/server-group=sigec-portabilidade2:read-attribute(name=profile)'
-sh: /opt/jboss/jboss-eap/bin/jboss-cli.sh: No such file or directory
-sh-4.2$
-sh-4.2$
-sh-4.2$ $CLI --command='/profile=full-ha-sigec-portabilidade-batch/subsystem=modcluster:read-resource(recursive=true)'
-sh: /opt/jboss/jboss-eap/bin/jboss-cli.sh: No such file or directory
-sh-4.2$
-sh-4.2$
-sh-4.2$ $CLI --command='/socket-binding-group=full-ha-sockets:read-resource(recursive=true)' | grep -B2 -A6 -i 'outbound\|proxy\|6666'
-sh: /opt/jboss/jboss-eap/bin/jboss-cli.sh: No such file or directory
-sh-4.2$
-sh-4.2$

