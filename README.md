#!/bin/bash

source /opt/app-root/etc/generate_container_user

set -e

source ${NGINX_CONTAINER_SCRIPTS_PATH}/common.sh

process_extending_files ${NGINX_APP_ROOT}/src/nginx-start ${NGINX_CONTAINER_SCRIPTS_PATH}/nginx-start

#replace static values with environment variables
# The example below:
#if [ -n "$VAR" ]; then
#    sed -i "s#__VAR__#$VAR#g" /opt/app-root/src/main*.js
#fi

if [ -n "$SIAVL_BACKEND_GERENCIAL" ]; then #alterar para o nome do seu MFE
    sed -i "s#__SIAVL_BACKEND_GERENCIAL__#$SIAVL_BACKEND_GERENCIAL#g" /opt/app-root/src/main*.js #alterar para o nome do seu MFE
fi

if [ -n "$CERT_REQUIRED" ]; then
    sed -i "s#__CERT_REQUIRED__#$CERT_REQUIRED#g" /opt/app-root/src/main*.js
fi

exec nginx -g "daemon off;"

taks zip dist do build

  adding: dist/runtime.835b24ddf16b6315.js (deflated 45%)
  adding: dist/574.c4b217736f77ccd6.js (deflated 55%)
  adding: dist/575.6664c371ec51db81.js (deflated 46%)
  adding: dist/590.d67114ddeac1b702.js (deflated 53%)
  adding: dist/411.3d34dffd189d470d.js (deflated 80%)
  adding: dist/165.91da7b8128aa1207.js (deflated 77%)
  adding: dist/195.4eb432c48c747a79.js (deflated 68%)
  adding: dist/417.c681109a523bbb28.js (deflated 78%)
  adding: dist/561.1d604e2f9996a0a6.js (deflated 79%)
  adding: dist/457.01d96bc79f748d34.js (deflated 81%)
  adding: dist/3rdpartylicenses.txt (deflated 80%)
  adding: dist/assets/ (stored 0%)
  adding: dist/assets/baixados.svg (deflated 72%)
  adding: dist/assets/fonts/ (stored 0%)
  adding: dist/assets/fonts/CAIXAStd-Bold.ttf (deflated 50%)
  adding: dist/assets/fonts/CAIXAStd-BoldItalic.ttf (deflated 49%)
  adding: dist/assets/fonts/CAIXAStd-Book.ttf (deflated 50%)
  adding: dist/assets/fonts/CAIXAStd-BookItalic.ttf (deflated 49%)
  adding: dist/assets/fonts/CAIXAStd-ExtraBold.ttf (deflated 52%)
  adding: dist/assets/fonts/CAIXAStd-ExtraBoldItalic.ttf (deflated 51%)
  adding: dist/assets/fonts/CAIXAStd-Italic.ttf (deflated 50%)
  adding: dist/assets/fonts/CAIXAStd-Light.ttf (deflated 50%)
  adding: dist/assets/fonts/CAIXAStd-LightItalic.ttf (deflated 49%)
  adding: dist/assets/fonts/CAIXAStd-Regular.ttf (deflated 50%)
  adding: dist/assets/fonts/CAIXAStd-SemiBold.ttf (deflated 51%)
  adding: dist/assets/fonts/CAIXAStd-SemiBoldItalic.ttf (deflated 50%)
  adding: dist/assets/images/ (stored 0%)
  adding: dist/assets/images/hero-waves.svg (deflated 53%)
  adding: dist/assets/images/logo-senha.png (stored 0%)
  adding: dist/assets/images/heroes/ (stored 0%)
  adding: dist/assets/images/heroes/hero-gestaoDeUnidades.png (deflated 1%)
  adding: dist/assets/images/heroes/hero-unidades.png (deflated 1%)
  adding: dist/assets/images/heroes/teste-q.png (deflated 1%)
  adding: dist/assets/images/heroes/teste.png (deflated 36%)
  adding: dist/favicon.ico (deflated 0%)
  adding: dist/index.html (deflated 51%)
Finishing: Zip dist



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
/bin/bash /opt/ads-agent/_work/_temp/b8ea33d2-35ac-4e5a-905c-aa52043fd925.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=siavl-gerencial-frontend
+ oc get bc/siavl-gerencial-frontend -n build-images-ads
NAME                       TYPE     FROM     LATEST
siavl-gerencial-frontend   Source   Binary   6
+ '[' 0 -ne 0 ']'
Finishing: Criando novo BuildConfig



Atualizando valores BuildImage e TagImage

View raw log

Starting: Atualizando valores BuildImage e TagImage
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/bin/bash /opt/ads-agent/_work/_temp/899ce074-3120-4020-968d-7e25680eeaef.sh
+ set -o errexit
+ set -o pipefail
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=siavl-gerencial-frontend
+ oc patch bc siavl-gerencial-frontend --patch '{"spec": {"strategy": {"sourceStrategy": {"from": {"name": "nginx:1.26"}}}}}' -n build-images-ads
buildconfig.build.openshift.io/siavl-gerencial-frontend patched (no change)
Finishing: Atualizando valores BuildImage e TagImage
