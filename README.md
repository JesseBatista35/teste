
[p585600@cadsvitrlx100 ~]$ scp applicationinsights-agent-3.7.8.jar p585600@10.116.88.98:/tmp/
***********************************************************************
(1) - Este e um computador privado de propriedade da Caixa Economica
Federal. Usuarios autorizados e nao autorizados nao possuem direitos de
divulgar as informacoes contidas aqui.
(2) - Ao fazer uso do sistema, o usuario esta ciente que pode estar
sendo monitorado, interceptado e auditado pelo departamento competente
da Caixa Economica Federal.
(3) - O uso nao autorizado ou improprio deste sistema pode resultar em
um processo disciplinar administrativo e/ou punicao atraves de acoes
civis ou criminais. Ao continuar o uso deste sistema, indica que voce
esta ciente e concordando com os termos e condicoes acima descritos.

Pressione <Control+D> IMEDIATAMENTE se voce nao concorda com as
condicoes deste aviso
***********************************************************************
p585600@10.116.88.98's password:
applicationinsights-agent-3.7.8.jar                                                                                                                 100%   44MB 149.2MB/s   00:00
[p585600@cadsvitrlx100 ~]$


deu certo 


de voltao ao 41 ele esta em tmp

p585600@10.116.88.98's password:
Last login: Wed Jun  3 15:53:02 2026 from 10.122.150.31
id: cannot find name for group ID 927
[p585600@sspdeapllx0041 ~]$ ls -la
total 56
drwx------    6 p585600  927  4096 2026-06-03 16:01 .
drwxr-xr-x. 235 root    root  4096 2026-05-27 16:39 ..
-rw-------    1 p585600  927 14220 2026-06-03 16:12 .bash_history
-rw-------    1 p585600  927    18 2026-05-25 09:15 .bash_logout
-rw-------    1 p585600  927   176 2026-05-25 09:15 .bash_profile
-rw-------    1 p585600  927   124 2026-05-25 09:15 .bashrc
drwx------    2 p585600  927  4096 2026-05-25 09:15 .gnome2
-rw-------    1 p585600  927   171 2026-05-25 09:15 .kshrc
drwx------    4 p585600  927  4096 2026-05-25 09:15 .mozilla
drwxr-xr-x    2 p585600  927  4096 2026-06-03 10:30 .oracle_jre_usage
drwxr-----    3 p585600  927  4096 2026-06-03 16:01 .pki
[p585600@sspdeapllx0041 ~]$ cd
[p585600@sspdeapllx0041 ~]$ ls -la
total 56
drwx------    6 p585600  927  4096 2026-06-03 16:01 .
drwxr-xr-x. 235 root    root  4096 2026-05-27 16:39 ..
-rw-------    1 p585600  927 14220 2026-06-03 16:12 .bash_history
-rw-------    1 p585600  927    18 2026-05-25 09:15 .bash_logout
-rw-------    1 p585600  927   176 2026-05-25 09:15 .bash_profile
-rw-------    1 p585600  927   124 2026-05-25 09:15 .bashrc
drwx------    2 p585600  927  4096 2026-05-25 09:15 .gnome2
-rw-------    1 p585600  927   171 2026-05-25 09:15 .kshrc
drwx------    4 p585600  927  4096 2026-05-25 09:15 .mozilla
drwxr-xr-x    2 p585600  927  4096 2026-06-03 10:30 .oracle_jre_usage
drwxr-----    3 p585600  927  4096 2026-06-03 16:01 .pki
[p585600@sspdeapllx0041 ~]$ cd /tmp/
[p585600@sspdeapllx0041 tmp]$ ls -la
total 45876
drwxrwxrwt. 51 root     root         4096 2026-06-03 16:16 .
dr-xr-xr-x. 38 root     root        20480 2026-02-13 16:00 ..
drwx------   3 spqpcpb  spqpcpb      4096 2025-04-30 11:34 .ansible-spqpcpb
-rw-r--r--   1 p585600       927 46275771 2026-06-03 16:16 applicationinsights-agent-3.7.8.jar
drwxr-xr-x   2 f940606  desenv       4096 2024-06-17 14:50 backup
drwxrwxr-x.  4 jboss7   jboss7       4096 2026-06-03 16:12 bry_temp
-rw-r--r--   1 root     root          317 2026-06-01 21:09 catalogo_soft.01.log
-rw-r--r--   1 root     root          317 2026-06-02 21:07 catalogo_soft.02.log
-rw-r--r--   1 root     root          317 2026-05-27 21:09 catalogo_soft.27.log
-rw-r--r--   1 root     root          317 2026-05-28 21:04 catalogo_soft.28.log
-rw-r--r--   1 root     root          317 2026-05-29 21:11 catalogo_soft.29.log
-rw-r--r--   1 root     root          317 2026-05-30 21:14 catalogo_soft.30.log
-rw-r--r--   1 root     root          317 2026-05-31 21:09 catalogo_soft.31.log
-rw-r--r--   1 root     root          720 2026-06-03 08:00 CPU_sspdeapllx0041.txt
drwx------   2 jboss7   jboss7       4096 2026-01-19 10:54 dinamo-native-libs1035632506526647377
drwx------   2 jboss7   jboss7       4096 2025-07-10 16:41 dinamo-native-libs1375465258769176231
drwx------   2 jboss7   jboss7       4096 2026-01-22 17:37 dinamo-native-libs1602746560848263255
drwx------   2 jboss7   jboss7       4096 2026-01-23 15:03 dinamo-native-libs2329686464481008534
drwx------   2 jboss7   jboss7       4096 2026-02-02 11:13 dinamo-native-libs302777597217500436
drwx------   2 jboss7   jboss7       4096 2026-01-23 15:14 dinamo-native-libs3090842213661574145
drwx------   2 jboss7   jboss7       4096 2026-01-15 09:47 dinamo-native-libs3338425059625395923
drwx------   2 jboss7   jboss7       4096 2025-10-20 13:55 dinamo-native-libs4575579904964202277
drwx------   2 jboss7   jboss7       4096 2025-10-20 12:00 dinamo-native-libs5288751454852351547
drwx------   2 jboss7   jboss7       4096 2026-02-02 16:48 dinamo-native-libs5745411460995833850
drwx------   2 jboss7   jboss7       4096 2026-01-19 17:41 dinamo-native-libs6617892710443662983
drwx------   2 jboss7   jboss7       4096 2026-01-20 17:02 dinamo-native-libs7108858595249181066
drwx------   2 jboss7   jboss7       4096 2026-02-02 17:28 dinamo-native-libs7864039079331022085
drwx------   2 jboss7   jboss7       4096 2025-10-20 12:56 dinamo-native-libs8305357545515767078
drwx------   2 jboss7   jboss7       4096 2026-02-02 14:40 dinamo-native-libs8359239111406583726
drwx------   2 jboss7   jboss7       4096 2026-01-20 12:02 dinamo-native-libs8846048092290690249
drwx------   2 jboss7   jboss7       4096 2026-02-02 17:09 dinamo-native-libs96637418319017379
drwx------   2 jboss7   jboss7       4096 2026-01-19 17:06 dinamo-native-libs973044612124804842
-rw-r--r--   1 jboss7   jboss7       1066 2026-05-27 11:18 fix_hostxml.py
drwxr-xr-x   2 jboss7   jboss7       4096 2026-06-03 16:08 hsperfdata_jboss7
drwxr-xr-x   2 logstash logstash     4096 2026-01-15 09:44 hsperfdata_logstash
drwxr-xr-x   2 p585600       927     4096 2026-06-03 10:32 hsperfdata_p585600
drwxr-xr-x   2 p725476  supso        4096 2026-03-29 10:29 hsperfdata_p725476
drw-r-----   2 root     root         4096 2026-05-27 12:07 hsperfdata_root
drwxr-xr-x   2 sirot    sirot        4096 2026-01-15 09:44 hsperfdata_sirot
drwxr-xr-x   2 spqpcpb  spqpcpb      4096 2026-05-05 00:38 hsperfdata_spqpcpb
drwxrwxrwt   2 root     root         4096 2026-01-15 09:44 .ICE-unix
drwxrwxrwx   2 spqpcpb  spqpcpb      4096 2025-01-02 19:59 inventario
drwxrwxr-x.  3 jboss7   jboss7       4096 2022-12-21 20:51 jboss7
drwxr-xr-x.  2 root     root         4096 2023-04-26 13:30 jetty-docbase.12875659147853773692.0
drwxr-xr-x   2 root     root         4096 2026-04-27 10:57 jetty-docbase.2263739751541941873.0
drwxr-xr-x   2 root     root         4096 2026-04-27 10:58 jetty-docbase.3150860910409227338.0
drwxr-xr-x   2 root     root         4096 2026-01-15 09:44 jetty-docbase.6198944480237086511.0
drwxr-xr-x.  2 root     root         4096 2023-08-16 22:35 jetty-docbase.7141480758471929943.0
drwxr-xr-x.  2 root     root         4096 2023-08-23 16:59 jetty-docbase.9721455044275442693.0
-rw-------   1 jboss7   jboss7      26632 2026-05-29 17:58 +~JF2456858017337415123.tmp
-rw-------   1 jboss7   jboss7      26816 2026-05-29 17:58 +~JF2668743831774158845.tmp
-rw-------   1 jboss7   jboss7       5908 2026-05-29 17:58 +~JF3716334128412194133.tmp
-rw-------   1 jboss7   jboss7      26816 2026-05-29 17:58 +~JF446693191908439450.tmp
-rw-------   1 jboss7   jboss7       5908 2026-05-29 17:58 +~JF4751006006452611840.tmp
-rw-------   1 jboss7   jboss7      26632 2026-05-29 17:58 +~JF8288633146889014259.tmp
-rw-r--r--   1 jboss7   jboss7     144346 2026-05-28 08:00 jna2684812278592627055.tmp
-rw-r--r--   1 jboss7   jboss7     144346 2026-05-28 08:00 jna6719890091497078033.tmp
-rw-rw-r--   1 spnowp17 spnowp17        0 2026-06-03 11:02 kuku
drwxr-xr-x   2 f940606  desenv       4096 2026-05-27 14:26 PLD
drwxrwxr-x   2 jboss7   jboss7       4096 2026-04-09 09:16 poifiles
-rw-r--r--   1 root     root          736 2026-06-03 08:00 RAM_sspdeapllx0041.txt
-rw-r--r--   1 root     root          137 2026-06-03 08:00 sspdeapllx0041_NFS_MONTADO.txt
-rw-r--r--   1 root     root          205 2026-06-03 08:00 sspdeapllx0041.txt
drwxr-xr-x   2 root     root         4096 2026-01-15 09:48 vmware-config-22930.0
drwxr-xr-x   2 root     root         4096 2024-04-30 03:40 vmware-config-8790.0
drwxr-xr-x   2 root     root         4096 2026-01-15 09:48 vmware-file-mod-13632.0
drwxr-xr-x   2 root     root         4096 2024-04-30 03:40 vmware-file-mod-26722.0
drwx------.  2 root     root         4096 2026-01-15 09:49 vmware-root
drwx------   2 root     root         4096 2024-04-30 03:41 vmware-root_23136-3092348093
drwx------   2 root     root         4096 2024-04-30 03:41 vmware-root_25300-3099622850
drwx------   2 root     root         4096 2026-01-15 09:46 vmware-root_2551-2092249645
drwx------   2 root     root         4096 2026-01-15 09:49 vmware-root_2669-3980361968
drwx------   2 root     root         4096 2026-01-15 09:49 vmware-root_4348-994816373
[p585600@sspdeapllx0041 tmp]$
