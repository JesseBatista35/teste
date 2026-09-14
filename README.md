oc get pods -n siinp-des -l deploymentconfig=siinp-nucleo-des -o wide


oc logs siinp-nucleo-des-294-4jqcb -n siinp-des -c secrets-agent-sidecar
