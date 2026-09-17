
sh-4.2$ df -h
Filesystem                                                    Size  Used Avail Use% Mounted on
overlay                                                       300G  251G   49G  84% /
tmpfs                                                          64M     0   64M   0% /dev
shm                                                            64M     0   64M   0% /dev/shm
tmpfs                                                          13G   82M   13G   1% /etc/hostname
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMCN   50G     0   50G   0% /simcn
/dev/sda4                                                     300G  251G   49G  84% /etc/hosts
tmpfs                                                         4.0G   40K  4.0G   1% /opt/jboss-eap-7.4/standalone/configuration/caixa-truststore-acteste-nprd.jks
tmpfs                                                         4.0G   24K  4.0G   1% /run/secrets/kubernetes.io/serviceaccount
tmpfs                                                          32G     0   32G   0% /proc/acpi
tmpfs                                                          32G     0   32G   0% /proc/scsi
tmpfs                                                          32G     0   32G   0% /sys/firmware
sh-4.2$ mount | grep nfs
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMCN on /simcn type nfs4 (rw,relatime,vers=4.0,rsize=1048576,wsize=1048576,namlen=255,hard,proto=tcp,timeo=600,retrans=2,sec=sys,clientaddr=192.168.236.147,local_lock=none,addr=192.168.224.105)
sh-4.2$ cat /etc/fstab | grep nfs
cat: /etc/fstab: No such file or directory
sh-4.2$ ^C
sh-4.2$ 
