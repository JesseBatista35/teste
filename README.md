bash# Capturar logs do crash anterior
oc logs -n sicbc-des sicbc-backend-des-15-mstdb --previous --tail=200

# Se não funcionar, tentar sem --previous
oc logs -n sicbc-des sicbc-backend-des-15-mstdb --tail=100

# Ver detalhes do crash
oc describe pod -n sicbc-des sicbc-backend-des-15-mstdb | tail -50
