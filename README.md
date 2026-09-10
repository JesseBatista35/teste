oc rollout latest dc/sihdg-jboss8-des


oc rollout status dc/sihdg-jboss8-des

oc get pods | grep sihdg-jboss8-des
oc rsh $(oc get pod -l deploymentconfig=sihdg-jboss8-des,deployment=sihdg-jboss8-des-90 -o jsonpath='{.items[0].metadata.name}')
ls -la /sihdg_sinaf



<img width="1570" height="580" alt="image" src="https://github.com/user-attachments/assets/f3b30b20-ecd5-4d3a-9786-98050a2bc762" />


<img width="1611" height="643" alt="image" src="https://github.com/user-attachments/assets/afd7ebe3-2b4b-4c08-9135-fd48436b1d98" />
