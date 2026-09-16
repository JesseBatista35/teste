À Sonda,

Solicitamos a avaliação e, se necessário, o ajuste dos repositórios abaixo, conforme o ambiente criado na REQ: "REQ000145922883":

siidp-backend-arquitetura-referencia

GitOps: Revisar e configurar, para os ambientes DES,HMP,PRD,TQS, os seguintes itens: 
  - APP 
  - Project 
  - Labels 
  - Source e SourceVar
  - Cluster (apontando para a infraestrutura criada)

Repositórios siidp-backend-arquitetura-referencia-infranprd e siidp-backend-arquitetura-referencia-infraprd

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
