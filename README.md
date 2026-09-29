
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# ls -la /SIGOT/.teste_wo
-rw-r--r-- 1 root nobody 0 Set 29 16:01 /SIGOT/.teste_wo
[root@cbrdeapllx010 p585600]# \rm -f /SIGOT/.teste_wo
[root@cbrdeapllx010 p585600]# su - jboss   -s /bin/bash -c 'touch /SIGOT/.teste_jboss   && rm -f /SIGOT/.teste_jboss   && echo app_ok'
app_ok
[root@cbrdeapllx010 p585600]# su - f599802 -s /bin/bash -c 'touch /SIGOT/.teste_f599802 && rm -f /SIGOT/.teste_f599802 && echo app_ok'
app_ok
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# ls -ln /SIGOT | head
total 228
drwxrwxrwx  4 10139546 20000949  281 Ago 26 14:08 ARQUIVOSCOPIARODRIGO
drwxrwxrwx  4       99       99   44 Mar  3  2022 arquivo_sifin
drwxrwxrwx  2       99       99    0 Ago 15  2023 BACTH
drwxrwxrwx  2       99       99   46 Set 29  2025 DESP.FTP.GOT.MZ.BBM2.WO930661
drwxrwxrwx  3       99       99  158 Ago 10 14:56 ENV_ALIQUOTAS_ALT
drwxrwxrwx  5       99       99   61 Nov 21  2023 guia_autenticada
drwxrwxrwx 84       99       99 1769 Set 10 15:49 guia_recolhimento
drwxrwxrwx  2 10139546 20000949  179 Ago 27 08:32 log
drwxrwxrwx  2       99       99    0 Jul  1 15:30 mapeamento
[root@cbrdeapllx010 p585600]# id jboss; id f599802
uid=30000115(jboss) gid=30000115(jboss) grupos=30000115(jboss)
uid=10599802(f599802) gid=20000000(usucef) grupos=20001097(desenv),20001097(desenv),20000000(usucef)
[root@cbrdeapllx010 p585600]# nfs4_getfacl /SIGOT 2>/dev/null || echo "nfs4-acl-tools não instalado"
nfs4-acl-tools não instalado
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
