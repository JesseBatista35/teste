oc get dc/sifug-siofg-api-des -n sifug-des -o jsonpath='{range .spec.template.spec.containers[*]}{"CONTAINER: "}{.name}{"\n"}{range .volumeMounts[*]}{"  - "}{.mountPath}{" (vol="}{.name}{")\n"}{end}{end}'
echo "---- INIT CONTAINERS ----"
oc get dc/sifug-siofg-api-des -n sifug-des -o jsonpath='{range .spec.template.spec.initContainers[*]}{"INIT: "}{.name}{"\n"}{range .volumeMounts[*]}{"  - "}{.mountPath}{" (vol="}{.name}{")\n"}{end}{end}'
