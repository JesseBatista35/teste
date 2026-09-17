Confirmado que o volume NFS está corretamente montado no ambiente DES do SIMCN-backend.

Evidências coletadas no pod simcn-backend-des-250-wfg6x (projeto simcn-des):

$ df -h
Filesystem                                                    Size  Used Avail Use% Mounted on
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMCN   50G     0   50G   0% /simcn

$ mount | grep nfs
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMCN on /simcn type nfs4 (rw,relatime,vers=4.0,rsize=1048576,wsize=1048576,namlen=255,hard,proto=tcp,timeo=600,retrans=2,sec=sys,clientaddr=192.168.236.147,local_lock=none,addr=192.168.224.105)

Confirmação via PersistentVolume (oc get pv simcn-backend-data-des -o yaml):

yaml
spec:
  nfs:
    path: /ifs/CADSVISISD4/SERVIDORES/CETAD/SIMCN
    server: nfsctcnprd.ctc.caixa
  persistentVolumeReclaimPolicy: Retain
  accessModes:
  - ReadWriteMany
  capacity:
    storage: 50Gi
status:
  phase: Bound

O PV está com status Bound, o mount tipo nfs4 está ativo dentro do container, servidor e path acessíveis, sem erros de I/O. A montagem está funcional.

Observação adicional:

Foi identificada uma divergência entre o path configurado na variável PATH_NFS do grupo de variáveis SIMCN-BACKEND-DES no Azure DevOps (/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/UP_SIMCN) e o path real do export usado pelo PV/mount em produção (/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMCN). O PV foi criado há 129 dias com persistentVolumeReclaimPolicy: Retain, o que sugere que a variável pode ter sido alterada posteriormente sem que o PV/PVC fosse recriado. Recomenda-se validar com a equipe responsável pelo storage se ambos os paths existem e se a variável está desatualizada, para evitar inconsistência em caso de recriação futura do volume.
