
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]# grep -E "CTMSHOST|CTMPERMHOSTS" /opt/ctmage/ctm/data/CONFIG.dat
CTMSHOST                            cxextrlx038
CTMPERMHOSTS                        cxextrlx038
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]# export CONTROLM=/opt/ctmage/ctm LD_LIBRARY_PATH=/opt/ctmage/ctm/exe PATH=/opt/ctmage/ctm/scripts:/opt/ctmage/ctm/exe:$PATH
[root@caddeapllx2501 ~]# ag_ping
Output:
Server is alive.
Result: Success.
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
