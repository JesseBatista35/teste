Atendimento realizado – IP duplicado 192.168.236.173 (NPRD / SITES-DES)

Diagnóstico

O IP 192.168.236.173 estava configurado de forma fixa em duas VMs:
CADDEAPLLX1580 (SITES-DES, esteira Terraform), na interface de backup ens224, configurada pela customização do VMware no provisionamento;
ceadecldlx071.nprd.caixa (worker OKD4 NPRD, responsável CESTI36), onde estava efetivamente em uso.
No CADDEAPLLX1580, a interface de backup estava com o adaptador de rede desconectado no vCenter, no port group da rede antiga (VL3697). Por isso o conflito ainda não tinha efeito, mas ocorreria caso a interface fosse reconectada.

Ações realizadas (CADDEAPLLX1580)

Reservado um novo IP de backup no AlocaIP, na REDE_BACKUP-NPRD: 10.188.8.190/16 (gateway 10.188.0.1, VLAN 1141).
A interface ens224 foi reconfigurada do IP 192.168.236.173/19 para o 10.188.8.190/16. Foi feito backup do perfil anterior. A interface não tem gateway default, para não interferir na interface principal.
No vCenter, o Network adapter 2 foi alterado para o port group tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep e conectado.
O IP de backup foi atualizado no Infra Fácil (Servidores Restritos).
Validação: a interface está ativa com 10.188.8.190 e responde ao gateway 10.188.0.1, com 0% de perda. A aplicação (JBoss) não foi impactada.

Resultado
O IP 192.168.236.173 passa a ser usado apenas pelo worker ceadecldlx071, e a duplicidade foi eliminada. A regularização da reserva do 192.168.236.173 no GestióIP para o worker fica a cargo do responsável pelo IPAM / CESTI36. A confirmação no inventário (SINCC) deve ocorrer na próxima coleta.
