2026-08-20T19:53:00.5096022Z ##[debug]Evaluating condition for step: 'Terraform destroy'
2026-08-20T19:53:00.5096623Z ##[debug]Evaluating: succeeded()
2026-08-20T19:53:00.5096828Z ##[debug]Evaluating succeeded:
2026-08-20T19:53:00.5097261Z ##[debug]=> True
2026-08-20T19:53:00.5097501Z ##[debug]Result: True
2026-08-20T19:53:00.5097754Z ##[section]Starting: Terraform destroy
2026-08-20T19:53:00.5101197Z ==============================================================================
2026-08-20T19:53:00.5101295Z Task         : Bash
2026-08-20T19:53:00.5101362Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-20T19:53:00.5101456Z Version      : 3.227.0
2026-08-20T19:53:00.5101502Z Author       : Microsoft Corporation
2026-08-20T19:53:00.5101554Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-20T19:53:00.5101638Z ==============================================================================
2026-08-20T19:53:01.2294231Z ##[debug]Invoking Method: System.Threading.Tasks.Task <RunAsync>b__9(). Attempt count: 0
2026-08-20T19:53:01.2376662Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-08-20T19:53:01.3124547Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-08-20T19:53:01.3132300Z ##[debug]loading inputs and endpoints
2026-08-20T19:53:01.3136184Z ##[debug]loading INPUT_TARGETTYPE
2026-08-20T19:53:01.3144528Z ##[debug]loading INPUT_FILEPATH
2026-08-20T19:53:01.3145541Z ##[debug]loading INPUT_SCRIPT
2026-08-20T19:53:01.3146452Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-08-20T19:53:01.3147070Z ##[debug]loading INPUT_FAILONSTDERR
2026-08-20T19:53:01.3149059Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-08-20T19:53:01.3149741Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-08-20T19:53:01.3151309Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-08-20T19:53:01.3156109Z ##[debug]loading SECRET_TOKEN_CRQ
2026-08-20T19:53:01.3158184Z ##[debug]loading SECRET_AZPAT
2026-08-20T19:53:01.3159832Z ##[debug]loading SECRET_ARM_ACCESS_KEY
2026-08-20T19:53:01.3161730Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-08-20T19:53:01.3163181Z ##[debug]loading SECRET_PW_ISILON
2026-08-20T19:53:01.3164778Z ##[debug]loading SECRET_TOKEN_INFRAFACIL_MUDANCA
2026-08-20T19:53:01.3165371Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-08-20T19:53:01.3165992Z ##[debug]loading SECRET_PW_ALOCAIP
2026-08-20T19:53:01.3166575Z ##[debug]loading SECRET_FORTIFY_PASS
2026-08-20T19:53:01.3167256Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-08-20T19:53:01.3168079Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-08-20T19:53:01.3169572Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-08-20T19:53:01.3170191Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-08-20T19:53:01.3170744Z ##[debug]loading SECRET_CV_SENHAORACLE
2026-08-20T19:53:01.3172052Z ##[debug]loading SECRET_SENHASERVICO
2026-08-20T19:53:01.3172596Z ##[debug]loading SECRET_TERRAFORM_ESX_PASSWORD
2026-08-20T19:53:01.3173030Z ##[debug]loaded 24
2026-08-20T19:53:01.3177938Z ##[debug]Agent.ProxyUrl=undefined
2026-08-20T19:53:01.3178554Z ##[debug]Agent.CAInfo=undefined
2026-08-20T19:53:01.3178944Z ##[debug]Agent.ClientCert=undefined
2026-08-20T19:53:01.3179205Z ##[debug]Agent.SkipCertValidation=True
2026-08-20T19:53:01.3194957Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-20T19:53:01.3197173Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-20T19:53:01.3197693Z ##[debug]system.culture=en-US
2026-08-20T19:53:01.3228047Z ##[debug]failOnStderr=false
2026-08-20T19:53:01.3228355Z ##[debug]workingDirectory=/opt/ads-agent/_work/r15264/a
2026-08-20T19:53:01.3228616Z ##[debug]check path : /opt/ads-agent/_work/r15264/a
2026-08-20T19:53:01.3228877Z ##[debug]targetType=inline
2026-08-20T19:53:01.3229881Z ##[debug]bashEnvValue=undefined
2026-08-20T19:53:01.3230758Z ##[debug]script=export HTTPS_PROXY=$TF_HTTPS_PROXY
export NO_PROXY=$TF_HTTPS_NO_PROXY

dir_terraform=`ls /opt/ads-agent/_work/r15264/a | grep terraform | head -1`

cd /opt/ads-agent/_work/r15264/a/$dir_terraform/

#destroi todos os servidores 
is_destroy=false

# Lista inicial de servidores separados por vírgula, para destrir servidores especificos
servidores=$(vm_servers_recreate)

if [ -n "$servidores" ]; then

# Divida a string em um array usando a vírgula como delimitador
IFS=',' read -ra array_servidores <<< "$servidores"

# Adicione aspas duplas a cada elemento do array
for ((i=0; i<${#array_servidores[@]}; i++)); do
    array_servidores[$i]="\"${array_servidores[$i]}\""
done

# Junte os elementos do array de volta em uma string separada por vírgula
servidores_com_aspas=`IFS=','; echo "${array_servidores[*]}"`

# Exiba a lista resultante
echo $servidores_com_aspas

terraform destroy -target="vsphere_virtual_machine.vm[$servidores_com_aspas]" -auto-approve

exit 0

fi


if [ -v is_destroy ] && [ "$is_destroy" = "true" ]; then

terraform destroy -auto-approve

fi
2026-08-20T19:53:01.3231647Z Generating script.
2026-08-20T19:53:01.3231858Z ##[debug]which 'bash'
2026-08-20T19:53:01.3232156Z ##[debug]found: '/bin/bash'
2026-08-20T19:53:01.3232399Z ##[debug]Agent.Version=3.225.2
2026-08-20T19:53:01.3232657Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-08-20T19:53:01.3232923Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-08-20T19:53:01.3233178Z ========================== Starting Command Output ===========================
2026-08-20T19:53:01.3233441Z ##[debug]which '/bin/bash'
2026-08-20T19:53:01.3233680Z ##[debug]found: '/bin/bash'
2026-08-20T19:53:01.3250193Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/b8ca66b0-1d55-48e2-bbde-fc10a7fd6c85.sh
2026-08-20T19:53:01.3250672Z ##[debug]exec tool: /bin/bash
2026-08-20T19:53:01.3251022Z ##[debug]arguments:
2026-08-20T19:53:01.3251436Z ##[debug]   /opt/ads-agent/_work/_temp/b8ca66b0-1d55-48e2-bbde-fc10a7fd6c85.sh
2026-08-20T19:53:01.3252087Z [command]/bin/bash /opt/ads-agent/_work/_temp/b8ca66b0-1d55-48e2-bbde-fc10a7fd6c85.sh
2026-08-20T19:53:01.3358065Z /opt/ads-agent/_work/_temp/b8ca66b0-1d55-48e2-bbde-fc10a7fd6c85.sh: line 12: vm_servers_recreate: comando não encontrado
2026-08-20T19:53:01.3358839Z ##[debug]Exit code 0 received from tool '/bin/bash'
2026-08-20T19:53:01.3359609Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-08-20T19:53:01.3359915Z ##[debug]task result: Succeeded
2026-08-20T19:53:01.3361078Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-08-20T19:53:01.3391981Z ##[debug]PERF: RetryHelper Method:System.Threading.Tasks.Task <RunAsync>b__9() : took 109.7669 ms
2026-08-20T19:53:01.3392156Z ##[debug]PERF WARNING: RetryHelper Method:System.Threading.Tasks.Task <RunAsync>b__9() : took 109.7669 ms
2026-08-20T19:53:01.3392715Z ##[section]Finishing: Terraform destroy
