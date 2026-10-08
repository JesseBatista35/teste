# Onde o BT realmente grava os arquivos (raiz, sem o siacc_tqs/)
oc exec siacc-pixautomatico-api-controle-requisicoes-tqs-69-d4nls -n siacc-tqs -c siacc-pixautomatico-api-controle-requisicoes-tqs -- ls -la /usr/src/app/secrets_files/

# Só os NOMES das chaves da Secret do controle-requisicoes (sem valores)
oc get secret siacc-pixautomatico-api-controle-requisicoes-tqs -n siacc-tqs -o go-template='{{range $k,$v := .data}}{{$k}}{{"\n"}}{{end}}'
