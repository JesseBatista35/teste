
-sh-4.2$
-sh-4.2$ oc get bc sample-angular -n build-images-ads -o jsonpath='{.spec.strategy.sourceStrategy.from}'; echo
map[kind:ImageStreamTag namespace:openshift name:nginx:1.18]
-sh-4.2$
-sh-4.2$
-sh-4.2$

