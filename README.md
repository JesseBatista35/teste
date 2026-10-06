Abra https://siepr-backend-intranet-des.apps.nprd.caixa/q/health, clique em Avançado → Continuar, depois volte na aba do SIEPR e aperte F5.






-sh-4.2$ cd /tmp
-sh-4.2$ H=siepr-backend-intranet-des.apps.nprd.caixa
-sh-4.2$
-sh-4.2$
-sh-4.2$ openssl s_client -connect $H:443 -servername $H -showcerts </dev/null 2>/dev/null \
>   | awk '/BEGIN/{n++} n==2' | sed -n '/BEGIN/,/END/p' > AC_Icptestes_Raiz.cer
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ openssl s_client -connect $H:443 -servername $H </dev/null 2>/dev/null \
>   | openssl x509 -noout -text | grep -A2 "Authority Information Access"
            Authority Information Access:
                CA Issuers - URI:http://icptestes.caixa/certs/acicptestessub.cer

-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -o AC_Icptestes_Sub.cer http://icptestes.caixa/certs/acicptestessub.cer
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100  2244  100  2244    0     0   359k      0 --:--:-- --:--:-- --:--:--  438k
-sh-4.2$
-sh-4.2$
-sh-4.2$


total 140
drwxrwxrwt. 66 root     root      4096 Out  6 15:25 .
dr-xr-xr-x. 20 root     root       287 Dez 13  2025 ..
drwxr-xr-x   7 p763455  supadmin   144 Ago 14 00:47 a
drwxr-xr-x   3 root     root        31 Jan  2  2023 aaa
-rw-r--r--   1 p585600  usucef    2159 Out  6 15:24 AC_Icptestes_Raiz.cer
-rw-r--r--   1 p585600  usucef    2244 Out  6 15:25 AC_Icptestes_Sub.cer
drwx------   2 root     root         6 Out 25  2024 ansible_copy_payload_D4eLE8
drwx------   2 sadscp01 sadscp01     6 Abr 17  2024 ansible_setup_payload_0Pi84u
drwx------   2 sadscp01 sadscp01     6 Abr 17  2024 ansible_setup_payload_Pum0yK
drwx------   2 sadscp01 sadscp01     6 Abr 17  2024 ansible_setup_payload_rhQnxK
drwx------   2 sadscp01 sadscp01     6 Abr 17  2024 ansible_setup_payload_zF81Bf
drwx------   3 spqpcpb  spqpcpb     17 Abr 29  2025 .ansible-spqpcpb
drwxr-xr-x   2 root     root         6 Mar 13  2024 apache_erro
-rw-r--r--   1 p981778  usucef    8282 Out  6 11:49 backend.yaml
-rw-r--r--   1 root     root       456 Out  1 23:00 catalogo_soft.01.log
-rw-r--r--   1 root     root       456 Out  2 23:00 catalogo_soft.02.log
-rw-r--r--   1 root     root       456 Out  3 23:00 catalogo_soft.03.log
-rw-r--r--   1 root     root       456 Out  4 23:00 catalogo_soft.04.log
-rw-r--r--   1 root     root       535 Out  5 23:00 catalogo_soft.05.log
-rw-r--r--   1 root     root       336 Set 30 23:00 catalogo_soft.30.log
drwxrwxrwx   3 root     root        17 Jun 27  2025 .dotnet
srw-------   1 sadscp01 sadscp01     0 Jul  8 12:40 dotnet-diagnostic-122411-2959999832-socket
drwxr-xr-x  38 p745573  20001097  4096 Fev 12  2025 esteira-docker-build
drwxr-xr-x   2 sadscp01 sadscp01     6 Jan 31  2024 facts
drwxr-xr-x   3 sadscp01 sadscp01    42 Mar 13  2026 files
drwxrwxrwt.  2 root     root         6 Set  6  2018 .font-unix
drwxr-xr-x   2 a112141  usucef       6 Mai 10  2024 hsperfdata_a112141
drwxr-xr-x   2 c067581  prdadmin     6 Abr  9 15:28 hsperfdata_c067581
drwxr-xr-x   2 p585600  usucef       6 Set 24 14:05 hsperfdata_p585600
drwxr-xr-x   2 p616353  30000207     6 Jun 21  2025 hsperfdata_p616353
drwxr-xr-x   2 p667224  usucef       6 Fev 13  2026 hsperfdata_p667224
drwxr-xr-x   2 p768755  prdadmin     6 Ago  1  2024 hsperfdata_p768755
drwxr-xr-x   2 p911751  supadmin     6 Jul  9 22:15 hsperfdata_p911751
drwxr-xr-x   2 p922425  usucef       6 Jun 10 09:15 hsperfdata_p922425
drwxr-xr-x   2 p981778  usucef       6 Set  9 16:37 hsperfdata_p981778
drwxr-xr-x   2 root     root         6 Jul 22 10:09 hsperfdata_root
drwxr-xr-x   2 sadscp01 sadscp01     6 Jun 17  2025 hsperfdata_sadscp01
drwxr-xr-x   2 spqpcpb  spqpcpb      6 Ago  2 21:06 hsperfdata_spqpcpb
drwxrwxrwt.  2 root     root         6 Set  6  2018 .ICE-unix
-rw-r--r--   1 p981778  usucef    7226 Out  6 11:49 internet.yaml
drwxrwxrwx   2 spqpcpb  spqpcpb      6 Jan  2  2025 inventario
drwxrwxr-x   3 spqpcpb  spqpcpb     17 Mai 22 15:53 .inventario-jboss
drwxr-xr-x   3 a112141  usucef      23 Nov 22  2023 inventory
-rw-r--r--   1 root     root       811 Out  6 15:16 .main.yml.cb95b2d6646c7954aee7bf1172b95048
drwx------   2 p763455  supadmin     6 Jun 26  2025 podman-buildAHbnXm
drwx------   2 p763455  supadmin     6 Jun 26  2025 podman-buildiJfM2H
drwx------   2 p763455  supadmin     6 Jun 26  2025 podman-buildm082k_
-rw-r--r--   1 p585600  usucef    7052 Set 30 12:01 rc80.json
-rw-r--r--   1 p585600  usucef    7113 Set 30 12:04 rc81.json
drwx------   4 sadscp01 sadscp01    38 Ago 22 01:01 run-1000
-rw-r--r--   1 root     mdatp       51 Out  5 18:46 .ses
drwxr-xr-x   2 p911751  supadmin     6 Out  9  2024 sipbs
-rw-r--r--   1 p981778  usucef   15798 Out  1 13:58 sipge-webhook-des.yaml
-rw-r--r--   1 p981778  usucef   10058 Out  1 13:58 sipge-webhook-tqs.yaml
drwxrwxrwx   2 sadscp01 sadscp01     6 Jul 16  2023 sispi
-r--r-----   1 root     root      4362 Abr 26  2022 .sudoers.b052ba948c7cb1897c62e7a8bd996abc
drwx------   3 root     root        17 Out 20  2024 systemd-private-d2da5df751344d749982df9312b79895-ntpd.service-wffo3h
drwx------   3 root     root        17 Set 28  2025 systemd-private-fec276a1d4224f48be2311110791ae94-arcproxyd.service-nVSuWs
drwx------   3 root     root        17 Set 28  2025 systemd-private-fec276a1d4224f48be2311110791ae94-himdsd.service-4IK37C
drwx------   3 root     root        17 Jul 30  2025 systemd-private-fec276a1d4224f48be2311110791ae94-ntpd.service-ZCKblZ
drwxr-xr-x   2 root     root         6 Dez 13  2025 _temp
drwxr-xr-x   3 root     root        19 Dez 13  2025 teste
drwxr-xr-x   3 root     root        24 Mar  6  2026 teste2
drwxrwxrwt.  2 root     root         6 Set  6  2018 .Test-unix
drwx------   2 root     root         6 Jul 30  2025 tmp.cJsYo1DMrR
drwx------   2 root     root         6 Ago 18  2024 tmp.hEpHeeMJXz
drwx------   2 root     root         6 Nov 15  2024 tmp.JTSkOT3Hte
drwx------   2 root     root         6 Jan 24  2025 tmp.lqL8QOj6DF
drwx------   2 root     root         6 Nov 15  2024 tmp.pGqhELoGIW
drwx------   2 root     root         6 Out 20  2024 tmp.sTbJIDWsec
drwx------   2 root     root         6 Ago 18  2024 tmp.VUKgOmmafh
drwx------   2 root     root         6 Nov  6  2024 tmp.WZWTfOn63Z
drwx------   2 root     root         6 Out 20  2024 tmp.xi2yyCuKXC
drwx------   2 root     root         6 Nov 15  2024 tmp.ZBAHcW72CK
drwxr-xr-x   2 p585600  usucef       6 Mai 18 14:35 vault-des
drwx------   2 root     root         6 Jul 29  2023 vmware-root_932-2722632322
drwx------   2 root     root         6 Nov 15  2024 vmware-root_945-4013199049
drwx------   2 root     root         6 Out 20  2024 vmware-root_954-2722108059
drwx------   2 root     root         6 Ago 18  2024 vmware-root_958-2730693406
drwx------   2 root     root         6 Nov 15  2024 vmware-root_972-2957124820
drwx------   2 root     root         6 Jul 30  2025 vmware-root_987-4257200413
drwx------   2 root     root         6 Out 20  2024 vmware-root_990-2999657286
-rw-r--r--   1 p780925  usucef   15798 Set 30 15:54 webhook-des.yaml
drwxrwxrwt.  2 root     root         6 Set  6  2018 .X11-unix
drwxrwxrwt.  2 root     root         6 Set  6  2018 .XIM-unix
-sh-4.2$



como faz para tirar eles daqui. 
