2026-10-02T19:37:01.1061365Z ##[section]Starting: Verificando Status do Deployment
2026-10-02T19:37:01.1064298Z ==============================================================================
2026-10-02T19:37:01.1064376Z Task         : Bash
2026-10-02T19:37:01.1064421Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-02T19:37:01.1064495Z Version      : 3.227.0
2026-10-02T19:37:01.1064540Z Author       : Microsoft Corporation
2026-10-02T19:37:01.1064599Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-02T19:37:01.1064768Z ==============================================================================
2026-10-02T19:37:01.9689942Z Generating script.
2026-10-02T19:37:01.9702022Z ========================== Starting Command Output ===========================
2026-10-02T19:37:01.9707924Z [command]/bin/bash /opt/ads-agent/_work/_temp/167055ed-9585-4b5d-8a18-692ae52389c7.sh
2026-10-02T19:37:02.2066759Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-10-02T19:43:08.6131806Z ##[error]The task has timed out.
2026-10-02T19:43:08.6132906Z ##[section]Finishing: Verificando Status do Deployment



2026-10-02T19:43:08.6155374Z ##[section]Starting: Logs da Aplicação
2026-10-02T19:43:08.6158580Z ==============================================================================
2026-10-02T19:43:08.6158666Z Task         : Bash
2026-10-02T19:43:08.6158710Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-02T19:43:08.6158786Z Version      : 3.227.0
2026-10-02T19:43:08.6158840Z Author       : Microsoft Corporation
2026-10-02T19:43:08.6158890Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-02T19:43:08.6158960Z ==============================================================================
2026-10-02T19:43:09.4706831Z Generating script.
2026-10-02T19:43:09.4717757Z ========================== Starting Command Output ===========================
2026-10-02T19:43:09.4726726Z [command]/bin/bash /opt/ads-agent/_work/_temp/5d71c8f2-eac6-412e-a679-1cebe7b8637b.sh
2026-10-02T19:43:09.4772986Z + shopt -s expand_aliases
2026-10-02T19:43:09.4775604Z + [[ -n okd4_nprd ]]
2026-10-02T19:43:09.4775808Z + [[ okd4_nprd =~ ocp ]]
2026-10-02T19:43:09.4775951Z + [[ -n okd4_nprd ]]
2026-10-02T19:43:09.4776068Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-10-02T19:43:09.4776221Z + app=sisou-api-sac-internet-des
2026-10-02T19:43:09.4776340Z + oc version
2026-10-02T19:43:09.6249135Z oc v3.11.0+0cbc58b
2026-10-02T19:43:09.6249346Z kubernetes v1.11.0+d4cacc0
2026-10-02T19:43:09.6249654Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-10-02T19:43:09.6354592Z 
2026-10-02T19:43:09.6355419Z Server https://api.nprd.caixa:6443
2026-10-02T19:43:09.6355761Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-10-02T19:43:09.6394251Z ++ oc get pod -l name=sisou-api-sac-internet-des -n sisou-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-02T19:43:09.6394649Z ++ tac
2026-10-02T19:43:09.6396169Z ++ grep -v '^$'
2026-10-02T19:43:09.6396492Z ++ head -n1
2026-10-02T19:43:09.9054346Z + last_pod=sisou-api-sac-internet-des-231-kt72h
2026-10-02T19:43:09.9054859Z + echo 'Logs do POD: sisou-api-sac-internet-des-231-kt72h'
2026-10-02T19:43:09.9055738Z + oc logs sisou-api-sac-internet-des-231-kt72h -c sisou-api-sac-internet-des -n sisou-des
2026-10-02T19:43:09.9056026Z Logs do POD: sisou-api-sac-internet-des-231-kt72h
2026-10-02T19:43:10.2414692Z Error from server (BadRequest): container "sisou-api-sac-internet-des" in pod "sisou-api-sac-internet-des-231-kt72h" is waiting to start: PodInitializing
2026-10-02T19:43:10.2497638Z ##[error]Bash exited with code '1'.
2026-10-02T19:43:10.2508225Z ##[section]Finishing: Logs da Aplicação


2026-10-02T19:43:10.2592571Z ##[section]Starting: Realizando Logout OKD
2026-10-02T19:43:10.2595742Z ==============================================================================
2026-10-02T19:43:10.2595819Z Task         : Bash
2026-10-02T19:43:10.2595863Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-02T19:43:10.2595933Z Version      : 3.227.0
2026-10-02T19:43:10.2595976Z Author       : Microsoft Corporation
2026-10-02T19:43:10.2596026Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-02T19:43:10.2596198Z ==============================================================================
2026-10-02T19:43:10.8486567Z Generating script.
2026-10-02T19:43:10.8494208Z Script contents:
2026-10-02T19:43:10.8494422Z oc logout
2026-10-02T19:43:10.8498365Z ========================== Starting Command Output ===========================
2026-10-02T19:43:10.8507154Z [command]/bin/bash /opt/ads-agent/_work/_temp/732a8667-d831-4c19-a1fb-28853b5fcd02.sh
2026-10-02T19:43:11.1023869Z Logged "system:serviceaccount:default:ads-sa" out on "https://api.nprd.caixa:6443"
2026-10-02T19:43:11.1109438Z ##[section]Finishing: Realizando Logout OKD

[p981778@cadsvaprlx067 ~]$ oc logs sisou-api-sac-internet-des-231-kt72h -c secrets-agent-sidecar -n sisou-des
2026-10-02 19:37:03,859 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-10-02 19:37:03,859 INFO (a50cf3f6-be98-11f1-bf53-0a5819032852) APP VERSION: 2.1.0
2026-10-02 19:37:03,859 INFO (a50cf3f6-be98-11f1-bf53-0a5819032852) Starting Execution...a50cf3f6-be98-11f1-bf53-0a5819032852
2026-10-02 19:37:03,859 INFO (a50cf3f6-be98-11f1-bf53-0a5819032852) You are using: <,> as List delimiter
2026-10-02 19:37:03,859 WARNING (a50cf3f6-be98-11f1-bf53-0a5819032852) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-10-02 19:37:03,859 INFO (a50cf3f6-be98-11f1-bf53-0a5819032852) Certificate was not configured
2026-10-02 19:37:03,862 DEBUG (a50cf3f6-be98-11f1-bf53-0a5819032852) How long to wait for the server to connect and send data before giving up: connection timeout: 30 seconds, request timeout 30 seconds
2026-10-02 19:37:03,862 WARNING (a50cf3f6-be98-11f1-bf53-0a5819032852) verify_ca=false is insecure, it instructs the caller to not verify the certificate authority when making API calls.
urllib3.exceptions.ResponseError: too many 400 error responses
 
The above exception was the direct cause of the following exception:
 
Traceback (most recent call last):
  File "/usr/local/lib/python3.13/site-packages/requests/adapters.py", line 667, in send
    resp = conn.urlopen(
        method=request.method,
    ...<9 lines>...
        chunked=chunked,
    )
  File "/usr/local/lib/python3.13/site-packages/urllib3/connectionpool.py", line 942, in urlopen
    return self.urlopen(
           ~~~~~~~~~~~~^
        method,
        ^^^^^^^
    ...<13 lines>...
        **response_kw,
        ^^^^^^^^^^^^^^
    )
    ^
  File "/usr/local/lib/python3.13/site-packages/urllib3/connectionpool.py", line 942, in urlopen
    return self.urlopen(
           ~~~~~~~~~~~~^
        method,
        ^^^^^^^
    ...<13 lines>...
        **response_kw,
        ^^^^^^^^^^^^^^
    )
    ^
  File "/usr/local/lib/python3.13/site-packages/urllib3/connectionpool.py", line 942, in urlopen
    return self.urlopen(
           ~~~~~~~~~~~~^
        method,
        ^^^^^^^
    ...<13 lines>...
        **response_kw,
        ^^^^^^^^^^^^^^
    )
    ^
  File "/usr/local/lib/python3.13/site-packages/urllib3/connectionpool.py", line 932, in urlopen
    retries = retries.increment(method, url, response=response, _pool=self)
  File "/usr/local/lib/python3.13/site-packages/urllib3/util/retry.py", line 519, in increment
    raise MaxRetryError(_pool, url, reason) from reason  # type: ignore[arg-type]
    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
urllib3.exceptions.MaxRetryError: HTTPSConnectionPool(host='sicsn.caixa', port=443): Max retries exceeded with url: /BeyondTrust/api/public/v3/Auth/connect/token (Caused by ResponseError('too many 400 error responses'))
 
During handling of the above exception, another exception occurred:
 
Traceback (most recent call last):
  File "/usr/src/app/get_secrets_from_secret_safe.py", line 78, in main
    get_api_access_response = authentication_obj.get_api_access()
  File "/usr/local/lib/python3.13/site-packages/secrets_safe_library/authentication.py", line 159, in get_api_access
    oauth_response = self.oauth()
  File "/usr/local/lib/python3.13/site-packages/secrets_safe_library/authentication.py", line 125, in oauth
    response = self._req.post(
        endpoint_url,
    ...<3 lines>...
        timeout=(self._timeout_connection_seconds, self._timeout_request_seconds),
    )
  File "/usr/local/lib/python3.13/site-packages/requests/sessions.py", line 637, in post
    return self.request("POST", url, data=data, json=json, **kwargs)
           ~~~~~~~~~~~~^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/local/lib/python3.13/site-packages/requests/sessions.py", line 589, in request
    resp = self.send(prep, **send_kwargs)
  File "/usr/local/lib/python3.13/site-packages/requests/sessions.py", line 703, in send
    r = adapter.send(request, **kwargs)
  File "/usr/local/lib/python3.13/site-packages/requests/adapters.py", line 691, in send
    raise RetryError(e, request=request)
requests.exceptions.RetryError: HTTPSConnectionPool(host='sicsn.caixa', port=443): Max retries exceeded with url: /BeyondTrust/api/public/v3/Auth/connect/token (Caused by ResponseError('too many 400 error responses'))
2026-10-02 19:37:05,171 ERROR (a50cf3f6-be98-11f1-bf53-0a5819032852) There was an error in the execution: HTTPSConnectionPool(host='sicsn.caixa', port=443): Max retries exceeded with url: /BeyondTrust/api/public/v3/Auth/connect/token (Caused by ResponseError('too many 400 error responses'))
[p981778@cadsvaprlx067 ~]$ oc logs sisou-api-sac-internet-des-231-kt72h -c secrets-check -n sisou-des
 
ERRO: Nao foram encontrados arquivos com segredos no diretorio '/usr/src/app/secrets_files'.




---> Running application ...
[BT] Configurando BeyondTrust - Ambiente: Production
info: SISOU_api_sac_internet.Shared.BeyondTrust.BeyondTrustConfigurationProvider[0]
      [BT] Carregando configurações BeyondTrust - Ambiente: Production
info: SISOU_api_sac_internet.Shared.BeyondTrust.BeyondTrustService[0]
      [BT] Iniciando carregamento de secrets
info: SISOU_api_sac_internet.Shared.BeyondTrust.BeyondTrustService[0]
      [BT] Encontrados 6 arquivos para processar
info: SISOU_api_sac_internet.Shared.BeyondTrust.BeyondTrustService[0]
      [BT] Secret carregado
info: SISOU_api_sac_internet.Shared.BeyondTrust.BeyondTrustService[0]
      [BT] Secret carregado
info: SISOU_api_sac_internet.Shared.BeyondTrust.BeyondTrustService[0]
      [BT] Secret carregado
info: SISOU_api_sac_internet.Shared.BeyondTrust.BeyondTrustService[0]
      [BT] Secret carregado
info: SISOU_api_sac_internet.Shared.BeyondTrust.BeyondTrustService[0]
      [BT] Secret carregado
info: SISOU_api_sac_internet.Shared.BeyondTrust.BeyondTrustService[0]
      [BT] Secret carregado
info: SISOU_api_sac_internet.Shared.BeyondTrust.BeyondTrustService[0]
      [BT] Carregamento concluído: 6 secrets processados
info: SISOU_api_sac_internet.Shared.BeyondTrust.BeyondTrustConfigurationProvider[0]
      [BT] Encontradas 3 variáveis com padrões ${}
info: SISOU_api_sac_internet.Shared.BeyondTrust.BeyondTrustVariableResolver[0]
      [BT-RESOLVER] ✓ Variável resolvida: ${CLISERSOU_SSO_INTRA} -> [SECRET]
info: SISOU_api_sac_internet.Shared.BeyondTrust.BeyondTrustVariableResolver[0]
      [BT-RESOLVER] ✓ Variável resolvida: ${sisou_bt_apikey} -> [SECRET]
info: SISOU_api_sac_internet.Shared.BeyondTrust.BeyondTrustVariableResolver[0]
      [BT-RESOLVER] ✓ Variável resolvida: ${ssoudb03_oracle} -> [SECRET]
info: SISOU_api_sac_internet.Shared.BeyondTrust.BeyondTrustConfigurationProvider[0]
      [BT] Resolvidas 3 variáveis
info: SISOU_api_sac_internet.Shared.BeyondTrust.BeyondTrustConfigurationProvider[0]
      [BT] Configuração completa: 9 itens carregados
[BT] BeyondTrust configurado com sucesso
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
      ===== CARREGANDO CONFIGURAÇÃO B2B DAS VARIÁVEIS DE AMBIENTE =====
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
      Variáveis de ambiente B2B:
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
        SERVER_NFS = nfsctcnprd.ctc.caixa
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
        PATH_NFS = /ifs/CADSVISISD4/SERVIDORES/CETAD/SISOU_DES_B2B
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
        PATH_DESTINO = /SISOU/PARCEIROS
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
        SIZE_VOLUME = 20Gi
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
      ✅ Configuração carregada com sucesso das variáveis de ambiente
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
      ✅ BaseDirectory (mount path): /SISOU/PARCEIROS
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
      ===== CONFIGURAÇÃO B2B CARREGADA =====
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
      ===========================================
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
      🔍 LISTAGEM RECURSIVA DO NFS NA INICIALIZAÇÃO
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
      ===========================================
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
      📂 Diretório Base (BaseDirectory): /SISOU/PARCEIROS
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
      ✅ Diretório existe! Listando conteúdo...
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
      📊 ESTATÍSTICAS:
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         Total de diretórios: 52
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         Total de arquivos: 55
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
      📁 DIRETÓRIOS ENCONTRADOS:
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/00360305000104
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/00360305000104/2205250000005
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/00360305000104/2205250000005/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/18081219000128
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/18081219000128/2205250001111
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/18081219000128/2205250001111/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/38155804000132
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/38155804000132/2205250000002
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/38155804000132/2205250000002/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/38155804000132/2205250001111
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/38155804000132/2205250001111/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/0207260000003
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/0207260000003/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/0306250000001
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/0306250000001/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/0306250000004
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/0306250000004/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/0307260000004
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/0307260000004/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/0506250000001
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/0506250000001/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/0606250000001
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/0606250000001/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/0606250000002
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/0606250000002/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/0607260000006
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/0607260000006/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/1707260000002
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/1707260000002/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/1707260000003
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/1707260000003/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/2205250000002
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/2205250000002/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/2205250000003
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/2205250000003/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/2205250000004
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/2205250000004/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/2205250000005
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/2205250000005/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/2205250000006
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/2205250000006/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/2302260000009
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/2302260000009/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/2705250000002
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/2705250000002/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/2905250000002
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/2905250000002/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/2905250000003
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/2905250000003/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📁 PARCEIROS/39565194000108/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
      📄 ARQUIVOS ENCONTRADOS:
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/00360305000104/2205250000005/UPLOAD/AMCB106_00360305_20250422_99992 - 2.61 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/18081219000128/2205250001111/UPLOAD/Print-Open-Shift-SISOU-API-01.png - 115.60 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/38155804000132/2205250000002/UPLOAD/Collection-Oauth-MEI.postman_collection - 23.18 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/38155804000132/2205250000002/UPLOAD/Hackaton.png - 92.71 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/38155804000132/2205250000002/UPLOAD/teste.txt - 5 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/38155804000132/2205250001111/UPLOAD/documentos.zip - 39.26 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/38155804000132/2205250001111/UPLOAD/Print-Open-Shift-SISOU-API-01.png - 115.60 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/38155804000132/2205250001111/UPLOAD/Print-Open-Shift-SISOU-API-01.png_erro - 20 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/0207260000003/UPLOAD/teste.txt - 55 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/0306250000001/UPLOAD/AMCB106_00360305_20241014_99999 - 273 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/0306250000001/UPLOAD/response.zip - 451 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/0306250000004/UPLOAD/AMCB106_00360305_20250422_99992 - 2.61 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/0307260000004/UPLOAD/teste_interno.txt - 55 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/0606250000001/UPLOAD/AMCB106_00360305_20241014_99999 - 273 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/0606250000001/UPLOAD/response.zip - 451 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/0606250000002/UPLOAD/AMCB106_00360305_20241014_99999 - 273 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/0606250000002/UPLOAD/documentos.zip - 39.26 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/0606250000002/UPLOAD/documentos.zip_erro - 20 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/0606250000002/UPLOAD/imagens.zip - 563.05 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/0606250000002/UPLOAD/imagens.zip_erro - 20 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/0606250000002/UPLOAD/response.zip - 451 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/0607260000006/UPLOAD/TesteExterno.txt - 12 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/1707260000002/UPLOAD/teste.txt - 55 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/1707260000003/UPLOAD/teste.txt - 55 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000002/UPLOAD/15164007.zip - 22.00 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000002/UPLOAD/AMCB106_00360305_20241014_99999 - 273 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000002/UPLOAD/anotacoes.txt - 1.18 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000002/UPLOAD/Guia_Consumo_APIs_Resolve_Caixa_NET_Completo.docx - 41.82 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000002/UPLOAD/Manter-equipe-grafico.xmind - 54.25 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000002/UPLOAD/response.zip - 451 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000002/UPLOAD/TE214011-2.pdf - 241.16 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000002/UPLOAD/teste_interno.zip - 258 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000002/UPLOAD/teste.txt - 55 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000002/UPLOAD/WO0000078575487.png - 143.77 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000003/UPLOAD/FormularioRetencaoBackup.docx - 39.59 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000003/UPLOAD/swaggerInfoCorpPriv.json - 110.53 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000003/UPLOAD/teste.txt - 5 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000004/UPLOAD/anotacoes.txt - 1.18 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000004/UPLOAD/anotacoes.txt_erro - 20 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000004/UPLOAD/documentos.zip - 39.26 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000004/UPLOAD/Guia_Consumo_APIs_Resolve_Caixa_NET_Completo.docx - 41.82 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000004/UPLOAD/imagens.zip - 563.05 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000004/UPLOAD/WO0000078575487.png - 570.83 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000005/UPLOAD/anotacoes.txt - 1.18 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000005/UPLOAD/Guia_Consumo_APIs_Resolve_Caixa_NET_Completo.docx - 41.82 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000006/UPLOAD/anotacoes.txt - 1.18 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2205250000006/UPLOAD/Guia_Consumo_APIs_Resolve_Caixa_NET_Completo.docx - 41.82 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2302260000009/UPLOAD/B2B.json - 15.16 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2302260000009/UPLOAD/documentos.zip - 39.26 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2302260000009/UPLOAD/imagens.zip - 563.05 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2705250000002/UPLOAD/response.zip - 451 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2905250000002/UPLOAD/AMCB106_00360305_20250422_99992 - 2.61 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/2905250000003/UPLOAD/response.zip - 451 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/UPLOAD/documentos.zip - 39.26 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
         📄 PARCEIROS/39565194000108/UPLOAD/imagens.zip - 563.05 KB
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
      ===========================================
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
      🔍 FIM DA LISTAGEM DO NFS
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
      ===========================================
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.Configuration.B2BConfiguration[0]
SISOU-api-sac-internet iniciada com sucesso!
info: Microsoft.Hosting.Lifetime[14]
      Now listening on: http://[::]:8080
info: Microsoft.Hosting.Lifetime[0]
      Application started. Press Ctrl+C to shut down.
info: Microsoft.Hosting.Lifetime[0]
      Hosting environment: Production
info: Microsoft.Hosting.Lifetime[0]
      Content root path: /opt/app-root/app
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      === CONFIGURAÇÃO GED ===
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      BaseUrl: https://siecm.des.caixa/siecm-web/ECM
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      IpUsuarioFinal: 10.116.222.199
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      TimeoutSeconds: 30
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      LocalArmazenamento: OS_PADM
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      HttpClient.BaseAddress: NULL
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      ========================
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      === INICIALIZANDO B2BService ===
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      ServerNfs: nfsctcnprd.ctc.caixa
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      PathNfs: /ifs/CADSVISISD4/SERVIDORES/CETAD/SISOU_DES_B2B
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      PathDestino: /SISOU/PARCEIROS
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      SizeVolume: 20Gi
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      BaseDirectory: /SISOU/PARCEIROS
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      MaxFileSize: 52428800 bytes (50 MB)
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      AllowedExtensions: .pdf, .doc, .docx, .jpg, .jpeg, .png, .zip, .rar, .txt
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      BaseDirectory: /SISOU/PARCEIROS
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      IsConfiguredFromEnvironment: True
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      === FIM INICIALIZAÇÃO B2BService ===
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      === CONFIGURAÇÃO GED ===
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      BaseUrl: https://siecm.des.caixa/siecm-web/ECM
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      IpUsuarioFinal: 10.116.222.199
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      TimeoutSeconds: 30
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      LocalArmazenamento: OS_PADM
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      HttpClient.BaseAddress: NULL
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      ========================
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      =================================================
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      📧 EmailService inicializado com configurações:
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         SMTP Server: smtptest.correiolivre.caixa
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         SMTP Port: 25
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Enable SSL: False
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Remetente: sac@caixa.gov.br
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Nome: SAC CAIXA
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      =================================================
warn: 09/09/2026 14:14:00.967 CoreEventId.SensitiveDataLoggingEnabledWarning[10400] (Microsoft.EntityFrameworkCore.Infrastructure) 
      Sensitive data logging is enabled. Log entries and exception messages may include sensitive application data; this mode should only be enabled during development.
warn: 09/09/2026 14:14:01.361 OracleEventId.DecimalTypeKeyWarning[30003] (Microsoft.EntityFrameworkCore.Model.Validation) 
      A decimal property 'NU_CLSFO_GRUPO_RSPNL' is part of a key on entity type 'Soutb039ClsfoGrupoRspnl' which may lead to a precision loss if the configured precision and scale don't match the column type in the database. Consider using a different property as the key, or make sure that the database column type matches the model configuration.
warn: 09/09/2026 14:14:01.361 OracleEventId.DecimalTypeKeyWarning[30003] (Microsoft.EntityFrameworkCore.Model.Validation) 
      A decimal property 'NU_CLSFO_OCRNA_EXTERNA' is part of a key on entity type 'Soutb053ClsfoOcrnaExterna' which may lead to a precision loss if the configured precision and scale don't match the column type in the database. Consider using a different property as the key, or make sure that the database column type matches the model configuration.
warn: 09/09/2026 14:14:01.361 OracleEventId.DecimalTypeKeyWarning[30003] (Microsoft.EntityFrameworkCore.Model.Validation) 
      A decimal property 'NU_CTGRO_EQUIPE_RSPNL' is part of a key on entity type 'Soutb176CtgroEquipeRspnl' which may lead to a precision loss if the configured precision and scale don't match the column type in the database. Consider using a different property as the key, or make sure that the database column type matches the model configuration.
warn: 09/09/2026 14:14:01.362 OracleEventId.DecimalTypeKeyWarning[30003] (Microsoft.EntityFrameworkCore.Model.Validation) 
      A decimal property 'NU_ORIGEM_NATUREZA' is part of a key on entity type 'Soutb181OrigemNatureza' which may lead to a precision loss if the configured precision and scale don't match the column type in the database. Consider using a different property as the key, or make sure that the database column type matches the model configuration.
warn: 09/09/2026 14:14:01.362 OracleEventId.DecimalTypeKeyWarning[30003] (Microsoft.EntityFrameworkCore.Model.Validation) 
      A decimal property 'NU_ADTRA_CLSFO_GRUPO_RSPNL' is part of a key on entity type 'Soutba39ClsfoGrupoRspnl' which may lead to a precision loss if the configured precision and scale don't match the column type in the database. Consider using a different property as the key, or make sure that the database column type matches the model configuration.
warn: 09/09/2026 14:14:01.363 OracleEventId.DecimalTypeDefaultWarning[30000] (Microsoft.EntityFrameworkCore.Model.Validation) 
      The decimal property 'NU_GRUPO_RSPNL_TRTMO' on entity type 'Soutba63GestorResponsavel' does not have a store type specified. This may lead to a precision loss if the values do not fit in the default precision and scale. Oracle recommends to explicitly specify the column type that can accommodate all the values in 'OnModelCreating' using 'HasColumnType', specify precision and scale using 'HasPrecision', or configure a value converter using 'HasConversion'.
warn: 09/09/2026 14:14:01.364 OracleEventId.DecimalTypeKeyWarning[30003] (Microsoft.EntityFrameworkCore.Model.Validation) 
      A decimal property 'NU_ADTRA_CTGRO_EQUIPE_RSPNL' is part of a key on entity type 'Soutbb76CtgroEquipeRspnl' which may lead to a precision loss if the configured precision and scale don't match the column type in the database. Consider using a different property as the key, or make sure that the database column type matches the model configuration.
warn: 09/09/2026 14:14:01.364 OracleEventId.DecimalTypeKeyWarning[30003] (Microsoft.EntityFrameworkCore.Model.Validation) 
      A decimal property 'NU_ADTRA_ORIGEM_NATUREZA' is part of a key on entity type 'Soutbb81OrigemNatureza' which may lead to a precision loss if the configured precision and scale don't match the column type in the database. Consider using a different property as the key, or make sure that the database column type matches the model configuration.
info: 09/09/2026 14:14:05.213 RelationalEventId.CommandExecuted[20101] (Microsoft.EntityFrameworkCore.Database.Command) 
      Executed DbCommand (392ms) [Parameters=[:cnpjTerceirizada_0='39565194000108' (Size = 14) (DbType = AnsiString)], CommandType='Text', CommandTimeout='120']
      SELECT COUNT(*)
      FROM (
          SELECT "s"."NU_OCORRENCIA_EXTERNA"
          FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s"
          LEFT JOIN "SOU"."SOUTB043_SOLICITANTE" "s0" ON "s"."NU_SOLICITANTE_OCORRENCIA" = "s0"."NU_SOLICITANTE"
          INNER JOIN "SOU"."SOUTB035_SITUACAO_OCORRENCIA" "s1" ON "s"."NU_SITUACAO_OCORRENCIA" = "s1"."NU_SITUACAO_OCORRENCIA"
          LEFT JOIN "SOU"."SOUTB002_ORIGEM_OCORRENCIA" "s2" ON (("s"."NU_ORIGEM_OCORRENCIA" = "s2"."NU_ORIGEM_OCORRENCIA") AND ("s"."NU_TIPO_OCORRENCIA" = "s2"."NU_TIPO_OCORRENCIA"))
          LEFT JOIN "SOU"."SOUTB003_NATUREZA_MANIFESTO" "s3" ON "s"."NU_NATUREZA_MANIFESTO" = "s3"."NU_NATUREZA_MANIFESTO"
          LEFT JOIN "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s4" ON "s"."NU_OCORRENCIA_EXTERNA" = "s4"."NU_OCORRENCIA_EXTERNA"
          LEFT JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s5" ON "s4"."NU_CLSFO_OCRNA_EXTERNA" = "s5"."NU_CLSFO_OCRNA_EXTERNA"
          LEFT JOIN "SOU"."SOUTB050_PRODUTO_MANIFESTO" "s6" ON "s5"."NU_PRODUTO_MANIFESTO" = "s6"."NU_PRODUTO_MANIFESTO"
          LEFT JOIN "SOU"."SOUTB051_PROBLEMA_MANIFESTO" "s7" ON "s5"."NU_PROBLEMA_MANIFESTO" = "s7"."NU_PROBLEMA_MANIFESTO"
          LEFT JOIN "SOU"."SOUTB048_TELEFONE_SOLICITANTE" "s8" ON (("s0"."NU_SOLICITANTE" = "s8"."NU_SOLICITANTE") AND ('S' = "s8"."IC_PADRAO"))
          LEFT JOIN "SOU"."SOUTB044_ENDERECO_SOLICITANTE" "s9" ON (("s0"."NU_SOLICITANTE" = "s9"."NU_SOLICITANTE") AND ('S' = "s9"."IC_PADRAO"))
          LEFT JOIN "SOU"."SOUTB049_EMAIL_SOLICITANTE" "s10" ON (("s0"."NU_SOLICITANTE" = "s10"."NU_SOLICITANTE") AND ('S' = "s10"."IC_PADRAO"))
          LEFT JOIN "SOU"."SOUTB185_PROMESSA_RESPOSTA" "s11" ON "s"."NU_OCORRENCIA_EXTERNA" = "s11"."NU_OCORRENCIA_EXTERNA"
          WHERE (((((("s"."NU_TIPO_OCORRENCIA" = 3) AND ("s"."IC_OCORRENCIA_EXTERNA_LIDA" = N'N'))) AND ("s1"."NU_SITUACAO_OCORRENCIA" IN (14, 17, 19)))) AND (EXISTS (
              SELECT 1
              FROM "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s12"
              INNER JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s13" ON "s12"."NU_CLSFO_OCRNA_EXTERNA" = "s13"."NU_CLSFO_OCRNA_EXTERNA"
              INNER JOIN "SOU"."SOUTB055_CLSFO_UNDDE_RSPNL" "s14" ON "s13"."NU_CLSFO_OCRNA_EXTERNA" = "s14"."NU_CLSFO_OCRNA_EXTERNA"
              INNER JOIN "SOU"."SOUTB141_EMPRESA_TERCEIRIZADA" "s15" ON "s14"."NU_EMPRESA_TERCEIRIZADA" = "s15"."NU_EMPRESA_TERCEIRIZADA"
              WHERE (("s12"."NU_OCORRENCIA_EXTERNA" = "s"."NU_OCORRENCIA_EXTERNA") AND ("s15"."CO_CNPJ_EMPRESA_TERCEIRIZADA" = :cnpjTerceirizada_0)))))
          GROUP BY "s"."NU_OCORRENCIA_EXTERNA"
      ) "t"
warn: 09/09/2026 14:14:05.292 CoreEventId.RowLimitingOperationWithoutOrderByWarning[10102] (Microsoft.EntityFrameworkCore.Query) 
      The query uses a row limiting operator ('Skip'/'Take') without an 'OrderBy' operator. This may lead to unpredictable results. If the 'Distinct' operator is used after 'OrderBy', then make sure to use the 'OrderBy' operator after 'Distinct' as the ordering would otherwise get erased.
warn: 09/09/2026 14:14:05.292 CoreEventId.RowLimitingOperationWithoutOrderByWarning[10102] (Microsoft.EntityFrameworkCore.Query) 
      The query uses a row limiting operator ('Skip'/'Take') without an 'OrderBy' operator. This may lead to unpredictable results. If the 'Distinct' operator is used after 'OrderBy', then make sure to use the 'OrderBy' operator after 'Distinct' as the ordering would otherwise get erased.
warn: 09/09/2026 14:14:05.991 RelationalEventId.MultipleCollectionIncludeWarning[20504] (Microsoft.EntityFrameworkCore.Query) 
      Compiling a query which loads related collections for more than one collection navigation, either via 'Include' or through projection, but no 'QuerySplittingBehavior' has been configured. By default, Entity Framework will use 'QuerySplittingBehavior.SingleQuery', which can potentially result in slow query performance. See https://go.microsoft.com/fwlink/?linkid=2134277 for more information. To identify the query that's triggering this warning call 'ConfigureWarnings(w => w.Throw(RelationalEventId.MultipleCollectionIncludeWarning))'.
info: 09/09/2026 14:14:08.293 RelationalEventId.CommandExecuted[20101] (Microsoft.EntityFrameworkCore.Database.Command) 
      Executed DbCommand (2,130ms) [Parameters=[:cnpjTerceirizada_0='39565194000108' (Size = 14) (DbType = AnsiString), :p_1='0', :p_2='200'], CommandType='Text', CommandTimeout='120']
      SELECT "t"."c", "t"."NU_OCORRENCIA_EXTERNA", "t0"."NU_OCORRENCIA_EXTERNA", "t0"."NU_SOLICITANTE", "t0"."NU_SITUACAO_OCORRENCIA0", "t0"."NU_ORIGEM_OCORRENCIA0", "t0"."NU_TIPO_OCORRENCIA0", "t0"."NU_NATUREZA_MANIFESTO0", "t0"."NU_OCORRENCIA_EXTERNA0", "t0"."NU_CLSFO_OCRNA_EXTERNA", "t0"."NU_CLSFO_OCRNA_EXTERNA0", "t0"."NU_PRODUTO_MANIFESTO0", "t0"."NU_PROBLEMA_MANIFESTO0", "t0"."NU_SOLICITANTE0", "t0"."NU_DDD", "t0"."NU_TELEFONE", "t0"."NU_ENDERECO_SOLICITANTE", "t0"."NU_SOLICITANTE1", "t0"."DE_EMAIL", "t0"."NU_OCORRENCIA_EXTERNA1", "t2"."NU_OCORRENCIA_EXTERNA", "t2"."NU_SOLICITANTE", "t2"."NU_SITUACAO_OCORRENCIA", "t2"."NU_ORIGEM_OCORRENCIA", "t2"."NU_TIPO_OCORRENCIA", "t2"."NU_NATUREZA_MANIFESTO", "t2"."NU_OCORRENCIA_EXTERNA0", "t2"."NU_CLSFO_OCRNA_EXTERNA", "t2"."NU_CLSFO_OCRNA_EXTERNA0", "t2"."NU_PRODUTO_MANIFESTO", "t2"."NU_PROBLEMA_MANIFESTO", "t2"."NU_SOLICITANTE0", "t2"."NU_DDD", "t2"."NU_TELEFONE", "t2"."NU_ENDERECO_SOLICITANTE", "t2"."NU_SOLICITANTE1", "t2"."DE_EMAIL", "t2"."NU_OCORRENCIA_EXTERNA1", "t4"."NU_OCORRENCIA_EXTERNA", "t4"."NU_SOLICITANTE", "t4"."NU_SITUACAO_OCORRENCIA", "t4"."NU_ORIGEM_OCORRENCIA", "t4"."NU_TIPO_OCORRENCIA0", "t4"."NU_NATUREZA_MANIFESTO", "t4"."NU_OCORRENCIA_EXTERNA0", "t4"."NU_CLSFO_OCRNA_EXTERNA", "t4"."NU_CLSFO_OCRNA_EXTERNA0", "t4"."NU_PRODUTO_MANIFESTO", "t4"."NU_PROBLEMA_MANIFESTO", "t4"."NU_SOLICITANTE0", "t4"."NU_DDD", "t4"."NU_TELEFONE", "t4"."NU_ENDERECO_SOLICITANTE", "t4"."NU_SOLICITANTE1", "t4"."DE_EMAIL", "t4"."NU_OCORRENCIA_EXTERNA1", "t6"."NU_OCORRENCIA_EXTERNA", "t6"."NU_SOLICITANTE", "t6"."NU_SITUACAO_OCORRENCIA", "t6"."NU_ORIGEM_OCORRENCIA", "t6"."NU_TIPO_OCORRENCIA", "t6"."NU_NATUREZA_MANIFESTO", "t6"."NU_OCORRENCIA_EXTERNA0", "t6"."NU_CLSFO_OCRNA_EXTERNA", "t6"."NU_CLSFO_OCRNA_EXTERNA0", "t6"."NU_PRODUTO_MANIFESTO", "t6"."NU_PROBLEMA_MANIFESTO", "t6"."NU_SOLICITANTE0", "t6"."NU_DDD", "t6"."NU_TELEFONE", "t6"."NU_ENDERECO_SOLICITANTE", "t6"."NU_SOLICITANTE1", "t6"."DE_EMAIL", "t6"."NU_OCORRENCIA_EXTERNA1", "t8"."NU_OCORRENCIA_EXTERNA", "t8"."NU_SOLICITANTE", "t8"."NU_SITUACAO_OCORRENCIA", "t8"."NU_ORIGEM_OCORRENCIA", "t8"."NU_TIPO_OCORRENCIA0", "t8"."NU_NATUREZA_MANIFESTO", "t8"."NU_OCORRENCIA_EXTERNA0", "t8"."NU_CLSFO_OCRNA_EXTERNA", "t8"."NU_CLSFO_OCRNA_EXTERNA0", "t8"."NU_PRODUTO_MANIFESTO", "t8"."NU_PROBLEMA_MANIFESTO", "t8"."NU_SOLICITANTE0", "t8"."NU_DDD", "t8"."NU_TELEFONE", "t8"."NU_ENDERECO_SOLICITANTE", "t8"."NU_SOLICITANTE1", "t8"."DE_EMAIL", "t8"."NU_OCORRENCIA_EXTERNA1", "t10"."NU_OCORRENCIA_EXTERNA", "t10"."NU_SOLICITANTE0", "t10"."NU_SITUACAO_OCORRENCIA", "t10"."NU_ORIGEM_OCORRENCIA", "t10"."NU_TIPO_OCORRENCIA", "t10"."NU_NATUREZA_MANIFESTO", "t10"."NU_OCORRENCIA_EXTERNA0", "t10"."NU_CLSFO_OCRNA_EXTERNA", "t10"."NU_CLSFO_OCRNA_EXTERNA0", "t10"."NU_PRODUTO_MANIFESTO", "t10"."NU_PROBLEMA_MANIFESTO", "t10"."NU_SOLICITANTE", "t10"."NU_DDD", "t10"."NU_TELEFONE", "t10"."NU_ENDERECO_SOLICITANTE", "t10"."NU_SOLICITANTE1", "t10"."DE_EMAIL", "t10"."NU_OCORRENCIA_EXTERNA1", "t12"."NU_OCORRENCIA_EXTERNA", "t12"."NU_SOLICITANTE0", "t12"."NU_SITUACAO_OCORRENCIA", "t12"."NU_ORIGEM_OCORRENCIA", "t12"."NU_TIPO_OCORRENCIA", "t12"."NU_NATUREZA_MANIFESTO", "t12"."NU_OCORRENCIA_EXTERNA0", "t12"."NU_CLSFO_OCRNA_EXTERNA", "t12"."NU_CLSFO_OCRNA_EXTERNA0", "t12"."NU_PRODUTO_MANIFESTO", "t12"."NU_PROBLEMA_MANIFESTO", "t12"."NU_SOLICITANTE1", "t12"."NU_DDD", "t12"."NU_TELEFONE", "t12"."NU_ENDERECO_SOLICITANTE", "t12"."NU_SOLICITANTE2", "t12"."DE_EMAIL", "t12"."NU_OCORRENCIA_EXTERNA1", "t14"."DE_EMAIL", "t15"."NO_PRODUTO_MANIFESTO", "t16"."NO_PROBLEMA_MANIFESTO", "t"."c0", "t0"."CO_AUTO_INFRACAO", "t0"."CO_CONTA", "t0"."CO_ENTIDADE_CIVIL", "t0"."CO_FICHA_AUTUACAO", "t0"."CO_OPERACAO", "t0"."CO_PROCESSO_ADMINISTRATIVO", "t0"."CO_PROTOCOLO_EXTERNO", "t0"."CO_TRANSACAO_GED", "t0"."CO_USUARIO_CADASTRO", "t0"."DE_EMAIL_ENTIDADE_CIVIL", "t0"."DE_JSTVA_OCRNA_PERTINENTE", "t0"."DE_JUSTIFICATIVA_CANCELAMENTO", "t0"."DE_MANIFESTO_CLIENTE", "t0"."DE_MASCARA_PROTOCOLO_EXTERNO", "t0"."DE_MINUTA_RESPOSTA", "t0"."DE_OBSERVACAO_PARECER", "t0"."DE_OBSRO_APTMO_AVLCO_OCRNA", "t0"."DE_PROVIDENCIA", "t0"."DE_RECURSO_OCORRENCIA", "t0"."DE_RESPOSTA_OCORRENCIA", "t0"."DH_RESPOSTA_AVALIACAO", "t0"."DH_RESPOSTA_OCORRENCIA", "t0"."DT_ABERTURA_EXTERNA", "t0"."DT_AUDIENCIA_ORGO_DEFESA_CNSMR", "t0"."DT_CONVOCACAO_AUDIENCIA", "t0"."DT_FINAL_DEFESA", "t0"."DT_FINAL_OCORRENCIA_EXTERNA", "t0"."DT_FINAL_PAGAMENTO_MULTA", "t0"."DT_FINAL_RESPOSTA_FICHA_ATCO", "t0"."DT_INICIO_OCORRENCIA", "t0"."DT_PROMESSA_RESPOSTA", "t0"."DT_RECEBIMENTO_FICHA_AUTUACAO", "t0"."DT_RECEBIMENTO_OCORRENCIA", "t0"."DT_REGISTRO_PRE_OCORRENCIA", "t0"."DT_RESPOSTA_NOTIFICACAO", "t0"."IC_ALCADA_RESPOSTA", "t0"."IC_AUTO_INFRACAO", "t0"."IC_CANAL_RESPOSTA_AVALIACAO", "t0"."IC_GRAU_DIFICULDADE", "t0"."IC_OCORRENCIA_EXTERNA_LIDA", "t0"."IC_PERMITE_RECURSO", "t0"."IC_PERTINENCIA_OCORRENCIA", "t0"."IC_PRAZO_REABERTURA_DIA_UTIL", "t0"."IC_PRAZO_RESPOSTA_DIA_UTIL", "t0"."IC_PRAZO_RSPSA_RBRTA_DIA_UTIL", "t0"."IC_PROTOCOLO_EXTERNO", "t0"."IC_REABERTURA_OCORRENCIA", "t0"."IC_TIPO_COMPLEMENTO_RESPOSTA", "t0"."IC_TIPO_DENUNCIA", "t0"."IC_TPO_RESPOSTA_DENUNCIA_MGRCO", "t0"."NU_ASSINATURA_PARECER", "t0"."NU_ATNTO_ORGO_DFSA_CNSMR", "t0"."NU_CORRESPONDENTE_BANCARIO", "t0"."NU_ENCAMINHAMENTO_BACEN", "t0"."NU_IDENTIFICACAO_OCORRENCIA", "t0"."NU_IDENTIFICADOR_BACEN", "t0"."NU_MOTIVO_ENCERRAMENTO", "t0"."NU_NATURAL_ABERTURA", "t0"."NU_NATURAL_AGENCIA", "t0"."NU_NATURAL_FISCALIZADA", "t0"."NU_NATUREZA_MANIFESTO", "t0"."NU_NOTA_AVALIACAO_ATENDIMENTO", "t0"."NU_NOTA_AVALIACAO_SOLUCAO", "t0"."NU_OCORRENCIA_VINCULADA", "t0"."NU_ORIGEM_OCORRENCIA", "t0"."NU_PRE_OCORRENCIA", "t0"."NU_PROBLEMA_COMUNICACAO", "t0"."NU_PROBLEMA_MANIFESTO", "t0"."NU_PRODUTO_MANIFESTO", "t0"."NU_REVENDEDOR_LOTERICO", "t0"."NU_SITUACAO_OCORRENCIA", "t0"."NU_SOLICITANTE_OCORRENCIA", "t0"."NU_TIPO_ATENDIMENTO_OCRNA", "t0"."NU_TIPO_OCORRENCIA", "t0"."NU_TPO_ATNTO_DFSA_CNSMR", "t0"."NU_UNIDADE_ABERTURA", "t0"."NU_UNIDADE_AGENCIA", "t0"."NU_UNIDADE_FISCALIZADA", "t0"."PZ_OCORRENCIA_EXTERNA", "t0"."PZ_REABERTURA_OCORRENCIA", "t0"."PZ_RESPOSTA_OCRNA_DIA_UTIL", "t0"."PZ_RESPOSTA_RBRTA_OCORRENCIA", "t0"."QT_REABERTURA_OCORRENCIA", "t0"."VR_MULTA_ORGAO_DFSA_CONSUMIDOR", "t2"."CO_CNPJ", "t2"."IC_GRAU_RELACIONAMENTO", "t2"."IC_PESSOA_VULNERAVEL", "t2"."IC_SEXO", "t2"."IC_TIPO_SOLICITANTE", "t2"."NO_RAZAO_SOCIAL", "t2"."NO_SOLICITANTE", "t2"."NU_CPF", "t2"."NU_PESSOA", "t2"."NU_SEGMENTO", "t2"."NU_SOLICITANTE_PRINCIPAL", "t4"."NO_SITUACAO_OCORRENCIA", "t4"."NU_TIPO_OCORRENCIA", "t6"."CO_ORIGEM_OCORRENCIA", "t6"."DE_MASCARA_PROTOCOLO_EXTERNO", "t6"."IC_ATIVO", "t6"."IC_DIA_ABERTURA", "t6"."IC_DIA_REABERTURA", "t6"."IC_DIA_RESPOSTA_REABERTURA", "t6"."IC_PRAZO_REABERTURA", "t6"."IC_PRAZO_RESPOSTA", "t6"."IC_PRAZO_RESPOSTA_REABERTURA", "t6"."IC_PROTOCOLO_EXTERNO", "t6"."IC_REABERTURA", "t6"."NO_ORIGEM_OCORRENCIA", "t6"."PZ_REABERTURA", "t6"."PZ_RESPOSTA", "t6"."PZ_RESPOSTA_REABERTURA", "t6"."QT_REABERTURA", "t8"."CO_NATUREZA_MANIFESTO_OCRNA", "t8"."IC_ATIVO", "t8"."IC_CAMPO_SUGESTAO_ACATADA", "t8"."IC_HABILITA_MATRICULA", "t8"."IC_HABILITA_UNIDADE", "t8"."IC_PERMITE_ANONIMO", "t8"."IC_PERMITE_PRORROGACAO", "t8"."IC_REABERTURA", "t8"."NO_NATUREZA_MANIFESTO", "t8"."NU_TIPO_OCORRENCIA", "t8"."PZ_LIMITE_PRORROGACAO", "t8"."PZ_LIMITE_TRANSFERENCIA", "t8"."PZ_REABERTURA", "t8"."PZ_RESPOSTA", "t8"."PZ_RESPOSTA_REABERTURA", "t8"."QT_PRORROGACAO", "t8"."QT_REABERTURA", "t10"."DH_INCLUSAO_TELEFONE", "t10"."IC_FONTE_TELEFONE", "t10"."IC_PADRAO", "t10"."IC_TIPO_TELEFONE", "t12"."CO_ENDERECO_SOLICITANTE", "t12"."DE_COMPLEMENTO", "t12"."DH_INCLUSAO_ENDERECO", "t12"."IC_FONTE_ENDERECO", "t12"."IC_PADRAO", "t12"."NU_BAIRRO", "t12"."NU_CEP", "t12"."NU_LOCALIDADE", "t12"."NU_LOGRADOURO", "t12"."NU_SOLICITANTE", "t12"."SG_UF"
      FROM (
          SELECT (
              SELECT "s16"."DT_ABERTURA_EXTERNA"
              FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s16"
              LEFT JOIN "SOU"."SOUTB043_SOLICITANTE" "s17" ON "s16"."NU_SOLICITANTE_OCORRENCIA" = "s17"."NU_SOLICITANTE"
              INNER JOIN "SOU"."SOUTB035_SITUACAO_OCORRENCIA" "s18" ON "s16"."NU_SITUACAO_OCORRENCIA" = "s18"."NU_SITUACAO_OCORRENCIA"
              LEFT JOIN "SOU"."SOUTB002_ORIGEM_OCORRENCIA" "s19" ON (("s16"."NU_ORIGEM_OCORRENCIA" = "s19"."NU_ORIGEM_OCORRENCIA") AND ("s16"."NU_TIPO_OCORRENCIA" = "s19"."NU_TIPO_OCORRENCIA"))
              LEFT JOIN "SOU"."SOUTB003_NATUREZA_MANIFESTO" "s20" ON "s16"."NU_NATUREZA_MANIFESTO" = "s20"."NU_NATUREZA_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s21" ON "s16"."NU_OCORRENCIA_EXTERNA" = "s21"."NU_OCORRENCIA_EXTERNA"
              LEFT JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s22" ON "s21"."NU_CLSFO_OCRNA_EXTERNA" = "s22"."NU_CLSFO_OCRNA_EXTERNA"
              LEFT JOIN "SOU"."SOUTB050_PRODUTO_MANIFESTO" "s23" ON "s22"."NU_PRODUTO_MANIFESTO" = "s23"."NU_PRODUTO_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB051_PROBLEMA_MANIFESTO" "s24" ON "s22"."NU_PROBLEMA_MANIFESTO" = "s24"."NU_PROBLEMA_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB048_TELEFONE_SOLICITANTE" "s25" ON (("s17"."NU_SOLICITANTE" = "s25"."NU_SOLICITANTE") AND ('S' = "s25"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB044_ENDERECO_SOLICITANTE" "s26" ON (("s17"."NU_SOLICITANTE" = "s26"."NU_SOLICITANTE") AND ('S' = "s26"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB049_EMAIL_SOLICITANTE" "s27" ON (("s17"."NU_SOLICITANTE" = "s27"."NU_SOLICITANTE") AND ('S' = "s27"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB185_PROMESSA_RESPOSTA" "s28" ON "s16"."NU_OCORRENCIA_EXTERNA" = "s28"."NU_OCORRENCIA_EXTERNA"
              WHERE (((((((("s16"."NU_TIPO_OCORRENCIA" = 3) AND ("s16"."IC_OCORRENCIA_EXTERNA_LIDA" = N'N'))) AND ((((("s18"."NU_SITUACAO_OCORRENCIA" = 14) OR ("s18"."NU_SITUACAO_OCORRENCIA" = 17))) OR ("s18"."NU_SITUACAO_OCORRENCIA" = 19))))) AND (EXISTS (
                  SELECT 1
                  FROM "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s29"
                  INNER JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s30" ON "s29"."NU_CLSFO_OCRNA_EXTERNA" = "s30"."NU_CLSFO_OCRNA_EXTERNA"
                  INNER JOIN "SOU"."SOUTB055_CLSFO_UNDDE_RSPNL" "s31" ON "s30"."NU_CLSFO_OCRNA_EXTERNA" = "s31"."NU_CLSFO_OCRNA_EXTERNA"
                  INNER JOIN "SOU"."SOUTB141_EMPRESA_TERCEIRIZADA" "s32" ON "s31"."NU_EMPRESA_TERCEIRIZADA" = "s32"."NU_EMPRESA_TERCEIRIZADA"
                  WHERE (("s29"."NU_OCORRENCIA_EXTERNA" = "s16"."NU_OCORRENCIA_EXTERNA") AND ("s32"."CO_CNPJ_EMPRESA_TERCEIRIZADA" = :cnpjTerceirizada_0)))))) AND ("s"."NU_OCORRENCIA_EXTERNA" = "s16"."NU_OCORRENCIA_EXTERNA"))
              FETCH FIRST 1 ROWS ONLY) "c", (
              SELECT "s45"."DE_PROMESSA_RESPOSTA"
              FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s33"
              LEFT JOIN "SOU"."SOUTB043_SOLICITANTE" "s34" ON "s33"."NU_SOLICITANTE_OCORRENCIA" = "s34"."NU_SOLICITANTE"
              INNER JOIN "SOU"."SOUTB035_SITUACAO_OCORRENCIA" "s35" ON "s33"."NU_SITUACAO_OCORRENCIA" = "s35"."NU_SITUACAO_OCORRENCIA"
              LEFT JOIN "SOU"."SOUTB002_ORIGEM_OCORRENCIA" "s36" ON (("s33"."NU_ORIGEM_OCORRENCIA" = "s36"."NU_ORIGEM_OCORRENCIA") AND ("s33"."NU_TIPO_OCORRENCIA" = "s36"."NU_TIPO_OCORRENCIA"))
              LEFT JOIN "SOU"."SOUTB003_NATUREZA_MANIFESTO" "s37" ON "s33"."NU_NATUREZA_MANIFESTO" = "s37"."NU_NATUREZA_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s38" ON "s33"."NU_OCORRENCIA_EXTERNA" = "s38"."NU_OCORRENCIA_EXTERNA"
              LEFT JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s39" ON "s38"."NU_CLSFO_OCRNA_EXTERNA" = "s39"."NU_CLSFO_OCRNA_EXTERNA"
              LEFT JOIN "SOU"."SOUTB050_PRODUTO_MANIFESTO" "s40" ON "s39"."NU_PRODUTO_MANIFESTO" = "s40"."NU_PRODUTO_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB051_PROBLEMA_MANIFESTO" "s41" ON "s39"."NU_PROBLEMA_MANIFESTO" = "s41"."NU_PROBLEMA_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB048_TELEFONE_SOLICITANTE" "s42" ON (("s34"."NU_SOLICITANTE" = "s42"."NU_SOLICITANTE") AND ('S' = "s42"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB044_ENDERECO_SOLICITANTE" "s43" ON (("s34"."NU_SOLICITANTE" = "s43"."NU_SOLICITANTE") AND ('S' = "s43"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB049_EMAIL_SOLICITANTE" "s44" ON (("s34"."NU_SOLICITANTE" = "s44"."NU_SOLICITANTE") AND ('S' = "s44"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB185_PROMESSA_RESPOSTA" "s45" ON "s33"."NU_OCORRENCIA_EXTERNA" = "s45"."NU_OCORRENCIA_EXTERNA"
              WHERE (((((((("s33"."NU_TIPO_OCORRENCIA" = 3) AND ("s33"."IC_OCORRENCIA_EXTERNA_LIDA" = N'N'))) AND ((((("s35"."NU_SITUACAO_OCORRENCIA" = 14) OR ("s35"."NU_SITUACAO_OCORRENCIA" = 17))) OR ("s35"."NU_SITUACAO_OCORRENCIA" = 19))))) AND (EXISTS (
                  SELECT 1
                  FROM "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s46"
                  INNER JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s47" ON "s46"."NU_CLSFO_OCRNA_EXTERNA" = "s47"."NU_CLSFO_OCRNA_EXTERNA"
                  INNER JOIN "SOU"."SOUTB055_CLSFO_UNDDE_RSPNL" "s48" ON "s47"."NU_CLSFO_OCRNA_EXTERNA" = "s48"."NU_CLSFO_OCRNA_EXTERNA"
                  INNER JOIN "SOU"."SOUTB141_EMPRESA_TERCEIRIZADA" "s49" ON "s48"."NU_EMPRESA_TERCEIRIZADA" = "s49"."NU_EMPRESA_TERCEIRIZADA"
                  WHERE (("s46"."NU_OCORRENCIA_EXTERNA" = "s33"."NU_OCORRENCIA_EXTERNA") AND ("s49"."CO_CNPJ_EMPRESA_TERCEIRIZADA" = :cnpjTerceirizada_0)))))) AND ("s"."NU_OCORRENCIA_EXTERNA" = "s33"."NU_OCORRENCIA_EXTERNA"))
              FETCH FIRST 1 ROWS ONLY) "c0", "s"."NU_OCORRENCIA_EXTERNA"
          FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s"
          LEFT JOIN "SOU"."SOUTB043_SOLICITANTE" "s0" ON "s"."NU_SOLICITANTE_OCORRENCIA" = "s0"."NU_SOLICITANTE"
          INNER JOIN "SOU"."SOUTB035_SITUACAO_OCORRENCIA" "s1" ON "s"."NU_SITUACAO_OCORRENCIA" = "s1"."NU_SITUACAO_OCORRENCIA"
          LEFT JOIN "SOU"."SOUTB002_ORIGEM_OCORRENCIA" "s2" ON (("s"."NU_ORIGEM_OCORRENCIA" = "s2"."NU_ORIGEM_OCORRENCIA") AND ("s"."NU_TIPO_OCORRENCIA" = "s2"."NU_TIPO_OCORRENCIA"))
          LEFT JOIN "SOU"."SOUTB003_NATUREZA_MANIFESTO" "s3" ON "s"."NU_NATUREZA_MANIFESTO" = "s3"."NU_NATUREZA_MANIFESTO"
          LEFT JOIN "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s4" ON "s"."NU_OCORRENCIA_EXTERNA" = "s4"."NU_OCORRENCIA_EXTERNA"
          LEFT JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s5" ON "s4"."NU_CLSFO_OCRNA_EXTERNA" = "s5"."NU_CLSFO_OCRNA_EXTERNA"
          LEFT JOIN "SOU"."SOUTB050_PRODUTO_MANIFESTO" "s6" ON "s5"."NU_PRODUTO_MANIFESTO" = "s6"."NU_PRODUTO_MANIFESTO"
          LEFT JOIN "SOU"."SOUTB051_PROBLEMA_MANIFESTO" "s7" ON "s5"."NU_PROBLEMA_MANIFESTO" = "s7"."NU_PROBLEMA_MANIFESTO"
          LEFT JOIN "SOU"."SOUTB048_TELEFONE_SOLICITANTE" "s8" ON (("s0"."NU_SOLICITANTE" = "s8"."NU_SOLICITANTE") AND ('S' = "s8"."IC_PADRAO"))
          LEFT JOIN "SOU"."SOUTB044_ENDERECO_SOLICITANTE" "s9" ON (("s0"."NU_SOLICITANTE" = "s9"."NU_SOLICITANTE") AND ('S' = "s9"."IC_PADRAO"))
          LEFT JOIN "SOU"."SOUTB049_EMAIL_SOLICITANTE" "s10" ON (("s0"."NU_SOLICITANTE" = "s10"."NU_SOLICITANTE") AND ('S' = "s10"."IC_PADRAO"))
          LEFT JOIN "SOU"."SOUTB185_PROMESSA_RESPOSTA" "s11" ON "s"."NU_OCORRENCIA_EXTERNA" = "s11"."NU_OCORRENCIA_EXTERNA"
          WHERE (((((("s"."NU_TIPO_OCORRENCIA" = 3) AND ("s"."IC_OCORRENCIA_EXTERNA_LIDA" = N'N'))) AND ("s1"."NU_SITUACAO_OCORRENCIA" IN (14, 17, 19)))) AND (EXISTS (
              SELECT 1
              FROM "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s12"
              INNER JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s13" ON "s12"."NU_CLSFO_OCRNA_EXTERNA" = "s13"."NU_CLSFO_OCRNA_EXTERNA"
              INNER JOIN "SOU"."SOUTB055_CLSFO_UNDDE_RSPNL" "s14" ON "s13"."NU_CLSFO_OCRNA_EXTERNA" = "s14"."NU_CLSFO_OCRNA_EXTERNA"
              INNER JOIN "SOU"."SOUTB141_EMPRESA_TERCEIRIZADA" "s15" ON "s14"."NU_EMPRESA_TERCEIRIZADA" = "s15"."NU_EMPRESA_TERCEIRIZADA"
              WHERE (("s12"."NU_OCORRENCIA_EXTERNA" = "s"."NU_OCORRENCIA_EXTERNA") AND ("s15"."CO_CNPJ_EMPRESA_TERCEIRIZADA" = :cnpjTerceirizada_0)))))
          GROUP BY "s"."NU_OCORRENCIA_EXTERNA"
          OFFSET :p_1 ROWS FETCH NEXT :p_2 ROWS ONLY
      ) "t"
      LEFT JOIN (
          SELECT "t1"."NU_OCORRENCIA_EXTERNA", "t1"."CO_AUTO_INFRACAO", "t1"."CO_CONTA", "t1"."CO_ENTIDADE_CIVIL", "t1"."CO_FICHA_AUTUACAO", "t1"."CO_OPERACAO", "t1"."CO_PROCESSO_ADMINISTRATIVO", "t1"."CO_PROTOCOLO_EXTERNO", "t1"."CO_TRANSACAO_GED", "t1"."CO_USUARIO_CADASTRO", "t1"."DE_EMAIL_ENTIDADE_CIVIL", "t1"."DE_JSTVA_OCRNA_PERTINENTE", "t1"."DE_JUSTIFICATIVA_CANCELAMENTO", "t1"."DE_MANIFESTO_CLIENTE", "t1"."DE_MASCARA_PROTOCOLO_EXTERNO", "t1"."DE_MINUTA_RESPOSTA", "t1"."DE_OBSERVACAO_PARECER", "t1"."DE_OBSRO_APTMO_AVLCO_OCRNA", "t1"."DE_PROVIDENCIA", "t1"."DE_RECURSO_OCORRENCIA", "t1"."DE_RESPOSTA_OCORRENCIA", "t1"."DH_RESPOSTA_AVALIACAO", "t1"."DH_RESPOSTA_OCORRENCIA", "t1"."DT_ABERTURA_EXTERNA", "t1"."DT_AUDIENCIA_ORGO_DEFESA_CNSMR", "t1"."DT_CONVOCACAO_AUDIENCIA", "t1"."DT_FINAL_DEFESA", "t1"."DT_FINAL_OCORRENCIA_EXTERNA", "t1"."DT_FINAL_PAGAMENTO_MULTA", "t1"."DT_FINAL_RESPOSTA_FICHA_ATCO", "t1"."DT_INICIO_OCORRENCIA", "t1"."DT_PROMESSA_RESPOSTA", "t1"."DT_RECEBIMENTO_FICHA_AUTUACAO", "t1"."DT_RECEBIMENTO_OCORRENCIA", "t1"."DT_REGISTRO_PRE_OCORRENCIA", "t1"."DT_RESPOSTA_NOTIFICACAO", "t1"."IC_ALCADA_RESPOSTA", "t1"."IC_AUTO_INFRACAO", "t1"."IC_CANAL_RESPOSTA_AVALIACAO", "t1"."IC_GRAU_DIFICULDADE", "t1"."IC_OCORRENCIA_EXTERNA_LIDA", "t1"."IC_PERMITE_RECURSO", "t1"."IC_PERTINENCIA_OCORRENCIA", "t1"."IC_PRAZO_REABERTURA_DIA_UTIL", "t1"."IC_PRAZO_RESPOSTA_DIA_UTIL", "t1"."IC_PRAZO_RSPSA_RBRTA_DIA_UTIL", "t1"."IC_PROTOCOLO_EXTERNO", "t1"."IC_REABERTURA_OCORRENCIA", "t1"."IC_TIPO_COMPLEMENTO_RESPOSTA", "t1"."IC_TIPO_DENUNCIA", "t1"."IC_TPO_RESPOSTA_DENUNCIA_MGRCO", "t1"."NU_ASSINATURA_PARECER", "t1"."NU_ATNTO_ORGO_DFSA_CNSMR", "t1"."NU_CORRESPONDENTE_BANCARIO", "t1"."NU_ENCAMINHAMENTO_BACEN", "t1"."NU_IDENTIFICACAO_OCORRENCIA", "t1"."NU_IDENTIFICADOR_BACEN", "t1"."NU_MOTIVO_ENCERRAMENTO", "t1"."NU_NATURAL_ABERTURA", "t1"."NU_NATURAL_AGENCIA", "t1"."NU_NATURAL_FISCALIZADA", "t1"."NU_NATUREZA_MANIFESTO", "t1"."NU_NOTA_AVALIACAO_ATENDIMENTO", "t1"."NU_NOTA_AVALIACAO_SOLUCAO", "t1"."NU_OCORRENCIA_VINCULADA", "t1"."NU_ORIGEM_OCORRENCIA", "t1"."NU_PRE_OCORRENCIA", "t1"."NU_PROBLEMA_COMUNICACAO", "t1"."NU_PROBLEMA_MANIFESTO", "t1"."NU_PRODUTO_MANIFESTO", "t1"."NU_REVENDEDOR_LOTERICO", "t1"."NU_SITUACAO_OCORRENCIA", "t1"."NU_SOLICITANTE_OCORRENCIA", "t1"."NU_TIPO_ATENDIMENTO_OCRNA", "t1"."NU_TIPO_OCORRENCIA", "t1"."NU_TPO_ATNTO_DFSA_CNSMR", "t1"."NU_UNIDADE_ABERTURA", "t1"."NU_UNIDADE_AGENCIA", "t1"."NU_UNIDADE_FISCALIZADA", "t1"."PZ_OCORRENCIA_EXTERNA", "t1"."PZ_REABERTURA_OCORRENCIA", "t1"."PZ_RESPOSTA_OCRNA_DIA_UTIL", "t1"."PZ_RESPOSTA_RBRTA_OCORRENCIA", "t1"."QT_REABERTURA_OCORRENCIA", "t1"."VR_MULTA_ORGAO_DFSA_CONSUMIDOR", "t1"."NU_SOLICITANTE", "t1"."NU_SITUACAO_OCORRENCIA0", "t1"."NU_ORIGEM_OCORRENCIA0", "t1"."NU_TIPO_OCORRENCIA0", "t1"."NU_NATUREZA_MANIFESTO0", "t1"."NU_OCORRENCIA_EXTERNA0", "t1"."NU_CLSFO_OCRNA_EXTERNA", "t1"."NU_CLSFO_OCRNA_EXTERNA0", "t1"."NU_PRODUTO_MANIFESTO0", "t1"."NU_PROBLEMA_MANIFESTO0", "t1"."NU_SOLICITANTE0", "t1"."NU_DDD", "t1"."NU_TELEFONE", "t1"."NU_ENDERECO_SOLICITANTE", "t1"."NU_SOLICITANTE1", "t1"."DE_EMAIL", "t1"."NU_OCORRENCIA_EXTERNA1"
          FROM (
              SELECT "s50"."NU_OCORRENCIA_EXTERNA", "s50"."CO_AUTO_INFRACAO", "s50"."CO_CONTA", "s50"."CO_ENTIDADE_CIVIL", "s50"."CO_FICHA_AUTUACAO", "s50"."CO_OPERACAO", "s50"."CO_PROCESSO_ADMINISTRATIVO", "s50"."CO_PROTOCOLO_EXTERNO", "s50"."CO_TRANSACAO_GED", "s50"."CO_USUARIO_CADASTRO", "s50"."DE_EMAIL_ENTIDADE_CIVIL", "s50"."DE_JSTVA_OCRNA_PERTINENTE", "s50"."DE_JUSTIFICATIVA_CANCELAMENTO", "s50"."DE_MANIFESTO_CLIENTE", "s50"."DE_MASCARA_PROTOCOLO_EXTERNO", "s50"."DE_MINUTA_RESPOSTA", "s50"."DE_OBSERVACAO_PARECER", "s50"."DE_OBSRO_APTMO_AVLCO_OCRNA", "s50"."DE_PROVIDENCIA", "s50"."DE_RECURSO_OCORRENCIA", "s50"."DE_RESPOSTA_OCORRENCIA", "s50"."DH_RESPOSTA_AVALIACAO", "s50"."DH_RESPOSTA_OCORRENCIA", "s50"."DT_ABERTURA_EXTERNA", "s50"."DT_AUDIENCIA_ORGO_DEFESA_CNSMR", "s50"."DT_CONVOCACAO_AUDIENCIA", "s50"."DT_FINAL_DEFESA", "s50"."DT_FINAL_OCORRENCIA_EXTERNA", "s50"."DT_FINAL_PAGAMENTO_MULTA", "s50"."DT_FINAL_RESPOSTA_FICHA_ATCO", "s50"."DT_INICIO_OCORRENCIA", "s50"."DT_PROMESSA_RESPOSTA", "s50"."DT_RECEBIMENTO_FICHA_AUTUACAO", "s50"."DT_RECEBIMENTO_OCORRENCIA", "s50"."DT_REGISTRO_PRE_OCORRENCIA", "s50"."DT_RESPOSTA_NOTIFICACAO", "s50"."IC_ALCADA_RESPOSTA", "s50"."IC_AUTO_INFRACAO", "s50"."IC_CANAL_RESPOSTA_AVALIACAO", "s50"."IC_GRAU_DIFICULDADE", "s50"."IC_OCORRENCIA_EXTERNA_LIDA", "s50"."IC_PERMITE_RECURSO", "s50"."IC_PERTINENCIA_OCORRENCIA", "s50"."IC_PRAZO_REABERTURA_DIA_UTIL", "s50"."IC_PRAZO_RESPOSTA_DIA_UTIL", "s50"."IC_PRAZO_RSPSA_RBRTA_DIA_UTIL", "s50"."IC_PROTOCOLO_EXTERNO", "s50"."IC_REABERTURA_OCORRENCIA", "s50"."IC_TIPO_COMPLEMENTO_RESPOSTA", "s50"."IC_TIPO_DENUNCIA", "s50"."IC_TPO_RESPOSTA_DENUNCIA_MGRCO", "s50"."NU_ASSINATURA_PARECER", "s50"."NU_ATNTO_ORGO_DFSA_CNSMR", "s50"."NU_CORRESPONDENTE_BANCARIO", "s50"."NU_ENCAMINHAMENTO_BACEN", "s50"."NU_IDENTIFICACAO_OCORRENCIA", "s50"."NU_IDENTIFICADOR_BACEN", "s50"."NU_MOTIVO_ENCERRAMENTO", "s50"."NU_NATURAL_ABERTURA", "s50"."NU_NATURAL_AGENCIA", "s50"."NU_NATURAL_FISCALIZADA", "s50"."NU_NATUREZA_MANIFESTO", "s50"."NU_NOTA_AVALIACAO_ATENDIMENTO", "s50"."NU_NOTA_AVALIACAO_SOLUCAO", "s50"."NU_OCORRENCIA_VINCULADA", "s50"."NU_ORIGEM_OCORRENCIA", "s50"."NU_PRE_OCORRENCIA", "s50"."NU_PROBLEMA_COMUNICACAO", "s50"."NU_PROBLEMA_MANIFESTO", "s50"."NU_PRODUTO_MANIFESTO", "s50"."NU_REVENDEDOR_LOTERICO", "s50"."NU_SITUACAO_OCORRENCIA", "s50"."NU_SOLICITANTE_OCORRENCIA", "s50"."NU_TIPO_ATENDIMENTO_OCRNA", "s50"."NU_TIPO_OCORRENCIA", "s50"."NU_TPO_ATNTO_DFSA_CNSMR", "s50"."NU_UNIDADE_ABERTURA", "s50"."NU_UNIDADE_AGENCIA", "s50"."NU_UNIDADE_FISCALIZADA", "s50"."PZ_OCORRENCIA_EXTERNA", "s50"."PZ_REABERTURA_OCORRENCIA", "s50"."PZ_RESPOSTA_OCRNA_DIA_UTIL", "s50"."PZ_RESPOSTA_RBRTA_OCORRENCIA", "s50"."QT_REABERTURA_OCORRENCIA", "s50"."VR_MULTA_ORGAO_DFSA_CONSUMIDOR", "s51"."NU_SOLICITANTE", "s52"."NU_SITUACAO_OCORRENCIA" "NU_SITUACAO_OCORRENCIA0", "s53"."NU_ORIGEM_OCORRENCIA" "NU_ORIGEM_OCORRENCIA0", "s53"."NU_TIPO_OCORRENCIA" "NU_TIPO_OCORRENCIA0", "s54"."NU_NATUREZA_MANIFESTO" "NU_NATUREZA_MANIFESTO0", "s55"."NU_OCORRENCIA_EXTERNA" "NU_OCORRENCIA_EXTERNA0", "s55"."NU_CLSFO_OCRNA_EXTERNA", "s56"."NU_CLSFO_OCRNA_EXTERNA" "NU_CLSFO_OCRNA_EXTERNA0", "s57"."NU_PRODUTO_MANIFESTO" "NU_PRODUTO_MANIFESTO0", "s58"."NU_PROBLEMA_MANIFESTO" "NU_PROBLEMA_MANIFESTO0", "s59"."NU_SOLICITANTE" "NU_SOLICITANTE0", "s59"."NU_DDD", "s59"."NU_TELEFONE", "s60"."NU_ENDERECO_SOLICITANTE", "s61"."NU_SOLICITANTE" "NU_SOLICITANTE1", "s61"."DE_EMAIL", "s62"."NU_OCORRENCIA_EXTERNA" "NU_OCORRENCIA_EXTERNA1", ROW_NUMBER() OVER(PARTITION BY "s50"."NU_OCORRENCIA_EXTERNA" ORDER BY "s50"."NU_OCORRENCIA_EXTERNA", "s51"."NU_SOLICITANTE", "s52"."NU_SITUACAO_OCORRENCIA", "s53"."NU_ORIGEM_OCORRENCIA", "s53"."NU_TIPO_OCORRENCIA", "s54"."NU_NATUREZA_MANIFESTO", "s55"."NU_OCORRENCIA_EXTERNA", "s55"."NU_CLSFO_OCRNA_EXTERNA", "s56"."NU_CLSFO_OCRNA_EXTERNA", "s57"."NU_PRODUTO_MANIFESTO", "s58"."NU_PROBLEMA_MANIFESTO", "s59"."NU_SOLICITANTE", "s59"."NU_DDD", "s59"."NU_TELEFONE", "s60"."NU_ENDERECO_SOLICITANTE", "s61"."NU_SOLICITANTE", "s61"."DE_EMAIL", "s62"."NU_OCORRENCIA_EXTERNA") "row"
              FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s50"
              LEFT JOIN "SOU"."SOUTB043_SOLICITANTE" "s51" ON "s50"."NU_SOLICITANTE_OCORRENCIA" = "s51"."NU_SOLICITANTE"
              INNER JOIN "SOU"."SOUTB035_SITUACAO_OCORRENCIA" "s52" ON "s50"."NU_SITUACAO_OCORRENCIA" = "s52"."NU_SITUACAO_OCORRENCIA"
              LEFT JOIN "SOU"."SOUTB002_ORIGEM_OCORRENCIA" "s53" ON (("s50"."NU_ORIGEM_OCORRENCIA" = "s53"."NU_ORIGEM_OCORRENCIA") AND ("s50"."NU_TIPO_OCORRENCIA" = "s53"."NU_TIPO_OCORRENCIA"))
              LEFT JOIN "SOU"."SOUTB003_NATUREZA_MANIFESTO" "s54" ON "s50"."NU_NATUREZA_MANIFESTO" = "s54"."NU_NATUREZA_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s55" ON "s50"."NU_OCORRENCIA_EXTERNA" = "s55"."NU_OCORRENCIA_EXTERNA"
              LEFT JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s56" ON "s55"."NU_CLSFO_OCRNA_EXTERNA" = "s56"."NU_CLSFO_OCRNA_EXTERNA"
              LEFT JOIN "SOU"."SOUTB050_PRODUTO_MANIFESTO" "s57" ON "s56"."NU_PRODUTO_MANIFESTO" = "s57"."NU_PRODUTO_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB051_PROBLEMA_MANIFESTO" "s58" ON "s56"."NU_PROBLEMA_MANIFESTO" = "s58"."NU_PROBLEMA_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB048_TELEFONE_SOLICITANTE" "s59" ON (("s51"."NU_SOLICITANTE" = "s59"."NU_SOLICITANTE") AND ('S' = "s59"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB044_ENDERECO_SOLICITANTE" "s60" ON (("s51"."NU_SOLICITANTE" = "s60"."NU_SOLICITANTE") AND ('S' = "s60"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB049_EMAIL_SOLICITANTE" "s61" ON (("s51"."NU_SOLICITANTE" = "s61"."NU_SOLICITANTE") AND ('S' = "s61"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB185_PROMESSA_RESPOSTA" "s62" ON "s50"."NU_OCORRENCIA_EXTERNA" = "s62"."NU_OCORRENCIA_EXTERNA"
              WHERE (((((("s50"."NU_TIPO_OCORRENCIA" = 3) AND ("s50"."IC_OCORRENCIA_EXTERNA_LIDA" = N'N'))) AND ((((("s52"."NU_SITUACAO_OCORRENCIA" = 14) OR ("s52"."NU_SITUACAO_OCORRENCIA" = 17))) OR ("s52"."NU_SITUACAO_OCORRENCIA" = 19))))) AND (EXISTS (
                  SELECT 1
                  FROM "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s63"
                  INNER JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s64" ON "s63"."NU_CLSFO_OCRNA_EXTERNA" = "s64"."NU_CLSFO_OCRNA_EXTERNA"
                  INNER JOIN "SOU"."SOUTB055_CLSFO_UNDDE_RSPNL" "s65" ON "s64"."NU_CLSFO_OCRNA_EXTERNA" = "s65"."NU_CLSFO_OCRNA_EXTERNA"
                  INNER JOIN "SOU"."SOUTB141_EMPRESA_TERCEIRIZADA" "s66" ON "s65"."NU_EMPRESA_TERCEIRIZADA" = "s66"."NU_EMPRESA_TERCEIRIZADA"
                  WHERE (("s63"."NU_OCORRENCIA_EXTERNA" = "s50"."NU_OCORRENCIA_EXTERNA") AND ("s66"."CO_CNPJ_EMPRESA_TERCEIRIZADA" = :cnpjTerceirizada_0)))))
          ) "t1"
          WHERE "t1"."row" <= 1
      ) "t0" ON "t"."NU_OCORRENCIA_EXTERNA" = "t0"."NU_OCORRENCIA_EXTERNA"
      LEFT JOIN (
          SELECT "t3"."NU_SOLICITANTE", "t3"."CO_CNPJ", "t3"."IC_GRAU_RELACIONAMENTO", "t3"."IC_PESSOA_VULNERAVEL", "t3"."IC_SEXO", "t3"."IC_TIPO_SOLICITANTE", "t3"."NO_RAZAO_SOCIAL", "t3"."NO_SOLICITANTE", "t3"."NU_CPF", "t3"."NU_PESSOA", "t3"."NU_SEGMENTO", "t3"."NU_SOLICITANTE_PRINCIPAL", "t3"."NU_OCORRENCIA_EXTERNA", "t3"."NU_SITUACAO_OCORRENCIA", "t3"."NU_ORIGEM_OCORRENCIA", "t3"."NU_TIPO_OCORRENCIA", "t3"."NU_NATUREZA_MANIFESTO", "t3"."NU_OCORRENCIA_EXTERNA0", "t3"."NU_CLSFO_OCRNA_EXTERNA", "t3"."NU_CLSFO_OCRNA_EXTERNA0", "t3"."NU_PRODUTO_MANIFESTO", "t3"."NU_PROBLEMA_MANIFESTO", "t3"."NU_SOLICITANTE0", "t3"."NU_DDD", "t3"."NU_TELEFONE", "t3"."NU_ENDERECO_SOLICITANTE", "t3"."NU_SOLICITANTE1", "t3"."DE_EMAIL", "t3"."NU_OCORRENCIA_EXTERNA1"
          FROM (
              SELECT "s68"."NU_SOLICITANTE", "s68"."CO_CNPJ", "s68"."IC_GRAU_RELACIONAMENTO", "s68"."IC_PESSOA_VULNERAVEL", "s68"."IC_SEXO", "s68"."IC_TIPO_SOLICITANTE", "s68"."NO_RAZAO_SOCIAL", "s68"."NO_SOLICITANTE", "s68"."NU_CPF", "s68"."NU_PESSOA", "s68"."NU_SEGMENTO", "s68"."NU_SOLICITANTE_PRINCIPAL", "s67"."NU_OCORRENCIA_EXTERNA", "s69"."NU_SITUACAO_OCORRENCIA", "s70"."NU_ORIGEM_OCORRENCIA", "s70"."NU_TIPO_OCORRENCIA", "s71"."NU_NATUREZA_MANIFESTO", "s72"."NU_OCORRENCIA_EXTERNA" "NU_OCORRENCIA_EXTERNA0", "s72"."NU_CLSFO_OCRNA_EXTERNA", "s73"."NU_CLSFO_OCRNA_EXTERNA" "NU_CLSFO_OCRNA_EXTERNA0", "s74"."NU_PRODUTO_MANIFESTO", "s75"."NU_PROBLEMA_MANIFESTO", "s76"."NU_SOLICITANTE" "NU_SOLICITANTE0", "s76"."NU_DDD", "s76"."NU_TELEFONE", "s77"."NU_ENDERECO_SOLICITANTE", "s78"."NU_SOLICITANTE" "NU_SOLICITANTE1", "s78"."DE_EMAIL", "s79"."NU_OCORRENCIA_EXTERNA" "NU_OCORRENCIA_EXTERNA1", ROW_NUMBER() OVER(PARTITION BY "s67"."NU_OCORRENCIA_EXTERNA" ORDER BY "s67"."NU_OCORRENCIA_EXTERNA", "s68"."NU_SOLICITANTE", "s69"."NU_SITUACAO_OCORRENCIA", "s70"."NU_ORIGEM_OCORRENCIA", "s70"."NU_TIPO_OCORRENCIA", "s71"."NU_NATUREZA_MANIFESTO", "s72"."NU_OCORRENCIA_EXTERNA", "s72"."NU_CLSFO_OCRNA_EXTERNA", "s73"."NU_CLSFO_OCRNA_EXTERNA", "s74"."NU_PRODUTO_MANIFESTO", "s75"."NU_PROBLEMA_MANIFESTO", "s76"."NU_SOLICITANTE", "s76"."NU_DDD", "s76"."NU_TELEFONE", "s77"."NU_ENDERECO_SOLICITANTE", "s78"."NU_SOLICITANTE", "s78"."DE_EMAIL", "s79"."NU_OCORRENCIA_EXTERNA") "row"
              FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s67"
              LEFT JOIN "SOU"."SOUTB043_SOLICITANTE" "s68" ON "s67"."NU_SOLICITANTE_OCORRENCIA" = "s68"."NU_SOLICITANTE"
              INNER JOIN "SOU"."SOUTB035_SITUACAO_OCORRENCIA" "s69" ON "s67"."NU_SITUACAO_OCORRENCIA" = "s69"."NU_SITUACAO_OCORRENCIA"
              LEFT JOIN "SOU"."SOUTB002_ORIGEM_OCORRENCIA" "s70" ON (("s67"."NU_ORIGEM_OCORRENCIA" = "s70"."NU_ORIGEM_OCORRENCIA") AND ("s67"."NU_TIPO_OCORRENCIA" = "s70"."NU_TIPO_OCORRENCIA"))
              LEFT JOIN "SOU"."SOUTB003_NATUREZA_MANIFESTO" "s71" ON "s67"."NU_NATUREZA_MANIFESTO" = "s71"."NU_NATUREZA_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s72" ON "s67"."NU_OCORRENCIA_EXTERNA" = "s72"."NU_OCORRENCIA_EXTERNA"
              LEFT JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s73" ON "s72"."NU_CLSFO_OCRNA_EXTERNA" = "s73"."NU_CLSFO_OCRNA_EXTERNA"
              LEFT JOIN "SOU"."SOUTB050_PRODUTO_MANIFESTO" "s74" ON "s73"."NU_PRODUTO_MANIFESTO" = "s74"."NU_PRODUTO_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB051_PROBLEMA_MANIFESTO" "s75" ON "s73"."NU_PROBLEMA_MANIFESTO" = "s75"."NU_PROBLEMA_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB048_TELEFONE_SOLICITANTE" "s76" ON (("s68"."NU_SOLICITANTE" = "s76"."NU_SOLICITANTE") AND ('S' = "s76"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB044_ENDERECO_SOLICITANTE" "s77" ON (("s68"."NU_SOLICITANTE" = "s77"."NU_SOLICITANTE") AND ('S' = "s77"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB049_EMAIL_SOLICITANTE" "s78" ON (("s68"."NU_SOLICITANTE" = "s78"."NU_SOLICITANTE") AND ('S' = "s78"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB185_PROMESSA_RESPOSTA" "s79" ON "s67"."NU_OCORRENCIA_EXTERNA" = "s79"."NU_OCORRENCIA_EXTERNA"
              WHERE (((((("s67"."NU_TIPO_OCORRENCIA" = 3) AND ("s67"."IC_OCORRENCIA_EXTERNA_LIDA" = N'N'))) AND ((((("s69"."NU_SITUACAO_OCORRENCIA" = 14) OR ("s69"."NU_SITUACAO_OCORRENCIA" = 17))) OR ("s69"."NU_SITUACAO_OCORRENCIA" = 19))))) AND (EXISTS (
                  SELECT 1
                  FROM "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s80"
                  INNER JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s81" ON "s80"."NU_CLSFO_OCRNA_EXTERNA" = "s81"."NU_CLSFO_OCRNA_EXTERNA"
                  INNER JOIN "SOU"."SOUTB055_CLSFO_UNDDE_RSPNL" "s82" ON "s81"."NU_CLSFO_OCRNA_EXTERNA" = "s82"."NU_CLSFO_OCRNA_EXTERNA"
                  INNER JOIN "SOU"."SOUTB141_EMPRESA_TERCEIRIZADA" "s83" ON "s82"."NU_EMPRESA_TERCEIRIZADA" = "s83"."NU_EMPRESA_TERCEIRIZADA"
                  WHERE (("s80"."NU_OCORRENCIA_EXTERNA" = "s67"."NU_OCORRENCIA_EXTERNA") AND ("s83"."CO_CNPJ_EMPRESA_TERCEIRIZADA" = :cnpjTerceirizada_0)))))
          ) "t3"
          WHERE "t3"."row" <= 1
      ) "t2" ON "t"."NU_OCORRENCIA_EXTERNA" = "t2"."NU_OCORRENCIA_EXTERNA"
      LEFT JOIN (
          SELECT "t5"."NU_SITUACAO_OCORRENCIA", "t5"."NO_SITUACAO_OCORRENCIA", "t5"."NU_TIPO_OCORRENCIA", "t5"."NU_OCORRENCIA_EXTERNA", "t5"."NU_SOLICITANTE", "t5"."NU_ORIGEM_OCORRENCIA", "t5"."NU_TIPO_OCORRENCIA0", "t5"."NU_NATUREZA_MANIFESTO", "t5"."NU_OCORRENCIA_EXTERNA0", "t5"."NU_CLSFO_OCRNA_EXTERNA", "t5"."NU_CLSFO_OCRNA_EXTERNA0", "t5"."NU_PRODUTO_MANIFESTO", "t5"."NU_PROBLEMA_MANIFESTO", "t5"."NU_SOLICITANTE0", "t5"."NU_DDD", "t5"."NU_TELEFONE", "t5"."NU_ENDERECO_SOLICITANTE", "t5"."NU_SOLICITANTE1", "t5"."DE_EMAIL", "t5"."NU_OCORRENCIA_EXTERNA1"
          FROM (
              SELECT "s86"."NU_SITUACAO_OCORRENCIA", "s86"."NO_SITUACAO_OCORRENCIA", "s86"."NU_TIPO_OCORRENCIA", "s84"."NU_OCORRENCIA_EXTERNA", "s85"."NU_SOLICITANTE", "s87"."NU_ORIGEM_OCORRENCIA", "s87"."NU_TIPO_OCORRENCIA" "NU_TIPO_OCORRENCIA0", "s88"."NU_NATUREZA_MANIFESTO", "s89"."NU_OCORRENCIA_EXTERNA" "NU_OCORRENCIA_EXTERNA0", "s89"."NU_CLSFO_OCRNA_EXTERNA", "s90"."NU_CLSFO_OCRNA_EXTERNA" "NU_CLSFO_OCRNA_EXTERNA0", "s91"."NU_PRODUTO_MANIFESTO", "s92"."NU_PROBLEMA_MANIFESTO", "s93"."NU_SOLICITANTE" "NU_SOLICITANTE0", "s93"."NU_DDD", "s93"."NU_TELEFONE", "s94"."NU_ENDERECO_SOLICITANTE", "s95"."NU_SOLICITANTE" "NU_SOLICITANTE1", "s95"."DE_EMAIL", "s96"."NU_OCORRENCIA_EXTERNA" "NU_OCORRENCIA_EXTERNA1", ROW_NUMBER() OVER(PARTITION BY "s84"."NU_OCORRENCIA_EXTERNA" ORDER BY "s84"."NU_OCORRENCIA_EXTERNA", "s85"."NU_SOLICITANTE", "s86"."NU_SITUACAO_OCORRENCIA", "s87"."NU_ORIGEM_OCORRENCIA", "s87"."NU_TIPO_OCORRENCIA", "s88"."NU_NATUREZA_MANIFESTO", "s89"."NU_OCORRENCIA_EXTERNA", "s89"."NU_CLSFO_OCRNA_EXTERNA", "s90"."NU_CLSFO_OCRNA_EXTERNA", "s91"."NU_PRODUTO_MANIFESTO", "s92"."NU_PROBLEMA_MANIFESTO", "s93"."NU_SOLICITANTE", "s93"."NU_DDD", "s93"."NU_TELEFONE", "s94"."NU_ENDERECO_SOLICITANTE", "s95"."NU_SOLICITANTE", "s95"."DE_EMAIL", "s96"."NU_OCORRENCIA_EXTERNA") "row"
              FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s84"
              LEFT JOIN "SOU"."SOUTB043_SOLICITANTE" "s85" ON "s84"."NU_SOLICITANTE_OCORRENCIA" = "s85"."NU_SOLICITANTE"
              INNER JOIN "SOU"."SOUTB035_SITUACAO_OCORRENCIA" "s86" ON "s84"."NU_SITUACAO_OCORRENCIA" = "s86"."NU_SITUACAO_OCORRENCIA"
              LEFT JOIN "SOU"."SOUTB002_ORIGEM_OCORRENCIA" "s87" ON (("s84"."NU_ORIGEM_OCORRENCIA" = "s87"."NU_ORIGEM_OCORRENCIA") AND ("s84"."NU_TIPO_OCORRENCIA" = "s87"."NU_TIPO_OCORRENCIA"))
              LEFT JOIN "SOU"."SOUTB003_NATUREZA_MANIFESTO" "s88" ON "s84"."NU_NATUREZA_MANIFESTO" = "s88"."NU_NATUREZA_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s89" ON "s84"."NU_OCORRENCIA_EXTERNA" = "s89"."NU_OCORRENCIA_EXTERNA"
              LEFT JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s90" ON "s89"."NU_CLSFO_OCRNA_EXTERNA" = "s90"."NU_CLSFO_OCRNA_EXTERNA"
              LEFT JOIN "SOU"."SOUTB050_PRODUTO_MANIFESTO" "s91" ON "s90"."NU_PRODUTO_MANIFESTO" = "s91"."NU_PRODUTO_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB051_PROBLEMA_MANIFESTO" "s92" ON "s90"."NU_PROBLEMA_MANIFESTO" = "s92"."NU_PROBLEMA_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB048_TELEFONE_SOLICITANTE" "s93" ON (("s85"."NU_SOLICITANTE" = "s93"."NU_SOLICITANTE") AND ('S' = "s93"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB044_ENDERECO_SOLICITANTE" "s94" ON (("s85"."NU_SOLICITANTE" = "s94"."NU_SOLICITANTE") AND ('S' = "s94"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB049_EMAIL_SOLICITANTE" "s95" ON (("s85"."NU_SOLICITANTE" = "s95"."NU_SOLICITANTE") AND ('S' = "s95"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB185_PROMESSA_RESPOSTA" "s96" ON "s84"."NU_OCORRENCIA_EXTERNA" = "s96"."NU_OCORRENCIA_EXTERNA"
              WHERE (((((("s84"."NU_TIPO_OCORRENCIA" = 3) AND ("s84"."IC_OCORRENCIA_EXTERNA_LIDA" = N'N'))) AND ((((("s86"."NU_SITUACAO_OCORRENCIA" = 14) OR ("s86"."NU_SITUACAO_OCORRENCIA" = 17))) OR ("s86"."NU_SITUACAO_OCORRENCIA" = 19))))) AND (EXISTS (
                  SELECT 1
                  FROM "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s97"
                  INNER JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s98" ON "s97"."NU_CLSFO_OCRNA_EXTERNA" = "s98"."NU_CLSFO_OCRNA_EXTERNA"
                  INNER JOIN "SOU"."SOUTB055_CLSFO_UNDDE_RSPNL" "s99" ON "s98"."NU_CLSFO_OCRNA_EXTERNA" = "s99"."NU_CLSFO_OCRNA_EXTERNA"
                  INNER JOIN "SOU"."SOUTB141_EMPRESA_TERCEIRIZADA" "s100" ON "s99"."NU_EMPRESA_TERCEIRIZADA" = "s100"."NU_EMPRESA_TERCEIRIZADA"
                  WHERE (("s97"."NU_OCORRENCIA_EXTERNA" = "s84"."NU_OCORRENCIA_EXTERNA") AND ("s100"."CO_CNPJ_EMPRESA_TERCEIRIZADA" = :cnpjTerceirizada_0)))))
          ) "t5"
          WHERE "t5"."row" <= 1
      ) "t4" ON "t"."NU_OCORRENCIA_EXTERNA" = "t4"."NU_OCORRENCIA_EXTERNA"
      LEFT JOIN (
          SELECT "t7"."NU_ORIGEM_OCORRENCIA", "t7"."NU_TIPO_OCORRENCIA", "t7"."CO_ORIGEM_OCORRENCIA", "t7"."DE_MASCARA_PROTOCOLO_EXTERNO", "t7"."IC_ATIVO", "t7"."IC_DIA_ABERTURA", "t7"."IC_DIA_REABERTURA", "t7"."IC_DIA_RESPOSTA_REABERTURA", "t7"."IC_PRAZO_REABERTURA", "t7"."IC_PRAZO_RESPOSTA", "t7"."IC_PRAZO_RESPOSTA_REABERTURA", "t7"."IC_PROTOCOLO_EXTERNO", "t7"."IC_REABERTURA", "t7"."NO_ORIGEM_OCORRENCIA", "t7"."PZ_REABERTURA", "t7"."PZ_RESPOSTA", "t7"."PZ_RESPOSTA_REABERTURA", "t7"."QT_REABERTURA", "t7"."NU_OCORRENCIA_EXTERNA", "t7"."NU_SOLICITANTE", "t7"."NU_SITUACAO_OCORRENCIA", "t7"."NU_NATUREZA_MANIFESTO", "t7"."NU_OCORRENCIA_EXTERNA0", "t7"."NU_CLSFO_OCRNA_EXTERNA", "t7"."NU_CLSFO_OCRNA_EXTERNA0", "t7"."NU_PRODUTO_MANIFESTO", "t7"."NU_PROBLEMA_MANIFESTO", "t7"."NU_SOLICITANTE0", "t7"."NU_DDD", "t7"."NU_TELEFONE", "t7"."NU_ENDERECO_SOLICITANTE", "t7"."NU_SOLICITANTE1", "t7"."DE_EMAIL", "t7"."NU_OCORRENCIA_EXTERNA1"
          FROM (
              SELECT "s104"."NU_ORIGEM_OCORRENCIA", "s104"."NU_TIPO_OCORRENCIA", "s104"."CO_ORIGEM_OCORRENCIA", "s104"."DE_MASCARA_PROTOCOLO_EXTERNO", "s104"."IC_ATIVO", "s104"."IC_DIA_ABERTURA", "s104"."IC_DIA_REABERTURA", "s104"."IC_DIA_RESPOSTA_REABERTURA", "s104"."IC_PRAZO_REABERTURA", "s104"."IC_PRAZO_RESPOSTA", "s104"."IC_PRAZO_RESPOSTA_REABERTURA", "s104"."IC_PROTOCOLO_EXTERNO", "s104"."IC_REABERTURA", "s104"."NO_ORIGEM_OCORRENCIA", "s104"."PZ_REABERTURA", "s104"."PZ_RESPOSTA", "s104"."PZ_RESPOSTA_REABERTURA", "s104"."QT_REABERTURA", "s101"."NU_OCORRENCIA_EXTERNA", "s102"."NU_SOLICITANTE", "s103"."NU_SITUACAO_OCORRENCIA", "s105"."NU_NATUREZA_MANIFESTO", "s106"."NU_OCORRENCIA_EXTERNA" "NU_OCORRENCIA_EXTERNA0", "s106"."NU_CLSFO_OCRNA_EXTERNA", "s107"."NU_CLSFO_OCRNA_EXTERNA" "NU_CLSFO_OCRNA_EXTERNA0", "s108"."NU_PRODUTO_MANIFESTO", "s109"."NU_PROBLEMA_MANIFESTO", "s110"."NU_SOLICITANTE" "NU_SOLICITANTE0", "s110"."NU_DDD", "s110"."NU_TELEFONE", "s111"."NU_ENDERECO_SOLICITANTE", "s112"."NU_SOLICITANTE" "NU_SOLICITANTE1", "s112"."DE_EMAIL", "s113"."NU_OCORRENCIA_EXTERNA" "NU_OCORRENCIA_EXTERNA1", ROW_NUMBER() OVER(PARTITION BY "s101"."NU_OCORRENCIA_EXTERNA" ORDER BY "s101"."NU_OCORRENCIA_EXTERNA", "s102"."NU_SOLICITANTE", "s103"."NU_SITUACAO_OCORRENCIA", "s104"."NU_ORIGEM_OCORRENCIA", "s104"."NU_TIPO_OCORRENCIA", "s105"."NU_NATUREZA_MANIFESTO", "s106"."NU_OCORRENCIA_EXTERNA", "s106"."NU_CLSFO_OCRNA_EXTERNA", "s107"."NU_CLSFO_OCRNA_EXTERNA", "s108"."NU_PRODUTO_MANIFESTO", "s109"."NU_PROBLEMA_MANIFESTO", "s110"."NU_SOLICITANTE", "s110"."NU_DDD", "s110"."NU_TELEFONE", "s111"."NU_ENDERECO_SOLICITANTE", "s112"."NU_SOLICITANTE", "s112"."DE_EMAIL", "s113"."NU_OCORRENCIA_EXTERNA") "row"
              FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s101"
              LEFT JOIN "SOU"."SOUTB043_SOLICITANTE" "s102" ON "s101"."NU_SOLICITANTE_OCORRENCIA" = "s102"."NU_SOLICITANTE"
              INNER JOIN "SOU"."SOUTB035_SITUACAO_OCORRENCIA" "s103" ON "s101"."NU_SITUACAO_OCORRENCIA" = "s103"."NU_SITUACAO_OCORRENCIA"
              LEFT JOIN "SOU"."SOUTB002_ORIGEM_OCORRENCIA" "s104" ON (("s101"."NU_ORIGEM_OCORRENCIA" = "s104"."NU_ORIGEM_OCORRENCIA") AND ("s101"."NU_TIPO_OCORRENCIA" = "s104"."NU_TIPO_OCORRENCIA"))
              LEFT JOIN "SOU"."SOUTB003_NATUREZA_MANIFESTO" "s105" ON "s101"."NU_NATUREZA_MANIFESTO" = "s105"."NU_NATUREZA_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s106" ON "s101"."NU_OCORRENCIA_EXTERNA" = "s106"."NU_OCORRENCIA_EXTERNA"
              LEFT JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s107" ON "s106"."NU_CLSFO_OCRNA_EXTERNA" = "s107"."NU_CLSFO_OCRNA_EXTERNA"
              LEFT JOIN "SOU"."SOUTB050_PRODUTO_MANIFESTO" "s108" ON "s107"."NU_PRODUTO_MANIFESTO" = "s108"."NU_PRODUTO_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB051_PROBLEMA_MANIFESTO" "s109" ON "s107"."NU_PROBLEMA_MANIFESTO" = "s109"."NU_PROBLEMA_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB048_TELEFONE_SOLICITANTE" "s110" ON (("s102"."NU_SOLICITANTE" = "s110"."NU_SOLICITANTE") AND ('S' = "s110"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB044_ENDERECO_SOLICITANTE" "s111" ON (("s102"."NU_SOLICITANTE" = "s111"."NU_SOLICITANTE") AND ('S' = "s111"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB049_EMAIL_SOLICITANTE" "s112" ON (("s102"."NU_SOLICITANTE" = "s112"."NU_SOLICITANTE") AND ('S' = "s112"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB185_PROMESSA_RESPOSTA" "s113" ON "s101"."NU_OCORRENCIA_EXTERNA" = "s113"."NU_OCORRENCIA_EXTERNA"
              WHERE (((((("s101"."NU_TIPO_OCORRENCIA" = 3) AND ("s101"."IC_OCORRENCIA_EXTERNA_LIDA" = N'N'))) AND ((((("s103"."NU_SITUACAO_OCORRENCIA" = 14) OR ("s103"."NU_SITUACAO_OCORRENCIA" = 17))) OR ("s103"."NU_SITUACAO_OCORRENCIA" = 19))))) AND (EXISTS (
                  SELECT 1
                  FROM "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s114"
                  INNER JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s115" ON "s114"."NU_CLSFO_OCRNA_EXTERNA" = "s115"."NU_CLSFO_OCRNA_EXTERNA"
                  INNER JOIN "SOU"."SOUTB055_CLSFO_UNDDE_RSPNL" "s116" ON "s115"."NU_CLSFO_OCRNA_EXTERNA" = "s116"."NU_CLSFO_OCRNA_EXTERNA"
                  INNER JOIN "SOU"."SOUTB141_EMPRESA_TERCEIRIZADA" "s117" ON "s116"."NU_EMPRESA_TERCEIRIZADA" = "s117"."NU_EMPRESA_TERCEIRIZADA"
                  WHERE (("s114"."NU_OCORRENCIA_EXTERNA" = "s101"."NU_OCORRENCIA_EXTERNA") AND ("s117"."CO_CNPJ_EMPRESA_TERCEIRIZADA" = :cnpjTerceirizada_0)))))
          ) "t7"
          WHERE "t7"."row" <= 1
      ) "t6" ON "t"."NU_OCORRENCIA_EXTERNA" = "t6"."NU_OCORRENCIA_EXTERNA"
      LEFT JOIN (
          SELECT "t9"."NU_NATUREZA_MANIFESTO", "t9"."CO_NATUREZA_MANIFESTO_OCRNA", "t9"."IC_ATIVO", "t9"."IC_CAMPO_SUGESTAO_ACATADA", "t9"."IC_HABILITA_MATRICULA", "t9"."IC_HABILITA_UNIDADE", "t9"."IC_PERMITE_ANONIMO", "t9"."IC_PERMITE_PRORROGACAO", "t9"."IC_REABERTURA", "t9"."NO_NATUREZA_MANIFESTO", "t9"."NU_TIPO_OCORRENCIA", "t9"."PZ_LIMITE_PRORROGACAO", "t9"."PZ_LIMITE_TRANSFERENCIA", "t9"."PZ_REABERTURA", "t9"."PZ_RESPOSTA", "t9"."PZ_RESPOSTA_REABERTURA", "t9"."QT_PRORROGACAO", "t9"."QT_REABERTURA", "t9"."NU_OCORRENCIA_EXTERNA", "t9"."NU_SOLICITANTE", "t9"."NU_SITUACAO_OCORRENCIA", "t9"."NU_ORIGEM_OCORRENCIA", "t9"."NU_TIPO_OCORRENCIA0", "t9"."NU_OCORRENCIA_EXTERNA0", "t9"."NU_CLSFO_OCRNA_EXTERNA", "t9"."NU_CLSFO_OCRNA_EXTERNA0", "t9"."NU_PRODUTO_MANIFESTO", "t9"."NU_PROBLEMA_MANIFESTO", "t9"."NU_SOLICITANTE0", "t9"."NU_DDD", "t9"."NU_TELEFONE", "t9"."NU_ENDERECO_SOLICITANTE", "t9"."NU_SOLICITANTE1", "t9"."DE_EMAIL", "t9"."NU_OCORRENCIA_EXTERNA1"
          FROM (
              SELECT "s122"."NU_NATUREZA_MANIFESTO", "s122"."CO_NATUREZA_MANIFESTO_OCRNA", "s122"."IC_ATIVO", "s122"."IC_CAMPO_SUGESTAO_ACATADA", "s122"."IC_HABILITA_MATRICULA", "s122"."IC_HABILITA_UNIDADE", "s122"."IC_PERMITE_ANONIMO", "s122"."IC_PERMITE_PRORROGACAO", "s122"."IC_REABERTURA", "s122"."NO_NATUREZA_MANIFESTO", "s122"."NU_TIPO_OCORRENCIA", "s122"."PZ_LIMITE_PRORROGACAO", "s122"."PZ_LIMITE_TRANSFERENCIA", "s122"."PZ_REABERTURA", "s122"."PZ_RESPOSTA", "s122"."PZ_RESPOSTA_REABERTURA", "s122"."QT_PRORROGACAO", "s122"."QT_REABERTURA", "s118"."NU_OCORRENCIA_EXTERNA", "s119"."NU_SOLICITANTE", "s120"."NU_SITUACAO_OCORRENCIA", "s121"."NU_ORIGEM_OCORRENCIA", "s121"."NU_TIPO_OCORRENCIA" "NU_TIPO_OCORRENCIA0", "s123"."NU_OCORRENCIA_EXTERNA" "NU_OCORRENCIA_EXTERNA0", "s123"."NU_CLSFO_OCRNA_EXTERNA", "s124"."NU_CLSFO_OCRNA_EXTERNA" "NU_CLSFO_OCRNA_EXTERNA0", "s125"."NU_PRODUTO_MANIFESTO", "s126"."NU_PROBLEMA_MANIFESTO", "s127"."NU_SOLICITANTE" "NU_SOLICITANTE0", "s127"."NU_DDD", "s127"."NU_TELEFONE", "s128"."NU_ENDERECO_SOLICITANTE", "s129"."NU_SOLICITANTE" "NU_SOLICITANTE1", "s129"."DE_EMAIL", "s130"."NU_OCORRENCIA_EXTERNA" "NU_OCORRENCIA_EXTERNA1", ROW_NUMBER() OVER(PARTITION BY "s118"."NU_OCORRENCIA_EXTERNA" ORDER BY "s118"."NU_OCORRENCIA_EXTERNA", "s119"."NU_SOLICITANTE", "s120"."NU_SITUACAO_OCORRENCIA", "s121"."NU_ORIGEM_OCORRENCIA", "s121"."NU_TIPO_OCORRENCIA", "s122"."NU_NATUREZA_MANIFESTO", "s123"."NU_OCORRENCIA_EXTERNA", "s123"."NU_CLSFO_OCRNA_EXTERNA", "s124"."NU_CLSFO_OCRNA_EXTERNA", "s125"."NU_PRODUTO_MANIFESTO", "s126"."NU_PROBLEMA_MANIFESTO", "s127"."NU_SOLICITANTE", "s127"."NU_DDD", "s127"."NU_TELEFONE", "s128"."NU_ENDERECO_SOLICITANTE", "s129"."NU_SOLICITANTE", "s129"."DE_EMAIL", "s130"."NU_OCORRENCIA_EXTERNA") "row"
              FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s118"
              LEFT JOIN "SOU"."SOUTB043_SOLICITANTE" "s119" ON "s118"."NU_SOLICITANTE_OCORRENCIA" = "s119"."NU_SOLICITANTE"
              INNER JOIN "SOU"."SOUTB035_SITUACAO_OCORRENCIA" "s120" ON "s118"."NU_SITUACAO_OCORRENCIA" = "s120"."NU_SITUACAO_OCORRENCIA"
              LEFT JOIN "SOU"."SOUTB002_ORIGEM_OCORRENCIA" "s121" ON (("s118"."NU_ORIGEM_OCORRENCIA" = "s121"."NU_ORIGEM_OCORRENCIA") AND ("s118"."NU_TIPO_OCORRENCIA" = "s121"."NU_TIPO_OCORRENCIA"))
              LEFT JOIN "SOU"."SOUTB003_NATUREZA_MANIFESTO" "s122" ON "s118"."NU_NATUREZA_MANIFESTO" = "s122"."NU_NATUREZA_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s123" ON "s118"."NU_OCORRENCIA_EXTERNA" = "s123"."NU_OCORRENCIA_EXTERNA"
              LEFT JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s124" ON "s123"."NU_CLSFO_OCRNA_EXTERNA" = "s124"."NU_CLSFO_OCRNA_EXTERNA"
              LEFT JOIN "SOU"."SOUTB050_PRODUTO_MANIFESTO" "s125" ON "s124"."NU_PRODUTO_MANIFESTO" = "s125"."NU_PRODUTO_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB051_PROBLEMA_MANIFESTO" "s126" ON "s124"."NU_PROBLEMA_MANIFESTO" = "s126"."NU_PROBLEMA_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB048_TELEFONE_SOLICITANTE" "s127" ON (("s119"."NU_SOLICITANTE" = "s127"."NU_SOLICITANTE") AND ('S' = "s127"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB044_ENDERECO_SOLICITANTE" "s128" ON (("s119"."NU_SOLICITANTE" = "s128"."NU_SOLICITANTE") AND ('S' = "s128"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB049_EMAIL_SOLICITANTE" "s129" ON (("s119"."NU_SOLICITANTE" = "s129"."NU_SOLICITANTE") AND ('S' = "s129"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB185_PROMESSA_RESPOSTA" "s130" ON "s118"."NU_OCORRENCIA_EXTERNA" = "s130"."NU_OCORRENCIA_EXTERNA"
              WHERE (((((("s118"."NU_TIPO_OCORRENCIA" = 3) AND ("s118"."IC_OCORRENCIA_EXTERNA_LIDA" = N'N'))) AND ((((("s120"."NU_SITUACAO_OCORRENCIA" = 14) OR ("s120"."NU_SITUACAO_OCORRENCIA" = 17))) OR ("s120"."NU_SITUACAO_OCORRENCIA" = 19))))) AND (EXISTS (
                  SELECT 1
                  FROM "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s131"
                  INNER JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s132" ON "s131"."NU_CLSFO_OCRNA_EXTERNA" = "s132"."NU_CLSFO_OCRNA_EXTERNA"
                  INNER JOIN "SOU"."SOUTB055_CLSFO_UNDDE_RSPNL" "s133" ON "s132"."NU_CLSFO_OCRNA_EXTERNA" = "s133"."NU_CLSFO_OCRNA_EXTERNA"
                  INNER JOIN "SOU"."SOUTB141_EMPRESA_TERCEIRIZADA" "s134" ON "s133"."NU_EMPRESA_TERCEIRIZADA" = "s134"."NU_EMPRESA_TERCEIRIZADA"
                  WHERE (("s131"."NU_OCORRENCIA_EXTERNA" = "s118"."NU_OCORRENCIA_EXTERNA") AND ("s134"."CO_CNPJ_EMPRESA_TERCEIRIZADA" = :cnpjTerceirizada_0)))))
          ) "t9"
          WHERE "t9"."row" <= 1
      ) "t8" ON "t"."NU_OCORRENCIA_EXTERNA" = "t8"."NU_OCORRENCIA_EXTERNA"
      LEFT JOIN (
          SELECT "t11"."NU_SOLICITANTE", "t11"."NU_DDD", "t11"."NU_TELEFONE", "t11"."DH_INCLUSAO_TELEFONE", "t11"."IC_FONTE_TELEFONE", "t11"."IC_PADRAO", "t11"."IC_TIPO_TELEFONE", "t11"."NU_OCORRENCIA_EXTERNA", "t11"."NU_SOLICITANTE0", "t11"."NU_SITUACAO_OCORRENCIA", "t11"."NU_ORIGEM_OCORRENCIA", "t11"."NU_TIPO_OCORRENCIA", "t11"."NU_NATUREZA_MANIFESTO", "t11"."NU_OCORRENCIA_EXTERNA0", "t11"."NU_CLSFO_OCRNA_EXTERNA", "t11"."NU_CLSFO_OCRNA_EXTERNA0", "t11"."NU_PRODUTO_MANIFESTO", "t11"."NU_PROBLEMA_MANIFESTO", "t11"."NU_ENDERECO_SOLICITANTE", "t11"."NU_SOLICITANTE1", "t11"."DE_EMAIL", "t11"."NU_OCORRENCIA_EXTERNA1"
          FROM (
              SELECT "s144"."NU_SOLICITANTE", "s144"."NU_DDD", "s144"."NU_TELEFONE", "s144"."DH_INCLUSAO_TELEFONE", "s144"."IC_FONTE_TELEFONE", "s144"."IC_PADRAO", "s144"."IC_TIPO_TELEFONE", "s135"."NU_OCORRENCIA_EXTERNA", "s136"."NU_SOLICITANTE" "NU_SOLICITANTE0", "s137"."NU_SITUACAO_OCORRENCIA", "s138"."NU_ORIGEM_OCORRENCIA", "s138"."NU_TIPO_OCORRENCIA", "s139"."NU_NATUREZA_MANIFESTO", "s140"."NU_OCORRENCIA_EXTERNA" "NU_OCORRENCIA_EXTERNA0", "s140"."NU_CLSFO_OCRNA_EXTERNA", "s141"."NU_CLSFO_OCRNA_EXTERNA" "NU_CLSFO_OCRNA_EXTERNA0", "s142"."NU_PRODUTO_MANIFESTO", "s143"."NU_PROBLEMA_MANIFESTO", "s145"."NU_ENDERECO_SOLICITANTE", "s146"."NU_SOLICITANTE" "NU_SOLICITANTE1", "s146"."DE_EMAIL", "s147"."NU_OCORRENCIA_EXTERNA" "NU_OCORRENCIA_EXTERNA1", ROW_NUMBER() OVER(PARTITION BY "s135"."NU_OCORRENCIA_EXTERNA" ORDER BY "s135"."NU_OCORRENCIA_EXTERNA", "s136"."NU_SOLICITANTE", "s137"."NU_SITUACAO_OCORRENCIA", "s138"."NU_ORIGEM_OCORRENCIA", "s138"."NU_TIPO_OCORRENCIA", "s139"."NU_NATUREZA_MANIFESTO", "s140"."NU_OCORRENCIA_EXTERNA", "s140"."NU_CLSFO_OCRNA_EXTERNA", "s141"."NU_CLSFO_OCRNA_EXTERNA", "s142"."NU_PRODUTO_MANIFESTO", "s143"."NU_PROBLEMA_MANIFESTO", "s144"."NU_SOLICITANTE", "s144"."NU_DDD", "s144"."NU_TELEFONE", "s145"."NU_ENDERECO_SOLICITANTE", "s146"."NU_SOLICITANTE", "s146"."DE_EMAIL", "s147"."NU_OCORRENCIA_EXTERNA") "row"
              FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s135"
              LEFT JOIN "SOU"."SOUTB043_SOLICITANTE" "s136" ON "s135"."NU_SOLICITANTE_OCORRENCIA" = "s136"."NU_SOLICITANTE"
              INNER JOIN "SOU"."SOUTB035_SITUACAO_OCORRENCIA" "s137" ON "s135"."NU_SITUACAO_OCORRENCIA" = "s137"."NU_SITUACAO_OCORRENCIA"
              LEFT JOIN "SOU"."SOUTB002_ORIGEM_OCORRENCIA" "s138" ON (("s135"."NU_ORIGEM_OCORRENCIA" = "s138"."NU_ORIGEM_OCORRENCIA") AND ("s135"."NU_TIPO_OCORRENCIA" = "s138"."NU_TIPO_OCORRENCIA"))
              LEFT JOIN "SOU"."SOUTB003_NATUREZA_MANIFESTO" "s139" ON "s135"."NU_NATUREZA_MANIFESTO" = "s139"."NU_NATUREZA_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s140" ON "s135"."NU_OCORRENCIA_EXTERNA" = "s140"."NU_OCORRENCIA_EXTERNA"
              LEFT JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s141" ON "s140"."NU_CLSFO_OCRNA_EXTERNA" = "s141"."NU_CLSFO_OCRNA_EXTERNA"
              LEFT JOIN "SOU"."SOUTB050_PRODUTO_MANIFESTO" "s142" ON "s141"."NU_PRODUTO_MANIFESTO" = "s142"."NU_PRODUTO_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB051_PROBLEMA_MANIFESTO" "s143" ON "s141"."NU_PROBLEMA_MANIFESTO" = "s143"."NU_PROBLEMA_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB048_TELEFONE_SOLICITANTE" "s144" ON (("s136"."NU_SOLICITANTE" = "s144"."NU_SOLICITANTE") AND ('S' = "s144"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB044_ENDERECO_SOLICITANTE" "s145" ON (("s136"."NU_SOLICITANTE" = "s145"."NU_SOLICITANTE") AND ('S' = "s145"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB049_EMAIL_SOLICITANTE" "s146" ON (("s136"."NU_SOLICITANTE" = "s146"."NU_SOLICITANTE") AND ('S' = "s146"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB185_PROMESSA_RESPOSTA" "s147" ON "s135"."NU_OCORRENCIA_EXTERNA" = "s147"."NU_OCORRENCIA_EXTERNA"
              WHERE (((((("s135"."NU_TIPO_OCORRENCIA" = 3) AND ("s135"."IC_OCORRENCIA_EXTERNA_LIDA" = N'N'))) AND ((((("s137"."NU_SITUACAO_OCORRENCIA" = 14) OR ("s137"."NU_SITUACAO_OCORRENCIA" = 17))) OR ("s137"."NU_SITUACAO_OCORRENCIA" = 19))))) AND (EXISTS (
                  SELECT 1
                  FROM "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s148"
                  INNER JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s149" ON "s148"."NU_CLSFO_OCRNA_EXTERNA" = "s149"."NU_CLSFO_OCRNA_EXTERNA"
                  INNER JOIN "SOU"."SOUTB055_CLSFO_UNDDE_RSPNL" "s150" ON "s149"."NU_CLSFO_OCRNA_EXTERNA" = "s150"."NU_CLSFO_OCRNA_EXTERNA"
                  INNER JOIN "SOU"."SOUTB141_EMPRESA_TERCEIRIZADA" "s151" ON "s150"."NU_EMPRESA_TERCEIRIZADA" = "s151"."NU_EMPRESA_TERCEIRIZADA"
                  WHERE (("s148"."NU_OCORRENCIA_EXTERNA" = "s135"."NU_OCORRENCIA_EXTERNA") AND ("s151"."CO_CNPJ_EMPRESA_TERCEIRIZADA" = :cnpjTerceirizada_0)))))
          ) "t11"
          WHERE "t11"."row" <= 1
      ) "t10" ON "t"."NU_OCORRENCIA_EXTERNA" = "t10"."NU_OCORRENCIA_EXTERNA"
      LEFT JOIN (
          SELECT "t13"."NU_ENDERECO_SOLICITANTE", "t13"."CO_ENDERECO_SOLICITANTE", "t13"."DE_COMPLEMENTO", "t13"."DH_INCLUSAO_ENDERECO", "t13"."IC_FONTE_ENDERECO", "t13"."IC_PADRAO", "t13"."NU_BAIRRO", "t13"."NU_CEP", "t13"."NU_LOCALIDADE", "t13"."NU_LOGRADOURO", "t13"."NU_SOLICITANTE", "t13"."SG_UF", "t13"."NU_OCORRENCIA_EXTERNA", "t13"."NU_SOLICITANTE0", "t13"."NU_SITUACAO_OCORRENCIA", "t13"."NU_ORIGEM_OCORRENCIA", "t13"."NU_TIPO_OCORRENCIA", "t13"."NU_NATUREZA_MANIFESTO", "t13"."NU_OCORRENCIA_EXTERNA0", "t13"."NU_CLSFO_OCRNA_EXTERNA", "t13"."NU_CLSFO_OCRNA_EXTERNA0", "t13"."NU_PRODUTO_MANIFESTO", "t13"."NU_PROBLEMA_MANIFESTO", "t13"."NU_SOLICITANTE1", "t13"."NU_DDD", "t13"."NU_TELEFONE", "t13"."NU_SOLICITANTE2", "t13"."DE_EMAIL", "t13"."NU_OCORRENCIA_EXTERNA1"
          FROM (
              SELECT "s162"."NU_ENDERECO_SOLICITANTE", "s162"."CO_ENDERECO_SOLICITANTE", "s162"."DE_COMPLEMENTO", "s162"."DH_INCLUSAO_ENDERECO", "s162"."IC_FONTE_ENDERECO", "s162"."IC_PADRAO", "s162"."NU_BAIRRO", "s162"."NU_CEP", "s162"."NU_LOCALIDADE", "s162"."NU_LOGRADOURO", "s162"."NU_SOLICITANTE", "s162"."SG_UF", "s152"."NU_OCORRENCIA_EXTERNA", "s153"."NU_SOLICITANTE" "NU_SOLICITANTE0", "s154"."NU_SITUACAO_OCORRENCIA", "s155"."NU_ORIGEM_OCORRENCIA", "s155"."NU_TIPO_OCORRENCIA", "s156"."NU_NATUREZA_MANIFESTO", "s157"."NU_OCORRENCIA_EXTERNA" "NU_OCORRENCIA_EXTERNA0", "s157"."NU_CLSFO_OCRNA_EXTERNA", "s158"."NU_CLSFO_OCRNA_EXTERNA" "NU_CLSFO_OCRNA_EXTERNA0", "s159"."NU_PRODUTO_MANIFESTO", "s160"."NU_PROBLEMA_MANIFESTO", "s161"."NU_SOLICITANTE" "NU_SOLICITANTE1", "s161"."NU_DDD", "s161"."NU_TELEFONE", "s163"."NU_SOLICITANTE" "NU_SOLICITANTE2", "s163"."DE_EMAIL", "s164"."NU_OCORRENCIA_EXTERNA" "NU_OCORRENCIA_EXTERNA1", ROW_NUMBER() OVER(PARTITION BY "s152"."NU_OCORRENCIA_EXTERNA" ORDER BY "s152"."NU_OCORRENCIA_EXTERNA", "s153"."NU_SOLICITANTE", "s154"."NU_SITUACAO_OCORRENCIA", "s155"."NU_ORIGEM_OCORRENCIA", "s155"."NU_TIPO_OCORRENCIA", "s156"."NU_NATUREZA_MANIFESTO", "s157"."NU_OCORRENCIA_EXTERNA", "s157"."NU_CLSFO_OCRNA_EXTERNA", "s158"."NU_CLSFO_OCRNA_EXTERNA", "s159"."NU_PRODUTO_MANIFESTO", "s160"."NU_PROBLEMA_MANIFESTO", "s161"."NU_SOLICITANTE", "s161"."NU_DDD", "s161"."NU_TELEFONE", "s162"."NU_ENDERECO_SOLICITANTE", "s163"."NU_SOLICITANTE", "s163"."DE_EMAIL", "s164"."NU_OCORRENCIA_EXTERNA") "row"
              FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s152"
              LEFT JOIN "SOU"."SOUTB043_SOLICITANTE" "s153" ON "s152"."NU_SOLICITANTE_OCORRENCIA" = "s153"."NU_SOLICITANTE"
              INNER JOIN "SOU"."SOUTB035_SITUACAO_OCORRENCIA" "s154" ON "s152"."NU_SITUACAO_OCORRENCIA" = "s154"."NU_SITUACAO_OCORRENCIA"
              LEFT JOIN "SOU"."SOUTB002_ORIGEM_OCORRENCIA" "s155" ON (("s152"."NU_ORIGEM_OCORRENCIA" = "s155"."NU_ORIGEM_OCORRENCIA") AND ("s152"."NU_TIPO_OCORRENCIA" = "s155"."NU_TIPO_OCORRENCIA"))
              LEFT JOIN "SOU"."SOUTB003_NATUREZA_MANIFESTO" "s156" ON "s152"."NU_NATUREZA_MANIFESTO" = "s156"."NU_NATUREZA_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s157" ON "s152"."NU_OCORRENCIA_EXTERNA" = "s157"."NU_OCORRENCIA_EXTERNA"
              LEFT JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s158" ON "s157"."NU_CLSFO_OCRNA_EXTERNA" = "s158"."NU_CLSFO_OCRNA_EXTERNA"
              LEFT JOIN "SOU"."SOUTB050_PRODUTO_MANIFESTO" "s159" ON "s158"."NU_PRODUTO_MANIFESTO" = "s159"."NU_PRODUTO_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB051_PROBLEMA_MANIFESTO" "s160" ON "s158"."NU_PROBLEMA_MANIFESTO" = "s160"."NU_PROBLEMA_MANIFESTO"
              LEFT JOIN "SOU"."SOUTB048_TELEFONE_SOLICITANTE" "s161" ON (("s153"."NU_SOLICITANTE" = "s161"."NU_SOLICITANTE") AND ('S' = "s161"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB044_ENDERECO_SOLICITANTE" "s162" ON (("s153"."NU_SOLICITANTE" = "s162"."NU_SOLICITANTE") AND ('S' = "s162"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB049_EMAIL_SOLICITANTE" "s163" ON (("s153"."NU_SOLICITANTE" = "s163"."NU_SOLICITANTE") AND ('S' = "s163"."IC_PADRAO"))
              LEFT JOIN "SOU"."SOUTB185_PROMESSA_RESPOSTA" "s164" ON "s152"."NU_OCORRENCIA_EXTERNA" = "s164"."NU_OCORRENCIA_EXTERNA"
              WHERE (((((("s152"."NU_TIPO_OCORRENCIA" = 3) AND ("s152"."IC_OCORRENCIA_EXTERNA_LIDA" = N'N'))) AND ((((("s154"."NU_SITUACAO_OCORRENCIA" = 14) OR ("s154"."NU_SITUACAO_OCORRENCIA" = 17))) OR ("s154"."NU_SITUACAO_OCORRENCIA" = 19))))) AND (EXISTS (
                  SELECT 1
                  FROM "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s165"
                  INNER JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s166" ON "s165"."NU_CLSFO_OCRNA_EXTERNA" = "s166"."NU_CLSFO_OCRNA_EXTERNA"
                  INNER JOIN "SOU"."SOUTB055_CLSFO_UNDDE_RSPNL" "s167" ON "s166"."NU_CLSFO_OCRNA_EXTERNA" = "s167"."NU_CLSFO_OCRNA_EXTERNA"
                  INNER JOIN "SOU"."SOUTB141_EMPRESA_TERCEIRIZADA" "s168" ON "s167"."NU_EMPRESA_TERCEIRIZADA" = "s168"."NU_EMPRESA_TERCEIRIZADA"
                  WHERE (("s165"."NU_OCORRENCIA_EXTERNA" = "s152"."NU_OCORRENCIA_EXTERNA") AND ("s168"."CO_CNPJ_EMPRESA_TERCEIRIZADA" = :cnpjTerceirizada_0)))))
          ) "t13"
          WHERE "t13"."row" <= 1
      ) "t12" ON "t"."NU_OCORRENCIA_EXTERNA" = "t12"."NU_OCORRENCIA_EXTERNA"
      OUTER APPLY (
          SELECT DISTINCT "s180"."DE_EMAIL"
          FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s169"
          LEFT JOIN "SOU"."SOUTB043_SOLICITANTE" "s170" ON "s169"."NU_SOLICITANTE_OCORRENCIA" = "s170"."NU_SOLICITANTE"
          INNER JOIN "SOU"."SOUTB035_SITUACAO_OCORRENCIA" "s171" ON "s169"."NU_SITUACAO_OCORRENCIA" = "s171"."NU_SITUACAO_OCORRENCIA"
          LEFT JOIN "SOU"."SOUTB002_ORIGEM_OCORRENCIA" "s172" ON (("s169"."NU_ORIGEM_OCORRENCIA" = "s172"."NU_ORIGEM_OCORRENCIA") AND ("s169"."NU_TIPO_OCORRENCIA" = "s172"."NU_TIPO_OCORRENCIA"))
          LEFT JOIN "SOU"."SOUTB003_NATUREZA_MANIFESTO" "s173" ON "s169"."NU_NATUREZA_MANIFESTO" = "s173"."NU_NATUREZA_MANIFESTO"
          LEFT JOIN "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s174" ON "s169"."NU_OCORRENCIA_EXTERNA" = "s174"."NU_OCORRENCIA_EXTERNA"
          LEFT JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s175" ON "s174"."NU_CLSFO_OCRNA_EXTERNA" = "s175"."NU_CLSFO_OCRNA_EXTERNA"
          LEFT JOIN "SOU"."SOUTB050_PRODUTO_MANIFESTO" "s176" ON "s175"."NU_PRODUTO_MANIFESTO" = "s176"."NU_PRODUTO_MANIFESTO"
          LEFT JOIN "SOU"."SOUTB051_PROBLEMA_MANIFESTO" "s177" ON "s175"."NU_PROBLEMA_MANIFESTO" = "s177"."NU_PROBLEMA_MANIFESTO"
          LEFT JOIN "SOU"."SOUTB048_TELEFONE_SOLICITANTE" "s178" ON (("s170"."NU_SOLICITANTE" = "s178"."NU_SOLICITANTE") AND ('S' = "s178"."IC_PADRAO"))
          LEFT JOIN "SOU"."SOUTB044_ENDERECO_SOLICITANTE" "s179" ON (("s170"."NU_SOLICITANTE" = "s179"."NU_SOLICITANTE") AND ('S' = "s179"."IC_PADRAO"))
          LEFT JOIN "SOU"."SOUTB049_EMAIL_SOLICITANTE" "s180" ON (("s170"."NU_SOLICITANTE" = "s180"."NU_SOLICITANTE") AND ('S' = "s180"."IC_PADRAO"))
          LEFT JOIN "SOU"."SOUTB185_PROMESSA_RESPOSTA" "s181" ON "s169"."NU_OCORRENCIA_EXTERNA" = "s181"."NU_OCORRENCIA_EXTERNA"
          WHERE (((((((((("s169"."NU_TIPO_OCORRENCIA" = 3) AND ("s169"."IC_OCORRENCIA_EXTERNA_LIDA" = N'N'))) AND ((((("s171"."NU_SITUACAO_OCORRENCIA" = 14) OR ("s171"."NU_SITUACAO_OCORRENCIA" = 17))) OR ("s171"."NU_SITUACAO_OCORRENCIA" = 19))))) AND (EXISTS (
              SELECT 1
              FROM "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s182"
              INNER JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s183" ON "s182"."NU_CLSFO_OCRNA_EXTERNA" = "s183"."NU_CLSFO_OCRNA_EXTERNA"
              INNER JOIN "SOU"."SOUTB055_CLSFO_UNDDE_RSPNL" "s184" ON "s183"."NU_CLSFO_OCRNA_EXTERNA" = "s184"."NU_CLSFO_OCRNA_EXTERNA"
              INNER JOIN "SOU"."SOUTB141_EMPRESA_TERCEIRIZADA" "s185" ON "s184"."NU_EMPRESA_TERCEIRIZADA" = "s185"."NU_EMPRESA_TERCEIRIZADA"
              WHERE (("s182"."NU_OCORRENCIA_EXTERNA" = "s169"."NU_OCORRENCIA_EXTERNA") AND ("s185"."CO_CNPJ_EMPRESA_TERCEIRIZADA" = :cnpjTerceirizada_0)))))) AND ("t"."NU_OCORRENCIA_EXTERNA" = "s169"."NU_OCORRENCIA_EXTERNA"))) AND ("s180"."NU_SOLICITANTE" IS NOT NULL AND "s180"."DE_EMAIL" IS NOT NULL))
      ) "t14"
      OUTER APPLY (
          SELECT DISTINCT "s193"."NO_PRODUTO_MANIFESTO"
          FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s186"
          LEFT JOIN "SOU"."SOUTB043_SOLICITANTE" "s187" ON "s186"."NU_SOLICITANTE_OCORRENCIA" = "s187"."NU_SOLICITANTE"
          INNER JOIN "SOU"."SOUTB035_SITUACAO_OCORRENCIA" "s188" ON "s186"."NU_SITUACAO_OCORRENCIA" = "s188"."NU_SITUACAO_OCORRENCIA"
          LEFT JOIN "SOU"."SOUTB002_ORIGEM_OCORRENCIA" "s189" ON (("s186"."NU_ORIGEM_OCORRENCIA" = "s189"."NU_ORIGEM_OCORRENCIA") AND ("s186"."NU_TIPO_OCORRENCIA" = "s189"."NU_TIPO_OCORRENCIA"))
          LEFT JOIN "SOU"."SOUTB003_NATUREZA_MANIFESTO" "s190" ON "s186"."NU_NATUREZA_MANIFESTO" = "s190"."NU_NATUREZA_MANIFESTO"
          LEFT JOIN "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s191" ON "s186"."NU_OCORRENCIA_EXTERNA" = "s191"."NU_OCORRENCIA_EXTERNA"
          LEFT JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s192" ON "s191"."NU_CLSFO_OCRNA_EXTERNA" = "s192"."NU_CLSFO_OCRNA_EXTERNA"
          LEFT JOIN "SOU"."SOUTB050_PRODUTO_MANIFESTO" "s193" ON "s192"."NU_PRODUTO_MANIFESTO" = "s193"."NU_PRODUTO_MANIFESTO"
          LEFT JOIN "SOU"."SOUTB051_PROBLEMA_MANIFESTO" "s194" ON "s192"."NU_PROBLEMA_MANIFESTO" = "s194"."NU_PROBLEMA_MANIFESTO"
          LEFT JOIN "SOU"."SOUTB048_TELEFONE_SOLICITANTE" "s195" ON (("s187"."NU_SOLICITANTE" = "s195"."NU_SOLICITANTE") AND ('S' = "s195"."IC_PADRAO"))
          LEFT JOIN "SOU"."SOUTB044_ENDERECO_SOLICITANTE" "s196" ON (("s187"."NU_SOLICITANTE" = "s196"."NU_SOLICITANTE") AND ('S' = "s196"."IC_PADRAO"))
          LEFT JOIN "SOU"."SOUTB049_EMAIL_SOLICITANTE" "s197" ON (("s187"."NU_SOLICITANTE" = "s197"."NU_SOLICITANTE") AND ('S' = "s197"."IC_PADRAO"))
          LEFT JOIN "SOU"."SOUTB185_PROMESSA_RESPOSTA" "s198" ON "s186"."NU_OCORRENCIA_EXTERNA" = "s198"."NU_OCORRENCIA_EXTERNA"
          WHERE (((((((((("s186"."NU_TIPO_OCORRENCIA" = 3) AND ("s186"."IC_OCORRENCIA_EXTERNA_LIDA" = N'N'))) AND ((((("s188"."NU_SITUACAO_OCORRENCIA" = 14) OR ("s188"."NU_SITUACAO_OCORRENCIA" = 17))) OR ("s188"."NU_SITUACAO_OCORRENCIA" = 19))))) AND (EXISTS (
              SELECT 1
              FROM "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s199"
              INNER JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s200" ON "s199"."NU_CLSFO_OCRNA_EXTERNA" = "s200"."NU_CLSFO_OCRNA_EXTERNA"
              INNER JOIN "SOU"."SOUTB055_CLSFO_UNDDE_RSPNL" "s201" ON "s200"."NU_CLSFO_OCRNA_EXTERNA" = "s201"."NU_CLSFO_OCRNA_EXTERNA"
              INNER JOIN "SOU"."SOUTB141_EMPRESA_TERCEIRIZADA" "s202" ON "s201"."NU_EMPRESA_TERCEIRIZADA" = "s202"."NU_EMPRESA_TERCEIRIZADA"
              WHERE (("s199"."NU_OCORRENCIA_EXTERNA" = "s186"."NU_OCORRENCIA_EXTERNA") AND ("s202"."CO_CNPJ_EMPRESA_TERCEIRIZADA" = :cnpjTerceirizada_0)))))) AND ("t"."NU_OCORRENCIA_EXTERNA" = "s186"."NU_OCORRENCIA_EXTERNA"))) AND ("s193"."NU_PRODUTO_MANIFESTO" IS NOT NULL))
      ) "t15"
      OUTER APPLY (
          SELECT DISTINCT "s211"."NO_PROBLEMA_MANIFESTO"
          FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s203"
          LEFT JOIN "SOU"."SOUTB043_SOLICITANTE" "s204" ON "s203"."NU_SOLICITANTE_OCORRENCIA" = "s204"."NU_SOLICITANTE"
          INNER JOIN "SOU"."SOUTB035_SITUACAO_OCORRENCIA" "s205" ON "s203"."NU_SITUACAO_OCORRENCIA" = "s205"."NU_SITUACAO_OCORRENCIA"
          LEFT JOIN "SOU"."SOUTB002_ORIGEM_OCORRENCIA" "s206" ON (("s203"."NU_ORIGEM_OCORRENCIA" = "s206"."NU_ORIGEM_OCORRENCIA") AND ("s203"."NU_TIPO_OCORRENCIA" = "s206"."NU_TIPO_OCORRENCIA"))
          LEFT JOIN "SOU"."SOUTB003_NATUREZA_MANIFESTO" "s207" ON "s203"."NU_NATUREZA_MANIFESTO" = "s207"."NU_NATUREZA_MANIFESTO"
          LEFT JOIN "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s208" ON "s203"."NU_OCORRENCIA_EXTERNA" = "s208"."NU_OCORRENCIA_EXTERNA"
          LEFT JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s209" ON "s208"."NU_CLSFO_OCRNA_EXTERNA" = "s209"."NU_CLSFO_OCRNA_EXTERNA"
          LEFT JOIN "SOU"."SOUTB050_PRODUTO_MANIFESTO" "s210" ON "s209"."NU_PRODUTO_MANIFESTO" = "s210"."NU_PRODUTO_MANIFESTO"
          LEFT JOIN "SOU"."SOUTB051_PROBLEMA_MANIFESTO" "s211" ON "s209"."NU_PROBLEMA_MANIFESTO" = "s211"."NU_PROBLEMA_MANIFESTO"
          LEFT JOIN "SOU"."SOUTB048_TELEFONE_SOLICITANTE" "s212" ON (("s204"."NU_SOLICITANTE" = "s212"."NU_SOLICITANTE") AND ('S' = "s212"."IC_PADRAO"))
          LEFT JOIN "SOU"."SOUTB044_ENDERECO_SOLICITANTE" "s213" ON (("s204"."NU_SOLICITANTE" = "s213"."NU_SOLICITANTE") AND ('S' = "s213"."IC_PADRAO"))
          LEFT JOIN "SOU"."SOUTB049_EMAIL_SOLICITANTE" "s214" ON (("s204"."NU_SOLICITANTE" = "s214"."NU_SOLICITANTE") AND ('S' = "s214"."IC_PADRAO"))
          LEFT JOIN "SOU"."SOUTB185_PROMESSA_RESPOSTA" "s215" ON "s203"."NU_OCORRENCIA_EXTERNA" = "s215"."NU_OCORRENCIA_EXTERNA"
          WHERE (((((((((("s203"."NU_TIPO_OCORRENCIA" = 3) AND ("s203"."IC_OCORRENCIA_EXTERNA_LIDA" = N'N'))) AND ((((("s205"."NU_SITUACAO_OCORRENCIA" = 14) OR ("s205"."NU_SITUACAO_OCORRENCIA" = 17))) OR ("s205"."NU_SITUACAO_OCORRENCIA" = 19))))) AND (EXISTS (
              SELECT 1
              FROM "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s216"
              INNER JOIN "SOU"."SOUTB053_CLSFO_OCRNA_EXTERNA" "s217" ON "s216"."NU_CLSFO_OCRNA_EXTERNA" = "s217"."NU_CLSFO_OCRNA_EXTERNA"
              INNER JOIN "SOU"."SOUTB055_CLSFO_UNDDE_RSPNL" "s218" ON "s217"."NU_CLSFO_OCRNA_EXTERNA" = "s218"."NU_CLSFO_OCRNA_EXTERNA"
              INNER JOIN "SOU"."SOUTB141_EMPRESA_TERCEIRIZADA" "s219" ON "s218"."NU_EMPRESA_TERCEIRIZADA" = "s219"."NU_EMPRESA_TERCEIRIZADA"
              WHERE (("s216"."NU_OCORRENCIA_EXTERNA" = "s203"."NU_OCORRENCIA_EXTERNA") AND ("s219"."CO_CNPJ_EMPRESA_TERCEIRIZADA" = :cnpjTerceirizada_0)))))) AND ("t"."NU_OCORRENCIA_EXTERNA" = "s203"."NU_OCORRENCIA_EXTERNA"))) AND ("s211"."NU_PROBLEMA_MANIFESTO" IS NOT NULL))
      ) "t16"
      ORDER BY "t"."NU_OCORRENCIA_EXTERNA", "t0"."NU_OCORRENCIA_EXTERNA", "t0"."NU_SOLICITANTE", "t0"."NU_SITUACAO_OCORRENCIA0", "t0"."NU_ORIGEM_OCORRENCIA0", "t0"."NU_TIPO_OCORRENCIA0", "t0"."NU_NATUREZA_MANIFESTO0", "t0"."NU_OCORRENCIA_EXTERNA0", "t0"."NU_CLSFO_OCRNA_EXTERNA", "t0"."NU_CLSFO_OCRNA_EXTERNA0", "t0"."NU_PRODUTO_MANIFESTO0", "t0"."NU_PROBLEMA_MANIFESTO0", "t0"."NU_SOLICITANTE0", "t0"."NU_DDD", "t0"."NU_TELEFONE", "t0"."NU_ENDERECO_SOLICITANTE", "t0"."NU_SOLICITANTE1", "t0"."DE_EMAIL", "t0"."NU_OCORRENCIA_EXTERNA1", "t2"."NU_OCORRENCIA_EXTERNA", "t2"."NU_SOLICITANTE", "t2"."NU_SITUACAO_OCORRENCIA", "t2"."NU_ORIGEM_OCORRENCIA", "t2"."NU_TIPO_OCORRENCIA", "t2"."NU_NATUREZA_MANIFESTO", "t2"."NU_OCORRENCIA_EXTERNA0", "t2"."NU_CLSFO_OCRNA_EXTERNA", "t2"."NU_CLSFO_OCRNA_EXTERNA0", "t2"."NU_PRODUTO_MANIFESTO", "t2"."NU_PROBLEMA_MANIFESTO", "t2"."NU_SOLICITANTE0", "t2"."NU_DDD", "t2"."NU_TELEFONE", "t2"."NU_ENDERECO_SOLICITANTE", "t2"."NU_SOLICITANTE1", "t2"."DE_EMAIL", "t2"."NU_OCORRENCIA_EXTERNA1", "t4"."NU_OCORRENCIA_EXTERNA", "t4"."NU_SOLICITANTE", "t4"."NU_SITUACAO_OCORRENCIA", "t4"."NU_ORIGEM_OCORRENCIA", "t4"."NU_TIPO_OCORRENCIA0", "t4"."NU_NATUREZA_MANIFESTO", "t4"."NU_OCORRENCIA_EXTERNA0", "t4"."NU_CLSFO_OCRNA_EXTERNA", "t4"."NU_CLSFO_OCRNA_EXTERNA0", "t4"."NU_PRODUTO_MANIFESTO", "t4"."NU_PROBLEMA_MANIFESTO", "t4"."NU_SOLICITANTE0", "t4"."NU_DDD", "t4"."NU_TELEFONE", "t4"."NU_ENDERECO_SOLICITANTE", "t4"."NU_SOLICITANTE1", "t4"."DE_EMAIL", "t4"."NU_OCORRENCIA_EXTERNA1", "t6"."NU_OCORRENCIA_EXTERNA", "t6"."NU_SOLICITANTE", "t6"."NU_SITUACAO_OCORRENCIA", "t6"."NU_ORIGEM_OCORRENCIA", "t6"."NU_TIPO_OCORRENCIA", "t6"."NU_NATUREZA_MANIFESTO", "t6"."NU_OCORRENCIA_EXTERNA0", "t6"."NU_CLSFO_OCRNA_EXTERNA", "t6"."NU_CLSFO_OCRNA_EXTERNA0", "t6"."NU_PRODUTO_MANIFESTO", "t6"."NU_PROBLEMA_MANIFESTO", "t6"."NU_SOLICITANTE0", "t6"."NU_DDD", "t6"."NU_TELEFONE", "t6"."NU_ENDERECO_SOLICITANTE", "t6"."NU_SOLICITANTE1", "t6"."DE_EMAIL", "t6"."NU_OCORRENCIA_EXTERNA1", "t8"."NU_OCORRENCIA_EXTERNA", "t8"."NU_SOLICITANTE", "t8"."NU_SITUACAO_OCORRENCIA", "t8"."NU_ORIGEM_OCORRENCIA", "t8"."NU_TIPO_OCORRENCIA0", "t8"."NU_NATUREZA_MANIFESTO", "t8"."NU_OCORRENCIA_EXTERNA0", "t8"."NU_CLSFO_OCRNA_EXTERNA", "t8"."NU_CLSFO_OCRNA_EXTERNA0", "t8"."NU_PRODUTO_MANIFESTO", "t8"."NU_PROBLEMA_MANIFESTO", "t8"."NU_SOLICITANTE0", "t8"."NU_DDD", "t8"."NU_TELEFONE", "t8"."NU_ENDERECO_SOLICITANTE", "t8"."NU_SOLICITANTE1", "t8"."DE_EMAIL", "t8"."NU_OCORRENCIA_EXTERNA1", "t10"."NU_OCORRENCIA_EXTERNA", "t10"."NU_SOLICITANTE0", "t10"."NU_SITUACAO_OCORRENCIA", "t10"."NU_ORIGEM_OCORRENCIA", "t10"."NU_TIPO_OCORRENCIA", "t10"."NU_NATUREZA_MANIFESTO", "t10"."NU_OCORRENCIA_EXTERNA0", "t10"."NU_CLSFO_OCRNA_EXTERNA", "t10"."NU_CLSFO_OCRNA_EXTERNA0", "t10"."NU_PRODUTO_MANIFESTO", "t10"."NU_PROBLEMA_MANIFESTO", "t10"."NU_SOLICITANTE", "t10"."NU_DDD", "t10"."NU_TELEFONE", "t10"."NU_ENDERECO_SOLICITANTE", "t10"."NU_SOLICITANTE1", "t10"."DE_EMAIL", "t10"."NU_OCORRENCIA_EXTERNA1", "t12"."NU_OCORRENCIA_EXTERNA", "t12"."NU_SOLICITANTE0", "t12"."NU_SITUACAO_OCORRENCIA", "t12"."NU_ORIGEM_OCORRENCIA", "t12"."NU_TIPO_OCORRENCIA", "t12"."NU_NATUREZA_MANIFESTO", "t12"."NU_OCORRENCIA_EXTERNA0", "t12"."NU_CLSFO_OCRNA_EXTERNA", "t12"."NU_CLSFO_OCRNA_EXTERNA0", "t12"."NU_PRODUTO_MANIFESTO", "t12"."NU_PROBLEMA_MANIFESTO", "t12"."NU_SOLICITANTE1", "t12"."NU_DDD", "t12"."NU_TELEFONE", "t12"."NU_ENDERECO_SOLICITANTE", "t12"."NU_SOLICITANTE2", "t12"."DE_EMAIL", "t12"."NU_OCORRENCIA_EXTERNA1", "t14"."DE_EMAIL", "t15"."NO_PRODUTO_MANIFESTO"
info: 09/09/2026 14:14:09.135 RelationalEventId.CommandExecuted[20101] (Microsoft.EntityFrameworkCore.Database.Command) 
      Executed DbCommand (19ms) [Parameters=[], CommandType='Text', CommandTimeout='120']
      SELECT "s"."NU_OCORRENCIA_EXTERNA", "s"."ED_URL_RETORNO_B2B" "CaminhoB2B", "s"."CO_ANEXO_GED"
      FROM "SOU"."SOUTB042_ANEXO_OCORRENCIA" "s"
      WHERE (((("s"."NU_OCORRENCIA_EXTERNA" IS NOT NULL AND "s"."NU_OCORRENCIA_EXTERNA" IN (63132, 71410, 71416, 71424, 71449, 71790, 71794, 71798, 71800, 71801)) AND ("s"."ED_URL_RETORNO_B2B" IS NOT NULL))) AND ("s"."IC_ATIVO" = 'S'))
info: 09/09/2026 14:14:09.217 RelationalEventId.CommandExecuted[20101] (Microsoft.EntityFrameworkCore.Database.Command) 
      Executed DbCommand (42ms) [Parameters=[], CommandType='Text', CommandTimeout='120']
      SELECT "s"."NU_OCORRENCIA_EXTERNA", "s"."CO_AUTO_INFRACAO", "s"."CO_CONTA", "s"."CO_ENTIDADE_CIVIL", "s"."CO_FICHA_AUTUACAO", "s"."CO_OPERACAO", "s"."CO_PROCESSO_ADMINISTRATIVO", "s"."CO_PROTOCOLO_EXTERNO", "s"."CO_TRANSACAO_GED", "s"."CO_USUARIO_CADASTRO", "s"."DE_EMAIL_ENTIDADE_CIVIL", "s"."DE_JSTVA_OCRNA_PERTINENTE", "s"."DE_JUSTIFICATIVA_CANCELAMENTO", "s"."DE_MANIFESTO_CLIENTE", "s"."DE_MASCARA_PROTOCOLO_EXTERNO", "s"."DE_MINUTA_RESPOSTA", "s"."DE_OBSERVACAO_PARECER", "s"."DE_OBSRO_APTMO_AVLCO_OCRNA", "s"."DE_PROVIDENCIA", "s"."DE_RECURSO_OCORRENCIA", "s"."DE_RESPOSTA_OCORRENCIA", "s"."DH_RESPOSTA_AVALIACAO", "s"."DH_RESPOSTA_OCORRENCIA", "s"."DT_ABERTURA_EXTERNA", "s"."DT_AUDIENCIA_ORGO_DEFESA_CNSMR", "s"."DT_CONVOCACAO_AUDIENCIA", "s"."DT_FINAL_DEFESA", "s"."DT_FINAL_OCORRENCIA_EXTERNA", "s"."DT_FINAL_PAGAMENTO_MULTA", "s"."DT_FINAL_RESPOSTA_FICHA_ATCO", "s"."DT_INICIO_OCORRENCIA", "s"."DT_PROMESSA_RESPOSTA", "s"."DT_RECEBIMENTO_FICHA_AUTUACAO", "s"."DT_RECEBIMENTO_OCORRENCIA", "s"."DT_REGISTRO_PRE_OCORRENCIA", "s"."DT_RESPOSTA_NOTIFICACAO", "s"."IC_ALCADA_RESPOSTA", "s"."IC_AUTO_INFRACAO", "s"."IC_CANAL_RESPOSTA_AVALIACAO", "s"."IC_GRAU_DIFICULDADE", "s"."IC_OCORRENCIA_EXTERNA_LIDA", "s"."IC_PERMITE_RECURSO", "s"."IC_PERTINENCIA_OCORRENCIA", "s"."IC_PRAZO_REABERTURA_DIA_UTIL", "s"."IC_PRAZO_RESPOSTA_DIA_UTIL", "s"."IC_PRAZO_RSPSA_RBRTA_DIA_UTIL", "s"."IC_PROTOCOLO_EXTERNO", "s"."IC_REABERTURA_OCORRENCIA", "s"."IC_TIPO_COMPLEMENTO_RESPOSTA", "s"."IC_TIPO_DENUNCIA", "s"."IC_TPO_RESPOSTA_DENUNCIA_MGRCO", "s"."NU_ASSINATURA_PARECER", "s"."NU_ATNTO_ORGO_DFSA_CNSMR", "s"."NU_CORRESPONDENTE_BANCARIO", "s"."NU_ENCAMINHAMENTO_BACEN", "s"."NU_IDENTIFICACAO_OCORRENCIA", "s"."NU_IDENTIFICADOR_BACEN", "s"."NU_MOTIVO_ENCERRAMENTO", "s"."NU_NATURAL_ABERTURA", "s"."NU_NATURAL_AGENCIA", "s"."NU_NATURAL_FISCALIZADA", "s"."NU_NATUREZA_MANIFESTO", "s"."NU_NOTA_AVALIACAO_ATENDIMENTO", "s"."NU_NOTA_AVALIACAO_SOLUCAO", "s"."NU_OCORRENCIA_VINCULADA", "s"."NU_ORIGEM_OCORRENCIA", "s"."NU_PRE_OCORRENCIA", "s"."NU_PROBLEMA_COMUNICACAO", "s"."NU_PROBLEMA_MANIFESTO", "s"."NU_PRODUTO_MANIFESTO", "s"."NU_REVENDEDOR_LOTERICO", "s"."NU_SITUACAO_OCORRENCIA", "s"."NU_SOLICITANTE_OCORRENCIA", "s"."NU_TIPO_ATENDIMENTO_OCRNA", "s"."NU_TIPO_OCORRENCIA", "s"."NU_TPO_ATNTO_DFSA_CNSMR", "s"."NU_UNIDADE_ABERTURA", "s"."NU_UNIDADE_AGENCIA", "s"."NU_UNIDADE_FISCALIZADA", "s"."PZ_OCORRENCIA_EXTERNA", "s"."PZ_REABERTURA_OCORRENCIA", "s"."PZ_RESPOSTA_OCRNA_DIA_UTIL", "s"."PZ_RESPOSTA_RBRTA_OCORRENCIA", "s"."QT_REABERTURA_OCORRENCIA", "s"."VR_MULTA_ORGAO_DFSA_CONSUMIDOR"
      FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s"
      WHERE "s"."NU_IDENTIFICACAO_OCORRENCIA" IN (2502260000028, 2007260000001, 2007260000007, 2007260000015, 2107260000012, 2307260000005, 2307260000009, 2307260000013, 2307260000015, 2307260000016)
info: 09/09/2026 14:14:09.267 RelationalEventId.CommandExecuted[20101] (Microsoft.EntityFrameworkCore.Database.Command) 
      Executed DbCommand (20ms) [Parameters=[:ToString_1='39565194000108' (Size = 2000)], CommandType='Text', CommandTimeout='120']
      SELECT "s"."NU_OCORRENCIA_EXTERNA"
      FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s"
      INNER JOIN "SOU"."SOUTB043_SOLICITANTE" "s0" ON "s"."NU_SOLICITANTE_OCORRENCIA" = "s0"."NU_SOLICITANTE"
      WHERE (("s"."NU_IDENTIFICACAO_OCORRENCIA" IN (2502260000028, 2007260000001, 2007260000007, 2007260000015, 2107260000012, 2307260000005, 2307260000009, 2307260000013, 2307260000015, 2307260000016)) AND ("s0"."CO_CNPJ" = :ToString_1))
info: SISOU_api_sac_internet.Shared.Middleware.RequestLoggingMiddleware[0]
      HTTP Request: GET: /v1/ocorrencias/consultar?numeroPagina=1&tamanhoPagina=200 200 OK 15609ms
warn: SISOU_api_sac_internet.Shared.Middleware.RequestLoggingMiddleware[0]
      Requisição Lenta Detectada: GET: /v1/ocorrencias/consultar?numeroPagina=1&tamanhoPagina=200 200 OK 15609ms
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      === CONFIGURAÇÃO GED ===
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      BaseUrl: https://siecm.des.caixa/siecm-web/ECM
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      IpUsuarioFinal: 10.116.222.199
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      TimeoutSeconds: 30
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      LocalArmazenamento: OS_PADM
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      HttpClient.BaseAddress: NULL
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      ========================
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      === INICIALIZANDO B2BService ===
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      ServerNfs: nfsctcnprd.ctc.caixa
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      PathNfs: /ifs/CADSVISISD4/SERVIDORES/CETAD/SISOU_DES_B2B
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      PathDestino: /SISOU/PARCEIROS
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      SizeVolume: 20Gi
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      BaseDirectory: /SISOU/PARCEIROS
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      MaxFileSize: 52428800 bytes (50 MB)
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      AllowedExtensions: .pdf, .doc, .docx, .jpg, .jpeg, .png, .zip, .rar, .txt
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      BaseDirectory: /SISOU/PARCEIROS
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      IsConfiguredFromEnvironment: True
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      === FIM INICIALIZAÇÃO B2BService ===
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      === CONFIGURAÇÃO GED ===
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      BaseUrl: https://siecm.des.caixa/siecm-web/ECM
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      IpUsuarioFinal: 10.116.222.199
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      TimeoutSeconds: 30
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      LocalArmazenamento: OS_PADM
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      HttpClient.BaseAddress: NULL
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      ========================
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      =================================================
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      📧 EmailService inicializado com configurações:
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         SMTP Server: smtptest.correiolivre.caixa
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         SMTP Port: 25
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Enable SSL: False
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Remetente: sac@caixa.gov.br
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Nome: SAC CAIXA
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      =================================================
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ⏱️ [RESPONDER] Requisição recebida em 09-09-2026 14:20:00.335
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      🚀 [RESPONDER] Iniciando processo UNIFICADO de resposta da ocorrência 2205250000004 para CNPJ 39565194000108
info: 09/09/2026 14:20:00.501 RelationalEventId.CommandExecuted[20101] (Microsoft.EntityFrameworkCore.Database.Command) 
      Executed DbCommand (97ms) [Parameters=[:numeroOcorrencia_0='2205250000004'], CommandType='Text', CommandTimeout='120']
      SELECT "s"."NU_OCORRENCIA_EXTERNA", "s"."CO_AUTO_INFRACAO", "s"."CO_CONTA", "s"."CO_ENTIDADE_CIVIL", "s"."CO_FICHA_AUTUACAO", "s"."CO_OPERACAO", "s"."CO_PROCESSO_ADMINISTRATIVO", "s"."CO_PROTOCOLO_EXTERNO", "s"."CO_TRANSACAO_GED", "s"."CO_USUARIO_CADASTRO", "s"."DE_EMAIL_ENTIDADE_CIVIL", "s"."DE_JSTVA_OCRNA_PERTINENTE", "s"."DE_JUSTIFICATIVA_CANCELAMENTO", "s"."DE_MANIFESTO_CLIENTE", "s"."DE_MASCARA_PROTOCOLO_EXTERNO", "s"."DE_MINUTA_RESPOSTA", "s"."DE_OBSERVACAO_PARECER", "s"."DE_OBSRO_APTMO_AVLCO_OCRNA", "s"."DE_PROVIDENCIA", "s"."DE_RECURSO_OCORRENCIA", "s"."DE_RESPOSTA_OCORRENCIA", "s"."DH_RESPOSTA_AVALIACAO", "s"."DH_RESPOSTA_OCORRENCIA", "s"."DT_ABERTURA_EXTERNA", "s"."DT_AUDIENCIA_ORGO_DEFESA_CNSMR", "s"."DT_CONVOCACAO_AUDIENCIA", "s"."DT_FINAL_DEFESA", "s"."DT_FINAL_OCORRENCIA_EXTERNA", "s"."DT_FINAL_PAGAMENTO_MULTA", "s"."DT_FINAL_RESPOSTA_FICHA_ATCO", "s"."DT_INICIO_OCORRENCIA", "s"."DT_PROMESSA_RESPOSTA", "s"."DT_RECEBIMENTO_FICHA_AUTUACAO", "s"."DT_RECEBIMENTO_OCORRENCIA", "s"."DT_REGISTRO_PRE_OCORRENCIA", "s"."DT_RESPOSTA_NOTIFICACAO", "s"."IC_ALCADA_RESPOSTA", "s"."IC_AUTO_INFRACAO", "s"."IC_CANAL_RESPOSTA_AVALIACAO", "s"."IC_GRAU_DIFICULDADE", "s"."IC_OCORRENCIA_EXTERNA_LIDA", "s"."IC_PERMITE_RECURSO", "s"."IC_PERTINENCIA_OCORRENCIA", "s"."IC_PRAZO_REABERTURA_DIA_UTIL", "s"."IC_PRAZO_RESPOSTA_DIA_UTIL", "s"."IC_PRAZO_RSPSA_RBRTA_DIA_UTIL", "s"."IC_PROTOCOLO_EXTERNO", "s"."IC_REABERTURA_OCORRENCIA", "s"."IC_TIPO_COMPLEMENTO_RESPOSTA", "s"."IC_TIPO_DENUNCIA", "s"."IC_TPO_RESPOSTA_DENUNCIA_MGRCO", "s"."NU_ASSINATURA_PARECER", "s"."NU_ATNTO_ORGO_DFSA_CNSMR", "s"."NU_CORRESPONDENTE_BANCARIO", "s"."NU_ENCAMINHAMENTO_BACEN", "s"."NU_IDENTIFICACAO_OCORRENCIA", "s"."NU_IDENTIFICADOR_BACEN", "s"."NU_MOTIVO_ENCERRAMENTO", "s"."NU_NATURAL_ABERTURA", "s"."NU_NATURAL_AGENCIA", "s"."NU_NATURAL_FISCALIZADA", "s"."NU_NATUREZA_MANIFESTO", "s"."NU_NOTA_AVALIACAO_ATENDIMENTO", "s"."NU_NOTA_AVALIACAO_SOLUCAO", "s"."NU_OCORRENCIA_VINCULADA", "s"."NU_ORIGEM_OCORRENCIA", "s"."NU_PRE_OCORRENCIA", "s"."NU_PROBLEMA_COMUNICACAO", "s"."NU_PROBLEMA_MANIFESTO", "s"."NU_PRODUTO_MANIFESTO", "s"."NU_REVENDEDOR_LOTERICO", "s"."NU_SITUACAO_OCORRENCIA", "s"."NU_SOLICITANTE_OCORRENCIA", "s"."NU_TIPO_ATENDIMENTO_OCRNA", "s"."NU_TIPO_OCORRENCIA", "s"."NU_TPO_ATNTO_DFSA_CNSMR", "s"."NU_UNIDADE_ABERTURA", "s"."NU_UNIDADE_AGENCIA", "s"."NU_UNIDADE_FISCALIZADA", "s"."PZ_OCORRENCIA_EXTERNA", "s"."PZ_REABERTURA_OCORRENCIA", "s"."PZ_RESPOSTA_OCRNA_DIA_UTIL", "s"."PZ_RESPOSTA_RBRTA_OCORRENCIA", "s"."QT_REABERTURA_OCORRENCIA", "s"."VR_MULTA_ORGAO_DFSA_CONSUMIDOR", "s0"."NU_SOLICITANTE", "s0"."CO_CNPJ", "s0"."IC_GRAU_RELACIONAMENTO", "s0"."IC_PESSOA_VULNERAVEL", "s0"."IC_SEXO", "s0"."IC_TIPO_SOLICITANTE", "s0"."NO_RAZAO_SOCIAL", "s0"."NO_SOLICITANTE", "s0"."NU_CPF", "s0"."NU_PESSOA", "s0"."NU_SEGMENTO", "s0"."NU_SOLICITANTE_PRINCIPAL"
      FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s"
      LEFT JOIN "SOU"."SOUTB043_SOLICITANTE" "s0" ON "s"."NU_SOLICITANTE_OCORRENCIA" = "s0"."NU_SOLICITANTE"
      WHERE "s"."NU_IDENTIFICACAO_OCORRENCIA" = :numeroOcorrencia_0
      FETCH FIRST 1 ROWS ONLY
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      🔍 [RESPONDER] Ocorrência encontrada. ID Interno: 49410, Situação Atual: 14, Solicitante: Cliente Teste Foton
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ [RESPONDER] Validação de situação: OK
info: 09/09/2026 14:20:00.545 RelationalEventId.CommandExecuted[20101] (Microsoft.EntityFrameworkCore.Database.Command) 
      Executed DbCommand (10ms) [Parameters=[:idOcorrencia_0='49410'], CommandType='Text', CommandTimeout='120']
      SELECT CASE
          WHEN EXISTS (
              SELECT 1
              FROM "SOU"."SOUTB071_OCRNA_EXTNA_RESPOSTA" "s"
              WHERE CAST("s"."NU_OCORRENCIA_EXTERNA" AS NUMBER(19)) = :idOcorrencia_0) THEN 1
          ELSE 0
      END FROM DUAL
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ [RESPONDER] Validação de resposta existente: OK
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      🔐 [VALIDAÇÃO] Validando acesso do CNPJ 39565194000108 à ocorrência 2205250000004
info: 09/09/2026 14:20:00.579 RelationalEventId.CommandExecuted[20101] (Microsoft.EntityFrameworkCore.Database.Command) 
      Executed DbCommand (22ms) [Parameters=[:numeroOcorrencia_0='2205250000004'], CommandType='Text', CommandTimeout='120']
      SELECT "s2"."CO_CNPJ_EMPRESA_TERCEIRIZADA"
      FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s"
      INNER JOIN "SOU"."SOUTB046_OCRNA_EXTNA_CLSFO" "s0" ON "s"."NU_OCORRENCIA_EXTERNA" = "s0"."NU_OCORRENCIA_EXTERNA"
      INNER JOIN "SOU"."SOUTB055_CLSFO_UNDDE_RSPNL" "s1" ON "s0"."NU_CLSFO_OCRNA_EXTERNA" = "s1"."NU_CLSFO_OCRNA_EXTERNA"
      INNER JOIN "SOU"."SOUTB141_EMPRESA_TERCEIRIZADA" "s2" ON "s1"."NU_EMPRESA_TERCEIRIZADA" = "s2"."NU_EMPRESA_TERCEIRIZADA"
      WHERE (((("s"."NU_IDENTIFICACAO_OCORRENCIA" = :numeroOcorrencia_0) AND ("s0"."IC_CLASSIFICACAO_ATIVA" = 'S'))) AND ("s2"."IC_EMPRESA_ATIVO" = 'S'))
      FETCH FIRST 1 ROWS ONLY
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ [VALIDAÇÃO] Acesso validado com sucesso - CNPJ 39565194000108 está vinculado à ocorrência 2205250000004 via empresa terceirizada
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ [RESPONDER] Validação de acesso CNPJ: OK
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      📎 [RESPONDER] Processando 1 anexo(s) B2B → GED
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      📎 Processando 1 nome(s) de arquivo(s) para ocorrência 2205250000004 (ID: 49410), CNPJ: 39565194000108
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      🔍 [B2B] Verificando existência do diretório B2B: CNPJ=39565194000108, Ocorrência=2205250000004
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      Verificando existência do diretório: PARCEIROS/39565194000108/2205250000004
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      Caminho completo construído: /SISOU/PARCEIROS/PARCEIROS/39565194000108/2205250000004
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      ✅ Diretório encontrado: /SISOU/PARCEIROS/PARCEIROS/39565194000108/2205250000004
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ [B2B] Diretório B2B validado: PARCEIROS/39565194000108/2205250000004
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      Listando arquivos da ocorrência - CNPJ: 39565194000108, NumOcorrencia: 2205250000004, Caminho: /SISOU/PARCEIROS/PARCEIROS/39565194000108/2205250000004/UPLOAD
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      Total de arquivos encontrados: 6
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      📂 [B2B] Arquivos disponíveis no B2B: [imagens.zip, anotacoes.txt, documentos.zip, Guia_Consumo_APIs_Resolve_Caixa_NET_Completo.docx, WO0000078575487.png, anotacoes.txt_erro]
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      📋 ====== PROCESSANDO ANEXO 1/1 ======
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
         📝 Nome do arquivo (sem extensão): 'documentos'
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ [B2B] Arquivo encontrado no B2B: 'documentos.zip' (buscado por nome: 'documentos')
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ⬇️ [B2B] Baixando conteúdo do arquivo do B2B: documentos.zip
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      BuscarArquivoPorOcorrenciaAsync - CNPJ: 39565194000108, NumOcorrencia: 2205250000004, Arquivo: documentos.zip
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      Caminho completo construído: /SISOU/PARCEIROS/PARCEIROS/39565194000108/2205250000004/UPLOAD/documentos.zip
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      Arquivo encontrado - Tamanho: 40205 bytes (0.03834247589111328 MB)
info: SISOU_api_sac_internet.Shared.ExternalServices.B2B.B2BService[0]
      ✅ Arquivo lido com sucesso: documentos.zip, 40205 bytes
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ [B2B] Arquivo recuperado com sucesso: documentos.zip, Tamanho: 40205 bytes
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      📤 Enviando arquivo para GED: documentos.zip
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      Enviando documento para GED. Código: (null), Arquivo: documentos.zip
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      🔍 IP que será informado ao GED (ipUsuarioFinal): 10.116.222.199
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      📤 Payload GED: {
        "dadosRequisicao": {
          "localArmazenamento": "OS_PADM",
          "ipUsuarioFinal": "10.116.222.199"
        },
        "destinoDocumento": {
          "localGravacao": "PADRAO",
          "idDestino": null,
          "subPasta": null
        },
        "documento": {
          "atributos": {
            "classe": "EVIDENCIA",
            "gerarThumbnail": true,
            "tipo": "ZIP",
            "mimeType": "application/zip",
            "nome": "documentos.zip",
            "campo": [
              {
                "nome": "EMISSOR",
                "tipo": "STRING",
                "valor": "SISOU"
              },
              {
                "nome": "DATA_EMISSAO",
                "tipo": "DATE",
                "valor": "09-09-2026 14:20:00"
              },
              {
                "nome": "CLASSIFICACAO_SIGILO",
                "tipo": "STRING",
                "valor": "PUBLICO"
              },
              {
                "nome": "RESPONSAVEL_CAPTURA",
                "tipo": "STRING",
                "valor": "service-account-cli-ext-39565194000108-1"
              },
              {
                "nome": "STATUS",
                "tipo": "STRING",
                "valor": "0"
              },
              {
                "nome": "TIPO",
                "tipo": "STRING",
                "valor": "3"
              },
              {
                "nome": "PROTOCOLO_EXTERNO",
                "tipo": "STRING",
                "valor": ""
              },
              {
                "nome": "OCORRENCIA",
                "tipo": "STRING",
                "valor": "2205250000004"
              },
              {
                "nome": "EMISSOR_ARQUIVO",
                "tipo": "STRING",
                "valor": "service-account-cli-ext-39565194000108-1"
              },
              {
                "nome": "DATA_UPLOAD",
                "tipo": "DATE",
                "valor": "09-09-2026 14:20:00"
              },
              {
                "nome": "IDENTIFICADOR_USUARIO",
                "tipo": "STRING",
                "valor": "service-account-cli-ext-39565194000108-1"
              },
              {
                "nome": "DATA_REGISTRO_OCORRENCIA",
                "tipo": "DATE",
                "valor": "22-05-2025 16:18:57"
              }
            ]
          },
          "binario": "UEsDBBQAAAAAADqCQ1wAAAAAAAAAAAAAAAALAAAAZG9jdW1lbnRvcy9QSwMEFAAAAAgAdXiMW07c0KiJAgAAtgQAABgAAABkb2N1bWVudG9zL2Fub3RhY29lcy50eHSdU71u20AM3g34Hbh1SezYQJYMBZzYKDw0ddOfoUtB6Wj3AN1RuR8lyNsEGYp07SPoxUqebCftWAiQTnfkx48fv1u58Wg8uiLfPwbLF3BDseWYECpypzHXZKxBqNkBerpn6PrHxhoej5ZoGG4zAcJis4ZANVUEPjsK/KHmEMjXFk/koADKyqTvhx\u002BgAe6aHRXw7ODbevOC/jGjF3wGDLfZdgz9MzRcY2MftK5nuJxfCgr5zuoGMrxbLcejlU/9k/wCK4X\u002Bl3LQ3FLYay\u002BSxIderK9zg1pPMh38f1l9FizbNfsUMBwRDjmqg6KUI8N3vmE0YKihPZoctBiE9wvg/Hw6m03nZ/NzOAUBjrlJmn8UN2rUVwp2a3UQUZCivDAFW\u002BXEcMWubciRlzXd25gkwAFnYRghYUWNfBVNFrVljwbjBK6LgE2ioErV/W9jd7JhvZEZYktekmRqTuYYaGB6Q447CrC1TQosbYHBJGGvuGQv2htaUkzWi\u002BDDczabzua6WPtOT3YYtH84fQsip/Vd/xwVLkkPckS\u002BZesTTOWHtmLL0mDiEwmIGrAjs6eooLOzPbqYmhsl2AauRBEUfjIQGVC0/c/\u002BaTBAEOoeYcvBCfuy/2/cBZQoZEWqRW2pOXjpzeCwSJMH2765gIVX\u002BjJyUwCEHny5WcMdRk3trCEzgZVNP4SVvP4KclkWlV4RwEqY50RlnwNcYqSFMUFKH8MipUlp9yDmBvU2lstpKENNIfEEFjsOeheKLVBMqvIdukus07J7vxSbCW7opO0yT9HMNqXIfF9kkfLe0DFXzsZY5KKD7\u002BOgi/hpSR0p1vHSZHe8HKKVlK0HQqaQzBiMgL5WXXzlh1pa4NP7z5s/UEsDBBQAAAAIAJJwgVsXTu6\u002BYJgAAEmnAAA8AAAAZG9jdW1lbnRvcy9HdWlhX0NvbnN1bW9fQVBJc19SZXNvbHZlX0NhaXhhX05FVF9Db21wbGV0by5kb2N47Jnjc2VdFsZvbNtOOunY6thOOjY7tv3Gtm3buLExSTrGjW2b885MzdRM1fwHM\u002BvDrlXnw6lzdu1nPfV7tpIsBCQmABoACwAAyAAkFJBvDmAAADk0AIABgAXXEbW3czGzczFQ9XQwc9Zj9LC1IS2EBP\u002BWDwAH/L/\u002Bp6s5eVJhkBlV/EnqXXSfQWa9UQiW4yJwFJ1OWaCvhaYmxKCxrK7XfK4ZTaQErXlDzOnXZbc5vTV0UQvHKrrx3GZKtcG9JrSCV8lGtSlJUtp7rhlcyM8BDxgqkJBx0c7DomEjXDyrClC1kcfYY5t/nEczAZ6kT7nkdha\u002B2CT7hnS/LB2s9\u002BLhsv0eud8otgWGADk3Hx0haPUu04\u002BLEk3OeNVkXtM8RS7YsBlTyrXH5VRSpkf2m1THhbQz0RwSB7Mfc0HtO3H9fPfsolgNKUFUeN2ACo7BS3n7rZORtBZhG0/fSZWMrMVDi064voiMy9ESpu0w/MXje69Te0iOCOXBi7D2mUJ4MAHEyTtkjL07P2niNjqA70ghGEtui0niZqoLo7hwPSIdn1tQwnoDLqAZOv/lUfFwZY0wqnja8Z5sVjviC9e7l8vKVQECJrw8rreTM6FaMRflNKVY6INDhxHdy9vJx8SZNNue6/0aAQD4\u002BoIA/KdQM9T8oD7/7Hb\u002B1CHCn0I1cDKzcWZi/Nv6f4H\u002Bv/5W1YnyshAsqKFXgV9kf\u002BnmA9GRz23oix3Lm36AibK\u002BBWShJFa0fm1\u002Bi2RcaAkjZvM8GmcTXcrqJlr8PsruodHf\u002BE24YX4TsbZqu8NTcz1QRmT69zGRhsM2ZNbrrfHHEIW0ncwHauIEZhrdsfgAkfHcDx2ZEJTzW/mzIqrx0RUj0g8Ror1Kenvmz19CP4wqaypI7aawyg9RnzFb7UHCd93LfJMKsfwBXThuoVPkQ\u002BskZmPz5aHGoyoBN68saRgqsOISEMRc2jl290/NFlpj8ahWJJ6bRxQsNM38R5GlESRZXCRImXW32VMPPLb3jBFtX9VHbHc1wUlxWr0Q/00um209jK4oAICDEwCA9ucTd3snUyZTexNX2z/N7W\u002Budq63Ybc3ltJjYLgVgFrfj7idqvn\u002BXSXrUuvTjbdpj3Ntep8cFt\u002Bskd4505SWssTNvb6vZ1BA2I0pkJ5ZQ9juUN2\u002BUbGxLHJBEZRaZppGaV8fE0r5SeRXNs2zVcFLn\u002Br/MiWvZeGszcVTpY/8W4nEollGK1UjKS1oS5eSaT1gqbl4Qqqf7tXpOoIzyF7/Y0/w/XaP2\u002BSkulitKiC8Es8/u5QJZtmWjyhOQt5LXnYOcZK/Rmuwds1oYgIN2Dnxk/d17NTG9FgKp7eUQ9Zyvu9DRGVKmu14uITLaa4x0yc4qkPIOlk/qbOEyxrPwpzscYygwx0KLw4VEh//uPabs7nydHhRJ8WYVzKpkKtk4ge39NO3I36FREcNdL9syrtayifHxMv2n57L/avJ6g7XkYtUlkZNudEyKv7p8gZ/bNNa3k12jYEUSX\u002B6pxpL6ft6QJK3W1EVsDflUG0rj7Nqp6\u002BqwHvzpC8utvd\u002BDp96Ifuu623519Tmh6zb7rhthm82i88z1tWYrdUC\u002BU8jxJvXykuhmimqMs98Oo3DbhvmtrcfVMbeC6DT04Zvu\u002BJ\u002BUuJZgcoZTv9Sj/0NordNT8tljCQ13AXO2gmt6rspqY/nDFUiOr\u002BH754kx5TEHrn0rRY88yWsgwpdBn0q67r\u002ByDc9Sa60JNnQRRUFcyxGGgMu\u002BsT9PpAhJ6RpU44Y7iE6zNdumv2YVSMncFN\u002BfU6Cwo/BcpzDUl14XrorkTKwRMxa1PjIEEpWw2fEbG4Df0of7l3VbsWB11M7v6d21aYzNVVQfi2Lw8x/P6eMyPQBrFdaZGq\u002BL9sgiZbZMyN2S45OPWkSHFX42Qo1ILMe8AUpeWiwS9ON9tbxdS9YC/9JkWWZjQ5Tl4/hMd6o\u002BO4ND1N9k7ywjzQUH7A7NKrAiupNFtLqw3T51b/J4sLd5M4E03lJ0Hl2WqWH1k3eVLjBzdr5XV8SbimINBWVpF39m8M6mv2aAq64SMSJFkPPNEgRqnnAQ6Gvm2lNq78T\u002BBXP6F4aL2Ux9RSrnhYR97h4pqXQHG1FVlypNd789fL09fu9iSvmMZazOn3eSOqWoNCXgz\u002BGqQdbsjfM7mm3F1dXWQFhDZ2xCSvxTOFTb8px/5W6NfrDOvZS7dZHnfFT9UgOvBIOGfUtIRpFSvgC7Z3Ofm3Y4IzfrKtha9Zzk/5TgiCjVVbJNLS0BhcV38qeyT/fVgBGTE7Hjcs0E5ZKHxVAPRweXeAmI75gDrkG\u002B5k3N75bV5G9Wg3gKw3DNGENM6ySls8k2jEkycIlU0Cl29EknCb55ZnUVj2bqAVlQZc42Z5wEtK6p/m\u002BSYe2akDKe9BVj0E/KhN/hl85OIVn5Zgir6XfEoN9MJWsFkVypAqfGOAyGFtfhotObPVZHYI6\u002BbPxmY09OZoAr4AAX4oDE0f7KBTcm21nuRsM6luMvYgzh0pX7DuzEJk6kesmqs2Ir1Q8ZxhuQrR0glnxaIF5OXTwfYHbZqLbktDSpAVEzT1RDT5rAErGCgI9DbLrYkPYH4Oea9Ns2s5pgT6FevSfierbRiqxl5K5YSZmGWbL1V2yCjZMUZ9VGGCCPV1IHcFgXPc0AdVsaw/\u002B29lbA464rJGx2m\u002BW8HqSrNYkx8QRUZ8pDSiTop0HUVF1t52WWyzxw77WuvF\u002B1r7MpsPV\u002B8NjBzcHyI4yw35Y8XQ6tr5btgwEv37WLbvm3uRhPEPj5UCHWnYS9YGANx9AEl4gcOdWwNa3roSraGKBwhTqElvyJNjlue2eJy0M1Pyma/fwyCJnPSi2iqSlv5Tn8X1MbyuSQlLL6aJbpRC4bu24SqR1ek9H/tRYoiSUsRSLshQVfVTkKoi8AtxtNdP5xjx1ZGK3VuyaxvhU23Xykro31N\u002BkTPzKXL1Z2xru6ng40xhJFJZAEC5872yIRTDqhcpX2VSwQErY8V4RDPYx/TEfnrHSifc8qjSPe\u002Bq9PHPbxYzsslgCTfvx7iYR\u002Be683L38XISpTzLLzR6zrPhY22VE3Zk1BEJ/0E\u002BJk0qZB/cyBWMg3h7OJX3WWC4BqlFE5YzF\u002BCyaMm3Q\u002BMpoUYaj8zkkK7vGfbPTrmQg0Wa7iFzEkjdS1J9vnRYUzTN4xol28SwodO6O7kMtyV5qJtt1kHHWHwTELRiOaTTw\u002BMwtPqcDS9v37TauIPdLh\u002Bnr8hlO1ciKTxHIaHQfdwVlAQOZGDGMo8mqEIJoJm2/vs06xKLhF6R9qwI7/\u002BU8mxI2ks8xNW0ohrOQ7HMcCq74XZrHDRc/15b2MYxNO80za3mN5JeLrWm4jJ0pKYndWDKOc1RqKo0hh/77mBScuqW1CgezZgBSamOn/rt7yiEkvWTksIFM7SakdsBVVUvqwh\u002BFsz1Wv9KmdkcRbV5aOGciHBIxbMFl1Guuo0IVftU3PLMF6MhJqzdZjQeoLLXZkAB1YHC8454l054Lx4Rr6zqdHgqrhnB\u002Bf66BWhJGAOi8\u002BljnVD\u002B1wdbkEQKNKl3UYUEYpSF1ogr6DG9CVRg142QMrl3bBnOdVEXuyeEkrIfCxLGJSjme6laRrBgoQKbFd2JWi5GW6mMkmpRlR0h2CIu7Sj6obJue54Sq7yr0GuoyKKY6yjbljCXdvxnFlGZ5e0vCtzIqCtyRHAqnvBnM1UbpIdFjk3kc0KGId5tYHw9dtxo8p53lYTyru2vYJj7sJqwYrDUkfw4seVXTk1siDbY2mFNXkpDZVDqSwdpcKO2crNZpKBc0ZKgLS9Rk1Gds89OuC5sOr6jrGaxHh4LauVSqRxjPfETEZuWKV82aZIUlA1Da1KB9NXJ9B5oQ9g1HnV0fCJsfU5lWkq0OJBDfY2QejM\u002B5mRNIKtxPWqzXwVfLLGgfnRPsxVtPe05wztsiFKCTzMhGl5KKUvLyXo8n\u002BiSOvb2365lIMCIUll9edJi5Xbp7SvKK5yDdkPTaFk3OcksiXgLIHVP6hDyl2Wf4Gr6k6eRIUcJab2nYfdPZa3BfLHoF/L3pgkYQlQ2Bn7PU1PwHPCW1BKmXw5V8\u002BXVGzNxWUryZRQmwlgmEWcqCpaRPWF\u002BXQqL6mF6aL7\u002BPLl58VyQ\u002BcMMmhEQTDnA7i/DXPmo4tQ/QjhnGlSJNBgUJaaGefgPcdaLcKMQVzliFIbvJ\u002BZhR5ounyhW9Wacs\u002BTrNvSu1HKyL4Az5PIvsQLW2HhMSVMDbGRNqKtxaE5N9Zxc6HSwHXTb9vu2m0lFtoQIO64s4HPveGMUt0c83roz93WA3GyirPZh8eecx4B4VrtTgVe\u002Bd4sfyDR\u002BeUiex6Nx83C8Ts6Yf2UMNXcxKRApPy3zFjXKYISvKMUfmGNtcPw1n045xirM/nZP8Q/Oefiy1DyamnuCPqfxw\u002BtrbfuR2Y16C3rZfqQ/rfA6DplkTwiQjRbgp0sMyJt3rij0D/HJl4/JeeMLxp7w2pBH5hUoSOee\u002B4wSS2w4tOGVJrQ6AUoU19bsHt5sOHSTbYoK3LKsudth2D4ouGZx5cbn2xtszIYKR2CWO6XDLgHn8wgiWq4Pw8G5z/roMO0Ry5UrOIzX19iMsrFFehfO81iqck3xJJYbKtf9WtEajmAlLpnbuXxtuBs3ZqmfWnUdT5ZtAImQ96AK\u002BfB3LbL\u002BHJ4fiZEy4WvviUwrDUIVnwGFgr6E/BOT\u002BMs8QH3WrptGR7c2JH2SJKgCF7nVUGuwkZBo6Agnq3Y9EUq8y7VwwzbJaD5kAQTREQvIzbSJf36xyGf12JRaxBdWM8dlXqwuv9JwJ91CzDpXZew2fnvbdymBH2W0m4dssZ\u002BF4CMXTWTiJKJQ3LFOtFly8HgRqSgXPN5yz\u002B9xFdV6KY4jKja7otNW3jxVcgi1Hfxvwyz5jnB5QnDWPvXS8mYuMLvhOqnG2b0of9HQ6zQkCNESQUm21Q5tcAaA/X82Byx2tuyU40A7phVJdfIVyKFWKVUkfwi/q9Vv\u002BU13OKdlzoSvTWUrfIZE7nN4lueLGewdqHhZ9Eu13HgTTNnMfdGzstRVKsKwBzqYgjQd3Q8z1t/EDQz3oGXG3aq/IlOTIozPpUBhicdIZJPlJ3olvxlPIBtPaqgPo2I9TKw2tZg0KYzuaAxFJYk8bxPtGoAymsrtYBSfYYogFlh\u002BTSxQmBHxXOsprgRQXetLnZDA0x998hT97To8zF4130l6VfrkK6YA0nhw\u002BWfgLgnHuh6QGALZZV3N//heTIZ/LH4Fxc6u5S/ts3v4pGsUrwK8Vx\u002Bq30s4Uz1wqBm4/dI9Sz2SjYTwu6rJgnjome\u002B8L\u002BQZl1\u002B8L8hqr6w1FKAxKhMcNAa0NujT7DvuGxlwjbi6Yc2auAgUHn6LUDSLV3pKOBRBI9ISDwyxzcQPwZGBOR9WAsgVKvj4PcHFYKh2YI5gCSA7V7Q6Bxtbauvk/PwnrWCIZV98jOdBNfE1LXvBqy5N\u002BVMLI4kNPAw88mEGQH37rBo8orJZpZQUhAe1zi4Rr\u002B9uAl6E9Qt\u002BfW/TcJ9x6aXjQ9EY5ikSfRZTvfaLZQ6xzqawOwbMQFN4HR09AdKB8rmUuEcPkxqifPYnMvPUdPJbrWjkUKHMCeOQOjchDIEpX3t\u002B75raEOt5uzD/4dI6IRTf84VrHzC8qwKxkSIktIJOxX91WRBr8iGqz7dF61X66yc6PT5AucBs45sGIQeQKuhkc\u002BgE\u002BKXDfuXtLFPYBVNsH\u002BrzObLEobv9GTvwtKPN0BX5JPYIWxmaR2N6wQ1RS7nA1qSAoi/9\u002Btok1p4voqe3ZIesX0lxWE2Iz2pmWrvng9Bhaa23fS2R9xNajm7YQeeOIGyKgjr37AxXhD0hKjDqtuVIia3OCs7b9RZ\u002BbMvI03Ul8SSNCIzPxXiyh4o9S8g9QKzuBNY6xeDYWJ57FmHy15gad73eLVLcJbQajJrq97/quitQtMl2V2iVyqqQlm8oSBQTanVZMTf3t9h7Zd4nHPDVHqPOOek1e9D35SGQLFfQjuFoBlxXTLLcB70MHgwVBfyApbtikES89fXRKMmBUZXBUEc5eB\u002B/kdc/Cagp1Tax/peCqoJj5LD0aK2q0RTuguJtMKW7\u002BgVTT0aRePVWXT9QBP5857TxAUqaMl\u002B1WOArXqMrkhsngl3lEqABkv9G0/oXXvRDjL/2iEjcIl4XCdOU/21Jg6a2\u002B5WwN5u/02SE7Psbcme2D1Gu7rP2JlT3uHmyw3kjrDyrkK5mmWb7wuktsYfi\u002BDILqXuP2kofjpm0O1Pz08hnWBDbwZLQYN/XqTURCP3L\u002BTJy7JGzgM6H1L0iYDGX\u002BMQnCVMqM5ebVrvzm5\u002BZPaNH8\u002BTOh7hPnvzF6U08UEdSf2XPrnwRPCIAF\u002Bzuj/z3X\u002Bg9S/2fGBfZnxgUG\u002BB\u002Bv6qQpqz9D2OCrkJ6gFW8GPltRuARn2gBdnScwU\u002B8P0QeTYnntXl9xGfQw6PmgWDZj856QRa\u002B7Giy\u002B/LtuDvBGSqjQ0kZXe20wkuHHHah0GkurimphMAqvlf0n9zMu1cSB\u002BKvX/qZ4464/Yi00HS\u002BrkFvuI4h\u002BB6eN8DLQSi3fCqvnNYr3SM1Tuc8jjtWxrtZib7s9UNQbE14LrrZavsIb2LYsWxxLQD1JYXLekf3sxJbuG5cWwb4GwUaVw7LTZYMTPuj6YjdtnrtGMNr4kHHrOKNOpqNi/roBd0ju/cU5ek2YVNAQCq9VCTe6mhnkEQl3E3LwlpeUnU6D6vcAuiUB/Ldj9FvNLZEeBgBAIgcAsP4Z9bhYmNma/WNl\u002BXvco60TR8CB6Se5K6h5l/vrl1NdZqEu7YUdcG0D\u002B\u002BbYNBuPK/dmzM2NS0SqnP8mMBgyHCbeYw\u002BMLF4I/GYgrmIhcjKu71GOem9IlHajEP5CYu35Nmdv5oiQJE/OaS8mKv0PtiHuUumtm9oOZKHxbGhuuLc/qcWy5gzAaIguJIKx4L4Uzme/7vPRQnDdGa4U/Uey4rPrijs52dzZA2/epNFY3SwmlZOdsBZiyHljPTGzB\u002BPDSPEl0A5ILJrNTRrQoOpt39DnDKmQInN0KPESPOYfsW1lqLASoRKDCBeDlJrrtWctQI6YLTznvs8L9kNQHGcADNKJjOY1tuor\u002B3WK4EEkPBx\u002BNXFd9evAqUOo/r6FEME8JJ/vBihf97sOTOx8j1rvge7eEpA9c6DAxmhWvWwF1BMcTRXSmi8ELt/gU/cU9zbU9S4Tv8pD1AlrNXX0jlras9rheSBNZNb8eO97COsODVjOr17dHOSiCYoVZLnGx0TLpn\u002BavVBoA03PQpkKjzN871q2A\u002BY4Im8VnpYcT\u002BxjKGNZs/hIraqCNzsX9MGhnmEybOvuQlfkE0azKMLp8pGGwB04rTz8UITWn3\u002BISmvl7oo1lOYlyLzrJhuGueYZrDjmaytRL4P0vL2biSP5eH6eVYwTfN6\u002BKbrqA0OmMEoAQiXV0z\u002BNLpN8vRy8bT\u002BR9LzuJSleeOiPCH48Dpb1vr\u002B6n4YInzVd5X0\u002BfyTNCL5eZCnSX4MFNbG\u002BY46GBwGPCQnnNe1\u002BNwIyG46SuGNIGWURE\u002BMHIenwELzIySF83ZHgmrdDx5r3IKjnQ5CeD08LhJ8pjb8HMPTxKdsAUGipRCeqvTuLluh0jFKCH4dXK6P5Qq//0vpoMTqZpEa3RwxSjSU3/c1PPnfALAaHLjQ1SyWC3eDOzHnuFX4U7dSJuk2EGIqqI\u002B8UaS7Bbhtit6P5amZL8e3DduXwGgxXxfinoIQ5tUoukpQNHRrLX56pdeFwdfAG05MTYJTEOBNprDm5EKdD7l3CYaGSAI52SR2jS9AbfEqHDFUglHFezgS57RIkTwAtA8WoC0\u002BkYbY2zx4lncnWrixeISqhshGV8BRG4escCnOFyxNENKK74JvNVprlGDGp1a9hG0lw5Tv\u002B2nFw8qxbsKgYTD7DFXyiQTWL4EcwEcjcQQCZwxcDQW5p6FRbsb0ka9W6CCdoPfRXdaVfYHt1iqqjiSP9ocRYbn68\u002BjWP7hVlLoec8Vgl\u002B5ZeJhlbBosnru2NzKEsRYpxKXJNztAPYoK3qgUvTGGKatU80J7rFOLXRxIbtRnxJwLe/Tora8OXCShbxJi\u002BHin9Z3h/AMOGDNrghw6aa3bzygRdGzPKxRLSQ04hzcg4G13\u002BV\u002B1twsNwElNPsyFT2VoDhEHxdIUMFXBRHsuurRRPGXtbo7cYb1DNKXifwThAX41dA2vqq6ewgndGw/UvakTOaqMr4voiRE0MevcQ\u002BVMmxDVUtT6HTX3B2eEcwjC6OD90cz8M6WBcJRGw4tLnpDjvDhB1x/LtICSGQZpiNGhyB6y5\u002BmT7HafxQclOWtwnRlV2HMLqN2RItzQelQNzihwlAEyQY5ta9CS5vGnRxfQjmkWB/pPIR7qrqNC4AErEnDF1RGiImDnbMyK6l3naQKG50aza6Xet47b177dO4Eo/UO052CRY102lYCYUM95HgGmXJ3QmmaBHBtAZbW3anmWQGO26HHoJc/T\u002BQQOfz3jPpa2e1e\u002BfpStlsyc9iAZVlI1JBFLGj30duwvKXofMF3wILxHSnHuqdPt0asLo1L7mjE6yX1kLiayMI/GSeHKKZtDhDUKIqISThkxvAZRUTj88LfTVnHqcBqokFHpTuqOxEdhxsChAtdmTyZrmBqjVvC5U0nli/TzpCVh8oXNKNbFlXQSGjPAaMOkphd7Wwzk\u002BKXnie5N5F3ghlDGGfiXJTZ7QyxeBCpYkmSeXtX/x68nQKs\u002B\u002BH1i\u002BbApZEKO1Vl8nPV1rpolPc59M07TF6O2nm9wAjte2SbupLQ9FbcFSWYGGEa0iG0LW3BaK3SKwhC07yNmrGCMme5DditQ3ULMGVJ4ee5ZLm8JYb0cbdfUSbIIpG8toyyTlnPNmDXO44GYUpFvL5PFJx1m0AYS6Y8mWbAqfw44JQ7FNUAsHarDaNVbwhx4hk8g2ZNlQz1vwOOheZlreOAOd9G20qDjDE3gCzpoJHE6yFbpN5uIvq3H9s4fWG/Q5p7PykT2ohsMOW57LtkiZFL0clR0bS8VLNuwb2m0cFgvQNeqDWc387vz3W0n3YpjeNX8J\u002BIlr0jjt/5Y/\u002BuT3hWovUK\u002BbNd\u002Bu8FAW0Ym91Ot//X66JShVJaX9OWT9CuGvShDT7VZzEgdqsStjKY95f1whGZPbzEXedO7LgPYevPHgtX1peZTazbzMVyNAJCjSBvLhvf60nyMEomfz7ZLP9HcwcCp73jH9V3tlFySAk4UCACBQ/\u002B0mxdnMxcXSztz5b9barKFsD\u002BJE9SOp/zJ89qyliky0qbkklV1aI7cM4x3\u002Bo3sW3RYjQSygeK998PMtNhmXD0mDkujVeP5pw9ednzjuaLl3g\u002BvhOBZ\u002B3AOI\u002B1bXdRPeSlWnCdSJFtzCTFr1oMSy/K5yl8o4QkM32tv98lK2PCqmUiIkH/tHYYr0T8YR75JOU96Ug1xOsZ5dIluwdadZVCjBYbs1VEfvY2oqe97CldBFuZzSsbvCG6FBnL0gi6QA47l6FYfxNpksSh\u002BgGRVRT3WIR\u002BzWJuXRQUFBDStxWeASKoT9Qa7rXCPH1iT09mbiuq81hru87UNsz1P0BXFHOTF9LkYu5zEkU0Wyg5C8LYTpxSqLn8j99hvWM3GrRXnf\u002BtNfTllvr80gj\u002BGEVefe0hz/Ah1Lq6l/W39qxj8LgcJHsxTXw5SOEHh6TQ6PucJ9n8bZu52YUvnIVNRkzr7YKpbwIwEFa5XN7iyNZRdhpKfPSn9T32kujYrBh5Sf44gtWXHQSdUVRa8hhrTwCk9Umsvs1m7ZSZiTIxii5EfgKWHG8T0NYeMnq6yX/T5v26CxzhlU8SdSczNTNleRyZyy8kB3qN\u002Bx514F9DbnzYU2GlR0xLmFXha01lKyEGDUlEYKomZKJlpevG1fqYqgUev7ZsAcUYDviEX\u002Bel7nD1t5iFcE7aphFnjvrnUMYRnx4U4KKo9JjyrIuhr9YUGHFGECLIdJGIR51YdTUsuGTnIaPyWcsU77lb7fidCsD\u002BVwBneRpzmEkN6fCVYQGDH2QW68u9d9sOqzBL4i1q6VlmBZWk1M7LZVTzAVuMyZcu9xsD1YgH08fv/gzE4e1\u002BZ8MSJSW8GxDJ6Mwl8bHBiBUe62UC33g9kNF6nwDn35nHUF6\u002BnbkklHbcmq17VfpL1KRv6BrLon29AT927jKbtTIGd5/14DZ8HStAPEeWmqi12Mo4lKidXq8AH2S4rFY4iII5wVnRJGyBoRQb3OeMAO1YgCZXQjvzu5Mi4ZTeCRYzO\u002B3ZsJpdwggM8kq4A7i\u002BeJLc4kOMeG9vYXGxd68LesjniqR7b9v/Q7hTaVO5DhRd56bksYk6A83OKOQwQfjkUMkSGHtt5gJUpkXLUGJA0mYNAqNbhI6NFDYPI17u0xz7DN9B\u002BWVfVFieKo/OX2GzwhFrrHCT2S8ahf4Mp3hwReOsgi8vtuw0uhRs/YyHVlGO6Z3ZcJtRujHu1an33DqHqcMjaN7o\u002Bnj4g9dpmj75ISe54N8I6/Vkp/QLo3Sd\u002B/v4XVf9/YlpS3T0j4RYGLp3cG51nJwbnrNq4dZf\u002BN/\u002B4eXYuEEztbzkuIs7gWwYIDm1lyjRIrSU\u002Bh7ZeeAUYD3x0y/gBtyPLLB0Sa30XFs9616HKRpHBnj6MOFslTWp20ZlWtpsnBbb2WThU2dBLC8W91kqvg8XmeH6NiwhTsKNtYLEiLx3Nut541OqRUKiWJCcPPk36Jvsd3BkvGNW803dR6y207U9MG0datoO8GWbTPav3\u002B3\u002B9MmkQhQhFDvf7y/idj01ugRDUhaq2G6Bua9WuF1iDmmRWkhJhrmZolpPa3i0LJybddk6\u002BUpNp76t1R1Gzm3tAUCsA5KfJmPoliqRJeQQ0mU0m6w3WHJcSoy/UbLMWqIXUsYxCyPnn8rp2Su5fSMNHu8P5LPszxDlK2ACun2pcavdfKdzzV49cFm2m2NSbfbY6kaz835mlaRvrHqn6fbNUuH5g0BHVfT2xuugH2s53f0QET/A0Ol3nHbtKUNdB/yQztPtnyjB7EekzFYBpLxSD8dUIZw5L5lwSSI6Nm3R2tmxkH\u002B4veJ64v8P82eZG/Ghqa/wSbSR4AAP2fk9fO1dbYzOnP2fsPqtmKLerC6q1bcA8nf3CC\u002BQIDifEBZf5QfbMEVnbqPGSSmQamCqLFj//l4onVN1hA3aCgNSAYMfgPad6frkfGpCufjj5\u002BR4R5Jnc3d86YCrnv7AiJz37wV30uu6P6jfC7o28nW/70gvUnlJMbHgeh0udbigbvNq8v8yRf146CUe6zQXm3sRixaOZNH0vAPLtbH7755r\u002BAnhOyNsQD0qi1GqevuijnEh94r31s84q/I4HB7m9wyvMLTnLHHowo2nEy7HQd\u002BVlULWzc9YMrLXfFZB1\u002B3qFBIEOzsP80kSctBgyZhxtiwKOEkmfGV4IVfwdzrMCXCsVXmdwPx0e3IlfmoFwXM7aSQnKOzITOtflI56pNYndy/mTzXSDn\u002BugA\u002BW336XChEAcyjxlwU5NiRRMMCWJR7hYhw6LpI0nkaydXv6PW0SXv\u002B3XK7mnxfA4adaH6qkczMYWh\u002Ba1ctby7lh4KHhmlapjMC3R\u002BDwVFtEW9c6dpz6sI7nvJ7dpg2KDMkqmI78Vkwe9XyIIpKms\u002BgOyNFDX4cNbOA0MpDEluZC8L6\u002BO7CNACiW3gwwfDBcize5oSKXexfXwaEq2sJkJ\u002BBClC/YEPGLrzZsTGgv7Own51vAFOc3yijqXQH9kHFxsZ8sNk29rIClC1QQob/J1nSByxzsisyqcFD1rDsTiiwe7Sbv18mx1qt9OctBz1Ad/YyNBol2g3o\u002B8\u002BjHaKG9AjxoHcFrdH\u002BDBj2Qging10tDCIJfNmaiwD0ywZXA5S4lRIvyJwn6Tw3J/q4R\u002BRPhUI1iW/7MG4DMAY/\u002BN5BklLd7/miz4P4Y3WfqmgXeuCmpxSQfCG/rfv2O3Cw6090MLp9gzBnSpX3ula6/QOkxULJSrYsWf6wyXh9VJxVjx/KMPj4nz84FdLsv9CplUh1VqI5/Wi/\u002B0gCZNO7ynFIcbrreMsQ1yr0aIUEnQ8ktYsukBE6B8GlWnSRpXT9cfDSatmLh7tt92kTrLHF0/vVPxdGYoDihsp1oS//a9da60\u002BMLr4\u002BL\u002BmqnJDP3mZGj4zZSw7ciesF8MQ\u002BlI4QNTZZmMA1I8WkxlS7Fc0ITO2rxbHPcmMMhMV17TnTJ/urqXndilsQuHUGjlsQ6E2vEV7mSW0D2jTEy8arcKXV9MCNFOeCdP\u002Bklq\u002B37R6dxKmOzqJw1M1UfSzPr6N17CNqROmGQgAwrsRI9SNePrIznb0muUyGY2yynp6qspUG2T6qvQ/8NVQgMz33y9ymc2o0OqkfrinXEu31Gl/fX4YLF/XOFYt\u002BaWmppmhH2XkU9\u002BB5/7h6x9BnKiEnONck8cPu6ubfrJ2wMvUTxlJ/jYC\u002ByirrZoqBHGaHpab1bTVg6gf8eE4ue1tmBdt2BsdBH9OECpKOE\u002BcAHgw7fXV60Z/21tafOoTIOr3q9BOEcfn/kNLPSNxI/7jMeSV9zxOu3wL4skG8slsRX1bv61gj9QDZNOZ8ni2by5JDrLAqSFq/s5qFms4oWo\u002BocuNuQc6MudymVO26YahCZEBSvcNcRqmf3NGcTEEB8iojzrVSVx8aXKHyOhI84rxFrQ7b9nf3cZDV/WGt9bnMGat/gGo4sjZbXvhvPegCUqKPPlCCSjLRL1XzQRgGolk32RKhZ4Kd1DWJ\u002BrhP5/sZ/XWWe49zBvRob1Zlsj8haoeEHpnjTsqGEYHJTws9I6yqePTkrCo6vRqky4ylKtWgTpxCMjcp4PHO2cI7xY\u002BcaiEb6BRrQyk72DFvts93us9Y/TZvBrVG5KQrkAfNHUuZdoa0XOpxpWru2A0vsqHr5gOXEUmtd9lhPYI8k39qRYu0tmIJNVPuHKMtD6cHxlwj31JfjqpQoVLTx\u002Be8EB9KeIybMi7qRdaGi8Dows5AKVLDlT6w6vRgLhzgVaVbtyAZanpvOeDFkaVN4F8ab3vL/Q/zwzWflTplYhSGjOkpue/aF580qnCMJe4bIvmvMzVS5eR6DKqVkDADU4ubfSOk6XVE8mGOT/Wbuypvmo7whHpSDqvc3EgJnXn\u002BT0417494uX3sx2/PQyfYFoNk5pBrsY/yj8fYH6mitmtC0Cscwaxe6wjlsPu7JSXmMC33E7lZoXz1NujL1mKvhpCMy7aX\u002Bwuy9RCmY3pZvrOn0RJmCLmDpRMVPnCt6CPg0MzE1bZT7uPh485UFgtSHdHl6svHC8YOwS8djqVoc32I\u002BpWWjFikw8tHHFyvL72iVMYD5Y5FBB3aHIDfpGBpy6zkju3o3FUhrFJLOgGm3Q8j7RcIQ67lzYtKviFaFcPBWdCGoocvCssncjwevoVSWdDl9Pj6AdlBuNSs9d7Eie5GU5Qdogr9fw5Ut3\u002BmBgMZctn5fJBkqmIRcwpNM6xH042uMzuT9aSE1UyBodwysGW2IKn\u002B5nOln9rHU5dDuapXGfiQ6xKHJ4LlhJ2jqQ0PxTNrD3yrK7kOeAHrZq7ySlUIY0mBnDBTebHEISgQ8HPSlQRKehXClMo4coFY4it1y8yHmRGC9DjrXmvxmpeLHChR6bHm3GYkV2LWDtVRlW2Ac9hWQEDmamJH7zgYwvDIo6UK1OCLur1qJWSdeUJ\u002BvryoaH16vUklBZgkCzB3P3/olRmB3zHan1LRYYTTg6MHQNXrK5qx6aaLPv6r3TVOVkuAbAEAOaS4AEo/6IrF08bM\u002Be/G7yvTtIeZ\u002Brhm8S5v9LC/F\u002BC\u002BFw1Jlhy4fSAhDpuy9yT8zNyERm0aSp/WRw\u002BOfVvakAhuqvvHfC3kUbFZAJI7QJIhU\u002BTKWxwxIkBR587Ttf2XzejZz13QG/\u002Bi65BFBIv/xO/4/awmLYNolz/5\u002BuztAf3JxLesibnFV7vq\u002B3P650s79drkq9Pwa8/0cvfn9cfBCyLVdx2eP10vRsMS7t7uXgDAucPh31dFfxvNteDvvaS3H1cpz8N4mbc66Zvzg4ugDFPr4fZ7nHAj8v3i9qti1hBJdZRVtWusrKNET2vrMkqb\u002B6kq6vYy82yYyIFJmDbT7GLbsQW96t2Xz4vgieXW5iPTpSTbl7gYIqc/Riq14Zt7Oa4N\u002B/XMAniBRrZgf/mWeKX98YopIQT5CtiwM3Ih2jsyI8SxyP/jOIm0MQsnsHJeSscb/00JawNkwrla1A5Sb9/4AxGswLo7lE8VpeyCLitc3TexV2Wxj5c1k04bBRoXG7obX/HIT2fYrJ2LHMNsiYdXJ56EhQg6Sq6a3\u002BifdFevcGqEoWF\u002BXo8wHgPe697g/Ekrg/5nJkXeCbJs/66zLpcAtFv0Bw1CuYF9hILkpwYnGyN\u002BS9t7vicdvlfZXMCN3B6e/2K6vh6P\u002BKaBi2f\u002Br\u002BGXRWOVi2PKP11Z837r5j6o9aZuMqcd2982jZ82xHwP06JUT5nevkErt52iuYFa1FCZ5PEf9ctNHU7e8TmdoRd\u002BflKPV6FoXx5vNjdOF8fz9qfhqFM3wDD8F7qud79er3dptOKriYCe9HgC0b57HAEENYFp3HMSbp8JD0xPrn6G9rOt6SYtrKnYl0mPHmBPSZnMUBhlEdgX9wjzdOsgV8H5K4Lo3kcpwhs8Fd3YrdJ8OEb39bbj2CFla9F39f9qiygL/eb4Pt1QPOB4PvD6Mxojvs90QUKSenP1\u002Bt\u002B3w3fddu2S7Kb3R2zNtevz11ivx8doOcX/9oIxnkYgiun6y9/ZjwM8bW81ipBzkudba8PAxQF0vm8IJTHflCa3jr3y7u/5JCXqk3XlYEuTbhgjn4q5EkPZoTf9TAti7bAlOyv832GilBoNQ726soCZTWkmCorCxU10aHmKovweJbV35f1D6Jwnnm2oQXaYpKGMXMukCPU8pKGsn82peR/NnB/NpGM8pL5o382VnTCR\u002Be2YtrpSo8BQqC7E\u002BxRWNyN3XhAkQ4hmKFLFJFAtF2Df9gsg9sRc\u002BfwJoFE24rW5DzSz5rpuJ4MoukJ9cd9z6Mgdzc\u002B4bkquSme52bYb8uiTLBel8qTpBzxcD8IkIYmFjiRX7wbQlEpQkbvnP8g4tv8eWT5RChEfBALDNva6H46dMu\u002BWCorS9iefRDO\u002BIMCNUegU/Fy9oeNbk5kTZzFH5B8YZNnRdAbPs65LbNOKDpT51HfrBzhNUIeb\u002B5kDSn5kGQ\u002BTm1ic72W\u002BSWz/J\u002Bb\u002BSru6EjnMgwevTUwavIeynELSmKRYPFcLf7KiTmFRxosYTje2MnGtrmxbdvGxrZta2M72dg2N7btZGJscnLsc3Fu6pnurnrrq5qef/5u/pFSYlBBUVwMEuPiSJGkDDJZBcsMDNEyi12t0py2pz9\u002BwC4qDrdNyuDc6jqf8tzdTdQQq3lb3zC8Ah\u002BnGPvttsyDP1JZyUTKabb6fI6TdVRw\u002BzALRdb0bJxolGJtdmnd7dx1HGahJtkG8Mgn6tV\u002BuLRTMDOPyKDba5udM9ZV88iAPZeU2xjwAcztEwi8ln6Z5tbGm9YuIE2SxLwIrO8Ogqpqa\u002BQwc4aLhNPv5MpuSAfOqYSAe\u002BcQNwO1P732sqdf4EKfU2SrqFSbXeWRVBSiD2RV47F52mtmezzur6sZS1rc9LnqbNfyRsWfEqOfbywcfQwXl0x/O72/GOS4gFSVjKfAPy2Aw8jKyWQ7APbe5GoPxGut6vJ0dnmN6YLd3UvN4XXucrMFnoDFKAjdXufK6VSzZjmR3u5\u002B2/B\u002BU\u002BPBzXwmeLqWmTM3yygOhfw5KCsUB0XpriWT9Mbi6LpsEZ4XtPnh0M3jMWVfEbp6VIBtI8HRnkHBy15jazCb19vk1f10\u002BYoPt4KY96g3Zf91AuaEqZxeM4y0GE4udXhrPbqt4nXlzDwd82XtQPoQX6JcqmtRTJZHRjxeSQ4pjOX3NeJxTUhv8UgZwjcR2SX9r55HTqtQqfK9d05wbPklnh2n27Gztw\u002BbNyd1S8M9Ybnf4EXBGn/\u002BWtPTRSDPIia7Y4FP\u002BzXHoxtNJXRskZZAfPfusW7dCBWIOEcKJSidigHJqMNEMNAAze8dKhuQ9vItC4zxvpOTkFGGkj8gjY5nDuudtQpAEnYyy/zpnY1k2HYXhThXZBZoMuztAUjU9yYkE1BMnSIVP4VhCa1/fTnEzdpjkyFR83xcmWEQwFJ89brLDuhn2CRcH6jyN2YQ61xKswrdd4J6vrosaKoGb3B6kOqPKq3f8swubm1k346jn/NciuAlJhdIar92v7Ja/2rb7RwbwBjefX8DEHKjIV7zno1WnMvOcZmmP5rqH3du4pMwXad9YwI5L5uOwN6/8ZKOHbHjex3duKSrURBb6UfdE3iODRct4Y2J2dj3wjFDLqMXI\u002B02XsP56otpNlpGT/7HQQf9M\u002BnPuflU94dapxi91giG0bkc6iEUii0SuchqfMcfk0qFZ6ncaJn7Fgpjypz1k2TqtPpFSlOmA1upzHg3j0yqJMVERrKGVEUXktJE0z0\u002B9r5b4PE6QxYJD9Xt5BjdcgnHitm3fPS67LY5mnZUvqVnYnz2nJnr8KlTuW99KmPjYc/qqxthEkkPXIbIRbhxacKUciRv2mOk4WVJDzKfU1lJaUENzYbEAZnNht2pt6rnj4i2g4r\u002BbtTBNPzS\u002BU6cBGSE1qU0UBZCKiOoAySFsMnPOMalNGgWQiYS4thUUoKr8itg0lPyK1cHsMm/8Qw/l8Ly6pQL4ZJJ/xz3dz//1s5rx7h/XiR9zg/Iq9sax6R65RmQ16BCFDIp\u002B4u7BvJsyFhC3DfllKCGvLr/mLm/IMROyKQ7lVn5wfOPWQlCxhTj/xrwzxIwqW45Rj4T/AMzYVAQ/P\u002BMFs72mSWVnPn2mv1WWWI37PNcRL1appcg1ppYCHEgIdKJPEfli25w6a7HtR4YChrANoa0wnPpipeej05TQX6SQIukCJPjq7Wfcy2hqEbTJjwtGMeqFPJUe546kTnGIHeQqMdEYJtWcjJKn17pmHbk/Tk2sEs7cgrXEf2h\u002BGY34JV5ZIqM/wiWc\u002BR\u002BNnBEE3nr5bQrlNLvns1xQzi\u002Bze2b\u002BWQ3D5Xp\u002BHCmIMEbXfMqhQntfpqWy4CkNKIkpaoaz2UKV1D5awB1TFJOOq8SYxC1cJ\u002BShJhenZHSAipSold4MiO9snQnhKqYgNoyBUR8HhazpVRDUV\u002BhvlA/3xS3oLJUA7ouP4TLjBE8rhSTye5zviff9I9xIUwaCvWoxiKTinFojYb86An\u002BkRmk4OisUtBklt9aE9FYpQRU52nA/\u002BjEn2860iMymQDyRw8U1sCEoj9G/cXjn7gH4RkT\u002BYXCtKQ7A0cOEuq7Qq1\u002BmU/yUxzkvGC5RQNL/A1JuUDCUpWVROnjeUWF/6Ms2tAUt/wQ7PK0gMrSg18J8vMO5pRqfzUSNJYcDQMojTiau\u002BFYl5mDnwJThKRa/2YMFcbzSLM/45DlPr3DyS0H/WhIQL9\u002B\u002Bo\u002BhfRrkSE142ps/p/j05v6jd96nt2L1X02C\u002Bp/i/p7lMwBK5DPA4W/GB8C3YkEBfH99ijON632/y8tZklpfoJt5vdQ/w\u002BP\u002BurVhLXYlzycRDbjkcf6twv9jXfS42/fBHV2ZXw5HbTUETZ9SALAbu3bGqtI7LCDHeffA8JLmlEa3FEKbgACT0Yb84dB13oknxN21GvHL1\u002BmN8TftNvjcHSFF5Ig7XqnQHbeV8c0uTv\u002BWIWv0Zm4IRuze79c9i\u002BZon0uXq9fEQR5nzLvduprPA2T9Fqc7\u002BttgarQnkW/kFYsn7Gn4cwF\u002BUGrGDPXUZdmgh8FgsVz3VQ2tws\u002BZbw5XaY4\u002B461GdE8KbsPap\u002BNPMa3bN28ew\u002Btktdffuxf7R9OOwd3T1T8Q8HEMX2/29IUi5My74CkH1GZFYCZHqU/6zMLHd/fRSuiVcU69nChku4N2C6uma\u002BlmYADQzpQOwLRzRcDJ1oqpfWaSbSyIp8gbC3lCqRAyC0Vh3SA6VLNpVHf5crc/5xtT99MTdGGDPQQez49/ReZZe9jnKEeOeNZbCkgLdWue9/nS922WUYUnPIkJ3sxFq3EO8FmWPoWDLx\u002BhJYHh6S6PobAPZnKC8TbJbPcX9gQDyKj0ylpji3v5NE6\u002BqBEN1n3UwVSvZiHdUIT7EKHyHFTCz8hlUL6EtZPJdCoabMEEy9xC4vZ1NYssi\u002BySklA3nr\u002BTPJVE1aaeSqwrU1hRgeH2ZX8TWUbik1mt87mx8brkxNZ802ZQQ4Ptvb/ffp5cweMRPQ7gigEjKkiUu1HG1gvYxcsJbJ3N3PSxx9vodBz5oQdzpBUsKdJYXhrpE4r3mJf0\u002B\u002BP5BvF4mavTkvf89AGBnOTgo8vu8TUn89r6SubtdNMbGrb/o3GJ9ICOuZsvhI0NspsvgdKH0L/dyayv\u002B7BC3C2VmMeTSP8l8LVtK2sKPnRnnyKJqkaK6vrQAZB\u002Bi9jRUyrCrZN\u002BsZfK96F3bVSyFO4tM\u002BRsIu13VV5qCbORtIywE1VYSNB/IhRP8BoRUOhowEYjnnzCTykQ4uhKJACPCi5BjskKWUc3n4UaMaadmSTfF84cLx8SIZjH7MUKXXSazkB5GDqnSnQYi5oud7SEZYWUsYIrixW\u002BzKNqzJa1Uae0dD8NK27Pm1mPZO\u002BTP\u002BI\u002BJqqF2mmqG6pERqS7RQ3IGCLlalxnMKXb9WL3Jdx9U46/nQELI9XUPblDGVdWHPQflvo1oUSDOUUDAc6pOCc9oa3YQoA6QfxcCWMWFdj95gDlNNqaWTbP5k/2Zt/F7qnJx7ufCc6FuIsUr\u002BD79edBhWcHgHdKs4CcGAst0d3qSbr\u002B4iAjO2MHjTIkC/Gnh/vNBVspeD/rzpn3LGcluyXpUtxJYXQSIT5dzc7H\u002BcP5EMFLwU66/opXQLx3LJG/5Y6JJAn3TgXWkUo99L61\u002B4uZurZXhfb5FPz3BINeT9wH8eMjTKMcU9qe0ox1H5HNJ2sUb8xtidSG8WUT2VP2c4iPpPgMG3OseirqmO3Pb\u002BT56EOlNl5\u002BCpyJgiVO8nlIbXn6HSN2KrHZOYAVwuXG/7wqlj6WYtYgBROUU420KI6rDhm1cg8sebOU6vDAjnThgPO8P5EvpBYCi8u02FBLA26nNEDZikY1EpoNFwmN3jDedFr0x7ijHSikldsP21HffhMhwOaoGoEH5R1fAJxR78eTJVoLkqFL0EXP8\u002BEZSMFOCshFCTH16gr\u002BG61yRZDFRqyE7YiH2RMbIKJ8usZZNGGmoPJ0aDOnqwgDnAiF8pfaWWX2FYYEz0i/6RGqho82O/IlbgEpE\u002BXVE0aT2LMTIGvUZ6fjZAcrkVkUG8ZAiaZr7bbpsqBfwKJM67cbDupUxYDw7bpxA7Vf/YGgT0LRBI5Ur5VkbffOiiNX9zuGl6y\u002B68vMYdKTJ0XE9\u002BzNvf2THeboelzMLlNwUZ8rq42YjxDF07T5CJAdiSm/\u002BSGjrhc96jbeC3W2BKpHzcKP/Df/PYV81kiAJUKd5eO9/ZU1u\u002BkF32/NqdL7VSuDECFL1WtAzKb5OQpq66i8dz\u002BcSkbZoYkElVPBhZbmKJlilTHEwln0iBpLMJHvAUd/5rZusYU6yBXulpcYij5ZTL7Hmi2gl1yiru54DgY4l2R\u002BXAqpvmCEKbQD8ckDECHok5bED1zh1Fpi/OOccb5iWQpHGC2a5GO9zGb0S7EoU6xBx3z/NPcdFYSvp7YoM6rLaNGBcqBD7ZGk0QEFrwYVluS7gGKgzc6pJQolnNkMqVcxkg2TEb08ZvBvN4sTYBVR5hyw\u002BojhjYp2Lg8xV8cbzw5KtHDOs40bpweF58Xohy4zjIGXORJPB6wqWcq5ORq53jBepEcRcv07jor8HdNnnM4tQnwwaAleSqTDJ4VukrMKB\u002Btu8TLNmITwDpwS/3JvHc7H\u002BWqFfCTTFfHNRIVcouGhRB0Ry8SCVvcVpVkVKEXKnVxJLNlgixQ02cgcOzSPqkxUmiXDcck80Y/kEr/WcvKdPiupwwpXe69OlGf24Kgc6p2XBmr6j5JV0i\u002BgbtbqaITfAyAFu5IWOMBHepK55I\u002BoBOBz1s0ea02OItngyzjVSuOQlQZnOOAHE6ejqB7ac\u002B8TOu67VT58RiqNwWcL4Qf2Wd5Pa\u002B1jxfRQv8iKdi579sJWJOWII1dO8CWtkWU64fX7X7qLmW5r2JDp\u002Ba15Serza6WqJBBYIvKhNJw2D8JOcuB01AtBi0F4UBcxaOweJosuuqBoQXMMu9Z4FLqWMU3G0vSPShkwQOm\u002B3n480VPRaw4BwE\u002BTTWNuku1dOHW8NrY8iuZvnNzfJjeuWRP4zo2jdrrjjXHXsC9exlcw8\u002BTWwH5POyR1La54HLDIWs0/TygtdpCkTpzuzO5Yld7hn64wfJVfqpQ4HXO4QDVbhsaugiT3D0hNXpWL2YKyPbGme0sifyna61anGNknYAqqkvROCyt2NJMAx4gcXqvcDnAFeXTyhqmO1cBVuJdIsdPCkHX9cuTFwanlen96vpzAX3EVMJwVusHsXrPcbaLtldGRHJJHGuMwlG5i8qYa1x7/uG05JllNhC8Z6BlnZL1RskHNLI2/98oXgoKjuJpQZNX8tQr8a6F74sEb2lewGvCPez3lIfCfuSo8eTNeEzxZoJ7bwCCP1\u002B3tj5vrMfUbeBsoHxOhrReecsC6H17ncflGiRbsKu\u002B7MG5YskndQRGH7ztnwM\u002BedmBk8n7XR66\u002BlcpwgfhmoZNSDEJ3h9yJVba\u002BEw9d37tsjh5zvArk\u002BnjckmZOHcl\u002Bv9Yqugpw9vLYVbyW0ilL\u002BdxIgKsptRjicrR1ydFmRzbw1VQII5pGv3y1PTva0VDgcdfNPRFBlpRJ/hIkHZxYfytuw3Hzgd35FXvvhyu0DXxExDr5JuGaZE2N9N59VJjuJIfMRH0l0Ai973tz3xh4/Hd/iqh9arE8UQtxDUh7aU2Auh6dNWFNOQWG2CG/dQWJuwZ7bHW9rwFzaq5\u002BbWFFpHlec6LiAupanSGkz9ttTu80NDY3Maba/oPqFz1H7as/3icw7kHhuZiSJu7sEyALXzw4joKreb/TcL3R6PVvfbyVLBHiQJxJKrqU\u002B0jFoORHO23xxKs4kovl8OIH9o\u002B\u002BS5m5UhcpY55OZnDpuIUmNrvK9h45fbt6CWvQtR44uGGirpoe5vvg8qDmpqkqrtK4kF9YzlCnEY5qn7N45Drq4sfHafelWEfHOF6mt2FodLCznnmE3UfQ87SHn\u002BYtur6CKgC6Tdh4wwAkXLpZkNKfVItfdBg3vwR3BOkRmPHRB9YxkrmN6rajA5B9TjJ\u002Bd2SGFAk33CZ09tPsk75BML\u002B6rxSsgTYyJ3bi0xiT6SBYkTOHhuQjeO6pjkhzBrgwMffsk6WNbpqjMaH45KiApmFW7RybknkaKX8ur7scpt19U9eZIDkwa740aF97wshgUu1R88BPRXVF8eMnFzrT7nOH/ahiESGoZlAf0emkSuchTlCu\u002Bp7Hot7amxlfHxaCqkYDwXIIkSOTMAmXHUxgfD0IObC\u002B7bkh3cHM5oHOEjfz1QgisGC6WPZQdLr42fhuUKOrd2bLrM6OuEDPraZmyn7PqrPAc5fZwGflaqP891bjU9MHH5\u002Bu3qTy1rcRaH9yWHeFVqF9x8C7fGQbSG3iA9EFvITp6GNe59t1xBbJsehyHrIc7Jn73cNWQrusJGwVT3letnysdNEWARBxO\u002Bl9u01cuszV0yD8yOuj3ejhkDyZTUrjei\u002BklvkwxmSuBYdKhcoLnRhWkA8PE5kFvCac7\u002BIulplsILaeBzIL700ktgHrC\u002By2YF2PYz/KO20lNsHSq1w237zcnWPhj7R5DUan9z32IlZ6EURnJL4S91LsBvSshFjVkviSXqWZBvU0Kooux7eJDiJEMQlui1ESn49oQgnMRSGyy4xBciEvXo/RKWXmvkrqZU3GT6r2lxRGZnaW7i9Bs5lAIBEfe7aQJtYTM98L1kJnvgripATbglUQtdrehSo8IXcJTKeFbWFoM9vsYD\u002BK8Mgof4yseGfIo/TedTi3d2OojJdTuBMuG8joKmzqZf16ajp/jGg6sfGuxpWdqh/Ptn0b5QHnc\u002BLtYzMbnpdxD\u002BrLuDEC8NnuSDDnqzWwPzsn09ViHje7329Fdk\u002BVAXTv7PXrZho56NXQO62ndizFARey8vD23XLfKo3s2dsBiP6dIGaGo60cK78BmDJTq5KGR2\u002BLJ8I15Vf5cmkluo9KC2UcGhtBL/VfHp0Pvjv30Ml2RuZ0wstECFsFrX9A1RHZOUhqX2xtiE1tB\u002Bhxfux\u002BPNQE667uM3Xh07vWXJbd1r9uPg96OsOrZe28Iyv7jfCq/gJSJLtGhFfpyccfV5H\u002B1q5alQu6k41Azn45iLnLAbugRvrFqkDigNfeSBVP5VecqKlomomFk0jD1cxoOI8bVnoc9q/oQMT1UW\u002B435hmkzu3mysCNZeSv6yvKNGxkBQpXUfbrQrtpFPSo9CRafa6F/JqKHVfx8wh5InPTOsIEOzotGKa\u002BNhfpdSp5SJtYbVmKl9PX5KO0ceBPshFJvM6qkYCB4N9l3sp0C3qxizSq5czMF1SUsMNZfQHxcPKiQ4I1nSbbXr692zOrDi0EqemCuSGPE\u002Bf6DvBslZaB0P9xlN1FyvJo4jMeRNFMZvWXiMcnADL9w2eXWBanVamyZoguDYZdL/wpoGtf1QHoCzBXM5V5\u002BsWfmC8a1k43vcfLJhheILcn1tPZPPhmuvMwpt95HFiMfnrZMOl6d9tl0KR1fLKpDOfe1j3YBYM8086htBpl9mH6PTAsRvdyZe4T1HIpgdlGqg5gU5h8ORbZDM70SpFM5\u002BHj/sxi05rZRzBcuSUT2A9vBn3YK3mDNWFVNtW/AzhgcOsHTrWGIFWFzrjKPscr2HUhrh0/azM88TLrWylM3MnTMTA835eI3IFZJBcsoAnteCJTWBsC8oleSg5pYTYbh7g9Lx\u002BnoCJLQu9yfhij7ohWPKkpnyDpyOUzEGWFbXfv8sTp2tX1u\u002BdO5Dwces8ZHW/8N2mn0tZXOE4aHCGV\u002BuWW8uyeVcgPqN4pXeqULBGHn\u002B8tXS/Twv11Op1PLY6LvOev9sfIC7UHMPlpD1Ft7qut4nVlZgeERdUvTJ6kHfG8JF8oFTvkavxLe3LNe3FTh2e3c604zQpPCbKBPsW9S/LZw/BVP7oPAtKFOgAXwR/drS2k8ELiZLkfa3jygzcEFO4bUgPIy/ssC313Y8QyYkUnqFIxRdqlPTnXz2Js6/rzE7gI/Xkifk2FTIZdJ6/gQ5reLUfIyCxdo7DiPRj63Y/TimQpiL9VGiyVollPvTrVtXva4MuCIlH0ZCXY8/yTd/WYWbMSkG5q/ZePtJ7W5DzY7GrJ4RITmj4ui3c7DfEMVn1IkNrsyYoqlBo01qG4yaO4wfV/nuKggJ4hS8V/Ze/9Rm1JqUe29H8l97SrKE7z3aMM/HQfWurILsOv1TQvsWE3h5EWL3TFgU7Q\u002BhX6ajA9p47QLGB3S7JMYA1s4PVmFW8J\u002BAHvOLQNpKB1QxHztBELg3\u002BthGB/MZnGil47cWjfR\u002BWjgrbBEfYEtBrCdN7tuPF1ElfFewc8hdYG/cn7Osp4x9h9B5nl4Z9C7PAYlIXAr39Kr4ZWQbIj\u002B24FMtPabTQvZ3vdhs/kjGssAXtwAMXQgOGx5\u002BDchpuG2pVUSvrKyII0zaAhuB633ANMALWcALMKg4y\u002BFrTp8astT5wab9\u002B9zntOXPlUvWLjl0pDj9\u002BNuaO1kJGaEJDmfljmWByh\u002BP\u002B\u002BicRJX8XJmtkA3loyzOEuL6L2HFJr1pBqiY11/ZdA1I3uriC1FcxZelKNUj/1qiJAkyO7PdlS5RhEyGYGoO6NaFbaxs\u002B/XPiITdtJTPY94tyQ0jT2AY7IYafGrC9zagBqXPOvqM569JXRrU0YNNfKmaiuv2D/w5DME0U4es0HMb/S53oAWYbBy/ZfBZTc32cQrWL1WNB\u002BoqOvNC9xqjry9QdxFXKI0VczTbs\u002B1QiXQvsT\u002BQFOPmTgM7j5QzB9bkLnakfwk3xas6NYtyRkk3xVmVvYK\u002BGLOc3bELFOrjOlpHBOxhZJ4i4Nk1iK5tJe921y9Vxz4MQoEaeoqWEa\u002B5MtOPGuopx\u002Bw4DxPojwQlU0OZENzgu80VkkTh6\u002BMUXxy/sKilPLyyJu2bZH2qHHOtxbZ97kGchd8itwiFXUa2BlttXmI4u1y91CDOqa0Fs67Kt\u002B7DEFMOX8d3wbfKYdWjrZfeqo1u76vl4vQ2y0qlN0RZ2isMvKaoX\u002BkscAwT14Pa94YbOjZGd5hojhJDOlyH9qF6MQNaB7XsnDrPcomW1BczAhRi10\u002BheDvK4BEb1HTDkIf0ijPO97VcVDzWvQpqOTgBG4IGOmCujxuSTBbxrZNkNRuaJPBXEME8fRhRjmrs2PTxeZcot03CRVU8v1RH1/dB2JrH4KEalHRiUUa0mLF7V8Pd3CPFNU/eoXkB1ARtOtMfbXZbn7Kwb7JQTBVrgHp4B7BDGBHc1GwS9mlJvG\u002BbjvGEWo/qJX9EmRqYjBCVmINoUgQGsakQvL3R25TNKUcfGnxQN6zvznd4ikNixpWPF9qbDFxnarRP/sbj04cah7QUPRnWTs/hIb5UqxxlJcpo/qhL6kyrIT1WKsLq0bxQT9FlDa3SxjOqbztKLv7tyWeAfK4v\u002BWl0sI4QRrCneElZgqg4f9C1c\u002BFHFaVSvpRgNmuF14OOLm9NvN092TxbU\u002BiVpHSM7/T2uGR0lk3x6OAU3sJZl4JDS0D0gtTkJW8QrZPFWo4wNEpmG9bxdENX9L5IMM0mev4Tn1tMthwQ0PHTbAUrf48zpUWTvMEU7XxOdzDAcLDI3BzSOm8N2Vbr9iS/QhTnlEuevBe0PrKqxHjKkOuZ5bO4YBtUuQoy0W4bknpvJy1ISRbJEIKX1oEppn9m8Xdd7dVo8fzqkTgRINd7Z5JJSZGpkfUstUHNbTDTEghvmQVqPYzsHZeucWTbjzCkF6aAUQAeyk5QXCVPqn9EH4ygiCSQY3qe773Ua0SsTSiuAdZydmHzaOP5pkGuk2wPpbJUQ8q3W6B1L1dpu\u002BE0niw3aDfJ5I0UwO7PgHnOkwK4NjxDBvZ93RCmAAgwwYpqzWkq0X5aHDCqY7ZAgMGIEC5AuCXSm52Ibm/MI4ga8M/avRxmIxE4KZkODRcUNk1mYB3If1nQuNg\u002BuPm2MQLoDqNONCWIFGVGCuPfhSEfmdOTUwgFsZT1C0y2gqu7Fe63HpfIktiNUcowafzQqQdysqF0/wQBJDIhB3IMZyxMq2fe1a5Em9Iuf6fxUslkcmX3YPKzckoc7/JAAyyRw3hXcn4/JsVCzDj/1Myo5na8dkTsCsvFFsNzypfVB134deWAIkiTDfih0g5Rox1GRxsXF0VR9gViWDhogCMaMlH2B6L2BJ\u002Baso4CUkntIBKBrgsn1qK1oPOyQL4fgUdc9ZBbHXDdMmnSLbxHFnynIudMmUkF7SUk6qncjIGEB\u002B/MN4/x4wXUukO4j2JJxZi0ZMi8VVjVCgbkLMfuE05VrOXJGDVlEWKPYQO6SceD82cjKSIB5eZAZ5BGlPn5EAOp3Q2LCafONHzFP7jKaZ0iAkddh2D/XiA5QJtAP4v4mIYS9r/GnJy4KBj3BIpR7SsXrDROcDaAtIu4LhLuDZJjpZ4fRFP7cYSWindRQbtJZYcj9\u002BEneRgWRESWhQQ0pgliaKdGRObyROb3o0E53qCqxEeIrfOY/7wyNESX/P3fTOs6MVz3a9CQR4A78U3aE\u002BYxu6fGNuaKjmmifsoPOH5XVUZw\u002BAdHsBKc7ARu5NByYQCb13fBLof9TceG25efWKQDP6yv5Pnc0bPS9bhZPonVnu2\u002BRKLkOniw9UVBJXEW3qYGdomejxGGRCgW5E6RREcdPs2oUVkkBywMzKtlRK6tarX8sExZDY9SIlOEHWvJxJ1kjluWtoUsFYftkUrFMH8eELS2jpoZc6HMV7JbZb2fzGxxQcd5B2GYi/8rQREZfOljHdU7YgQ5uG4rxqrD05vgjS5NixeJxVVMTJp3ghMq0k9OWw286DkxltMIsaSeGxWun0q51eLDtb/ULFvU90s1Y/hNL/Sqx3Z5J1IgTTtj0sWujThWGhzLGbR7pZUkndeAc6dJqecjkpm2ch05zRcIJqwldxpnfVf7EupZubseI8ngLB7b5zTbhBAdTuIRf7fkmE6jtr1\u002B85ua\u002BLlushcZsSzS3MC5dJJ1aRTtq3AYtQso4t/CTjU1HifFvoi6lXZm0o0tA/lib9GdtE\u002BR7Fus/BP9C\u002BXUZHJHmjt3\u002BtYFJiXLORAqaKb1akFZgwonVuC29D1jCmjC/V/or84aqWVu/sy3L/hKsBCj/hFMF0ojx7FXM85pEC0ivdPMNoCVLupnKdFO4uCI1XTKdTksiZtRJwhpuwun7uBMz2nzCqqBwYDqdaVvVlNPr3kzucM0C52Gr1B/rMmb4QfNy4u3S\u002Bu8gpnSbtBybjW6837736J6hSgrnNWJ8UL\u002BRvVZPnilrpsnHJJ6VXcXrjefcq4YKkzoUyGYQk9MyE/g0YtOrK\u002BIrp1OPUu4b41N9Tr\u002BTkoedfScxKjT90brakW4qqNRVrgWNhClM26ofxE42tTy0L5f\u002Bk9TSuDgEAgQk49fKYrvw1C/8QnCjfbSdAzjFb/Q0cpKMdmERj7U3Qp0R07QQCa\u002B9hk0ZZs6M0ih3wcji1HH6IBZfEGUJJv1AoDsIR\u002BOItuQTA8bsWK6qdw32Y6pbDYpmFZpIamsbmQb8wXVZ9tBBxz06MCZ3fyQqrmIUKC70gFiAI6sTXACBwBRiyuv7s5Fgqu9jWyrqazyaznn2olGtzLCy1SpzjqWAoT\u002BYt7HX9kyXbpEYYla/KAH8FobUJZKRYHLREA2BG0AFaPxM9cPA1\u002BNoDONtShXCTOpwYtIoed\u002BPsaLUy3FMpEBgPJGVcdS3xQRtHWRMGrQrwdnQhksIktRUgKr8FlWALvhVVYEmexZVe\u002BBGq6vF2eYLe5gu6Uy/C9Dl4OoEqv2VcS35ySCvtWGsNaZDkrPYE99u2weFKUQT1/dvAIWkiTPl9wffjDPWj7ctlfA3cefTpQOjFv/HKjID2WuFfaBApTBjE1rLWYuib96R/3sfWvXorsgDtHm52g4hUiTFVrZ7Etr1a2oF5YyEsQtCq63Dnh8qapK1zSraMf0rFlqd6yHExrla5Edd1sdk2YxjYINLsPHSbwtp1\u002BEyk40XjiQbHLvezQdIVZzOy1n60fflQgzO0Urzor6clB8XcWU4FpbFxPTteYbDbXnDaXXaMmyOXyEEi3iJc\u002BWmIdiKM532uyx\u002B47j8Hkco6nMLEf5z62F5Swtu6WbADoBY7TyjZ6amsufLO7FUS/wBsdf99k1X/S20ATTi4zqEZI/PCtQpca8bAtPwjc02DuODNvbjbKWcvgWVKKUW90bv\u002Bx9DL2/Cv7\u002BpsbPbRz7peTSzIn6Arvrv\u002BNoJ1T3hN8h1zjzp6YRgfExikwz5nt18tLVvL8lFkVrBvC8tqyw85XiOHWB9oE01r\u002B96dN8Vu/0ptdbtFzaS9lMETtlfx86\u002Bzn/NbR37Ub/gwDPNQENtILXbPVVdPvSx3i\u002B\u002B9FRjB3vyR\u002BUr4P\u002Bo/Hxe7B\u002BVW\u002Bd8XNGrVpiEGGhAaTF91NRXlN/wPU4ss75TZ6K39z7R\u002Bw6AoX8QXvjt8n3\u002BJp4QuDLn9p9qBP4qfXzvw6Htkj58Ij0XS2o55qmmsWL7Kaf9uqZ203dr042eE53Gt1b83aplkznoRRM4E2bJS17BlTnBrA/bSz7es1\u002BxSo1S44cDyyETVX04qHNXt3X\u002BVNzPYh5mk2M6nCxCWmsNl6HR0oabK7IG1Om408vjXp2WV0VXJdV480JWGRuCK1rMkbIG4SizWqoCClp4KVH7L6LqpLLqCCyZtV0CA\u002BAcvyhjW51y9hZX4IFcLfjoqrsJJc4Xjvd2w7ok6xFmvhoQ5tML66kyIcrd/Dgu1wCDiMxSNayVDDVEDFbhgndkn5hnv0SNV7epiqRGVip1tg8Uh3VowLN7LTyMwOJc81/nLWu3C30PIYlXL4BxJUCmnuQVNgwKDhtADNcY5a8sMcyvMI1XL2p\u002BzxAxTIYfJECucME5jEsrs1\u002BnJPr5NhmKVQ6/sZuBkTsCpS8j7WhNnHXBvzjglCo/uxV3nqGeKEVB\u002BK9IK5P8ipClAf6fc1OsP6lCDR1kKmftMbRRmFliuERIUrQ\u002BLiIGUE\u002B7N3bdGfhbKXvCGSZVDp2aQDnQitvTst5DjOVCWFvTcIl\u002Bzp4LkYiqh4nDxqclww5gBZK1WT55YVC4aIYPUOFGjDIbJsf0b1MyCu21KAkbtiaz14hL5yEfwRExiu/wuZMUt2\u002BWTLkAiUt7aij8hpMg\u002BimaiiZCoprhHTYACYMUTohcn\u002BCvfrEgrDZJxKh\u002B3oAcrsKJGiheuWqfJmRYPGRfEjbg8J1ILz5NUGYfW9gwDrkSIC7temCSdQEUl/YAMv2CnSBsGE13HSVeyfKKGI6EToQsRGJKCvrzsim8\u002BrOVtcsWpMgVThQQ8eqNewyhA9LRe/ARAw7NpFTnolEON9iCugDnXz85O5WJa3XCekyNHwlAJPNPhbQasBVSmTVgL2B/DIkf2Ry4zZD6PnUAnXoTSoRlfEUGN3cmnIxAXpHm68M5X4WzgNW/\u002B0ZIQI9G5HVGf9LZu3t6jVoq/HycFwKYYUtDNng2p8GHsyydPFGwZXmY1B2Ay4VLIoBWeEY2BsbSDbAUsVAsJh8tK4cglQx\u002BG1CWKAVu1oTSYNUZq7rxkElFtezY1G8LYtX9OURdmvetRKripJANEYztVHffOhdMIWwslQDm1zWyMrVkKhOPhCjBbLxpodQnx\u002BlPnGrlTw7tgNsnB5pxc/ccGd1wQDAqLmQ1k\u002B6\u002BeM89521kD\u002BIXhCQi\u002BCQdWmLwBB2aUpWlC\u002BVGojFYQmzk/efkDcocaR7EuqWMwIITpa9WQoilRXMLH1RFkUFjw0tF0UoynfPSnAoIiWkLcIM/srDAa3LEqKALzR8504pt5KOQwpyzUU5lcTlpdFCs26owvmXFUq2k0dUnCYISBdjSqbWFSCksIKzzh04WixfTJQH78W1f3bEpBFDzAaQjICwdYAsRs0XScglIYU6FmCeKhHyMOsiWPVWqRwoyqQ5nMdpzpMFtxGxpdAYbSJVcIH9s8qwd6487NSIboD\u002B259eL4\u002Bf5wMGR8T9jUn4BlUgVLFg4cnAaMwRYWcxrcA7XbEtbzHd2SpcpS4NYn9OJYTSktuNYjDxcOCQZcDWZmI/bzNKla0A6Yp9AmQUX1GmbLVQql9tUlEk3/tBD6indzdWyarpEJU0/dqZSlGzfkFpjKezdHBRFmwmBKtlHaJYbNTNQZU3JofgVAsnqooyGkFKaitwneJ9PGYaAhC/ZUv5jKFRyAbhlCgYpP3lsI8SQIgxJwRORdLUmpak9rekEcld4UjIfjnITAb0ezbe/2Vpd4bvafe7guoOCRQNkDWawOdJMflB/m0lDqSpO8FkXIq1m2bp1KfjnfOOXmfzflhbtkRY/Ygg05ytJXmIOo74WaLg0p7B3l6PQWl6U4zWkadHSR6PvkN4i0hJpJtmpN3c2lSpiR/wVRBEc\u002Bp9Ai\u002BihFe9JDCXKPipnq/lT1acCka2DgnPmSLqMqDNE\u002BSJQoc5z5gplLHhL3oSaDYqta/JQn/OWCPkirwuzLl/nvuEKNJRqSNxlaeB83je9W3HTd5ffz/8F1JjwRxAD5l9BXArJVIEOG1/zRaiT15S79EwIjYUjS3nC0C/UpNZ0pNecwGbyTUlnQtDViPH7Ac2uAEAF50z\u002B4p9YRbt/ZNHj/YU1bq5QxcD0F1EyB68qi/5iDWGrgeYzPo0NG4MNMmKItJaqyNbm9n863RAxuj\u002BrZJl/drzX3F563qR5spPUaJ3QlkfHXD5Af0C8G85I\u002BBRDUZZUqSUVS7zOwXY2i\u002BRA98j5cR\u002Bhe25GaOFsZH/Nz433WRVIVr4LCREj\u002BBtxuJTJj9HAUkDYTyevybkQPA6vKgsr\u002BwLOHTiSWArXSZVgI6vfWafQj0PKWNOf\u002B4UnI7XUHu\u002BLM5zz1FnU5eeNI85t2qpmmvhgLL6u18OTxNLqZhgfzmR7RZ9/6ZCXOHXuKwbwBT\u002BdORgLaMTb59\u002B6UbeXkEzEe\u002B0MK\u002B27GufYohmQJBuo8g/Q4/PyahqCZhfaH\u002BAU8zVVjDBpNaEVeIxii7th9JaS6LWXk8WPAdile/6lpsBxqvz12X4uBEq5n\u002B\u002BekTPbIcZqxUXYloroQNg6c3V\u002BkmIrDzT8VbuORRp\u002Bn00fA3H4jlyn4Seo04dV76fre4yNu7VrKGTVp91jzIEzuHQABZHP/RXIHJzl03xh\u002BjQQ374C2Yi70PG35ZGZAH9KtaHLHVNo8qXjL0ow\u002BztU5ucntLOMUw3sMPEmaQURpY43m8icH53hj\u002B\u002BvwH5hX/IzwPk1gS9AgRpAV6A\u002BsU1fgdbjzm2ATkIyksB7RJdacIFVYuruNfwUg5ss64GydBaSwfcXEQ3qgYI5iVhNgRMlurl0AbR02ZkW/Oi1Hfj0X39CQ0H8iepvDBznAqQBVIgpjw5kK84EE2dbKqEBZOUkMw5ChWtypgaWRHWlnAFufvHHtj5asX\u002B2NROhhhEGY4Is0qfjNKGuxS3QBrTO7/UA4EMEhHjDr1wP9HmwoPkD5VYZ1Ga3hHEoDsWdD4q7uzuU4i7F3d3dChR3aXD34lLc3d3dIbh9N1z3O3fOzJv8OI/snkzO7k4CNo1MguDPBjkMsYkkbQp\u002BjcROjeAfXWmhKVSQZ\u002B2FBVBTzJmmEwJ9/jQ7yYchBu2htvxyt3qJ16Q0RuDBsh9m5mCyH3o\u002B\u002BukUdCQXS1lu3RrIANIssfrLdIzle8O\u002B38VVHCt7lHaaqC53aw13qeCJ8N/bZRSzGpfrNHYgSJpJyUKX29Wmm16z2ry0fqDvUy5r4fW0xz4XmB2EKCj7bUrKKn1VaF2bJVbZIgJn4quqhKIWQXLUtjxuVRLXDGEPB5JZy0mvnXvhijOte6F2QU5D9pGEd9gD8lXWmCXeFc6VbsXDuYQVun2rJdaOqpZsD93w\u002B93soPd\u002BN9\u002BA7mb5j/MjFatdhvwhw4TshvzlqwZtmOWrAUm8jmufDPk97kjnyejEysM0JmRgDPdwP\u002BqyR97SVKQaY528Vw0aVaCqocfzvWr4cLI3b2ZYky3iU4hXQzRvxrIOP2\u002BmZFFccZuGekI6L1puVpcuwSdRrn7Rsm4zj73jOnfZopfkcoVYdaLKjZFw4vle07Rk5zisWnR7Nqs\u002BaJQXKYRUjfNnaoRMONNqhKCUXe61yPZ6Xp\u002BKlktqhGug1GSDaiOa\u002BPfaKFMvae4L0o/ZMkcqioljVR7koKJbxD\u002BHVj8MCk2r7D20ess2zPCqbq0yofKFVK2y8Nt3Y3Wan8mIyObLXFAOoufh913n6ObLfvbXa5arHykgGrZbDhggn6ThDWRRlKdoK2b0ecJj1lv1emoorrjTouqHYNYHaFQxY9aj/UOIlPOtc98uVyvT\u002BzyT1o2//nOuKANu4fq1T7PIvNS7Kbe9IN0ldX/yheMro7pxtz18f7xgPN9S/yFxuIS0w0OhXwEWuoYApWuvLkq0D5Ew6oT6NZfbHF6OFZuHWglzk5xkbnJUCBA\u002BdSR5P8QrMVYmp0OwsL7lDR/\u002B/h\u002BhFMCGoLe7iy/wO7GZAAoETeWPxjF5XsrHnW8CCL5\u002BH/R2fZu50SQmB4BrrpJJtC\u002BcXGdWhUs31g34iujln4EBV6wRNlPwSmqxHTKRYt6g8TIbxDqSyXyxtSZtQ/3vZyh8WGmZgWgYY76AUZq4pdbe7FPby4kkWy43sjbuT1qwM5xDwXgGXPbpiLHJR5rEt\u002BVZnoVuWHLOkJ/5cAt9zxDHv6F53EkY\u002BQVrUofN/Pg6Qi2MYcgLqkDKi6BUJ081LFriXTWlsM0GS6FpONJj7ZNHsfCVMsipTCC51NUmdHBDEznSIMfTDZgsU640eb1CaxMS17wel6I9/Jq1BhITeAF4zDGhLYq02bUaB6NjJTnjmrlOFKYLi7y/FpfYH8T1uVolyFvS5T0hAzKpw3bpi0GFHXQSCUI1AF1FuM6q4EhGy5RUN1O3DGty0Vyke4ld21rKhicnEWnzVIu/zgpHadkYmas1tKtYt9/s7BRvWF7J9QI9jK1o5NHQoSAz80hqwk\u002BDp/VvBir/akAbawlkYO7bu4HljO8Hr013tjLjic3\u002Bj0eGuQDQozYW9CitbrcyORoe98Ke6luq/9aIoGEust1ulbwYu22axcLhX2d1O1ppIGWRwL15igeT54r7o77OiopXeqld9pQMrzwZ\u002BMDxvCsHew\u002BjdnJXmWM7G1FEN88d5LWgcHA6yf2xzuq0veH0FO\u002BFRTtTlwz9rLKobC\u002Bc0WxYpzPtGGRCea7PmPSgNLKk\u002B7gwqYDWy7A1nGG8UlWnu1/kI/rCl7reUIwRyaQacFB6zFyRRGUyRsHNFphw6kceyrN0RZekh891DQuNmtMrH1kJmYfrm7vxjiWy3IcNs1g1bEDXKHIWK3Nr/zr5\u002BHhlVxXKwBL7b1OajYI/4CuzAKNJjQB0MVIslUC6zkAZBeixyqRCWou0EGcH1wotIaO8Dx/MFqxrSOuPgpX\u002BWw5SfhxpVGAHzd3IcHPPoOXpRJotKHBa9iljnWQ2L7HPcss6j/eeLqcWy72BnsOQZgv\u002BWGw6YxSvmPqgg7gGqVP1BoJGwBoKH0oBS/XTzp/o62LfM4Bgbs1GunWaTs\u002BRz5GlMAxj71qRvcSOSG3DApup2/N1lmGnztUVyYSSuvX\u002BmpVw5NyyHUeXmtKMR4qgVaDe2RXJJU\u002BNz6RmPC1DVzSrTuzAebTSZzlrHDlNl6ylW74MmlHhDdJ05tB6tuIHVF\u002BrizhbRWaSJyK3lKMjT6z5pNU1JW\u002BmpBnw9vFQ90Xhywd44MO0wW89TUxy\u002BXYoyV08c45jq2wQy0qV9BbBQD4PiDj2xMQtUeFiGRiVoUsDwsS09NGvQwZvIdddXngMiQPGzLGUengLowjLCcyVDfnMPS27q902RdHmqqobDmMJVmXTkirUO5ziO2PlDSPyn7Iw1gDpcpR5vJxMWVCWPOvx06P40gnMVQ3OLD0tN5jCcTFNfc7oFaXHsoQejjaqPBE0Ji\u002BWYm3fRl2XSvITcml74o\u002BMVYzxZqSp7LtrN6PbAmlxgZaylKzlsgu9Md699IUJ78KGve/C0iBhN/CtNfw/C8fFgYRLv6XKizQ6fSUclVjnjovyqC9IwJ0viOyUENjGmpH\u002BWVo6cgfcXS51Rlcddr/youOwaT1VmZZWVDw05sFNQut2Ri8\u002B0ngoSRNP/otp57m6QclVQ54INVWXLK1sHe0k\u002BVwZ3Kq7b3OYNilZMjzUpYGpIF0nYKo8BDshLSFbXelXlv25ZHlTjRQGINpjuLYc5VRpKcNo/188741VZ8ae1SZIUxK3LQzknZjFhNVhGycRodFnyAu0cWn7ISYa\u002BYvVyvqVCMTlI9NivgLlJyVRgkifoQ4UlyqMMeTwwsdugxFV6KoFpoLI6dIXs26\u002BLMRX7JdJGJf2YKlFF0xg/ibMOq2QeHxWEKVjcHRw4uXx0ngI87tOQXb5RpK32meDKbU6SeqroSprUSAxUp8NnWzwfM8Q174zzZ61Co3KQtozvnwYuRUlVYj80jJsKnqOMTN9Lff5xPPIXLq\u002BEthHsjPE6Vi8iNKfxkpkISL0rgUSwFv7uY8E/BF90/6zxZXAHc5MPOl5cAV4QO3BAzO7yJChpbHTrv6XFGDfNs29c33B7oz25\u002BifLFKiluSlXPHS0Rjfvi8m4d0\u002Bgcbb/W5yV65NFKN4c85YT6HKZEOsZ5ZOCPFm03/muc0f/FqfORBHqctN9Xhjahbt/Cea7DgQDby5RgOA40dU0WjHtgJYzS/L7vXc9PHbdXtLcg8BbWr/4eyq/lm4T5ElcXNxfu9fPXGCupZXpspkWX\u002BMiEb4PSJDVFBEfyoyCZVPq/Bi8eZcJG7frdT1y4Cr3JUzFUpQacpFW39/Kbs1rE7X28uOenHYbN6blaINYsuXyC2FSZul4ulaeJg1f5\u002BrByb5Onq3UJco6h7Q23Gxx/NxlmEImUy0G1oGx/fNDu4P/jp9qhEk3FnqdBopiVODGcqXMMCrc5HuKyKifhTjSh3/Jn8wnrI5I18lqkR\u002BDL7LmmtgvBc6Qxy99E0uUd1h1eMtcZTA8eUo9WXoaeamuV/BqFBZfCAV0UNiOwHayLoYyOgHn/wy5I67Ra3xKBv/LdOekFDVOXQbslXzR7GvJXaWkZJmYtbO\u002B5wc/gsh5xq/GqgB4R1ct2zaLzKYb5YCFeDb5B6S92Ly6L6\u002BKFnGSrqJWbstnBnrCFi02yXdhbxDoNbClbI5u\u002BIpokJQeqKHH1s5L2F2WZVePt4tXHKXfIvSY1KaYk6cPyGTLizPfYtmT8CwavpBrhbUPQgm6Lhhf6w82DqPrWJPmF18BzVm6YNAXk9T7yAfhtrW1ApobrU2YM1VXdx7ZyDv2KBVeaAz0bNGq12UMLv0R0yNOgjT6vVHzJI0w8XAiHi5BPU92k7inwx6Nq3pl6tdhd7lH0iTaSNsNoxXWjrEt9H7/kb5YeMgTJ6lhGFY/tq3ue0HnGO5O2nTkXzttGLDmjRD0clbvH3KFd/qKys7j3SFLjTv0GofXsgc7vEF3u6HIXxVWwXwbqsjNRbthdGzBnDbiPnNULa4bh/BpgvKu6hPDS837NZ3zcJfqH\u002BpQ\u002B/TggaxbZ\u002BsgUhPsifYdvb4qL1m\u002B5RJeHdvq4CJxI0WCGBarKuQwMcGbFifwrOZxCZauF1WJ04oXZ/CbjWA9ihrgVstGFBOiLea7\u002BNPdtCeWw8KW/TAh9HVV2H1HyXVrIdYZswFnA2d3hT5hItyFOZFyE9yKz4U57gQj6OrZyLvexQPYXwKXwSwUyeCf0Jep1VH8x6y2gzsN4W8S7mhvEt15ODfpF2v6H0V\u002BDiNPGjWfXcFmPi5arb9/TfpH2m8cSVMfh5\u002BXgK1sm/GujJNKIGTX7Cqp8XQt40QIgotLS1yShbcptXyiCqHfliv/PnXRQ/zMl5C1NSp1qaJOUOFMJrL0TiLnS23DHElZdLwKgj0ZCGxnOWow07F1sU0xmhVYpn8PXS44giSQyXfzSZIIrdb7cnVvNg2K89zEUVsgjz5SYP07RUDpGHdts5Fy2LVX05J2J0P2q3dmuhTHESUXrmTTGPOwRS7Zwaj89nMbmOgGBJ57Tt0DX8cC/UIzOGP/vLKqxHsLm/K03WJOrYkg3coBtWUhmqkcwqR\u002BD/CzPoff19qrd1TsyV/puV8EWDGqFfwvhQLz3idJJxivnMWBMq0\u002BRzNO4omdrO\u002B3vZoafAqCJmqGZQYiTetJcJh\u002BI/yHRiDR5Q6I4dH4FdgNXE1uSvorBoYA\u002BNjWiFR7a/NuZo/1V\u002BlJ63AhCt6NN/RiXWN4JqRUgyONI70zdUbdgHTfobhBklQG8wBNCE8bxvSNR0u29qYx2kYGUOPBBk5tegvHS\u002BvAe7NPYP7nxjdYEk296YuHWUtd9gZG5FQ864dXzkwA4CuyqMpjBdqwJuUM\u002BgJs/jYtyO7xMTzQ7vkeNVjK/a67U0PD6NMVT3bX\u002BDjuh2rxvWdI10jPcMprZHWeteObmAQekRIjI35HL4HI/SQvcVtOl6FrZt7UaxryquSHdq2tCHylgjZE\u002BQGkcZ\u002BefnRAa9jSnd6d/X/t1WbtdjAFNbjULnYFMHR/bKC7UF3gYQ7JqNJqk/leGyyQlXraqy0yNkpnP2ae3t9TK8HexJl0HrIekQYjG44S227e\u002BdgUG18eHq20jZt\u002B3sN4IYqepUVn1UvHSVsSj9cX2ec9Rh2nOldelOcGfQDFJXOjt5MPxzOrVia9nUBr/u5ytracAp/b1s1/2P4Qdt7yGQZKW2rhP7\u002BKZI9I/Ql0QttqxxCUT0j9fgaOM9q18v5yttbd25Zy3lRVY0N6AAbdPUeGVloIgrtpAZ0S5ZY\u002BCzTn1sTFnPD\u002BQ/IaO4OaTUOFUa3Qf2OaVfRwnFN\u002BAG/OXwkp06UDf1guLhDm0BN403Dyfosrq4wqVA8nCT\u002BEJP3k2QsRki3BRf8HJNyCtuGviKwg8nS4nNsh8L5c8MA3A87RkrAoDGD9H1kB\u002BA8Q4GZBAEsPA8CHwTS5/lseF\u002BdRYuMO4/UF2QF9Yk4SVb/56cw\u002BKduKm62vtMRQyen1lPX0\u002BmNpSVsEcb8U4QcYpm7kEkk\u002BmfDNcXRG\u002Bi9mmDLQg0wIYKQUnNfqKdpC/STsjXrdoVUsVtl4lrGwJjhAsanaHqIJM3Cph6TBt9Famdp3PpFLx249ljXZtSnnFMnUmfRlaM/sakGB8vIvrPdev\u002BRbewDUUPGmowB\u002BtwXfgBj/DvZMgQWtI8BRnUqic/S6obN/B7EAkFrlJbOk8hRCAReoi8clchRqJj\u002BKe\u002B3tA7A4rfJD97vwZ5\u002B\u002BHOwnPp2jfgh0iqCt5t7cbt5jkeRd5l\u002Bwvo4By\u002BUUvrnnBnPIb\u002BRJGfcNN\u002BETCNAs1G9oioETyNFdCy6YbD6CH\u002BGzwkaxgJDlXSBSycO6HBO7zVtzrCbXjpjijguOj\u002BKPMyLPxo5u7t5eOz4Apv3lbFRn\u002BP53i8ubeTMmmA/PoMEH6P0RADicWjd182k7shM/cjmeDN4vRTmc3H0cVNwBSVets4ZIqwPXR8OpzOrn0tVKrnyc2F3HxjAXIIilGiRyeX7C84Kal/0C85SJ2Z0FNHGyKcvFKbfI2rMrMjEqNMl8D0NNT5lc73iLeBf55grKwoPB\u002BXKQsyVv7Gqg0vTYiR9VSgg\u002BYjwogStgBS9x5k/Vk62m6kmPRzgFp65br2PzXLc9QDmYUbl78uES3DTMxhJwcx2CPvXFVbqO5n8oeQE1rMC9TCs/xpfyUwNCVa\u002BjPy1s2xbyI4DiID7\u002BlWnK4cVQ0gwFRH5yWBXPAEH7wbyr0tUVdD85Gb2FrJdA\u002BVG1Ojxs/JF5m80mWoWF8QaJiqHY6a\u002BpHnEUbLFzqEQh7AJXcKCUW3m6KJBvv5/XcXHsDY55S2\u002BAPWRQF9zul\u002BkLqaqzNs/ZXgfO0uNxP5ioaf4v1qgnZsDWdAhfLeAVMJaFoVTpBrvu4mJnseZ8RgS5cvE8Ns8LjyAWA4G9pXpOlcaEekJ/K8rp5T4Z8FvJ08BeozoTzk1L6GzaaoDMTM00oKXNI9TGWMvIhKCOOpXJ4jQkygUQUG\u002BOB5T5KEwr2B/Xkwer/YpyxtX0tpFt\u002BeyT\u002BobAsCD/OJQWXIHAN4Tgi/PLEIpUxdNsYw1G2up7fVZOAmrxDYKKwftAv9qbO4vXPrXotRmy7S1YzOi1UiKe8BLuJ2CUxXiC4TLvc5vneemDurjDudaKUqWKTF\u002Bz77ZeT/8tM5exKFNm/kc68BJg6Y0RHpCSWExf6/fWMlYsyE75PDZ\u002BOgd661CHTyppmpJBpVXGy8arHFm26Becl9PWH7TCoYaqIkasWotBGfAljyJajgoLO7HvtXjWslVrMT4Y69rLjg\u002BhiYEdbkF1yb46\u002By4fTiqOjBjbU60MSgpA0N0ErUtHnvXFFIELq8GqogUhkDlBc\u002BQU5uRp8fWJ6gWBU/kUrEAVcSLpSUaNWpmiqFOrqxvrfbWlDHjafoCQghuP8f03XbwlEagFyTzJiBXMjzszLTxGLG14MIrEPVPynV2IOVMP6dw1Mg\u002Bb9fGI9fqP2Fr2P\u002BMFRENB4Xsk2zRsW4re1AVuuYpMhBEl7CbJ0MafOcsik\u002BKQ0lA8FvvbY8hv3q\u002Bw8W3GEgQugvqH9C8ItbJrY8UWaNqi/Q\u002BGyjBqD4qLCJ0DHBxyJLgSAgBa2UptPoUtV5JqOwbbnZVxEXGm0UDO1f3u4p\u002Bb0cmvw\u002BsPFehVBUZXb\u002BE1Y3wZ35/PmZsfDQbuvhF6bf4ODagzHP3sjN3dZQavZP6ynu7SE6nC8P8Sywd/KMQRyu7TbH6q7vQvoY\u002BrzwsUyzJbn38utTZhMjcJD0KnB\u002BfHhEFP/4kLr2I3ufurlwAQVUXk4gezXOPSVc5BkeurCAVck4021cgpBkycgrmzepmsfDQNPR3vKb8k2wC9sF5BQtOwOV8xrHw9lrcg38yPJuAxEEGWxyKeYW9pXm4JHQWsUUn6ZTHWXM1R5ZZJoKT1IEPN3ZyRc60rdBBxRehgPHWPCA4Peahd9Q4pwUP8aTWVvgBagw8j\u002BC0v2gucFm0zYZngqv3JHb82TGcU1u0YM1/XJtYHTrLLTULxaxE6MDIuUN65tF/Hv7gKsxdZfIxDoYAPWtBTcd8xkOiDzolw4avpCn2T3IJPopq9dBCB4Tnqf8I7VMO/Rs0ecACBPUgCHNeT7nmWsKjOYNxXm9BRTxs4wXZUwoYHzj0TigEgldg0ugiXRUDgGRIXOQ8VRUm84VAi1j47\u002BPPSiN0fzaqfgaR5SZ5AKlFM/mIk2U37SwAqBfR7CYlwnT2zQd/ljjw8xAEzv4SILw/Y\u002BHw4\u002BcjFNTveHHcv48qZXfjJv3d\u002B9XXm\u002Bdl53nr1m/cJp8YaWxd\u002B8Y9uLvrvhSOV9Y3Ha1BL4MGuC7HcpjbpEPMo0S/EBnKN\u002BjiyGd0MrO14NDy\u002BFy9ZvymAwR2J9rUGPHL\u002Bn6zZTlVmBejbfklRs5q8MheR6HUbLjlOX6L2Ryvg244GNPeAXyle2T\u002BWS2\u002B1i1RoBiIIhOkodrVhDd9jdAH7jjT90Of/mLhm81PR4As6KpsBV2VnbJHoVDtN9/puhY6yKQfdMc4V3Rf/Z1agdQQTDaaYF1Zaq5udcvWJyVgWUnNUAZTknud9q2TypSIMwh84KEzexu2KZxue9oH6XkpAXEIPYl6VExyR2FgPYm2UkxyF4PooWe88cFba451lqowdq4C4jiF9Ahfm1aGbdUiTXhmJNT20UPFiZMge84g6LOY5BhHIXDGH\u002B4s65vUTkUYOa9r5physOPxKG5EFXuCbc0tU1fjKvAazqXQQ9UXVsaOcw4L8Vx4ymDkJJESkqGZVi1M3Nwy5nJ32XzU9lWQZAVoYENXQjB5DFL1FMCZMhl\u002Bv3WsX0uK\u002BA7ySknfDPIZAtEDSgHoTShUDygFBosdZIo469YprbY453xnvLh/MjszjFU2Vr8NEcZA6/ShJzdmOGDrLuBQHqeQOBgGsWjk1/o6nfq3xi8FhPYGqaCKIZT6FfVr6jTSh9AjQs3uah/JeKa2tYqqxpHcDMvZkoHckq73xPZkqTUsrW/YHFMV1rGkMNE9FRPg2BIbnwZv8XYyoYRiq5\u002Bs2TwJr0yN8EPo4BTeiAQYyAhC4RQ6iwYaeEomM1lvxJEj2pmakZxT/J5VZEUB2fPTBBzRTWupx7qu9WK82VkzTRYHy0cFHfHk3pS5wXiNN2htFTkrk/azejOBzvWXmbI6m8szd6V69jCxnIMc6nJAozQ89KFNov99u01851q1qiz5BScD8yLR69ePIzHmce5eKS84368sLZBw\u002BVdFbHtD5cjXPHtdfn8pt54JiIxpRZ5vyCy\u002B8tiCyYJ1oFdzXrTEkJ\u002BvTi09YhDB3qIz5fsR5hL4NPelmqEiNvvNCG86AhrXkOtaI0OP/qVokxT59161oVDmG2\u002BrEYUodDVzlqFdoSOdTSFqY\u002BXU2qPju/M2irGw8Xw\u002BTS5cNpk4eZgx9N4E4TLyR\u002BPVygL/Yxt1JRFursxjEbExV6c\u002BW8pBqvdlhwXOImOsO6\u002B\u002Bgt9ny7ERnPgcdOJN3VcAses6BMPyUh5GX\u002BypJ/ghEcYfAK\u002BsYJMSWWYV8mV/X6hYd3KDqkRF2K8ucRjqtWIaHi21wUrbDVClKy28Bxj1hxSu174wXbEVnmOXgSsF4yKDUo2KBBP\u002BVMeAsuKxdz29Xn2uoNDMKNyNraJDI2SbYksSNOG5GCijv1uAqhL1GyOqSkBHjtZ6xf5eXEz6u6C76NwG1RGSKkiQUwUkuK6Q1mD1HFr6J8GvUSDBrLPzxturQ4kPwpgQZsGAb/ZoJMVi8yY\u002B9RkV2PsGa3v4NAd9\u002BVDrCswlYM26tQGIgicGCDQ\u002BzZUiCszDLsIKIdTFpq17DfFlpY/GtsjBdUqv0fHysrecstyMcxs00gq4jVZepiA9RWF23yNG7MBjV7dG2hGLu2j0QBqwcThhzJ3fhBQiykeeDFqXKkZ7WkSF9zroAJ1H1BSYJI2yHLFbZvzWwgWMbRpwNBJb4nClTNBzPdYdWsnSYe8BfmUsRsQrgKMJMv0QOAxQjQew2C4oKdw20FIXE2A4OJMUu96v9FV6DbgvUJEWQ2xGoaowM0BAJY22jC6s2LjBlLCW82KonCO0XUNjpsDHrnzCH7ysI2oATKdM0kNh5gUzQKmmBh6bPlen2rX6sHDCegmbTFKJK\u002BCyyaKqwFTEQyU5tCYHljb\u002BMZkEVaBk6v74pHr//apSUUQhpBOXtPg3HSg4mjiXJTo34GfuD\u002B0GazkAR/3SDMbiJhX/VYYlodAft0LQSW\u002BXGDujKsPUFH6w0kb8TpG2dFTi8TgccnGfQj9/zI8wGMlPNZ5rMNFhsdRWKuSiEvRt49OUZ/nuuWzA80nOkDhX3yRjHtKeDhP/42kC4iKSlvYtmLbx\u002BVypb7rAQpQ/NdOrb/TF7B0sq2I0ocOaJbk4LcHvL/UBHW1Bp8ePqW2oOscddOJt\u002BbTOm1t4ceopEp21mSPGcQ3tueKBWPIjiWmrYQ709sQwLGZwHwYz0VjN5G2zhM7lhutieT8KDUvY3LegmH\u002BtmXmK44eslJt/iBP86FYed1PtjnizAB8r/FHXeneyMF0UeNpBspjsNESgj/V5tp/bg\u002B2VXUqcKNoBCf3aHA5\u002BMA8NaC7PgC9C9BnEK/mxc7g/iciFeLLTsOiWLAZGJ638iiyG4lyDzMLwCuewCpMkhqJlcTDvM3vM/hK7QzX9QTx3B196cbTTtTk/LBe07S9RIiRhcA82Q6KxIUKnwTxpD6xrcwiNpaahknNIPI3Tn767U/60Ceygl15Cq3J6mWnmSX1aIaLPzjVxkhmWRGN1K8IG2uOfnLw92BTxD3anblKysTzY\u002BguKBvNIqUhiJMbympu0MDzYqCdAlsFo8bEf5nyEICOz5mP48OxNavtj\u002BNKbjKLzI/qMAL/U/PnSDw3JYjjm\u002BNLNUkR6GjJl9x\u002BuzXM5xofyji5aGK7No1or4yRFFYSIolMlnRzz2K7NlbJD\u002BNLB1DjObSqe/WGweCuIPdg2h42jQS8OA3jSHyMHhPwqwDzYpvokiGxKPX5u2RVIEiF5sMU1vFY7yBOdMbgErPMt7z157E6hYvB9gHeDhIFWW4n3\u002BDlm3aq9QNb9ST5/YjH842De457mYN6HryY7Led/OUfJP52j5Ps5stX86Rwl389xqjBd0ivVxvV\u002BzUyz5SfktfnUnwOxTZB8Hrm6qflybT4cyZPwa3N1Is1O1ymWc8ShJfQqeiUPaFKuR6wrfm/ZZp/qfOJhnh55PxHM8myUHOWx0d7uSx5s5efJR\u002BT3hefxsSjlldju4pdAJj/T0aO9qT1K0U7H04jNm\u002Bb188UQsasv8CpRwOXt6vjB\u002BVRDII9Er3NeKEHDlZb28sS0PWtjI5EzXiV7RynCFVCeRDtDPm75w7FNLtH/pTMTn8XNKFZnIv7HNhprrIquxZoUqeykEDaKTM91dmsjqxR2kxf\u002BYvYb9EAafsrVHkqWomAo7z0Hgjd2Rn8T2npBgDzuHmSmG3P\u002Bga6sIM18JKgAOEvihJqfynYQJZkUeEX4rsxZiVjisWFiAie/tkI3qWeNtyPhlQLDY/ITxX69bzLbzWO/2JwRdBn/VF83UpL06uenEHq\u002BYdTA6NBbbNr3SUnKUXjoMA24M5zBaW5wMwckzN9tjbVmNpjpXrHSLP9JcC75xHyiuAHx55ffA2\u002B1KvV8K/4IbEs9scIyZ\u002BSIjvtV9o701SdebxvJ4S9DfWwyZ3x8l5wPLsvjz6Mg\u002BLPVb2KzbRe1LFBF5zZ/BDrktctCZrEsw3JdGJpP0KZw/UUxifYYpKgD/q64MxudZ81\u002B0VqO2FXilQG9HPnZaNX8YlqoKOoOfLwVZxn4rSXq211ujIyI1\u002BsdX39l2\u002Brwak4rZHBEgNINH9uekL1dAiQB4lOCI1yTX1dq\u002BcHNxQjkGBDx5GjD5CrslBXrcwnDdzQ3RSz36oyNGisutu/8ZgFAq4ESM/gf8TBGtClK5enEBay9Re0SDaE19\u002BdpH7WaY8d0zZdhu/ylxtZKteSKbHizUBYodelVPa1ngE8HT5fl15puEj7T/GoT8XMHWmpLqZkc2QiZHKHTEXfhdfzjzTxE0rmcZJn9yFJXi\u002BPMbDGZTsK3cCt8krc45YTOEwruYHs7edcOftcbTmesL1DCr\u002BQ7P1UE\u002BavcoEoZhV7FtK\u002B7iM50CLEppzLRSpWh8n2tD3COJcebSZx0BgmCxANHcWkuRffdcSEyU/iudPYRBYVjuYe46E2\u002Bd5zKkTrhmJiROOVWuIhKHXOXJgiP7CPrJ1Pmp/AlOyGmkR3oqBEQHZttpvC9WsHesmIQCb26P8YPeHyg2tC/RhQQVhAEEc3FdCCq5/jimDQBfHMrXsUXh8\u002BKbVEj9qMUCunyRflBRLcgIgXBbo4JRUGYv/KU\u002BGam9AJ1X/\u002BOhs7gneZDDogmxDzGtfK4OM58HM4EH1JJsOHfszwU\u002B66mwN3qvCIK/pVFzuqdReudBcnqnUUm/p3F\u002Bn\u002BwyN39lcVrdsLOjlF/A8WsBvh05YolbDe8bfvLZ0Pw0zBZ0TTGWoLdqgvAq00JrW63CHfzRByJNUO/gOMLBNqJgBReTws2fGP1eT5aZ\u002BhRKKmzFsXr7eXZ2es1H4Hu7\u002Bzaw5XPNHgGdMT6vN\u002BRXLwgonxV8ojh6/E9MhCRrPZWpQ0dCVIAqfczKwfQLBMnSSwfU9009j\u002BrL\u002BPh1859Hy3srXS8Kt28kRK2imKeGMABkgT/Kip26nqGPuYRBSPv5/6ltV6lrUKX0OFoLwwq/nFAxX\u002Bs8FEoOdQpbyCG/6P27U7/S5jIggT/uuVvdsu5YKFE/jmiBCoTRg\u002BqCR75YBzjxaLYcMMtA/QBnVQ\u002BiAGxqQeurW3NtPrRc4ZfLYp0NgE3IuDIoDp9E\u002BAsig53RyhM0vlS8eRg9Ca6ZZUXb4OpH5m7mYABx3QDhkgIkdOC219l2W90ZoNvMpuDAGXSt5ks9BUDKVRIatSpQ4u\u002BknONuZqPa2CcDs2T1CQZ7lWBRRbUA9mhlvMGCv3ZLKxXkALjnVbfQm7mHdsGSefkK6czXLAlw1pV4C\u002BjdmGcPxErroGIZ\u002BdCQMRAz\u002Bbl8\u002BEU9XocDQh6bC6qdgX/oGkUcC6qtVioQB9JVDgmvzLf1dTfvxYhH98qlD1oqWRm5wv558B\u002BPUSFe5vvJZQliWI5noQOrD23liVhkpkQISHfb/5jB2ST/GnSMSAI1AFxgWamIFokaZJFN6gAMGDj8UD0I0pIVXR8jqo3/TeWL0ogp5BMznBQfiP93\u002BslHRMVwxhQEws0tSG2GFBYUOHEQn82aV3YzqAsMzNB46P997yWmmLqKxenlv/VpZoaIbV/NOvxV2iRiyPj/pxdb85pMaiuJJpDXaIvxGlev5B/k8lyPYlEQFx21iLjbTKMZ\u002B8pfpkTWqXbLrBzV224sSmKN\u002BI38nBhNrhUY6kgcK54aaURsjd8lmo4YK1p/uLLppjzlBG8RBh/MWkq3ePs47W\u002BALnV7y91FLLWm6RO70zKVZwF2z1W/WLtcEGU90IXTBBM0LY2u0Jvz9SJDoh1VIpEoYb1C0nFN7YkPYgy\u002B\u002BCI7IgMNYHNvfA7jzxAg2mXYPev2wMrYp1A27lB2zP/Zbv2cnOsU9T0eKxTrNOlq7JdY2cX2MiJyLg0vcAuwQumo21sSUgma/anQe5BblQ\u002B/V0dO9JzkXFmeAfRceHxrpXP7WsQsJB0oYjclPUPIAb1wWbhQizHcfdkkgOSA6FL7zindpMZBO4BqgxkblhuWDvOW1cEAsRqZ/bdzNlt0fEufdIDmDStQe4dzcDMoEzILqD4\u002BC1WM\u002BMuQd4g/98HIbLzH4Kw8\u002BZ283688uYyuS7Tnbi2m3jeOUnZSKhittRY39WPViwoeL7mxfKtl/V17vd\u002BVCUKf7ooQbuQMZvazpo79dvswNNjl7ELqUJe1t4/Jp9a7zpj6JpVm7dIr40YcTli75RDc6C5Gwl3Be4WpXKQZf8kU/seu\u002BlyPSEbOugaXU0jNn0SuLarn4UuxuA69GWmpo4XioHYFFt0beLQ32RlhAmtYeTNysChPAdNdBtsaqOVGQbvLkk6OKcttnNXQqfPuGU/lYE6lmjBy\u002BdbkPH3SQY\u002B5T24G0NWzkd1yG04uRu\u002Bqsu3AdBE1LftbIEQEgLwuvNI\u002BPy04a2B3EhmN4g0NukVxF/lQaTvqktrYY9/j0sHm2nwBdngzOhO9TKXuOLX0C8ewssWMSRwnWoL\u002BKGyYTuKH22lj67Po6pzjUcH5bbXVf1nKxetjQsxytenf5w1Gg/5/sOs8TKs7hffv84aLSEfB8p2ZpjxB5if3cYl5X/vQDT0XYrapKVvuEI9QpIinGLb7cPnNtt33LPcTPJ6JY5JCZM\u002BUuAnF6tuy7MiX6hc\u002BopBWrV2\u002BSjql4yMiOyYSCPJyyvAjXc5JPv6\u002BnDn\u002BODK5duWVcl5Fq3hce4O3Ls8W9m6ImA4aq1JHnnh5Bgw/3nu5OklIKC6agaaaWnlFB\u002BjZiEYxSLL8zQ5ewnyCu58krr2qLY8\u002BR00yhoq2vJ4qz/8/fas/sHxCfrs7VfM/eOC2bA6brLep26V\u002BJL0ZEfFoAysGQzpi3yLYu38eec0dhbGb5OZ4Z027JWem7WZCZ2FMzjZ3AlKYXepBzOZpqr6FFpIkbYLOWMFb1A9o9lxsQd8MpD7U/t3\u002B6NYNoUXk/kz\u002B6X0JSzzS3w6p2TP\u002BrCIK6vWkKbeoh75OAQB0rVUrp0qSqac2RF9Con2nR9XYM4Hu4lQuFe0sbQHpTcauegck/1qiFyJJTv7c4g4maZS9sAoaCgK39ZLZF1VeRQ9aWLkMgTMPC6FNrn9\u002BHxX1Q6ULrm7mDuZJbZwJopmrmryqoUkGOcPAG5v7Qkpmo9\u002BqYtPqk/XjUZP8d4To52LSHiDhS0NUOne/m8hLjaqtw8bm/xzNmj9MLIOwONR6BelaLw9D2aOzaE60iyo9I\u002BXoyrrv7l0PAnoZVMSry9JW/0Q82fMAkKojAna5pTSrPkIq4Y12wJK0Yksy31owLQz9pVF/fae3b9FUBynk3K29gY2GUgqVGB\u002BKDHiRxyAr933YihEk4VxnyAm/l2hna3pMiZuA0eDXuWN2JBPvH3LBjE9b05mmy0C1YM3q9yv1e41EcY80RXXUXuBPog\u002BOv6bD93Ctfcy0GJfvtVk6ib9Qh4rYLkP/hhOjFF9MwaiYUOGH6v65t4ujFZ0yO7rNwd7qw7HG2xlCqYr1rdeSfK3iv61SjbBEEXR\u002BuP71qxWboESfQnKX7/fPfLdrZiXkTu8Ecu5KtpOkRyp1RESSSBNOls9\u002BtgUuLEjqwRR6z7so1ybaGzhx9bdjc5TxWJd7H5ArTG/bhPpz/dr5otIOXcmUe3w6wArIWYESPqEeO9fAS15I1TvFi2KDJ7yjYwGpz9dhIAJiPD0GJY9senhQUrgMOV6R7sHoIVRxkQ5Jx\u002BfN1q6zx7SJVQlnGeXcQBmNCk2KI/KV1sd8Wshp1aWg\u002BAO6WDAJK4cq93gK66qzCTmKPxsWHK6Lt4IjfhvPOQF6KPkoZd7Zrf2VpcOTt7yh/B9O9q\u002B68VVCFbp1qex36NXRVwEMquY9yntQeZetz3JpeoqXqjf1GFhiH42QVxxoeTB1l1AkXOm6UURbuRuoE\u002Bk\u002BaH8hOp8xp1QhO4\u002BbmEL7NcsfdlB9iwaMi26sd01bkBsHymUtEARJVBLP2VYquoTkUdIp4oqMDBlR0am\u002BdjYjihsUlk2gQOfJN2Q4z/sPxyujDuGn5Q43MSdWqD54xivrFjuCZsijUbXN99vJWOoseQCHpGjPc2b3wsb6GYJmZblMK0DCC\u002BMFcQR38URZDEExG196UscgdBj18Vnc1QQKeAzS/1IE3aAWJ/5YXE95Axi3NBd36lzPZfA9aMvBdMpKQtW9Izvb63CfMF4EpM2G2q6KC03z6VhSC1H\u002Bqn2LnvJwZZIut3J8DPobRJICg0qKr\u002B\u002BoJeZ4sOOgVXgASTo7PGGKgLKqSZKCAmDpD59xsMB7y0SvRrq/0N7V/0WVRqFh\u002B4Y6ViHVnSAkZJGWGnplEZyRJghpQWVFBdBeinpRrpzhkZBukO6ke7Z2WTd1b9g973P3Gfmmec933fvPefc9/z0brejmyaiO6zyaAQhsVlO1LwnOdaISjYnH5m\u002BpVGsunn5dJH01HHIw7cvBQfKVlahk2xpvDeaOHu7aTcXO/dnTwmHSkTPhNihuzl9greFuBjoslpSTkVGa8qq0ZVGrTYn\u002BWJpMXehGCX4dN1ZeWf0WaLem9QxwNymMYrjUHCTNv/zwaUc403W5fowGA/Ka0Yyp\u002B4o5ogPlVaz5bJV81jyIpznwn3S\u002BoUI6sPlRDvznYQFheSwomW85BlK1HKjZDJZOV1n4/T2potT/aoRh4tHGqpW5OE0yk75URqqW5/n7kVNS/tZQ\u002BE\u002BvEY59ydBdtnVs0WxiqBHKLutT2pLCm2rzIpymI8fW1J9ZhQUl85xXc4CdoWJ8Jn6rLJYKAHr00QU3ugW4BDsqr3wsEBk4rkMSSzyZ3saH/jLiY61z8XVDWSj3n/Jbk/\u002BnAcyEsV6awEq7iWQMpCwyTuUzpSaCCOiiXXQ5bBXkcBJ4H\u002B6mt4fGrfMJEb00nqLBbtQtU0fg0TjvS6TNEB9c/0BBnIuU4UCkXyPKr9zngYrDjMnkpgAQJBCK/jlOQBTfIcqact5xxnPbRc7KfM4ns1LHSlznePntjNqzzQsX86NZl2AwQoAjEe9rdgImGJqyMXVjNVsAPP6R2blDKcvOe7ucAqGzynNBavgjLZ6i7jh1Fb1FjA3iTMAtQNY3wQCFburPw27z8dw28LcpYPVyhVEX\u002Bvmq4i/PuwSzV2A1ZWahRGpBppc09OT3J6ZaK/XVOvYmeNRsGBFID6wS\u002BA6NkHRuiSCTKIBZByhcaczy\u002BQoDHW6fDaxvD6g/SVvpiHZmudEGnQe9FRGWEJmKxQ\u002BHjJJswqnLr3bXWqInI48frxdGRizPL9qXiRychCzx2OUdK7IGgF1wFVs60hviYjfgRCBtRmY1Bu6R1xevpKO5o8hXL67Mj5ruPD0FuGQTY5GkcRnyDviB\u002Bfld3FLsm6\u002Bgul9AGzhdkjaN9ev0VoSHpGGqefOSjxLF5nks6VXNLf6UI5PEHBcIcJjbxumX2QXf47a1aZQi6BZ41B/99jYBBz\u002BeuKeQko6Ibv2soZm5P654ZpQLWNsLaUz\u002BUar5/MFKaIK30TcHzEcQ/f6SfPi0wmbP7KEVuayZkDrDublOQUzWhm3/LUNmMwKBNezZHlvjXS31h0NPCk5yyPFztzaPvG7R6EgvLjmdFktgZ9o/3k42\u002BMTVapWYEs/\u002BeKOmp4I76Ftf8eLWCPixzMfIiv2ZLBeBv1o3MbMvU4iQrXhHWovYjT/eN846y3hZu68BtQGdFIV6WUzYi81hzzcnVj4AZI/a\u002BzjfS9gzUSLJ1C8/sMdsEqXIznkhKlNfLG7Az5BevQDfDSUM843nPbtGr5eVyzjdYwXtBUdKySO9xIigkCbssNrjG4qSRuJ1U676lnXJwnQR7ACZSQFDeRpbobbWwK6eNELt2dnrmKJP8GKzno6x89XYcuSwoaXbHvidQfOneHwGNXTbfmPYiOZ\u002BZ1Vuzk8HHZB5DsTXxbb9\u002Bb2Qbl8MWPb3o2w3ptmbT32IoIoKaTc\u002BzGkmarxSwiXs65uYmWX0VRrcF73szFMX4d0uU4Bw5ZZfS/VjaHGSLdlh8Mmjs0DJsfLHBHr6BdJS\u002B7FvEmtvEbOPiki0Oi9F7Qf4/29D5kNoGH\u002BbsrZ0iEMpzOre/PH\u002BYNzySaSk2s7zha5d\u002BMEGBY4H1JXIv3kztxJvlio7eFIp47i3FIZrpJYqQv5\u002BJbubKFSqF1XN2MuALq2QTRA4q/Vd7/8wf0Itoz7XV6WssGMOkHXujWIXSOD5FqbMgeNBTN2gQOpMs/WyDCCmSYjRyNdJZppm2jZ6BDzE93tcxlGB\u002BJpxI03hvLqZ4mGhya6hSt52o19YjRM6s8F35l6nFhq4OwvjXApxesWKGfLngxcggKLcsFTJ7rcms4K/Meb7YslfpLPLqFJKrKCKVmoKZqZFUFkZW/YwNw8b9atz2N2QRUzBQypm5W2ATZniwHM/Q3GtKlTIy6G9cTDHOuxXge7r79EXEKdYlRufXhAZtMvlBKRqcAIz1aKc5h9MjcIMT0Z8qB8f\u002B7Iha/nUwnEkp/hlvYdqgRipIYAcmMWFbDhx5mGkQQ9m0I5BzEuhk2z6/S8pjt27zGQmC7gqvOR1cZL0LfMkjimT\u002BVhGAAAFzYAQPmnWdJTy0eaf3OjTRiYsm9hogTMnrF7BgZ4ZogIKJkLPKSOmQIrVYgDWnLYMbMwDF1UJbOHhtzMn2qS9qFF9F2TrXLFhmaRYI4baWaK1yCM/vw/J3h5F\u002BKGsTkk0TVT0nd0YjA\u002B5N7aXnLRQZxi1ZE9q2G72WYZv5y\u002B39B106UO\u002B8Mk\u002BW2IWcm9vDgyo9p38WObhfTwQao9R66ofTwRlQE6KJ3nq\u002BcyzMJirDNQSENnFrUW\u002BacqDZ2t9KFKGwF99YcLs4Z6YTpyqnzQjz02jjjQTi4R8DkEnFmQ/U769KYdS8GlL1TS1AunR2jjjC6sQOpHq5Hw1GQ\u002BUVEN5wQU1QAGspDmjo/QEPDn2OnihJ3UjfbEj0FthksPOw3dOalzk4VWg9qJMt/Aajn2J8pW6cRW3ALirYsYXkQXaL9pKXjQ0qpIL\u002BSDOEFmEpjNhLbbQV9ItzJtjLPUmeTXDe7i6dgkg4dJwa8RDzjzZ2aMpQONxXZbv\u002B0V7FoiMI2NBQBQkf7NsdIKZu\u002BsZfboieWvj2cyasp\u002BHELZvn1j84fUycoTJuwQxbzo51rQ8dbxx7UCwT/mn7KWKPvJjSI2cFxL21dtN0YJyKnHwwsSyzgIHX7aBC2f9xZ7ezRYDLo3aQCbA\u002B3hG7WkS8HyBMkkU7UTneozLpGyYjJacDFnXb3qZevtmURu3LhZfWFIch6GUoB9ocudHbGohVhmFzBhzzs\u002BighmkmTHpTts28ut6ix6fvxx1xT3u4i8JV1vh4q9ZCkJZTtWZHMKqK7YEw/mJMfRFeYcjK8QellBzsuVLv9eg5wvjT2MueVuLNNjX1qFdDWWgXbyB4vhMs37TZVcspW\u002B9qL3RgFIAuMK8/3bAXh864wRFfNIBlIF2wRJp0xc\u002BeUCcjPrzUD3uFWBaEWX\u002BEpEgdNCXLV8GmOOV0zsJ1dktiyYKDRkoeEjcvP\u002Bur3vbSvHjojmg1Ci4ExKebUoUspo8\u002BYlml1z44rgmGF7ixx6OgEStc18/eqPj5qAWH0fQpRxyg8xHd7BAUZk\u002BKlHtXC8hpyVJBCidv3IsJf4gSMblWCoo6lePB8S36igQAOC7P7p\u002BQqbyQToDRtHQIlSOJ1zz9AgnopLdQa7Lwl05Jpgm7MrV/Di/lMuKTvi8yxdwj7yz9GQ/IQwtzmvkqRtTaSWysbTe8H4SeT6n3xkNiQv6lnMd4QZVTkMZGRNVw9qY0hkVJI0kT647MtwGdlH3ATRsm9vDK74Yd7QoUqTHVQk4dAAH3WGh7OrkI2wrJ0TcUkgVk1VZA6QilBDLh3CeNsvIK7IV9KvNAJe7OZT38/RmfNve/F\u002BZiJA132oZ790bqx3Nt0yswiS7M08hOubfYk/XN4bNtMg4YNSxxnQI8HYIJllq8vzhJHsz9Pk\u002BBHd7re0E3Y\u002BTVOA8Vcfa6czXb6WB4pxyZQIzBoCtdXKPM7KZ72YSg23X\u002B0pW\u002Bzh9mK7bhUmjy7y5E3Ve80O2hZ3V/YeC42je2ba9Phul/V13eepFxN14SyFpHX41B7Ha3hJoBF/SECnjfkYIbDu3qouicshxbdqpp0QEuCJbmpALPQHgI9hATNXc4TBnXjMYY6/lQxTKjbGzRQABuA/joSIGSUEhNx3BgcV\u002BOaI2y6LV3HkHam3A5OQuterTjvZvVdsBpWo6bIpkUCs5krD7VqekdrIt68jbEg\u002BEqW1CzGk0/pZBRDVM84vnxjxtnTg5QpHySJoYc3zCi4\u002BOrwGkPnZT3RE3Pg7N\u002BPLeGJ/mA8jfyIVZA1KyQbdl25faBGS\u002BZF4KkKvq2HlmnxSpu59qZQEXEV6s0eerNOcwutRrosWt2dDfbFxRNwiSHgdTbGEFlWpy\u002BJA6dfMbOfYalQP99teXc9f91AjM\u002BA/TA4fGUNonuUF933Ip53NXcjHZ5HPVnQUantrUv8Mk2hqWSLIeskXdz6XcwgzHdsZq5\u002BJdGX801CW1JGsHyzv0KL0Bc/ocJsDyFtOHSnktvSSxKF0yk4OxMKVQ1ZateYP8Cm9WP88g/Ma0azPD8vqMkgl655iqbHySxNqSmU4ktjjrUv8uA2PyjqxjLBUEIy3ppHxeZi\u002BajCwrX4hle1Kcj5RRePMKuqDHLr7zS5fwM084I5Ox25MAID87xlrBof/n7BXSNBQVkVAiOtZv4BypyvLzOmJ3eP6OJB\u002BPFD/xLRBO9Z\u002BNkVe5KU4t2VGEIPwWO9ht6eK6cWntYUfvNWG8/u94jMI6KFKlmvapxqTKoX9bPfNFN8VNGt7IN8UnpzQiXmu98n5MzMTUuhAKdJqrcAduAbATC1BrZx8mEz64EiPTlREVfluX2rwk2hLogAQUDl4EUnyEtrrdnEdpaSvP7ZKVNT6CQgKxDTIkrl/Oar82BQL4P9amiZXJgkoxrYDfkzsRZpPZgrzVjjxIsgnMxvA57FIX/wythghIgeYFMqKogw/7AJF7guO3uJQNXn09ifAaBVORxPpYnOe28bLUM0q3QDKhVIlU2/5z3XZ9XDlWV33Gw7yZjf820iql6P6MPwuAO\u002BLCygCaMfIgXMGbg7\u002BU64Tx9dPSH4K3dJ\u002B4qoi3w8P57Ey7067toHfGiFGTI8L2FpRqNviTnmoae6\u002BdmKwEn08jlJO4smkSywqSITwSnjRXxJ8K13DUPs1Q\u002BhkfI4LAFB81WBdnJxhdv9n7BXKoiZCJiDkAdtE3nhp0zrF4O4KygiwMBd2DXQlM2OfYwWiQixhdnssoP9pkTRZs/90Fe2SVeynom0Q0mZ3p7yjnojfTidKkzIUfzdlMKqza57Se1Ly0U91w139HXW3zEIK\u002B1IDx9Z13xppDvWNEuv3KkRuUibmF7Q3zKxRUJb8UO24egs6RNlfUyZ8qh1vRa8TJUGjpp987drZ6eR4btMBSHhfE\u002BZV7M2unAFz3sy6KHf1KO3k\u002BZIXQy3Ip7lvR8Wlmxd0P7aw9Roem54pMASbQgXfqG8xLbaokbWoQUBzIaoEPpycdLcWIZrDJMkGHCLGDBEgo7IC6sbeALc\u002BeKN2owcb/BxRE3kLb36rcdTBuLGsIm5siZgClaR6PvMEpUB3mOGFWxtBLRIZ2YePh0F6LGFqTv\u002Ba84IXX2Bd6QL7UMtFrta2RCkaAexhylY3GSwQHcLwLh3bGgFVbMt1nyzteZGPVh3ZdoCf1DhFKd5kx2m/Y32tFKKtR48o7tPyw8SKDJF6wOat3FPuMrHBwyCyUKxhaJ7Rgs3HFVsKdATPD/oq4gSyXUfibtuaP4wa3iyTsYKJbqhQEz/nPH20tVj8Sm7agxuTBoV5sJ3cvoH3V/PGwOQCXNUDiBX7DI5OdZbf6uGfMPgRLdct7Z1NtNzhlk5Gv1bHPwPEafvgXKK/zaH7P9FX5By0hjFxtHzixMP96/mfxOnKBm4XMgAA7oiWOl8RR3H/GBbQxelih17\u002BW\u002BuWNrz6AQe98Qr0Koxf0b2o/6D/tvhXQb65kT5t1wgw\u002Bv6QsKBnla8iIWj/iORsY2ln\u002Bfv5zrc2wy/JQKCEAwBgkf/zWliY/gjh9MdYekX/vrf/FRLY/\u002Bn0f8X/vm/wFXy5vnIRviJ/f46\u002BQkH0v6fqqwjfH/SuoBL7z7Hviv890ft3PP8ZAPhKAl/Rv6dA/g7\u002BJDT9b3rkiv29F8LfMZ\u002BCZv/r9YAOgIP7698k6EMaveMvab/\u002B\u002BgVQSwECPwAUAAAAAAA6gkNcAAAAAAAAAAAAAAAACwAkAAAAAAAAABAAAAAAAAAAZG9jdW1lbnRvcy8KACAAAAAAAAEAGAAf/lYrSpXcAQAAAAAAAAAAAAAAAAAAAABQSwECPwAUAAAACAB1eIxbTtzQqIkCAAC2BAAAGAAkAAAAAAAAACAAAAApAAAAZG9jdW1lbnRvcy9hbm90YWNvZXMudHh0CgAgAAAAAAABABgAJEn\u002BB5pr3AEAAAAAAAAAAAAAAAAAAAAAUEsBAj8AFAAAAAgAknCBWxdO7r5gmAAASacAADwAJAAAAAAAAAAgAAAA6AIAAGRvY3VtZW50b3MvR3VpYV9Db25zdW1vX0FQSXNfUmVzb2x2ZV9DYWl4YV9ORVRfQ29tcGxldG8uZG9jeAoAIAAAAAAAAQAYAANshvPsYtwBAAAAAAAAAAAAAAAAAAAAAFBLBQYAAAAAAwADAFUBAACimwAAAAA="
        }
      }
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      🔍 DEBUG GED - BaseUrl da config: 'https://siecm.des.caixa/siecm-web/ECM'
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      🔍 DEBUG GED - URL completa montada: 'https://siecm.des.caixa/siecm-web/ECM/v1/documentos/incluir'
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      🔍 DEBUG GED - HttpClient.BaseAddress: 'NULL'
info: SISOU_api_sac_internet.Shared.ExternalServices.Keycloak.KeycloakTokenService[0]
      Obtendo novo token do Keycloak para serviço GED
info: System.Net.Http.HttpClient.IKeycloakTokenService.LogicalHandler[100]
      Start processing HTTP request POST https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
info: SISOU_api_sac_internet.Shared.ExternalServices.CaixaCertHandler[0]
      CERT: CA carregado para validação. Subject=CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR Expira=12/23/2042 12:05:14
info: System.Net.Http.HttpClient.IKeycloakTokenService.LogicalHandler[101]
      End processing HTTP request after 647.0092ms - 200
info: SISOU_api_sac_internet.Shared.ExternalServices.Keycloak.KeycloakTokenService[0]
      Token Keycloak obtido com sucesso, válido até 09/09/2026 17:24:31
info: System.Net.Http.HttpClient.IGedService.LogicalHandler[100]
      Start processing HTTP request POST https://siecm.des.caixa/siecm-web/ECM/v1/documentos/incluir
info: SISOU_api_sac_internet.Shared.ExternalServices.CaixaCertHandler[0]
      CERT: CA carregado para validação. Subject=CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR Expira=12/23/2042 12:05:14
info: System.Net.Http.HttpClient.IGedService.LogicalHandler[101]
      End processing HTTP request after 1170.5546ms - 200
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      ✅ Documento gravado no GED com sucesso. Arquivo: documentos.zip, ID: 002F87A0-0000-C914-BB73-55997E3C3847
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ Arquivo enviado para GED com sucesso. Código: 002F87A0-0000-C914-BB73-55997E3C3847
info: 09/09/2026 14:20:02.837 RelationalEventId.CommandExecuted[20101] (Microsoft.EntityFrameworkCore.Database.Command) 
      Executed DbCommand (31ms) [Parameters=[:p0='002F87A0-0000-C914-BB73-55997E3C3847' (Nullable = false) (Size = 50) (DbType = AnsiString), :p1=NULL (Size = 3) (DbType = AnsiString), :p2='C999999' (Nullable = false) (Size = 11) (DbType = AnsiString), :p3='2026-09-09T14:20:02.5458712-03:00' (DbType = Date), :p4='2026-09-09T14:20:02.5458478-03:00' (Nullable = true) (DbType = Date), :p5=NULL (Size = 300) (DbType = AnsiString), :p6='N' (Size = 1) (DbType = AnsiStringFixedLength), :p7='N' (Size = 1) (DbType = AnsiStringFixedLength), :p8='C' (Size = 1) (DbType = AnsiStringFixedLength), :p9='U' (Size = 1) (DbType = AnsiStringFixedLength), :p10='documentos.zip' (Nullable = false) (Size = 150) (DbType = AnsiString), :p11=NULL (DbType = Int32), :p12='49410' (Nullable = true), :p13=NULL (DbType = Int32), :p14=NULL (DbType = Int32), :p15=NULL (DbType = Int32), :p16=NULL (DbType = Int32), :p17=NULL (DbType = Int32), :p18=NULL (DbType = Int32), :p19=NULL (DbType = Int32), :cur0=NULL (Nullable = false) (Direction = Output) (DbType = Object)], CommandType='Text', CommandTimeout='120']
      DECLARE
      
      TYPE "rSOUTB042_ANEXO_OCORRENCIA_0" IS RECORD
      (
      "NU_ANEXO_OCORRENCIA" NUMBER(10)
      );
      TYPE "tSOUTB042_ANEXO_OCORRENCIA_0" IS TABLE OF "rSOUTB042_ANEXO_OCORRENCIA_0";
      "lSOUTB042_ANEXO_OCORRENCIA_0" "tSOUTB042_ANEXO_OCORRENCIA_0";
      
      BEGIN
      
      "lSOUTB042_ANEXO_OCORRENCIA_0" := "tSOUTB042_ANEXO_OCORRENCIA_0"();
      "lSOUTB042_ANEXO_OCORRENCIA_0".extend(1);
      INSERT INTO "SOU"."SOUTB042_ANEXO_OCORRENCIA" ("CO_ANEXO_GED", "CO_GRAU_SIGILO", "CO_USUARIO_EMISSOR", "DT_CADASTRO_ANEXO", "DT_EMISSAO_ANEXO", "ED_URL_RETORNO_B2B", "IC_ANEXO_RECURSO", "IC_ATIVO", "IC_TIPO_DESTINATARIO_RESPOSTA", "IC_TIPO_ORIGEM_ANEXO", "NO_ANEXO", "NU_EMPRESA_TERCEIRIZADA", "NU_OCORRENCIA_EXTERNA", "NU_OCORRENCIA_INTERNA", "NU_PRORROGACAO_OCRNA", "NU_REABERTURA_OCORRENCIA", "NU_RESPOSTA_SUBSIDIO", "NU_SOLICITACAO_OCRNA_INTNA", "NU_SOLICITACAO_UNIDADE", "NU_TAREFA_OCORRENCIA")
      VALUES (:p0, :p1, :p2, :p3, :p4, :p5, :p6, :p7, :p8, :p9, :p10, :p11, :p12, :p13, :p14, :p15, :p16, :p17, :p18, :p19)
      RETURNING "NU_ANEXO_OCORRENCIA" INTO "lSOUTB042_ANEXO_OCORRENCIA_0"(1)."NU_ANEXO_OCORRENCIA";
      OPEN :cur0 FOR SELECT "lSOUTB042_ANEXO_OCORRENCIA_0"(1)."NU_ANEXO_OCORRENCIA" FROM DUAL;
      
      END;
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      💾 [SOUTB042] Arquivo salvo. NU_ANEXO_OCORRENCIA: 108883
info: 09/09/2026 14:20:02.898 RelationalEventId.CommandExecuted[20101] (Microsoft.EntityFrameworkCore.Database.Command) 
      Executed DbCommand (12ms) [Parameters=[:p0='C999999' (Nullable = false) (Size = 11) (DbType = AnsiString), :p1='Arquivo 'documentos.zip' processado e enviado ao GED com sucesso. Código GED: 002F87A0-0000-C914-BB73-55997E3C3847' (Size = 2000) (DbType = AnsiString), :p2='S' (Nullable = false) (Size = 1) (DbType = AnsiStringFixedLength), :p3='E' (Nullable = false) (Size = 1) (DbType = AnsiStringFixedLength), :p4='108883', :p5='2026-09-09T14:20:02.8680045-03:00' (DbType = DateTime), :cur0=NULL (Nullable = false) (Direction = Output) (DbType = Object)], CommandType='Text', CommandTimeout='120']
      DECLARE
      
      TYPE "rSOUTB198_CMPHO_ANEXO_0" IS RECORD
      (
      "NU_CMPHO_ANEXO" NUMBER(10)
      );
      TYPE "tSOUTB198_CMPHO_ANEXO_0" IS TABLE OF "rSOUTB198_CMPHO_ANEXO_0";
      "lSOUTB198_CMPHO_ANEXO_0" "tSOUTB198_CMPHO_ANEXO_0";
      
      BEGIN
      
      "lSOUTB198_CMPHO_ANEXO_0" := "tSOUTB198_CMPHO_ANEXO_0"();
      "lSOUTB198_CMPHO_ANEXO_0".extend(1);
      INSERT INTO "SOU"."SOUTB198_CMPHO_ANEXO" ("CO_USUARIO_ENVIO_ARQUIVO", "DE_RETORNO_CMPHO", "IC_SITUACAO_ENVIO", "IC_TIPO_FLUXO_ARQUIVO", "NU_ANEXO_OCORRENCIA", "TS_ENVIO_ARQUIVO")
      VALUES (:p0, :p1, :p2, :p3, :p4, :p5)
      RETURNING "NU_CMPHO_ANEXO" INTO "lSOUTB198_CMPHO_ANEXO_0"(1)."NU_CMPHO_ANEXO";
      OPEN :cur0 FOR SELECT "lSOUTB198_CMPHO_ANEXO_0"(1)."NU_CMPHO_ANEXO" FROM DUAL;
      
      END;
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ [SOUTB198] Rastreabilidade B2B registrada. Situação: Sucesso, Fluxo: Envio
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ Processamento de 1 arquivo(s) concluído com sucesso
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      💾 [RESPONDER] Persistindo resposta. Nova situação: 18
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      🔧 ANTES da atualização - Situação: 14, Resposta: VAZIA
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      🔧 DEPOIS da atualização - Situação: 18, Resposta: 29 caracteres
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      💾 Persistindo dados de resposta para formato: Email
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ Registro criado em SOUTB071_OCRNA_EXTNA_RESPOSTA
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ Registro criado em SOUTB104_CONTATO_RESPOSTA: cesob250@caixa.gov.br
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ Dados de resposta persistidos com sucesso
💾 SaveChangesAsync - Entidades alteradas: 3
   - Soutb071OcrnaExtnaResposta: Added
   - Soutb104ContatoResposta: Added
   - Soutb041OcorrenciaExterna: Modified
     NU_SITUACAO_OCORRENCIA: 18
     DE_RESPOSTA_OCORRENCIA: 29 chars
info: 09/09/2026 14:20:03.067 RelationalEventId.CommandExecuted[20101] (Microsoft.EntityFrameworkCore.Database.Command) 
      Executed DbCommand (62ms) [Parameters=[:p4='49410', :p0='Resposta - Teste - 09/09/2026' (DbType = Object), :p1='Resposta - Teste - 09/09/2026' (DbType = Object), :p2='2026-09-09T14:20:02.9040539-03:00' (Nullable = true) (DbType = Date), :p3='18', :cur0=NULL (Nullable = false) (Direction = Output) (DbType = Object), :p5='C' (Nullable = false) (Size = 1) (DbType = AnsiStringFixedLength), :p6='1', :p7='49410', :p8='cesob250@caixa.gov.br' (Size = 50) (DbType = AnsiString), :p9='2026-09-09T14:20:02.9177567-03:00' (Nullable = true) (DbType = Date), :p10='S' (Size = 1) (DbType = AnsiStringFixedLength), :p11='C' (Size = 1) (DbType = AnsiStringFixedLength), :p12='R' (Nullable = false) (Size = 1) (DbType = AnsiStringFixedLength), :p13='1' (Nullable = true), :p14='49410' (Nullable = true), :p15=NULL (DbType = Int32), :cur2=NULL (Nullable = false) (Direction = Output) (DbType = Object)], CommandType='Text', CommandTimeout='120']
      DECLARE
      
      v_RowCount INTEGER;
      TYPE "rSOUTB104_CONTATO_RESPOSTA_2" IS RECORD
      (
      "NU_CONTATO_RESPOSTA" NUMBER(10)
      );
      TYPE "tSOUTB104_CONTATO_RESPOSTA_2" IS TABLE OF "rSOUTB104_CONTATO_RESPOSTA_2";
      "lSOUTB104_CONTATO_RESPOSTA_2" "tSOUTB104_CONTATO_RESPOSTA_2";
      
      BEGIN
      
      UPDATE "SOU"."SOUTB041_OCORRENCIA_EXTERNA" SET "DE_MINUTA_RESPOSTA" = :p0, "DE_RESPOSTA_OCORRENCIA" = :p1, "DH_RESPOSTA_OCORRENCIA" = :p2, "NU_SITUACAO_OCORRENCIA" = :p3
      WHERE "NU_OCORRENCIA_EXTERNA" = :p4;
      v_RowCount := SQL%ROWCOUNT;
      OPEN :cur0 FOR SELECT v_RowCount FROM DUAL;
      INSERT INTO "SOU"."SOUTB071_OCRNA_EXTNA_RESPOSTA" ("IC_TIPO_DESTINATARIO", "NU_FORMA_RCBMO_RESPOSTA", "NU_OCORRENCIA_EXTERNA")
      VALUES (:p5, :p6, :p7);
      "lSOUTB104_CONTATO_RESPOSTA_2" := "tSOUTB104_CONTATO_RESPOSTA_2"();
      "lSOUTB104_CONTATO_RESPOSTA_2".extend(1);
      INSERT INTO "SOU"."SOUTB104_CONTATO_RESPOSTA" ("DE_CONTATO_RESPOSTA", "DT_CONTATO_RESPOSTA", "IC_CLIENTE_ENCONTRADO", "IC_TIPO_DESTINATARIO", "IC_TIPO_RETORNO", "NU_FORMA_RCBMO_RESPOSTA", "NU_OCORRENCIA_EXTERNA", "NU_REABERTURA_OCORRENCIA")
      VALUES (:p8, :p9, :p10, :p11, :p12, :p13, :p14, :p15)
      RETURNING "NU_CONTATO_RESPOSTA" INTO "lSOUTB104_CONTATO_RESPOSTA_2"(1)."NU_CONTATO_RESPOSTA";
      OPEN :cur2 FOR SELECT "lSOUTB104_CONTATO_RESPOSTA_2"(1)."NU_CONTATO_RESPOSTA" FROM DUAL;
      
      END;
✅ SaveChangesAsync - Concluído
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ [RESPONDER] Etapa 2.1: Ocorrência atualizada no banco
warn: 09/09/2026 14:20:03.086 CoreEventId.FirstWithoutOrderByAndFilterWarning[10103] (Microsoft.EntityFrameworkCore.Query) 
      The query uses the 'First'/'FirstOrDefault' operator without 'OrderBy' and filter operators. This may lead to unpredictable results.
info: 09/09/2026 14:20:03.108 RelationalEventId.CommandExecuted[20101] (Microsoft.EntityFrameworkCore.Database.Command) 
      Executed DbCommand (12ms) [Parameters=[id='49410'], CommandType='Text', CommandTimeout='120']
      SELECT "s"."NU_OCORRENCIA_EXTERNA", "s"."NU_UNIDADE_TRATAMENTO", "s"."NU_NATURAL_TRATAMENTO", "s"."DE_JUSTIFICATIVA_TRANSFERENCIA", "s"."DH_TRANSFERENCIA_OCORRENCIA", "s"."IC_TPO_UNIDADE_OCRNA_EXTNA"
      FROM (
      
                          SELECT * FROM sou.SOUTB078_UNIDADE_OCRNA_EXTNA
                          WHERE NU_OCORRENCIA_EXTERNA = :id
                          AND DE_JUSTIFICATIVA_TRANSFERENCIA IS NULL
                          AND DH_TRANSFERENCIA_OCORRENCIA IS NULL
                          AND IC_TPO_UNIDADE_OCRNA_EXTNA = 'T'
                          ORDER BY ROWID ASC FETCH FIRST 1 ROW ONLY
      ) "s"
      FETCH FIRST 1 ROWS ONLY
info: 09/09/2026 14:20:03.124 RelationalEventId.CommandExecuted[20101] (Microsoft.EntityFrameworkCore.Database.Command) 
      Executed DbCommand (2ms) [Parameters=[id='49410'], CommandType='Text', CommandTimeout='120']
      SELECT "s"."NU_OCORRENCIA_EXTERNA", "s"."NU_UNIDADE_TRATAMENTO", "s"."NU_NATURAL_TRATAMENTO", "s"."DE_JUSTIFICATIVA_TRANSFERENCIA", "s"."DH_TRANSFERENCIA_OCORRENCIA", "s"."IC_TPO_UNIDADE_OCRNA_EXTNA"
      FROM (
      
                          SELECT * FROM sou.SOUTB078_UNIDADE_OCRNA_EXTNA
                          WHERE NU_OCORRENCIA_EXTERNA = :id
                          AND DE_JUSTIFICATIVA_TRANSFERENCIA IS NULL
                          AND DH_TRANSFERENCIA_OCORRENCIA IS NULL
                          AND IC_TPO_UNIDADE_OCRNA_EXTNA = 'T'
                          ORDER BY ROWID ASC FETCH FIRST 1 ROW ONLY
      ) "s"
      FETCH FIRST 1 ROWS ONLY
info: 09/09/2026 14:20:03.221 RelationalEventId.CommandExecuted[20101] (Microsoft.EntityFrameworkCore.Database.Command) 
      Executed DbCommand (42ms) [Parameters=[:idOcorrencia_0='49410'], CommandType='Text', CommandTimeout='120']
      SELECT "s"."NU_OCORRENCIA_EXTERNA", "s"."CO_AUTO_INFRACAO", "s"."CO_CONTA", "s"."CO_ENTIDADE_CIVIL", "s"."CO_FICHA_AUTUACAO", "s"."CO_OPERACAO", "s"."CO_PROCESSO_ADMINISTRATIVO", "s"."CO_PROTOCOLO_EXTERNO", "s"."CO_TRANSACAO_GED", "s"."CO_USUARIO_CADASTRO", "s"."DE_EMAIL_ENTIDADE_CIVIL", "s"."DE_JSTVA_OCRNA_PERTINENTE", "s"."DE_JUSTIFICATIVA_CANCELAMENTO", "s"."DE_MANIFESTO_CLIENTE", "s"."DE_MASCARA_PROTOCOLO_EXTERNO", "s"."DE_MINUTA_RESPOSTA", "s"."DE_OBSERVACAO_PARECER", "s"."DE_OBSRO_APTMO_AVLCO_OCRNA", "s"."DE_PROVIDENCIA", "s"."DE_RECURSO_OCORRENCIA", "s"."DE_RESPOSTA_OCORRENCIA", "s"."DH_RESPOSTA_AVALIACAO", "s"."DH_RESPOSTA_OCORRENCIA", "s"."DT_ABERTURA_EXTERNA", "s"."DT_AUDIENCIA_ORGO_DEFESA_CNSMR", "s"."DT_CONVOCACAO_AUDIENCIA", "s"."DT_FINAL_DEFESA", "s"."DT_FINAL_OCORRENCIA_EXTERNA", "s"."DT_FINAL_PAGAMENTO_MULTA", "s"."DT_FINAL_RESPOSTA_FICHA_ATCO", "s"."DT_INICIO_OCORRENCIA", "s"."DT_PROMESSA_RESPOSTA", "s"."DT_RECEBIMENTO_FICHA_AUTUACAO", "s"."DT_RECEBIMENTO_OCORRENCIA", "s"."DT_REGISTRO_PRE_OCORRENCIA", "s"."DT_RESPOSTA_NOTIFICACAO", "s"."IC_ALCADA_RESPOSTA", "s"."IC_AUTO_INFRACAO", "s"."IC_CANAL_RESPOSTA_AVALIACAO", "s"."IC_GRAU_DIFICULDADE", "s"."IC_OCORRENCIA_EXTERNA_LIDA", "s"."IC_PERMITE_RECURSO", "s"."IC_PERTINENCIA_OCORRENCIA", "s"."IC_PRAZO_REABERTURA_DIA_UTIL", "s"."IC_PRAZO_RESPOSTA_DIA_UTIL", "s"."IC_PRAZO_RSPSA_RBRTA_DIA_UTIL", "s"."IC_PROTOCOLO_EXTERNO", "s"."IC_REABERTURA_OCORRENCIA", "s"."IC_TIPO_COMPLEMENTO_RESPOSTA", "s"."IC_TIPO_DENUNCIA", "s"."IC_TPO_RESPOSTA_DENUNCIA_MGRCO", "s"."NU_ASSINATURA_PARECER", "s"."NU_ATNTO_ORGO_DFSA_CNSMR", "s"."NU_CORRESPONDENTE_BANCARIO", "s"."NU_ENCAMINHAMENTO_BACEN", "s"."NU_IDENTIFICACAO_OCORRENCIA", "s"."NU_IDENTIFICADOR_BACEN", "s"."NU_MOTIVO_ENCERRAMENTO", "s"."NU_NATURAL_ABERTURA", "s"."NU_NATURAL_AGENCIA", "s"."NU_NATURAL_FISCALIZADA", "s"."NU_NATUREZA_MANIFESTO", "s"."NU_NOTA_AVALIACAO_ATENDIMENTO", "s"."NU_NOTA_AVALIACAO_SOLUCAO", "s"."NU_OCORRENCIA_VINCULADA", "s"."NU_ORIGEM_OCORRENCIA", "s"."NU_PRE_OCORRENCIA", "s"."NU_PROBLEMA_COMUNICACAO", "s"."NU_PROBLEMA_MANIFESTO", "s"."NU_PRODUTO_MANIFESTO", "s"."NU_REVENDEDOR_LOTERICO", "s"."NU_SITUACAO_OCORRENCIA", "s"."NU_SOLICITANTE_OCORRENCIA", "s"."NU_TIPO_ATENDIMENTO_OCRNA", "s"."NU_TIPO_OCORRENCIA", "s"."NU_TPO_ATNTO_DFSA_CNSMR", "s"."NU_UNIDADE_ABERTURA", "s"."NU_UNIDADE_AGENCIA", "s"."NU_UNIDADE_FISCALIZADA", "s"."PZ_OCORRENCIA_EXTERNA", "s"."PZ_REABERTURA_OCORRENCIA", "s"."PZ_RESPOSTA_OCRNA_DIA_UTIL", "s"."PZ_RESPOSTA_RBRTA_OCORRENCIA", "s"."QT_REABERTURA_OCORRENCIA", "s"."VR_MULTA_ORGAO_DFSA_CONSUMIDOR"
      FROM "SOU"."SOUTB041_OCORRENCIA_EXTERNA" "s"
      WHERE CAST("s"."NU_OCORRENCIA_EXTERNA" AS NUMBER(19)) = :idOcorrencia_0
      FETCH FIRST 1 ROWS ONLY
info: 09/09/2026 14:20:03.301 RelationalEventId.CommandExecuted[20101] (Microsoft.EntityFrameworkCore.Database.Command) 
      Executed DbCommand (15ms) [Parameters=[:p0='C99999' (Size = 11) (DbType = AnsiString), :p1=NULL (DbType = Object), :p2='Resposta da Ocorrência - Ocorrência nº 2205250000004 foi respondida no dia 09/09/2026, às 14:20, pelo usuário C99999, pela Unidade 7392.
      
      Pertinente: Sim
      
      Resposta - Teste - 09/09/2026' (Nullable = false) (DbType = Object), :p3='6619' (Nullable = true), :p4='49410', :p5='23', :p6='7392' (Nullable = true), :p7='2026-09-09T14:20:03.1250195-03:00' (DbType = DateTime), :cur0=NULL (Nullable = false) (Direction = Output) (DbType = Object)], CommandType='Text', CommandTimeout='120']
      DECLARE
      
      TYPE "rSOUTB118_MVMNO_OCR_80836644_0" IS RECORD
      (
      "NU_MVMNO_OCRNA_EXTERNA" NUMBER(10)
      );
      TYPE "tSOUTB118_MVMNO_OCR_80836644_0" IS TABLE OF "rSOUTB118_MVMNO_OCR_80836644_0";
      "lSOUTB118_MVMNO_OCR_80836644_0" "tSOUTB118_MVMNO_OCR_80836644_0";
      
      BEGIN
      
      "lSOUTB118_MVMNO_OCR_80836644_0" := "tSOUTB118_MVMNO_OCR_80836644_0"();
      "lSOUTB118_MVMNO_OCR_80836644_0".extend(1);
      INSERT INTO "SOU"."SOUTB118_MVMNO_OCRNA_EXTERNA" ("CO_USUARIO_MOVIMENTACAO", "DE_JUSTIFICATIVA_OCRNA_EXTERNA", "DE_MOVIMENTACAO_OCRNA_EXTERNA", "NU_NATURAL_MOVIMENTACAO", "NU_OCORRENCIA_EXTERNA", "NU_TIPO_MOVIMENTACAO", "NU_UNIDADE_MOVIMENTACAO", "TS_CADASTRO_MOVIMENTACAO")
      VALUES (:p0, :p1, :p2, :p3, :p4, :p5, :p6, :p7)
      RETURNING "NU_MVMNO_OCRNA_EXTERNA" INTO "lSOUTB118_MVMNO_OCR_80836644_0"(1)."NU_MVMNO_OCRNA_EXTERNA";
      OPEN :cur0 FOR SELECT "lSOUTB118_MVMNO_OCR_80836644_0"(1)."NU_MVMNO_OCRNA_EXTERNA" FROM DUAL;
      
      END;
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      Movimentação de resposta criada para ocorrência 2205250000004 - Tipo: RESPOSTA_SAC
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ [RESPONDER] Etapa 2.2: Movimentação de resposta criada
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      📄 [RESPONDER] Etapa 3 Gerando PDF da resposta...
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      🔄 [PDF] Iniciando geração de PDF para ocorrência 2205250000004
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      🔤 [FontResolver] Verificando diretórios de fontes disponíveis...
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
         ✅ /opt/app-root/app/Resources/Fonts: 3 arquivos .ttf
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ [PDF] PDF gerado com sucesso. Tamanho: 44118 bytes
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ [RESPONDER] Etapa 3: PDF gerado com sucesso (44118 bytes)
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ☁️ [RESPONDER] Etapa 4: Salvando PDF no GED...
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      🔄 [GED] Iniciando upload do PDF para o GED. Arquivo: RESPOSTA - Ocorrência nº 2205250000004.pdf, Tamanho: 44118 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      Enviando documento para GED. Código: SISOU_RESP_2205250000004_20260909142003, Arquivo: RESPOSTA - Ocorrência nº 2205250000004.pdf
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      🔍 IP que será informado ao GED (ipUsuarioFinal): 10.116.222.199
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      📤 Payload GED: {
        "dadosRequisicao": {
          "localArmazenamento": "OS_PADM",
          "ipUsuarioFinal": "10.116.222.199"
        },
        "destinoDocumento": {
          "localGravacao": "PADRAO",
          "idDestino": null,
          "subPasta": null
        },
        "documento": {
          "atributos": {
            "classe": "EVIDENCIA",
            "gerarThumbnail": true,
            "tipo": "PDF",
            "mimeType": "application/pdf",
            "nome": "RESPOSTA - Ocorr\u00EAncia n\u00BA 2205250000004.pdf",
            "campo": [
              {
                "nome": "EMISSOR",
                "tipo": "STRING",
                "valor": "SISOU"
              },
              {
                "nome": "DATA_EMISSAO",
                "tipo": "DATE",
                "valor": "09-09-2026 14:20:03"
              },
              {
                "nome": "CLASSIFICACAO_SIGILO",
                "tipo": "STRING",
                "valor": "PUBLICO"
              },
              {
                "nome": "RESPONSAVEL_CAPTURA",
                "tipo": "STRING",
                "valor": "service-account-cli-ext-39565194000108-1"
              },
              {
                "nome": "STATUS",
                "tipo": "STRING",
                "valor": "0"
              },
              {
                "nome": "TIPO",
                "tipo": "STRING",
                "valor": "3"
              },
              {
                "nome": "PROTOCOLO_EXTERNO",
                "tipo": "STRING",
                "valor": ""
              },
              {
                "nome": "OCORRENCIA",
                "tipo": "STRING",
                "valor": "2205250000004"
              },
              {
                "nome": "EMISSOR_ARQUIVO",
                "tipo": "STRING",
                "valor": "service-account-cli-ext-39565194000108-1"
              },
              {
                "nome": "DATA_UPLOAD",
                "tipo": "DATE",
                "valor": "09-09-2026 14:20:03"
              },
              {
                "nome": "IDENTIFICADOR_USUARIO",
                "tipo": "STRING",
                "valor": "service-account-cli-ext-39565194000108-1"
              },
              {
                "nome": "DATA_REGISTRO_OCORRENCIA",
                "tipo": "DATE",
                "valor": "22-05-2025 16:18:57"
              },
              {
                "nome": "DATA_RESPOSTA_OCORRENCIA",
                "tipo": "DATE",
                "valor": "09-09-2026 14:20:03"
              }
            ]
          },
          "binario": "JVBERi0xLjQKJdP0zOEKMSAwIG9iago8PAovQ3JlYXRpb25EYXRlIChEOjIwMjYwOTA5MTQyMDAzLTAzJzAwJykKL1RpdGxlIDxGRUZGMDA1MjAwNjUwMDczMDA3MDAwNkYwMDczMDA3NDAwNjEwMDIwMDA1MzAwNDEwMDQzMDAyMDAwNkUwMEJBMDAyMDAwMzIwMDMyMDAzMDAwMzUwMDMyMDAzNTAwMzAwMDMwMDAzMAowMDMwMDAzMDAwMzAwMDM0PgovQXV0aG9yIDxGRUZGMDA0MzAwNDEwMDQ5MDA1ODAwNDE\u002BCi9TdWJqZWN0IDxGRUZGMDA1MjAwNjUwMDczMDA3MDAwNkYwMDczMDA3NDAwNjEwMDIwMDA2NDAwNjUwMDIwMDA0RjAwNjMwMDZGMDA3MjAwNzIwMEVBMDA2RTAwNjMwMDY5MDA2MTAwMjAwMDUzMDA0MQowMDQzPgovQ3JlYXRvciA8RkVGRjAwNTAwMDQ0MDA0NjAwNzMwMDY4MDA2MTAwNzIwMDcwMDAyMDAwMzEwMDJFMDAzNTAwMzAwMDJFMDAzNDAwMzAwMDMwMDAzMDAwMkQwMDZFMDA2NTAwNzQwMDczMDA3NDAwNjEKMDA2RTAwNjQwMDYxMDA3MjAwNjQwMDIwMDAyODAwNjgwMDc0MDA3NDAwNzAwMDczMDAzQTAwMkYwMDJGMDA2NzAwNjkwMDc0MDA2ODAwNzUwMDYyMDAyRTAwNjMwMDZGCjAwNkQwMDJGMDA3MzAwNzQwMDczMDA3NDAwNjUwMDY5MDA2NzAwNjUwMDcyMDAyRjAwNTAwMDY0MDA2NjAwNTMwMDY4MDA2MTAwNzIwMDcwMDA0MzAwNkYwMDcyMDA2NQowMDI5PgovUHJvZHVjZXIgKFBERnNoYXJwIDEuNTAuNDAwMC1uZXRzdGFuZGFyZCBcKGh0dHBzOi8vZ2l0aHViLmNvbS9zdHN0ZWlnZXIvUGRmU2hhcnBDb3JlXCkpCj4\u002BCmVuZG9iagoyIDAgb2JqCjw8Ci9UeXBlIC9DYXRhbG9nCi9QYWdlcyAzIDAgUgo\u002BPgplbmRvYmoKMyAwIG9iago8PAovVHlwZSAvUGFnZXMKL0NvdW50IDEKL0tpZHMgWzQgMCBSXQo\u002BPgplbmRvYmoKNCAwIG9iago8PAovVHlwZSAvUGFnZQovTWVkaWFCb3ggWzAgMCA4NDIgMTEwMF0KL1BhcmVudCAzIDAgUgovQ29udGVudHMgNSAwIFIKL1Jlc291cmNlcwo8PAovUHJvY1NldCBbL1BERi9UZXh0L0ltYWdlQi9JbWFnZUMvSW1hZ2VJXQovRXh0R1N0YXRlCjw8Ci9HUzAgNiAwIFIKL0dTMSAxOCAwIFIKPj4KL1hPYmplY3QKPDwKL0kwIDkgMCBSCj4\u002BCi9Gb250Cjw8Ci9GMCAxMyAwIFIKL0YxIDE3IDAgUgo\u002BPgo\u002BPgovR3JvdXAKPDwKL0NTIC9EZXZpY2VSR0IKL1MgL1RyYW5zcGFyZW5jeQo\u002BPgo\u002BPgplbmRvYmoKNSAwIG9iago8PAovTGVuZ3RoIDExNDkKL0ZpbHRlciAvRmxhdGVEZWNvZGUKPj4Kc3RyZWFtCnicnVfNjtw2DL7rKfQC46VkSbaBooDt6QTpLc3cip4aNEDQoNj20NcPKZES5XG2u8XAsP5M8efjR86zeTZg6ff3Z/P07iPYz/\u002BYZ\u002BvGsogvD9aBA/v7V/v0Huz1L/vBbHfzdAM72/sfZhrjkEKKdMoN3sXR3j/ZHwBQBrgdH38YR57TewEAGgd8Jnyusv\u002BjvX/BS5x1nm65BJ\u002BGaUyjvYxpGBcvt4x4OswAMeGDkqLnMUoLoUgfce5x7FOZRwcw7WUM5Sbn/QDzMqPNrH1Ums48nnl\u002B9kxZziWgqy7jPCyLX0RFVCncAFa67lauJVVoLeysvmOV6QrHxoMY7\u002BzFTQMq7VikVxbnz2OxFl/VA9lSWpvLmTxfyn7A/ZU9UL3H14cryTK8Ke6FqhfZJ14ir5LqdLeYQ7JOdUmsS1Bzr9yQ\u002BHuO3Iq6rtGUQ\u002BK3sLCSex9icQQJy\u002Bd5jRyTlZia4XJpOWf\u002BT6yVQuLZqTmqs3o2ZbFq\u002BgrAZmtCC\u002BtZ6DgaCA2/DPOb8gEDVvJigofo6/3zDDZwSOGGVhii4BUjPbgYag6kJj6DZWfgaKsnXl8aqPN5XN9kfW/fVBd7drMOegaDICo1d4rATpkrI1OU0WATZMsFgqAITUB\u002Br4\u002BZfIbMqEioBifLNG0ziMaSW7vaO2hfkSfu3BlwSpkK9XpAwwMPrbfm9\u002B6yDGnOe4wwlYkEY6XJuLbHuaZ4lrGVcV5f\u002Ba6F57GEg6D1shGmt4Jh/9PdENj\u002BRa1\u002BxueL\u002BfU3sJ9Yx1/eUSlzVMoSJoafZvvVTAsMc3AuT/80H6mI1crnFouMjPvRKWYLG2nAuXLCnHFpxsIRd7MizyhcoKnAKPpOiqoVYCugfRNCmZTrVlL4OnBFni\u002Bm5\u002BUuA06y/i1YohBmC3IB8L35R2wJYPPltxcK0UMqmkOKpSZUtM8EL2479XMptrn\u002B45lxK\u002BMiT1ykWUjY58pzaPlLgJBYNP7FhiQuLmrgrC0eYr2A4lgg6r2\u002Bj3U2TkKhWC9MRsVMx0\u002BzlY71gbAeXH879lrUbsy6ycrthsanKnyPzq3icn\u002BI7UIM1CFq/6CKW/p\u002BcNy1Nma1zwxTJR3gGtzVYx7XblKtw6YYdYSueTiSXQEyuzhzOh7YVKHUmKgAVLGrbZBUKabw/O0uilIR3ZoFZ1q/aI3qNh6suHExqVwsBFARpKzZ\u002B2hd0M0XB6pq68b5tbFCFu1iNZ5Yux7\u002BAWhLg7JUGoVFpQZbTR3iJumQrRF20UQs6dB9dPKNtKcrdPTYX6BQoou6AKUm9tGt0Wm3agaWhlQ1NA8thlCINEDc16zim9QYvlCKUSwqWJQOSvPNK2jkLL5edQCvCm7khKUGMh5cQ8KUb1gt3exJ3MXGU3qIHeT\u002BE3azmk/yPuZCPORC9eXcKVE7o\u002Bag5p\u002B3dUTS3ARvcRHblsUNI3mIZseuBf\u002Baz1h7Jjys/mmm5jB6vgeSF6u1YovWBXLJf8v/ekmuVRW8x//6PKY3VeSakYck66rx3tYEIqIp9SaaGMNNvPoBf98A1oFevAplbmRzdHJlYW0KZW5kb2JqCjYgMCBvYmoKPDwKL1R5cGUgL0V4dEdTdGF0ZQovY2EgMQo\u002BPgplbmRvYmoKNyAwIG9iago8PAovVHlwZSAvWE9iamVjdAovU3VidHlwZSAvSW1hZ2UKL0xlbmd0aCAyOTYKL0ZpbHRlciAvRmxhdGVEZWNvZGUKL1dpZHRoIDE1MAovSGVpZ2h0IDM1Ci9CaXRzUGVyQ29tcG9uZW50IDEKL0ltYWdlTWFzayB0cnVlCj4\u002BCnN0cmVhbQp4nGXSMW7DIBgF4IewRIZIXjtY5RoZrHKljh2smt6Mo3AERgbkP\u002B/HceIqSDbWx28DD4v8yf/WpCIInGRbEKKRjMbLb6SkBCuJFA\u002Bq\u002BNSeBPimo6SJFNG2JzVcMCo1IFQlxyd4vrTUJ7FeJ8dS2Jcnrbwt\u002BUHRsQByUIbZyQg/uHAdB0UWk\u002BZkJaTLg5xUgzlakU4jFz7u5ETiQV6K0kj6gLAic1nF7oSdtGXLnb4og\u002BQ6bbh1ili5iRP5MzX8YO0hBE6sqWk\u002BSlsn4ApbmA9\u002BNcheiSv5QfVEZSd243aiL/h8UILJnUICev7Di1hvOzE\u002BDmPWo4bVmYZC4uDMOgdTIXGoMJGHMxHHaIpSO\u002BhGghL3a3XuCd/wCdkwWynh7Zd7a\u002B0O/nwLxgplbmRzdHJlYW0KZW5kb2JqCjggMCBvYmoKPDwKL1R5cGUgL1hPYmplY3QKL1N1YnR5cGUgL0ltYWdlCi9MZW5ndGggMTMyMQovRmlsdGVyIC9GbGF0ZURlY29kZQovV2lkdGggMTUwCi9IZWlnaHQgMzUKL0JpdHNQZXJDb21wb25lbnQgOAovQ29sb3JTcGFjZSAvRGV2aWNlR3JheQo\u002BPgpzdHJlYW0KeJzVWGtsVFUQPtstWwrUNtIayqMEWxtSCvGJ2CjiA0TAJ2qgIKLEUCFIqRpqELUi0VQtCdiA8bGYKCkiYopUUiW9wVTUhPiEIixYioZHi1AoLbTdjvex58zMufe2G/45f9rzffPNmf3u3XPnrmCReu/LG2sNo3rtwlxx2TG1mEZBDB3O0KJgvNVChbVdoOLPZSHCjexEBs4yWRFhxtldAY2jTpn0PygYfQD1D1KiVuspuKAJeAwk7EbGXE2FaxDv6W8jBkteZEGDfmTYEygP/EyJZt7UmJ\u002B0nuAYYXO6GTWTKncg3uggt7Pk48nmZdjFoKVE/jDfdQQtPbddbwp2\u002BVoFq6n0MOLS/50s\u002BzkR/IIBZUSdsJ\u002BXvp9wL4I7Kn2tgh1EGooivjaG3cSyW1LCbL2OfqZZ2q6v9N4UtVmzCk6QsnkEXyLBL1n692z1SaAXq6BaUbO9moKpvlYBDMG6DxF4sgTze8AvqhN7swqaJHNNm6d8lK9VANOxbimBRyq0yq8pYwBtymUVQLrDBL7zlF9M8LcKVmDhMKIdeG08NHbsTaVNua1Sfj/O0TP1xkHr7\u002B9KuklS6OlWLFyP0l/Jfh95NnUggzWFVp1XKcsdpoHKvr3DsmjYaxdw4zx1j3yt0o5g5dMo3kI2zKIPAxnHhrOmiFV4llTZzHQqK5HXILdBnUl4iyzHxDTJDibqVXTHde6mmrWHa\u002BIhj9IHbepzInsLFRm3uqzqmoiZd8q8AiKfR7fM7NCbar2eNyXmKyqCt1FPismE8IpCY3/hDrSqZgimlkj6SbLteCYs15pqn6hVTowobtU0zLPsuI3oVgh3oFUwOxFTP5X8m0SfxpTp/MDpmqGXRqsg92b8/1mTWur7WXWrWpJEi1rsk/w2lJ/SpFPYRHWPXplYZYgcLBM2ufWkqyt6teodIQ6oRVSOOftQvpspA8Vv0LjFVZpYVSjScPGbyW0nXSW6lGKLInuyhSDzyASHD5ID4EOmrAAW\u002BxO0ysSqU\u002BZgeEGtupL4hDZK6HEdkjXm8mNcLnISson8Bap8CbSYp5UmVr1uLsmpeSPv6nnUjH/U/kOe/dPM5Wpcvu/kke8OkKlXLNabggi/EqEjium2zlYykj1NLxHAubExSWZldKZmFew2DANNh71O5jKSMRr3nAPuKGJdkWm/3axsnMT1evbxAf5dMliI5CkfXATI0azS41I/u/gGRLr7qS3v83rcNCVTq5rAN34Q4jGORE86TbclaFa54lq7eh0CEbXlpHZPRbG3Va7oCIrUS57Mnj6sAnjKrv4PAtvljje0eitODIrLKoAxQnzlSbzXl1XOjJ5CgIrYjqOb/SSlcVkFMFeICZ7EM31ZBfW2LQRY6GyY9bev5ExaXFbZn2\u002BzF1Hg166K89adV0iASfaGGYdoUiefc8visgrqrDpejaewE6S7MRb0gWsdBGVkPdTaL/UXVmZOHpuU25yhPIns2C5Lk69tqzXljT0NehzmVm2S98O7BJwl2EvDOYsfwL1ZrL\u002BJvG1XKSaIeiDsIaD9i0H\u002BX3pX2/j7711SSl8cy801\u002BY3AOlZDNazKShPKZkdXR6YJJR9HoPMqWZpOn4/YyJVh7f3tVWZVRL270BnvG0GfqdbEFeTvW2tsyQaGVWpWfaa\u002BlvQyyOl83GYy0B4tHyGqzmKowVPcTVDzKg8ly1IR4A2Enc8yjE3KnVki1EBU6iqIEoJirwNnrKzaadRtrViQIy4vMubTKJS/m01mcL74/8Z/SyIM3QplbmRzdHJlYW0KZW5kb2JqCjkgMCBvYmoKPDwKL1R5cGUgL1hPYmplY3QKL1N1YnR5cGUgL0ltYWdlCi9NYXNrIDcgMCBSCi9TTWFzayA4IDAgUgovTGVuZ3RoIDY1MwovRmlsdGVyIC9GbGF0ZURlY29kZQovV2lkdGggMTUwCi9IZWlnaHQgMzUKL0JpdHNQZXJDb21wb25lbnQgOAovQ29sb3JTcGFjZSAvRGV2aWNlUkdCCi9JbnRlcnBvbGF0ZSB0cnVlCj4\u002BCnN0cmVhbQp4nO2YTStEURjHz0ZJdwpp1CywYicb2SgNRpOyYMHQmKJQI7IYJjFSVhaUkJd8AAt7H8AHsLORFStZyMKWW7Pzcj2v59w75uksz33u//x\u002Bz7kmBlxe8jx4mUjVn8f582gf27jlqlAnBaoUbIVqyDnXlzfK6hMHQjujhkFgZlorcgxX\u002BlAGQ6JP0KBUEvGPpysgFWDQ4OffuT4Nwqj\u002BDgPz87QO7Yv/dAkD4UgbREWay8w6v4DBQPj6lPqLcOCnSqQOXjfr3F5AkYNUmEFUsFJuzK2\u002B384ipU9pQsJjMD54\u002BLwR4\u002BszYTVoLTC2syDPteyEW33fj8PpAASlNxjGusGmgePH9UaOPuPUYHAepcD8zrJUl6eyDvWRDUJSKQUOm8H6/tOHYpymTxwIn6HlwLTm4lEXMjMO9REMGmqJB6b1h6eNJc8gDf1td6sJrD5ToQYh25j94eVfrkI2A1mnc0lXNKwZhHcmZxAM71\u002Boq8Xui/k\u002ByJoeX9AD8n8MyoaH/8PzMt9T/tiK0yAA0TMoPkhMJsEF13e91NnQf0LAogREBMKPeyJkEK7vZqU9PnBEmG1sVHGDHuDPECEwaikZhOu7LbQkUgfY8dAGIviUdmCPdM2DIcP13Reb24b2CBOiTUMDr1Jgj/eh5uh7Wm/oSO8SXmEBiAbbSBiE63vZ8LqGd8hzokfDE72GNgOjXsTU91aq7R3ZJM9J1aCGQbi\u002B962a9GiBMyqqNGSx2wlMyEzW56/8ZI4QrGpQzyBKn7/I2azRkJLIuRRkI9r6CFiYJ\u002BI/XsEGafoITAgPChokS3QSGL6ZrI/AhMmfb5Dm0X5g\u002BGasPqZBT2ie7SA1USimvnJhDdqsj2pFvD4BATXq9AplbmRzdHJlYW0KZW5kb2JqCjEwIDAgb2JqCjw8Ci9UeXBlIC9Gb250RGVzY3JpcHRvcgovQXNjZW50IDkyOAovQ2FwSGVpZ2h0IDkyOAovRGVzY2VudCAyMzYKL0ZsYWdzIDMyCi9Gb250QkJveCBbLTEwMjEgLTQ2MyAxNzkzIDEyMzJdCi9JdGFsaWNBbmdsZSAwCi9TdGVtViAwCi9YSGVpZ2h0IDYxMgovRm9udE5hbWUgL0RITlZNQitEZWphVnUjMjBTYW5zCi9Gb250RmlsZTIgMTkgMCBSCj4\u002BCmVuZG9iagoxMSAwIG9iago8PAovRmlsdGVyIC9GbGF0ZURlY29kZQovTGVuZ3RoIDU3Mwo\u002BPgpzdHJlYW0KeJxdlEuO2kAQhvecopczi5Htfg4SKgmMkVjkoZAcAOwGWQq2ZcyCs2WRI\u002BUKMfV3aqQs\u002BCTXo6vq76b\u002B/PqdlfvtvmsnlX0d\u002B/oQJ3Vuu2aMt/4\u002B1lGd4qXtFoVWTVtP6YtZX4/D4pl8eNymeN13516tVir7Njtv0/hQL\u002BumP8XX7MvYxLHtLurlR3l4zQ73YfgZr7GbVE6kmnieT/l0HD4fr1FlnPO2b2Z3Oz3e5oxnhOKI748hKs0ZBTqp\u002BybehmMdx2N3iYtVnueGZm5KWsSu\u002Bc/tU9bpLOEFh4MmJzaVJDRLmDQJ9Q4mR0KjYVqS0Hj66AbU6XhLQlPAFEhoLExbEpo1m/Q7Ca1jk/MkDAYmrgUGVLRIYfqUyH2DAd1b7gj06MvlJPRbmFgD0EMJxylgSIlcCwypIssCBohjuW/Qo/s1qw5WGNuxLGCAOJZlAT2irCOhT9dRkFBXkJCbBG1qlf2gR5TdkdCXMHFHoMebWPMoYBVg4vJghYFyPgXU6SxOAT2UKFgp0EAv40jo0kB8EaDGdRi8mZBuYIGXJ3RowrIf9IjalCTcJQnXJPRpIO4brNIDYD8YEOU2JAzvOIs/QA9TzqqDGtqbJQkdlDA5CS0qah4FtBhIlyS0uA7DtUCHio4fCBgwY85\u002BUCNqw7KAO2if88GgThuAU0CDxII1AA2UMJqEFv\u002BONX\u002BAVdoAPApoDC\u002BqfxvpubPmtapkH9b3cZxXIe9e3oHP7dd2Udbz0A9qznr\u002B/gJjPF0iCmVuZHN0cmVhbQplbmRvYmoKMTIgMCBvYmoKPDwKL1R5cGUgL0ZvbnQKL1N1YnR5cGUgL0NJREZvbnRUeXBlMgovQ0lEU3lzdGVtSW5mbwo8PAovT3JkZXJpbmcgKElkZW50aXR5KQovUmVnaXN0cnkgKEFkb2JlKQovU3VwcGxlbWVudCAwCj4\u002BCi9Gb250RGVzY3JpcHRvciAxMCAwIFIKL0Jhc2VGb250IC9ESE5WTUIrRGVqYVZ1IzIwU2FucwovVyBbM1szMTddNFs0MDBdMTFbMzkwXTEyWzM5MF0xNVszMTddMTZbMzYwXTE3WzMxN10xOFszMzZdMTlbNjM2XTIwWzYzNl0yMVs2MzZdMjJbNjM2XTIzWzYzNl0yNFs2MzZdMjVbNjM2XTI2WzYzNl0yN1s2MzZdMjhbNjM2XTI5WzMzNl0zNls2ODRdMzhbNjk4XTQwWzYzMV00NFsyOTRdNDhbODYyXTUwWzc4N101M1s2OTRdNTRbNjM0XTU1WzYxMF01N1s2ODRdNTlbNjg1XTY4WzYxMl02OVs2MzRdNzBbNTQ5XTcxWzYzNF03Mls2MTVdNzNbMzUyXTc0WzYzNF03NVs2MzNdNzZbMjc3XTc3WzI3N103OVsyNzddODBbOTc0XTgxWzYzM104Mls2MTFdODNbNjM0XTg0WzYzNF04NVs0MTFdODZbNTIwXTg3WzM5Ml04OFs2MzNdODlbNTkxXTkwWzgxN105MVs1OTFdOTNbNTI0XTE2Mls2MTJdMTY1WzYxMl0xNjlbNTQ5XTE3Mls2MTVdMTc1WzI3N10xODNbNjExXTE4OFs2MzNdXQo\u002BPgplbmRvYmoKMTMgMCBvYmoKPDwKL1R5cGUgL0ZvbnQKL1N1YnR5cGUgL1R5cGUwCi9FbmNvZGluZyAvSWRlbnRpdHktSAovVG9Vbmljb2RlIDExIDAgUgovQmFzZUZvbnQgL0RITlZNQitEZWphVnUjMjBTYW5zCi9EZXNjZW5kYW50Rm9udHMgWzEyIDAgUl0KPj4KZW5kb2JqCjE0IDAgb2JqCjw8Ci9UeXBlIC9Gb250RGVzY3JpcHRvcgovQXNjZW50IDkyOAovQ2FwSGVpZ2h0IDkyOAovRGVzY2VudCAyMzYKL0ZsYWdzIDMyCi9Gb250QkJveCBbLTEwNjkgLTQxNSAxOTc1IDExNzRdCi9JdGFsaWNBbmdsZSAwCi9TdGVtViAwCi9YSGVpZ2h0IDYxMgovRm9udE5hbWUgL0FMWE1TUCtEZWphVnUjMjBTYW5zLEJvbGQKL0ZvbnRGaWxlMiAyMCAwIFIKPj4KZW5kb2JqCjE1IDAgb2JqCjw8Ci9GaWx0ZXIgL0ZsYXRlRGVjb2RlCi9MZW5ndGggNDU1Cj4\u002BCnN0cmVhbQp4nF2Tz26bQBDG7zzFHpNDBOwuSyJZI9nYkXxoWsXtA2BYW0gxoDU\u002B\u002BNl66CP1FbrMRyZSD/4hz/\u002BZnfn7\u002B09a7bf7vptU\u002BiMMzcFP6tT1bfDX4RYar47\u002B3PVJrlXbNdPyj9lc6jGZnQ/36\u002BQv\u002B/40qNVKpe9ReZ3CXT2s2\u002BHoH9PvofWh68/q4Vd1eEwPt3H88BffTyojUq0/xSjf6vGtvniVss/Tvo3qbro/RY/ZQrHFz/volWaPHJU0Q\u002BuvY934UPdnn6yyLDMUuXGU\u002BL79T22e4XU8ibkpSFhomkX2mYSuYFHhSFgaiDgPWGYQaRK6V4hKEpYW4S0JXU5fNYMasQznAgtk1OwCWjhq1oN2qSsnoduxqKxIuFmzKOeGQYO2c04PGhSR8wxAg0nk3Apo0JDRJLRoO36ErmLRmgODu6Vt1oMaVpaLBN0LMnIroEZDmisC7fJCPBawRPiC9WAJK12R0CK82ZAw2iZYHuEresy3JDQYocGksAaYl8VDMN3yHBkJ3RZWPDzQLTvxQkLnMC8uEtwhY8F6sIRVgcVllpp3/nO55/WPF6rktJpbCPGq\u002BIz5nOZD6novlz4Oo4pe8\u002B8fw/YDGgplbmRzdHJlYW0KZW5kb2JqCjE2IDAgb2JqCjw8Ci9UeXBlIC9Gb250Ci9TdWJ0eXBlIC9DSURGb250VHlwZTIKL0NJRFN5c3RlbUluZm8KPDwKL09yZGVyaW5nIChJZGVudGl0eSkKL1JlZ2lzdHJ5IChBZG9iZSkKL1N1cHBsZW1lbnQgMAo\u002BPgovRm9udERlc2NyaXB0b3IgMTQgMCBSCi9CYXNlRm9udCAvQUxYTVNQK0RlamFWdSMyMFNhbnMsQm9sZAovVyBbM1szNDhdMTVbMzc5XTE3WzM3OV0xOVs2OTVdMjFbNjk1XTIzWzY5NV0yNFs2OTVdMjlbMzk5XTM2Wzc3M10zOFs3MzNdNDBbNjgzXTQ0WzM3Ml01MFs4NTBdNTFbNzMyXTUzWzc3MF01NFs3MjBdNTlbNzcwXTY4WzY3NF03MFs1OTJdNzFbNzE1XTcyWzY3OF03M1s0MzVdNzZbMzQyXTc5WzM0Ml04MFsxMDQxXTgxWzcxMV04Mls2ODddODNbNzE1XTg0WzcxNV04NVs0OTNdODZbNTk1XTg3WzQ3OF04OFs3MTFdODlbNjUxXTEyNFs1NjNdMTYzWzY3NF0xNzJbNjc4XTE4Mls2ODddXQo\u002BPgplbmRvYmoKMTcgMCBvYmoKPDwKL1R5cGUgL0ZvbnQKL1N1YnR5cGUgL1R5cGUwCi9FbmNvZGluZyAvSWRlbnRpdHktSAovVG9Vbmljb2RlIDE1IDAgUgovQmFzZUZvbnQgL0FMWE1TUCtEZWphVnUjMjBTYW5zLEJvbGQKL0Rlc2NlbmRhbnRGb250cyBbMTYgMCBSXQo\u002BPgplbmRvYmoKMTggMCBvYmoKPDwKL1R5cGUgL0V4dEdTdGF0ZQovQ0EgMQo\u002BPgplbmRvYmoKMTkgMCBvYmoKPDwKL0xlbmd0aDEgNjIzODAKL0ZpbHRlciAvRmxhdGVEZWNvZGUKL0xlbmd0aCAxODg2Nwo\u002BPgpzdHJlYW0KeJztvQlgFUW6BvpXVy9nyXJONggJSSAJuxATFtmPyA5iBERAwQAxIiqLyC6GRTaBAQSCIkJUUAyIEREDooIgi8CoA6iMeHEB0TEi4\u002BAykPR5X1X3SU4CjM6buffdN/ckfPmrqmuvv/6lu7ohRkROmkGcPCMmPpRC99ZujZQ1RMzMG3vPA\u002BOaTxxFpCBOm\u002B65f0re6CdHDiDi3YnqZ4y8e1hu2NfsI6JGk3G95UgkhK9LPox4MeJpIx94aHL6M6dfQvw40bCC\u002B8eMGMaL/5JDtOh\u002BxEseGDZ5bOKf9XFE59OQP2Xsg3ePbWv8FcHznYm0kawFldBh/O6hIlrDnkcsDxfHIaVQ2UpzaAJS9rLDbIFyHdKepwt0DDnn0WFepBLrSVlIJTqpKXSR9adtqKM1i2GtDV0ltY\u002B6Te2rlqjn1KPUSh2vHlVz1PEsiz\u002BrDdCeB1rzd5UoOkTJVMJO03jayb/lWXyX2lmNoNP8KC\u002Bis2hFRf2HaQmtp2noSwwbQ/nKNKUvUg5oR2k1fsfg\u002BlG2lh1D73ay2XSCnuCq0p3WshMY12H6mWbz/ko\u002B5jRLyUP/D6Cuoyi/msarpJ1gLjKVxkjbJtaEhsu/tfl12gn5e4Hy0XJ/Wq\u002BX6DFGKloRM/Y828tK9eVUSMf4nXwc/5TNUVPVjWp3WmLNAM\u002BhJah7tSij57EpGLv4nSZqVyapOayIvlVzjOGo\u002B10xIrS5TemLEeXRLmCS7sGY2rI5fAF6Kq7WpqNGT7UZyqMGYzpGTTSGt6BRCE2jLbSVruMFtAQ1yfHqrbSfUXKN\u002BgXGvIQtVn6mo7wzNaQ89TzmmmKICoheN3RN5QqjJimeYiW9R26x79aBKQcH1bmuSbVoisdIKabs4vApKSV\u002Bf/ZANUEbVKwlFvN0R7GanvrFtS5\u002BcV2TXtkDU4rLu3S2a\u002B2S0xlp/QYiKGJIRnqXzvKaaLRYS8e/HjnFKSNGpjzmeSy1zWOeu9tch2mjPLNAzdPWYycZVMsXpl4m/TJzaPmKSs32HS\u002B9njzHS4\u002BXZkR763jT63jr5KlUNp4nlJ01C4yIX398UG9ICjgeFWknUIeTWvgiDZqtzlQchsY4OM3lKetV7O4/cAeRf/cNg9qVZrZufT01O1N2JINtJ3eKO9vNh6RnxaZ6s7w8lbMWhw8fjnk21jS1E\u002BXjzKfY3VgU7Pdi80dlmh5F4dTKF6k/Qasiwg3iUTpFuyI8p3oVR4sWXKKFXsWRMky\u002BGwadySz1iuY8ZaUZTFdiY6JqpNZTWjSPaqVMmztr9pzCgpUrVulRX5sdzp0z2579ju3//DTbV4r21qO9MbK9ZIxItGcwckep0Q5Ce\u002B0uVtYbnRUXFRujGKkto1o0V9ajypUFhXNmz9ajSs12pz8323x3lr177hx7R45jrT\u002BK7SWTNIr3hfG1NFvnKounmjqqOn7EqrFVVixPjb5wbP3MvuZmczfzoVwuO63kK7Mxx97ttEZRGameU0fk8mRE14mtk6sklJ9VZq8XbXyKP1vQBvK\u002BTrMVUb2KejHrsu7UT48dM00hQ/2dlK1y3a7zxVAtpjClFifeSVlHM1WFGG\u002B2Tw7yYmkGmMvwaN8LDKrLsliq4igq/7VIO/H3B8T6KDTP/5W6BDvbTTUo1RetF0ZRYdiyqEU1nYmRSTwxNqEmenBR8NOZi6We8xmsruL1RGVlRnk9Sv1M8noota74qyxc8/TT\u002BPf005eZ0/zl8mXzF\u002BbUss2j5hHgKJrOYs1ZVqE53pxrzjPHs8VsCpvKFotxf0GkDsZ4sPS\u002B2E68UFUKtZkGFTodyXoip2Tm9hy3uYMJ7ijdZ01K5kXB4hgihrYtkkeqypBWdbxai/QsL2bWZD3NJ9nd77GeZeuL1PHdS7pfOlEk1xK7Xe2JMSfSWl/9\u002BFoJvGaiV1PJq2lqJ88z3hXhhTHLVEh98rgU5kqs4eF6bbEbYvv3Ko7rf0ev4pj\u002Bd6AvXHAt9tru3d6o1nZ/gqZc\u002B54VJ3q8NVqjd77M29QB2gBjqjpVm5gwL96ATohXa0E4JD5EE/UJtcYnPJQ4i\u002BbGz6o1K2FW4kbamOAdQkPSMYwWLalVB9aieb3UurrRogPLylRjY3RDJyiiPWW9MZFZw25\u002BYe5dxyZPPT7wGxbT5Y5482JRUdEktqzNA6t6TCrodNOR6zO/eefODWNrm9/J8a/Bmo/H\u002BBvQWF9Tio12zXUmz02JLowNL3Qu1xMLU5anLtMXxT7XMC4xmnhMfGK9FE8ij0l26g3FNMT1D8yAU84ApgDbqoZkudIzF8\u002BUer4\u002B75G/mJcM5nPmJg1LHpaSW0elISyJxcaoderWq98iCUNpiXE1Zi2sQJUB8o7LnjM/ML8ZemBU/4MPvHVgx4Yt21eufe6Jfm89OP7QoK9Z2B94evK\u002BpZ/9mJ6\u002B9/rMgiWPrnx\u002B0tjx09LqbUtJ\u002BXDrw5sEb\u002BdindeDrxRIg5m\u002B2iychxPn4Z2Iu41CSLmZThbmokTdoYZJWeTGwMLlwMLEwI6321ea6ZVC7zjEH8Yil1Y9hOU9JBa1kZsaUXcaRPfSJHqMjDjWmOqxxrwl68NuCbslfADLYxPYVD6HhWMxnawOz/IKgZnqrdOC66bCzBbmiROHyodq6WVf8aNlWRvNQpaz15Y3X6m56HttGupLVWsZ3rme2rUKjZhCz4JwpZBmhi8y1ifVSGQunghRrSd5yljwyniCJKpH7BkskmffebGNxT7GApn7rPURQsgrZp1iY6jKwoj1\u002BIzHlxc2GdjkEkszj5s/DN07cvDu\u002B156772Xbn2mv3aiyHw8MtI8/5e/mj\u002BlpBy\u002BPmP7mjXb0\u002BpJubIE/S\u002BQciWNBvrSonUKnxtGhXF6YWLcBk9h2IK6yxIXpYfVdSbGJ0Un8jrJCekQNGCkM1LUnCk7U8lCvhjYZeyocpQfVQ9rh3WMfGuSMoQNYXX12Jg4q7cstilLravwwFBSU4RYqpMZp6yfv27dfIA5ez/V\u002B\u002BCxyLZb7/uCaeaFL81y8zzLZgm9n\u002BJtdz77zBtvPPPsTmVKSVo980fzh9uHmD9897X5FymohrMNSZY\u002B2wieGol10WmEr6bmVbjCvSrkhoY14RpnEPC64Sk7sk/qmWZXiGCxSAPfhNIWysEgA\u002BvkbXXDIF/UQIXpvJbWWuuu3cOLqVg3wDNYHJbK6mzku8u/PMbM8iztxIBLM7XGoi\u002BcFmKOF8o5TqVmdJMvvSZmuL5emHRdYdSypEX1n8uoGZbWKDE2LTHSCUkOcR5ZJyHDU7av9OK\u002BUjm5gT0rY62xWYMmNL0ppE5aVmacEDdy26bWTWvRvGV0IAP4Q1m4dMOGpUuf32BumLWM/P912lw28/HnzF9\u002B\u002BcX8ZX33ZbNnLV8\u002Ba/Yy5d3V8\u002BatfmruvNUDUrbOePWDD16dsTWl7v4lJ7/55uSS/WzYQ7NmPQRIvpmJMc3DmGpKvkk1kuPZXIovdG1QC2lBXHKhZ1nconQjMbFOdBLVrZsYLtkGAwhoqK/NnwJcE7cv/p1auxN2J\u002B6u/U7SvmSjKGpX1LdRHHzTSvJ4VHQEOIZaNKcsi1fq1mOBgWEWvui9phe4pc3W\u002Bz83LzPPl4wzr/mKebb3GtbB5qhk8AoLZ1ED7mSR333N4qRyW2fekaSsCvCTGNMFMM5eNVXaaom\u002BCH22\u002BjzUuzSzajo8ZZAtQntctJS8kBAXjh0Tql5NNeWceIR/IuWYi97x3UheGBGaqgh9xbwu7iKvArnmMqDEdJHo9HKXQ1yApDNWCjmnOR3wQ4R169Rc0Kb7agjmbHfmeGlAqkmFVUEc3wdYVoQH1d2aEsbYEF\u002BnSBapRBqRjkgaSBNpLC0ip8Ecis6dahyLVwawgUp22D1spDKZTVQe5g\u002Bqk4zJjnlsvjIj7AnlSV6g1rAEobBEeB2equwyzyvp5rSzSus/zS\u002B/a/4JLaI8nm\u002B51JjlmzPlfhvv/0qrD36Ip5a\u002BWuHPRGxxrfSyZ2iLurLGMu\u002BiWkZ8OGXEeGqBCTJtFhDM/PP5jG2RCckJCmSEkAu2LGjZKjaiIhKn1c87N8tP5gXmYTTrXN6o7x81XzKnsrms39zvteEn7hpqHjA/MU\u002BaB4bedax7d7aOYWRsXTfZr0OQAwuxJm5q6ovVV6rKSprpWKm\u002B5NKY04BMVsNEl47v2yeWVvYpY2tyOCZRylsbh3hxeS3lQHlr5deyDkKcdi0q/6ooUD9bLm28pq/TywpDjapQvh5pkUsrSNqFzBeeofm0bC1HW6Kt0/Qh0Vne1EPvvaeduNTYrkdPRj1h9LavOfcaDkPxMsUhCFecLicYyOXs5DIU7uD0ssMNTgGbaC49Ue3gQqPhGEaZ0O6CX4Q\u002BrFHJMJJNHLZk2zo2QrDIAC7Yw6m4YpUYI9pVT6lnpBj1XCmu5kYL173Kw8o0Y4prhjLLmOVaqsSpzM2jWQJPZU14fUcDZ3PWjg9wDHLe7RjlnOiY4pzJFvOV7CkeI2UhGAe6EwIRI2TXseksn133rpl/2Mzfp50oc/BfLzXWkstIpUtfyH0jeOdkkG27MopWWrZtfGQWj4/11JSDC7JtBWdkSau2vsUl8i\u002Bvf8osZ/zUKcZM/ynWhk0255v7zXfNeWyK1tssMc\u002BaX5slrDurxRJY9/XmHeZaIQXYeugNaA7ZF6yDBo1J0bA6X/G1wH7kLt3LVa55VZV30lWK5WrsSmfMyvCZblXTuddJiXERmis\u002BXvV2jHElhqm1BUdBeGMJILjlgggDOKq1\u002BA1WM9Lm3OpLklt2ajTTSGMaNqmhxlIsi1HieA01ndJZulKP19frGfUc9ZwpSS1ZS6Ur66qM1CaoE7RJ0fP1\u002BcYT\u002BhNG8hBpttWITuVNWWMmrJcUoROY11YDfPGN0zocPfl2z4WTT73HDjIqm12\u002BwHx85crHlV1xSx8xR7L8guHlC7QTH32yeKdyS/n5ebNnzxG8KXyPZ7E\u002B9ekRX7vwMCXCrSQlJzmciuFSkpOTOrncSclqLKPYZ2JW1FzpVVfSinRs\u002BgZJLndygkF1E\u002BIjrjPiY\u002Bo28Jzah3U8A6kv58UjjVAIAc/\u002BCnaNELNiE0xOZENMzvbkhs0a3tKQWzJCCv3kqxiozVhAE6rdxx\u002B5a8Ork56f\u002BuXH5mfmuVE/zJhW\u002BuBLu\u002Batnvble6zGT/f\u002BWVv/bquWMyaOuDs5vvHJ7Sc/z2j2QZeu8x8Z/XByzet2b9p/BsYR81\u002BC7PgWvGBQT2gDITlU5oPM8GkOz3FYPtJuyMyAreAStoJD2goOcgRshWhyJpOHeZRkw\u002BP0Occ61zmdQ7iQKVgbXf2h/Pzh8vMQJ5dOaFIGBPSHTq/76qteTdc4DBddEJXjOiQCo07wZ18moSRI05gR0BFw\u002B6\u002Bx37Mdgr\u002BGE2/Eu6ndtMF8Op/N4ZcYikN16oLPaqm1tEawiOspDdWGWrqe4riB4Acq7dR2Wiu9O3VhXZQeag\u002Btmz6IBuh5yr3qvdpUmgjVMUWdok3QZzjgv\u002BsNwX9QGE7oDKVn\u002Bf5j7CT785/KD2gnLtdQv4WQY9Qe42srZXGeTw9XdXKFofunIHu3zaB8lzIEMwvh5tSbQdVm9CrulD3QF2N4MQFOr8vtkgYc86K4ZnhKK/75YnDJIIdTNUhzqjpTXFxnkfgZFC1642Sp\u002BMdmnmTj2YSTZopCJ807zUF/VmK1E\u002BUnlMblWWW/KtPK5/DaYg2K1AvKAj0P8vx6n5Nto1dV3pmpnlOllp9OvYqdMN4jYLy/Sap/N0rARYSYFwsummFjWK0nzZ16nvkYmwh5Mg175zp1GiyCdNoFLzbZXcMZQS/W0HdEeFPmJu9M3JFa4l1UI4xq8JrhToc7mTtiutSDBDlyvDQz0zJO9525WAbBt19agl4hRHyjM2pnJGUkZ6Rk1Mmo27G\u002Br7YvyZfsS/HV8dXNrp2dlJ2cnZJdJ7tudv2x9efUnpc0L3leyrw6c\u002BourV9Y/0L9pEDRQKFAgZyknOSclJw6Y5PGJo9NGVtnRtKM5BkpM\u002BrUDLbh27NW3tQWwiSrByszq06wRxinvHV688wxT\u002B4oKem4a/7mw\u002BWXmfLCqpzt/e9\u002Ba/DfLihZedOGjz\u002B5rWHv8plFecP2PPvm7qj8hU2bFtWvXyZk707M1Xo9BgucSDf44vmOsEjnjpqxiyJLElbFU1RUt5phuqNWVylfMy9KvXpGWMj7z2dsz0makVSYxNHPgF2IrjLpZHg9CvpaX5hs/OwLjz/\u002BgkD5H9q8Mu0I\u002Bf1Hpr3SZscOpdnhc\u002BcOA0rf3GHmLvNX/O4alrsRvWE0zv8VP4c1jKeOvgSay\u002BarEXPD57t2eNUdNUqEcRMVTt1jusC4ORMwbjzmxfOen85n\u002BNyRCZ6EGQlLEwoTNBYkwLJsI6eubeTwc32ezn51//5Xs5/uc/OGIeXmR9Cc\u002Bm3Pqi02N2781dGjXzVuXJSWhgFFsCjWJlXqKvRLHYweeqz5qrWDImJ2aI5FESVsFVQHOZRu3ih3l9ryzlBmZsV87asyX94sezkVqVTjWJDfwJ8tKWnzysOH/eQ//PAr5Qcwcxs3Yvb4dmXo30s35g5jnZkDv52HmbH2BNr9ysd8xVACjfWlQZc55zrma7EvMm1HGHuj5o6okrBFiQmxiiPWQb2UqMguibKL\u002B\u002BT9GTF9llN50fIPGnasPbZ2Ye0Pal\u002BorXWkjqyj0jG2Y4LWxGjmaOZs4hpDY9gYZUzsmATnkHFiiutIhVBpQoIFDDnthppftjXs6OujDgwf8cF95kXzAGtY9iUzSpQN81fviFCGDn7rQPPmWxo1YTcwF4tmN5mf7Vu1bctaIReaYcJ/xVxH0yBfouZhYY4XdTaPVkXou1xKNBxEp\u002BYIj3T3jhHGn0sYf25h/AlRIcLy1uy\u002Bsnb79kVZt2czy6D5MqOEL7fdF5sdWxgr1Bs6WZtZCiK1RZbYXsqvxSNuZs3MD3cUF295U495MnvkiCVlzfiHS/q8sUnMtTlAHYy5dlMDaKnU\u002BLDazqi50XE7IvmOeqkl9Xc5d0S\u002BWat2vXhyhHXTo6JSujSUfqXFDvvOWAxhnhAz3Rpc0WhGo8JG1XZRDY9SqWfbM5tVosAqNVpk8Wc3rFyxYcOKlRtKTPPSsM233rq272vbWm99\u002BI9lZX98eGvrEqX9wVOnDh44deo780vz29pJrzZp9Obbd4wYDvNMeOFtho8oEvMLB0zNlfPbHDvfSTyC6fMivCVhq1wwg6mPkI1dY8TOlxu/nXCNvVGwGrbmxDLBxaleq8tecaNbyiI1t\u002BThh1du3rGj06sT9uxX1pffqaxdt/at9eXz9JjytXfn/iD20B40PgXtCp\u002BvMbT8W\u002BortAs\u002Bn0OlrhU\u002B35myUuxkocOznTnQ49jJwnwXLuCeEvyoOZcL9ZhvUZ//U3OArM9NkdTZl\u002BhWDIp4K8yYp71Ju8Je8Tg8mn5LOHOEUVePrP1M66hK314uAhry\u002BrzZ3hzvWK/VUIxu33uzGnzuta7X39tbtrroo91rhj2pN/hW\u002BiKVY6n7Oq1SmIO6VtyX9oV7bPdjrHZB060BoPN6zN9L7fk3aoOP6tJgXz09ylkzkvTaRmzYvNopvCRhV7zHIG\u002Bkw6Fnex2R2Yk1IYZTpZlbBqdD3lVt1\u002B7MRel4iEXxRWekZaeNTVuaVojft9NOp/nTnFgluS6xwWtVuWix1qI17LJ71stv7XhwwpLndzw4afHzO3Z0LJ4ydRNf8PDEn74US/jMGrGEytpnn3r7ufJ5as6We4Y/bN3zkTyEMUTDB63CQ7uuzkNnAjy0LSf2/VilOhfF/gYXoWnBRJa8myD3YA3swWh9RxTtCCsR/ktU5K08KrZLtXvzvtSO8dNomp5v5DvynfmufPe0sPzw/Ij8yHxPvndaVGH8hXhv1btmVW7hj1\u002BxedPK5Zs3L7/AoszzF/5q/sC8/PS5Q4fOfXPwwLdrzINmqfk9hFtryLAYdoPUFTshJ9ajj0JXdPAlBHRFScQi9ibfVRt6opvUGEHa1XPmTEBd\u002BJyWvvg8SWVD0ismx1atVVTu\u002BB07KjWrckNA324s36K7ioJ0K/suoDAsXVYhx2T/Arq/JHJRwpvxu2pLzd8NNkCQNgv0b3\u002B1/gUrMBak2CCtvKmsWUCHKeMrNVubkpIKC6B8S5Bayy36\u002B88B3uI90T8vZfhidDd2g5vPiyhx7jJcOkz\u002BrlFCrEpZAT12/IhQXNuyo9dFC66ydH4lS9XgPZN7NFnzAmZq55zopol8W5T38FvlW8FQeSM0TbY3BjbHAbRXn87ZPlc/2\u002BXqV\u002BlywRZZoMbMjV1QU9gi6SWVPlffBEeE4Yip26WB6NfxKj4X5P1PwjiJqupzBVwuqi/8hQcSXYnuxLCmULBN3E3C2jrbutq624a5UyiFpSkNXA3cjaKbxTSLbRTXIKlBcsOUhnXS6s91zXXPDZsbHiVGoCi6S3fzMB7OI3gk9/B4Xosn8ES1trN\u002Bs4YdG97VML/hjIZLGxY2vNCwJlyHcdWdOz31SueuJWaPL\u002ByzcfCCBcNXdNy34ZdPBu\u002B9P2//sFmL7t7k2/TE53/M26Z23NKgQf/\u002Bvh51Iho9uWDN9tTUt1q0GHRrr\u002Bz0yLSVs9Zutu8PtwLT/aithayA5RShOSL5i\u002BRluxzzXG7MMnaCJypCyAqptK1HqqWWfIOI3vqypXOEpo6Jayv0dr0WQmN72SQ2zZzTa/ybb554dt48ba35zpLywgV9Vq/7k5KzhHWweH0L5MVAKadiqK0vsVJSLXKxXTElYZBTMe4\u002BkFhdYwWzt7b46kxmhbgaE7tbiKtoaDqL1ytsuHpsixBXL5WU3PTKhD0H2ftsp/J8\u002BbB1695ar0y7XLg5b8QFvpEsXww2Wg58zcu\u002B\u002BtKzEvebNEG4opMOP4v0Tgqnt4UbqjBNJUM83XNV3NcSjzDEs7Y7Ao\u002Bef8MRZb4/dFdGKdOUfGWuMkNZpqxXHKIhJ3fK\u002Bx21eC21HrzQhryhmuJoQS1YG95GzXB0pa6sB\u002B\u002BhdtW66z7HABrABvFBarYjj/LYvfxe9R5tpJ7jmEAPsWl8mjpBm6rPoTlsAV\u002BgLtDm6gVUwFYpq/kT6hPaKn2j9oJe7NjtOO3wOzqIe1XSXU1tv5cNZUP3mndeUnPK\u002BvPNlwsljwzAFLTAHIWx73w9tNvghrqc6m0uJ78N3qhyG1PcbpcubtVpmD/7Vl0YcmPqwjq5NLjumD63I8ztcjqsQwuQG\u002BHWLPYq9oonlFHiT7T447YmUsws61UcZj3iEvcRK\u002Bb3iHVzD7Lv6vf2KmjgbjDz\u002BTUlTonT6rpauHooPbSuLp/rDuUO7TZXtmu0MlrLc03BakzR8rV5ypPKE9oK1y5ll/ZH5QB/X6utKU6uq27N5XA7QcJilXgep9bSEhwJzhh3bJi4M5Wq1Od11HStrl7XSHfUd6a56rhTw1rzlmpLR\u002BuwjIiuSnfeVfWpnTSf7jN8js7Ozq7Obl\u002BEL0Ks4wAlW71V66v3NbId/Zz9Xbe5R1Auu1sZxe9WR2mj9FHGaOcw9z1hYyIm0AQ2RZnOJ6vTsb75\u002BlQj35jsmOLMd05zTXRPD5unzNeWRKyiVWyFspyvUZ/SxB2xJx2\u002BZgVh6yKep\u002BfZemU936Ru0l7UXzQ2OdaHvRzxmvIKf1N9Qytxvh2xT9nLj6jvaVMkTyQw8Y\u002BlulnqgJKvz578\u002BmyJ\u002BenJv/54EtxRwEcJXC7kBWWjwCNtsY\u002BmgEfc7CZfV82rG7rq5aohiKYyhXGvgmX3IqfL63QxQdwusIzTC4bp5DJUpjqwxxQ7hC0RFmCQSHv9JauACfTArhNh65n2Pm\u002BAJ67FElfuwidcquqqpca66rnaq9e7blNvNwa68lwT2VR1ovGQa7E6y/Wkuk5dZTzuWup6nr2ovqxuMJ5zFboSXVzVsAfctXisFuus5W7I62npzkbulPA2rDVvpTU3WjpbuzPCe/CuWhdnT7cvfJDYrcogfrs2QB9kDHAMcA5yZ4ePCZ/M8sOfYiuMTWy9URz\u002BfvjpcH94M/HIQUmVt2uwLdVc8z5WdNLcae48yV41HzzJGrKGak756fI9rMTsrvRU4sxxbInYpwOhmz/FGjjpaV8th/WsD1PcyfEi7eIvag7OSGW6K/DoOMyaTevJqzzXImd2X6b9LLD0ioeBvk5iH9VTuik9DM3tiHTX5AmOxo4Ud0ve2pHh9jGf0oX7VJ92k\u002BN2PshxlzuH5Sh5PEfN0YY78t0z3C\u002B7E\u002BynhOKkAKszjo8q761sK5uubCu/W83ZWPbp8o08HWNh49XzvG/g/pNScf/p\u002BO\u002B5/yTPjSw8YO58Us8z50s9x1LNCQr8AuiaZF\u002BEU3eF/01H2FOfO2M8p47LIzHNjpfBK82oc6XSra/0b9Vy8sSmtzeu27NZ23aNr\u002Btwb8agO8LCZnsjM5om3d7e77fub\u002Bl5UfWoM5FXp5v6Erl9Rsd6zeol1\u002BNDrqeKPK0CeZS1yBOzLaZpO7fR2OdMadqsnadpcjt1yPXIO86cIO61IG9XIjgdUwlLLNLFPQXZTnfUYSjzaSFG5dgWm1Q3wWh8vcyzFMp1jJ7nqU8T/bWJonT6W0XZCbL9vlb74jDZttiUppGy/ZRmTT0pyU2t9qVulu2Aqzw6TZxm6WzpW0Fnc8x2E59bLaG3FVV4WBpUtOSaMxk\u002Br6o2VzurHt2nZ\u002Bs5\u002BljdYflZ0XC07hROIioQfhrWuCPWWKdWvjBVE6tsqMoE3fCcKrXOA0GHVllpQ660IR5H2ysdnVrfSGXbV/y0cNu2hWK5f/pJ6qztWm3eU29FCTTCl0ZRRoRbZVFGpFuN2htvqHtj3d8nRrIIMmIHxE3ChpyYiNbKxGEr67hVu7Lj7YRDV/Ev0I8w2Y9E2Y9E/Nr9qG/dWEmVdq2w28SdlyzLEilrHVcnvF6aMl3Ju6OeL71KTBvcKia6R995yxPrBAKWXYa5Hlryl9U/J9wV2e4nSnaIVDr2TuOyAP3lo7LeEYOcp8Tq2yXkX\u002BMBE2seYf7y0aVbIwbZ6RU/NYeqR\u002BU5UVKKAPAOb8Fa8C30rr6N1mo1qMhYTeP09jRTyaJ3eTIVA\u002BtVova4fhL51ypfUS7op8pWIuSfB3wBFABrgFxA1LME2AgsBGYi7wVgragjALUjLUfH52lTyKNNp0NaAY3XG4JG0CF1NR3SsxBX6ZByp4C/QOuI9AlIP4c8ZaC9abx6zKLaEqTF0Dz1K/8l7VPaKuo0vqXO2jRqj7Qy0DvFWESfQQ/I9slfinEVqedoGsruVPNoHOg4tZTGKR9SMxHWomin0pr2KK39n6rPWmHjMO0U6epZmX\u002BnyMd7It6YxvBUaoVrW9RdmK\u002BFNAC0rQirWTRQq8FI2cpUQe25lHOP\u002Bdks5ggYCvQVedCvO4GPHcQS\u002BLsY51lr7sTcizRcOwHsFWm8BQ0FhqvExqP8FjH/Yn0QT0X6ApTPQfk9xh5aYGM45n6JnPerAONziLUQ6xAMrENb4FmshQmqY31cgXW4AttYPGieXIsgiLVQP0Z9LswX5v1qMD4FzbPWIRhYgwOY/6Wg/wVclPNvr0N1yPU9S93FWgRDrIVca0ExVrn21SnGLnnhGlTyKNZcjl/wiODX0t\u002Bmgp/tclen4HUtyn/W6A\u002B6hCZjns9gnMcw1xz0R8R/Aj2DeDHmoUDuC/AjJPAh9UHwKPaI4FO5T8CrEhPsPBadLygnO74LNB/1diVFrKOYy\u002BpUn0VHK8K9JR\u002BOq04dS2i8oxnGiT0o9oFNZ1XExb7E3rgWFXtW7JvqVPKMWLffScV\u002Bl3tO8Niuyn0v9141au/vFO0L/yope8Q\u002Bng55FgMUYj0Ca4011hdX5JG8hfWcjbFPUP8Cubgac/6hP1\u002Bu4SPkME5DRhyXe8Wl/SLXYQfm3SX6g321VSuDHLPn0uhD96C\u002BicYq7Jdo1NsK7cTQDluWPYi5yZX7rtj80ZoXqhmYH/0zegn1FOu1qY\u002B2D/n/hrF\u002BAp4OjLM/FQJ3qutoJOLjpHzuT0NkPBbXMV7BP/wCsJlilCF0yJ1Dh1y5dMjZDuN\u002BGfu6F669ALkxng4ZSNeHYY7sPSJlQGv/5wEe\u002BL1rJPdDtf0m5I3Y89X3g8XH/m\u002Br85sYG8YxUPB6lT7b5RxCP0ywdITk5ertQC5J2VB931fbrxjjC2hjL\u002BZJA/3qin4soQNV\u002BLz6mKvxt6bSGrUJdbP3\u002BQXtS8zpNilXxqlfggbWrlp/rrXvAjTA7/wIPaa/RTv5h9RKzI1RRuMEtCn\u002BcrQRBn52Yt\u002B7kH\u002Br7Bfagv7M5icoG/ztQr/DpA6oHL\u002BUJ7rPXo8l5MI4I1D\u002BZ7Tnhh2xRaZbOnCnejflB3So9nil3Nb/QA\u002Br/WiOeiPN0ZvTHC1byvJPtWV2Xify7YOOAmw5vdPWuxHKa/S88nd6iDeiXvxrullpQ3u05y0dHIDWGHWlyjKvynn5DHUeoxVaNxrLs6FjBW4Rdy0xNz3Qzw70KPCQehzh45beVor9JwX4K5g7e7/ZupzUv6J/hyArK3U6ZAt4SMyfwDqJB8S\u002BCoZcn\u002BfQL4xXKwLaYkwDzB\u002B1AWgzAukfol47r6M2\u002BHYiUAv9X489/gW10tsAhyCnNmDM7dB\u002BMrUU0HpCRonxtKMJ/HqawPL83ypRNAF7uLsylLpzB6WIfMplqof5KoRtVwh7YAuwFdinTEBegZ8swE5wW0AbQYD995FlZ8AXg51UGSfx/tB42FJjJOz6kJYswJNgHz5Guch3APHVoOdBe4NuBy4oc/1\u002B0B/4SPS9P01VyjCOxVZf\u002BI/0UXXY/TmhpkN\u002ByLpoO1HZRqLycaDwR8q2ASeJLpeCvo30Z0E/Bm0FKtIuAu8ivgv0AjDEyidgJiN9qQX/lMp6y9OAfbh\u002BG4Ay5TMAt400m04FJtntnQBtAIwCUoHeQe2NsNoPtCkR1GeJRcg/mejS9wiPBAXnlW9Gnr\u002BC1rHqKG\u002BMvuj2OAPj32b1vewc6H67H2JMsRYt2x4EUUeW5QeItuRcNbbC/qaIi3rGVkV5Izs8CTx4SF1Ie/SzkF9NoZfAWwJSzmaBp4ltD8gAQYW9L2SIzT8fa4\u002BRR9il2q/\u002Bc/qv/r/xzv7v9Rn\u002BH/Un/V/oT/k/xV7XAr6AsE8CskjIRSEzxX4SOkvoBXEt4AeIPNLmRB7hD0j5BZkr5KL0DeADyOvQlcJulXZBV/QRMknKGcgY9RlaKdK0BNqN/Z0i5aqQWYPpvoCNKfO9Tm9L2xF2tjqZeqoT6T6Z90PqKWXgVmmTiniurBMyCLKhraD6qzRPjFGkyzKgIk3qub/QC\u002BpFlF1Ft\u002Btv\u002Br8Q1C5zI/b62Aqdk0ELRRvCP\u002BKb/D7keRV4Wy\u002BlBzWNJhmTMU7UqXsxboxHvw11f0fXwTa5Rf2UcvU0pBNkyBMB3UFN1J6Qc2gj4ANJmS/as\u002BT3PmmvCxkv/DMx5y0oH/HbAnaSpLaPoPfEvH9h\u002BXJC/1m\u002BG\u002BmCDxy7qb/jTiuPtsVaO/VzSpX6MOADirVHeeicu0V9jrXUQKuDOSqz1xrlkL\u002B/6EeAJyrWXdhsYt1FnV/RFLnuLZH\u002BML3s\u002BAPq2o38L1I7I9JqB/nHOJ6jY9Br86Xv8QPW6nXMQXOMdT7WFeM3WlBXobcEf0sePwFam3rrTtC2tg/Y1tZ/gu9Rv9QTH6Mu\u002BH7ag0jfSQVGX\u002BiqBcj3AnXQb0WaaCcX6yNs8A\u002Bgi2xdibVpJtoX16ResnzPi1Kf30C9jQzU0Qp5Ttj9EbyI9ivWvRElaTmUZDyGcZnQk07sk86U5eyG8XPsXYuP7nO0wlw8Ab1SA/F\u002BdIf\u002BZ/h9nDIrbAsf1qMv4jY1LsBehY1lYK3BW\u002BOcY2miozU9EWg3YC\u002BrmrgPfPnPkBsG8KqFv7/HB/7yER/460AdckMbhXanUx3MQT25bmLusOZy3vOom7qDblBNxNvTTrH\u002BYg0ED8h1wPrLsVfSOqDt0f9M/QVqJHmpB\u002B2BPj1kqKDPg/bDPOjgx4WVPpzkE7FWQb6CnEtxvwDrZkyBjf0Q5BF4R6xfMBXywJhHMbAxIgNU8HlFXzvKvr2tt8A\u002BG0JNA32SvAg/LVCXUQtrkCnWF2nXsImDbMAJwfSKebFt4oAsDtBr2YyC9yWPYa/I8VejgT4G1kXsGcG3gfUJzFMFnU7LsJ7jHGG0zLgOfHIE\u002BS/SJm00yr9GmxzLqaWxkZoK29x4E3MhbPVu6E8zyIJiyEThS0Heir0t9pdzMPU3/gZ\u002Br496/gI\u002BuJHmG1/RQ1Kew2YM\u002BHoBPnBsQP4O1Fuud2\u002BMeyDGPxG0jnXfQTdoCDBYhq9DWjLtkuHPrWvaPNqldqZdRg7t0r9hDmnD76SuegptxPVcPZXuhSzdqv2JHtegYfVI6D2RZxtN1u\u002BhwXo68t1W0Vauth68shjxv2FdbkadDyNfhLW/9L40WtpMsMfY50TKGdLYOb\u002BfdyAH9ORgrL1lA9\u002BEdeoj7VppZ6tJll2sfWNfE7qrCdbmY\u002ByfyzIuy6mf0SgtGnkctEikKU38x\u002BFvnOTlsBtxHXajS7ShTqPRWoZdv/Cf37Pb9dIYPhX1vifvJTUET4zRx2EuHkFd4j7eV\u002BI9NaWzeOcd8FsQcXbAxggLgR8mzoz1EXmssmwE9suH6E08Lr4rwny\u002BuCfJRmiD0P9CGsh7wy4eCn5ugzE2Bd61wujvDvYe5LW43hZYhPRbkD4G/iDy8eaIXw8fWgHFfKl\u002B4FbkexvxlxB\u002BFHQT0Ili\u002BD7kH07zlQ00n/dDHQ2AeKtXWKs5xgc0R1kp3nGlMnk/rSMt53vpOcji17Bn7\u002Bef\u002BTcJqt9Es\u002BR9wfk0S72eFgoqoDWipwPgS2m6BMoIOPfRLInNFow8Wiqg7sf\u002BBpSB/lJHL5oFGXIf5PRS7QNcu4j1/JyWizZEHaJdAfTv1DVwEICtSE9gbm\u002BxQKfAY39Te7MSIA7z2BfoDbwMzANuA9rZyAXmKE/K\u002B8Rb1TvpdjEu0SfUdUgZQFMDY70WguegOirm5B/Bni9e5t\u002Bktge\u002BtGhFevBcVptPMY9iDq8GOa\u002BA0RDx0cgPKuY5ABG/GsQ6VAHW4woUIF2M77Oq/Qysl4BYw6usgaCjgA\u002BC1yDoHvvV8JGNp\u002BV9PvjdPFfKZGkXSBtlt2Wj6M/g2kzaA7SH7Spslz3KUWpvbEbaQejQznYZAj2NutpDLx2GD41rIk3UI9IkmgIiDohvSACdwBPrQeFT0B1WXFC2GvSEMosOCkDmiHNpucpX/lL0uRj6cZY2mRZqM2kBP0UPaDpsSxGfATl/B/pSl2ZqDbEnO8Ae7kJ3oR89JH6mQXpdXH\u002BERko8TT5ZRpTNpFu0SGmX3qIvRn0eK12/mQ4jfQzskxw1G/Zedhn6dtlXFWUm8ILIAyRC/s7kRFMhL6byLf5j6jC6k5\u002BH7sil5bBt4KNdzgc6oEwfkR90tVyvFBohMYTi0N8REoU0SI43F7phFN3raEP5ArpJk7X/giweDTn7Eo2Gfhd2ejb0SDsjm6bwQvDBT9Afb0nbdTJk2iz9I\u002BTxUabmpGyjF8r8Ap762U7/HjzzHnSdi2YjfTTanozys6Avp\u002BjlCJcibxnyEPpyhNrpe1A/9o42CzbBPoR3o8w3lK16sFZpwPPQbwtBRbwWwKihPtK\u002BFkuDHY\u002BCNpWYpfe08\u002BGaPtRKg984GNSlr7bKyzxpEu3EdfDsYFk\u002BDf1taJXhz1KMXc9kSQN9GYPy60BHoYxIe9zqJ18JnboKY6r2LEMX9kNVTJIQfsRLuF6NGrtgx8HmClBRxg5PClBRXgmD3TEQPDuChkrURlgg3aY7qTuPpQUiX8U1wFGCNroAhajrB5p0xfOXE0i7CkT/5Hiu3t9J16KirOqlBWwBLaj\u002BLEb7GNerYoqAMRRjTqStV9D7QZuj7gBdIemUIHqBT6EFhoa8APhwkpGMOg3YqQb6X4muQZBpuvD5GsHGmAM6DwjQQPq1rs9Bmzdibm\u002BkG3SG61lIs\u002Bl/e7tT0S4AG3mSuF9RAREPwE6DL3ZIr4c5/hU0EfEADaRf6/qvaCcObWANBdU/AC98gP5YcNvxScHp0tftRpMcU1CHiNtUQD2KetahvqNX1NX1t\u002BpytLfqkjSQHqBFdrpNRf2S944hfMzyz210DYJMAx8f0h1obwBoYyBAA\u002BnXuj4AczMI4xkCgGpbsa42jLrVAP9Xv3QldSajv0euTSHDF2gq1kX4cJWYFASZBhl6SO\u002BIeRO8scjmkUVB6de6Ps8eg5APn2Pv9JP\u002B6iQbhwK41hwG5kaO/4SUJwVV8D7dbGOSgHiOI\u002BSC4Kcr5EGlXOhnw5IH9v4WZfQNaHMDxmGha3BcnYXrmAsxDkfOtQE9EFyPpK5oWhAAnCCJQFx7EvGVkl\u002Br82kFT2vpGF861bExKTiOuXHJvd4QSKXx/G3MtcBi2Ifojwt7ODzSgpssBOL8Q38p/ytsla3\u002BUmO8v9TZ3F/q\u002BqlaWpadVoa0t5E2C2ld/KVuR1C\u002BsUjLrMyna8AtSHvOKq9N8peqkbCnIkCF7fYmueVz8GLqIO9XCB/vY0rj34P2s/wN3oBIPuMtIkXej8qyn4XnweaZIp\u002BzCWSJZ7MVz8YzaZX6AWVKiPsfT6DcWfh\u002BK\u002BHr1aJmFc84xHONFtC9RfSqvC8wG\u002BVE2R2wK\u002BCf8wfJpX5DGp9A\u002BfwLoJlEP34Oeu89ymcPC/jf5H0oX/kj5auDcP1dG78gz6PUjbsQngHE\u002BMt4MY2FD9uY16WbJTpQN60Z6AM0QYT5AAvKl9Rf\u002BZz6ijQ2GjbZSPhL4vlBF\u002BAWXP8Z\u002BW6xgbLwLVN5exrN34GNJPINoHq8FU1RLsP/i0WefijzLaWLusQzFJk3OE8v2F92HnGfSoxNPI/SBlAm1mCZ6IdoM9Cu7N9dlMQ\u002B838r\u002B436lBrUg/lRfxz1kOHP/QNEnH1Bd3CONSmzx9ADZT6SYxkXGAPq66r08n8rxgE7Zyh4uZtyBnl8GDv6qZynVvwRaiWpeGaFMrBB76iGTgIV95isZ9klQc\u002B9K\u002B7vVjnf8Bv09557EPeqxfP2quccqMSmO\u002B3nod/r4oNGUeBlOx1jJvv8gyHugQbONVSn8izDzVLPcuVmf7l11sF/0ab/Je4Vi\u002BeE1em1zjz81nmHiueugXuXNq12/qE67f9b5yB\u002B6zzEP30uQqx34JyLOH9g3zP7LVr93l7QvdGrnqWQ95RSSa14NirOB2C9AUWuez3aKu85Xuu8zb\u002BL/k5\u002BvBYFnw3Gnu5sn6t5\u002B7fW/1q04lzHb9Dq61VxpuM3aPV71tWp8Fn4h5Qin2f9IwTOe2mkATrKGfq9pGpFZGh/JVU\u002B/7oKtGJcB4ydKHeEdCMD4ftRzn5ufy3oW1H/y2Q4iklzbCfd0QrhkaQak1F\u002BOanKa/QUsEx5zf8K8IZ4VgZ6DDgM7Ie\u002BMBQTbceQBujqUjLUI6Tyv5DBRX\u002Bvcg5MrssYtHsIbb2DdkV/Z6G9vcgvnsP9A\u002BhdkO8y\u002BhmPPjYFf4vnK/8I96Gdt9HO62hnL9pZhvIHUPYu0LWYH3ve5TyOsJ49wjfeibEtls8WA30OtG/X\u002B6\u002Bu47\u002B6Lv\u002Bucf\u002Bjvmtv\u002BMvE82G5l4nNlc\u002BSJZVnBrZX9LddUL/Hosyv/nPGg/4y8TxZPgeE7QZsE2Uwr98BXwGf2Lx0BvhanqO7kzg/Crujs/975H0EWCnbqsYDFWdbAmlij4nnynuBJ/1fQAYa1nkI\u002BljQq82PMQ95Z/h/NIaBPuX/VDyHtp6Jy/HJw7sBqjwnjlgTsQHybK08n8ueRMIRuuqPPIv7lbxHKM5b5DosoD5xhtRfGnTuQ1J5hiIYRK0lSliWgPISlWq3UynqEGVP0T/4Ef1y7aJx4V/SOPYhNVDKqYHakBoEh5Xt5OZZtBbYo2\u002BjvfxLWi7uo4u\u002B6aP9Lwgo5C9yiPuLRJ\u002BxAeYC\u002B8xxsZFDPbXPaLkAvyTHKM7rfmKjvbKV1RblRZg/ScvE2GWd29gNsJsvaX2oAcJ5AuL\u002BvT4M17fRWHl2GRBPKv6ZH96Cbpc2ZwvqCOQBdwL3A4OAfmpr8J4N9guNAe7hGbDVUE6ew7XP6f5T5YUtPMC2ZxdL\u002B7WbPPdjn52RdqNoQ9i6ZZa9C4YcIJ7rAjnAHHG2WNo7Naiuqyn8v1Wwf76ltnpXugtp4myg4LUGQAyufwDaFOgMDAE8\u002BvU0AXSDuA6MAlzATbApo4H2QUD8crYIO\u002BrRTQLCpnSU0V4t1f8R4u0cC\u002BBz/IXWi\u002BePxtO01/iGesB3UfQj0uYS53UHw1Zvq61AO3upM\u002B/jPwO7IkUfSfsdfamlOPuMa6O1NXRQPksbTp302dRPH0AHjSb0oibuTzRg3PGEvwx560vZ8pM8BzlQ7Du5985TTciDzhXnSHrSnVqhvHc6HfrzdvUTehZp/YXd6vgDteZbaaT2M92j5fov852UoDWgAdBFXY2RNNi5mFZpaylN\u002BxPmsB369B58zIcpHrbuc7A/HYAh5cViuh3yeDDsjDuU9\u002BkW5X1/nN4etlVLujVwLtv1c8X57KFBdDjQ0Y7nBc5v2\u002BH71YW0IHCOU3sU6zrcGpMxjDyOn8jjWoDw7fIMTXtjErV3hmOfTag8ay9sYelLvkh7tHjs0Ufsc27Tkf975B\u002BC8GKZ1lZfQW3hl7eVzxnsc36Cr5w/0xRRl6CYx/Hi7I\u002BoH/27HfsNe449BzrBpnacpVSF3JvIQ02AODvfBrvchqDr1dIrrk2sRkW\u002BRsBgYHMQ/cy\u002Bfh1wC/BfQiYAx4CnK8tyrbLfAhVxcX1SZT6abLc5OSgt99r9lfH19ph3Wagy/tzKuQqer4r5u8/O1wrxoaDdLVoBX9W4zDvVQkV8UtW2qvdX1G21IfdPDfglqZAVgTM\u002Bv9JT2mD/JQGEXxbQ3qKTwWGtBmuiR9AaAS0X\u002ByHovQ/53khN9hj6o2kK6wwMBO\u002B1r8DrdEovAraxBOzplwVQDnqaFUPW54F6BNU\u002BFc/pKwHfaYKeTRMc4ixitXAAGMsUASWWnhE0qF\u002BfBPcReFa\u002BW0H0QbX034NPrkjbbgE66n3g6P\u002BLOqvjz8Fw5NAKAb4dfsLV2q8sEwh/UA2/1d6RanjLTg\u002BmbwWvxxV1dLCxjd74p2HzVgBqIwvV06/ANcaDNZgigPBwYArqOg8/7GAAgvckloLHJWiRgKbQLHmGUaG/2/VcAZGunaIRAkHz8ycL7OHgfriH0QqBf5EXvqgWP\u002BEgXiBsuCAMvNo\u002BDYSrX7fpSXGuEXgQsv7xSplkgX/D2tq22oEA1ScrF/XJkCEBKt7DSYBPQfSL3E\u002B7kW83zQ1QtTF7GfuykfMGWiPgzrbpIpqMMNPLqED4RsIGD/hCeiTVEnlwLRVyoLgqlMVXplWm67CwdaKNFg0O00bRF/SxlbEEbaFd\u002BFE6ZMQgLcY/W4wfcuiJ3wP1Q3\u002BpBaWm\u002BiE7iPlrZ\u002BFacUEDYYFA\u002BeB6/pnr1VE9//82VJ8PkcYm2/HJFqqP959J/z0QZauEXwhCYI5HVuaT6zYyqL8VVK8P3\u002BZfAo8G71ElRJo2rvLatcpYYcG/vwfa/RYCcfUeC4LvgwFHUuJa8X82n8RlGssvWhR40Kb/EGoriZ16f/R3byV4POnBqChTvX/wb682D8F5HBdp7BXXq/cluN71uA5A1kuINMiATZB3I0FzgSJgNjBHQF2JeGOZVmQk0HQB7S6a7qhF052/0CIXo2W4VgK8LqB2otV2PUK2bLaxTrQRFN\u002BqnqbloK/YdLqdLtrJ1QYDv1KRlklFehcqUu\u002B020c5QbWXZXiTnfZ7MM9xOxUFYKUpnwmqfgvdccoC4s8aTVg/YDfCv4KqQCnCQ\u002BzxifRzSEsCfcDuQxfhx9nXinHtRtBDwJcI3wZsB24FMq6S3ttKZzchfQfoQNAzoJ1At1fG6RO\u002BnzZrCWKO2GTEdyH\u002BmnKKNvPT9JJWRpv1FHrUnsM1v4HAPNtg1\u002BsXoTuugt8/v6Kfsq\u002BjgP0Ih6v95ZpOsdaWNQR9BxS8xjQL9L2NXPijRQ4ndPrr9KwzD\u002BvQWthBLBy67X3QGaBO0HwblwChp/sDLn23tFFesdaQDQItFoB/PhnxPwCdkW9AMERe3fLZBti0R9B14Rc9ijpfBW0MbAda2HQgIPyALNDvQTmoqOuvQJlu\u002BWVBYH2BMKCDnfaG3W/RTj87fLuNZnZ6hh3OCEKm1Sd6wq7HZ5cN1BeAuPaCjWdsjLYRaPcZeyxrgFl2fJgNWQ/WJA\u002BYWg1Flk\u002BpwF5XdGUFbQEmq31oCzDZGiNbC/Sx2mNirh4BChFeZkGpbYHtAD4FUoHWwG0AfDxlH3C/fQ/smd9rv1j88W/FBHs9g\u002Bm1cCYIdhorrZansQUWa4HyLbB29hrY/nbF2gXC44EC3fLtBCbAZh0N3CJ0Ef8ZNunP9DLir8tvHoyH/B1P8NXpDmCQbt0vuMXZiSa4YdsCAXqtsKATsD8I\u002B6bJtcEf/c\u002B\u002B/n8d/NH/29f/b0OvvKdHAtokukXiNMKnrW\u002BBXO0\u002BQgDSTq68b9EmANfqqve2/jH8b10l/T75nY5//V7Uv3oP67\u002Bj7tfs\u002B6oB2kqvuGcq74Ne5TrSi7FOFroL/CNfQdr6Iu0ipUmIewYW6go/Amk3C4h37uU3ICb4P1aPkUucB1HFOalU/zeBsy4VZ1rsMxXinXv5rqV4PiHev/\u002Bc2jt16my8Is9YjAy8ixt4x108N\u002Bbf03DxLrg4myXOksi6dtI09R3KVB\u002BlbPUDyldfpXuNHpStcSLjabpf3Ut/UD\u002BFr/IMrv9EDyCebdxLI1FmpD6e/mCMR/gl4E3YMCOQbx1Nk\u002Bev9yE/8qglwC6Ed6Ffv8CuGYLw6/DlX6Ec9XnqamQjvg/536GpqONhrS7qaEFTtSY0zqhF4wW0CeTTJtNNWiz51EfkuUVPxbu/ETRbm4g59dOn8hs\u002B3\u002BM6aKCscg/iKjWU89iROqg3WNe1BqDiXIdGY9DnMXobGiPfN/2FjojnJSIuqUrrNA\u002BNCNQnvze0VJ7LLajon3hWkga7ehq1l2ekLtnrotr3w/sgbYFNxTv6HWmJ4MHq98bEc89/wsf6j4R8v9c\u002BwyqeGdnvaV\u002BSZ8PE87iO/hNqTdhLgfeKBQ\u002Bvtr8HZb/vLZ9fCf5eIr\u002BT07birL8qvxn1HMofqvLtp\u002Bm0rDpPybUX7xIGvks0gRzibKgCfwl4XH2XXhYQYZGmbrMQ\u002BC6L/MbLa/R84D1YR1tqZ/iog\u002BM58MouGmt8QMf0t2iPI5/uNnrRfY758ANaUG/nA3TI4Qk6W/YJ\u002BvAqjXN9RuMd9bAnHNRG7\u002BS/pE2V76bKd1QD75wG8lztGwm/F8pFypPQaG8A8j2Fk7QAPvB4gYBMMnT04yVqFXg3U549bUxjnH7yGF/QNGch6HegqaAnaZrxLtZgYRDdbNGKZ4IdIQOLKEIbR4d4Ku1RX6B\u002BfBR8nYcgr54lV2B8UkbG\u002BC9rp\u002BGnZVrvTMr3Hz\u002B20ivoBHLLd2e/tM8LbqULXKFC8U0t8e0yMW/imyHynePbMOdZpKIeFf1QIWtV8JI4G6OCh1Te07qG8an6SP8q9Wn0tz51E\u002B9tg/fkOXb5rBR843yCOrPX6B12jhYrETRaSaQcJZUGi/gV6aC/Kx3lq6eL722AjwqCoa6n0RLlNNqoDbqFxoi41hpxlFXHWdedg0C3AyXwhy7aZV5HnlusNO0kaBHm9pKd3tDOL7ADMvd6GivDr9Ns9T2rjFoHeuQ5hDfDTw30YwPaTkB5hKErpuqT7Hd1fg/SKqH3uhLqXdgDV4M4SzibmmkuC8YuC9jnzfSvwJ9P0yZgi3MZMJ22hLWjLeKdUXGqRtlAPbU46qOfpC369TTQ6Ai\u002BaAJ9\u002BzbwMcITkMYoR8hv\u002BZ7oJupj04Hi3dQArnhH9RMaxDvSIPF\u002BqrKeBqnB76eOQd5M\u002B73UwDupV3kfVby/KuqV5fzy/d2B8j3KT2mW0sZfqozyl/674/J9yO40ix/zl6phV8YD72qqP4rwPx8X73DCnpl\u002BTfqZf5M6yno/UtDAe5b8fbR/H/r7T8bF\u002B5d6Des9TEED45TvZEbQUvUG9KnYXyrf83yLlgbKyfbr2v24CpXvbW6qnLcArZ5O//KP\u002BNaK\u002BBHfXSFSBpJDvAssaU2614oHpVWh/ot2vKagFe8qj7XeV1bGWu8si/EE4leMS3xvYqz1LnMwn8j3VXvSst/ip3\u002BZP6rxg3in15Ul7umgrVR/6RVx8b7vUcQPYy0uXBmX71WLtR6K\u002BNIr4/J9607inWv05VRQvJkVr74f5HvDm\u002Bm\u002Bing1PhLvBOuRtBRzXqo8jzTxznY/WqT2QLiwkj\u002Brz2uAL6vzW/X1UZf6m6KvTUHPgp5Vl1IN9LkGaH/Q/lfjKEdzStIjIE9P0UF1BugfQXMt8EdhJxMdNNpQgdKZDmrxSL\u002BLDrpHIS0cyLWuQbYe1H/EtWLooD\u002Bj3HykPQ6buCbKTEd4Mmz0qagb9rc6EfkmyrpzRbuiXkFFPvEe6f/XNuh/MrTvYeOehG27mL7RPoLdM8L6jipPozxe11\u002Bga0hrDxs0i/bBrhLP9edrRbC/19Mr2kHyOD6jzvqDdL\u002B2EXZzL9huRbRCnvUStJTG8B3Qs\u002BJbZmeh896nr5X3/R9rLayws658l8j6Jk6RBX7a/i7qDmql/YVeAQ\u002B2N7rTAG0k9YaOaw\u002B7YuBvff\u002BVL6JV/47vv/7PfecVc1qD7gNm2d/EHQyssM9a3ii/iRsjz1H\u002Bvm/n2t\u002BWqPhmgv09AREX8kzKiGrfiBByMvD9AyEThdwKfCsh\u002BNsMor7g7yXIdJQPfCOBN4fMGgC580eLirh6CFTIotNW3Kgp5CbCkIlGM5vWtK4Fyot0IVM1H8YynPboGy3qOAr7HWl6R2CHFXam4VpLxG9CuK1N06xrgfIiXZQV\u002BWR55HF9Swf/E6DP\u002Bc\u002BAo9n/IHx08n\u002B0veoIeh5\u002BVQykJ52TqRfC7Z2\u002BynT4aXddJf\u002BS36zvfxBX6WNqIBx24or8bZA/R1Ax1mugiMi/w/5G43jr24TlYaDv2zhgoXw16Nfy2xoF8N6WViIQr\u002BLLBNtpQTZa4DrbXjV/dbs12Eb9rTC/iwg66ARkc6Ry3vxRm8weD8JyG4H4RGDhVWggLDA7CAvFd0RYEyJxL0x\u002B8wYItiur2ISjpD2/R9iRgW/Jyu9D2\u002BfM5TuUrelteX8EulTfxl4i69tAV4P8dpD4zqqsHxDflFEfFxTjzqX2PFdQ6z1ldZegmBP5rRlBq4atb8QIWjVdfItGf0ZQ1CW/SSOoDLcPhOU3aiYLCpzF\u002BM4Kij4dpfbKUUGxhpuhAzYLijIHUfagoKi3s/iejaDV\u002Bia\u002BbUOCAqehO04Linrld20ERfwwjdUOC1q1zuCyweMKLlslLL6R01TQavmDwuL7pL9l0\u002BmvslUV380TNkeW5StVwSjLXwpGsJ90rXAV3ynYbwr2kYL8oyr3Cq4RruIfBYXFd5Z07B\u002BBYJ892H8KDlf3868WrrInrhUO8reuFRb3DMV9ewFhsziW0mcCxjpK1c7QBsf3tMH9E22oHg7A2c3/qwXaL\u002BDOpr4BRJhWnit//c9VhFdVuGudq2HjtcEgHdjYIIi044D4T2S7A0fkV4JJBbQ04HMivRBScDLJT805PiGC9UfO0mvD9Y0F9wwbn1dFWIOqCE\u002BzUVyJiH1EkbuIPE0seMNsFP9jiP8\u002BLRr5o1E\u002B5k7gIlEsZFRcDlENtFUDY6lxgajm/TYw/njQ\u002BDNEteYTJSBPAvIn3kBU\u002BwmipBgANBl9qYO\u002Bp\u002BZaSMv4H8CMavj8fzfS1SBkVEP3INwfhEd/A8VXwcH/XNSLCSGEEEIIIYR/E8b\u002B96B\u002BRgghhBBCCCGEEEIIIYQQQgghhBBCCCGEEEIIIYQQQgghhBBCCCGEEEIIIYQQQgghhBBCCCGEEEIIIYQQQgghhBBCCCGEEEIIIYQQQgghhBBCCCGEEEIIIYQQQgghhBBCCCGEEEIIIYQQQggh/K8CI6r5AO9PjWkkhZFCHnqSHERqrBIHqpYoM3z\u002Byya/FMP/ns5/zeS/FPCfI/hPJr9o8r\u002Bl8x8j\u002BF8L\u002BIV0/sNjN2o/mPx8Af\u002B\u002BgJde4t9d4n8x\u002Bbdt\u002BDed\u002BDmTf53Jz57pp50t4GeQ8Uw//tWXzbSvLvEvm/EvTP65yU9n8v\u002BK4Z8V8FMm/zSK/3k6P/kG/8TkHyH7R9P5iePdtBPT\u002BfFu/NifErRjJv9TAv/Q5B\u002BY/H2T/9HkRwv4kcNJ2hGTH07i72XyQybfP8er7U/k78bxfSbfa/J3TL7H5LtN/rbJ3zL5mybfZfI3TL7Ty3fMTdd2mLzk9Te0EpO/vn2I9vob/PUZ6vbX0rXtQ3x\u002Bvt2nvpbOt5n81QK\u002B1eSvmLzY5C\u002BbfEsufymCb96Urm3O5ZuKorRN6bwoir\u002BITr94iW80\u002BQsmf97kG6L4epM/92yE9lwmfzaCP5PLC5GlsICvM/nap8O0tSZ/OoyveSpeW5PLn1rt0Z6K56s9/EkXf8LkqwrCtVUmLwjnK1FoZQFfsTxCW9GAL4/gj1/iy5a\u002BoS0z\u002BdIlQ7Slb/ClM9Qlf0jXlgzhS3zqH9L5YpMvWthUW2TyhU35YxjmYzfyBfPd2oIYPt/N5yFhXi6fi5mam87nePmjJp89y6vNNvksL59p8hkmzze5z//I9OnaIyafPp0/nMun9Y/VpqXzqSafYvLJEXxSGJ/o4hNM/tAlPv4Sf/ASH3eJjzX5GJOPNvn9dfh9Jh/l7aSN6sfvNfnI6fweRPJMfrfJc00\u002BwuTDTT6sDc\u002B5xIeG8SEmv8Pkg00\u002BaKBLG3SJD3Tx2\u002BPitdsz\u002BQCT34aWb\u002BvE\u002B8fyfsyj9avJ\u002B8bwW3tGa7eaPNvNbzF5n5s9Wh\u002BT3\u002BzhvU3eC1d6mbxnD4/WM5r3qB2u9fDw7uG8m8m7FvAuBbyzyW9SrtNuusQ7vcFv7MV9Ju9o8g7to7QOMbx9u0itfRRv1zZca\u002BfzR/K24byNyVub/IZWMdoNl3irlh6tVQxv2cKttfTwFm7ePIlnhfPM691apsmvd/OMZm4tI5w3c/Om1zm1ph5\u002BnZM3yeSNG6VrjXN5o4ZRWqN03jCKN6ifrjW4kddP5/XS3Vq9SJ7u5mkmTzV53UheB\u002BOsE8VTcnnyJZ6EISTl8trhPBEzmGjyhEu8Vicej0i8yWvm8hqYqRomj0OhuHgea/IYk0ebPAoZokzuxVi9nbhnOo/M5REmDw\u002BL08JNHobcYXHcbXKXhztN7kA2h8mNGK7nchUXVXBALEcqN7mCuHIdZx5OJmclLHfOYtb4/w8/1Ph/80/t/wdBZ\u002Bp0CmVuZHN0cmVhbQplbmRvYmoKMjAgMCBvYmoKPDwKL0xlbmd0aDEgNTg1NDQKL0ZpbHRlciAvRmxhdGVEZWNvZGUKL0xlbmd0aCAxNjIxMgo\u002BPgpzdHJlYW0KeJztfQl8FEX2/6uuru6ZSSaZ3Be5gBCQO8gNMiIglxyaRU6JGCKiXHLLjQeisoIKIqAcIiIiIKIiZBEFFUFFVkBR0UVBXTeyrouKMfT8v1Xdk0wG8Pjt/vf//\u002BxvGL95dderV1WvXnVXtcSIyE2ziZPvhkkTci57qakLISuItMKSsTeOGqTd/C3cAG288ZapJca6R1oTccSn9Bwx/Ppi749sJ1H6V4hvMQIBMZuz1xJl5MBfe8SoCVOmt47fA38noqJ3bhlzw/VawyZTiKYnwn941PVTxmZNNRoSfSzz54y9dfjY6dev\u002BZLoOHgwn2QlrBkroVL6KxFrT2uonGeThl8JQiXdyAqpDPHDkHKOficrBB2lryUN8bP0t1GmxprRMBoHV56\u002BlpXSDjqF3HPYAtFVDJSpSf6TZf0g9rBvRWutNfXXR\u002Bnt9a36HH0rUkzUS/Q5tAV/W2uH9BX6NP2gPo36S85YTwnJBy1j3VktWqYtY51YGuukvU2vgOcS1oEtY23FAXGAjtAR1gcpN9JkzcPeYN\u002Bxxqw/24pcP9APLBu\u002B5lpzdpp9CY6X0iHeX3hoGd3P4uErpbfB9yn6jsbrKJXuF0e0\u002BuII7aET9D7CiUYyDX8zeUNxBL9vaT2NhGROME0cMRLNXL1EO0tl7HZtnXaW1WIafvEsG9K8jr\u002BtF\u002Blv6PMRC\u002BkwjTfj2bwj/g6WKcQRtgxcnDBK2FSkk79pqKdM26NtRxt30XG0C7Vrg7Vp2jI6zjaxHeCY6E62SS8yh\u002BkZtMxYpven01I2dEh7G/Loo\u002BRxL91rNKUfdIO\u002B5T1Zkb5eSozyxCuMWK7Z3YinJay7eTtaQrwlTSOMGHqTkXjF/iGVy8ikJXo\u002Bfwy8a9qMoNzYVHpba82HYQzL34NsOz1I22k8oQhe50XTEDrXGDXI8W3R8roVb/H37Z\u002Bzb0BuwwZh3hyfmbOF\u002BmzxTs3ZHgj06a9niAFbRI0tPM\u002B1Rc\u002BrdeJikScaNujRp3/Odla3cyen2M5FnRB4TX84pQ/BCO/cScXJWreIPPzXrWhLzg0jcu7x3VOrzT2\u002B4W0aypFuLdFLxFrMTpOyS0lndSAGg9V5gbnEfE2nxnsPlzUl3\u002BGyw2VNEuJy4/Jy43JLdKoYzzMqTllLzJiz391q1JNjnNEo67jWmt1OgtL80fwpWm9wHcMmwfBVlB1\u002BC6VUoIzcOF4r4RAb8eORYna7ddC6l02UeQ9hksi8nOJepPWazKYjfVNqrPLkIoe1FBlmgOdhgc9FY4zBKEqhWv4E98ZYvjFpRezSVEqOTjGS4xNTkVPm9Z08U\u002BY73YT56tSqacT5kpsVtGA\u002Bys2hOPWXb7pp\u002BvSRI6dPG8nmWLutD61j1m7mZ/msDvNrZSz11CnrK\u002BvUV1\u002BxVGuBNYo9yMazCexBa5Tkdw2R/il4SKV7/fUoUxd6CktOzRRCzxOpFLMwNmpj/AqdNmupSYJiXMlJLCOGp/k\u002B7rHFW9j/JeKB3a0G7K04XBbXunVca9nKgjNlytcE3Wj6Yr6JS2lt\u002BsQ3A2oyfx0t5ZLkS1I4p5gUkZqSkpJak2qm1ExtTs1Tmqd2pO6iS0qX1NghNIRBUnHsMtb8UtliM\u002B4y1ixHT0o0TK2XtujnPVputy4LJg48ettc6zYWzerN3M8yrFMsg53oOLPTTbOv6sm61m9Y9t5t7z2rdNZgItEMWkAjL13hz2G5Xu6lXM69ecSjzE2C8QVuFu2hdMOlRyfG\u002BCoOt9tbVqCac/Jwu7KCeKcx\u002Bjd2S9wsl\u002BfGNYurFSfZ1L6zBrJ1frbxyBHroXMj9aXn7uebKq62/mp9y3ysO2T8GPoZ\u002BoUyqb2/pm5mLk7faPqWxC1O3Ghu9WqbaYF3aRavSSwl2ZNNvizfx3sryvb6Tjv9/oX1/WmfdRJMyPGTJEVBSYmUW7NOflwWw1BwhHSM/\u002BncpAYDmrA41sR63vpw1k/Tbvvo\u002BvtWr77vmtJbxBHr1JfRXuvvZ76zTjctYI27dJk/cdLd9RtK\u002BUAvar30IjV3avhjtPX0nL7eEAzTJsHlq4AEZMeesQew/J1iN1kPS\u002BhF1gxrHQazkrMHMy4f7TThsvx\u002ByjSEmWkYwpPp8ghDuKVby9Q5A1yZXOeeTLdH13meR6dNLn2BoXncLlPoUDpug0f5Dm/N5mzI3hTZEe1OHi4L9oNL9YNp/yddVSFymM1O9TT29POUeGbRLDbLNcs9wXOPZ6XnZfwO4vepxxfvquHOjs5zXeLOie6mdxFXurq6\u002B/MBej9xrTGC3wRFcqNRFD2BprHb9IlimmuCe75\u002Bl7jLNd/9iL5ELHYtc7/gesl9gF5jr2kHzFddb7uP0VF2VDtmHnF96G6sBjDPZerH9S7n1g21Zmj12AGtnjXj3Hr2yFvMZ30rjpTX1/K0q22dU4IxMhjzMI3a\u002BtOjfW5K5l5fWvIm7tvkXsGXpic0jCajfrqvYm9BUCFYe32vxcW3xn9NtjXOGJqhsSF5MayWrRUKklPiGrFaNbWkxHiMkZZi8MgvZlj3Wj3ZNjZxxhcjb353/DtlZe\u002BMf/fmq1u2YqvZcKzBq1u1tA5062Sd/epL62ynboqvUuiHE\u002BjTKGriT9R3G7u03bTAtdvDhNvkycSjoaIKDu/da48QjJEXfN4\u002B3rFedFxwtMhfqR577lbtxnOPaGt//giD8bj1NbDBOu7UobVHHZwavEivaAzFQmf22BJb2GOLr3AQ1AyRv9UAW4myF3zCL/oIrsovhcabJSUpxx9kaJQ4\u002BrTAn2BsiqdN0Svil6a6G8a25A2T6ofpU38UpaUk\u002BNIap3VIE2wIc4QV3/xSjQd1K/7yki2vvrrl2VdffZaNYEst6G/rEetG9oh\u002BzKoo\u002B5tVwfS/lTGdpVjF1mJriVXMVrCR7Ga2Qs0JtE3MR9s8lEBN/cnRm8yoTbTAneA1mcvXUI9yobGJSoZSabaWQ10q0CZbKYlJEUq1p\u002BdC07A4Z6qXarNYJmuKJedzy5rF5hwZe9ttY8WRc1//7dy5cn2XNXRUcfEtwboNQt0uqkHz/AUZ6VqNtMzkFKj3lJTkvLRkTwJtchubohekeJITUrmvRppBuhfdmuJzm8lRPNPuWzCW0jrOnoWSt9bxQe1uTz9EDai5NbUG\u002BPVnZ6RmpKWnZ2Sk12iR1CK5c1Ln5H5J/ZL7ZA1PGp5clBU7hKlG1GdpGnrP1ulZLCUhl2Owap9OvemmqWusWVpPLF4J9y/sPcN/yCp5oeW463iHgTeW9LfmWD\u002BcOyCOvH70oV0N42fNsfqz8WOvVuP0Qcyfhuj7fHrSfwls2MTUOE9UVraexPboSXtSN8Xpm/JWxC2tm\u002BWJys4wKSMtJtFMq1nX93EZDIO9mENK9va8OuU7hTY5U8tfOLYea53ZOqt1duuc7lnds7vn9PcMyRycdV32dTkDc0fWGJM5JmtM9oicMTmjcydETYie4J2ePT1neu6SqIejl2cty16Rsyx3XdS66HXeDZkbsjZkb8jZkFt3CIabmp9GUmJyNstispdr1s6PS9btbm7MGmH1q51boOsHpn094p47Bkxc\u002B9OfrY\u002Bs9/5ofXb//Sxq\u002Bsy7Bt29\u002BC8HWQ6LmcZ0sc7a27JVzz7trkjNLXir9Md/tGjOOve8qrBXl55ZuU3\u002BvPXTb/OUnPIxJjQ1n7/1d9YzoZZ5psaVko6iKHemy02SeNyGabgyTdPgUNbIp2UyyoNWJt1jvqIz5TKjmCmifYd7bPEUytk6qMeWODVdhZyuez/e6wyasoIUe8CEqGpFXdXUt9Td/V08lhtucmdzn7sxr\u002BPOcbfjzdxDeR/3/Xy2\u002B2W\u002BxR3n1gzdcLk9GVqinujK8NQn6FG9tpHnqu9pozXXm7vaePp4h9NIY4z3Je15/XnXDk86dDKW7cr/eIVmWGOsx7F4jYIrhj3ArmRd2ENa\u002BTmDWZamlWsfWdnshJpH/QOf66/BnvdQHj3qv8RtUFp2FP055aCxMubduJy3sg/UWFlrf9zSaKqVwlO9bm9U\u002B2zuTWxbB/Nn75mygoI4e2KfPFMh1/PTP5xu7Yytno3z2\u002Be0z\u002B2Qf1XOVblDcobkjsYgmpkzM3ds/n059\u002BU\u002BmvNo7jM5z\u002BT\u002BKedPuUkFWU2yr8jyZ1\u002BT1Sf7hqyi7DuzZmc/mLUwe03WquytWVuyfXJMqfGEEdSe5cXlNsdqULOOHEXNqhlS2pqx4wb1HX6PXMG7bpuz6RiLZTXfu\u002BuP41//w/ivJmCD5WVne3bvdNWiUfXmnZuzrmTIgTWvba/xh96NGrG4Gpl/V\u002BNIyqQ5ZJJGLf3p9BY7rMe85T3sWR2nr06BKNLNjl5KbFt9vTpz2vf96SbbhmbMkmtV1fiX61NcyMqlN\u002B/2YO8lTz65pPBhf\u002BEz11qHrA2sH2vc/2m9vfVxQZPNjz66uaCp9VF2NmvJkvBrmW3bH4OhA2KMRPJB37XyZ6Sspndj4laLd11LY/azx3miTl7Nn94xqq1UbLJf5IJy8szJMt9JsNU7qyhLsZXrSE5y06wgmQctLHDK10nzvfvWiQetH5jn4ITn1oyfOnX8rVOn8lKt/09la24YzLoxjl\u002B3IRVvrl\u002B1ar1EcAwJjy53ZxmwQXMp6QPmfst1WKyMZu\u002BnrozfH720RkaS5kryUifNG9u2huJQ6iVbeCeV9E7LlT6zQ6ZkMylXGX8hgsshYfey8FTs9K64b9w3M2ZZs6x3rc2sB6vJXKy9tXBy0Yi5Pq1ZycyZV3Syypo0Zc1ZCvavbaxXHyyZMXE0BXUEXwA5JlBffw2fYNGu1QZbSY/HGM95tASTTLfwejvHRiXa24AeW2LUrI\u002BSs75dWUW7vXvj7fFeUIFltkAuF8wvZpuzXRr4BoeZzDYLasVhYLZoxhe83rMdK7DesZZt3frWUSPxby079QpQxSpexKjXi5tJPTkgLR48SRu1nj/GOA4b9XFNMK9Ovmo2qt/dx13kHuue7darTJCNrMRaJqEX/bzKSLQ\u002BVu2sKjPrRXpcY17yVe7VUIwoEmPFbOEUo4owEn8qs2W0gcjchv7Mo5v89TKS4t26STmGmRr7Uc67tfj\u002BrOdqQFCJ8dEur9E10RvfNTvDm\u002BmrY1s1kFWmlFVFO2mOtFad3Lhdu5Nn2p2U2444udhCYrHZ\u002BU3y\u002B\u002BSPzZ\u002BdvzB/c745BBsijMckNKhqZ5QbZ4/NOGdvgNmzo9POsa/sxy6TdelVMkazlvqvvnEsvCM6Pn3jhK183YhRpz8/10/r6q2RPvnm9SvPfah13XHzU4\u002BeO6YXrR1aNJaCshHxaF8KNfenQsjM81H8u0n7fc/FMM1LV8Z5vbE\u002BaU5hu6esc8wiqeWabCtKm51mT6PmYC3fnuNV3Il4a6nXl9S10djZskf6vjD61Te1Def6jWHLF41Or5X/zCOKj2FDTlPlvMkHH9KmawibbnU8rY7eL226jrE9ecektmE23QstEzqkXZnAQ3QhRBVqzmmvTJ4xY/LE6dMnwjzvbO20PrU\u002BsV5iV/JpT69e/bQEI2ufVYbfPtaKJeLXyuZlo9VPXAdepH5p68\u002Bs0i/7Y5ayT/hzmdAtfqVlfMp0UrLxnTwZrmLyKsUh\u002BYGKTghhVYuXcum\u002BbeJB5rF\u002BODhx29rx06aNh5pZc26b4YFgrBetc/i9OIS3fGrlyqeUhoHuA28x\u002BlTISfFmrI5\u002BN5ZWp6LL0p7L\u002BCR2aWZqtNub7ucd40O0X5C3L0LUXwgrCSFaMKU5eNZ2QNXdCl6mVqrAiVu7S5XIJwe13bn6lUrwysE3rPvph8rxxMsguzisF8lxMTAviO\u002BOeihmv/s502N4yeWLl5MjQU4Ol3qooGY02KvYG6cWSxY\u002BlFJ4WeMhje9ZLOXV\u002BbkZ8ZfU5Y2Tk5594lyFXrR99HAuZL0jsU4NQ7359LHf743WYqJaZGVnCcN0uYXuaZGdnZVn24lqDUt8K\u002Blw6so4fWXe/ipb8ZqMq2Es9ql5VV25nh8uO1ndWvxermrxKdUfeMQ4VrErSlrF17ndbo87Kio6yuuOFbXSo9O96TGpsQ1cjdyNPI2iGkU38tbLae1q627raRvVJrqNt4e7u6d7VPfort7J0ZO9O1w73Ds8O6J2RO/w5sUYMWaMK8Yd4/FGtfR2qDe0nlvuN0OMST1ZGZMhjwdsY7KFVA4p448OLbmhx/UdWMIu66xVPuabGTefmHDTyG6jOvx995mKGz7EGvttkybNmtdvFOWuterp57bVqsV8l17apnWTxl5X1pontm7MknLNQH\u002BuFY9hjRjlT48Rrli\u002BOo4951pNHleUW3NjEvjiYwoTQ7ZxyjjssSVerRUxaq3YW7VW7C07004qP6n4UjtQhwT5qJnH\u002BmLj\u002Bmh9eJ\u002BkIq2I2w2VCj0xuS0csG3kEhKnNWPjrPsvG7zdevvws1u3isesVwNk5fVqGaBnD7OPGLHL1BhcBV1i6EVqj50RC6s2\u002BqPEd1OW\u002Bthz8YZGCbHeuCuh23zp9vyw1fLJgirNljFb2i0JGH\u002BJ2Ckmp9jirbQX6qxiI7SYuOQrodvkYtH3\u002BVGvHmDbtI1jB1nfNJo3OaNWnY2PaPV\u002BXrVGaTdGMFtEGvgx6D1/PpfP3mBla0ISrhlksEwY63kap0\u002Blma4xoZPpO7xtJTJqzmORsoKQrZirmik9XT6t9\u002BGXozXR/Fo/rUSbrS3UVmlbnN9u/N7F7y/q9y1\u002BaYKwCnIPZkMCq8HT9TpUm9Xn9fQWdClrzVvrTVxdqAvrxrvpRa4pxjx2N58n7jaW0BL2CH9EXyyWGev5C\u002BwlXhs9lSDtbJabzUpgYiSzG60rrcl6UUU5N35epXQCG6Wf5muMEqy/LV/UXqfXdIZ9v3rAinWcemxxO6bFn0gP7Ia8dPz8reJathqwDWafJrVVLnaN81iGdf9eo8S6GyVNZBP1GPUMIBZjtPXlHophLopmgpKZBpHCXGCaP4ZW1IhOcHvTJvKEie4a6rGwvQ775EOMirImDAttoqHM5xY8Nyk3VC9qHY/8\u002BMPRoz/\u002B\u002BDpvWfEmW1E4aFDhNYMGiW8/2bXr44937fqk4qp9/NDMCROmT58wYSaaGgjYewijJL4OdSLymTSJdgTDhUeFd5Xh2t10rDI8X4Vjfxsnw1\u002BWD7SfrRHta9cUspgH2U2F7Axq4Y/ShRSfqWsGxsdbdiswMKqJ0FQihPHmiJA1Y7XyzVps3neMtr7xxlYpvxMn1DzBWnfd9qkPNX50aGy77ynbpV79vPdq/Z\u002BC9MdbKzbFvu0ejrQuJ4f6a46yMGR9uT/e\u002BlNB7NtOeOW/1Gb621SillJYT9qb0CDrWLZen/YY2\u002BhesYhWuXTqaJTTNG087eHraQuwVm9M9RB/jHtoFL\u002BaxoAe0mCEIf0w4EtgDTAfGAw8Bsxy/DOAkbwZnQLmyDKC0NfSAjA\u002Bz2hKHiONSsWnVGKsBZ1sw1gE/1Yq1colAguMZghHOvMHxCHcQDvEcZsa9RC3hx4UE1HWLIShTNd71N6oT/niQKBMvE2DZVskz6D3ov6DOmQAXCdKqL/YQRv1XYoOFqOoP8dapdxbaaO2SyJQKq623a5\u002BtEGGi1l2PpmOf4f8e9DO9ygDcatES8o2i6mrqEfZcKfp62VZ2MCXMV1S2f6g7CGfTUpOKdQdNE2mAV8xwGsuYhn67ZBnfXpMyR\u002ByV2GIA7aqsDnokzk0EObhKPE5ykqhObJ/4DcQPg35JyL/K66uVOxghJS9kvsF4NqEfkVfBPshCPRDst0XxIHLUXdusB/Owza08W1qqPoiBKovvgR9BXKTcr8AXMOov\u002BqLUdWBPjji9MUp0FpK/sF\u002BCIOUC2gv1RehQF\u002BoPgOVbZX1hVPZdlX/Ragao\u002Bhz2X41RqR8JI\u002B/QuV4VvkuRiFLsTXwjbkfsrqa1kHGOWinkjVobdAGoLGqD6QcHCrOIN906Q8skONUzROMVYU0J41NF0nKj9p\u002BfQJorcBa7WzgI7tu2hhOzeN0kyFlLMPkfJOyDaPuflTiegV\u002BzEE5Dxy6KOiX81LOjYtSzFk1b8KoGi/os99K5XxXc06OMdnPzrxXcy\u002BMOvM73pgRmKB0D8YEaF/QS9XYD/Y1\u002Bth0IU0MLVR9PdvuT\u002BMAjVD6bXJgAZ8WuFfpqv4kXINpI5\u002BOdmdiLjn9oH1GHr008LXUG8bWwIKgLI1zdAvkN9T1FJWYPVHX5YEJig9blzWHbLJlXfrIwG4llycpKygfYzPtRDnLUE5LYy74uT5QZrRBm532GY3oIaBQ5FBP\u002BCdK/VzpXww9s8MeP6Izyh9IHrj3R4\u002Bj0qieVOoZRoNdCdCz79vjyr2RSt1jqdQ1Frw5cwTpDYwnvXIs/MY\u002BUvMgbL5JfSPn/HnzQckv8P154w5tQ5sGyLEeynMwn6c35NHTXiOUrMPrgV6SuuG8eR82XzGfnkEdP6GtjeW8O48Pe3xPrhz34W0NH9930Xz9YxruzPOv5Lwy/ga\u002Bp0L3d0a9wb4L4\u002Bdi8y5Ig\u002BOd/x3lAXoqZUjZuLahH7fJ8gInxaeBnfquwHciLXBOTAzcJflSdV1OffWvqR/GfjT4bqLqrmq/rU8\u002BoxuMQqStR9H8u8BRu77Aj\u002BBxlZoT9hqo1k\u002BlJ0uRtp\u002B9jkqYGk2FrhmtD6bRxp00WnxIo1W5/VTewUIgXR1qJpIAW08rfaMPwVy6izZIqk9B2H1q/d1k7FRr8BoHWItRVn/EP2mvBaaU5XgaYQzF2tcLeQHRDGV9p7BB34uwvVL3oW8AtW5fHSjFPP6r/j7inPkmYaJujLc1YjDqCa7pSrfQHWIBeJ8C5NAAYKKcV6FQ/eNDPWivuA08zZP8W2vFR6ijD8pF\u002B4Np3R1osPtFoD0NNt\u002BG7quDusdQhqsF5RtfIG175NlBjbD\u002BNxIjA92NPoHu/AkaLcFeCRzW7oJMHfBuVEOl7Uc\u002BbSStgm23CvbAe4C0CyztNJ1WWIFxDcBOiLJBWx3Mk4D995FtZ2CPADupyk/XyTBtKw1RcMpDWDqQwwtpjLaKxiDdFvgng34O2g90LfCK9o6yu07yHpTDXgG/0dSJX0WJNi\u002Bq/HBsk1R0hK5SZdFaoorBROeGg94JrAD2ALDoKmDRn\u002BsBCuvqXBQorOmK1\u002Bx051aCfgbk2OlU2sPAX2wEeoSU\u002BwMo6rGaA8vgHoSwr4GTcHtsWvEYsC6kviRgGGAA/Zz6JF83OnzeWVVvNZ6Bn2GnV7Ql\u002BukqovJXQWGjn9tupznX3ynjR7g/cfJIPm8GXWPzLtt47gXQ10GznbQ\u002B0LUhKERYbXsfcG6s0/442x2QshoHzHcw1sa5DMc9QiyG/O/E3GsI3boF9gTGloTSZ8sxPok9pnQAdJc\u002BHDY07H2pQ/jdbJDsP\u002BN6ai7tUmNv4KArPvCRPjdwxMwJfGi\u002BH3jTzA/s4VnUuHIvkGbb8EoXvW3bRnI\u002ByTVLrgsyLrgPEDH0plpPpfu4Y69C50o9pcKxBzDeovFyrUT\u002BLkp/zaIbpE6Segb1PiZupJUyTOmy8Vh3Z9EApbN2YG47NibSrRKb4fZRe2VnI52Kl7q4kPoFdaDRFnM9g\u002BrLMo2O0BP16FJjIN1pnFFl5Dt19VfxCFPrXHMaK7rRTeIsXWJ\u002BGDgoqdRfiG8k/kljKnV90BZFG/k/YUs8RtPFlfSkOZBuFTo1dO1Ce5\u002BjKcZ6ey00b0HZ/6RLxCd0rbiUrjN6w\u002Ba4jooNXcU/DTm11rdTS1lHkH\u002Blm2V9dekekU9PKHtdygV1S5lDfy2Bv5NYAkhbSVJnj2CakLuzl5Prn7NfuFyOA3c7us7tsdMY9zh7uPrUVlGn34N9b\u002BbQNFme\u002BwBlQebzVBoJme8Jui50D1jZ77JOaRuhTPPvdr/L9huT6Qn3Z7ARlqPcO7D/6e7U8ynd7i6Gux7drtbbJQD0td4I\u002BnYSjVdr1w\u002BUpa\u002BjYjm\u002BFUYDH9M48LFR6nPVJ/NC1r/HySXXB/NbGqf2fqcRN5PucM3CvPkA5XKqa7ZDWKxKP998Q61DHSr3OS9QXVm/Kgvrkr3foVqyT8zTNNBch/R/obqKj\u002BX2PkbWr/pdjqWXwOvnVNclZfki7PdvyYex0MzzCey3s1U2vPtz\u002BMED7MIxGOd9XY9QvGsG7OEq28IjFiq/ou4mVOQaABtqKer5kvpHXUYT3MMQ5tRbOS5bUUvosqbQF1uhOxJt/LSG9//xVt7/rMtcD74mKFu7iX6SmOq3Hc5\u002BBO0W11AbvT/GvhxPA2F7ov9lH8gxIPtBzRW0XY4DhzYBjXFlU4GxArJdh/InQR5/BrVoo6cJ2lkLcngU8/84\u002BiTIJ8aJ6qvQvYLcE8rnBeg31xfYBzNyybEj\u002B68ahT7Auhxr3IY0DpXjPMir4tGDOpdTC2Mc1VfjE31U2XanLNffMB4n2c8ULmYTV9qAcr8RQs\u002BTC2xiaYcEdXElvZjNiLEvx5\u002BcK067q1OHx2C/yDmjxm2wfxw5VdI0Wqgfp4HuLrTQzKOBrjP0pjmYVhur6E1xL612/51auGpSfWmbuzLA14vgIwPzaw7m6y3oB\u002BylpL6Vc1vOL083us51L41z3YV6sV91PUm3I18HxT/0WnCvFxwHnlpIPwX5gv0dlPVcekocAd6jFrDDGir3JzQPbXwK\u002Bukps40Tdw09pU\u002BC/1l6yriKZorn6WHoZLd4H2m3U22xhhrBBntKyGcpWJXFBtBj8N9MfY1vEb\u002BFJqr4Y\u002BBHpr8PehZlYs2cqK9AmRtQ92LMp3TY/x/QQO1xOqqV0gRtEjHtHJE2N/Adf5aIv0x9zbn0gKhJy1FnX/EUaE3468BOv1O5lxvRTlxtWq7dRsvNv8CfrvwPyDBdtqe2SjtThmlTAntE7cAd/CT2IDLPaaydqAN250DwuNzJ94A51c4v0H/8CMqV/saBBfoPNBBy7ID9wQPaCXoH/BaD46FErBGQLh8iO37YQAz2FYP9xGbCpnjHhnRrN8k08vmV9GO\u002BIK0BO4mlSTcvp1UyHH2xUT\u002BBdfJB6L9t6lnODu1l2sEvtd1iDL2kDaK79ZWIvxt4H\u002BEPIHw/1i2ZbhX8Y\u002BklUaieJe0QVwDdKUW0pivESdqhH8IciIP\u002BnEyJog/881FWPt3NF2BsbwL6BSokzHi6092R7oS9sg/G0o\u002BwZfbJZ2Z6Ci2GLv4Ac3aZ/lNAzt0V5h9ornou6KG5\u002Bks0TFIJsZceDULPoBkKywNPS0QhXsKzx4arNy2UAF/PSWilgTJ3D5pr5tPNKH\u002Bh8Q/EHaf7jMM0U9Yh65b1SoC/jy\u002BCbfL0OzAVsm2rbiUgHLbYAf0z9jKQpX9GaQ6WAnOBHkCWg8uBO\u002BX4lHsH7N\u002Bule2SPKGsHVo/GhFs68UQKoNw8IU049cQlFcQYnx1f6gsw\u002BUp5ShleCEouQKupkjfAOmbKlkuDEL6LwTZD9WA/giHORt1yz5HH4Ui2F8Sqg/P7wOJy4DNoX3gPGNfADx\u002BAexzsFCOQb0Ic2KAeuacrewSQN8NnSrXn3aIuwl\u002BALbiRjEbtu8CrHXS3vBCh69w8sh9bk8nzXrk8drl6Usxp3QnHJB\u002BCYwp7FFoNsaEvG2BPQ5dYfslZZNBX3P2nu8FecJ\u002Bu0y\u002BIzD6oswKwEJZC2Cnfgs7\u002Bp/QqcnQZ\u002Btgs64BygPvGQuonviAeohDdJWEWQTb\u002BFGsx99AH0o8i/UfeYy6NAx750Kxja5A/E0uP3TcAbrF6EzDzCmoZy51w/7qDeiYPvqJikvgfq06KpYCrWQa4F7s\u002B3vrOfS08Rk9recGtolmsDdiA58Z8bQQ6Z5Dmp\u002BBp2DzHJbpEXaJ0QD2agO6FOueX/IlDmNfARj7wS/ai7wPmlfSJM9XNFACdkoR1qTeWMd6Gs9QoV4Gm7g22mNije9Dw6HT3Pr31NvYRbXNWOxbAljnjyKtn5KFGzZPD\u002BxVfgR\u002BcMK/oZ7Qh21ggwxEeGdBaMP3iLuXhhjnaCjKH6BXUDuEDxBvod9fodr6XrjnYu7vpQSMl07iK2qqj6ZifS5QDh6fAR0L3A6MwH5mlRN3K\u002BzppaD3Kcw1YF8H8xlL7DCxDHQntTMOgd6G8DucvLfA1kU8yrfzj6I79Hl2Hv1qKlDlTFHhxfoYhz6H/O\u002BBHq3iDXHD\u002BWIq1h6GzMLeZZjtYT9Ux0YJVx7shHjYb2HU3RR2XBbgUJlHuWFTBKnMj3W3VG9H03gJ\u002BRXqwh0CyMnP99A0mS403P08eDqJenZgP3K9bfdV4zeFllwIv8Lvkmq0VhWVefXlNI0dxnwJexdj3EVLwjBewjUeZQ8Dwina4hoDXkLpSKQPofw4TYPeL1VogjQ1sY/6DvPxO9hFVSgMgQpztYWs36JC\u002BcwZtDRIg\u002BEXi5dU1yBvAHq3ECgN0t9Tr0NLw2jhL8UH6xWcWgGlIWgVAhVmeiHvo9TK\u002BAr0HOBQFX6OWgVpeLykfAbquQHjB9T8EuPvS7QviPHIWwXpL3Rjv\u002B4ux3h9BPQ9\u002BB0q48SVKOcn8HzlbyzrmF2Wp5NdRpACpe4XqVWQhser8jH2YD8XCvkeoQqFIVBh5s/A06ivFPRrIEiD4ReLB\u002BX/QHs2AaDmDUjjwJ0cBvkO49HzaRTGdtTgi1NxFvOmOeZpc/RFFTaGQIW5DMCEXkkHXz/CHaTB8IvFg/LvHZ2RiLlzBcKuQL8cRB8cRBoHap9chcIgZLnmRiqUZUh5Q4eMCIU5CjrAxkYJ9/W2DoMdfL4\u002BqNILox3Y\u002BsCZ33IMmocg30Moy0ZhqF9HH8h9p2wHxuBFgb4LLUfR6B00LQjPYBtBv7EP/sZqvIaP08ox7fSFx8HGUD9kky3nunxvC9zMf4S8Ja6iRMmPrMOXa8MLne29pcqvD4CdkhooMxcGyjyuQFn07EBZzFmE6Qib7oRNtcP0BQhDuHtWoCyqHGETq/K6y5BuXFU6CaM3wj\u002B18wvEYz88TqSr5xDZxtP2/l//BGukfF4hbbab4J6i3tuOlrYePwPb5mr5LiHwkXoetdx\u002BHqXSd61Ehnw367wXH4T1eoSoRfUl1POPBOQ5RZvMxbAv78de3nnHod6VXkIT5HuKoC0p8xod7Odf/AsyYF8Tf58m6Y1pEh9nQ69Ffr0lTWJ/kQhs518ivAVNgg6cJMMVuiJNAvXGfncSPwGMJQP7qkmovw5/ikYpHKFRYqtNqyHFAdzsFdAvkK436BPAl0Bvh37ppE934p6z00Ffj\u002BLL6RY\u002BmhL5JGoFvXEN91OuLEu9O3kiLI2kThr1jE/yPwQyKCePXgN9cMSpM1iv5E1HWfuc\u002BlGe9jrgdyjAx4MuBx4HfgBffRzeZgEzEb/ELkvvB1oE1LfboW8APQMUgKflDp/XgjYBfRVYC9xIo2CDXlEdP5\u002BSqHzGVPW\u002Buxo973zDr9Dfeu5BPaueRvnVzzmcd9agMag8b9MrGO6cf9BArwbNDb5PD6fO2YYNoB3lOQnHX8\u002BmgVPyWbF8TxhOL3bmoZL\u002B2nvX4LNLh4adf9gQRjv96jmIXzkP8bvPRcj\u002BlrrEocFnZr9Gw5/tVT4jvchZCvUORb4rDb4bLbHPT/FpgY8kNeuDn1nYf1zkvM2/i/6e8XghinE2D\u002BPmZudczYZf6/\u002BLUudcx6/S8P4Knun4FRr\u002BzDqcmitRXh2KV\u002B\u002BzfgGV570KSXcNINOcRtzcRjrqcRmfkqnef10Axh/INAaRy/UW8r1GpqsxcdfNpAff218M5kLUsYJcHka6h8h0jyXuXocyRqOs2WTK92s2AvuA\u002BXD7Qc8AFcAP/BOk\u002BRq8tQSPXclEmRz7VB17QRdgXugcmDoPUBP1TiaX\u002BzXS3fvB7y3gdz34le/hfgHmOOSZCj4fBo/FaLN8v/ILMDujnqeR5yzax1HPctTzPvK2RvuWK/5uCL53DL57tN8/Bvard5BBnp36g\u002BX\u002Bq/34r/bLv6vdv8S7yQOWfD8s3faZAfaYc3ZAnhlYe0G\u002BxyCPfJe8NmDJ98nK9iTqDMyReSBTA6gH\u002Bb4g3y0DLjme1Dm6crpcPxuw5DtopO0LDFH1hI8D52xLpV/OMcBVL2DJ99bG8xh76jyEfS7iQvJx3Ym0OYEPXc\u002BA5gf2yPfQ9pkK1T51eDdIYROQ/DQK66fO1srnrsQeQcBbdMF/6iwugLSjUcZolw2Up86QUsi5jwclFR3pPXmOAnjQOU/RHGgmMlm\u002BhLaB1gh5roZojfYmbaFf\u002BCf5irqTOsamYt2tQXX5g1RXeKhuqBtr40Hekx4DXjHfoIeETgvUc3R5jHpVYLeEtiawGDqknpQh62eNcM4c3\u002Bu6jLoYq2mBhJ5BxSKFdiHNMgWk583oiMwP9y36eGoPnotVmdtYKzGFThhzqK6xjZbDr6lzBz8hfhuNlW4J9gb9rn98DrVTNucc2I1z6HqgF1AIXAVcrrem\u002BUFovWgMcKM6o4N88hxu8Jzu78rv2MLKtsR\u002BxbEpR0u7V56dcWzf0SpcnqOBnWiOoauEtLUWUTvgEXm2WJ2TWkS1o2tj//c47B\u002B5Xrej3gi7TCwKHHPSpkbVxNhYRDWALk4ZHuMv0EGLMF4QD9wowwA/bEsBtK/Cz\u002BeAy6Tb9T3JGzH1pE3p3kJbYQPc7tqJsHz089c0XyyB/1na6lpM3cxe5DXT6W3M6Q5Akv4GdRcP0UjjQ\u002BrJXw\u002BcNA9QvJzb7lXUWZ59Rtxog\u002Bx3/\u002BZc8hu30zXGTfSm2YB6ik20zlWXCU8H6CFi\u002BYaHUgw37JSV0C3yrKREeuB77XnSKs\u002BR3EKFhnx2eVSdwb5GHKWHjEnUQ50/mIq\u002B2U5tjYFo94ewaf4JHqfSXIyfLtCbAz37MD77QlanAptFO5T3JbCd0lD2pfpErMFp0AFJxGAzXwI90gV2xhWwLbK0XdZHRjkV6tfT2OC57KjjleezR4XQgUArx3\u002B9Qwc6bvmsuDh4jhP8lLr2O2ffD5AnKpk83uvh/lGds8h3/UD5UZfDpgs5ay9tYfXe4GPYreXQqZ86z/\u002B3Urb7XcqOOg33boTVUzTb/Qllq/TOWXk5rjy96WZZlqShZ6XBXzvMN8w5dh/oRIdK/71ASnWouYk0lA54nHS3O/kWOPGDzy8vWKbKG0olKhA/EJgfQo87cclAI\u002BAfjv9Z4IGqvNrnVfVIVPplfFFIHUOdNENDwoqr8yLbq/i9N6T9MXA/b0O5g\u002BkHnt\u002B2cPmpdC3hbwHa1aYXg4yn22wo/0SH/wvJK\u002BhuWVlHUzXXh\u002BkDqW3lvYwPqUg8iPUJwJxbLIH5eCzUjXm0z\u002BhJSyTELvvuiDqTvwjjVd0bYVfD/53QWDOpi7Hm9HTQTchzPRuAbarMRyXg/gZr2nro/mHAF5Ias1jzUOgnKMscTVmewZSlz6ZM813q5ZlNjeFWfgnUf5uENpCmShp6HyUMd6m7FUSbfyHNxfDBBcLeB47AntoHvPY/KDMcHyrssOEqoock5JnLi9QfjnfD8GvpD/wmhPZJeBnXOdhGO38DHg2F2Yc2h0K/1kZ4eDicuv8azgtshdsknLkxAGXNxj7sz5UIpt0FO8XGDRJCU7r/EOgGp5zzoPLNxDyaqebSLqesDTbY9FA\u002Boq6nhyT\u002BDeMhrH28p7ThgnBfQQ9daJ4G3WHxDzn0mH6I/MCt0PV3VOkkG/wrlhm01YLUmKK9a0xBu4NU3vPqTQbW2GfUfNqNdLvpriDVT7ATmLcN3a1ohURUH4feR1PgZkYFLVHnLuXzFWcvhDU2XaZBXC2M99nVoQ05P6wq3CBtPNq23qahbloveQGPLc37aYes18gnAzqij9gRGKza/zpN\u002BS3QDwXKbGip\u002BiG2D/JrZ\u002BNifkmDbolg/tByfk98OMLT//\u002BGcHnIMDbF8U\u002BxEd7e3xP\u002BWyDzVnM/GYKgjEdUpVP9NiKE30pq5AfK/jXwBEN\u002BIagSMkyMq4q7WB7bLcfvb4G4xUbQr99oQ477UGAjqXAx/\u002B9Np/Az9mFnbArc6tBfhN5SYYfxEvjdUwWehn1\u002BCC5Yn5zL2N9eSA6haVxnaOx58eG8hJa7FvGA\u002BNiGDIPefBo6dwRoMbABuB24U0JfDH99FbbBzKAZEmIo9mfpNMP9I93nYbQIcduBFyX0jrTMKWcpsNHBSllHiH\u002Br/ik9CPqsQ2c44bKeYjEQOIv9XwHWn860QR/s1I98korNyv20E/Zb8LjrWtoQhB2mHZdU/ytthhwU4F9jNmDXALvhPguqA2VwD3HaJ8O/RFgW6CiHh87AU07cFsRdDir3dp/B/QfgBaAv0OQC4T3tcHYFwl8C7Q96ErQj6AtVfvqAv449TYaUEZsCfyn8z2vYA/FP6RlRgbUmh\u002B5wZLjiVxCUswPWFOvUkgvht8tX8ql4HQm8DrdXL1R9OtXuW1YP9FVQjDUmbNA3DorFY\u002BgXN212vYh1vwT90FraQcyLte0g6GxQt00VzgE3IqzQkPuu3dL2Yc/afcgGgG6RMN6iKfD/EeiEdP1CIdMa9n6qn0O7hcRPAaTt8BxofeAFoLlD5f3KexDXDPQbUA4qy5J7MuzdMNeqQe4ZWDRwmRO20\u002BFb1nON477WQRMnvMkFUGDzREudcvxO3mB5Qci4Jx1I\u002B2U1MNpBsN7VTltWAHMd//UOVDnokxLgtjDAFuQC\u002B0rY65qhvU6bNGk7bKVNwBS7jewxoJddH5OymgmsgnuRDS3TBnsJ\u002BAioBbQG/gBMRtxe4Ba45X3s1b/VfrHHx78VE53\u002BDKUXw8kQOGGsLCxNfRssyQbNssHaOX3whJMu2HdB93hgCbDGwUTYrKOBkXIt4l/AJv1C2bFH5TcPxF46CqwN6et4oJG7I02Mgm0LBOnF3JJONPxYw/2swcXB7/jvjv/fDn7H/\u002B74/\u002BWofLbGYm2oZ43PGiYjBblfH\u002BrgAs8TlJ1c9dyiTRDe7lXPtX4dgb1hYTJvlvpOx7/52UMIPnTwP43/VyDXmd0htKVR\u002BcxUPQe9QHzl81GJqyR\u002Baa\u002BgbH0ZdoZqK8hnBjZqyn0Ewq6SEGnkkd\u002BAEGmB4\u002BI4RavvO5RQR3VmYp1z1iR4liX4DYDPaJi64yjfj8r7920o272X2rvGqzMWvYJ3ceX9UnW/XZ77mkKr5F1wdTZLfgsHZYmrgBGUI7rTNcJF14L2dV1OheJlqgv6B9GY\u002Boh\u002BVAh3HzEM8TdTH1d3xI\u002BD3ZKiwvuJyfAPp\u002BtcV8LfiQa7WiLtCBqI9IUyLzBQXIl0Q2mAq48KHyjm03WiCw103aDiBoq2KHswDUL7/\u002BCqBZ7upnHm3bCLAPB5k4PxKLfynXDl8\u002BaRsJ3/Crkmo80V8IMG82o/I00ZNZDvh8zegVdFEfyngHG0RH074xAtAU\u002B3G61pvTrXY3/HplT6Vd63wVcIL\u002Bp7Qz/b95sr\u002BZP3XjnsBXkexvkujuLRKU\u002Bd\u002B3jIoTvQH/LbOvJZV9izMRn\u002BO/ZY/5VQZ82cM6zqHJm8pz2RotT3U\u002BT7uGaBV/X2zveHPlVjY3Dl3eLgfW9ZBsa3nEdAvcrz81vV3fBLkX9H6Lef5N3EsDG1RI0BeXfYOfMq39XJs6HaQ4h7iApEMcZPsXI3BRbrsBslgt9lUd94uYs2BO/Buj\u002BlYlcrqusuxlh6gwa5dqkzyxtdm2iaOZzGu16j68yeNM6ThPDyqrNlrp7g4R/UP8pPJa5j1N/cQm3M58FrT3IF76gG75wG01zkGwm/CbwZTZLQemK/64AvoPk8m\u002BbrV9N4ieD5N5cffHxMGcG7mers6R4a6TlAHtdI6u/pAno79XfvAB2Dtqwhj1kUQrvaVN4Pl98DEB0g/7nQf2\u002BhnH7QWZPoGt1PU8z\u002BlGvcTp5g\u002BzA25FlLj7mEupizqEvwzqf40g6vpGnUSt2dDZ6jkd8YS6YN8pta8ttlSm73YX8u74DnId2iwNdiR\u002BBrjLGvxdWgW0EBo17ga/4d3HsCX\u002BuAmRyYoH9Fk8Tt1FLe28Z4kWf8CtW7UowbzzLysx20k31Lw7Sa1EJrSbW0jpQu/eeFg/6mcOQPD0fYa/oXVCwhWlOx2VLddxku78uIbtTOrAv/iyqs2H0VwjRAp7lmbfSVzMORZ7gdJuRZ4XjIM8UJ72in188i3KQ7oPdLHP9c4bHz6IuoQP8J7mi4JR8nge/gH4r8sGlcjbFOvYK65l4EY8OwpArG0vOhf35hqDN18ntNp6k\u002BkO8qA0DRv/muujQyKp2WRsXTqigDAPVijyzviBKxifJup\u002BhLvczbaZPRC/NrMNbrbijvY3U2Z4fxAMKy1fvQY/JeaCjkXdQgwu\u002Bk8pk0gJ\u002BgAfI\u002BKp9GA6rdR92PtMF7qME7qBe4fyrvq8pyZT6VZjPmjLw3OYXmchYo450CZf9uv7r/OA993D5QJl493191P1O6f79f3XFd6dx1vRCVdzbLnbuboMF7lfqTyAv8Xr\u002B6b9nMuXcJGmynvINpemihuA98dUW6pVgDdtFCfhD5bgZ\u002BCmwUun0v80JU3tF0pVbJrbLcsHD6l//J78fIf/I7K0RaKbWRd38V3Us32f6QsOo03qHdJQ3eTQZv6n4yZ/YdZdkeeU8Z/hXB\u002B6dB/tU9AmbfXQ4dJ\u002Bp\u002B6od056\u002BNp395fISNB3WPtzd4/AR11Q6UhfvV/d6v4d\u002BJvvjsfL\u002B6R70IfT8f/gPn\u002B5371RPFZPByx/n\u002B8Pmg7gm3oJsr/fJ\u002B8HhaWDn\u002B/gF/bYyroDzkHe0udJ9\u002BBu4hVeMzXK7BcRk\u002B3sLHl/g\u002BMNdICMwV31MnI4E6gRaCFgbphUaU6ysqMLZDTxfSPnlPEnb4Pn2DDY79iZhC\u002B8w2ygbaJ6Yh/BPa55lL\u002B4yvEF5sx6H8fVg394m6cF\u002BNNAWgL6CswUgXY5/rMN6FPxFxp22g7GJZryxXUpXuk8p3IBH837Cnk8hnNLDvNonptExC2tJ8Ey3gmYEFRj\u002BEt6NS17W0V9lRcl/4MOy6x5CnLuy29bCTb4W9expjbY060zXIOds1SJ6J173UWLyjzvjLO0fye3CPij\u002Bqb5YswDiTZ5hHO99BHSRtNL2h/R1UPYZaIq5YX0dZZjvsWe/Amie/g3rQ/r7dL33vVU\u002BnO/4d33v9T33X9d/xzSrVtl/4bpU6b/Uf\u002BD6VOuclv/skv0Ulvzs1lKY5Zy8aOd8hWPkr3/od/Vu/Cez5K/TOfwGMO/87AHv\u002BPwc/HfuP1heOkPfXF0R/esQ9hXrA3d7trwp3D6ChF0h//6\u002BW9x/EBXisFXRHHzkvfRukL5JUtvUi2AD7dJTzjcFRzrcEtwLzHGxB\u002BGTQVYCLlmDntbAKQX\u002B1fUiojRViXwXj2QvV059vc4bal7/s1usoO3sLdO1BeXdTfYNzCpsThktD3NcDHcPoFSGQ/luAXg5V9yxlG9Wzq/H2d2pC7cJQm07aueoMNezA4Ldfne\u002B8qXPh6s7jLtqgvjGRrt6dP0P2t3wuBPWtH2ctK5NQ34ApkhQYgDVggKT2vWLRUn27tcz\u002BDouk1d36brpF3y1p9XD57RiznaSIU9\u002BQkTToPndKuu3vwth3o\u002BW3ZcRsSdHmBZTNF0gKOchviTWSFHm94M0rKda7FfL7M5KG8RbCs/wmjdlT0rC61mM9Wy9p9TJD89rfqpE0LO9F3KHpQ93ye6K/ZpO5dmndg98fkzaD2ueEo9zZ94Sg2r7nIu5qe5/QfU/1PU7VfiZ0r38Rd7X9TYjbUx97kYdR9hJ73632PNg7h\u002B5/Qt3h\u002B/QLuUPnxEXdofv4i7jV/7NgLS3AL/iv57\u002BAux04c0r\u002Br4YktBoOVhDxdhfAHRcHZpKC6O\u002BgtDoM/SJYSmQm2pA3udx1z4dn8K8jaqyNaJQZDb3sRTu9f6lCzKUhQLrYPsAHRL5iojjUG4c88alECYhLrA1ALkn/D5DsughW/X\u002BM7b8B7/5GfBtBBBFEEEEEEfxPkdIzgggiiCCCCCKIIIIIIogggggiiCCCCCKIIIIIIogggggiiCCCCCKIIIIIIogggggiiCCCCCKIIIIIIogggggiiCCCCCKIIIIIIogggggiiCCCCCKIIIIIIogggggiiCCCCCKIIIIIIoggggiIEaVeyntRfZpC0aSRj/zyfwcgvtFyQfXL79BmszpkEWd5FIe/tVkutSHBalM5fLUoGX9rOmE1VTrp5ixHxWfTTvzNomL8zVSxNSgNfzMoC3/TVUia\u002Bpuq/qaov8nqbxJLpBiUmqR80s1ZgnLHq7\u002BxLIZmID5W\u002BaSbMy\u002BLpvsQ5lVhXtpNOotmUTQAYTKG4\u002B9shEUxD9VBmIzh\u002BOtHmAzhzK1yutRfExKRf2UOY\u002BvDjcTlCcxQ7RLqr65ScdUiTYUw9Zf8gRk8cBm3LF7xcwNRYfGfG/Byi/909krx0wx\u002B9kr\u002BYzn/weLfW/yMxf\u002B5k39n8X9Y/FuL/z2Ln7b4N2Ue8Y3Fyzy8zK//7WuP\u002BFsB/9rD/1rOv1qULL6y\u002BJfl/ItyfgqeUxY/afHPLf6ZxU9Y/C8W/9Tin5Tz4x\u002BniuPF/ONU/tGqLPFRMf/wWJ74sJwfy\u002BMfHMoTH5Tz948miveT\u002BdEjPnE0kR/x8cPvRYnDOfy9KP5npPhzOT\u002BE8g/l8Xcfihbv1uIH30kUB\u002Bvwd96OF\u002B8k8rfj\u002BVuIfiuTH0jk\u002B9/cKfZb/M19Q8SbO/mbs/V9/sAbeWLfEL7Pr7\u002BRx1\u002B3\u002BGvFfO9Cn9hr8T01\u002BKsWf8Xiu19uI3aX85efyRAvt\u002BG7/pQudhXwP5XGiT\u002Bl89KdsaI0ju/cES12xvId0fwlVPaSxbdb/MUk/kI8f97i2yz\u002BnMW3pvBn0/iWZL4Z5Wwu55tANpXzZ5D\u002BmQy\u002BEWTjDP60xTfU4U9ZfL3Fn7T4Oos/4eFrLf74mhjxuMXXxPA1fn01BLW6nK9CllVZfCXIynL\u002BGBr/WA3\u002BqMVXLN8pVlh8\u002BbIhYvlOvny2vuz\u002BPLFsCF/m1x\u002Bx\u002BFKMjqUWf7gRX4KMS7L8Ab4YWRfn8Iei\u002BYMIerAHfwDkAYsvghwWJfOFPn5/Hv\u002BjxRdY/D6L32vxeyw\u002B3\u002BJ3z8sTd1t8Xh6/y\u002BJ3WvyOAn77Ej7X4nMsPjuNz/LwmRafYfHpFp9Wzm8r51MtPnnSOjHZ4pPW8YkTMsTEcj4hg48v57fO4OMsPnZMAzGmAR9dzkeV81vK\u002Bc0WH2nxmyw\u002B4oZoMaKA32jxkgI\u002BvNgjhlu82MOL/foNwzzihmg\u002BzMOvL0oS1y/hRSxOFCXxoR5\u002BncWHWHww/IMtPmhghhhk8YHwDczgAyzev5xfa/F\u002B8PsD/Sz\u002BB4sXZvFrEvnVfdPE1eW8LyL6pvE\u002BvdNEn3Leu1ec6J3Ge8Xxq7J4zx6JomcS79E9TvRI5N27xYjucbxbDO9azq/skiiuTOJdEnnnct7pihjRKZZfEcM7Xp4nOpbzy1Hm5Xnc3yFW\u002BC3e4bIY0SGWXxbD27fzivbJvJ2Xty3mbSzeOpG3snjLBN6iebpokcebX5oomqfz5rv1Sz1ecWkiv3S23qwgWjRL5M38ekE0b9pknWhq8SYov8k63jiaN0rgDRu0EQ3LeYOkPNGgDa9fzC8p5vUsXjeJ56fEifwsXieH52Xx2rUggPq1s3itOF6TvKJmOc\u002BN5bl\u002BPSeRZ3t4VhbPrJEmMvN4jdgEUSON19gOnbFIz/Dy9LQeIn0GT0OlaT14qsVT4ngyaksu50kIS8rjicU8IY7HWzwO/jiL\u002B4p5bIxPxCbw2N16jI/HzNa9iPGW8\u002BgCHoWmRSXzqNm6x8s9ft1tcZfFTYsbwiMMiwsPF35dL\u002Be8mGvIpVnQXl7B4jh5OdvOiu9cwOr/d/yj\u002Bv\u002B9/zLp/wB/xAcKZW5kc3RyZWFtCmVuZG9iagp4cmVmCjAgMjEKMDAwMDAwMDAwMCA2NTUzNSBmIAowMDAwMDAwMDE1IDAwMDAwIG4gCjAwMDAwMDA3NjcgMDAwMDAgbiAKMDAwMDAwMDgxNiAwMDAwMCBuIAowMDAwMDAwODczIDAwMDAwIG4gCjAwMDAwMDExNjQgMDAwMDAgbiAKMDAwMDAwMjM4NiAwMDAwMCBuIAowMDAwMDAyNDMwIDAwMDAwIG4gCjAwMDAwMDI4ODcgMDAwMDAgbiAKMDAwMDAwNDM3OCAwMDAwMCBuIAowMDAwMDA1MjQyIDAwMDAwIG4gCjAwMDAwMDU0NTYgMDAwMDAgbiAKMDAwMDAwNjEwMiAwMDAwMCBuIAowMDAwMDA2NzI2IDAwMDAwIG4gCjAwMDAwMDY4NzQgMDAwMDAgbiAKMDAwMDAwNzA5MyAwMDAwMCBuIAowMDAwMDA3NjIxIDAwMDAwIG4gCjAwMDAwMDgwODggMDAwMDAgbiAKMDAwMDAwODI0MSAwMDAwMCBuIAowMDAwMDA4Mjg2IDAwMDAwIG4gCjAwMDAwMjcyNDMgMDAwMDAgbiAKdHJhaWxlcgo8PAovSUQgWzxGRkMyQzhFMDdCOTFGNTQ5OEUyQ0UwRTVCN0EzNDRDND48RkZDMkM4RTA3QjkxRjU0OThFMkNFMEU1QjdBMzQ0QzQ\u002BXQovSW5mbyAxIDAgUgovUm9vdCAyIDAgUgovU2l6ZSAyMQo\u002BPgpzdGFydHhyZWYKNDM1NDQKJSVFT0YK"
        }
      }
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      🔍 DEBUG GED - BaseUrl da config: 'https://siecm.des.caixa/siecm-web/ECM'
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      🔍 DEBUG GED - URL completa montada: 'https://siecm.des.caixa/siecm-web/ECM/v1/documentos/incluir'
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      🔍 DEBUG GED - HttpClient.BaseAddress: 'NULL'
info: System.Net.Http.HttpClient.IGedService.LogicalHandler[100]
      Start processing HTTP request POST https://siecm.des.caixa/siecm-web/ECM/v1/documentos/incluir
info: SISOU_api_sac_internet.Shared.ExternalServices.CaixaCertHandler[0]
      CERT: CA carregado para validação. Subject=CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR Expira=12/23/2042 12:05:14
info: System.Net.Http.HttpClient.IGedService.LogicalHandler[101]
      End processing HTTP request after 177.0008ms - 200
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      ✅ Documento gravado no GED com sucesso. Arquivo: RESPOSTA - Ocorrência nº 2205250000004.pdf, ID: 102F87A0-0000-C81A-8F04-09BDFEFF349F
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ [GED] PDF gravado no GED com sucesso. Código GED: 102F87A0-0000-C81A-8F04-09BDFEFF349F
info: 09/09/2026 14:20:03.786 RelationalEventId.CommandExecuted[20101] (Microsoft.EntityFrameworkCore.Database.Command) 
      Executed DbCommand (12ms) [Parameters=[:p0='102F87A0-0000-C81A-8F04-09BDFEFF349F' (Nullable = false) (Size = 50) (DbType = AnsiString), :p1=NULL (Size = 3) (DbType = AnsiString), :p2='C999999' (Nullable = false) (Size = 11) (DbType = AnsiString), :p3='2026-09-09T14:20:03.7698388-03:00' (DbType = Date), :p4='2026-09-09T14:20:03.7698336-03:00' (Nullable = true) (DbType = Date), :p5=NULL (Size = 300) (DbType = AnsiString), :p6='N' (Size = 1) (DbType = AnsiStringFixedLength), :p7='S' (Size = 1) (DbType = AnsiStringFixedLength), :p8='C' (Size = 1) (DbType = AnsiStringFixedLength), :p9='S' (Size = 1) (DbType = AnsiStringFixedLength), :p10='RESPOSTA - Ocorrência nº 2205250000004.pdf' (Nullable = false) (Size = 150) (DbType = AnsiString), :p11=NULL (DbType = Int32), :p12='49410' (Nullable = true), :p13=NULL (DbType = Int32), :p14=NULL (DbType = Int32), :p15=NULL (DbType = Int32), :p16=NULL (DbType = Int32), :p17=NULL (DbType = Int32), :p18=NULL (DbType = Int32), :p19=NULL (DbType = Int32), :cur0=NULL (Nullable = false) (Direction = Output) (DbType = Object)], CommandType='Text', CommandTimeout='120']
      DECLARE
      
      TYPE "rSOUTB042_ANEXO_OCORRENCIA_0" IS RECORD
      (
      "NU_ANEXO_OCORRENCIA" NUMBER(10)
      );
      TYPE "tSOUTB042_ANEXO_OCORRENCIA_0" IS TABLE OF "rSOUTB042_ANEXO_OCORRENCIA_0";
      "lSOUTB042_ANEXO_OCORRENCIA_0" "tSOUTB042_ANEXO_OCORRENCIA_0";
      
      BEGIN
      
      "lSOUTB042_ANEXO_OCORRENCIA_0" := "tSOUTB042_ANEXO_OCORRENCIA_0"();
      "lSOUTB042_ANEXO_OCORRENCIA_0".extend(1);
      INSERT INTO "SOU"."SOUTB042_ANEXO_OCORRENCIA" ("CO_ANEXO_GED", "CO_GRAU_SIGILO", "CO_USUARIO_EMISSOR", "DT_CADASTRO_ANEXO", "DT_EMISSAO_ANEXO", "ED_URL_RETORNO_B2B", "IC_ANEXO_RECURSO", "IC_ATIVO", "IC_TIPO_DESTINATARIO_RESPOSTA", "IC_TIPO_ORIGEM_ANEXO", "NO_ANEXO", "NU_EMPRESA_TERCEIRIZADA", "NU_OCORRENCIA_EXTERNA", "NU_OCORRENCIA_INTERNA", "NU_PRORROGACAO_OCRNA", "NU_REABERTURA_OCORRENCIA", "NU_RESPOSTA_SUBSIDIO", "NU_SOLICITACAO_OCRNA_INTNA", "NU_SOLICITACAO_UNIDADE", "NU_TAREFA_OCORRENCIA")
      VALUES (:p0, :p1, :p2, :p3, :p4, :p5, :p6, :p7, :p8, :p9, :p10, :p11, :p12, :p13, :p14, :p15, :p16, :p17, :p18, :p19)
      RETURNING "NU_ANEXO_OCORRENCIA" INTO "lSOUTB042_ANEXO_OCORRENCIA_0"(1)."NU_ANEXO_OCORRENCIA";
      OPEN :cur0 FOR SELECT "lSOUTB042_ANEXO_OCORRENCIA_0"(1)."NU_ANEXO_OCORRENCIA" FROM DUAL;
      
      END;
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ [GED] Registro de anexo PDF de resposta salvo em SOUTB042_ANEXO_OCORRENCIA (persistido). NU_ANEXO_OCORRENCIA: 108884
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ [RESPONDER] Etapa 4: PDF salvo no GED. Código: 102F87A0-0000-C81A-8F04-09BDFEFF349F
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      🏁 [RESPONDER] Etapa 5: Finalizando tratamento da ocorrência...
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      🔄 [FINALIZAR] Iniciando finalização de tratamento da ocorrência 2205250000004
info: 09/09/2026 14:20:03.812 RelationalEventId.CommandExecuted[20101] (Microsoft.EntityFrameworkCore.Database.Command) 
      Executed DbCommand (14ms) [Parameters=[:ocorrencia_NU_OCORR_2000315308='49410', :matriculaTruncada_1='service-acc' (Size = 11) (DbType = AnsiString)], CommandType='Text', CommandTimeout='120']
      SELECT "s"."NU_EQUIPE_OCORRENCIA", "s"."CO_USUARIO_SOLICITACAO", "s"."CO_USUARIO_TRATAMENTO", "s"."DE_JUSTIFICATIVA_OCORRENCIA", "s"."DH_RECEBIMENTO", "s"."IC_PRIORIDADE_TRTMO_OCORRENCIA", "s"."IC_TRANSFERENCIA_OCORRENCIA", "s"."NU_GRUPO_RSPNL_TRTMO", "s"."NU_OCORRENCIA_EXTERNA", "s"."NU_SITUACAO_OCORRENCIA", "s"."NU_SITUACAO_OCORRENCIA_NOVA", "s"."TS_FIM_TRATAMENTO", "s"."TS_INICIO_TRATAMENTO", "s"."TS_SOLICITACAO_TRANSFERENCIA"
      FROM "SOU"."SOUTB098_EQUIPE_OCORRENCIA" "s"
      WHERE (("s"."NU_OCORRENCIA_EXTERNA" = :ocorrencia_NU_OCORR_2000315308) AND ((("s"."CO_USUARIO_TRATAMENTO" = :matriculaTruncada_1) OR ("s"."CO_USUARIO_TRATAMENTO" IS NULL))))
      ORDER BY "s"."NU_EQUIPE_OCORRENCIA" DESC
      FETCH FIRST 1 ROWS ONLY
warn: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ⚠️ [FINALIZAR] Nenhum registro de equipe encontrado para a ocorrência 2205250000004
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ [RESPONDER] Etapa 5: Tratamento finalizado: False
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      💾 [RESPONDER] Executando COMMIT da transação...
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      🎉 [RESPONDER] ════════════════════════════════════════════════════════
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      🎉 [RESPONDER] RESPOSTA PROCESSADA COM SUCESSO!
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      🎉 [RESPONDER] Ocorrência: 2205250000004
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      🎉 [RESPONDER] PDF GED: 102F87A0-0000-C81A-8F04-09BDFEFF349F
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      🎉 [RESPONDER] Tratamento Finalizado: False
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      🎉 [RESPONDER] ════════════════════════════════════════════════════════
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      📧 [RESPONDER] Enviando email de resposta (após Commit) para cesob250@caixa.gov.br
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      📧 Preparando envio de email de resposta para ocorrência 2205250000004
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      📎 Email incluirá 1 anexo(s) (PDF apenas)
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      =================================================
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      📧 INICIANDO EnviarEmailRespostaSacAsync
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      =================================================
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Ocorrência: 2205250000004
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Nome Cliente: (não informado)
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Razão Social: (não informado)
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Resposta (length): 29 caracteres
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Destinatários: 1
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Anexos: 1
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Assunto gerado: SAC CAIXA - Ocorrência 2205250000004
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      📝 Montando template HTML...
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      ✅ Template HTML montado (1382 caracteres)
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      🚀 Chamando EnviarEmailAsync...
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      =================================================
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      📧 INICIANDO ENVIO DE EMAIL
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      =================================================
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      📋 Destinatários recebidos: 1
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         - cesob250@caixa.gov.br
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      🔧 Criando cliente SMTP...
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      🔧 Configurando SmtpClient:
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Host: smtptest.correiolivre.caixa
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Port: 25
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         EnableSsl: False
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Timeout: 30s
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         🔐 Autenticação: NÃO (sem credenciais)
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      ✅ SmtpClient configurado com sucesso
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      📝 Criando mensagem de email...
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         De: "SAC CAIXA" <sac@caixa.gov.br>
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Assunto: SAC CAIXA - Ocorrência 2205250000004
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Tamanho do corpo: 1382 caracteres
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      🔍 Validando destinatários...
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         ✅ Destinatário válido: cesob250@caixa.gov.br
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      📧 Total de destinatários válidos: 1
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      📎 Processando 1 anexo(s)...
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      📎 Baixando anexo do GED: RESPOSTA - Ocorrência nº 2205250000004.pdf (ID: 102F87A0-0000-C81A-8F04-09BDFEFF349F)
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      Recuperando documento do GED. Código: 102F87A0-0000-C81A-8F04-09BDFEFF349F
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      🔍 IP que será informado ao GED para recuperação (ipUsuarioFinal): 10.116.222.199
info: System.Net.Http.HttpClient.IGedService.LogicalHandler[100]
      Start processing HTTP request POST https://siecm.des.caixa/siecm-web/ECM/v1/documentos/consultar
info: SISOU_api_sac_internet.Shared.ExternalServices.CaixaCertHandler[0]
      CERT: CA carregado para validação. Subject=CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR Expira=12/23/2042 12:05:14
info: System.Net.Http.HttpClient.IGedService.LogicalHandler[101]
      End processing HTTP request after 53.8366ms - 200
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      📥 Baixando arquivo do GED via link: https://siecm.des.caixa/siecm-web/ECM/getDocumento/false/6fd0d573657a1d7d50c4e7052f0fb5f2b486319c1897928e4331ac0bfd0d3cb7be3938790299549861b7b14262fdfc6663c14c40eabd5cefd7c47241c37929129b85b383260f547ce8e7a579c3cc62712ca52715fc06bba361c3fc7b8047bbc9cdae8826c75cc2ced163b6fd13d9e21df6c6d0/RESPOSTA_-_OCORRÊNCIA_Nº_2205250000004.PDF
info: System.Net.Http.HttpClient.IGedService.LogicalHandler[100]
      Start processing HTTP request GET https://siecm.des.caixa/siecm-web/ECM/getDocumento/false/6fd0d573657a1d7d50c4e7052f0fb5f2b486319c1897928e4331ac0bfd0d3cb7be3938790299549861b7b14262fdfc6663c14c40eabd5cefd7c47241c37929129b85b383260f547ce8e7a579c3cc62712ca52715fc06bba361c3fc7b8047bbc9cdae8826c75cc2ced163b6fd13d9e21df6c6d0/RESPOSTA_-_OCORR%C3%8ANCIA_N%C2%BA_2205250000004.PDF
info: SISOU_api_sac_internet.Shared.ExternalServices.CaixaCertHandler[0]
      CERT: CA carregado para validação. Subject=CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR Expira=12/23/2042 12:05:14
info: System.Net.Http.HttpClient.IGedService.LogicalHandler[101]
      End processing HTTP request after 82.6894ms - 200
info: SISOU_api_sac_internet.Shared.ExternalServices.GED.GedService[0]
      ✅ Documento recuperado do GED com sucesso. Código: 102F87A0-0000-C81A-8F04-09BDFEFF349F, Tamanho: 44118 bytes
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      ✅ Anexo adicionado: RESPOSTA - Ocorrência nº 2205250000004.pdf (44118 bytes)
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      =================================================
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      🚀 ENVIANDO EMAIL VIA SMTP
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Servidor: smtptest.correiolivre.caixa:25
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         SSL: False
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         De: "SAC CAIXA" <sac@caixa.gov.br>
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Para: cesob250@caixa.gov.br
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Assunto: SAC CAIXA - Ocorrência 2205250000004
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      🔧 INFORMAÇÕES DE DIAGNÓSTICO:
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Machine Name: sisou-api-sac-internet-des-227-q4cpp
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         User Domain: sisou-api-sac-internet-des-227-q4cpp
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         User Name: default
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         OS Version: Unix 6.1.18.200
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         Host Name: sisou-api-sac-internet-des-227-q4cpp
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
         IPs Locais:
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
            - 25.3.43.214
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      =================================================
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      =================================================
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      ✅✅✅ EMAIL ENVIADO COM SUCESSO! ✅✅✅
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      =================================================
info: SISOU_api_sac_internet.Shared.ExternalServices.Email.EmailService[0]
      ✅ EnviarEmailRespostaSacAsync concluído
info: SISOU_api_sac_internet.Services.OcorrenciaService[0]
      ✅ Email de resposta enviado com sucesso para 1 destinatário(s)
info: SISOU_api_sac_internet.Shared.Middleware.RequestLoggingMiddleware[0]
      HTTP Request: POST: /v1/ocorrencias/responder 200 OK 3741ms

