
Concluímos a investigação da falha na esteira esteira-jboss-vm-v2 referente à solicitação WO0000080992068 (configuração de NFS do SIEXC).

Identificamos que a causa não é um erro de código da esteira, e sim um export NFS que ainda não foi criado no storage Isilon: o caminho /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT não está configurado no storage CADSVISISD4 (zona SERVIDORES) — diferente do export pai .../SIEXC, que já existe e está funcionando normalmente.

Para finalizar as configurações, solicitamos que seja aberta uma REQ para o time de Armazenamento pedindo a criação desse export, referenciando esta solicitação original (WO0000080992068):

Storage: CADSVISISD4
Zona: SERVIDORES
Path: /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT
Clientes/permissões: sugerimos replicar os mesmos clientes já configurados no export pai .../SIEXC, salvo indicação em contrário

Assim que o export for criado, a esteira conseguirá concluir a montagem sem necessidade de qualquer ajuste adicional do nosso lado.
