2026-07-30T18:17:24.4334241Z ##[section]Starting: Logs da Aplicação
2026-07-30T18:17:24.4337397Z ==============================================================================
2026-07-30T18:17:24.4337491Z Task         : Bash
2026-07-30T18:17:24.4337535Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-30T18:17:24.4337596Z Version      : 3.227.0
2026-07-30T18:17:24.4337651Z Author       : Microsoft Corporation
2026-07-30T18:17:24.4337700Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-30T18:17:24.4337770Z ==============================================================================
2026-07-30T18:17:25.3382979Z Generating script.
2026-07-30T18:17:25.3393200Z ========================== Starting Command Output ===========================
2026-07-30T18:17:25.3401845Z [command]/bin/bash /opt/ads-agent/_work/_temp/dfc6d2d5-1902-4ac1-b284-d72cc9133e9b.sh
2026-07-30T18:17:25.3445707Z + shopt -s expand_aliases
2026-07-30T18:17:25.3446318Z + [[ -n openshift_nprd_loterias ]]
2026-07-30T18:17:25.3446553Z + [[ openshift_nprd_loterias =~ ocp ]]
2026-07-30T18:17:25.3446713Z + [[ -n openshift_nprd_loterias ]]
2026-07-30T18:17:25.3446849Z + [[ openshift_nprd_loterias =~ (okd4|openshift) ]]
2026-07-30T18:17:25.3447349Z + app=sispl-api-apostas-des
2026-07-30T18:17:25.3447461Z + oc version
2026-07-30T18:17:25.4654313Z oc v3.11.0+0cbc58b
2026-07-30T18:17:25.4654508Z kubernetes v1.11.0+d4cacc0
2026-07-30T18:17:25.4654943Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-07-30T18:17:25.4794292Z 
2026-07-30T18:17:25.4794859Z Server https://api.nctvmrh001.nuvem.caixa:6443
2026-07-30T18:17:25.4794997Z kubernetes v1.33.12
2026-07-30T18:17:25.4839696Z ++ oc get pod -l name=sispl-api-apostas-des -n sispl-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-30T18:17:25.4839912Z ++ tac
2026-07-30T18:17:25.4840372Z ++ grep -v '^$'
2026-07-30T18:17:25.4840579Z ++ head -n1
2026-07-30T18:17:25.6994221Z + last_pod=sispl-api-apostas-des-5877bdc6cb-d5pg2
2026-07-30T18:17:25.6994518Z + echo 'Logs do POD: sispl-api-apostas-des-5877bdc6cb-d5pg2'
2026-07-30T18:17:25.6995018Z + oc logs sispl-api-apostas-des-5877bdc6cb-d5pg2 -c sispl-api-apostas-des -n sispl-des
2026-07-30T18:17:25.6995383Z Logs do POD: sispl-api-apostas-des-5877bdc6cb-d5pg2
2026-07-30T18:17:25.9470500Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.1.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-07-30T18:17:25.9471365Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-30T18:17:25.9471874Z 2026-07-30 15:16:53.671-03 WARN  c.m.a.a.i.w.c.ConfigurationBuilder - the requested sampling percentage 30.0 was rounded to nearest 100/N: 33.333333333333336
2026-07-30T18:17:25.9472363Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-30T18:17:25.9473172Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-30T18:17:25.9473549Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-30T18:17:25.9473831Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-30T18:17:25.9474126Z 2026-07-30 15:16:55.135-03 INFO  c.m.applicationinsights.agent - ApplicationInsights Java Agent 3.1.1 started successfully
2026-07-30T18:17:25.9474548Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-30T18:17:25.9474940Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-30T18:17:25.9475534Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-30T18:17:25.9475815Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-30T18:17:25.9476087Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-30T18:17:25.9476369Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-30T18:17:25.9476641Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-30T18:17:25.9476922Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-30T18:17:25.9477199Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-30T18:17:25.9477472Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-30T18:17:25.9477744Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-30T18:17:25.9477895Z __  ____  __  _____   ___  __ ____  ______ 
2026-07-30T18:17:25.9478041Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-07-30T18:17:25.9478190Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-07-30T18:17:25.9478340Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-07-30T18:17:25.9478578Z 2026-07-30 15:16:55,705 DEBUG [org.jbo.logging] (main) Logging Provider: org.jboss.logging.JBossLogManagerProvider
2026-07-30T18:17:25.9479285Z 2026-07-30 15:16:55,997 DEBUG [io.sma.metrics] (main) SRMET01201: Register metric [metricId: MetricID{name='sispl.apostas.api.v1.ApostaResource.GetApostas', tags=[]}, type: timer, origin: RawMemberInfo{memberType=METHOD, declaringClassName='sispl.apostas.api.v1.ApostaResource', name='getApostas', parameterTypeNames=[java.lang.String, java.lang.Short, java.lang.Short, java.lang.Short, java.lang.Short, java.lang.Short, java.lang.Short, java.lang.Short, java.lang.Short, java.lang.Short, java.lang.Short, java.lang.Short, java.lang.Short]}]
2026-07-30T18:17:25.9479993Z 2026-07-30 15:16:56,233 DEBUG [io.qua.cac.run.caf.CaffeineCacheBuildRecorder] (main) Building Caffeine cache [cache-grade] with [initialCapacity=null], [maximumSize=null], [expireAfterWrite=PT10M], [expireAfterAccess=null] and [metricsEnabled=false]
2026-07-30T18:17:25.9480322Z 2026-07-30 15:16:56,391 DEBUG [io.qua.arc.impl] (main) ArC DI container initialized [beans=120, observers=2]
2026-07-30T18:17:25.9480588Z 2026-07-30 15:16:56,410 DEBUG [org.hib.val.int.uti.Version] (main) HV000001: Hibernate Validator 6.2.2.Final
2026-07-30T18:17:25.9480942Z 2026-07-30 15:16:56,432 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom LocaleResolver of type io.quarkus.hibernate.validator.runtime.jaxrs.ResteasyContextLocaleResolver
2026-07-30T18:17:25.9481356Z 2026-07-30 15:16:56,492 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom BeanMetaDataClassNormalizer of type io.quarkus.hibernate.validator.runtime.ArcProxyBeanMetaDataClassNormalizer
2026-07-30T18:17:25.9481765Z 2026-07-30 15:16:56,492 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom ConstraintValidatorFactory of type io.quarkus.hibernate.validator.runtime.ArcConstraintValidatorFactoryImpl
2026-07-30T18:17:25.9482156Z 2026-07-30 15:16:56,493 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom TraversableResolver of type io.quarkus.hibernate.validator.runtime.TraverseAllTraversableResolver
2026-07-30T18:17:25.9482469Z 2026-07-30 15:16:56,498 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) HV000002: Ignoring XML configuration.
2026-07-30T18:17:25.9482779Z 2026-07-30 15:16:56,527 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) ValidationMessages not found.
2026-07-30T18:17:25.9483154Z 2026-07-30 15:16:56,528 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000255: Using io.quarkus.hibernate.validator.runtime.jaxrs.ResteasyContextLocaleResolver as locale resolver.
2026-07-30T18:17:25.9483477Z 2026-07-30 15:16:56,529 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) ContributorValidationMessages not found.
2026-07-30T18:17:25.9483783Z 2026-07-30 15:16:56,531 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) org.hibernate.validator.ValidationMessages found.
2026-07-30T18:17:25.9484082Z 2026-07-30 15:16:56,596 DEBUG [org.hib.val.mes.ResourceBundleMessageInterpolator] (main) Loaded expression factory via original TCCL
2026-07-30T18:17:25.9484462Z 2026-07-30 15:16:56,600 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000252: Using org.hibernate.validator.internal.engine.DefaultPropertyNodeNameProvider as property node name provider.
2026-07-30T18:17:25.9484967Z 2026-07-30 15:16:56,813 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator as ValidatorFactory-scoped message interpolator.
2026-07-30T18:17:25.9485422Z 2026-07-30 15:16:56,813 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using io.quarkus.hibernate.validator.runtime.TraverseAllTraversableResolver as ValidatorFactory-scoped traversable resolver.
2026-07-30T18:17:25.9485861Z 2026-07-30 15:16:56,813 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.util.ExecutableParameterNameProvider as ValidatorFactory-scoped parameter name provider.
2026-07-30T18:17:25.9486282Z 2026-07-30 15:16:56,813 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.engine.DefaultClockProvider as ValidatorFactory-scoped clock provider.
2026-07-30T18:17:25.9486763Z 2026-07-30 15:16:56,813 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.engine.scripting.DefaultScriptEvaluatorFactory as ValidatorFactory-scoped script evaluator factory.
2026-07-30T18:17:25.9487140Z 2026-07-30 15:16:56,825 DEBUG [io.qua.arc.run.ArcRecorder] (main) Bean container listener io.quarkus.hibernate.validator.runtime.HibernateValidatorRecorder$2 finished in 431 ms
2026-07-30T18:17:25.9487488Z 2026-07-30 15:16:56,942 DEBUG [io.qua.res.runtime] (main) Create constructor: public br.gov.caixa.loterias.api.exceptions.providers.CustomExceptionProvider()
2026-07-30T18:17:25.9487828Z 2026-07-30 15:16:56,948 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.hibernate.validator.runtime.jaxrs.ResteasyViolationExceptionMapper()
2026-07-30T18:17:25.9488175Z 2026-07-30 15:16:56,957 DEBUG [io.qua.res.runtime] (main) Create constructor: public br.gov.caixa.loterias.api.exceptions.providers.InternalServerErrorExceptionProvider()
2026-07-30T18:17:25.9488523Z 2026-07-30 15:16:56,958 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.common.runtime.jackson.QuarkusObjectMapperContextResolver()
2026-07-30T18:17:25.9488842Z 2026-07-30 15:16:57,061 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonObjectWriter()
2026-07-30T18:17:25.9489141Z 2026-07-30 15:16:57,063 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonObjectWriter()
2026-07-30T18:17:25.9489461Z 2026-07-30 15:16:57,063 DEBUG [io.qua.res.runtime] (main) Create constructor: public br.gov.caixa.loterias.api.exceptions.providers.NotSupportedExceptionProvider()
2026-07-30T18:17:25.9489787Z 2026-07-30 15:16:57,064 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ReactiveStreamProvider()
2026-07-30T18:17:25.9490139Z 2026-07-30 15:16:57,065 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.interceptors.CacheControlFeature()
2026-07-30T18:17:25.9490443Z 2026-07-30 15:16:57,065 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.interceptors.CacheControlFeature()
2026-07-30T18:17:25.9490766Z 2026-07-30 15:16:57,067 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.microprofile.client.publisher.MpPublisherMessageBodyReader()
2026-07-30T18:17:25.9491103Z 2026-07-30 15:16:57,068 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.microprofile.client.publisher.MpPublisherMessageBodyReader()
2026-07-30T18:17:25.9491438Z 2026-07-30 15:16:57,069 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.interceptors.ServerContentEncodingAnnotationFeature()
2026-07-30T18:17:25.9491757Z 2026-07-30 15:16:57,070 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.CompletionStageProvider()
2026-07-30T18:17:25.9492086Z 2026-07-30 15:16:57,071 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.interceptors.ClientContentEncodingAnnotationFeature()
2026-07-30T18:17:25.9492413Z 2026-07-30 15:16:57,071 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.AuthenticationCompletionExceptionMapper()
2026-07-30T18:17:25.9492745Z 2026-07-30 15:16:57,072 DEBUG [io.qua.res.runtime] (main) Create constructor: public br.gov.caixa.loterias.api.exceptions.providers.NotAllowedExceptionProvider()
2026-07-30T18:17:25.9493077Z 2026-07-30 15:16:57,073 DEBUG [io.qua.res.runtime] (main) Create constructor: public br.gov.caixa.loterias.api.exceptions.providers.SocketTimeoutExceptionProvider()
2026-07-30T18:17:25.9493394Z 2026-07-30 15:16:57,094 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider()
2026-07-30T18:17:25.9493753Z 2026-07-30 15:16:57,099 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider()
2026-07-30T18:17:25.9494078Z 2026-07-30 15:16:57,099 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider()
2026-07-30T18:17:25.9494401Z 2026-07-30 15:16:57,099 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider()
2026-07-30T18:17:25.9525314Z 2026-07-30 15:16:57,100 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.jackson.UnrecognizedPropertyExceptionHandler()
2026-07-30T18:17:25.9525751Z 2026-07-30 15:16:57,100 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.common.runtime.jackson.QuarkusJacksonSerializer()
2026-07-30T18:17:25.9526112Z 2026-07-30 15:16:57,101 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.common.runtime.jackson.QuarkusJacksonSerializer()
2026-07-30T18:17:25.9526475Z 2026-07-30 15:16:57,102 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.common.runtime.jackson.QuarkusJacksonSerializer()
2026-07-30T18:17:25.9526801Z 2026-07-30 15:16:57,102 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.common.runtime.jackson.QuarkusJacksonSerializer()
2026-07-30T18:17:25.9527094Z 2026-07-30 15:16:57,102 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonArrayReader()
2026-07-30T18:17:25.9527401Z 2026-07-30 15:16:57,103 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonArrayReader()
2026-07-30T18:17:25.9527698Z 2026-07-30 15:16:57,104 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonObjectReader()
2026-07-30T18:17:25.9528166Z 2026-07-30 15:16:57,104 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonObjectReader()
2026-07-30T18:17:25.9528590Z 2026-07-30 15:16:57,105 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.FileProvider()
2026-07-30T18:17:25.9528952Z 2026-07-30 15:16:57,106 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.FileProvider()
2026-07-30T18:17:25.9529257Z 2026-07-30 15:16:57,106 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.FileProvider()
2026-07-30T18:17:25.9529559Z 2026-07-30 15:16:57,106 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.FileProvider()
2026-07-30T18:17:25.9529864Z 2026-07-30 15:16:57,106 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.ForbiddenExceptionMapper()
2026-07-30T18:17:25.9530204Z 2026-07-30 15:16:57,107 DEBUG [io.qua.res.runtime] (main) Create constructor: public br.gov.caixa.loterias.api.exceptions.providers.ResourceNotFoundExceptionProvider()
2026-07-30T18:17:25.9530548Z 2026-07-30 15:16:57,107 DEBUG [io.qua.res.runtime] (main) Create constructor: public br.gov.caixa.loterias.api.exceptions.providers.TimeOutExceptionProvider()
2026-07-30T18:17:25.9530865Z 2026-07-30 15:16:57,109 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.CompositeExceptionMapper()
2026-07-30T18:17:25.9531176Z 2026-07-30 15:16:57,117 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.AuthenticationRedirectExceptionMapper()
2026-07-30T18:17:25.9531516Z 2026-07-30 15:16:57,118 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.MultiValuedParamConverterProvider()
2026-07-30T18:17:25.9531837Z 2026-07-30 15:16:57,120 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ByteArrayProvider()
2026-07-30T18:17:25.9532199Z 2026-07-30 15:16:57,120 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ByteArrayProvider()
2026-07-30T18:17:25.9532502Z 2026-07-30 15:16:57,120 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ByteArrayProvider()
2026-07-30T18:17:25.9532801Z 2026-07-30 15:16:57,120 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ByteArrayProvider()
2026-07-30T18:17:25.9533101Z 2026-07-30 15:16:57,121 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.StringTextStar()
2026-07-30T18:17:25.9533405Z 2026-07-30 15:16:57,122 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.StringTextStar()
2026-07-30T18:17:25.9533706Z 2026-07-30 15:16:57,122 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.StringTextStar()
2026-07-30T18:17:25.9534002Z 2026-07-30 15:16:57,122 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.StringTextStar()
2026-07-30T18:17:25.9534307Z 2026-07-30 15:16:57,122 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.UnauthorizedExceptionMapper()
2026-07-30T18:17:25.9534678Z 2026-07-30 15:16:57,123 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonArrayWriter()
2026-07-30T18:17:25.9534996Z 2026-07-30 15:16:57,123 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonArrayWriter()
2026-07-30T18:17:25.9535320Z 2026-07-30 15:16:57,123 DEBUG [io.qua.res.runtime] (main) Create constructor: public br.gov.caixa.loterias.api.exceptions.providers.BusinessExceptionProvider()
2026-07-30T18:17:25.9535656Z 2026-07-30 15:16:57,124 DEBUG [io.qua.res.runtime] (main) Create constructor: public br.gov.caixa.loterias.api.exceptions.providers.BadRequestExceptionProvider()
2026-07-30T18:17:25.9536019Z 2026-07-30 15:16:57,125 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.AuthenticationFailedExceptionMapper()
2026-07-30T18:17:25.9536335Z 2026-07-30 15:16:57,125 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.StreamingOutputProvider()
2026-07-30T18:17:25.9536641Z 2026-07-30 15:16:57,126 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.StreamingOutputProvider()
2026-07-30T18:17:25.9536940Z 2026-07-30 15:16:57,126 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ReaderProvider()
2026-07-30T18:17:25.9537237Z 2026-07-30 15:16:57,126 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ReaderProvider()
2026-07-30T18:17:25.9537529Z 2026-07-30 15:16:57,126 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ReaderProvider()
2026-07-30T18:17:25.9537829Z 2026-07-30 15:16:57,126 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ReaderProvider()
2026-07-30T18:17:25.9538133Z 2026-07-30 15:16:57,131 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.DataSourceProvider()
2026-07-30T18:17:25.9538433Z 2026-07-30 15:16:57,132 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.DataSourceProvider()
2026-07-30T18:17:25.9538740Z 2026-07-30 15:16:57,132 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.DataSourceProvider()
2026-07-30T18:17:25.9539037Z 2026-07-30 15:16:57,132 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.DataSourceProvider()
2026-07-30T18:17:25.9539362Z 2026-07-30 15:16:57,132 DEBUG [io.qua.res.runtime] (main) Create constructor: public br.gov.caixa.loterias.api.exceptions.providers.NotFoundExceptionProvider()
2026-07-30T18:17:25.9539725Z 2026-07-30 15:16:57,132 DEBUG [io.qua.res.runtime] (main) Create constructor: public br.gov.caixa.loterias.api.exceptions.providers.ValidationExceptionProvider()
2026-07-30T18:17:25.9540055Z 2026-07-30 15:16:57,134 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.AsyncStreamingOutputProvider()
2026-07-30T18:17:25.9540373Z 2026-07-30 15:16:57,134 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.AsyncStreamingOutputProvider()
2026-07-30T18:17:25.9540688Z 2026-07-30 15:16:57,135 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.FileRangeWriter()
2026-07-30T18:17:25.9540995Z 2026-07-30 15:16:57,135 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.FileRangeWriter()
2026-07-30T18:17:25.9541304Z 2026-07-30 15:16:57,135 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.InputStreamProvider()
2026-07-30T18:17:25.9541609Z 2026-07-30 15:16:57,136 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.InputStreamProvider()
2026-07-30T18:17:25.9541902Z 2026-07-30 15:16:57,136 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.InputStreamProvider()
2026-07-30T18:17:25.9542209Z 2026-07-30 15:16:57,136 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.InputStreamProvider()
2026-07-30T18:17:25.9542514Z 2026-07-30 15:16:57,145 DEBUG [io.qua.res.runtime] (main) Create resource constructor: public sispl.bilhetes.api.v1.HistoricoApostaResource()
2026-07-30T18:17:25.9542826Z 2026-07-30 15:16:57,160 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.jackson.PatchMethodFilter()
2026-07-30T18:17:25.9543182Z 2026-07-30 15:16:57,164 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.sse.SseEventSinkInterceptor()
2026-07-30T18:17:25.9543522Z 2026-07-30 15:16:57,165 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.interceptors.MessageSanitizerContainerResponseFilter()
2026-07-30T18:17:25.9543831Z 2026-07-30 15:16:57,198 DEBUG [io.qua.res.runtime] (main) Create resource constructor: public sispl.apostas.api.v1.ApostaResource()
2026-07-30T18:17:25.9544133Z 2026-07-30 15:16:57,203 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.interceptors.CacheControlFeature()
2026-07-30T18:17:25.9544453Z 2026-07-30 15:16:57,203 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.interceptors.ClientContentEncodingAnnotationFeature()
2026-07-30T18:17:25.9544837Z 2026-07-30 15:16:57,203 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider()
2026-07-30T18:17:25.9545177Z 2026-07-30 15:16:57,203 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider()
2026-07-30T18:17:25.9545483Z 2026-07-30 15:16:57,203 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.FileProvider()
2026-07-30T18:17:25.9545783Z 2026-07-30 15:16:57,203 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.FileProvider()
2026-07-30T18:17:25.9546101Z 2026-07-30 15:16:57,203 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.MultiValuedParamConverterProvider()
2026-07-30T18:17:25.9546416Z 2026-07-30 15:16:57,203 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ByteArrayProvider()
2026-07-30T18:17:25.9546721Z 2026-07-30 15:16:57,203 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ByteArrayProvider()
2026-07-30T18:17:25.9547063Z 2026-07-30 15:16:57,203 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.StringTextStar()
2026-07-30T18:17:25.9547354Z 2026-07-30 15:16:57,203 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.StringTextStar()
2026-07-30T18:17:25.9547662Z 2026-07-30 15:16:57,203 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.StreamingOutputProvider()
2026-07-30T18:17:25.9547964Z 2026-07-30 15:16:57,203 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ReaderProvider()
2026-07-30T18:17:25.9548262Z 2026-07-30 15:16:57,203 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ReaderProvider()
2026-07-30T18:17:25.9548565Z 2026-07-30 15:16:57,204 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.DataSourceProvider()
2026-07-30T18:17:25.9548869Z 2026-07-30 15:16:57,204 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.DataSourceProvider()
2026-07-30T18:17:25.9549189Z 2026-07-30 15:16:57,204 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.AsyncStreamingOutputProvider()
2026-07-30T18:17:25.9549491Z 2026-07-30 15:16:57,204 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.FileRangeWriter()
2026-07-30T18:17:25.9549783Z 2026-07-30 15:16:57,204 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.InputStreamProvider()
2026-07-30T18:17:25.9550089Z 2026-07-30 15:16:57,204 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.InputStreamProvider()
2026-07-30T18:17:25.9550417Z 2026-07-30 15:16:57,204 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.common.runtime.jackson.QuarkusObjectMapperContextResolver()
2026-07-30T18:17:25.9550774Z 2026-07-30 15:16:57,204 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonObjectWriter()
2026-07-30T18:17:25.9551088Z 2026-07-30 15:16:57,205 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.common.runtime.jackson.QuarkusJacksonSerializer()
2026-07-30T18:17:25.9551407Z 2026-07-30 15:16:57,205 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.common.runtime.jackson.QuarkusJacksonSerializer()
2026-07-30T18:17:25.9551706Z 2026-07-30 15:16:57,205 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonArrayReader()
2026-07-30T18:17:25.9551997Z 2026-07-30 15:16:57,205 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonObjectReader()
2026-07-30T18:17:25.9552288Z 2026-07-30 15:16:57,206 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonArrayWriter()
2026-07-30T18:17:25.9552565Z 2026-07-30 15:16:57,409 DEBUG [io.net.uti.int.log.InternalLoggerFactory] (Thread-10) Using SLF4J as the default logging framework
2026-07-30T18:17:25.9552835Z 2026-07-30 15:16:57,437 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-10) -Dio.netty.noUnsafe: false
2026-07-30T18:17:25.9553205Z 2026-07-30 15:16:57,437 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-10) Java version: 11
2026-07-30T18:17:25.9553467Z 2026-07-30 15:16:57,439 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-10) java.nio.Buffer.address: available
2026-07-30T18:17:25.9553740Z 2026-07-30 15:16:57,440 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-10) java.nio.Bits.unaligned: available, true
2026-07-30T18:17:25.9554030Z 2026-07-30 15:16:57,491 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-10) java.nio.DirectByteBuffer.<init>(long, int): unavailable
2026-07-30T18:17:25.9554299Z 2026-07-30 15:16:57,491 DEBUG [io.net.uti.int.PlatformDependent] (Thread-10) sun.misc.Unsafe: available
2026-07-30T18:17:25.9554655Z 2026-07-30 15:16:57,493 DEBUG [io.net.uti.int.PlatformDependent] (Thread-10) maxDirectMemory: 8413773824 bytes (maybe)
2026-07-30T18:17:25.9554950Z 2026-07-30 15:16:57,493 DEBUG [io.net.uti.int.PlatformDependent] (Thread-10) -Dio.netty.tmpdir: /tmp (java.io.tmpdir)
2026-07-30T18:17:25.9555232Z 2026-07-30 15:16:57,493 DEBUG [io.net.uti.int.PlatformDependent] (Thread-10) -Dio.netty.bitMode: 64 (sun.arch.data.model)
2026-07-30T18:17:25.9555508Z 2026-07-30 15:16:57,494 DEBUG [io.net.uti.int.PlatformDependent] (Thread-10) -Dio.netty.maxDirectMemory: -1 bytes
2026-07-30T18:17:25.9555794Z 2026-07-30 15:16:57,494 DEBUG [io.net.uti.int.PlatformDependent] (Thread-10) -Dio.netty.uninitializedArrayAllocationThreshold: -1
2026-07-30T18:17:25.9556073Z 2026-07-30 15:16:57,495 DEBUG [io.net.uti.int.CleanerJava9] (Thread-10) java.nio.ByteBuffer.cleaner(): available
2026-07-30T18:17:25.9556394Z 2026-07-30 15:16:57,495 DEBUG [io.net.uti.int.PlatformDependent] (Thread-10) -Dio.netty.noPreferDirect: false
2026-07-30T18:17:25.9556675Z 2026-07-30 15:16:57,498 DEBUG [io.net.cha.DefaultChannelId] (Thread-10) -Dio.netty.processId: 3 (auto-detected)
2026-07-30T18:17:25.9556976Z 2026-07-30 15:16:57,500 DEBUG [io.net.cha.DefaultChannelId] (Thread-10) -Dio.netty.machineId: 6b:1a:35:07:89:ff:e4:28 (user-set)
2026-07-30T18:17:25.9557273Z 2026-07-30 15:16:57,525 DEBUG [com.arj.ats.jta] (main) Setting up node identifiers '[1]' for which recovery will be performed
2026-07-30T18:17:25.9557568Z 2026-07-30 15:16:57,610 DEBUG [io.net.uti.int.InternalThreadLocalMap] (main) -Dio.netty.threadLocalMap.stringBuilder.initialSize: 1024
2026-07-30T18:17:25.9557868Z 2026-07-30 15:16:57,610 DEBUG [io.net.uti.int.InternalThreadLocalMap] (main) -Dio.netty.threadLocalMap.stringBuilder.maxSize: 4096
2026-07-30T18:17:25.9558210Z 2026-07-30 15:16:57,610 WARN  [io.qua.agr.run.AgroalConnectionConfigurer] (main) Agroal does not support detecting if a connection is still usable after an exception for database kind: db2
2026-07-30T18:17:25.9558623Z 2026-07-30 15:16:57,631 DEBUG [io.qua.agr.run.DataSources] (main) Started datasource <default> connected to jdbc:db2://10.192.224.102:5031/CSD4
2026-07-30T18:17:25.9558902Z 2026-07-30 15:16:57,695 DEBUG [org.jbo.threads] (main) JBoss Threads version 3.4.2.Final
2026-07-30T18:17:25.9559155Z 2026-07-30 15:16:57,835 DEBUG [io.ver.cor.log.LoggerFactory] (main) Using io.vertx.core.logging.SLF4JLogDelegateFactory
2026-07-30T18:17:25.9559453Z 2026-07-30 15:16:57,849 DEBUG [io.qua.ver.cor.run.VertxCoreRecorder] (main) Vert.x Cache configured to: /tmp/vertx-cache/4292116111435610851
2026-07-30T18:17:25.9559730Z 2026-07-30 15:16:57,935 DEBUG [io.net.uti.ResourceLeakDetector] (main) -Dio.netty.leakDetection.level: simple
2026-07-30T18:17:25.9559995Z 2026-07-30 15:16:57,935 DEBUG [io.net.uti.ResourceLeakDetector] (main) -Dio.netty.leakDetection.targetRecords: 4
2026-07-30T18:17:25.9560259Z 2026-07-30 15:16:58,532 DEBUG [io.net.cha.MultithreadEventLoopGroup] (main) -Dio.netty.eventLoopThreads: 32
2026-07-30T18:17:25.9560517Z 2026-07-30 15:16:58,815 DEBUG [io.net.cha.nio.NioEventLoop] (main) -Dio.netty.noKeySetOptimization: false
2026-07-30T18:17:25.9560780Z 2026-07-30 15:16:58,815 DEBUG [io.net.cha.nio.NioEventLoop] (main) -Dio.netty.selectorAutoRebuildThreshold: 512
2026-07-30T18:17:25.9561044Z 2026-07-30 15:16:58,825 DEBUG [io.net.uti.int.PlatformDependent] (main) org.jctools-core.MpscChunkedArrayQueue: available
2026-07-30T18:17:25.9561319Z 2026-07-30 15:16:58,922 DEBUG [io.qua.ver.cor.run.VertxCoreRecorder] (main) Vertx has Native Transport Enabled: false
2026-07-30T18:17:25.9561568Z 2026-07-30 15:16:59,184 DEBUG [io.net.uti.NetUtil] (main) -Djava.net.preferIPv4Stack: false
2026-07-30T18:17:25.9561871Z 2026-07-30 15:16:59,184 DEBUG [io.net.uti.NetUtil] (main) -Djava.net.preferIPv6Addresses: false
2026-07-30T18:17:25.9562153Z 2026-07-30 15:16:59,186 DEBUG [io.net.uti.NetUtilInitializations] (main) Loopback interface: lo (lo, 0:0:0:0:0:0:0:1%lo)
2026-07-30T18:17:25.9562446Z 2026-07-30 15:16:59,187 DEBUG [io.net.uti.NetUtil] (main) /proc/sys/net/core/somaxconn: 4096
2026-07-30T18:17:25.9562728Z 2026-07-30 15:16:59,396 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.numHeapArenas: 32
2026-07-30T18:17:25.9563019Z 2026-07-30 15:16:59,396 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.numDirectArenas: 32
2026-07-30T18:17:25.9563316Z 2026-07-30 15:16:59,396 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.pageSize: 8192
2026-07-30T18:17:25.9563606Z 2026-07-30 15:16:59,396 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.maxOrder: 3
2026-07-30T18:17:25.9563904Z 2026-07-30 15:16:59,396 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.chunkSize: 65536
2026-07-30T18:17:25.9564201Z 2026-07-30 15:16:59,396 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.smallCacheSize: 256
2026-07-30T18:17:25.9564505Z 2026-07-30 15:16:59,396 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.normalCacheSize: 64
2026-07-30T18:17:25.9564907Z 2026-07-30 15:16:59,396 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.maxCachedBufferCapacity: 32768
2026-07-30T18:17:25.9565212Z 2026-07-30 15:16:59,396 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.cacheTrimInterval: 8192
2026-07-30T18:17:25.9565513Z 2026-07-30 15:16:59,396 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.cacheTrimIntervalMillis: 0
2026-07-30T18:17:25.9565817Z 2026-07-30 15:16:59,396 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.useCacheForAllThreads: true
2026-07-30T18:17:25.9566127Z 2026-07-30 15:16:59,396 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.maxCachedByteBuffersPerChunk: 1023
2026-07-30T18:17:25.9566448Z 2026-07-30 15:16:59,408 DEBUG [io.net.buf.ByteBufUtil] (vert.x-eventloop-thread-1) -Dio.netty.allocator.type: pooled
2026-07-30T18:17:25.9566730Z 2026-07-30 15:16:59,408 DEBUG [io.net.buf.ByteBufUtil] (vert.x-eventloop-thread-1) -Dio.netty.threadLocalDirectBufferSize: 0
2026-07-30T18:17:25.9567026Z 2026-07-30 15:16:59,408 DEBUG [io.net.buf.ByteBufUtil] (vert.x-eventloop-thread-1) -Dio.netty.maxThreadLocalCharBufferSize: 16384
2026-07-30T18:17:25.9567329Z 2026-07-30 15:16:59,446 DEBUG [io.net.han.ssl.JdkSslContext] (vert.x-eventloop-thread-1) Default protocols (JDK): [TLSv1.3, TLSv1.2] 
2026-07-30T18:17:25.9567988Z 2026-07-30 15:16:59,446 DEBUG [io.net.han.ssl.JdkSslContext] (vert.x-eventloop-thread-1) Default cipher suites (JDK): [TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_256_CBC_SHA, TLS_AES_128_GCM_SHA256, TLS_AES_256_GCM_SHA384]
2026-07-30T18:17:25.9568477Z 2026-07-30 15:16:59,527 DEBUG [io.net.buf.AbstractByteBuf] (vert.x-eventloop-thread-1) -Dio.netty.buffer.checkAccessible: true
2026-07-30T18:17:25.9568749Z 2026-07-30 15:16:59,527 DEBUG [io.net.buf.AbstractByteBuf] (vert.x-eventloop-thread-1) -Dio.netty.buffer.checkBounds: true
2026-07-30T18:17:25.9569087Z 2026-07-30 15:16:59,528 DEBUG [io.net.uti.ResourceLeakDetectorFactory] (vert.x-eventloop-thread-1) Loaded default ResourceLeakDetector: io.netty.util.ResourceLeakDetector@6dc5d40
2026-07-30T18:17:25.9569396Z 2026-07-30 15:16:59,535 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.maxCapacityPerThread: 4096
2026-07-30T18:17:25.9569662Z 2026-07-30 15:16:59,535 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.ratio: 8
2026-07-30T18:17:25.9569965Z 2026-07-30 15:16:59,535 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.chunkSize: 32
2026-07-30T18:17:25.9570231Z 2026-07-30 15:16:59,535 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.blocking: false
2026-07-30T18:17:25.9570829Z 2026-07-30 15:16:59,611 DEBUG [io.qua.oid.run.OidcRecorder] (vert.x-eventloop-thread-1) Tenant 'Default': 'OIDC server is not available at the 'https://logindes.caixa.gov.br/auth/realms/internet' URL. Please make sure it is correct. Note it has to end with a realm value if you work with Keycloak, for example: 'https://localhost:8180/auth/realms/quarkus''. Access to resources protected by this tenant may fail if OIDC server will not become available
2026-07-30T18:17:25.9571564Z 2026-07-30 15:16:59,643 DEBUG [io.qua.oid.run.OidcRecorder] (vert.x-eventloop-thread-1) Tenant 'intranet': 'OIDC server is not available at the 'https://login.des.caixa/auth/realms/intranet' URL. Please make sure it is correct. Note it has to end with a realm value if you work with Keycloak, for example: 'https://localhost:8180/auth/realms/quarkus''. Access to resources protected by this tenant may fail if OIDC server will not become available
2026-07-30T18:17:25.9572003Z 2026-07-30 15:16:59,685 DEBUG [com.arj.ats.jta] (main) Setting up node identifiers '[quarkus]' for which recovery will be performed
2026-07-30T18:17:25.9572338Z 2026-07-30 15:16:59,848 INFO  [io.quarkus] (main) sispl-api-apostas 1.2.18.1 on JVM (powered by Quarkus 2.7.6.Final) started in 4.691s. Listening on: http://0.0.0.0:8080
2026-07-30T18:17:25.9572593Z 2026-07-30 15:16:59,849 INFO  [io.quarkus] (main) Profile prod activated. 
2026-07-30T18:17:25.9573069Z 2026-07-30 15:16:59,849 INFO  [io.quarkus] (main) Installed features: [agroal, cache, cdi, hibernate-validator, loterias-api-commons, loterias-api-exceptions, loterias-api-security, narayana-jta, oidc, rest-client, rest-client-jackson, resteasy, resteasy-jackson, security, smallrye-context-propagation, smallrye-health, smallrye-metrics, smallrye-openapi, vertx]
2026-07-30T18:17:25.9573501Z 2026-07-30 15:17:13,049 DEBUG [io.net.han.cod.com.ZlibCodecFactory] (vert.x-eventloop-thread-2) -Dio.netty.noJdkZlibDecoder: false
2026-07-30T18:17:25.9573804Z 2026-07-30 15:17:13,049 DEBUG [io.net.han.cod.com.ZlibCodecFactory] (vert.x-eventloop-thread-2) -Dio.netty.noJdkZlibEncoder: false
2026-07-30T18:17:25.9574223Z 2026-07-30 15:17:13,102 DEBUG [br.gov.cai.lot.api.sec.con.UrlIssuerPropertiesMapProduces] (vert.x-eventloop-thread-2) [SECURITY] :: AuthServerUrl configurado: quarkus.oidc.intranet.auth-server-url = https://login.des.caixa/auth/realms/intranet
2026-07-30T18:17:25.9574784Z 2026-07-30 15:17:13,102 DEBUG [br.gov.cai.lot.api.sec.con.UrlIssuerPropertiesMapProduces] (vert.x-eventloop-thread-2) [SECURITY] :: AuthServerUrl configurado: quarkus.oidc.auth-server-url = https://logindes.caixa.gov.br/auth/realms/internet
2026-07-30T18:17:25.9575233Z 2026-07-30 15:17:13,103 DEBUG [br.gov.cai.lot.api.sec.con.UrlIssuerPropertiesMapProduces] (vert.x-eventloop-thread-2) [SECURITY] :: Quantidade de propriedades AuthServerUrl encontradas: 2
2026-07-30T18:17:25.9577791Z ##[section]Finishing: Logs da Aplicação



tem o IP de algum agente do OCP ai fácil? 
