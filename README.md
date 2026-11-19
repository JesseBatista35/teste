
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]#
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
