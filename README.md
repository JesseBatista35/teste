
-sh-4.2$ oc whoami --show-server
https://api.produtos4.caixa:6443
-sh-4.2$ ^C
-sh-4.2$ oc get is -n build-images-ads | grep -i reivind
sispi-dict-reivindicacoes                           default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispi-dict-reivindicacoes                           20261116.1231-1.0.0-SNAPSHOT,latest + 2 more...                   5 hours ago
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get istag -n build-images-ads | grep -i reivind
-sh-4.2$
