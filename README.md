2026-06-16T12:46:06.5251111Z ##[section]Starting: Bash Script
2026-06-16T12:46:06.5253834Z ==============================================================================
2026-06-16T12:46:06.5253911Z Task         : Bash
2026-06-16T12:46:06.5253955Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-16T12:46:06.5254031Z Version      : 3.227.0
2026-06-16T12:46:06.5254076Z Author       : Microsoft Corporation
2026-06-16T12:46:06.5254127Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-16T12:46:06.5254208Z ==============================================================================
2026-06-16T12:46:07.3086078Z Generating script.
2026-06-16T12:46:07.3096295Z Script contents:
2026-06-16T12:46:07.3096890Z find /opt/ads-agent/_work/r18331/a -name "inventory*" -o -name "*.ini" | xargs cat
2026-06-16T12:46:07.3097916Z ========================== Starting Command Output ===========================
2026-06-16T12:46:07.3106370Z [command]/bin/bash /opt/ads-agent/_work/_temp/b5144e2f-ab34-4821-9201-417c410aceee.sh
2026-06-16T12:46:07.3153021Z find: ‘/opt/ads-agent/_work/r18331/a’: Arquivo ou diretório não encontrado
2026-06-16T12:46:07.3197680Z ##[section]Finishing: Bash Script
