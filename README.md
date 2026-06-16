2026-06-16T19:40:44.5344657Z ##[section]Starting: Bash Script
2026-06-16T19:40:44.5347388Z ==============================================================================
2026-06-16T19:40:44.5347467Z Task         : Bash
2026-06-16T19:40:44.5347518Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-16T19:40:44.5347581Z Version      : 3.227.0
2026-06-16T19:40:44.5347627Z Author       : Microsoft Corporation
2026-06-16T19:40:44.5347688Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-16T19:40:44.5347759Z ==============================================================================
2026-06-16T19:40:45.2700206Z Generating script.
2026-06-16T19:40:45.2710157Z ========================== Starting Command Output ===========================
2026-06-16T19:40:45.2717195Z [command]/bin/bash /opt/ads-agent/_work/_temp/9d514fdc-8afc-403b-ad0c-e3fe56307321.sh
2026-06-16T19:40:46.4968955Z deploymentconfig.apps.openshift.io/sipgc-api-informacoes-tqs image updated
2026-06-16T19:40:51.7160069Z error: #79 is already in progress (Running).
2026-06-16T19:40:51.8088277Z Error: unknown flag: --timeout
2026-06-16T19:40:51.8126427Z 
2026-06-16T19:40:51.8126760Z 
2026-06-16T19:40:51.8127180Z Usage:
2026-06-16T19:40:51.8128716Z   oc rollout status (TYPE NAME | TYPE/NAME) [flags]
2026-06-16T19:40:51.8128972Z 
2026-06-16T19:40:51.8129401Z Examples:
2026-06-16T19:40:51.8129547Z   # Watch the status of the latest rollout
2026-06-16T19:40:51.8129683Z   oc rollout status dc/nginx
2026-06-16T19:40:51.8129743Z 
2026-06-16T19:40:51.8129837Z Options:
2026-06-16T19:40:51.8130830Z   -f, --filename=[]: Filename, directory, or URL to files identifying the resource to get from a server.
2026-06-16T19:40:51.8131174Z   -R, --recursive=false: Process the directory used in -f, --filename recursively. Useful when you want to manage related manifests organized within the same directory.
2026-06-16T19:40:51.8131489Z       --revision=0: Pin to a specific revision for showing its status. Defaults to 0 (last revision).
2026-06-16T19:40:51.8131715Z   -w, --watch=true: Watch the status of the rollout until it's done.
2026-06-16T19:40:51.8131790Z 
2026-06-16T19:40:51.8132097Z Use "oc options" for a list of global command-line options (applies to all commands).
2026-06-16T19:40:51.8132189Z 
2026-06-16T19:40:51.8206976Z ##[error]Bash exited with code '1'.
2026-06-16T19:40:51.8209328Z ##[section]Finishing: Bash Script
