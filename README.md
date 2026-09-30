
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get istag quarkus-java-binary-s2i:8.2 -n openshift -o jsonpath='{.image.dockerImageMetadata.Config.Env}' | tr ',' '\n' | grep -i java
^[[D[PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin container=oci JAVA_OPTIONS=-Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager   LANG=en_US.UTF-8 LANGUAGE=en_US:en OPENSHIFT_BUILD_NAME=quarkus-java-binary-s2i-24 OPENSHIFT_BUILD_NAMESPACE=docker-build OPENSHIFT_BUILD_SOURCE=http://cloudconfig.caixa/openshift/docker-build.git OPENSHIFT_BUILD_REFERENCE=master OPENSHIFT_BUILD_COMMIT=bdd3b65cc61abe92517cd5af295ca96fb23d21cd]
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
