siorf-frontend-des-194-t7ghk    2/2       Running       0          17h
-sh-4.2$ oc rsh siorf-backend-des-359-deploy df -h
error: cannot exec into a container in a completed pod; current phase is Succeeded
-sh-4.2$ oc get pods
NAME                            READY     STATUS      RESTARTS   AGE
siorf-backend-des-358-deploy    0/1       Completed   0          14d
siorf-backend-des-359-deploy    0/1       Completed   0          57s
siorf-backend-des-359-h9rrg     1/1       Running     0          28s
siorf-backend-des-359-kkh29     1/1       Running     0          33s
siorf-frontend-des-193-deploy   0/1       Completed   0          18d
siorf-frontend-des-194-deploy   0/1       Completed   0          17h
siorf-frontend-des-194-t7ghk    2/2       Running     0          17h
-sh-4.2$ oc rsh siorf-backend-des-359-kkh29 df -h
Filesystem                      Size  Used Avail Use% Mounted on
overlay                         300G  248G   52G  83% /
tmpfs                            64M     0   64M   0% /dev
shm                              64M     0   64M   0% /dev/shm
tmpfs                            13G   80M   13G   1% /etc/hostname
hypernprd56.ad.caixa:/fs_siorf   50G     0   50G   0% /siorf
/dev/sda4                       300G  248G   52G  83% /etc/hosts
tmpfs                           3.0G   24K  3.0G   1% /run/secrets/kubernetes.io/serviceaccount
tmpfs                           3.0G  4.0K  3.0G   1% /opt/jboss-eap-7.4/standalone/configuration/dskeystore_siorf_des.jceks
tmpfs                           3.0G   40K  3.0G   1% /opt/jboss-eap-7.4/standalone/configuration/caixa-truststore-acteste-nprd.jks
tmpfs                            32G     0   32G   0% /proc/acpi
tmpfs                            32G     0   32G   0% /proc/scsi
tmpfs                            32G     0   32G   0% /sys/firmware
-sh-4.2$ oc rsh siorf-backend-des-359-kkh29 ls -la /siorf/
total 4
drwxrwxrwx. 3 nobody nobody 4096 Jul 23 20:55 .
dr-xr-xr-x. 1 root   root     41 Aug 11 09:18 ..
-sh-4.2$ oc rsh siorf-backend-des-359-kkh29 touch /siorf/test.txt
-sh-4.2$ oc rsh siorf-backend-des-359-kkh29 ls -la /siorf/
total 4
drwxrwxrwx. 3 nobody nobody 4096 Aug 11 09:20 .
dr-xr-xr-x. 1 root   root     41 Aug 11 09:18 ..
-rw-rw-rw-. 1    185 nobody    0 Aug 11 09:20 test.txt
-sh-4.2$

