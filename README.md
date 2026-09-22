mount | grep -i nfs
df -h | grep -iE "swift|ifs|ctc"
cat /etc/fstab | grep -i nfs
showmount -e nfsctcnprd.ctc.caixa

sudo mkdir -p /SWIFT
sudo mount -t nfs nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT /SWIFT

sudo mkdir -p /SWIFT/SWIFT/BACKUP/Temp
sudo mkdir -p /SWIFT/SWIFT/RECEBIDAS
sudo mkdir -p /SWIFT/SWIFT/TRANSMITE/temp
sudo mkdir -p /SWIFT/SWIFT/TRANSMITIDOS
sudo mkdir -p /SWIFT/SWIFT/TRASH


sudo chown -R jboss:jboss /SWIFT/SWIFT
sudo chmod -R 770 /SWIFT/SWIFT

nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT /SWIFT nfs defaults,_netdev 0 0

NFS_ENDPOINT_ISILON = /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT
NFS_MOUNT_POINT_ISILON = /SWIFT
