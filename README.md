oc get pod -n sicmo-des | grep internet-des

oc get events -n sicmo-des --field-selector involvedObject.name=sicmo-internet-des-94-swszw

  oc logs sicmo-internet-des-94-swszw -c secrets-agent-sidecar -n sicmo-des
