Skip to main content
Azure DevOps
projetos
/
Caixa
/
Overview
/
Wiki
/
Azure Wiki
/
NFS VM Terraform - Montagem de Compartilhamento
Search


Caixa

Overview
Summary
Dashboards
Wiki

Boards

Repos

Pipelines

Test Plans

Artifacts
Project settings

Caixa.wiki

Filter pages by title


New page
NFS VM Terraform - Montagem de Compartilhamento

Follow
3

Edit

Thiago Jorge Araujo
24 de set.
1. Introdução
Procedimento para montagem automatizada de compartilhamentos NFS na Esteira DevOps. Esta automação interage diretamente com o Portal Infra.DevOps , com as VMs criadas pelo ADS e com o storage Dell Isilon.

Futuras versões incluirão interação com storages Huawei e montagem de automática em projetos OKD.

O sucesso da automação depende do cadastro correto realizado pelo usuário. Caso tenha dúvidas pergunte, não faça cadastros incompletos, pois pode prejudicar a implantação ou atualização do sistema.

Leia com atenção os avisos.

2. Avisos
A automação não cria o compartilhamento nos storages ou servidores NFS, ela habilita a utilização de um compartilhamento existente.
Antes de cadastrar um novo servidor, verifique se este já não está cadastrado. Essa ação evita duplicatas e inconsistências.
Compartilhamentos que utilizam servidores NFS (que não são storage) devem ter regras de firewall e de exports criadas. Neste caso, segue-se o procedimento tradicional.
3.Processo
Uma vez que tenha caminho a ser montado no servidor, o primeiro passo é cadastrar um Backend NFS no devops.caixa. O cadastro deve ser realizado criando as variáveis de NFS nas libraries do sistema.
Lembre que o disco já precisa ter sido solicitado por meio de WO à equipe de armazenamento através do FREI - Formulário de Requisição de Espaço em ISILON.docx e a mesma já ter sido atendida.

3.1. Cadastro de endpoint e mountpoint no ADS.
O cadastro de endpoint e mountpoint devem seguir a seguinte nomenclatura para o correto funcionamento da esteira:

Compartilhamento ISILON:
NFS_ENDPOINT_ISILON
NFS_MOUNT_POINT_ISILON
Segue abaixo um exemplo de cadastro no ADS:
image.png

Caso exista mais de um compartilhamento basta seguir a nomenclatura acima e acrescentar um número na variável, Ex: NFS_ENDPOINT_ISILON_2, NFS_ENDPOINT_ISILON_2, NFS_MOUNT_POINT_ISILON_3, NFS_MOUNT_POINT_ISILON_3, NFS_ENDPOINT_VM_2,NFS_MOUNT_POINT_VM_2.

Compartilhamento VM:

NFS_ENDPOINT_VM
NFS_MOUNT_POINT_VM
NFS_ENDPOINT_VM_2
NFS_MOUNT_POINT_VM_2
Segue abaixo um exemplo de cadastro no ADS:
image.png
Nomenclatura para servidores VM -> h6007v020.ad.caixa:/

4. Linkar Variable Groups Compartilhamentos.
compatilhamento.png

33 visits in last 30 days
Marcio Correia de Oliveira
commented 12 de mar. de 2024

O texto ficou dificíl de entender não tem um passo a passo, e confuso. Se puderem reescrever de forma sequencial.
Exemplo:

1 - Solicitar criação da VM via infra devops
2- Solicitar a criação do servidor NFS.
3- Solicitar a criação do compartilhamento NFS.


👍7

Showing filters 1 through 1
