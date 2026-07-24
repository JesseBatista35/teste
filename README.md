NFS OKD - Criação de PV e PVC no OKD

Follow
1

Edit

Cid Hikaro de Sousa Sasaki
1 de out. de 2024
Montagem de PersistentVolume e PersistentVolumeClaim
Documentação oficial Persistent Storage Using NFS 

A automação não cria o compartilhamento nos storages ou servidores NFS, ela habilita a utilização de um compartilhamento existente e já com as permissões para a rede de backup de cada cluster OKD.

Solicitar através de WO à equipe de ARMAZENAMENTO a criação do compartilhamento, tamanho do nfs.
Para cada ambiente, solicitar o permissionamento para a rede de backup do OKD.
Caso tenha dúvidas procurar os prepostos de Esteiras Devops.

Importante!
Não faça a configuração sem orientação da equipe de Esteiras Devops, pois pode prejudicar a implantação ou atualização do sistema.
A taskgroup não está configurada para mais de um NFS, favor aciona a Equipe de Suporte Esteiras para a configuração correta.

1. Requisitos para montagem do PV e PVC
Após a solicitação de criação do compartilhamento seja atendida pela equipe do armazenamento, será informado na wo o Servidor, Endpoint e tamanho do nfs necessário para a configuração.

Requisitos obrigatórios para configuração do deployment config no OKD 3.11,

Servidor: FQDN do storage de origem do NFS
Endpoint: Diretório compartilhado no Storage/Servidor. Ex: /ifs/SSPDEARMVD1/ESTEIRA_AGIL
Mountpoint: Path onde será feita a montagem (Se o path não existir, será criado). Ex: /sistema-modulo-data-ambiente
Tamanho do nfs: 20 Gigas

Por exemplo:

SERVER_NFS: nfsctcnprd.ctc.caixa
PATH_NFS: /ifs/SSPDEARMVD1/ESTEIRA_AGIL
PATH_DESTINO: /nfs_vm
SIZE_VOLUME: 20Gi

2. Pipeline - Variable Groups - Link variable group
Por sergurança e para facilitar o gerenciamento, foi criado o Variable Group (VG) Compartilhamentos contendo os dados para conexão com o Isilon e com a API do AlocaIP. O Variable Group (VG) deve ser vinculado à pipeline no escopo de Release.

Edite a pipeline release do sistema:

Variables > Variable Groups > Link variable group, pesquise por Compartilhamentos. Selecione o Variable group scope e o Escopo Release. Vincule à pipeline confirmando em Link.

WO0000063365819-variable-group.PNG

3. Pipeline - Tasks Group
Após seguir os passos anteriores, é possível utilizar a montagem de compartilhamento ISILON na pipeline Release.

Ainda na edição da pipeline, adicione a Task Group.

Selecione a task referente ao ambiente que terá o compartilhamento nfs.

No Agent Job adicione uma nova Task e procure por NFS e a adicione.

Certifique-se que a Task de montagem do NFS seja vinculada após a task Cria_APP_OKD, lembre-se que a pipeline executa as tasks em sequência.

WO0000063365819-add-task-group.PNG

4. Pipeline - Library
Ainda na edição da pipeline edite a library referente ao ambiente do sistema.

Edite a library, referente ao sistema-ambiente
WO0000063365819-edit-library-variaveis.PNG

Inserir as variáveis conforme imagem abaixo:
WO0000063365819-exemplo-variaveis.PNG

5. Pipeline - Criar nova Release
Solicitar para que o demandante abra MUDANÇA CRQ para aplicar as configuração do NFS no ambiente de PRODUÇÃO.

Somente a CEPTI PAP ou Produção Online podem fazer o DEPLOY em HMP e PRD com a MUDANÇA CRQ aprovada.

Segue fila:

HITSS / CEPTI / BR - Análise e Preparo da Produção
HITSS / CEPTI / SP - Análise e Preparo da Produção
HITSS / CEPTI / RJ - Análise e Preparo da Produção
