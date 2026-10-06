Prezado(a),

Realizada a configuração do compartilhamento NFS na esteira do SICCV-batch (TQS):

Ajustado o grupo de variáveis SICCV-batch-tqs, que estava apontando para o export Isilon de DES. Agora aponta para o compartilhamento criado nesta WO:
Endpoint: hypernprd12.ad.caixa:/fs_siccv
Ponto de montagem: /SICCV
A release foi reexecutada e a automação processou a configuração corretamente.

A montagem, porém, não foi concluída por falha de comunicação de rede, fora do escopo desta equipe. A interface de backup do servidor caddeapllx2821 (ens224 – 10.188.6.225) não recebe resposta ARP de nenhum IP do storage na rede 10.188.0.0/19.

Ação necessária: abrir requisição para a CETEL solicitando a verificação do portgroup/VLAN da interface de backup do servidor. Segue abaixo o texto sugerido para a abertura.

Depois que a CETEL corrigir, basta reexecutar a release do SICCV-batch em TQS. Nenhum ajuste adicional na esteira é necessário.

Encerramos esta WO.

Atte.
Esteira DevOps DES/TQS NPRD

Texto sugerido para a nova REQ (CETEL)

Assunto: Servidor caddeapllx2821 sem comunicação na rede de backup (10.188.0.0/19)

A VM caddeapllx2821.agil.nprd.caixa.gov.br (SICCV-batch, TQS) está sem comunicação de camada 2 na rede de backup.

Interface de backup: ens224, IP 10.188.6.225/19, MAC 00:50:56:82:a5:1d, estado UP
Destino: storage hypernprd12.ad.caixa (10.188.0.11/.13/.14/.16/.17/.18), mesma sub-rede, sem gateway

Evidências:

$ ip route get 10.188.0.14
10.188.0.14 dev ens224 src 10.188.6.225

$ ip neigh show dev ens224
10.188.0.14 FAILED
10.188.0.18 FAILED
10.188.0.16 FAILED
10.188.0.13 FAILED
10.188.0.11 FAILED
10.188.0.17 FAILED

$ arping -c3 -I ens224 10.188.0.14
Enviadas 3 sondas (3 broadcast(s))
Recebida(s) 0 resposta(s)

Solicitação: verificar se a vNIC ens224 está no portgroup/VLAN correto da rede de backup e se a VLAN está presente no host ESXi onde a VM está alocada.

Impacto: impede a montagem do NFS hypernprd12.ad.caixa:/fs_siccv (WO0000081801601) no servidor.
