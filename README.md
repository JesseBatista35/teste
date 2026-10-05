1. Favor realizar  alteração (ou renomeado) o ponto de montagem abaixo referente a integração SIHDG x POWERCENTER:

     SERVER_NFS = hypernprd56.ad.caixa
     PATH_NFS = /fs_sihdg
     PATH_DESTINO = /sihdg_sinaf/
    
       **** Renomear o ponto de montagem:
                 DE:   PATH_DESTINO = /sihdg/
                 PARA:  PATH_DESTINO = /sihdg_powercenter/

        SIZE_VOLUME_SINAF=20Gi

2. Solicito imagem do terminal do OKD com os NFS montados

Atenciosamente,
Sandra

Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081763077
Criado em	 01/10/2026 14:31:02
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezada Sandra,

Informamos que, para a execução desta solicitação, são necessárias as seguintes confirmações, já encaminhadas via Teams:

O novo ponto de montagem hypernprd56.ad.caixa:/fs_sihdg_des_pwc → /sihdg_des_pwc (20GiB) deve ser adicionado ao ambiente DES, mantendo o ponto atual /sihdg_des (mesmo modelo adotado em TQS)?
O export /fs_sihdg_des_pwc já foi criado no servidor hypernprd56.ad.caixa pela equipe de Storage?

Como o prazo de SLA desta WO foi atingido e ainda aguardamos essas confirmações, estamos encerrando esta ordem de trabalho. O atendimento continuará na sala do Teams "SIHDG-JBOSS8-NFS", onde daremos sequência à configuração assim que recebermos o retorno.

Caso necessário, uma nova solicitação poderá ser aberta referenciando esta WO.

Atenciosamente,
Esteira DevOps DES/TQS NPRD
ID da Ordem de Trabalho	 WO0000081763077
Criado em	 01/10/2026 09:54:31
Criado por	 C148227
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Após revisão, segue o pedido atualizado:

Solicito que seja alterado (ou renomeado), em DES, o ponto de montagem abaixo referente a integração SIHDG x POWERCENTER:
    SERVER_NFS = hypernprd56.ad.caixa
    PATH_NFS = /fs_sihdg
    PATH_DESTINO = /sihdg_des
    SIZE_VOLUME_SINAF=20GiB
 
 *** ALTERAR ESSE PONTO DE MONTAGEM PARA:
   SERVER_NFS_PWC = hypernprd56.ad.caixa
   PATH_NFS_PWC = /fs_sihdg_des_pwc
     PATH_DESTINO_PWC = /sihdg_des_pwc
     SIZE_VOLUME_SINAF =20GiB
ID da Ordem de Trabalho	 WO0000081763077
Criado em	 30/09/2026 21:25:27
Criado por	 P635388
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Solicitamos esclarecimento da equipe quanto a demanda e conforme contato no teams ficou agendada a conversa para amanhã

Att
ID da Ordem de Trabalho	 WO0000081763077
Criado em	 30/09/2026 16:53:11
Criado por	 P779123
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento em até 24 horas.[CENTRAL-SID]
OBS: Saneamento realizado considerando a nota anterior da equipe técnica que informa atendimento em até 24 horas
ID da Ordem de Trabalho	 WO0000081763077
Criado em	 30/09/2026 14:49:46
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),

Informamos que sua solicitação foi recebida.

Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.

Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.

Novas informações e atualizações serão registradas diretamente nesta WO.

Atte.

Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081763077
Criado em	 30/09/2026 14:44:36
Criado por	 C148227
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Solicito continuação do atendimento da REQ000145918510
ID da Ordem de Trabalho	 WO0000081763077
Criado em	 30/09/2026 14:43:47
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Segunda-feira, 05/10/2026 09:18:14
