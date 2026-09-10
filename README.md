scp standalone.xml set_config.properties p585600@10.116.26.227:/tmp/




cp /tmp/standalone.xml /opt/open/sso/7.3.0/standalone/configuration/standalone.xml
cp /tmp/set_config.properties /opt/open/sso/7.3.0/standalone/configuration/set_config.properties
chown spssodr1:singlesignon /opt/open/sso/7.3.0/standalone/configuration/standalone.xml /opt/open/sso/7.3.0/standalone/configuration/set_config.properties




[root@crjtqapllx036 opt]# cd /tmp/
[root@crjtqapllx036 tmp]# ls -la
total 320
drwxrwxrwt+ 43 root      root         12288 Sep 10 10:20 .
dr-xr-xr-x. 21 root      root          4096 Mar 21  2025 ..
drwx------   3 spqpcpb   spqpcpb       4096 Apr 30  2025 .ansible-spqpcpb
drwx------   3 root      root          4096 Jul 21 15:21 BES
-rw-r--r--   1 root      root           336 Sep  4 21:45 catalogo_soft.04.log
-rw-r--r--   1 root      root           336 Sep  5 21:45 catalogo_soft.05.log
-rw-r--r--   1 root      root           336 Sep  6 21:45 catalogo_soft.06.log
-rw-r--r--   1 root      root           336 Sep  7 21:45 catalogo_soft.07.log
-rw-r--r--   1 root      root           336 Sep  8 21:45 catalogo_soft.08.log
-rw-r--r--   1 root      root           336 Sep  9 21:45 catalogo_soft.09.log
-rw-rw-r--   1 spqpcpb   spqpcpb        115 Aug 31 20:21 CRJTQAPLLX036.apache.2026-08-31.csv
-rw-rw-r--   1 spqpcpb   spqpcpb        115 Sep  2 02:12 CRJTQAPLLX036.apache.2026-09-01.csv
-rw-rw-r--   1 spqpcpb   spqpcpb        115 Sep  4 19:22 CRJTQAPLLX036.apache.2026-09-04.csv
drwxrwxrwx   3 root      root          4096 Jun 27  2025 .dotnet
drwxrwxrwt.  2 root      root          4096 May  9  2019 .font-unix
drwxr-xr-x   2 c109785   suporte       4096 Aug 13  2025 hsperfdata_c109785
drwxr-xr-x   2  10580444 cetad         4096 Jun 17  2025 hsperfdata_p580444
drwxr-xr-x   2 p736514   cetad         4096 Mar 28  2025 hsperfdata_p736514
drwxr-xr-x   2 p984222   suporte       4096 Oct  2  2023 hsperfdata_p984222
drwxr-xr-x   2 root      root          4096 Sep  4 22:22 hsperfdata_root
drwxr-xr-x   2 spqpcpb   spqpcpb       4096 Sep  1 22:14 hsperfdata_spqpcpb
drwxr-xr-x   2 spssodr1  singlesignon  4096 Jul 21 15:21 hsperfdata_spssodr1
drwxr-xr-x   2 ssetrd01  siset         4096 May  2  2025 hsperfdata_ssetrd01
drwxr-xr-x   2 ssupinv01 suporte       4096 Jul 21 14:09 hsperfdata_ssupinv01
drwxrwxrwt.  2 root      root          4096 May  9  2019 .ICE-unix
drwxrwxrwx   2 spqpcpb   spqpcpb       4096 Jan  2  2025 inventario
drwxr-xr-x   3 ssetrd01  siset         4096 Oct  8  2024 package
-rw-r--r--   1 root      mdatp           51 Sep 10 08:33 .ses
-rw-r--r--   1 p585600   cetad         4801 Sep 10 10:20 set_config.properties
drwxr-xr-x   3 spssodr1  singlesignon  4096 Apr 17  2025 spssodr1
-rw-r--r--   1 p585600   cetad        41236 Sep 10 10:20 standalone.xml
-rw-r--r--   1 root      root         41235 Aug 31 13:26 .standalone.xml.3b8acf4e5459b2b084c98c6c5272bded
drwx------   3 root      root          4096 Jul 21 15:21 systemd-private-508b03ca54274b03a5fe5b0fa92d6440-arcproxyd.service-H6aq3D
drwx------   3 root      root          4096 Jul 21 15:21 systemd-private-508b03ca54274b03a5fe5b0fa92d6440-himdsd.service-d3i4nb
drwx------   3 root      root          4096 Jul 21 15:21 systemd-private-508b03ca54274b03a5fe5b0fa92d6440-ntpd.service-X1ZS7U
drwx------   3 root      root          4096 Jun 15  2023 systemd-private-67165560e77b49a99ca803512f41e843-ntpd.service-nRPZa3
drwx------   3 root      root          4096 Jun 16  2023 systemd-private-79ff2c81d361469ab9f3daa5d9b32745-ntpd.service-FpRpVa
drwx------   3 root      root          4096 Oct  5  2025 systemd-private-7ad48f739a4349bba8694f1235b6b7ad-arcproxyd.service-L6PBcu
drwx------   3 root      root          4096 Oct  5  2025 systemd-private-7ad48f739a4349bba8694f1235b6b7ad-himdsd.service-mwZp0C
drwx------   3 root      root          4096 Jan  8  2025 systemd-private-7ad48f739a4349bba8694f1235b6b7ad-ntpd.service-UDbkNM
drwx------   3 root      root          4096 Jun 16  2023 systemd-private-b4034072f2df4dd987f6b8afb97ac204-ntpd.service-Z3S2fi
drwx------   3 root      root          4096 May  7  2022 systemd-private-b9887b068a1641c6b19975f249e0a1ff-ntpd.service-iPjRgc
drwxrwxrwt.  2 root      root          4096 May  9  2019 .Test-unix
drwx------   2 root      root          4096 Jul 21 15:19 vmware-root_25985-3888043883
drwx------   2 root      root          4096 Jul 21 15:19 vmware-root_26013-3879196400
drwx------   2 root      root          4096 Jun 13  2023 vmware-root_879-4013723248
drwx------   2 root      root          4096 Aug 29  2023 vmware-root_880-2697139639
drwx------   2 root      root          4096 Jun 15  2023 vmware-root_885-4021784556
drwx------   2 root      root          4096 Jun 16  2023 vmware-root_888-2730562489
drwx------   2 root      root          4096 Nov  8  2023 vmware-root_892-2722239036
drwx------   2 root      root          4096 Jun 16  2023 vmware-root_898-2722239165
drwx------   2 root      root          4096 Jul 21 15:21 vmware-root_930-2722763397
drwx------   2 root      root          4096 Jul 21 15:06 vmware-root_950-2697008400
drwx------   2 root      root          4096 Jul 21 15:08 vmware-root_958-2730693406
drwxrwxrwt.  2 root      root          4096 May  9  2019 .X11-unix
drwxrwxrwt.  2 root      root          4096 May  9  2019 .XIM-unix
[root@crjtqapllx036 tmp]#
