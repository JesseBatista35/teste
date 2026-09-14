oc get pods -n siinp-des -l deploymentconfig=siinp-nucleo-des -o wide]


# a partir do node ceadecldlx081.nprd.caixa
showmount -e nfsctcnprd.ctc.caixa
telnet nfsctcnprd.ctc.caixa 2049
# ou, se telnet não estiver disponível:
nc -zv nfsctcnprd.ctc.caixa 2049


oc get events -n siinp-des --sort-by='.lastTimestamp' | tail -30
oc get nodes ceadecldlx081.nprd.caixa -o yaml | grep -A10 conditions


oc delete pod siinp-nucleo-des-293-dhxbs -n siinp-des
oc get pods -n siinp-des -l deploymentconfig=siinp-nucleo-des -o wide -w
