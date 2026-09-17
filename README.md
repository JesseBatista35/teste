ls -la /infra_app/config/sifug/IF104.p12.bak_20260917 /infra_app/config/sifug/IF104.p12

chown spjbotr2:<grupo_do_backup> /infra_app/config/sifug/IF104.p12
chmod --reference=/infra_app/config/sifug/IF104.p12.bak_20260917 /infra_app/config/sifug/IF104.p12

keytool -list -keystore /infra_app/config/sifug/IF104.p12 -storetype PKCS12 -storepass <senha_que_te_passaram>


[root@srjtqapllx0021 /]#
[root@srjtqapllx0021 /]# ls -la /infra_app/config/sifug/IF104.p12.bak_20260917 /infra_app/config/sifug/IF104.p12
-rw-r--r-- 1 p585600 cetad 3626 Sep 17 15:50 /infra_app/config/sifug/IF104.p12
-rw-r--r-- 1 root    root  3517 Sep 17 15:51 /infra_app/config/sifug/IF104.p12.bak_20260917
[root@srjtqapllx0021 /]#
[root@srjtqapllx0021 /]#
[root@srjtqapllx0021 /]# chown spjbotr2:<grupo_do_backup> /infra_app/config/sifug/IF104.p12
bash: grupo_do_backup: No such file or directory
[root@srjtqapllx0021 /]#
