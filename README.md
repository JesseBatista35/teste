h-5.1$ mount | grep -i nfs
sh: mount: command not found
sh-5.1$ ls -la /sihdg_tqs /sihdg_tqs/Arquivos_SINAF 2>&1 | head
/sihdg_tqs:
total 8
drwxrwxrwx. 3 1000001 1000000 4096 Sep 10  2024 .
dr-xr-xr-x. 1 root    root      93 Oct  1 15:29 ..
drwxrwxrwx. 2 jboss        99 4096 Apr  9 18:38 Arquivos_SINAF

/sihdg_tqs/Arquivos_SINAF:
total 40
drwxrwxrwx. 2 jboss        99 4096 Apr  9 18:38 .
drwxrwxrwx. 3 1000001 1000000 4096 Sep 10  2024 ..
sh-5.1$
sh-5.1$
sh-5.1$
sh-5.1$ touch /sihdg_tqs/.teste_escrita && echo ESCRITA_OK && rm -f /sihdg_tqs/.teste_escrita
ESCRITA_OK
sh-5.1$
sh-5.1$
sh-5.1$
sh-5.1$ getent hosts CBRDEDADNT002.extra.caixa.gov.br
10.116.93.230   CBRDEDADNT002.extra.caixa.gov.br
sh-5.1$
sh-5.1$
sh-5.1$ timeout 5 bash -c '</dev/tcp/10.116.29.201/31153' && echo PORTA_OK_IP || echo FALHOU_IP
FALHOU_IP
sh-5.1$
