
2026-08-11T13:33:48.5525018Z ##[section]Starting: Verificando Status do Deployment
2026-08-11T13:33:48.5528196Z ==============================================================================
2026-08-11T13:33:48.5528273Z Task         : Bash
2026-08-11T13:33:48.5528314Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-11T13:33:48.5528384Z Version      : 3.227.0
2026-08-11T13:33:48.5528425Z Author       : Microsoft Corporation
2026-08-11T13:33:48.5528474Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-11T13:33:48.5528554Z ==============================================================================
2026-08-11T13:33:48.6920857Z Generating script.
2026-08-11T13:33:48.6932190Z ========================== Starting Command Output ===========================
2026-08-11T13:33:48.6940159Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/027b3d57-6f74-413b-8fd2-afeb773f629a.sh
2026-08-11T13:33:48.7802214Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-08-11T13:33:50.2546063Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-08-11T13:33:50.3015096Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-08-11T13:39:56.0635472Z ##[error]The task has timed out.
2026-08-11T13:39:56.0636326Z ##[section]Finishing: Verificando Status do Deployment


2026-08-11T13:39:56.0655158Z ##[section]Starting: Logs da Aplicação
2026-08-11T13:39:56.0658126Z ==============================================================================
2026-08-11T13:39:56.0658203Z Task         : Bash
2026-08-11T13:39:56.0658245Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-11T13:39:56.0658315Z Version      : 3.227.0
2026-08-11T13:39:56.0658356Z Author       : Microsoft Corporation
2026-08-11T13:39:56.0658417Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-11T13:39:56.0658495Z ==============================================================================
2026-08-11T13:39:56.2713137Z Generating script.
2026-08-11T13:39:56.2724969Z ========================== Starting Command Output ===========================
2026-08-11T13:39:56.2732978Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/dacdb230-bbb9-44e4-9788-5ea5f3c16522.sh
2026-08-11T13:39:56.2791003Z + shopt -s expand_aliases
2026-08-11T13:39:56.2791328Z + [[ -n okd4_nprd ]]
2026-08-11T13:39:56.2791576Z + [[ okd4_nprd =~ ocp ]]
2026-08-11T13:39:56.2791776Z + [[ -n okd4_nprd ]]
2026-08-11T13:39:56.2791953Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-08-11T13:39:56.2792223Z + app=siifx-caixinhas-api-aplicacao-des
2026-08-11T13:39:56.2792400Z + oc version
2026-08-11T13:39:56.3536284Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-08-11T13:39:56.3536535Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-08-11T13:39:56.3536751Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-08-11T13:39:56.3564934Z ++ oc get pod -l name=siifx-caixinhas-api-aplicacao-des -n siifx-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-11T13:39:56.3565110Z ++ tac
2026-08-11T13:39:56.3566708Z ++ grep -v '^$'
2026-08-11T13:39:56.3566809Z ++ head -n1
2026-08-11T13:39:56.4309706Z + last_pod=siifx-caixinhas-api-aplicacao-des-27-wvsfd
2026-08-11T13:39:56.4310038Z + echo 'Logs do POD: siifx-caixinhas-api-aplicacao-des-27-wvsfd'
2026-08-11T13:39:56.4310346Z + oc logs siifx-caixinhas-api-aplicacao-des-27-wvsfd -c siifx-caixinhas-api-aplicacao-des -n siifx-des
2026-08-11T13:39:56.4310720Z Logs do POD: siifx-caixinhas-api-aplicacao-des-27-wvsfd
2026-08-11T13:39:56.5125153Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-08-11T13:39:56.5125821Z __  ____  __  _____   ___  __ ____  ______ 
2026-08-11T13:39:56.5125979Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-08-11T13:39:56.5126129Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-08-11T13:39:56.5126284Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-08-11T13:39:56.5126621Z 2026-08-11 10:37:38 [] WARN  io.qu.config - Unrecognized configuration key "quarkus.http.cors" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-11T13:39:56.5127065Z 2026-08-11 10:37:38 [] WARN  io.qu.config - Unrecognized configuration key "quarkus.http.connect-timeout" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-11T13:39:56.5127377Z 2026-08-11 10:37:38 [] WARN  io.qu.ru.co.ConfigRecorder - Build time property cannot be changed at runtime:
2026-08-11T13:39:56.5127824Z  - quarkus.datasource.driver is set to 'oracle.jdbc.driver.OracleDriver' but it is build time fixed to 'null'. Did you change the property quarkus.datasource.driver after building the application?
2026-08-11T13:39:56.5128155Z 2026-08-11 10:37:40 [] WARN  or.hi.or.jdbc - HHH100123: Low default JDBC fetch size: 10 (consider setting 'hibernate.jdbc.fetch_size')
2026-08-11T13:39:56.5128452Z 2026-08-11 10:37:41 [] ERROR io.qu.ru.Application - Failed to start application: java.lang.RuntimeException: Failed to start quarkus
2026-08-11T13:39:56.5128775Z 	at io.quarkus.runner.ApplicationImpl.doStart(Unknown Source)
2026-08-11T13:39:56.5128934Z 	at io.quarkus.runtime.Application.start(Application.java:112)
2026-08-11T13:39:56.5129139Z 	at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:127)
2026-08-11T13:39:56.5129313Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:79)
2026-08-11T13:39:56.5129465Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:50)
2026-08-11T13:39:56.5129600Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:143)
2026-08-11T13:39:56.5129741Z 	at io.quarkus.runner.GeneratedMain.main(Unknown Source)
2026-08-11T13:39:56.5129906Z 	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:86)
2026-08-11T13:39:56.5130093Z 	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:37)
2026-08-11T13:39:56.5130353Z Caused by: java.lang.NoSuchMethodError: 'void org.yaml.snakeyaml.LoaderOptions.setCodePointLimit(int)'
2026-08-11T13:39:56.5130536Z 	at io.smallrye.openapi.runtime.io.JacksonJsonIO.<init>(JacksonJsonIO.java:49)
2026-08-11T13:39:56.5130715Z 	at io.smallrye.openapi.runtime.io.JacksonJsonIO.<init>(JacksonJsonIO.java:72)
2026-08-11T13:39:56.5130887Z 	at io.smallrye.openapi.runtime.io.JsonIO.newInstance(JsonIO.java:66)
2026-08-11T13:39:56.5131078Z 	at io.smallrye.openapi.api.SmallRyeOpenAPI$Builder$BuildContext.<init>(SmallRyeOpenAPI.java:691)
2026-08-11T13:39:56.5131274Z 	at io.smallrye.openapi.api.SmallRyeOpenAPI$Builder.getContext(SmallRyeOpenAPI.java:138)
2026-08-11T13:39:56.5131476Z 	at io.quarkus.smallrye.openapi.runtime.OpenAPIRuntimeBuilder.build(OpenAPIRuntimeBuilder.java:15)
2026-08-11T13:39:56.5131920Z 	at io.smallrye.openapi.api.SmallRyeOpenAPI$Builder.build(SmallRyeOpenAPI.java:730)
2026-08-11T13:39:56.5132160Z 	at io.quarkus.smallrye.openapi.runtime.OpenApiDocumentService.prepareDocument(OpenApiDocumentService.java:83)
2026-08-11T13:39:56.5132364Z 	at io.quarkus.smallrye.openapi.runtime.OpenApiDocumentService_ClientProxy.prepareDocument(Unknown Source)
2026-08-11T13:39:56.5132561Z 	at io.quarkus.smallrye.openapi.runtime.OpenApiRecorder.prepareDocument(OpenApiRecorder.java:64)
2026-08-11T13:39:56.5132753Z 	at io.quarkus.runner.recorded.SmallRyeOpenApiProcessor$prepareDocuments252117661.deploy_0(Unknown Source)
2026-08-11T13:39:56.5132935Z 	at io.quarkus.runner.recorded.SmallRyeOpenApiProcessor$prepareDocuments252117661.deploy(Unknown Source)
2026-08-11T13:39:56.5133118Z 	... 9 more
2026-08-11T13:39:56.5133157Z 
2026-08-11T13:39:56.5224882Z ##[section]Finishing: Logs da Aplicação
