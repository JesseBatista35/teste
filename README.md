Prezados,
Em atendimento à solicitação de montagem dos novos compartilhamentos NFS na esteira do sistema SIEXC (ambiente DES), informo o que foi realizado e o ponto pendente que requer atuação da equipe de Armazenamento.
1. Ajuste realizado na library de variáveis (SIEXC-web-aplicacao-des):
As variáveis dos 4 novos compartilhamentos haviam sido cadastradas com a nomenclatura de storage Isilon (prefixo ISILON), porém o endpoint informado (10.116.88.160) corresponde a um servidor NFS via VM, não a um storage Isilon catalogado. Isso causava falha na esteira ao tentar consultar a API do Isilon para um host que não pertence àquele storage.
Variáveis corrigidas, seguindo a nomenclatura correta seguindo a nomenclatura correta definida na documentação de montagem NFS:

NFS_ENDPOINT_ISILON_4 → NFS_ENDPOINT_VM
NFS_MOUNT_POINT_ISILON_4 → NFS_MOUNT_POINT_VM
NFS_ENDPOINT_ISILON_5 → NFS_ENDPOINT_VM_2
NFS_MOUNT_POINT_ISILON_5 → NFS_MOUNT_POINT_VM_2
NFS_ENDPOINT_ISILON_6 → NFS_ENDPOINT_VM_3
NFS_MOUNT_POINT_ISILON_6 → NFS_MOUNT_POINT_VM_3
NFS_ENDPOINT_ISILON_7 → NFS_ENDPOINT_VM_4
NFS_MOUNT_POINT_ISILON_7 → NFS_MOUNT_POINT_VM_4

Após o ajuste, a esteira passou a processar corretamente o tipo de compartilhamento e avançou até a etapa efetiva de montagem no servidor.
2. Ponto pendente — acesso ao storage 10.116.88.160:
Na etapa de montagem, o servidor de destino não concede acesso ao host de origem. Testes de conectividade realizados diretamente na VM confirmam o cenário:

Tentativa de mount manual retorna: mount.nfs: failed to prepare mount: Operation not permitted
Teste de conexão nas portas 2049 e 111 (NFS/portmapper): sem resposta do destino
Comandos rpcinfo -p e showmount -e para o destino: sem retorno

Servidor de origem (cliente NFS): caddeapllx2193.agil.nprd.caixa.gov.br
IPs do servidor de origem:

10.116.199.181 (interface ens192)
192.168.233.69 (interface ens224)

Storage de destino: 10.116.88.160
Exports solicitados:

/export/sigdb/sicql
/export/sigdb/sitec
/export/sicql_bovespa
/export/upload_prd

Solicito a verificação se o(s) IP(s) do servidor de origem estão autorizados na lista de clientes (ACL) desses exports no storage 10.116.88.160, e a liberação necessária para viabilizar o acesso.
Como referência, este mesmo servidor já monta com sucesso outros 3 compartilhamentos hospedados em nfsctcnprd.ctc.caixa (Isilon), utilizando o IP 10.116.199.181.
Encaminho para a equipe de Armazenamento para análise e liberação do acesso solicitado.
