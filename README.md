
    └──────────────────────────────────────────────────────────────────────┘

Last login: Thu Nov 19 10:51:23 2026 from 10.111.12.78
[p585600@cadsvitrlx100 ~]$ scp p585600@<IP_DO_0039>:/tmp/libSenhasSIIBC.so .
-bash: IP_DO_0039: No such file or directory
[p585600@cadsvitrlx100 ~]$ scp p585600@10.116.88.96:/tmp/libSenhasSIIBC.so .
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
p585600@10.116.88.96's password:
libSenhasSIIBC.so                                                                                                                                                    100%   19KB  11.9MB/s   00:00
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$ scp libSenhasSIIBC.so p585600@10.116.202.45:/tmp/
p585600@10.116.202.45's password:
Couldn't open local file "libSenhasSIIBC.so" for reading: Operation not permitted
failed to upload file libSenhasSIIBC.so to /tmp/libSenhasSIIBC.so
[p585600@cadsvitrlx100 ~]$ scp libSenhasSIIBC.so p585600@10.116.202.45:/tmp/
p585600@10.116.202.45's password:
Couldn't open local file "libSenhasSIIBC.so" for reading: Operation not permitted
failed to upload file libSenhasSIIBC.so to /tmp/libSenhasSIIBC.so
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$







[root@sspdeapllx0039 p585600]# cd /prod/load/ran/tpc/lib
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]# ls -la libSenhasSIIBC*
-rwxr-xr-x 1 root suporte 19315 2016-06-07 19:48 libSenhasSIIBC_Linux64.so
lrwxrwxrwx 1 root root       25 2016-06-07 20:24 libSenhasSIIBC.so -> libSenhasSIIBC_Linux64.so
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]# file libSenhasSIIBC.so libSenhasSIIBC_Linux64.so
libSenhasSIIBC.so:         symbolic link to `libSenhasSIIBC_Linux64.so'
libSenhasSIIBC_Linux64.so: ELF 64-bit LSB shared object, x86-64, version 1 (SYSV), dynamically linked, not stripped
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]# ldd libSenhasSIIBC_Linux64.so
        linux-vdso.so.1 =>  (0x00007ffc7573b000)
        libc.so.6 => /lib64/libc.so.6 (0x00007f45edff7000)
        /lib64/ld-linux-x86-64.so.2 (0x000055c195e52000)
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]# ldd libSenhasSIIBC.so
        linux-vdso.so.1 =>  (0x00007ffc59be7000)
        libc.so.6 => /lib64/libc.so.6 (0x00007fbf97dad000)
        /lib64/ld-linux-x86-64.so.2 (0x000055e7a97d4000)
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]# md5sum libSenhasSIIBC*
9f4b9758ac4f4c75cd9e7cf6826eed38  libSenhasSIIBC_Linux64.so
9f4b9758ac4f4c75cd9e7cf6826eed38  libSenhasSIIBC.so
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]# cp /prod/load/ran/tpc/lib/libSenhasSIIBC_Linux64.so /tmp/libSenhasSIIBC.so
[root@sspdeapllx0039 lib]# chmod 644 /tmp/libSenhasSIIBC.so
[root@sspdeapllx0039 lib]# hostname -i
10.116.88.96
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]#
[root@sspdeapllx0039 lib]#
