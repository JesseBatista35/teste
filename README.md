oc logs -f sihdg-jboss8-tqs-25-8k2nr -c sihdg-jboss8-tqs -n sihdg-tqs

oc logs -f sihdg-jboss8-tqs-25-8k2nr -c sihdg-jboss8-tqs -n sihdg-tqs

timeout 5 bash -c '</dev/tcp/<host>/<porta>' && echo PORTA_OK || echo FALHOU

oc logs sihdg-jboss8-tqs-25-8k2nr -c sihdg-jboss8-tqs -n sihdg-tqs --previous | tail -100
oc describe pod sihdg-jboss8-tqs-25-8k2nr -n sihdg-tqs | sed -n '/Last State/,/Ready/p;/Events/,$p'
