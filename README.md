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
