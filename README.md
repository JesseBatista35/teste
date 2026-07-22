Alterando package.json com versão da Build

View raw log

Starting: Alterando package.json com versão da Build
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/bin/bash /opt/ads-agent/work_ads/_temp/c63ea9af-685e-4970-9d59-971adf9856f2.sh
sed: não foi possível ler 1.41.0.201/package.json: Arquivo ou diretório não encontrado
grep: 1.41.0.201/package.json: Arquivo ou diretório não encontrado
##[error]Bash exited with code '2'.
##[error]Bash wrote one or more lines to the standard error stream.
##[error]sed: não foi possível ler 1.41.0.201/package.json: Arquivo ou diretório não encontrado

##[error]grep: 1.41.0.201/package.json
##[error]: Arquivo ou diretório não encontrado

Finishing: Alterando package.json com versão da Build



Starting: Alterando package.json com versão da Build
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/bin/bash /opt/ads-agent/_work/_temp/d0016a8e-4199-4eee-96ff-f835858b225f.sh
  "version": "1.41.0.201",
    "preversion": "npm test",
    "version": "1.41.0.201",
    "postversion": "git push && git push --tags && rm -rf build/temp"
Finishing: Alterando package.json com versão da Build



