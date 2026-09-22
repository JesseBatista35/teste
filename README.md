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



Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081641979
Criado em	 18/09/2026 22:10:13
Criado por	 P507043
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados~

Esta REQ permanece pendente, aguardando a conclusão da REQ000145922883 pelo time de Nuvem Pública, para que os ajustes de GitOps (APP, Project, Labels, Source/SourceVar, Cluster, values.yaml, templates, Istio e Chart.yaml) possam ser realizados.

Atte.

CTIS / CESTI / ESTEIRAS DEVOPS DES TQS
ID da Ordem de Trabalho	 WO0000081641979
Criado em	 17/09/2026 15:16:50
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Pendencia.

Nota de atendimento — REQ000145922885

Em atendimento à REQ000145922885, informamos que a configuração dos itens solicitados (GitOps, values.yaml, templates, Istio e Chart.yaml) para o ambiente DES está condicionada à conclusão da solicitação de infraestrutura em aberto junto ao time de Nuvem Pública, registrada na REQ000145922883 (recursos EKS, RDS, DynamoDB, MSK, EventBridge, S3, Static Web Site e plugins ArgoCD/Developer Hub/external-dns/akv2k8s referentes à app siidp-backend-arquitetura-referencia).

Como a infraestrutura ainda não foi disponibilizada, esta REQ permanece pendente, aguardando a conclusão da REQ000145922883 pelo time de Nuvem Pública, para que os ajustes de GitOps (APP, Project, Labels, Source/SourceVar, Cluster, values.yaml, templates, Istio e Chart.yaml) possam ser realizados.


Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081641979
Criado em	 16/09/2026 08:13:17
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 A CAIXA,

Reitero a solicitação registrada por nosso analista em 15/06, às 10:52, referente à necessidade de informar:

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

Confirmação, junto ao time de nuvem, da versão mais recente suportada do caixa-base-chart a ser aplicada, para que possamos prosseguir com o atendimento.

Conforme orientação da CESTI36, requisições que não forem respondidas no prazo de 72h após a solicitação das informações complementares serão encerradas

Após o encerramento, será necessário registrar uma nova REQ, informando o número da WO finalizada, para fins de continuidade.

Ressaltamos ainda que reaberturas serão novamente encerradas, sendo obrigatório o registro de uma nova REQ conforme orientado acima.

Permaneço à disposição.

Atenciosamente,

Esteira Devops - NPRD
ID da Ordem de Trabalho	 WO0000081641979
Criado em	 15/09/2026 10:52:03
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Em atendimento, informamos que os ajustes solicitados para o repositório siidp-backend-arquitetura-referencia serão realizados nos ambientes DES e TQS.

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


Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081641979
Criado em	 11/09/2026 16:27:26
Criado por	 P590474
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento no prazo indicado pelo demandante. [CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081641979
Criado em	 11/09/2026 15:43:44
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),

Informamos que sua solicitação foi recebida.

Analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.

Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.

Novas informações e atualizações serão registradas diretamente nesta WO.

Atte.

Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081641979
Criado em	 11/09/2026 15:33:08
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Terça-feira, 22/09/2026 19:55:03



Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081641977
Criado em	 21/09/2026 18:41:00
Criado por	 P640827
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA,

Prezados,

Seguem as informações da conta:

ID da conta: 385545779011
nome da conta: accestruturantestinprd
SSO: https://d-946760baff.awsapps.com/start

Para o time de desenvolvimento: será necessário solicitar a matriz de acesso conforme alinhado com o COE.

Atenciosamente,
Ana Elisa Ferreira Bertoldo
CTIS/CESTI/EquipeNuvem
ID da Ordem de Trabalho	 WO0000081641977
Criado em	 21/09/2026 18:05:42
Criado por	 P640827
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA,

A conta o e toda sua estrutura de Azure DevOps e Terraform foram criados com sucesso.  Evidências em anexo.

Atenciosamente,
Ana Elisa Ferreira Bertoldo
CTIS/CESTI/EquipeNuvem
ID da Ordem de Trabalho	 WO0000081641977
Criado em	 17/09/2026 12:36:26
Criado por	 P528436
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Provisionamento de recursos sendo realizado na conta.
ID da Ordem de Trabalho	 WO0000081641977
Criado em	 16/09/2026 15:47:13
Criado por	 P528436
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Aguardando finalização de configurações de rotas para a rede VPC da conta e prosseguir com a subida dos recursos.
ID da Ordem de Trabalho	 WO0000081641977
Criado em	 15/09/2026 16:25:28
Criado por	 P528436
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Aguardando liberação pela CETEL do range de rede para criação da conta aws e criação dos serviço via IaC.
ID da Ordem de Trabalho	 WO0000081641977
Criado em	 11/09/2026 16:25:56
Criado por	 P590474
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento no prazo indicado pelo demandante. [CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081641977
Criado em	 11/09/2026 15:39:35
Criado por	 P962331
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a)   

Informamos que sua solicitação foi recebida em nossa fila e seguirá o fluxo de atendimento.   

Trata-se de uma atividade de complexidade baixa e será atendida o mais breve possível.   

Em complemento as informações, destaca-se que:   

Será necessário fazer planejamento para sua execução.   

Informações futuras serão adicionadas a esta WO.   

Qualquer dúvida, estamos à disposição   

Antonia Costa  

Preposta  

CTIS /CESTI/Nuvem Publica  
ID da Ordem de Trabalho	 WO0000081641977
Criado em	 11/09/2026 15:32:31
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Terça-feira, 22/09/2026 19:54:15


