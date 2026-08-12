grep -A 1 "br.gov.caixa.psc.connector.util.Config" /opt/jboss-eap/standalone/configuration/standalone.xml

<property name="br.gov.caixa.psc.connector.util.Config" value="/opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties" />

ls -la /opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties

tail -f /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log

grep -i "jconnector" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -30

curl -Ik https://servicossociais.des.corerj.caixa/LoginIntranetAction.do





Favor realizar a alteração na esteira DevOps do Android, do projeto do SIECO-Android <https://devops.caixa/projetos/Caixa/_release?_a=releases&view=mine&definitionId=486>, de tal forma a corrigir os erros da task "Build Gradle" a seguir:

Stage "DES", release <https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=506493&environmentId=2352226>

Stage "HMP - Firebase e Google Play", release <https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=504400&environmentId=2343009>

Agradeço desde já.


Todos
 
só para atualizar sobre a release do Android.
Conseguimos resolver o problema que estava derrubando o step Build Gradle. Durante a análise identificamos que o projeto estava configurado para utilizar o Gradle 8.13, porém essa versão não existia no servidor do agente. Fizemos a importação/instalação do Gradle 8.13 no ambiente e também disponibilizamos o arquivo gradle-8.13-all.zip, que estava sendo referenciado pelo processo de análise do Fortify e era um dos motivos da quebra da release.
Com isso, o erro do step Build Gradle foi corrigido e a pipeline conseguiu avançar para as próximas etapas.
 
 
 
Neste momento, a execução volta a falhar no mesmo ponto observado ontem (WO0000081341442 e  WO0000081352191)
,(Android - Firebase Distribution App) relacionado à integração com o Firebase, retornando erro 500. Ou seja, o problema anterior de Gradle foi resolvido e a falha atual já não está mais relacionada ao ambiente de build nem à versão do Gradle.


2026-08-12T16:40:35.2609530Z ##[debug]Evaluating condition for step: 'Android - Firebase Distribution App'
2026-08-12T16:40:35.2610120Z ##[debug]Evaluating: succeeded()
2026-08-12T16:40:35.2610285Z ##[debug]Evaluating succeeded:
2026-08-12T16:40:35.2610701Z ##[debug]=> True
2026-08-12T16:40:35.2610922Z ##[debug]Result: True
2026-08-12T16:40:35.2611258Z ##[section]Starting: Android - Firebase Distribution App
2026-08-12T16:40:35.2614644Z ==============================================================================
2026-08-12T16:40:35.2614735Z Task         : Bash
2026-08-12T16:40:35.2614781Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-12T16:40:35.2614854Z Version      : 3.227.0
2026-08-12T16:40:35.2614899Z Author       : Microsoft Corporation
2026-08-12T16:40:35.2614974Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-12T16:40:35.2615067Z ==============================================================================
2026-08-12T16:40:35.2988194Z ##[debug]Using node path: /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/externals/node16/bin/node
2026-08-12T16:40:35.3094510Z Warning: Ignoring extra certs from `/etc/pki/ca-trust/source/anchors/AC-V4.cer`, load failed: error:02001002:system library:fopen:No such file or directory
2026-08-12T16:40:35.3786971Z ##[debug]agent.TempDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp
2026-08-12T16:40:35.3794929Z ##[debug]loading inputs and endpoints
2026-08-12T16:40:35.3797533Z ##[debug]loading INPUT_TARGETTYPE
2026-08-12T16:40:35.3812558Z ##[debug]loading INPUT_FILEPATH
2026-08-12T16:40:35.3812862Z ##[debug]loading INPUT_SCRIPT
2026-08-12T16:40:35.3813102Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-08-12T16:40:35.3813353Z ##[debug]loading INPUT_FAILONSTDERR
2026-08-12T16:40:35.3813710Z ##[debug]loading INPUT_NOPROFILE
2026-08-12T16:40:35.3814076Z ##[debug]loading INPUT_NORC
2026-08-12T16:40:35.3814469Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-08-12T16:40:35.3814915Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-08-12T16:40:35.3815377Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-08-12T16:40:35.3818865Z ##[debug]loading SECRET_FORTIFY_TOKEN
2026-08-12T16:40:35.3820572Z ##[debug]loading SECRET_SCANCENTRAL_SSCCITOKEN
2026-08-12T16:40:35.3822337Z ##[debug]loading SECRET_FORTIFY_REGISTRY_PASSWORD
2026-08-12T16:40:35.3825182Z ##[debug]loading SECRET_KEYSTORE_PWD
2026-08-12T16:40:35.3825606Z ##[debug]loading SECRET_AZPAT
2026-08-12T16:40:35.3825997Z ##[debug]loading SECRET_APIJSONGOOGLE
2026-08-12T16:40:35.3826393Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-08-12T16:40:35.3826799Z ##[debug]loading SECRET_FORTIFY_CLIENT_AUTH_TOKEN
2026-08-12T16:40:35.3827203Z ##[debug]loading SECRET_FORTIFY_CI_TOKEN
2026-08-12T16:40:35.3827592Z ##[debug]loading SECRET_KEYSTOREPASS
2026-08-12T16:40:35.3829259Z ##[debug]loading SECRET_NEXUS_INTERNO_PASS
2026-08-12T16:40:35.3830806Z ##[debug]loading SECRET_GITTOKEN
2026-08-12T16:40:35.3831430Z ##[debug]loading SECRET_SCANCENTRAL_CLIENTTOKEN
2026-08-12T16:40:35.3831822Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-08-12T16:40:35.3832191Z ##[debug]loading SECRET_FORTIFY_UPTOKEN
2026-08-12T16:40:35.3832580Z ##[debug]loading SECRET_TOKEN_CRQ
2026-08-12T16:40:35.3832953Z ##[debug]loading SECRET_FORTIFY_PASS
2026-08-12T16:40:35.3833334Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-08-12T16:40:35.3834386Z ##[debug]loading SECRET_FIREBASE_TOKEN
2026-08-12T16:40:35.3835050Z ##[debug]loaded 29
2026-08-12T16:40:35.3839820Z ##[debug]Agent.ProxyUrl=undefined
2026-08-12T16:40:35.3840218Z ##[debug]Agent.CAInfo=undefined
2026-08-12T16:40:35.3840596Z ##[debug]Agent.ClientCert=undefined
2026-08-12T16:40:35.3840981Z ##[debug]Agent.SkipCertValidation=True
2026-08-12T16:40:35.3885025Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-12T16:40:35.3886417Z ##[debug]adding resource file: /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-12T16:40:35.3887276Z ##[debug]system.culture=en-US
2026-08-12T16:40:35.3896927Z ##[debug]failOnStderr=false
2026-08-12T16:40:35.3897401Z ##[debug]workingDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r14/a
2026-08-12T16:40:35.3897894Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r14/a
2026-08-12T16:40:35.3898330Z ##[debug]targetType=inline
2026-08-12T16:40:35.3898715Z ##[debug]bashEnvValue=undefined
2026-08-12T16:40:35.3899601Z ##[debug]script=export App=Ecobranca-1.0.0-Dev.513574.apk

cd /opt/temp/Ecobranca/app-1.0.0.513574

firebase appdistribution:distribute ${App} \
--app 1:312090002901:android:7f86585e9c7483a3dc695c \
--groups "teste-de-qualidade" \
--release-notes "Dev, 1.0.0 ($(( 271513574 + 0 ))): branch, commit, descrição"  \
--token ***
2026-08-12T16:40:35.3908258Z Generating script.
2026-08-12T16:40:35.3910383Z ##[debug]which 'bash'
2026-08-12T16:40:35.3917408Z ##[debug]found: '/bin/bash'
2026-08-12T16:40:35.3917812Z ##[debug]Agent.Version=3.225.2
2026-08-12T16:40:35.3918263Z ##[debug]agent.tempDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp
2026-08-12T16:40:35.3918758Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp
2026-08-12T16:40:35.3921272Z ========================== Starting Command Output ===========================
2026-08-12T16:40:35.3921921Z ##[debug]which '/bin/bash'
2026-08-12T16:40:35.3934926Z ##[debug]found: '/bin/bash'
2026-08-12T16:40:35.3935600Z ##[debug]/bin/bash arg: /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/128c9f11-1a19-4728-9583-dba2b7bd9d49.sh
2026-08-12T16:40:35.3936045Z ##[debug]exec tool: /bin/bash
2026-08-12T16:40:35.3936370Z ##[debug]arguments:
2026-08-12T16:40:35.3936734Z ##[debug]   /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/128c9f11-1a19-4728-9583-dba2b7bd9d49.sh
2026-08-12T16:40:35.3937358Z [command]/bin/bash /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/128c9f11-1a19-4728-9583-dba2b7bd9d49.sh
2026-08-12T16:40:36.4768294Z (node:89605) Warning: Ignoring extra certs from `/etc/pki/ca-trust/source/anchors/AC-V4.cer`, load failed: error:02001002:system library:fopen:No such file or directory
2026-08-12T16:40:36.4768689Z 
2026-08-12T16:40:38.6772975Z [1m[36mi [39m[22m uploading distribution...
2026-08-12T16:40:41.0877257Z 
2026-08-12T16:40:41.0878038Z [1m[31mError:[39m[22m failed to upload distribution. HTTP Error: 500, Unknown Error
2026-08-12T16:40:41.3693214Z ##[debug]Exit code 1 received from tool '/bin/bash'
2026-08-12T16:40:41.3712669Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-08-12T16:40:41.3714677Z ##[error]Bash exited with code '1'.
2026-08-12T16:40:41.3717538Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '1'.
2026-08-12T16:40:41.3718517Z ##[debug]task result: Failed
2026-08-12T16:40:41.3720157Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-08-12T16:40:41.3747568Z ##[section]Finishing: Android - Firebase Distribution App
