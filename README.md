
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$ cp /infra_app/config/sifug/IF104.p12 /infra_app/config/sifug/IF104.p12.bak_$(date +%Y%m%d)
cp: cannot create regular file `/infra_app/config/sifug/IF104.p12.bak_20260917': Permission denied
[p585600@srjtqapllx0021 ~]$ sudo su
[root@srjtqapllx0021 p585600]# cp /infra_app/config/sifug/IF104.p12 /infra_app/config/sifug/IF104.p12.bak_$(date +%Y%m%d)
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]# sudo mv /tmp/eco.dataprev.des.caixa.gov.br.p12 /infra_app/config/sifug/IF104.p12
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]#

