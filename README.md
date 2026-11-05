# 1. Qualquer variável que pareça URL/host
oc exec -it sipgc-api-informacoes-tqs-90-zczmd -n sipgc-tqs -- bash -c "env | grep -i -E 'url|host|prestador|colaborador' | sed 's/password=[^;]*/password=***/I'"

# 2. Procurar sigoc nos arquivos da aplicação
oc exec -it sipgc-api-informacoes-tqs-90-zczmd -n sipgc-tqs -- bash -c "grep -ril sigoc /opt/app-root/app 2>/dev/null | head"

oc exec -it sipgc-api-informacoes-tqs-90-zczmd -n sipgc-tqs -- bash -c "grep -i sigoc /opt/app-root/app/appsettings*.json"
