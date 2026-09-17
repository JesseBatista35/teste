
-sh-4.2$
-sh-4.2$ mount | grep nfs
sunrpc on /var/lib/nfs/rpc_pipefs type rpc_pipefs (rw,relatime)
nfsccp.dtc.caixa:/ifs/DCPARMAZNA1/ZONEINTRA/CEPTIBR/Backup_TSM_Linux on /suporte type nfs (rw,noatime,vers=3,rsize=131072,wsize=524288,namlen=255,acregmin=0,acregmax=0,acdirmin=0,acdirmax=0,hard,proto=tcp,timeo=600,retrans=2,sec=sys,mountaddr=10.122.17.9,mountvers=3,mountport=300,mountproto=tcp,local_lock=none,addr=10.122.17.9)
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cat /etc/fstab | grep nfs
nfsccp.dtc.caixa:/ifs/DCPARMAZNA1/ZONEINTRA/CEPTIBR/Backup_TSM_Linux    /suporte        nfs     nfsvers=3,tcp,hard,noatime,actimeo=0    0       0
-sh-4.2$
