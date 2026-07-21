2026-07-21T12:21:45.7872650Z ##[section]Starting: Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
2026-07-21T12:21:45.7878279Z ==============================================================================
2026-07-21T12:21:45.7878361Z Task         : Bash
2026-07-21T12:21:45.7878411Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-21T12:21:45.7878527Z Version      : 3.227.0
2026-07-21T12:21:45.7878573Z Author       : Microsoft Corporation
2026-07-21T12:21:45.7878631Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-21T12:21:45.7878881Z ==============================================================================
2026-07-21T12:21:45.9782487Z Generating script.
2026-07-21T12:21:45.9795824Z ========================== Starting Command Output ===========================
2026-07-21T12:21:45.9803854Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/ef7d91d7-4ff2-459d-a772-4218a26256a3.sh
2026-07-21T12:21:45.9968601Z Clonando o repositório...
2026-07-21T12:21:45.9990555Z Cloning into 'esteira-logs'...
2026-07-21T12:21:46.0772811Z mv: cannot move 'esteira-logs' to a subdirectory of itself, '/opt/ads-agent/esteira-logs/esteira-logs'
2026-07-21T12:21:46.0773736Z Fazendo fetch da branch master...
2026-07-21T12:21:46.1239156Z Mudando para a branch master...
2026-07-21T12:21:46.1276564Z Already on 'master'
2026-07-21T12:21:46.1278720Z Your branch is up to date with 'origin/master'.
2026-07-21T12:21:46.1282134Z Hash: 
2026-07-21T12:21:46.1299517Z 0dde411503b628b365adf425b64871df8d569d93
2026-07-21T12:21:46.1301259Z Processo concluído.
2026-07-21T12:21:46.1382769Z ##[section]Finishing: Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs


2026-07-21T12:21:46.1411109Z ##[section]Starting: Cria Streams Graylog
2026-07-21T12:21:46.1416488Z ==============================================================================
2026-07-21T12:21:46.1416620Z Task         : Python script
2026-07-21T12:21:46.1416678Z Description  : Run a Python file or inline script
2026-07-21T12:21:46.1416738Z Version      : 0.213.0
2026-07-21T12:21:46.1416839Z Author       : Microsoft Corporation
2026-07-21T12:21:46.1416900Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/python-script
2026-07-21T12:21:46.1416979Z ==============================================================================
2026-07-21T12:21:46.3344971Z [command]/usr/bin/python3 /opt/ads-agent/esteira-logs/full_streams.py ***
2026-07-21T12:21:46.5790357Z URL BASE:  http://10.122.154.249:9000/api/streams
2026-07-21T12:21:46.5790599Z Expecting value: line 1 column 1 (char 0)
2026-07-21T12:21:46.5991836Z ##[error]The process '/usr/bin/python3' failed with exit code 2
2026-07-21T12:21:46.6024305Z ##[section]Finishing: Cria Streams Graylog
