oc rollout latest dc/siinp-nucleo-des -n siinp-des

# acompanha em tempo real
oc rollout status dc/siinp-nucleo-des -n siinp-des -w
