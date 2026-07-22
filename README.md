oc get pods -n simil-des --field-selector=status.phase=Running -o json | \
  jq -r '.items[] | .metadata.name as $n | (.spec.containers + (.spec.initContainers // [])) [] | "\($n)\t\(.name)\t\(.resources.limits.cpu // "none")"'


  oc get pods -n simil-des --field-selector=status.phase=Running -o jsonpath='{range .items[*]}{.metadata.name}{"\n"}{range .spec.initContainers[*]}  init:{.name}={.resources.limits.cpu}{"\n"}{end}{range .spec.containers[*]}  main:{.name}={.resources.limits.cpu}{"\n"}{end}{"\n"}{end}'
