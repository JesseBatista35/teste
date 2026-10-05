# 1. DNS: para qual IP está resolvendo?
getent hosts nfsctcnprd.ctc.caixa

# 2. Portas NFS/rpcbind
timeout 5 bash -c '</dev/tcp/nfsctcnprd.ctc.caixa/2049' && echo "2049 OK" || echo "2049 FALHA"
timeout 5 bash -c '</dev/tcp/nfsctcnprd.ctc.caixa/111'  && echo "111 OK"  || echo "111 FALHA"

# 3. RPC / exports visíveis
rpcinfo -p nfsctcnprd.ctc.caixa
showmount -e nfsctcnprd.ctc.caixa | grep -i SISME

# 4. Outros NFS já montados nesse host? (se algum Isilon monta, a rota existe)
mount | grep nfs; grep nfs /etc/fstab

# 5. Mount manual, com timeout curto
sudo mkdir -p /mnt/teste_sisme
sudo mount -t nfs -o vers=3,timeo=50,retrans=1 nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /mnt/teste_sisme
# e repetir com vers=4.1 se o v3 falhar
