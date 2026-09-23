Com esses dados dá para fechar a configuração. Seguem os arquivos ajustados.

1. gitops/apps/sisph-api-painel-ddd/des/config.yaml
yaml
app:
  name: sisph-api-painel-ddd-des
project:
  name: des
labels:
  appName: sisph-api-painel-ddd
  environment: des
source:
  repo: "https://github.com/caixagithub/sisph-api-painel-ddd-infranprd"
  path: des
sourcevar:
  repo: "https://github.com/caixagithub/sisph-globalnprd"
  path: des
  values: global.yaml
cluster:
  destination:
    name: aks-hab-des
    namespace: sisph-api-painel-ddd

Como vão usar só DES, confira os config.yaml de tqs e hmp desse app. Se eles apontarem para aks-sisph-nprd, vão gerar Applications quebradas no ArgoCD. Vale removê-los por enquanto.

2. infranprd/des/values.yaml: bloco do Istio
yaml
  istio:
    - name: internal
      enabled: true
      servers:
      - port:
          number: 80
          name: http-default
          protocol: HTTP
        hosts:
        - "sisph-api-painel-ddd.des.caixa"
      - port:
          number: 443
          name: https-custom
          protocol: HTTPS
        tls:
          mode: SIMPLE
          credentialName: akvs-sisph-api-painel-ddd-des-caixa-certificate
        hosts:
        - "sisph-api-painel-ddd.des.caixa"
      prefix:
        - /
      targetPort: 80

Antes de subir, confira no values.yaml do sisph-api-auditoria (des) como está esse bloco. Assim você mantém o mesmo formato, inclusive o host HTTP interno *.des.hab.private.azure, se ele usar.

3. infranprd/des/templates/

Apague o akvs-sisph-api-painel-ddd.yaml atual e crie o akvs-sisph-api-painel-ddd-des-caixa-certificate.yaml:

yaml
apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-sisph-api-painel-ddd-des-caixa-certificate
  namespace: aks-istio-ingress
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: kv-hab-des
    object:
      name: sisph-api-painel-ddd-des-caixa
      type: certificate
  output:
    secret:
      name: akvs-sisph-api-painel-ddd-des-caixa-certificate
      type: kubernetes.io/tls
Sobre o certificado
O certificado ainda não existe. Enquanto sisph-api-painel-ddd-des-caixa não estiver no kv-hab-des, o secret TLS não é criado e o listener 443 não funciona. O pod sobe normalmente.
Ordem sugerida: faça o deploy agora para validar os pods e ative o HTTPS quando o certificado estiver no vault. Outra opção é manter os blocos 443 e AKVS comentados até lá.
Quem emite: a área de Criptografia/Proteção de Dados (o contato que você tem lá é o Carlos Augusto). Não sei o código exato do item de catálogo para emissão de certificado novo. O TE079 é para instalar um certificado que já existe, não para emitir.
O que pedir no chamado: CN sisph-api-painel-ddd.des.caixa, importado no kv-hab-des com o nome sisph-api-painel-ddd-des-caixa. Veja no chamado do sisph-api-auditoria qual item foi usado, porque deve ser o mesmo fluxo.
DNS: o registro sisph-api-painel-ddd.des.caixa também precisa ser criado, apontando para o ingress do Istio do aks-hab-des. Veja para onde aponta sisph-api-auditoria.des.caixa e peça o mesmo destino. Pode ser que o mesmo chamado já cubra isso.
Resposta ao demandante

Boa tarde! Tudo bem, obrigado.

Com os dados informados, ajustamos o GitOps para o cluster aks-hab-des e configuramos o Istio para o host sisph-api-painel-ddd.des.caixa, com o certificado lido do Key Vault kv-hab-des.

A emissão do certificado não é feita pela nossa equipe. O chamado deve ser aberto para a área de Criptografia/Proteção de Dados, solicitando:

Certificado com CN sisph-api-painel-ddd.des.caixa
Importação no Key Vault kv-hab-des com o nome sisph-api-painel-ddd-des-caixa
Criação do registro DNS sisph-api-painel-ddd.des.caixa, apontando para o ingress do cluster aks-hab-des (mesmo destino do sisph-api-auditoria.des.caixa)

Enquanto isso, vamos reexecutar o deploy para validar a subida dos pods. Assim que o certificado estiver disponível no Key Vault, o acesso HTTPS passa a funcionar sem novas alterações.

Antes de enviar, confirme o nome do item de catálogo e se o DNS entra no mesmo chamado ou em outro. Assim a mensagem já pode indicar o chamado exato que ele pediu.
