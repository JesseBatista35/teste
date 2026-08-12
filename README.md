2026-08-06T13:02:41.3347597Z ##[section]Starting: Criando nova APP
2026-08-06T13:02:41.3354486Z ==============================================================================
2026-08-06T13:02:41.3354572Z Task         : Bash
2026-08-06T13:02:41.3354616Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-06T13:02:41.3354716Z Version      : 3.227.0
2026-08-06T13:02:41.3354762Z Author       : Microsoft Corporation
2026-08-06T13:02:41.3354814Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-06T13:02:41.3354925Z ==============================================================================
2026-08-06T13:02:41.8507117Z Generating script.
2026-08-06T13:02:41.8518622Z ========================== Starting Command Output ===========================
2026-08-06T13:02:41.8525423Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/5c095436-f2cf-4516-be2f-e0fd22f3409d.sh
2026-08-06T13:02:41.8698853Z OKD4 NPRD - des, tqs ou hmp
2026-08-06T13:02:41.9324690Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-08-06T13:02:41.9325038Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-08-06T13:02:41.9325231Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-08-06T13:02:42.0545296Z Essa aplicação já está criada.
2026-08-06T13:02:42.1437568Z deploymentconfig.apps.openshift.io/siint-saquetecban-pendencia-api-des patched (no change)
2026-08-06T13:02:42.2477394Z clusterrole.rbac.authorization.k8s.io/system:openshift:scc:anyuid added: "system:serviceaccounts:siint-des"
2026-08-06T13:02:42.2571022Z ##[section]Finishing: Criando nova APP


2026-08-06T13:02:42.2588794Z ##[section]Starting: Atualizando Variáveis de Ambiente
2026-08-06T13:02:42.2592191Z ==============================================================================
2026-08-06T13:02:42.2592271Z Task         : Bash
2026-08-06T13:02:42.2592340Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-06T13:02:42.2592402Z Version      : 3.227.0
2026-08-06T13:02:42.2592447Z Author       : Microsoft Corporation
2026-08-06T13:02:42.2592542Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-06T13:02:42.2592615Z ==============================================================================
2026-08-06T13:02:42.3940868Z Generating script.
2026-08-06T13:02:42.3952156Z ========================== Starting Command Output ===========================
2026-08-06T13:02:42.3961375Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/11ceb0d9-0d56-46de-905a-3db93581b50f.sh
2026-08-06T13:02:42.4015086Z Nova APP: false
2026-08-06T13:02:42.5822746Z deploymentconfig.apps.openshift.io/siint-saquetecban-pendencia-api-des updated
2026-08-06T13:02:42.6833523Z deploymentconfig.apps.openshift.io/siint-saquetecban-pendencia-api-des updated
2026-08-06T13:02:42.7779300Z deploymentconfig.apps.openshift.io/siint-saquetecban-pendencia-api-des updated
2026-08-06T13:02:42.8799646Z deploymentconfig.apps.openshift.io/siint-saquetecban-pendencia-api-des updated
2026-08-06T13:02:42.9774334Z deploymentconfig.apps.openshift.io/siint-saquetecban-pendencia-api-des updated
2026-08-06T13:02:43.0760682Z deploymentconfig.apps.openshift.io/siint-saquetecban-pendencia-api-des updated
2026-08-06T13:02:43.2615089Z deploymentconfig.apps.openshift.io/siint-saquetecban-pendencia-api-des updated
2026-08-06T13:02:43.3531979Z deploymentconfig.apps.openshift.io/siint-saquetecban-pendencia-api-des updated
2026-08-06T13:02:43.4580460Z deploymentconfig.apps.openshift.io/siint-saquetecban-pendencia-api-des updated
2026-08-06T13:02:43.5556302Z deploymentconfig.apps.openshift.io/siint-saquetecban-pendencia-api-des updated
2026-08-06T13:02:43.5647046Z ##[section]Finishing: Atualizando Variáveis de Ambiente

2026-08-06T13:02:44.0182791Z ##[section]Starting: Create BT Secret
2026-08-06T13:02:44.0185950Z ==============================================================================
2026-08-06T13:02:44.0186031Z Task         : Bash
2026-08-06T13:02:44.0186074Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-06T13:02:44.0186147Z Version      : 3.227.0
2026-08-06T13:02:44.0186293Z Author       : Microsoft Corporation
2026-08-06T13:02:44.0186346Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-06T13:02:44.0186430Z ==============================================================================
2026-08-06T13:02:44.1482658Z Generating script.
2026-08-06T13:02:44.1493547Z ========================== Starting Command Output ===========================
2026-08-06T13:02:44.1500782Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/a0a3e585-d22f-4158-ac5b-e52cfae78f20.sh
2026-08-06T13:02:44.2319221Z A secret 'bt-client-secret-siint-saquetecban-pendencia-api-des' já existe no namespace 'siint-des'.
2026-08-06T13:02:44.3904714Z A secret 'bt-client-secret-siint-saquetecban-pendencia-api-des' já contém os valores corretos. Nenhuma alteração necessária.
2026-08-06T13:02:44.3969446Z ##[section]Finishing: Create BT Secret


2026-08-06T13:02:44.6210502Z ##[section]Starting: Create BT Sidecar
2026-08-06T13:02:44.6213914Z ==============================================================================
2026-08-06T13:02:44.6213998Z Task         : Bash
2026-08-06T13:02:44.6214043Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-06T13:02:44.6214115Z Version      : 3.227.0
2026-08-06T13:02:44.6214158Z Author       : Microsoft Corporation
2026-08-06T13:02:44.6214210Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-06T13:02:44.6214290Z ==============================================================================
2026-08-06T13:02:44.7524253Z Generating script.
2026-08-06T13:02:44.7535275Z ========================== Starting Command Output ===========================
2026-08-06T13:02:44.7542102Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/2bd39d6c-45ed-4bce-a31a-073234f0d98a.sh
2026-08-06T13:02:44.8395231Z Adicionando o container 'secrets-agent-sidecar' ao deploymentconfig 'siint-saquetecban-pendencia-api-des'...
2026-08-06T13:02:44.9305942Z deploymentconfig.apps.openshift.io/siint-saquetecban-pendencia-api-des patched
2026-08-06T13:02:44.9340109Z Container 'secrets-agent-sidecar' adicionado com sucesso!
2026-08-06T13:02:44.9407455Z ##[section]Finishing: Create BT Sidecar


2026-08-06T13:02:46.3450530Z ##[section]Starting: Exporta Variáveis de Ambiente "_SECRET."
2026-08-06T13:02:46.3454323Z ==============================================================================
2026-08-06T13:02:46.3454405Z Task         : Bash
2026-08-06T13:02:46.3454448Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-06T13:02:46.3454546Z Version      : 3.227.0
2026-08-06T13:02:46.3454591Z Author       : Microsoft Corporation
2026-08-06T13:02:46.3454787Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-06T13:02:46.3454893Z ==============================================================================
2026-08-06T13:02:46.4859650Z Generating script.
2026-08-06T13:02:46.4869999Z ========================== Starting Command Output ===========================
2026-08-06T13:02:46.4877020Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/72927df0-17d3-4c35-9126-d114be5c3f65.sh
2026-08-06T13:02:46.4985665Z API_CLIENT_SECRET=8d78faea-64a1-4b00-a9c7-4dc7501ae6f5
2026-08-06T13:02:46.4986906Z API_KEY=l70b96355b16d04a56b4db2c991509759f
2026-08-06T13:02:46.4987085Z QUARKUS_DATASOURCE_PASSWORD=#{QUARKUS_DATASOURCE_PASSWORD}#
2026-08-06T13:02:46.5002007Z tem_secret é igual a true
2026-08-06T13:02:46.5059106Z ##[section]Finishing: Exporta Variáveis de Ambiente "_SECRET."

2026-08-06T13:02:46.7052645Z ##[section]Starting: Criando Secrets
2026-08-06T13:02:46.7055935Z ==============================================================================
2026-08-06T13:02:46.7056015Z Task         : Bash
2026-08-06T13:02:46.7056061Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-06T13:02:46.7056169Z Version      : 3.227.0
2026-08-06T13:02:46.7056213Z Author       : Microsoft Corporation
2026-08-06T13:02:46.7056270Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-06T13:02:46.7056377Z ==============================================================================
2026-08-06T13:02:46.8458383Z Generating script.
2026-08-06T13:02:46.8467765Z Formatted command: exec bash '/opt/ads-agent/_work/r710/a/exec_secret.sh'
2026-08-06T13:02:46.8470207Z ========================== Starting Command Output ===========================
2026-08-06T13:02:46.8476989Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/d8b19eb2-6086-4b64-b30a-bbcfa83aa565.sh
2026-08-06T13:02:46.9392176Z secret "siint-saquetecban-pendencia-api-des" deleted
2026-08-06T13:02:47.0094187Z secret/siint-saquetecban-pendencia-api-des created
2026-08-06T13:02:47.0177413Z ##[section]Finishing: Criando Secrets




esse é o que quebra

2026-08-12T14:30:19.2346413Z ##[section]Starting: Criando Secrets
2026-08-12T14:30:19.2349313Z ==============================================================================
2026-08-12T14:30:19.2349395Z Task         : Bash
2026-08-12T14:30:19.2349441Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-12T14:30:19.2349515Z Version      : 3.227.0
2026-08-12T14:30:19.2349562Z Author       : Microsoft Corporation
2026-08-12T14:30:19.2349622Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-12T14:30:19.2349704Z ==============================================================================
2026-08-12T14:30:19.3604482Z Generating script.
2026-08-12T14:30:19.3615633Z Formatted command: exec bash '/opt/ads-agent/_work/r842/a/exec_secret.sh'
2026-08-12T14:30:19.3618841Z ========================== Starting Command Output ===========================
2026-08-12T14:30:19.3625942Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/f81a9f17-c7ad-4269-84ee-9c19aee5e25a.sh
2026-08-12T14:30:19.4400628Z secret "siint-saquetecban-pendencia-api-des" deleted
2026-08-12T14:30:19.5081313Z secret/siint-saquetecban-pendencia-api-des created
2026-08-12T14:30:19.5163788Z ##[section]Finishing: Criando Secrets


2026-08-12T14:30:19.6602032Z ##[section]Starting: Adicionando Multiplas Secrets
2026-08-12T14:30:19.6605092Z ==============================================================================
2026-08-12T14:30:19.6605188Z Task         : Bash
2026-08-12T14:30:19.6605234Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-12T14:30:19.6605309Z Version      : 3.227.0
2026-08-12T14:30:19.6605356Z Author       : Microsoft Corporation
2026-08-12T14:30:19.6605412Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-12T14:30:19.6605494Z ==============================================================================
2026-08-12T14:30:19.7861196Z Generating script.
2026-08-12T14:30:19.7871868Z ========================== Starting Command Output ===========================
2026-08-12T14:30:19.7878743Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/40660b0c-ceed-432b-8f25-0ae3d2724c4b.sh
2026-08-12T14:30:19.7980997Z Variavel de ambiente com o certificado = DOWNLOADSECUREFILE_SECUREFILEPATH=/opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-08-12T14:30:19.7997709Z Encontrado certificado = caixa-truststore-acteste-nprd.jks com o PATH /opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-08-12T14:30:19.7998163Z nome do arquivo final = caixa-truststore-acteste-nprd
2026-08-12T14:30:19.8025765Z nome da Secret Name = caixa-truststore-acteste-nprd
2026-08-12T14:30:19.8025934Z LOCALIZANDO SECRET OKD
2026-08-12T14:30:19.8687203Z NAME                            TYPE     DATA   AGE
2026-08-12T14:30:19.8687712Z caixa-truststore-acteste-nprd   Opaque   1      7m4s
2026-08-12T14:30:19.8717040Z EXCLUINDO SECRET OKD
2026-08-12T14:30:19.9429538Z secret "caixa-truststore-acteste-nprd" deleted
2026-08-12T14:30:19.9505011Z CRIANDO SECRET OKD
2026-08-12T14:30:20.0202204Z secret/caixa-truststore-acteste-nprd created
2026-08-12T14:30:20.0232724Z oc create secret generic caixa-truststore-acteste-nprd --from-file=caixa-truststore-acteste-nprd.jks -n siint-des
2026-08-12T14:30:20.0233160Z SET VOLUME COM NOVA SECRET
2026-08-12T14:30:20.1058062Z Variavel de ambiente com o certificado = CACERTIFICATE_SECUREFILEPATH=/opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-08-12T14:30:20.1079048Z Encontrado certificado = caixa-truststore-acteste-nprd.jks com o PATH /opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-08-12T14:30:20.1079301Z nome do arquivo final = caixa-truststore-acteste-nprd
2026-08-12T14:30:20.1108081Z nome da Secret Name = caixa-truststore-acteste-nprd
2026-08-12T14:30:20.1108219Z LOCALIZANDO SECRET OKD
2026-08-12T14:30:20.1801849Z NAME                            TYPE     DATA   AGE
2026-08-12T14:30:20.1802354Z caixa-truststore-acteste-nprd   Opaque   1      0s
2026-08-12T14:30:20.1832713Z EXCLUINDO SECRET OKD
2026-08-12T14:30:20.2583607Z secret "caixa-truststore-acteste-nprd" deleted
2026-08-12T14:30:20.2646995Z CRIANDO SECRET OKD
2026-08-12T14:30:20.3487223Z secret/caixa-truststore-acteste-nprd created
2026-08-12T14:30:20.3516763Z oc create secret generic caixa-truststore-acteste-nprd --from-file=caixa-truststore-acteste-nprd.jks -n siint-des
2026-08-12T14:30:20.3516969Z SET VOLUME COM NOVA SECRET
2026-08-12T14:30:20.4385209Z ##[section]Finishing: Adicionando Multiplas Secrets



2026-08-12T14:30:18.8964064Z ##[section]Starting: Exporta Variáveis de Ambiente "_SECRET."
2026-08-12T14:30:18.8967184Z ==============================================================================
2026-08-12T14:30:18.8967264Z Task         : Bash
2026-08-12T14:30:18.8967317Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-12T14:30:18.8967384Z Version      : 3.227.0
2026-08-12T14:30:18.8967439Z Author       : Microsoft Corporation
2026-08-12T14:30:18.8967506Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-12T14:30:18.8967581Z ==============================================================================
2026-08-12T14:30:19.0310578Z Generating script.
2026-08-12T14:30:19.0321944Z ========================== Starting Command Output ===========================
2026-08-12T14:30:19.0328997Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/8442711f-5edc-4685-84e4-3abdc9a780c0.sh
2026-08-12T14:30:19.0457539Z Nenhuma variável Secret vinculada neste stage...
2026-08-12T14:30:19.0457828Z tem_secret é igual a false
2026-08-12T14:30:19.0511156Z ##[section]Finishing: Exporta Variáveis de Ambiente "_SECRET."




