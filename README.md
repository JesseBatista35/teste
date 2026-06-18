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
