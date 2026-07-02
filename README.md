Verificando se o Volume foi configurado corretamente.


check_pvc=`oc get pvc -o=json -n $(PROJETO)-$(AMBIENTE) | jq '.items[0]|.status.phase=="Bound"'`
if [ "$check_pvc" == "true" ]; then
   echo "O volume foi configurado com sucesso"
   else
   echo "Ocorreu alguma falha no processo de configuração"
   exit 1
fi
