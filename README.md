oc rollout history dc/siinp-nucleo-des -n siinp-des
oc rollout status dc/siinp-nucleo-des -n siinp-des
oc get rc -n siinp-des -l app=siinp-nucleo-des

oc adm cordon ceadecldlx081.nprd.caixa
oc rollout latest dc/siinp-nucleo-des -n siinp-des
oc get pods -n siinp-des -l deploymentconfig=siinp-nucleo-des -o wide -w

