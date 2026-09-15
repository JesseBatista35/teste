Prezados,

Em atendimento à demanda referente à REQ000145922883, informamos que os ajustes solicitados para o repositório siidp-backend-arquitetura-referencia serão realizados nos ambientes DES e TQS.

Para darmos andamento aos itens listados, solicitamos as seguintes informações:

GitOps (ArgoCD) - DES/TQS:

Nome/endpoint do Cluster de destino criado na infraestrutura referente à REQ, para os ambientes DES e TQS.
Padrão esperado de nomenclatura para APP, Project e Labels a serem configurados.
Repositório, branch e path de Source a serem apontados, além dos valores esperados de SourceVar.

values.yaml (por ambiente DES/TQS):

Parâmetros de HPA esperados (réplicas mínima/máxima, thresholds de CPU/memória).
Configuração esperada de Service (porta, tipo) e Ingress (host, path).
Tolerations aplicáveis (node pool/taint de destino).

Templates:

Nome do Key Vault e identificação dos secrets a serem referenciados nos arquivos akvs*, para DES e TQS.
Chaves e valores esperados de ConfigMap pela aplicação, para configuração no values.yaml.

Istio:

Certificado a ser utilizado (domínio/validade) e eventuais regras específicas de Istio esperadas para o serviço.

Chart.yaml:

Confirmação, junto ao time de nuvem, da versão mais recente suportada do caixa-base-chart a ser aplicada.

Assim que recebermos essas informações, daremos sequência aos ajustes e apresentaremos as evidências por repositório, conforme solicitado.
