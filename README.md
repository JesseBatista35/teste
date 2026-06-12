🔧 Próximos Passos
Execute:
bash# Verificar PODS em falha
oc get pods --all-namespaces | grep -i "not ready\|error\|crash"

# Verificar describe de um node específico
oc describe node ceadecldlx001.nprd.caixa

# Verificar problemas de AAD
oc get oauths.config.openshift.io cluster -o yaml

# Verificar logs de autenticação
oc logs -n openshift-authentication deployment/oauth-openshift
Qual é especificamente o erro que você vê ao tentar acessar via AAD? Isso vai ajudar a focar na solução real! 🎯
