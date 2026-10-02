
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ namei -l /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks
f: /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks
dr-xr-xr-x root     root     /
drwxr-xr-x root     root     opt
drwxr-xr-x root     root     batch
drwxr-xr-x root     root     securefiles
-rw------- ctmagelx controlm caixa-truststore-acteste-nprd.jks
-sh-4.2$ id f517263
uid=10517263(f517263) gid=20000000(usucef) grupos=20000000(usucef),20001097(desenv),20001048(desbr),20001048(desbr),20001097(desenv)
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo -u f517263 head -c1 /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks >/dev/null && echo "LEITURA OK" || echo "SEM PERMISSAO"
[sudo] senha para p585600:
Sinto muito, usuário p585600 não tem permissão para executar "/usr/bin/head -c1 /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks" como f517263 em caddeapllx1567.
SEM PERMISSAO
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ stat /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks
  File: “/opt/batch/securefiles/caixa-truststore-acteste-nprd.jks”
  Size: 39055           Blocks: 80         IO Block: 4096   arquivo comum
Device: fd00h/64768d    Inode: 877348      Links: 1
Access: (0600/-rw-------)  Uid: (20003596/ctmagelx)   Gid: (30000018/controlm)
Context: system_u:object_r:usr_t:s0
Access: 2026-09-30 15:07:19.834202306 -0300
Modify: 2026-07-24 15:45:05.866541096 -0300
Change: 2026-07-24 15:45:06.283536131 -0300
 Birth: -
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -lt /producao/rotina/RSADB001/ | head
total 0
drwxr-xr-x. 2 ctmagelx controlm  36 Set 22 09:41 cfg
drwxr-xr-x. 2 ctmagelx controlm 272 Set  8 15:52 shell
drwxr-xr-x. 2 ctmagelx controlm  25 Out 30  2025 rst
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -l "Truststore SSO sem permissão" /producao/rotina/RSADB001/**/*.log 2>/dev/null
-sh-4.2$
-sh-4.2$
-sh-4.2$
