ls -la /SWIFT/
ls -la /SWIFT/SWIFT/
ls -la /SWIFT/SWIFT/BACKUP/
ls -la /SWIFT/SWIFT/TRANSMITE/
stat -c "%U:%G %a %n" /SWIFT/SWIFT /SWIFT/SWIFT/*

echo "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT /SWIFT nfs defaults,_netdev 0 0" | sudo tee -a /etc/fstab
cat /etc/fstab | grep SWIFT

sudo umount /SWIFT
sudo mount -a
mount | grep SWIFT

