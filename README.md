oc get pv siiso-bcadastro-backend-data-des
oc get pvc -n siiso-des
oc describe pvc siiso-bcadastro-backend-data-des -n siiso-des

     oc delete pvc siiso-bcadastro-backend-data-des -n siiso-des
     oc delete pv siiso-bcadastro-backend-data-des

     
