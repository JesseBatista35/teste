config.yaml
p758786_caixa
p758786_caixa
Update config.yaml




app:
  name: sirmc-api-registro-interacoes-clientes-des
project:
  name: des
labels:
  appName: sirmc-api-registro-interacoes-clientes
  environment: des
source:
  repo: "https://github.com/caixagithub/sirmc-api-registro-interacoes-clientes-infranprd"
  path: des
sourcevar:
  repo: "https://github.com/caixagithub/sirmc-globalnprd"
  path: des
  values: global.yaml  
cluster:
  destination:  
    name: aks-crm-nprd
    namespace: sirmc-api-registro-interacoes-clientes



    sirmc-api-registro-interacoes-clientes-infranprd/des/templates
/akvs-shared-applicationinsights-connectionstring.yaml.yaml
c071615_caixa


apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-shared-applicationinsights-connectionstring
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: kv-crm-nprd
    object:
      name: shared-applicationinsights-connectionstring
      type: secret


      
<img width="1903" height="908" alt="image" src="https://github.com/user-attachments/assets/ee8a6bcc-383f-4c4c-87da-9ffa581c8d2a" />





A configuração de rede do Kubenet não terá mais suporte após 31 de março de 2028. Para garantir o suporte e a compatibilidade contínuos, migre seus clusters do AKS para a Sobreposição da CNI do Azure. Saiba mais
Exibição JSON
Grupo de recursos
:
rg-crm-nprd
Estado de energia
:
Em execução
Status da operação do cluster
:
Bem-sucedido
Assinatura
:
BOX - Dados, CRM e Marketing Digital - DES
Localização
:
Brazil South
ID da Assinatura
:
daa74d95-b1e0-4107-a10b-7fc657081034
Versão do Kubernetes
:
1.35.6
Endereço do servidor da API
:
dns-aks-crm-nprd-z9gcq33i.hcp.brazilsouth.azmk8s.io
SKU
:
Base
Tipo de preço
:
Standard
Configuração da rede
:
kubenet
Pools de nós
:
4 pools de nós
Registros de contêineres
:
acrcentralcaixanprdMais (1)
Data de criação
:
3 de outubro de 2025 às 08:20
Gerenciador de frota
:
Clique aqui para atribuir
Rótulos  (editar)
:
Solução de problemas do Kubernetes com o Copilot
Diagnostique a integridade e resolva possíveis problemas de cluster com um agente do Copilot.

Solucionar problemas
Serviços do Kubernetes
Tipo de criptografia
Criptografia em repouso com uma chave de criptografia gerenciada pela plataforma
Pools de nós virtuais
Não habilitado
Pools de nós
Pools de nós
4 pools de nós
Versões do Kubernetes
1.35.6
Tamanho dos nós
Standard_D4ds_v5
Provisionamento automático de nó
Não habilitado
Atualizações
Versão do Kubernetes
1.35.6
Tipo de Atualização Automática
Patch
Agendador de atualização automática
A cada 1 mês(es) em second Monday
Tipo de canal de atualização de nó
Imagem do Nó
Agendador do canal de atualização de nó
-
Configuração de segurança
Autenticação e Autorização
Autenticação do Microsoft Entra ID com o RBAC do Azure
Contas locais
Desabilitado
Extensões + aplicativos
aks-managed-azure-monitor-logs
Rede
Endereço do servidor da API
dns-aks-crm-nprd-z9gcq33i.hcp.brazilsouth.azmk8s.io
Configuração da rede
kubenet
CIDR do Pod
192.168.0.0/16
Serviço de CIDR
10.245.0.0/22
IP do serviço DNS
10.245.0.10
Mecanismo de política de rede
Nenhum
Balanceador de carga
standard
Cluster particular
Habilitado
Intervalos de IP autorizados
Não habilitado
Controlador de entrada do Gateway de Aplicativo
Não habilitado
Integrações
Insights do contêiner
Habilitado
ID do recurso do workspace
law-crm-nprd
Malha de Serviço – Istio
Habilitado





kv-crm-nprd | Segredos
Cofre de chaves
Pesquisar

Visão geral
Log de atividade
IAM (Controle de acesso)
Marcações
Diagnosticar e resolver problemas
Políticas de acesso
Visualizador de recursos
Eventos

Objetos
Chaves
Segredos
Certificados

Configurações

Monitoramento

Automação

Ajuda
Adicione ou remova favoritos pressionando Ctrl+Shift+F

Nome
Tipo
Status
Data de validade
app-api-campanhas-autenticacao-apikey-holder
Habilitado
app-api-campanhas-autenticacao-apikey-signing
Habilitado
app-api-id-unico-cliente-autenticacao-apikey-holder
Habilitado
app-api-id-unico-cliente-autenticacao-apikey-signing
Habilitado
app-api-produtos-autenticacao-apikey-holder
Habilitado
app-api-produtos-autenticacao-apikey-signing
Habilitado
app-emailmarketing-eventhub-connectionstring
connection string
Habilitado
app-emailmarketing-sqlserver-reader-connectionstrin
Habilitado
app-emailmarketing-storageaccount-caixasasdev-connectionstring
connection string
Habilitado
app-integracaoazure-appregistration-clientid
clientid
Habilitado
app-integracaoazure-client-secret
Habilitado
app-trilhas-storageaccount-saoutboxtrilhascrmdes-queue-connectionstring
Habilitado
app-trilhasconsulta-servicebus-connectionstring-listener
connection string
Habilitado
app-trilhasconsulta-servicebus-connectionstring-sender
connection string
Habilitado
cdb-crm-nprd
Habilitado
cdb-sicrm-des
Habilitado
databricks-github-actions-sp
Habilitado
emailmarketing-eventhub-connectionstring
Habilitado
mssqlsrv-localadmin-password
password
Habilitado
nprd-sirmc-sqlserver-scrmbp01-password
Habilitado
shared-api-produtos-redis-connectionstring
Habilitado
shared-apikey-sirmc
apikey
Habilitado
shared-applicationinsights-connectionstring
connectionstring
Habilitado
shared-azuremanagedredis-connectionstring
connection string
Habilitado
shared-cosmosdb-connectionstring
connection string
Habilitado
shared-cosmosdb-uri
URI
Habilitado
shared-des-auth-jwt-key-internet-kid
public-key/jwk
Habilitado
shared-des-auth-jwt-key-internet-n
public-key/jwk
Habilitado
shared-des-auth-jwt-key-intranet-kid
public-key/jwk
Habilitado
shared-des-auth-jwt-key-intranet-n
public-key/jwk
Habilitado
shared-des-auth-jwt-key-tokenx-kid
public-key/jwk
Habilitado
shared-des-auth-jwt-key-tokenx-n
public-key/jwk
Habilitado
shared-eventhub-connectionstring
Habilitado
shared-redis-connectionstring
Habilitado
shared-sqlserver-transacao-password
secret
Habilitado
shared-sqlserver-transacao-usuario
user
Habilitado
shared-sso-clientsecret-cliserrmc
secret
Habilitado
sirmc-az-sqlserver-transacao
user
Habilitado
sirmc-az-sqlserver-transacao-password
Password
Habilitado
 Enviar comentários


