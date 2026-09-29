
-sh-4.2$
-sh-4.2$ os get pods
-sh: os: comando não encontrado
-sh-4.2$ oc get pods
NAME                             READY     STATUS      RESTARTS   AGE
sigot-backend-v2-des-16-dwxl7    1/1       Running     0          24d
sigot-des-422-deploy             0/1       Completed   0          11d
sigot-des-423-78wbw              1/1       Running     0          7d21h
sigot-des-423-deploy             0/1       Completed   0          7d21h
sigot-frontend-des-190-deploy    0/1       Completed   0          7d21h
sigot-frontend-des-191-deploy    0/1       Completed   0          3d18h
sigot-frontend-des-191-ldcnn     2/2       Running     0          3d18h
sigot-frontend-v2-des-17-qbd6h   2/2       Running     0          31d
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ip -4 -br addr
lo               UNKNOWN        127.0.0.1/8
eth0             UP             10.122.155.62/23
eth1             UP             10.122.24.108/20
docker0          DOWN           172.17.0.1/16
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ip route get $(getent hosts nfsctcnprd.ctc.caixa | awk '{print $1}')
192.168.224.108 via 10.122.154.1 dev eth0 src 10.122.155.62
    cache
-sh-4.2$
-sh-4.2$
-sh-4.2$ showmount -e nfsctcnprd.ctc.caixa | grep -i SIGOT
^C
^C
^C
^C




-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ mkdir -p /SIGOT && mount -t nfs nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIGOT /SIGOT && touch /SIGOT/.teste_wo && rm /SIGOT/.teste_WO0000081741328
mkdir: é impossível criar o diretório “/SIGOT”: Permissão negada
-sh-4.2$
