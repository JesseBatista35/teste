oc set volume dc/siorf-backend-des --add --overwrite --name=siorf-backend-data-des --mount-path=/siorf

oc rollout status dc/siorf-backend-des

oc get pods
oc rsh <novo-pod> df -h
oc rsh <novo-pod> ls -la /siorf/
oc rsh <novo-pod> touch /siorf/teste.txt
oc rsh <novo-pod> ls -la /siorf/
 
