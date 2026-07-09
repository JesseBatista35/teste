
-sh-4.2$ oc rollout latest dc/simtr-batch-des -n simtr-des                                                                                                                                              deploymentconfig.apps.openshift.io/simtr-batch-des rolled out
-sh-4.2$ oc get pods -n simtr-des | grep simtr-batch
simtr-batch-des-35-deploy                       0/1       Completed           0               28d
simtr-batch-des-36-deploy                       0/1       Completed           0               24h
simtr-batch-des-36-zdbrm                        0/1       CrashLoopBackOff    6 (48s ago)     6m56s
simtr-batch-des-37-deploy                       0/1       Error               0               3h8m
simtr-batch-des-38-deploy                       0/1       Error               0               174m
simtr-batch-des-39-deploy                       0/1       Error               0               123m
simtr-batch-des-40-deploy                       0/1       Error               0               59m
simtr-batch-des-41-deploy                       0/1       Error               0               48m
simtr-batch-des-42-deploy                       0/1       Error               0               18m
simtr-batch-des-43-deploy                       1/1       Running             0               7s
simtr-batch-des-43-xsvr8                        0/1       ContainerCreating   0               3s
-sh-4.2$ oc logs -f simtr-batch-des-43-xsvr8 -n simtr-des
exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dfile.encoding=UTF-8 -Xms512m -Xmx1536m -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
Exception in thread "main" java.lang.reflect.InvocationTargetException
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:566)
        at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:61)
        at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:32)
Caused by: java.lang.UnsupportedClassVersionError: br/gov/caixa/simtr/arquitetura/configuracao/LogFiltroConfiguracao has been compiled by a more recent version of the Java Runtime (class file version 61.0), this version of the Java Runtime only recognizes class file versions up to 55.0
        at java.base/java.lang.ClassLoader.defineClass1(Native Method)
        at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1017)
        at io.quarkus.bootstrap.runner.RunnerClassLoader.loadClass(RunnerClassLoader.java:105)
        at io.quarkus.bootstrap.runner.RunnerClassLoader.loadClass(RunnerClassLoader.java:65)
        at io.quarkus.runtime.configuration.MappingsConfigBuilder.addMapping(MappingsConfigBuilder.java:13)
        at io.quarkus.runtime.generated.StaticInitMappingsConfigBuilder.configBuilder(Unknown Source)
        at io.quarkus.runtime.configuration.ConfigUtils.configBuilder(ConfigUtils.java:205)
        at io.quarkus.runtime.generated.Config.<clinit>(Unknown Source)
        at io.quarkus.runner.ApplicationImpl.<clinit>(Unknown Source)
        at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
        at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
        at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
        at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
        at io.quarkus.runtime.Quarkus.run(Quarkus.java:70)
        at io.quarkus.runtime.Quarkus.run(Quarkus.java:44)
        at io.quarkus.runtime.Quarkus.run(Quarkus.java:124)
        at io.quarkus.runner.GeneratedMain.main(Unknown Source)
        ... 6 more
-sh-4.2$
