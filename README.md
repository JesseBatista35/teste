
[root@caddeapllx2560 opt]# su - ctmagelx -c "touch /sigdb/sigdb/TRANSMITE/teste_permissao" 2>&1
The Java path defined in the AG_JAVA_HOME [/opt/ctmage/bmcjava/bmcjava-V2] does not exist.
You must reset it to enable Control-M to run.
touch: não foi possível tocar '/sigdb/sigdb/TRANSMITE/teste_permissao': Permissão negada
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]# chown ctmagelx:controlm /sigdb/sigdb/TRANSMITE
[root@caddeapllx2560 opt]# chmod 775 /sigdb/sigdb/TRANSMITE
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]# su - ctmagelx -c "touch /sigdb/sigdb/TRANSMITE/teste_permissao && echo OK && rm /sigdb/sigdb/TRANSMITE/teste_permissao"
The Java path defined in the AG_JAVA_HOME [/opt/ctmage/bmcjava/bmcjava-V2] does not exist.
You must reset it to enable Control-M to run.
OK
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]# ls -la /sigdb/sigdb.zip
-rwxr-xr-x 1 root root 1163641 jun 10 13:50 /sigdb/sigdb.zip
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]# find / -xdev -newer /sigdb/sigdb.zip -iname "*.log" 2>/dev/null | grep -i deploy
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]# stat /sigdb/sigdb.zip
    Arquivo: /sigdb/sigdb.zip
    Tamanho: 1163641    Blocos: 2280       bloco de E/S: 4096   arquivo comum
Dispositivo: fd00h/64768d       Inode: 18709314    Links: 1
     Acesso: (0755/-rwxr-xr-x)  Uid: (    0/    root)   Gid: (    0/    root)
     Acesso: 2026-08-20 14:29:14.391191998 -0300
Modificação: 2026-06-10 13:50:36.179841833 -0300
  Alteração: 2026-06-10 13:50:37.249827529 -0300
    Criação: 2026-06-10 13:50:36.172841927 -0300
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
