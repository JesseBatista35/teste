
-sh-4.2$
-sh-4.2$ oc run teste-egress -n sihdg-tqs --restart=Never \
>   --image=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8:3.17.0.0 \
>   --overrides='{"spec":{"nodeName":"ceadecldlx077.nprd.caixa","containers":[{"name":"teste-egress","image":"default-route-openshift-image-registry.apps.proeep","600"]}]}}'ld-images-ads/sihdg-jboss8:3.17.0.0","command":["sl
pod/teste-egress created
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$  oc get pod teste-egress -n sihdg-tqs -o wide
NAME           READY     STATUS             RESTARTS   AGE       IP           NODE                       NOMINATED NODE   READINESS GATES
teste-egress   0/1       ImagePullBackOff   0          6s        25.1.37.45   ceadecldlx077.nprd.caixa   <none>           <none>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -n sihdg-tqs teste-egress
error: unable to upgrade connection: container not found ("teste-egress")
-sh-4.2$  oc get pod teste-egress -n sihdg-tqs -o wide
NAME           READY     STATUS             RESTARTS   AGE       IP           NODE                       NOMINATED NODE   READINESS GATES
teste-egress   0/1       ImagePullBackOff   0          17s       25.1.37.45   ceadecldlx077.nprd.caixa   <none>           <none>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$  oc get pod teste-egress -n sihdg-tqs -o wide
NAME           READY     STATUS             RESTARTS   AGE       IP           NODE                       NOMINATED NODE   READINESS GATES
teste-egress   0/1       ImagePullBackOff   0          21s       25.1.37.45   ceadecldlx077.nprd.caixa   <none>           <none>
-sh-4.2$ oc rsh -n sihdg-tqs teste-egress
error: unable to upgrade connection: container not found ("teste-egress")
-sh-4.2$  oc get pod teste-egress -n sihdg-tqs -o wide
NAME           READY     STATUS         RESTARTS   AGE       IP           NODE                       NOMINATED NODE   READINESS GATES
teste-egress   0/1       ErrImagePull   0          33s       25.1.37.45   ceadecldlx077.nprd.caixa   <none>           <none>
-sh-4.2$  oc get pod teste-egress -n sihdg-tqs -o wide
NAME           READY     STATUS         RESTARTS   AGE       IP           NODE                       NOMINATED NODE   READINESS GATES
teste-egress   0/1       ErrImagePull   0          37s       25.1.37.45   ceadecldlx077.nprd.caixa   <none>           <none>
-sh-4.2$
