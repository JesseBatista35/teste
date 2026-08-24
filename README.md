[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# ls -l /proc/9952/fs/1
ls: não é possível acessar /proc/9952/fs/1: Arquivo ou diretório não encontrado
[root@caddeapllx2484 p585600]# ls -l /proc/9952/fd/2
lrwx------ 1 jboss jboss 64 Ago 14 15:38 /proc/9952/fd/2 -> /dev/pts/0 (deleted)
[root@caddeapllx2484 p585600]# ls -l /proc/9952/fd/1
l-wx------ 1 jboss jboss 64 Ago 14 15:38 /proc/9952/fd/1 -> /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/console-stdout.log
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# find /logs/jboss -newer /tmp -iname "*.log" -mmin -10 2>/dev/null -ls
[root@caddeapllx2484 p585600]# find /opt/jboss-eap -newer /tmp -iname "*.log" -mmin -10 2>/dev/null -ls
[root@caddeapllx2484 p585600]#
