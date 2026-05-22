2026-05-22T20:11:24.2774765Z ##[section]Starting: Securely copy files to the remote machine
2026-05-22T20:11:24.2778058Z ==============================================================================
2026-05-22T20:11:24.2778146Z Task         : Bash
2026-05-22T20:11:24.2778187Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-05-22T20:11:24.2778355Z Version      : 3.227.0
2026-05-22T20:11:24.2778397Z Author       : Microsoft Corporation
2026-05-22T20:11:24.2778456Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-05-22T20:11:24.2778520Z ==============================================================================
2026-05-22T20:11:25.1330944Z Generating script.
2026-05-22T20:11:25.1339155Z Script contents:
2026-05-22T20:11:25.1339878Z sshpass -p *** pscp -h /opt/ads-agent/_work/r205/a/_SIGAL-config/des/servers-all.txt -e error -O "StrictHostKeyChecking=no" -l sansbp01 -Av -r /opt/ads-agent/_work/r205/a/_SIGAL-config/ /home/sansbp01/
2026-05-22T20:11:25.1342537Z ========================== Starting Command Output ===========================
2026-05-22T20:11:25.1350340Z [command]/bin/bash /opt/ads-agent/_work/_temp/a6840915-ad6e-418b-afd6-509474fca8f3.sh
2026-05-22T20:11:25.1727913Z Could not open hosts file: No such file or directory
2026-05-22T20:11:25.1811076Z ##[error]Bash exited with code '1'.
2026-05-22T20:11:25.1822458Z ##[section]Finishing: Securely copy files to the remote machine

