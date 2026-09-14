oc get pods -n siinp-des -l deploymentconfig=siinp-nucleo-des
oc rollout status dc/siinp-nucleo-des -n siinp-des
