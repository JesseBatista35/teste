2026-07-27T17:38:36.6640651Z ##[section]Starting: Create BT Sidecar
2026-07-27T17:38:36.6643608Z ==============================================================================
2026-07-27T17:38:36.6643693Z Task         : Bash
2026-07-27T17:38:36.6643734Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-27T17:38:36.6643795Z Version      : 3.227.0
2026-07-27T17:38:36.6643848Z Author       : Microsoft Corporation
2026-07-27T17:38:36.6643894Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-27T17:38:36.6643961Z ==============================================================================
2026-07-27T17:38:37.6266858Z Generating script.
2026-07-27T17:38:37.6277794Z ========================== Starting Command Output ===========================
2026-07-27T17:38:37.6285156Z [command]/bin/bash /opt/ads-agent/_work/_temp/9cf82f8f-a95c-40e7-8b8e-cbd3351421e7.sh
2026-07-27T17:38:37.6341790Z /opt/ads-agent/_work/_temp/9cf82f8f-a95c-40e7-8b8e-cbd3351421e7.sh: line 3: RESOURCE_APP: comando não encontrado
2026-07-27T17:38:37.7190806Z error: resource name may not be empty
2026-07-27T17:38:37.7213447Z O initContainer 'secrets-agent-sidecar' já existe no deploymentconfig ''. Removendo para recriar...
2026-07-27T17:38:37.7932409Z error: resource name may not be empty
2026-07-27T17:38:37.8698068Z error: resource name may not be empty
2026-07-27T17:38:37.8720870Z Adicionando o container 'secrets-agent-sidecar' ao deploymentconfig ''...
2026-07-27T17:38:37.9452988Z error: resource name may not be empty
2026-07-27T17:38:37.9469879Z Falha ao adicionar o container 'secrets-agent-sidecar'. Verifique os logs e parâmetros.
2026-07-27T17:38:37.9514013Z ##[error]Bash exited with code '1'.
2026-07-27T17:38:37.9525670Z ##[section]Finishing: Create BT Sidecar


problema inicial erra essa as taks exporta varible e cria app okd estava com versao anteriores...


o segdundo problema que te mandei o log do erro foi resovlido com o comando abaixo




-sh-4.2$ oc rollout resume dc/sigfa-api-aplicacao-okd4-pos-tqs -n sigfa-tqs
deploymentconfig.apps.openshift.io/sigfa-api-aplicacao-okd4-pos-tqs resumed
-sh-4.2$ oc rollout latest dc/sigfa-api-aplicacao-okd4-pos-tqs -n sigfa-tqs
deploymentconfig.apps.openshift.io/sigfa-api-aplicacao-okd4-pos-tqs rolled out
-sh-4.2$



porem agora ele parou nesse ponto:

Verificando Status do Deployment
Waiting for console output from an agent...


AO VERIFICAR O LOG DO POD:

O CONTAINER  SECRETIS-AGENT SIDECAR

2026-07-27 19:36:31,412 INFO (7808b6b8-89f2-11f1-ba2f-0a58190014bb) APP VERSION: 2.1.0
2026-07-27 19:36:31,412 INFO (7808b6b8-89f2-11f1-ba2f-0a58190014bb) Starting Execution...7808b6b8-89f2-11f1-ba2f-0a58190014bb
2026-07-27 19:36:31,412 INFO (7808b6b8-89f2-11f1-ba2f-0a58190014bb) You are using: <,> as List delimiter
2026-07-27 19:36:31,412 WARNING (7808b6b8-89f2-11f1-ba2f-0a58190014bb) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-07-27 19:36:31,412 INFO (7808b6b8-89f2-11f1-ba2f-0a58190014bb) Certificate was not configured
Traceback (most recent call last):
File "/usr/src/app/get_secrets_from_secret_safe.py", line 75, in main
authentication_obj = controller.get_auth_object(
session=session, logger=logger
)
File "/usr/src/app/sidecar_agent_project/controller.py", line 90, in get_auth_object
authentication_obj = authentication.Authentication(**config)
File "/usr/local/lib/python3.13/site-packages/secrets_safe_library/authentication.py", line 61, in __init__
self.validate_input("client_id", client_id)
~~~~~~~~~~~~~~~~~~~^^^^^^^^^^^^^^^^^^^^^^^^
File "/usr/local/lib/python3.13/site-packages/secrets_safe_library/authentication.py", line 246, in validate_input
raise exceptions.OptionsError(f"{parameter_name} parameter is missing")
secrets_safe_library.exceptions.OptionsError: client_id parameter is missing
2026-07-27 19:36:31,414 ERROR (7808b6b8-89f2-11f1-ba2f-0a58190014bb) There was an error in the execution: client_id parameter is missing



E O CONTAINER SECRETS-CHECK
ERRO: Nao foram encontrados arquivos com segredos no diretorio '/usr/src/app/secrets_files'.

