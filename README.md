
Wiki
Pesquisar:
Voltar
Armazenamento
NAS - Solicitação
NAS - Devolução
Bloco - Solicitação
Mainframe
Backup Open
Armazenamento/NAS - Solicitação/
Disco NAS
Quando devo solicitar um disco NAS?
Existem diversos momentos que você pode usar esse serviço, são eles:

Quando desejar que um novo disco (NFS ou SMB) seja apresentado no seu módulo.
Quando já possuir um disco apresentado ao seu módulo e precise incluir novos servidores (também podem ser partições de MAINFRAME) que não fazem parte do módulo selecionado para que eles também acessem esse disco.
Quando o módulo já possuir um disco apresentado e precise expandir a capacidade de armazenamento desse disco.
OBS: Se o projeto está na nuvem pública Azure, deve-se abrir a solicitação pelo formulário TEIA – Suporte, na opção “Suporte a Recurso”.

Como solicitar?
Acesso no menu: Serviços ➝ Armazenamento ➝ Armazenamento NAS.




Opções de compartilhamento
Existem 3 opções de compartilhamento de disco:

NFS/SMB (com adição de responsáveis por solicitação de armazenamento)
NFS
SMB (com adição de responsáveis por solicitação de armazenamento)

Opções de NAS
Existem 2 opções de compartilhamento de disco:

Sistema
Produtos
No fluxo de cada opção de NAS existe o campo “Unidade Solicitante”, que serve para indicar o código da unidade demandante da respectiva solicitação de armazenamento.

Abaixo explicaremos como solicitar cada tipo.


Nova solicitação de Armazenamento (Sistema)
Na primeira tela selecione “nova solicitação de armazenamento” e, caso necessário, marque a opção de “Adicionar comunicação com Mainframe” para apontar as partições que devem ser envolvidas.




É possível apresentar o disco para hosts que não estão dentro do Módulo selecionado, para isso basta marcar o checkbox de “cadastrar mais IPs” e adicionar as informações do(s) servidor(es).



Após clicar no botão “Próximo”, preencha o ponto de montagem do novo disco e selecione o tipo de compartilhamento. Informe as matrículas dos responsáveis que irão realizar o gerenciamento do compartilhamento.



Após clicar no botão “Próximo”, confira os dados e caso precise adicione informações no campo “Observações”. Caso esteja tudo certo, clique no botão “Solicitar Disco”.




Após clicar no botão “Solicitar Disco”, serão apresentadas as seguintes mensagens:








Aumento de armazenamento de um disco (Sistema)
Na primeira tela selecione “Compartilhamento de armazenamento existente” e “Aumento de cota”.

Observação: A volumetria, nesse caso, se refere ao aumento do armazenamento. Ou seja, no caso abaixo, será adicionado mais 50 GB ao que já existe no disco.




Preencha o PATH do compartilhamento que deseja aumentar o volume, você poderá achar em /etc/fstab no servidor em que o disco já está apresentado.
Após clicar no botão “Próximo”, confira os dados e caso precise adicione informações no campo “Observações”. Caso esteja tudo certo, clique no botão “Solicitar Disco”.





Após clicar no botão “Solicitar Disco”, serão apresentadas as seguintes mensagens:







Inclusão de IP em um compartilhamento existente (Sistema)
Na primeira tela selecione “Compartilhamento de armazenamento existente” e “Inclusão de IP”. Caso necessário, marque a opção de “Adicionar comunicação com Mainframe” para apontar as partições que devem ser envolvidas.




Caso necessário, adicione hosts. Preencha o PATH do compartilhamento que deseja aumentar o volume, você poderá achar em /etc/fstab no servidor em que o disco já está apresentado.

Após clicar no botão “Próximo”, preencha o ponto de montagem do novo disco e o tipo de compartilhamento. Informe as matrículas dos responsáveis que irão realizar o gerenciamento do compartilhamento.




Após clicar no botão “Próximo”, confira os dados e caso precise adicione informações no campo “Observações”. Caso esteja tudo certo, clique no botão “Solicitar Disco”.




Após clicar no botão “Solicitar Disco”, serão apresentadas as seguintes mensagens:








Inclusão de Módulo em um compartilhamento existente (Sistema)
Na primeira tela selecione “Compartilhamento de armazenamento existente” e “Inclusão de Módulo”.

Preencha o PATH do compartilhamento que deseja aumentar o volume, você poderá achar em /etc/fstab no servidor em que o disco já está apresentado.




Após clicar no botão “Próximo”, preencha o ponto de montagem do novo disco e o tipo de compartilhamento. Informe as matrículas dos responsáveis que irão realizar o gerenciamento do compartilhamento.




Após clicar no botão “Próximo”, confira os dados e caso precise adicione informações no campo “Observações”. Caso esteja tudo certo, clique no botão “Solicitar Disco”.




Após clicar no botão “Solicitar Disco”, serão apresentadas as seguintes mensagens:







Nova solicitação de Armazenamento (Produtos)
Estando no ambiente ‘sem sistema’, na primeira tela selecione a opção de NAS “Produto”, informe o nome do Produto e o Ambiente. Após isso, selecione a opção “Nova solicitação de armazenamento”. Caso necessário, marque a opção de “Adicionar comunicação com Mainframe” para apontar as partições que devem ser envolvidas. Adicione o(s) host(s) e clique no botão “Próximo”.



Após clicar no botão “Próximo”, preencha o ponto de montagem do novo disco e o tipo de compartilhamento. Informe as matrículas dos responsáveis que irão realizar o gerenciamento do compartilhamento.




Após clicar no botão “Próximo”, confira os dados e caso precise adicione informações no campo “Observações”. Caso esteja tudo certo, clique no botão “Solicitar Disco”.




Após clicar no botão “Solicitar Disco”, serão apresentadas as seguintes mensagens:





Aumento de Armazenamento (Produtos)
Na primeira tela selecione “Compartilhamento de armazenamento existente” e “Aumento de cota”.

Observação: A volumetria, nesse caso, se refere ao aumento do armazenamento. Ou seja, no caso abaixo, será adicionado mais 50 GB ao que já existe no disco.

Preencha o PATH do compartilhamento que deseja aumentar o volume, você poderá achar em /etc/fstab no servidor em que o disco já está apresentado.




Após clicar no botão “Próximo”, confira os dados e caso precise adicione informações no campo “Observações”. Caso esteja tudo certo, clique no botão “Solicitar Disco”.



Após clicar no botão “Solicitar Disco”, serão apresentadas as seguintes mensagens:





Inclusão de IP (Produtos)
Na primeira tela selecione “Compartilhamento de armazenamento existente” e “Inclusão de IP”. Caso necessário, marque a opção de “Adicionar comunicação com Mainframe” para apontar as partições que devem ser envolvidas. 
Caso necessário, adicione hosts. Preencha o PATH do compartilhamento que deseja aumentar o volume, você poderá achar em /etc/fstab no servidor em que o disco já está apresentado.




Após clicar no botão “Próximo”, preencha o ponto de montagem do novo disco e o tipo de compartilhamento. Informe as matrículas dos responsáveis que irão realizar o gerenciamento do compartilhamento.




Após clicar no botão “Próximo”, confira os dados e caso precise adicione informações no campo “Observações”. Caso esteja tudo certo, clique no botão “Solicitar Disco”.




Após clicar no botão “Solicitar Disco”, serão apresentadas as seguintes mensagens:







Próximos passos
Após a solicitação, acompanhar a REQ gerada, localizada em : Consultas ➝ Minhas requisições.



Ajuda e Suporte
Você encontrou o que procurava?
Ajude-nos a crescer!
Estamos constantemente aprimorando nossa wiki. Submeta uma contribuição aqui.

Clique aqui

Ainda precisa de ajuda?
Contate o suporte




seria isso aqui que ele deve solicitar
