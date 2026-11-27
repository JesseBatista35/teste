oc project build-images-ads

# antes de cancelar, ver por que o 125 travou (pod e logs)
oc get pod siavl-atddigital-frontend-125-build -o wide
oc logs siavl-atddigital-frontend-125-build --tail=50
oc describe pod siavl-atddigital-frontend-125-build | tail -20

# cancelar o travado e a fila inteira
oc cancel-build siavl-atddigital-frontend-125
oc cancel-build $(oc get build -l buildconfig=siavl-atddigital-frontend --no-headers | awk '$4=="New"{print $1}')

# conferir que não sobrou nada em Running/New
oc get build -l buildconfig=siavl-atddigital-frontend | grep -E 'Running|New'
