
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]# for n in 747 871 879 969 1000 1031 1047 1060 1094; do awk -v n=$n 'NR<=n && /<profile name=/ {p=$0} NR<=n && /<(xa-)?data-source / {d=$0} NR==n {print n": "p" | "d; exit}' /opt/jboss/jboss-eap/dc/configuration/domain.xml; done
747:         <profile name="full-ha-sifec-intranet"> |
871:         <profile name="full-ha-sifec-intranet"> |
879:         <profile name="full-ha-sifec-intranet"> |
969:         <profile name="full-ha-sifec-intranet"> |
1000:         <profile name="full-ha-sifec-intranet"> |
1031:         <profile name="full-ha-sifec-intranet"> |
1047:         <profile name="full-ha-sifec-intranet"> |
1060:         <profile name="full-ha-sifec-intranet"> |
1094:         <profile name="full-ha-sifec-intranet"> |
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#



85600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ for d in cxextrux047.desenvolvimento.extracaixa:55000 bdbr12.caixa:55000 10.116.92.132:4101 10.116.92.132:4102 10.116.92.132:4407 10.192.230.120:4101; do h=${d%:*}; p=${d#*:}; if timeout 5 bash -c "</dev/tcp/$h/$p" 2>/dev/null; then echo "OK      $d"; else echo "FALHOU  $d"; fi; done
OK      cxextrux047.desenvolvimento.extracaixa:55000
OK      bdbr12.caixa:55000
OK      10.116.92.132:4101
OK      10.116.92.132:4102
FALHOU  10.116.92.132:4407
FALHOU  10.192.230.120:4101
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$

