Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081655409
Criado em	 16/09/2026 10:18:40
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),


Informamos que por ter reaberto sua solicitação hoje o atendimento será retomado nesta data.  

Iremos realizar uma nova análise conforme as informações adicionais registradas na sua última nota.

Ressaltamos que um novo SLA de 24h úteis passa a vigorar a partir de agora.

Todas as atualizações e evoluções do atendimento serão registradas diretamente nesta WO.


Atte.  

CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081655409
Criado em	 16/09/2026 10:12:46
Criado por	 C158543
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Novamente, o procedimento foi executado de forma incorreta. No infra DevOps o host caddeapllx1214.agil.nprd.caixa.gov.br (10.116.195.38) foi substituído pelo host caddeapllx2798.agil.nprd.caixa.gov.br (10.116.202.9). Conforme mencionando anteriormente deverá ser mantidos os 2 hosts. Solicito a manutenção dos 2 hosts no módulo (SIIFX-BATCH-VM)
Host-1: caddeapllx1214.agil.nprd.caixa.gov.br (10.116.195.38)
Host-2: caddeapllx2798.agil.nprd.caixa.gov.br (10.116.202.9)
ID da Ordem de Trabalho	 WO0000081655409
Criado em	 15/09/2026 16:55:17
Criado por	 P686198
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA
Prezado(a),
Conforme solicitado, uma nova correção foi feita realizando a reinclusão da máquina 10.116.202.9, com o novo ip de backup configurado como 10.188.0.1. Segue evidência em anexo.

Atenciosamente,

Rainier Barbosa dos Santos Viana

Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081655409
Criado em	 15/09/2026 10:51:11
Criado por	 C158543
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Informo que a solução adotada removeu de forma indevida o host CADDEAPLLX2798.agil.nprd.caixa.gov.br (10.116.202.9), a release deve realizar o deploy em 2 hosts, conforme figura anexada. Solicito o retorno do host e adoção da configuração correta para permitir o mapeamento NFS em ambos os hosts.
ID da Ordem de Trabalho	 WO0000081655409
Criado em	 14/09/2026 17:30:29
Criado por	 P686198
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA
Prezado(a),
Conforme solicitado, foi realizada uma verificação e constatado que o hostname e os IPs mencionados anteriormente não existiam. Após consulta no InfraFácil, foram identificados os valores corretos:

IP principal: 10.116.195.38
IPs de backup: 192.168.231.137 e 10.118.254.113

Adicionalmente, foi verificado que o valor da variável sistema_nome havia sido alterado, passando a referenciar uma VM. Para solucionar o problema da release, as configurações foram revertidas para os valores anteriormente utilizados, conforme identificado nos logs históricos da aplicação. As correções foram aplicadas com sucesso.

Para o tratamento de novos problemas, favor abrir uma nova demanda, informando o erro atual e a configuração correta para que a equipe possa realizar a devida análise. Segue evidência em anexo.

Atenciosamente,

Rainier Barbosa dos Santos Viana

Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081655409
Criado em	 14/09/2026 16:59:56
Criado por	 P642161
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento no prazo indicado pelo demandante. [CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081655409
Criado em	 14/09/2026 15:17:41
Criado por	 P507043
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),



Informamos que sua solicitação foi recebida.  



Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.



Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.



Novas informações e atualizações serão registradas diretamente nesta WO.



Atte.



Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081655409
Criado em	 14/09/2026 15:10:24
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quarta-feira, 16/09/2026 10:43:30
