
-sh-4.2$
-sh-4.2$ grep -n -iE "ERROR|Caused by|DeploymentException|ClassNotFoundException|NoClassDefFoundError" /opt/jboss-eap/standalone/log/server.log
127:2026-07-08 14:20:33,382 ERROR [stderr] (MSC service thread 1-3) jul 08, 2026 2:20:33 PM java.io.ObjectInputFilter$Config lambda$static$0
128:2026-07-08 14:20:33,383 ERROR [stderr] (MSC service thread 1-3) INFO: Creating serialization filter from maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la /opt/jboss-eap/standalone/deployments/
total 22532
drwxrwxr-x 2 jboss jboss       73 Jul  8 17:20 .
drwxrwxr-x 8 jboss jboss       91 Set 30  2024 ..
-rwxrwxr-x 1 jboss jboss     8888 Jun 23  2021 README.txt
-rwxrw-rw- 1 jboss jboss 23053010 Jul  8 14:20 siamc-ear.ear
-rw-r--r-- 1 jboss jboss      422 Jul  8 17:20 siamc-ear.ear.failed
-sh-4.2$ cat /opt/jboss-eap/standalone/deployments/siamc-ear.ear.failed
"{\"WFLYCTL0080: Falha de serviços\" => {\"jboss.deployment.subunit.\\\"siamc-ear.ear\\\".\\\"siamc-web-3.0.0-SNAPSHOT.war\\\".DEPENDENCIES\" => \"WFLYSRV0153: Falha ao processar a fase DEPENDENCIES de subdeployment \\\"siamc-web-3.0.0-SNAPSHOT.war\\\" of deployment \\\"siamc-ear.ear\\\"
    Caused by: java.lang.RuntimeException: Legacy WildFly security layer is no longer supported by the Keycloak WildFly adapter\"}}"-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ /opt/jboss-eap/bin/jboss-cli.sh -c --command="/deployment=siamc-ear.ear:read-resource(attributes-only=true,include-runtime=true,recursive=true)"
{
    "outcome" => "failed",
    "failure-description" => "WFLYCTL0275: Não foi possível definir ambos 'attributes-only' e 'recursive'",
    "rolled-back" => true
}
-sh-4.2$

