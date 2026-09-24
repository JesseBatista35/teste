
-sh-4.2$
-sh-4.2$ oc exec $POD -- df -h /simcn /upload/des/simcn
df: '/upload/des/simcn': No such file or directory
Filesystem                                                    Size  Used Avail Use% Mounted on
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMCN   50G     0   50G   0% /simcn
command terminated with exit code 1
-sh-4.2$ oc exec $POD -- ls -la /upload/des/simcn /uploadintegracao/des/simcn /simcn
ls: cannot access /upload/des/simcn: No such file or directory
ls: cannot access /uploadintegracao/des/simcn: No such file or directory
/simcn:
total 2
drwxrwxrwx. 2 nobody nobody  0 May 11 11:23 .
dr-xr-xr-x. 1 root   root   41 Sep 24 14:36 ..
command terminated with exit code 2
-sh-4.2$ oc exec $POD -- mount | grep -i nfs
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMCN on /simcn type nfs4 (rw,relatime,vers=4.0,rsize=1048576,wsize=1048576,namlen=255,hard,proto=tcp,timeo=600,retrans=2,sec=sys,clientaddr=192.168.236.12,local_lock=none,addr=192.168.224.110)
-sh-4.2$
-sh-4.2$
-sh-4.2$ POD=$(oc get pod -l deploymentconfig=simcn-backend-des -o jsonpath='{.items[0].metadata.name}')
-sh-4.2$
