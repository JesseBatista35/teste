   oc get pods -n sinep-tqs
   oc rsh -n sinep-tqs <pod-antigo> \
     bash -c 'timeout 3 bash -c "</dev/tcp/10.192.224.100/1415" && echo ABERTA || echo FECHADA'
