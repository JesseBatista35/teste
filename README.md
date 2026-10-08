# 1. Arquivos de segredo: controle-requisicoes (funciona) x simulador -63
oc exec siacc-pixautomatico-api-controle-requisicoes-tqs-69-d4nls -n siacc-tqs -c siacc-pixautomatico-api-controle-requisicoes-tqs -- ls -la /usr/src/app/secrets_files/siacc_tqs/
oc exec siacc-pixautomatico-api-simulador-tqs-63-n5cv9 -n siacc-tqs -c siacc-pixautomatico-api-simulador-tqs -- ls -la /usr/src/app/secrets_files/siacc_tqs/

# 2. Variáveis de banco/smallrye nos dois DCs (o ponto mais provável da diferença)
oc set env dc/siacc-pixautomatico-api-simulador-tqs -n siacc-tqs --list | grep -iE 'DATASOURCE|SMALLRYE'
oc set env dc/siacc-pixautomatico-api-controle-requisicoes-tqs -n siacc-tqs --list | grep -iE 'DATASOURCE|SMALLRYE'

# 3. Histórico do simulador: o que mudou entre a 63 e a 65
oc rollout history dc/siacc-pixautomatico-api-simulador-tqs -n siacc-tqs
oc rollout history dc/siacc-pixautomatico-api-simulador-tqs -n siacc-tqs --revision=65 | grep -iE 'DATASOURCE|SMALLRYE|image'
oc rollout history dc/siacc-pixautomatico-api-simulador-tqs -n siacc-tqs --revision=63 | grep -iE 'DATASOURCE|SMALLRYE|image'
