
-sh-4.2$ oc get is quarkus-java-binary-s2i -n openshift \
>   -o jsonpath='{range .status.tags[*]}{.tag}{"\t"}{.items[0].image}{"\n"}{end}' | grep -E '^8\.2'
8.2     sha256:ddff87dbc8186441c32fdbc2a030bcabd00616434479e3ad7b04e86c9a42fdc6
8.2-hsm sha256:049925fbe1596fe0abe8615b9fd0bb619078a85d6e8c35cf67b4a68045a34023
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$   for t in 8.2 8.2-openjdk21.0.1; do
>   echo "== $t"
>   oc run java-check-${t//./-} --rm -i --restart=Never -n build-images-ads \
>     --image=image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i:$t \
>     --command -- java -version 2>&1 | head -3
> done
== 8.2



^C
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get istag quarkus-java-binary-s2i:8.2-openjdk21.0.1 -n openshift \
>   -o jsonpath='{.image.dockerImageMetadata.Config.Env}' | tr ' ' '\n' | grep OPENSHIFT_BUILD
Error from server (NotFound): imagestreamtags.image.openshift.io "quarkus-java-binary-s2i:8.2-openjdk21.0.1" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
