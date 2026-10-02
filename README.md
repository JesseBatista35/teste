# verificar se o ponto de montagem existe
ls -la /SWIFT 2>&1

# verificar se está montado
mount | grep -i swift

# verificar espaço/montagens NFS ativas
df -h | grep -i swift

# conferir entrada no fstab (se já foi configurado antes)
cat /etc/fstab | grep -i swift

# tentar visualizar os exports do Isilon direto (vai dar timeout/erro se não existir ainda)
showmount -e nfsctcnprd.ctc.caixa
