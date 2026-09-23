LOCAL: 
ESTEIRA do repositório SICBP-avaliarisco-backend (TQS) 

Link:  https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=531624&environmentId=2469852

Erro na execução da esteira ao fazer deploy, TIMEOUT


2026-09-23T13:18:49.9169478Z ##[debug]Evaluating condition for step: 'Logs da Aplicação'
2026-09-23T13:18:49.9170069Z ##[debug]Evaluating: always()
2026-09-23T13:18:49.9170196Z ##[debug]Evaluating always:
2026-09-23T13:18:49.9170930Z ##[debug]=> True
2026-09-23T13:18:49.9171132Z ##[debug]Result: True
2026-09-23T13:18:49.9171306Z ##[section]Starting: Logs da Aplicação
2026-09-23T13:18:49.9174109Z ==============================================================================
2026-09-23T13:18:49.9174196Z Task         : Bash
2026-09-23T13:18:49.9174236Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-23T13:18:49.9174293Z Version      : 3.227.0
2026-09-23T13:18:49.9174342Z Author       : Microsoft Corporation
2026-09-23T13:18:49.9174388Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-23T13:18:49.9174453Z ==============================================================================
2026-09-23T13:18:50.6961686Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-23T13:18:50.7618769Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-23T13:18:50.7626864Z ##[debug]loading inputs and endpoints
2026-09-23T13:18:50.7629795Z ##[debug]loading INPUT_TARGETTYPE
2026-09-23T13:18:50.7637348Z ##[debug]loading INPUT_FILEPATH
2026-09-23T13:18:50.7638296Z ##[debug]loading INPUT_SCRIPT
2026-09-23T13:18:50.7639010Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-23T13:18:50.7639607Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-23T13:18:50.7641047Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-23T13:18:50.7641738Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-23T13:18:50.7642970Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-23T13:18:50.7647506Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-09-23T13:18:50.7649194Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-23T13:18:50.7650618Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-23T13:18:50.7651992Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-23T13:18:50.7653751Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-23T13:18:50.7655226Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-23T13:18:50.7655826Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-23T13:18:50.7656426Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-23T13:18:50.7656963Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-23T13:18:50.7657551Z ##[debug]loading SECRET_AZPAT
2026-09-23T13:18:50.7658341Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-23T13:18:50.7658645Z ##[debug]loaded 19
2026-09-23T13:18:50.7662647Z ##[debug]Agent.ProxyUrl=undefined
2026-09-23T13:18:50.7663205Z ##[debug]Agent.CAInfo=undefined
2026-09-23T13:18:50.7664197Z ##[debug]Agent.ClientCert=undefined
2026-09-23T13:18:50.7664578Z ##[debug]Agent.SkipCertValidation=True
2026-09-23T13:18:50.7677682Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-23T13:18:50.7679768Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-23T13:18:50.7680186Z ##[debug]system.culture=en-US
2026-09-23T13:18:50.7687550Z ##[debug]failOnStderr=false
2026-09-23T13:18:50.7688383Z ##[debug]workingDirectory=/opt/ads-agent/_work/r4109/a
2026-09-23T13:18:50.7688808Z ##[debug]check path : /opt/ads-agent/_work/r4109/a
2026-09-23T13:18:50.7689049Z ##[debug]targetType=inline
2026-09-23T13:18:50.7689263Z ##[debug]bashEnvValue=undefined
2026-09-23T13:18:50.7690888Z ##[debug]script=#!/bin/bash
set -o errexit
set -o pipefail
set -x

shopt -s expand_aliases

if [[ -n "$SITE" && "okd4_nprd" =~ "ocp" ]]
then
  app="sicbp-avaliarisco-backend-tqs"

  arquivo="/usr/local/bin/oc-v4.13"
  if [ -e "$arquivo" ]; then 
    alias oc="$arquivo"
  fi
elif [[ -n "$SITE" && "$SITE" =~ (okd4|openshift) ]];
then
app="sicbp-avaliarisco-backend-tqs"
else
  app="sicbp-avaliarisco-backend-tqs-esteiras"
fi

oc version

last_pod=$(oc get pod -l name="$app" -n sicbp-tqs -o jsonpath='{range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp  | tac | grep -v '^$' | head -n1)

echo "Logs do POD: $last_pod"
oc logs $last_pod -c "$app" -n sicbp-tqs
2026-09-23T13:18:50.7698991Z Generating script.
2026-09-23T13:18:50.7700969Z ##[debug]which 'bash'
2026-09-23T13:18:50.7706110Z ##[debug]found: '/bin/bash'
2026-09-23T13:18:50.7707993Z ##[debug]Agent.Version=3.225.2
2026-09-23T13:18:50.7708377Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-23T13:18:50.7708732Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-23T13:18:50.7710536Z ========================== Starting Command Output ===========================
2026-09-23T13:18:50.7711559Z ##[debug]which '/bin/bash'
2026-09-23T13:18:50.7712421Z ##[debug]found: '/bin/bash'
2026-09-23T13:18:50.7713042Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/d3de3f8c-535c-49d5-bf4b-e9685fbaa579.sh
2026-09-23T13:18:50.7715551Z ##[debug]exec tool: /bin/bash
2026-09-23T13:18:50.7715771Z ##[debug]arguments:
2026-09-23T13:18:50.7716002Z ##[debug]   /opt/ads-agent/_work/_temp/d3de3f8c-535c-49d5-bf4b-e9685fbaa579.sh
2026-09-23T13:18:50.7717651Z [command]/bin/bash /opt/ads-agent/_work/_temp/d3de3f8c-535c-49d5-bf4b-e9685fbaa579.sh
2026-09-23T13:18:50.7762238Z + shopt -s expand_aliases
2026-09-23T13:18:50.7762617Z + [[ -n okd4_nprd ]]
2026-09-23T13:18:50.7762734Z + [[ okd4_nprd =~ ocp ]]
2026-09-23T13:18:50.7763468Z + [[ -n okd4_nprd ]]
2026-09-23T13:18:50.7763622Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-23T13:18:50.7763768Z + app=sicbp-avaliarisco-backend-tqs
2026-09-23T13:18:50.7763870Z + oc version
2026-09-23T13:18:50.8997711Z oc v3.11.0+0cbc58b
2026-09-23T13:18:50.8998113Z kubernetes v1.11.0+d4cacc0
2026-09-23T13:18:50.8998795Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-09-23T13:18:50.9084621Z 
2026-09-23T13:18:50.9085171Z Server https://api.nprd.caixa:6443
2026-09-23T13:18:50.9087282Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-09-23T13:18:50.9120621Z ++ oc get pod -l name=sicbp-avaliarisco-backend-tqs -n sicbp-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-23T13:18:50.9126495Z ++ tac
2026-09-23T13:18:50.9134547Z ++ grep -v '^$'
2026-09-23T13:18:50.9134655Z ++ head -n1
2026-09-23T13:18:51.1250029Z + last_pod=sicbp-avaliarisco-backend-tqs-12-9d6kv
2026-09-23T13:18:51.1250349Z + echo 'Logs do POD: sicbp-avaliarisco-backend-tqs-12-9d6kv'
2026-09-23T13:18:51.1251681Z + oc logs sicbp-avaliarisco-backend-tqs-12-9d6kv -c sicbp-avaliarisco-backend-tqs -n sicbp-tqs
2026-09-23T13:18:51.1251931Z Logs do POD: sicbp-avaliarisco-backend-tqs-12-9d6kv
2026-09-23T13:18:51.3782768Z exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sicbp-avaliarisco-backend -Delastic.apm.environment=tqs -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sicbp-avaliarisco-backend -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/SICBP-avaliarisco-backend.jar
2026-09-23T13:18:51.3783682Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-23T13:18:51.3783881Z WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
2026-09-23T13:18:51.3784236Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-23T13:18:51.3784477Z 2026-09-23 10:16:58.646-03:00 ERROR c.m.applicationinsights.agent - 
2026-09-23T13:18:51.3784610Z *************************
2026-09-23T13:18:51.3784723Z Application Insights Java Agent 3.4.13 startup failed (PID 8)
2026-09-23T13:18:51.3784838Z *************************
2026-09-23T13:18:51.3784879Z 
2026-09-23T13:18:51.3784967Z Description:
2026-09-23T13:18:51.3785071Z No connection string provided
2026-09-23T13:18:51.3785114Z 
2026-09-23T13:18:51.3785196Z Action:
2026-09-23T13:18:51.3785287Z Please provide connection string.
2026-09-23T13:18:51.3785623Z 
2026-09-23T13:18:51.3785653Z 
2026-09-23T13:18:51.3785743Z   .   ____          _            __ _ _
2026-09-23T13:18:51.3785884Z  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
2026-09-23T13:18:51.3786031Z ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2026-09-23T13:18:51.3786137Z  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
2026-09-23T13:18:51.3786277Z   '  |____| .__|_| |_|_| |_\__, | / / / /
2026-09-23T13:18:51.3786387Z  =========|_|==============|___/=/_/_/_/
2026-09-23T13:18:51.3786499Z  :: Spring Boot ::                (v2.7.7)
2026-09-23T13:18:51.3786544Z 
2026-09-23T13:18:51.3787703Z 2026-09-23 10:17:00,461 INFO  br.gov.caixa.sicbp.avaliarisco.RunApplication : Starting RunApplication v0.0.0.43 using Java 17.0.7 on sicbp-avaliarisco-backend-tqs-12-9d6kv with PID 8 (/deployments/SICBP-avaliarisco-backend.jar started by 1001 in /deployments)
2026-09-23T13:18:51.3788096Z 2026-09-23 10:17:00,466 INFO  br.gov.caixa.sicbp.avaliarisco.RunApplication : No active profile set, falling back to 1 default profile: "default"
2026-09-23T13:18:51.3788772Z 2026-09-23 10:17:02,137 WARN  org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanDefinitionStoreException: Failed to process import candidates for configuration class [br.gov.caixa.sicbp.avaliarisco.RunApplication]; nested exception is java.lang.IllegalStateException: Error processing condition on org.springdoc.core.SpringDocConfigProperties
2026-09-23T13:18:51.3789234Z 2026-09-23 10:17:02,152 INFO  org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener : 
2026-09-23T13:18:51.3789324Z 
2026-09-23T13:18:51.3789539Z Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2026-09-23T13:18:51.3789780Z 2026-09-23 10:17:02,177 ERROR org.springframework.boot.SpringApplication : Application run failed
2026-09-23T13:18:51.3790052Z org.springframework.beans.factory.BeanDefinitionStoreException: Failed to process import candidates for configuration class [br.gov.caixa.sicbp.avaliarisco.RunApplication]; nested exception is java.lang.IllegalStateException: Error processing condition on org.springdoc.core.SpringDocConfigProperties
2026-09-23T13:18:51.3790419Z 	at org.springframework.context.annotation.ConfigurationClassParser.processImports(ConfigurationClassParser.java:609)
2026-09-23T13:18:51.3790643Z 	at org.springframework.context.annotation.ConfigurationClassParser.access$800(ConfigurationClassParser.java:110)
2026-09-23T13:18:51.3790887Z 	at org.springframework.context.annotation.ConfigurationClassParser$DeferredImportSelectorGroupingHandler.lambda$processGroupImports$1(ConfigurationClassParser.java:812)
2026-09-23T13:18:51.3791098Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-09-23T13:18:51.3791317Z 	at org.springframework.context.annotation.ConfigurationClassParser$DeferredImportSelectorGroupingHandler.processGroupImports(ConfigurationClassParser.java:809)
2026-09-23T13:18:51.3791575Z 	at org.springframework.context.annotation.ConfigurationClassParser$DeferredImportSelectorHandler.process(ConfigurationClassParser.java:780)
2026-09-23T13:18:51.3791802Z 	at org.springframework.context.annotation.ConfigurationClassParser.parse(ConfigurationClassParser.java:192)
2026-09-23T13:18:51.3792027Z 	at org.springframework.context.annotation.ConfigurationClassPostProcessor.processConfigBeanDefinitions(ConfigurationClassPostProcessor.java:331)
2026-09-23T13:18:51.3794701Z 	at org.springframework.context.annotation.ConfigurationClassPostProcessor.postProcessBeanDefinitionRegistry(ConfigurationClassPostProcessor.java:247)
2026-09-23T13:18:51.3794980Z 	at org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanDefinitionRegistryPostProcessors(PostProcessorRegistrationDelegate.java:311)
2026-09-23T13:18:51.3795269Z 	at org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors(PostProcessorRegistrationDelegate.java:112)
2026-09-23T13:18:51.3795584Z 	at org.springframework.context.support.AbstractApplicationContext.invokeBeanFactoryPostProcessors(AbstractApplicationContext.java:746)
2026-09-23T13:18:51.3795810Z 	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:564)
2026-09-23T13:18:51.3796033Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:147)
2026-09-23T13:18:51.3796242Z 	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:731)
2026-09-23T13:18:51.3796421Z 	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:408)
2026-09-23T13:18:51.3796600Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:307)
2026-09-23T13:18:51.3796763Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1303)
2026-09-23T13:18:51.3796932Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1292)
2026-09-23T13:18:51.3797104Z 	at br.gov.caixa.sicbp.avaliarisco.RunApplication.main(RunApplication.java:24)
2026-09-23T13:18:51.3797266Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-09-23T13:18:51.3797436Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-09-23T13:18:51.3797638Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-09-23T13:18:51.3797813Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-09-23T13:18:51.3797976Z 	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49)
2026-09-23T13:18:51.3798135Z 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:108)
2026-09-23T13:18:51.3798296Z 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:58)
2026-09-23T13:18:51.3798460Z 	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65)
2026-09-23T13:18:51.3798639Z Caused by: java.lang.IllegalStateException: Error processing condition on org.springdoc.core.SpringDocConfigProperties
2026-09-23T13:18:51.3798827Z 	at org.springframework.boot.autoconfigure.condition.SpringBootCondition.matches(SpringBootCondition.java:60)
2026-09-23T13:18:51.3799064Z 	at org.springframework.context.annotation.ConditionEvaluator.shouldSkip(ConditionEvaluator.java:108)
2026-09-23T13:18:51.3799283Z 	at org.springframework.context.annotation.ConfigurationClassParser.processConfigurationClass(ConfigurationClassParser.java:225)
2026-09-23T13:18:51.3799509Z 	at org.springframework.context.annotation.ConfigurationClassParser.processImports(ConfigurationClassParser.java:599)
2026-09-23T13:18:51.3799660Z 	... 27 common frames omitted
2026-09-23T13:18:51.3799964Z Caused by: java.lang.IllegalArgumentException: Could not resolve placeholder 'ENABLE_SWAGGER' in value "${ENABLE_SWAGGER}"
2026-09-23T13:18:51.3800279Z 	at org.springframework.util.PropertyPlaceholderHelper.parseStringValue(PropertyPlaceholderHelper.java:180)
2026-09-23T13:18:51.3800500Z 	at org.springframework.util.PropertyPlaceholderHelper.replacePlaceholders(PropertyPlaceholderHelper.java:126)
2026-09-23T13:18:51.3800699Z 	at org.springframework.core.env.AbstractPropertyResolver.doResolvePlaceholders(AbstractPropertyResolver.java:239)
2026-09-23T13:18:51.3800917Z 	at org.springframework.core.env.AbstractPropertyResolver.resolveRequiredPlaceholders(AbstractPropertyResolver.java:210)
2026-09-23T13:18:51.3801131Z 	at org.springframework.core.env.AbstractPropertyResolver.resolveNestedPlaceholders(AbstractPropertyResolver.java:230)
2026-09-23T13:18:51.3801377Z 	at org.springframework.boot.context.properties.source.ConfigurationPropertySourcesPropertyResolver.getProperty(ConfigurationPropertySourcesPropertyResolver.java:79)
2026-09-23T13:18:51.3801639Z 	at org.springframework.boot.context.properties.source.ConfigurationPropertySourcesPropertyResolver.getProperty(ConfigurationPropertySourcesPropertyResolver.java:60)
2026-09-23T13:18:51.3801916Z 	at org.springframework.core.env.AbstractEnvironment.getProperty(AbstractEnvironment.java:594)
2026-09-23T13:18:51.3802127Z 	at org.springframework.boot.autoconfigure.condition.OnPropertyCondition$Spec.collectProperties(OnPropertyCondition.java:120)
2026-09-23T13:18:51.3802349Z 	at org.springframework.boot.autoconfigure.condition.OnPropertyCondition$Spec.access$000(OnPropertyCondition.java:85)
2026-09-23T13:18:51.3802560Z 	at org.springframework.boot.autoconfigure.condition.OnPropertyCondition.determineOutcome(OnPropertyCondition.java:71)
2026-09-23T13:18:51.3802764Z 	at org.springframework.boot.autoconfigure.condition.OnPropertyCondition.getMatchOutcome(OnPropertyCondition.java:58)
2026-09-23T13:18:51.3802970Z 	at org.springframework.boot.autoconfigure.condition.SpringBootCondition.matches(SpringBootCondition.java:47)
2026-09-23T13:18:51.3803199Z 	... 30 common frames omitted
2026-09-23T13:18:51.3833834Z ##[debug]Exit code 0 received from tool '/bin/bash'
2026-09-23T13:18:51.3836554Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-09-23T13:18:51.3841868Z ##[debug]task result: Succeeded
2026-09-23T13:18:51.3843308Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-09-23T13:18:51.3868976Z ##[section]Finishing: Logs da Aplicação
