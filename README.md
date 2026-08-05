Prezado(a),

Durante a análise técnica, identificamos duas possíveis aplicações SINAD que podem ser objeto desta solicitação:

1. Ambiente legado (VM sbrdeapllx114, JBoss EAP domain mode): não possui truststore/keystore customizado nem estrutura de módulo dedicada em /upload/des/ para o SINAD.

2. Ambiente de esteira (pipeline "SINAD-api" no Azure DevOps Releases): possui deploys ativos nos estágios EC DES, EC TQS, EC HMP e EC PRD, indicando aplicação containerizada (OKD/AKS).

Para prosseguirmos com a instalação do certificado do API Manager (CN https://api.des.caixa), solicitamos a confirmação do demandante sobre:
1. Em qual dos dois ambientes (legado ou esteira) o certificado deve ser instalado;
2. Caso seja na esteira, qual o namespace/cluster correspondente ao ambiente DES da aplicação SINAD-api.

Ficamos no aguardo para dar continuidade ao atendimento.

Atenciosamente,
Esteira Devops DES TQS NPRD
