apos correçao da varaivel, e a subida de um novo deploy

pod:ipgc-api-seguranca-tqs-17-cgdjk
Init:CrashLoopBackOff


Secretis-agent-sidecar

10 lines
2026-08-25 14:17:37,598 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-08-25 14:17:37,598 INFO (b95f31ba-a08f-11f1-8152-0a5819020686) APP VERSION: 2.1.0
2026-08-25 14:17:37,598 INFO (b95f31ba-a08f-11f1-8152-0a5819020686) Starting Execution...b95f31ba-a08f-11f1-8152-0a5819020686
2026-08-25 14:17:37,598 INFO (b95f31ba-a08f-11f1-8152-0a5819020686) You are using: <,> as List delimiter
2026-08-25 14:17:37,599 WARNING (b95f31ba-a08f-11f1-8152-0a5819020686) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-08-25 14:17:37,599 INFO (b95f31ba-a08f-11f1-8152-0a5819020686) Certificate was not configured
2026-08-25 14:17:37,602 DEBUG (b95f31ba-a08f-11f1-8152-0a5819020686) How long to wait for the server to connect and send data before giving up: connection timeout: 30 seconds, request timeout 30 seconds
2026-08-25 14:17:37,602 WARNING (b95f31ba-a08f-11f1-8152-0a5819020686) verify_ca=false is insecure, it instructs the caller to not verify the certificate authority when making API calls.
2026-08-25 14:17:37,656 INFO (b95f31ba-a08f-11f1-8152-0a5819020686) Calling sign_app_in endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3
2026-08-25 14:17:37,693 ERROR (b95f31ba-a08f-11f1-8152-0a5819020686) Please check credentials (API key/client credentials), error "Failed to authenticate due to one or more authentication rules."


ERRO: Nao foram encontrados arquivos com segredos no diretorio '/usr/src/app/secrets_files'.

secrets-check

2026-08-25T14:17:35.9556115Z ##[section]Starting: Verificando Status do Deployment
2026-08-25T14:17:35.9559680Z ==============================================================================
2026-08-25T14:17:35.9559790Z Task         : Bash
2026-08-25T14:17:35.9559860Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-25T14:17:35.9559975Z Version      : 3.227.0
2026-08-25T14:17:35.9560025Z Author       : Microsoft Corporation
2026-08-25T14:17:35.9560074Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-25T14:17:35.9560143Z ==============================================================================
2026-08-25T14:17:37.0700705Z Generating script.
2026-08-25T14:17:37.0729511Z ========================== Starting Command Output ===========================
2026-08-25T14:17:37.0746011Z [command]/bin/bash /opt/ads-agent/_work/_temp/44f352a6-8454-42f9-a7dc-37ced2fa7276.sh
2026-08-25T14:17:37.3240540Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-08-25T14:22:37.3246687Z E0825 11:22:37.323731   76049 streamwatcher.go:109] Unable to decode an event from the watch stream: net/http: request canceled (Client.Timeout exceeded while reading body)
2026-08-25T14:22:37.3248320Z error: watch closed before Until timeout
2026-08-25T14:22:37.3288953Z A aplicação não foi iniciada com sucesso!
2026-08-25T14:22:37.3289361Z Os logs da aplicação estão disponíveis na próxima task: Logs da Aplicação
2026-08-25T14:22:37.3338838Z ##[error]Bash exited with code '1'.
2026-08-25T14:22:37.3342899Z ##[section]Finishing: Verificando Status do Deployment

2026-08-25T14:22:37.3362566Z ##[section]Starting: Logs da Aplicação
2026-08-25T14:22:37.3367031Z ==============================================================================
2026-08-25T14:22:37.3367147Z Task         : Bash
2026-08-25T14:22:37.3367196Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-25T14:22:37.3367310Z Version      : 3.227.0
2026-08-25T14:22:37.3367370Z Author       : Microsoft Corporation
2026-08-25T14:22:37.3367424Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-25T14:22:37.3367493Z ==============================================================================
2026-08-25T14:22:38.2577560Z Generating script.
2026-08-25T14:22:38.2599804Z ========================== Starting Command Output ===========================
2026-08-25T14:22:38.2601533Z [command]/bin/bash /opt/ads-agent/_work/_temp/5cb6e784-c296-476b-bd11-bf4641da6ec4.sh
2026-08-25T14:22:38.2646939Z + shopt -s expand_aliases
2026-08-25T14:22:38.2657618Z + [[ -n okd4_nprd ]]
2026-08-25T14:22:38.2658338Z + [[ okd4_nprd =~ ocp ]]
2026-08-25T14:22:38.2658803Z + [[ -n okd4_nprd ]]
2026-08-25T14:22:38.2659140Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-08-25T14:22:38.2659337Z + app=sipgc-api-seguranca-tqs
2026-08-25T14:22:38.2659447Z + oc version
2026-08-25T14:22:38.4177695Z oc v3.11.0+0cbc58b
2026-08-25T14:22:38.4178659Z kubernetes v1.11.0+d4cacc0
2026-08-25T14:22:38.4179685Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-08-25T14:22:38.4298136Z 
2026-08-25T14:22:38.4298722Z Server https://api.nprd.caixa:6443
2026-08-25T14:22:38.4299042Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-08-25T14:22:38.4344083Z ++ oc get pod -l name=sipgc-api-seguranca-tqs -n sipgc-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-25T14:22:38.4344556Z ++ tac
2026-08-25T14:22:38.4381140Z ++ grep -v '^$'
2026-08-25T14:22:38.4381500Z ++ head -n1
2026-08-25T14:22:38.7028705Z + last_pod=sipgc-api-seguranca-tqs-17-cgdjk
2026-08-25T14:22:38.7038767Z + echo 'Logs do POD: sipgc-api-seguranca-tqs-17-cgdjk'
2026-08-25T14:22:38.7039235Z + oc logs sipgc-api-seguranca-tqs-17-cgdjk -c sipgc-api-seguranca-tqs -n sipgc-tqs
2026-08-25T14:22:38.7039436Z Logs do POD: sipgc-api-seguranca-tqs-17-cgdjk
2026-08-25T14:22:39.0382496Z Error from server (BadRequest): container "sipgc-api-seguranca-tqs" in pod "sipgc-api-seguranca-tqs-17-cgdjk" is waiting to start: PodInitializing
2026-08-25T14:22:39.0445990Z ##[error]Bash exited with code '1'.
2026-08-25T14:22:39.0481410Z ##[section]Finishing: Logs da Aplicação


