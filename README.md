# Qual label o EgressIP espera x quais labels o namespace tem
oc get egressip sispl-des-egress -o yaml | grep -A6 -i selector
oc get ns sispl-des --show-labels
oc get ns sispl-tqs --show-labels

# Pod atual, eventos e init containers
POD=$(oc get pod -n sispl-des -l name=sispl-atendimento-loterico-des -o name | tail -1)
echo $POD
oc describe $POD -n sispl-des | tail -30
oc get $POD -n sispl-des -o jsonpath='{.spec.initContainers[*].name}'; echo
oc logs $POD -n sispl-des -c <nome-do-init-container>


oc debug deployment/sispl-atendimento-loterico-des -n sispl-des -- \
  python3 -c "import socket;s=socket.create_connection(('sicsn.caixa',443),10);print('OK',s.getsockname())"
