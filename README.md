oc get pods -n sipgc-tqs | grep informacoes


oc exec -it sipgc-api-informacoes-tqs-NN-xxxxx -n sipgc-tqs -- env | grep -i sigoc
