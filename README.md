check-case-sensitivity.js

View raw log

Starting: check-case-sensitivity.js
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/187ac3cf-3eb1-47b8-aef2-cc79f6cccdab.sh
=== Versao do typescript instalado no projeto ===
    "version": "5.8.3",
=== Rodando tsc LOCAL (sem npx) ===
error TS1149: File name '/opt/ads-agent/_work/21/s/src/app/model/endomarketing/categoria.model.ts' differs from already included file name '/opt/ads-agent/_work/21/s/src/app/model/endomarketing/Categoria.model.ts' only in casing.
  The file is in the program because:
    Matched by include pattern 'src/**/*.ts' in 'tsconfig.app.json'
    Matched by include pattern 'src/**/*.ts' in 'tsconfig.app.json'
##[error]Bash exited with code '2'.
Finishing: check-case-sensitivity.js
