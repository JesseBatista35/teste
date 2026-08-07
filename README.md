Alinhar uma solução de infra para que o Nginx possa comunicar com endereço destino via proxydes, ou outra alternativa.
2. Permanecemos à disposição para quaisquer esclarecimentos que se fizerem necessários.

link do projeto no open-shift:  https://console-openshift-console.apps.nprd.caixa/k8s/ns/sicpu-des/core~v1~Pod

link repositório do projeto devops.caixa: https://devops.caixa/projetos/Caixa/_git/SICPU-painel

link variáveis configuradas no nginx: https://devops.caixa/projetos/Caixa/_git/SICPU-painel-config


Contextualizar da necessidade da configuração:: 
Selecionar em qual ambiente o software / produto será configurado:: 
Informar qual o software / produto a ser configurado:: 
Em caso de indisponibilidade do software / produto a ser configurado, informar janela para atendimento:: 
Informar qual a configuração a ser realizada:: 
Dados do Servidor: 
Serviço/Sistema: 
Site: 
Ambiente: 
Discos Adicionais (Opcional)
: 
Filesystem: 
Tamanho: 
Unidade de Medida
: 
Domínio (VM Windows): 
Recursos para Alocação: 
Quantidade de Servidores:: 
Sistema Operacional:: 
Processadores Virtuais (Vcpu): 
Filesystem: 
Tamanho: 
Unidade de Medida: 
Filesystem: 
Unidade de Medida: 
Tamanho: 
Informações Adicionais
: 
Prazo Desejável para Entrega
: 
Observações Gerais:: 
Inclusões de Uso Exclusivo da Equipe de Atendimento:: 
Selecione o Ambiente ao qual deseja atendimento: 
Informar qual o nome do ponto de montagem: 
Informar o tamanho da área compartilhada: 
Informar a estrutura do diretório/filesystem: 
Informar o crescimento vegetativo da área compartilhada: 
Selecione tipo de Informações Técnicas: 
Selecionar em qual ambiente o Servidor / Software / Produto deverá ser excluído: 
Informar qual o Servidor / Software / Produto que será excluído: 
Informar onde está instalado o Servidor / Software / Produto: 
Informar a matrícula do responsável pela autorização: 
Nome do responsável pela autorização
: 
Selecione o atendimento:: Levantar Informações do Ambiente
Haverá previsão de indisponibilidade durante a execução do serviço: 
Selecione o Ambiente ao qual deseja Atendimento: 
Janela para atendimento: 
Informar a unidade demandante: 
Informar a justificativa da necessidade de alteração: 
Informar a proposta de alteração de arquitetura de serviço para avaliação: 
Informar a unidade demandante: 
Informar onde o software / produto está instalado: (IP e Hostname): 
Informar qual o problema que está ocorrendo: 
Informar qual o software / produto / patch / agente / cliente e versão a ser instalado: 
Informar onde será instalado o software, produto, patch, agente e cliente : 
Em caso de indisponibilidade informar melhor janela para atendimento: 
Informar a matrícula do responsável pela autorização: 
Selecionar em qual ambiente o software / produto / patch / agente / cliente será instalado: 
Selecione o modelo do servidor a ser atendido: 
Selecione o Ambiente ao qual deseja Atendimento: 
Haverá previsão de indisponibilidade durante a execução do serviço: 
Janela para Atendimento: 
Atendimento: 
Nº de Série do Servidor: 
Site: 
Hostname: 
Selecionar ambiente que o aporte de recurso será realizado: 
Selecionar o IC que receberá o aporte de recurso: 
Informar os dados do IC que receberá o aporte: 
Informar qual o recurso e quanto será aportado: 
Selecionar em qual ambiente o servidor será clonado: 
Matrícula do responsável pela autorização:: 
Nome do responsável:
: 
Informar qual serviço será hospedado no servidor: 
Informar qual o servidor deverá ser clonado: 
Selecionar a vertical de rede onde o clone será criado: 
Justifique: 
Qual?: 
Em caso de indisponibilidade informar melhor janela para atendimento: 
Selecionar em qual ambiente o tunning será realizado: 
Selecionar o IC que deverá ser tunado: 
Informar os dados do IC que deverá ser avaliado: 
Selecione o Ambiente ao qual deseja Atendimento: 
Informações Técnicas: 
Para a monitoração?:


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081305714
Criado em	 07/08/2026 14:05:43
Criado por	 P655225
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À

CTIS / CESTI / ESTEIRA DEVOPS DES E TQS

01 - Para solicitação referente a inclusão de regra de PROXY favor abrir demanda no catálogo abaixo:

https://servicos.caixa/
Tecnologia da Informação e Comunicação
Redes e Telecomunicações
Serviços de Rede
Proxy

Atenciosamente.

Anderson Campelo Serpa Gama
Preposto
CTIS / CETEL / DHCP, DNS e Proxy de Serviços
ID da Ordem de Trabalho	 WO0000081305714
Criado em	 07/08/2026 13:09:34
Criado por	 P705973
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Segue por pertinência.

Atenciosamente,
Susane de Oliveira
Preposta de Redes Datacenter
ID da Ordem de Trabalho	 WO0000081305714
Criado em	 06/08/2026 14:55:59
Criado por	 C159844
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 prezados, endereço destino: https://apppushcaixades.azurewebsites.net, porta: 443, comunicação externa ao cluster
ID da Ordem de Trabalho	 WO0000081305714
Criado em	 06/08/2026 14:42:33
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À EQUIPE DE REDES

Nota de encaminhamento:

Prezados,

Encaminhamos a presente demanda para avaliação e tratativa da equipe de Redes/Teledata, tendo em vista que se trata de solicitação de liberação de comunicação (proxydes ou regra de firewall alternativa) para que o Nginx da aplicação SICPU-painel possa acessar endereço de destino externo/rede corporativa.

Dados disponíveis até o momento:

Ambiente: DES/TQS Namespace: sicpu-des (OpenShift/nprd.caixa) Console do pod: https://console-openshift-console.apps.nprd.caixa/k8s/ns/sicpu-des/core~v1~Pod Repositório da aplicação: https://devops.caixa/projetos/Caixa/_git/SICPU-painel Repositório de configuração do Nginx: https://devops.caixa/projetos/Caixa/_git/SICPU-painel-config

O demandante não informou o endereço de destino, porta, nem se a comunicação é interna ou externa ao cluster. Solicitamos que a equipe de Redes realize o levantamento dessas informações diretamente com o demandante, conforme necessidade técnica para a análise e execução da liberação.


A demanda está fora do escopo de atendimento desta esteira (Esteira DevOps DES TQS NPRD), sendo necessária avaliação técnica da equipe de Redes quanto aos dados de origem/destino, portas e demais informações necessárias para a liberação.

Atenciosamente,

CTIS / CESTI Esteira DEVOPS DES TQS NPRD

ID da Ordem de Trabalho	 WO0000081305714
Criado em	 06/08/2026 12:24:34
Criado por	 P767992
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial com viés de falha, erro, degradação ou
esgotamento de infraestrutura, serviço, máquina, armazenamento,
rotina ou situação que esteja na iminência de tornar-se incidente.
Previsto atendimento em até 8 horas.

[CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081305714
Criado em	 06/08/2026 11:55:27
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),



Informamos que sua solicitação PRIORIZADA foi recebida .  



Nosso SLA para atendimento é de até 8h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.



Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.



Novas informações e atualizações serão registradas diretamente nesta WO.



Atte.
ID da Ordem de Trabalho	 WO0000081305714
Criado em	 06/08/2026 11:42:02
Criado por	 C159844
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Anexo do Registro de Solicitação.
ID da Ordem de Trabalho	 WO0000081305714
Criado em	 06/08/2026 11:42:00
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Sexta-feira, 07/08/2026 15:51:14
