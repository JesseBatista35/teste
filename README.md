oc cancel-build sigsj-backend-apoio-15 sipdi-api-bff-tipo-investimento-8
oc get builds --no-headers | awk '$4=="Running" || $4=="New"'
