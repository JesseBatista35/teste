
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]# su - ctmagelx -c 'env | grep -E "CONTROLM|LD_LIBRARY_PATH|^PATH"'
PATH=/usr/local/bin:/usr/bin:/usr/local/sbin:/usr/sbin:/opt/ctmage/ctm/scripts:/opt/ctmage/ctm/exe
LD_LIBRARY_PATH=/opt/ctmage/ctm/exe
CONTROLM=/opt/ctmage/ctm
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]# find /opt/ctmage -name "libBMCOS.so*" 2>/dev/null
export LD_LIBRARY_PATH=<diretorio_encontrado>:$LD_LIBRARY_PATH
ag_ping
/opt/ctmage/ctm/exe_9.0.19.200/libBMCOS.so
-bash: diretorio_encontrado: Arquivo ou diretório inexistente
ag_ping: error while loading shared libraries: libBMCOS.so: cannot open shared object file: No such file or directory
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
