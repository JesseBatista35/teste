oc get pods -n siinp-des -l deploymentconfig=siinp-nucleo-des -o wide

oc describe pod siinp-nucleo-des-294-4jqcb -n siinp-des

oc logs siinp-nucleo-des-294-4jqcb -n siinp-des -f
