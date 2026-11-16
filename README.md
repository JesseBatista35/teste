Gilberto, vi a REQ que você abriu. Ela foi aberta como "Restore de Versionamento (backup)", que é para restauração de arquivos de backup. A equipe de armazenamento provavelmente vai devolver, porque não é o nosso caso. Sugiro cancelar essa e seguir assim:

1º) Interface e IP de backup da VM (abrir primeiro)
O problema é que a caddeapllx2876 foi criada sem a placa de rede de backup. Isso é recurso da VM, não armazenamento.
- No Infrafácil, veja em "Recursos de VM" se há opção para incluir interface/IP de backup.
- Se não houver, abra chamado para a Infra (virtualização) com este texto:

"Servidor caddeapllx2876.agil.nprd.caixa.gov.br (10.116.202.64) – SIIFX-caixinhas-batch TQS, criado pela esteira DevOps sem interface de rede de backup (somente ens192). Solicito a inclusão da interface de backup e a alocação de IP de backup, necessárias para o acesso ao Isilon nfsctcnprd.ctc.caixa (192.168.224.111). Referência: caddeapllx2695 (DES) possui IP de backup 192.168.242.175."

2º) Liberação do NFS (somente depois que a VM tiver o IP de backup)
No Infrafácil: Serviços → Armazenamento → Armazenamento NAS
- Opção: Sistema (SIIFX)
- Compartilhamento de armazenamento existente → Inclusão de IP
- Cadastrar mais IPs: caddeapllx2876, com o IP de backup recebido no 1º passo
- PATH: /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH
- Ponto de montagem: /SIIFX
- Tipo: NFS
- Observação: "Inclusão do servidor de TQS caddeapllx2876 no compartilhamento já utilizado pelo DES (caddeapllx2695)."

Repetir para o segundo compartilhamento:
- PATH: /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX
- Ponto de montagem: /SIIFX_B2B

Importante: o 2º passo só funciona depois do 1º, porque o IP a ser liberado no Isilon é o IP de backup, que ainda não existe.

Quando os dois forem atendidos, me avisa que eu faço o redeploy do stage EC TQS.
