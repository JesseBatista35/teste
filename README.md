oc get is quarkus-java-binary-s2i -n openshift \
  -o jsonpath='{range .status.tags[*]}{.tag}{"\t"}{.items[0].image}{"\n"}{end}' | grep -E '^8\.2'

  for t in 8.2 8.2-openjdk21.0.1; do
  echo "== $t"
  oc run java-check-${t//./-} --rm -i --restart=Never -n build-images-ads \
    --image=image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i:$t \
    --command -- java -version 2>&1 | head -3
done

oc get istag quarkus-java-binary-s2i:8.2-openjdk21.0.1 -n openshift \
  -o jsonpath='{.image.dockerImageMetadata.Config.Env}' | tr ' ' '\n' | grep OPENSHIFT_BUILD
