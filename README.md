#!/bin/bash

source /opt/app-root/etc/generate_container_user

set -e

source ${NGINX_CONTAINER_SCRIPTS_PATH}/common.sh

process_extending_files ${NGINX_APP_ROOT}/src/nginx-start ${NGINX_CONTAINER_SCRIPTS_PATH}/nginx-start

if [ -n "$SIMPF_API_URI" ]; then
    sed -i "s#__SIMPF_API_URI__#$SIMPF_API_URI#g" /opt/app-root/src/main*.js
fi

if [ -n "$SIMPF_SSO_URI" ]; then
    sed -i "s#__SIMPF_SSO_URI__#$SIMPF_SSO_URI#g" /opt/app-root/src/main*.js
fi

exec nginx -g "daemon off;"
