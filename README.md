
-sh-4.2$ oc run debug-siavl --image=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siavl-enviomsgativa-microfront:1.0.0-SNAPSHOT \
>   --restart=Never -n siavl-des \
>   --overrides='{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}' \
>   --command -- sleep 360
pod/debug-siavl created
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec debug-siavl -n siavl-des -- sed -n '15,35p' /tmp/scripts/run
fi

if [ -n "$CERT_REQUIRED" ]; then
    sed -i "s#__CERT_REQUIRED__#$CERT_REQUIRED#g" /opt/app-root/src/main*.js
fi

if [ -n "$CODIGO_CANAL_SIIPC" ]; then
    sed -i "s#__CODIGO_CANAL_SIIPC__#$CODIGO_CANAL_SIIPC#g" /opt/app-root/src/main*.js
fi

exec nginx -g "daemon off;*-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$  oc exec debug-siavl -n siavl-des -- find / -iname "*.sh" -path "*scripts*" 2>/dev/null
/usr/share/container-scripts/nginx/common.sh
-sh-4.2$
-sh-4.2$
-sh-4.2$
