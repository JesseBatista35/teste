Diagnóstico – IP duplicado 192.168.236.173 (NPRD)

Situação encontrada

GestióIP (IPAM): o IP 192.168.236.173 está reservado para CADDEBKPLX083, com a descrição “Projeto Esteiras - interfaces-bkp”, na rede BKP TSM não produção.
CADDEAPLLX1580 (SITES-DES, provisionado via Terraform):
A interface principal ens192 tem o IP 10.116.197.61, que está ativo e coincide com o cadastro no Infra Fácil.
A interface de backup ens224 (MTU 9000) tem o IP 192.168.236.173/19 configurado de forma fixa pela customização do VMware no provisionamento (VMware-customization-ens224.nmconnection).
A ens224 está sem link (NO-CARRIER/DOWN), então hoje o IP não está em uso pela VM. Os logs do NetworkManager não registram conflito.
A aplicação (JBoss) está em execução normal, sem impacto.
ceadecldlx071.nprd.caixa (worker OKD4 NPRD, responsável CESTI36):
O IP do nó no cluster é o 10.116.208.91.
O vCenter mostra o 192.168.236.173 ativo nessa VM, em uma interface secundária da sub-rede 192.168.224.0/19.
O IP não é egress IP do cluster: não há referência a ele em netnamespace. Ele está configurado diretamente no sistema operacional do nó.
Esse IP não está reservado no IPAM para o worker. As notas da VM no vCenter mencionam o ceadecldlx056, o que indica que ela pode ter sido clonada de outro worker e herdado a configuração.

Conclusão

Existe duplicidade de configuração do IP 192.168.236.173. Hoje, apenas o worker ceadecldlx071 usa o IP de fato. O CADDEAPLLX1580 tem o mesmo IP configurado na interface de backup, que está sem link. Se essa interface for reconectada, o conflito passa a ser efetivo. Pelo IPAM, o IP pertence à interface de backup das VMs da esteira.

Opções de tratamento (para decisão do demandante)

Opção A – Ajustar o worker ceadecldlx071: reservar um novo IP na rede BKP para o worker e alterar a configuração da interface no nó. Atenção: o nó executa rook-ceph. Antes da alteração, é necessário confirmar que essa interface não é usada pela rede de storage do cluster. A alteração exige uma janela e o cuidado de uma intervenção em nó do OKD.
Opção B – Ajustar o CADDEAPLLX1580: reservar outro IP de backup para a VM, alterar a ens224 e regularizar no IPAM a reserva do .173 para o worker. É uma alteração simples e de baixo risco, porque a interface está sem link e não afeta a aplicação.

Ponto adicional: a interface de backup do CADDEAPLLX1580 está sem link, ou seja, o backup TSM dessa VM não está operante. Avaliar se isso é esperado para o ambiente DES.
