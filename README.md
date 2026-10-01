oc get pods -n sihdg-tqs -l name=sihdg-jboss8-tqs
oc describe pod <pod> -n sihdg-tqs        # Last State / Reason / Exit Code / eventos de probe
oc logs <pod> -c sihdg-jboss8-tqs -n sihdg-tqs --previous
oc get events -n sihdg-tqs --sort-by=.lastTimestamp | tail -30


oc debug dc/sihdg-jboss8-tqs -n sihdg-tqs
# dentro do pod de debug:
getent hosts CBRDEDADNT002.extra.caixa.gov.br
timeout 5 bash -c '</dev/tcp/10.116.29.201/31153' && echo PORTA_OK || echo FALHOU

# OpenShiftSDN:
oc get netnamespace sihdg-tqs -o yaml      # campo egressIPs
# OVN-Kubernetes:
oc get egressip
oc get hostsubnet                          # quais nodes hospedam o egress IP
