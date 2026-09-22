Prezados,

Em atendimento à WO0000081641979, informamos que, com a conclusão da infraestrutura pelo time de Nuvem Pública (WO0000081641977 – conta accestruturantestinprd / 385545779011), foram realizados os seguintes ajustes para o ambiente DES da aplicação siidp-backend-arquitetura-referencia:

GitOps (gitops/apps/siidp-backend-arquitetura-referencia/des/config.yaml):

APP, Project e Labels corrigidos de "hmp" para "des";
Source e SourceVar ajustados para o path "des";
Cluster de destino: eks-siidp-nprd / namespace siidp-backend-arquitetura-referencia.

siidp-backend-arquitetura-referencia-infranprd/des/values.yaml:

Host e credentialName do Istio ajustados de HMP para DES;
HPA, Service e Resources revisados e mantidos conforme o padrão para DES.

Evidências em anexo.

Na análise da execução do pipeline (CI_DES / BUILD), identificamos que a falha ocorre no build da imagem Docker: o contexto de build enviado está vazio (2B), o que indica ajuste necessário no Dockerfile e/ou no .dockerignore do repositório da aplicação. Observamos também que o parâmetro uses_nexus está como false, embora o build Maven dentro do Dockerfile precise do repositório Nexus para resolver as dependências. Esses ajustes são de responsabilidade do time de desenvolvimento.

Os itens abaixo dependem de informações que não foram enviadas até o momento (solicitadas em 15/09 e reiteradas em 16/09) e não fazem parte deste atendimento:

Valores reais do ConfigMap (hoje com placeholder KEY/VALUE);
Key Vault e secrets a serem referenciados nos arquivos akvs*;
Confirmação do certificado do Istio e da versão do caixa-base-chart junto ao time de Nuvem.

Diante do exposto, encerramos esta WO. Havendo necessidade de novos ajustes após o envio dessas informações, favor registrar nova REQ informando o número desta WO.

Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
