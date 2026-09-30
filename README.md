oc get istag quarkus-java-binary-s2i:8.2 -n openshift -o jsonpath='{.image.dockerImageMetadata.Config.Env}' | tr ',' '\n' | grep -i java
