
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n siepr-des | grep -i bec3
siepr-curso-bec3-frontend-des-21-deploy   0/1       Completed               0                 2d17h
siepr-curso-bec3-frontend-des-22-9kznh    2/2       Running                 0                 52m
siepr-curso-bec3-frontend-des-22-deploy   0/1       Completed               0                 52m
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs -n siepr-des --tail=150 $(oc get pods -n siepr-des -o name | grep -i bec3 | grep -iv frontend | head -1)
error: expected 'logs (POD | TYPE/NAME) [CONTAINER_NAME]'.
POD or TYPE/NAME is a required argument for the logs command
See 'oc logs -h' for help and examples.
-sh-4.2$


<img width="1807" height="866" alt="image" src="https://github.com/user-attachments/assets/d7fb1637-b887-4e6e-ae9e-cba9e4a25327" />
