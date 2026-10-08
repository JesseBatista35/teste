
-sh-4.2$
-sh-4.2$ oc run teste-egress -n sihdg-tqs --restart=Never \
>   --image=quay.io/openshift/okd-content@sha256:c53bb2c01dc951dfe46ba91d76553d6d16b007de0a5475f05c91e51505900a0c \
>   --overrides='{"spec":{"nodeName":"ceadecldlx077.nprd.caixa","containers":[{"name":"teste-egress","image":"quay.io/openshift/okd-content@sha256:c53bb2c01d"sleep","600"]}]}}'d6d16b007de0a5475f05c91e51505900a0c","command":[
pod/teste-egress created
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod teste-egress -n sihdg-tqs -o wide
NAME           READY     STATUS    RESTARTS   AGE       IP           NODE                       NOMINATED NODE   READINESS GATES
teste-egress   1/1       Running   0          5s        25.1.37.46   ceadecldlx077.nprd.caixa   <none>           <none>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -n sihdg-tqs teste-egress
sh-4.4#
sh-4.4#
sh-4.4#
sh-4.4# for i in 1 2 3; do date -u '+%H:%M:%S UTC'; timeout 5 bash -c '</dev/tcp/10.116.29.201/31153'; echo "201 rc=$?"; done
17:34:51 UTC
201 rc=124
17:34:56 UTC
201 rc=124
17:35:01 UTC
201 rc=124
sh-4.4#
sh-4.4#
sh-4.4# exit
exit
-sh-4.2$ oc delete pod teste-egress -n sihdg-tqs
pod "teste-egress" deleted

