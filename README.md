#!/bin/bash
source /opt/app-root/etc/generate_container_user
set -e
source ${NGINX_CONTAINER_SCRIPTS_PATH}/common.sh
process_extending_files ${NGINX_APP_ROOT}/src/nginx-start ${NGINX_CONTAINER_SCRIPTS_PATH}/nginx-start

MAIN_JS=$(find /opt/app-root/src -maxdepth 5 -name "main*.js" | head -n1)

if [ -n "$SIMPF_API_URI" ] && [ -n "$MAIN_JS" ]; then
    sed -i "s#__SIMPF_API_URI__#$SIMPF_API_URI#g" "$MAIN_JS"
fi
if [ -n "$SIMPF_SSO_URI" ] && [ -n "$MAIN_JS" ]; then
    sed -i "s#__SIMPF_SSO_URI__#$SIMPF_SSO_URI#g" "$MAIN_JS"
fi

exec nginx -g "daemon off;"
