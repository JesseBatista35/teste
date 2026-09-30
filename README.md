oc logs -f build/sirex-agenda-api-64 -n build-images-ads

oc get is sirex-agenda-api -n build-images-ads -o jsonpath='{range .status.tags[*]}{.tag}{"\n"}{end}' | tail -3
