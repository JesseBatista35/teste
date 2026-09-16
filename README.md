Favor realizar a avaliação e, se necessário, o ajuste dos repositórios abaixo, conforme o ambiente criado na REQ: "REQ000146006906":

siaaf-app-teste-pode-desconsiderar 

GitOps: Revisar e configurar, para os ambientes DES, os seguintes itens:
  - APP
  - Project 
  - Labels
  - Source e SourceVar
  - Cluster (apontando para a infraestrutura criada)

Repositórios siaaf-app-teste-pode-desconsiderar-infranprd e siaaf-app-teste-pode-desconsiderar-infraprd

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
