Boa tarde,

RESULTADO DA VERIFICAÇÃO - WO0000080696536:

✅ CONECTIVIDADE: OK
✅ FSTAB: Configurado corretamente
❌ NFS: NÃO ESTÁ MONTADO - ACESSO NEGADO


📍 ERRO RETORNADO:
mount.nfs: access denied by server while mounting nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG


📍 EVIDÊNCIA 1 - Teste de Conectividade (OK):
PING 192.168.224.1 (192.168.224.1) 56(84) bytes de dados.
64 bytes de 192.168.224.1: icmp_seq=1 ttl=64 tempo=0.199 ms
64 bytes de 192.168.224.1: icmp_seq=2 ttl=64 tempo=0.236 ms
64 bytes de 192.168.224.1: icmp_seq=3 ttl=64 tempo=0.276 ms
64 bytes de 192.168.224.1: icmp_seq=4 ttl=64 tempo=0.230 ms
64 bytes de 192.168.224.1: icmp_seq=5 ttl=64 tempo=0.213 ms
--- 192.168.224.1 estatísticas de ping ---
5 pacotes transmitidos, 5 recebidos, 0% packet loss ✅


📍 EVIDÊNCIA 2 - Configuração fstab (OK):
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG /simpg-tqs nfs rw,sync,hard 0 0 ✅


📍 EVIDÊNCIA 3 - Tentativa de Montagem (ERRO):
[root@caddeapllx1979 p585600]# mount -a
mount.nfs: access denied by server while mounting nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG ❌


📋 ANÁLISE:
→ Servidor caddeapllx1979 alcança o gateway 192.168.224.1
→ Armazenamento está REJEITANDO a montagem
→ IP 192.168.242.150 ainda NÃO foi autorizado como cliente no NFS


🔧 SOLICITAÇÃO URGENTE:
Favor executar os comandos abaixo no storage CADSVISISD4:

isi nfs exports modify --add-clients='192.168.242.150' --add-root-clients='192.168.242.150' --add-read-write-clients='192.168.242.150' --zone=SERVIDORES --id=726

isi nfs exports list --zone=SERVIDORES --path=/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG -v | head


⏰ A demandante está aguardando para iniciar os testes.

Obrigado!
[Seu nome] - Analista DevOps/Esteiras
