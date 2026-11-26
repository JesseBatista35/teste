oc cancel-build siisf-api-1 siisf-api-2 -n build-images-ads
oc get build -l buildconfig=siisf-api      # confirmar ambos Cancelled
oc get pods | grep siisf-api               # o pod siisf-api-1-build deve sumir/ficar Error
