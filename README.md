Using project "sisou-des".
-sh-4.2$ oc get bc sisou-sac-okd-des -n sisou-des -o yaml | grep -A 5 "from:"
Error from server (NotFound): buildconfigs.build.openshift.io "sisou-sac-okd-des" not found
-sh-4.2$ oc get bc sisou-vivavoz-okd-des -n sisou-des -o yaml | grep -A 5 "from:"
Error from server (NotFound): buildconfigs.build.openshift.io "sisou-vivavoz-okd-des" not found
-sh-4.2$

