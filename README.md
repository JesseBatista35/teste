
-sh-4.2$ oc project sisns-tqs
Now using project "sisns-tqs" on server "https://api.nprd.caixa:6443".
-sh-4.2$ oc get pods
NAME                                READY     STATUS      RESTARTS   AGE
sisns-backend-tqs-118-deploy        0/1       Completed   0          21m
sisns-backend-tqs-119-deploy        0/1       Completed   0          8m25s
sisns-backend-tqs-119-gjln8         1/1       Running     0          8m22s
sisns-frontend-clone-tqs-63-rf87t   2/2       Running     0          134d
sisns-frontend-tqs-308-deploy       0/1       Completed   0          7d13h
sisns-frontend-tqs-309-deploy       0/1       Completed   0          6h10m
sisns-frontend-tqs-309-r45ts        2/2       Running     0          6h10m
-sh-4.2$ oc exec sisns-backend-tqs-119-gjln8 -c sisns-backend-tqs -- df -h
Filesystem                                                            Size  Used Avail Use% Mounted on
overlay                                                               300G  252G   48G  84% /
tmpfs                                                                  64M     0   64M   0% /dev
shm                                                                    64M     0   64M   0% /dev/shm
tmpfs                                                                  13G   84M   13G   1% /etc/passwd
tmpfs                                                                  62G   12K   62G   1% /deployments/caixa-truststore-azure.jks
tmpfs                                                                  62G   40K   62G   1% /deployments/caixa-truststore-acteste-nprd.jks
/dev/sda4                                                             300G  252G   48G  84% /etc/hosts
tmpfs                                                                  62G  8.0K   62G   1% /usr/src/app/secrets_files
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISNS_TQS_FGW  5.0G   39M  5.0G   1% /opt/SISNS/SIB2B/GECIN/DOWNLOAD
tmpfs                                                                  62G   24K   62G   1% /run/secrets/kubernetes.io/serviceaccount
tmpfs                                                                  32G     0   32G   0% /proc/acpi
tmpfs                                                                  32G     0   32G   0% /proc/scsi
tmpfs                                                                  32G     0   32G   0% /sys/firmware
-sh-4.2$ oc exec sisns-backend-tqs-119-gjln8 -c sisns-backend-tqs -- ls -la /opt/SISNS/SIB2B/GECIN/DOWNLOAD
total 4
drwxrwxrwx. 3 20000711   99 30 May  7 13:57 .
drwxr-xr-x. 3 root     root 22 Jul 23 22:42 ..
drwxrwxrwx. 3       99   99 35 May  7 13:57 CB_SISNS_NFS
-sh-4.2$
