1. Criar o export /SWIFT como entrada independente no Isilon

Storage: CADSVISISD4
Zona: SERVIDORES
Path: /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT
Capacidade: mesma do export pai (.../SIEXC), conforme você já confirmou na REQ

2. Configurar a lista de clientes (ACL) do novo export

Replicar os mesmos IPs já autorizados no export pai .../SIEXC — que no showmount que você acabou de rodar inclui, entre outros, 192.168.233.69 (DES) e 192.168.242.137 (um dos IPs de backup/rede que já vimos na nossa investigação anterior). Isso garante que os mesmos servidores que já acessam o pai continuem acessando o filho sem precisar de nova rodada de liberação.

3. Garantir a estrutura de diretórios interna, conforme o anexo original da WO0000080992068

SWIFT
├── lost+found
└── SWIFT
    ├── BACKUP
    │   └── Temp
    ├── RECEBIDAS
    ├── TRANSMITE
    │   └── temp
    ├── TRANSMITIDOS
    └── TRASH

4. Owner e permissão

Proprietário: jboss
Permissão: 770 (ou rwx conforme especificado no documento original — mesma convenção que você aplicou manualmente na WO0000080992068)
