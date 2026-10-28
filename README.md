2026-10-28T18:48:59.6746215Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-10-28T18:48:59.6748992Z ==============================================================================
2026-10-28T18:48:59.6749080Z Task         : Bash
2026-10-28T18:48:59.6749125Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-28T18:48:59.6749187Z Version      : 3.227.0
2026-10-28T18:48:59.6749240Z Author       : Microsoft Corporation
2026-10-28T18:48:59.6749289Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-28T18:48:59.6749369Z ==============================================================================
2026-10-28T18:49:00.6918852Z Generating script.
2026-10-28T18:49:00.6929061Z ========================== Starting Command Output ===========================
2026-10-28T18:49:00.6936270Z [command]/bin/bash /opt/ads-agent/_work/_temp/d87423a0-0520-4139-95fa-345585f34e2d.sh
2026-10-28T18:49:03.0250666Z 
2026-10-28T18:49:03.0251651Z PLAY [local] *******************************************************************
2026-10-28T18:49:03.0623778Z Wednesday 28 October 2026  15:49:03 -0300 (0:00:00.110)       0:00:00.110 ***** 
2026-10-28T18:49:31.4553067Z 
2026-10-28T18:49:31.4553807Z TASK [Gathering Facts] *********************************************************
2026-10-28T18:49:31.4556708Z ok: [127.0.0.1]
2026-10-28T18:49:31.4931466Z Wednesday 28 October 2026  15:49:31 -0300 (0:00:28.430)       0:00:28.541 ***** 
2026-10-28T18:49:31.5830357Z Wednesday 28 October 2026  15:49:31 -0300 (0:00:00.090)       0:00:28.631 ***** 
2026-10-28T18:49:31.6670254Z [WARNING]: While constructing a mapping from /opt/ads-agent/_work/r18036/a
2026-10-28T18:49:31.6671109Z /esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml, line 71, column 3, found a
2026-10-28T18:49:31.6671615Z duplicate dict key (include_tasks). Using last defined value only.
2026-10-28T18:49:31.6788310Z included: /opt/ads-agent/_work/r18036/a/esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml for 127.0.0.1
2026-10-28T18:49:31.7062595Z Wednesday 28 October 2026  15:49:31 -0300 (0:00:00.123)       0:00:28.755 ***** 
2026-10-28T18:49:31.7917339Z 
2026-10-28T18:49:31.7918616Z TASK [vm : Cria variável build_repository_name] ********************************
2026-10-28T18:49:31.7918960Z ok: [127.0.0.1]
2026-10-28T18:49:31.8180591Z Wednesday 28 October 2026  15:49:31 -0300 (0:00:00.111)       0:00:28.866 ***** 
2026-10-28T18:49:32.7629121Z 
2026-10-28T18:49:32.7630166Z TASK [vm : Instalar dependências Python para vCenter] **************************
2026-10-28T18:49:32.7631224Z ok: [127.0.0.1]
2026-10-28T18:49:32.7873337Z Wednesday 28 October 2026  15:49:32 -0300 (0:00:00.969)       0:00:29.836 ***** 
2026-10-28T18:49:35.6031222Z 
2026-10-28T18:49:35.6031893Z TASK [vm : Executar script para marcar VM como template] ***********************
2026-10-28T18:49:35.6032062Z changed: [127.0.0.1]
2026-10-28T18:49:35.6283372Z Wednesday 28 October 2026  15:49:35 -0300 (0:00:02.841)       0:00:32.677 ***** 
2026-10-28T18:49:35.7044648Z 
2026-10-28T18:49:35.7045465Z TASK [vm : Exibir resultado do script vCenter] *********************************
2026-10-28T18:49:35.7045693Z ok: [127.0.0.1] => {
2026-10-28T18:49:35.7045805Z     "msg": [
2026-10-28T18:49:35.7045914Z         "Iniciando registro do template VMTX...", 
2026-10-28T18:49:35.7046050Z         "vCenter: 10.122.144.195", 
2026-10-28T18:49:35.7046436Z         "Template: eap74-openjdk8-apache24-rhel93-v015", 
2026-10-28T18:49:35.7049978Z         "Caminho VMTX: [TEMPLATE_TERRAFORM_NFS] eap74-openjdk8-apache24-rhel93-v015/eap74-openjdk8-apache24-rhel93-v015.vmtx", 
2026-10-28T18:49:35.7050478Z         "Datastore: TEMPLATE_TERRAFORM_NFS", 
2026-10-28T18:49:35.7050911Z         "Template 'eap74-openjdk8-apache24-rhel93-v015' ja existe e esta registrado. Nenhuma acao necessaria.", 
2026-10-28T18:49:35.7051563Z         "Operacao concluida com sucesso."
2026-10-28T18:49:35.7051721Z     ]
2026-10-28T18:49:35.7051857Z }
2026-10-28T18:49:35.7296031Z Wednesday 28 October 2026  15:49:35 -0300 (0:00:00.101)       0:00:32.778 ***** 
2026-10-28T18:49:35.8069908Z 
2026-10-28T18:49:35.8070801Z TASK [vm : Cria variável ansible] **********************************************
2026-10-28T18:49:35.8070995Z ok: [127.0.0.1]
2026-10-28T18:49:35.8311213Z Wednesday 28 October 2026  15:49:35 -0300 (0:00:00.101)       0:00:32.879 ***** 
2026-10-28T18:49:36.4074861Z 
2026-10-28T18:49:36.4076398Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-10-28T18:49:36.4076851Z ok: [127.0.0.1]
2026-10-28T18:49:36.4334789Z Wednesday 28 October 2026  15:49:36 -0300 (0:00:00.602)       0:00:33.482 ***** 
2026-10-28T18:49:36.7689739Z 
2026-10-28T18:49:36.7690858Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-10-28T18:49:36.7691124Z ok: [127.0.0.1]
2026-10-28T18:49:36.7996962Z Wednesday 28 October 2026  15:49:36 -0300 (0:00:00.366)       0:00:33.848 ***** 
2026-10-28T18:49:36.8726606Z Wednesday 28 October 2026  15:49:36 -0300 (0:00:00.072)       0:00:33.921 ***** 
2026-10-28T18:49:36.9701064Z Wednesday 28 October 2026  15:49:36 -0300 (0:00:00.097)       0:00:34.018 ***** 
2026-10-28T18:49:37.0187366Z 
2026-10-28T18:49:37.0188183Z TASK [vm : Sobrescrevendo groups vars ctc_nprd] ********************************
2026-10-28T18:49:37.0188526Z ok: [127.0.0.1]
2026-10-28T18:49:37.0444697Z Wednesday 28 October 2026  15:49:37 -0300 (0:00:00.074)       0:00:34.093 ***** 
2026-10-28T18:49:37.1230785Z included: /opt/ads-agent/_work/r18036/a/esteira-jboss-vm-v2/roles/vm/tasks/size/size_vm.yml for 127.0.0.1
2026-10-28T18:49:37.1526609Z Wednesday 28 October 2026  15:49:37 -0300 (0:00:00.108)       0:00:34.201 ***** 
2026-10-28T18:49:37.2348268Z included: /opt/ads-agent/_work/r18036/a/esteira-jboss-vm-v2/roles/vm/tasks/size/approved.yml for 127.0.0.1
2026-10-28T18:49:37.2659958Z Wednesday 28 October 2026  15:49:37 -0300 (0:00:00.113)       0:00:34.314 ***** 
2026-10-28T18:49:37.9386038Z 
2026-10-28T18:49:37.9386700Z TASK [vm : Consultar API] ******************************************************
2026-10-28T18:49:37.9392544Z fatal: [127.0.0.1]: FAILED! => {"cache_control": "private, max-age=0, no-cache, no-store", "changed": false, "content": "<html>\r\n  <head>\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n\r\n    <style type=\"text/css\">\r\n      body {\r\n        font-family: \"Helvetica Neue\", Helvetica, Arial, sans-serif;\r\n        line-height: 1.66666667;\r\n        font-size: 16px;\r\n        color: #333;\r\n        background-color: #fff;\r\n        margin: 2em 1em;\r\n      }\r\n      h1 {\r\n        font-size: 28px;\r\n        font-weight: 400;\r\n      }\r\n      p {\r\n        margin: 0 0 10px;\r\n      }\r\n      .alert.alert-info {\r\n        background-color: #F0F0F0;\r\n        margin-top: 30px;\r\n        padding: 30px;\r\n      }\r\n      .alert p {\r\n        padding-left: 35px;\r\n      }\r\n      ul {\r\n        padding-left: 51px;\r\n        position: relative;\r\n      }\r\n      li {\r\n        font-size: 14px;\r\n        margin-bottom: 1em;\r\n      }\r\n      p.info {\r\n        position: relative;\r\n        font-size: 20px;\r\n      }\r\n      p.info:before, p.info:after {\r\n        content: \"\";\r\n        left: 0;\r\n        position: absolute;\r\n        top: 0;\r\n      }\r\n      p.info:before {\r\n        background: #0066CC;\r\n        border-radius: 16px;\r\n        color: #fff;\r\n        content: \"i\";\r\n        font: bold 16px/24px serif;\r\n        height: 24px;\r\n        left: 0px;\r\n        text-align: center;\r\n        top: 4px;\r\n        width: 24px;\r\n      }\r\n\r\n      @media (min-width: 768px) {\r\n        body {\r\n          margin: 6em;\r\n        }\r\n      }\r\n    </style>\r\n  </head>\r\n  <body>\r\n    <div>\r\n      <h1>Application is not available</h1>\r\n      <p>The application is currently not serving requests at this endpoint. It may not have been started or is still starting.</p>\r\n\r\n      <div class=\"alert alert-info\">\r\n        <p class=\"info\">\r\n          Possible reasons you are seeing this page:\r\n        </p>\r\n        <ul>\r\n          <li>\r\n            <strong>The host doesn't exist.</strong>\r\n            Make sure the hostname was typed correctly and that a route matching this hostname exists.\r\n          </li>\r\n          <li>\r\n            <strong>The host exists, but doesn't have a matching path.</strong>\r\n            Check if the URL path was typed correctly and that the route was created using the desired path.\r\n          </li>\r\n          <li>\r\n            <strong>Route and path matches, but all pods are down.</strong>\r\n            Make sure that the resources exposed by this route (pods, services, deployment configs, etc) have at least one pod running.\r\n          </li>\r\n        </ul>\r\n      </div>\r\n    </div>\r\n  </body>\r\n</html>\r\n", "content_type": "text/html", "elapsed": 0, "msg": "Status code was 503 and not [200]: HTTP Error 503: Service Unavailable", "pragma": "no-cache", "redirected": false, "status": 503, "url": "https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=listaAprovadoSistema&sistema=sigsj-intranet&ambiente=des"}
2026-10-28T18:49:37.9414038Z 
2026-10-28T18:49:37.9414368Z PLAY RECAP *********************************************************************
2026-10-28T18:49:37.9414925Z 127.0.0.1                  : ok=12   changed=1    unreachable=0    failed=1    skipped=2    rescued=0    ignored=0   
2026-10-28T18:49:37.9415183Z 
2026-10-28T18:49:37.9416051Z Wednesday 28 October 2026  15:49:37 -0300 (0:00:00.675)       0:00:34.990 ***** 
2026-10-28T18:49:37.9416350Z =============================================================================== 
2026-10-28T18:49:37.9419457Z Gathering Facts -------------------------------------------------------- 28.43s
2026-10-28T18:49:37.9419882Z vm : Executar script para marcar VM como template ----------------------- 2.84s
2026-10-28T18:49:37.9420239Z vm : Instalar dependências Python para vCenter -------------------------- 0.97s
2026-10-28T18:49:37.9420580Z vm : Consultar API ------------------------------------------------------ 0.68s
2026-10-28T18:49:37.9420921Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.60s
2026-10-28T18:49:37.9421267Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.37s
2026-10-28T18:49:37.9421584Z vm : include_tasks ------------------------------------------------------ 0.12s
2026-10-28T18:49:37.9421911Z vm : include_tasks ------------------------------------------------------ 0.11s
2026-10-28T18:49:37.9422218Z vm : Cria variável build_repository_name -------------------------------- 0.11s
2026-10-28T18:49:37.9422548Z vm : include_tasks ------------------------------------------------------ 0.11s
2026-10-28T18:49:37.9423017Z vm : Cria variável ansible ---------------------------------------------- 0.10s
2026-10-28T18:49:37.9423345Z vm : Exibir resultado do script vCenter --------------------------------- 0.10s
2026-10-28T18:49:37.9423661Z vm : Copiar arquivos para o diretório de destino ansible group_vars ----- 0.10s
2026-10-28T18:49:37.9423995Z include_role : vm ------------------------------------------------------- 0.09s
2026-10-28T18:49:37.9424314Z vm : Sobrescrevendo groups vars ctc_nprd -------------------------------- 0.07s
2026-10-28T18:49:37.9424626Z vm : Copiar arquivos para o diretório de destino ansible inventory ------ 0.07s
2026-10-28T18:49:37.9424839Z Playbook run took 0 days, 0 hours, 0 minutes, 34 seconds
2026-10-28T18:49:38.2291891Z 
2026-10-28T18:49:38.2293121Z Error: 503 Server Error: Service Unavailable for url: https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=listarServidoresCadastrados&sistema=sigsj-intranet&ambiente=des&site=ctc_nprd
2026-10-28T18:49:38.2507840Z ##[error]Bash exited with code '1'.
2026-10-28T18:49:38.2540513Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)


