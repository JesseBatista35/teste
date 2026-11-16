
You have access to 269 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "default".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get bc sispi-dict-reivindicacoes -n build-images-ads -o jsonpath='{.spec.strategy.sourceStrategy.from.name}{"\n"}'
quarkus-java-binary-s2i:8.2
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get is <nome_imagem> -n openshift -o jsonpath='{range .spec.tags[*]}{.name}{"\n"}{end}'
-sh: nome_imagem: Arquivo ou diretório não encontrado
-sh-4.2$ oc get is quarkus-java-binary-s2i:8.2 -n openshift -o jsonpath='{range .spec.tags[*]}{.name}{"\n"}{end}'
Error from server (NotFound): imagestreams.image.openshift.io "quarkus-java-binary-s2i:8.2" not found
-sh-4.2$ oc get is quarkus-java-binary-s2i -n openshift -o jsonpath='{range .spec.tags[*]}{.name}{"\n"}{end}'
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$

