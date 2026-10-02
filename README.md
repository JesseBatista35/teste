to com time de armazenamte em sala, e estamos com duvida se esse pedido ja exixzste craindo acho que nao se trata de um nvoa aramzenameno olha ai  o contexto primera demanda pra gente entender...


Criação de diretórios no NFS e montagem na esteira do SIEXC

***ATENÇÃO!!!***

NO ARQUIVO EM ANEXO HÁ INSTRUÇÕES DE ESTRUTURA DE DIRETORIOS E PERMISSÕES QUE DEVEM SER CRIADOS NO NFS. É IMPORTANTE ANEXAR O ARQUIVO NA PASSAGEM PARA A EQUIPE DE ARMAZENAMENTO

Criação de diretórios no NFS e montagem na esteira do SIEXC

Link esteira do SIEXC:

https://devops.caixa/projetos/Caixa/_git/SIEXC-web-aplicacao-config

Datalhes de como deve ser feita a montagem no documento em anexo

A/C Time de Armazenamento


Montagem NFS com Estrutura de Diretórios
Montagem da seguinte estrutura de diretórios no NFS do SIEXC
Servidor da aplicação SIEXC: 10.116.199.181 (DES)
NFS do SIEXC: nfsctcnprd.ctc.caixa - 192.168.224.0/19
Path do NFS: /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC
OBS: informações de acesso ao NFS obtidas a partir da REQ000144249814. Para mais detalhes, favor
consultar a REQ.
SWIFT
Criar Estrutura de Diretórios no NFS
Criar no path NFS:
/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT
a seguinte estrutura de diretórios:
├── lost+found
└── SWIFT
├── BACKUP
│  
 └── Temp
├── RECEBIDAS
├── TRANSMITE
│  
 └── temp
├── TRANSMITIDOS
└── TRASH
Variaveis de montagem na esteira
Pré-requisito: que o ponto de montagem do NFS esteja sempre disponível para acesso pelo servidor, com os
arquivos sempre disponiveis, independente de quantos restarts/releases fazemos na aplicação
NFS_ENDPOINT_ISILON = /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT
NFS_MOUNT_POINT_ISILON = /SWIFT
Permissões Requeridas
Todos os diretórios listados acima devem atender aos seguintes requisitos:
Proprietário (Owner): jboss no servidor da aplicação SIEXC
Permissões: rwx (leitura, escrita e execução)
