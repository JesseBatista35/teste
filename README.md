O que você deseja?:	Suporte ao GitHub
Sigla do Sistema:	teste
Qual o ambiente:	HMP
Informe a URL do repositório no GitHub:	Teste
Selecione a sua Comunidade:	Arrecadação, Convênios e Cobrança
Formas de contato:	Teste
Descrição da necessidade:	À Sonda,

Solicitamos a avaliação e, se necessário, o ajuste dos repositórios abaixo, conforme o ambiente criado na REQ: "REQ000145552062":

sispi-backend-poc-rosa-receiver

GitOps: Revisar e configurar, para os ambientes DES, os seguintes itens:
  - APP
  - Project
  - Labels
  - Source e SourceVar
  - Cluster (apontando para a infraestrutura criada)

Repositórios sispi-backend-poc-rosa-receiver-infranprd e sispi-backend-poc-rosa-receiver-infraprd

values.yaml (por ambiente):            

Avaliar e ajustar, se necessário:
  - HPA
  - Service
  - Ingress
  - Tolerations

Garantir aderência aos requisitos de cada ambiente.

Templates (por ambiente):
  - Validar e ajustar os arquivos akvs* para correto apontamento ao Key Vault;
  - Revisar ConfigMaps conforme padrão da esteira e garantir configuração no values.yaml;  

Istio:
  - Validar a configuração do Istio no ambiente;
  - Verificar se o certificado está corretamente configurado e válido;  

Chart.yaml (raiz do ambiente):
  - Validar e atualizar para a versão mais recente suportada pelo time de nuvem;  

Evidências: Apresentar os ajustes realizados em cada repositório.  

At.te, CXNDE04
