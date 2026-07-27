
[p585600@srjdeapllx130 ~]$ ls -la /tmp*.crt
ls: cannot access /tmp*.crt: No such file or directory
[p585600@srjdeapllx130 ~]$ sudo su
[root@srjdeapllx130 p585600]# ls -ltr /tmp
total 188
drwxr-xr-x  4 root      root      4096 Jul 19  2017 vmware-tools-distrib
drwx------  3 root      root      4096 Jun  7  2021 systemd-private-40219cd4029b4b898018ce122a9998f5-ntpd.service-wjM5II
drwx------  2 root      root      4096 Jun  6  2023 vmware-root_940-2689209484
drwx------  2 root      root      4096 Jun 15  2023 vmware-root_935-3980298462
drwxr-xr-x  2 p984222   suporte   4096 Jun 27  2023 hsperfdata_p984222
drwx------  2 root      root      4096 Nov 28  2023 vmware-root_932-2722632322
drwxr-xr-x  2 root      root      4096 Nov 28  2023 vmware-config-28880.0
drwx------  2 root      root      4096 Nov 28  2023 vmware-root_29136-826994638
drwx------  2 root      root      4096 Nov 28  2023 vmware-root_1115-4022177631
drwx------  3 root      root      4096 Jun  4  2024 systemd-private-3f3beb893e184784969fd38e9d12acf6-ntpd.service-TKQe0q
drwx------  2 root      root      4096 Jun  4  2024 vmware-root_981-4290756372
drwx------  2 root      root      4096 Jul 22  2024 vmware-root_10100-995866921
drwx------  3 root      root      4096 Sep 11  2024 BES
drwx------  2 spqpcpb   spqpcpb   4096 Jan  2  2025 ansible_command_payload_eS05Bq
drwxrwxrwx  2 spqpcpb   spqpcpb   4096 Jan  2  2025 inventario
drwx------  3 root      root      4096 Jan  8  2025 systemd-private-2606d28004f944ada3c999121ccebca3-ntpd.service-gGrNMI
drwxr-xr-x  2 p736514   cetad     4096 Mar 26  2025 hsperfdata_p736514
-rwxrwxrwx  1 spjbodr2  jboss        0 Jun 29  2025 license.lock
drwx------  3 root      root      4096 Sep 30  2025 systemd-private-2606d28004f944ada3c999121ccebca3-arcproxyd.service-l7K6HP
drwx------  3 root      root      4096 Sep 30  2025 systemd-private-2606d28004f944ada3c999121ccebca3-himdsd.service-tSbci6
-rwxr-xr-x  1 root      root      1069 Oct  8  2025 OnboardingScript.sh
drwxr-xr-x  2 spqpcpb   spqpcpb   4096 Jul  4 01:50 hsperfdata_spqpcpb
drwx------  2 root      root      4096 Jul 10 18:52 vmware-root
-rwxrwxrwx  1 spjbodr2  jboss        0 Jul 19 01:08 jccdiag.log
-rw-r--r--  1 root      root       336 Jul 21 21:45 catalogo_soft.21.log
-rw-r--r--  1 root      root       336 Jul 22 21:45 catalogo_soft.22.log
-rw-r--r--  1 root      root       336 Jul 23 21:45 catalogo_soft.23.log
drwxr-xr-x  2 root      root      4096 Jul 24 16:45 hsperfdata_root
-rw-r--r--  1 root      root       336 Jul 24 21:45 catalogo_soft.24.log
-rw-r--r--  1 root      root       336 Jul 25 21:45 catalogo_soft.25.log
-rw-r--r--  1 root      root       336 Jul 26 21:45 catalogo_soft.26.log
-rw-rw-r--  1 spnowp18  spnowp18     0 Jul 27 03:13 kuku
drwxr-xr-x. 2 spjbodr2  jboss     4096 Jul 27 04:08 hsperfdata_spjbodr2
-rw-r--r--  1 root      root     14428 Jul 27 11:11 server.log.2024-01-09
-rw-r--r--  1 root      root     14415 Jul 27 11:11 server.log.2022-05-31
-rw-r--r--  1 root      root     14428 Jul 27 11:11 server.log
drwxr-xr-x  2 ssupinv01 suporte   4096 Jul 27 14:09 hsperfdata_ssupinv01
drwxr-xr-x  2 p585600   cetad     4096 Jul 27 14:34 hsperfdata_p585600
-rwxrwxrwx  1 spjbodr2  jboss      657 Jul 27 14:40 connlicj.bin
-rw-r--r--  1 p585600   cetad     2280 Jul 27 14:47 Sectigo_Public_Server-Authentication_CA_DV_R36 1 (1).crt
-rw-r--r--  1 p585600   cetad     2012 Jul 27 14:47 Sectigo_Public_Server_Authentication_Root_R46 1 (1).crt
[root@srjdeapllx130 p585600]#



openssl x509 -in /tmp/Sectigo_Public_Server_Auth_CA_DV_R36.crt -noout -subject -issuer
openssl x509 -in /tmp/Sectigo_Public_Server_Auth_Root_R46.crt -noout -subject -issuer



cp /infra_app/config/certificados/cacerts /infra_app/config/certificados/cacerts.bkp-$(date +%Y%m%d_%H%M%S)


keytool -importcert -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-dv-r36 -file /tmp/Sectigo_Public_Server_Auth_CA_DV_R36.crt -noprompt

keytool -importcert -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-root-r46 -file /tmp/Sectigo_Public_Server_Auth_Root_R46.crt -noprompt



keytool -list -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-dv-r36
keytool -list -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-root-r46



