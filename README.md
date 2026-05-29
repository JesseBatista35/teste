Pessoal, boa tarde.

Identifiquei a causa de o sigms-motor-decisao não aparecer no FusionX/Kubernetes (a tela mostra "No Kubernetes resources"). Não é configuração de cluster nem de catalog-info — é um erro que está impedindo o deploy de acontecer.

O QUE ESTÁ ACONTECENDO
A aplicação do ArgoCD "sigms-motor-decisao-des" está com erro de sincronização desde 12/05 (Sync error / ComparisonError) e por isso nenhum recurso é criado no cluster ("No resources found"). Como nada sobe, o FusionX também não tem o que mostrar.

CAUSA RAIZ
O Helm não consegue renderizar o chart por causa de um erro de sintaxe YAML. Mensagem do ArgoCD:
  "YAML parse error on caixa-base-chart/templates/cm-sigms-motor-decisao.yaml: yaml: line 44: mapping values are not allowed in this context"

ARQUIVO
Repositório: sigms-motor-decisao-infranprd
Arquivo: des/templates/cm-sigms-motor-decisao.yaml
(Provavelmente o mesmo problema existe nos ambientes hmp/, tqs/ e tst/ — vale revisar os quatro.)

AJUSTES NECESSÁRIOS

1) Espaços indevidos após os ":" (é o que quebra o YAML)
Vários valores estão com um espaço depois dos dois-pontos, o que faz o YAML interpretar como novo mapeamento. Exemplos:
  - QUARKUS_DATASOURCE_URL: jdbc: oracle: thin: @...: 1521/orad01bc
  - MP_JWT_VERIFY_ISSUER / FACEBOOK_API_* / HTTP_PROXY / HTTPS_PROXY / SIICO_API_* / SSO_API_* / SIGMS_URL_ENVIO_MEDIA: https: //...  e  http: //...: 80
Correção: remover os espaços (https://, jdbc:oracle:thin:@host:1521/...) e colocar o valor entre aspas duplas.

2) Valores numéricos e booleanos precisam ser string
Em ConfigMap, todo valor de "data" tem que ser texto. Campos como 1420, true, false, 2, 60000 etc. devem ficar entre aspas (ex.: "1420", "true"), senão o próximo erro será de conversão de tipo.

3) Erro de digitação
proxy.host: {PROXY_HOST}  →  deve ser  proxy.host: "${PROXY_HOST}"  (faltou o $).

4) Chaves com barra "/" não são permitidas em ConfigMap
As chaves facebook-api/mp-rest/*, siico-api/mp-rest/* e sso-api/mp-rest/* têm "/", o que o Kubernetes rejeita no apply. As versões em MAIÚSCULAS (FACEBOOK_API_MP_REST_URL etc.) já cobrem isso via mapeamento do MicroProfile, então as chaves com "/" podem ser removidas — EXCETO a api-key do Siico, que não tem equivalente: criar a env SIICO_API_MP_REST_API_KEY vinda do secret akvs-siico-api-key.

5) Segurança (recomendação)
Há senha de banco (PA_BD) e credenciais em texto puro no ConfigMap. O ideal é mover senha/token/api-key para o Azure Key Vault (já existem os akvs-* no chart) e deixar o ConfigMap só com configuração não-sensível. Vale considerar rotacionar a senha do banco.

RESULTADO ESPERADO
Depois do ajuste e commit, o ArgoCD (auto-sync ligado) re-sincroniza, o caixa-base-chart gera Deployment + Service + Ingress, e os recursos passam a aparecer no FusionX.

Qualquer dúvida, fico à disposição.
