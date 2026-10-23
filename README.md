O repositório foi criado e alterado o nome via jornada do fusionx, devido a isso estamos com os seguinte erros:

O argo não synca
O projeto está no cluster errado
O owner do projeto estar errado

Não consigo fazer o deploy por conta disso
O cloud_provider está vazio.

Link: https://github.com/caixagithub/siplx-plataforma-geracao-relatorios/actions/runs/39481358394/job/118830820214

É possível resolver o problema sem a recriação do repositório?


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000082061992
Criado em	 22/10/2026 16:56:19
Criado por	 P590589
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 em analise Tatiana.
ID da Ordem de Trabalho	 WO0000082061992
Criado em	 22/10/2026 15:23:38
Criado por	 F723988
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 O que precisa ser feito: A pipeline obtém o cloud_provider a partir do cluster.destination.name configurado no repositório central gitops.

Na execução que falhou, o provedor chegou vazio ao build, causando o erro Unsupported cloud_provider. A estrutura do projeto foi ajustada no GitOps para o nome atual, mas o arquivo apps/siplx-plataforma-geracao-relatorios/des/config.yaml está apontando para o cluster aks-siplx-nprd.

Como a pipeline interpreta clusters iniciados por aks como Azure e clusters iniciados por eks como AWS, a configuração atual direciona o projeto para Azure. Se o destino correto é AWS, precisamos confirmar o nome do EKS e atualizar cluster.destination.name por PR. Depois disso, executamos novamente a pipeline e validamos o deploy no ArgoCD.
ID da Ordem de Trabalho	 WO0000082061992
Criado em	 22/10/2026 12:14:17
Criado por	 P730708
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Campo "Notas" ajustado pelo Operação Datacenter conforme abaixo:

Analisar e corrigir erros em deploy no SIPLX, conforme detalhamento em REQ.

Obs: Data final mantida para o dia 23/10/2026 10:49:01, conforme ajuste realizado pela equipe técnica.
ID da Ordem de Trabalho	 WO0000082061992
Criado em	 22/10/2026 12:13:42
Criado por	 P730708
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial com viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que esteja na iminência de tornar-se incidente. Previsto atendimento no prazo indicado pelo demandante.

[CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000082061992
Criado em	 22/10/2026 11:03:17
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),

Informamos que sua solicitação foi recebida.

Conforme definição da Coordenação NPRD (CESTI36) e em conformidade com o fluxo de atendimento estabelecido para a Esteira DevOps NPRD, os atendimentos realizados por esta equipe seguem SLAs específicos, distintos dos praticados pelas demais macrocélulas.

Dessa forma, o SLA desta solicitação foi ajustado para até 24 horas úteis, prazo aplicável à sua classificação.

Nesse período, a demanda será analisada para validação do escopo de atuação da equipe e definição do tratamento adequado.

Caso seja identificado que a solicitação não pertence ao escopo de atendimento da Esteira DevOps NPRD, a demanda será direcionada à equipe responsável, observando os fluxos e processos vigentes.

Novas informações e atualizações serão registradas diretamente nesta WO.

Atenciosamente,

Esteira DevOps NPRD
ID da Ordem de Trabalho	 WO0000082061992
Criado em	 22/10/2026 10:49:01
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Sexta-feira, 23/10/2026 10:14:40
