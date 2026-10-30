
-sh-4.2$
-sh-4.2$ oc rsh -n siali-des siali-des-198-g7cd8 \
>   /opt/jboss/bin/jboss-cli.sh -c \
>   --command="/subsystem=datasources/data-source=siali-jpa-ds:test-connection-in-pool"
^[[D^H^H^H^H^H^H^H^H
{
    "outcome" => "failed",
    "failure-description" => "WFLYJCA0040: failed to invoke operation: WFLYJCA0047: Connection is not valid",
    "rolled-back" => true
}
command terminated with exit code 1
-sh-4.2$ oc rsh -n siali-des siali-des-198-g7cd8   /opt/jboss/bin/jboss-cli.sh -c   --command="/subsystem=datasources/data-source=siali-jpa-ds:test-connection-in-pool"
{
    "outcome" => "failed",
    "failure-description" => "WFLYJCA0040: failed to invoke operation: WFLYJCA0047: Connection is not valid",
    "rolled-back" => true
}
command terminated with exit code 1
-sh-4.2$
