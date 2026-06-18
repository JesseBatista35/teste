Criando novo BuildConfig

View raw log

Starting: Criando novo BuildConfig
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/f3c0ef21-20e3-4aa4-b3eb-6ad14741a716.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=sihdg-jboss8.0
+ oc get bc/sihdg-jboss8.0 -n build-images-ads
Error from server (NotFound): buildconfigs.build.openshift.io "sihdg-jboss8.0" not found
+ '[' 1 -ne 0 ']'
+ oc new-build --name sihdg-jboss8.0 --binary --strategy source --image-stream eap8-openjdk21-runtime-openshift-rhel9:1.0.1 -n build-images-ads
error: invalid name: sihdg-jboss8.0. Must be an a lower case alphanumeric (a-z, and 0-9) string with a maximum length of 58 characters, where the first character is a letter (a-z), and the '-' character is allowed anywhere except the first or last character.
##[error]Bash exited with code '1'.
Finishing: Criando novo BuildConfig


Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sigcn-raf-worker
Repository navigation
Code
Issues
Pull requests
1
 (1)
Actions
Projects
Models
Wiki
Security and quality
Insights
Settings
CI/CD Workflow - PRD
caixagithub/sigcn-raf-worker_main_27705154846.5 #5
All jobs
Run details
Re-run triggered yesterday
@c159475_caixac159475_caixa
 5c67e55
main
Status
Failure
Total duration
12m 42s
Artifacts
1


CI_CD_PRD / BUILD / BUILD summary
Docker Build summary
For a detailed look at the build, download the following build record archive and import it into Docker Desktop's Builds view.
Build records include details such as timing, dependencies, results, logs, traces, and other information about a build. Learn more

⬇️ caixagithub~sigcn-raf-worker~V8XTG5.dockerbuild (69.74 KB - includes 1 build record)

Find this useful? Let us know

ID	Name	Status	Cached	Duration
V8XTG5	sigcn-raf-worker	✅ completed	0%	1m4s
Build inputs
Job summary generated at run-time
Deployment protection rules
Reviewers, timers, and other rules protecting deployments in this run
Event	Environments	Comment
@c159475_caixa
c159475_caixa
approved yesterday
TQS	
Primeira versão para PRD

Annotations
1 error and 1 warning
CI_CD_PRD / ArgoCD_Deploy / ArgoCD_Deploy (TQS)
Process completed with exit code 1.
CI_CD_PRD / ArgoCD_Deploy / ArgoCD_Deploy (TQS)
Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/create-github-app-token@v2. For more information see: https://github.blog/changelog/2025-09-19-deprecation-of-node-20-on-github-actions-runners/



me ajuda com passo a apsos  onde clicar e corrgir o problema
