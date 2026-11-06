2026-11-06T12:44:23.4622057Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-11-06T12:44:23.4625818Z ==============================================================================
2026-11-06T12:44:23.4625935Z Task         : Bash
2026-11-06T12:44:23.4625982Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-06T12:44:23.4626060Z Version      : 3.227.0
2026-11-06T12:44:23.4626138Z Author       : Microsoft Corporation
2026-11-06T12:44:23.4626187Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-06T12:44:23.4626259Z ==============================================================================
2026-11-06T12:44:23.6146306Z Generating script.
2026-11-06T12:44:23.6161103Z ========================== Starting Command Output ===========================
2026-11-06T12:44:23.6171367Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/0da4b423-5b0a-458c-94d5-dc2f7d1320a3.sh
2026-11-06T12:44:23.6262870Z /opt/ads-agent/_work/_temp/0da4b423-5b0a-458c-94d5-dc2f7d1320a3.sh: line 4: tf_var_quant: command not found
2026-11-06T12:44:23.9034224Z [DEPRECATION WARNING]: [defaults]callback_whitelist option, normalizing names 
2026-11-06T12:44:23.9034500Z to new standard, use callbacks_enabled instead. This feature will be removed 
2026-11-06T12:44:23.9034977Z from ansible-core in version 2.15. Deprecation warnings can be disabled by 
2026-11-06T12:44:23.9035141Z setting deprecation_warnings=False in ansible.cfg.
2026-11-06T12:44:24.4758820Z 
2026-11-06T12:44:24.4760090Z PLAY [local] *******************************************************************
2026-11-06T12:44:24.4760665Z Friday 06 November 2026  09:44:24 -0300 (0:00:00.009)       0:00:00.009 ******* 
2026-11-06T12:44:25.2740016Z [WARNING]: Distribution rhel 9.3 on host 127.0.0.1 should use /usr/bin/python3,
2026-11-06T12:44:25.2740265Z but is using /usr/bin/python for backward compatibility with prior Ansible
2026-11-06T12:44:25.2740451Z releases. See https://docs.ansible.com/ansible-
2026-11-06T12:44:25.2740640Z core/2.14/reference_appendices/interpreter_discovery.html for more information
2026-11-06T12:44:25.2945037Z 
2026-11-06T12:44:25.2945629Z TASK [Gathering Facts] *********************************************************
2026-11-06T12:44:25.2945805Z ok: [127.0.0.1]
2026-11-06T12:44:25.2946277Z Friday 06 November 2026  09:44:25 -0300 (0:00:00.818)       0:00:00.828 ******* 
2026-11-06T12:44:25.3303768Z 
2026-11-06T12:44:25.3304571Z TASK [include_role : vm] *******************************************************
2026-11-06T12:44:25.3305096Z Friday 06 November 2026  09:44:25 -0300 (0:00:00.035)       0:00:00.864 ******* 
2026-11-06T12:44:25.3588720Z [WARNING]: While constructing a mapping from /opt/ads-
2026-11-06T12:44:25.3589129Z agent/_work/r250/a/esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml, line 71,
2026-11-06T12:44:25.3589293Z column 3, found a duplicate dict key (include_tasks). Using last defined value
2026-11-06T12:44:25.3589563Z only.
2026-11-06T12:44:25.3734265Z 
2026-11-06T12:44:25.3734690Z TASK [vm : include_tasks] ******************************************************
2026-11-06T12:44:25.3735253Z included: /opt/ads-agent/_work/r250/a/esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml for 127.0.0.1
2026-11-06T12:44:25.3735558Z Friday 06 November 2026  09:44:25 -0300 (0:00:00.043)       0:00:00.907 ******* 
2026-11-06T12:44:25.4141978Z 
2026-11-06T12:44:25.4143374Z TASK [vm : Cria variável build_repository_name] ********************************
2026-11-06T12:44:25.4143637Z ok: [127.0.0.1]
2026-11-06T12:44:25.4143979Z Friday 06 November 2026  09:44:25 -0300 (0:00:00.040)       0:00:00.948 ******* 
2026-11-06T12:44:26.2474212Z 
2026-11-06T12:44:26.2475627Z TASK [vm : Instalar dependências Python para vCenter] **************************
2026-11-06T12:44:26.2476035Z ok: [127.0.0.1]
2026-11-06T12:44:26.2476316Z Friday 06 November 2026  09:44:26 -0300 (0:00:00.833)       0:00:01.781 ******* 
2026-11-06T12:44:26.6125142Z 
2026-11-06T12:44:26.6125830Z TASK [vm : Executar script para marcar VM como template] ***********************
2026-11-06T12:44:26.6128839Z fatal: [127.0.0.1]: FAILED! => {"changed": true, "cmd": ["python", "/opt/ads-agent/_work/r250/a/esteira-jboss-vm-v2/roles/vm/files/vcenter-mark-as-template.py"], "delta": "0:00:00.043686", "end": "2026-11-06 09:44:26.583735", "msg": "non-zero return code", "rc": 1, "start": "2026-11-06 09:44:26.540049", "stderr": "Traceback (most recent call last):\n  File \"/opt/ads-agent/_work/r250/a/esteira-jboss-vm-v2/roles/vm/files/vcenter-mark-as-template.py\", line 6, in <module>\n    from pyVim.connect import SmartConnect, Disconnect\n  File \"/usr/local/lib/python3.9/site-packages/pyVim/connect.py\", line 23, in <module>\n    from pyVmomi.five import PY3, HTTPConnection, HTTPSConnection\n  File \"/usr/local/lib/python3.9/site-packages/pyVmomi/__init__.py\", line 14, in <module>\n    from . import _init_utils  # noqa: E402\n  File \"/usr/local/lib/python3.9/site-packages/pyVmomi/_init_utils.py\", line 8, in <module>\n    raise Exception(msg)\nException: Python 3.10 or newer is required (found 3.9)", "stderr_lines": ["Traceback (most recent call last):", "  File \"/opt/ads-agent/_work/r250/a/esteira-jboss-vm-v2/roles/vm/files/vcenter-mark-as-template.py\", line 6, in <module>", "    from pyVim.connect import SmartConnect, Disconnect", "  File \"/usr/local/lib/python3.9/site-packages/pyVim/connect.py\", line 23, in <module>", "    from pyVmomi.five import PY3, HTTPConnection, HTTPSConnection", "  File \"/usr/local/lib/python3.9/site-packages/pyVmomi/__init__.py\", line 14, in <module>", "    from . import _init_utils  # noqa: E402", "  File \"/usr/local/lib/python3.9/site-packages/pyVmomi/_init_utils.py\", line 8, in <module>", "    raise Exception(msg)", "Exception: Python 3.10 or newer is required (found 3.9)"], "stdout": "", "stdout_lines": []}
2026-11-06T12:44:26.6130227Z ...ignoring
2026-11-06T12:44:26.6130461Z Friday 06 November 2026  09:44:26 -0300 (0:00:00.365)       0:00:02.146 ******* 
2026-11-06T12:44:26.6505920Z 
2026-11-06T12:44:26.6506393Z TASK [vm : Exibir resultado do script vCenter] *********************************
2026-11-06T12:44:26.6506540Z ok: [127.0.0.1] => {
2026-11-06T12:44:26.6506674Z     "msg": []
2026-11-06T12:44:26.6506799Z }
2026-11-06T12:44:26.6507182Z Friday 06 November 2026  09:44:26 -0300 (0:00:00.038)       0:00:02.184 ******* 
2026-11-06T12:44:26.6960633Z 
2026-11-06T12:44:26.6961635Z TASK [vm : Cria variável ansible] **********************************************
2026-11-06T12:44:26.6961972Z ok: [127.0.0.1]
2026-11-06T12:44:26.6962211Z Friday 06 November 2026  09:44:26 -0300 (0:00:00.045)       0:00:02.230 ******* 
2026-11-06T12:44:26.9978921Z [WARNING]: Skipped '/opt/ads-agent/_work/r250/a/_SIGSJ-boleto-config/ansible/'
2026-11-06T12:44:26.9979230Z path due to this access issue: '/opt/ads-agent/_work/r250/a/_SIGSJ-boleto-
2026-11-06T12:44:26.9979545Z config/ansible/' is not a directory
2026-11-06T12:44:27.0043354Z 
2026-11-06T12:44:27.0044000Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-11-06T12:44:27.0044294Z ok: [127.0.0.1]
2026-11-06T12:44:27.0044590Z Friday 06 November 2026  09:44:27 -0300 (0:00:00.308)       0:00:02.538 ******* 
2026-11-06T12:44:27.2108995Z 
2026-11-06T12:44:27.2111778Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-11-06T12:44:27.2112371Z ok: [127.0.0.1]
2026-11-06T12:44:27.2113463Z Friday 06 November 2026  09:44:27 -0300 (0:00:00.206)       0:00:02.745 ******* 
2026-11-06T12:44:27.2279992Z Friday 06 November 2026  09:44:27 -0300 (0:00:00.017)       0:00:02.762 ******* 
2026-11-06T12:44:27.2556827Z Friday 06 November 2026  09:44:27 -0300 (0:00:00.027)       0:00:02.790 ******* 
2026-11-06T12:44:27.2895193Z 
2026-11-06T12:44:27.2896185Z TASK [vm : Sobrescrevendo groups vars ctc_nprd] ********************************
2026-11-06T12:44:27.2896395Z ok: [127.0.0.1]
2026-11-06T12:44:27.2896823Z Friday 06 November 2026  09:44:27 -0300 (0:00:00.034)       0:00:02.824 ******* 
2026-11-06T12:44:27.3331962Z 
2026-11-06T12:44:27.3332732Z TASK [vm : include_tasks] ******************************************************
2026-11-06T12:44:27.3333550Z included: /opt/ads-agent/_work/r250/a/esteira-jboss-vm-v2/roles/vm/tasks/size/size_vm.yml for 127.0.0.1
2026-11-06T12:44:27.3333822Z Friday 06 November 2026  09:44:27 -0300 (0:00:00.043)       0:00:02.867 ******* 
2026-11-06T12:44:27.3797376Z 
2026-11-06T12:44:27.3798012Z TASK [vm : include_tasks] ******************************************************
2026-11-06T12:44:27.3798513Z included: /opt/ads-agent/_work/r250/a/esteira-jboss-vm-v2/roles/vm/tasks/size/approved.yml for 127.0.0.1
2026-11-06T12:44:27.3798831Z Friday 06 November 2026  09:44:27 -0300 (0:00:00.046)       0:00:02.913 ******* 
2026-11-06T12:44:27.8230163Z 
2026-11-06T12:44:27.8230922Z TASK [vm : Consultar API] ******************************************************
2026-11-06T12:44:27.8231189Z ok: [127.0.0.1]
2026-11-06T12:44:27.8231996Z Friday 06 November 2026  09:44:27 -0300 (0:00:00.443)       0:00:03.357 ******* 
2026-11-06T12:44:27.8562045Z 
2026-11-06T12:44:27.8562791Z TASK [vm : Parse JSON] *********************************************************
2026-11-06T12:44:27.8563053Z ok: [127.0.0.1]
2026-11-06T12:44:27.8563760Z Friday 06 November 2026  09:44:27 -0300 (0:00:00.033)       0:00:03.390 ******* 
2026-11-06T12:44:27.9049374Z 
2026-11-06T12:44:27.9049945Z TASK [vm : include_tasks] ******************************************************
2026-11-06T12:44:27.9050559Z included: /opt/ads-agent/_work/r250/a/esteira-jboss-vm-v2/roles/vm/tasks/size/requested.yml for 127.0.0.1
2026-11-06T12:44:27.9050867Z Friday 06 November 2026  09:44:27 -0300 (0:00:00.048)       0:00:03.439 ******* 
2026-11-06T12:44:28.2463494Z 
2026-11-06T12:44:28.2464120Z TASK [vm : Consultar API] ******************************************************
2026-11-06T12:44:28.2464461Z ok: [127.0.0.1]
2026-11-06T12:44:28.2464944Z Friday 06 November 2026  09:44:28 -0300 (0:00:00.341)       0:00:03.780 ******* 
2026-11-06T12:44:28.2800232Z 
2026-11-06T12:44:28.2800803Z TASK [vm : Parse JSON] *********************************************************
2026-11-06T12:44:28.2800992Z ok: [127.0.0.1]
2026-11-06T12:44:28.2801473Z Friday 06 November 2026  09:44:28 -0300 (0:00:00.033)       0:00:03.814 ******* 
2026-11-06T12:44:28.3117163Z Friday 06 November 2026  09:44:28 -0300 (0:00:00.031)       0:00:03.845 ******* 
2026-11-06T12:44:28.3483504Z Friday 06 November 2026  09:44:28 -0300 (0:00:00.036)       0:00:03.882 ******* 
2026-11-06T12:44:28.3802805Z Friday 06 November 2026  09:44:28 -0300 (0:00:00.031)       0:00:03.914 ******* 
2026-11-06T12:44:28.4199962Z Friday 06 November 2026  09:44:28 -0300 (0:00:00.039)       0:00:03.954 ******* 
2026-11-06T12:44:28.4546108Z 
2026-11-06T12:44:28.4547303Z TASK [vm : Recuperar variável de ambiente] *************************************
2026-11-06T12:44:28.4547492Z ok: [127.0.0.1]
2026-11-06T12:44:28.4547752Z Friday 06 November 2026  09:44:28 -0300 (0:00:00.034)       0:00:03.988 ******* 
2026-11-06T12:44:28.4880155Z 
2026-11-06T12:44:28.4880592Z TASK [vm : debug] **************************************************************
2026-11-06T12:44:28.4880864Z ok: [127.0.0.1] => {
2026-11-06T12:44:28.4881299Z     "template_name": "eap74-openjdk8-apache24-rhel93-v015"
2026-11-06T12:44:28.4881448Z }
2026-11-06T12:44:28.4881698Z Friday 06 November 2026  09:44:28 -0300 (0:00:00.033)       0:00:04.022 ******* 
2026-11-06T12:44:28.5265221Z 
2026-11-06T12:44:28.5266136Z TASK [vm : Definir fato se o nome do template começa com "controlm"] ***********
2026-11-06T12:44:28.5266441Z ok: [127.0.0.1]
2026-11-06T12:44:28.5266722Z Friday 06 November 2026  09:44:28 -0300 (0:00:00.038)       0:00:04.060 ******* 
2026-11-06T12:44:28.5726352Z 
2026-11-06T12:44:28.5727494Z TASK [vm : Set size default] ***************************************************
2026-11-06T12:44:28.5727708Z ok: [127.0.0.1]
2026-11-06T12:44:28.5728229Z Friday 06 November 2026  09:44:28 -0300 (0:00:00.046)       0:00:04.107 ******* 
2026-11-06T12:44:28.9187022Z 
2026-11-06T12:44:28.9187887Z TASK [vm : Run Invetory All] ***************************************************
2026-11-06T12:44:28.9188446Z changed: [127.0.0.1]
2026-11-06T12:44:28.9189188Z Friday 06 November 2026  09:44:28 -0300 (0:00:00.346)       0:00:04.453 ******* 
2026-11-06T12:44:28.9522539Z 
2026-11-06T12:44:28.9523161Z TASK [vm : Parse JSON output] **************************************************
2026-11-06T12:44:28.9523372Z ok: [127.0.0.1]
2026-11-06T12:44:28.9523901Z Friday 06 November 2026  09:44:28 -0300 (0:00:00.033)       0:00:04.486 ******* 
2026-11-06T12:44:28.9871824Z Friday 06 November 2026  09:44:28 -0300 (0:00:00.034)       0:00:04.521 ******* 
2026-11-06T12:44:29.0282715Z 
2026-11-06T12:44:29.0283317Z TASK [vm : Count the number of hosts] ******************************************
2026-11-06T12:44:29.0283482Z ok: [127.0.0.1]
2026-11-06T12:44:29.0283933Z Friday 06 November 2026  09:44:29 -0300 (0:00:00.040)       0:00:04.562 ******* 
2026-11-06T12:44:29.0644304Z Friday 06 November 2026  09:44:29 -0300 (0:00:00.036)       0:00:04.598 ******* 
2026-11-06T12:44:29.0964666Z 
2026-11-06T12:44:29.0965820Z TASK [vm : Apresenta quantidade do(s) host(s)] *********************************
2026-11-06T12:44:29.0966048Z ok: [127.0.0.1] => {
2026-11-06T12:44:29.0966140Z     "msg": [
2026-11-06T12:44:29.0966268Z         "num_hosts: 0"
2026-11-06T12:44:29.0966391Z     ]
2026-11-06T12:44:29.0966527Z }
2026-11-06T12:44:29.0966965Z Friday 06 November 2026  09:44:29 -0300 (0:00:00.032)       0:00:04.630 ******* 
2026-11-06T12:44:29.1362180Z Friday 06 November 2026  09:44:29 -0300 (0:00:00.039)       0:00:04.670 ******* 
2026-11-06T12:44:29.2066433Z 
2026-11-06T12:44:29.2066926Z TASK [vm : include_tasks] ******************************************************
2026-11-06T12:44:29.2067539Z included: /opt/ads-agent/_work/r250/a/esteira-jboss-vm-v2/roles/vm/tasks/create_vm_ip.yml for 127.0.0.1
2026-11-06T12:44:29.2067850Z Friday 06 November 2026  09:44:29 -0300 (0:00:00.070)       0:00:04.741 ******* 
2026-11-06T12:44:29.2421726Z 
2026-11-06T12:44:29.2422251Z TASK [vm : Sobrescrevendo groups vars ctc_nprd] ********************************
2026-11-06T12:44:29.2422442Z ok: [127.0.0.1]
2026-11-06T12:44:29.2422843Z Friday 06 November 2026  09:44:29 -0300 (0:00:00.035)       0:00:04.776 ******* 
2026-11-06T12:44:29.2787371Z 
2026-11-06T12:44:29.2788008Z TASK [vm : Definir valores] ****************************************************
2026-11-06T12:44:29.2788618Z ok: [127.0.0.1]
2026-11-06T12:44:29.2789063Z Friday 06 November 2026  09:44:29 -0300 (0:00:00.036)       0:00:04.813 ******* 
2026-11-06T12:44:29.3124665Z 
2026-11-06T12:44:29.3125163Z TASK [vm : Imprimir valores] ***************************************************
2026-11-06T12:44:29.3125316Z ok: [127.0.0.1] => {
2026-11-06T12:44:29.3125506Z     "lista_valores": [
2026-11-06T12:44:29.3125687Z         "site CTC",
2026-11-06T12:44:29.3125874Z         "vertical Desenvolvimento",
2026-11-06T12:44:29.3126049Z         "ambiente Aplicacao",
2026-11-06T12:44:29.3126174Z         "unidade CETAD",
2026-11-06T12:44:29.3126376Z         "categoria Linux",
2026-11-06T12:44:29.3126953Z         "descricao Esteira Agil: Servidor Jboss - SIGSJ-BOLETO",
2026-11-06T12:44:29.3127110Z         "red_num 4995"
2026-11-06T12:44:29.3127197Z     ]
2026-11-06T12:44:29.3127315Z }
2026-11-06T12:44:29.3127562Z Friday 06 November 2026  09:44:29 -0300 (0:00:00.033)       0:00:04.846 ******* 
2026-11-06T12:46:40.3583249Z 
2026-11-06T12:46:40.3584274Z TASK [vm : Busca IP] ***********************************************************
2026-11-06T12:46:40.3584983Z fatal: [127.0.0.1]: FAILED! => {"changed": false, "content": "", "elapsed": 130, "failed_when_result": true, "msg": "Status code was -1 and not [200]: Request failed: <urlopen error [Errno 110] Connection timed out>", "redirected": false, "status": -1, "url": "https://api.alocaip.telecom.caixa/ApiAlocaIP/Gerar"}
2026-11-06T12:46:40.3585475Z Friday 06 November 2026  09:46:40 -0300 (0:02:11.045)       0:02:15.892 ******* 
2026-11-06T12:46:40.3926479Z 
2026-11-06T12:46:40.3927193Z TASK [vm : fail] ***************************************************************
2026-11-06T12:46:40.3928390Z fatal: [127.0.0.1]: FAILED! => {"changed": false, "msg": "Não foi possível alcançar o AlocaIP. Prossível problema na rede."}
2026-11-06T12:46:40.3928628Z 
2026-11-06T12:46:40.3929081Z PLAY RECAP *********************************************************************
2026-11-06T12:46:40.3929634Z 127.0.0.1                  : ok=29   changed=2    unreachable=0    failed=1    skipped=9    rescued=1    ignored=1   
2026-11-06T12:46:40.3929712Z 
2026-11-06T12:46:40.3929861Z Playbook run took 0 days, 0 hours, 2 minutes, 15 seconds
2026-11-06T12:46:40.3930315Z Friday 06 November 2026  09:46:40 -0300 (0:00:00.034)       0:02:15.927 ******* 
2026-11-06T12:46:40.3930520Z =============================================================================== 
2026-11-06T12:46:40.3930735Z vm : Busca IP --------------------------------------------------------- 131.05s
2026-11-06T12:46:40.3930997Z vm : Instalar dependências Python para vCenter -------------------------- 0.83s
2026-11-06T12:46:40.3931262Z Gathering Facts --------------------------------------------------------- 0.82s
2026-11-06T12:46:40.3931508Z vm : Consultar API ------------------------------------------------------ 0.44s
2026-11-06T12:46:40.3931767Z vm : Executar script para marcar VM como template ----------------------- 0.37s
2026-11-06T12:46:40.3931980Z vm : Run Invetory All --------------------------------------------------- 0.35s
2026-11-06T12:46:40.3932255Z vm : Consultar API ------------------------------------------------------ 0.34s
2026-11-06T12:46:40.3932498Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.31s
2026-11-06T12:46:40.3932746Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.21s
2026-11-06T12:46:40.3932988Z vm : include_tasks ------------------------------------------------------ 0.07s
2026-11-06T12:46:40.3933194Z vm : include_tasks ------------------------------------------------------ 0.05s
2026-11-06T12:46:40.3933437Z vm : include_tasks ------------------------------------------------------ 0.05s
2026-11-06T12:46:40.3933684Z vm : Set size default --------------------------------------------------- 0.05s
2026-11-06T12:46:40.3933927Z vm : Cria variável ansible ---------------------------------------------- 0.05s
2026-11-06T12:46:40.3934178Z vm : include_tasks ------------------------------------------------------ 0.04s
2026-11-06T12:46:40.3934692Z vm : include_tasks ------------------------------------------------------ 0.04s
2026-11-06T12:46:40.3934900Z vm : Count the number of hosts ------------------------------------------ 0.04s
2026-11-06T12:46:40.3935144Z vm : Cria variável build_repository_name -------------------------------- 0.04s
2026-11-06T12:46:40.3935383Z vm : Set size ----------------------------------------------------------- 0.04s
2026-11-06T12:46:40.3935627Z vm : Verificar status dos servidores ------------------------------------ 0.04s
2026-11-06T12:46:40.6102647Z 
2026-11-06T12:46:40.6103459Z {
2026-11-06T12:46:40.6104048Z     "_meta": {
2026-11-06T12:46:40.6104357Z         "hostvars": {}
2026-11-06T12:46:40.6104483Z     },
2026-11-06T12:46:40.6104639Z     "tqs": {
2026-11-06T12:46:40.6104731Z         "children": [
2026-11-06T12:46:40.6104845Z             "local",
2026-11-06T12:46:40.6105161Z             "ctc_nprd"
2026-11-06T12:46:40.6105280Z         ],
2026-11-06T12:46:40.6105411Z         "vars": {}
2026-11-06T12:46:40.6105493Z     }
2026-11-06T12:46:40.6105606Z }
2026-11-06T12:46:40.6254182Z ##[error]Bash exited with code '1'.
2026-11-06T12:46:40.6267081Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)
